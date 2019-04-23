// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManagerImplBase

class MediaSessionManagerImplApi21 extends MediaSessionManagerImplBase
{

	MediaSessionManagerImplApi21(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void MediaSessionManagerImplBase(Context)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field Context mContext>
	//    6   10:return          
	}

	private boolean hasMediaControlPermission(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl)
	{
		return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", remoteuserinfoimpl.getPid(), remoteuserinfoimpl.getUid()) == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #23  <Method Context getContext()>
	//    2    4:ldc1            #25  <String "android.permission.MEDIA_CONTENT_CONTROL">
	//    3    6:aload_1         
	//    4    7:invokeinterface #31  <Method int MediaSessionManager$RemoteUserInfoImpl.getPid()>
	//    5   12:aload_1         
	//    6   13:invokeinterface #34  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
	//    7   18:invokevirtual   #40  <Method int Context.checkPermission(String, int, int)>
	//    8   21:ifne            26
	//    9   24:iconst_1        
	//   10   25:ireturn         
	//   11   26:iconst_0        
	//   12   27:ireturn         
	}

	public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl)
	{
		return hasMediaControlPermission(remoteuserinfoimpl) || super.isTrustedForMediaControl(remoteuserinfoimpl);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #44  <Method boolean hasMediaControlPermission(MediaSessionManager$RemoteUserInfoImpl)>
	//    3    5:ifne            21
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #46  <Method boolean MediaSessionManagerImplBase.isTrustedForMediaControl(MediaSessionManager$RemoteUserInfoImpl)>
	//    7   13:ifeq            19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
	}
}
