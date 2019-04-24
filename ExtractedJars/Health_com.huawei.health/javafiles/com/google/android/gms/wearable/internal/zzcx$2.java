// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcx, zzbw

class zzcx$2
	implements Runnable
{

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
	//*  78  166:invokevirtual   #131 <Method android.os.IInterface zzcx.zzxD()>
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
		((zzbw)zzbVe.zzxD()).zza(((zzbu) (new u(zzbVd))), zzaiD, ((ParcelFileDescriptor) (obj)));
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
	final com.google.android.gms.internal.zb zzbVd;
	final zzcx zzbVe;

	zzcx$2(zzcx zzcx1, Uri uri, com.google.android.gms.internal.zb zb, boolean flag, String s)
	{
		zzbVe = zzcx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field zzcx zzbVe>
		zzbBv = uri;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field Uri zzbBv>
		zzbVd = zb;
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
