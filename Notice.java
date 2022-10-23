package com.notice;



public class Notice {
    
     private int noticeid;
        private String title;
        private String des;
        private String phone;
        private String email
        private String date;
        
        
        public Notice(int noticeid, String title, String des,
                String phone,String email,String date) {
            this.noticeid = noticeid;
            this.title = title;
            this.des = des;
            this.phone = phone;
            this.email = email;
            this.date = date;
            
        }




        public int getNoticeid() {
            return noticeid;
        }
        public String getTitle() {
            return title;
        }
        public tring getDes() {
            return des;
        }
        public String getPhone() {
            return phone;
        }
        public String getEmail() {
            return email;
        }
        public String getDate() {
            return date;
        }
}
