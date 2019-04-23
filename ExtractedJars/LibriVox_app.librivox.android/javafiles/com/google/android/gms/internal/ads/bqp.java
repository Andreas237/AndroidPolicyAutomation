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
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.o;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqk, p, bwk, m, 
//			bqu, bqj, afn, bqr, 
//			bql, wi, wx, bqq

public final class bqp extends Thread
{

	public bqp()
	{
		this(new bqk());
	//    0    0:aload_0         
	//    1    1:new             #33  <Class bqk>
	//    2    4:dup             
	//    3    5:invokespecial   #35  <Method void bqk()>
	//    4    8:invokespecial   #38  <Method void bqp(bqk)>
	//    5   11:return          
	}

	private bqp(bqk bqk1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Thread()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #42  <Field boolean a>
		b = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #44  <Field boolean b>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #46  <Field boolean c>
		e = bqk1;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #48  <Field bqk e>
		d = new Object();
	//   14   24:aload_0         
	//   15   25:new             #50  <Class Object>
	//   16   28:dup             
	//   17   29:invokespecial   #51  <Method void Object()>
	//   18   32:putfield        #53  <Field Object d>
		bqk1 = ((bqk) (p.O));
	//   19   35:getstatic       #59  <Field e p.O>
	//   20   38:astore_1        
		g = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   21   39:aload_0         
	//   22   40:invokestatic    #64  <Method m bwk.e()>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #69  <Method Object m.a(e)>
	//   25   47:checkcast       #71  <Class Integer>
	//   26   50:invokevirtual   #75  <Method int Integer.intValue()>
	//   27   53:putfield        #77  <Field int g>
		bqk1 = ((bqk) (p.P));
	//   28   56:getstatic       #80  <Field e p.P>
	//   29   59:astore_1        
		h = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   30   60:aload_0         
	//   31   61:invokestatic    #64  <Method m bwk.e()>
	//   32   64:aload_1         
	//   33   65:invokevirtual   #69  <Method Object m.a(e)>
	//   34   68:checkcast       #71  <Class Integer>
	//   35   71:invokevirtual   #75  <Method int Integer.intValue()>
	//   36   74:putfield        #82  <Field int h>
		bqk1 = ((bqk) (p.Q));
	//   37   77:getstatic       #85  <Field e p.Q>
	//   38   80:astore_1        
		i = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   39   81:aload_0         
	//   40   82:invokestatic    #64  <Method m bwk.e()>
	//   41   85:aload_1         
	//   42   86:invokevirtual   #69  <Method Object m.a(e)>
	//   43   89:checkcast       #71  <Class Integer>
	//   44   92:invokevirtual   #75  <Method int Integer.intValue()>
	//   45   95:putfield        #87  <Field int i>
		bqk1 = ((bqk) (p.R));
	//   46   98:getstatic       #90  <Field e p.R>
	//   47  101:astore_1        
		j = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   48  102:aload_0         
	//   49  103:invokestatic    #64  <Method m bwk.e()>
	//   50  106:aload_1         
	//   51  107:invokevirtual   #69  <Method Object m.a(e)>
	//   52  110:checkcast       #71  <Class Integer>
	//   53  113:invokevirtual   #75  <Method int Integer.intValue()>
	//   54  116:putfield        #92  <Field int j>
		bqk1 = ((bqk) (p.T));
	//   55  119:getstatic       #95  <Field e p.T>
	//   56  122:astore_1        
		k = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   57  123:aload_0         
	//   58  124:invokestatic    #64  <Method m bwk.e()>
	//   59  127:aload_1         
	//   60  128:invokevirtual   #69  <Method Object m.a(e)>
	//   61  131:checkcast       #71  <Class Integer>
	//   62  134:invokevirtual   #75  <Method int Integer.intValue()>
	//   63  137:putfield        #97  <Field int k>
		bqk1 = ((bqk) (p.U));
	//   64  140:getstatic       #100 <Field e p.U>
	//   65  143:astore_1        
		l = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   66  144:aload_0         
	//   67  145:invokestatic    #64  <Method m bwk.e()>
	//   68  148:aload_1         
	//   69  149:invokevirtual   #69  <Method Object m.a(e)>
	//   70  152:checkcast       #71  <Class Integer>
	//   71  155:invokevirtual   #75  <Method int Integer.intValue()>
	//   72  158:putfield        #102 <Field int l>
		bqk1 = ((bqk) (p.V));
	//   73  161:getstatic       #105 <Field e p.V>
	//   74  164:astore_1        
		m = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   75  165:aload_0         
	//   76  166:invokestatic    #64  <Method m bwk.e()>
	//   77  169:aload_1         
	//   78  170:invokevirtual   #69  <Method Object m.a(e)>
	//   79  173:checkcast       #71  <Class Integer>
	//   80  176:invokevirtual   #75  <Method int Integer.intValue()>
	//   81  179:putfield        #107 <Field int m>
		bqk1 = ((bqk) (p.S));
	//   82  182:getstatic       #110 <Field e p.S>
	//   83  185:astore_1        
		f = ((Integer)bwk.e().a(((e) (bqk1)))).intValue();
	//   84  186:aload_0         
	//   85  187:invokestatic    #64  <Method m bwk.e()>
	//   86  190:aload_1         
	//   87  191:invokevirtual   #69  <Method Object m.a(e)>
	//   88  194:checkcast       #71  <Class Integer>
	//   89  197:invokevirtual   #75  <Method int Integer.intValue()>
	//   90  200:putfield        #112 <Field int f>
		bqk1 = ((bqk) (p.X));
	//   91  203:getstatic       #115 <Field e p.X>
	//   92  206:astore_1        
		n = (String)bwk.e().a(((e) (bqk1)));
	//   93  207:aload_0         
	//   94  208:invokestatic    #64  <Method m bwk.e()>
	//   95  211:aload_1         
	//   96  212:invokevirtual   #69  <Method Object m.a(e)>
	//   97  215:checkcast       #117 <Class String>
	//   98  218:putfield        #119 <Field String n>
		bqk1 = ((bqk) (p.Y));
	//   99  221:getstatic       #122 <Field e p.Y>
	//  100  224:astore_1        
		o = ((Boolean)bwk.e().a(((e) (bqk1)))).booleanValue();
	//  101  225:aload_0         
	//  102  226:invokestatic    #64  <Method m bwk.e()>
	//  103  229:aload_1         
	//  104  230:invokevirtual   #69  <Method Object m.a(e)>
	//  105  233:checkcast       #124 <Class Boolean>
	//  106  236:invokevirtual   #128 <Method boolean Boolean.booleanValue()>
	//  107  239:putfield        #130 <Field boolean o>
		setName("ContentFetchTask");
	//  108  242:aload_0         
	//  109  243:ldc1            #132 <String "ContentFetchTask">
	//  110  245:invokevirtual   #136 <Method void setName(String)>
	//  111  248:return          
	}

	private final bqu a(View view, bqj bqj1)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(view == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       18
			return new bqu(this, 0, 0);
	//    4    7:new             #139 <Class bqu>
	//    5   10:dup             
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:iconst_0        
	//    9   14:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//   10   17:areturn         
		boolean flag1 = view.getGlobalVisibleRect(new Rect());
	//   11   18:aload_1         
	//   12   19:new             #144 <Class Rect>
	//   13   22:dup             
	//   14   23:invokespecial   #145 <Method void Rect()>
	//   15   26:invokevirtual   #151 <Method boolean View.getGlobalVisibleRect(Rect)>
	//   16   29:istore          6
		if((view instanceof TextView) && !(view instanceof EditText))
	//*  17   31:aload_1         
	//*  18   32:instanceof      #153 <Class TextView>
	//*  19   35:ifeq            115
	//*  20   38:aload_1         
	//*  21   39:instanceof      #155 <Class EditText>
	//*  22   42:ifne            115
		{
			CharSequence charsequence = ((TextView)view).getText();
	//   23   45:aload_1         
	//   24   46:checkcast       #153 <Class TextView>
	//   25   49:invokevirtual   #159 <Method CharSequence TextView.getText()>
	//   26   52:astore          7
			if(!TextUtils.isEmpty(charsequence))
	//*  27   54:aload           7
	//*  28   56:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  29   59:ifne            104
			{
				bqj1.b(charsequence.toString(), flag1, view.getX(), view.getY(), view.getWidth(), view.getHeight());
	//   30   62:aload_2         
	//   31   63:aload           7
	//   32   65:invokeinterface #171 <Method String CharSequence.toString()>
	//   33   70:iload           6
	//   34   72:aload_1         
	//   35   73:invokevirtual   #175 <Method float View.getX()>
	//   36   76:aload_1         
	//   37   77:invokevirtual   #178 <Method float View.getY()>
	//   38   80:aload_1         
	//   39   81:invokevirtual   #181 <Method int View.getWidth()>
	//   40   84:i2f             
	//   41   85:aload_1         
	//   42   86:invokevirtual   #184 <Method int View.getHeight()>
	//   43   89:i2f             
	//   44   90:invokevirtual   #189 <Method void bqj.b(String, boolean, float, float, float, float)>
				return new bqu(this, 1, 0);
	//   45   93:new             #139 <Class bqu>
	//   46   96:dup             
	//   47   97:aload_0         
	//   48   98:iconst_1        
	//   49   99:iconst_0        
	//   50  100:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//   51  103:areturn         
			} else
			{
				return new bqu(this, 0, 0);
	//   52  104:new             #139 <Class bqu>
	//   53  107:dup             
	//   54  108:aload_0         
	//   55  109:iconst_0        
	//   56  110:iconst_0        
	//   57  111:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//   58  114:areturn         
			}
		}
		if((view instanceof WebView) && !(view instanceof afn))
	//*  59  115:aload_1         
	//*  60  116:instanceof      #191 <Class WebView>
	//*  61  119:ifeq            198
	//*  62  122:aload_1         
	//*  63  123:instanceof      #193 <Class afn>
	//*  64  126:ifne            198
		{
			bqj1.g();
	//   65  129:aload_2         
	//   66  130:invokevirtual   #195 <Method void bqj.g()>
			view = ((View) ((WebView)view));
	//   67  133:aload_1         
	//   68  134:checkcast       #191 <Class WebView>
	//   69  137:astore_1        
			boolean flag;
			if(!com.google.android.gms.common.util.o.f())
	//*  70  138:invokestatic    #199 <Method boolean o.f()>
	//*  71  141:ifne            149
			{
				flag = false;
	//   72  144:iconst_0        
	//   73  145:istore_3        
			} else
	//*  74  146:goto            172
			{
				bqj1.g();
	//   75  149:aload_2         
	//   76  150:invokevirtual   #195 <Method void bqj.g()>
				((WebView) (view)).post(((Runnable) (new bqr(this, bqj1, ((WebView) (view)), flag1))));
	//   77  153:aload_1         
	//   78  154:new             #201 <Class bqr>
	//   79  157:dup             
	//   80  158:aload_0         
	//   81  159:aload_2         
	//   82  160:aload_1         
	//   83  161:iload           6
	//   84  163:invokespecial   #204 <Method void bqr(bqp, bqj, WebView, boolean)>
	//   85  166:invokevirtual   #208 <Method boolean WebView.post(Runnable)>
	//   86  169:pop             
				flag = true;
	//   87  170:iconst_1        
	//   88  171:istore_3        
			}
			if(flag)
	//*  89  172:iload_3         
	//*  90  173:ifeq            187
				return new bqu(this, 0, 1);
	//   91  176:new             #139 <Class bqu>
	//   92  179:dup             
	//   93  180:aload_0         
	//   94  181:iconst_0        
	//   95  182:iconst_1        
	//   96  183:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//   97  186:areturn         
			else
				return new bqu(this, 0, 0);
	//   98  187:new             #139 <Class bqu>
	//   99  190:dup             
	//  100  191:aload_0         
	//  101  192:iconst_0        
	//  102  193:iconst_0        
	//  103  194:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//  104  197:areturn         
		}
		if(view instanceof ViewGroup)
	//* 105  198:aload_1         
	//* 106  199:instanceof      #210 <Class ViewGroup>
	//* 107  202:ifeq            276
		{
			view = ((View) ((ViewGroup)view));
	//  108  205:aload_1         
	//  109  206:checkcast       #210 <Class ViewGroup>
	//  110  209:astore_1        
			int k1 = 0;
	//  111  210:iconst_0        
	//  112  211:istore          5
			int i1 = 0;
	//  113  213:iconst_0        
	//  114  214:istore_3        
			for(; j1 < ((ViewGroup) (view)).getChildCount(); j1++)
	//* 115  215:iload           4
	//* 116  217:aload_1         
	//* 117  218:invokevirtual   #213 <Method int ViewGroup.getChildCount()>
	//* 118  221:icmpge          264
			{
				bqu bqu1 = a(((ViewGroup) (view)).getChildAt(j1), bqj1);
	//  119  224:aload_0         
	//  120  225:aload_1         
	//  121  226:iload           4
	//  122  228:invokevirtual   #217 <Method View ViewGroup.getChildAt(int)>
	//  123  231:aload_2         
	//  124  232:invokespecial   #219 <Method bqu a(View, bqj)>
	//  125  235:astore          7
				k1 += bqu1.a;
	//  126  237:iload           5
	//  127  239:aload           7
	//  128  241:getfield        #221 <Field int bqu.a>
	//  129  244:iadd            
	//  130  245:istore          5
				i1 += bqu1.b;
	//  131  247:iload_3         
	//  132  248:aload           7
	//  133  250:getfield        #223 <Field int bqu.b>
	//  134  253:iadd            
	//  135  254:istore_3        
			}

	//  136  255:iload           4
	//  137  257:iconst_1        
	//  138  258:iadd            
	//  139  259:istore          4
	//* 140  261:goto            215
			return new bqu(this, k1, i1);
	//  141  264:new             #139 <Class bqu>
	//  142  267:dup             
	//  143  268:aload_0         
	//  144  269:iload           5
	//  145  271:iload_3         
	//  146  272:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//  147  275:areturn         
		} else
		{
			return new bqu(this, 0, 0);
	//  148  276:new             #139 <Class bqu>
	//  149  279:dup             
	//  150  280:aload_0         
	//  151  281:iconst_0        
	//  152  282:iconst_0        
	//  153  283:invokespecial   #142 <Method void bqu(bqp, int, int)>
	//  154  286:areturn         
		}
	}

	private static boolean e()
	{
		boolean flag;
		Object obj;
		KeyguardManager keyguardmanager;
		Object obj1;
		android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
		try
		{
			obj = ((Object) (aw.h().b()));
	//    0    0:invokestatic    #230 <Method bql aw.h()>
	//    1    3:invokevirtual   #235 <Method Context bql.b()>
	//    2    6:astore_1        
		}
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
	//*   5   11:iconst_0        
	//*   6   12:ireturn         
	//*   7   13:aload_1         
	//*   8   14:ldc1            #237 <String "activity">
	//*   9   16:invokevirtual   #243 <Method Object Context.getSystemService(String)>
	//*  10   19:checkcast       #245 <Class ActivityManager>
	//*  11   22:astore_3        
	//*  12   23:aload_1         
	//*  13   24:ldc1            #247 <String "keyguard">
	//*  14   26:invokevirtual   #243 <Method Object Context.getSystemService(String)>
	//*  15   29:checkcast       #249 <Class KeyguardManager>
	//*  16   32:astore_2        
	//*  17   33:aload_3         
	//*  18   34:ifnull          142
	//*  19   37:aload_2         
	//*  20   38:ifnonnull       43
	//*  21   41:iconst_0        
	//*  22   42:ireturn         
	//*  23   43:aload_3         
	//*  24   44:invokevirtual   #253 <Method List ActivityManager.getRunningAppProcesses()>
	//*  25   47:astore_3        
	//*  26   48:aload_3         
	//*  27   49:ifnonnull       54
	//*  28   52:iconst_0        
	//*  29   53:ireturn         
	//*  30   54:aload_3         
	//*  31   55:invokeinterface #259 <Method Iterator List.iterator()>
	//*  32   60:astore_3        
	//*  33   61:aload_3         
	//*  34   62:invokeinterface #264 <Method boolean Iterator.hasNext()>
	//*  35   67:ifeq            140
	//*  36   70:aload_3         
	//*  37   71:invokeinterface #268 <Method Object Iterator.next()>
	//*  38   76:checkcast       #270 <Class android.app.ActivityManager$RunningAppProcessInfo>
	//*  39   79:astore          4
	//*  40   81:invokestatic    #275 <Method int Process.myPid()>
	//*  41   84:aload           4
	//*  42   86:getfield        #278 <Field int android.app.ActivityManager$RunningAppProcessInfo.pid>
	//*  43   89:icmpne          61
	//*  44   92:aload           4
	//*  45   94:getfield        #281 <Field int android.app.ActivityManager$RunningAppProcessInfo.importance>
	//*  46   97:bipush          100
	//*  47   99:icmpne          140
	//*  48  102:aload_2         
	//*  49  103:invokevirtual   #284 <Method boolean KeyguardManager.inKeyguardRestrictedInputMode()>
	//*  50  106:ifne            140
	//*  51  109:aload_1         
	//*  52  110:ldc2            #286 <String "power">
	//*  53  113:invokevirtual   #243 <Method Object Context.getSystemService(String)>
	//*  54  116:checkcast       #288 <Class PowerManager>
	//*  55  119:astore_1        
	//*  56  120:aload_1         
	//*  57  121:ifnonnull       129
	//*  58  124:iconst_0        
	//*  59  125:istore_0        
	//*  60  126:goto            134
	//*  61  129:aload_1         
	//*  62  130:invokevirtual   #291 <Method boolean PowerManager.isScreenOn()>
	//*  63  133:istore_0        
	//*  64  134:iload_0         
	//*  65  135:ifeq            140
	//*  66  138:iconst_1        
	//*  67  139:ireturn         
	//*  68  140:iconst_0        
	//*  69  141:ireturn         
	//*  70  142:iconst_0        
	//*  71  143:ireturn         
		catch(Throwable throwable)
	//*  72  144:astore_1        
		{
			aw.i().a(throwable, "ContentFetchTask.isInForeground");
	//   73  145:invokestatic    #294 <Method wi aw.i()>
	//   74  148:aload_1         
	//   75  149:ldc2            #296 <String "ContentFetchTask.isInForeground">
	//   76  152:invokevirtual   #301 <Method void wi.a(Throwable, String)>
			return false;
	//   77  155:iconst_0        
	//   78  156:ireturn         
		}
		if(obj == null)
			return false;
		obj1 = ((Object) ((ActivityManager)((Context) (obj)).getSystemService("activity")));
		keyguardmanager = (KeyguardManager)((Context) (obj)).getSystemService("keyguard");
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_142;
		if(keyguardmanager == null)
			return false;
		obj1 = ((Object) (((ActivityManager) (obj1)).getRunningAppProcesses()));
		if(obj1 == null)
			return false;
		obj1 = ((Object) (((List) (obj1)).iterator()));
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break MISSING_BLOCK_LABEL_140;
			runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)((Iterator) (obj1)).next();
		} while(Process.myPid() != runningappprocessinfo.pid);
		if(runningappprocessinfo.importance != 100 || keyguardmanager.inKeyguardRestrictedInputMode())
			break MISSING_BLOCK_LABEL_140;
		obj = ((Object) ((PowerManager)((Context) (obj)).getSystemService("power")));
		if(obj == null)
		{
			flag = false;
			break MISSING_BLOCK_LABEL_134;
		}
		flag = ((PowerManager) (obj)).isScreenOn();
		if(flag)
			return true;
		return false;
		return false;
	}

	private final void f()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object d>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			b = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #44  <Field boolean b>
			boolean flag = b;
	//    8   12:aload_0         
	//    9   13:getfield        #44  <Field boolean b>
	//   10   16:istore_1        
			StringBuilder stringbuilder = new StringBuilder(42);
	//   11   17:new             #303 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:bipush          42
	//   14   23:invokespecial   #306 <Method void StringBuilder(int)>
	//   15   26:astore_3        
			stringbuilder.append("ContentFetchThread: paused, mPause = ");
	//   16   27:aload_3         
	//   17   28:ldc2            #308 <String "ContentFetchThread: paused, mPause = ">
	//   18   31:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
			stringbuilder.append(flag);
	//   20   35:aload_3         
	//   21   36:iload_1         
	//   22   37:invokevirtual   #315 <Method StringBuilder StringBuilder.append(boolean)>
	//   23   40:pop             
			wx.b(stringbuilder.toString());
	//   24   41:aload_3         
	//   25   42:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   26   45:invokestatic    #320 <Method void wx.b(String)>
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

	public final void a()
	{
label0:
		{
			synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!a)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field boolean a>
	//    7   11:ifeq            23
				wx.b("Content hash thread already started, quiting...");
	//    8   14:ldc2            #322 <String "Content hash thread already started, quiting...">
	//    9   17:invokestatic    #320 <Method void wx.b(String)>
			}
	//   10   20:aload_1         
	//   11   21:monitorexit     
			return;
	//   12   22:return          
		}
		a = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #42  <Field boolean a>
		obj;
	//   16   28:aload_1         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		start();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #325 <Method void start()>
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

	final void a(View view)
	{
		bqj bqj1;
		Object obj;
		bqj1 = new bqj(g, h, i, j, k, l, m);
	//    0    0:new             #186 <Class bqj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #77  <Field int g>
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field int h>
	//    6   12:aload_0         
	//    7   13:getfield        #87  <Field int i>
	//    8   16:aload_0         
	//    9   17:getfield        #92  <Field int j>
	//   10   20:aload_0         
	//   11   21:getfield        #97  <Field int k>
	//   12   24:aload_0         
	//   13   25:getfield        #102 <Field int l>
	//   14   28:aload_0         
	//   15   29:getfield        #107 <Field int m>
	//   16   32:invokespecial   #331 <Method void bqj(int, int, int, int, int, int, int)>
	//   17   35:astore_2        
		obj = ((Object) (aw.h().b()));
	//   18   36:invokestatic    #230 <Method bql aw.h()>
	//   19   39:invokevirtual   #235 <Method Context bql.b()>
	//   20   42:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_115;
	//   21   43:aload_3         
	//   22   44:ifnull          115
		if(TextUtils.isEmpty(((CharSequence) (n))))
			break MISSING_BLOCK_LABEL_115;
	//   23   47:aload_0         
	//   24   48:getfield        #119 <Field String n>
	//   25   51:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   26   54:ifne            115
		Resources resources = ((Context) (obj)).getResources();
	//   27   57:aload_3         
	//   28   58:invokevirtual   #335 <Method Resources Context.getResources()>
	//   29   61:astore          4
		e e1 = p.W;
	//   30   63:getstatic       #338 <Field e p.W>
	//   31   66:astore          5
		obj = ((Object) ((String)view.getTag(resources.getIdentifier((String)bwk.e().a(e1), "id", ((Context) (obj)).getPackageName()))));
	//   32   68:aload_1         
	//   33   69:aload           4
	//   34   71:invokestatic    #64  <Method m bwk.e()>
	//   35   74:aload           5
	//   36   76:invokevirtual   #69  <Method Object m.a(e)>
	//   37   79:checkcast       #117 <Class String>
	//   38   82:ldc2            #340 <String "id">
	//   39   85:aload_3         
	//   40   86:invokevirtual   #343 <Method String Context.getPackageName()>
	//   41   89:invokevirtual   #349 <Method int Resources.getIdentifier(String, String, String)>
	//   42   92:invokevirtual   #353 <Method Object View.getTag(int)>
	//   43   95:checkcast       #117 <Class String>
	//   44   98:astore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_115;
	//   45   99:aload_3         
	//   46  100:ifnull          115
		if(((String) (obj)).equals(((Object) (n))))
	//*  47  103:aload_3         
	//*  48  104:aload_0         
	//*  49  105:getfield        #119 <Field String n>
	//*  50  108:invokevirtual   #357 <Method boolean String.equals(Object)>
	//*  51  111:ifeq            115
			return;
	//   52  114:return          
		view = ((View) (a(view, bqj1)));
	//   53  115:aload_0         
	//   54  116:aload_1         
	//   55  117:aload_2         
	//   56  118:invokespecial   #219 <Method bqu a(View, bqj)>
	//   57  121:astore_1        
		bqj1.h();
	//   58  122:aload_2         
	//   59  123:invokevirtual   #359 <Method void bqj.h()>
		if(((bqu) (view)).a == 0 && ((bqu) (view)).b == 0)
	//*  60  126:aload_1         
	//*  61  127:getfield        #221 <Field int bqu.a>
	//*  62  130:ifne            141
	//*  63  133:aload_1         
	//*  64  134:getfield        #223 <Field int bqu.b>
	//*  65  137:ifne            141
			return;
	//   66  140:return          
		if(((bqu) (view)).b == 0 && bqj1.j() == 0)
	//*  67  141:aload_1         
	//*  68  142:getfield        #223 <Field int bqu.b>
	//*  69  145:ifne            156
	//*  70  148:aload_2         
	//*  71  149:invokevirtual   #361 <Method int bqj.j()>
	//*  72  152:ifne            156
			return;
	//   73  155:return          
		if(((bqu) (view)).b == 0 && e.a(bqj1))
	//*  74  156:aload_1         
	//*  75  157:getfield        #223 <Field int bqu.b>
	//*  76  160:ifne            175
	//*  77  163:aload_0         
	//*  78  164:getfield        #48  <Field bqk e>
	//*  79  167:aload_2         
	//*  80  168:invokevirtual   #364 <Method boolean bqk.a(bqj)>
	//*  81  171:ifeq            175
			return;
	//   82  174:return          
		try
		{
			e.c(bqj1);
	//   83  175:aload_0         
	//   84  176:getfield        #48  <Field bqk e>
	//   85  179:aload_2         
	//   86  180:invokevirtual   #367 <Method void bqk.c(bqj)>
			return;
	//   87  183:return          
		}
		// Misplaced declaration of an exception variable
		catch(View view)
	//*  88  184:astore_1        
		{
			wx.b("Exception in fetchContentOnUIThread", ((Throwable) (view)));
	//   89  185:ldc2            #369 <String "Exception in fetchContentOnUIThread">
	//   90  188:aload_1         
	//   91  189:invokestatic    #372 <Method void wx.b(String, Throwable)>
		}
		aw.i().a(((Throwable) (view)), "ContentFetchTask.fetchContent");
	//   92  192:invokestatic    #294 <Method wi aw.i()>
	//   93  195:aload_1         
	//   94  196:ldc2            #374 <String "ContentFetchTask.fetchContent">
	//   95  199:invokevirtual   #301 <Method void wi.a(Throwable, String)>
		return;
	//   96  202:return          
	}

	final void a(bqj bqj1, WebView webview, String s, boolean flag)
	{
		bqj1.f();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #379 <Method void bqj.f()>
		try
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
				break MISSING_BLOCK_LABEL_157;
	//    2    4:aload_3         
	//    3    5:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4    8:ifne            157
			s = (new JSONObject(s)).optString("text");
	//    5   11:new             #381 <Class JSONObject>
	//    6   14:dup             
	//    7   15:aload_3         
	//    8   16:invokespecial   #383 <Method void JSONObject(String)>
	//    9   19:ldc2            #385 <String "text">
	//   10   22:invokevirtual   #389 <Method String JSONObject.optString(String)>
	//   11   25:astore_3        
			if(!o && !TextUtils.isEmpty(((CharSequence) (webview.getTitle()))))
	//*  12   26:aload_0         
	//*  13   27:getfield        #130 <Field boolean o>
	//*  14   30:ifne            132
	//*  15   33:aload_2         
	//*  16   34:invokevirtual   #392 <Method String WebView.getTitle()>
	//*  17   37:invokestatic    #165 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   40:ifne            132
			{
				String s1 = webview.getTitle();
	//   19   43:aload_2         
	//   20   44:invokevirtual   #392 <Method String WebView.getTitle()>
	//   21   47:astore          5
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 1 + String.valueOf(((Object) (s))).length());
	//   22   49:new             #303 <Class StringBuilder>
	//   23   52:dup             
	//   24   53:aload           5
	//   25   55:invokestatic    #396 <Method String String.valueOf(Object)>
	//   26   58:invokevirtual   #399 <Method int String.length()>
	//   27   61:iconst_1        
	//   28   62:iadd            
	//   29   63:aload_3         
	//   30   64:invokestatic    #396 <Method String String.valueOf(Object)>
	//   31   67:invokevirtual   #399 <Method int String.length()>
	//   32   70:iadd            
	//   33   71:invokespecial   #306 <Method void StringBuilder(int)>
	//   34   74:astore          6
				stringbuilder.append(s1);
	//   35   76:aload           6
	//   36   78:aload           5
	//   37   80:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
				stringbuilder.append("\n");
	//   39   84:aload           6
	//   40   86:ldc2            #401 <String "\n">
	//   41   89:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
				stringbuilder.append(s);
	//   43   93:aload           6
	//   44   95:aload_3         
	//   45   96:invokevirtual   #312 <Method StringBuilder StringBuilder.append(String)>
	//   46   99:pop             
				bqj1.a(stringbuilder.toString(), flag, webview.getX(), webview.getY(), webview.getWidth(), webview.getHeight());
	//   47  100:aload_1         
	//   48  101:aload           6
	//   49  103:invokevirtual   #316 <Method String StringBuilder.toString()>
	//   50  106:iload           4
	//   51  108:aload_2         
	//   52  109:invokevirtual   #402 <Method float WebView.getX()>
	//   53  112:aload_2         
	//   54  113:invokevirtual   #403 <Method float WebView.getY()>
	//   55  116:aload_2         
	//   56  117:invokevirtual   #404 <Method int WebView.getWidth()>
	//   57  120:i2f             
	//   58  121:aload_2         
	//   59  122:invokevirtual   #405 <Method int WebView.getHeight()>
	//   60  125:i2f             
	//   61  126:invokevirtual   #407 <Method void bqj.a(String, boolean, float, float, float, float)>
				break MISSING_BLOCK_LABEL_157;
	//   62  129:goto            157
			}
		}
	//*  63  132:aload_1         
	//*  64  133:aload_3         
	//*  65  134:iload           4
	//*  66  136:aload_2         
	//*  67  137:invokevirtual   #402 <Method float WebView.getX()>
	//*  68  140:aload_2         
	//*  69  141:invokevirtual   #403 <Method float WebView.getY()>
	//*  70  144:aload_2         
	//*  71  145:invokevirtual   #404 <Method int WebView.getWidth()>
	//*  72  148:i2f             
	//*  73  149:aload_2         
	//*  74  150:invokevirtual   #405 <Method int WebView.getHeight()>
	//*  75  153:i2f             
	//*  76  154:invokevirtual   #407 <Method void bqj.a(String, boolean, float, float, float, float)>
	//*  77  157:aload_1         
	//*  78  158:invokevirtual   #409 <Method boolean bqj.a()>
	//*  79  161:ifeq            173
	//*  80  164:aload_0         
	//*  81  165:getfield        #48  <Field bqk e>
	//*  82  168:aload_1         
	//*  83  169:invokevirtual   #411 <Method boolean bqk.b(bqj)>
	//*  84  172:pop             
	//*  85  173:return          
	//*  86  174:astore_1        
	//*  87  175:ldc2            #413 <String "Failed to get webview content.">
	//*  88  178:aload_1         
	//*  89  179:invokestatic    #415 <Method void wx.a(String, Throwable)>
	//*  90  182:invokestatic    #294 <Method wi aw.i()>
	//*  91  185:aload_1         
	//*  92  186:ldc2            #417 <String "ContentFetchTask.processWebViewContent">
	//*  93  189:invokevirtual   #301 <Method void wi.a(Throwable, String)>
	//*  94  192:return          
	//*  95  193:ldc2            #419 <String "Json string may be malformed.">
	//*  96  196:invokestatic    #320 <Method void wx.b(String)>
	//*  97  199:return          
		// Misplaced declaration of an exception variable
		catch(bqj bqj1)
		{
			wx.b("Json string may be malformed.");
			return;
		}
		// Misplaced declaration of an exception variable
		catch(bqj bqj1)
		{
			wx.a("Failed to get webview content.", ((Throwable) (bqj1)));
			aw.i().a(((Throwable) (bqj1)), "ContentFetchTask.processWebViewContent");
			return;
		}
		bqj1.a(s, flag, webview.getX(), webview.getY(), webview.getWidth(), webview.getHeight());
		if(bqj1.a())
			e.b(bqj1);
		return;
	//*  98  200:astore_1        
	//*  99  201:goto            193
	}

	public final bqj b()
	{
		return e.a();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field bqk e>
	//    2    4:invokevirtual   #422 <Method bqj bqk.a()>
	//    3    7:areturn         
	}

	public final void c()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			b = false;
	//    5    7:aload_0         
	//    6    8:iconst_0        
	//    7    9:putfield        #44  <Field boolean b>
			d.notifyAll();
	//    8   12:aload_0         
	//    9   13:getfield        #53  <Field Object d>
	//   10   16:invokevirtual   #425 <Method void Object.notifyAll()>
			wx.b("ContentFetchThread: wakeup");
	//   11   19:ldc2            #427 <String "ContentFetchThread: wakeup">
	//   12   22:invokestatic    #320 <Method void wx.b(String)>
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

	public final boolean d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean b>
	//    2    4:ireturn         
	}

	public final void run()
	{
_L5:
		Activity activity;
		if(!e())
			break MISSING_BLOCK_LABEL_124;
	//    0    0:invokestatic    #432 <Method boolean e()>
	//    1    3:ifeq            124
		activity = aw.h().a();
	//    2    6:invokestatic    #230 <Method bql aw.h()>
	//    3    9:invokevirtual   #435 <Method Activity bql.a()>
	//    4   12:astore          4
		if(activity == null)
	//*   5   14:aload           4
	//*   6   16:ifnonnull       32
		{
			Object obj;
			Object obj2;
			try
			{
				wx.b("ContentFetchThread: no activity. Sleeping.");
	//    7   19:ldc2            #437 <String "ContentFetchThread: no activity. Sleeping.">
	//    8   22:invokestatic    #320 <Method void wx.b(String)>
				f();
	//    9   25:aload_0         
	//   10   26:invokespecial   #438 <Method void f()>
				break MISSING_BLOCK_LABEL_134;
	//   11   29:goto            134
			}
	//*  12   32:aload           4
	//*  13   34:ifnull          134
	//*  14   37:aconst_null     
	//*  15   38:astore_3        
	//*  16   39:aload_3         
	//*  17   40:astore_2        
	//*  18   41:aload           4
	//*  19   43:invokevirtual   #444 <Method Window Activity.getWindow()>
	//*  20   46:ifnull          99
	//*  21   49:aload_3         
	//*  22   50:astore_2        
	//*  23   51:aload           4
	//*  24   53:invokevirtual   #444 <Method Window Activity.getWindow()>
	//*  25   56:invokevirtual   #450 <Method View Window.getDecorView()>
	//*  26   59:ifnull          99
	//*  27   62:aload           4
	//*  28   64:invokevirtual   #444 <Method Window Activity.getWindow()>
	//*  29   67:invokevirtual   #450 <Method View Window.getDecorView()>
	//*  30   70:ldc2            #451 <Int 0x1020002>
	//*  31   73:invokevirtual   #454 <Method View View.findViewById(int)>
	//*  32   76:astore_2        
	//*  33   77:goto            99
	//*  34   80:astore_2        
	//*  35   81:invokestatic    #294 <Method wi aw.i()>
	//*  36   84:aload_2         
	//*  37   85:ldc2            #456 <String "ContentFetchTask.extractContent">
	//*  38   88:invokevirtual   #301 <Method void wi.a(Throwable, String)>
	//*  39   91:ldc2            #458 <String "Failed getting root view of activity. Content not extracted.">
	//*  40   94:invokestatic    #320 <Method void wx.b(String)>
	//*  41   97:aload_3         
	//*  42   98:astore_2        
	//*  43   99:aload_2         
	//*  44  100:ifnull          134
	//*  45  103:aload_2         
	//*  46  104:ifnull          134
	//*  47  107:aload_2         
	//*  48  108:new             #460 <Class bqq>
	//*  49  111:dup             
	//*  50  112:aload_0         
	//*  51  113:aload_2         
	//*  52  114:invokespecial   #463 <Method void bqq(bqp, View)>
	//*  53  117:invokevirtual   #464 <Method boolean View.post(Runnable)>
	//*  54  120:pop             
	//*  55  121:goto            134
	//*  56  124:ldc2            #466 <String "ContentFetchTask: sleeping">
	//*  57  127:invokestatic    #320 <Method void wx.b(String)>
	//*  58  130:aload_0         
	//*  59  131:invokespecial   #438 <Method void f()>
	//*  60  134:aload_0         
	//*  61  135:getfield        #112 <Field int f>
	//*  62  138:sipush          1000
	//*  63  141:imul            
	//*  64  142:i2l             
	//*  65  143:invokestatic    #470 <Method void Thread.sleep(long)>
	//*  66  146:goto            178
	//*  67  149:astore_2        
	//*  68  150:ldc2            #472 <String "Error in ContentFetchTask">
	//*  69  153:aload_2         
	//*  70  154:invokestatic    #372 <Method void wx.b(String, Throwable)>
	//*  71  157:invokestatic    #294 <Method wi aw.i()>
	//*  72  160:aload_2         
	//*  73  161:ldc2            #474 <String "ContentFetchTask.run">
	//*  74  164:invokevirtual   #301 <Method void wi.a(Throwable, String)>
	//*  75  167:goto            178
			catch(InterruptedException interruptedexception)
	//*  76  170:astore_2        
			{
				wx.b("Error in ContentFetchTask", ((Throwable) (interruptedexception)));
	//   77  171:ldc2            #472 <String "Error in ContentFetchTask">
	//   78  174:aload_2         
	//   79  175:invokestatic    #372 <Method void wx.b(String, Throwable)>
			}
			catch(Exception exception)
			{
				wx.b("Error in ContentFetchTask", ((Throwable) (exception)));
				aw.i().a(((Throwable) (exception)), "ContentFetchTask.run");
				break MISSING_BLOCK_LABEL_178;
			}
			break MISSING_BLOCK_LABEL_178;
		}
		if(activity == null)
			break MISSING_BLOCK_LABEL_134;
		obj2 = null;
		obj = ((Object) (obj2));
		if(activity.getWindow() == null)
			break MISSING_BLOCK_LABEL_99;
		obj = ((Object) (obj2));
		if(activity.getWindow().getDecorView() != null)
			obj = ((Object) (activity.getWindow().getDecorView().findViewById(0x1020002)));
		break MISSING_BLOCK_LABEL_99;
		obj;
		aw.i().a(((Throwable) (obj)), "ContentFetchTask.extractContent");
		wx.b("Failed getting root view of activity. Content not extracted.");
		obj = ((Object) (obj2));
		if(obj == null || obj == null)
			break MISSING_BLOCK_LABEL_134;
		((View) (obj)).post(((Runnable) (new bqq(this, ((View) (obj))))));
		break MISSING_BLOCK_LABEL_134;
		wx.b("ContentFetchTask: sleeping");
		f();
		Thread.sleep(f * 1000);
		break MISSING_BLOCK_LABEL_178;
		Object obj1 = d;
	//   80  178:aload_0         
	//   81  179:getfield        #53  <Field Object d>
	//   82  182:astore_2        
		obj1;
	//   83  183:aload_2         
		JVM INSTR monitorenter ;
	//   84  184:monitorenter    
_L3:
		boolean flag = b;
	//   85  185:aload_0         
	//   86  186:getfield        #44  <Field boolean b>
	//   87  189:istore_1        
		if(!flag) goto _L2; else goto _L1
	//   88  190:iload_1         
	//   89  191:ifeq            210
_L1:
		Exception exception1;
		try
		{
			wx.b("ContentFetchTask: waiting");
	//   90  194:ldc2            #476 <String "ContentFetchTask: waiting">
	//   91  197:invokestatic    #320 <Method void wx.b(String)>
			d.wait();
	//   92  200:aload_0         
	//   93  201:getfield        #53  <Field Object d>
	//   94  204:invokevirtual   #479 <Method void Object.wait()>
		}
	//*  95  207:goto            185
	//*  96  210:aload_2         
	//*  97  211:monitorexit     
	//*  98  212:goto            0
	//*  99  215:astore_3        
	//* 100  216:aload_2         
	//* 101  217:monitorexit     
	//* 102  218:aload_3         
	//* 103  219:athrow          
		catch(InterruptedException interruptedexception1) { }
	//  104  220:astore_3        
		if(true) goto _L3; else goto _L2
	//  105  221:goto            185
_L2:
		obj1;
		JVM INSTR monitorexit ;
		if(true) goto _L5; else goto _L4
_L4:
		exception1;
		obj1;
		JVM INSTR monitorexit ;
		throw exception1;
	}

	private boolean a;
	private boolean b;
	private boolean c;
	private final Object d;
	private final bqk e;
	private final int f;
	private final int g;
	private final int h;
	private final int i;
	private final int j;
	private final int k;
	private final int l;
	private final int m;
	private final String n;
	private final boolean o;
}
