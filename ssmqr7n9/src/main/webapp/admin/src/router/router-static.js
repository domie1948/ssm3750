import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yuangong from '@/views/modules/yuangong/list'
    import chexing from '@/views/modules/chexing/list'
    import qichechuzu from '@/views/modules/qichechuzu/list'
    import qichejiayou from '@/views/modules/qichejiayou/list'
    import yonghu from '@/views/modules/yonghu/list'
    import shigudengji from '@/views/modules/shigudengji/list'
    import qichexuzu from '@/views/modules/qichexuzu/list'
    import qicheweixiu from '@/views/modules/qicheweixiu/list'
    import zulinxinxi from '@/views/modules/zulinxinxi/list'
    import haichejiesuan from '@/views/modules/haichejiesuan/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '租赁资讯',
        component: news
      }
      ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
      ,{
	path: '/chexing',
        name: '车型',
        component: chexing
      }
      ,{
	path: '/qichechuzu',
        name: '汽车出租',
        component: qichechuzu
      }
      ,{
	path: '/qichejiayou',
        name: '汽车加油',
        component: qichejiayou
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/shigudengji',
        name: '事故登记',
        component: shigudengji
      }
      ,{
	path: '/qichexuzu',
        name: '汽车续租',
        component: qichexuzu
      }
      ,{
	path: '/qicheweixiu',
        name: '汽车维修',
        component: qicheweixiu
      }
      ,{
	path: '/zulinxinxi',
        name: '租赁信息',
        component: zulinxinxi
      }
      ,{
	path: '/haichejiesuan',
        name: '还车结算',
        component: haichejiesuan
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
