public class Address {
    private String streetname;
    private String doorno;
    private String postalcode;

    public Address(String streetname, String doorno, String postalcode){
        this.streetname=streetname;
        this.doorno=doorno;
        this.postalcode=postalcode;
    }


    public String getStreetname (){
      return streetname;
    }
    public String getDoorno (){
        return doorno;
    }
    public String getPostalcode (){
        return postalcode;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public void setDoorno(String doorno) {
        this.doorno = doorno;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
}
