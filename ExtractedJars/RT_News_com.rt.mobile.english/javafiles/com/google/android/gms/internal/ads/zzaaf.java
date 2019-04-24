// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaae, zzakq, zzaal

final class zzaaf
	implements android.content.DialogInterface.OnClickListener
{

	zzaaf(zzaae zzaae1, String s, String s1)
	{
		zzbwq = zzaae1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzaae zzbwq>
		zzbwo = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field String zzbwo>
		zzbwp = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field String zzbwp>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method void Object()>
	//   11   19:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) ((DownloadManager)zzaae.zza(zzbwq).getSystemService("download")));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaae zzbwq>
	//    2    4:invokestatic    #33  <Method Context zzaae.zza(zzaae)>
	//    3    7:ldc1            #35  <String "download">
	//    4    9:invokevirtual   #41  <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #43  <Class DownloadManager>
	//    6   15:astore_1        
		try
		{
			Object obj = ((Object) (zzbwo));
	//    7   16:aload_0         
	//    8   17:getfield        #17  <Field String zzbwo>
	//    9   20:astore          4
			String s = zzbwp;
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field String zzbwp>
	//   12   26:astore_3        
			obj = ((Object) (new android.app.DownloadManager.Request(Uri.parse(((String) (obj))))));
	//   13   27:new             #45  <Class android.app.DownloadManager$Request>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokestatic    #51  <Method Uri Uri.parse(String)>
	//   17   36:invokespecial   #54  <Method void android.app.DownloadManager$Request(Uri)>
	//   18   39:astore          4
			((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
	//   19   41:aload           4
	//   20   43:getstatic       #59  <Field String Environment.DIRECTORY_PICTURES>
	//   21   46:aload_3         
	//   22   47:invokevirtual   #63  <Method android.app.DownloadManager$Request android.app.DownloadManager$Request.setDestinationInExternalPublicDir(String, String)>
	//   23   50:pop             
			zzbv.zzem().zza(((android.app.DownloadManager.Request) (obj)));
	//   24   51:invokestatic    #69  <Method zzakq zzbv.zzem()>
	//   25   54:aload           4
	//   26   56:invokevirtual   #74  <Method boolean zzakq.zza(android.app.DownloadManager$Request)>
	//   27   59:pop             
			((DownloadManager) (dialoginterface)).enqueue(((android.app.DownloadManager.Request) (obj)));
	//   28   60:aload_1         
	//   29   61:aload           4
	//   30   63:invokevirtual   #78  <Method long DownloadManager.enqueue(android.app.DownloadManager$Request)>
	//   31   66:pop2            
			return;
	//   32   67:return          
		}
	//*  33   68:aload_0         
	//*  34   69:getfield        #15  <Field zzaae zzbwq>
	//*  35   72:ldc1            #80  <String "Could not store picture.">
	//*  36   74:invokevirtual   #86  <Method void zzaal.zzbw(String)>
	//*  37   77:return          
		// Misplaced declaration of an exception variable
		catch(DialogInterface dialoginterface)
		{
			((zzaal) (zzbwq)).zzbw("Could not store picture.");
		}
	//*  38   78:astore_1        
	//*  39   79:goto            68
	}

	private final String zzbwo;
	private final String zzbwp;
	private final zzaae zzbwq;
}
