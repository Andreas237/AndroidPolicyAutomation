// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzabh;
import com.google.android.gms.wearable.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcz, zzbx, zzbw, zzcy, 
//			zzcq, zzci, zzac

public class zzcx extends zzl
{

	public zzcx(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zzg zzg)
	{
		this(context, looper, connectioncallbacks, onconnectionfailedlistener, zzg, Executors.newCachedThreadPool(), zzcz.zzck(context));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokestatic    #38  <Method ExecutorService Executors.newCachedThreadPool()>
	//    7   11:aload_1         
	//    8   12:invokestatic    #44  <Method zzcz zzcz.zzck(Context)>
	//    9   15:invokespecial   #47  <Method void zzcx(Context, Looper, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener, zzg, ExecutorService, zzcz)>
	//   10   18:return          
	}

	zzcx(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zzg zzg, ExecutorService executorservice, zzcz zzcz1)
	{
		super(context, looper, 14, zzg, connectioncallbacks, onconnectionfailedlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:bipush          14
	//    4    5:aload           5
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #51  <Method void zzl(Context, Looper, int, zzg, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zzbUT = new zzbx();
	//    8   13:aload_0         
	//    9   14:new             #53  <Class zzbx>
	//   10   17:dup             
	//   11   18:invokespecial   #56  <Method void zzbx()>
	//   12   21:putfield        #58  <Field zzbx zzbUT>
		zzbUU = new zzbx();
	//   13   24:aload_0         
	//   14   25:new             #53  <Class zzbx>
	//   15   28:dup             
	//   16   29:invokespecial   #56  <Method void zzbx()>
	//   17   32:putfield        #60  <Field zzbx zzbUU>
		zzbUV = new zzbx();
	//   18   35:aload_0         
	//   19   36:new             #53  <Class zzbx>
	//   20   39:dup             
	//   21   40:invokespecial   #56  <Method void zzbx()>
	//   22   43:putfield        #62  <Field zzbx zzbUV>
		zzbUW = new zzbx();
	//   23   46:aload_0         
	//   24   47:new             #53  <Class zzbx>
	//   25   50:dup             
	//   26   51:invokespecial   #56  <Method void zzbx()>
	//   27   54:putfield        #64  <Field zzbx zzbUW>
		zzbUX = new zzbx();
	//   28   57:aload_0         
	//   29   58:new             #53  <Class zzbx>
	//   30   61:dup             
	//   31   62:invokespecial   #56  <Method void zzbx()>
	//   32   65:putfield        #66  <Field zzbx zzbUX>
		zzbUY = new zzbx();
	//   33   68:aload_0         
	//   34   69:new             #53  <Class zzbx>
	//   35   72:dup             
	//   36   73:invokespecial   #56  <Method void zzbx()>
	//   37   76:putfield        #68  <Field zzbx zzbUY>
		zzbUZ = new zzbx();
	//   38   79:aload_0         
	//   39   80:new             #53  <Class zzbx>
	//   40   83:dup             
	//   41   84:invokespecial   #56  <Method void zzbx()>
	//   42   87:putfield        #70  <Field zzbx zzbUZ>
		zzbVa = new zzbx();
	//   43   90:aload_0         
	//   44   91:new             #53  <Class zzbx>
	//   45   94:dup             
	//   46   95:invokespecial   #56  <Method void zzbx()>
	//   47   98:putfield        #72  <Field zzbx zzbVa>
		zzbtI = (ExecutorService)zzac.zzw(((Object) (executorservice)));
	//   48  101:aload_0         
	//   49  102:aload           6
	//   50  104:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//   51  107:checkcast       #80  <Class ExecutorService>
	//   52  110:putfield        #82  <Field ExecutorService zzbtI>
		zzbVb = zzcz1;
	//   53  113:aload_0         
	//   54  114:aload           7
	//   55  116:putfield        #84  <Field zzcz zzbVb>
	//   56  119:return          
	}

	private FutureTask zza(ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
	{
		return new FutureTask(new Callable(parcelfiledescriptor, abyte0) {

			public Object call()
				throws Exception
			{
				return ((Object) (zzbX()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #34  <Method Boolean zzbX()>
			//    2    4:areturn         
			}

			public Boolean zzbX()
			{
				android.os.ParcelFileDescriptor.AutoCloseOutputStream autocloseoutputstream;
				if(Log.isLoggable("WearableClient", 3))
			//*   0    0:ldc1            #39  <String "WearableClient">
			//*   1    2:iconst_3        
			//*   2    3:invokestatic    #45  <Method boolean Log.isLoggable(String, int)>
			//*   3    6:ifeq            52
				{
					String s = String.valueOf(((Object) (zzbVc)));
			//    4    9:aload_0         
			//    5   10:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//    6   13:invokestatic    #51  <Method String String.valueOf(Object)>
			//    7   16:astore_1        
					Log.d("WearableClient", (new StringBuilder(String.valueOf(((Object) (s))).length() + 36)).append("processAssets: writing data to FD : ").append(s).toString());
			//    8   17:ldc1            #39  <String "WearableClient">
			//    9   19:new             #53  <Class StringBuilder>
			//   10   22:dup             
			//   11   23:aload_1         
			//   12   24:invokestatic    #51  <Method String String.valueOf(Object)>
			//   13   27:invokevirtual   #57  <Method int String.length()>
			//   14   30:bipush          36
			//   15   32:iadd            
			//   16   33:invokespecial   #60  <Method void StringBuilder(int)>
			//   17   36:ldc1            #62  <String "processAssets: writing data to FD : ">
			//   18   38:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   19   41:aload_1         
			//   20   42:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   21   45:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   22   48:invokestatic    #74  <Method int Log.d(String, String)>
			//   23   51:pop             
				}
				autocloseoutputstream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(zzbVc);
			//   24   52:new             #76  <Class android.os.ParcelFileDescriptor$AutoCloseOutputStream>
			//   25   55:dup             
			//   26   56:aload_0         
			//   27   57:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//   28   60:invokespecial   #79  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream(ParcelFileDescriptor)>
			//   29   63:astore_1        
label0:
				{
					Object obj;
					String s3;
					try
					{
						autocloseoutputstream.write(zzbMo);
			//   30   64:aload_1         
			//   31   65:aload_0         
			//   32   66:getfield        #22  <Field byte[] zzbMo>
			//   33   69:invokevirtual   #83  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream.write(byte[])>
						autocloseoutputstream.flush();
			//   34   72:aload_1         
			//   35   73:invokevirtual   #86  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream.flush()>
						if(Log.isLoggable("WearableClient", 3))
			//*  36   76:ldc1            #39  <String "WearableClient">
			//*  37   78:iconst_3        
			//*  38   79:invokestatic    #45  <Method boolean Log.isLoggable(String, int)>
			//*  39   82:ifeq            128
						{
							String s1 = String.valueOf(((Object) (zzbVc)));
			//   40   85:aload_0         
			//   41   86:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//   42   89:invokestatic    #51  <Method String String.valueOf(Object)>
			//   43   92:astore_2        
							Log.d("WearableClient", (new StringBuilder(String.valueOf(((Object) (s1))).length() + 27)).append("processAssets: wrote data: ").append(s1).toString());
			//   44   93:ldc1            #39  <String "WearableClient">
			//   45   95:new             #53  <Class StringBuilder>
			//   46   98:dup             
			//   47   99:aload_2         
			//   48  100:invokestatic    #51  <Method String String.valueOf(Object)>
			//   49  103:invokevirtual   #57  <Method int String.length()>
			//   50  106:bipush          27
			//   51  108:iadd            
			//   52  109:invokespecial   #60  <Method void StringBuilder(int)>
			//   53  112:ldc1            #88  <String "processAssets: wrote data: ">
			//   54  114:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   55  117:aload_2         
			//   56  118:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//   57  121:invokevirtual   #70  <Method String StringBuilder.toString()>
			//   58  124:invokestatic    #74  <Method int Log.d(String, String)>
			//   59  127:pop             
						}
						obj = ((Object) (Boolean.valueOf(true)));
			//   60  128:iconst_1        
			//   61  129:invokestatic    #93  <Method Boolean Boolean.valueOf(boolean)>
			//   62  132:astore_2        
					}
			//*  63  133:ldc1            #39  <String "WearableClient">
			//*  64  135:iconst_3        
			//*  65  136:invokestatic    #45  <Method boolean Log.isLoggable(String, int)>
			//*  66  139:ifeq            185
			//*  67  142:aload_0         
			//*  68  143:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//*  69  146:invokestatic    #51  <Method String String.valueOf(Object)>
			//*  70  149:astore_3        
			//*  71  150:ldc1            #39  <String "WearableClient">
			//*  72  152:new             #53  <Class StringBuilder>
			//*  73  155:dup             
			//*  74  156:aload_3         
			//*  75  157:invokestatic    #51  <Method String String.valueOf(Object)>
			//*  76  160:invokevirtual   #57  <Method int String.length()>
			//*  77  163:bipush          24
			//*  78  165:iadd            
			//*  79  166:invokespecial   #60  <Method void StringBuilder(int)>
			//*  80  169:ldc1            #95  <String "processAssets: closing: ">
			//*  81  171:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//*  82  174:aload_3         
			//*  83  175:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//*  84  178:invokevirtual   #70  <Method String StringBuilder.toString()>
			//*  85  181:invokestatic    #74  <Method int Log.d(String, String)>
			//*  86  184:pop             
			//*  87  185:aload_1         
			//*  88  186:invokevirtual   #98  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream.close()>
			//*  89  189:aload_2         
			//*  90  190:areturn         
			//*  91  191:aload_0         
			//*  92  192:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//*  93  195:invokestatic    #51  <Method String String.valueOf(Object)>
			//*  94  198:astore_2        
			//*  95  199:ldc1            #39  <String "WearableClient">
			//*  96  201:new             #53  <Class StringBuilder>
			//*  97  204:dup             
			//*  98  205:aload_2         
			//*  99  206:invokestatic    #51  <Method String String.valueOf(Object)>
			//* 100  209:invokevirtual   #57  <Method int String.length()>
			//* 101  212:bipush          36
			//* 102  214:iadd            
			//* 103  215:invokespecial   #60  <Method void StringBuilder(int)>
			//* 104  218:ldc1            #100 <String "processAssets: writing data failed: ">
			//* 105  220:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//* 106  223:aload_2         
			//* 107  224:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//* 108  227:invokevirtual   #70  <Method String StringBuilder.toString()>
			//* 109  230:invokestatic    #103 <Method int Log.w(String, String)>
			//* 110  233:pop             
			//* 111  234:ldc1            #39  <String "WearableClient">
			//* 112  236:iconst_3        
			//* 113  237:invokestatic    #45  <Method boolean Log.isLoggable(String, int)>
			//* 114  240:ifeq            286
			//* 115  243:aload_0         
			//* 116  244:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//* 117  247:invokestatic    #51  <Method String String.valueOf(Object)>
			//* 118  250:astore_2        
			//* 119  251:ldc1            #39  <String "WearableClient">
			//* 120  253:new             #53  <Class StringBuilder>
			//* 121  256:dup             
			//* 122  257:aload_2         
			//* 123  258:invokestatic    #51  <Method String String.valueOf(Object)>
			//* 124  261:invokevirtual   #57  <Method int String.length()>
			//* 125  264:bipush          24
			//* 126  266:iadd            
			//* 127  267:invokespecial   #60  <Method void StringBuilder(int)>
			//* 128  270:ldc1            #95  <String "processAssets: closing: ">
			//* 129  272:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//* 130  275:aload_2         
			//* 131  276:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//* 132  279:invokevirtual   #70  <Method String StringBuilder.toString()>
			//* 133  282:invokestatic    #74  <Method int Log.d(String, String)>
			//* 134  285:pop             
			//* 135  286:aload_1         
			//* 136  287:invokevirtual   #98  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream.close()>
			//* 137  290:goto            355
			//* 138  293:goto            355
			//* 139  296:astore_2        
			//* 140  297:ldc1            #39  <String "WearableClient">
			//* 141  299:iconst_3        
			//* 142  300:invokestatic    #45  <Method boolean Log.isLoggable(String, int)>
			//* 143  303:ifeq            349
			//* 144  306:aload_0         
			//* 145  307:getfield        #20  <Field ParcelFileDescriptor zzbVc>
			//* 146  310:invokestatic    #51  <Method String String.valueOf(Object)>
			//* 147  313:astore_3        
			//* 148  314:ldc1            #39  <String "WearableClient">
			//* 149  316:new             #53  <Class StringBuilder>
			//* 150  319:dup             
			//* 151  320:aload_3         
			//* 152  321:invokestatic    #51  <Method String String.valueOf(Object)>
			//* 153  324:invokevirtual   #57  <Method int String.length()>
			//* 154  327:bipush          24
			//* 155  329:iadd            
			//* 156  330:invokespecial   #60  <Method void StringBuilder(int)>
			//* 157  333:ldc1            #95  <String "processAssets: closing: ">
			//* 158  335:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//* 159  338:aload_3         
			//* 160  339:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
			//* 161  342:invokevirtual   #70  <Method String StringBuilder.toString()>
			//* 162  345:invokestatic    #74  <Method int Log.d(String, String)>
			//* 163  348:pop             
			//* 164  349:aload_1         
			//* 165  350:invokevirtual   #98  <Method void android.os.ParcelFileDescriptor$AutoCloseOutputStream.close()>
			//* 166  353:aload_2         
			//* 167  354:athrow          
			//* 168  355:iconst_0        
			//* 169  356:invokestatic    #93  <Method Boolean Boolean.valueOf(boolean)>
			//* 170  359:areturn         
					// Misplaced declaration of an exception variable
					catch(Object obj)
			//* 171  360:astore_2        
					{
						break label0;
			//  172  361:goto            191
					}
					try
					{
						if(Log.isLoggable("WearableClient", 3))
						{
							String s2 = String.valueOf(((Object) (zzbVc)));
							Log.d("WearableClient", (new StringBuilder(String.valueOf(((Object) (s2))).length() + 24)).append("processAssets: closing: ").append(s2).toString());
						}
						autocloseoutputstream.close();
					}
					catch(IOException ioexception)
			//* 173  364:astore_1        
					{
						return ((Boolean) (obj));
			//  174  365:aload_2         
			//  175  366:areturn         
					}
					return ((Boolean) (obj));
				}
				obj = ((Object) (String.valueOf(((Object) (zzbVc)))));
				Log.w("WearableClient", (new StringBuilder(String.valueOf(obj).length() + 36)).append("processAssets: writing data failed: ").append(((String) (obj))).toString());
				try
				{
					if(Log.isLoggable("WearableClient", 3))
					{
						obj = ((Object) (String.valueOf(((Object) (zzbVc)))));
						Log.d("WearableClient", (new StringBuilder(String.valueOf(obj).length() + 24)).append("processAssets: closing: ").append(((String) (obj))).toString());
					}
					autocloseoutputstream.close();
				}
				catch(IOException ioexception1) { }
			//  176  367:astore_1        
				break MISSING_BLOCK_LABEL_355;
			//  177  368:goto            293
				obj;
				try
				{
					if(Log.isLoggable("WearableClient", 3))
					{
						s3 = String.valueOf(((Object) (zzbVc)));
						Log.d("WearableClient", (new StringBuilder(String.valueOf(((Object) (s3))).length() + 24)).append("processAssets: closing: ").append(s3).toString());
					}
					autocloseoutputstream.close();
				}
				catch(IOException ioexception2) { }
			//  178  371:astore_1        
				throw obj;
				return Boolean.valueOf(false);
			//* 179  372:goto            353
			}

			final byte zzbMo[];
			final ParcelFileDescriptor zzbVc;

			
			{
				zzbVc = parcelfiledescriptor;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #20  <Field ParcelFileDescriptor zzbVc>
				zzbMo = abyte0;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field byte[] zzbMo>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:new             #88  <Class FutureTask>
	//    1    3:dup             
	//    2    4:new             #7   <Class zzcx$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #91  <Method void zzcx$1(zzcx, ParcelFileDescriptor, byte[])>
	//    8   14:invokespecial   #94  <Method void FutureTask(Callable)>
	//    9   17:areturn         
	}

	private Runnable zzb(com.google.android.gms.internal.zzaad.zzb zzb1, String s, Uri uri, long l, long l1)
	{
		zzac.zzw(((Object) (zzb1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzac.zzw(((Object) (s)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//    5    9:pop             
		zzac.zzw(((Object) (uri)));
	//    6   10:aload_3         
	//    7   11:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//    8   14:pop             
		boolean flag;
		if(l >= 0L)
	//*   9   15:lload           4
	//*  10   17:lconst_0        
	//*  11   18:lcmp            
	//*  12   19:iflt            28
			flag = true;
	//   13   22:iconst_1        
	//   14   23:istore          8
		else
	//*  15   25:goto            31
			flag = false;
	//   16   28:iconst_0        
	//   17   29:istore          8
		zzac.zzb(flag, "startOffset is negative: %s", new Object[] {
			Long.valueOf(l)
		});
	//   18   31:iload           8
	//   19   33:ldc1            #100 <String "startOffset is negative: %s">
	//   20   35:iconst_1        
	//   21   36:anewarray       Object[]
	//   22   39:dup             
	//   23   40:iconst_0        
	//   24   41:lload           4
	//   25   43:invokestatic    #108 <Method Long Long.valueOf(long)>
	//   26   46:aastore         
	//   27   47:invokestatic    #111 <Method void zzac.zzb(boolean, String, Object[])>
		if(l1 >= -1L)
	//*  28   50:lload           6
	//*  29   52:ldc2w           #112 <Long -1L>
	//*  30   55:lcmp            
	//*  31   56:iflt            65
			flag = true;
	//   32   59:iconst_1        
	//   33   60:istore          8
		else
	//*  34   62:goto            68
			flag = false;
	//   35   65:iconst_0        
	//   36   66:istore          8
		zzac.zzb(flag, "invalid length: %s", new Object[] {
			Long.valueOf(l1)
		});
	//   37   68:iload           8
	//   38   70:ldc1            #115 <String "invalid length: %s">
	//   39   72:iconst_1        
	//   40   73:anewarray       Object[]
	//   41   76:dup             
	//   42   77:iconst_0        
	//   43   78:lload           6
	//   44   80:invokestatic    #108 <Method Long Long.valueOf(long)>
	//   45   83:aastore         
	//   46   84:invokestatic    #111 <Method void zzac.zzb(boolean, String, Object[])>
		return new Runnable(uri, zzb1, s, l, l1) {

			public void run()
			{
				Object obj;
				if(Log.isLoggable("WearableClient", 2))
			//*   0    0:ldc1            #49  <String "WearableClient">
			//*   1    2:iconst_2        
			//*   2    3:invokestatic    #55  <Method boolean Log.isLoggable(String, int)>
			//*   3    6:ifeq            17
					Log.v("WearableClient", "Executing sendFileToChannelTask");
			//    4    9:ldc1            #49  <String "WearableClient">
			//    5   11:ldc1            #57  <String "Executing sendFileToChannelTask">
			//    6   13:invokestatic    #61  <Method int Log.v(String, String)>
			//    7   16:pop             
				if(!"file".equals(((Object) (zzbBv.getScheme()))))
			//*   8   17:ldc1            #63  <String "file">
			//*   9   19:aload_0         
			//*  10   20:getfield        #28  <Field Uri zzbBv>
			//*  11   23:invokevirtual   #69  <Method String Uri.getScheme()>
			//*  12   26:invokevirtual   #75  <Method boolean String.equals(Object)>
			//*  13   29:ifne            61
				{
					Log.w("WearableClient", "Channel.sendFile used with non-file URI");
			//   14   32:ldc1            #49  <String "WearableClient">
			//   15   34:ldc1            #77  <String "Channel.sendFile used with non-file URI">
			//   16   36:invokestatic    #80  <Method int Log.w(String, String)>
			//   17   39:pop             
					zzbVd.zzB(new Status(10, "Channel.sendFile used with non-file URI"));
			//   18   40:aload_0         
			//   19   41:getfield        #30  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//   20   44:new             #82  <Class Status>
			//   21   47:dup             
			//   22   48:bipush          10
			//   23   50:ldc1            #77  <String "Channel.sendFile used with non-file URI">
			//   24   52:invokespecial   #85  <Method void Status(int, String)>
			//   25   55:invokeinterface #91  <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
					return;
			//   26   60:return          
				}
				File file = new File(zzbBv.getPath());
			//   27   61:new             #93  <Class File>
			//   28   64:dup             
			//   29   65:aload_0         
			//   30   66:getfield        #28  <Field Uri zzbBv>
			//   31   69:invokevirtual   #96  <Method String Uri.getPath()>
			//   32   72:invokespecial   #99  <Method void File(String)>
			//   33   75:astore_2        
				try
				{
					obj = ((Object) (ParcelFileDescriptor.open(file, 0x10000000)));
			//   34   76:aload_2         
			//   35   77:ldc1            #100 <Int 0x10000000>
			//   36   79:invokestatic    #106 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
			//   37   82:astore_1        
				}
			//*  38   83:goto            145
			//*  39   86:aload_2         
			//*  40   87:invokestatic    #110 <Method String String.valueOf(Object)>
			//*  41   90:astore_1        
			//*  42   91:ldc1            #49  <String "WearableClient">
			//*  43   93:new             #112 <Class StringBuilder>
			//*  44   96:dup             
			//*  45   97:aload_1         
			//*  46   98:invokestatic    #110 <Method String String.valueOf(Object)>
			//*  47  101:invokevirtual   #116 <Method int String.length()>
			//*  48  104:bipush          46
			//*  49  106:iadd            
			//*  50  107:invokespecial   #119 <Method void StringBuilder(int)>
			//*  51  110:ldc1            #121 <String "File couldn't be opened for Channel.sendFile: ">
			//*  52  112:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
			//*  53  115:aload_1         
			//*  54  116:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
			//*  55  119:invokevirtual   #128 <Method String StringBuilder.toString()>
			//*  56  122:invokestatic    #80  <Method int Log.w(String, String)>
			//*  57  125:pop             
			//*  58  126:aload_0         
			//*  59  127:getfield        #30  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//*  60  130:new             #82  <Class Status>
			//*  61  133:dup             
			//*  62  134:bipush          13
			//*  63  136:invokespecial   #129 <Method void Status(int)>
			//*  64  139:invokeinterface #91  <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
			//*  65  144:return          
			//*  66  145:aload_0         
			//*  67  146:getfield        #26  <Field zzcx zzbVe>
			//*  68  149:invokevirtual   #133 <Method IInterface zzcx.zzxD()>
			//*  69  152:checkcast       #135 <Class zzbw>
			//*  70  155:new             #137 <Class zzcw$zzr>
			//*  71  158:dup             
			//*  72  159:aload_0         
			//*  73  160:getfield        #30  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//*  74  163:invokespecial   #140 <Method void zzcw$zzr(com.google.android.gms.internal.zzaad$zzb)>
			//*  75  166:aload_0         
			//*  76  167:getfield        #32  <Field String zzaiD>
			//*  77  170:aload_1         
			//*  78  171:aload_0         
			//*  79  172:getfield        #34  <Field long zzbTZ>
			//*  80  175:aload_0         
			//*  81  176:getfield        #36  <Field long zzbUa>
			//*  82  179:invokeinterface #144 <Method void zzbw.zza(zzbu, String, ParcelFileDescriptor, long, long)>
			//*  83  184:aload_1         
			//*  84  185:invokevirtual   #147 <Method void ParcelFileDescriptor.close()>
			//*  85  188:return          
			//*  86  189:astore_1        
			//*  87  190:ldc1            #49  <String "WearableClient">
			//*  88  192:ldc1            #149 <String "Failed to close sourceFd">
			//*  89  194:aload_1         
			//*  90  195:invokestatic    #152 <Method int Log.w(String, String, Throwable)>
			//*  91  198:pop             
			//*  92  199:return          
			//*  93  200:astore_2        
			//*  94  201:ldc1            #49  <String "WearableClient">
			//*  95  203:ldc1            #154 <String "Channel.sendFile failed.">
			//*  96  205:aload_2         
			//*  97  206:invokestatic    #152 <Method int Log.w(String, String, Throwable)>
			//*  98  209:pop             
			//*  99  210:aload_0         
			//* 100  211:getfield        #30  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//* 101  214:new             #82  <Class Status>
			//* 102  217:dup             
			//* 103  218:bipush          8
			//* 104  220:invokespecial   #129 <Method void Status(int)>
			//* 105  223:invokeinterface #91  <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
			//* 106  228:aload_1         
			//* 107  229:invokevirtual   #147 <Method void ParcelFileDescriptor.close()>
			//* 108  232:return          
			//* 109  233:astore_1        
			//* 110  234:ldc1            #49  <String "WearableClient">
			//* 111  236:ldc1            #149 <String "Failed to close sourceFd">
			//* 112  238:aload_1         
			//* 113  239:invokestatic    #152 <Method int Log.w(String, String, Throwable)>
			//* 114  242:pop             
			//* 115  243:return          
			//* 116  244:astore_2        
			//* 117  245:aload_1         
			//* 118  246:invokevirtual   #147 <Method void ParcelFileDescriptor.close()>
			//* 119  249:goto            262
			//* 120  252:astore_1        
			//* 121  253:ldc1            #49  <String "WearableClient">
			//* 122  255:ldc1            #149 <String "Failed to close sourceFd">
			//* 123  257:aload_1         
			//* 124  258:invokestatic    #152 <Method int Log.w(String, String, Throwable)>
			//* 125  261:pop             
			//* 126  262:aload_2         
			//* 127  263:athrow          
				// Misplaced declaration of an exception variable
				catch(FileNotFoundException filenotfoundexception)
				{
					obj = ((Object) (String.valueOf(((Object) (file)))));
					Log.w("WearableClient", (new StringBuilder(String.valueOf(obj).length() + 46)).append("File couldn't be opened for Channel.sendFile: ").append(((String) (obj))).toString());
					zzbVd.zzB(new Status(13));
					return;
				}
				((zzbw)zzbVe.zzxD()).zza(((zzbu) (new zzcw.zzr(zzbVd))), zzaiD, ((ParcelFileDescriptor) (obj)), zzbTZ, zzbUa);
				try
				{
					((ParcelFileDescriptor) (obj)).close();
					return;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
				}
				return;
				Object obj1;
				obj1;
				Log.w("WearableClient", "Channel.sendFile failed.", ((Throwable) (obj1)));
				zzbVd.zzB(new Status(8));
				try
				{
					((ParcelFileDescriptor) (obj)).close();
					return;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (obj)));
				}
				return;
				obj1;
				FileNotFoundException filenotfoundexception;
				try
				{
					((ParcelFileDescriptor) (obj)).close();
				}
				catch(IOException ioexception)
				{
					Log.w("WearableClient", "Failed to close sourceFd", ((Throwable) (ioexception)));
				}
				throw obj1;
			//* 128  264:astore_1        
			//* 129  265:goto            86
			}

			final String zzaiD;
			final Uri zzbBv;
			final long zzbTZ;
			final long zzbUa;
			final com.google.android.gms.internal.zzaad.zzb zzbVd;
			final zzcx zzbVe;

			
			{
				zzbVe = zzcx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field zzcx zzbVe>
				zzbBv = uri;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field Uri zzbBv>
				zzbVd = zzb1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
				zzaiD = s;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #32  <Field String zzaiD>
				zzbTZ = l;
			//   12   21:aload_0         
			//   13   22:lload           5
			//   14   24:putfield        #34  <Field long zzbTZ>
				zzbUa = l1;
			//   15   27:aload_0         
			//   16   28:lload           7
			//   17   30:putfield        #36  <Field long zzbUa>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #39  <Method void Object()>
			//   20   37:return          
			}
		}
;
	//   47   87:new             #11  <Class zzcx$3>
	//   48   90:dup             
	//   49   91:aload_0         
	//   50   92:aload_3         
	//   51   93:aload_1         
	//   52   94:aload_2         
	//   53   95:lload           4
	//   54   97:lload           6
	//   55   99:invokespecial   #118 <Method void zzcx$3(zzcx, Uri, com.google.android.gms.internal.zzaad$zzb, String, long, long)>
	//   56  102:areturn         
	}

	private Runnable zzb(com.google.android.gms.internal.zzaad.zzb zzb1, String s, Uri uri, boolean flag)
	{
		zzac.zzw(((Object) (zzb1)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//    2    4:pop             
		zzac.zzw(((Object) (s)));
	//    3    5:aload_2         
	//    4    6:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//    5    9:pop             
		zzac.zzw(((Object) (uri)));
	//    6   10:aload_3         
	//    7   11:invokestatic    #78  <Method Object zzac.zzw(Object)>
	//    8   14:pop             
		return new Runnable(uri, zzb1, flag, s) {

			public void run()
			{
				Object obj;
				if(Log.isLoggable("WearableClient", 2))
			//*   0    0:ldc1            #46  <String "WearableClient">
			//*   1    2:iconst_2        
			//*   2    3:invokestatic    #52  <Method boolean Log.isLoggable(String, int)>
			//*   3    6:ifeq            17
					Log.v("WearableClient", "Executing receiveFileFromChannelTask");
			//    4    9:ldc1            #46  <String "WearableClient">
			//    5   11:ldc1            #54  <String "Executing receiveFileFromChannelTask">
			//    6   13:invokestatic    #58  <Method int Log.v(String, String)>
			//    7   16:pop             
				if(!"file".equals(((Object) (zzbBv.getScheme()))))
			//*   8   17:ldc1            #60  <String "file">
			//*   9   19:aload_0         
			//*  10   20:getfield        #27  <Field Uri zzbBv>
			//*  11   23:invokevirtual   #66  <Method String Uri.getScheme()>
			//*  12   26:invokevirtual   #72  <Method boolean String.equals(Object)>
			//*  13   29:ifne            61
				{
					Log.w("WearableClient", "Channel.receiveFile used with non-file URI");
			//   14   32:ldc1            #46  <String "WearableClient">
			//   15   34:ldc1            #74  <String "Channel.receiveFile used with non-file URI">
			//   16   36:invokestatic    #77  <Method int Log.w(String, String)>
			//   17   39:pop             
					zzbVd.zzB(new Status(10, "Channel.receiveFile used with non-file URI"));
			//   18   40:aload_0         
			//   19   41:getfield        #29  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//   20   44:new             #79  <Class Status>
			//   21   47:dup             
			//   22   48:bipush          10
			//   23   50:ldc1            #74  <String "Channel.receiveFile used with non-file URI">
			//   24   52:invokespecial   #82  <Method void Status(int, String)>
			//   25   55:invokeinterface #88  <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
					return;
			//   26   60:return          
				}
				File file = new File(zzbBv.getPath());
			//   27   61:new             #90  <Class File>
			//   28   64:dup             
			//   29   65:aload_0         
			//   30   66:getfield        #27  <Field Uri zzbBv>
			//   31   69:invokevirtual   #93  <Method String Uri.getPath()>
			//   32   72:invokespecial   #96  <Method void File(String)>
			//   33   75:astore_3        
				int i;
				if(zzbTY)
			//*  34   76:aload_0         
			//*  35   77:getfield        #31  <Field boolean zzbTY>
			//*  36   80:ifeq            89
					i = 0x2000000;
			//   37   83:ldc1            #97  <Int 0x2000000>
			//   38   85:istore_1        
				else
			//*  39   86:goto            91
					i = 0;
			//   40   89:iconst_0        
			//   41   90:istore_1        
				try
				{
					obj = ((Object) (ParcelFileDescriptor.open(file, 0x28000000 | i)));
			//   42   91:aload_3         
			//   43   92:ldc1            #98  <Int 0x28000000>
			//   44   94:iload_1         
			//   45   95:ior             
			//   46   96:invokestatic    #104 <Method ParcelFileDescriptor ParcelFileDescriptor.open(File, int)>
			//   47   99:astore_2        
				}
			//*  48  100:goto            162
			//*  49  103:aload_3         
			//*  50  104:invokestatic    #108 <Method String String.valueOf(Object)>
			//*  51  107:astore_2        
			//*  52  108:ldc1            #46  <String "WearableClient">
			//*  53  110:new             #110 <Class StringBuilder>
			//*  54  113:dup             
			//*  55  114:aload_2         
			//*  56  115:invokestatic    #108 <Method String String.valueOf(Object)>
			//*  57  118:invokevirtual   #114 <Method int String.length()>
			//*  58  121:bipush          49
			//*  59  123:iadd            
			//*  60  124:invokespecial   #117 <Method void StringBuilder(int)>
			//*  61  127:ldc1            #119 <String "File couldn't be opened for Channel.receiveFile: ">
			//*  62  129:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
			//*  63  132:aload_2         
			//*  64  133:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
			//*  65  136:invokevirtual   #126 <Method String StringBuilder.toString()>
			//*  66  139:invokestatic    #77  <Method int Log.w(String, String)>
			//*  67  142:pop             
			//*  68  143:aload_0         
			//*  69  144:getfield        #29  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//*  70  147:new             #79  <Class Status>
			//*  71  150:dup             
			//*  72  151:bipush          13
			//*  73  153:invokespecial   #127 <Method void Status(int)>
			//*  74  156:invokeinterface #88  <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
			//*  75  161:return          
			//*  76  162:aload_0         
			//*  77  163:getfield        #25  <Field zzcx zzbVe>
			//*  78  166:invokevirtual   #131 <Method IInterface zzcx.zzxD()>
			//*  79  169:checkcast       #133 <Class zzbw>
			//*  80  172:new             #135 <Class zzcw$zzu>
			//*  81  175:dup             
			//*  82  176:aload_0         
			//*  83  177:getfield        #29  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//*  84  180:invokespecial   #138 <Method void zzcw$zzu(com.google.android.gms.internal.zzaad$zzb)>
			//*  85  183:aload_0         
			//*  86  184:getfield        #33  <Field String zzaiD>
			//*  87  187:aload_2         
			//*  88  188:invokeinterface #142 <Method void zzbw.zza(zzbu, String, ParcelFileDescriptor)>
			//*  89  193:aload_2         
			//*  90  194:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
			//*  91  197:return          
			//*  92  198:astore_2        
			//*  93  199:ldc1            #46  <String "WearableClient">
			//*  94  201:ldc1            #147 <String "Failed to close targetFd">
			//*  95  203:aload_2         
			//*  96  204:invokestatic    #150 <Method int Log.w(String, String, Throwable)>
			//*  97  207:pop             
			//*  98  208:return          
			//*  99  209:astore_3        
			//* 100  210:ldc1            #46  <String "WearableClient">
			//* 101  212:ldc1            #152 <String "Channel.receiveFile failed.">
			//* 102  214:aload_3         
			//* 103  215:invokestatic    #150 <Method int Log.w(String, String, Throwable)>
			//* 104  218:pop             
			//* 105  219:aload_0         
			//* 106  220:getfield        #29  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
			//* 107  223:new             #79  <Class Status>
			//* 108  226:dup             
			//* 109  227:bipush          8
			//* 110  229:invokespecial   #127 <Method void Status(int)>
			//* 111  232:invokeinterface #88  <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
			//* 112  237:aload_2         
			//* 113  238:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
			//* 114  241:return          
			//* 115  242:astore_2        
			//* 116  243:ldc1            #46  <String "WearableClient">
			//* 117  245:ldc1            #147 <String "Failed to close targetFd">
			//* 118  247:aload_2         
			//* 119  248:invokestatic    #150 <Method int Log.w(String, String, Throwable)>
			//* 120  251:pop             
			//* 121  252:return          
			//* 122  253:astore_3        
			//* 123  254:aload_2         
			//* 124  255:invokevirtual   #145 <Method void ParcelFileDescriptor.close()>
			//* 125  258:goto            271
			//* 126  261:astore_2        
			//* 127  262:ldc1            #46  <String "WearableClient">
			//* 128  264:ldc1            #147 <String "Failed to close targetFd">
			//* 129  266:aload_2         
			//* 130  267:invokestatic    #150 <Method int Log.w(String, String, Throwable)>
			//* 131  270:pop             
			//* 132  271:aload_3         
			//* 133  272:athrow          
				// Misplaced declaration of an exception variable
				catch(FileNotFoundException filenotfoundexception)
				{
					obj = ((Object) (String.valueOf(((Object) (file)))));
					Log.w("WearableClient", (new StringBuilder(String.valueOf(obj).length() + 49)).append("File couldn't be opened for Channel.receiveFile: ").append(((String) (obj))).toString());
					zzbVd.zzB(new Status(13));
					return;
				}
				((zzbw)zzbVe.zzxD()).zza(((zzbu) (new zzcw.zzu(zzbVd))), zzaiD, ((ParcelFileDescriptor) (obj)));
				try
				{
					((ParcelFileDescriptor) (obj)).close();
					return;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
				}
				return;
				Object obj1;
				obj1;
				Log.w("WearableClient", "Channel.receiveFile failed.", ((Throwable) (obj1)));
				zzbVd.zzB(new Status(8));
				try
				{
					((ParcelFileDescriptor) (obj)).close();
					return;
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (obj)));
				}
				return;
				obj1;
				FileNotFoundException filenotfoundexception;
				try
				{
					((ParcelFileDescriptor) (obj)).close();
				}
				catch(IOException ioexception)
				{
					Log.w("WearableClient", "Failed to close targetFd", ((Throwable) (ioexception)));
				}
				throw obj1;
			//* 134  273:astore_2        
			//* 135  274:goto            103
			}

			final String zzaiD;
			final Uri zzbBv;
			final boolean zzbTY;
			final com.google.android.gms.internal.zzaad.zzb zzbVd;
			final zzcx zzbVe;

			
			{
				zzbVe = zzcx.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field zzcx zzbVe>
				zzbBv = uri;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Uri zzbBv>
				zzbVd = zzb1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field com.google.android.gms.internal.zzaad$zzb zzbVd>
				zzbTY = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #31  <Field boolean zzbTY>
				zzaiD = s;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field String zzaiD>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
		}
;
	//    9   15:new             #9   <Class zzcx$2>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:aload_1         
	//   14   22:iload           4
	//   15   24:aload_2         
	//   16   25:invokespecial   #123 <Method void zzcx$2(zzcx, Uri, com.google.android.gms.internal.zzaad$zzb, boolean, String)>
	//   17   28:areturn         
	}

	public static Intent zzcj(Context context)
	{
		Intent intent = (new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR")).setPackage("com.google.android.wearable.app.cn");
	//    0    0:new             #128 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #130 <String "com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR">
	//    3    6:invokespecial   #133 <Method void Intent(String)>
	//    4    9:ldc1            #135 <String "com.google.android.wearable.app.cn">
	//    5   11:invokevirtual   #139 <Method Intent Intent.setPackage(String)>
	//    6   14:astore_1        
		if(context.getPackageManager().resolveActivity(intent, 0x10000) != null)
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #145 <Method PackageManager Context.getPackageManager()>
	//*   9   19:aload_1         
	//*  10   20:ldc1            #146 <Int 0x10000>
	//*  11   22:invokevirtual   #152 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*  12   25:ifnull          30
			return intent;
	//   13   28:aload_1         
	//   14   29:areturn         
		else
			return new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
	//   15   30:new             #128 <Class Intent>
	//   16   33:dup             
	//   17   34:ldc1            #154 <String "android.intent.action.VIEW">
	//   18   36:ldc1            #156 <String "market://details">
	//   19   38:invokestatic    #162 <Method Uri Uri.parse(String)>
	//   20   41:invokevirtual   #166 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   21   44:ldc1            #168 <String "id">
	//   22   46:ldc1            #135 <String "com.google.android.wearable.app.cn">
	//   23   48:invokevirtual   #174 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   24   51:invokevirtual   #178 <Method Uri android.net.Uri$Builder.build()>
	//   25   54:invokespecial   #181 <Method void Intent(String, Uri)>
	//   26   57:areturn         
	}

	public void zza(int i, IBinder ibinder, Bundle bundle, int j)
	{
		if(Log.isLoggable("WearableClient", 2))
	//*   0    0:ldc1            #184 <String "WearableClient">
	//*   1    2:iconst_2        
	//*   2    3:invokestatic    #190 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            36
			Log.d("WearableClient", (new StringBuilder(41)).append("onPostInitHandler: statusCode ").append(i).toString());
	//    4    9:ldc1            #184 <String "WearableClient">
	//    5   11:new             #192 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:bipush          41
	//    8   17:invokespecial   #195 <Method void StringBuilder(int)>
	//    9   20:ldc1            #197 <String "onPostInitHandler: statusCode ">
	//   10   22:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:iload_1         
	//   12   26:invokevirtual   #204 <Method StringBuilder StringBuilder.append(int)>
	//   13   29:invokevirtual   #208 <Method String StringBuilder.toString()>
	//   14   32:invokestatic    #212 <Method int Log.d(String, String)>
	//   15   35:pop             
		if(i == 0)
	//*  16   36:iload_1         
	//*  17   37:ifne            104
		{
			zzbUT.zzfE(ibinder);
	//   18   40:aload_0         
	//   19   41:getfield        #58  <Field zzbx zzbUT>
	//   20   44:aload_2         
	//   21   45:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbUU.zzfE(ibinder);
	//   22   48:aload_0         
	//   23   49:getfield        #60  <Field zzbx zzbUU>
	//   24   52:aload_2         
	//   25   53:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbUV.zzfE(ibinder);
	//   26   56:aload_0         
	//   27   57:getfield        #62  <Field zzbx zzbUV>
	//   28   60:aload_2         
	//   29   61:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbUW.zzfE(ibinder);
	//   30   64:aload_0         
	//   31   65:getfield        #64  <Field zzbx zzbUW>
	//   32   68:aload_2         
	//   33   69:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbUX.zzfE(ibinder);
	//   34   72:aload_0         
	//   35   73:getfield        #66  <Field zzbx zzbUX>
	//   36   76:aload_2         
	//   37   77:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbUY.zzfE(ibinder);
	//   38   80:aload_0         
	//   39   81:getfield        #68  <Field zzbx zzbUY>
	//   40   84:aload_2         
	//   41   85:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbUZ.zzfE(ibinder);
	//   42   88:aload_0         
	//   43   89:getfield        #70  <Field zzbx zzbUZ>
	//   44   92:aload_2         
	//   45   93:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
			zzbVa.zzfE(ibinder);
	//   46   96:aload_0         
	//   47   97:getfield        #72  <Field zzbx zzbVa>
	//   48  100:aload_2         
	//   49  101:invokevirtual   #216 <Method void zzbx.zzfE(IBinder)>
		}
		super.zza(i, ibinder, bundle, j);
	//   50  104:aload_0         
	//   51  105:iload_1         
	//   52  106:aload_2         
	//   53  107:aload_3         
	//   54  108:iload           4
	//   55  110:invokespecial   #218 <Method void zzl.zza(int, IBinder, Bundle, int)>
	//   56  113:return          
	}

	public void zza(com.google.android.gms.common.internal.zzf.zzf zzf)
	{
		if(zzvh()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method boolean zzvh()>
	//    2    4:ifne            129
_L1:
		int i;
		Bundle bundle;
		try
		{
			bundle = getContext().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #230 <Method Context getContext()>
	//    5   11:invokevirtual   #145 <Method PackageManager Context.getPackageManager()>
	//    6   14:ldc1            #135 <String "com.google.android.wearable.app.cn">
	//    7   16:sipush          128
	//    8   19:invokevirtual   #234 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    9   22:getfield        #240 <Field Bundle ApplicationInfo.metaData>
	//   10   25:astore          4
		}
	//*  11   27:aload           4
	//*  12   29:ifnull          140
	//*  13   32:aload           4
	//*  14   34:ldc1            #242 <String "com.google.android.wearable.api.version">
	//*  15   36:iconst_0        
	//*  16   37:invokevirtual   #248 <Method int Bundle.getInt(String, int)>
	//*  17   40:istore_2        
	//*  18   41:goto            44
	//*  19   44:iload_2         
	//*  20   45:getstatic       #254 <Field int zze.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  21   48:icmpge          117
	//*  22   51:getstatic       #254 <Field int zze.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  23   54:istore_3        
	//*  24   55:ldc1            #184 <String "WearableClient">
	//*  25   57:new             #192 <Class StringBuilder>
	//*  26   60:dup             
	//*  27   61:bipush          80
	//*  28   63:invokespecial   #195 <Method void StringBuilder(int)>
	//*  29   66:ldc2            #256 <String "Android Wear out of date. Requires API version ">
	//*  30   69:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  31   72:iload_3         
	//*  32   73:invokevirtual   #204 <Method StringBuilder StringBuilder.append(int)>
	//*  33   76:ldc2            #258 <String " but found ">
	//*  34   79:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//*  35   82:iload_2         
	//*  36   83:invokevirtual   #204 <Method StringBuilder StringBuilder.append(int)>
	//*  37   86:invokevirtual   #208 <Method String StringBuilder.toString()>
	//*  38   89:invokestatic    #261 <Method int Log.w(String, String)>
	//*  39   92:pop             
	//*  40   93:aload_0         
	//*  41   94:aload_1         
	//*  42   95:bipush          6
	//*  43   97:aload_0         
	//*  44   98:invokevirtual   #230 <Method Context getContext()>
	//*  45  101:iconst_0        
	//*  46  102:aload_0         
	//*  47  103:invokevirtual   #230 <Method Context getContext()>
	//*  48  106:invokestatic    #263 <Method Intent zzcj(Context)>
	//*  49  109:iconst_0        
	//*  50  110:invokestatic    #269 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//*  51  113:invokevirtual   #272 <Method void zza(com.google.android.gms.common.internal.zzf$zzf, int, PendingIntent)>
	//*  52  116:return          
	//*  53  117:goto            129
	//*  54  120:aload_0         
	//*  55  121:aload_1         
	//*  56  122:bipush          16
	//*  57  124:aconst_null     
	//*  58  125:invokevirtual   #272 <Method void zza(com.google.android.gms.common.internal.zzf$zzf, int, PendingIntent)>
	//*  59  128:return          
	//*  60  129:aload_0         
	//*  61  130:aload_1         
	//*  62  131:invokespecial   #274 <Method void zzl.zza(com.google.android.gms.common.internal.zzf$zzf)>
	//*  63  134:return          
		// Misplaced declaration of an exception variable
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
		{
			zza(zzf, 16, ((PendingIntent) (null)));
			return;
		}
		if(bundle == null) goto _L4; else goto _L3
_L3:
		i = bundle.getInt("com.google.android.wearable.api.version", 0);
_L6:
		if(i < zze.GOOGLE_PLAY_SERVICES_VERSION_CODE)
		{
			int j = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
			Log.w("WearableClient", (new StringBuilder(80)).append("Android Wear out of date. Requires API version ").append(j).append(" but found ").append(i).toString());
			zza(zzf, 6, PendingIntent.getActivity(getContext(), 0, zzcj(getContext()), 0));
			return;
		}
_L2:
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		super.zza(zzf);
		return;
	//*  64  135:astore          4
	//*  65  137:goto            120
_L4:
		i = 0;
	//   66  140:iconst_0        
	//   67  141:istore_2        
		if(true) goto _L6; else goto _L5
	//   68  142:goto            44
_L5:
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, Uri uri)
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzk(zzb1))), uri);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #286 <Class zzcw$zzk>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #289 <Method void zzcw$zzk(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:invokeinterface #292 <Method void zzbw.zza(zzbu, Uri)>
	//    9   21:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, Uri uri, int i)
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzl(zzb1))), uri, i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #297 <Class zzcw$zzl>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #298 <Method void zzcw$zzl(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:invokeinterface #301 <Method void zzbw.zza(zzbu, Uri, int)>
	//   10   22:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, Asset asset)
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzm(zzb1))), asset);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #305 <Class zzcw$zzm>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #306 <Method void zzcw$zzm(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:invokeinterface #309 <Method void zzbw.zza(zzbu, Asset)>
	//    9   21:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener)
		throws RemoteException
	{
		zzbVa.zza(this, zzb1, ((Object) (capabilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field zzbx zzbVa>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #314 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object)>
	//    6   10:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.CapabilityApi.CapabilityListener capabilitylistener, zzabh zzabh, IntentFilter aintentfilter[])
		throws RemoteException
	{
		zzbVa.zza(this, zzb1, ((Object) (capabilitylistener)), com.google.android.gms.wearable.internal.zzcy.zze(zzabh, aintentfilter));
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field zzbx zzbVa>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokestatic    #322 <Method zzcy com.google.android.gms.wearable.internal.zzcy.zze(zzabh, IntentFilter[])>
	//    8   13:invokevirtual   #325 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object, zzcy)>
	//    9   16:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, zzabh zzabh, String s, IntentFilter aintentfilter[])
		throws RemoteException
	{
		if(s == null)
	//*   0    0:aload           4
	//*   1    2:ifnonnull       22
		{
			zzbUV.zza(this, zzb1, ((Object) (channellistener)), zzcy.zzd(zzabh, aintentfilter));
	//    2    5:aload_0         
	//    3    6:getfield        #62  <Field zzbx zzbUV>
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           5
	//    9   15:invokestatic    #330 <Method zzcy zzcy.zzd(zzabh, IntentFilter[])>
	//   10   18:invokevirtual   #325 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object, zzcy)>
			return;
	//   11   21:return          
		} else
		{
			channellistener = ((com.google.android.gms.wearable.ChannelApi.ChannelListener) (new zzcq(s, channellistener)));
	//   12   22:new             #332 <Class zzcq>
	//   13   25:dup             
	//   14   26:aload           4
	//   15   28:aload_2         
	//   16   29:invokespecial   #335 <Method void zzcq(String, com.google.android.gms.wearable.ChannelApi$ChannelListener)>
	//   17   32:astore_2        
			zzbUV.zza(this, zzb1, ((Object) (channellistener)), zzcy.zza(zzabh, s, aintentfilter));
	//   18   33:aload_0         
	//   19   34:getfield        #62  <Field zzbx zzbUV>
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:aload           4
	//   25   43:aload           5
	//   26   45:invokestatic    #338 <Method zzcy zzcy.zza(zzabh, String, IntentFilter[])>
	//   27   48:invokevirtual   #325 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object, zzcy)>
			return;
	//   28   51:return          
		}
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
		throws RemoteException
	{
		if(s == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       15
		{
			zzbUV.zza(this, zzb1, ((Object) (channellistener)));
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field zzbx zzbUV>
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #314 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object)>
			return;
	//    8   14:return          
		} else
		{
			channellistener = ((com.google.android.gms.wearable.ChannelApi.ChannelListener) (new zzcq(s, channellistener)));
	//    9   15:new             #332 <Class zzcq>
	//   10   18:dup             
	//   11   19:aload_3         
	//   12   20:aload_2         
	//   13   21:invokespecial   #335 <Method void zzcq(String, com.google.android.gms.wearable.ChannelApi$ChannelListener)>
	//   14   24:astore_2        
			zzbUV.zza(this, zzb1, ((Object) (channellistener)));
	//   15   25:aload_0         
	//   16   26:getfield        #62  <Field zzbx zzbUV>
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:aload_2         
	//   20   32:invokevirtual   #314 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object)>
			return;
	//   21   35:return          
		}
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener)
		throws RemoteException
	{
		zzbUW.zza(this, zzb1, ((Object) (datalistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field zzbx zzbUW>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #314 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object)>
	//    6   10:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.DataApi.DataListener datalistener, zzabh zzabh, IntentFilter aintentfilter[])
		throws RemoteException
	{
		zzbUW.zza(this, zzb1, ((Object) (datalistener)), zzcy.zza(zzabh, aintentfilter));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field zzbx zzbUW>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokestatic    #346 <Method zzcy zzcy.zza(zzabh, IntentFilter[])>
	//    8   13:invokevirtual   #325 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object, zzcy)>
	//    9   16:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, DataItemAsset dataitemasset)
		throws RemoteException
	{
		zza(zzb1, Asset.createFromRef(dataitemasset.getId()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #353 <Method String DataItemAsset.getId()>
	//    4    8:invokestatic    #359 <Method Asset Asset.createFromRef(String)>
	//    5   11:invokevirtual   #361 <Method void zza(com.google.android.gms.internal.zzaad$zzb, Asset)>
	//    6   14:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
		throws RemoteException
	{
		zzbUX.zza(this, zzb1, ((Object) (messagelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field zzbx zzbUX>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #314 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object)>
	//    6   10:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, zzabh zzabh, IntentFilter aintentfilter[])
		throws RemoteException
	{
		zzbUX.zza(this, zzb1, ((Object) (messagelistener)), zzcy.zzb(zzabh, aintentfilter));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field zzbx zzbUX>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokestatic    #367 <Method zzcy zzcy.zzb(zzabh, IntentFilter[])>
	//    8   13:invokevirtual   #325 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object, zzcy)>
	//    9   16:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener)
		throws RemoteException
	{
		zzbUY.zza(this, zzb1, ((Object) (nodelistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field zzbx zzbUY>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #314 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object)>
	//    6   10:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, zzabh zzabh, IntentFilter aintentfilter[])
		throws RemoteException
	{
		zzbUY.zza(this, zzb1, ((Object) (nodelistener)), zzcy.zzc(zzabh, aintentfilter));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field zzbx zzbUY>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokestatic    #374 <Method zzcy zzcy.zzc(zzabh, IntentFilter[])>
	//    8   13:invokevirtual   #325 <Method void zzbx.zza(zzcx, com.google.android.gms.internal.zzaad$zzb, Object, zzcy)>
	//    9   16:return          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, PutDataRequest putdatarequest)
		throws RemoteException
	{
		for(Iterator iterator = putdatarequest.getAssets().entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #386 <Method Map PutDataRequest.getAssets()>
	//*   2    4:invokeinterface #392 <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #398 <Method Iterator Set.iterator()>
	//*   4   14:astore          6
	//*   5   16:aload           6
	//*   6   18:invokeinterface #403 <Method boolean Iterator.hasNext()>
	//*   7   23:ifeq            153
		{
			Asset asset = (Asset)((java.util.Map.Entry)iterator.next()).getValue();
	//    8   26:aload           6
	//    9   28:invokeinterface #407 <Method Object Iterator.next()>
	//   10   33:checkcast       #409 <Class java.util.Map$Entry>
	//   11   36:invokeinterface #412 <Method Object java.util.Map$Entry.getValue()>
	//   12   41:checkcast       #355 <Class Asset>
	//   13   44:astore          5
			if(asset.getData() == null && asset.getDigest() == null && asset.getFd() == null && asset.getUri() == null)
	//*  14   46:aload           5
	//*  15   48:invokevirtual   #416 <Method byte[] Asset.getData()>
	//*  16   51:ifnonnull       150
	//*  17   54:aload           5
	//*  18   56:invokevirtual   #419 <Method String Asset.getDigest()>
	//*  19   59:ifnonnull       150
	//*  20   62:aload           5
	//*  21   64:invokevirtual   #423 <Method ParcelFileDescriptor Asset.getFd()>
	//*  22   67:ifnonnull       150
	//*  23   70:aload           5
	//*  24   72:invokevirtual   #426 <Method Uri Asset.getUri()>
	//*  25   75:ifnonnull       150
			{
				zzb1 = ((com.google.android.gms.internal.zzaad.zzb) (String.valueOf(((Object) (putdatarequest.getUri())))));
	//   26   78:aload_2         
	//   27   79:invokevirtual   #427 <Method Uri PutDataRequest.getUri()>
	//   28   82:invokestatic    #432 <Method String String.valueOf(Object)>
	//   29   85:astore_1        
				putdatarequest = ((PutDataRequest) (String.valueOf(((Object) (asset)))));
	//   30   86:aload           5
	//   31   88:invokestatic    #432 <Method String String.valueOf(Object)>
	//   32   91:astore_2        
				int i = String.valueOf(((Object) (zzb1))).length();
	//   33   92:aload_1         
	//   34   93:invokestatic    #432 <Method String String.valueOf(Object)>
	//   35   96:invokevirtual   #436 <Method int String.length()>
	//   36   99:istore_3        
				throw new IllegalArgumentException((new StringBuilder(String.valueOf(((Object) (putdatarequest))).length() + (i + 33))).append("Put for ").append(((String) (zzb1))).append(" contains invalid asset: ").append(((String) (putdatarequest))).toString());
	//   37  100:new             #438 <Class IllegalArgumentException>
	//   38  103:dup             
	//   39  104:new             #192 <Class StringBuilder>
	//   40  107:dup             
	//   41  108:aload_2         
	//   42  109:invokestatic    #432 <Method String String.valueOf(Object)>
	//   43  112:invokevirtual   #436 <Method int String.length()>
	//   44  115:iload_3         
	//   45  116:bipush          33
	//   46  118:iadd            
	//   47  119:iadd            
	//   48  120:invokespecial   #195 <Method void StringBuilder(int)>
	//   49  123:ldc2            #440 <String "Put for ">
	//   50  126:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   51  129:aload_1         
	//   52  130:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   53  133:ldc2            #442 <String " contains invalid asset: ">
	//   54  136:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   55  139:aload_2         
	//   56  140:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//   57  143:invokevirtual   #208 <Method String StringBuilder.toString()>
	//   58  146:invokespecial   #443 <Method void IllegalArgumentException(String)>
	//   59  149:athrow          
			}
		}

	//*  60  150:goto            16
		PutDataRequest putdatarequest1 = PutDataRequest.zzy(putdatarequest.getUri());
	//   61  153:aload_2         
	//   62  154:invokevirtual   #427 <Method Uri PutDataRequest.getUri()>
	//   63  157:invokestatic    #447 <Method PutDataRequest PutDataRequest.zzy(Uri)>
	//   64  160:astore          6
		putdatarequest1.setData(putdatarequest.getData());
	//   65  162:aload           6
	//   66  164:aload_2         
	//   67  165:invokevirtual   #448 <Method byte[] PutDataRequest.getData()>
	//   68  168:invokevirtual   #452 <Method PutDataRequest PutDataRequest.setData(byte[])>
	//   69  171:pop             
		if(putdatarequest.isUrgent())
	//*  70  172:aload_2         
	//*  71  173:invokevirtual   #455 <Method boolean PutDataRequest.isUrgent()>
	//*  72  176:ifeq            185
			putdatarequest1.setUrgent();
	//   73  179:aload           6
	//   74  181:invokevirtual   #459 <Method PutDataRequest PutDataRequest.setUrgent()>
	//   75  184:pop             
		ArrayList arraylist = new ArrayList();
	//   76  185:new             #461 <Class ArrayList>
	//   77  188:dup             
	//   78  189:invokespecial   #462 <Method void ArrayList()>
	//   79  192:astore          5
		for(Iterator iterator1 = putdatarequest.getAssets().entrySet().iterator(); iterator1.hasNext();)
	//*  80  194:aload_2         
	//*  81  195:invokevirtual   #386 <Method Map PutDataRequest.getAssets()>
	//*  82  198:invokeinterface #392 <Method Set Map.entrySet()>
	//*  83  203:invokeinterface #398 <Method Iterator Set.iterator()>
	//*  84  208:astore          7
	//*  85  210:aload           7
	//*  86  212:invokeinterface #403 <Method boolean Iterator.hasNext()>
	//*  87  217:ifeq            629
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
	//   88  220:aload           7
	//   89  222:invokeinterface #407 <Method Object Iterator.next()>
	//   90  227:checkcast       #409 <Class java.util.Map$Entry>
	//   91  230:astore          9
			Object obj = ((Object) ((Asset)entry.getValue()));
	//   92  232:aload           9
	//   93  234:invokeinterface #412 <Method Object java.util.Map$Entry.getValue()>
	//   94  239:checkcast       #355 <Class Asset>
	//   95  242:astore          8
			if(((Asset) (obj)).getData() != null)
	//*  96  244:aload           8
	//*  97  246:invokevirtual   #416 <Method byte[] Asset.getData()>
	//*  98  249:ifnull          486
			{
				ParcelFileDescriptor aparcelfiledescriptor[];
				try
				{
					aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
	//   99  252:invokestatic    #468 <Method ParcelFileDescriptor[] ParcelFileDescriptor.createPipe()>
	//  100  255:astore          10
				}
	//* 101  257:goto            305
				// Misplaced declaration of an exception variable
				catch(com.google.android.gms.internal.zzaad.zzb zzb1)
	//* 102  260:astore_1        
				{
					putdatarequest = ((PutDataRequest) (String.valueOf(((Object) (putdatarequest)))));
	//  103  261:aload_2         
	//  104  262:invokestatic    #432 <Method String String.valueOf(Object)>
	//  105  265:astore_2        
					throw new IllegalStateException((new StringBuilder(String.valueOf(((Object) (putdatarequest))).length() + 60)).append("Unable to create ParcelFileDescriptor for asset in request: ").append(((String) (putdatarequest))).toString(), ((Throwable) (zzb1)));
	//  106  266:new             #470 <Class IllegalStateException>
	//  107  269:dup             
	//  108  270:new             #192 <Class StringBuilder>
	//  109  273:dup             
	//  110  274:aload_2         
	//  111  275:invokestatic    #432 <Method String String.valueOf(Object)>
	//  112  278:invokevirtual   #436 <Method int String.length()>
	//  113  281:bipush          60
	//  114  283:iadd            
	//  115  284:invokespecial   #195 <Method void StringBuilder(int)>
	//  116  287:ldc2            #472 <String "Unable to create ParcelFileDescriptor for asset in request: ">
	//  117  290:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  118  293:aload_2         
	//  119  294:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  120  297:invokevirtual   #208 <Method String StringBuilder.toString()>
	//  121  300:aload_1         
	//  122  301:invokespecial   #475 <Method void IllegalStateException(String, Throwable)>
	//  123  304:athrow          
				}
				if(Log.isLoggable("WearableClient", 3))
	//* 124  305:ldc1            #184 <String "WearableClient">
	//* 125  307:iconst_3        
	//* 126  308:invokestatic    #190 <Method boolean Log.isLoggable(String, int)>
	//* 127  311:ifeq            423
				{
					String s = String.valueOf(obj);
	//  128  314:aload           8
	//  129  316:invokestatic    #432 <Method String String.valueOf(Object)>
	//  130  319:astore          11
					String s1 = String.valueOf(((Object) (aparcelfiledescriptor[0])));
	//  131  321:aload           10
	//  132  323:iconst_0        
	//  133  324:aaload          
	//  134  325:invokestatic    #432 <Method String String.valueOf(Object)>
	//  135  328:astore          12
					String s2 = String.valueOf(((Object) (aparcelfiledescriptor[1])));
	//  136  330:aload           10
	//  137  332:iconst_1        
	//  138  333:aaload          
	//  139  334:invokestatic    #432 <Method String String.valueOf(Object)>
	//  140  337:astore          13
					int j = String.valueOf(((Object) (s))).length();
	//  141  339:aload           11
	//  142  341:invokestatic    #432 <Method String String.valueOf(Object)>
	//  143  344:invokevirtual   #436 <Method int String.length()>
	//  144  347:istore_3        
					int k = String.valueOf(((Object) (s1))).length();
	//  145  348:aload           12
	//  146  350:invokestatic    #432 <Method String String.valueOf(Object)>
	//  147  353:invokevirtual   #436 <Method int String.length()>
	//  148  356:istore          4
					Log.d("WearableClient", (new StringBuilder(String.valueOf(((Object) (s2))).length() + (j + 61 + k))).append("processAssets: replacing data with FD in asset: ").append(s).append(" read:").append(s1).append(" write:").append(s2).toString());
	//  149  358:ldc1            #184 <String "WearableClient">
	//  150  360:new             #192 <Class StringBuilder>
	//  151  363:dup             
	//  152  364:aload           13
	//  153  366:invokestatic    #432 <Method String String.valueOf(Object)>
	//  154  369:invokevirtual   #436 <Method int String.length()>
	//  155  372:iload_3         
	//  156  373:bipush          61
	//  157  375:iadd            
	//  158  376:iload           4
	//  159  378:iadd            
	//  160  379:iadd            
	//  161  380:invokespecial   #195 <Method void StringBuilder(int)>
	//  162  383:ldc2            #477 <String "processAssets: replacing data with FD in asset: ">
	//  163  386:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  164  389:aload           11
	//  165  391:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  166  394:ldc2            #479 <String " read:">
	//  167  397:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  168  400:aload           12
	//  169  402:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  170  405:ldc2            #481 <String " write:">
	//  171  408:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  172  411:aload           13
	//  173  413:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//  174  416:invokevirtual   #208 <Method String StringBuilder.toString()>
	//  175  419:invokestatic    #212 <Method int Log.d(String, String)>
	//  176  422:pop             
				}
				putdatarequest1.putAsset((String)entry.getKey(), Asset.createFromFd(aparcelfiledescriptor[0]));
	//  177  423:aload           6
	//  178  425:aload           9
	//  179  427:invokeinterface #484 <Method Object java.util.Map$Entry.getKey()>
	//  180  432:checkcast       #429 <Class String>
	//  181  435:aload           10
	//  182  437:iconst_0        
	//  183  438:aaload          
	//  184  439:invokestatic    #488 <Method Asset Asset.createFromFd(ParcelFileDescriptor)>
	//  185  442:invokevirtual   #492 <Method PutDataRequest PutDataRequest.putAsset(String, Asset)>
	//  186  445:pop             
				obj = ((Object) (zza(aparcelfiledescriptor[1], ((Asset) (obj)).getData())));
	//  187  446:aload_0         
	//  188  447:aload           10
	//  189  449:iconst_1        
	//  190  450:aaload          
	//  191  451:aload           8
	//  192  453:invokevirtual   #416 <Method byte[] Asset.getData()>
	//  193  456:invokespecial   #494 <Method FutureTask zza(ParcelFileDescriptor, byte[])>
	//  194  459:astore          8
				((List) (arraylist)).add(obj);
	//  195  461:aload           5
	//  196  463:aload           8
	//  197  465:invokeinterface #500 <Method boolean List.add(Object)>
	//  198  470:pop             
				zzbtI.submit(((Runnable) (obj)));
	//  199  471:aload_0         
	//  200  472:getfield        #82  <Field ExecutorService zzbtI>
	//  201  475:aload           8
	//  202  477:invokeinterface #504 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//  203  482:pop             
			} else
	//* 204  483:goto            626
			if(((Asset) (obj)).getUri() != null)
	//* 205  486:aload           8
	//* 206  488:invokevirtual   #426 <Method Uri Asset.getUri()>
	//* 207  491:ifnull          608
				try
				{
					Asset asset1 = Asset.createFromFd(getContext().getContentResolver().openFileDescriptor(((Asset) (obj)).getUri(), "r"));
	//  208  494:aload_0         
	//  209  495:invokevirtual   #230 <Method Context getContext()>
	//  210  498:invokevirtual   #508 <Method ContentResolver Context.getContentResolver()>
	//  211  501:aload           8
	//  212  503:invokevirtual   #426 <Method Uri Asset.getUri()>
	//  213  506:ldc2            #510 <String "r">
	//  214  509:invokevirtual   #516 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(Uri, String)>
	//  215  512:invokestatic    #488 <Method Asset Asset.createFromFd(ParcelFileDescriptor)>
	//  216  515:astore          10
					putdatarequest1.putAsset((String)entry.getKey(), asset1);
	//  217  517:aload           6
	//  218  519:aload           9
	//  219  521:invokeinterface #484 <Method Object java.util.Map$Entry.getKey()>
	//  220  526:checkcast       #429 <Class String>
	//  221  529:aload           10
	//  222  531:invokevirtual   #492 <Method PutDataRequest PutDataRequest.putAsset(String, Asset)>
	//  223  534:pop             
				}
	//* 224  535:goto            626
	//* 225  538:new             #518 <Class zzcw$zzq>
	//* 226  541:dup             
	//* 227  542:aload_1         
	//* 228  543:aload           5
	//* 229  545:invokespecial   #521 <Method void zzcw$zzq(com.google.android.gms.internal.zzaad$zzb, List)>
	//* 230  548:new             #523 <Class zzci>
	//* 231  551:dup             
	//* 232  552:sipush          4005
	//* 233  555:aconst_null     
	//* 234  556:invokespecial   #526 <Method void zzci(int, zzao)>
	//* 235  559:invokevirtual   #529 <Method void zzcw$zzq.zza(zzci)>
	//* 236  562:aload           8
	//* 237  564:invokevirtual   #426 <Method Uri Asset.getUri()>
	//* 238  567:invokestatic    #432 <Method String String.valueOf(Object)>
	//* 239  570:astore_1        
	//* 240  571:ldc1            #184 <String "WearableClient">
	//* 241  573:new             #192 <Class StringBuilder>
	//* 242  576:dup             
	//* 243  577:aload_1         
	//* 244  578:invokestatic    #432 <Method String String.valueOf(Object)>
	//* 245  581:invokevirtual   #436 <Method int String.length()>
	//* 246  584:bipush          28
	//* 247  586:iadd            
	//* 248  587:invokespecial   #195 <Method void StringBuilder(int)>
	//* 249  590:ldc2            #531 <String "Couldn't resolve asset URI: ">
	//* 250  593:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//* 251  596:aload_1         
	//* 252  597:invokevirtual   #201 <Method StringBuilder StringBuilder.append(String)>
	//* 253  600:invokevirtual   #208 <Method String StringBuilder.toString()>
	//* 254  603:invokestatic    #261 <Method int Log.w(String, String)>
	//* 255  606:pop             
	//* 256  607:return          
	//* 257  608:aload           6
	//* 258  610:aload           9
	//* 259  612:invokeinterface #484 <Method Object java.util.Map$Entry.getKey()>
	//* 260  617:checkcast       #429 <Class String>
	//* 261  620:aload           8
	//* 262  622:invokevirtual   #492 <Method PutDataRequest PutDataRequest.putAsset(String, Asset)>
	//* 263  625:pop             
	//* 264  626:goto            210
	//* 265  629:aload_0         
	//* 266  630:invokevirtual   #282 <Method IInterface zzxD()>
	//* 267  633:checkcast       #284 <Class zzbw>
	//* 268  636:new             #518 <Class zzcw$zzq>
	//* 269  639:dup             
	//* 270  640:aload_1         
	//* 271  641:aload           5
	//* 272  643:invokespecial   #521 <Method void zzcw$zzq(com.google.android.gms.internal.zzaad$zzb, List)>
	//* 273  646:aload           6
	//* 274  648:invokeinterface #534 <Method void zzbw.zza(zzbu, PutDataRequest)>
	//* 275  653:return          
				// Misplaced declaration of an exception variable
				catch(PutDataRequest putdatarequest)
				{
					(new zzcw.zzq(zzb1, ((List) (arraylist)))).zza(new zzci(4005, ((zzao) (null))));
					zzb1 = ((com.google.android.gms.internal.zzaad.zzb) (String.valueOf(((Object) (((Asset) (obj)).getUri())))));
					Log.w("WearableClient", (new StringBuilder(String.valueOf(((Object) (zzb1))).length() + 28)).append("Couldn't resolve asset URI: ").append(((String) (zzb1))).toString());
					return;
				}
			else
				putdatarequest1.putAsset((String)entry.getKey(), ((Asset) (obj)));
		}

		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzq(zzb1, ((List) (arraylist))))), putdatarequest1);
	//* 276  654:astore_2        
	//* 277  655:goto            538
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, String s, Uri uri, long l, long l1)
	{
		try
		{
			zzbtI.execute(zzb(zzb1, s, uri, l, l1));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ExecutorService zzbtI>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:lload           4
	//    7   10:lload           6
	//    8   12:invokespecial   #540 <Method Runnable zzb(com.google.android.gms.internal.zzaad$zzb, String, Uri, long, long)>
	//    9   15:invokeinterface #544 <Method void ExecutorService.execute(Runnable)>
			return;
	//   10   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   21:astore_2        
		{
			zzb1.zzB(new Status(8));
	//   12   22:aload_1         
	//   13   23:new             #546 <Class Status>
	//   14   26:dup             
	//   15   27:bipush          8
	//   16   29:invokespecial   #547 <Method void Status(int)>
	//   17   32:invokeinterface #553 <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
		}
		throw s;
	//   18   37:aload_2         
	//   19   38:athrow          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, String s, Uri uri, boolean flag)
	{
		try
		{
			zzbtI.execute(zzb(zzb1, s, uri, flag));
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ExecutorService zzbtI>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:iload           4
	//    7   10:invokespecial   #557 <Method Runnable zzb(com.google.android.gms.internal.zzaad$zzb, String, Uri, boolean)>
	//    8   13:invokeinterface #544 <Method void ExecutorService.execute(Runnable)>
			return;
	//    9   18:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  10   19:astore_2        
		{
			zzb1.zzB(new Status(8));
	//   11   20:aload_1         
	//   12   21:new             #546 <Class Status>
	//   13   24:dup             
	//   14   25:bipush          8
	//   15   27:invokespecial   #547 <Method void Status(int)>
	//   16   30:invokeinterface #553 <Method void com.google.android.gms.internal.zzaad$zzb.zzB(Status)>
		}
		throw s;
	//   17   35:aload_2         
	//   18   36:athrow          
	}

	public void zza(com.google.android.gms.internal.zzaad.zzb zzb1, String s, String s1, byte abyte0[])
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzt(zzb1))), s, s1, abyte0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #561 <Class zzcw$zzt>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #562 <Method void zzcw$zzt(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:aload           4
	//   10   19:invokeinterface #565 <Method void zzbw.zza(zzbu, String, String, byte[])>
	//   11   24:return          
	}

	public void zzb(com.google.android.gms.internal.zzaad.zzb zzb1, Uri uri, int i)
		throws RemoteException
	{
		((zzbw)zzxD()).zzb(((zzbu) (new zzcw.zze(zzb1))), uri, i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #568 <Class zzcw$zze>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #569 <Method void zzcw$zze(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:invokeinterface #571 <Method void zzbw.zzb(zzbu, Uri, int)>
	//   10   22:return          
	}

	public void zzd(com.google.android.gms.internal.zzaad.zzb zzb1, int i)
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzf(zzb1))), i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #575 <Class zzcw$zzf>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #576 <Method void zzcw$zzf(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:iload_2         
	//    8   16:invokeinterface #579 <Method void zzbw.zza(zzbu, int)>
	//    9   21:return          
	}

	public void zze(com.google.android.gms.internal.zzaad.zzb zzb1, String s, String s1)
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzp(zzb1))), s, s1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #583 <Class zzcw$zzp>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #584 <Method void zzcw$zzp(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:invokeinterface #587 <Method void zzbw.zza(zzbu, String, String)>
	//   10   22:return          
	}

	public String zzeA()
	{
		return "com.google.android.gms.wearable.internal.IWearableService";
	//    0    0:ldc2            #591 <String "com.google.android.gms.wearable.internal.IWearableService">
	//    1    3:areturn         
	}

	public String zzez()
	{
		return "com.google.android.gms.wearable.BIND";
	//    0    0:ldc2            #594 <String "com.google.android.gms.wearable.BIND">
	//    1    3:areturn         
	}

	protected zzbw zzfF(IBinder ibinder)
	{
		return zzbw.zza.zzfD(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #601 <Method zzbw zzbw$zza.zzfD(IBinder)>
	//    2    4:areturn         
	}

	public IInterface zzh(IBinder ibinder)
	{
		return ((IInterface) (zzfF(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #605 <Method zzbw zzfF(IBinder)>
	//    3    5:areturn         
	}

	public void zzh(com.google.android.gms.internal.zzaad.zzb zzb1, String s, int i)
		throws RemoteException
	{
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzg(zzb1))), s, i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #608 <Class zzcw$zzg>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #609 <Method void zzcw$zzg(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:invokeinterface #612 <Method void zzbw.zza(zzbu, String, int)>
	//   10   22:return          
	}

	public void zzi(com.google.android.gms.internal.zzaad.zzb zzb1, String s, int i)
		throws RemoteException
	{
		((zzbw)zzxD()).zzb(((zzbu) (new zzcw.zzd(zzb1))), s, i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #616 <Class zzcw$zzd>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #617 <Method void zzcw$zzd(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:iload_3         
	//    9   17:invokeinterface #619 <Method void zzbw.zzb(zzbu, String, int)>
	//   10   22:return          
	}

	public void zzv(com.google.android.gms.internal.zzaad.zzb zzb1, String s)
		throws RemoteException
	{
		((zzbw)zzxD()).zzd(((zzbu) (new zzcw.zza(zzb1))), s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #624 <Class zzcw$zza>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #625 <Method void zzcw$zza(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:invokeinterface #628 <Method void zzbw.zzd(zzbu, String)>
	//    9   21:return          
	}

	public boolean zzvh()
	{
		return !zzbVb.zziq("com.google.android.wearable.app.cn");
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field zzcz zzbVb>
	//    2    4:ldc1            #135 <String "com.google.android.wearable.app.cn">
	//    3    6:invokevirtual   #633 <Method boolean zzcz.zziq(String)>
	//    4    9:ifne            14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public void zzw(com.google.android.gms.internal.zzaad.zzb zzb1)
		throws RemoteException
	{
		((zzbw)zzxD()).zzb(((zzbu) (new zzcw.zzl(zzb1))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #297 <Class zzcw$zzl>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #298 <Method void zzcw$zzl(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:invokeinterface #636 <Method void zzbw.zzb(zzbu)>
	//    8   20:return          
	}

	public void zzw(com.google.android.gms.internal.zzaad.zzb zzb1, String s)
		throws RemoteException
	{
		((zzbw)zzxD()).zze(((zzbu) (new zzcw.zzs(zzb1))), s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #639 <Class zzcw$zzs>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #640 <Method void zzcw$zzs(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:invokeinterface #642 <Method void com.google.android.gms.wearable.internal.zzbw.zze(zzbu, String)>
	//    9   21:return          
	}

	public void zzx(com.google.android.gms.internal.zzaad.zzb zzb1)
		throws RemoteException
	{
		((zzbw)zzxD()).zzc(((zzbu) (new zzcw.zzn(zzb1))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #646 <Class zzcw$zzn>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #647 <Method void zzcw$zzn(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:invokeinterface #649 <Method void zzbw.zzc(zzbu)>
	//    8   20:return          
	}

	public void zzx(com.google.android.gms.internal.zzaad.zzb zzb1, String s)
		throws RemoteException
	{
		((zzbw)zzxD()).zzf(((zzbu) (new zzcw.zzc(zzb1))), s);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #652 <Class zzcw$zzc>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #653 <Method void zzcw$zzc(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:aload_2         
	//    8   16:invokeinterface #656 <Method void zzbw.zzf(zzbu, String)>
	//    9   21:return          
	}

	public String zzxv()
	{
		if(zzbVb.zziq("com.google.android.wearable.app.cn"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field zzcz zzbVb>
	//*   2    4:ldc1            #135 <String "com.google.android.wearable.app.cn">
	//*   3    6:invokevirtual   #633 <Method boolean zzcz.zziq(String)>
	//*   4    9:ifeq            15
			return "com.google.android.wearable.app.cn";
	//    5   12:ldc1            #135 <String "com.google.android.wearable.app.cn">
	//    6   14:areturn         
		else
			return "com.google.android.gms";
	//    7   15:ldc2            #660 <String "com.google.android.gms">
	//    8   18:areturn         
	}

	public void zzy(com.google.android.gms.internal.zzaad.zzb zzb1)
		throws RemoteException
	{
		((zzbw)zzxD()).zzd(((zzbu) (new zzcw.zzj(zzb1))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #282 <Method IInterface zzxD()>
	//    2    4:checkcast       #284 <Class zzbw>
	//    3    7:new             #662 <Class zzcw$zzj>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:invokespecial   #663 <Method void zzcw$zzj(com.google.android.gms.internal.zzaad$zzb)>
	//    7   15:invokeinterface #665 <Method void zzbw.zzd(zzbu)>
	//    8   20:return          
	}

	public void zzy(com.google.android.gms.internal.zzaad.zzb zzb1, String s)
		throws RemoteException
	{
		com.google.android.gms.wearable.internal.zzac zzac1 = new com.google.android.gms.wearable.internal.zzac();
	//    0    0:new             #668 <Class com.google.android.gms.wearable.internal.zzac>
	//    1    3:dup             
	//    2    4:invokespecial   #669 <Method void com.google.android.gms.wearable.internal.zzac()>
	//    3    7:astore_3        
		((zzbw)zzxD()).zza(((zzbu) (new zzcw.zzh(zzb1, zzac1))), ((zzbt) (zzac1)), s);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #282 <Method IInterface zzxD()>
	//    6   12:checkcast       #284 <Class zzbw>
	//    7   15:new             #671 <Class zzcw$zzh>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_3         
	//   11   21:invokespecial   #674 <Method void zzcw$zzh(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.internal.zzac)>
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokeinterface #677 <Method void zzbw.zza(zzbu, zzbt, String)>
	//   15   31:return          
	}

	public void zzz(com.google.android.gms.internal.zzaad.zzb zzb1, String s)
		throws RemoteException
	{
		com.google.android.gms.wearable.internal.zzac zzac1 = new com.google.android.gms.wearable.internal.zzac();
	//    0    0:new             #668 <Class com.google.android.gms.wearable.internal.zzac>
	//    1    3:dup             
	//    2    4:invokespecial   #669 <Method void com.google.android.gms.wearable.internal.zzac()>
	//    3    7:astore_3        
		((zzbw)zzxD()).zzb(((zzbu) (new zzcw.zzi(zzb1, zzac1))), ((zzbt) (zzac1)), s);
	//    4    8:aload_0         
	//    5    9:invokevirtual   #282 <Method IInterface zzxD()>
	//    6   12:checkcast       #284 <Class zzbw>
	//    7   15:new             #681 <Class zzcw$zzi>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:aload_3         
	//   11   21:invokespecial   #682 <Method void zzcw$zzi(com.google.android.gms.internal.zzaad$zzb, com.google.android.gms.wearable.internal.zzac)>
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokeinterface #684 <Method void zzbw.zzb(zzbu, zzbt, String)>
	//   15   31:return          
	}

	private final zzbx zzbUT;
	private final zzbx zzbUU;
	private final zzbx zzbUV;
	private final zzbx zzbUW;
	private final zzbx zzbUX;
	private final zzbx zzbUY;
	private final zzbx zzbUZ;
	private final zzbx zzbVa;
	private final zzcz zzbVb;
	private final ExecutorService zzbtI;
}
