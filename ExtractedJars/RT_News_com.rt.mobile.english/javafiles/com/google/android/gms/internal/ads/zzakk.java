// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.*;
import android.content.*;
import android.content.pm.*;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.*;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.*;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.*;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.*;
import java.net.HttpURLConnection;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakc, zznk, zzkb, zzni, 
//			zzajm, zzakd, zzgk, zzge, 
//			zzjn, zzakb, zzami, zzajx, 
//			zzamu, zzmw, zzakq, zzaki, 
//			zzalt, zzanz, zzakn, zzbfw, 
//			zzoh, zzakl, zzakp, zzako, 
//			zzakm

public final class zzakk
{

	public zzakk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void Object()>
	//    6   12:putfield        #42  <Field Object mLock>
		zzcrn = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #44  <Field boolean zzcrn>
		zzcro = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #46  <Field boolean zzcro>
		zzcrp = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #48  <Field boolean zzcrp>
	//   16   30:return          
	}

	public static Bundle zza(zzgk zzgk1)
	{
		if(zzgk1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj = ((Object) (zznk.zzawq));
	//    4    6:getstatic       #57  <Field zzna zznk.zzawq>
	//    5    9:astore_1        
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*   6   10:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*   9   17:checkcast       #71  <Class Boolean>
	//*  10   20:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  11   23:ifne            48
		{
			obj = ((Object) (zznk.zzaws));
	//   12   26:getstatic       #78  <Field zzna zznk.zzaws>
	//   13   29:astore_1        
			if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  14   30:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*  17   37:checkcast       #71  <Class Boolean>
	//*  18   40:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  19   43:ifne            48
				return null;
	//   20   46:aconst_null     
	//   21   47:areturn         
		}
		if(zzbv.zzeo().zzqh().zzqu() && zzbv.zzeo().zzqh().zzqw())
	//*  22   48:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//*  23   51:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//*  24   54:invokevirtual   #95  <Method boolean zzakd.zzqu()>
	//*  25   57:ifeq            74
	//*  26   60:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//*  27   63:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//*  28   66:invokevirtual   #98  <Method boolean zzakd.zzqw()>
	//*  29   69:ifeq            74
			return null;
	//   30   72:aconst_null     
	//   31   73:areturn         
		if(zzgk1.zzha())
	//*  32   74:aload_0         
	//*  33   75:invokevirtual   #103 <Method boolean zzgk.zzha()>
	//*  34   78:ifeq            85
			zzgk1.wakeup();
	//   35   81:aload_0         
	//   36   82:invokevirtual   #106 <Method void zzgk.wakeup()>
		zzgk1 = ((zzgk) (zzgk1.zzgy()));
	//   37   85:aload_0         
	//   38   86:invokevirtual   #110 <Method zzge zzgk.zzgy()>
	//   39   89:astore_0        
		String s;
		if(zzgk1 != null)
	//*  40   90:aload_0         
	//*  41   91:ifnull          160
		{
			String s1 = ((zzge) (zzgk1)).getSignature();
	//   42   94:aload_0         
	//   43   95:invokevirtual   #116 <Method String zzge.getSignature()>
	//   44   98:astore_3        
			String s2 = ((zzge) (zzgk1)).zzgo();
	//   45   99:aload_0         
	//   46  100:invokevirtual   #119 <Method String zzge.zzgo()>
	//   47  103:astore          4
			String s3 = ((zzge) (zzgk1)).zzgp();
	//   48  105:aload_0         
	//   49  106:invokevirtual   #122 <Method String zzge.zzgp()>
	//   50  109:astore          5
			if(s1 != null)
	//*  51  111:aload_3         
	//*  52  112:ifnull          125
				zzbv.zzeo().zzqh().zzcn(s1);
	//   53  115:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//   54  118:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//   55  121:aload_3         
	//   56  122:invokevirtual   #126 <Method void zzakd.zzcn(String)>
			s = s1;
	//   57  125:aload_3         
	//   58  126:astore_2        
			zzgk1 = ((zzgk) (s2));
	//   59  127:aload           4
	//   60  129:astore_0        
			obj = ((Object) (s3));
	//   61  130:aload           5
	//   62  132:astore_1        
			if(s3 != null)
	//*  63  133:aload           5
	//*  64  135:ifnull          182
			{
				zzbv.zzeo().zzqh().zzco(s3);
	//   65  138:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//   66  141:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//   67  144:aload           5
	//   68  146:invokevirtual   #129 <Method void zzakd.zzco(String)>
				s = s1;
	//   69  149:aload_3         
	//   70  150:astore_2        
				zzgk1 = ((zzgk) (s2));
	//   71  151:aload           4
	//   72  153:astore_0        
				obj = ((Object) (s3));
	//   73  154:aload           5
	//   74  156:astore_1        
			}
		} else
	//*  75  157:goto            182
		{
			s = zzbv.zzeo().zzqh().zzqv();
	//   76  160:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//   77  163:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//   78  166:invokevirtual   #132 <Method String zzakd.zzqv()>
	//   79  169:astore_2        
			obj = ((Object) (zzbv.zzeo().zzqh().zzqx()));
	//   80  170:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//   81  173:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//   82  176:invokevirtual   #135 <Method String zzakd.zzqx()>
	//   83  179:astore_1        
			zzgk1 = null;
	//   84  180:aconst_null     
	//   85  181:astore_0        
		}
		Bundle bundle = new Bundle(1);
	//   86  182:new             #137 <Class Bundle>
	//   87  185:dup             
	//   88  186:iconst_1        
	//   89  187:invokespecial   #140 <Method void Bundle(int)>
	//   90  190:astore_3        
		if(obj != null)
	//*  91  191:aload_1         
	//*  92  192:ifnull          236
		{
			zzna zzna1 = zznk.zzaws;
	//   93  195:getstatic       #78  <Field zzna zznk.zzaws>
	//   94  198:astore          4
			if(((Boolean)zzkb.zzik().zzd(zzna1)).booleanValue() && !zzbv.zzeo().zzqh().zzqw())
	//*  95  200:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*  96  203:aload           4
	//*  97  205:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*  98  208:checkcast       #71  <Class Boolean>
	//*  99  211:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//* 100  214:ifeq            236
	//* 101  217:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//* 102  220:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//* 103  223:invokevirtual   #98  <Method boolean zzakd.zzqw()>
	//* 104  226:ifne            236
				bundle.putString("v_fp_vertical", ((String) (obj)));
	//  105  229:aload_3         
	//  106  230:ldc1            #142 <String "v_fp_vertical">
	//  107  232:aload_1         
	//  108  233:invokevirtual   #146 <Method void Bundle.putString(String, String)>
		}
		if(s != null)
	//* 109  236:aload_2         
	//* 110  237:ifnull          294
		{
			zzna zzna = zznk.zzawq;
	//  111  240:getstatic       #57  <Field zzna zznk.zzawq>
	//  112  243:astore_1        
			if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() && !zzbv.zzeo().zzqh().zzqu())
	//* 113  244:invokestatic    #63  <Method zzni zzkb.zzik()>
	//* 114  247:aload_1         
	//* 115  248:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//* 116  251:checkcast       #71  <Class Boolean>
	//* 117  254:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//* 118  257:ifeq            294
	//* 119  260:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//* 120  263:invokevirtual   #90  <Method zzakd zzajm.zzqh()>
	//* 121  266:invokevirtual   #95  <Method boolean zzakd.zzqu()>
	//* 122  269:ifne            294
			{
				bundle.putString("fingerprint", s);
	//  123  272:aload_3         
	//  124  273:ldc1            #148 <String "fingerprint">
	//  125  275:aload_2         
	//  126  276:invokevirtual   #146 <Method void Bundle.putString(String, String)>
				if(!s.equals(((Object) (zzgk1))))
	//* 127  279:aload_2         
	//* 128  280:aload_0         
	//* 129  281:invokevirtual   #154 <Method boolean String.equals(Object)>
	//* 130  284:ifne            294
					bundle.putString("v_fp", ((String) (zzgk1)));
	//  131  287:aload_3         
	//  132  288:ldc1            #156 <String "v_fp">
	//  133  290:aload_0         
	//  134  291:invokevirtual   #146 <Method void Bundle.putString(String, String)>
			}
		}
		if(!bundle.isEmpty())
	//* 135  294:aload_3         
	//* 136  295:invokevirtual   #159 <Method boolean Bundle.isEmpty()>
	//* 137  298:ifne            303
			return bundle;
	//  138  301:aload_3         
	//  139  302:areturn         
		else
			return null;
	//  140  303:aconst_null     
	//  141  304:areturn         
	}

	public static DisplayMetrics zza(WindowManager windowmanager)
	{
		DisplayMetrics displaymetrics = new DisplayMetrics();
	//    0    0:new             #163 <Class DisplayMetrics>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void DisplayMetrics()>
	//    3    7:astore_1        
		windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
	//    4    8:aload_0         
	//    5    9:invokeinterface #170 <Method Display WindowManager.getDefaultDisplay()>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #176 <Method void Display.getMetrics(DisplayMetrics)>
		return displaymetrics;
	//    8   18:aload_1         
	//    9   19:areturn         
	}

	public static PopupWindow zza(View view, int i, int j, boolean flag)
	{
		return new PopupWindow(view, i, j, false);
	//    0    0:new             #179 <Class PopupWindow>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iconst_0        
	//    6    8:invokespecial   #182 <Method void PopupWindow(View, int, int, boolean)>
	//    7   11:areturn         
	}

	static Object zza(zzakk zzakk1)
	{
		return zzakk1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Object mLock>
	//    2    4:areturn         
	}

	public static String zza(Context context, View view, zzjn zzjn1)
	{
		zzna zzna = zznk.zzaxi;
	//    0    0:getstatic       #189 <Field zzna zznk.zzaxi>
	//    1    3:astore          4
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*   3    8:aload           4
	//*   4   10:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*   5   13:checkcast       #71  <Class Boolean>
	//*   6   16:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*   7   19:ifne            24
			return null;
	//    8   22:aconst_null     
	//    9   23:areturn         
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//   10   24:new             #191 <Class JSONObject>
	//   11   27:dup             
	//   12   28:invokespecial   #192 <Method void JSONObject()>
	//   13   31:astore          4
		JSONObject jsonobject1 = new JSONObject();
	//   14   33:new             #191 <Class JSONObject>
	//   15   36:dup             
	//   16   37:invokespecial   #192 <Method void JSONObject()>
	//   17   40:astore          5
		jsonobject1.put("width", zzjn1.width);
	//   18   42:aload           5
	//   19   44:ldc1            #194 <String "width">
	//   20   46:aload_2         
	//   21   47:getfield        #199 <Field int zzjn.width>
	//   22   50:invokevirtual   #203 <Method JSONObject JSONObject.put(String, int)>
	//   23   53:pop             
		jsonobject1.put("height", zzjn1.height);
	//   24   54:aload           5
	//   25   56:ldc1            #205 <String "height">
	//   26   58:aload_2         
	//   27   59:getfield        #207 <Field int zzjn.height>
	//   28   62:invokevirtual   #203 <Method JSONObject JSONObject.put(String, int)>
	//   29   65:pop             
		jsonobject.put("size", ((Object) (jsonobject1)));
	//   30   66:aload           4
	//   31   68:ldc1            #209 <String "size">
	//   32   70:aload           5
	//   33   72:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   34   75:pop             
		jsonobject.put("activity", ((Object) (zzap(context))));
	//   35   76:aload           4
	//   36   78:ldc1            #214 <String "activity">
	//   37   80:aload_0         
	//   38   81:invokestatic    #218 <Method String zzap(Context)>
	//   39   84:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   40   87:pop             
		if(zzjn1.zzarc) goto _L2; else goto _L1
	//   41   88:aload_2         
	//   42   89:getfield        #221 <Field boolean zzjn.zzarc>
	//   43   92:ifne            206
_L1:
		context = ((Context) (new JSONArray()));
	//   44   95:new             #223 <Class JSONArray>
	//   45   98:dup             
	//   46   99:invokespecial   #224 <Method void JSONArray()>
	//   47  102:astore_0        
_L8:
		if(view == null) goto _L4; else goto _L3
	//   48  103:aload_1         
	//   49  104:ifnull          189
_L3:
		int i;
		try
		{
			zzjn1 = ((zzjn) (view.getParent()));
	//   50  107:aload_1         
	//   51  108:invokevirtual   #230 <Method ViewParent View.getParent()>
	//   52  111:astore_2        
		}
	//*  53  112:aload_2         
	//*  54  113:ifnull          170
	//*  55  116:iconst_m1       
	//*  56  117:istore_3        
	//*  57  118:aload_2         
	//*  58  119:instanceof      #232 <Class ViewGroup>
	//*  59  122:ifeq            134
	//*  60  125:aload_2         
	//*  61  126:checkcast       #232 <Class ViewGroup>
	//*  62  129:aload_1         
	//*  63  130:invokevirtual   #236 <Method int ViewGroup.indexOfChild(View)>
	//*  64  133:istore_3        
	//*  65  134:new             #191 <Class JSONObject>
	//*  66  137:dup             
	//*  67  138:invokespecial   #192 <Method void JSONObject()>
	//*  68  141:astore_1        
	//*  69  142:aload_1         
	//*  70  143:ldc1            #238 <String "type">
	//*  71  145:aload_2         
	//*  72  146:invokevirtual   #242 <Method Class Object.getClass()>
	//*  73  149:invokevirtual   #247 <Method String Class.getName()>
	//*  74  152:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//*  75  155:pop             
	//*  76  156:aload_1         
	//*  77  157:ldc1            #249 <String "index_of_child">
	//*  78  159:iload_3         
	//*  79  160:invokevirtual   #203 <Method JSONObject JSONObject.put(String, int)>
	//*  80  163:pop             
	//*  81  164:aload_0         
	//*  82  165:aload_1         
	//*  83  166:invokevirtual   #252 <Method JSONArray JSONArray.put(Object)>
	//*  84  169:pop             
	//*  85  170:aload_2         
	//*  86  171:ifnull          224
	//*  87  174:aload_2         
	//*  88  175:instanceof      #226 <Class View>
	//*  89  178:ifeq            224
	//*  90  181:aload_2         
	//*  91  182:checkcast       #226 <Class View>
	//*  92  185:astore_1        
	//*  93  186:goto            103
	//*  94  189:aload_0         
	//*  95  190:invokevirtual   #256 <Method int JSONArray.length()>
	//*  96  193:ifle            206
	//*  97  196:aload           4
	//*  98  198:ldc2            #258 <String "parents">
	//*  99  201:aload_0         
	//* 100  202:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//* 101  205:pop             
	//* 102  206:aload           4
	//* 103  208:invokevirtual   #261 <Method String JSONObject.toString()>
	//* 104  211:astore_0        
	//* 105  212:aload_0         
	//* 106  213:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 107  214:astore_0        
		{
			zzakb.zzc("Fail to get view hierarchy json", ((Throwable) (context)));
	//  108  215:ldc2            #263 <String "Fail to get view hierarchy json">
	//  109  218:aload_0         
	//  110  219:invokestatic    #269 <Method void zzakb.zzc(String, Throwable)>
			return null;
	//  111  222:aconst_null     
	//  112  223:areturn         
		}
		if(zzjn1 == null)
			break MISSING_BLOCK_LABEL_170;
		i = -1;
		if(zzjn1 instanceof ViewGroup)
			i = ((ViewGroup)zzjn1).indexOfChild(view);
		view = ((View) (new JSONObject()));
		((JSONObject) (view)).put("type", ((Object) (((Object) (zzjn1)).getClass().getName())));
		((JSONObject) (view)).put("index_of_child", i);
		((JSONArray) (context)).put(((Object) (view)));
		if(zzjn1 == null) goto _L6; else goto _L5
_L5:
		if(zzjn1 instanceof View)
		{
			view = (View)zzjn1;
			continue; /* Loop/switch isn't completed */
		}
		  goto _L6
_L4:
		if(((JSONArray) (context)).length() > 0)
			jsonobject.put("parents", ((Object) (context)));
_L2:
		context = ((Context) (jsonobject.toString()));
		return ((String) (context));
_L6:
		view = null;
	//  113  224:aconst_null     
	//  114  225:astore_1        
		if(true) goto _L8; else goto _L7
	//  115  226:goto            103
_L7:
	}

	static String zza(zzakk zzakk1, String s)
	{
		zzakk1.zzcpq = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #272 <Field String zzcpq>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	public static String zza(InputStreamReader inputstreamreader)
		throws IOException
	{
		StringBuilder stringbuilder = new StringBuilder(8192);
	//    0    0:new             #277 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          8192
	//    3    7:invokespecial   #278 <Method void StringBuilder(int)>
	//    4   10:astore_2        
		char ac[] = new char[2048];
	//    5   11:sipush          2048
	//    6   14:newarray        char[]
	//    7   16:astore_3        
		do
		{
			int i = inputstreamreader.read(ac);
	//    8   17:aload_0         
	//    9   18:aload_3         
	//   10   19:invokevirtual   #284 <Method int InputStreamReader.read(char[])>
	//   11   22:istore_1        
			if(i != -1)
	//*  12   23:iload_1         
	//*  13   24:iconst_m1       
	//*  14   25:icmpeq          39
				stringbuilder.append(ac, 0, i);
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:iconst_0        
	//   18   31:iload_1         
	//   19   32:invokevirtual   #288 <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   20   35:pop             
			else
	//*  21   36:goto            17
				return stringbuilder.toString();
	//   22   39:aload_2         
	//   23   40:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   24   43:areturn         
		} while(true);
	}

	private final JSONArray zza(Collection collection)
		throws JSONException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #223 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #224 <Method void JSONArray()>
	//    3    7:astore_2        
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); zza(jsonarray, ((Iterator) (collection)).next()));
	//    4    8:aload_1         
	//    5    9:invokeinterface #297 <Method Iterator Collection.iterator()>
	//    6   14:astore_1        
	//    7   15:aload_1         
	//    8   16:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            38
	//   10   24:aload_0         
	//   11   25:aload_2         
	//   12   26:aload_1         
	//   13   27:invokeinterface #306 <Method Object Iterator.next()>
	//   14   32:invokespecial   #309 <Method void zza(JSONArray, Object)>
	//*  15   35:goto            15
		return jsonarray;
	//   16   38:aload_2         
	//   17   39:areturn         
	}

	public static void zza(Context context, Intent intent)
	{
		Throwable throwable;
		try
		{
			context.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #320 <Method void Context.startActivity(Intent)>
			return;
	//    3    5:return          
		}
	//*   4    6:aload_1         
	//*   5    7:ldc2            #321 <Int 0x10000000>
	//*   6   10:invokevirtual   #327 <Method Intent Intent.addFlags(int)>
	//*   7   13:pop             
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #320 <Method void Context.startActivity(Intent)>
	//*  11   19:return          
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			intent.addFlags(0x10000000);
		}
		context.startActivity(intent);
	//*  12   20:astore_2        
	//*  13   21:goto            6
	}

	public static void zza(Context context, Uri uri)
	{
		try
		{
			Intent intent = new Intent("android.intent.action.VIEW", uri);
	//    0    0:new             #323 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #334 <String "android.intent.action.VIEW">
	//    3    7:aload_1         
	//    4    8:invokespecial   #337 <Method void Intent(String, Uri)>
	//    5   11:astore_2        
			Bundle bundle = new Bundle();
	//    6   12:new             #137 <Class Bundle>
	//    7   15:dup             
	//    8   16:invokespecial   #338 <Method void Bundle()>
	//    9   19:astore_3        
			intent.putExtras(bundle);
	//   10   20:aload_2         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #342 <Method Intent Intent.putExtras(Bundle)>
	//   13   25:pop             
			zzna zzna = zznk.zzbdy;
	//   14   26:getstatic       #345 <Field zzna zznk.zzbdy>
	//   15   29:astore          4
			if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*  16   31:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*  17   34:aload           4
	//*  18   36:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*  19   39:checkcast       #71  <Class Boolean>
	//*  20   42:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  21   45:ifeq            53
				zzb(context, intent);
	//   22   48:aload_0         
	//   23   49:aload_2         
	//   24   50:invokestatic    #348 <Method void zzb(Context, Intent)>
			bundle.putString("com.android.browser.application_id", context.getPackageName());
	//   25   53:aload_3         
	//   26   54:ldc2            #350 <String "com.android.browser.application_id">
	//   27   57:aload_0         
	//   28   58:invokevirtual   #353 <Method String Context.getPackageName()>
	//   29   61:invokevirtual   #146 <Method void Bundle.putString(String, String)>
			context.startActivity(intent);
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:invokevirtual   #320 <Method void Context.startActivity(Intent)>
			context = ((Context) (uri.toString()));
	//   33   69:aload_1         
	//   34   70:invokevirtual   #356 <Method String Uri.toString()>
	//   35   73:astore_0        
			uri = ((Uri) (new StringBuilder(26 + String.valueOf(((Object) (context))).length())));
	//   36   74:new             #277 <Class StringBuilder>
	//   37   77:dup             
	//   38   78:bipush          26
	//   39   80:aload_0         
	//   40   81:invokestatic    #360 <Method String String.valueOf(Object)>
	//   41   84:invokevirtual   #361 <Method int String.length()>
	//   42   87:iadd            
	//   43   88:invokespecial   #278 <Method void StringBuilder(int)>
	//   44   91:astore_1        
			((StringBuilder) (uri)).append("Opening ");
	//   45   92:aload_1         
	//   46   93:ldc2            #363 <String "Opening ">
	//   47   96:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   48   99:pop             
			((StringBuilder) (uri)).append(((String) (context)));
	//   49  100:aload_1         
	//   50  101:aload_0         
	//   51  102:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   52  105:pop             
			((StringBuilder) (uri)).append(" in a new browser.");
	//   53  106:aload_1         
	//   54  107:ldc2            #368 <String " in a new browser.">
	//   55  110:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   56  113:pop             
			zzakb.zzck(((StringBuilder) (uri)).toString());
	//   57  114:aload_1         
	//   58  115:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   59  118:invokestatic    #371 <Method void zzakb.zzck(String)>
			return;
	//   60  121:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  61  122:astore_0        
		{
			zzakb.zzb("No browser is found.", ((Throwable) (context)));
	//   62  123:ldc2            #373 <String "No browser is found.">
	//   63  126:aload_0         
	//   64  127:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
		}
	//   65  130:return          
	}

	public static void zza(Context context, String s, List list)
	{
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); ((zzajx) (new zzami(context, s, (String)((Iterator) (list)).next()))).zznt());
	//    0    0:aload_2         
	//    1    1:invokeinterface #379 <Method Iterator List.iterator()>
	//    2    6:astore_2        
	//    3    7:aload_2         
	//    4    8:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            41
	//    6   16:new             #381 <Class zzami>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:invokeinterface #306 <Method Object Iterator.next()>
	//   12   28:checkcast       #150 <Class String>
	//   13   31:invokespecial   #384 <Method void zzami(Context, String, String)>
	//   14   34:invokevirtual   #389 <Method Object zzajx.zznt()>
	//   15   37:pop             
	//*  16   38:goto            7
	//   17   41:return          
	}

	public static void zza(Context context, Throwable throwable)
	{
		boolean flag;
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag1;
		zzna zzna = zznk.zzaui;
	//    5    7:getstatic       #396 <Field zzna zznk.zzaui>
	//    6   10:astore          4
		flag1 = ((Boolean)zzkb.zzik().zzd(zzna)).booleanValue();
	//    7   12:invokestatic    #63  <Method zzni zzkb.zzik()>
	//    8   15:aload           4
	//    9   17:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   10   20:checkcast       #71  <Class Boolean>
	//   11   23:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//   12   26:istore_3        
		flag = flag1;
	//   13   27:iload_3         
	//   14   28:istore_2        
_L2:
		if(flag)
	//*  15   29:iload_2         
	//*  16   30:ifeq            39
			CrashUtils.addDynamiteErrorToDropBox(context, throwable);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokestatic    #402 <Method boolean CrashUtils.addDynamiteErrorToDropBox(Context, Throwable)>
	//   20   38:pop             
		return;
	//   21   39:return          
		IllegalStateException illegalstateexception;
		illegalstateexception;
	//   22   40:astore          4
		if(true) goto _L2; else goto _L1
	//   23   42:goto            29
_L1:
	}

	private final void zza(JSONArray jsonarray, Object obj)
		throws JSONException
	{
		if(!(obj instanceof Bundle)) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:instanceof      #137 <Class Bundle>
	//    2    4:ifeq            23
_L1:
		obj = ((Object) (zzf((Bundle)obj)));
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:checkcast       #137 <Class Bundle>
	//    6   12:invokespecial   #406 <Method JSONObject zzf(Bundle)>
	//    7   15:astore_2        
_L4:
		jsonarray.put(obj);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokevirtual   #252 <Method JSONArray JSONArray.put(Object)>
	//   11   21:pop             
		return;
	//   12   22:return          
_L2:
		if(obj instanceof Map)
	//*  13   23:aload_2         
	//*  14   24:instanceof      #408 <Class Map>
	//*  15   27:ifeq            42
		{
			obj = ((Object) (zzn((Map)obj)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:checkcast       #408 <Class Map>
	//   19   35:invokevirtual   #412 <Method JSONObject zzn(Map)>
	//   20   38:astore_2        
			continue; /* Loop/switch isn't completed */
	//   21   39:goto            16
		}
		if(!(obj instanceof Collection))
			break; /* Loop/switch isn't completed */
	//   22   42:aload_2         
	//   23   43:instanceof      #293 <Class Collection>
	//   24   46:ifeq            61
		obj = ((Object) (zza((Collection)obj)));
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:checkcast       #293 <Class Collection>
	//   28   54:invokespecial   #414 <Method JSONArray zza(Collection)>
	//   29   57:astore_2        
		if(true) goto _L4; else goto _L3
	//   30   58:goto            16
_L3:
		if(obj instanceof Object[])
	//*  31   61:aload_2         
	//*  32   62:instanceof      #416 <Class Object[]>
	//*  33   65:ifeq            118
		{
			obj = ((Object) ((Object[])obj));
	//   34   68:aload_2         
	//   35   69:checkcast       #416 <Class Object[]>
	//   36   72:astore_2        
			JSONArray jsonarray1 = new JSONArray();
	//   37   73:new             #223 <Class JSONArray>
	//   38   76:dup             
	//   39   77:invokespecial   #224 <Method void JSONArray()>
	//   40   80:astore          5
			int j = obj.length;
	//   41   82:aload_2         
	//   42   83:arraylength     
	//   43   84:istore          4
			for(int i = 0; i < j; i++)
	//*  44   86:iconst_0        
	//*  45   87:istore_3        
	//*  46   88:iload_3         
	//*  47   89:iload           4
	//*  48   91:icmpge          110
				zza(jsonarray1, ((Object) (obj[i])));
	//   49   94:aload_0         
	//   50   95:aload           5
	//   51   97:aload_2         
	//   52   98:iload_3         
	//   53   99:aaload          
	//   54  100:invokespecial   #309 <Method void zza(JSONArray, Object)>

	//   55  103:iload_3         
	//   56  104:iconst_1        
	//   57  105:iadd            
	//   58  106:istore_3        
	//*  59  107:goto            88
			jsonarray.put(((Object) (jsonarray1)));
	//   60  110:aload_1         
	//   61  111:aload           5
	//   62  113:invokevirtual   #252 <Method JSONArray JSONArray.put(Object)>
	//   63  116:pop             
			return;
	//   64  117:return          
		} else
		{
			jsonarray.put(obj);
	//   65  118:aload_1         
	//   66  119:aload_2         
	//   67  120:invokevirtual   #252 <Method JSONArray JSONArray.put(Object)>
	//   68  123:pop             
			return;
	//   69  124:return          
		}
	}

	private final void zza(JSONObject jsonobject, String s, Object obj)
		throws JSONException
	{
		if(!(obj instanceof Bundle)) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:instanceof      #137 <Class Bundle>
	//    2    4:ifeq            24
_L1:
		obj = ((Object) (zzf((Bundle)obj)));
	//    3    7:aload_0         
	//    4    8:aload_3         
	//    5    9:checkcast       #137 <Class Bundle>
	//    6   12:invokespecial   #406 <Method JSONObject zzf(Bundle)>
	//    7   15:astore_3        
_L4:
		jsonobject.put(s, obj);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   12   22:pop             
		return;
	//   13   23:return          
_L2:
		if(obj instanceof Map)
	//*  14   24:aload_3         
	//*  15   25:instanceof      #408 <Class Map>
	//*  16   28:ifeq            43
		{
			obj = ((Object) (zzn((Map)obj)));
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:checkcast       #408 <Class Map>
	//   20   36:invokevirtual   #412 <Method JSONObject zzn(Map)>
	//   21   39:astore_3        
			continue; /* Loop/switch isn't completed */
	//   22   40:goto            16
		}
		if(!(obj instanceof Collection))
			break; /* Loop/switch isn't completed */
	//   23   43:aload_3         
	//   24   44:instanceof      #293 <Class Collection>
	//   25   47:ifeq            75
		if(s == null)
	//*  26   50:aload_2         
	//*  27   51:ifnull          57
	//*  28   54:goto            61
			s = "null";
	//   29   57:ldc2            #419 <String "null">
	//   30   60:astore_2        
		obj = ((Object) ((Collection)obj));
	//   31   61:aload_3         
	//   32   62:checkcast       #293 <Class Collection>
	//   33   65:astore_3        
_L5:
		obj = ((Object) (zza(((Collection) (obj)))));
	//   34   66:aload_0         
	//   35   67:aload_3         
	//   36   68:invokespecial   #414 <Method JSONArray zza(Collection)>
	//   37   71:astore_3        
		if(true) goto _L4; else goto _L3
	//   38   72:goto            16
_L3:
		if(obj instanceof Object[])
	//*  39   75:aload_3         
	//*  40   76:instanceof      #416 <Class Object[]>
	//*  41   79:ifeq            93
		{
			obj = ((Object) (Arrays.asList((Object[])obj)));
	//   42   82:aload_3         
	//   43   83:checkcast       #416 <Class Object[]>
	//   44   86:invokestatic    #425 <Method List Arrays.asList(Object[])>
	//   45   89:astore_3        
		} else
	//*  46   90:goto            66
		{
			jsonobject.put(s, obj);
	//   47   93:aload_1         
	//   48   94:aload_2         
	//   49   95:aload_3         
	//   50   96:invokevirtual   #212 <Method JSONObject JSONObject.put(String, Object)>
	//   51   99:pop             
			return;
	//   52  100:return          
		}
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	}

	public static boolean zza(Activity activity, Configuration configuration)
	{
		zzkb.zzif();
	//    0    0:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//    1    3:pop             
		int j = zzamu.zza(((Context) (activity)), configuration.screenHeightDp);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #436 <Field int Configuration.screenHeightDp>
	//    5    9:invokestatic    #441 <Method int zzamu.zza(Context, int)>
	//    6   12:istore_3        
		int k = zzamu.zza(((Context) (activity)), configuration.screenWidthDp);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #444 <Field int Configuration.screenWidthDp>
	//   10   18:invokestatic    #441 <Method int zzamu.zza(Context, int)>
	//   11   21:istore          4
		configuration = ((Configuration) (zza((WindowManager)activity.getApplicationContext().getSystemService("window"))));
	//   12   23:aload_0         
	//   13   24:invokevirtual   #450 <Method Context Activity.getApplicationContext()>
	//   14   27:ldc2            #452 <String "window">
	//   15   30:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//   16   33:checkcast       #166 <Class WindowManager>
	//   17   36:invokestatic    #458 <Method DisplayMetrics zza(WindowManager)>
	//   18   39:astore_1        
		int l = ((DisplayMetrics) (configuration)).heightPixels;
	//   19   40:aload_1         
	//   20   41:getfield        #461 <Field int DisplayMetrics.heightPixels>
	//   21   44:istore          5
		int i1 = ((DisplayMetrics) (configuration)).widthPixels;
	//   22   46:aload_1         
	//   23   47:getfield        #464 <Field int DisplayMetrics.widthPixels>
	//   24   50:istore          6
		int i = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
	//   25   52:aload_0         
	//   26   53:invokevirtual   #468 <Method Resources Activity.getResources()>
	//   27   56:ldc2            #470 <String "status_bar_height">
	//   28   59:ldc2            #472 <String "dimen">
	//   29   62:ldc2            #474 <String "android">
	//   30   65:invokevirtual   #480 <Method int Resources.getIdentifier(String, String, String)>
	//   31   68:istore_2        
		if(i > 0)
	//*  32   69:iload_2         
	//*  33   70:ifle            85
			i = activity.getResources().getDimensionPixelSize(i);
	//   34   73:aload_0         
	//   35   74:invokevirtual   #468 <Method Resources Activity.getResources()>
	//   36   77:iload_2         
	//   37   78:invokevirtual   #484 <Method int Resources.getDimensionPixelSize(int)>
	//   38   81:istore_2        
		else
	//*  39   82:goto            87
			i = 0;
	//   40   85:iconst_0        
	//   41   86:istore_2        
		int j1 = (int)Math.round((double)activity.getResources().getDisplayMetrics().density + 0.5D);
	//   42   87:aload_0         
	//   43   88:invokevirtual   #468 <Method Resources Activity.getResources()>
	//   44   91:invokevirtual   #488 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   45   94:getfield        #492 <Field float DisplayMetrics.density>
	//   46   97:f2d             
	//   47   98:ldc2w           #493 <Double 0.5D>
	//   48  101:dadd            
	//   49  102:invokestatic    #500 <Method long Math.round(double)>
	//   50  105:l2i             
	//   51  106:istore          7
		activity = ((Activity) (zznk.zzbek));
	//   52  108:getstatic       #503 <Field zzna zznk.zzbek>
	//   53  111:astore_0        
		j1 *= ((Integer)zzkb.zzik().zzd(((zzna) (activity)))).intValue();
	//   54  112:iload           7
	//   55  114:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   56  117:aload_0         
	//   57  118:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   58  121:checkcast       #505 <Class Integer>
	//   59  124:invokevirtual   #508 <Method int Integer.intValue()>
	//   60  127:imul            
	//   61  128:istore          7
		return zzb(l, j + i, j1) && zzb(i1, k, j1);
	//   62  130:iload           5
	//   63  132:iload_3         
	//   64  133:iload_2         
	//   65  134:iadd            
	//   66  135:iload           7
	//   67  137:invokestatic    #511 <Method boolean zzb(int, int, int)>
	//   68  140:ifeq            157
	//   69  143:iload           6
	//   70  145:iload           4
	//   71  147:iload           7
	//   72  149:invokestatic    #511 <Method boolean zzb(int, int, int)>
	//   73  152:ifeq            157
	//   74  155:iconst_1        
	//   75  156:ireturn         
	//   76  157:iconst_0        
	//   77  158:ireturn         
	}

	static boolean zza(zzakk zzakk1, boolean flag)
	{
		zzakk1.zzcrn = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #44  <Field boolean zzcrn>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	public static boolean zza(ClassLoader classloader, Class class1, String s)
	{
		boolean flag;
		try
		{
			flag = class1.isAssignableFrom(Class.forName(s, false, classloader));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokestatic    #517 <Method Class Class.forName(String, boolean, ClassLoader)>
	//    5    7:invokevirtual   #521 <Method boolean Class.isAssignableFrom(Class)>
	//    6   10:istore_3        
		}
	//*   7   11:iload_3         
	//*   8   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(ClassLoader classloader)
	//*   9   13:astore_0        
		{
			return false;
	//   10   14:iconst_0        
	//   11   15:ireturn         
		}
		return flag;
	}

	public static boolean zzaj(Context context)
	{
		Intent intent = new Intent();
	//    0    0:new             #323 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #527 <Method void Intent()>
	//    3    7:astore_2        
		intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:ldc2            #529 <String "com.google.android.gms.ads.AdActivity">
	//    7   13:invokevirtual   #533 <Method Intent Intent.setClassName(Context, String)>
	//    8   16:pop             
		context = ((Context) (context.getPackageManager()));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #537 <Method PackageManager Context.getPackageManager()>
	//   11   21:astore_0        
		try
		{
			context = ((Context) (((PackageManager) (context)).resolveActivity(intent, 0x10000)));
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:ldc2            #538 <Int 0x10000>
	//   15   27:invokevirtual   #544 <Method ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//   16   30:astore_0        
		}
	//*  17   31:aload_0         
	//*  18   32:ifnull          294
	//*  19   35:aload_0         
	//*  20   36:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  21   39:ifnonnull       45
	//*  22   42:goto            294
	//*  23   45:aload_0         
	//*  24   46:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  25   49:getfield        #555 <Field int ActivityInfo.configChanges>
	//*  26   52:bipush          16
	//*  27   54:iand            
	//*  28   55:ifne            82
	//*  29   58:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  30   61:iconst_1        
	//*  31   62:anewarray       Object[]
	//*  32   65:dup             
	//*  33   66:iconst_0        
	//*  34   67:ldc2            #559 <String "keyboard">
	//*  35   70:aastore         
	//*  36   71:invokestatic    #563 <Method String String.format(String, Object[])>
	//*  37   74:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//*  38   77:iconst_0        
	//*  39   78:istore_1        
	//*  40   79:goto            84
	//*  41   82:iconst_1        
	//*  42   83:istore_1        
	//*  43   84:aload_0         
	//*  44   85:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  45   88:getfield        #555 <Field int ActivityInfo.configChanges>
	//*  46   91:bipush          32
	//*  47   93:iand            
	//*  48   94:ifne            118
	//*  49   97:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  50  100:iconst_1        
	//*  51  101:anewarray       Object[]
	//*  52  104:dup             
	//*  53  105:iconst_0        
	//*  54  106:ldc2            #568 <String "keyboardHidden">
	//*  55  109:aastore         
	//*  56  110:invokestatic    #563 <Method String String.format(String, Object[])>
	//*  57  113:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//*  58  116:iconst_0        
	//*  59  117:istore_1        
	//*  60  118:aload_0         
	//*  61  119:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  62  122:getfield        #555 <Field int ActivityInfo.configChanges>
	//*  63  125:sipush          128
	//*  64  128:iand            
	//*  65  129:ifne            153
	//*  66  132:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  67  135:iconst_1        
	//*  68  136:anewarray       Object[]
	//*  69  139:dup             
	//*  70  140:iconst_0        
	//*  71  141:ldc2            #570 <String "orientation">
	//*  72  144:aastore         
	//*  73  145:invokestatic    #563 <Method String String.format(String, Object[])>
	//*  74  148:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//*  75  151:iconst_0        
	//*  76  152:istore_1        
	//*  77  153:aload_0         
	//*  78  154:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  79  157:getfield        #555 <Field int ActivityInfo.configChanges>
	//*  80  160:sipush          256
	//*  81  163:iand            
	//*  82  164:ifne            188
	//*  83  167:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//*  84  170:iconst_1        
	//*  85  171:anewarray       Object[]
	//*  86  174:dup             
	//*  87  175:iconst_0        
	//*  88  176:ldc2            #572 <String "screenLayout">
	//*  89  179:aastore         
	//*  90  180:invokestatic    #563 <Method String String.format(String, Object[])>
	//*  91  183:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//*  92  186:iconst_0        
	//*  93  187:istore_1        
	//*  94  188:aload_0         
	//*  95  189:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  96  192:getfield        #555 <Field int ActivityInfo.configChanges>
	//*  97  195:sipush          512
	//*  98  198:iand            
	//*  99  199:ifne            223
	//* 100  202:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//* 101  205:iconst_1        
	//* 102  206:anewarray       Object[]
	//* 103  209:dup             
	//* 104  210:iconst_0        
	//* 105  211:ldc2            #574 <String "uiMode">
	//* 106  214:aastore         
	//* 107  215:invokestatic    #563 <Method String String.format(String, Object[])>
	//* 108  218:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//* 109  221:iconst_0        
	//* 110  222:istore_1        
	//* 111  223:aload_0         
	//* 112  224:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//* 113  227:getfield        #555 <Field int ActivityInfo.configChanges>
	//* 114  230:sipush          1024
	//* 115  233:iand            
	//* 116  234:ifne            258
	//* 117  237:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//* 118  240:iconst_1        
	//* 119  241:anewarray       Object[]
	//* 120  244:dup             
	//* 121  245:iconst_0        
	//* 122  246:ldc2            #576 <String "screenSize">
	//* 123  249:aastore         
	//* 124  250:invokestatic    #563 <Method String String.format(String, Object[])>
	//* 125  253:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//* 126  256:iconst_0        
	//* 127  257:istore_1        
	//* 128  258:aload_0         
	//* 129  259:getfield        #550 <Field ActivityInfo ResolveInfo.activityInfo>
	//* 130  262:getfield        #555 <Field int ActivityInfo.configChanges>
	//* 131  265:sipush          2048
	//* 132  268:iand            
	//* 133  269:ifne            292
	//* 134  272:ldc2            #557 <String "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".">
	//* 135  275:iconst_1        
	//* 136  276:anewarray       Object[]
	//* 137  279:dup             
	//* 138  280:iconst_0        
	//* 139  281:ldc2            #578 <String "smallestScreenSize">
	//* 140  284:aastore         
	//* 141  285:invokestatic    #563 <Method String String.format(String, Object[])>
	//* 142  288:astore_0        
	//* 143  289:goto            298
	//* 144  292:iload_1         
	//* 145  293:ireturn         
	//* 146  294:ldc2            #580 <String "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.">
	//* 147  297:astore_0        
	//* 148  298:aload_0         
	//* 149  299:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//* 150  302:iconst_0        
	//* 151  303:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 152  304:astore_0        
		{
			zzakb.zzc("Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml", ((Throwable) (context)));
	//  153  305:ldc2            #582 <String "Could not verify that com.google.android.gms.ads.AdActivity is declared in AndroidManifest.xml">
	//  154  308:aload_0         
	//  155  309:invokestatic    #269 <Method void zzakb.zzc(String, Throwable)>
			zzbv.zzeo().zza(((Throwable) (context)), "AdUtil.hasAdActivity");
	//  156  312:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//  157  315:aload_0         
	//  158  316:ldc2            #584 <String "AdUtil.hasAdActivity">
	//  159  319:invokevirtual   #587 <Method void zzajm.zza(Throwable, String)>
			return false;
	//  160  322:iconst_0        
	//  161  323:ireturn         
		}
		if(context != null && ((ResolveInfo) (context)).activityInfo != null)
		{
			boolean flag;
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x10) == 0)
			{
				zzakb.zzdk(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"keyboard"
				}));
				flag = false;
			} else
			{
				flag = true;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x20) == 0)
			{
				zzakb.zzdk(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"keyboardHidden"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x80) == 0)
			{
				zzakb.zzdk(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"orientation"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x100) == 0)
			{
				zzakb.zzdk(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"screenLayout"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x200) == 0)
			{
				zzakb.zzdk(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"uiMode"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x400) == 0)
			{
				zzakb.zzdk(String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"screenSize"
				}));
				flag = false;
			}
			if((((ResolveInfo) (context)).activityInfo.configChanges & 0x800) == 0)
				context = ((Context) (String.format("com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".", new Object[] {
					"smallestScreenSize"
				})));
			else
				return flag;
		} else
		{
			context = "Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.";
		}
		zzakb.zzdk(((String) (context)));
		return false;
	}

	protected static String zzam(Context context)
	{
		try
		{
			context = ((Context) ((new WebView(context)).getSettings().getUserAgentString()));
	//    0    0:new             #590 <Class WebView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #593 <Method void WebView(Context)>
	//    4    8:invokevirtual   #597 <Method WebSettings WebView.getSettings()>
	//    5   11:invokevirtual   #602 <Method String WebSettings.getUserAgentString()>
	//    6   14:astore_0        
		}
	//*   7   15:aload_0         
	//*   8   16:areturn         
	//*   9   17:invokestatic    #605 <Method String zzrg()>
	//*  10   20:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return zzrg();
		}
		return ((String) (context));
	//*  11   21:astore_0        
	//*  12   22:goto            17
	}

	public static android.app.AlertDialog.Builder zzan(Context context)
	{
		return new android.app.AlertDialog.Builder(context);
	//    0    0:new             #609 <Class android.app.AlertDialog$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #610 <Method void android.app.AlertDialog$Builder(Context)>
	//    4    8:areturn         
	}

	public static zzmw zzao(Context context)
	{
		return new zzmw(context);
	//    0    0:new             #614 <Class zzmw>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #615 <Method void zzmw(Context)>
	//    4    8:areturn         
	}

	private static String zzap(Context context)
	{
		try
		{
			context = ((Context) ((ActivityManager)context.getSystemService("activity")));
	//    0    0:aload_0         
	//    1    1:ldc1            #214 <String "activity">
	//    2    3:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #617 <Class ActivityManager>
	//    4    9:astore_0        
		}
	//*   5   10:aload_0         
	//*   6   11:ifnonnull       16
	//*   7   14:aconst_null     
	//*   8   15:areturn         
	//*   9   16:aload_0         
	//*  10   17:iconst_1        
	//*  11   18:invokevirtual   #621 <Method List ActivityManager.getRunningTasks(int)>
	//*  12   21:astore_0        
	//*  13   22:aload_0         
	//*  14   23:ifnull          67
	//*  15   26:aload_0         
	//*  16   27:invokeinterface #622 <Method boolean List.isEmpty()>
	//*  17   32:ifne            67
	//*  18   35:aload_0         
	//*  19   36:iconst_0        
	//*  20   37:invokeinterface #626 <Method Object List.get(int)>
	//*  21   42:checkcast       #628 <Class android.app.ActivityManager$RunningTaskInfo>
	//*  22   45:astore_0        
	//*  23   46:aload_0         
	//*  24   47:ifnull          67
	//*  25   50:aload_0         
	//*  26   51:getfield        #632 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//*  27   54:ifnull          67
	//*  28   57:aload_0         
	//*  29   58:getfield        #632 <Field ComponentName android.app.ActivityManager$RunningTaskInfo.topActivity>
	//*  30   61:invokevirtual   #637 <Method String ComponentName.getClassName()>
	//*  31   64:astore_0        
	//*  32   65:aload_0         
	//*  33   66:areturn         
	//*  34   67:aconst_null     
	//*  35   68:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  36   69:astore_0        
		{
			return null;
	//   37   70:aconst_null     
	//   38   71:areturn         
		}
		if(context == null)
			return null;
		context = ((Context) (((ActivityManager) (context)).getRunningTasks(1)));
		if(context == null)
			break MISSING_BLOCK_LABEL_67;
		if(((List) (context)).isEmpty())
			break MISSING_BLOCK_LABEL_67;
		context = ((Context) ((android.app.ActivityManager.RunningTaskInfo)((List) (context)).get(0)));
		if(context == null)
			break MISSING_BLOCK_LABEL_67;
		if(((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity == null)
			break MISSING_BLOCK_LABEL_67;
		context = ((Context) (((android.app.ActivityManager.RunningTaskInfo) (context)).topActivity.getClassName()));
		return ((String) (context));
		return null;
	}

	public static boolean zzaq(Context context)
	{
		boolean flag;
		KeyguardManager keyguardmanager;
		Object obj;
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		try
		{
			obj = ((Object) ((ActivityManager)context.getSystemService("activity")));
	//    0    0:aload_0         
	//    1    1:ldc1            #214 <String "activity">
	//    2    3:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #617 <Class ActivityManager>
	//    4    9:astore_3        
			keyguardmanager = (KeyguardManager)context.getSystemService("keyguard");
	//    5   10:aload_0         
	//    6   11:ldc2            #640 <String "keyguard">
	//    7   14:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//    8   17:checkcast       #642 <Class KeyguardManager>
	//    9   20:astore_2        
		}
	//*  10   21:aload_3         
	//*  11   22:ifnull          128
	//*  12   25:aload_2         
	//*  13   26:ifnonnull       31
	//*  14   29:iconst_0        
	//*  15   30:ireturn         
	//*  16   31:aload_3         
	//*  17   32:invokevirtual   #646 <Method List ActivityManager.getRunningAppProcesses()>
	//*  18   35:astore_3        
	//*  19   36:aload_3         
	//*  20   37:ifnonnull       42
	//*  21   40:iconst_0        
	//*  22   41:ireturn         
	//*  23   42:aload_3         
	//*  24   43:invokeinterface #379 <Method Iterator List.iterator()>
	//*  25   48:astore_3        
	//*  26   49:aload_3         
	//*  27   50:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//*  28   55:ifeq            128
	//*  29   58:aload_3         
	//*  30   59:invokeinterface #306 <Method Object Iterator.next()>
	//*  31   64:checkcast       #648 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//*  32   67:astore          4
	//*  33   69:invokestatic    #653 <Method int Process.myPid()>
	//*  34   72:aload           4
	//*  35   74:getfield        #656 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//*  36   77:icmpne          49
	//*  37   80:aload           4
	//*  38   82:getfield        #659 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  39   85:bipush          100
	//*  40   87:icmpne          128
	//*  41   90:aload_2         
	//*  42   91:invokevirtual   #662 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//*  43   94:ifne            128
	//*  44   97:aload_0         
	//*  45   98:ldc2            #664 <String "power">
	//*  46  101:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//*  47  104:checkcast       #666 <Class PowerManager>
	//*  48  107:astore_0        
	//*  49  108:aload_0         
	//*  50  109:ifnonnull       117
	//*  51  112:iconst_0        
	//*  52  113:istore_1        
	//*  53  114:goto            122
	//*  54  117:aload_0         
	//*  55  118:invokevirtual   #669 <Method boolean PowerManager.isScreenOn()>
	//*  56  121:istore_1        
	//*  57  122:iload_1         
	//*  58  123:ifeq            128
	//*  59  126:iconst_1        
	//*  60  127:ireturn         
	//*  61  128:iconst_0        
	//*  62  129:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  63  130:astore_0        
		{
			return false;
	//   64  131:iconst_0        
	//   65  132:ireturn         
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_128;
		if(keyguardmanager == null)
			return false;
		obj = ((Object) (((ActivityManager) (obj)).getRunningAppProcesses()));
		if(obj == null)
			return false;
		obj = ((Object) (((List) (obj)).iterator()));
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break MISSING_BLOCK_LABEL_128;
			runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj)).next();
		} while(Process.myPid() != runningappprocessinfo.pid);
		if(runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
			break MISSING_BLOCK_LABEL_128;
		context = ((Context) ((PowerManager)context.getSystemService("power")));
		if(context == null)
		{
			flag = false;
			break MISSING_BLOCK_LABEL_122;
		}
		flag = ((PowerManager) (context)).isScreenOn();
		if(flag)
			return true;
		return false;
	}

	public static Bitmap zzar(Context context)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #446 <Class Activity>
	//*   2    4:ifne            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		zzna zzna = zznk.zzbbh;
	//    5    9:getstatic       #676 <Field zzna zznk.zzbbh>
	//    6   12:astore_1        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
			break MISSING_BLOCK_LABEL_55;
	//    7   13:invokestatic    #63  <Method zzni zzkb.zzik()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   10   20:checkcast       #71  <Class Boolean>
	//   11   23:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//   12   26:ifeq            55
		context = ((Context) (((Activity)context).getWindow()));
	//   13   29:aload_0         
	//   14   30:checkcast       #446 <Class Activity>
	//   15   33:invokevirtual   #680 <Method Window Activity.getWindow()>
	//   16   36:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_79;
	//   17   37:aload_0         
	//   18   38:ifnull          79
		try
		{
			context = ((Context) (zzv(((Window) (context)).getDecorView().getRootView())));
	//   19   41:aload_0         
	//   20   42:invokevirtual   #686 <Method View Window.getDecorView()>
	//   21   45:invokevirtual   #689 <Method View View.getRootView()>
	//   22   48:invokestatic    #693 <Method Bitmap zzv(View)>
	//   23   51:astore_0        
			break MISSING_BLOCK_LABEL_69;
	//   24   52:goto            69
		}
	//*  25   55:aload_0         
	//*  26   56:checkcast       #446 <Class Activity>
	//*  27   59:invokevirtual   #680 <Method Window Activity.getWindow()>
	//*  28   62:invokevirtual   #686 <Method View Window.getDecorView()>
	//*  29   65:invokestatic    #696 <Method Bitmap zzu(View)>
	//*  30   68:astore_0        
	//*  31   69:aload_0         
	//*  32   70:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  33   71:astore_0        
		{
			zzakb.zzb("Fail to capture screen shot", ((Throwable) (context)));
	//   34   72:ldc2            #698 <String "Fail to capture screen shot">
	//   35   75:aload_0         
	//   36   76:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
		}
		break MISSING_BLOCK_LABEL_79;
		context = ((Context) (zzu(((Activity)context).getWindow().getDecorView())));
		return ((Bitmap) (context));
		return null;
	//   37   79:aconst_null     
	//   38   80:areturn         
	}

	public static int zzas(Context context)
	{
		context = ((Context) (context.getApplicationInfo()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #704 <Method ApplicationInfo Context.getApplicationInfo()>
	//    2    4:astore_0        
		if(context == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return ((ApplicationInfo) (context)).targetSdkVersion;
	//    7   11:aload_0         
	//    8   12:getfield        #709 <Field int ApplicationInfo.targetSdkVersion>
	//    9   15:ireturn         
	}

	private static KeyguardManager zzat(Context context)
	{
		context = ((Context) (context.getSystemService("keyguard")));
	//    0    0:aload_0         
	//    1    1:ldc2            #640 <String "keyguard">
	//    2    4:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//    3    7:astore_0        
		if(context != null && (context instanceof KeyguardManager))
	//*   4    8:aload_0         
	//*   5    9:ifnull          24
	//*   6   12:aload_0         
	//*   7   13:instanceof      #642 <Class KeyguardManager>
	//*   8   16:ifeq            24
			return (KeyguardManager)context;
	//    9   19:aload_0         
	//   10   20:checkcast       #642 <Class KeyguardManager>
	//   11   23:areturn         
		else
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
	}

	public static boolean zzau(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          30
		{
			if(!PlatformVersion.isAtLeastJellyBean())
	//*   2    4:invokestatic    #719 <Method boolean PlatformVersion.isAtLeastJellyBean()>
	//*   3    7:ifne            12
				return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
			context = ((Context) (zzat(context)));
	//    6   12:aload_0         
	//    7   13:invokestatic    #721 <Method KeyguardManager zzat(Context)>
	//    8   16:astore_0        
			if(context != null && ((KeyguardManager) (context)).isKeyguardLocked())
	//*   9   17:aload_0         
	//*  10   18:ifnull          30
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #724 <Method boolean KeyguardManager.isKeyguardLocked()>
	//*  13   25:ifeq            30
				return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		}
		return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
	}

	public static boolean zzav(Context context)
	{
		try
		{
			context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
	//    0    0:aload_0         
	//    1    1:invokevirtual   #731 <Method ClassLoader Context.getClassLoader()>
	//    2    4:ldc2            #733 <String "com.google.android.gms.ads.internal.ClientApi">
	//    3    7:invokevirtual   #739 <Method Class ClassLoader.loadClass(String)>
	//    4   10:pop             
		}
	//*   5   11:iconst_0        
	//*   6   12:ireturn         
	//*   7   13:astore_0        
	//*   8   14:ldc2            #741 <String "Error loading class.">
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
	//*  11   21:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//*  12   24:aload_0         
	//*  13   25:ldc2            #743 <String "AdUtil.isLiteSdk">
	//*  14   28:invokevirtual   #587 <Method void zzajm.zza(Throwable, String)>
	//*  15   31:iconst_0        
	//*  16   32:ireturn         
	//*  17   33:iconst_1        
	//*  18   34:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return true;
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			zzakb.zzb("Error loading class.", ((Throwable) (context)));
			zzbv.zzeo().zza(((Throwable) (context)), "AdUtil.isLiteSdk");
			return false;
		}
		return false;
	//*  19   35:astore_0        
	//*  20   36:goto            33
	}

	public static WebResourceResponse zzb(HttpURLConnection httpurlconnection)
		throws IOException
	{
		String s;
		String s1;
label0:
		{
			zzbv.zzek();
	//    0    0:invokestatic    #748 <Method zzakk zzbv.zzek()>
	//    1    3:pop             
			s = httpurlconnection.getContentType();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #753 <Method String HttpURLConnection.getContentType()>
	//    4    8:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   5    9:aload_2         
	//*   6   10:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifeq            23
				s = "";
	//    8   16:ldc2            #760 <String "">
	//    9   19:astore_2        
			else
	//*  10   20:goto            39
				s = s.split(";")[0].trim();
	//   11   23:aload_2         
	//   12   24:ldc2            #762 <String ";">
	//   13   27:invokevirtual   #766 <Method String[] String.split(String)>
	//   14   30:iconst_0        
	//   15   31:aaload          
	//   16   32:invokevirtual   #769 <Method String String.trim()>
	//   17   35:astore_2        
	//*  18   36:goto            20
			zzbv.zzek();
	//   19   39:invokestatic    #748 <Method zzakk zzbv.zzek()>
	//   20   42:pop             
			s1 = httpurlconnection.getContentType();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #753 <Method String HttpURLConnection.getContentType()>
	//   23   47:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  24   48:aload_3         
	//*  25   49:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   52:ifne            131
			{
				String as[] = s1.split(";");
	//   27   55:aload_3         
	//   28   56:ldc2            #762 <String ";">
	//   29   59:invokevirtual   #766 <Method String[] String.split(String)>
	//   30   62:astore_3        
				if(as.length != 1)
	//*  31   63:aload_3         
	//*  32   64:arraylength     
	//*  33   65:iconst_1        
	//*  34   66:icmpeq          131
				{
					int i = 1;
	//   35   69:iconst_1        
	//   36   70:istore_1        
					do
					{
						if(i >= as.length)
							break;
	//   37   71:iload_1         
	//   38   72:aload_3         
	//   39   73:arraylength     
	//   40   74:icmpge          131
						if(as[i].trim().startsWith("charset"))
	//*  41   77:aload_3         
	//*  42   78:iload_1         
	//*  43   79:aaload          
	//*  44   80:invokevirtual   #769 <Method String String.trim()>
	//*  45   83:ldc2            #771 <String "charset">
	//*  46   86:invokevirtual   #775 <Method boolean String.startsWith(String)>
	//*  47   89:ifeq            124
						{
							String as1[] = as[i].trim().split("=");
	//   48   92:aload_3         
	//   49   93:iload_1         
	//   50   94:aaload          
	//   51   95:invokevirtual   #769 <Method String String.trim()>
	//   52   98:ldc2            #777 <String "=">
	//   53  101:invokevirtual   #766 <Method String[] String.split(String)>
	//   54  104:astore          4
							if(as1.length > 1)
	//*  55  106:aload           4
	//*  56  108:arraylength     
	//*  57  109:iconst_1        
	//*  58  110:icmple          124
							{
								as = ((String []) (as1[1].trim()));
	//   59  113:aload           4
	//   60  115:iconst_1        
	//   61  116:aaload          
	//   62  117:invokevirtual   #769 <Method String String.trim()>
	//   63  120:astore_3        
								break label0;
	//   64  121:goto            135
							}
						}
						i++;
	//   65  124:iload_1         
	//   66  125:iconst_1        
	//   67  126:iadd            
	//   68  127:istore_1        
					} while(true);
	//   69  128:goto            71
				}
			}
			as = "";
	//   70  131:ldc2            #760 <String "">
	//   71  134:astore_3        
		}
		Object obj = ((Object) (httpurlconnection.getHeaderFields()));
	//   72  135:aload_0         
	//   73  136:invokevirtual   #781 <Method Map HttpURLConnection.getHeaderFields()>
	//   74  139:astore          5
		HashMap hashmap = new HashMap(((Map) (obj)).size());
	//   75  141:new             #783 <Class HashMap>
	//   76  144:dup             
	//   77  145:aload           5
	//   78  147:invokeinterface #785 <Method int Map.size()>
	//   79  152:invokespecial   #786 <Method void HashMap(int)>
	//   80  155:astore          4
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   81  157:aload           5
	//   82  159:invokeinterface #790 <Method Set Map.entrySet()>
	//   83  164:invokeinterface #793 <Method Iterator Set.iterator()>
	//   84  169:astore          5
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   85  171:aload           5
	//   86  173:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//   87  178:ifeq            271
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   88  181:aload           5
	//   89  183:invokeinterface #306 <Method Object Iterator.next()>
	//   90  188:checkcast       #795 <Class java.util.Map$Entry>
	//   91  191:astore          6
			if(entry.getKey() != null && entry.getValue() != null && ((List)entry.getValue()).size() > 0)
	//*  92  193:aload           6
	//*  93  195:invokeinterface #798 <Method Object java.util.Map$Entry.getKey()>
	//*  94  200:ifnull          171
	//*  95  203:aload           6
	//*  96  205:invokeinterface #801 <Method Object java.util.Map$Entry.getValue()>
	//*  97  210:ifnull          171
	//*  98  213:aload           6
	//*  99  215:invokeinterface #801 <Method Object java.util.Map$Entry.getValue()>
	//* 100  220:checkcast       #378 <Class List>
	//* 101  223:invokeinterface #802 <Method int List.size()>
	//* 102  228:ifle            171
				((Map) (hashmap)).put(((Object) ((String)entry.getKey())), ((Object) ((String)((List)entry.getValue()).get(0))));
	//  103  231:aload           4
	//  104  233:aload           6
	//  105  235:invokeinterface #798 <Method Object java.util.Map$Entry.getKey()>
	//  106  240:checkcast       #150 <Class String>
	//  107  243:aload           6
	//  108  245:invokeinterface #801 <Method Object java.util.Map$Entry.getValue()>
	//  109  250:checkcast       #378 <Class List>
	//  110  253:iconst_0        
	//  111  254:invokeinterface #626 <Method Object List.get(int)>
	//  112  259:checkcast       #150 <Class String>
	//  113  262:invokeinterface #805 <Method Object Map.put(Object, Object)>
	//  114  267:pop             
		} while(true);
	//  115  268:goto            171
		return zzbv.zzem().zza(s, ((String) (as)), httpurlconnection.getResponseCode(), httpurlconnection.getResponseMessage(), ((Map) (hashmap)), httpurlconnection.getInputStream());
	//  116  271:invokestatic    #809 <Method zzakq zzbv.zzem()>
	//  117  274:aload_2         
	//  118  275:aload_3         
	//  119  276:aload_0         
	//  120  277:invokevirtual   #812 <Method int HttpURLConnection.getResponseCode()>
	//  121  280:aload_0         
	//  122  281:invokevirtual   #815 <Method String HttpURLConnection.getResponseMessage()>
	//  123  284:aload           4
	//  124  286:aload_0         
	//  125  287:invokevirtual   #819 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//  126  290:invokevirtual   #824 <Method WebResourceResponse zzakq.zza(String, String, int, String, Map, java.io.InputStream)>
	//  127  293:areturn         
	}

	public static void zzb(Context context, Intent intent)
	{
		if(intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(PlatformVersion.isAtLeastJellyBeanMR2())
	//*   3    5:invokestatic    #827 <Method boolean PlatformVersion.isAtLeastJellyBeanMR2()>
	//*   4    8:ifeq            59
		{
			Bundle bundle;
			if(intent.getExtras() != null)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #831 <Method Bundle Intent.getExtras()>
	//*   7   15:ifnull          26
				bundle = intent.getExtras();
	//    8   18:aload_1         
	//    9   19:invokevirtual   #831 <Method Bundle Intent.getExtras()>
	//   10   22:astore_2        
			else
	//*  11   23:goto            34
				bundle = new Bundle();
	//   12   26:new             #137 <Class Bundle>
	//   13   29:dup             
	//   14   30:invokespecial   #338 <Method void Bundle()>
	//   15   33:astore_2        
			bundle.putBinder("android.support.customtabs.extra.SESSION", ((android.os.IBinder) (null)));
	//   16   34:aload_2         
	//   17   35:ldc2            #833 <String "android.support.customtabs.extra.SESSION">
	//   18   38:aconst_null     
	//   19   39:invokevirtual   #837 <Method void Bundle.putBinder(String, android.os.IBinder)>
			bundle.putString("com.android.browser.application_id", context.getPackageName());
	//   20   42:aload_2         
	//   21   43:ldc2            #350 <String "com.android.browser.application_id">
	//   22   46:aload_0         
	//   23   47:invokevirtual   #353 <Method String Context.getPackageName()>
	//   24   50:invokevirtual   #146 <Method void Bundle.putString(String, String)>
			intent.putExtras(bundle);
	//   25   53:aload_1         
	//   26   54:aload_2         
	//   27   55:invokevirtual   #342 <Method Intent Intent.putExtras(Bundle)>
	//   28   58:pop             
		}
	//   29   59:return          
	}

	private static boolean zzb(int i, int j, int k)
	{
		return Math.abs(i - j) <= k;
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:isub            
	//    3    3:invokestatic    #840 <Method int Math.abs(int)>
	//    4    6:iload_2         
	//    5    7:icmpgt          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public static String zzcu(String s)
	{
		return Uri.parse(s).buildUpon().query(((String) (null))).build().toString();
	//    0    0:aload_0         
	//    1    1:invokestatic    #846 <Method Uri Uri.parse(String)>
	//    2    4:invokevirtual   #850 <Method android.net.Uri$Builder Uri.buildUpon()>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #856 <Method android.net.Uri$Builder android.net.Uri$Builder.query(String)>
	//    5   11:invokevirtual   #860 <Method Uri android.net.Uri$Builder.build()>
	//    6   14:invokevirtual   #356 <Method String Uri.toString()>
	//    7   17:areturn         
	}

	public static int zzcv(String s)
	{
		int i;
		try
		{
			i = Integer.parseInt(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #867 <Method int Integer.parseInt(String)>
	//    2    4:istore_1        
		}
	//*   3    5:iload_1         
	//*   4    6:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_0        
		{
			s = String.valueOf(((Object) (s)));
	//    6    8:aload_0         
	//    7    9:invokestatic    #360 <Method String String.valueOf(Object)>
	//    8   12:astore_0        
			StringBuilder stringbuilder = new StringBuilder(22 + String.valueOf(((Object) (s))).length());
	//    9   13:new             #277 <Class StringBuilder>
	//   10   16:dup             
	//   11   17:bipush          22
	//   12   19:aload_0         
	//   13   20:invokestatic    #360 <Method String String.valueOf(Object)>
	//   14   23:invokevirtual   #361 <Method int String.length()>
	//   15   26:iadd            
	//   16   27:invokespecial   #278 <Method void StringBuilder(int)>
	//   17   30:astore_2        
			stringbuilder.append("Could not parse value:");
	//   18   31:aload_2         
	//   19   32:ldc2            #869 <String "Could not parse value:">
	//   20   35:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			stringbuilder.append(s);
	//   22   39:aload_2         
	//   23   40:aload_0         
	//   24   41:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   25   44:pop             
			zzakb.zzdk(stringbuilder.toString());
	//   26   45:aload_2         
	//   27   46:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   28   49:invokestatic    #566 <Method void zzakb.zzdk(String)>
			return 0;
	//   29   52:iconst_0        
	//   30   53:ireturn         
		}
		return i;
	}

	public static boolean zzcw(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return s.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
	//    5    9:aload_0         
	//    6   10:ldc2            #872 <String "([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)">
	//    7   13:invokevirtual   #875 <Method boolean String.matches(String)>
	//    8   16:ireturn         
	}

	public static void zzd(Context context, String s, String s1)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #877 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #878 <Method void ArrayList()>
	//    3    7:astore_3        
		((List) (arraylist)).add(((Object) (s1)));
	//    4    8:aload_3         
	//    5    9:aload_2         
	//    6   10:invokeinterface #881 <Method boolean List.add(Object)>
	//    7   15:pop             
		zza(context, s, ((List) (arraylist)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_3         
	//   11   19:invokestatic    #883 <Method void zza(Context, String, List)>
	//   12   22:return          
	}

	public static void zzd(Runnable runnable)
	{
		if(Looper.getMainLooper().getThread() != Thread.currentThread())
	//*   0    0:invokestatic    #31  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokevirtual   #888 <Method Thread Looper.getThread()>
	//*   2    6:invokestatic    #893 <Method Thread Thread.currentThread()>
	//*   3    9:if_acmpeq       19
		{
			runnable.run();
	//    4   12:aload_0         
	//    5   13:invokeinterface #898 <Method void Runnable.run()>
			return;
	//    6   18:return          
		} else
		{
			zzaki.zzb(runnable);
	//    7   19:aload_0         
	//    8   20:invokestatic    #903 <Method zzanz zzaki.zzb(Runnable)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
	}

	public static void zze(Context context, String s, String s1)
	{
		try
		{
			context = ((Context) (context.openFileOutput(s, 0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #908 <Method FileOutputStream Context.openFileOutput(String, int)>
	//    4    6:astore_0        
			((FileOutputStream) (context)).write(s1.getBytes("UTF-8"));
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:ldc2            #910 <String "UTF-8">
	//    8   12:invokevirtual   #914 <Method byte[] String.getBytes(String)>
	//    9   15:invokevirtual   #920 <Method void FileOutputStream.write(byte[])>
			((FileOutputStream) (context)).close();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #923 <Method void FileOutputStream.close()>
			return;
	//   12   22:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  13   23:astore_0        
		{
			zzakb.zzb("Error writing to file in internal storage.", ((Throwable) (context)));
	//   14   24:ldc2            #925 <String "Error writing to file in internal storage.">
	//   15   27:aload_0         
	//   16   28:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
		}
	//   17   31:return          
	}

	public static WebResourceResponse zzf(Context context, String s, String s1)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #783 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #933 <Method void HashMap()>
	//    3    7:astore_3        
		((Map) (hashmap)).put("User-Agent", ((Object) (zzbv.zzek().zzm(context, s))));
	//    4    8:aload_3         
	//    5    9:ldc2            #935 <String "User-Agent">
	//    6   12:invokestatic    #748 <Method zzakk zzbv.zzek()>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokevirtual   #939 <Method String zzm(Context, String)>
	//   10   20:invokeinterface #805 <Method Object Map.put(Object, Object)>
	//   11   25:pop             
		((Map) (hashmap)).put("Cache-Control", "max-stale=3600");
	//   12   26:aload_3         
	//   13   27:ldc2            #941 <String "Cache-Control">
	//   14   30:ldc2            #943 <String "max-stale=3600">
	//   15   33:invokeinterface #805 <Method Object Map.put(Object, Object)>
	//   16   38:pop             
		context = ((Context) ((String)(new zzalt(context)).zzc(s1, ((Map) (hashmap))).get(60L, TimeUnit.SECONDS)));
	//   17   39:new             #945 <Class zzalt>
	//   18   42:dup             
	//   19   43:aload_0         
	//   20   44:invokespecial   #946 <Method void zzalt(Context)>
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokevirtual   #949 <Method zzanz zzalt.zzc(String, Map)>
	//   24   52:ldc2w           #950 <Long 60L>
	//   25   55:getstatic       #957 <Field TimeUnit TimeUnit.SECONDS>
	//   26   58:invokeinterface #962 <Method Object zzanz.get(long, TimeUnit)>
	//   27   63:checkcast       #150 <Class String>
	//   28   66:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_109;
	//   29   67:aload_0         
	//   30   68:ifnull          109
		context = ((Context) (new WebResourceResponse("application/javascript", "UTF-8", ((java.io.InputStream) (new ByteArrayInputStream(((String) (context)).getBytes("UTF-8")))))));
	//   31   71:new             #964 <Class WebResourceResponse>
	//   32   74:dup             
	//   33   75:ldc2            #966 <String "application/javascript">
	//   34   78:ldc2            #910 <String "UTF-8">
	//   35   81:new             #968 <Class ByteArrayInputStream>
	//   36   84:dup             
	//   37   85:aload_0         
	//   38   86:ldc2            #910 <String "UTF-8">
	//   39   89:invokevirtual   #914 <Method byte[] String.getBytes(String)>
	//   40   92:invokespecial   #970 <Method void ByteArrayInputStream(byte[])>
	//   41   95:invokespecial   #973 <Method void WebResourceResponse(String, String, java.io.InputStream)>
	//   42   98:astore_0        
		return ((WebResourceResponse) (context));
	//   43   99:aload_0         
	//   44  100:areturn         
		context;
	//   45  101:astore_0        
		zzakb.zzc("Could not fetch MRAID JS.", ((Throwable) (context)));
	//   46  102:ldc2            #975 <String "Could not fetch MRAID JS.">
	//   47  105:aload_0         
	//   48  106:invokestatic    #269 <Method void zzakb.zzc(String, Throwable)>
		return null;
	//   49  109:aconst_null     
	//   50  110:areturn         
	}

	private final JSONObject zzf(Bundle bundle)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #191 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void JSONObject()>
	//    3    7:astore_2        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, bundle.get(s)))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #978 <Method Set Bundle.keySet()>
	//*   6   12:invokeinterface #793 <Method Iterator Set.iterator()>
	//*   7   17:astore_3        
	//*   8   18:aload_3         
	//*   9   19:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            54
			s = (String)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #306 <Method Object Iterator.next()>
	//   13   33:checkcast       #150 <Class String>
	//   14   36:astore          4

	//   15   38:aload_0         
	//   16   39:aload_2         
	//   17   40:aload           4
	//   18   42:aload_1         
	//   19   43:aload           4
	//   20   45:invokevirtual   #980 <Method Object Bundle.get(String)>
	//   21   48:invokespecial   #982 <Method void zza(JSONObject, String, Object)>
	//*  22   51:goto            18
		return jsonobject;
	//   23   54:aload_2         
	//   24   55:areturn         
	}

	public static int[] zzf(Activity activity)
	{
		activity = ((Activity) (activity.getWindow()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #680 <Method Window Activity.getWindow()>
	//    2    4:astore_0        
		if(activity != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          39
		{
			activity = ((Activity) (((Window) (activity)).findViewById(0x1020002)));
	//    5    9:aload_0         
	//    6   10:ldc2            #984 <Int 0x1020002>
	//    7   13:invokevirtual   #988 <Method View Window.findViewById(int)>
	//    8   16:astore_0        
			if(activity != null)
	//*   9   17:aload_0         
	//*  10   18:ifnull          39
				return (new int[] {
					((View) (activity)).getWidth(), ((View) (activity)).getHeight()
				});
	//   11   21:iconst_2        
	//   12   22:newarray        int[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_0         
	//   16   27:invokevirtual   #991 <Method int View.getWidth()>
	//   17   30:iastore         
	//   18   31:dup             
	//   19   32:iconst_1        
	//   20   33:aload_0         
	//   21   34:invokevirtual   #994 <Method int View.getHeight()>
	//   22   37:iastore         
	//   23   38:areturn         
		}
		return zzrj();
	//   24   39:invokestatic    #998 <Method int[] zzrj()>
	//   25   42:areturn         
	}

	public static Map zzg(Uri uri)
	{
		if(uri == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		HashMap hashmap = new HashMap();
	//    4    6:new             #783 <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #933 <Method void HashMap()>
	//    7   13:astore_1        
		String s;
		for(Iterator iterator = zzbv.zzem().zzh(uri).iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) (uri.getQueryParameter(s)))))
	//*   8   14:invokestatic    #809 <Method zzakq zzbv.zzem()>
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #1004 <Method Set zzakq.zzh(Uri)>
	//*  11   21:invokeinterface #793 <Method Iterator Set.iterator()>
	//*  12   26:astore_2        
	//*  13   27:aload_2         
	//*  14   28:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//*  15   33:ifeq            60
			s = (String)iterator.next();
	//   16   36:aload_2         
	//   17   37:invokeinterface #306 <Method Object Iterator.next()>
	//   18   42:checkcast       #150 <Class String>
	//   19   45:astore_3        

	//   20   46:aload_1         
	//   21   47:aload_3         
	//   22   48:aload_0         
	//   23   49:aload_3         
	//   24   50:invokevirtual   #1007 <Method String Uri.getQueryParameter(String)>
	//   25   53:invokevirtual   #1008 <Method Object HashMap.put(Object, Object)>
	//   26   56:pop             
	//*  27   57:goto            27
		return ((Map) (hashmap));
	//   28   60:aload_1         
	//   29   61:areturn         
	}

	public static boolean zzl(Context context, String s)
	{
		String s1 = context.getPackageName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #353 <Method String Context.getPackageName()>
	//    2    4:astore_2        
		return Wrappers.packageManager(context).checkPermission(s, s1) == 0;
	//    3    5:aload_0         
	//    4    6:invokestatic    #1017 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #1023 <Method int PackageManagerWrapper.checkPermission(String, String)>
	//    8   14:ifne            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static String zzn(Context context, String s)
	{
		try
		{
			context = ((Context) (new String(IOUtils.readInputStreamFully(((java.io.InputStream) (context.openFileInput(s))), true), "UTF-8")));
	//    0    0:new             #150 <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1027 <Method java.io.FileInputStream Context.openFileInput(String)>
	//    5    9:iconst_1        
	//    6   10:invokestatic    #1033 <Method byte[] IOUtils.readInputStreamFully(java.io.InputStream, boolean)>
	//    7   13:ldc2            #910 <String "UTF-8">
	//    8   16:invokespecial   #1036 <Method void String(byte[], String)>
	//    9   19:astore_0        
		}
	//*  10   20:aload_0         
	//*  11   21:areturn         
	//*  12   22:ldc2            #1038 <String "Error reading from internal storage.">
	//*  13   25:invokestatic    #371 <Method void zzakb.zzck(String)>
	//*  14   28:ldc2            #760 <String "">
	//*  15   31:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			zzakb.zzck("Error reading from internal storage.");
			return "";
		}
		return ((String) (context));
	//*  16   32:astore_0        
	//*  17   33:goto            22
	}

	private static String zzrg()
	{
		StringBuilder stringbuilder = new StringBuilder(256);
	//    0    0:new             #277 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          256
	//    3    7:invokespecial   #278 <Method void StringBuilder(int)>
	//    4   10:astore_0        
		stringbuilder.append("Mozilla/5.0 (Linux; U; Android");
	//    5   11:aload_0         
	//    6   12:ldc2            #1040 <String "Mozilla/5.0 (Linux; U; Android">
	//    7   15:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		if(android.os.Build.VERSION.RELEASE != null)
	//*   9   19:getstatic       #1045 <Field String android.os.Build$VERSION.RELEASE>
	//*  10   22:ifnull          41
		{
			stringbuilder.append(" ");
	//   11   25:aload_0         
	//   12   26:ldc2            #1047 <String " ">
	//   13   29:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
			stringbuilder.append(android.os.Build.VERSION.RELEASE);
	//   15   33:aload_0         
	//   16   34:getstatic       #1045 <Field String android.os.Build$VERSION.RELEASE>
	//   17   37:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:pop             
		}
		stringbuilder.append("; ");
	//   19   41:aload_0         
	//   20   42:ldc2            #1049 <String "; ">
	//   21   45:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
		stringbuilder.append(((Object) (Locale.getDefault())));
	//   23   49:aload_0         
	//   24   50:invokestatic    #1055 <Method Locale Locale.getDefault()>
	//   25   53:invokevirtual   #1058 <Method StringBuilder StringBuilder.append(Object)>
	//   26   56:pop             
		if(Build.DEVICE != null)
	//*  27   57:getstatic       #1063 <Field String Build.DEVICE>
	//*  28   60:ifnull          101
		{
			stringbuilder.append("; ");
	//   29   63:aload_0         
	//   30   64:ldc2            #1049 <String "; ">
	//   31   67:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:pop             
			stringbuilder.append(Build.DEVICE);
	//   33   71:aload_0         
	//   34   72:getstatic       #1063 <Field String Build.DEVICE>
	//   35   75:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   36   78:pop             
			if(Build.DISPLAY != null)
	//*  37   79:getstatic       #1066 <Field String Build.DISPLAY>
	//*  38   82:ifnull          101
			{
				stringbuilder.append(" Build/");
	//   39   85:aload_0         
	//   40   86:ldc2            #1068 <String " Build/">
	//   41   89:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
				stringbuilder.append(Build.DISPLAY);
	//   43   93:aload_0         
	//   44   94:getstatic       #1066 <Field String Build.DISPLAY>
	//   45   97:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   46  100:pop             
			}
		}
		stringbuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
	//   47  101:aload_0         
	//   48  102:ldc2            #1070 <String ") AppleWebKit/533 Version/4.0 Safari/533">
	//   49  105:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   50  108:pop             
		return stringbuilder.toString();
	//   51  109:aload_0         
	//   52  110:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   53  113:areturn         
	}

	public static String zzrh()
	{
		return UUID.randomUUID().toString();
	//    0    0:invokestatic    #1077 <Method UUID UUID.randomUUID()>
	//    1    3:invokevirtual   #1078 <Method String UUID.toString()>
	//    2    6:areturn         
	}

	public static String zzri()
	{
		String s = Build.MANUFACTURER;
	//    0    0:getstatic       #1082 <Field String Build.MANUFACTURER>
	//    1    3:astore_0        
		String s1 = Build.MODEL;
	//    2    4:getstatic       #1085 <Field String Build.MODEL>
	//    3    7:astore_1        
		if(s1.startsWith(s))
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #775 <Method boolean String.startsWith(String)>
	//*   7   13:ifeq            18
		{
			return s1;
	//    8   16:aload_1         
	//    9   17:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(1 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//   10   18:new             #277 <Class StringBuilder>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:aload_0         
	//   14   24:invokestatic    #360 <Method String String.valueOf(Object)>
	//   15   27:invokevirtual   #361 <Method int String.length()>
	//   16   30:iadd            
	//   17   31:aload_1         
	//   18   32:invokestatic    #360 <Method String String.valueOf(Object)>
	//   19   35:invokevirtual   #361 <Method int String.length()>
	//   20   38:iadd            
	//   21   39:invokespecial   #278 <Method void StringBuilder(int)>
	//   22   42:astore_2        
			stringbuilder.append(s);
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			stringbuilder.append(" ");
	//   27   49:aload_2         
	//   28   50:ldc2            #1047 <String " ">
	//   29   53:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			stringbuilder.append(s1);
	//   31   57:aload_2         
	//   32   58:aload_1         
	//   33   59:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
			return stringbuilder.toString();
	//   35   63:aload_2         
	//   36   64:invokevirtual   #289 <Method String StringBuilder.toString()>
	//   37   67:areturn         
		}
	}

	private static int[] zzrj()
	{
		return (new int[] {
			0, 0
		});
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:iconst_0        
	//    5    6:iastore         
	//    6    7:dup             
	//    7    8:iconst_1        
	//    8    9:iconst_0        
	//    9   10:iastore         
	//   10   11:areturn         
	}

	public static Bundle zzrk()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #137 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #338 <Method void Bundle()>
	//    3    7:astore_0        
		try
		{
			Object obj = ((Object) (zznk.zzavm));
	//    4    8:getstatic       #1089 <Field zzna zznk.zzavm>
	//    5   11:astore_1        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*   6   12:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*   9   19:checkcast       #71  <Class Boolean>
	//*  10   22:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  11   25:ifeq            48
			{
				obj = ((Object) (new android.os.Debug.MemoryInfo()));
	//   12   28:new             #1091 <Class android.os.Debug$MemoryInfo>
	//   13   31:dup             
	//   14   32:invokespecial   #1092 <Method void android.os.Debug$MemoryInfo()>
	//   15   35:astore_1        
				Debug.getMemoryInfo(((android.os.Debug.MemoryInfo) (obj)));
	//   16   36:aload_1         
	//   17   37:invokestatic    #1098 <Method void Debug.getMemoryInfo(android.os.Debug$MemoryInfo)>
				bundle.putParcelable("debug_memory_info", ((android.os.Parcelable) (obj)));
	//   18   40:aload_0         
	//   19   41:ldc2            #1100 <String "debug_memory_info">
	//   20   44:aload_1         
	//   21   45:invokevirtual   #1104 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			}
			obj = ((Object) (zznk.zzavn));
	//   22   48:getstatic       #1107 <Field zzna zznk.zzavn>
	//   23   51:astore_1        
			if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  24   52:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*  25   55:aload_1         
	//*  26   56:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*  27   59:checkcast       #71  <Class Boolean>
	//*  28   62:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  29   65:ifeq            105
			{
				Runtime runtime = Runtime.getRuntime();
	//   30   68:invokestatic    #1113 <Method Runtime Runtime.getRuntime()>
	//   31   71:astore_1        
				bundle.putLong("runtime_free_memory", runtime.freeMemory());
	//   32   72:aload_0         
	//   33   73:ldc2            #1115 <String "runtime_free_memory">
	//   34   76:aload_1         
	//   35   77:invokevirtual   #1119 <Method long Runtime.freeMemory()>
	//   36   80:invokevirtual   #1123 <Method void Bundle.putLong(String, long)>
				bundle.putLong("runtime_max_memory", runtime.maxMemory());
	//   37   83:aload_0         
	//   38   84:ldc2            #1125 <String "runtime_max_memory">
	//   39   87:aload_1         
	//   40   88:invokevirtual   #1128 <Method long Runtime.maxMemory()>
	//   41   91:invokevirtual   #1123 <Method void Bundle.putLong(String, long)>
				bundle.putLong("runtime_total_memory", runtime.totalMemory());
	//   42   94:aload_0         
	//   43   95:ldc2            #1130 <String "runtime_total_memory">
	//   44   98:aload_1         
	//   45   99:invokevirtual   #1133 <Method long Runtime.totalMemory()>
	//   46  102:invokevirtual   #1123 <Method void Bundle.putLong(String, long)>
			}
			bundle.putInt("web_view_count", zzbv.zzeo().zzqg());
	//   47  105:aload_0         
	//   48  106:ldc2            #1135 <String "web_view_count">
	//   49  109:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//   50  112:invokevirtual   #1138 <Method int zzajm.zzqg()>
	//   51  115:invokevirtual   #1142 <Method void Bundle.putInt(String, int)>
		}
	//*  52  118:aload_0         
	//*  53  119:areturn         
		catch(Exception exception)
	//*  54  120:astore_1        
		{
			zzakb.zzc("Unable to gather memory stats", ((Throwable) (exception)));
	//   55  121:ldc2            #1144 <String "Unable to gather memory stats">
	//   56  124:aload_1         
	//   57  125:invokestatic    #269 <Method void zzakb.zzc(String, Throwable)>
			return bundle;
	//   58  128:aload_0         
	//   59  129:areturn         
		}
		return bundle;
	}

	public static Bitmap zzs(View view)
	{
		view.setDrawingCacheEnabled(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #1149 <Method void View.setDrawingCacheEnabled(boolean)>
		Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
	//    3    5:aload_0         
	//    4    6:invokevirtual   #1153 <Method Bitmap View.getDrawingCache()>
	//    5    9:invokestatic    #1159 <Method Bitmap Bitmap.createBitmap(Bitmap)>
	//    6   12:astore_1        
		view.setDrawingCacheEnabled(false);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #1149 <Method void View.setDrawingCacheEnabled(boolean)>
		return bitmap;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public static Bitmap zzt(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Bitmap bitmap1 = zzv(view);
	//    4    6:aload_0         
	//    5    7:invokestatic    #693 <Method Bitmap zzv(View)>
	//    6   10:astore_2        
		Bitmap bitmap = bitmap1;
	//    7   11:aload_2         
	//    8   12:astore_1        
		if(bitmap1 == null)
	//*   9   13:aload_2         
	//*  10   14:ifnonnull       22
			bitmap = zzu(view);
	//   11   17:aload_0         
	//   12   18:invokestatic    #696 <Method Bitmap zzu(View)>
	//   13   21:astore_1        
		return bitmap;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	private static Bitmap zzu(View view)
	{
		int i;
		int j;
		Bitmap bitmap;
		Canvas canvas;
		try
		{
			i = view.getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #991 <Method int View.getWidth()>
	//    2    4:istore_1        
			j = view.getHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #994 <Method int View.getHeight()>
	//    5    9:istore_2        
		}
	//*   6   10:iload_1         
	//*   7   11:ifeq            62
	//*   8   14:iload_2         
	//*   9   15:ifne            21
	//*  10   18:goto            62
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #991 <Method int View.getWidth()>
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #994 <Method int View.getHeight()>
	//*  15   29:getstatic       #1167 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.RGB_565>
	//*  16   32:invokestatic    #1170 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//*  17   35:astore_3        
	//*  18   36:new             #1172 <Class Canvas>
	//*  19   39:dup             
	//*  20   40:aload_3         
	//*  21   41:invokespecial   #1175 <Method void Canvas(Bitmap)>
	//*  22   44:astore          4
	//*  23   46:aload_0         
	//*  24   47:iconst_0        
	//*  25   48:iconst_0        
	//*  26   49:iload_1         
	//*  27   50:iload_2         
	//*  28   51:invokevirtual   #1179 <Method void View.layout(int, int, int, int)>
	//*  29   54:aload_0         
	//*  30   55:aload           4
	//*  31   57:invokevirtual   #1183 <Method void View.draw(Canvas)>
	//*  32   60:aload_3         
	//*  33   61:areturn         
	//*  34   62:ldc2            #1185 <String "Width or height of view is zero">
	//*  35   65:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//*  36   68:aconst_null     
	//*  37   69:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  38   70:astore_0        
		{
			zzakb.zzb("Fail to capture the webview", ((Throwable) (view)));
	//   39   71:ldc2            #1187 <String "Fail to capture the webview">
	//   40   74:aload_0         
	//   41   75:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
			return null;
	//   42   78:aconst_null     
	//   43   79:areturn         
		}
		if(i == 0 || j == 0)
			break MISSING_BLOCK_LABEL_62;
		bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
		canvas = new Canvas(bitmap);
		view.layout(0, 0, i, j);
		view.draw(canvas);
		return bitmap;
		zzakb.zzdk("Width or height of view is zero");
		return null;
	}

	private static Bitmap zzv(View view)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Bitmap bitmap = null;
	//    2    3:aconst_null     
	//    3    4:astore_2        
		Bitmap bitmap1 = ((Bitmap) (obj));
	//    4    5:aload           4
	//    5    7:astore_3        
		boolean flag;
		Bitmap bitmap2;
		try
		{
			flag = view.isDrawingCacheEnabled();
	//    6    8:aload_0         
	//    7    9:invokevirtual   #1191 <Method boolean View.isDrawingCacheEnabled()>
	//    8   12:istore_1        
		}
	//*   9   13:aload           4
	//*  10   15:astore_3        
	//*  11   16:aload_0         
	//*  12   17:iconst_1        
	//*  13   18:invokevirtual   #1149 <Method void View.setDrawingCacheEnabled(boolean)>
	//*  14   21:aload           4
	//*  15   23:astore_3        
	//*  16   24:aload_0         
	//*  17   25:invokevirtual   #1153 <Method Bitmap View.getDrawingCache()>
	//*  18   28:astore          5
	//*  19   30:aload           5
	//*  20   32:ifnull          44
	//*  21   35:aload           4
	//*  22   37:astore_3        
	//*  23   38:aload           5
	//*  24   40:invokestatic    #1159 <Method Bitmap Bitmap.createBitmap(Bitmap)>
	//*  25   43:astore_2        
	//*  26   44:aload_2         
	//*  27   45:astore_3        
	//*  28   46:aload_0         
	//*  29   47:iload_1         
	//*  30   48:invokevirtual   #1149 <Method void View.setDrawingCacheEnabled(boolean)>
	//*  31   51:aload_2         
	//*  32   52:areturn         
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  33   53:astore_0        
		{
			zzakb.zzb("Fail to capture the web view", ((Throwable) (view)));
	//   34   54:ldc2            #1193 <String "Fail to capture the web view">
	//   35   57:aload_0         
	//   36   58:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
			return bitmap1;
	//   37   61:aload_3         
	//   38   62:areturn         
		}
		bitmap1 = ((Bitmap) (obj));
		view.setDrawingCacheEnabled(true);
		bitmap1 = ((Bitmap) (obj));
		bitmap2 = view.getDrawingCache();
		if(bitmap2 == null)
			break MISSING_BLOCK_LABEL_44;
		bitmap1 = ((Bitmap) (obj));
		bitmap = Bitmap.createBitmap(bitmap2);
		bitmap1 = bitmap;
		view.setDrawingCacheEnabled(flag);
		return bitmap;
	}

	public static boolean zzw(View view)
	{
		Object obj;
label0:
		{
			view = view.getRootView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #689 <Method View View.getRootView()>
	//    2    4:astore_0        
			obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_1        
			if(view != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
			{
				view = ((View) (view.getContext()));
	//    7   11:aload_0         
	//    8   12:invokevirtual   #1198 <Method Context View.getContext()>
	//    9   15:astore_0        
				if(view instanceof Activity)
	//*  10   16:aload_0         
	//*  11   17:instanceof      #446 <Class Activity>
	//*  12   20:ifeq            31
				{
					view = ((View) ((Activity)view));
	//   13   23:aload_0         
	//   14   24:checkcast       #446 <Class Activity>
	//   15   27:astore_0        
					break label0;
	//   16   28:goto            33
				}
			}
			view = null;
	//   17   31:aconst_null     
	//   18   32:astore_0        
		}
		if(view == null)
	//*  19   33:aload_0         
	//*  20   34:ifnonnull       39
			return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
		view = ((View) (((Activity) (view)).getWindow()));
	//   23   39:aload_0         
	//   24   40:invokevirtual   #680 <Method Window Activity.getWindow()>
	//   25   43:astore_0        
		if(view == null)
	//*  26   44:aload_0         
	//*  27   45:ifnonnull       53
			view = ((View) (obj));
	//   28   48:aload_1         
	//   29   49:astore_0        
		else
	//*  30   50:goto            58
			view = ((View) (((Window) (view)).getAttributes()));
	//   31   53:aload_0         
	//   32   54:invokevirtual   #1202 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   33   57:astore_0        
		return view != null && (((android.view.WindowManager.LayoutParams) (view)).flags & 0x80000) != 0;
	//   34   58:aload_0         
	//   35   59:ifnull          75
	//   36   62:aload_0         
	//   37   63:getfield        #1207 <Field int android.view.WindowManager$LayoutParams.flags>
	//   38   66:ldc2            #1208 <Int 0x80000>
	//   39   69:iand            
	//   40   70:ifeq            75
	//   41   73:iconst_1        
	//   42   74:ireturn         
	//   43   75:iconst_0        
	//   44   76:ireturn         
	}

	public static int zzx(View view)
	{
		if(view == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		ViewParent viewparent;
		for(viewparent = view.getParent(); viewparent != null && !(viewparent instanceof AdapterView); viewparent = viewparent.getParent());
	//    4    6:aload_0         
	//    5    7:invokevirtual   #230 <Method ViewParent View.getParent()>
	//    6   10:astore_1        
	//    7   11:aload_1         
	//    8   12:ifnull          32
	//    9   15:aload_1         
	//   10   16:instanceof      #1211 <Class AdapterView>
	//   11   19:ifne            32
	//   12   22:aload_1         
	//   13   23:invokeinterface #1214 <Method ViewParent ViewParent.getParent()>
	//   14   28:astore_1        
	//*  15   29:goto            11
		if(viewparent == null)
	//*  16   32:aload_1         
	//*  17   33:ifnonnull       38
			return -1;
	//   18   36:iconst_m1       
	//   19   37:ireturn         
		else
			return ((AdapterView)viewparent).getPositionForView(view);
	//   20   38:aload_1         
	//   21   39:checkcast       #1211 <Class AdapterView>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #1217 <Method int AdapterView.getPositionForView(View)>
	//   24   46:ireturn         
	}

	public final JSONObject zza(Bundle bundle, JSONObject jsonobject)
	{
		if(bundle == null)
			break MISSING_BLOCK_LABEL_20;
	//    0    0:aload_1         
	//    1    1:ifnull          20
		bundle = ((Bundle) (zzf(bundle)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #406 <Method JSONObject zzf(Bundle)>
	//    5    9:astore_1        
		return ((JSONObject) (bundle));
	//    6   10:aload_1         
	//    7   11:areturn         
		bundle;
	//    8   12:astore_1        
		zzakb.zzb("Error converting Bundle to JSON", ((Throwable) (bundle)));
	//    9   13:ldc2            #1220 <String "Error converting Bundle to JSON">
	//   10   16:aload_1         
	//   11   17:invokestatic    #375 <Method void zzakb.zzb(String, Throwable)>
		return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
	}

	public final void zza(Context context, String s, WebSettings websettings)
	{
		websettings.setUserAgentString(zzm(context, s));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #939 <Method String zzm(Context, String)>
	//    5    7:invokevirtual   #1224 <Method void WebSettings.setUserAgentString(String)>
	//    6   10:return          
	}

	public final void zza(Context context, String s, String s1, Bundle bundle, boolean flag)
	{
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            37
		{
			zzbv.zzek();
	//    2    5:invokestatic    #748 <Method zzakk zzbv.zzek()>
	//    3    8:pop             
			bundle.putString("device", zzri());
	//    4    9:aload           4
	//    5   11:ldc2            #1227 <String "device">
	//    6   14:invokestatic    #1229 <Method String zzri()>
	//    7   17:invokevirtual   #146 <Method void Bundle.putString(String, String)>
			bundle.putString("eids", TextUtils.join(",", ((Iterable) (zznk.zzjb()))));
	//    8   20:aload           4
	//    9   22:ldc2            #1231 <String "eids">
	//   10   25:ldc2            #1233 <String ",">
	//   11   28:invokestatic    #1236 <Method List zznk.zzjb()>
	//   12   31:invokestatic    #1240 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   34:invokevirtual   #146 <Method void Bundle.putString(String, String)>
		}
		zzkb.zzif();
	//   14   37:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//   15   40:pop             
		zzamu.zza(context, s, s1, bundle, flag, ((zzamx) (new zzakn(this, context, s))));
	//   16   41:aload_1         
	//   17   42:aload_2         
	//   18   43:aload_3         
	//   19   44:aload           4
	//   20   46:iload           5
	//   21   48:new             #1242 <Class zzakn>
	//   22   51:dup             
	//   23   52:aload_0         
	//   24   53:aload_1         
	//   25   54:aload_2         
	//   26   55:invokespecial   #1245 <Method void zzakn(zzakk, Context, String)>
	//   27   58:invokestatic    #1248 <Method void zzamu.zza(Context, String, String, Bundle, boolean, zzamx)>
	//   28   61:return          
	}

	public final void zza(Context context, String s, boolean flag, HttpURLConnection httpurlconnection)
	{
		httpurlconnection.setConnectTimeout(60000);
	//    0    0:aload           4
	//    1    2:ldc2            #1250 <Int 60000>
	//    2    5:invokevirtual   #1253 <Method void HttpURLConnection.setConnectTimeout(int)>
		httpurlconnection.setInstanceFollowRedirects(false);
	//    3    8:aload           4
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #1256 <Method void HttpURLConnection.setInstanceFollowRedirects(boolean)>
		httpurlconnection.setReadTimeout(60000);
	//    6   14:aload           4
	//    7   16:ldc2            #1250 <Int 60000>
	//    8   19:invokevirtual   #1259 <Method void HttpURLConnection.setReadTimeout(int)>
		httpurlconnection.setRequestProperty("User-Agent", zzm(context, s));
	//    9   22:aload           4
	//   10   24:ldc2            #935 <String "User-Agent">
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:aload_2         
	//   14   30:invokevirtual   #939 <Method String zzm(Context, String)>
	//   15   33:invokevirtual   #1262 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setUseCaches(false);
	//   16   36:aload           4
	//   17   38:iconst_0        
	//   18   39:invokevirtual   #1265 <Method void HttpURLConnection.setUseCaches(boolean)>
	//   19   42:return          
	}

	public final void zza(Context context, List list)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #446 <Class Activity>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Activity activity = (Activity)context;
	//    4    8:aload_1         
	//    5    9:checkcast       #446 <Class Activity>
	//    6   12:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (zzbfw.zzbn(((Context) (activity)))))))
	//*   7   13:aload_3         
	//*   8   14:invokestatic    #1271 <Method String zzbfw.zzbn(Context)>
	//*   9   17:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   20:ifeq            24
			return;
	//   11   23:return          
		if(list == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       35
		{
			zzakb.v("Cannot ping urls: empty list.");
	//   14   28:ldc2            #1273 <String "Cannot ping urls: empty list.">
	//   15   31:invokestatic    #1276 <Method void zzakb.v(String)>
			return;
	//   16   34:return          
		}
		if(!zzoh.zzh(context))
	//*  17   35:aload_1         
	//*  18   36:invokestatic    #1280 <Method boolean zzoh.zzh(Context)>
	//*  19   39:ifne            49
		{
			zzakb.v("Cannot ping url because custom tabs is not supported");
	//   20   42:ldc2            #1282 <String "Cannot ping url because custom tabs is not supported">
	//   21   45:invokestatic    #1276 <Method void zzakb.v(String)>
			return;
	//   22   48:return          
		} else
		{
			zzoh zzoh1 = new zzoh();
	//   23   49:new             #1278 <Class zzoh>
	//   24   52:dup             
	//   25   53:invokespecial   #1283 <Method void zzoh()>
	//   26   56:astore          4
			zzoh1.zza(((zzoi) (new zzakl(this, list, zzoh1, context))));
	//   27   58:aload           4
	//   28   60:new             #1285 <Class zzakl>
	//   29   63:dup             
	//   30   64:aload_0         
	//   31   65:aload_2         
	//   32   66:aload           4
	//   33   68:aload_1         
	//   34   69:invokespecial   #1288 <Method void zzakl(zzakk, List, zzoh, Context)>
	//   35   72:invokevirtual   #1291 <Method void zzoh.zza(zzoi)>
			zzoh1.zzd(activity);
	//   36   75:aload           4
	//   37   77:aload_3         
	//   38   78:invokevirtual   #1294 <Method void zzoh.zzd(Activity)>
			return;
	//   39   81:return          
		}
	}

	public final boolean zza(View view, Context context)
	{
		Object obj = ((Object) (context.getApplicationContext()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #1297 <Method Context Context.getApplicationContext()>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          23
			obj = ((Object) ((PowerManager)((Context) (obj)).getSystemService("power")));
	//    5    9:aload_3         
	//    6   10:ldc2            #664 <String "power">
	//    7   13:invokevirtual   #456 <Method Object Context.getSystemService(String)>
	//    8   16:checkcast       #666 <Class PowerManager>
	//    9   19:astore_3        
		else
	//*  10   20:goto            25
			obj = null;
	//   11   23:aconst_null     
	//   12   24:astore_3        
		return zza(view, ((PowerManager) (obj)), zzat(context));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:aload_3         
	//   16   28:aload_2         
	//   17   29:invokestatic    #721 <Method KeyguardManager zzat(Context)>
	//   18   32:invokevirtual   #1300 <Method boolean zza(View, PowerManager, KeyguardManager)>
	//   19   35:ireturn         
	}

	public final boolean zza(View view, PowerManager powermanager, KeyguardManager keyguardmanager)
	{
		boolean flag;
label0:
		{
			if(!zzbv.zzek().zzcrn)
	//*   0    0:invokestatic    #748 <Method zzakk zzbv.zzek()>
	//*   1    3:getfield        #44  <Field boolean zzcrn>
	//*   2    6:ifne            66
			{
				boolean flag2;
				if(keyguardmanager == null)
	//*   3    9:aload_3         
	//*   4   10:ifnonnull       19
					flag2 = false;
	//    5   13:iconst_0        
	//    6   14:istore          6
				else
	//*   7   16:goto            25
					flag2 = keyguardmanager.inKeyguardRestrictedInputMode();
	//    8   19:aload_3         
	//    9   20:invokevirtual   #662 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//   10   23:istore          6
				if(flag2)
	//*  11   25:iload           6
	//*  12   27:ifeq            66
				{
					keyguardmanager = ((KeyguardManager) (zznk.zzazu));
	//   13   30:getstatic       #1303 <Field zzna zznk.zzazu>
	//   14   33:astore_3        
					if(!((Boolean)zzkb.zzik().zzd(((zzna) (keyguardmanager)))).booleanValue() || !zzw(view))
	//*  15   34:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*  16   37:aload_3         
	//*  17   38:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*  18   41:checkcast       #71  <Class Boolean>
	//*  19   44:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  20   47:ifeq            60
	//*  21   50:aload_1         
	//*  22   51:invokestatic    #1305 <Method boolean zzw(View)>
	//*  23   54:ifeq            60
	//*  24   57:goto            66
					{
						flag = false;
	//   25   60:iconst_0        
	//   26   61:istore          4
						break label0;
	//   27   63:goto            69
					}
				}
			}
			flag = true;
	//   28   66:iconst_1        
	//   29   67:istore          4
		}
		if(view.getVisibility() == 0 && view.isShown())
	//*  30   69:aload_1         
	//*  31   70:invokevirtual   #1308 <Method int View.getVisibility()>
	//*  32   73:ifne            166
	//*  33   76:aload_1         
	//*  34   77:invokevirtual   #1311 <Method boolean View.isShown()>
	//*  35   80:ifeq            166
		{
			boolean flag1;
			if(powermanager != null && !powermanager.isScreenOn())
	//*  36   83:aload_2         
	//*  37   84:ifnull          103
	//*  38   87:aload_2         
	//*  39   88:invokevirtual   #669 <Method boolean PowerManager.isScreenOn()>
	//*  40   91:ifeq            97
	//*  41   94:goto            103
				flag1 = false;
	//   42   97:iconst_0        
	//   43   98:istore          5
			else
	//*  44  100:goto            106
				flag1 = true;
	//   45  103:iconst_1        
	//   46  104:istore          5
			if(flag1 && flag)
	//*  47  106:iload           5
	//*  48  108:ifeq            166
	//*  49  111:iload           4
	//*  50  113:ifeq            166
			{
				powermanager = ((PowerManager) (zznk.zzazs));
	//   51  116:getstatic       #1314 <Field zzna zznk.zzazs>
	//   52  119:astore_2        
				if(!((Boolean)zzkb.zzik().zzd(((zzna) (powermanager)))).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect()))
	//*  53  120:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*  54  123:aload_2         
	//*  55  124:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*  56  127:checkcast       #71  <Class Boolean>
	//*  57  130:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*  58  133:ifeq            164
	//*  59  136:aload_1         
	//*  60  137:new             #1316 <Class Rect>
	//*  61  140:dup             
	//*  62  141:invokespecial   #1317 <Method void Rect()>
	//*  63  144:invokevirtual   #1321 <Method boolean View.getLocalVisibleRect(Rect)>
	//*  64  147:ifne            164
	//*  65  150:aload_1         
	//*  66  151:new             #1316 <Class Rect>
	//*  67  154:dup             
	//*  68  155:invokespecial   #1317 <Method void Rect()>
	//*  69  158:invokevirtual   #1324 <Method boolean View.getGlobalVisibleRect(Rect)>
	//*  70  161:ifeq            166
					return true;
	//   71  164:iconst_1        
	//   72  165:ireturn         
			}
		}
		return false;
	//   73  166:iconst_0        
	//   74  167:ireturn         
	}

	public final boolean zzak(Context context)
	{
		if(zzcro)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field boolean zzcro>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//    5    9:new             #1327 <Class IntentFilter>
	//    6   12:dup             
	//    7   13:invokespecial   #1328 <Method void IntentFilter()>
	//    8   16:astore_2        
			intentfilter.addAction("android.intent.action.USER_PRESENT");
	//    9   17:aload_2         
	//   10   18:ldc2            #1330 <String "android.intent.action.USER_PRESENT">
	//   11   21:invokevirtual   #1333 <Method void IntentFilter.addAction(String)>
			intentfilter.addAction("android.intent.action.SCREEN_OFF");
	//   12   24:aload_2         
	//   13   25:ldc2            #1335 <String "android.intent.action.SCREEN_OFF">
	//   14   28:invokevirtual   #1333 <Method void IntentFilter.addAction(String)>
			context.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (new zzakp(this, ((zzakl) (null))))), intentfilter);
	//   15   31:aload_1         
	//   16   32:invokevirtual   #1297 <Method Context Context.getApplicationContext()>
	//   17   35:new             #1337 <Class zzakp>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:invokespecial   #1340 <Method void zzakp(zzakk, zzakl)>
	//   22   44:aload_2         
	//   23   45:invokevirtual   #1344 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   24   48:pop             
			zzcro = true;
	//   25   49:aload_0         
	//   26   50:iconst_1        
	//   27   51:putfield        #46  <Field boolean zzcro>
			return true;
	//   28   54:iconst_1        
	//   29   55:ireturn         
		}
	}

	public final boolean zzal(Context context)
	{
		if(zzcrp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field boolean zzcrp>
	//*   2    4:ifeq            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			IntentFilter intentfilter = new IntentFilter();
	//    5    9:new             #1327 <Class IntentFilter>
	//    6   12:dup             
	//    7   13:invokespecial   #1328 <Method void IntentFilter()>
	//    8   16:astore_2        
			intentfilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
	//    9   17:aload_2         
	//   10   18:ldc2            #1347 <String "com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED">
	//   11   21:invokevirtual   #1333 <Method void IntentFilter.addAction(String)>
			context.getApplicationContext().registerReceiver(((android.content.BroadcastReceiver) (new zzako(this, ((zzakl) (null))))), intentfilter);
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1297 <Method Context Context.getApplicationContext()>
	//   14   28:new             #1349 <Class zzako>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aconst_null     
	//   18   34:invokespecial   #1350 <Method void zzako(zzakk, zzakl)>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #1344 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   21   41:pop             
			zzcrp = true;
	//   22   42:aload_0         
	//   23   43:iconst_1        
	//   24   44:putfield        #48  <Field boolean zzcrp>
			return true;
	//   25   47:iconst_1        
	//   26   48:ireturn         
		}
	}

	public final void zzb(Context context, String s, String s1, Bundle bundle, boolean flag)
	{
		zzna zzna = zznk.zzazx;
	//    0    0:getstatic       #1353 <Field zzna zznk.zzazx>
	//    1    3:astore          6
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #63  <Method zzni zzkb.zzik()>
	//*   3    8:aload           6
	//*   4   10:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//*   5   13:checkcast       #71  <Class Boolean>
	//*   6   16:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            33
			zza(context, s, s1, bundle, flag);
	//    8   22:aload_0         
	//    9   23:aload_1         
	//   10   24:aload_2         
	//   11   25:aload_3         
	//   12   26:aload           4
	//   13   28:iload           5
	//   14   30:invokevirtual   #1355 <Method void zza(Context, String, String, Bundle, boolean)>
	//   15   33:return          
	}

	public final boolean zzcx(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
label0:
		{
			if(zzcrq != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #1360 <Field Pattern zzcrq>
	//*   9   15:ifnull          45
			{
				zzna zzna = zznk.zzaxo;
	//   10   18:getstatic       #1363 <Field zzna zznk.zzaxo>
	//   11   21:astore_3        
				if(((String)zzkb.zzik().zzd(zzna)).equals(((Object) (zzcrq.pattern()))))
					break label0;
	//   12   22:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   15   29:checkcast       #150 <Class String>
	//   16   32:aload_0         
	//   17   33:getfield        #1360 <Field Pattern zzcrq>
	//   18   36:invokevirtual   #1368 <Method String Pattern.pattern()>
	//   19   39:invokevirtual   #154 <Method boolean String.equals(Object)>
	//   20   42:ifne            66
			}
			zzna zzna1 = zznk.zzaxo;
	//   21   45:getstatic       #1363 <Field zzna zznk.zzaxo>
	//   22   48:astore_3        
			zzcrq = Pattern.compile((String)zzkb.zzik().zzd(zzna1));
	//   23   49:aload_0         
	//   24   50:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   25   53:aload_3         
	//   26   54:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   27   57:checkcast       #150 <Class String>
	//   28   60:invokestatic    #1372 <Method Pattern Pattern.compile(String)>
	//   29   63:putfield        #1360 <Field Pattern zzcrq>
		}
		flag = zzcrq.matcher(((CharSequence) (s))).matches();
	//   30   66:aload_0         
	//   31   67:getfield        #1360 <Field Pattern zzcrq>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #1376 <Method Matcher Pattern.matcher(CharSequence)>
	//   34   74:invokevirtual   #1380 <Method boolean Matcher.matches()>
	//   35   77:istore_2        
		this;
	//   36   78:aload_0         
		JVM INSTR monitorexit ;
	//   37   79:monitorexit     
		return flag;
	//   38   80:iload_2         
	//   39   81:ireturn         
		s;
	//   40   82:astore_1        
		this;
	//   41   83:aload_0         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		try
		{
			throw s;
	//   43   85:aload_1         
	//   44   86:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   87:astore_1        
		{
			return false;
	//   46   88:iconst_0        
	//   47   89:ireturn         
		}
	}

	public final boolean zzcy(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		this;
	//    5    9:aload_0         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		boolean flag;
label0:
		{
			if(zzcrr != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #1383 <Field Pattern zzcrr>
	//*   9   15:ifnull          45
			{
				zzna zzna = zznk.zzaxp;
	//   10   18:getstatic       #1386 <Field zzna zznk.zzaxp>
	//   11   21:astore_3        
				if(((String)zzkb.zzik().zzd(zzna)).equals(((Object) (zzcrr.pattern()))))
					break label0;
	//   12   22:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   15   29:checkcast       #150 <Class String>
	//   16   32:aload_0         
	//   17   33:getfield        #1383 <Field Pattern zzcrr>
	//   18   36:invokevirtual   #1368 <Method String Pattern.pattern()>
	//   19   39:invokevirtual   #154 <Method boolean String.equals(Object)>
	//   20   42:ifne            66
			}
			zzna zzna1 = zznk.zzaxp;
	//   21   45:getstatic       #1386 <Field zzna zznk.zzaxp>
	//   22   48:astore_3        
			zzcrr = Pattern.compile((String)zzkb.zzik().zzd(zzna1));
	//   23   49:aload_0         
	//   24   50:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   25   53:aload_3         
	//   26   54:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   27   57:checkcast       #150 <Class String>
	//   28   60:invokestatic    #1372 <Method Pattern Pattern.compile(String)>
	//   29   63:putfield        #1383 <Field Pattern zzcrr>
		}
		flag = zzcrr.matcher(((CharSequence) (s))).matches();
	//   30   66:aload_0         
	//   31   67:getfield        #1383 <Field Pattern zzcrr>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #1376 <Method Matcher Pattern.matcher(CharSequence)>
	//   34   74:invokevirtual   #1380 <Method boolean Matcher.matches()>
	//   35   77:istore_2        
		this;
	//   36   78:aload_0         
		JVM INSTR monitorexit ;
	//   37   79:monitorexit     
		return flag;
	//   38   80:iload_2         
	//   39   81:ireturn         
		s;
	//   40   82:astore_1        
		this;
	//   41   83:aload_0         
		JVM INSTR monitorexit ;
	//   42   84:monitorexit     
		try
		{
			throw s;
	//   43   85:aload_1         
	//   44   86:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  45   87:astore_1        
		{
			return false;
	//   46   88:iconst_0        
	//   47   89:ireturn         
		}
	}

	public final int[] zzg(Activity activity)
	{
		int ai[] = zzf(activity);
	//    0    0:aload_1         
	//    1    1:invokestatic    #1388 <Method int[] zzf(Activity)>
	//    2    4:astore_3        
		zzkb.zzif();
	//    3    5:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//    4    8:pop             
		int i = zzamu.zzb(((Context) (activity)), ai[0]);
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:iaload          
	//    9   13:invokestatic    #1390 <Method int zzamu.zzb(Context, int)>
	//   10   16:istore_2        
		zzkb.zzif();
	//   11   17:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//   12   20:pop             
		return (new int[] {
			i, zzamu.zzb(((Context) (activity)), ai[1])
		});
	//   13   21:iconst_2        
	//   14   22:newarray        int[]
	//   15   24:dup             
	//   16   25:iconst_0        
	//   17   26:iload_2         
	//   18   27:iastore         
	//   19   28:dup             
	//   20   29:iconst_1        
	//   21   30:aload_1         
	//   22   31:aload_3         
	//   23   32:iconst_1        
	//   24   33:iaload          
	//   25   34:invokestatic    #1390 <Method int zzamu.zzb(Context, int)>
	//   26   37:iastore         
	//   27   38:areturn         
	}

	public final int[] zzh(Activity activity)
	{
		int ai[];
label0:
		{
			Window window = activity.getWindow();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #680 <Method Window Activity.getWindow()>
	//    2    4:astore_3        
			if(window != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          46
			{
				View view = window.findViewById(0x1020002);
	//    5    9:aload_3         
	//    6   10:ldc2            #984 <Int 0x1020002>
	//    7   13:invokevirtual   #988 <Method View Window.findViewById(int)>
	//    8   16:astore          4
				if(view != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          46
				{
					ai = new int[2];
	//   11   23:iconst_2        
	//   12   24:newarray        int[]
	//   13   26:astore_3        
					ai[0] = view.getTop();
	//   14   27:aload_3         
	//   15   28:iconst_0        
	//   16   29:aload           4
	//   17   31:invokevirtual   #1393 <Method int View.getTop()>
	//   18   34:iastore         
					ai[1] = view.getBottom();
	//   19   35:aload_3         
	//   20   36:iconst_1        
	//   21   37:aload           4
	//   22   39:invokevirtual   #1396 <Method int View.getBottom()>
	//   23   42:iastore         
					break label0;
	//   24   43:goto            50
				}
			}
			ai = zzrj();
	//   25   46:invokestatic    #998 <Method int[] zzrj()>
	//   26   49:astore_3        
		}
		zzkb.zzif();
	//   27   50:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//   28   53:pop             
		int i = zzamu.zzb(((Context) (activity)), ai[0]);
	//   29   54:aload_1         
	//   30   55:aload_3         
	//   31   56:iconst_0        
	//   32   57:iaload          
	//   33   58:invokestatic    #1390 <Method int zzamu.zzb(Context, int)>
	//   34   61:istore_2        
		zzkb.zzif();
	//   35   62:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//   36   65:pop             
		return (new int[] {
			i, zzamu.zzb(((Context) (activity)), ai[1])
		});
	//   37   66:iconst_2        
	//   38   67:newarray        int[]
	//   39   69:dup             
	//   40   70:iconst_0        
	//   41   71:iload_2         
	//   42   72:iastore         
	//   43   73:dup             
	//   44   74:iconst_1        
	//   45   75:aload_1         
	//   46   76:aload_3         
	//   47   77:iconst_1        
	//   48   78:iaload          
	//   49   79:invokestatic    #1390 <Method int zzamu.zzb(Context, int)>
	//   50   82:iastore         
	//   51   83:areturn         
	}

	public final String zzm(Context context, String s)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
			{
				if(zzcpq == null)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #272 <Field String zzcpq>
	//    7   13:ifnull          26
				context = ((Context) (zzcpq));
	//    8   16:aload_0         
	//    9   17:getfield        #272 <Field String zzcpq>
	//   10   20:astore_1        
			}
	//   11   21:aload           4
	//   12   23:monitorexit     
			return ((String) (context));
	//   13   24:aload_1         
	//   14   25:areturn         
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_39;
	//   15   26:aload_2         
	//   16   27:ifnonnull       39
		context = ((Context) (zzrg()));
	//   17   30:invokestatic    #605 <Method String zzrg()>
	//   18   33:astore_1        
		obj;
	//   19   34:aload           4
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return ((String) (context));
	//   21   37:aload_1         
	//   22   38:areturn         
		String s1;
		try
		{
			zzcpq = zzbv.zzem().getDefaultUserAgent(context);
	//   23   39:aload_0         
	//   24   40:invokestatic    #809 <Method zzakq zzbv.zzem()>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #1399 <Method String zzakq.getDefaultUserAgent(Context)>
	//   27   47:putfield        #272 <Field String zzcpq>
		}
	//*  28   50:aload_0         
	//*  29   51:getfield        #272 <Field String zzcpq>
	//*  30   54:invokestatic    #758 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  31   57:ifeq            169
	//*  32   60:invokestatic    #431 <Method zzamu zzkb.zzif()>
	//*  33   63:pop             
	//*  34   64:invokestatic    #1402 <Method boolean zzamu.zzsh()>
	//*  35   67:ifne            161
	//*  36   70:aload_0         
	//*  37   71:aconst_null     
	//*  38   72:putfield        #272 <Field String zzcpq>
	//*  39   75:getstatic       #37  <Field Handler zzcrm>
	//*  40   78:new             #1404 <Class zzakm>
	//*  41   81:dup             
	//*  42   82:aload_0         
	//*  43   83:aload_1         
	//*  44   84:invokespecial   #1407 <Method void zzakm(zzakk, Context)>
	//*  45   87:invokevirtual   #1413 <Method boolean Handler.post(Runnable)>
	//*  46   90:pop             
	//*  47   91:aload_0         
	//*  48   92:getfield        #272 <Field String zzcpq>
	//*  49   95:astore_3        
	//*  50   96:aload_3         
	//*  51   97:ifnonnull       169
	//*  52  100:aload_0         
	//*  53  101:getfield        #42  <Field Object mLock>
	//*  54  104:invokevirtual   #1416 <Method void Object.wait()>
	//*  55  107:goto            91
	//*  56  110:aload_0         
	//*  57  111:invokestatic    #605 <Method String zzrg()>
	//*  58  114:putfield        #272 <Field String zzcpq>
	//*  59  117:aload_0         
	//*  60  118:getfield        #272 <Field String zzcpq>
	//*  61  121:invokestatic    #360 <Method String String.valueOf(Object)>
	//*  62  124:astore_3        
	//*  63  125:aload_3         
	//*  64  126:invokevirtual   #361 <Method int String.length()>
	//*  65  129:ifeq            143
	//*  66  132:ldc2            #1418 <String "Interrupted, use default user agent: ">
	//*  67  135:aload_3         
	//*  68  136:invokevirtual   #1421 <Method String String.concat(String)>
	//*  69  139:astore_3        
	//*  70  140:goto            154
	//*  71  143:new             #150 <Class String>
	//*  72  146:dup             
	//*  73  147:ldc2            #1418 <String "Interrupted, use default user agent: ">
	//*  74  150:invokespecial   #1423 <Method void String(String)>
	//*  75  153:astore_3        
	//*  76  154:aload_3         
	//*  77  155:invokestatic    #566 <Method void zzakb.zzdk(String)>
	//*  78  158:goto            91
	//*  79  161:aload_0         
	//*  80  162:aload_1         
	//*  81  163:invokestatic    #1425 <Method String zzam(Context)>
	//*  82  166:putfield        #272 <Field String zzcpq>
	//*  83  169:aload_0         
	//*  84  170:getfield        #272 <Field String zzcpq>
	//*  85  173:invokestatic    #360 <Method String String.valueOf(Object)>
	//*  86  176:astore_3        
	//*  87  177:new             #277 <Class StringBuilder>
	//*  88  180:dup             
	//*  89  181:bipush          10
	//*  90  183:aload_3         
	//*  91  184:invokestatic    #360 <Method String String.valueOf(Object)>
	//*  92  187:invokevirtual   #361 <Method int String.length()>
	//*  93  190:iadd            
	//*  94  191:aload_2         
	//*  95  192:invokestatic    #360 <Method String String.valueOf(Object)>
	//*  96  195:invokevirtual   #361 <Method int String.length()>
	//*  97  198:iadd            
	//*  98  199:invokespecial   #278 <Method void StringBuilder(int)>
	//*  99  202:astore          5
	//* 100  204:aload           5
	//* 101  206:aload_3         
	//* 102  207:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//* 103  210:pop             
	//* 104  211:aload           5
	//* 105  213:ldc2            #1427 <String " (Mobile; ">
	//* 106  216:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//* 107  219:pop             
	//* 108  220:aload           5
	//* 109  222:aload_2         
	//* 110  223:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//* 111  226:pop             
	//* 112  227:aload_0         
	//* 113  228:aload           5
	//* 114  230:invokevirtual   #289 <Method String StringBuilder.toString()>
	//* 115  233:putfield        #272 <Field String zzcpq>
	//* 116  236:aload_1         
	//* 117  237:invokestatic    #1017 <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//* 118  240:invokevirtual   #1430 <Method boolean PackageManagerWrapper.isCallerInstantApp()>
	//* 119  243:ifeq            277
	//* 120  246:aload_0         
	//* 121  247:aload_0         
	//* 122  248:getfield        #272 <Field String zzcpq>
	//* 123  251:invokestatic    #360 <Method String String.valueOf(Object)>
	//* 124  254:ldc2            #1432 <String ";aia">
	//* 125  257:invokevirtual   #1421 <Method String String.concat(String)>
	//* 126  260:putfield        #272 <Field String zzcpq>
	//* 127  263:goto            277
	//* 128  266:astore_1        
	//* 129  267:invokestatic    #84  <Method zzajm zzbv.zzeo()>
	//* 130  270:aload_1         
	//* 131  271:ldc2            #1434 <String "AdUtil.getUserAgent">
	//* 132  274:invokevirtual   #587 <Method void zzajm.zza(Throwable, String)>
	//* 133  277:aload_0         
	//* 134  278:aload_0         
	//* 135  279:getfield        #272 <Field String zzcpq>
	//* 136  282:invokestatic    #360 <Method String String.valueOf(Object)>
	//* 137  285:ldc2            #1436 <String ")">
	//* 138  288:invokevirtual   #1421 <Method String String.concat(String)>
	//* 139  291:putfield        #272 <Field String zzcpq>
	//* 140  294:aload_0         
	//* 141  295:getfield        #272 <Field String zzcpq>
	//* 142  298:astore_1        
	//* 143  299:aload           4
	//* 144  301:monitorexit     
	//* 145  302:aload_1         
	//* 146  303:areturn         
	//* 147  304:astore_1        
	//* 148  305:aload           4
	//* 149  307:monitorexit     
	//* 150  308:aload_1         
	//* 151  309:athrow          
		catch(Exception exception) { }
	//  152  310:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (zzcpq)))) goto _L2; else goto _L1
_L1:
		zzkb.zzif();
		if(zzamu.zzsh()) goto _L4; else goto _L3
_L3:
		zzcpq = null;
		zzcrm.post(((Runnable) (new zzakm(this, context))));
_L6:
		s1 = zzcpq;
		if(s1 != null) goto _L2; else goto _L5
_L5:
		mLock.wait();
		  goto _L6
_L8:
		zzcpq = zzrg();
		s1 = String.valueOf(((Object) (zzcpq)));
		if(s1.length() != 0)
		{
			s1 = "Interrupted, use default user agent: ".concat(s1);
			break MISSING_BLOCK_LABEL_154;
		}
		s1 = new String("Interrupted, use default user agent: ");
		zzakb.zzdk(s1);
		  goto _L6
_L4:
		zzcpq = zzam(context);
_L2:
		String s2 = String.valueOf(((Object) (zzcpq)));
		StringBuilder stringbuilder = new StringBuilder(10 + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s))).length());
		stringbuilder.append(s2);
		stringbuilder.append(" (Mobile; ");
		stringbuilder.append(s);
		zzcpq = stringbuilder.toString();
		if(Wrappers.packageManager(context).isCallerInstantApp())
			zzcpq = String.valueOf(((Object) (zzcpq))).concat(";aia");
		  goto _L7
		context;
		zzbv.zzeo().zza(((Throwable) (context)), "AdUtil.getUserAgent");
_L7:
		zzcpq = String.valueOf(((Object) (zzcpq))).concat(")");
		context = ((Context) (zzcpq));
		obj;
		JVM INSTR monitorexit ;
		return ((String) (context));
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
	//* 153  311:goto            50
		InterruptedException interruptedexception;
		interruptedexception;
	//  154  314:astore_3        
		  goto _L8
	//* 155  315:goto            110
	}

	public final JSONObject zzn(Map map)
		throws JSONException
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject();
	//    0    0:new             #191 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void JSONObject()>
	//    3    7:astore_2        
			String s;
			for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zza(jsonobject, s, map.get(((Object) (s)))))
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #1439 <Method Set Map.keySet()>
	//*   6   14:invokeinterface #793 <Method Iterator Set.iterator()>
	//*   7   19:astore_3        
	//*   8   20:aload_3         
	//*   9   21:invokeinterface #302 <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            58
				s = (String)iterator.next();
	//   11   29:aload_3         
	//   12   30:invokeinterface #306 <Method Object Iterator.next()>
	//   13   35:checkcast       #150 <Class String>
	//   14   38:astore          4

	//   15   40:aload_0         
	//   16   41:aload_2         
	//   17   42:aload           4
	//   18   44:aload_1         
	//   19   45:aload           4
	//   20   47:invokeinterface #1442 <Method Object Map.get(Object)>
	//   21   52:invokespecial   #982 <Method void zza(JSONObject, String, Object)>
		}
	//*  22   55:goto            20
	//*  23   58:aload_2         
	//*  24   59:areturn         
		// Misplaced declaration of an exception variable
		catch(Map map)
	//*  25   60:astore_1        
		{
			map = ((Map) (String.valueOf(((Object) (((ClassCastException) (map)).getMessage())))));
	//   26   61:aload_1         
	//   27   62:invokevirtual   #1445 <Method String ClassCastException.getMessage()>
	//   28   65:invokestatic    #360 <Method String String.valueOf(Object)>
	//   29   68:astore_1        
			if(((String) (map)).length() != 0)
	//*  30   69:aload_1         
	//*  31   70:invokevirtual   #361 <Method int String.length()>
	//*  32   73:ifeq            87
				map = ((Map) ("Could not convert map to JSON: ".concat(((String) (map)))));
	//   33   76:ldc2            #1447 <String "Could not convert map to JSON: ">
	//   34   79:aload_1         
	//   35   80:invokevirtual   #1421 <Method String String.concat(String)>
	//   36   83:astore_1        
			else
	//*  37   84:goto            98
				map = ((Map) (new String("Could not convert map to JSON: ")));
	//   38   87:new             #150 <Class String>
	//   39   90:dup             
	//   40   91:ldc2            #1447 <String "Could not convert map to JSON: ">
	//   41   94:invokespecial   #1423 <Method void String(String)>
	//   42   97:astore_1        
			throw new JSONException(((String) (map)));
	//   43   98:new             #186 <Class JSONException>
	//   44  101:dup             
	//   45  102:aload_1         
	//   46  103:invokespecial   #1448 <Method void JSONException(String)>
	//   47  106:athrow          
		}
		return jsonobject;
	}

	public static final Handler zzcrm = new zzakc(Looper.getMainLooper());
	private final Object mLock = new Object();
	private String zzcpq;
	private boolean zzcrn;
	private boolean zzcro;
	private boolean zzcrp;
	private Pattern zzcrq;
	private Pattern zzcrr;

	static 
	{
	//    0    0:new             #25  <Class zzakc>
	//    1    3:dup             
	//    2    4:invokestatic    #31  <Method Looper Looper.getMainLooper()>
	//    3    7:invokespecial   #35  <Method void zzakc(Looper)>
	//    4   10:putstatic       #37  <Field Handler zzcrm>
	//*   5   13:return          
	}
}
