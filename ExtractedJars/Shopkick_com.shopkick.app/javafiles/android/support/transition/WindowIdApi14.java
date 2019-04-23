// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.os.IBinder;

// Referenced classes of package android.support.transition:
//			WindowIdImpl

class WindowIdApi14
	implements WindowIdImpl
{

	WindowIdApi14(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mToken = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field IBinder mToken>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof WindowIdApi14) && ((Object) (((WindowIdApi14)obj).mToken)).equals(((Object) (mToken)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class WindowIdApi14>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class WindowIdApi14>
	//    5   11:getfield        #15  <Field IBinder mToken>
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field IBinder mToken>
	//    8   18:invokevirtual   #20  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public int hashCode()
	{
		return ((Object) (mToken)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field IBinder mToken>
	//    2    4:invokevirtual   #24  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	private final IBinder mToken;
}
