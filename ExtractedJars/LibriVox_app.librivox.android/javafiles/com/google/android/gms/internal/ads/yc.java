// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.internal.aw;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			yd, zh, wx, yj, 
//			xo, ye, xg, yf, 
//			yg, yh, xe, yi, 
//			p, bwk, m

public final class yc
{

	public yc(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		j = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #35  <Field int j>
		q = ((Runnable) (new yd(this)));
	//    5    9:aload_0         
	//    6   10:new             #37  <Class yd>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #40  <Method void yd(yc)>
	//   10   18:putfield        #42  <Field Runnable q>
		a = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #44  <Field Context a>
		f = context.getResources().getDisplayMetrics().density;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #50  <Method Resources Context.getResources()>
	//   17   31:invokevirtual   #56  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   18   34:getfield        #61  <Field float DisplayMetrics.density>
	//   19   37:putfield        #63  <Field float f>
		k = ViewConfiguration.get(a).getScaledTouchSlop();
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #44  <Field Context a>
	//   23   45:invokestatic    #69  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   24   48:invokevirtual   #73  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   25   51:putfield        #75  <Field int k>
		aw.u().a();
	//   26   54:invokestatic    #81  <Method zh aw.u()>
	//   27   57:invokevirtual   #86  <Method android.os.Looper zh.a()>
	//   28   60:pop             
		p = aw.u().b();
	//   29   61:aload_0         
	//   30   62:invokestatic    #81  <Method zh aw.u()>
	//   31   65:invokevirtual   #89  <Method Handler zh.b()>
	//   32   68:putfield        #91  <Field Handler p>
	//   33   71:return          
	}

	public yc(Context context, String s)
	{
		this(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #95  <Method void yc(Context)>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #97  <Field String b>
	//    6   10:return          
	}

	private static int a(List list, String s, boolean flag)
	{
		list.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #104 <Method boolean List.add(Object)>
	//    3    7:pop             
		return list.size() - 1;
	//    4    8:aload_0         
	//    5    9:invokeinterface #107 <Method int List.size()>
	//    6   14:iconst_1        
	//    7   15:isub            
	//    8   16:ireturn         
	}

	private final void a(int i1, float f1, float f2)
	{
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            25
		{
			j = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #35  <Field int j>
			g = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #110 <Field float g>
			h = f2;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #112 <Field float h>
			i = f2;
	//   11   19:aload_0         
	//   12   20:fload_3         
	//   13   21:putfield        #114 <Field float i>
			return;
	//   14   24:return          
		}
		int j1 = j;
	//   15   25:aload_0         
	//   16   26:getfield        #35  <Field int j>
	//   17   29:istore          4
		if(j1 == -1)
	//*  18   31:iload           4
	//*  19   33:iconst_m1       
	//*  20   34:icmpne          38
			return;
	//   21   37:return          
		if(i1 == 2)
	//*  22   38:iload_1         
	//*  23   39:iconst_2        
	//*  24   40:icmpne          247
		{
			if(f2 > h)
	//*  25   43:fload_3         
	//*  26   44:aload_0         
	//*  27   45:getfield        #112 <Field float h>
	//*  28   48:fcmpl           
	//*  29   49:ifle            60
				h = f2;
	//   30   52:aload_0         
	//   31   53:fload_3         
	//   32   54:putfield        #112 <Field float h>
			else
	//*  33   57:goto            74
			if(f2 < i)
	//*  34   60:fload_3         
	//*  35   61:aload_0         
	//*  36   62:getfield        #114 <Field float i>
	//*  37   65:fcmpg           
	//*  38   66:ifge            74
				i = f2;
	//   39   69:aload_0         
	//   40   70:fload_3         
	//   41   71:putfield        #114 <Field float i>
			if(h - i > f * 30F)
	//*  42   74:aload_0         
	//*  43   75:getfield        #112 <Field float h>
	//*  44   78:aload_0         
	//*  45   79:getfield        #114 <Field float i>
	//*  46   82:fsub            
	//*  47   83:aload_0         
	//*  48   84:getfield        #63  <Field float f>
	//*  49   87:ldc1            #115 <Float 30F>
	//*  50   89:fmul            
	//*  51   90:fcmpl           
	//*  52   91:ifle            100
			{
				j = -1;
	//   53   94:aload_0         
	//   54   95:iconst_m1       
	//   55   96:putfield        #35  <Field int j>
				return;
	//   56   99:return          
			}
			i1 = j;
	//   57  100:aload_0         
	//   58  101:getfield        #35  <Field int j>
	//   59  104:istore_1        
			if(i1 != 0 && i1 != 2)
	//*  60  105:iload_1         
	//*  61  106:ifeq            162
	//*  62  109:iload_1         
	//*  63  110:iconst_2        
	//*  64  111:icmpne          117
	//*  65  114:goto            162
			{
				if((i1 == 1 || i1 == 3) && f1 - g <= f * -50F)
	//*  66  117:iload_1         
	//*  67  118:iconst_1        
	//*  68  119:icmpeq          127
	//*  69  122:iload_1         
	//*  70  123:iconst_3        
	//*  71  124:icmpne          194
	//*  72  127:fload_2         
	//*  73  128:aload_0         
	//*  74  129:getfield        #110 <Field float g>
	//*  75  132:fsub            
	//*  76  133:aload_0         
	//*  77  134:getfield        #63  <Field float f>
	//*  78  137:ldc1            #116 <Float -50F>
	//*  79  139:fmul            
	//*  80  140:fcmpg           
	//*  81  141:ifgt            194
				{
					g = f1;
	//   82  144:aload_0         
	//   83  145:fload_2         
	//   84  146:putfield        #110 <Field float g>
					j = j + 1;
	//   85  149:aload_0         
	//   86  150:aload_0         
	//   87  151:getfield        #35  <Field int j>
	//   88  154:iconst_1        
	//   89  155:iadd            
	//   90  156:putfield        #35  <Field int j>
				}
			} else
	//*  91  159:goto            194
			if(f1 - g >= f * 50F)
	//*  92  162:fload_2         
	//*  93  163:aload_0         
	//*  94  164:getfield        #110 <Field float g>
	//*  95  167:fsub            
	//*  96  168:aload_0         
	//*  97  169:getfield        #63  <Field float f>
	//*  98  172:ldc1            #117 <Float 50F>
	//*  99  174:fmul            
	//* 100  175:fcmpl           
	//* 101  176:iflt            194
			{
				g = f1;
	//  102  179:aload_0         
	//  103  180:fload_2         
	//  104  181:putfield        #110 <Field float g>
				j = j + 1;
	//  105  184:aload_0         
	//  106  185:aload_0         
	//  107  186:getfield        #35  <Field int j>
	//  108  189:iconst_1        
	//  109  190:iadd            
	//  110  191:putfield        #35  <Field int j>
			}
			i1 = j;
	//  111  194:aload_0         
	//  112  195:getfield        #35  <Field int j>
	//  113  198:istore_1        
			if(i1 != 1 && i1 != 3)
	//* 114  199:iload_1         
	//* 115  200:iconst_1        
	//* 116  201:icmpeq          232
	//* 117  204:iload_1         
	//* 118  205:iconst_3        
	//* 119  206:icmpne          212
	//* 120  209:goto            232
			{
				if(i1 == 2 && f1 < g)
	//* 121  212:iload_1         
	//* 122  213:iconst_2        
	//* 123  214:icmpne          262
	//* 124  217:fload_2         
	//* 125  218:aload_0         
	//* 126  219:getfield        #110 <Field float g>
	//* 127  222:fcmpg           
	//* 128  223:ifge            262
				{
					g = f1;
	//  129  226:aload_0         
	//  130  227:fload_2         
	//  131  228:putfield        #110 <Field float g>
					return;
	//  132  231:return          
				}
			} else
			if(f1 > g)
	//* 133  232:fload_2         
	//* 134  233:aload_0         
	//* 135  234:getfield        #110 <Field float g>
	//* 136  237:fcmpl           
	//* 137  238:ifle            262
			{
				g = f1;
	//  138  241:aload_0         
	//  139  242:fload_2         
	//  140  243:putfield        #110 <Field float g>
				return;
	//  141  246:return          
			}
		} else
		if(i1 == 1 && j1 == 4)
	//* 142  247:iload_1         
	//* 143  248:iconst_1        
	//* 144  249:icmpne          262
	//* 145  252:iload           4
	//* 146  254:iconst_4        
	//* 147  255:icmpne          262
			a();
	//  148  258:aload_0         
	//  149  259:invokevirtual   #119 <Method void a()>
	//  150  262:return          
	}

	private final boolean a(float f1, float f2, float f3, float f4)
	{
		return Math.abs(l - f1) < (float)k && Math.abs(m - f2) < (float)k && Math.abs(n - f3) < (float)k && Math.abs(o - f4) < (float)k;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field float l>
	//    2    4:fload_1         
	//    3    5:fsub            
	//    4    6:invokestatic    #128 <Method float Math.abs(float)>
	//    5    9:aload_0         
	//    6   10:getfield        #75  <Field int k>
	//    7   13:i2f             
	//    8   14:fcmpg           
	//    9   15:ifge            75
	//   10   18:aload_0         
	//   11   19:getfield        #130 <Field float m>
	//   12   22:fload_2         
	//   13   23:fsub            
	//   14   24:invokestatic    #128 <Method float Math.abs(float)>
	//   15   27:aload_0         
	//   16   28:getfield        #75  <Field int k>
	//   17   31:i2f             
	//   18   32:fcmpg           
	//   19   33:ifge            75
	//   20   36:aload_0         
	//   21   37:getfield        #132 <Field float n>
	//   22   40:fload_3         
	//   23   41:fsub            
	//   24   42:invokestatic    #128 <Method float Math.abs(float)>
	//   25   45:aload_0         
	//   26   46:getfield        #75  <Field int k>
	//   27   49:i2f             
	//   28   50:fcmpg           
	//   29   51:ifge            75
	//   30   54:aload_0         
	//   31   55:getfield        #134 <Field float o>
	//   32   58:fload           4
	//   33   60:fsub            
	//   34   61:invokestatic    #128 <Method float Math.abs(float)>
	//   35   64:aload_0         
	//   36   65:getfield        #75  <Field int k>
	//   37   68:i2f             
	//   38   69:fcmpg           
	//   39   70:ifge            75
	//   40   73:iconst_1        
	//   41   74:ireturn         
	//   42   75:iconst_0        
	//   43   76:ireturn         
	}

	public final void a()
	{
		if(!(a instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field Context a>
	//*   2    4:instanceof      #138 <Class Activity>
	//*   3    7:ifne            16
		{
			wx.d("Can not create dialog without Activity Context");
	//    4   10:ldc1            #140 <String "Can not create dialog without Activity Context">
	//    5   12:invokestatic    #145 <Method void wx.d(String)>
			return;
	//    6   15:return          
		}
		Object obj;
		String s;
		if(!TextUtils.isEmpty(((CharSequence) (aw.o().a()))))
	//*   7   16:invokestatic    #148 <Method yj aw.o()>
	//*   8   19:invokevirtual   #153 <Method String yj.a()>
	//*   9   22:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   25:ifne            170
			obj = "Creative Preview (Enabled)";
	//   11   28:ldc1            #161 <String "Creative Preview (Enabled)">
	//   12   30:astore          4
		else
	//*  13   32:goto            35
	//*  14   35:invokestatic    #148 <Method yj aw.o()>
	//*  15   38:invokevirtual   #164 <Method boolean yj.b()>
	//*  16   41:ifeq            177
	//*  17   44:ldc1            #166 <String "Troubleshooting (Enabled)">
	//*  18   46:astore          5
	//*  19   48:goto            51
	//*  20   51:new             #168 <Class ArrayList>
	//*  21   54:dup             
	//*  22   55:invokespecial   #169 <Method void ArrayList()>
	//*  23   58:astore          6
	//*  24   60:aload           6
	//*  25   62:ldc1            #171 <String "Ad Information">
	//*  26   64:iconst_1        
	//*  27   65:invokestatic    #173 <Method int a(List, String, boolean)>
	//*  28   68:istore_1        
	//*  29   69:aload           6
	//*  30   71:aload           4
	//*  31   73:iconst_1        
	//*  32   74:invokestatic    #173 <Method int a(List, String, boolean)>
	//*  33   77:istore_2        
	//*  34   78:aload           6
	//*  35   80:aload           5
	//*  36   82:iconst_1        
	//*  37   83:invokestatic    #173 <Method int a(List, String, boolean)>
	//*  38   86:istore_3        
	//*  39   87:new             #175 <Class android.app.AlertDialog$Builder>
	//*  40   90:dup             
	//*  41   91:aload_0         
	//*  42   92:getfield        #44  <Field Context a>
	//*  43   95:invokestatic    #178 <Method xo aw.g()>
	//*  44   98:invokevirtual   #182 <Method int xo.f()>
	//*  45  101:invokespecial   #185 <Method void android.app.AlertDialog$Builder(Context, int)>
	//*  46  104:astore          4
	//*  47  106:aload           4
	//*  48  108:ldc1            #187 <String "Select a Debug Mode">
	//*  49  110:invokevirtual   #191 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//*  50  113:aload           6
	//*  51  115:iconst_0        
	//*  52  116:anewarray       String[]
	//*  53  119:invokeinterface #197 <Method Object[] List.toArray(Object[])>
	//*  54  124:checkcast       #199 <Class CharSequence[]>
	//*  55  127:new             #201 <Class ye>
	//*  56  130:dup             
	//*  57  131:aload_0         
	//*  58  132:iload_1         
	//*  59  133:iload_2         
	//*  60  134:iload_3         
	//*  61  135:invokespecial   #204 <Method void ye(yc, int, int, int)>
	//*  62  138:invokevirtual   #208 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setItems(CharSequence[], android.content.DialogInterface$OnClickListener)>
	//*  63  141:pop             
	//*  64  142:aload           4
	//*  65  144:invokevirtual   #212 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//*  66  147:invokevirtual   #217 <Method void AlertDialog.show()>
	//*  67  150:return          
	//*  68  151:astore          4
	//*  69  153:invokestatic    #219 <Method boolean wx.a()>
	//*  70  156:ifeq            169
	//*  71  159:ldc1            #221 <String "Ads">
	//*  72  161:ldc1            #223 <String "">
	//*  73  163:aload           4
	//*  74  165:invokestatic    #229 <Method int Log.v(String, String, Throwable)>
	//*  75  168:pop             
	//*  76  169:return          
			obj = "Creative Preview";
	//   77  170:ldc1            #231 <String "Creative Preview">
	//   78  172:astore          4
		if(aw.o().b())
			s = "Troubleshooting (Enabled)";
		else
	//*  79  174:goto            35
			s = "Troubleshooting";
	//   80  177:ldc1            #233 <String "Troubleshooting">
	//   81  179:astore          5
		try
		{
			ArrayList arraylist = new ArrayList();
			int i1 = a(((List) (arraylist)), "Ad Information", true);
			int j1 = a(((List) (arraylist)), ((String) (obj)), true);
			int k1 = a(((List) (arraylist)), s, true);
			obj = ((Object) (new android.app.AlertDialog.Builder(a, aw.g().f())));
			((android.app.AlertDialog.Builder) (obj)).setTitle("Select a Debug Mode").setItems((CharSequence[])((List) (arraylist)).toArray(((Object []) (new String[0]))), ((android.content.DialogInterface.OnClickListener) (new ye(this, i1, j1, k1))));
			((android.app.AlertDialog.Builder) (obj)).create().show();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		if(wx.a())
			Log.v("Ads", "", ((Throwable) (obj)));
		return;
	//*  82  181:goto            51
	}

	final void a(int i1, int j1, int k1, DialogInterface dialoginterface, int l1)
	{
label0:
		{
label1:
			{
				if(l1 != i1)
					break label0;
	//    0    0:iload           5
	//    1    2:iload_1         
	//    2    3:icmpne          262
				if(!(a instanceof Activity))
	//*   3    6:aload_0         
	//*   4    7:getfield        #44  <Field Context a>
	//*   5   10:instanceof      #138 <Class Activity>
	//*   6   13:ifne            22
				{
					wx.d("Can not create dialog without Activity Context");
	//    7   16:ldc1            #140 <String "Can not create dialog without Activity Context">
	//    8   18:invokestatic    #145 <Method void wx.d(String)>
					return;
	//    9   21:return          
				}
				dialoginterface = ((DialogInterface) (b));
	//   10   22:aload_0         
	//   11   23:getfield        #97  <Field String b>
	//   12   26:astore          4
				if(!TextUtils.isEmpty(((CharSequence) (dialoginterface))))
	//*  13   28:aload           4
	//*  14   30:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   33:ifne            188
				{
					dialoginterface = ((DialogInterface) (((String) (dialoginterface)).replaceAll("\\+", "%20")));
	//   16   36:aload           4
	//   17   38:ldc1            #236 <String "\\+">
	//   18   40:ldc1            #238 <String "%20">
	//   19   42:invokevirtual   #242 <Method String String.replaceAll(String, String)>
	//   20   45:astore          4
					Object obj = ((Object) ((new android.net.Uri.Builder()).encodedQuery(((String) (dialoginterface))).build()));
	//   21   47:new             #244 <Class android.net.Uri$Builder>
	//   22   50:dup             
	//   23   51:invokespecial   #245 <Method void android.net.Uri$Builder()>
	//   24   54:aload           4
	//   25   56:invokevirtual   #249 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedQuery(String)>
	//   26   59:invokevirtual   #253 <Method android.net.Uri android.net.Uri$Builder.build()>
	//   27   62:astore          6
					dialoginterface = ((DialogInterface) (new StringBuilder()));
	//   28   64:new             #255 <Class StringBuilder>
	//   29   67:dup             
	//   30   68:invokespecial   #256 <Method void StringBuilder()>
	//   31   71:astore          4
					aw.e();
	//   32   73:invokestatic    #259 <Method xg aw.e()>
	//   33   76:pop             
					obj = ((Object) (xg.a(((android.net.Uri) (obj)))));
	//   34   77:aload           6
	//   35   79:invokestatic    #264 <Method Map xg.a(android.net.Uri)>
	//   36   82:astore          6
					for(Iterator iterator = ((Map) (obj)).keySet().iterator(); iterator.hasNext(); ((StringBuilder) (dialoginterface)).append("\n\n"))
	//*  37   84:aload           6
	//*  38   86:invokeinterface #270 <Method Set Map.keySet()>
	//*  39   91:invokeinterface #276 <Method Iterator Set.iterator()>
	//*  40   96:astore          7
	//*  41   98:aload           7
	//*  42  100:invokeinterface #281 <Method boolean Iterator.hasNext()>
	//*  43  105:ifeq            167
					{
						String s = (String)iterator.next();
	//   44  108:aload           7
	//   45  110:invokeinterface #285 <Method Object Iterator.next()>
	//   46  115:checkcast       #193 <Class String>
	//   47  118:astore          8
						((StringBuilder) (dialoginterface)).append(s);
	//   48  120:aload           4
	//   49  122:aload           8
	//   50  124:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   51  127:pop             
						((StringBuilder) (dialoginterface)).append(" = ");
	//   52  128:aload           4
	//   53  130:ldc2            #291 <String " = ">
	//   54  133:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   55  136:pop             
						((StringBuilder) (dialoginterface)).append((String)((Map) (obj)).get(((Object) (s))));
	//   56  137:aload           4
	//   57  139:aload           6
	//   58  141:aload           8
	//   59  143:invokeinterface #294 <Method Object Map.get(Object)>
	//   60  148:checkcast       #193 <Class String>
	//   61  151:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   62  154:pop             
					}

	//   63  155:aload           4
	//   64  157:ldc2            #296 <String "\n\n">
	//   65  160:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   66  163:pop             
	//*  67  164:goto            98
					dialoginterface = ((DialogInterface) (((StringBuilder) (dialoginterface)).toString().trim()));
	//   68  167:aload           4
	//   69  169:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   70  172:invokevirtual   #302 <Method String String.trim()>
	//   71  175:astore          4
					if(!TextUtils.isEmpty(((CharSequence) (dialoginterface))))
	//*  72  177:aload           4
	//*  73  179:invokestatic    #159 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  74  182:ifne            188
						break label1;
	//   75  185:goto            193
				}
				dialoginterface = "No debug information";
	//   76  188:ldc2            #304 <String "No debug information">
	//   77  191:astore          4
			}
			android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
	//   78  193:new             #175 <Class android.app.AlertDialog$Builder>
	//   79  196:dup             
	//   80  197:aload_0         
	//   81  198:getfield        #44  <Field Context a>
	//   82  201:invokespecial   #305 <Method void android.app.AlertDialog$Builder(Context)>
	//   83  204:astore          6
			builder.setMessage(((CharSequence) (dialoginterface)));
	//   84  206:aload           6
	//   85  208:aload           4
	//   86  210:invokevirtual   #308 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   87  213:pop             
			builder.setTitle("Ad Information");
	//   88  214:aload           6
	//   89  216:ldc1            #171 <String "Ad Information">
	//   90  218:invokevirtual   #191 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   91  221:pop             
			builder.setPositiveButton("Share", ((android.content.DialogInterface.OnClickListener) (new yf(this, ((String) (dialoginterface))))));
	//   92  222:aload           6
	//   93  224:ldc2            #310 <String "Share">
	//   94  227:new             #312 <Class yf>
	//   95  230:dup             
	//   96  231:aload_0         
	//   97  232:aload           4
	//   98  234:invokespecial   #315 <Method void yf(yc, String)>
	//   99  237:invokevirtual   #319 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  100  240:pop             
			builder.setNegativeButton("Close", yg.a);
	//  101  241:aload           6
	//  102  243:ldc2            #321 <String "Close">
	//  103  246:getstatic       #326 <Field android.content.DialogInterface$OnClickListener yg.a>
	//  104  249:invokevirtual   #329 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  105  252:pop             
			builder.create().show();
	//  106  253:aload           6
	//  107  255:invokevirtual   #212 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  108  258:invokevirtual   #217 <Method void AlertDialog.show()>
			return;
	//  109  261:return          
		}
		if(l1 == j1)
	//* 110  262:iload           5
	//* 111  264:iload_2         
	//* 112  265:icmpne          287
		{
			wx.b("Debug mode [Creative Preview] selected.");
	//  113  268:ldc2            #331 <String "Debug mode [Creative Preview] selected.">
	//  114  271:invokestatic    #333 <Method void wx.b(String)>
			xe.a(((Runnable) (new yh(this))));
	//  115  274:new             #335 <Class yh>
	//  116  277:dup             
	//  117  278:aload_0         
	//  118  279:invokespecial   #336 <Method void yh(yc)>
	//  119  282:invokestatic    #341 <Method abe xe.a(Runnable)>
	//  120  285:pop             
			return;
	//  121  286:return          
		}
		if(l1 == k1)
	//* 122  287:iload           5
	//* 123  289:iload_3         
	//* 124  290:icmpne          311
		{
			wx.b("Debug mode [Troubleshooting] selected.");
	//  125  293:ldc2            #343 <String "Debug mode [Troubleshooting] selected.">
	//  126  296:invokestatic    #333 <Method void wx.b(String)>
			xe.a(((Runnable) (new yi(this))));
	//  127  299:new             #345 <Class yi>
	//  128  302:dup             
	//  129  303:aload_0         
	//  130  304:invokespecial   #346 <Method void yi(yc)>
	//  131  307:invokestatic    #341 <Method abe xe.a(Runnable)>
	//  132  310:pop             
		}
	//  133  311:return          
	}

	public final void a(MotionEvent motionevent)
	{
		e e1 = p.ci;
	//    0    0:getstatic       #353 <Field e p.ci>
	//    1    3:astore          7
		if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*   2    5:invokestatic    #358 <Method m bwk.e()>
	//*   3    8:aload           7
	//*   4   10:invokevirtual   #363 <Method Object m.a(e)>
	//*   5   13:checkcast       #365 <Class Boolean>
	//*   6   16:invokevirtual   #368 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            281
		{
			int i1 = motionevent.getActionMasked();
	//    8   22:aload_1         
	//    9   23:invokevirtual   #373 <Method int MotionEvent.getActionMasked()>
	//   10   26:istore_2        
			int j2 = motionevent.getHistorySize();
	//   11   27:aload_1         
	//   12   28:invokevirtual   #376 <Method int MotionEvent.getHistorySize()>
	//   13   31:istore          5
			int k1 = motionevent.getPointerCount();
	//   14   33:aload_1         
	//   15   34:invokevirtual   #379 <Method int MotionEvent.getPointerCount()>
	//   16   37:istore_3        
			if(i1 == 0)
	//*  17   38:iload_2         
	//*  18   39:ifne            64
			{
				j = 0;
	//   19   42:aload_0         
	//   20   43:iconst_0        
	//   21   44:putfield        #35  <Field int j>
				l = motionevent.getX();
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:invokevirtual   #383 <Method float MotionEvent.getX()>
	//   25   52:putfield        #122 <Field float l>
				m = motionevent.getY();
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #386 <Method float MotionEvent.getY()>
	//   29   60:putfield        #130 <Field float m>
				return;
	//   30   63:return          
			}
			int k2 = j;
	//   31   64:aload_0         
	//   32   65:getfield        #35  <Field int j>
	//   33   68:istore          6
			if(k2 != -1)
	//*  34   70:iload           6
	//*  35   72:iconst_m1       
	//*  36   73:icmpeq          280
			{
				boolean flag = true;
	//   37   76:iconst_1        
	//   38   77:istore          4
				if(k2 == 0 && i1 == 5)
	//*  39   79:iload           6
	//*  40   81:ifne            150
	//*  41   84:iload_2         
	//*  42   85:iconst_5        
	//*  43   86:icmpne          150
				{
					j = 5;
	//   44   89:aload_0         
	//   45   90:iconst_5        
	//   46   91:putfield        #35  <Field int j>
					n = motionevent.getX(1);
	//   47   94:aload_0         
	//   48   95:aload_1         
	//   49   96:iconst_1        
	//   50   97:invokevirtual   #389 <Method float MotionEvent.getX(int)>
	//   51  100:putfield        #132 <Field float n>
					o = motionevent.getY(1);
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:iconst_1        
	//   55  106:invokevirtual   #391 <Method float MotionEvent.getY(int)>
	//   56  109:putfield        #134 <Field float o>
					motionevent = ((MotionEvent) (p));
	//   57  112:aload_0         
	//   58  113:getfield        #91  <Field Handler p>
	//   59  116:astore_1        
					Runnable runnable = q;
	//   60  117:aload_0         
	//   61  118:getfield        #42  <Field Runnable q>
	//   62  121:astore          7
					e e2 = p.cj;
	//   63  123:getstatic       #394 <Field e p.cj>
	//   64  126:astore          8
					((Handler) (motionevent)).postDelayed(runnable, ((Long)bwk.e().a(e2)).longValue());
	//   65  128:aload_1         
	//   66  129:aload           7
	//   67  131:invokestatic    #358 <Method m bwk.e()>
	//   68  134:aload           8
	//   69  136:invokevirtual   #363 <Method Object m.a(e)>
	//   70  139:checkcast       #396 <Class Long>
	//   71  142:invokevirtual   #400 <Method long Long.longValue()>
	//   72  145:invokevirtual   #406 <Method boolean Handler.postDelayed(Runnable, long)>
	//   73  148:pop             
					return;
	//   74  149:return          
				}
				if(j == 5)
	//*  75  150:aload_0         
	//*  76  151:getfield        #35  <Field int j>
	//*  77  154:iconst_5        
	//*  78  155:icmpne          280
				{
					if(k1 != 2)
	//*  79  158:iload_3         
	//*  80  159:iconst_2        
	//*  81  160:icmpeq          169
						i1 = ((int) (flag));
	//   82  163:iload           4
	//   83  165:istore_2        
					else
	//*  84  166:goto            260
					if(i1 == 2)
	//*  85  169:iload_2         
	//*  86  170:iconst_2        
	//*  87  171:icmpne          258
					{
						int l1 = 0;
	//   88  174:iconst_0        
	//   89  175:istore_3        
						i1 = 0;
	//   90  176:iconst_0        
	//   91  177:istore_2        
						for(; l1 < j2; l1++)
	//*  92  178:iload_3         
	//*  93  179:iload           5
	//*  94  181:icmpge          224
							if(!a(motionevent.getHistoricalX(0, l1), motionevent.getHistoricalY(0, l1), motionevent.getHistoricalX(1, l1), motionevent.getHistoricalY(1, l1)))
	//*  95  184:aload_0         
	//*  96  185:aload_1         
	//*  97  186:iconst_0        
	//*  98  187:iload_3         
	//*  99  188:invokevirtual   #410 <Method float MotionEvent.getHistoricalX(int, int)>
	//* 100  191:aload_1         
	//* 101  192:iconst_0        
	//* 102  193:iload_3         
	//* 103  194:invokevirtual   #413 <Method float MotionEvent.getHistoricalY(int, int)>
	//* 104  197:aload_1         
	//* 105  198:iconst_1        
	//* 106  199:iload_3         
	//* 107  200:invokevirtual   #410 <Method float MotionEvent.getHistoricalX(int, int)>
	//* 108  203:aload_1         
	//* 109  204:iconst_1        
	//* 110  205:iload_3         
	//* 111  206:invokevirtual   #413 <Method float MotionEvent.getHistoricalY(int, int)>
	//* 112  209:invokespecial   #415 <Method boolean a(float, float, float, float)>
	//* 113  212:ifne            217
								i1 = 1;
	//  114  215:iconst_1        
	//  115  216:istore_2        

	//  116  217:iload_3         
	//  117  218:iconst_1        
	//  118  219:iadd            
	//  119  220:istore_3        
	//* 120  221:goto            178
						if(!a(motionevent.getX(), motionevent.getY(), motionevent.getX(1), motionevent.getY(1)))
	//* 121  224:aload_0         
	//* 122  225:aload_1         
	//* 123  226:invokevirtual   #383 <Method float MotionEvent.getX()>
	//* 124  229:aload_1         
	//* 125  230:invokevirtual   #386 <Method float MotionEvent.getY()>
	//* 126  233:aload_1         
	//* 127  234:iconst_1        
	//* 128  235:invokevirtual   #389 <Method float MotionEvent.getX(int)>
	//* 129  238:aload_1         
	//* 130  239:iconst_1        
	//* 131  240:invokevirtual   #391 <Method float MotionEvent.getY(int)>
	//* 132  243:invokespecial   #415 <Method boolean a(float, float, float, float)>
	//* 133  246:ifne            255
							i1 = ((int) (flag));
	//  134  249:iload           4
	//  135  251:istore_2        
					} else
	//* 136  252:goto            260
	//* 137  255:goto            260
					{
						i1 = 0;
	//  138  258:iconst_0        
	//  139  259:istore_2        
					}
					if(i1 != 0)
	//* 140  260:iload_2         
	//* 141  261:ifeq            280
					{
						j = -1;
	//  142  264:aload_0         
	//  143  265:iconst_m1       
	//  144  266:putfield        #35  <Field int j>
						p.removeCallbacks(q);
	//  145  269:aload_0         
	//  146  270:getfield        #91  <Field Handler p>
	//  147  273:aload_0         
	//  148  274:getfield        #42  <Field Runnable q>
	//  149  277:invokevirtual   #419 <Method void Handler.removeCallbacks(Runnable)>
					}
				}
			}
			return;
	//  150  280:return          
		}
		int i2 = motionevent.getHistorySize();
	//  151  281:aload_1         
	//  152  282:invokevirtual   #376 <Method int MotionEvent.getHistorySize()>
	//  153  285:istore_3        
		for(int j1 = 0; j1 < i2; j1++)
	//* 154  286:iconst_0        
	//* 155  287:istore_2        
	//* 156  288:iload_2         
	//* 157  289:iload_3         
	//* 158  290:icmpge          320
			a(motionevent.getActionMasked(), motionevent.getHistoricalX(0, j1), motionevent.getHistoricalY(0, j1));
	//  159  293:aload_0         
	//  160  294:aload_1         
	//  161  295:invokevirtual   #373 <Method int MotionEvent.getActionMasked()>
	//  162  298:aload_1         
	//  163  299:iconst_0        
	//  164  300:iload_2         
	//  165  301:invokevirtual   #410 <Method float MotionEvent.getHistoricalX(int, int)>
	//  166  304:aload_1         
	//  167  305:iconst_0        
	//  168  306:iload_2         
	//  169  307:invokevirtual   #413 <Method float MotionEvent.getHistoricalY(int, int)>
	//  170  310:invokespecial   #421 <Method void a(int, float, float)>

	//  171  313:iload_2         
	//  172  314:iconst_1        
	//  173  315:iadd            
	//  174  316:istore_2        
	//* 175  317:goto            288
		a(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
	//  176  320:aload_0         
	//  177  321:aload_1         
	//  178  322:invokevirtual   #373 <Method int MotionEvent.getActionMasked()>
	//  179  325:aload_1         
	//  180  326:invokevirtual   #383 <Method float MotionEvent.getX()>
	//  181  329:aload_1         
	//  182  330:invokevirtual   #386 <Method float MotionEvent.getY()>
	//  183  333:invokespecial   #421 <Method void a(int, float, float)>
	//  184  336:return          
	}

	public final void a(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #423 <Field String c>
	//    3    5:return          
	}

	final void a(String s, DialogInterface dialoginterface, int i1)
	{
		aw.e();
	//    0    0:invokestatic    #259 <Method xg aw.e()>
	//    1    3:pop             
		xg.a(a, Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", s), "Share via"));
	//    2    4:aload_0         
	//    3    5:getfield        #44  <Field Context a>
	//    4    8:new             #426 <Class Intent>
	//    5   11:dup             
	//    6   12:ldc2            #428 <String "android.intent.action.SEND">
	//    7   15:invokespecial   #430 <Method void Intent(String)>
	//    8   18:ldc2            #432 <String "text/plain">
	//    9   21:invokevirtual   #436 <Method Intent Intent.setType(String)>
	//   10   24:ldc2            #438 <String "android.intent.extra.TEXT">
	//   11   27:aload_1         
	//   12   28:invokevirtual   #442 <Method Intent Intent.putExtra(String, String)>
	//   13   31:ldc2            #444 <String "Share via">
	//   14   34:invokestatic    #448 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   15   37:invokestatic    #451 <Method void xg.a(Context, Intent)>
	//   16   40:return          
	}

	final void b()
	{
		aw.o().a(a, c, d, e);
	//    0    0:invokestatic    #148 <Method yj aw.o()>
	//    1    3:aload_0         
	//    2    4:getfield        #44  <Field Context a>
	//    3    7:aload_0         
	//    4    8:getfield        #423 <Field String c>
	//    5   11:aload_0         
	//    6   12:getfield        #453 <Field String d>
	//    7   15:aload_0         
	//    8   16:getfield        #455 <Field String e>
	//    9   19:invokevirtual   #458 <Method void yj.a(Context, String, String, String)>
	//   10   22:return          
	}

	public final void b(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #453 <Field String d>
	//    3    5:return          
	}

	final void c()
	{
		aw.o().a(a, c, d);
	//    0    0:invokestatic    #148 <Method yj aw.o()>
	//    1    3:aload_0         
	//    2    4:getfield        #44  <Field Context a>
	//    3    7:aload_0         
	//    4    8:getfield        #423 <Field String c>
	//    5   11:aload_0         
	//    6   12:getfield        #453 <Field String d>
	//    7   15:invokevirtual   #461 <Method void yj.a(Context, String, String)>
	//    8   18:return          
	}

	public final void c(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field String b>
	//    3    5:return          
	}

	final void d()
	{
		j = 4;
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:putfield        #35  <Field int j>
		a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #119 <Method void a()>
	//    5    9:return          
	}

	public final void d(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #455 <Field String e>
	//    3    5:return          
	}

	private final Context a;
	private String b;
	private String c;
	private String d;
	private String e;
	private final float f;
	private float g;
	private float h;
	private float i;
	private int j;
	private int k;
	private float l;
	private float m;
	private float n;
	private float o;
	private Handler p;
	private Runnable q;
}
