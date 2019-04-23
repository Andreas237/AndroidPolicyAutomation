// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk:
//			db, cy

public final class dw extends db
	implements Parcelable
{

	public dw(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void db(Parcel)>
		d = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method String Parcel.readString()>
	//    6   10:putfield        #38  <Field String d>
		boolean flag;
		if(parcel.readByte() != 0)
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #42  <Method byte Parcel.readByte()>
	//*   9   17:ifeq            25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_2        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_2        
		c = flag;
	//   15   27:aload_0         
	//   16   28:iload_2         
	//   17   29:putfield        #44  <Field boolean c>
	//   18   32:return          
	}

	public dw(String s, String s1, long l, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void db()>
		super.a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field String db.a>
		super.b = l;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #53  <Field long db.b>
		d = s1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #38  <Field String d>
		c = flag;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #44  <Field boolean c>
	//   14   25:return          
	}

	public final boolean a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean c>
	//    2    4:ireturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #59  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Class) (com/paypal/android/sdk/dw)).getSimpleName());
	//    4    8:aload_1         
	//    5    9:ldc1            #2   <Class dw>
	//    6   11:invokevirtual   #20  <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append("(token:");
	//    9   18:aload_1         
	//   10   19:ldc1            #66  <String "(token:">
	//   11   21:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(a);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #67  <Field String a>
	//   16   30:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(", mGoodUntil:");
	//   18   34:aload_1         
	//   19   35:ldc1            #69  <String ", mGoodUntil:">
	//   20   37:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(b);
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:getfield        #70  <Field long b>
	//   25   46:invokevirtual   #73  <Method StringBuilder StringBuilder.append(long)>
	//   26   49:pop             
		stringbuilder.append(", isCreatedInternally:");
	//   27   50:aload_1         
	//   28   51:ldc1            #75  <String ", isCreatedInternally:">
	//   29   53:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
		stringbuilder.append(c);
	//   31   57:aload_1         
	//   32   58:aload_0         
	//   33   59:getfield        #44  <Field boolean c>
	//   34   62:invokevirtual   #78  <Method StringBuilder StringBuilder.append(boolean)>
	//   35   65:pop             
		stringbuilder.append(")");
	//   36   66:aload_1         
	//   37   67:ldc1            #80  <String ")">
	//   38   69:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   39   72:pop             
		return stringbuilder.toString();
	//   40   73:aload_1         
	//   41   74:invokevirtual   #82  <Method String StringBuilder.toString()>
	//   42   77:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #67  <Field String a>
	//    3    5:invokevirtual   #88  <Method void Parcel.writeString(String)>
		parcel.writeLong(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field long b>
	//    7   13:invokevirtual   #92  <Method void Parcel.writeLong(long)>
		parcel.writeString(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #38  <Field String d>
	//   11   21:invokevirtual   #88  <Method void Parcel.writeString(String)>
		parcel.writeByte((byte)c);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #44  <Field boolean c>
	//   15   29:int2byte        
	//   16   30:invokevirtual   #96  <Method void Parcel.writeByte(byte)>
	//   17   33:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new cy();
	private boolean c;
	private String d;

	static 
	{
		((Class) (com/paypal/android/sdk/dw)).getSimpleName();
	//    0    0:ldc1            #2   <Class dw>
	//    1    2:invokevirtual   #20  <Method String Class.getSimpleName()>
	//    2    5:pop             
	//    3    6:new             #22  <Class cy>
	//    4    9:dup             
	//    5   10:invokespecial   #25  <Method void cy()>
	//    6   13:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   7   16:return          
	}
}
