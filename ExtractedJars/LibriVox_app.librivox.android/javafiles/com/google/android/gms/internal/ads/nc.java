// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			nb, xo, ni

final class nc
	implements android.content.DialogInterface.OnClickListener
{

	nc(nb nb1, String s, String s1)
	{
		c = nb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field nb c>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #19  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #22  <Method void Object()>
	//   11   19:return          
	}

	public final void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) ((DownloadManager)nb.a(c).getSystemService("download")));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field nb c>
	//    2    4:invokestatic    #32  <Method Context nb.a(nb)>
	//    3    7:ldc1            #34  <String "download">
	//    4    9:invokevirtual   #40  <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #42  <Class DownloadManager>
	//    6   15:astore_1        
		try
		{
			Object obj = ((Object) (a));
	//    7   16:aload_0         
	//    8   17:getfield        #17  <Field String a>
	//    9   20:astore          4
			String s = b;
	//   10   22:aload_0         
	//   11   23:getfield        #19  <Field String b>
	//   12   26:astore_3        
			obj = ((Object) (new android.app.DownloadManager.Request(Uri.parse(((String) (obj))))));
	//   13   27:new             #44  <Class android.app.DownloadManager$Request>
	//   14   30:dup             
	//   15   31:aload           4
	//   16   33:invokestatic    #50  <Method Uri Uri.parse(String)>
	//   17   36:invokespecial   #53  <Method void android.app.DownloadManager$Request(Uri)>
	//   18   39:astore          4
			((android.app.DownloadManager.Request) (obj)).setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, s);
	//   19   41:aload           4
	//   20   43:getstatic       #58  <Field String Environment.DIRECTORY_PICTURES>
	//   21   46:aload_3         
	//   22   47:invokevirtual   #62  <Method android.app.DownloadManager$Request android.app.DownloadManager$Request.setDestinationInExternalPublicDir(String, String)>
	//   23   50:pop             
			aw.g().a(((android.app.DownloadManager.Request) (obj)));
	//   24   51:invokestatic    #68  <Method xo aw.g()>
	//   25   54:aload           4
	//   26   56:invokevirtual   #73  <Method boolean xo.a(android.app.DownloadManager$Request)>
	//   27   59:pop             
			((DownloadManager) (dialoginterface)).enqueue(((android.app.DownloadManager.Request) (obj)));
	//   28   60:aload_1         
	//   29   61:aload           4
	//   30   63:invokevirtual   #77  <Method long DownloadManager.enqueue(android.app.DownloadManager$Request)>
	//   31   66:pop2            
			return;
	//   32   67:return          
		}
	//*  33   68:aload_0         
	//*  34   69:getfield        #15  <Field nb c>
	//*  35   72:ldc1            #79  <String "Could not store picture.">
	//*  36   74:invokevirtual   #84  <Method void ni.a(String)>
	//*  37   77:return          
		// Misplaced declaration of an exception variable
		catch(DialogInterface dialoginterface)
		{
			((ni) (c)).a("Could not store picture.");
		}
	//*  38   78:astore_1        
	//*  39   79:goto            68
	}

	private final String a;
	private final String b;
	private final nb c;
}
