// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.support.v4.util.ObjectsCompat;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManagerImplApi21

class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21
{
	static final class RemoteUserInfoImplApi28
		implements MediaSessionManager.RemoteUserInfoImpl
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(!(obj instanceof RemoteUserInfoImplApi28))
		//*   5    7:aload_1         
		//*   6    8:instanceof      #2   <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
		//*   7   11:ifne            16
			{
				return false;
		//    8   14:iconst_0        
		//    9   15:ireturn         
			} else
			{
				obj = ((Object) ((RemoteUserInfoImplApi28)obj));
		//   10   16:aload_1         
		//   11   17:checkcast       #2   <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
		//   12   20:astore_1        
				return mObject.equals(((Object) (((RemoteUserInfoImplApi28) (obj)).mObject)));
		//   13   21:aload_0         
		//   14   22:getfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//   15   25:aload_1         
		//   16   26:getfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//   17   29:invokevirtual   #28  <Method boolean android.media.session.MediaSessionManager$RemoteUserInfo.equals(Object)>
		//   18   32:ireturn         
			}
		}

		public String getPackageName()
		{
			return mObject.getPackageName();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//    2    4:invokevirtual   #32  <Method String android.media.session.MediaSessionManager$RemoteUserInfo.getPackageName()>
		//    3    7:areturn         
		}

		public int getPid()
		{
			return mObject.getPid();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//    2    4:invokevirtual   #36  <Method int android.media.session.MediaSessionManager$RemoteUserInfo.getPid()>
		//    3    7:ireturn         
		}

		public int getUid()
		{
			return mObject.getUid();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//    2    4:invokevirtual   #39  <Method int android.media.session.MediaSessionManager$RemoteUserInfo.getUid()>
		//    3    7:ireturn         
		}

		public int hashCode()
		{
			return ObjectsCompat.hash(new Object[] {
				mObject
			});
		//    0    0:iconst_1        
		//    1    1:anewarray       Object[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:aload_0         
		//    5    7:getfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//    6   10:aastore         
		//    7   11:invokestatic    #46  <Method int ObjectsCompat.hash(Object[])>
		//    8   14:ireturn         
		}

		final android.media.session.MediaSessionManager.RemoteUserInfo mObject;

		RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteuserinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mObject = remoteuserinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//    5    9:return          
		}

		RemoteUserInfoImplApi28(String s, int i, int j)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mObject = new android.media.session.MediaSessionManager.RemoteUserInfo(s, i, j);
		//    2    4:aload_0         
		//    3    5:new             #22  <Class android.media.session.MediaSessionManager$RemoteUserInfo>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:iload_2         
		//    7   11:iload_3         
		//    8   12:invokespecial   #24  <Method void android.media.session.MediaSessionManager$RemoteUserInfo(String, int, int)>
		//    9   15:putfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
		//   10   18:return          
		}
	}


	MediaSessionManagerImplApi28(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void MediaSessionManagerImplApi21(Context)>
		mObject = (MediaSessionManager)context.getSystemService("media_session");
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc1            #18  <String "media_session">
	//    6    9:invokevirtual   #24  <Method Object Context.getSystemService(String)>
	//    7   12:checkcast       #26  <Class MediaSessionManager>
	//    8   15:putfield        #28  <Field MediaSessionManager mObject>
	//    9   18:return          
	}

	public boolean isTrustedForMediaControl(MediaSessionManager.RemoteUserInfoImpl remoteuserinfoimpl)
	{
		if(remoteuserinfoimpl instanceof RemoteUserInfoImplApi28)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #6   <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
	//*   2    4:ifeq            22
			return mObject.isTrustedForMediaControl(((RemoteUserInfoImplApi28)remoteuserinfoimpl).mObject);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field MediaSessionManager mObject>
	//    5   11:aload_1         
	//    6   12:checkcast       #6   <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
	//    7   15:getfield        #34  <Field android.media.session.MediaSessionManager$RemoteUserInfo MediaSessionManagerImplApi28$RemoteUserInfoImplApi28.mObject>
	//    8   18:invokevirtual   #37  <Method boolean MediaSessionManager.isTrustedForMediaControl(android.media.session.MediaSessionManager$RemoteUserInfo)>
	//    9   21:ireturn         
		else
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	MediaSessionManager mObject;
}
