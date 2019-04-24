// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState
	implements Parcelable
{

	private AbsSavedState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #31  <Field Parcelable a>
	//    5    9:return          
	}

	protected AbsSavedState(Parcel parcel, ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		parcel = ((Parcel) (parcel.readParcelable(classloader)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    5    9:astore_1        
		if(parcel == null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          17
	//*   8   14:goto            21
			parcel = ((Parcel) (d));
	//    9   17:getstatic       #24  <Field AbsSavedState d>
	//   10   20:astore_1        
		a = ((Parcelable) (parcel));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #31  <Field Parcelable a>
	//   14   26:return          
	}

	protected AbsSavedState(Parcelable parcelable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		if(parcelable == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("superState must not be null");
	//    4    8:new             #41  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #43  <String "superState must not be null">
	//    7   14:invokespecial   #46  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(parcelable == d)
	//*   9   18:aload_1         
	//*  10   19:getstatic       #24  <Field AbsSavedState d>
	//*  11   22:if_acmpeq       28
	//*  12   25:goto            30
			parcelable = null;
	//   13   28:aconst_null     
	//   14   29:astore_1        
		a = parcelable;
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:putfield        #31  <Field Parcelable a>
	//   18   35:return          
	}


	public final Parcelable a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Parcelable a>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeParcelable(a, i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Parcelable a>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #57  <Method void Parcel.writeParcelable(Parcelable, int)>
	//    5    9:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

		public AbsSavedState a(Parcel parcel)
		{
			return a(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokevirtual   #19  <Method AbsSavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public AbsSavedState a(Parcel parcel, ClassLoader classloader)
		{
			if(parcel.readParcelable(classloader) != null)
		//*   0    0:aload_1         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #25  <Method Parcelable Parcel.readParcelable(ClassLoader)>
		//*   3    5:ifnull          18
				throw new IllegalStateException("superState must be null");
		//    4    8:new             #27  <Class IllegalStateException>
		//    5   11:dup             
		//    6   12:ldc1            #29  <String "superState must be null">
		//    7   14:invokespecial   #32  <Method void IllegalStateException(String)>
		//    8   17:athrow          
			else
				return AbsSavedState.d;
		//    9   18:getstatic       #36  <Field AbsSavedState AbsSavedState.d>
		//   10   21:areturn         
		}

		public AbsSavedState[] a(int i)
		{
			return new AbsSavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       AbsSavedState[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #41  <Method AbsSavedState a(Parcel)>
		//    3    5:areturn         
		}

		public Object createFromParcel(Parcel parcel, ClassLoader classloader)
		{
			return ((Object) (a(parcel, classloader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #19  <Method AbsSavedState a(Parcel, ClassLoader)>
		//    4    6:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #46  <Method AbsSavedState[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public static final AbsSavedState d = new AbsSavedState() {

	}
;
	private final Parcelable a;

	static 
	{
	//    0    0:new             #8   <Class AbsSavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void AbsSavedState$1()>
	//    3    7:putstatic       #24  <Field AbsSavedState d>
	//    4   10:new             #10  <Class AbsSavedState$2>
	//    5   13:dup             
	//    6   14:invokespecial   #25  <Method void AbsSavedState$2()>
	//    7   17:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   8   20:return          
	}
}
