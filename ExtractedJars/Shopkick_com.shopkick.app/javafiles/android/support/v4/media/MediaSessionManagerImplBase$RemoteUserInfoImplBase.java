// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.support.v4.util.ObjectsCompat;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//			MediaSessionManagerImplBase

static class MediaSessionManagerImplBase$RemoteUserInfoImplBase
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
		if(!(obj instanceof MediaSessionManagerImplBase$RemoteUserInfoImplBase))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class MediaSessionManagerImplBase$RemoteUserInfoImplBase>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((MediaSessionManagerImplBase$RemoteUserInfoImplBase)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class MediaSessionManagerImplBase$RemoteUserInfoImplBase>
	//   12   20:astore_1        
		return TextUtils.equals(((CharSequence) (mPackageName)), ((CharSequence) (((MediaSessionManagerImplBase$RemoteUserInfoImplBase) (obj)).mPackageName))) && mPid == ((MediaSessionManagerImplBase$RemoteUserInfoImplBase) (obj)).mPid && mUid == ((MediaSessionManagerImplBase$RemoteUserInfoImplBase) (obj)).mUid;
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field String mPackageName>
	//   15   25:aload_1         
	//   16   26:getfield        #21  <Field String mPackageName>
	//   17   29:invokestatic    #33  <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   18   32:ifeq            59
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field int mPid>
	//   21   39:aload_1         
	//   22   40:getfield        #23  <Field int mPid>
	//   23   43:icmpne          59
	//   24   46:aload_0         
	//   25   47:getfield        #25  <Field int mUid>
	//   26   50:aload_1         
	//   27   51:getfield        #25  <Field int mUid>
	//   28   54:icmpne          59
	//   29   57:iconst_1        
	//   30   58:ireturn         
	//   31   59:iconst_0        
	//   32   60:ireturn         
	}

	public String getPackageName()
	{
		return mPackageName;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String mPackageName>
	//    2    4:areturn         
	}

	public int getPid()
	{
		return mPid;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int mPid>
	//    2    4:ireturn         
	}

	public int getUid()
	{
		return mUid;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mUid>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return ObjectsCompat.hash(new Object[] {
			mPackageName, Integer.valueOf(mPid), Integer.valueOf(mUid)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field String mPackageName>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #23  <Field int mPid>
	//   11   17:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_2        
	//   15   23:aload_0         
	//   16   24:getfield        #25  <Field int mUid>
	//   17   27:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   18   30:aastore         
	//   19   31:invokestatic    #51  <Method int ObjectsCompat.hash(Object[])>
	//   20   34:ireturn         
	}

	private String mPackageName;
	private int mPid;
	private int mUid;

	MediaSessionManagerImplBase$RemoteUserInfoImplBase(String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mPackageName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String mPackageName>
		mPid = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int mPid>
		mUid = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int mUid>
	//   11   19:return          
	}
}
