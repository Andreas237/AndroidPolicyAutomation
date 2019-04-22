// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawalDetails

public class WithdrawalDetails$$Parcelable
	implements Parcelable, ParcelWrapper
{

	public static WithdrawalDetails read(Parcel parcel, IdentityCollection identitycollection)
	{
		int i = parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method int Parcel.readInt()>
	//    2    4:istore_2        
		if(identitycollection.containsKey(i))
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #42  <Method boolean IdentityCollection.containsKey(int)>
	//*   6   10:ifeq            40
		{
			if(!identitycollection.isReserved(i))
	//*   7   13:aload_1         
	//*   8   14:iload_2         
	//*   9   15:invokevirtual   #45  <Method boolean IdentityCollection.isReserved(int)>
	//*  10   18:ifne            30
				return (WithdrawalDetails)identitycollection.get(i);
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:invokevirtual   #49  <Method Object IdentityCollection.get(int)>
	//   14   26:checkcast       #51  <Class WithdrawalDetails>
	//   15   29:areturn         
			else
				throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
	//   16   30:new             #53  <Class ParcelerRuntimeException>
	//   17   33:dup             
	//   18   34:ldc1            #55  <String "An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.">
	//   19   36:invokespecial   #58  <Method void ParcelerRuntimeException(String)>
	//   20   39:athrow          
		} else
		{
			int j = identitycollection.reserve();
	//   21   40:aload_1         
	//   22   41:invokevirtual   #61  <Method int IdentityCollection.reserve()>
	//   23   44:istore_3        
			WithdrawalDetails withdrawaldetails = new WithdrawalDetails();
	//   24   45:new             #51  <Class WithdrawalDetails>
	//   25   48:dup             
	//   26   49:invokespecial   #62  <Method void WithdrawalDetails()>
	//   27   52:astore          4
			identitycollection.put(j, ((Object) (withdrawaldetails)));
	//   28   54:aload_1         
	//   29   55:iload_3         
	//   30   56:aload           4
	//   31   58:invokevirtual   #66  <Method void IdentityCollection.put(int, Object)>
			withdrawaldetails.amount = parcel.readFloat();
	//   32   61:aload           4
	//   33   63:aload_0         
	//   34   64:invokevirtual   #70  <Method float Parcel.readFloat()>
	//   35   67:putfield        #74  <Field float WithdrawalDetails.amount>
			withdrawaldetails.method = parcel.readString();
	//   36   70:aload           4
	//   37   72:aload_0         
	//   38   73:invokevirtual   #78  <Method String Parcel.readString()>
	//   39   76:putfield        #82  <Field String WithdrawalDetails.method>
			withdrawaldetails.methodImg = parcel.readString();
	//   40   79:aload           4
	//   41   81:aload_0         
	//   42   82:invokevirtual   #78  <Method String Parcel.readString()>
	//   43   85:putfield        #85  <Field String WithdrawalDetails.methodImg>
			identitycollection.put(i, ((Object) (withdrawaldetails)));
	//   44   88:aload_1         
	//   45   89:iload_2         
	//   46   90:aload           4
	//   47   92:invokevirtual   #66  <Method void IdentityCollection.put(int, Object)>
			return withdrawaldetails;
	//   48   95:aload           4
	//   49   97:areturn         
		}
	}

	public static void write(WithdrawalDetails withdrawaldetails, Parcel parcel, int i, IdentityCollection identitycollection)
	{
		i = identitycollection.getKey(((Object) (withdrawaldetails)));
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #91  <Method int IdentityCollection.getKey(Object)>
	//    3    5:istore_2        
		if(i != -1)
	//*   4    6:iload_2         
	//*   5    7:iconst_m1       
	//*   6    8:icmpeq          17
		{
			parcel.writeInt(i);
	//    7   11:aload_1         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			return;
	//   10   16:return          
		} else
		{
			parcel.writeInt(identitycollection.put(((Object) (withdrawaldetails))));
	//   11   17:aload_1         
	//   12   18:aload_3         
	//   13   19:aload_0         
	//   14   20:invokevirtual   #97  <Method int IdentityCollection.put(Object)>
	//   15   23:invokevirtual   #95  <Method void Parcel.writeInt(int)>
			parcel.writeFloat(withdrawaldetails.amount);
	//   16   26:aload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #74  <Field float WithdrawalDetails.amount>
	//   19   31:invokevirtual   #101 <Method void Parcel.writeFloat(float)>
			parcel.writeString(withdrawaldetails.method);
	//   20   34:aload_1         
	//   21   35:aload_0         
	//   22   36:getfield        #82  <Field String WithdrawalDetails.method>
	//   23   39:invokevirtual   #104 <Method void Parcel.writeString(String)>
			parcel.writeString(withdrawaldetails.methodImg);
	//   24   42:aload_1         
	//   25   43:aload_0         
	//   26   44:getfield        #85  <Field String WithdrawalDetails.methodImg>
	//   27   47:invokevirtual   #104 <Method void Parcel.writeString(String)>
			return;
	//   28   50:return          
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public WithdrawalDetails getParcel()
	{
		return withdrawalDetails$$0;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WithdrawalDetails withdrawalDetails$$0>
	//    2    4:areturn         
	}

	public volatile Object getParcel()
	{
		return ((Object) (getParcel()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method WithdrawalDetails getParcel()>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		write(withdrawalDetails$$0, parcel, i, new IdentityCollection());
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field WithdrawalDetails withdrawalDetails$$0>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:new             #38  <Class IdentityCollection>
	//    5    9:dup             
	//    6   10:invokespecial   #113 <Method void IdentityCollection()>
	//    7   13:invokestatic    #115 <Method void write(WithdrawalDetails, Parcel, int, IdentityCollection)>
	//    8   16:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public WithdrawalDetails..Parcelable createFromParcel(Parcel parcel)
		{
			return new WithdrawalDetails..Parcelable(WithdrawalDetails..Parcelable.read(parcel, new IdentityCollection()));
		//    0    0:new             #9   <Class WithdrawalDetails$$Parcelable>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:new             #18  <Class IdentityCollection>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void IdentityCollection()>
		//    6   12:invokestatic    #23  <Method WithdrawalDetails WithdrawalDetails$$Parcelable.read(Parcel, IdentityCollection)>
		//    7   15:invokespecial   #26  <Method void WithdrawalDetails$$Parcelable(WithdrawalDetails)>
		//    8   18:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method WithdrawalDetails$$Parcelable createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public WithdrawalDetails..Parcelable[] newArray(int i)
		{
			return new WithdrawalDetails..Parcelable[i];
		//    0    0:iload_1         
		//    1    1:anewarray       WithdrawalDetails..Parcelable[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #34  <Method WithdrawalDetails$$Parcelable[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private WithdrawalDetails withdrawalDetails$$0;

	static 
	{
	//    0    0:new             #11  <Class WithdrawalDetails$$Parcelable$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void WithdrawalDetails$$Parcelable$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	public WithdrawalDetails$$Parcelable(WithdrawalDetails withdrawaldetails)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		withdrawalDetails$$0 = withdrawaldetails;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field WithdrawalDetails withdrawalDetails$$0>
	//    5    9:return          
	}
}
