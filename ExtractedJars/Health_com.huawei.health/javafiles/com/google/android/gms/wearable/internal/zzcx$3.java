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

class zzcx$3
	implements Runnable
{

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
	//*  68  149:invokevirtual   #133 <Method android.os.IInterface zzcx.zzxD()>
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
		((zzbw)zzbVe.zzxD()).zza(((zzbu) (new r(zzbVd))), zzaiD, ((ParcelFileDescriptor) (obj)), zzbTZ, zzbUa);
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
	final com.google.android.gms.internal.zb zzbVd;
	final zzcx zzbVe;

	zzcx$3(zzcx zzcx1, Uri uri, com.google.android.gms.internal.zb zb, String s, long l, long l1)
	{
		zzbVe = zzcx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field zzcx zzbVe>
		zzbBv = uri;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field Uri zzbBv>
		zzbVd = zb;
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
