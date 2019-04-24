// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcx

class zzcx$1
	implements Callable
{

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
		android.os.ileDescriptor.AutoCloseOutputStream autocloseoutputstream;
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
		autocloseoutputstream = new android.os.ileDescriptor.AutoCloseOutputStream(zzbVc);
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

	zzcx$1(zzcx zzcx1, ParcelFileDescriptor parcelfiledescriptor, byte abyte0[])
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
