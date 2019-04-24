// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.*;

// Referenced classes of package android.support.v14.preference:
//			MultiSelectListPreference

private static class MultiSelectListPreference$SavedState extends android.support.v7.preference.Preference.BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #57  <Method void android.support.v7.preference.Preference$BaseSavedState.writeToParcel(Parcel, int)>
		parcel.writeInt(values.size());
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field Set values>
	//    7   11:invokeinterface #62  <Method int Set.size()>
	//    8   16:invokevirtual   #66  <Method void Parcel.writeInt(int)>
		parcel.writeStringArray((String[])values.toArray(((Object []) (new String[values.size()]))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #37  <Field Set values>
	//   12   24:aload_0         
	//   13   25:getfield        #37  <Field Set values>
	//   14   28:invokeinterface #62  <Method int Set.size()>
	//   15   33:anewarray       String[]
	//   16   36:invokeinterface #70  <Method Object[] Set.toArray(Object[])>
	//   17   41:checkcast       #72  <Class String[]>
	//   18   44:invokevirtual   #75  <Method void Parcel.writeStringArray(String[])>
	//   19   47:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MultiSelectListPreference.SavedState createFromParcel(Parcel parcel)
		{
			return new MultiSelectListPreference.SavedState(parcel);
		//    0    0:new             #9   <Class MultiSelectListPreference$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void MultiSelectListPreference$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method MultiSelectListPreference$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MultiSelectListPreference.SavedState[] newArray(int i)
		{
			return new MultiSelectListPreference.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MultiSelectListPreference.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method MultiSelectListPreference$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	Set values;

	static 
	{
	//    0    0:new             #9   <Class MultiSelectListPreference$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void MultiSelectListPreference$SavedState$1()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public MultiSelectListPreference$SavedState(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void android.support.v7.preference.Preference$BaseSavedState(Parcel)>
		int i = parcel.readInt();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
	//    5    9:istore_2        
		values = ((Set) (new HashSet()));
	//    6   10:aload_0         
	//    7   11:new             #34  <Class HashSet>
	//    8   14:dup             
	//    9   15:invokespecial   #35  <Method void HashSet()>
	//   10   18:putfield        #37  <Field Set values>
		String as[] = new String[i];
	//   11   21:iload_2         
	//   12   22:anewarray       String[]
	//   13   25:astore_3        
		parcel.readStringArray(as);
	//   14   26:aload_1         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #43  <Method void Parcel.readStringArray(String[])>
		Collections.addAll(((java.util.Collection) (values)), ((Object []) (as)));
	//   17   31:aload_0         
	//   18   32:getfield        #37  <Field Set values>
	//   19   35:aload_3         
	//   20   36:invokestatic    #49  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//   21   39:pop             
	//   22   40:return          
	}

	public MultiSelectListPreference$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #52  <Method void android.support.v7.preference.Preference$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
