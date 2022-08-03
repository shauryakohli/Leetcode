class MyCalendar {
 TreeMap<Integer,Integer>calendar=null;
    public MyCalendar() {
        calendar= new TreeMap<>();
    }
  public boolean book(int start, int end) {
  if(calendar.floorEntry(start)!=null && start<calendar.floorEntry(start).getValue())
  {
      return false;
  }
if(calendar.ceilingEntry(start)!=null && end>calendar.ceilingEntry(start).getKey())
  {
      return false;
  }
 
  calendar.put(start,end);
     return true;
}
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */