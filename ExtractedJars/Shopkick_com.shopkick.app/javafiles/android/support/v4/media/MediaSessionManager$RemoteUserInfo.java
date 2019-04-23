// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;


// Referenced classes of package android.support.v4.media:
//			MediaSessionManager

public static final class MediaSessionManager$RemoteUserInfo
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
		if(!(obj instanceof MediaSessionManager$RemoteUserInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaSessionManager$RemoteUserInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return ((Object) (mImpl)).equals(((Object) (((MediaSessionManager$RemoteUserInfo)obj).mImpl)));
	//   10   16:aload_0         
	//   11   17:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class MediaSessionManager$RemoteUserInfo>
	//   14   24:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//   15   27:invokevirtual   #51  <Method boolean Object.equals(Object)>
	//   16   30:ireturn         
	}

	public String getPackageName()
	{
		return mImpl.getPackageName();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//    2    4:invokeinterface #57  <Method String MediaSessionManager$RemoteUserInfoImpl.getPackageName()>
	//    3    9:areturn         
	}

	public int getPid()
	{
		return mImpl.getPid();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//    2    4:invokeinterface #61  <Method int MediaSessionManager$RemoteUserInfoImpl.getPid()>
	//    3    9:ireturn         
	}

	public int getUid()
	{
		return mImpl.getUid();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//    2    4:invokeinterface #64  <Method int MediaSessionManager$RemoteUserInfoImpl.getUid()>
	//    3    9:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (mImpl)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//    2    4:invokevirtual   #67  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
	mpl mImpl;

	public MediaSessionManager$RemoteUserInfo(android.media.session.MediaSessionManager$RemoteUserInfo mediasessionmanager$remoteuserinfo)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mImpl = ((mpl) (new UserInfoImplApi28(mediasessionmanager$remoteuserinfo)));
	//    2    4:aload_0         
	//    3    5:new             #26  <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #28  <Method void MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(android.media.session.MediaSessionManager$RemoteUserInfo)>
	//    7   13:putfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
	//    8   16:return          
	}

	public MediaSessionManager$RemoteUserInfo(String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   2    4:getstatic       #40  <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          28
	//*   4    9:icmplt          27
		{
			mImpl = ((mpl) (new UserInfoImplApi28(s, i, j)));
	//    5   12:aload_0         
	//    6   13:new             #26  <Class MediaSessionManagerImplApi28$RemoteUserInfoImplApi28>
	//    7   16:dup             
	//    8   17:aload_1         
	//    9   18:iload_2         
	//   10   19:iload_3         
	//   11   20:invokespecial   #42  <Method void MediaSessionManagerImplApi28$RemoteUserInfoImplApi28(String, int, int)>
	//   12   23:putfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
			return;
	//   13   26:return          
		} else
		{
			mImpl = ((mpl) (new serInfoImplBase(s, i, j)));
	//   14   27:aload_0         
	//   15   28:new             #44  <Class MediaSessionManagerImplBase$RemoteUserInfoImplBase>
	//   16   31:dup             
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:iload_3         
	//   20   35:invokespecial   #45  <Method void MediaSessionManagerImplBase$RemoteUserInfoImplBase(String, int, int)>
	//   21   38:putfield        #30  <Field MediaSessionManager$RemoteUserInfoImpl mImpl>
			return;
	//   22   41:return          
		}
	}
}
