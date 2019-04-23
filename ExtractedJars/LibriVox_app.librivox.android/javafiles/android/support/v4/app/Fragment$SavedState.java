// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.*;

// Referenced classes of package android.support.v4.app:
//			w

public class Fragment$SavedState
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field Bundle a>
	//    3    5:invokevirtual   #44  <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new w();
	final Bundle a;

	static 
	{
	//    0    0:new             #14  <Class w>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void w()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	Fragment$SavedState(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		a = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #28  <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #30  <Field Bundle a>
		if(classloader != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          30
		{
			parcel = ((Parcel) (a));
	//    8   16:aload_0         
	//    9   17:getfield        #30  <Field Bundle a>
	//   10   20:astore_1        
			if(parcel != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          30
				((Bundle) (parcel)).setClassLoader(classloader);
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #36  <Method void Bundle.setClassLoader(ClassLoader)>
		}
	//   16   30:return          
	}
}
