// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.preference:
//			TwoStatePreference

static class TwoStatePreference$SavedState extends Preference.BaseSavedState
{

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #40  <Method void Preference$BaseSavedState.writeToParcel(Parcel, int)>
		if(checked)
	//*   4    6:aload_0         
	//*   5    7:getfield        #33  <Field boolean checked>
	//*   6   10:ifeq            21
			i = 1;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:aload_1         
	//*  10   16:iload_2         
	//*  11   17:invokevirtual   #44  <Method void Parcel.writeInt(int)>
	//*  12   20:return          
			i = 0;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		parcel.writeInt(i);
	//*  15   23:goto            15
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TwoStatePreference.SavedState createFromParcel(Parcel parcel)
		{
			return new TwoStatePreference.SavedState(parcel);
		//    0    0:new             #9   <Class TwoStatePreference$SavedState>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #22  <Method void TwoStatePreference$SavedState(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method TwoStatePreference$SavedState createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public TwoStatePreference.SavedState[] newArray(int i)
		{
			return new TwoStatePreference.SavedState[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TwoStatePreference.SavedState[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method TwoStatePreference$SavedState[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	boolean checked;

	static 
	{
	//    0    0:new             #9   <Class TwoStatePreference$SavedState$1>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void TwoStatePreference$SavedState$1()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public TwoStatePreference$SavedState(Parcel parcel)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		super(parcel);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #25  <Method void Preference$BaseSavedState(Parcel)>
		if(parcel.readInt() != 1)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #31  <Method int Parcel.readInt()>
	//*   7   11:iconst_1        
	//*   8   12:icmpne          21
	//*   9   15:aload_0         
	//*  10   16:iload_2         
	//*  11   17:putfield        #33  <Field boolean checked>
	//*  12   20:return          
			flag = false;
	//   13   21:iconst_0        
	//   14   22:istore_2        
		checked = flag;
	//*  15   23:goto            15
	}

	public TwoStatePreference$SavedState(Parcelable parcelable)
	{
		super(parcelable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void Preference$BaseSavedState(Parcelable)>
	//    3    5:return          
	}
}
