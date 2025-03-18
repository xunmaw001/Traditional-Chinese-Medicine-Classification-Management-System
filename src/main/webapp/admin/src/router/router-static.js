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
    import yichangbaogaodan from '@/views/modules/yichangbaogaodan/list'
    import yuangong from '@/views/modules/yuangong/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import cangkujiancha from '@/views/modules/cangkujiancha/list'
    import caigou from '@/views/modules/caigou/list'
    import yaocaixinxi from '@/views/modules/yaocaixinxi/list'
    import ruku from '@/views/modules/ruku/list'
    import baosun from '@/views/modules/baosun/list'
    import yaocaizhonglei from '@/views/modules/yaocaizhonglei/list'
    import config from '@/views/modules/config/list'
    import chuku from '@/views/modules/chuku/list'


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
	path: '/yichangbaogaodan',
        name: '异常报告单',
        component: yichangbaogaodan
      }
          ,{
	path: '/yuangong',
        name: '员工',
        component: yuangong
      }
          ,{
	path: '/gongyingshang',
        name: '供应商',
        component: gongyingshang
      }
          ,{
	path: '/cangkujiancha',
        name: '仓库检查',
        component: cangkujiancha
      }
          ,{
	path: '/caigou',
        name: '采购',
        component: caigou
      }
          ,{
	path: '/yaocaixinxi',
        name: '药材信息',
        component: yaocaixinxi
      }
          ,{
	path: '/ruku',
        name: '入库',
        component: ruku
      }
          ,{
	path: '/baosun',
        name: '报损',
        component: baosun
      }
          ,{
	path: '/yaocaizhonglei',
        name: '药材种类',
        component: yaocaizhonglei
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/chuku',
        name: '出库',
        component: chuku
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
