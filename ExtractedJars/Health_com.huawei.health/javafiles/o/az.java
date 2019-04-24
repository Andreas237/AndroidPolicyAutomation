// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.IBinder;

// Referenced classes of package o:
//			bb

class az
	implements bb
{

	az(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		b = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field IBinder b>
	//    5    9:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof az) && ((Object) (((az)obj).b)).equals(((Object) (b)));
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class az>
	//    2    4:ifeq            26
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class az>
	//    5   11:getfield        #18  <Field IBinder b>
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field IBinder b>
	//    8   18:invokevirtual   #23  <Method boolean Object.equals(Object)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	private final IBinder b;
}
