package manage;
import java.util.Date;

public class client {
        protected int maxKH;
        protected   String name;
        protected Date date;
        protected Double KW;
        protected Double total;

        public client(){

        }
        public client(int maxKH,String name,Date date,Double KW,Double total){
            this.maxKH =maxKH;
            this.name = name;
            this.date = date;
            this.KW = KW;
            this.total = total;
        }

        public int getMaxKH() {
            return maxKH;
        }

        public void setMaxKH(int maxKH) {
            this.maxKH = maxKH;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Double getKW() {
            return KW;
        }

        public void setKW(Double KW) {
            this.KW = KW;
        }

        public Double getTotal() {
            return total;
        }

        public void setTotal(Double total) {
            this.total = total;
        }

    }
