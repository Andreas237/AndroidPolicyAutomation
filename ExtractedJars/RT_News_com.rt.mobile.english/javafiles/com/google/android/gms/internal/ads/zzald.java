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
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzale, zzamg, zzakb, zzakk, 
//			zzalg, zzalh, zznk, zzkb, 
//			zzni, zzalk, zzakq, zzalf, 
//			zzali, zzaki, zzalj

public final class zzald
{

	public zzald(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		state = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field int state>
		zzcsg = ((Runnable) (new zzale(this)));
	//    5    9:aload_0         
	//    6   10:new             #38  <Class zzale>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #41  <Method void zzale(zzald)>
	//   10   18:putfield        #43  <Field Runnable zzcsg>
		mContext = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #45  <Field Context mContext>
		zzbwx = context.getResources().getDisplayMetrics().density;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #51  <Method Resources Context.getResources()>
	//   17   31:invokevirtual   #57  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   18   34:getfield        #62  <Field float DisplayMetrics.density>
	//   19   37:putfield        #64  <Field float zzbwx>
		zzcsb = ViewConfiguration.get(mContext).getScaledTouchSlop();
	//   20   40:aload_0         
	//   21   41:aload_0         
	//   22   42:getfield        #45  <Field Context mContext>
	//   23   45:invokestatic    #70  <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   24   48:invokevirtual   #74  <Method int ViewConfiguration.getScaledTouchSlop()>
	//   25   51:putfield        #76  <Field int zzcsb>
		zzbv.zzez().zzsa();
	//   26   54:invokestatic    #82  <Method zzamg zzbv.zzez()>
	//   27   57:invokevirtual   #88  <Method android.os.Looper zzamg.zzsa()>
	//   28   60:pop             
		handler = zzbv.zzez().getHandler();
	//   29   61:aload_0         
	//   30   62:invokestatic    #82  <Method zzamg zzbv.zzez()>
	//   31   65:invokevirtual   #92  <Method Handler zzamg.getHandler()>
	//   32   68:putfield        #94  <Field Handler handler>
	//   33   71:return          
	}

	public zzald(Context context, String s)
	{
		this(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void zzald(Context)>
		zzcrx = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #100 <Field String zzcrx>
	//    6   10:return          
	}

	private static int zza(List list, String s, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
		{
			return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
		} else
		{
			list.add(((Object) (s)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokeinterface #108 <Method boolean List.add(Object)>
	//    7   13:pop             
			return list.size() - 1;
	//    8   14:aload_0         
	//    9   15:invokeinterface #111 <Method int List.size()>
	//   10   20:iconst_1        
	//   11   21:isub            
	//   12   22:ireturn         
		}
	}

	private final void zza(int i, float f, float f1)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            25
		{
			state = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field int state>
			zzcry = f;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #117 <Field float zzcry>
			zzcrz = f1;
	//    8   14:aload_0         
	//    9   15:fload_3         
	//   10   16:putfield        #119 <Field float zzcrz>
			zzcsa = f1;
	//   11   19:aload_0         
	//   12   20:fload_3         
	//   13   21:putfield        #121 <Field float zzcsa>
			return;
	//   14   24:return          
		}
		if(state == -1)
	//*  15   25:aload_0         
	//*  16   26:getfield        #36  <Field int state>
	//*  17   29:iconst_m1       
	//*  18   30:icmpne          34
			return;
	//   19   33:return          
		if(i == 2)
	//*  20   34:iload_1         
	//*  21   35:iconst_2        
	//*  22   36:icmpne          239
		{
			if(f1 > zzcrz)
	//*  23   39:fload_3         
	//*  24   40:aload_0         
	//*  25   41:getfield        #119 <Field float zzcrz>
	//*  26   44:fcmpl           
	//*  27   45:ifle            56
				zzcrz = f1;
	//   28   48:aload_0         
	//   29   49:fload_3         
	//   30   50:putfield        #119 <Field float zzcrz>
			else
	//*  31   53:goto            70
			if(f1 < zzcsa)
	//*  32   56:fload_3         
	//*  33   57:aload_0         
	//*  34   58:getfield        #121 <Field float zzcsa>
	//*  35   61:fcmpg           
	//*  36   62:ifge            70
				zzcsa = f1;
	//   37   65:aload_0         
	//   38   66:fload_3         
	//   39   67:putfield        #121 <Field float zzcsa>
			if(zzcrz - zzcsa > 30F * zzbwx)
	//*  40   70:aload_0         
	//*  41   71:getfield        #119 <Field float zzcrz>
	//*  42   74:aload_0         
	//*  43   75:getfield        #121 <Field float zzcsa>
	//*  44   78:fsub            
	//*  45   79:ldc1            #122 <Float 30F>
	//*  46   81:aload_0         
	//*  47   82:getfield        #64  <Field float zzbwx>
	//*  48   85:fmul            
	//*  49   86:fcmpl           
	//*  50   87:ifle            96
			{
				state = -1;
	//   51   90:aload_0         
	//   52   91:iconst_m1       
	//   53   92:putfield        #36  <Field int state>
				return;
	//   54   95:return          
			}
			if(state != 0 && state != 2 ? (state == 1 || state == 3) && f - zzcry <= -50F * zzbwx : f - zzcry >= 50F * zzbwx)
	//*  55   96:aload_0         
	//*  56   97:getfield        #36  <Field int state>
	//*  57  100:ifeq            150
	//*  58  103:aload_0         
	//*  59  104:getfield        #36  <Field int state>
	//*  60  107:iconst_2        
	//*  61  108:icmpne          114
	//*  62  111:goto            150
	//*  63  114:aload_0         
	//*  64  115:getfield        #36  <Field int state>
	//*  65  118:iconst_1        
	//*  66  119:icmpeq          130
	//*  67  122:aload_0         
	//*  68  123:getfield        #36  <Field int state>
	//*  69  126:iconst_3        
	//*  70  127:icmpne          182
	//*  71  130:fload_2         
	//*  72  131:aload_0         
	//*  73  132:getfield        #117 <Field float zzcry>
	//*  74  135:fsub            
	//*  75  136:ldc1            #123 <Float -50F>
	//*  76  138:aload_0         
	//*  77  139:getfield        #64  <Field float zzbwx>
	//*  78  142:fmul            
	//*  79  143:fcmpg           
	//*  80  144:ifgt            182
	//*  81  147:goto            167
	//*  82  150:fload_2         
	//*  83  151:aload_0         
	//*  84  152:getfield        #117 <Field float zzcry>
	//*  85  155:fsub            
	//*  86  156:ldc1            #124 <Float 50F>
	//*  87  158:aload_0         
	//*  88  159:getfield        #64  <Field float zzbwx>
	//*  89  162:fmul            
	//*  90  163:fcmpl           
	//*  91  164:iflt            182
			{
				zzcry = f;
	//   92  167:aload_0         
	//   93  168:fload_2         
	//   94  169:putfield        #117 <Field float zzcry>
				state = state + 1;
	//   95  172:aload_0         
	//   96  173:aload_0         
	//   97  174:getfield        #36  <Field int state>
	//   98  177:iconst_1        
	//   99  178:iadd            
	//  100  179:putfield        #36  <Field int state>
			}
			if(state != 1 && state != 3)
	//* 101  182:aload_0         
	//* 102  183:getfield        #36  <Field int state>
	//* 103  186:iconst_1        
	//* 104  187:icmpeq          224
	//* 105  190:aload_0         
	//* 106  191:getfield        #36  <Field int state>
	//* 107  194:iconst_3        
	//* 108  195:icmpne          201
	//* 109  198:goto            224
			{
				if(state == 2 && f < zzcry)
	//* 110  201:aload_0         
	//* 111  202:getfield        #36  <Field int state>
	//* 112  205:iconst_2        
	//* 113  206:icmpne          256
	//* 114  209:fload_2         
	//* 115  210:aload_0         
	//* 116  211:getfield        #117 <Field float zzcry>
	//* 117  214:fcmpg           
	//* 118  215:ifge            256
				{
					zzcry = f;
	//  119  218:aload_0         
	//  120  219:fload_2         
	//  121  220:putfield        #117 <Field float zzcry>
					return;
	//  122  223:return          
				}
			} else
			if(f > zzcry)
	//* 123  224:fload_2         
	//* 124  225:aload_0         
	//* 125  226:getfield        #117 <Field float zzcry>
	//* 126  229:fcmpl           
	//* 127  230:ifle            256
			{
				zzcry = f;
	//  128  233:aload_0         
	//  129  234:fload_2         
	//  130  235:putfield        #117 <Field float zzcry>
				return;
	//  131  238:return          
			}
		} else
		if(i == 1 && state == 4)
	//* 132  239:iload_1         
	//* 133  240:iconst_1        
	//* 134  241:icmpne          256
	//* 135  244:aload_0         
	//* 136  245:getfield        #36  <Field int state>
	//* 137  248:iconst_4        
	//* 138  249:icmpne          256
			showDialog();
	//  139  252:aload_0         
	//  140  253:invokevirtual   #127 <Method void showDialog()>
	//  141  256:return          
	}

	private final boolean zza(float f, float f1, float f2, float f3)
	{
		return Math.abs(zzcsc - f) < (float)zzcsb && Math.abs(zzcsd - f1) < (float)zzcsb && Math.abs(zzcse - f2) < (float)zzcsb && Math.abs(zzcsf - f3) < (float)zzcsb;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field float zzcsc>
	//    2    4:fload_1         
	//    3    5:fsub            
	//    4    6:invokestatic    #137 <Method float Math.abs(float)>
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field int zzcsb>
	//    7   13:i2f             
	//    8   14:fcmpg           
	//    9   15:ifge            75
	//   10   18:aload_0         
	//   11   19:getfield        #139 <Field float zzcsd>
	//   12   22:fload_2         
	//   13   23:fsub            
	//   14   24:invokestatic    #137 <Method float Math.abs(float)>
	//   15   27:aload_0         
	//   16   28:getfield        #76  <Field int zzcsb>
	//   17   31:i2f             
	//   18   32:fcmpg           
	//   19   33:ifge            75
	//   20   36:aload_0         
	//   21   37:getfield        #141 <Field float zzcse>
	//   22   40:fload_3         
	//   23   41:fsub            
	//   24   42:invokestatic    #137 <Method float Math.abs(float)>
	//   25   45:aload_0         
	//   26   46:getfield        #76  <Field int zzcsb>
	//   27   49:i2f             
	//   28   50:fcmpg           
	//   29   51:ifge            75
	//   30   54:aload_0         
	//   31   55:getfield        #143 <Field float zzcsf>
	//   32   58:fload           4
	//   33   60:fsub            
	//   34   61:invokestatic    #137 <Method float Math.abs(float)>
	//   35   64:aload_0         
	//   36   65:getfield        #76  <Field int zzcsb>
	//   37   68:i2f             
	//   38   69:fcmpg           
	//   39   70:ifge            75
	//   40   73:iconst_1        
	//   41   74:ireturn         
	//   42   75:iconst_0        
	//   43   76:ireturn         
	}

	private final void zzrs()
	{
		Object obj;
label0:
		{
			if(!(mContext instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Context mContext>
	//*   2    4:instanceof      #146 <Class Activity>
	//*   3    7:ifne            16
			{
				zzakb.zzdj("Can not create dialog without Activity Context");
	//    4   10:ldc1            #148 <String "Can not create dialog without Activity Context">
	//    5   12:invokestatic    #154 <Method void zzakb.zzdj(String)>
				return;
	//    6   15:return          
			}
			obj = ((Object) (zzcrx));
	//    7   16:aload_0         
	//    8   17:getfield        #100 <Field String zzcrx>
	//    9   20:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  10   21:aload_1         
	//*  11   22:invokestatic    #160 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   25:ifne            159
			{
				obj = ((Object) (((String) (obj)).replaceAll("\\+", "%20")));
	//   13   28:aload_1         
	//   14   29:ldc1            #162 <String "\\+">
	//   15   31:ldc1            #164 <String "%20">
	//   16   33:invokevirtual   #170 <Method String String.replaceAll(String, String)>
	//   17   36:astore_1        
				Object obj1 = ((Object) ((new android.net.Uri.Builder()).encodedQuery(((String) (obj))).build()));
	//   18   37:new             #172 <Class android.net.Uri$Builder>
	//   19   40:dup             
	//   20   41:invokespecial   #173 <Method void android.net.Uri$Builder()>
	//   21   44:aload_1         
	//   22   45:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.encodedQuery(String)>
	//   23   48:invokevirtual   #181 <Method android.net.Uri android.net.Uri$Builder.build()>
	//   24   51:astore_2        
				obj = ((Object) (new StringBuilder()));
	//   25   52:new             #183 <Class StringBuilder>
	//   26   55:dup             
	//   27   56:invokespecial   #184 <Method void StringBuilder()>
	//   28   59:astore_1        
				zzbv.zzek();
	//   29   60:invokestatic    #188 <Method zzakk zzbv.zzek()>
	//   30   63:pop             
				obj1 = ((Object) (zzakk.zzg(((android.net.Uri) (obj1)))));
	//   31   64:aload_2         
	//   32   65:invokestatic    #194 <Method Map zzakk.zzg(android.net.Uri)>
	//   33   68:astore_2        
				for(Iterator iterator = ((Map) (obj1)).keySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append("\n\n"))
	//*  34   69:aload_2         
	//*  35   70:invokeinterface #200 <Method Set Map.keySet()>
	//*  36   75:invokeinterface #206 <Method Iterator Set.iterator()>
	//*  37   80:astore_3        
	//*  38   81:aload_3         
	//*  39   82:invokeinterface #212 <Method boolean Iterator.hasNext()>
	//*  40   87:ifeq            141
				{
					String s = (String)iterator.next();
	//   41   90:aload_3         
	//   42   91:invokeinterface #216 <Method Object Iterator.next()>
	//   43   96:checkcast       #166 <Class String>
	//   44   99:astore          4
					((StringBuilder) (obj)).append(s);
	//   45  101:aload_1         
	//   46  102:aload           4
	//   47  104:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   48  107:pop             
					((StringBuilder) (obj)).append(" = ");
	//   49  108:aload_1         
	//   50  109:ldc1            #222 <String " = ">
	//   51  111:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   52  114:pop             
					((StringBuilder) (obj)).append((String)((Map) (obj1)).get(((Object) (s))));
	//   53  115:aload_1         
	//   54  116:aload_2         
	//   55  117:aload           4
	//   56  119:invokeinterface #225 <Method Object Map.get(Object)>
	//   57  124:checkcast       #166 <Class String>
	//   58  127:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   59  130:pop             
				}

	//   60  131:aload_1         
	//   61  132:ldc1            #227 <String "\n\n">
	//   62  134:invokevirtual   #220 <Method StringBuilder StringBuilder.append(String)>
	//   63  137:pop             
	//*  64  138:goto            81
				obj = ((Object) (((StringBuilder) (obj)).toString().trim()));
	//   65  141:aload_1         
	//   66  142:invokevirtual   #231 <Method String StringBuilder.toString()>
	//   67  145:invokevirtual   #234 <Method String String.trim()>
	//   68  148:astore_1        
				if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  69  149:aload_1         
	//*  70  150:invokestatic    #160 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  71  153:ifne            159
					break label0;
	//   72  156:goto            162
			}
			obj = "No debug information";
	//   73  159:ldc1            #236 <String "No debug information">
	//   74  161:astore_1        
		}
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
	//   75  162:new             #238 <Class android.app.AlertDialog$Builder>
	//   76  165:dup             
	//   77  166:aload_0         
	//   78  167:getfield        #45  <Field Context mContext>
	//   79  170:invokespecial   #239 <Method void android.app.AlertDialog$Builder(Context)>
	//   80  173:astore_2        
		builder.setMessage(((CharSequence) (obj)));
	//   81  174:aload_2         
	//   82  175:aload_1         
	//   83  176:invokevirtual   #243 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   84  179:pop             
		builder.setTitle("Ad Information");
	//   85  180:aload_2         
	//   86  181:ldc1            #245 <String "Ad Information">
	//   87  183:invokevirtual   #248 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   88  186:pop             
		builder.setPositiveButton("Share", ((android.content.DialogInterface.OnClickListener) (new zzalg(this, ((String) (obj))))));
	//   89  187:aload_2         
	//   90  188:ldc1            #250 <String "Share">
	//   91  190:new             #252 <Class zzalg>
	//   92  193:dup             
	//   93  194:aload_0         
	//   94  195:aload_1         
	//   95  196:invokespecial   #255 <Method void zzalg(zzald, String)>
	//   96  199:invokevirtual   #259 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   97  202:pop             
		builder.setNegativeButton("Close", zzalh.zzcsl);
	//   98  203:aload_2         
	//   99  204:ldc2            #261 <String "Close">
	//  100  207:getstatic       #267 <Field android.content.DialogInterface$OnClickListener zzalh.zzcsl>
	//  101  210:invokevirtual   #270 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//  102  213:pop             
		builder.create().show();
	//  103  214:aload_2         
	//  104  215:invokevirtual   #274 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//  105  218:invokevirtual   #279 <Method void AlertDialog.show()>
	//  106  221:return          
	}

	public final void setAdUnitId(String s)
	{
		zzye = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #282 <Field String zzye>
	//    3    5:return          
	}

	public final void showDialog()
	{
		Object obj;
		obj = ((Object) (zznk.zzbec));
	//    0    0:getstatic       #290 <Field zzna zznk.zzbec>
	//    1    3:astore          4
		if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
			break MISSING_BLOCK_LABEL_52;
	//    2    5:invokestatic    #296 <Method zzni zzkb.zzik()>
	//    3    8:aload           4
	//    4   10:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//    5   13:checkcast       #304 <Class Boolean>
	//    6   16:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//    7   19:ifne            52
		obj = ((Object) (zznk.zzbeb));
	//    8   22:getstatic       #310 <Field zzna zznk.zzbeb>
	//    9   25:astore          4
		String s;
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//*  10   27:invokestatic    #296 <Method zzni zzkb.zzik()>
	//*  11   30:aload           4
	//*  12   32:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//*  13   35:checkcast       #304 <Class Boolean>
	//*  14   38:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//*  15   41:ifeq            47
	//*  16   44:goto            52
		{
			int i;
			int j;
			int k;
			ArrayList arraylist;
			zzna zzna;
			try
			{
				zzrs();
	//   17   47:aload_0         
	//   18   48:invokespecial   #312 <Method void zzrs()>
				return;
	//   19   51:return          
			}
	//*  20   52:aload_0         
	//*  21   53:getfield        #45  <Field Context mContext>
	//*  22   56:instanceof      #146 <Class Activity>
	//*  23   59:ifne            68
	//*  24   62:ldc1            #148 <String "Can not create dialog without Activity Context">
	//*  25   64:invokestatic    #154 <Method void zzakb.zzdj(String)>
	//*  26   67:return          
	//*  27   68:invokestatic    #316 <Method zzalk zzbv.zzeu()>
	//*  28   71:invokevirtual   #321 <Method String zzalk.zzrw()>
	//*  29   74:invokestatic    #160 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   77:ifne            263
	//*  31   80:ldc2            #323 <String "Creative Preview (Enabled)">
	//*  32   83:astore          4
	//*  33   85:goto            88
	//*  34   88:invokestatic    #316 <Method zzalk zzbv.zzeu()>
	//*  35   91:invokevirtual   #326 <Method boolean zzalk.zzrx()>
	//*  36   94:ifeq            271
	//*  37   97:ldc2            #328 <String "Troubleshooting (Enabled)">
	//*  38  100:astore          5
	//*  39  102:goto            105
	//*  40  105:new             #330 <Class ArrayList>
	//*  41  108:dup             
	//*  42  109:invokespecial   #331 <Method void ArrayList()>
	//*  43  112:astore          6
	//*  44  114:aload           6
	//*  45  116:ldc1            #245 <String "Ad Information">
	//*  46  118:iconst_1        
	//*  47  119:invokestatic    #333 <Method int zza(List, String, boolean)>
	//*  48  122:istore_1        
	//*  49  123:getstatic       #310 <Field zzna zznk.zzbeb>
	//*  50  126:astore          7
	//*  51  128:aload           6
	//*  52  130:aload           4
	//*  53  132:invokestatic    #296 <Method zzni zzkb.zzik()>
	//*  54  135:aload           7
	//*  55  137:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//*  56  140:checkcast       #304 <Class Boolean>
	//*  57  143:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//*  58  146:invokestatic    #333 <Method int zza(List, String, boolean)>
	//*  59  149:istore_2        
	//*  60  150:getstatic       #290 <Field zzna zznk.zzbec>
	//*  61  153:astore          4
	//*  62  155:aload           6
	//*  63  157:aload           5
	//*  64  159:invokestatic    #296 <Method zzni zzkb.zzik()>
	//*  65  162:aload           4
	//*  66  164:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//*  67  167:checkcast       #304 <Class Boolean>
	//*  68  170:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//*  69  173:invokestatic    #333 <Method int zza(List, String, boolean)>
	//*  70  176:istore_3        
	//*  71  177:new             #238 <Class android.app.AlertDialog$Builder>
	//*  72  180:dup             
	//*  73  181:aload_0         
	//*  74  182:getfield        #45  <Field Context mContext>
	//*  75  185:invokestatic    #337 <Method zzakq zzbv.zzem()>
	//*  76  188:invokevirtual   #342 <Method int zzakq.zzrq()>
	//*  77  191:invokespecial   #345 <Method void android.app.AlertDialog$Builder(Context, int)>
	//*  78  194:astore          4
	//*  79  196:aload           4
	//*  80  198:ldc2            #347 <String "Select a Debug Mode">
	//*  81  201:invokevirtual   #248 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//*  82  204:aload           6
	//*  83  206:iconst_0        
	//*  84  207:anewarray       String[]
	//*  85  210:invokeinterface #351 <Method Object[] List.toArray(Object[])>
	//*  86  215:checkcast       #353 <Class CharSequence[]>
	//*  87  218:new             #355 <Class zzalf>
	//*  88  221:dup             
	//*  89  222:aload_0         
	//*  90  223:iload_1         
	//*  91  224:iload_2         
	//*  92  225:iload_3         
	//*  93  226:invokespecial   #358 <Method void zzalf(zzald, int, int, int)>
	//*  94  229:invokevirtual   #362 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setItems(CharSequence[], android.content.DialogInterface$OnClickListener)>
	//*  95  232:pop             
	//*  96  233:aload           4
	//*  97  235:invokevirtual   #274 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//*  98  238:invokevirtual   #279 <Method void AlertDialog.show()>
	//*  99  241:return          
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//  100  242:astore          4
			break MISSING_BLOCK_LABEL_244;
		}
		if(!(mContext instanceof Activity))
		{
			zzakb.zzdj("Can not create dialog without Activity Context");
			return;
		}
		if(!TextUtils.isEmpty(((CharSequence) (zzbv.zzeu().zzrw()))))
			obj = "Creative Preview (Enabled)";
		else
	//* 101  244:invokestatic    #365 <Method boolean zzakb.zzqp()>
	//* 102  247:ifeq            262
	//* 103  250:ldc2            #367 <String "Ads">
	//* 104  253:ldc2            #369 <String "">
	//* 105  256:aload           4
	//* 106  258:invokestatic    #375 <Method int Log.v(String, String, Throwable)>
	//* 107  261:pop             
	//* 108  262:return          
			obj = "Creative Preview";
	//  109  263:ldc2            #377 <String "Creative Preview">
	//  110  266:astore          4
		if(zzbv.zzeu().zzrx())
			s = "Troubleshooting (Enabled)";
		else
	//* 111  268:goto            88
			s = "Troubleshooting";
	//  112  271:ldc2            #379 <String "Troubleshooting">
	//  113  274:astore          5
		arraylist = new ArrayList();
		i = zza(((List) (arraylist)), "Ad Information", true);
		zzna = zznk.zzbeb;
		j = zza(((List) (arraylist)), ((String) (obj)), ((Boolean)zzkb.zzik().zzd(zzna)).booleanValue());
		obj = ((Object) (zznk.zzbec));
		k = zza(((List) (arraylist)), s, ((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue());
		obj = ((Object) (new android.app.AlertDialog.Builder(mContext, zzbv.zzem().zzrq())));
		((android.app.AlertDialog.Builder) (obj)).setTitle("Select a Debug Mode").setItems((CharSequence[])((List) (arraylist)).toArray(((Object []) (new String[0]))), ((android.content.DialogInterface.OnClickListener) (new zzalf(this, i, j, k))));
		((android.app.AlertDialog.Builder) (obj)).create().show();
		return;
		if(zzakb.zzqp())
			Log.v("Ads", "", ((Throwable) (obj)));
		return;
	//* 114  276:goto            105
	}

	final void zza(int i, int j, int k, DialogInterface dialoginterface, int l)
	{
		if(l == i)
	//*   0    0:iload           5
	//*   1    2:iload_1         
	//*   2    3:icmpne          11
		{
			zzrs();
	//    3    6:aload_0         
	//    4    7:invokespecial   #312 <Method void zzrs()>
			return;
	//    5   10:return          
		}
		if(l == j)
	//*   6   11:iload           5
	//*   7   13:iload_2         
	//*   8   14:icmpne          58
		{
			dialoginterface = ((DialogInterface) (zznk.zzbeb));
	//    9   17:getstatic       #310 <Field zzna zznk.zzbeb>
	//   10   20:astore          4
			if(((Boolean)zzkb.zzik().zzd(((zzna) (dialoginterface)))).booleanValue())
	//*  11   22:invokestatic    #296 <Method zzni zzkb.zzik()>
	//*  12   25:aload           4
	//*  13   27:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//*  14   30:checkcast       #304 <Class Boolean>
	//*  15   33:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//*  16   36:ifeq            58
			{
				zzakb.zzck("Debug mode [Creative Preview] selected.");
	//   17   39:ldc2            #382 <String "Debug mode [Creative Preview] selected.">
	//   18   42:invokestatic    #385 <Method void zzakb.zzck(String)>
				zzaki.zzb(((Runnable) (new zzali(this))));
	//   19   45:new             #387 <Class zzali>
	//   20   48:dup             
	//   21   49:aload_0         
	//   22   50:invokespecial   #388 <Method void zzali(zzald)>
	//   23   53:invokestatic    #394 <Method zzanz zzaki.zzb(Runnable)>
	//   24   56:pop             
				return;
	//   25   57:return          
			}
		}
		if(l == k)
	//*  26   58:iload           5
	//*  27   60:iload_3         
	//*  28   61:icmpne          104
		{
			dialoginterface = ((DialogInterface) (zznk.zzbec));
	//   29   64:getstatic       #290 <Field zzna zznk.zzbec>
	//   30   67:astore          4
			if(((Boolean)zzkb.zzik().zzd(((zzna) (dialoginterface)))).booleanValue())
	//*  31   69:invokestatic    #296 <Method zzni zzkb.zzik()>
	//*  32   72:aload           4
	//*  33   74:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//*  34   77:checkcast       #304 <Class Boolean>
	//*  35   80:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//*  36   83:ifeq            104
			{
				zzakb.zzck("Debug mode [Troubleshooting] selected.");
	//   37   86:ldc2            #396 <String "Debug mode [Troubleshooting] selected.">
	//   38   89:invokestatic    #385 <Method void zzakb.zzck(String)>
				zzaki.zzb(((Runnable) (new zzalj(this))));
	//   39   92:new             #398 <Class zzalj>
	//   40   95:dup             
	//   41   96:aload_0         
	//   42   97:invokespecial   #399 <Method void zzalj(zzald)>
	//   43  100:invokestatic    #394 <Method zzanz zzaki.zzb(Runnable)>
	//   44  103:pop             
			}
		}
	//   45  104:return          
	}

	final void zza(String s, DialogInterface dialoginterface, int i)
	{
		zzbv.zzek();
	//    0    0:invokestatic    #188 <Method zzakk zzbv.zzek()>
	//    1    3:pop             
		zzakk.zza(mContext, Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", s), "Share via"));
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field Context mContext>
	//    4    8:new             #402 <Class Intent>
	//    5   11:dup             
	//    6   12:ldc2            #404 <String "android.intent.action.SEND">
	//    7   15:invokespecial   #406 <Method void Intent(String)>
	//    8   18:ldc2            #408 <String "text/plain">
	//    9   21:invokevirtual   #412 <Method Intent Intent.setType(String)>
	//   10   24:ldc2            #414 <String "android.intent.extra.TEXT">
	//   11   27:aload_1         
	//   12   28:invokevirtual   #418 <Method Intent Intent.putExtra(String, String)>
	//   13   31:ldc2            #420 <String "Share via">
	//   14   34:invokestatic    #424 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   15   37:invokestatic    #427 <Method void zzakk.zza(Context, Intent)>
	//   16   40:return          
	}

	public final void zzda(String s)
	{
		zzaej = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #430 <Field String zzaej>
	//    3    5:return          
	}

	public final void zzdb(String s)
	{
		zzcrx = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field String zzcrx>
	//    3    5:return          
	}

	public final void zzdc(String s)
	{
		zzchz = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #434 <Field String zzchz>
	//    3    5:return          
	}

	public final void zze(MotionEvent motionevent)
	{
		zzna zzna = zznk.zzbed;
	//    0    0:getstatic       #439 <Field zzna zznk.zzbed>
	//    1    3:astore          7
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    5:invokestatic    #296 <Method zzni zzkb.zzik()>
	//*   3    8:aload           7
	//*   4   10:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//*   5   13:checkcast       #304 <Class Boolean>
	//*   6   16:invokevirtual   #307 <Method boolean Boolean.booleanValue()>
	//*   7   19:ifeq            283
		{
			int i = motionevent.getActionMasked();
	//    8   22:aload_1         
	//    9   23:invokevirtual   #444 <Method int MotionEvent.getActionMasked()>
	//   10   26:istore_2        
			int j1 = motionevent.getHistorySize();
	//   11   27:aload_1         
	//   12   28:invokevirtual   #447 <Method int MotionEvent.getHistorySize()>
	//   13   31:istore          5
			int k = motionevent.getPointerCount();
	//   14   33:aload_1         
	//   15   34:invokevirtual   #450 <Method int MotionEvent.getPointerCount()>
	//   16   37:istore_3        
			if(i == 0)
	//*  17   38:iload_2         
	//*  18   39:ifne            64
			{
				state = 0;
	//   19   42:aload_0         
	//   20   43:iconst_0        
	//   21   44:putfield        #36  <Field int state>
				zzcsc = motionevent.getX();
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:invokevirtual   #454 <Method float MotionEvent.getX()>
	//   25   52:putfield        #131 <Field float zzcsc>
				zzcsd = motionevent.getY();
	//   26   55:aload_0         
	//   27   56:aload_1         
	//   28   57:invokevirtual   #457 <Method float MotionEvent.getY()>
	//   29   60:putfield        #139 <Field float zzcsd>
				return;
	//   30   63:return          
			}
			if(state != -1)
	//*  31   64:aload_0         
	//*  32   65:getfield        #36  <Field int state>
	//*  33   68:iconst_m1       
	//*  34   69:icmpeq          282
			{
				int k1 = state;
	//   35   72:aload_0         
	//   36   73:getfield        #36  <Field int state>
	//   37   76:istore          6
				boolean flag = true;
	//   38   78:iconst_1        
	//   39   79:istore          4
				if(k1 == 0 && i == 5)
	//*  40   81:iload           6
	//*  41   83:ifne            152
	//*  42   86:iload_2         
	//*  43   87:iconst_5        
	//*  44   88:icmpne          152
				{
					state = 5;
	//   45   91:aload_0         
	//   46   92:iconst_5        
	//   47   93:putfield        #36  <Field int state>
					zzcse = motionevent.getX(1);
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:iconst_1        
	//   51   99:invokevirtual   #460 <Method float MotionEvent.getX(int)>
	//   52  102:putfield        #141 <Field float zzcse>
					zzcsf = motionevent.getY(1);
	//   53  105:aload_0         
	//   54  106:aload_1         
	//   55  107:iconst_1        
	//   56  108:invokevirtual   #462 <Method float MotionEvent.getY(int)>
	//   57  111:putfield        #143 <Field float zzcsf>
					motionevent = ((MotionEvent) (handler));
	//   58  114:aload_0         
	//   59  115:getfield        #94  <Field Handler handler>
	//   60  118:astore_1        
					Runnable runnable = zzcsg;
	//   61  119:aload_0         
	//   62  120:getfield        #43  <Field Runnable zzcsg>
	//   63  123:astore          7
					zzna zzna1 = zznk.zzbee;
	//   64  125:getstatic       #465 <Field zzna zznk.zzbee>
	//   65  128:astore          8
					((Handler) (motionevent)).postDelayed(runnable, ((Long)zzkb.zzik().zzd(zzna1)).longValue());
	//   66  130:aload_1         
	//   67  131:aload           7
	//   68  133:invokestatic    #296 <Method zzni zzkb.zzik()>
	//   69  136:aload           8
	//   70  138:invokevirtual   #302 <Method Object zzni.zzd(zzna)>
	//   71  141:checkcast       #467 <Class Long>
	//   72  144:invokevirtual   #471 <Method long Long.longValue()>
	//   73  147:invokevirtual   #477 <Method boolean Handler.postDelayed(Runnable, long)>
	//   74  150:pop             
					return;
	//   75  151:return          
				}
				if(state == 5)
	//*  76  152:aload_0         
	//*  77  153:getfield        #36  <Field int state>
	//*  78  156:iconst_5        
	//*  79  157:icmpne          282
				{
					if(k != 2)
	//*  80  160:iload_3         
	//*  81  161:iconst_2        
	//*  82  162:icmpeq          171
						i = ((int) (flag));
	//   83  165:iload           4
	//   84  167:istore_2        
					else
	//*  85  168:goto            262
					if(i == 2)
	//*  86  171:iload_2         
	//*  87  172:iconst_2        
	//*  88  173:icmpne          260
					{
						int l = 0;
	//   89  176:iconst_0        
	//   90  177:istore_3        
						i = l;
	//   91  178:iload_3         
	//   92  179:istore_2        
						for(; l < j1; l++)
	//*  93  180:iload_3         
	//*  94  181:iload           5
	//*  95  183:icmpge          226
							if(!zza(motionevent.getHistoricalX(0, l), motionevent.getHistoricalY(0, l), motionevent.getHistoricalX(1, l), motionevent.getHistoricalY(1, l)))
	//*  96  186:aload_0         
	//*  97  187:aload_1         
	//*  98  188:iconst_0        
	//*  99  189:iload_3         
	//* 100  190:invokevirtual   #481 <Method float MotionEvent.getHistoricalX(int, int)>
	//* 101  193:aload_1         
	//* 102  194:iconst_0        
	//* 103  195:iload_3         
	//* 104  196:invokevirtual   #484 <Method float MotionEvent.getHistoricalY(int, int)>
	//* 105  199:aload_1         
	//* 106  200:iconst_1        
	//* 107  201:iload_3         
	//* 108  202:invokevirtual   #481 <Method float MotionEvent.getHistoricalX(int, int)>
	//* 109  205:aload_1         
	//* 110  206:iconst_1        
	//* 111  207:iload_3         
	//* 112  208:invokevirtual   #484 <Method float MotionEvent.getHistoricalY(int, int)>
	//* 113  211:invokespecial   #486 <Method boolean zza(float, float, float, float)>
	//* 114  214:ifne            219
								i = 1;
	//  115  217:iconst_1        
	//  116  218:istore_2        

	//  117  219:iload_3         
	//  118  220:iconst_1        
	//  119  221:iadd            
	//  120  222:istore_3        
	//* 121  223:goto            180
						if(!zza(motionevent.getX(), motionevent.getY(), motionevent.getX(1), motionevent.getY(1)))
	//* 122  226:aload_0         
	//* 123  227:aload_1         
	//* 124  228:invokevirtual   #454 <Method float MotionEvent.getX()>
	//* 125  231:aload_1         
	//* 126  232:invokevirtual   #457 <Method float MotionEvent.getY()>
	//* 127  235:aload_1         
	//* 128  236:iconst_1        
	//* 129  237:invokevirtual   #460 <Method float MotionEvent.getX(int)>
	//* 130  240:aload_1         
	//* 131  241:iconst_1        
	//* 132  242:invokevirtual   #462 <Method float MotionEvent.getY(int)>
	//* 133  245:invokespecial   #486 <Method boolean zza(float, float, float, float)>
	//* 134  248:ifne            257
							i = ((int) (flag));
	//  135  251:iload           4
	//  136  253:istore_2        
					} else
	//* 137  254:goto            262
	//* 138  257:goto            262
					{
						i = 0;
	//  139  260:iconst_0        
	//  140  261:istore_2        
					}
					if(i != 0)
	//* 141  262:iload_2         
	//* 142  263:ifeq            282
					{
						state = -1;
	//  143  266:aload_0         
	//  144  267:iconst_m1       
	//  145  268:putfield        #36  <Field int state>
						handler.removeCallbacks(zzcsg);
	//  146  271:aload_0         
	//  147  272:getfield        #94  <Field Handler handler>
	//  148  275:aload_0         
	//  149  276:getfield        #43  <Field Runnable zzcsg>
	//  150  279:invokevirtual   #490 <Method void Handler.removeCallbacks(Runnable)>
					}
				}
			}
			return;
	//  151  282:return          
		}
		int i1 = motionevent.getHistorySize();
	//  152  283:aload_1         
	//  153  284:invokevirtual   #447 <Method int MotionEvent.getHistorySize()>
	//  154  287:istore_3        
		for(int j = 0; j < i1; j++)
	//* 155  288:iconst_0        
	//* 156  289:istore_2        
	//* 157  290:iload_2         
	//* 158  291:iload_3         
	//* 159  292:icmpge          322
			zza(motionevent.getActionMasked(), motionevent.getHistoricalX(0, j), motionevent.getHistoricalY(0, j));
	//  160  295:aload_0         
	//  161  296:aload_1         
	//  162  297:invokevirtual   #444 <Method int MotionEvent.getActionMasked()>
	//  163  300:aload_1         
	//  164  301:iconst_0        
	//  165  302:iload_2         
	//  166  303:invokevirtual   #481 <Method float MotionEvent.getHistoricalX(int, int)>
	//  167  306:aload_1         
	//  168  307:iconst_0        
	//  169  308:iload_2         
	//  170  309:invokevirtual   #484 <Method float MotionEvent.getHistoricalY(int, int)>
	//  171  312:invokespecial   #492 <Method void zza(int, float, float)>

	//  172  315:iload_2         
	//  173  316:iconst_1        
	//  174  317:iadd            
	//  175  318:istore_2        
	//* 176  319:goto            290
		zza(motionevent.getActionMasked(), motionevent.getX(), motionevent.getY());
	//  177  322:aload_0         
	//  178  323:aload_1         
	//  179  324:invokevirtual   #444 <Method int MotionEvent.getActionMasked()>
	//  180  327:aload_1         
	//  181  328:invokevirtual   #454 <Method float MotionEvent.getX()>
	//  182  331:aload_1         
	//  183  332:invokevirtual   #457 <Method float MotionEvent.getY()>
	//  184  335:invokespecial   #492 <Method void zza(int, float, float)>
	//  185  338:return          
	}

	final void zzrt()
	{
		zzbv.zzeu().zza(mContext, zzye, zzaej, zzchz);
	//    0    0:invokestatic    #316 <Method zzalk zzbv.zzeu()>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Context mContext>
	//    3    7:aload_0         
	//    4    8:getfield        #282 <Field String zzye>
	//    5   11:aload_0         
	//    6   12:getfield        #430 <Field String zzaej>
	//    7   15:aload_0         
	//    8   16:getfield        #434 <Field String zzchz>
	//    9   19:invokevirtual   #496 <Method void zzalk.zza(Context, String, String, String)>
	//   10   22:return          
	}

	final void zzru()
	{
		zzbv.zzeu().zzg(mContext, zzye, zzaej);
	//    0    0:invokestatic    #316 <Method zzalk zzbv.zzeu()>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Context mContext>
	//    3    7:aload_0         
	//    4    8:getfield        #282 <Field String zzye>
	//    5   11:aload_0         
	//    6   12:getfield        #430 <Field String zzaej>
	//    7   15:invokevirtual   #500 <Method void zzalk.zzg(Context, String, String)>
	//    8   18:return          
	}

	final void zzrv()
	{
		state = 4;
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:putfield        #36  <Field int state>
		showDialog();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #127 <Method void showDialog()>
	//    5    9:return          
	}

	private Handler handler;
	private final Context mContext;
	private int state;
	private String zzaej;
	private final float zzbwx;
	private String zzchz;
	private String zzcrx;
	private float zzcry;
	private float zzcrz;
	private float zzcsa;
	private int zzcsb;
	private float zzcsc;
	private float zzcsd;
	private float zzcse;
	private float zzcsf;
	private Runnable zzcsg;
	private String zzye;
}
