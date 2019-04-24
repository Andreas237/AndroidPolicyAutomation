// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;

// Referenced classes of package com.google.android.exoplayer2.metadata.scte35:
//			SpliceCommand

public final class SpliceNullCommand extends SpliceCommand
{

	public SpliceNullCommand()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void SpliceCommand()>
	//    2    4:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
	//    0    0:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public SpliceNullCommand createFromParcel(Parcel parcel)
		{
			return new SpliceNullCommand();
		//    0    0:new             #9   <Class SpliceNullCommand>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void SpliceNullCommand()>
		//    3    7:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method SpliceNullCommand createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public SpliceNullCommand[] newArray(int i)
		{
			return new SpliceNullCommand[i];
		//    0    0:iload_1         
		//    1    1:anewarray       SpliceNullCommand[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #25  <Method SpliceNullCommand[] newArray(int)>
		//    3    5:areturn         
		}

	}
;

	static 
	{
	//    0    0:new             #6   <Class SpliceNullCommand$1>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void SpliceNullCommand$1()>
	//    3    7:putstatic       #16  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
