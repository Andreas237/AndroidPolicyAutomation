// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			add, agd, wx, wi

public final class aem
	implements ag
{

	public aem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void zza(Object obj, Map map)
	{
		add add1;
		add1 = (add)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class add>
	//    2    4:astore          10
		agd agd1 = add1.b();
	//    3    6:aload           10
	//    4    8:invokeinterface #24  <Method agd add.b()>
	//    5   13:astore          9
		obj = ((Object) (agd1));
	//    6   15:aload           9
	//    7   17:astore_1        
		if(agd1 != null)
			break MISSING_BLOCK_LABEL_81;
	//    8   18:aload           9
	//    9   20:ifnonnull       81
		obj = ((Object) (new agd(add1, Float.parseFloat((String)map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")))));
	//   10   23:new             #26  <Class agd>
	//   11   26:dup             
	//   12   27:aload           10
	//   13   29:aload_2         
	//   14   30:ldc1            #28  <String "duration">
	//   15   32:invokeinterface #34  <Method Object Map.get(Object)>
	//   16   37:checkcast       #36  <Class String>
	//   17   40:invokestatic    #42  <Method float Float.parseFloat(String)>
	//   18   43:ldc1            #44  <String "1">
	//   19   45:aload_2         
	//   20   46:ldc1            #46  <String "customControlsAllowed">
	//   21   48:invokeinterface #34  <Method Object Map.get(Object)>
	//   22   53:invokevirtual   #50  <Method boolean String.equals(Object)>
	//   23   56:ldc1            #44  <String "1">
	//   24   58:aload_2         
	//   25   59:ldc1            #52  <String "clickToExpandAllowed">
	//   26   61:invokeinterface #34  <Method Object Map.get(Object)>
	//   27   66:invokevirtual   #50  <Method boolean String.equals(Object)>
	//   28   69:invokespecial   #55  <Method void agd(add, float, boolean, boolean)>
	//   29   72:astore_1        
		add1.a(((agd) (obj)));
	//   30   73:aload           10
	//   31   75:aload_1         
	//   32   76:invokeinterface #59  <Method void add.a(agd)>
		float f1;
		float f2;
		int j;
		boolean flag;
		f1 = Float.parseFloat((String)map.get("duration"));
	//   33   81:aload_2         
	//   34   82:ldc1            #28  <String "duration">
	//   35   84:invokeinterface #34  <Method Object Map.get(Object)>
	//   36   89:checkcast       #36  <Class String>
	//   37   92:invokestatic    #42  <Method float Float.parseFloat(String)>
	//   38   95:fstore          4
		flag = "1".equals(map.get("muted"));
	//   39   97:ldc1            #44  <String "1">
	//   40   99:aload_2         
	//   41  100:ldc1            #61  <String "muted">
	//   42  102:invokeinterface #34  <Method Object Map.get(Object)>
	//   43  107:invokevirtual   #50  <Method boolean String.equals(Object)>
	//   44  110:istore          8
		f2 = Float.parseFloat((String)map.get("currentTime"));
	//   45  112:aload_2         
	//   46  113:ldc1            #63  <String "currentTime">
	//   47  115:invokeinterface #34  <Method Object Map.get(Object)>
	//   48  120:checkcast       #36  <Class String>
	//   49  123:invokestatic    #42  <Method float Float.parseFloat(String)>
	//   50  126:fstore          5
		j = Integer.parseInt((String)map.get("playbackState"));
	//   51  128:aload_2         
	//   52  129:ldc1            #65  <String "playbackState">
	//   53  131:invokeinterface #34  <Method Object Map.get(Object)>
	//   54  136:checkcast       #36  <Class String>
	//   55  139:invokestatic    #71  <Method int Integer.parseInt(String)>
	//   56  142:istore          7
		if(j < 0) goto _L2; else goto _L1
	//   57  144:iload           7
	//   58  146:iflt            340
_L1:
		int i = j;
	//   59  149:iload           7
	//   60  151:istore          6
		if(3 >= j) goto _L3; else goto _L2
	//   61  153:iconst_3        
	//   62  154:iload           7
	//   63  156:icmpge          162
	//*  64  159:goto            340
_L3:
		map = ((Map) ((String)map.get("aspectRatio")));
	//   65  162:aload_2         
	//   66  163:ldc1            #73  <String "aspectRatio">
	//   67  165:invokeinterface #34  <Method Object Map.get(Object)>
	//   68  170:checkcast       #36  <Class String>
	//   69  173:astore_2        
		float f;
		if(TextUtils.isEmpty(((CharSequence) (map))))
	//*  70  174:aload_2         
	//*  71  175:invokestatic    #79  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  72  178:ifeq            186
		{
			f = 0.0F;
	//   73  181:fconst_0        
	//   74  182:fstore_3        
			break MISSING_BLOCK_LABEL_191;
	//   75  183:goto            191
		}
		f = Float.parseFloat(((String) (map)));
	//   76  186:aload_2         
	//   77  187:invokestatic    #42  <Method float Float.parseFloat(String)>
	//   78  190:fstore_3        
		if(wx.a(3))
	//*  79  191:iconst_3        
	//*  80  192:invokestatic    #84  <Method boolean wx.a(int)>
	//*  81  195:ifeq            305
		{
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (map))).length() + 140);
	//   82  198:new             #86  <Class StringBuilder>
	//   83  201:dup             
	//   84  202:aload_2         
	//   85  203:invokestatic    #90  <Method String String.valueOf(Object)>
	//   86  206:invokevirtual   #94  <Method int String.length()>
	//   87  209:sipush          140
	//   88  212:iadd            
	//   89  213:invokespecial   #97  <Method void StringBuilder(int)>
	//   90  216:astore          9
			stringbuilder.append("Video Meta GMSG: currentTime : ");
	//   91  218:aload           9
	//   92  220:ldc1            #99  <String "Video Meta GMSG: currentTime : ">
	//   93  222:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   94  225:pop             
			stringbuilder.append(f2);
	//   95  226:aload           9
	//   96  228:fload           5
	//   97  230:invokevirtual   #106 <Method StringBuilder StringBuilder.append(float)>
	//   98  233:pop             
			stringbuilder.append(" , duration : ");
	//   99  234:aload           9
	//  100  236:ldc1            #108 <String " , duration : ">
	//  101  238:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  102  241:pop             
			stringbuilder.append(f1);
	//  103  242:aload           9
	//  104  244:fload           4
	//  105  246:invokevirtual   #106 <Method StringBuilder StringBuilder.append(float)>
	//  106  249:pop             
			stringbuilder.append(" , isMuted : ");
	//  107  250:aload           9
	//  108  252:ldc1            #110 <String " , isMuted : ">
	//  109  254:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  110  257:pop             
			stringbuilder.append(flag);
	//  111  258:aload           9
	//  112  260:iload           8
	//  113  262:invokevirtual   #113 <Method StringBuilder StringBuilder.append(boolean)>
	//  114  265:pop             
			stringbuilder.append(" , playbackState : ");
	//  115  266:aload           9
	//  116  268:ldc1            #115 <String " , playbackState : ">
	//  117  270:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  118  273:pop             
			stringbuilder.append(i);
	//  119  274:aload           9
	//  120  276:iload           6
	//  121  278:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//  122  281:pop             
			stringbuilder.append(" , aspectRatio : ");
	//  123  282:aload           9
	//  124  284:ldc1            #120 <String " , aspectRatio : ">
	//  125  286:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  126  289:pop             
			stringbuilder.append(((String) (map)));
	//  127  290:aload           9
	//  128  292:aload_2         
	//  129  293:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  130  296:pop             
			wx.b(stringbuilder.toString());
	//  131  297:aload           9
	//  132  299:invokevirtual   #124 <Method String StringBuilder.toString()>
	//  133  302:invokestatic    #127 <Method void wx.b(String)>
		}
		((agd) (obj)).a(f2, f1, i, flag, f);
	//  134  305:aload_1         
	//  135  306:fload           5
	//  136  308:fload           4
	//  137  310:iload           6
	//  138  312:iload           8
	//  139  314:fload_3         
	//  140  315:invokevirtual   #130 <Method void agd.a(float, float, int, boolean, float)>
		return;
	//  141  318:return          
		obj;
	//  142  319:astore_1        
		break MISSING_BLOCK_LABEL_324;
	//  143  320:goto            324
		obj;
	//  144  323:astore_1        
		wx.b("Unable to parse videoMeta message.", ((Throwable) (obj)));
	//  145  324:ldc1            #132 <String "Unable to parse videoMeta message.">
	//  146  326:aload_1         
	//  147  327:invokestatic    #135 <Method void wx.b(String, Throwable)>
		aw.i().a(((Throwable) (obj)), "VideoMetaGmsgHandler.onGmsg");
	//  148  330:invokestatic    #141 <Method wi aw.i()>
	//  149  333:aload_1         
	//  150  334:ldc1            #143 <String "VideoMetaGmsgHandler.onGmsg">
	//  151  336:invokevirtual   #148 <Method void wi.a(Throwable, String)>
		return;
	//  152  339:return          
_L2:
		i = 0;
	//  153  340:iconst_0        
	//  154  341:istore          6
		if(true) goto _L3; else goto _L4
	//  155  343:goto            162
_L4:
	}
}
