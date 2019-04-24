// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.*;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.*;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzgo, 
//			zzge, zzaqw, zzgm, zzgg, 
//			zzajm, zzakb, zzgl, zzadf, 
//			zzgf

public final class zzgk extends Thread
{

	public zzgk(zzgf zzgf1, zzadf zzadf1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Thread()>
		mStarted = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field boolean mStarted>
		zzahy = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #40  <Field boolean zzahy>
		zzbm = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #42  <Field boolean zzbm>
		zzahz = zzgf1;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #44  <Field zzgf zzahz>
		zzaia = zzadf1;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #46  <Field zzadf zzaia>
	//   17   29:aload_0         
	//   18   30:new             #48  <Class Object>
	//   19   33:dup             
	//   20   34:invokespecial   #49  <Method void Object()>
	//   21   37:putfield        #51  <Field Object mLock>
		zzgf1 = ((zzgf) (zznk.zzawl));
	//   22   40:getstatic       #57  <Field zzna zznk.zzawl>
	//   23   43:astore_1        
		zzagx = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   24   44:aload_0         
	//   25   45:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   26   48:aload_1         
	//   27   49:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   28   52:checkcast       #71  <Class Integer>
	//   29   55:invokevirtual   #75  <Method int Integer.intValue()>
	//   30   58:putfield        #77  <Field int zzagx>
		zzgf1 = ((zzgf) (zznk.zzawm));
	//   31   61:getstatic       #80  <Field zzna zznk.zzawm>
	//   32   64:astore_1        
		zzaic = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   33   65:aload_0         
	//   34   66:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   35   69:aload_1         
	//   36   70:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   37   73:checkcast       #71  <Class Integer>
	//   38   76:invokevirtual   #75  <Method int Integer.intValue()>
	//   39   79:putfield        #82  <Field int zzaic>
		zzgf1 = ((zzgf) (zznk.zzawn));
	//   40   82:getstatic       #85  <Field zzna zznk.zzawn>
	//   41   85:astore_1        
		zzagz = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   42   86:aload_0         
	//   43   87:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   44   90:aload_1         
	//   45   91:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   46   94:checkcast       #71  <Class Integer>
	//   47   97:invokevirtual   #75  <Method int Integer.intValue()>
	//   48  100:putfield        #87  <Field int zzagz>
		zzgf1 = ((zzgf) (zznk.zzawo));
	//   49  103:getstatic       #90  <Field zzna zznk.zzawo>
	//   50  106:astore_1        
		zzaid = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   51  107:aload_0         
	//   52  108:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   53  111:aload_1         
	//   54  112:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   55  115:checkcast       #71  <Class Integer>
	//   56  118:invokevirtual   #75  <Method int Integer.intValue()>
	//   57  121:putfield        #92  <Field int zzaid>
		zzgf1 = ((zzgf) (zznk.zzawr));
	//   58  124:getstatic       #95  <Field zzna zznk.zzawr>
	//   59  127:astore_1        
		zzaie = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   60  128:aload_0         
	//   61  129:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   62  132:aload_1         
	//   63  133:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   64  136:checkcast       #71  <Class Integer>
	//   65  139:invokevirtual   #75  <Method int Integer.intValue()>
	//   66  142:putfield        #97  <Field int zzaie>
		zzgf1 = ((zzgf) (zznk.zzawt));
	//   67  145:getstatic       #100 <Field zzna zznk.zzawt>
	//   68  148:astore_1        
		zzaif = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   69  149:aload_0         
	//   70  150:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   71  153:aload_1         
	//   72  154:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   73  157:checkcast       #71  <Class Integer>
	//   74  160:invokevirtual   #75  <Method int Integer.intValue()>
	//   75  163:putfield        #102 <Field int zzaif>
		zzgf1 = ((zzgf) (zznk.zzawu));
	//   76  166:getstatic       #105 <Field zzna zznk.zzawu>
	//   77  169:astore_1        
		zzaig = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   78  170:aload_0         
	//   79  171:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   80  174:aload_1         
	//   81  175:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   82  178:checkcast       #71  <Class Integer>
	//   83  181:invokevirtual   #75  <Method int Integer.intValue()>
	//   84  184:putfield        #107 <Field int zzaig>
		zzgf1 = ((zzgf) (zznk.zzawp));
	//   85  187:getstatic       #110 <Field zzna zznk.zzawp>
	//   86  190:astore_1        
		zzaib = ((Integer)zzkb.zzik().zzd(((zzna) (zzgf1)))).intValue();
	//   87  191:aload_0         
	//   88  192:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   89  195:aload_1         
	//   90  196:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   91  199:checkcast       #71  <Class Integer>
	//   92  202:invokevirtual   #75  <Method int Integer.intValue()>
	//   93  205:putfield        #112 <Field int zzaib>
		zzgf1 = ((zzgf) (zznk.zzaww));
	//   94  208:getstatic       #115 <Field zzna zznk.zzaww>
	//   95  211:astore_1        
		zzaih = (String)zzkb.zzik().zzd(((zzna) (zzgf1)));
	//   96  212:aload_0         
	//   97  213:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   98  216:aload_1         
	//   99  217:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//  100  220:checkcast       #117 <Class String>
	//  101  223:putfield        #119 <Field String zzaih>
		zzgf1 = ((zzgf) (zznk.zzawy));
	//  102  226:getstatic       #122 <Field zzna zznk.zzawy>
	//  103  229:astore_1        
		zzaii = ((Boolean)zzkb.zzik().zzd(((zzna) (zzgf1)))).booleanValue();
	//  104  230:aload_0         
	//  105  231:invokestatic    #63  <Method zzni zzkb.zzik()>
	//  106  234:aload_1         
	//  107  235:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//  108  238:checkcast       #124 <Class Boolean>
	//  109  241:invokevirtual   #128 <Method boolean Boolean.booleanValue()>
	//  110  244:putfield        #130 <Field boolean zzaii>
		setName("ContentFetchTask");
	//  111  247:aload_0         
	//  112  248:ldc1            #132 <String "ContentFetchTask">
	//  113  250:invokevirtual   #136 <Method void setName(String)>
	//  114  253:return          
	}

	private final zzgo zza(View view, zzge zzge1)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(view == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       18
			return new zzgo(this, 0, 0);
	//    4    7:new             #143 <Class zzgo>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:iconst_0        
	//    9   14:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//   10   17:areturn         
		boolean flag1 = view.getGlobalVisibleRect(new Rect());
	//   11   18:aload_1         
	//   12   19:new             #148 <Class Rect>
	//   13   22:dup             
	//   14   23:invokespecial   #149 <Method void Rect()>
	//   15   26:invokevirtual   #155 <Method boolean View.getGlobalVisibleRect(Rect)>
	//   16   29:istore          6
		if((view instanceof TextView) && !(view instanceof EditText))
	//*  17   31:aload_1         
	//*  18   32:instanceof      #157 <Class TextView>
	//*  19   35:ifeq            115
	//*  20   38:aload_1         
	//*  21   39:instanceof      #159 <Class EditText>
	//*  22   42:ifne            115
		{
			CharSequence charsequence = ((TextView)view).getText();
	//   23   45:aload_1         
	//   24   46:checkcast       #157 <Class TextView>
	//   25   49:invokevirtual   #163 <Method CharSequence TextView.getText()>
	//   26   52:astore          7
			if(!TextUtils.isEmpty(charsequence))
	//*  27   54:aload           7
	//*  28   56:invokestatic    #169 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   59:ifne            104
			{
				zzge1.zzb(charsequence.toString(), flag1, view.getX(), view.getY(), view.getWidth(), view.getHeight());
	//   30   62:aload_2         
	//   31   63:aload           7
	//   32   65:invokeinterface #175 <Method String CharSequence.toString()>
	//   33   70:iload           6
	//   34   72:aload_1         
	//   35   73:invokevirtual   #179 <Method float View.getX()>
	//   36   76:aload_1         
	//   37   77:invokevirtual   #182 <Method float View.getY()>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #185 <Method int View.getWidth()>
	//   40   84:i2f             
	//   41   85:aload_1         
	//   42   86:invokevirtual   #188 <Method int View.getHeight()>
	//   43   89:i2f             
	//   44   90:invokevirtual   #194 <Method void zzge.zzb(String, boolean, float, float, float, float)>
				return new zzgo(this, 1, 0);
	//   45   93:new             #143 <Class zzgo>
	//   46   96:dup             
	//   47   97:aload_0         
	//   48   98:iconst_1        
	//   49   99:iconst_0        
	//   50  100:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//   51  103:areturn         
			} else
			{
				return new zzgo(this, 0, 0);
	//   52  104:new             #143 <Class zzgo>
	//   53  107:dup             
	//   54  108:aload_0         
	//   55  109:iconst_0        
	//   56  110:iconst_0        
	//   57  111:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//   58  114:areturn         
			}
		}
		if((view instanceof WebView) && !(view instanceof zzaqw))
	//*  59  115:aload_1         
	//*  60  116:instanceof      #196 <Class WebView>
	//*  61  119:ifeq            198
	//*  62  122:aload_1         
	//*  63  123:instanceof      #198 <Class zzaqw>
	//*  64  126:ifne            198
		{
			zzge1.zzgs();
	//   65  129:aload_2         
	//   66  130:invokevirtual   #201 <Method void zzge.zzgs()>
			view = ((View) ((WebView)view));
	//   67  133:aload_1         
	//   68  134:checkcast       #196 <Class WebView>
	//   69  137:astore_1        
			boolean flag;
			if(!PlatformVersion.isAtLeastKitKat())
	//*  70  138:invokestatic    #206 <Method boolean PlatformVersion.isAtLeastKitKat()>
	//*  71  141:ifne            149
			{
				flag = false;
	//   72  144:iconst_0        
	//   73  145:istore_3        
			} else
	//*  74  146:goto            172
			{
				zzge1.zzgs();
	//   75  149:aload_2         
	//   76  150:invokevirtual   #201 <Method void zzge.zzgs()>
				((WebView) (view)).post(((Runnable) (new zzgm(this, zzge1, ((WebView) (view)), flag1))));
	//   77  153:aload_1         
	//   78  154:new             #208 <Class zzgm>
	//   79  157:dup             
	//   80  158:aload_0         
	//   81  159:aload_2         
	//   82  160:aload_1         
	//   83  161:iload           6
	//   84  163:invokespecial   #211 <Method void zzgm(zzgk, zzge, WebView, boolean)>
	//   85  166:invokevirtual   #215 <Method boolean WebView.post(Runnable)>
	//   86  169:pop             
				flag = true;
	//   87  170:iconst_1        
	//   88  171:istore_3        
			}
			if(flag)
	//*  89  172:iload_3         
	//*  90  173:ifeq            187
				return new zzgo(this, 0, 1);
	//   91  176:new             #143 <Class zzgo>
	//   92  179:dup             
	//   93  180:aload_0         
	//   94  181:iconst_0        
	//   95  182:iconst_1        
	//   96  183:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//   97  186:areturn         
			else
				return new zzgo(this, 0, 0);
	//   98  187:new             #143 <Class zzgo>
	//   99  190:dup             
	//  100  191:aload_0         
	//  101  192:iconst_0        
	//  102  193:iconst_0        
	//  103  194:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//  104  197:areturn         
		}
		if(view instanceof ViewGroup)
	//* 105  198:aload_1         
	//* 106  199:instanceof      #217 <Class ViewGroup>
	//* 107  202:ifeq            277
		{
			view = ((View) ((ViewGroup)view));
	//  108  205:aload_1         
	//  109  206:checkcast       #217 <Class ViewGroup>
	//  110  209:astore_1        
			int k = 0;
	//  111  210:iconst_0        
	//  112  211:istore          5
			int i = k;
	//  113  213:iload           5
	//  114  215:istore_3        
			for(; j < ((ViewGroup) (view)).getChildCount(); j++)
	//* 115  216:iload           4
	//* 116  218:aload_1         
	//* 117  219:invokevirtual   #220 <Method int ViewGroup.getChildCount()>
	//* 118  222:icmpge          265
			{
				zzgo zzgo1 = zza(((ViewGroup) (view)).getChildAt(j), zzge1);
	//  119  225:aload_0         
	//  120  226:aload_1         
	//  121  227:iload           4
	//  122  229:invokevirtual   #224 <Method View ViewGroup.getChildAt(int)>
	//  123  232:aload_2         
	//  124  233:invokespecial   #226 <Method zzgo zza(View, zzge)>
	//  125  236:astore          7
				k += zzgo1.zzaiq;
	//  126  238:iload           5
	//  127  240:aload           7
	//  128  242:getfield        #229 <Field int zzgo.zzaiq>
	//  129  245:iadd            
	//  130  246:istore          5
				i += zzgo1.zzair;
	//  131  248:iload_3         
	//  132  249:aload           7
	//  133  251:getfield        #232 <Field int zzgo.zzair>
	//  134  254:iadd            
	//  135  255:istore_3        
			}

	//  136  256:iload           4
	//  137  258:iconst_1        
	//  138  259:iadd            
	//  139  260:istore          4
	//* 140  262:goto            216
			return new zzgo(this, k, i);
	//  141  265:new             #143 <Class zzgo>
	//  142  268:dup             
	//  143  269:aload_0         
	//  144  270:iload           5
	//  145  272:iload_3         
	//  146  273:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//  147  276:areturn         
		} else
		{
			return new zzgo(this, 0, 0);
	//  148  277:new             #143 <Class zzgo>
	//  149  280:dup             
	//  150  281:aload_0         
	//  151  282:iconst_0        
	//  152  283:iconst_0        
	//  153  284:invokespecial   #146 <Method void zzgo(zzgk, int, int)>
	//  154  287:areturn         
		}
	}

	private static boolean zzgx()
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag;
		boolean flag1;
		Object obj;
		KeyguardManager keyguardmanager;
		Object obj1;
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		try
		{
			obj = ((Object) (zzbv.zzen().getContext()));
	//    2    2:invokestatic    #243 <Method zzgg zzbv.zzen()>
	//    3    5:invokevirtual   #249 <Method Context zzgg.getContext()>
	//    4    8:astore_3        
		}
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       15
	//*   7   13:iconst_0        
	//*   8   14:ireturn         
	//*   9   15:aload_3         
	//*  10   16:ldc1            #251 <String "activity">
	//*  11   18:invokevirtual   #257 <Method Object Context.getSystemService(String)>
	//*  12   21:checkcast       #259 <Class ActivityManager>
	//*  13   24:astore          5
	//*  14   26:aload_3         
	//*  15   27:ldc2            #261 <String "keyguard">
	//*  16   30:invokevirtual   #257 <Method Object Context.getSystemService(String)>
	//*  17   33:checkcast       #263 <Class KeyguardManager>
	//*  18   36:astore          4
	//*  19   38:iload_2         
	//*  20   39:istore_1        
	//*  21   40:aload           5
	//*  22   42:ifnull          165
	//*  23   45:aload           4
	//*  24   47:ifnonnull       52
	//*  25   50:iconst_0        
	//*  26   51:ireturn         
	//*  27   52:aload           5
	//*  28   54:invokevirtual   #267 <Method List ActivityManager.getRunningAppProcesses()>
	//*  29   57:astore          5
	//*  30   59:aload           5
	//*  31   61:ifnonnull       66
	//*  32   64:iconst_0        
	//*  33   65:ireturn         
	//*  34   66:aload           5
	//*  35   68:invokeinterface #273 <Method Iterator List.iterator()>
	//*  36   73:astore          5
	//*  37   75:iload_2         
	//*  38   76:istore_1        
	//*  39   77:aload           5
	//*  40   79:invokeinterface #278 <Method boolean Iterator.hasNext()>
	//*  41   84:ifeq            165
	//*  42   87:aload           5
	//*  43   89:invokeinterface #282 <Method Object Iterator.next()>
	//*  44   94:checkcast       #284 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//*  45   97:astore          6
	//*  46   99:invokestatic    #289 <Method int Process.myPid()>
	//*  47  102:aload           6
	//*  48  104:getfield        #292 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//*  49  107:icmpne          75
	//*  50  110:iload_2         
	//*  51  111:istore_1        
	//*  52  112:aload           6
	//*  53  114:getfield        #295 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  54  117:bipush          100
	//*  55  119:icmpne          165
	//*  56  122:iload_2         
	//*  57  123:istore_1        
	//*  58  124:aload           4
	//*  59  126:invokevirtual   #298 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//*  60  129:ifne            165
	//*  61  132:aload_3         
	//*  62  133:ldc2            #300 <String "power">
	//*  63  136:invokevirtual   #257 <Method Object Context.getSystemService(String)>
	//*  64  139:checkcast       #302 <Class PowerManager>
	//*  65  142:astore_3        
	//*  66  143:aload_3         
	//*  67  144:ifnonnull       152
	//*  68  147:iconst_0        
	//*  69  148:istore_0        
	//*  70  149:goto            157
	//*  71  152:aload_3         
	//*  72  153:invokevirtual   #305 <Method boolean PowerManager.isScreenOn()>
	//*  73  156:istore_0        
	//*  74  157:iload_2         
	//*  75  158:istore_1        
	//*  76  159:iload_0         
	//*  77  160:ifeq            165
	//*  78  163:iconst_1        
	//*  79  164:istore_1        
	//*  80  165:iload_1         
	//*  81  166:ireturn         
		catch(Throwable throwable)
	//*  82  167:astore_3        
		{
			zzbv.zzeo().zza(throwable, "ContentFetchTask.isInForeground");
	//   83  168:invokestatic    #309 <Method zzajm zzbv.zzeo()>
	//   84  171:aload_3         
	//   85  172:ldc2            #311 <String "ContentFetchTask.isInForeground">
	//   86  175:invokevirtual   #316 <Method void zzajm.zza(Throwable, String)>
			return false;
	//   87  178:iconst_0        
	//   88  179:ireturn         
		}
		if(obj == null)
			return false;
		obj1 = ((Object) ((ActivityManager)((Context) (obj)).getSystemService("activity")));
		keyguardmanager = (KeyguardManager)((Context) (obj)).getSystemService("keyguard");
		flag1 = flag2;
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_165;
		if(keyguardmanager == null)
			return false;
		obj1 = ((Object) (((ActivityManager) (obj1)).getRunningAppProcesses()));
		if(obj1 == null)
			return false;
		obj1 = ((Object) (((List) (obj1)).iterator()));
_L2:
		flag1 = flag2;
		if(!((Iterator) (obj1)).hasNext())
			break MISSING_BLOCK_LABEL_165;
		runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
		if(Process.myPid() != runningappprocessinfo.pid) goto _L2; else goto _L1
_L1:
		flag1 = flag2;
		if(runningappprocessinfo.importance != 100)
			break MISSING_BLOCK_LABEL_165;
		flag1 = flag2;
		if(keyguardmanager.inKeyguardRestrictedInputMode())
			break MISSING_BLOCK_LABEL_165;
		obj = ((Object) ((PowerManager)((Context) (obj)).getSystemService("power")));
		if(obj == null)
		{
			flag = false;
			break MISSING_BLOCK_LABEL_157;
		}
		flag = ((PowerManager) (obj)).isScreenOn();
		flag1 = flag2;
		if(flag)
			flag1 = true;
		return flag1;
	}

	private final void zzgz()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzahy = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #40  <Field boolean zzahy>
			boolean flag = zzahy;
	//    8   12:aload_0         
	//    9   13:getfield        #40  <Field boolean zzahy>
	//   10   16:istore_1        
			StringBuilder stringbuilder = new StringBuilder(42);
	//   11   17:new             #319 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:bipush          42
	//   14   23:invokespecial   #322 <Method void StringBuilder(int)>
	//   15   26:astore_3        
			stringbuilder.append("ContentFetchThread: paused, mPause = ");
	//   16   27:aload_3         
	//   17   28:ldc2            #324 <String "ContentFetchThread: paused, mPause = ">
	//   18   31:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			stringbuilder.append(flag);
	//   20   35:aload_3         
	//   21   36:iload_1         
	//   22   37:invokevirtual   #331 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   40:pop             
			zzakb.zzck(stringbuilder.toString());
	//   24   41:aload_3         
	//   25   42:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   26   45:invokestatic    #337 <Method void zzakb.zzck(String)>
		}
	//   27   48:aload_2         
	//   28   49:monitorexit     
		return;
	//   29   50:return          
		exception;
	//   30   51:astore_3        
		obj;
	//   31   52:aload_2         
		JVM INSTR monitorexit ;
	//   32   53:monitorexit     
		throw exception;
	//   33   54:aload_3         
	//   34   55:athrow          
	}

	public final void run()
	{
_L11:
		if(!zzgx()) goto _L2; else goto _L1
	//    0    0:invokestatic    #344 <Method boolean zzgx()>
	//    1    3:ifeq            124
_L1:
		Activity activity = zzbv.zzen().getActivity();
	//    2    6:invokestatic    #243 <Method zzgg zzbv.zzen()>
	//    3    9:invokevirtual   #348 <Method Activity zzgg.getActivity()>
	//    4   12:astore          4
		if(activity != null) goto _L4; else goto _L3
	//    5   14:aload           4
	//    6   16:ifnonnull       32
_L3:
		zzakb.zzck("ContentFetchThread: no activity. Sleeping.");
	//    7   19:ldc2            #350 <String "ContentFetchThread: no activity. Sleeping.">
	//    8   22:invokestatic    #337 <Method void zzakb.zzck(String)>
_L6:
		zzgz();
	//    9   25:aload_0         
	//   10   26:invokespecial   #352 <Method void zzgz()>
		break MISSING_BLOCK_LABEL_133;
	//   11   29:goto            133
_L4:
		Object obj;
		Object obj1;
		if(activity == null)
			break MISSING_BLOCK_LABEL_133;
	//   12   32:aload           4
	//   13   34:ifnull          133
		obj1 = null;
	//   14   37:aconst_null     
	//   15   38:astore_3        
		obj = ((Object) (obj1));
	//   16   39:aload_3         
	//   17   40:astore_2        
		if(activity.getWindow() == null)
			break MISSING_BLOCK_LABEL_99;
	//   18   41:aload           4
	//   19   43:invokevirtual   #358 <Method Window Activity.getWindow()>
	//   20   46:ifnull          99
		obj = ((Object) (obj1));
	//   21   49:aload_3         
	//   22   50:astore_2        
		if(activity.getWindow().getDecorView() != null)
	//*  23   51:aload           4
	//*  24   53:invokevirtual   #358 <Method Window Activity.getWindow()>
	//*  25   56:invokevirtual   #364 <Method View Window.getDecorView()>
	//*  26   59:ifnull          99
			obj = ((Object) (activity.getWindow().getDecorView().findViewById(0x1020002)));
	//   27   62:aload           4
	//   28   64:invokevirtual   #358 <Method Window Activity.getWindow()>
	//   29   67:invokevirtual   #364 <Method View Window.getDecorView()>
	//   30   70:ldc2            #365 <Int 0x1020002>
	//   31   73:invokevirtual   #368 <Method View View.findViewById(int)>
	//   32   76:astore_2        
		break MISSING_BLOCK_LABEL_99;
	//   33   77:goto            99
		obj;
	//   34   80:astore_2        
		zzbv.zzeo().zza(((Throwable) (obj)), "ContentFetchTask.extractContent");
	//   35   81:invokestatic    #309 <Method zzajm zzbv.zzeo()>
	//   36   84:aload_2         
	//   37   85:ldc2            #370 <String "ContentFetchTask.extractContent">
	//   38   88:invokevirtual   #316 <Method void zzajm.zza(Throwable, String)>
		zzakb.zzck("Failed getting root view of activity. Content not extracted.");
	//   39   91:ldc2            #372 <String "Failed getting root view of activity. Content not extracted.">
	//   40   94:invokestatic    #337 <Method void zzakb.zzck(String)>
		obj = ((Object) (obj1));
	//   41   97:aload_3         
	//   42   98:astore_2        
		if(obj == null || obj == null)
			break MISSING_BLOCK_LABEL_133;
	//   43   99:aload_2         
	//   44  100:ifnull          133
	//   45  103:aload_2         
	//   46  104:ifnull          133
		((View) (obj)).post(((Runnable) (new zzgl(this, ((View) (obj))))));
	//   47  107:aload_2         
	//   48  108:new             #374 <Class zzgl>
	//   49  111:dup             
	//   50  112:aload_0         
	//   51  113:aload_2         
	//   52  114:invokespecial   #377 <Method void zzgl(zzgk, View)>
	//   53  117:invokevirtual   #378 <Method boolean View.post(Runnable)>
	//   54  120:pop             
		break MISSING_BLOCK_LABEL_133;
	//   55  121:goto            133
_L2:
		zzakb.zzck("ContentFetchTask: sleeping");
	//   56  124:ldc2            #380 <String "ContentFetchTask: sleeping">
	//   57  127:invokestatic    #337 <Method void zzakb.zzck(String)>
		if(true) goto _L6; else goto _L5
	//   58  130:goto            25
_L5:
		try
		{
			Thread.sleep(zzaib * 1000);
	//   59  133:aload_0         
	//   60  134:getfield        #112 <Field int zzaib>
	//   61  137:sipush          1000
	//   62  140:imul            
	//   63  141:i2l             
	//   64  142:invokestatic    #384 <Method void Thread.sleep(long)>
		}
	//*  65  145:goto            180
	//*  66  148:astore_2        
	//*  67  149:ldc2            #386 <String "Error in ContentFetchTask">
	//*  68  152:aload_2         
	//*  69  153:invokestatic    #389 <Method void zzakb.zzb(String, Throwable)>
	//*  70  156:aload_0         
	//*  71  157:getfield        #46  <Field zzadf zzaia>
	//*  72  160:aload_2         
	//*  73  161:ldc2            #391 <String "ContentFetchTask.run">
	//*  74  164:invokeinterface #394 <Method void zzadf.zza(Throwable, String)>
	//*  75  169:goto            180
		catch(InterruptedException interruptedexception)
	//*  76  172:astore_2        
		{
			zzakb.zzb("Error in ContentFetchTask", ((Throwable) (interruptedexception)));
	//   77  173:ldc2            #386 <String "Error in ContentFetchTask">
	//   78  176:aload_2         
	//   79  177:invokestatic    #389 <Method void zzakb.zzb(String, Throwable)>
		}
		catch(Exception exception)
		{
			zzakb.zzb("Error in ContentFetchTask", ((Throwable) (exception)));
			zzaia.zza(((Throwable) (exception)), "ContentFetchTask.run");
		}
		interruptedexception = ((InterruptedException) (mLock));
	//   80  180:aload_0         
	//   81  181:getfield        #51  <Field Object mLock>
	//   82  184:astore_2        
		interruptedexception;
	//   83  185:aload_2         
		JVM INSTR monitorenter ;
	//   84  186:monitorenter    
_L9:
		boolean flag = zzahy;
	//   85  187:aload_0         
	//   86  188:getfield        #40  <Field boolean zzahy>
	//   87  191:istore_1        
		if(!flag) goto _L8; else goto _L7
	//   88  192:iload_1         
	//   89  193:ifeq            212
_L7:
		Exception exception1;
		try
		{
			zzakb.zzck("ContentFetchTask: waiting");
	//   90  196:ldc2            #396 <String "ContentFetchTask: waiting">
	//   91  199:invokestatic    #337 <Method void zzakb.zzck(String)>
			mLock.wait();
	//   92  202:aload_0         
	//   93  203:getfield        #51  <Field Object mLock>
	//   94  206:invokevirtual   #399 <Method void Object.wait()>
		}
	//*  95  209:goto            187
	//*  96  212:aload_2         
	//*  97  213:monitorexit     
	//*  98  214:goto            0
	//*  99  217:astore_3        
	//* 100  218:aload_2         
	//* 101  219:monitorexit     
	//* 102  220:aload_3         
	//* 103  221:athrow          
		catch(InterruptedException interruptedexception1) { }
	//  104  222:astore_3        
		if(true) goto _L9; else goto _L8
	//  105  223:goto            187
_L8:
		interruptedexception;
		JVM INSTR monitorexit ;
		if(true) goto _L11; else goto _L10
_L10:
		exception1;
		interruptedexception;
		JVM INSTR monitorexit ;
		throw exception1;
	}

	public final void wakeup()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzahy = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #40  <Field boolean zzahy>
			mLock.notifyAll();
	//    8   12:aload_0         
	//    9   13:getfield        #51  <Field Object mLock>
	//   10   16:invokevirtual   #403 <Method void Object.notifyAll()>
			zzakb.zzck("ContentFetchThread: wakeup");
	//   11   19:ldc2            #405 <String "ContentFetchThread: wakeup">
	//   12   22:invokestatic    #337 <Method void zzakb.zzck(String)>
		}
	//   13   25:aload_1         
	//   14   26:monitorexit     
		return;
	//   15   27:return          
		exception;
	//   16   28:astore_2        
		obj;
	//   17   29:aload_1         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		throw exception;
	//   19   31:aload_2         
	//   20   32:athrow          
	}

	final void zza(zzge zzge1, WebView webview, String s, boolean flag)
	{
		zzge1.zzgr();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #411 <Method void zzge.zzgr()>
		try
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
				break MISSING_BLOCK_LABEL_157;
	//    2    4:aload_3         
	//    3    5:invokestatic    #169 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4    8:ifne            157
			s = (new JSONObject(s)).optString("text");
	//    5   11:new             #413 <Class JSONObject>
	//    6   14:dup             
	//    7   15:aload_3         
	//    8   16:invokespecial   #415 <Method void JSONObject(String)>
	//    9   19:ldc2            #417 <String "text">
	//   10   22:invokevirtual   #421 <Method String JSONObject.optString(String)>
	//   11   25:astore_3        
			if(!zzaii && !TextUtils.isEmpty(((CharSequence) (webview.getTitle()))))
	//*  12   26:aload_0         
	//*  13   27:getfield        #130 <Field boolean zzaii>
	//*  14   30:ifne            132
	//*  15   33:aload_2         
	//*  16   34:invokevirtual   #424 <Method String WebView.getTitle()>
	//*  17   37:invokestatic    #169 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   40:ifne            132
			{
				String s1 = webview.getTitle();
	//   19   43:aload_2         
	//   20   44:invokevirtual   #424 <Method String WebView.getTitle()>
	//   21   47:astore          5
				StringBuilder stringbuilder = new StringBuilder(1 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s))).length());
	//   22   49:new             #319 <Class StringBuilder>
	//   23   52:dup             
	//   24   53:iconst_1        
	//   25   54:aload           5
	//   26   56:invokestatic    #428 <Method String String.valueOf(Object)>
	//   27   59:invokevirtual   #431 <Method int String.length()>
	//   28   62:iadd            
	//   29   63:aload_3         
	//   30   64:invokestatic    #428 <Method String String.valueOf(Object)>
	//   31   67:invokevirtual   #431 <Method int String.length()>
	//   32   70:iadd            
	//   33   71:invokespecial   #322 <Method void StringBuilder(int)>
	//   34   74:astore          6
				stringbuilder.append(s1);
	//   35   76:aload           6
	//   36   78:aload           5
	//   37   80:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
				stringbuilder.append("\n");
	//   39   84:aload           6
	//   40   86:ldc2            #433 <String "\n">
	//   41   89:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
				stringbuilder.append(s);
	//   43   93:aload           6
	//   44   95:aload_3         
	//   45   96:invokevirtual   #328 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
				zzge1.zza(stringbuilder.toString(), flag, webview.getX(), webview.getY(), webview.getWidth(), webview.getHeight());
	//   47  100:aload_1         
	//   48  101:aload           6
	//   49  103:invokevirtual   #332 <Method String StringBuilder.toString()>
	//   50  106:iload           4
	//   51  108:aload_2         
	//   52  109:invokevirtual   #434 <Method float WebView.getX()>
	//   53  112:aload_2         
	//   54  113:invokevirtual   #435 <Method float WebView.getY()>
	//   55  116:aload_2         
	//   56  117:invokevirtual   #436 <Method int WebView.getWidth()>
	//   57  120:i2f             
	//   58  121:aload_2         
	//   59  122:invokevirtual   #437 <Method int WebView.getHeight()>
	//   60  125:i2f             
	//   61  126:invokevirtual   #439 <Method void zzge.zza(String, boolean, float, float, float, float)>
				break MISSING_BLOCK_LABEL_157;
	//   62  129:goto            157
			}
		}
	//*  63  132:aload_1         
	//*  64  133:aload_3         
	//*  65  134:iload           4
	//*  66  136:aload_2         
	//*  67  137:invokevirtual   #434 <Method float WebView.getX()>
	//*  68  140:aload_2         
	//*  69  141:invokevirtual   #435 <Method float WebView.getY()>
	//*  70  144:aload_2         
	//*  71  145:invokevirtual   #436 <Method int WebView.getWidth()>
	//*  72  148:i2f             
	//*  73  149:aload_2         
	//*  74  150:invokevirtual   #437 <Method int WebView.getHeight()>
	//*  75  153:i2f             
	//*  76  154:invokevirtual   #439 <Method void zzge.zza(String, boolean, float, float, float, float)>
	//*  77  157:aload_1         
	//*  78  158:invokevirtual   #442 <Method boolean zzge.zzgn()>
	//*  79  161:ifeq            173
	//*  80  164:aload_0         
	//*  81  165:getfield        #44  <Field zzgf zzahz>
	//*  82  168:aload_1         
	//*  83  169:invokevirtual   #447 <Method boolean zzgf.zzb(zzge)>
	//*  84  172:pop             
	//*  85  173:return          
	//*  86  174:astore_1        
	//*  87  175:ldc2            #449 <String "Failed to get webview content.">
	//*  88  178:aload_1         
	//*  89  179:invokestatic    #451 <Method void zzakb.zza(String, Throwable)>
	//*  90  182:aload_0         
	//*  91  183:getfield        #46  <Field zzadf zzaia>
	//*  92  186:aload_1         
	//*  93  187:ldc2            #453 <String "ContentFetchTask.processWebViewContent">
	//*  94  190:invokeinterface #394 <Method void zzadf.zza(Throwable, String)>
	//*  95  195:return          
	//*  96  196:ldc2            #455 <String "Json string may be malformed.">
	//*  97  199:invokestatic    #337 <Method void zzakb.zzck(String)>
	//*  98  202:return          
		// Misplaced declaration of an exception variable
		catch(zzge zzge1)
		{
			zzakb.zzck("Json string may be malformed.");
			return;
		}
		// Misplaced declaration of an exception variable
		catch(zzge zzge1)
		{
			zzakb.zza("Failed to get webview content.", ((Throwable) (zzge1)));
			zzaia.zza(((Throwable) (zzge1)), "ContentFetchTask.processWebViewContent");
			return;
		}
		zzge1.zza(s, flag, webview.getX(), webview.getY(), webview.getWidth(), webview.getHeight());
		if(zzge1.zzgn())
			zzahz.zzb(zzge1);
		return;
	//*  99  203:astore_1        
	//* 100  204:goto            196
	}

	public final void zzgw()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!mStarted)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field boolean mStarted>
	//    7   11:ifeq            23
				zzakb.zzck("Content hash thread already started, quiting...");
	//    8   14:ldc2            #458 <String "Content hash thread already started, quiting...">
	//    9   17:invokestatic    #337 <Method void zzakb.zzck(String)>
			}
	//   10   20:aload_1         
	//   11   21:monitorexit     
			return;
	//   12   22:return          
		}
		mStarted = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #38  <Field boolean mStarted>
		obj;
	//   16   28:aload_1         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		start();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #461 <Method void start()>
		return;
	//   20   34:return          
		exception;
	//   21   35:astore_2        
		obj;
	//   22   36:aload_1         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		throw exception;
	//   24   38:aload_2         
	//   25   39:athrow          
	}

	public final zzge zzgy()
	{
		return zzahz.zzgv();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field zzgf zzahz>
	//    2    4:invokevirtual   #466 <Method zzge zzgf.zzgv()>
	//    3    7:areturn         
	}

	public final boolean zzha()
	{
		return zzahy;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzahy>
	//    2    4:ireturn         
	}

	final void zzk(View view)
	{
		zzge zzge1;
		Object obj;
		zzge1 = new zzge(zzagx, zzaic, zzagz, zzaid, zzaie, zzaif, zzaig);
	//    0    0:new             #190 <Class zzge>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #77  <Field int zzagx>
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field int zzaic>
	//    6   12:aload_0         
	//    7   13:getfield        #87  <Field int zzagz>
	//    8   16:aload_0         
	//    9   17:getfield        #92  <Field int zzaid>
	//   10   20:aload_0         
	//   11   21:getfield        #97  <Field int zzaie>
	//   12   24:aload_0         
	//   13   25:getfield        #102 <Field int zzaif>
	//   14   28:aload_0         
	//   15   29:getfield        #107 <Field int zzaig>
	//   16   32:invokespecial   #472 <Method void zzge(int, int, int, int, int, int, int)>
	//   17   35:astore_2        
		obj = ((Object) (zzbv.zzen().getContext()));
	//   18   36:invokestatic    #243 <Method zzgg zzbv.zzen()>
	//   19   39:invokevirtual   #249 <Method Context zzgg.getContext()>
	//   20   42:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_115;
	//   21   43:aload_3         
	//   22   44:ifnull          115
		if(TextUtils.isEmpty(((CharSequence) (zzaih))))
			break MISSING_BLOCK_LABEL_115;
	//   23   47:aload_0         
	//   24   48:getfield        #119 <Field String zzaih>
	//   25   51:invokestatic    #169 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   26   54:ifne            115
		Resources resources = ((Context) (obj)).getResources();
	//   27   57:aload_3         
	//   28   58:invokevirtual   #476 <Method Resources Context.getResources()>
	//   29   61:astore          4
		zzna zzna = zznk.zzawv;
	//   30   63:getstatic       #479 <Field zzna zznk.zzawv>
	//   31   66:astore          5
		obj = ((Object) ((String)view.getTag(resources.getIdentifier((String)zzkb.zzik().zzd(zzna), "id", ((Context) (obj)).getPackageName()))));
	//   32   68:aload_1         
	//   33   69:aload           4
	//   34   71:invokestatic    #63  <Method zzni zzkb.zzik()>
	//   35   74:aload           5
	//   36   76:invokevirtual   #69  <Method Object zzni.zzd(zzna)>
	//   37   79:checkcast       #117 <Class String>
	//   38   82:ldc2            #481 <String "id">
	//   39   85:aload_3         
	//   40   86:invokevirtual   #484 <Method String Context.getPackageName()>
	//   41   89:invokevirtual   #490 <Method int Resources.getIdentifier(String, String, String)>
	//   42   92:invokevirtual   #494 <Method Object View.getTag(int)>
	//   43   95:checkcast       #117 <Class String>
	//   44   98:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_115;
	//   45   99:aload_3         
	//   46  100:ifnull          115
		if(((String) (obj)).equals(((Object) (zzaih))))
	//*  47  103:aload_3         
	//*  48  104:aload_0         
	//*  49  105:getfield        #119 <Field String zzaih>
	//*  50  108:invokevirtual   #498 <Method boolean String.equals(Object)>
	//*  51  111:ifeq            115
			return;
	//   52  114:return          
		view = ((View) (zza(view, zzge1)));
	//   53  115:aload_0         
	//   54  116:aload_1         
	//   55  117:aload_2         
	//   56  118:invokespecial   #226 <Method zzgo zza(View, zzge)>
	//   57  121:astore_1        
		zzge1.zzgt();
	//   58  122:aload_2         
	//   59  123:invokevirtual   #501 <Method void zzge.zzgt()>
		if(((zzgo) (view)).zzaiq == 0 && ((zzgo) (view)).zzair == 0)
	//*  60  126:aload_1         
	//*  61  127:getfield        #229 <Field int zzgo.zzaiq>
	//*  62  130:ifne            141
	//*  63  133:aload_1         
	//*  64  134:getfield        #232 <Field int zzgo.zzair>
	//*  65  137:ifne            141
			return;
	//   66  140:return          
		if(((zzgo) (view)).zzair == 0 && zzge1.zzgu() == 0)
	//*  67  141:aload_1         
	//*  68  142:getfield        #232 <Field int zzgo.zzair>
	//*  69  145:ifne            156
	//*  70  148:aload_2         
	//*  71  149:invokevirtual   #504 <Method int zzge.zzgu()>
	//*  72  152:ifne            156
			return;
	//   73  155:return          
		if(((zzgo) (view)).zzair == 0 && zzahz.zza(zzge1))
	//*  74  156:aload_1         
	//*  75  157:getfield        #232 <Field int zzgo.zzair>
	//*  76  160:ifne            175
	//*  77  163:aload_0         
	//*  78  164:getfield        #44  <Field zzgf zzahz>
	//*  79  167:aload_2         
	//*  80  168:invokevirtual   #506 <Method boolean zzgf.zza(zzge)>
	//*  81  171:ifeq            175
			return;
	//   82  174:return          
		try
		{
			zzahz.zzc(zzge1);
	//   83  175:aload_0         
	//   84  176:getfield        #44  <Field zzgf zzahz>
	//   85  179:aload_2         
	//   86  180:invokevirtual   #510 <Method void zzgf.zzc(zzge)>
			return;
	//   87  183:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  88  184:astore_1        
		{
			zzakb.zzb("Exception in fetchContentOnUIThread", ((Throwable) (view)));
	//   89  185:ldc2            #512 <String "Exception in fetchContentOnUIThread">
	//   90  188:aload_1         
	//   91  189:invokestatic    #389 <Method void zzakb.zzb(String, Throwable)>
		}
		zzaia.zza(((Throwable) (view)), "ContentFetchTask.fetchContent");
	//   92  192:aload_0         
	//   93  193:getfield        #46  <Field zzadf zzaia>
	//   94  196:aload_1         
	//   95  197:ldc2            #514 <String "ContentFetchTask.fetchContent">
	//   96  200:invokeinterface #394 <Method void zzadf.zza(Throwable, String)>
		return;
	//   97  205:return          
	}

	private final Object mLock = new Object();
	private boolean mStarted;
	private final int zzagx;
	private final int zzagz;
	private boolean zzahy;
	private final zzgf zzahz;
	private final zzadf zzaia;
	private final int zzaib;
	private final int zzaic;
	private final int zzaid;
	private final int zzaie;
	private final int zzaif;
	private final int zzaig;
	private final String zzaih;
	private final boolean zzaii;
	private boolean zzbm;
}
