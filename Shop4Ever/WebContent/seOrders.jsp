<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@ taglib prefix="s" uri="/struts-tags" %>
    
    <!doctype html>
<!--[if lt IE 7]><html lang="en" class="no-js ie6"><![endif]-->
<!--[if IE 7]><html lang="en" class="no-js ie7"><![endif]-->
<!--[if IE 8]><html lang="en" class="no-js ie8"><![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8">
    <title>Shop4Ever</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="shortcut icon" href="favicon.png">

    <link rel="stylesheet" href="css/bootstrap.css">
    
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/slick.css">
    <link rel="stylesheet" href="js/rs-plugin/css/settings.css">

    <link rel="stylesheet" href="css/freeze.css">


    <script type="text/javascript" src="js/modernizr.custom.32033.js"></script>

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head>

<body>


   
    <header>
        
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                      
                        <a class="navbar-brand" href="index.jsp">
                            <img src="img/freeze/imgge4.png" alt="" class="logo">
                        </a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                        <ul class="nav navbar-nav navbar-right">
                         
                          
                            <li><a class="getApp" href="#login">Logout</a>
                            <li><a class="getApp" href="#login">Back</a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
                <!-- /.container-->
        </nav>
    </header>
 


    <div class="wrapper">

        

        <section id="login" class="doublediagonal">
            <div class="container">
                <div class="section-heading scrollpoint sp-effect3">
                <br>
                <br>
                <br>
                <br><br>
                <br>
                <br><br>
                
                    <h2><strong> Assigned Orders</strong></h2>
                    <div class="divider"></div>
                    </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                              
                  
        <s:form  action="selectcity">        
<table class="table">

   <thead align="center">
      <tr>
         
				<th>order Id</th>
				<th>product details</th>
				<th>billing address</th>
				<th>delivery address</th>
				<th>amount to pay</th>
				<th>discount details</th>
				<th>tax</th>
				<th>final amount to pay</th>
				<th>orderStatus</th>
				<th>city</th>
      </tr>
   </thead>
   <s:iterator value="orderlist">
   <tbody>
      <tr class="success">
         

<td><s:property value="orderId"/></td>



					<td><s:property value="productDetails" /></td>



					<td><s:property value="billingAddress" /></td>


					<td><s:property value="deliveryAddress" /></td>


					<td><s:property value="mrpAmount" /></td>
					
					<td><s:property value="discountAmount" /></td>
					
					<td><s:property value="tax" /></td>
					<td><s:property value="finalAmount" /></td>
					<td><s:property value="orderStatus" /></td>
					<td><s:property value="deliveryAddressCity" /></td>
      </tr>
        </s:iterator>
      
   </tbody>
   </table>
   
   
  
       <div class="wrapper">

        

        <section id="login" class="doublediagonal">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="row">
                            <div class="col-md-8 col-sm-8 scrollpoint sp-effect1">
                               
                  
                

         <div class="form-group"> Select Id:<s:select list="orderlist" name="orderIdSelected" listKey="orderId" 
		listValue="orderId" headerKey = "Select" headerValue = "Select Id" scope="session" cssClass="form-control2"></s:select>
		
		
		City <s:select list="{'CHENNAI','MUMBAI','KOLKATA','DELHI'}" name="city" 
		 headerKey ="select city" headerValue ="select city" scope="session" cssClass="form-control2"></s:select>



   </div>
   
    </div>
  
                    </div>
                </div>
                 
            </div>
              <button type="submit" class="btn btn-primary btn-lg">Submit</button>
        </section>


    </div>

		 
	</s:form>
   
   </div>
   
    </div>
                    </div>
                </div>
            </div>
        </section>

        <footer>
            <div class="container">
                <a href="#" class="scrollpoint sp-effect3">
                    <!-- <img src="img/freeze/logo.png" alt="" class="logo"> -->
                    <img src="img/freeze/Untitled-2.png" alt="" class="logo1">
                </a>
                <div class="social">
                    <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-twitter fa-lg"></i></a>
                    <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-google-plus fa-lg"></i></a>
                    <a href="#" class="scrollpoint sp-effect3"><i class="fa fa-facebook fa-lg"></i></a>
                </div>
                <div class="rights">
                    <p>Copyright &copy; 2014</p>
                    <p>Template by P2E</p>
                </div>
            </div>
        </footer>

    </div>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/slick.min.js"></script>
    <script src="js/placeholdem.min.js"></script>
    <script src="js/rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
    <script src="js/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/scripts.js"></script>

    <script>
        $(document).ready(function() {
            appMaster.preLoader();
        });
    </script>

</body>

</html>
   


