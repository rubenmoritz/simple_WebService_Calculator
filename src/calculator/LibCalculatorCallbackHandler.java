
/**
 * LibCalculatorCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package calculator;

    /**
     *  LibCalculatorCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class LibCalculatorCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public LibCalculatorCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public LibCalculatorCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for som method
            * override this method for handling normal response from som operation
            */
           public void receiveResultsom(
                    calculator.LibCalculatorStub.SomResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from som operation
           */
            public void receiveErrorsom(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for quotient method
            * override this method for handling normal response from quotient operation
            */
           public void receiveResultquotient(
                    calculator.LibCalculatorStub.QuotientResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from quotient operation
           */
            public void receiveErrorquotient(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verschil method
            * override this method for handling normal response from verschil operation
            */
           public void receiveResultverschil(
                    calculator.LibCalculatorStub.VerschilResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verschil operation
           */
            public void receiveErrorverschil(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modulo method
            * override this method for handling normal response from modulo operation
            */
           public void receiveResultmodulo(
                    calculator.LibCalculatorStub.ModuloResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modulo operation
           */
            public void receiveErrormodulo(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for product method
            * override this method for handling normal response from product operation
            */
           public void receiveResultproduct(
                    calculator.LibCalculatorStub.ProductResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from product operation
           */
            public void receiveErrorproduct(java.lang.Exception e) {
            }
                


    }
    