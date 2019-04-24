// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.support.v7.*;
import com.startapp.android.publish.ads.nativead.NativeAdDetails;
import com.startapp.android.publish.ads.nativead.StartAppNativeAd;
import com.startapp.android.publish.adsCommon.Ad;
import com.startapp.android.publish.adsCommon.adListeners.AdEventListener;
import java.util.*;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$7
	implements AdEventListener
{

	public void onFailedToReceiveAd(Ad ad)
	{
		ci.a("MainActivity : ", "StartAppNativeAd : onFailedToReceiveAd ");
	//    0    0:ldc1            #22  <String "MainActivity : ">
	//    1    2:ldc1            #24  <String "StartAppNativeAd : onFailedToReceiveAd ">
	//    2    4:invokestatic    #29  <Method void ci.a(String, String)>
	//    3    7:return          
	}

	public void onReceiveAd(Ad ad)
	{
		ci.a("MainActivity : ", "StartAppNativeAd : onReceiveAd ");
	//    0    0:ldc1            #22  <String "MainActivity : ">
	//    1    2:ldc1            #32  <String "StartAppNativeAd : onReceiveAd ">
	//    2    4:invokestatic    #29  <Method void ci.a(String, String)>
		a.e = a.j.getNativeAds();
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field MainActivity a>
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field MainActivity a>
	//    7   15:getfield        #36  <Field StartAppNativeAd MainActivity.j>
	//    8   18:invokevirtual   #42  <Method ArrayList StartAppNativeAd.getNativeAds()>
	//    9   21:putfield        #46  <Field ArrayList MainActivity.e>
		if(a.e != null && MainActivity.h(a) != null) goto _L2; else goto _L1
	//   10   24:aload_0         
	//   11   25:getfield        #14  <Field MainActivity a>
	//   12   28:getfield        #46  <Field ArrayList MainActivity.e>
	//   13   31:ifnull          44
	//   14   34:aload_0         
	//   15   35:getfield        #14  <Field MainActivity a>
	//   16   38:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//   17   41:ifnonnull       45
_L1:
		return;
	//   18   44:return          
_L2:
		ad = ((Ad) ((ArrayList)MainActivity.h(a).get(((Object) (Integer.valueOf(1))))));
	//   19   45:aload_0         
	//   20   46:getfield        #14  <Field MainActivity a>
	//   21   49:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//   22   52:iconst_1        
	//   23   53:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//   24   56:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   25   59:checkcast       #64  <Class ArrayList>
	//   26   62:astore_1        
		ArrayList arraylist = (ArrayList)MainActivity.h(a).get(((Object) (Integer.valueOf(2))));
	//   27   63:aload_0         
	//   28   64:getfield        #14  <Field MainActivity a>
	//   29   67:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//   30   70:iconst_2        
	//   31   71:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//   32   74:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   33   77:checkcast       #64  <Class ArrayList>
	//   34   80:astore          4
		ArrayList arraylist1 = (ArrayList)MainActivity.h(a).get(((Object) (Integer.valueOf(3))));
	//   35   82:aload_0         
	//   36   83:getfield        #14  <Field MainActivity a>
	//   37   86:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//   38   89:iconst_3        
	//   39   90:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//   40   93:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//   41   96:checkcast       #64  <Class ArrayList>
	//   42   99:astore          5
		int i = a.e.size();
	//   43  101:aload_0         
	//   44  102:getfield        #14  <Field MainActivity a>
	//   45  105:getfield        #46  <Field ArrayList MainActivity.e>
	//   46  108:invokevirtual   #68  <Method int ArrayList.size()>
	//   47  111:istore_2        
		if(i > 2)
	//*  48  112:iload_2         
	//*  49  113:iconst_2        
	//*  50  114:icmple          434
			i = 1;
	//   51  117:iconst_1        
	//   52  118:istore_2        
		int j = 0;
	//   53  119:iconst_0        
	//   54  120:istore_3        
label0:
		do
		{
label1:
			{
				if(j >= i)
					break label1;
	//   55  121:iload_3         
	//   56  122:iload_2         
	//   57  123:icmpge          313
				NativeAdDetails nativeaddetails = (NativeAdDetails)a.e.get(j);
	//   58  126:aload_0         
	//   59  127:getfield        #14  <Field MainActivity a>
	//   60  130:getfield        #46  <Field ArrayList MainActivity.e>
	//   61  133:iload_3         
	//   62  134:invokevirtual   #71  <Method Object ArrayList.get(int)>
	//   63  137:checkcast       #73  <Class NativeAdDetails>
	//   64  140:astore          6
				nativeaddetails.sendImpression(((android.content.Context) (a)));
	//   65  142:aload           6
	//   66  144:aload_0         
	//   67  145:getfield        #14  <Field MainActivity a>
	//   68  148:invokevirtual   #77  <Method void NativeAdDetails.sendImpression(android.content.Context)>
				if(ad == null)
					break label0;
	//   69  151:aload_1         
	//   70  152:ifnull          44
				((ArrayList) (ad)).add(j, ((Object) (new ck(nativeaddetails.getTitle(), nativeaddetails.getPackacgeName(), nativeaddetails.getDescription(), nativeaddetails.getImageBitmap(), true))));
	//   71  155:aload_1         
	//   72  156:iload_3         
	//   73  157:new             #79  <Class ck>
	//   74  160:dup             
	//   75  161:aload           6
	//   76  163:invokevirtual   #83  <Method String NativeAdDetails.getTitle()>
	//   77  166:aload           6
	//   78  168:invokevirtual   #86  <Method String NativeAdDetails.getPackacgeName()>
	//   79  171:aload           6
	//   80  173:invokevirtual   #89  <Method String NativeAdDetails.getDescription()>
	//   81  176:aload           6
	//   82  178:invokevirtual   #93  <Method android.graphics.Bitmap NativeAdDetails.getImageBitmap()>
	//   83  181:iconst_1        
	//   84  182:invokespecial   #96  <Method void ck(String, String, String, android.graphics.Bitmap, boolean)>
	//   85  185:invokevirtual   #100 <Method void ArrayList.add(int, Object)>
				arraylist.add(j, ((Object) (new ck(nativeaddetails.getTitle(), nativeaddetails.getPackacgeName(), nativeaddetails.getDescription(), nativeaddetails.getImageBitmap(), true))));
	//   86  188:aload           4
	//   87  190:iload_3         
	//   88  191:new             #79  <Class ck>
	//   89  194:dup             
	//   90  195:aload           6
	//   91  197:invokevirtual   #83  <Method String NativeAdDetails.getTitle()>
	//   92  200:aload           6
	//   93  202:invokevirtual   #86  <Method String NativeAdDetails.getPackacgeName()>
	//   94  205:aload           6
	//   95  207:invokevirtual   #89  <Method String NativeAdDetails.getDescription()>
	//   96  210:aload           6
	//   97  212:invokevirtual   #93  <Method android.graphics.Bitmap NativeAdDetails.getImageBitmap()>
	//   98  215:iconst_1        
	//   99  216:invokespecial   #96  <Method void ck(String, String, String, android.graphics.Bitmap, boolean)>
	//  100  219:invokevirtual   #100 <Method void ArrayList.add(int, Object)>
				arraylist1.add(j, ((Object) (new ck(nativeaddetails.getTitle(), nativeaddetails.getPackacgeName(), nativeaddetails.getDescription(), nativeaddetails.getImageBitmap(), true))));
	//  101  222:aload           5
	//  102  224:iload_3         
	//  103  225:new             #79  <Class ck>
	//  104  228:dup             
	//  105  229:aload           6
	//  106  231:invokevirtual   #83  <Method String NativeAdDetails.getTitle()>
	//  107  234:aload           6
	//  108  236:invokevirtual   #86  <Method String NativeAdDetails.getPackacgeName()>
	//  109  239:aload           6
	//  110  241:invokevirtual   #89  <Method String NativeAdDetails.getDescription()>
	//  111  244:aload           6
	//  112  246:invokevirtual   #93  <Method android.graphics.Bitmap NativeAdDetails.getImageBitmap()>
	//  113  249:iconst_1        
	//  114  250:invokespecial   #96  <Method void ck(String, String, String, android.graphics.Bitmap, boolean)>
	//  115  253:invokevirtual   #100 <Method void ArrayList.add(int, Object)>
				MainActivity.h(a).put(((Object) (Integer.valueOf(1))), ((Object) (ad)));
	//  116  256:aload_0         
	//  117  257:getfield        #14  <Field MainActivity a>
	//  118  260:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//  119  263:iconst_1        
	//  120  264:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//  121  267:aload_1         
	//  122  268:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
	//  123  271:pop             
				MainActivity.h(a).put(((Object) (Integer.valueOf(2))), ((Object) (arraylist)));
	//  124  272:aload_0         
	//  125  273:getfield        #14  <Field MainActivity a>
	//  126  276:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//  127  279:iconst_2        
	//  128  280:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//  129  283:aload           4
	//  130  285:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
	//  131  288:pop             
				MainActivity.h(a).put(((Object) (Integer.valueOf(3))), ((Object) (arraylist1)));
	//  132  289:aload_0         
	//  133  290:getfield        #14  <Field MainActivity a>
	//  134  293:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//  135  296:iconst_3        
	//  136  297:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//  137  300:aload           5
	//  138  302:invokevirtual   #104 <Method Object HashMap.put(Object, Object)>
	//  139  305:pop             
				j++;
	//  140  306:iload_3         
	//  141  307:iconst_1        
	//  142  308:iadd            
	//  143  309:istore_3        
			}
		} while(true);
	//  144  310:goto            121
		if(true) goto _L1; else goto _L3
_L3:
		if(MainActivity.i(a).b(cj.e, true))
	//* 145  313:aload_0         
	//* 146  314:getfield        #14  <Field MainActivity a>
	//* 147  317:invokestatic    #108 <Method cj MainActivity.i(MainActivity)>
	//* 148  320:getstatic       #113 <Field String cj.e>
	//* 149  323:iconst_1        
	//* 150  324:invokevirtual   #117 <Method boolean cj.b(String, boolean)>
	//* 151  327:ifeq            368
			MainActivity.a(a).a((List)MainActivity.h(a).get(((Object) (Integer.valueOf(1)))));
	//  152  330:aload_0         
	//  153  331:getfield        #14  <Field MainActivity a>
	//  154  334:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
	//  155  337:aload_0         
	//  156  338:getfield        #14  <Field MainActivity a>
	//  157  341:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//  158  344:iconst_1        
	//  159  345:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//  160  348:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//  161  351:checkcast       #122 <Class List>
	//  162  354:invokevirtual   #127 <Method void bv.a(List)>
		else
	//* 163  357:aload_0         
	//* 164  358:getfield        #14  <Field MainActivity a>
	//* 165  361:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
	//* 166  364:invokevirtual   #130 <Method void bv.notifyDataSetChanged()>
	//* 167  367:return          
		if(MainActivity.d)
	//* 168  368:getstatic       #134 <Field boolean MainActivity.d>
	//* 169  371:ifeq            404
			MainActivity.a(a).a((List)MainActivity.h(a).get(((Object) (Integer.valueOf(2)))));
	//  170  374:aload_0         
	//  171  375:getfield        #14  <Field MainActivity a>
	//  172  378:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
	//  173  381:aload_0         
	//  174  382:getfield        #14  <Field MainActivity a>
	//  175  385:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//  176  388:iconst_2        
	//  177  389:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//  178  392:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//  179  395:checkcast       #122 <Class List>
	//  180  398:invokevirtual   #127 <Method void bv.a(List)>
		else
	//* 181  401:goto            357
			MainActivity.a(a).a((List)MainActivity.h(a).get(((Object) (Integer.valueOf(3)))));
	//  182  404:aload_0         
	//  183  405:getfield        #14  <Field MainActivity a>
	//  184  408:invokestatic    #120 <Method bv MainActivity.a(MainActivity)>
	//  185  411:aload_0         
	//  186  412:getfield        #14  <Field MainActivity a>
	//  187  415:invokestatic    #50  <Method HashMap MainActivity.h(MainActivity)>
	//  188  418:iconst_3        
	//  189  419:invokestatic    #56  <Method Integer Integer.valueOf(int)>
	//  190  422:invokevirtual   #62  <Method Object HashMap.get(Object)>
	//  191  425:checkcast       #122 <Class List>
	//  192  428:invokevirtual   #127 <Method void bv.a(List)>
		MainActivity.a(a).notifyDataSetChanged();
		return;
	//* 193  431:goto            357
	//* 194  434:goto            119
	}

	final MainActivity a;

	MainActivity$7(MainActivity mainactivity)
	{
		a = mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MainActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
