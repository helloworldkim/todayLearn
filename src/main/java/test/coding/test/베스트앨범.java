package test.coding.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {

    static class Album {
        //고유번호
        int id;
        //재생수
        int playCount;
        //장르
        String genre;
        int totalPlay;

        public Album(int id, int playCount, String genre) {
            this.id = id;
            this.playCount = playCount;
            this.genre = genre;
        }
        public Album(int totalPlay) {
            this.totalPlay = totalPlay;
        }

        @Override
        public String toString() {
            return "Album{" +
                    "id=" + id +
                    ", playCount=" + playCount +
                    ", genre='" + genre + '\'' +
                    ", totalPlay=" + totalPlay +
                    '}';
        }
    }
    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
//        String[] genres = {"classic", "classic", "classic", "pop"};
//        int[] plays = {500, 150, 800, 2500};
//        String[] genres = {"classic", "classic", "classic", "classic"};
//        int[] plays = {500, 400, 300, 200, 100};

        //사용하기 쉬운 형태로 데이터를 가공한다.
        Map<String, List<Album>> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (map.get(genres[i]) == null) {
                List<Album> list = new ArrayList<>();
                Album album = new Album(i, plays[i], genres[i]);
                //장르별 리스트 저장
                list.add(album);
                map.put(genres[i], list);
            } else {
                List<Album> list = map.get(genres[i]);
                Album album = new Album(i, plays[i], genres[i]);
                list.add(album);
            }
        }
        System.out.println("map = " + map);
        //리스트내 순서 정렬
        for (String key : map.keySet()) {
            List<Album> list = map.get(key);
            list.sort((o1, o2) -> {
                //1번조건 노레카운트가 높은순서, 노래카운트가 같다면 고유번호(id)가 낮은순서
                if (o1.playCount > o2.playCount) {
                    return -1;
                } else if (o1.playCount ==  o2.playCount) {
                    if (o1.id < o2.id) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            });
        }
        System.out.println("map = " + map);

        //장르별 총 갯수 획득
        Map<String, Album> playCountMap = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            int play = plays[i];
            String key = genres[i];
            int id = i;
            if (playCountMap.get(key) == null) {
                Album album = new Album(play);
                album.genre = key;
                playCountMap.put(key, album);
            } else {
                Album album = playCountMap.get(key);
                int totalPlay = album.totalPlay;
                album.totalPlay += play;
                playCountMap.put(key, album);
            }
        }
        System.out.println("playCountMap = " + playCountMap);

        List<Album> countList = new ArrayList<>();
        for (String key : playCountMap.keySet()) {
            Album album = playCountMap.get(key);
            countList.add(album);
        }
        countList.sort((o1, o2) -> {
            if (o1.totalPlay > o2.totalPlay) {
                return -1;
            } else {
                return 1;
            }
        });

        System.out.println("countList = " + countList);
        List<Integer> resultList = new ArrayList<>();
        for (Album album : countList) {
            List<Album> list = map.get(album.genre);
            if (list.size() < 2) {
                int id = list.get(0).id;
                resultList.add(id);
            } else {
                for (int i = 0; i < 2; i++) {
                    int id = list.get(i).id;
                    resultList.add(id);
                }
            }
        }

        int[] ints = resultList.stream().mapToInt(value -> value).toArray();
        System.out.println("ints = " + ints);
    }
}
