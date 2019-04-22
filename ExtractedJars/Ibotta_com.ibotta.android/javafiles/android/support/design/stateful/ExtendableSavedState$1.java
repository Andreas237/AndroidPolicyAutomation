// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.stateful;

import android.os.Parcel;

// Referenced classes of package android.support.design.stateful:
//			ExtendableSavedState

static final class ExtendableSavedState$1
	implements android.os.reator
{

	public ExtendableSavedState createFromParcel(Parcel parcel)
	{
		return new ExtendableSavedState(parcel, ((ClassLoader) (null)), ((ExtendableSavedState$1) (null)));
	//    0    0:new             #9   <Class ExtendableSavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #19  <Method void ExtendableSavedState(Parcel, ClassLoader, ExtendableSavedState$1)>
	//    6   10:areturn         
	}

	public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return new ExtendableSavedState(parcel, classloader, ((ExtendableSavedState$1) (null)));
	//    0    0:new             #9   <Class ExtendableSavedState>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:invokespecial   #19  <Method void ExtendableSavedState(Parcel, ClassLoader, ExtendableSavedState$1)>
	//    6   10:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #23  <Method ExtendableSavedState createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
	{
		return ((Object) (createFromParcel(parcel, classloader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method ExtendableSavedState createFromParcel(Parcel, ClassLoader)>
	//    4    6:areturn         
	}

	public ExtendableSavedState[] newArray(int i)
	{
		return new ExtendableSavedState[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ExtendableSavedState[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #31  <Method ExtendableSavedState[] newArray(int)>
	//    3    5:areturn         
	}

	ExtendableSavedState$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
