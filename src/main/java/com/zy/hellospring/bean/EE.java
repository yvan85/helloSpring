package com.zy.hellospring.bean;

public class EE {
    /**
     * unitId : 200093809
     * productId : 10203119
     * addPeopleUnitId : 200095825
     * addPeopleProductId : 10205002
     * cleanUnitId : 200095821
     * cleanProductId : 10204998
     * ALLUnitId : 200095823
     * ALLProductId : 10205000
     * hotelId : 1153393
     * landlordTel : 15811021276
     * userId : 7464787
     * userTel : 15811023453
     * apikey : 367d1b7a-1b26-428d-ab75-e462e03b3be5
     * houseimport : {"comment":"静态信息接入需要的数据","partner_hotel_id":"mock_Hotel_mengyang_1106_01","hotelId":1153375,"partner_unit_id":"mengyang_1106_10_am_mock","unitId":200093789,"partner_product_id":"1","productId":10203095}
     */

    private int unitId;
    private int productId;
    private int addPeopleUnitId;
    private int addPeopleProductId;
    private int cleanUnitId;
    private int cleanProductId;
    private int ALLUnitId;
    private int ALLProductId;
    private int hotelId;
    private String landlordTel;
    private int userId;
    private long userTel;
    private String apikey;
    private HouseimportBean houseimport;

    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAddPeopleUnitId() {
        return addPeopleUnitId;
    }

    public void setAddPeopleUnitId(int addPeopleUnitId) {
        this.addPeopleUnitId = addPeopleUnitId;
    }

    public int getAddPeopleProductId() {
        return addPeopleProductId;
    }

    public void setAddPeopleProductId(int addPeopleProductId) {
        this.addPeopleProductId = addPeopleProductId;
    }

    public int getCleanUnitId() {
        return cleanUnitId;
    }

    public void setCleanUnitId(int cleanUnitId) {
        this.cleanUnitId = cleanUnitId;
    }

    public int getCleanProductId() {
        return cleanProductId;
    }

    public void setCleanProductId(int cleanProductId) {
        this.cleanProductId = cleanProductId;
    }

    public int getALLUnitId() {
        return ALLUnitId;
    }

    public void setALLUnitId(int ALLUnitId) {
        this.ALLUnitId = ALLUnitId;
    }

    public int getALLProductId() {
        return ALLProductId;
    }

    public void setALLProductId(int ALLProductId) {
        this.ALLProductId = ALLProductId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getLandlordTel() {
        return landlordTel;
    }

    public void setLandlordTel(String landlordTel) {
        this.landlordTel = landlordTel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getUserTel() {
        return userTel;
    }

    public void setUserTel(long userTel) {
        this.userTel = userTel;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public HouseimportBean getHouseimport() {
        return houseimport;
    }

    public void setHouseimport(HouseimportBean houseimport) {
        this.houseimport = houseimport;
    }

    public static class HouseimportBean {
        /**
         * comment : 静态信息接入需要的数据
         * partner_hotel_id : mock_Hotel_mengyang_1106_01
         * hotelId : 1153375
         * partner_unit_id : mengyang_1106_10_am_mock
         * unitId : 200093789
         * partner_product_id : 1
         * productId : 10203095
         */

        private String comment;
        private String partner_hotel_id;
        private int hotelId;
        private String partner_unit_id;
        private int unitId;
        private String partner_product_id;
        private int productId;

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getPartner_hotel_id() {
            return partner_hotel_id;
        }

        public void setPartner_hotel_id(String partner_hotel_id) {
            this.partner_hotel_id = partner_hotel_id;
        }

        public int getHotelId() {
            return hotelId;
        }

        public void setHotelId(int hotelId) {
            this.hotelId = hotelId;
        }

        public String getPartner_unit_id() {
            return partner_unit_id;
        }

        public void setPartner_unit_id(String partner_unit_id) {
            this.partner_unit_id = partner_unit_id;
        }

        public int getUnitId() {
            return unitId;
        }

        public void setUnitId(int unitId) {
            this.unitId = unitId;
        }

        public String getPartner_product_id() {
            return partner_product_id;
        }

        public void setPartner_product_id(String partner_product_id) {
            this.partner_product_id = partner_product_id;
        }

        public int getProductId() {
            return productId;
        }

        public void setProductId(int productId) {
            this.productId = productId;
        }
    }
}
