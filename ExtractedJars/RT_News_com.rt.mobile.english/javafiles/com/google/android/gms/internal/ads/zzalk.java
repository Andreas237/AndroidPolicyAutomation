// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzakk, zzall, zznk, 
//			zzkb, zzni, zzalt, zzanz

public final class zzalk
{

	public zzalk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object mLock>
		zzcsm = "";
	//    7   15:aload_0         
	//    8   16:ldc1            #24  <String "">
	//    9   18:putfield        #26  <Field String zzcsm>
		zzcsn = "";
	//   10   21:aload_0         
	//   11   22:ldc1            #24  <String "">
	//   12   24:putfield        #28  <Field String zzcsn>
		zzcso = false;
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:putfield        #30  <Field boolean zzcso>
		zzcsp = "";
	//   16   32:aload_0         
	//   17   33:ldc1            #24  <String "">
	//   18   35:putfield        #32  <Field String zzcsp>
	//   19   38:return          
	}

	private final void zza(Context context, String s, boolean flag, boolean flag1)
	{
		if(!(context instanceof Activity))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #37  <Class Activity>
	//*   2    4:ifne            13
		{
			zzakb.zzdj("Can not create dialog without Activity Context");
	//    3    7:ldc1            #39  <String "Can not create dialog without Activity Context">
	//    4    9:invokestatic    #45  <Method void zzakb.zzdj(String)>
			return;
	//    5   12:return          
		} else
		{
			zzakk.zzcrm.post(((Runnable) (new zzall(this, context, s, flag, flag1))));
	//    6   13:getstatic       #51  <Field Handler zzakk.zzcrm>
	//    7   16:new             #53  <Class zzall>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:iload_3         
	//   13   24:iload           4
	//   14   26:invokespecial   #56  <Method void zzall(zzalk, Context, String, boolean, boolean)>
	//   15   29:invokevirtual   #62  <Method boolean Handler.post(Runnable)>
	//   16   32:pop             
			return;
	//   17   33:return          
		}
	}

	private final String zzaz(Context context)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(TextUtils.isEmpty(((CharSequence) (zzcsm))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #26  <Field String zzcsm>
	//*   7   11:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   14:ifeq            66
			{
				zzbv.zzek();
	//    9   17:invokestatic    #77  <Method zzakk zzbv.zzek()>
	//   10   20:pop             
				zzcsm = zzakk.zzn(context, "debug_signals_id.txt");
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:ldc1            #79  <String "debug_signals_id.txt">
	//   14   25:invokestatic    #83  <Method String zzakk.zzn(Context, String)>
	//   15   28:putfield        #26  <Field String zzcsm>
				if(TextUtils.isEmpty(((CharSequence) (zzcsm))))
	//*  16   31:aload_0         
	//*  17   32:getfield        #26  <Field String zzcsm>
	//*  18   35:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   38:ifeq            66
				{
					zzbv.zzek();
	//   20   41:invokestatic    #77  <Method zzakk zzbv.zzek()>
	//   21   44:pop             
					zzcsm = zzakk.zzrh();
	//   22   45:aload_0         
	//   23   46:invokestatic    #87  <Method String zzakk.zzrh()>
	//   24   49:putfield        #26  <Field String zzcsm>
					zzbv.zzek();
	//   25   52:invokestatic    #77  <Method zzakk zzbv.zzek()>
	//   26   55:pop             
					zzakk.zze(context, "debug_signals_id.txt", zzcsm);
	//   27   56:aload_1         
	//   28   57:ldc1            #79  <String "debug_signals_id.txt">
	//   29   59:aload_0         
	//   30   60:getfield        #26  <Field String zzcsm>
	//   31   63:invokestatic    #91  <Method void zzakk.zze(Context, String, String)>
				}
			}
			context = ((Context) (zzcsm));
	//   32   66:aload_0         
	//   33   67:getfield        #26  <Field String zzcsm>
	//   34   70:astore_1        
		}
	//   35   71:aload_2         
	//   36   72:monitorexit     
		return ((String) (context));
	//   37   73:aload_1         
	//   38   74:areturn         
		context;
	//   39   75:astore_1        
		obj;
	//   40   76:aload_2         
		JVM INSTR monitorexit ;
	//   41   77:monitorexit     
		throw context;
	//   42   78:aload_1         
	//   43   79:athrow          
	}

	private final Uri zzc(Context context, String s, String s1, String s2)
	{
		s = ((String) (Uri.parse(s).buildUpon()));
	//    0    0:aload_2         
	//    1    1:invokestatic    #99  <Method Uri Uri.parse(String)>
	//    2    4:invokevirtual   #103 <Method android.net.Uri$Builder Uri.buildUpon()>
	//    3    7:astore_2        
		((android.net.Uri.Builder) (s)).appendQueryParameter("linkedDeviceId", zzaz(context));
	//    4    8:aload_2         
	//    5    9:ldc1            #105 <String "linkedDeviceId">
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:invokespecial   #107 <Method String zzaz(Context)>
	//    9   16:invokevirtual   #113 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   10   19:pop             
		((android.net.Uri.Builder) (s)).appendQueryParameter("adSlotPath", s1);
	//   11   20:aload_2         
	//   12   21:ldc1            #115 <String "adSlotPath">
	//   13   23:aload_3         
	//   14   24:invokevirtual   #113 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   15   27:pop             
		((android.net.Uri.Builder) (s)).appendQueryParameter("afmaVersion", s2);
	//   16   28:aload_2         
	//   17   29:ldc1            #117 <String "afmaVersion">
	//   18   31:aload           4
	//   19   33:invokevirtual   #113 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   20   36:pop             
		return ((android.net.Uri.Builder) (s)).build();
	//   21   37:aload_2         
	//   22   38:invokevirtual   #121 <Method Uri android.net.Uri$Builder.build()>
	//   23   41:areturn         
	}

	private final boolean zzh(Context context, String s, String s1)
	{
		zzna zzna = zznk.zzbeg;
	//    0    0:getstatic       #131 <Field zzna zznk.zzbeg>
	//    1    3:astore          4
		context = ((Context) (zzj(context, zzc(context, (String)zzkb.zzik().zzd(zzna), s, s1).toString(), s1)));
	//    2    5:aload_1         
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #137 <Method zzni zzkb.zzik()>
	//    6   11:aload           4
	//    7   13:invokevirtual   #143 <Method Object zzni.zzd(zzna)>
	//    8   16:checkcast       #145 <Class String>
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokespecial   #147 <Method Uri zzc(Context, String, String, String)>
	//   12   24:invokevirtual   #150 <Method String Uri.toString()>
	//   13   27:aload_3         
	//   14   28:invokestatic    #154 <Method String zzj(Context, String, String)>
	//   15   31:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  16   32:aload_1         
	//*  17   33:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   36:ifeq            46
		{
			zzakb.zzck("Not linked for in app preview.");
	//   19   39:ldc1            #156 <String "Not linked for in app preview.">
	//   20   41:invokestatic    #159 <Method void zzakb.zzck(String)>
			return false;
	//   21   44:iconst_0        
	//   22   45:ireturn         
		}
		context = ((Context) (((String) (context)).trim()));
	//   23   46:aload_1         
	//   24   47:invokevirtual   #162 <Method String String.trim()>
	//   25   50:astore_1        
		try
		{
			s = ((String) (new JSONObject(((String) (context)))));
	//   26   51:new             #164 <Class JSONObject>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:invokespecial   #166 <Method void JSONObject(String)>
	//   30   59:astore_2        
			context = ((Context) (((JSONObject) (s)).optString("gct")));
	//   31   60:aload_2         
	//   32   61:ldc1            #168 <String "gct">
	//   33   63:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   34   66:astore_1        
			zzcsp = ((JSONObject) (s)).optString("status");
	//   35   67:aload_0         
	//   36   68:aload_2         
	//   37   69:ldc1            #174 <String "status">
	//   38   71:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   39   74:putfield        #32  <Field String zzcsp>
		}
	//*  40   77:aload_0         
	//*  41   78:getfield        #22  <Field Object mLock>
	//*  42   81:astore_2        
	//*  43   82:aload_2         
	//*  44   83:monitorenter    
	//*  45   84:aload_0         
	//*  46   85:aload_1         
	//*  47   86:putfield        #28  <Field String zzcsn>
	//*  48   89:aload_2         
	//*  49   90:monitorexit     
	//*  50   91:iconst_1        
	//*  51   92:ireturn         
	//*  52   93:astore_1        
	//*  53   94:aload_2         
	//*  54   95:monitorexit     
	//*  55   96:aload_1         
	//*  56   97:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  57   98:astore_1        
		{
			zzakb.zzc("Fail to get in app preview response json.", ((Throwable) (context)));
	//   58   99:ldc1            #176 <String "Fail to get in app preview response json.">
	//   59  101:aload_1         
	//   60  102:invokestatic    #179 <Method void zzakb.zzc(String, Throwable)>
			return false;
	//   61  105:iconst_0        
	//   62  106:ireturn         
		}
		synchronized(mLock)
		{
			zzcsn = ((String) (context));
		}
		return true;
		context;
		s;
		JVM INSTR monitorexit ;
		throw context;
	}

	private final boolean zzi(Context context, String s, String s1)
	{
		zzna zzna = zznk.zzbeh;
	//    0    0:getstatic       #183 <Field zzna zznk.zzbeh>
	//    1    3:astore          5
		context = ((Context) (zzj(context, zzc(context, (String)zzkb.zzik().zzd(zzna), s, s1).toString(), s1)));
	//    2    5:aload_1         
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokestatic    #137 <Method zzni zzkb.zzik()>
	//    6   11:aload           5
	//    7   13:invokevirtual   #143 <Method Object zzni.zzd(zzna)>
	//    8   16:checkcast       #145 <Class String>
	//    9   19:aload_2         
	//   10   20:aload_3         
	//   11   21:invokespecial   #147 <Method Uri zzc(Context, String, String, String)>
	//   12   24:invokevirtual   #150 <Method String Uri.toString()>
	//   13   27:aload_3         
	//   14   28:invokestatic    #154 <Method String zzj(Context, String, String)>
	//   15   31:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  16   32:aload_1         
	//*  17   33:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   36:ifeq            46
		{
			zzakb.zzck("Not linked for debug signals.");
	//   19   39:ldc1            #185 <String "Not linked for debug signals.">
	//   20   41:invokestatic    #159 <Method void zzakb.zzck(String)>
			return false;
	//   21   44:iconst_0        
	//   22   45:ireturn         
		}
		context = ((Context) (((String) (context)).trim()));
	//   23   46:aload_1         
	//   24   47:invokevirtual   #162 <Method String String.trim()>
	//   25   50:astore_1        
		boolean flag;
		try
		{
			context = ((Context) ((new JSONObject(((String) (context)))).optString("debug_mode")));
	//   26   51:new             #164 <Class JSONObject>
	//   27   54:dup             
	//   28   55:aload_1         
	//   29   56:invokespecial   #166 <Method void JSONObject(String)>
	//   30   59:ldc1            #187 <String "debug_mode">
	//   31   61:invokevirtual   #172 <Method String JSONObject.optString(String)>
	//   32   64:astore_1        
		}
	//*  33   65:ldc1            #189 <String "1">
	//*  34   67:aload_1         
	//*  35   68:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  36   71:istore          4
	//*  37   73:aload_0         
	//*  38   74:getfield        #22  <Field Object mLock>
	//*  39   77:astore_1        
	//*  40   78:aload_1         
	//*  41   79:monitorenter    
	//*  42   80:aload_0         
	//*  43   81:iload           4
	//*  44   83:putfield        #30  <Field boolean zzcso>
	//*  45   86:aload_1         
	//*  46   87:monitorexit     
	//*  47   88:iload           4
	//*  48   90:ireturn         
	//*  49   91:astore_2        
	//*  50   92:aload_1         
	//*  51   93:monitorexit     
	//*  52   94:aload_2         
	//*  53   95:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  54   96:astore_1        
		{
			zzakb.zzc("Fail to get debug mode response json.", ((Throwable) (context)));
	//   55   97:ldc1            #195 <String "Fail to get debug mode response json.">
	//   56   99:aload_1         
	//   57  100:invokestatic    #179 <Method void zzakb.zzc(String, Throwable)>
			return false;
	//   58  103:iconst_0        
	//   59  104:ireturn         
		}
		flag = "1".equals(((Object) (context)));
		synchronized(mLock)
		{
			zzcso = flag;
		}
		return flag;
		s;
		context;
		JVM INSTR monitorexit ;
		throw s;
	}

	private static String zzj(Context context, String s, String s1)
	{
		zzanz zzanz1;
		HashMap hashmap = new HashMap();
	//    0    0:new             #203 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #204 <Method void HashMap()>
	//    3    7:astore_3        
		((Map) (hashmap)).put("User-Agent", ((Object) (zzbv.zzek().zzm(context, s1))));
	//    4    8:aload_3         
	//    5    9:ldc1            #206 <String "User-Agent">
	//    6   11:invokestatic    #77  <Method zzakk zzbv.zzek()>
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:invokevirtual   #209 <Method String zzakk.zzm(Context, String)>
	//   10   19:invokeinterface #215 <Method Object Map.put(Object, Object)>
	//   11   24:pop             
		zzanz1 = (new zzalt(context)).zzc(s, ((Map) (hashmap)));
	//   12   25:new             #217 <Class zzalt>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokespecial   #220 <Method void zzalt(Context)>
	//   16   33:aload_1         
	//   17   34:aload_3         
	//   18   35:invokevirtual   #223 <Method zzanz zzalt.zzc(String, Map)>
	//   19   38:astore          4
		context = ((Context) (zznk.zzbej));
	//   20   40:getstatic       #226 <Field zzna zznk.zzbej>
	//   21   43:astore_0        
		context = ((Context) ((String)zzanz1.get(((Integer)zzkb.zzik().zzd(((zzna) (context)))).intValue(), TimeUnit.MILLISECONDS)));
	//   22   44:aload           4
	//   23   46:invokestatic    #137 <Method zzni zzkb.zzik()>
	//   24   49:aload_0         
	//   25   50:invokevirtual   #143 <Method Object zzni.zzd(zzna)>
	//   26   53:checkcast       #228 <Class Integer>
	//   27   56:invokevirtual   #232 <Method int Integer.intValue()>
	//   28   59:i2l             
	//   29   60:getstatic       #238 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   30   63:invokeinterface #244 <Method Object zzanz.get(long, TimeUnit)>
	//   31   68:checkcast       #145 <Class String>
	//   32   71:astore_0        
		return ((String) (context));
	//   33   72:aload_0         
	//   34   73:areturn         
		s1;
	//   35   74:astore_2        
		context = ((Context) (String.valueOf(((Object) (s)))));
	//   36   75:aload_1         
	//   37   76:invokestatic    #248 <Method String String.valueOf(Object)>
	//   38   79:astore_0        
		if(((String) (context)).length() != 0)
	//*  39   80:aload_0         
	//*  40   81:invokevirtual   #251 <Method int String.length()>
	//*  41   84:ifeq            97
			context = ((Context) ("Error retriving a response from: ".concat(((String) (context)))));
	//   42   87:ldc1            #253 <String "Error retriving a response from: ">
	//   43   89:aload_0         
	//   44   90:invokevirtual   #256 <Method String String.concat(String)>
	//   45   93:astore_0        
		else
	//*  46   94:goto            107
			context = ((Context) (new String("Error retriving a response from: ")));
	//   47   97:new             #145 <Class String>
	//   48  100:dup             
	//   49  101:ldc1            #253 <String "Error retriving a response from: ">
	//   50  103:invokespecial   #257 <Method void String(String)>
	//   51  106:astore_0        
		zzakb.zzb(((String) (context)), ((Throwable) (s1)));
	//   52  107:aload_0         
	//   53  108:aload_2         
	//   54  109:invokestatic    #260 <Method void zzakb.zzb(String, Throwable)>
		break MISSING_BLOCK_LABEL_206;
	//   55  112:goto            206
		context;
	//   56  115:astore_0        
		s1 = "Interrupted while retriving a response from: ";
	//   57  116:ldc2            #262 <String "Interrupted while retriving a response from: ">
	//   58  119:astore_2        
		String s2 = String.valueOf(((Object) (s)));
	//   59  120:aload_1         
	//   60  121:invokestatic    #248 <Method String String.valueOf(Object)>
	//   61  124:astore_3        
		if(s2.length() != 0)
	//*  62  125:aload_3         
	//*  63  126:invokevirtual   #251 <Method int String.length()>
	//*  64  129:ifeq            139
		{
			s = s1;
	//   65  132:aload_2         
	//   66  133:astore_1        
			s1 = s2;
	//   67  134:aload_3         
	//   68  135:astore_2        
		} else
	//*  69  136:goto            172
		{
			s = new String("Interrupted while retriving a response from: ");
	//   70  139:new             #145 <Class String>
	//   71  142:dup             
	//   72  143:ldc2            #262 <String "Interrupted while retriving a response from: ">
	//   73  146:invokespecial   #257 <Method void String(String)>
	//   74  149:astore_1        
			break MISSING_BLOCK_LABEL_192;
	//   75  150:goto            192
		}
		break MISSING_BLOCK_LABEL_172;
		context;
	//   76  153:astore_0        
		String s3 = "Timeout while retriving a response from: ";
	//   77  154:ldc2            #264 <String "Timeout while retriving a response from: ">
	//   78  157:astore_3        
		s1 = String.valueOf(((Object) (s)));
	//   79  158:aload_1         
	//   80  159:invokestatic    #248 <Method String String.valueOf(Object)>
	//   81  162:astore_2        
		if(s1.length() == 0)
			break MISSING_BLOCK_LABEL_181;
	//   82  163:aload_2         
	//   83  164:invokevirtual   #251 <Method int String.length()>
	//   84  167:ifeq            181
		s = s3;
	//   85  170:aload_3         
	//   86  171:astore_1        
		s = s.concat(s1);
	//   87  172:aload_1         
	//   88  173:aload_2         
	//   89  174:invokevirtual   #256 <Method String String.concat(String)>
	//   90  177:astore_1        
		break MISSING_BLOCK_LABEL_192;
	//   91  178:goto            192
		s = new String("Timeout while retriving a response from: ");
	//   92  181:new             #145 <Class String>
	//   93  184:dup             
	//   94  185:ldc2            #264 <String "Timeout while retriving a response from: ">
	//   95  188:invokespecial   #257 <Method void String(String)>
	//   96  191:astore_1        
		zzakb.zzb(s, ((Throwable) (context)));
	//   97  192:aload_1         
	//   98  193:aload_0         
	//   99  194:invokestatic    #260 <Method void zzakb.zzb(String, Throwable)>
		zzanz1.cancel(true);
	//  100  197:aload           4
	//  101  199:iconst_1        
	//  102  200:invokeinterface #268 <Method boolean zzanz.cancel(boolean)>
	//  103  205:pop             
		return null;
	//  104  206:aconst_null     
	//  105  207:areturn         
	}

	private final void zzk(Context context, String s, String s1)
	{
		zzbv.zzek();
	//    0    0:invokestatic    #77  <Method zzakk zzbv.zzek()>
	//    1    3:pop             
		zzna zzna = zznk.zzbef;
	//    2    4:getstatic       #272 <Field zzna zznk.zzbef>
	//    3    7:astore          4
		zzakk.zza(context, zzc(context, (String)zzkb.zzik().zzd(zzna), s, s1));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokestatic    #137 <Method zzni zzkb.zzik()>
	//    8   15:aload           4
	//    9   17:invokevirtual   #143 <Method Object zzni.zzd(zzna)>
	//   10   20:checkcast       #145 <Class String>
	//   11   23:aload_2         
	//   12   24:aload_3         
	//   13   25:invokespecial   #147 <Method Uri zzc(Context, String, String, String)>
	//   14   28:invokestatic    #275 <Method void zzakk.zza(Context, Uri)>
	//   15   31:return          
	}

	public final void zza(Context context, String s, String s1, String s2)
	{
		boolean flag = zzrx();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #281 <Method boolean zzrx()>
	//    2    4:istore          5
		if(zzi(context, s, s1))
	//*   3    6:aload_0         
	//*   4    7:aload_1         
	//*   5    8:aload_2         
	//*   6    9:aload_3         
	//*   7   10:invokespecial   #283 <Method boolean zzi(Context, String, String)>
	//*   8   13:ifeq            55
		{
			if(!flag && !TextUtils.isEmpty(((CharSequence) (s2))))
	//*   9   16:iload           5
	//*  10   18:ifne            38
	//*  11   21:aload           4
	//*  12   23:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   26:ifne            38
				zzb(context, s1, s2, s);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_3         
	//   17   32:aload           4
	//   18   34:aload_2         
	//   19   35:invokevirtual   #285 <Method void zzb(Context, String, String, String)>
			zzakb.zzck("Device is linked for debug signals.");
	//   20   38:ldc2            #287 <String "Device is linked for debug signals.">
	//   21   41:invokestatic    #159 <Method void zzakb.zzck(String)>
			zza(context, "The device is successfully linked for troubleshooting.", false, true);
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:ldc2            #289 <String "The device is successfully linked for troubleshooting.">
	//   25   49:iconst_0        
	//   26   50:iconst_1        
	//   27   51:invokespecial   #291 <Method void zza(Context, String, boolean, boolean)>
			return;
	//   28   54:return          
		} else
		{
			zzk(context, s, s1);
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:aload_2         
	//   32   58:aload_3         
	//   33   59:invokespecial   #293 <Method void zzk(Context, String, String)>
			return;
	//   34   62:return          
		}
	}

	public final void zzb(Context context, String s, String s1, String s2)
	{
		zzna zzna = zznk.zzbei;
	//    0    0:getstatic       #297 <Field zzna zznk.zzbei>
	//    1    3:astore          5
		s2 = ((String) (zzc(context, (String)zzkb.zzik().zzd(zzna), s2, s).buildUpon()));
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:invokestatic    #137 <Method zzni zzkb.zzik()>
	//    5   10:aload           5
	//    6   12:invokevirtual   #143 <Method Object zzni.zzd(zzna)>
	//    7   15:checkcast       #145 <Class String>
	//    8   18:aload           4
	//    9   20:aload_2         
	//   10   21:invokespecial   #147 <Method Uri zzc(Context, String, String, String)>
	//   11   24:invokevirtual   #103 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   12   27:astore          4
		((android.net.Uri.Builder) (s2)).appendQueryParameter("debugData", s1);
	//   13   29:aload           4
	//   14   31:ldc2            #299 <String "debugData">
	//   15   34:aload_3         
	//   16   35:invokevirtual   #113 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   17   38:pop             
		zzbv.zzek();
	//   18   39:invokestatic    #77  <Method zzakk zzbv.zzek()>
	//   19   42:pop             
		zzakk.zzd(context, s, ((android.net.Uri.Builder) (s2)).build().toString());
	//   20   43:aload_1         
	//   21   44:aload_2         
	//   22   45:aload           4
	//   23   47:invokevirtual   #121 <Method Uri android.net.Uri$Builder.build()>
	//   24   50:invokevirtual   #150 <Method String Uri.toString()>
	//   25   53:invokestatic    #301 <Method void zzakk.zzd(Context, String, String)>
	//   26   56:return          
	}

	public final void zzg(Context context, String s, String s1)
	{
		if(!zzh(context, s, s1))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #304 <Method boolean zzh(Context, String, String)>
	//*   5    7:ifne            21
		{
			zza(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:ldc2            #306 <String "In-app preview failed to load because of a system error. Please try again later.">
	//    9   15:iconst_1        
	//   10   16:iconst_1        
	//   11   17:invokespecial   #291 <Method void zza(Context, String, boolean, boolean)>
			return;
	//   12   20:return          
		}
		if("2".equals(((Object) (zzcsp))))
	//*  13   21:ldc2            #308 <String "2">
	//*  14   24:aload_0         
	//*  15   25:getfield        #32  <Field String zzcsp>
	//*  16   28:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  17   31:ifeq            51
		{
			zzakb.zzck("Creative is not pushed for this device.");
	//   18   34:ldc2            #310 <String "Creative is not pushed for this device.">
	//   19   37:invokestatic    #159 <Method void zzakb.zzck(String)>
			zza(context, "There was no creative pushed from DFP to the device.", false, false);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:ldc2            #312 <String "There was no creative pushed from DFP to the device.">
	//   23   45:iconst_0        
	//   24   46:iconst_0        
	//   25   47:invokespecial   #291 <Method void zza(Context, String, boolean, boolean)>
			return;
	//   26   50:return          
		}
		if("1".equals(((Object) (zzcsp))))
	//*  27   51:ldc1            #189 <String "1">
	//*  28   53:aload_0         
	//*  29   54:getfield        #32  <Field String zzcsp>
	//*  30   57:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  31   60:ifeq            77
		{
			zzakb.zzck("The app is not linked for creative preview.");
	//   32   63:ldc2            #314 <String "The app is not linked for creative preview.">
	//   33   66:invokestatic    #159 <Method void zzakb.zzck(String)>
			zzk(context, s, s1);
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:aload_2         
	//   37   72:aload_3         
	//   38   73:invokespecial   #293 <Method void zzk(Context, String, String)>
			return;
	//   39   76:return          
		}
		if("0".equals(((Object) (zzcsp))))
	//*  40   77:ldc2            #316 <String "0">
	//*  41   80:aload_0         
	//*  42   81:getfield        #32  <Field String zzcsp>
	//*  43   84:invokevirtual   #193 <Method boolean String.equals(Object)>
	//*  44   87:ifeq            106
		{
			zzakb.zzck("Device is linked for in app preview.");
	//   45   90:ldc2            #318 <String "Device is linked for in app preview.">
	//   46   93:invokestatic    #159 <Method void zzakb.zzck(String)>
			zza(context, "The device is successfully linked for creative preview.", false, true);
	//   47   96:aload_0         
	//   48   97:aload_1         
	//   49   98:ldc2            #320 <String "The device is successfully linked for creative preview.">
	//   50  101:iconst_0        
	//   51  102:iconst_1        
	//   52  103:invokespecial   #291 <Method void zza(Context, String, boolean, boolean)>
		}
	//   53  106:return          
	}

	public final String zzrw()
	{
		String s;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = zzcsn;
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field String zzcsn>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return s;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public final boolean zzrx()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzcso;
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field boolean zzcso>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	private final Object mLock = new Object();
	private String zzcsm;
	private String zzcsn;
	private boolean zzcso;
	private String zzcsp;
}
