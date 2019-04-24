// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.*;
import android.util.Log;
import android.view.MotionEvent;
import com.amap.api.maps.model.*;
import com.autonavi.ae.gmap.GLMapEngine;
import com.autonavi.amap.mapcore.DPoint;

// Referenced classes of package com.amap.api.mapcore.util:
//			b, gp, hm, fq, 
//			fn, fs, af, aw

class b$1 extends Handler
{

	public void handleMessage(Message message)
	{
		if(message == null || b.a(a))
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
	//*   2    4:aload_0         
	//*   3    5:getfield        #12  <Field b a>
	//*   4    8:invokestatic    #23  <Method boolean b.a(b)>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		message.what;
	//    7   15:aload_1         
	//    8   16:getfield        #29  <Field int Message.what>
		JVM INSTR tableswitch 2 20: default 990
	//	               2 108
	//	               3 974
	//	               4 974
	//	               5 974
	//	               6 974
	//	               7 974
	//	               8 974
	//	               9 974
	//	               10 176
	//	               11 605
	//	               12 305
	//	               13 335
	//	               14 257
	//	               15 368
	//	               16 214
	//	               17 744
	//	               18 944
	//	               19 858
	//	               20 819;
	//    9   19:tableswitch     2 20: default 990
	//	               2 108
	//	               3 974
	//	               4 974
	//	               5 974
	//	               6 974
	//	               7 974
	//	               8 974
	//	               9 974
	//	               10 176
	//	               11 605
	//	               12 305
	//	               13 335
	//	               14 257
	//	               15 368
	//	               16 214
	//	               17 744
	//	               18 944
	//	               19 858
	//	               20 819
		   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3 _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
		break MISSING_BLOCK_LABEL_990;
_L3:
		break; /* Loop/switch isn't completed */
_L2:
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//   10  108:new             #31  <Class StringBuilder>
	//   11  111:dup             
	//   12  112:invokespecial   #34  <Method void StringBuilder()>
	//   13  115:astore          4
		stringbuilder.append("Key\u9A8C\u8BC1\u5931\u8D25\uFF1A[");
	//   14  117:aload           4
	//   15  119:ldc1            #36  <String "Key\u9A8C\u8BC1\u5931\u8D25\uFF1A[">
	//   16  121:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   17  124:pop             
		if(message.obj == null) goto _L16; else goto _L15
	//   18  125:aload_1         
	//   19  126:getfield        #44  <Field Object Message.obj>
	//   20  129:ifnull          145
_L15:
		stringbuilder.append(message.obj);
	//   21  132:aload           4
	//   22  134:aload_1         
	//   23  135:getfield        #44  <Field Object Message.obj>
	//   24  138:invokevirtual   #47  <Method StringBuilder StringBuilder.append(Object)>
	//   25  141:pop             
		  goto _L17
	//*  26  142:goto            154
_L16:
		stringbuilder.append(gp.b);
	//   27  145:aload           4
	//   28  147:getstatic       #53  <Field String gp.b>
	//   29  150:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   30  153:pop             
_L17:
		stringbuilder.append("]");
	//   31  154:aload           4
	//   32  156:ldc1            #55  <String "]">
	//   33  158:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   34  161:pop             
		Log.w("amapsdk", stringbuilder.toString());
	//   35  162:ldc1            #57  <String "amapsdk">
	//   36  164:aload           4
	//   37  166:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   38  169:invokestatic    #67  <Method int Log.w(String, String)>
	//   39  172:pop             
		break; /* Loop/switch isn't completed */
	//   40  173:goto            974
_L4:
		message = ((Message) ((CameraPosition)message.obj));
	//   41  176:aload_1         
	//   42  177:getfield        #44  <Field Object Message.obj>
	//   43  180:checkcast       #69  <Class CameraPosition>
	//   44  183:astore_1        
		boolean flag;
		if(message == null)
			break; /* Loop/switch isn't completed */
	//   45  184:aload_1         
	//   46  185:ifnull          974
		int i;
		Object obj;
		fs fs1;
		try
		{
			if(b.b(a) != null)
	//*  47  188:aload_0         
	//*  48  189:getfield        #12  <Field b a>
	//*  49  192:invokestatic    #72  <Method com.amap.api.maps.AMap$OnCameraChangeListener b.b(b)>
	//*  50  195:ifnull          974
				b.b(a).onCameraChange(((CameraPosition) (message)));
	//   51  198:aload_0         
	//   52  199:getfield        #12  <Field b a>
	//   53  202:invokestatic    #72  <Method com.amap.api.maps.AMap$OnCameraChangeListener b.b(b)>
	//   54  205:aload_1         
	//   55  206:invokeinterface #78  <Method void com.amap.api.maps.AMap$OnCameraChangeListener.onCameraChange(CameraPosition)>
			break; /* Loop/switch isn't completed */
	//   56  211:goto            974
		}
	//*  57  214:aload_0         
	//*  58  215:getfield        #12  <Field b a>
	//*  59  218:invokestatic    #82  <Method com.amap.api.maps.AMap$OnMapLoadedListener b.c(b)>
	//*  60  221:astore_1        
	//*  61  222:aload_1         
	//*  62  223:ifnull          974
	//*  63  226:aload_0         
	//*  64  227:getfield        #12  <Field b a>
	//*  65  230:invokestatic    #82  <Method com.amap.api.maps.AMap$OnMapLoadedListener b.c(b)>
	//*  66  233:invokeinterface #87  <Method void com.amap.api.maps.AMap$OnMapLoadedListener.onMapLoaded()>
	//*  67  238:goto            974
	//*  68  241:astore_1        
	//*  69  242:aload_1         
	//*  70  243:ldc1            #89  <String "AMapDelegateImp">
	//*  71  245:ldc1            #90  <String "onMapLoaded">
	//*  72  247:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
	//*  73  250:aload_1         
	//*  74  251:invokevirtual   #98  <Method void Throwable.printStackTrace()>
	//*  75  254:goto            974
	//*  76  257:aload_0         
	//*  77  258:getfield        #12  <Field b a>
	//*  78  261:invokestatic    #102 <Method com.amap.api.maps.AMap$OnMapTouchListener b.d(b)>
	//*  79  264:ifnull          286
	//*  80  267:aload_0         
	//*  81  268:getfield        #12  <Field b a>
	//*  82  271:invokestatic    #102 <Method com.amap.api.maps.AMap$OnMapTouchListener b.d(b)>
	//*  83  274:aload_1         
	//*  84  275:getfield        #44  <Field Object Message.obj>
	//*  85  278:checkcast       #104 <Class MotionEvent>
	//*  86  281:invokeinterface #110 <Method void com.amap.api.maps.AMap$OnMapTouchListener.onTouch(MotionEvent)>
	//*  87  286:goto            974
	//*  88  289:astore_1        
	//*  89  290:aload_1         
	//*  90  291:ldc1            #89  <String "AMapDelegateImp">
	//*  91  293:ldc1            #112 <String "onTouchHandler">
	//*  92  295:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
	//*  93  298:aload_1         
	//*  94  299:invokevirtual   #98  <Method void Throwable.printStackTrace()>
	//*  95  302:goto            974
	//*  96  305:aload_0         
	//*  97  306:getfield        #12  <Field b a>
	//*  98  309:invokestatic    #116 <Method fq b.e(b)>
	//*  99  312:ifnull          974
	//* 100  315:aload_0         
	//* 101  316:getfield        #12  <Field b a>
	//* 102  319:invokestatic    #116 <Method fq b.e(b)>
	//* 103  322:aload_0         
	//* 104  323:getfield        #12  <Field b a>
	//* 105  326:invokevirtual   #120 <Method float b.g()>
	//* 106  329:invokevirtual   #125 <Method void fq.a(float)>
	//* 107  332:goto            974
	//* 108  335:aload_0         
	//* 109  336:getfield        #12  <Field b a>
	//* 110  339:invokestatic    #116 <Method fq b.e(b)>
	//* 111  342:ifnull          974
	//* 112  345:aload_0         
	//* 113  346:getfield        #12  <Field b a>
	//* 114  349:invokestatic    #116 <Method fq b.e(b)>
	//* 115  352:invokevirtual   #128 <Method fn fq.g()>
	//* 116  355:astore_1        
	//* 117  356:aload_1         
	//* 118  357:ifnonnull       361
	//* 119  360:return          
	//* 120  361:aload_1         
	//* 121  362:invokevirtual   #132 <Method void fn.b()>
	//* 122  365:goto            974
	//* 123  368:aload_1         
	//* 124  369:getfield        #44  <Field Object Message.obj>
	//* 125  372:checkcast       #134 <Class Bitmap>
	//* 126  375:astore          4
	//* 127  377:aload_1         
	//* 128  378:getfield        #137 <Field int Message.arg1>
	//* 129  381:istore_2        
	//* 130  382:aload           4
	//* 131  384:ifnull          524
	//* 132  387:aload_0         
	//* 133  388:getfield        #12  <Field b a>
	//* 134  391:invokestatic    #116 <Method fq b.e(b)>
	//* 135  394:ifnull          524
	//* 136  397:new             #139 <Class Canvas>
	//* 137  400:dup             
	//* 138  401:aload           4
	//* 139  403:invokespecial   #142 <Method void Canvas(Bitmap)>
	//* 140  406:astore_1        
	//* 141  407:aload_0         
	//* 142  408:getfield        #12  <Field b a>
	//* 143  411:invokestatic    #116 <Method fq b.e(b)>
	//* 144  414:invokevirtual   #146 <Method fs fq.h()>
	//* 145  417:astore          5
	//* 146  419:aload           5
	//* 147  421:ifnull          430
	//* 148  424:aload           5
	//* 149  426:aload_1         
	//* 150  427:invokevirtual   #152 <Method void fs.onDraw(Canvas)>
	//* 151  430:aload_0         
	//* 152  431:getfield        #12  <Field b a>
	//* 153  434:invokestatic    #116 <Method fq b.e(b)>
	//* 154  437:aload_1         
	//* 155  438:invokevirtual   #154 <Method void fq.a(Canvas)>
	//* 156  441:aload_0         
	//* 157  442:getfield        #12  <Field b a>
	//* 158  445:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
	//* 159  448:ifnull          482
	//* 160  451:aload_0         
	//* 161  452:getfield        #12  <Field b a>
	//* 162  455:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
	//* 163  458:new             #160 <Class BitmapDrawable>
	//* 164  461:dup             
	//* 165  462:aload_0         
	//* 166  463:getfield        #12  <Field b a>
	//* 167  466:getfield        #163 <Field Context b.e>
	//* 168  469:invokevirtual   #169 <Method android.content.res.Resources Context.getResources()>
	//* 169  472:aload           4
	//* 170  474:invokespecial   #172 <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//* 171  477:invokeinterface #178 <Method void com.amap.api.maps.AMap$onMapPrintScreenListener.onMapPrint(android.graphics.drawable.Drawable)>
	//* 172  482:aload_0         
	//* 173  483:getfield        #12  <Field b a>
	//* 174  486:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
	//* 175  489:ifnull          991
	//* 176  492:aload_0         
	//* 177  493:getfield        #12  <Field b a>
	//* 178  496:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
	//* 179  499:aload           4
	//* 180  501:invokeinterface #186 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap)>
	//* 181  506:aload_0         
	//* 182  507:getfield        #12  <Field b a>
	//* 183  510:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
	//* 184  513:aload           4
	//* 185  515:iload_2         
	//* 186  516:invokeinterface #189 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap, int)>
	//* 187  521:goto            991
	//* 188  524:aload_0         
	//* 189  525:getfield        #12  <Field b a>
	//* 190  528:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
	//* 191  531:ifnull          547
	//* 192  534:aload_0         
	//* 193  535:getfield        #12  <Field b a>
	//* 194  538:invokestatic    #158 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.f(b)>
	//* 195  541:aconst_null     
	//* 196  542:invokeinterface #178 <Method void com.amap.api.maps.AMap$onMapPrintScreenListener.onMapPrint(android.graphics.drawable.Drawable)>
	//* 197  547:aload_0         
	//* 198  548:getfield        #12  <Field b a>
	//* 199  551:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
	//* 200  554:ifnull          584
	//* 201  557:aload_0         
	//* 202  558:getfield        #12  <Field b a>
	//* 203  561:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
	//* 204  564:aconst_null     
	//* 205  565:invokeinterface #186 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap)>
	//* 206  570:aload_0         
	//* 207  571:getfield        #12  <Field b a>
	//* 208  574:invokestatic    #181 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.g(b)>
	//* 209  577:aconst_null     
	//* 210  578:iload_2         
	//* 211  579:invokeinterface #189 <Method void com.amap.api.maps.AMap$OnMapScreenShotListener.onMapScreenShot(Bitmap, int)>
	//* 212  584:aload_0         
	//* 213  585:getfield        #12  <Field b a>
	//* 214  588:aconst_null     
	//* 215  589:invokestatic    #192 <Method com.amap.api.maps.AMap$onMapPrintScreenListener b.a(b, com.amap.api.maps.AMap$onMapPrintScreenListener)>
	//* 216  592:pop             
	//* 217  593:aload_0         
	//* 218  594:getfield        #12  <Field b a>
	//* 219  597:aconst_null     
	//* 220  598:invokestatic    #195 <Method com.amap.api.maps.AMap$OnMapScreenShotListener b.a(b, com.amap.api.maps.AMap$OnMapScreenShotListener)>
	//* 221  601:pop             
	//* 222  602:goto            974
	//* 223  605:aload_0         
	//* 224  606:getfield        #12  <Field b a>
	//* 225  609:invokevirtual   #199 <Method CameraPosition b.getCameraPosition()>
	//* 226  612:astore_1        
	//* 227  613:aload_1         
	//* 228  614:ifnull          638
	//* 229  617:aload_0         
	//* 230  618:getfield        #12  <Field b a>
	//* 231  621:invokestatic    #116 <Method fq b.e(b)>
	//* 232  624:ifnull          638
	//* 233  627:aload_0         
	//* 234  628:getfield        #12  <Field b a>
	//* 235  631:invokestatic    #116 <Method fq b.e(b)>
	//* 236  634:aload_1         
	//* 237  635:invokevirtual   #201 <Method void fq.a(CameraPosition)>
	//* 238  638:aload_0         
	//* 239  639:getfield        #12  <Field b a>
	//* 240  642:aload_1         
	//* 241  643:invokestatic    #204 <Method void b.a(b, CameraPosition)>
	//* 242  646:aload_0         
	//* 243  647:getfield        #12  <Field b a>
	//* 244  650:invokestatic    #206 <Method boolean b.h(b)>
	//* 245  653:ifeq            694
	//* 246  656:aload_0         
	//* 247  657:getfield        #12  <Field b a>
	//* 248  660:iconst_0        
	//* 249  661:invokestatic    #209 <Method boolean b.a(b, boolean)>
	//* 250  664:pop             
	//* 251  665:aload_0         
	//* 252  666:getfield        #12  <Field b a>
	//* 253  669:invokestatic    #213 <Method af b.i(b)>
	//* 254  672:ifnull          686
	//* 255  675:aload_0         
	//* 256  676:getfield        #12  <Field b a>
	//* 257  679:invokestatic    #213 <Method af b.i(b)>
	//* 258  682:iconst_0        
	//* 259  683:invokevirtual   #218 <Method void af.b(boolean)>
	//* 260  686:aload_0         
	//* 261  687:getfield        #12  <Field b a>
	//* 262  690:iconst_1        
	//* 263  691:invokevirtual   #220 <Method void b.g(boolean)>
	//* 264  694:aload_0         
	//* 265  695:getfield        #12  <Field b a>
	//* 266  698:invokestatic    #223 <Method boolean b.j(b)>
	//* 267  701:ifeq            720
	//* 268  704:aload_0         
	//* 269  705:getfield        #12  <Field b a>
	//* 270  708:invokevirtual   #225 <Method void b.j()>
	//* 271  711:aload_0         
	//* 272  712:getfield        #12  <Field b a>
	//* 273  715:iconst_0        
	//* 274  716:invokestatic    #227 <Method boolean b.b(b, boolean)>
	//* 275  719:pop             
	//* 276  720:aload_0         
	//* 277  721:getfield        #12  <Field b a>
	//* 278  724:iconst_1        
	//* 279  725:aload_1         
	//* 280  726:invokevirtual   #230 <Method void b.a(boolean, CameraPosition)>
	//* 281  729:goto            974
	//* 282  732:astore_1        
	//* 283  733:aload_1         
	//* 284  734:ldc1            #89  <String "AMapDelegateImp">
	//* 285  736:ldc1            #232 <String "CameraUpdateFinish">
	//* 286  738:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
	//* 287  741:goto            974
	//* 288  744:aload_0         
	//* 289  745:getfield        #12  <Field b a>
	//* 290  748:getfield        #235 <Field GLMapEngine b.f>
	//* 291  751:iconst_1        
	//* 292  752:invokevirtual   #241 <Method boolean GLMapEngine.isInMapAnimation(int)>
	//* 293  755:ifeq            779
	//* 294  758:aload_0         
	//* 295  759:getfield        #12  <Field b a>
	//* 296  762:invokestatic    #213 <Method af b.i(b)>
	//* 297  765:ifnull          779
	//* 298  768:aload_0         
	//* 299  769:getfield        #12  <Field b a>
	//* 300  772:invokestatic    #213 <Method af b.i(b)>
	//* 301  775:iconst_0        
	//* 302  776:invokevirtual   #218 <Method void af.b(boolean)>
	//* 303  779:aload_0         
	//* 304  780:getfield        #12  <Field b a>
	//* 305  783:invokestatic    #213 <Method af b.i(b)>
	//* 306  786:ifnull          974
	//* 307  789:aload_0         
	//* 308  790:getfield        #12  <Field b a>
	//* 309  793:invokestatic    #213 <Method af b.i(b)>
	//* 310  796:astore          4
	//* 311  798:aload_1         
	//* 312  799:getfield        #137 <Field int Message.arg1>
	//* 313  802:ifeq            994
	//* 314  805:iconst_1        
	//* 315  806:istore_3        
	//* 316  807:goto            810
	//* 317  810:aload           4
	//* 318  812:iload_3         
	//* 319  813:invokevirtual   #243 <Method void af.a(boolean)>
	//* 320  816:goto            974
	//* 321  819:aload_0         
	//* 322  820:getfield        #12  <Field b a>
	//* 323  823:invokestatic    #247 <Method com.amap.api.maps.AMap$OnPOIClickListener b.k(b)>
	//* 324  826:aload_1         
	//* 325  827:getfield        #44  <Field Object Message.obj>
	//* 326  830:checkcast       #249 <Class Poi>
	//* 327  833:invokeinterface #255 <Method void com.amap.api.maps.AMap$OnPOIClickListener.onPOIClick(Poi)>
	//* 328  838:goto            974
	//* 329  841:astore_1        
	//* 330  842:aload_1         
	//* 331  843:ldc1            #89  <String "AMapDelegateImp">
	//* 332  845:ldc2            #257 <String "OnPOIClickListener.onPOIClick">
	//* 333  848:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
	//* 334  851:aload_1         
	//* 335  852:invokevirtual   #98  <Method void Throwable.printStackTrace()>
	//* 336  855:goto            974
	//* 337  858:aload_0         
	//* 338  859:getfield        #12  <Field b a>
	//* 339  862:invokestatic    #261 <Method com.amap.api.maps.AMap$OnMapClickListener b.l(b)>
	//* 340  865:ifnull          974
	//* 341  868:invokestatic    #267 <Method DPoint DPoint.obtain()>
	//* 342  871:astore          4
	//* 343  873:aload_0         
	//* 344  874:getfield        #12  <Field b a>
	//* 345  877:aload_1         
	//* 346  878:getfield        #137 <Field int Message.arg1>
	//* 347  881:aload_1         
	//* 348  882:getfield        #270 <Field int Message.arg2>
	//* 349  885:aload           4
	//* 350  887:invokevirtual   #273 <Method void b.b(int, int, DPoint)>
	//* 351  890:aload_0         
	//* 352  891:getfield        #12  <Field b a>
	//* 353  894:invokestatic    #261 <Method com.amap.api.maps.AMap$OnMapClickListener b.l(b)>
	//* 354  897:new             #275 <Class LatLng>
	//* 355  900:dup             
	//* 356  901:aload           4
	//* 357  903:getfield        #279 <Field double DPoint.y>
	//* 358  906:aload           4
	//* 359  908:getfield        #282 <Field double DPoint.x>
	//* 360  911:invokespecial   #285 <Method void LatLng(double, double)>
	//* 361  914:invokeinterface #291 <Method void com.amap.api.maps.AMap$OnMapClickListener.onMapClick(LatLng)>
	//* 362  919:aload           4
	//* 363  921:invokevirtual   #294 <Method void DPoint.recycle()>
	//* 364  924:goto            999
	//* 365  927:astore_1        
	//* 366  928:aload_1         
	//* 367  929:ldc1            #89  <String "AMapDelegateImp">
	//* 368  931:ldc2            #296 <String "OnMapClickListener.onMapClick">
	//* 369  934:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
	//* 370  937:aload_1         
	//* 371  938:invokevirtual   #98  <Method void Throwable.printStackTrace()>
	//* 372  941:goto            999
	//* 373  944:aload_0         
	//* 374  945:getfield        #12  <Field b a>
	//* 375  948:invokestatic    #300 <Method aw b.m(b)>
	//* 376  951:ifnull          974
	//* 377  954:aload_0         
	//* 378  955:getfield        #12  <Field b a>
	//* 379  958:invokestatic    #303 <Method boolean b.n(b)>
	//* 380  961:ifeq            974
	//* 381  964:aload_0         
	//* 382  965:getfield        #12  <Field b a>
	//* 383  968:invokestatic    #300 <Method aw b.m(b)>
	//* 384  971:invokevirtual   #307 <Method void aw.c()>
	//* 385  974:return          
		// Misplaced declaration of an exception variable
		catch(Message message)
	//* 386  975:astore_1        
		{
			hm.c(((Throwable) (message)), "AMapDelegateImp", "handleMessage");
	//  387  976:aload_1         
	//  388  977:ldc1            #89  <String "AMapDelegateImp">
	//  389  979:ldc2            #308 <String "handleMessage">
	//  390  982:invokestatic    #95  <Method void hm.c(Throwable, String, String)>
		}
		break MISSING_BLOCK_LABEL_985;
_L10:
		message = ((Message) (b.c(a)));
		if(message == null)
			break; /* Loop/switch isn't completed */
		try
		{
			b.c(a).onMapLoaded();
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(Message message) { }
		hm.c(((Throwable) (message)), "AMapDelegateImp", "onMapLoaded");
		((Throwable) (message)).printStackTrace();
		break; /* Loop/switch isn't completed */
_L8:
		try
		{
			if(b.d(a) != null)
				b.d(a).onTouch((MotionEvent)message.obj);
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(Message message) { }
		hm.c(((Throwable) (message)), "AMapDelegateImp", "onTouchHandler");
		((Throwable) (message)).printStackTrace();
		break; /* Loop/switch isn't completed */
_L6:
		if(b.e(a) != null)
			b.e(a).a(a.g());
		break; /* Loop/switch isn't completed */
_L7:
		if(b.e(a) == null)
			break; /* Loop/switch isn't completed */
		message = ((Message) (b.e(a).g()));
		if(message == null)
			return;
		((fn) (message)).b();
		break; /* Loop/switch isn't completed */
_L9:
		obj = ((Object) ((Bitmap)message.obj));
		i = message.arg1;
		if(obj == null) goto _L19; else goto _L18
_L18:
		if(b.e(a) == null) goto _L19; else goto _L20
_L20:
		message = ((Message) (new Canvas(((Bitmap) (obj)))));
		fs1 = b.e(a).h();
		if(fs1 == null) goto _L22; else goto _L21
_L21:
		fs1.onDraw(((Canvas) (message)));
_L22:
		b.e(a).a(((Canvas) (message)));
		if(b.f(a) != null)
			b.f(a).onMapPrint(((android.graphics.drawable.Drawable) (new BitmapDrawable(a.e.getResources(), ((Bitmap) (obj))))));
		if(b.g(a) != null)
		{
			b.g(a).onMapScreenShot(((Bitmap) (obj)));
			b.g(a).onMapScreenShot(((Bitmap) (obj)), i);
		}
		  goto _L23
_L19:
		if(b.f(a) != null)
			b.f(a).onMapPrint(((android.graphics.drawable.Drawable) (null)));
		if(b.g(a) != null)
		{
			b.g(a).onMapScreenShot(((Bitmap) (null)));
			b.g(a).onMapScreenShot(((Bitmap) (null)), i);
		}
_L23:
		b.a(a, ((com.amap.api.maps..onMapPrintScreenListener) (null)));
		b.a(a, ((com.amap.api.maps..OnMapScreenShotListener) (null)));
		break; /* Loop/switch isn't completed */
_L5:
		message = ((Message) (a.getCameraPosition()));
		if(message == null) goto _L25; else goto _L24
_L24:
		if(b.e(a) != null)
			b.e(a).a(((CameraPosition) (message)));
_L25:
		b.a(a, ((CameraPosition) (message)));
		if(b.h(a))
		{
			b.a(a, false);
			if(b.i(a) != null)
				b.i(a).b(false);
			a.g(true);
		}
		if(b.j(a))
		{
			a.j();
			b.b(a, false);
		}
		a.a(true, ((CameraPosition) (message)));
		break; /* Loop/switch isn't completed */
		message;
		hm.c(((Throwable) (message)), "AMapDelegateImp", "CameraUpdateFinish");
		break; /* Loop/switch isn't completed */
_L11:
		if(a.f.isInMapAnimation(1) && b.i(a) != null)
			b.i(a).b(false);
		if(b.i(a) == null)
			break; /* Loop/switch isn't completed */
		obj = ((Object) (b.i(a)));
		if(message.arg1 != 0)
			flag = true;
		else
	//* 391  985:aload_1         
	//* 392  986:invokevirtual   #98  <Method void Throwable.printStackTrace()>
	//* 393  989:return          
	//* 394  990:return          
	//* 395  991:goto            584
			flag = false;
	//  396  994:iconst_0        
	//  397  995:istore_3        
		((af) (obj)).a(flag);
		break; /* Loop/switch isn't completed */
_L14:
		try
		{
			b.k(a).onPOIClick((Poi)message.obj);
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(Message message) { }
		hm.c(((Throwable) (message)), "AMapDelegateImp", "OnPOIClickListener.onPOIClick");
		((Throwable) (message)).printStackTrace();
		break; /* Loop/switch isn't completed */
_L13:
		if(b.l(a) == null)
			break; /* Loop/switch isn't completed */
		obj = ((Object) (DPoint.obtain()));
		a.b(message.arg1, message.arg2, ((DPoint) (obj)));
		try
		{
			b.l(a).onMapClick(new LatLng(((DPoint) (obj)).y, ((DPoint) (obj)).x));
			((DPoint) (obj)).recycle();
			break MISSING_BLOCK_LABEL_999;
		}
		// Misplaced declaration of an exception variable
		catch(Message message) { }
		hm.c(((Throwable) (message)), "AMapDelegateImp", "OnMapClickListener.onMapClick");
		((Throwable) (message)).printStackTrace();
		break MISSING_BLOCK_LABEL_999;
_L12:
		if(b.m(a) != null && b.n(a))
			b.m(a).c();
		return;
		((Throwable) (message)).printStackTrace();
		return;
		return;
	//* 398  996:goto            810
	//  399  999:return          
	}

	final b a;

	b$1(b b1, Looper looper)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field b a>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #15  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
