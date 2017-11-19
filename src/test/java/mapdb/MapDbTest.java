//package mapdb;
//
///**
// * Created by phanindra on 18/10/17.
// */
//public class MapDbTest {
//
//    @Tes
//    public void saveEventsToDB(Event event) {
//        DB eventsDB = DBMaker.newFileDB(new File("eventsDB")).closeOnJvmShutdown().make();
//        Map<Integer, Event> map = eventsDB.getTreeMap("Events");
//        map.clear();
//        Set<Integer> keys = map.keySet();
//        int id=0;
//        for(int key : keys) {
//            id++;
//        }
//        map.put(id+1, event);
//
//        eventsDB.commit();
//        eventsDB.close();
//    }
//}
