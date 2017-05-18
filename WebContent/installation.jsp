<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.ArrayList, com.develop_minura.model.Utilizador" %>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8" />
        <title>Minura Enterprise - Installation</title>
        <meta name="keywords" content="HTML5,CSS3,Minura Enterprise,J2EE,Minura" />
        <meta name="description" content="Minura Enterprise J2EE" />
        <meta name="Author" content="Minura Enterprise [www.psd2allconversion.com]" />

        <!-- mobile settings -->
        <meta name="viewport" content="width=device-width, maximum-scale=1, initial-scale=1, user-scalable=0" />
        <!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->

        <!-- WEB FONTS : use %7C instead of | (pipe) -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400%7CRaleway:300,400,500,600,700%7CLato:300,400,400italic,600,700" rel="stylesheet" type="text/css" />

        <!-- CORE CSS -->
        <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/metis-menu/metisMenu.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/simple-line-icons-master/css/simple-line-icons.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/animate/animate.css" rel="stylesheet" type="text/css" />
        <link href="assets/plugins/c3/c3.min.css" rel="stylesheet">
        <link href="assets/plugins/widget/widget.css" rel="stylesheet">
        <link href="assets/plugins/calendar/fullcalendar.min.css" rel="stylesheet">
        <link href="assets/plugins/ui/jquery-ui.css" rel="stylesheet">
                 <!-- Bootstrap Material Design -->
  <link href="assets/plugins/material-design/css/bootstrap-material-design.css" rel="stylesheet">
  <link href="assets/plugins/material-design/css/ripples.min.css" rel="stylesheet">
        <!-- THEME CSS -->
        <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/theme/dark.css" rel="stylesheet" type="text/css" />

        <!-- PAGE LEVEL SCRIPTS -->

    </head>
    
    <body class="fixed-top">

        <!-- wrapper -->
        <div id="wrapper">
            <!-- BEGIN HEADER -->
            <div class="page-header navbar navbar-fixed-top">
                <!-- BEGIN HEADER INNER -->
                <div class="page-header-inner ">
                    <!-- BEGIN LOGO -->
                    <div class="page-logo">
                        <a href="index.jsp">
                            <img src="assets/images/logo.png" alt="absolute admin" class="img-responsive logo-default"/>
                        </a>

                    </div><div class="menu-toggler sidebar-toggler">
                        <a href="javascript:;" class="navbar-minimalize minimalize-styl-2  pull-left "><i class="fa fa-bars"></i></a>
                    </div>

                    <div class="search-bar">
                        <form class="sidebar-search  " action="#" method="POST">

                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Procurar...">

                            </div>
                        </form>
                    </div>
                    <!-- END LOGO -->

                    <!-- BEGIN TOP NAVIGATION MENU -->
                    <div class="top-menu">
                        <ul class="nav navbar-nav pull-right">
                            <!-- BEGIN USER LOGIN DROPDOWN -->
                            <li class="dropdown dropdown-user">
                                <a href="javascript:;" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true" aria-expanded="false">
                                    <img alt="" class="img-circle" src="assets/images/avtar-1.jpg">

                                </a>
                                <ul class="dropdown-menu dropdown-menu-default">
                                    <li>
                                        <a href="#">
                                            <i class="icon-user"></i> Perfil </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-calendar"></i> Reservas </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-envelope-open"></i> Mensagens
                                            <span class="badge badge-danger"> 0 </span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="app_todo.html">
                                            <i class="icon-rocket"></i> Minhas Tarefas
                                            <span class="badge badge-success"> 0 </span>
                                        </a>
                                    </li>
                                    <li class="divider"> </li>
                                    <li>
                                        <a href="#">
                                            <i class="icon-lock"></i> Bloqueio de conta</a>
                                    </li>
                                    <li>
                                        <a href="page_user_login_1.html">
                                            <i class="icon-key"></i> Terminar Sessão</a>
                                    </li>
                                </ul>
                            </li>
                            <!-- END USER LOGIN DROPDOWN -->
                            <!-- BEGIN QUICK SIDEBAR TOGGLER -->
                            <!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
                            <li class="dropdown dropdown-quick-sidebar-toggler">
                                <a href="#" class="dropdown-toggle">
                                    <i class="icon-logout"></i>
                                </a>
                            </li>
                            <!-- END QUICK SIDEBAR TOGGLER -->
                        </ul>
                    </div>
                    <!-- END TOP NAVIGATION MENU -->
                </div>
                <!-- END HEADER INNER -->
            </div>
            <!-- END HEADER -->
            <!-- BEGIN HEADER & CONTENT DIVIDER -->
            <div class="clearfix"> </div>
            <!-- END HEADER & CONTENT DIVIDER -->

            <!-- BEGIN CONTAINER -->
            <div class="page-container">

                <aside class="sidebar">
                    <nav class="sidebar-nav">
                        <ul class="metismenu" id="menu">
                            <li class="active">
                                <a href="index.jsp"><i class="icon-grid"></i> <span class="nav-label">Dashboard</span></a>
                            </li>
                            <li class="nav-heading"><span>Administração</span></li>
                            <li>
                                <a href="#"><i class="fa fa-users"></i> <span class="nav-label">Utilizadores</span><span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level collapse">                               
                                    <li><a href="#"><i class="fa fa-search"></i> <span class="nav-label">Pesquisar</span></a></li>
                                    <li><a href="#"><i class="fa fa-list-ol"></i> <span class="nav-label">Listar</span></a></li>
                                    <li><a href="#"><i class="fa fa-user-plus"></i> <span clasS="nav-label">Adicionar</span></a></li>
                                </ul>
                            </li>
                            
                            <li class="nav-heading"><span>Mais	</span></li>
                            <li>
                                <a href="#"><i class="fa fa-users"></i> <span class="nav-label"></span><span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level collapse">
                                    <li><a href="#"><i class="fa fa-user"></i> <span class="nav-label">Perfil</span></a></li>
                                    <li><a href="#"><i class="fa fa-cogs"></i> <span clasS="nav-label">Definições</span></a></li>
                                </ul>
                            </li>
                        </ul>
                        <!-- END SIDEBAR MENU -->
                        <!-- END SIDEBAR MENU -->
                    </nav>
                    <!-- END SIDEBAR -->
                </aside>

                <!-- BEGIN CONTENT BODY -->
                <div class="page-content-wrapper">
                    <div class="content-wrapper container">
                        <div class="row">
                            <div class="col-sm-12">
                                <div class="page-title">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <h4 class="pull-left">Dashboard</h4>

                                            <ol class="breadcrumb pull-right">
                                                <li><a href="index.jsp"><i class="fa fa-home"></i></a></li>
                                                <li>Dashboard</li>
                                            </ol>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div><!-- end .page title-->
                        
 						<div class="row">
                            <div class="col-md-6 col-lg-3">
                                <div class="panel panel-card recent-activites">
                                    <!-- Start .panel -->
                                    <div class="panel-heading">
                                        Viaturas
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-info btn-rounded btn-xs dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Opções <span class="caret"></span></button>
                                                <ul class="dropdown-menu panel-dropdown" role="menu">
                                                    <li><a href="#">Listar Viaturas</a></li>
                                                    <li><a href="#">Adicionar Viatura</a></li>
                                                    <li><a href="#">Pesquisar Viatura</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-body text-center">
                                        <i class="fa fa-car widget-icon"></i>  <h1 class="right panel-middle margin-b-0">0</h1>
                                    </div>
                                </div><!-- End .panel --> 



                            </div>
                            <div class="col-md-6 col-lg-3">
                                <div class="panel panel-card recent-activites">
                                    <!-- Start .panel -->
                                    <div class="panel-heading">
                                        Utilizadores
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-info btn-rounded btn-xs dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Opções <span class="caret"></span></button>
                                                <ul class="dropdown-menu panel-dropdown" role="menu">
                                                    <li><a href="#">Listar Utilizadores</a></li>
                                                    <li><a href="#">Adicionar Utilizador</a></li>
                                                    <li><a href="#">Pesquisar Utilizador</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-body text-center">
                                        <i class="icon-user widget-icon"></i>  <h1 class="right panel-middle margin-b-0">0</h1>
                                    </div>
                                </div><!-- End .panel --> 



                            </div>

                            <div class="col-md-6 col-lg-3">
                                <div class="panel panel-card recent-activites">
                                    <!-- Start .panel -->
                                    <div class="panel-heading">
                                        Total Vendas
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-info btn-rounded btn-xs dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Opções <span class="caret"></span></button>
                                                <ul class="dropdown-menu panel-dropdown" role="menu">
                                                    <li><a href="#">Listar Vendas</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="#">Pesquisar Venda</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-body text-center">
                                        <i class="fa fa-money widget-icon"></i>  <h1 class="right panel-middle margin-b-0">0</h1>
                                    </div>
                                </div><!-- End .panel --> 



                            </div>

                            <div class="col-md-6 col-lg-3">
                                <div class="panel panel-card recent-activites">
                                    <!-- Start .panel -->
                                    <div class="panel-heading">
                                        Melhor Vendedor
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-info btn-rounded btn-xs dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Opções <span class="caret"></span></button>
                                                <ul class="dropdown-menu panel-dropdown" role="menu">
                                                    <li><a href="#">Perfil</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-body text-center">
                                        <i class="icon-like widget-icon"></i>  <h1 class="right panel-middle margin-b-0">0</h1>
                                    </div>
                                </div><!-- End .panel --> 



                            </div>


                        </div>
                        
                        <div class="row">
                            <div class="col-md-12">
                                <div class="panel panel-card recent-activites">
                                    <!-- Start .panel -->
                                    <div class="panel-heading">
                                        Status das Vendas
                                        <div class="pull-right">
                                            <div class="btn-group">
                                                <button type="button" class="btn btn-info btn-rounded btn-xs dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Opções <span class="caret"></span></button>
                                                <ul class="dropdown-menu panel-dropdown" role="menu">
                                                    <li><a href="#">Gerir Vendas</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="#">Pesquisa Avançada</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="panel-body text-center">
                                        <div class="table-responsive table-commerce">
                                            <table id="basic-datatables" class="table table-striped table-hover">
                                                <thead>
                                                    <tr>
                                                        <th class="w80">
                                                            <strong>ID</strong>
                                                        </th>
                                                        <th class="text-center">
                                                            <strong>Data da Compra</strong>
                                                        </th>
                                                        <th class="text-center">
                                                            <strong>Nome do Cliente</strong>
                                                        </th>
                                                        <th class="text-center">
                                                            <strong>Valor €</strong>
                                                        </th>
                                                        <th class="text-center">
                                                            <strong>Quantidade</strong>
                                                        </th>
                                                        <th class="text-center">
                                                            <strong>Data para entrega</strong>
                                                        </th>
                                                        <th class="text-center">
                                                            <strong>STATUS</strong>
                                                        </th>

                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>0001</td>
                                                        <td>03/11/2015</td>
                                                        <td>Addison Nichols</td>
                                                        <td>$ 515.20</td>
                                                        <td>547</td>
                                                        <td>04/10/2015</td>
                                                        <td class="text-center">
                                                            <span class="label label-info">Standby</span>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <td>0002</td>
                                                        <td>05/11/2015</td>
                                                        <td>Albert Watkins</td>
                                                        <td>$ 22.30</td>
                                                        <td>122</td>
                                                        <td>06/10/2015</td>
                                                        <td class="text-center">
                                                            <span class="label label-success">Paid</span>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <td>00003</td>
                                                        <td>19/08/2015</td>
                                                        <td>Gilbert Edwards</td>
                                                        <td>$ 5115.12</td>
                                                        <td>51</td>
                                                        <td>-</td>
                                                        <td class="text-center">
                                                            <span class="label label-inverse">Canceled</span>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <td>00004</td>
                                                        <td>20/07/2015</td>
                                                        <td>Norman Hill</td>
                                                        <td>$ 5124.13</td>
                                                        <td>41</td>
                                                        <td>-</td>
                                                        <td class="text-center">
                                                            <span class="label label-purple">Shipped</span>
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <td>00005</td>
                                                        <td>24/08/2015</td>
                                                        <td>Ronnie Nelson</td>
                                                        <td>$ 78.8</td>
                                                        <td>154</td>
                                                        <td>-</td>
                                                        <td class="text-center">
                                                            <span class="label label-danger">Rejected</span>
                                                        </td>

                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div><!-- End .panel --> 


                            </div>
                        </div>

                    </div> 
                    <div class="clearfix"></div>
                    <div class="footer">
                        <div class="pull-right">
                            &copy; <strong>Minura <i>Enterprise</i></strong> 2017.
                        </div>
                    </div>
                </div>
                <!-- END CONTENT BODY -->
            </div>
            <!-- END CONTAINER -->
        </div>
        <!-- /wrapper -->


        <!-- SCROLL TO TOP -->
        <a href="#" id="toTop"></a>


        <!-- PRELOADER -->
        <div id="preloader">
            <div class="inner">
                <span class="loader"></span>
            </div>
        </div><!-- /PRELOADER -->


        <!-- JAVASCRIPT FILES -->

        <script type="text/javascript" src="assets/plugins/jquery/jquery.min.js"></script>
        <script type="text/javascript" src="assets/plugins/metis-menu/metisMenu.min.js"></script>
        <script type="text/javascript" src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="assets/plugins/slim-scroll/jquery.slimscroll.min.js"></script>
        <script src="assets/plugins/c3/d3.v3.min.js" charset="utf-8"></script>       
        <script src="assets/plugins/c3/c3.min.js"></script>
        <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <script src="assets/plugins/calendar/moment.min.js"></script>
        <script src="assets/plugins/calendar/fullcalendar.min.js"></script>
        <script src="assets/plugins/ui/jquery-ui.js"></script>
		<script src="assets/plugins/material-design/js/ripples.min.js"></script>
		<script src="assets/plugins/material-design/js/material.min.js"></script>

        <!-- PAGE LEVEL FILES -->
        <script src="assets/plugins/data-tables/jquery.dataTables.js"></script>
        <script src="assets/plugins/data-tables/dataTables.tableTools.js"></script>
        <script src="assets/plugins/data-tables/dataTables.bootstrap.js"></script>
        <script src="assets/plugins/data-tables/dataTables.responsive.js"></script>
        <script src="assets/plugins/data-tables/tables-data.js"></script>
        <!-- Custom FILES -->
        <script type="text/javascript" src="assets/js/custom.js"></script>

    </body>
</html>