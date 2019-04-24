// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

// Referenced classes of package o:
//			fd, ei, ez, ef

public class dz
{

	public dz()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static String a(Context context)
	{
		return fd.c(context, "vkeyid_settings", "dynamic_key");
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:ldc1            #22  <String "dynamic_key">
	//    3    5:invokestatic    #28  <Method String fd.c(Context, String, String)>
	//    4    8:areturn         
	}

	public static void a(Context context, String s)
	{
		d(context, "agent_switch", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "agent_switch">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	public static void a(Context context, String s, long l)
	{
		fd.d(context, "vkeyid_settings", (new StringBuilder("vkey_valid")).append(s).toString(), String.valueOf(l));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:new             #38  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:ldc1            #40  <String "vkey_valid">
	//    5    9:invokespecial   #43  <Method void StringBuilder(String)>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:invokevirtual   #51  <Method String StringBuilder.toString()>
	//    9   19:lload_2         
	//   10   20:invokestatic    #57  <Method String String.valueOf(long)>
	//   11   23:invokestatic    #60  <Method void fd.d(Context, String, String, String)>
	//   12   26:return          
	}

	public static String b()
	{
		return "com.tencent.mobileqqi,com.tencent.qqlive,com.nd.android.pandahome.hd,com.tongchenglove.main,com.gdhbgh.activity,com.dragon.android.pandaspace,com.handsgo.jiakao.android.kemu2,com.soufun.app,com.google.android.apps.maps,com.job.android,com.tencent.qqpim,com.baidu.homework,com.storm.smart,ly.pp.justpiano,com.android.mediacenter,com.android.cheyoohdrive,com.ymall.presentshop,com.eg.android.AlipayGphone,com.miguo.ui,com.pplive.androidphone,com.android.lexun,com.redirectin.rockplayer.android.unified,com.sz.order,cn.mucang.kaka.android,com.qijia.o2o,com.chinaideal.bkclient.tabmain,com.hiapk.marketpho,com.pingco.android.mix,com.leho.manicure,com.unique.app,com.tudou.android,com.beastudio.sflashlight,com.Astro.UI,com.oupeng.mini.android,com.shangpin,com.oppo.community,com.bbt.ask,com.yiqizuoye.studycraft,cn.htjyb.reader,com.herman.ringtone,com.sina.weibog3,com.tieyou.train.ark,smskb.com,com.tigerknows,com.ishugui,com.letv.android.client,com.apkol.root,com.yy.yymeet,com.xiudang.jiukuaiyou.ui,com.yx,com.leixun.taofen8,cn.shuangshuangfei,com.xcar.activity,com.guosen.android,com.youyuan.yyhl,com.secoo,com.ifeng.newvideo,com.sohu.inputmethod.sogou,com.speedsoftware.rootexplorer,com.xisue.zhoumo,air.com.familydoctor.FamilyDoctor,com.ophone.reader.ui,com.melodis.midomiMusicIdentifier.freemium,oms.mmc.app.almanac_inland,com.octinn.birthdayplus,com.when.android.note,com.taobao.taobao,com.autoconnectwifi.app,cn.wps.moffice,com.hexin.plat.android,cn.xianglianai,com.google.android.videos,cn.ibuka.manga.ui,com.funcity.taxi.driver,cn.kuwo.kwmusichd,com.netease.cloudmusic,com.pixlr.express,com.icson,com.xiangha,com.cungu.callrecorder.ui,com.cleanmaster.mguard_cn,com.baihe,com.kakao.talk,com.xingjiabi.shengsheng,com.taobao.wwseller,com.frego.flashlight,tv.pps.tpad,com.qq.qcloud,com.qidian.QDReader,com.ting.mp3.android,cn.chinabus.main,com.yuanfen.main,com.ss.android.essay.joke,com.iooly.android.lockscreen,cn.com.chinatelecom.account,com.baidu.music.lebo,com.xtuone.android.syllabus,com.gionee.client,com.caimi.creditcard,com.yrz.atourong,cn.ecook,im.yixin,com.buykee.princessmakeup,com.nd.desktopcontacts,com.evernote,com.wangzhi.MaMaMall,com.dataviz.docstogo,com.lakala.android,com.baidu.navi,com.thundersoft.hz.selfportrait,com.baozoumanhua.android,com.lanteanstudio.compass,com.mia.miababy,cn.wps.moffice_eng,com.sohu.auto.helper,com.duitang.main,com.aiba.app,com.google.android.youtube,com.ijinshan.kbatterydoctor,com.kk.dict,dianyun.baobaowd,com.mapbar.rainbowbus,com.baidu.easyroot,com.google.android.apps.genie.geniewidget,com.sonyericsson.extras.liveware,com.douban.radio,com.carsmart.emaintain,qsbk.app,com.tencent.weishi,com.wowotuan,com.tencent.news,com.imgo.pad,com.google.earth,com.dianping.t,predictor.ui,com.dianping.v1,flipboard.app,com.lonelycatgames.Xplore,com.lenovo.calendar,com.kingsoft,com.melot.meshow,com.dianxinos.superuser,cn.com.opda.android.clearmaster,com.lenovo.anyshare,xwj.calculator,com.autonavi.xmgd.navigator.toc,com.ymatou.shop,com.sogou.novel,com.alipay.android.app,com.baidu.BaiduMap,com.lenovo.safecenter,com.sg.sledog,com.google.android.gms,com.oupeng.browser,com.google.zxing.client.android,com.sec.app.samsungprintservice,com.wmyc.activity,com.scienvo.activity,com.alipay.android.client.pad,com.itangyuan,com.handsgo.jiakao.android,com.taobao.trip,com.mobisystems.fileman,com.nd.sms,com.gtgj.view,com.welove520.welove,com.ishowtu.hairfamily,com.baidu.baidulife,com.openet.hotel.view,com.secretlisa.xueba,me.papa,com.lejent.zuoyeshenqi.afanti,com.skvalex.callrecorder,com.mymoney,com.miantan.myoface,cn.kuwo.player,com.yaya.mmbang,org.mozilla.firefox,com.miui.weather2,com.melodis.midomiMusicIdentifier,com.intsig.camscanner,com.ciapc.tzd,com.shere.assistivetouch,com.douban.movie,cn.com.cmbc.mbank,com.fourcall.wldh,cn.ikamobile.trainfinder,cn.cj.pe,zte.com.wilink,com.ailiaoicall,com.xiuman.xingduoduo,com.meilishuo,com.google.android.calendar,bubei.tingshu,com.yoloho.dayima,com.baidu.input,com.yiyouapp,com.cootek.smartdialer,cn.cntvnews,com.elong.hotel.ui,com.meitu.meiyancamera,com.google.android.voicesearch,com.sinovatech.unicom.ui,com.hantai.voyager,com.baidu.wenku,com.baidu.travel,com.culiu.purchase,com.arcsoft.perfect365,com.juanpi.ui,flipboard.cn,com.google.android.street,com.yibasan.lizhifm,com.liveyap.timehut,cn.emoney.level2,com.lenovo.leos.cloud.sync,com.xcar.gcp,com.ss.android.article.news,com.shyl.train,eu.chainfire.supersu,cn.mama.pregnant,com.mobisystems.editor.office_with_reg,com.qiyi.video,com.china.app.bbsandroid,com.mx.browser,com.roamingsoft.manager,com.tencent.pb,com.pindou.snacks,com.xunlei.cloud,com.tencent.powermanager,com.mgyun.shua,com.suixingpay,com.alibaba.android.babylon,com.tencent.zebra,com.asiainfo.android,cn.chinabus.metro.main,com.wumii.android.mimi,com.xiaomi.channel,com.mobisystems.office,com.changdu,com.mapbar.android.accompany,com.tencent.mobileqq,com.huipinzhe.hyg,com.hupu.games,com.ijinshan.browser,android.zhibo8,com.sina.weibotab,com.zhiqupk.root,net.hidroid.hisurfing,com.vancl.activity,com.baomihua.xingzhizhu,com.Qunar,com.coohuaclient,com.duoduo.child.story,com.vanchu.apps.guimiquan,com.poptap.flashlight,com.iflytek.ringdiyclient,com.duokan.reader,com.erdo.android.FJDXCartoon,com.qiyi.video.pad,com.sec.chaton,com.android.bankabc,com.kugou.android.ringtone,com.android.cheyooh.vb,jp.gmo_media.decoproject,com.wmshua.backup,tv.pps.mobile,com.baidu.tieba,tv.danmaku.bili,com.nd.android.smarthome,fm.xiami.main,com.huawei.pisa.activity,com.rednovo.weibo,com.mgyun.shua,com.ireadercity,com.google.android.inputmethod.pinyin,com.coldworks.coldjoke,com.infinit.wostore.ui,com.cootek.smartinputv5,com.wochacha,com.gift.android,com.dx.agent2,vStudio.Android.Camera360,org.sbtools.gamehack,com.yoloho.ubaby,net.itrigo.doctor,com.zte.heartyservice,com.sonyericsson.trackid,com.mapbar.android.trybuynavi,com.caimi,com.medapp,com.ricebook.activity,com.jingyou.math,com.jingdong.app.mall,com.tongcheng.android,cn.jingling.motu.photowonder,com.rongcai.show,com.baidu.iknow,cn.j.guang,com.android.comicsisland.activity,com.mfw.voiceguide,com.yiwang,com.feizan.android.snowball,com.aapinche.android,com.blovestorm,com.tencent.map,com.woniu.groups,com.renren.mobile.android,com.taobao.qianniu,com.nqmobile.antivirus20,cn.mucang.xiaomi.android,com.budejie.www,com.pipcamera.activity,yong.universalplayer,com.happy.lock.wifi,com.app.hero.ui,com.besttone.elocal,com.to8to.assistant.activity,com.nd.android.pandareader,com.chaozh.iReaderFree,com.ting.mp3.qianqian.android,all.parttimeguidesystem,com.uanel.app.android.askdoc,com.nd.android.pandahome2,com.imohoo.favorablecard,com.jiecao.news.jiecaonews,cmb.pb,com.google.android.gsf,com.ludashi.benchmark,com.greenpoint.android.mc10086.activity,com.youku.tv,com.huimao.bobo,com.sec.spp.push,com.jiongji.andriod.card,com.lingan.seeyou,com.souyidai.investment.android,com.weiju,com.facebook.katana,com.wangzhuo.onekeyrom,com.snda.client,com.devuni.flashlight,com.estrongs.android.taskmanager,com.liujinzhi.mulflashlight,com.estrongs.android.pop,com.geili.koudai,com.yixia.videoeditor,com.ys.youshow,cn.com.sina.sports,com.google.android.apps.translate,com.dianxinos.powermanager,air.fyzb3,com.cooliris.media,com.htffund.mobile.ec.ui,com.mt.mttt,cn.cntv,cn.lieche.main,com.meitu.meipaimv,com.google.android.talk,com.nice.main,com.yipiao,com.lovebizhi.wallpaper,com.baidu.news,com.tuniu.app.ui,com.whatsapp,com.chaozh.iReaderFree15,sina.mobile.tianqitong,com.leduo.meibo,com.tmall.wireless,com.MobileTicket,com.sohu.auto.buyauto,com.husor.beibei,me.iweek.rili,com.duomi.android,com.fanhuan,com.happy.lock,com.hotbody.fitzero,com.estrongs.android.pop.cupcake,com.ijinshan.browser_fast,com.shuqi.controller,com.tshang.peipei,com.nd.android.pandalock,com.okooo.myplay,cn.longmaster.pengpeng,com.funcity.taxi.passenger,com.ijinshan.mguard,com.qq.buy,com.tencent.qqphonebook,cn.wps.moffice_i18n,com.sina.weibo,com.haitaouser.activity,com.mobileann.mafamily,com.qitu.market,com.lingdong.client.android,com.android.vending,cn.com.nd.s,com.moji.mjweather,com.xs.cn,com.google.android.play.games,com.baidu.searchbox,com.easou.plus,gpc.myweb.hinet.net.PopupVideo,com.iyd.reader.ReadingJoy,me.chunyu.ChunyuDoctor,cn.etouch.ecalendar.pad,com.netease.vopen,com.android.weather,com.gionee.aora.market,com.zhcw.zhongcs,com.taobao.ju.android,com.weihua.superphone,com.laiqian.milestone,com.mxtech.videoplayer.ad,com.edog,com.lextel.ALovePhone,com.kingreader.framework,com.tongchengrelian.main,com.sdu.didi.gui,dopool.player,com.lizi.app,wenhr.Mcdonalds,jp.naver.line.android,wabao.ringtone,com.browser2345,fm.qingting.qtradio,com.tripadvisor.tripadvisor,com.anjuke.android.haozu,com.xunlei.kankan,com.liulishuo.engzo,com.wacai365,net.xinhuamm.mainclient,com.byread.reader,com.alibaba.mobileim,com.youba.barcode,com.dolphin.browser.xf,com.alibaba.wireless,com.tuan800.android,cn.funnyxb.powerremember,com.sohu.tv,com.sogou.map.android.sogoubus,com.zlianjie.coolwifi,com.kapp.ifont,com.manboker.headportrait,com.bilin.huijiao.activity,com.snda.inote,com.sohu.auto.usedauto,com.anjuke.android.app,com.suning.mobile.ebuy,com.akazam.android.wlandialer,com.adobe.reader,me.ele,com.didapinche.booking,com.eastmoney.android.berlin,com.elinasoft.officeassistant,com.disney.brave_google,sogou.mobile.explorer,com.gewara,com.icbc,com.bjjpsk.jpskb,com.anysoft.tyyd,com.snda.tt,com.baidu.baidutranslate,com.shuame.mobile,cn.zhuna.activity,com.lenovo.FileBrowser,com.yoka.hotman,com.icarsclub.android,com.haobao.wardrobe,com.baidu.mbaby,com.tencent.hd.qq,com.kingroot.RushRoot,com.mengbaby,com.infraware.polarisoffice4,com.cyberlink.youperfect,me.abitno.vplayer.t,obg1.PhotafPro,cn.relian99,com.ibox.flashlight,com.nd.assistance,com.tuan800.tao800,com.u17.comic.phone,com.gaoqing.android,com.ydh.weile,jb.activity.mbook,com.wali.NetworkAssistant,cld.navi.mainframe,com.anyisheng.doctoran,com.baidu.voiceassistant,com.snda.youni,com.mobileuncle.toolbox,com.xianguo.pad,com.youdao.dict,com.sinyee.babybus.number,com.keenvim.cnCalendar,com.yek.lafaso,com.eshore.ezone,com.tiqiaa.icontrol,com.lingan.yunqi,com.shoujiduoduo.ringtone,com.huaqian,com.keramidas.TitaniumBackup,com.xinmei365.font,fm.jihua.kecheng,com.iBookStar.activity,org.fungo.fungolive,hu.tonuzaba.android,com.haomee.kandongman,com.hk515.patient,com.chinamobile.contacts.im,com.zhimahu,com.douguo.recipe,com.shazam.encore.android,com.vodone.caibo,com.tencent.token,com.roboo.explorer,com.bankcomm,com.iflytek.ihou.chang.app,com.myzaker.ZAKER_Phone,com.hww.locationshow,cn.dict.android.pro,com.wantu.activity,com.lbe.security,com.adobe.flashplayer,com.bizsocialnet,com.longdai.android,cn.kuwo.tingshu,com.youba.ringtones,com.google.android.apps.docs,com.baidu.hao123,com.sgiggle.production,com.mydream.wifi,com.esbook.reader,ctrip.android.view,com.meiqu.mq,com.chinamobile.cmccwifi,com.lianlian,cn.emoney.pf,com.tencent.qqmusicpad,com.mobvoi.baiding,com.ggeye.yunqi.api,com.eusoft.ting.en,com.feedov.baidutong,com.kimiss.gmmz.android,com.dianxinos.optimizer.duplay,com.metek.zqWeather,com.tencent.qqlite,com.ts.zys,com.yinyuetai.ui,com.kunpeng.babyting,me.topit.TopAndroid2,com.amazon.kindle,com.kcwangluo,com.lectek.android.sfreader,com.book2345.reader,com.tencent.qqpinyin,com.chinatelecom.bestpayclient,com.sankuai.meituan.merchant,com.tenpay.android,com.thestore.main,com.android.chrome,com.chinatelecom.pim,com.qo.android.moto,my.beautyCamera,com.jiayuan,com.roboo.joke,com.wuba,com.zdworks.android.zdcalendar,com.sangdh,com.hcsql.shengqiandianhua,com.adsk.sketchbookhd.galaxy.oem,com.futurefleet.pandabus.ui,com.mfw.roadbook,com.telecom.video,com.Android56,com.android.coolwind,com.zzenglish.client,com.huawei.hidisk,com.dewmobile.kuaiya,com.dianxinos.dxhome,com.mobile17173.game,com.lasun.mobile.client.activity,com.pingan.pabank.activity,com.hujiang.hjclass,com.achievo.vipshop,com.yybackup,com.vmall.client,com.soft.apk008v,com.nearme.note,com.mtime,com.tengchong.juhuiwan,com.ktls.scandandclear,com.softspb.tv.full,com.instamag.activity,cn.amazon.mShop.android,hk.cloudtech.cloudcall,com.shuame.rootgenius,com.facebook.orca,com.oupeng.max,com.ggeye.babymingzi,com.sinyee.babybus.kindergarten,cn.dooone.wifihelper_cn,com.jm.android.jumei,com.voice.assistant.main,com.iflytek.inputmethod,com.talkweb.nciyuan,com.androidesk,com.mt.mtxx.mtxx,oms.mmc.fortunetelling,com.antutu.ABenchMark,com.wole56.ishow,com.jsmcc,cn.am321.android.am321,com.ijinshan.duba,com.google.android.tts,com.zuobao.xiaobao,com.work.beauty,com.tencent.WBlog,com.chinamworld.bocmbci,com.netease.mobimail,com.xiachufang,viva.reader,com.jiasoft.highrail,com.when.coco,cn.banshenggua.aichang,com.baidu.baike,com.zhihu.android,com.haodou.recipe,cn.com.kuting.activity,com.dangdang.buy2,com.baidu.video,com.mt.mtgif,com.gwsoft.imusic.controller,com.aibang.abbus.bus,com.MoScreen,com.anguanjia.safe,com.qwbcg.android,hugh.android.app.zidian,com.zch.safelottery,com.lingduo.acorn,com.chongdong.cloud,InternetRadio.all,com.tencent.androidqqmail,com.funshion.video.mobile,com.pdager,com.lltskb.lltskb,cn.mucang.xiaomi.android.wz,com.taobao.apad,lqh.dream.llk,com.baidu.browser.apps,com.cpbao.lottery,com.jiuyan.infashion,com.quanmincai.caipiao,com.mygolbs.mybus,com.google.android.gm,com.cfinc.decopic,com.ds.sm,com.wsandroid.suite,com.sohu.newsclient,com.immomo.momo,com.noshufou.android.su,com.quanleimu.activity,com.roidapp.photogrid,com.mobilemafia.KingOfMoney,com.pingco.jc258cup,com.mgyun.shua.su,com.android.cheyooh,cn.cmvideo.isj,com.shuame.mobile,com.quvideo.xiaoying,cn.buding.coupon,com.xindaoapp.happypet,com.youku.phone,cn.safetrip.edog,com.to8to.housekeeper,com.tqkj.shenzhi,com.ganji.android,com.gamestar.pianoperfect,com.clov4r.android.nil,cn.andson.cardmanager,com.hf,com.snda.wifilocating,com.hunantv.imgo.activity,my.PCamera,com.ifeng.news2,com.iflytek.viafly,com.chinamworld.main,com.gui.gui.chen.flash.light.one,cn.com.spdb.mobilebank.per,com.flightmanager.view,com.wangzhi.MaMaHelp,com.manle.phone.android.yaodian,com.google.android.apps.books,com.sskj.flashlight,com.breadtrip,com.sohu.sohuvideo,com.zhiyi.android.community,com.autonavi.xmgd.navigator,com.etao.kaka,com.dft.hb.app,cn.dpocket.moplusand.uinew,com.lenovo.videotalk.phone,com.cplatform.surfdesktop,com.kugou.android,com.tni.TasKillerFull,com.skydh,com.taobao.reader,com.dianxing.heloandroid,com.dw.btime,com.dayingjia.stock.activity,com.tencent.mtt,cgtz.com.cgtz,cn.com.tiros.android.navidog,com.xiaoenai.app,com.iqianggou.android,com.yk.mhb,cn.coupon.kfc,com.tencent.qt.qtl,com.tencent.qqcamera,com.tqkj.weiji,ch.smalltech.ledflashlight.pro,com.letv.android.client.pad,com.zdworks.android.zdclock,com.duowan.lolbox,com.boohee.one,com.baidu.yuedu,com.tencent.android.pad,com.corner23.universalandroot.root123,com.wlanplus.chang,com.tencent.minihd.qq,com.qingchifan,com.caimi.moneymgr,com.fenbi.android.gaozhong,com.clou.sns.android.anywhered,com.tencent.research.drop,com.youloft.calendar,com.xiaomi.shop,com.sdu.didi.psnger,com.ceic.app,com.pplive.androidpad,cn.maketion.activity,com.lashou.groupurchasing,com.fanli.android.apps,com.skype.rover,com.tencent.qqlivehd,com.surfing.kefu,com.culiukeji.huanletao,com.ifeng.fhdt,com.dou_pai.DouPai,com.lottery9188.Activity,com.changba,com.android.dazhihui,com.uu.uunavi,com.baidu.baiducamera,com.calendar.UI,com.google.android.marvin.talkback,com.ggeye.jiakao.api,com.cmcc.mobilevideo,com.sinyee.babybus.chef,com.lenovo.browser,com.fmmatch.tata,pinkdiary.xiaoxiaotu.com,com.aspire.g3wlan.client,cn.mc1.sq,com.mymoney.sms,com.kaixin001.activity,com.netease.newsreader.activity,com.feiniu.market,com.sds.android.ttpod,com.buak.Link2SD,com.netease.mkey,com.himissing.poppy,com.cn21.ecloud,com.uuwldh,com.tingwen,com.fone.player,com.holiestar.flashoncall,com.jiasoft.swreader,com.ct.client,me.mizhuan,com.google.popqr.client.android,com.antutu.tester,com.androidesk.livewallpaper,com.alensw.PicFolder,com.ushaqi.zhuishushenqi,com.intsig.BizCardReader,com.itings.myradio,com.xiaobanlong.main,com.vlingo.midas,com.kandian.vodapp,com.cyworld.camera,com.ctri.ui,com.tripadvisor.tripadvisor.daodao,com.mediatek.filemanager,in.huohua.Yuki,com.baozun.customer.main,cn.eclicks.wzsearch,com.autonavi.cmccmap,cn.etouch.ecalendar,com.ddmap.android.privilege,com.lgl.calendar,jp.naver.linecamera.android,com.ximalaya.ting.android,com.izhenxin,com.syezon.wifi,com.duowan.kiwi,com.taobao.etao,com.youdao.note,com.google.android.music,cmccwm.mobilemusic,com.zhangdan.app,com.cjwifi,com.nuomi,com.hjwordgames,com.icoolme.android.weather,com.acp.main,com.hoolai.moca,com.yiche.price,com.memezhibo.android,com.banma.astro,com.kingroot.kinguser,com.netease.caipiao,com.netease.pris,com.meilapp.meila,com.codoon.gps,com.yek.android.kfc.activitys,com.duowan.mobile,com.beilou.haigou,com.appshare.android.ilisten,com.qzone,com.ucamera.ucam,com.rytong.bankps,com.umetrip.android.msky.app,cn.com.opda.android.update,com.baidu.appsearch,vz.com,com.anzogame.lol,com.yunlian.wewe,com.slanissue.apps.mobile.erge,com.baidu.netdisk,cn.mama.activity,com.heibai.campus,com.tencent.qqmusic,com.smile.gifmaker,com.sankuai.movie,com.peopleClients.views,com.quanneng.flashLed,com.skysoft.kkbox.android,com.cubic.autohome,com.cmbchina.ccd.pluto.cmbActivity,com.tencent.ttpic,com.metago.astro,com.zte.backup.mmi,com.babytree.apps.pregnancy,com.hisunflytone.android,com.autohome.usedcar,com.hujiang.cctalk,cn.eclicks.drivingtest,com.sogou.map.android.maps,com.mogujie,com.hufeng.filemanager,com.tencent.mm,com.lidroid.lockscreen,com.skype.raider,com.jxedt,com.sec.android.fwupgrade,com.yourdream.app.android,com.up591.android,com.iflytek.cmcc,com.dp.android.elong,com.husor.mizhe,com.danesh.system.app.remover,com.corp21cn.mail189,com.mobileann.MobileAnn,org.zywx.wbpalmstar.widgetone.uex10074790,com.liveaa.education,com.showself.ui,cn.andouya,com.anyview,com.anysoft.hxzts,com.sohu.auto.sohuauto,cn.com.tiros.android.navidog4x,com.lilysgame.calendar,com.sunnymum.client,com.audiocn.kalaok,com.samsung.swift.app.kiesair,com.when.wannianli,cn.buding.martin,com.lectek.android.ecp,net.iaround,com.wechat.voice,com.duoduo.passenger,com.sina.news,com.qq.reader,com.mapbar.android.mapbarmap,com.kuxun.scliang.plane,com.unionpay.uppay,com.srcb.mbank,cn.jsb.china,com.rytong.hnair,com.iboxpay.iboxpay,com.weibopay.mobile,com.cebbank.bankebb,com.besttone.travelsky,com.qiandai.xqd,com.rytong.airchina,com.ecitic.bank.mobile,com.yitong.mbank,com.koudai.weishop,com.air.sz,com.qihoo.permmgr,com.bill99.kuaiqian,com.cleanmaster.security_cn,com.cib.bankcib,com.umpay.upay.wallet,com.wangyin.payment,com.hkairlines.apps,com.baidu.wallet,com.gome.eshopnew,cn.unicompay.wallet,com.sec.android.wallet,cn.opda.a.phonoalbumshoushou,com.netease.railwayticket,com.rytong.ceair,com.united.mobile.android,com.rytong.app.bankhx,Kal.FlightInfo,com.suning.mobile.epa,com.paic.zhifu.wallet.activity,com.tencent.qqpimsecure,com.nbbank,com.qianwang.qianbao,org.zywx.wbpalmstar.widgetone.uex11296876,com.unionpay,com.travelsky.angel.mskymf.activity,com.mobiata.flighttrack.five,com.gkegg.airasia,com.ali.money.shield,com.rytong.bankgdb,com.huawei.wallet,com.ubercab,com.airbnb.android,com.csair.mbp,com.ssm.asiana,com.app.pocketmoney,com.besttone.hall,com.bw30.zsch,com.china3s.android,com.citicbank.cyberpay.ui,com.bhutya.jetstar,com.ips.android.client,com.unicom.wopay,com.staralliance.navigator,com.xs2theworld.kamobile,com.netease.epay,com.baidu.faceu,com.UCMobile,com.netease.my,com.netease.dhxy,com.tencent.tmgp.rxcq,com.superevilmegacorp.game,com.meitu.wheecam,com.rrh.jdb";
	//    0    0:ldc1            #62  <String "com.tencent.mobileqqi,com.tencent.qqlive,com.nd.android.pandahome.hd,com.tongchenglove.main,com.gdhbgh.activity,com.dragon.android.pandaspace,com.handsgo.jiakao.android.kemu2,com.soufun.app,com.google.android.apps.maps,com.job.android,com.tencent.qqpim,com.baidu.homework,com.storm.smart,ly.pp.justpiano,com.android.mediacenter,com.android.cheyoohdrive,com.ymall.presentshop,com.eg.android.AlipayGphone,com.miguo.ui,com.pplive.androidphone,com.android.lexun,com.redirectin.rockplayer.android.unified,com.sz.order,cn.mucang.kaka.android,com.qijia.o2o,com.chinaideal.bkclient.tabmain,com.hiapk.marketpho,com.pingco.android.mix,com.leho.manicure,com.unique.app,com.tudou.android,com.beastudio.sflashlight,com.Astro.UI,com.oupeng.mini.android,com.shangpin,com.oppo.community,com.bbt.ask,com.yiqizuoye.studycraft,cn.htjyb.reader,com.herman.ringtone,com.sina.weibog3,com.tieyou.train.ark,smskb.com,com.tigerknows,com.ishugui,com.letv.android.client,com.apkol.root,com.yy.yymeet,com.xiudang.jiukuaiyou.ui,com.yx,com.leixun.taofen8,cn.shuangshuangfei,com.xcar.activity,com.guosen.android,com.youyuan.yyhl,com.secoo,com.ifeng.newvideo,com.sohu.inputmethod.sogou,com.speedsoftware.rootexplorer,com.xisue.zhoumo,air.com.familydoctor.FamilyDoctor,com.ophone.reader.ui,com.melodis.midomiMusicIdentifier.freemium,oms.mmc.app.almanac_inland,com.octinn.birthdayplus,com.when.android.note,com.taobao.taobao,com.autoconnectwifi.app,cn.wps.moffice,com.hexin.plat.android,cn.xianglianai,com.google.android.videos,cn.ibuka.manga.ui,com.funcity.taxi.driver,cn.kuwo.kwmusichd,com.netease.cloudmusic,com.pixlr.express,com.icson,com.xiangha,com.cungu.callrecorder.ui,com.cleanmaster.mguard_cn,com.baihe,com.kakao.talk,com.xingjiabi.shengsheng,com.taobao.wwseller,com.frego.flashlight,tv.pps.tpad,com.qq.qcloud,com.qidian.QDReader,com.ting.mp3.android,cn.chinabus.main,com.yuanfen.main,com.ss.android.essay.joke,com.iooly.android.lockscreen,cn.com.chinatelecom.account,com.baidu.music.lebo,com.xtuone.android.syllabus,com.gionee.client,com.caimi.creditcard,com.yrz.atourong,cn.ecook,im.yixin,com.buykee.princessmakeup,com.nd.desktopcontacts,com.evernote,com.wangzhi.MaMaMall,com.dataviz.docstogo,com.lakala.android,com.baidu.navi,com.thundersoft.hz.selfportrait,com.baozoumanhua.android,com.lanteanstudio.compass,com.mia.miababy,cn.wps.moffice_eng,com.sohu.auto.helper,com.duitang.main,com.aiba.app,com.google.android.youtube,com.ijinshan.kbatterydoctor,com.kk.dict,dianyun.baobaowd,com.mapbar.rainbowbus,com.baidu.easyroot,com.google.android.apps.genie.geniewidget,com.sonyericsson.extras.liveware,com.douban.radio,com.carsmart.emaintain,qsbk.app,com.tencent.weishi,com.wowotuan,com.tencent.news,com.imgo.pad,com.google.earth,com.dianping.t,predictor.ui,com.dianping.v1,flipboard.app,com.lonelycatgames.Xplore,com.lenovo.calendar,com.kingsoft,com.melot.meshow,com.dianxinos.superuser,cn.com.opda.android.clearmaster,com.lenovo.anyshare,xwj.calculator,com.autonavi.xmgd.navigator.toc,com.ymatou.shop,com.sogou.novel,com.alipay.android.app,com.baidu.BaiduMap,com.lenovo.safecenter,com.sg.sledog,com.google.android.gms,com.oupeng.browser,com.google.zxing.client.android,com.sec.app.samsungprintservice,com.wmyc.activity,com.scienvo.activity,com.alipay.android.client.pad,com.itangyuan,com.handsgo.jiakao.android,com.taobao.trip,com.mobisystems.fileman,com.nd.sms,com.gtgj.view,com.welove520.welove,com.ishowtu.hairfamily,com.baidu.baidulife,com.openet.hotel.view,com.secretlisa.xueba,me.papa,com.lejent.zuoyeshenqi.afanti,com.skvalex.callrecorder,com.mymoney,com.miantan.myoface,cn.kuwo.player,com.yaya.mmbang,org.mozilla.firefox,com.miui.weather2,com.melodis.midomiMusicIdentifier,com.intsig.camscanner,com.ciapc.tzd,com.shere.assistivetouch,com.douban.movie,cn.com.cmbc.mbank,com.fourcall.wldh,cn.ikamobile.trainfinder,cn.cj.pe,zte.com.wilink,com.ailiaoicall,com.xiuman.xingduoduo,com.meilishuo,com.google.android.calendar,bubei.tingshu,com.yoloho.dayima,com.baidu.input,com.yiyouapp,com.cootek.smartdialer,cn.cntvnews,com.elong.hotel.ui,com.meitu.meiyancamera,com.google.android.voicesearch,com.sinovatech.unicom.ui,com.hantai.voyager,com.baidu.wenku,com.baidu.travel,com.culiu.purchase,com.arcsoft.perfect365,com.juanpi.ui,flipboard.cn,com.google.android.street,com.yibasan.lizhifm,com.liveyap.timehut,cn.emoney.level2,com.lenovo.leos.cloud.sync,com.xcar.gcp,com.ss.android.article.news,com.shyl.train,eu.chainfire.supersu,cn.mama.pregnant,com.mobisystems.editor.office_with_reg,com.qiyi.video,com.china.app.bbsandroid,com.mx.browser,com.roamingsoft.manager,com.tencent.pb,com.pindou.snacks,com.xunlei.cloud,com.tencent.powermanager,com.mgyun.shua,com.suixingpay,com.alibaba.android.babylon,com.tencent.zebra,com.asiainfo.android,cn.chinabus.metro.main,com.wumii.android.mimi,com.xiaomi.channel,com.mobisystems.office,com.changdu,com.mapbar.android.accompany,com.tencent.mobileqq,com.huipinzhe.hyg,com.hupu.games,com.ijinshan.browser,android.zhibo8,com.sina.weibotab,com.zhiqupk.root,net.hidroid.hisurfing,com.vancl.activity,com.baomihua.xingzhizhu,com.Qunar,com.coohuaclient,com.duoduo.child.story,com.vanchu.apps.guimiquan,com.poptap.flashlight,com.iflytek.ringdiyclient,com.duokan.reader,com.erdo.android.FJDXCartoon,com.qiyi.video.pad,com.sec.chaton,com.android.bankabc,com.kugou.android.ringtone,com.android.cheyooh.vb,jp.gmo_media.decoproject,com.wmshua.backup,tv.pps.mobile,com.baidu.tieba,tv.danmaku.bili,com.nd.android.smarthome,fm.xiami.main,com.huawei.pisa.activity,com.rednovo.weibo,com.mgyun.shua,com.ireadercity,com.google.android.inputmethod.pinyin,com.coldworks.coldjoke,com.infinit.wostore.ui,com.cootek.smartinputv5,com.wochacha,com.gift.android,com.dx.agent2,vStudio.Android.Camera360,org.sbtools.gamehack,com.yoloho.ubaby,net.itrigo.doctor,com.zte.heartyservice,com.sonyericsson.trackid,com.mapbar.android.trybuynavi,com.caimi,com.medapp,com.ricebook.activity,com.jingyou.math,com.jingdong.app.mall,com.tongcheng.android,cn.jingling.motu.photowonder,com.rongcai.show,com.baidu.iknow,cn.j.guang,com.android.comicsisland.activity,com.mfw.voiceguide,com.yiwang,com.feizan.android.snowball,com.aapinche.android,com.blovestorm,com.tencent.map,com.woniu.groups,com.renren.mobile.android,com.taobao.qianniu,com.nqmobile.antivirus20,cn.mucang.xiaomi.android,com.budejie.www,com.pipcamera.activity,yong.universalplayer,com.happy.lock.wifi,com.app.hero.ui,com.besttone.elocal,com.to8to.assistant.activity,com.nd.android.pandareader,com.chaozh.iReaderFree,com.ting.mp3.qianqian.android,all.parttimeguidesystem,com.uanel.app.android.askdoc,com.nd.android.pandahome2,com.imohoo.favorablecard,com.jiecao.news.jiecaonews,cmb.pb,com.google.android.gsf,com.ludashi.benchmark,com.greenpoint.android.mc10086.activity,com.youku.tv,com.huimao.bobo,com.sec.spp.push,com.jiongji.andriod.card,com.lingan.seeyou,com.souyidai.investment.android,com.weiju,com.facebook.katana,com.wangzhuo.onekeyrom,com.snda.client,com.devuni.flashlight,com.estrongs.android.taskmanager,com.liujinzhi.mulflashlight,com.estrongs.android.pop,com.geili.koudai,com.yixia.videoeditor,com.ys.youshow,cn.com.sina.sports,com.google.android.apps.translate,com.dianxinos.powermanager,air.fyzb3,com.cooliris.media,com.htffund.mobile.ec.ui,com.mt.mttt,cn.cntv,cn.lieche.main,com.meitu.meipaimv,com.google.android.talk,com.nice.main,com.yipiao,com.lovebizhi.wallpaper,com.baidu.news,com.tuniu.app.ui,com.whatsapp,com.chaozh.iReaderFree15,sina.mobile.tianqitong,com.leduo.meibo,com.tmall.wireless,com.MobileTicket,com.sohu.auto.buyauto,com.husor.beibei,me.iweek.rili,com.duomi.android,com.fanhuan,com.happy.lock,com.hotbody.fitzero,com.estrongs.android.pop.cupcake,com.ijinshan.browser_fast,com.shuqi.controller,com.tshang.peipei,com.nd.android.pandalock,com.okooo.myplay,cn.longmaster.pengpeng,com.funcity.taxi.passenger,com.ijinshan.mguard,com.qq.buy,com.tencent.qqphonebook,cn.wps.moffice_i18n,com.sina.weibo,com.haitaouser.activity,com.mobileann.mafamily,com.qitu.market,com.lingdong.client.android,com.android.vending,cn.com.nd.s,com.moji.mjweather,com.xs.cn,com.google.android.play.games,com.baidu.searchbox,com.easou.plus,gpc.myweb.hinet.net.PopupVideo,com.iyd.reader.ReadingJoy,me.chunyu.ChunyuDoctor,cn.etouch.ecalendar.pad,com.netease.vopen,com.android.weather,com.gionee.aora.market,com.zhcw.zhongcs,com.taobao.ju.android,com.weihua.superphone,com.laiqian.milestone,com.mxtech.videoplayer.ad,com.edog,com.lextel.ALovePhone,com.kingreader.framework,com.tongchengrelian.main,com.sdu.didi.gui,dopool.player,com.lizi.app,wenhr.Mcdonalds,jp.naver.line.android,wabao.ringtone,com.browser2345,fm.qingting.qtradio,com.tripadvisor.tripadvisor,com.anjuke.android.haozu,com.xunlei.kankan,com.liulishuo.engzo,com.wacai365,net.xinhuamm.mainclient,com.byread.reader,com.alibaba.mobileim,com.youba.barcode,com.dolphin.browser.xf,com.alibaba.wireless,com.tuan800.android,cn.funnyxb.powerremember,com.sohu.tv,com.sogou.map.android.sogoubus,com.zlianjie.coolwifi,com.kapp.ifont,com.manboker.headportrait,com.bilin.huijiao.activity,com.snda.inote,com.sohu.auto.usedauto,com.anjuke.android.app,com.suning.mobile.ebuy,com.akazam.android.wlandialer,com.adobe.reader,me.ele,com.didapinche.booking,com.eastmoney.android.berlin,com.elinasoft.officeassistant,com.disney.brave_google,sogou.mobile.explorer,com.gewara,com.icbc,com.bjjpsk.jpskb,com.anysoft.tyyd,com.snda.tt,com.baidu.baidutranslate,com.shuame.mobile,cn.zhuna.activity,com.lenovo.FileBrowser,com.yoka.hotman,com.icarsclub.android,com.haobao.wardrobe,com.baidu.mbaby,com.tencent.hd.qq,com.kingroot.RushRoot,com.mengbaby,com.infraware.polarisoffice4,com.cyberlink.youperfect,me.abitno.vplayer.t,obg1.PhotafPro,cn.relian99,com.ibox.flashlight,com.nd.assistance,com.tuan800.tao800,com.u17.comic.phone,com.gaoqing.android,com.ydh.weile,jb.activity.mbook,com.wali.NetworkAssistant,cld.navi.mainframe,com.anyisheng.doctoran,com.baidu.voiceassistant,com.snda.youni,com.mobileuncle.toolbox,com.xianguo.pad,com.youdao.dict,com.sinyee.babybus.number,com.keenvim.cnCalendar,com.yek.lafaso,com.eshore.ezone,com.tiqiaa.icontrol,com.lingan.yunqi,com.shoujiduoduo.ringtone,com.huaqian,com.keramidas.TitaniumBackup,com.xinmei365.font,fm.jihua.kecheng,com.iBookStar.activity,org.fungo.fungolive,hu.tonuzaba.android,com.haomee.kandongman,com.hk515.patient,com.chinamobile.contacts.im,com.zhimahu,com.douguo.recipe,com.shazam.encore.android,com.vodone.caibo,com.tencent.token,com.roboo.explorer,com.bankcomm,com.iflytek.ihou.chang.app,com.myzaker.ZAKER_Phone,com.hww.locationshow,cn.dict.android.pro,com.wantu.activity,com.lbe.security,com.adobe.flashplayer,com.bizsocialnet,com.longdai.android,cn.kuwo.tingshu,com.youba.ringtones,com.google.android.apps.docs,com.baidu.hao123,com.sgiggle.production,com.mydream.wifi,com.esbook.reader,ctrip.android.view,com.meiqu.mq,com.chinamobile.cmccwifi,com.lianlian,cn.emoney.pf,com.tencent.qqmusicpad,com.mobvoi.baiding,com.ggeye.yunqi.api,com.eusoft.ting.en,com.feedov.baidutong,com.kimiss.gmmz.android,com.dianxinos.optimizer.duplay,com.metek.zqWeather,com.tencent.qqlite,com.ts.zys,com.yinyuetai.ui,com.kunpeng.babyting,me.topit.TopAndroid2,com.amazon.kindle,com.kcwangluo,com.lectek.android.sfreader,com.book2345.reader,com.tencent.qqpinyin,com.chinatelecom.bestpayclient,com.sankuai.meituan.merchant,com.tenpay.android,com.thestore.main,com.android.chrome,com.chinatelecom.pim,com.qo.android.moto,my.beautyCamera,com.jiayuan,com.roboo.joke,com.wuba,com.zdworks.android.zdcalendar,com.sangdh,com.hcsql.shengqiandianhua,com.adsk.sketchbookhd.galaxy.oem,com.futurefleet.pandabus.ui,com.mfw.roadbook,com.telecom.video,com.Android56,com.android.coolwind,com.zzenglish.client,com.huawei.hidisk,com.dewmobile.kuaiya,com.dianxinos.dxhome,com.mobile17173.game,com.lasun.mobile.client.activity,com.pingan.pabank.activity,com.hujiang.hjclass,com.achievo.vipshop,com.yybackup,com.vmall.client,com.soft.apk008v,com.nearme.note,com.mtime,com.tengchong.juhuiwan,com.ktls.scandandclear,com.softspb.tv.full,com.instamag.activity,cn.amazon.mShop.android,hk.cloudtech.cloudcall,com.shuame.rootgenius,com.facebook.orca,com.oupeng.max,com.ggeye.babymingzi,com.sinyee.babybus.kindergarten,cn.dooone.wifihelper_cn,com.jm.android.jumei,com.voice.assistant.main,com.iflytek.inputmethod,com.talkweb.nciyuan,com.androidesk,com.mt.mtxx.mtxx,oms.mmc.fortunetelling,com.antutu.ABenchMark,com.wole56.ishow,com.jsmcc,cn.am321.android.am321,com.ijinshan.duba,com.google.android.tts,com.zuobao.xiaobao,com.work.beauty,com.tencent.WBlog,com.chinamworld.bocmbci,com.netease.mobimail,com.xiachufang,viva.reader,com.jiasoft.highrail,com.when.coco,cn.banshenggua.aichang,com.baidu.baike,com.zhihu.android,com.haodou.recipe,cn.com.kuting.activity,com.dangdang.buy2,com.baidu.video,com.mt.mtgif,com.gwsoft.imusic.controller,com.aibang.abbus.bus,com.MoScreen,com.anguanjia.safe,com.qwbcg.android,hugh.android.app.zidian,com.zch.safelottery,com.lingduo.acorn,com.chongdong.cloud,InternetRadio.all,com.tencent.androidqqmail,com.funshion.video.mobile,com.pdager,com.lltskb.lltskb,cn.mucang.xiaomi.android.wz,com.taobao.apad,lqh.dream.llk,com.baidu.browser.apps,com.cpbao.lottery,com.jiuyan.infashion,com.quanmincai.caipiao,com.mygolbs.mybus,com.google.android.gm,com.cfinc.decopic,com.ds.sm,com.wsandroid.suite,com.sohu.newsclient,com.immomo.momo,com.noshufou.android.su,com.quanleimu.activity,com.roidapp.photogrid,com.mobilemafia.KingOfMoney,com.pingco.jc258cup,com.mgyun.shua.su,com.android.cheyooh,cn.cmvideo.isj,com.shuame.mobile,com.quvideo.xiaoying,cn.buding.coupon,com.xindaoapp.happypet,com.youku.phone,cn.safetrip.edog,com.to8to.housekeeper,com.tqkj.shenzhi,com.ganji.android,com.gamestar.pianoperfect,com.clov4r.android.nil,cn.andson.cardmanager,com.hf,com.snda.wifilocating,com.hunantv.imgo.activity,my.PCamera,com.ifeng.news2,com.iflytek.viafly,com.chinamworld.main,com.gui.gui.chen.flash.light.one,cn.com.spdb.mobilebank.per,com.flightmanager.view,com.wangzhi.MaMaHelp,com.manle.phone.android.yaodian,com.google.android.apps.books,com.sskj.flashlight,com.breadtrip,com.sohu.sohuvideo,com.zhiyi.android.community,com.autonavi.xmgd.navigator,com.etao.kaka,com.dft.hb.app,cn.dpocket.moplusand.uinew,com.lenovo.videotalk.phone,com.cplatform.surfdesktop,com.kugou.android,com.tni.TasKillerFull,com.skydh,com.taobao.reader,com.dianxing.heloandroid,com.dw.btime,com.dayingjia.stock.activity,com.tencent.mtt,cgtz.com.cgtz,cn.com.tiros.android.navidog,com.xiaoenai.app,com.iqianggou.android,com.yk.mhb,cn.coupon.kfc,com.tencent.qt.qtl,com.tencent.qqcamera,com.tqkj.weiji,ch.smalltech.ledflashlight.pro,com.letv.android.client.pad,com.zdworks.android.zdclock,com.duowan.lolbox,com.boohee.one,com.baidu.yuedu,com.tencent.android.pad,com.corner23.universalandroot.root123,com.wlanplus.chang,com.tencent.minihd.qq,com.qingchifan,com.caimi.moneymgr,com.fenbi.android.gaozhong,com.clou.sns.android.anywhered,com.tencent.research.drop,com.youloft.calendar,com.xiaomi.shop,com.sdu.didi.psnger,com.ceic.app,com.pplive.androidpad,cn.maketion.activity,com.lashou.groupurchasing,com.fanli.android.apps,com.skype.rover,com.tencent.qqlivehd,com.surfing.kefu,com.culiukeji.huanletao,com.ifeng.fhdt,com.dou_pai.DouPai,com.lottery9188.Activity,com.changba,com.android.dazhihui,com.uu.uunavi,com.baidu.baiducamera,com.calendar.UI,com.google.android.marvin.talkback,com.ggeye.jiakao.api,com.cmcc.mobilevideo,com.sinyee.babybus.chef,com.lenovo.browser,com.fmmatch.tata,pinkdiary.xiaoxiaotu.com,com.aspire.g3wlan.client,cn.mc1.sq,com.mymoney.sms,com.kaixin001.activity,com.netease.newsreader.activity,com.feiniu.market,com.sds.android.ttpod,com.buak.Link2SD,com.netease.mkey,com.himissing.poppy,com.cn21.ecloud,com.uuwldh,com.tingwen,com.fone.player,com.holiestar.flashoncall,com.jiasoft.swreader,com.ct.client,me.mizhuan,com.google.popqr.client.android,com.antutu.tester,com.androidesk.livewallpaper,com.alensw.PicFolder,com.ushaqi.zhuishushenqi,com.intsig.BizCardReader,com.itings.myradio,com.xiaobanlong.main,com.vlingo.midas,com.kandian.vodapp,com.cyworld.camera,com.ctri.ui,com.tripadvisor.tripadvisor.daodao,com.mediatek.filemanager,in.huohua.Yuki,com.baozun.customer.main,cn.eclicks.wzsearch,com.autonavi.cmccmap,cn.etouch.ecalendar,com.ddmap.android.privilege,com.lgl.calendar,jp.naver.linecamera.android,com.ximalaya.ting.android,com.izhenxin,com.syezon.wifi,com.duowan.kiwi,com.taobao.etao,com.youdao.note,com.google.android.music,cmccwm.mobilemusic,com.zhangdan.app,com.cjwifi,com.nuomi,com.hjwordgames,com.icoolme.android.weather,com.acp.main,com.hoolai.moca,com.yiche.price,com.memezhibo.android,com.banma.astro,com.kingroot.kinguser,com.netease.caipiao,com.netease.pris,com.meilapp.meila,com.codoon.gps,com.yek.android.kfc.activitys,com.duowan.mobile,com.beilou.haigou,com.appshare.android.ilisten,com.qzone,com.ucamera.ucam,com.rytong.bankps,com.umetrip.android.msky.app,cn.com.opda.android.update,com.baidu.appsearch,vz.com,com.anzogame.lol,com.yunlian.wewe,com.slanissue.apps.mobile.erge,com.baidu.netdisk,cn.mama.activity,com.heibai.campus,com.tencent.qqmusic,com.smile.gifmaker,com.sankuai.movie,com.peopleClients.views,com.quanneng.flashLed,com.skysoft.kkbox.android,com.cubic.autohome,com.cmbchina.ccd.pluto.cmbActivity,com.tencent.ttpic,com.metago.astro,com.zte.backup.mmi,com.babytree.apps.pregnancy,com.hisunflytone.android,com.autohome.usedcar,com.hujiang.cctalk,cn.eclicks.drivingtest,com.sogou.map.android.maps,com.mogujie,com.hufeng.filemanager,com.tencent.mm,com.lidroid.lockscreen,com.skype.raider,com.jxedt,com.sec.android.fwupgrade,com.yourdream.app.android,com.up591.android,com.iflytek.cmcc,com.dp.android.elong,com.husor.mizhe,com.danesh.system.app.remover,com.corp21cn.mail189,com.mobileann.MobileAnn,org.zywx.wbpalmstar.widgetone.uex10074790,com.liveaa.education,com.showself.ui,cn.andouya,com.anyview,com.anysoft.hxzts,com.sohu.auto.sohuauto,cn.com.tiros.android.navidog4x,com.lilysgame.calendar,com.sunnymum.client,com.audiocn.kalaok,com.samsung.swift.app.kiesair,com.when.wannianli,cn.buding.martin,com.lectek.android.ecp,net.iaround,com.wechat.voice,com.duoduo.passenger,com.sina.news,com.qq.reader,com.mapbar.android.mapbarmap,com.kuxun.scliang.plane,com.unionpay.uppay,com.srcb.mbank,cn.jsb.china,com.rytong.hnair,com.iboxpay.iboxpay,com.weibopay.mobile,com.cebbank.bankebb,com.besttone.travelsky,com.qiandai.xqd,com.rytong.airchina,com.ecitic.bank.mobile,com.yitong.mbank,com.koudai.weishop,com.air.sz,com.qihoo.permmgr,com.bill99.kuaiqian,com.cleanmaster.security_cn,com.cib.bankcib,com.umpay.upay.wallet,com.wangyin.payment,com.hkairlines.apps,com.baidu.wallet,com.gome.eshopnew,cn.unicompay.wallet,com.sec.android.wallet,cn.opda.a.phonoalbumshoushou,com.netease.railwayticket,com.rytong.ceair,com.united.mobile.android,com.rytong.app.bankhx,Kal.FlightInfo,com.suning.mobile.epa,com.paic.zhifu.wallet.activity,com.tencent.qqpimsecure,com.nbbank,com.qianwang.qianbao,org.zywx.wbpalmstar.widgetone.uex11296876,com.unionpay,com.travelsky.angel.mskymf.activity,com.mobiata.flighttrack.five,com.gkegg.airasia,com.ali.money.shield,com.rytong.bankgdb,com.huawei.wallet,com.ubercab,com.airbnb.android,com.csair.mbp,com.ssm.asiana,com.app.pocketmoney,com.besttone.hall,com.bw30.zsch,com.china3s.android,com.citicbank.cyberpay.ui,com.bhutya.jetstar,com.ips.android.client,com.unicom.wopay,com.staralliance.navigator,com.xs2theworld.kamobile,com.netease.epay,com.baidu.faceu,com.UCMobile,com.netease.my,com.netease.dhxy,com.tencent.tmgp.rxcq,com.superevilmegacorp.game,com.meitu.wheecam,com.rrh.jdb">
	//    1    2:areturn         
	}

	public static void b(Context context, String s)
	{
		d(context, "dynamic_key", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <String "dynamic_key">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	public static boolean b(Context context)
	{
		context = ((Context) (fd.c(context, "vkeyid_settings", "log_switch")));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:ldc1            #65  <String "log_switch">
	//    3    5:invokestatic    #28  <Method String fd.c(Context, String, String)>
	//    4    8:astore_0        
		return context != null && "1".equals(((Object) (context)));
	//    5    9:aload_0         
	//    6   10:ifnull          24
	//    7   13:ldc1            #67  <String "1">
	//    8   15:aload_0         
	//    9   16:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   10   19:ifeq            24
	//   11   22:iconst_1        
	//   12   23:ireturn         
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public static long c(Context context)
	{
		context = ((Context) (fd.c(context, "vkeyid_settings", "update_time_interval")));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:ldc1            #76  <String "update_time_interval">
	//    3    5:invokestatic    #28  <Method String fd.c(Context, String, String)>
	//    4    8:astore_0        
		if(!ei.a(((String) (context))))
			break MISSING_BLOCK_LABEL_23;
	//    5    9:aload_0         
	//    6   10:invokestatic    #81  <Method boolean ei.a(String)>
	//    7   13:ifeq            23
		long l = Long.parseLong(((String) (context)));
	//    8   16:aload_0         
	//    9   17:invokestatic    #87  <Method long Long.parseLong(String)>
	//   10   20:lstore_1        
		return l;
	//   11   21:lload_1         
	//   12   22:lreturn         
_L2:
		return 0x5265c00L;
	//   13   23:ldc2w           #88  <Long 0x5265c00L>
	//   14   26:lreturn         
		context;
	//   15   27:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  16   28:goto            23
	}

	public static void c(Context context, String s)
	{
		d(context, "last_machine_boot_time", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #91  <String "last_machine_boot_time">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	public static String d()
	{
		return "a2";
	//    0    0:ldc1            #93  <String "a2">
	//    1    2:areturn         
	}

	public static String d(Context context)
	{
		return fd.c(context, "vkeyid_settings", "apse_degrade");
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:ldc1            #95  <String "apse_degrade">
	//    3    5:invokestatic    #28  <Method String fd.c(Context, String, String)>
	//    4    8:areturn         
	}

	public static void d(Context context, String s)
	{
		d(context, "update_time_interval", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #76  <String "update_time_interval">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	private static void d(Context context, String s, String s1)
	{
		fd.d(context, "vkeyid_settings", s, s1);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:aload_1         
	//    3    4:aload_2         
	//    4    5:invokestatic    #60  <Method void fd.d(Context, String, String, String)>
	//    5    8:return          
	}

	public static String e(Context context)
	{
		return fd.c(context, "vkeyid_settings", "last_apdid_env");
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:ldc1            #98  <String "last_apdid_env">
	//    3    5:invokestatic    #28  <Method String fd.c(Context, String, String)>
	//    4    8:areturn         
	}

	public static void e(Context context, String s)
	{
		d(context, "last_apdid_env", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #98  <String "last_apdid_env">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	public static void e(Context context, boolean flag)
	{
		String s;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			s = "1";
	//    2    4:ldc1            #67  <String "1">
	//    3    6:astore_2        
		else
	//*   4    7:goto            13
			s = "0";
	//    5   10:ldc1            #101 <String "0">
	//    6   12:astore_2        
		d(context, "log_switch", s);
	//    7   13:aload_0         
	//    8   14:ldc1            #65  <String "log_switch">
	//    9   16:aload_2         
	//   10   17:invokestatic    #35  <Method void d(Context, String, String)>
	//   11   20:return          
	}

	public static void f(Context context, String s)
	{
		d(context, "webrtc_url", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #104 <String "webrtc_url">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	public static String h(Context context)
	{
		o/dz;
	//    0    0:ldc1            #2   <Class dz>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s;
		if(!ei.b(b))
			break MISSING_BLOCK_LABEL_88;
	//    2    3:getstatic       #12  <Field String b>
	//    3    6:invokestatic    #107 <Method boolean ei.b(String)>
	//    4    9:ifeq            88
		s = ez.a(context, "alipay_vkey_random", "random", "");
	//    5   12:aload_0         
	//    6   13:ldc1            #109 <String "alipay_vkey_random">
	//    7   15:ldc1            #111 <String "random">
	//    8   17:ldc1            #10  <String "">
	//    9   19:invokestatic    #116 <Method String ez.a(Context, String, String, String)>
	//   10   22:astore_1        
		b = s;
	//   11   23:aload_1         
	//   12   24:putstatic       #12  <Field String b>
		if(!ei.b(s))
			break MISSING_BLOCK_LABEL_88;
	//   13   27:aload_1         
	//   14   28:invokestatic    #107 <Method boolean ei.b(String)>
	//   15   31:ifeq            88
		b = ef.d(UUID.randomUUID().toString());
	//   16   34:invokestatic    #122 <Method UUID UUID.randomUUID()>
	//   17   37:invokevirtual   #123 <Method String UUID.toString()>
	//   18   40:invokestatic    #128 <Method String ef.d(String)>
	//   19   43:putstatic       #12  <Field String b>
		s = b;
	//   20   46:getstatic       #12  <Field String b>
	//   21   49:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_88;
	//   22   50:aload_1         
	//   23   51:ifnull          88
		context = ((Context) (context.getSharedPreferences("alipay_vkey_random", 0).edit()));
	//   24   54:aload_0         
	//   25   55:ldc1            #109 <String "alipay_vkey_random">
	//   26   57:iconst_0        
	//   27   58:invokevirtual   #134 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   28   61:invokeinterface #140 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   29   66:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_88;
	//   30   67:aload_0         
	//   31   68:ifnull          88
		((android.content.SharedPreferences.Editor) (context)).putString("random", s);
	//   32   71:aload_0         
	//   33   72:ldc1            #111 <String "random">
	//   34   74:aload_1         
	//   35   75:invokeinterface #146 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   36   80:pop             
		((android.content.SharedPreferences.Editor) (context)).commit();
	//   37   81:aload_0         
	//   38   82:invokeinterface #150 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   39   87:pop             
		context = ((Context) (b));
	//   40   88:getstatic       #12  <Field String b>
	//   41   91:astore_0        
		o/dz;
	//   42   92:ldc1            #2   <Class dz>
		JVM INSTR monitorexit ;
	//   43   94:monitorexit     
		return ((String) (context));
	//   44   95:aload_0         
	//   45   96:areturn         
		context;
	//   46   97:astore_0        
	//*  47   98:ldc1            #2   <Class dz>
		throw context;
	//   48  100:monitorexit     
	//   49  101:aload_0         
	//   50  102:athrow          
	}

	public static void h(Context context, String s)
	{
		d(context, "apse_degrade", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #95  <String "apse_degrade">
	//    2    3:aload_1         
	//    3    4:invokestatic    #35  <Method void d(Context, String, String)>
	//    4    7:return          
	}

	public static long k(Context context, String s)
	{
		boolean flag;
		long l;
		try
		{
			context = ((Context) (fd.c(context, "vkeyid_settings", (new StringBuilder("vkey_valid")).append(s).toString())));
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "vkeyid_settings">
	//    2    3:new             #38  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:ldc1            #40  <String "vkey_valid">
	//    5    9:invokespecial   #43  <Method void StringBuilder(String)>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:invokevirtual   #51  <Method String StringBuilder.toString()>
	//    9   19:invokestatic    #28  <Method String fd.c(Context, String, String)>
	//   10   22:astore_0        
			flag = ei.b(((String) (context)));
	//   11   23:aload_0         
	//   12   24:invokestatic    #107 <Method boolean ei.b(String)>
	//   13   27:istore_2        
		}
	//*  14   28:iload_2         
	//*  15   29:ifeq            34
	//*  16   32:lconst_0        
	//*  17   33:lreturn         
	//*  18   34:aload_0         
	//*  19   35:invokestatic    #87  <Method long Long.parseLong(String)>
	//*  20   38:lstore_3        
	//*  21   39:lload_3         
	//*  22   40:lreturn         
	//*  23   41:lconst_0        
	//*  24   42:lreturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return 0L;
		}
		if(flag)
			return 0L;
		l = Long.parseLong(((String) (context)));
		return l;
	//*  25   43:astore_0        
	//*  26   44:goto            41
	}

	private static String b = "";

	static 
	{
	//    0    0:ldc1            #10  <String "">
	//    1    2:putstatic       #12  <Field String b>
	//*   2    5:return          
	}
}
