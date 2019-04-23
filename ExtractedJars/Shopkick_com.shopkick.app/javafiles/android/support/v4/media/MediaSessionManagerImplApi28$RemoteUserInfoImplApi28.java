// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.support.v4.util.ObjectsCompat;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManagerImplApi28

static final class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28
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
		if(!(obj instanceof MediaSessionManagerImplApi28$RemoteUserInfoImplApi28))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
	//*   7   11:ifne            16
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		} else
		{
			obj = ((Object) ((MediaSessionManagerImplApi28$RemoteUserInfoImplApi28)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
	//   12   20:astore_1        
			return mObject.equals(((Object) (((MediaSessionManagerImplApi28$RemoteUserInfoImplApi28) (obj)).mObject)));
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

	MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(android.media.session.MediaSessionManager.RemoteUserInfo remoteuserinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mObject = remoteuserinfo;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field android.media.session.MediaSessionManager$RemoteUserInfo mObject>
	//    5    9:return          
	}

	MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(String s, int i, int j)
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
