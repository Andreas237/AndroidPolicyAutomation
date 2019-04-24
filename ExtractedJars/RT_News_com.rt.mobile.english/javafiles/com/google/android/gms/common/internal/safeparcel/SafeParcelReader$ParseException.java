// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//			SafeParcelReader

public static class SafeParcelReader$ParseException extends RuntimeException
{

	public SafeParcelReader$ParseException(String s, Parcel parcel)
	{
		int i = parcel.dataPosition();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #15  <Method int Parcel.dataPosition()>
	//    2    4:istore_3        
		int j = parcel.dataSize();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #18  <Method int Parcel.dataSize()>
	//    5    9:istore          4
		parcel = ((Parcel) (new StringBuilder(41 + String.valueOf(((Object) (s))).length())));
	//    6   11:new             #20  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:bipush          41
	//    9   17:aload_1         
	//   10   18:invokestatic    #26  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #29  <Method int String.length()>
	//   12   24:iadd            
	//   13   25:invokespecial   #32  <Method void StringBuilder(int)>
	//   14   28:astore_2        
		((StringBuilder) (parcel)).append(s);
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		((StringBuilder) (parcel)).append(" Parcel: pos=");
	//   19   35:aload_2         
	//   20   36:ldc1            #38  <String " Parcel: pos=">
	//   21   38:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		((StringBuilder) (parcel)).append(i);
	//   23   42:aload_2         
	//   24   43:iload_3         
	//   25   44:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   26   47:pop             
		((StringBuilder) (parcel)).append(" size=");
	//   27   48:aload_2         
	//   28   49:ldc1            #43  <String " size=">
	//   29   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
		((StringBuilder) (parcel)).append(j);
	//   31   55:aload_2         
	//   32   56:iload           4
	//   33   58:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   34   61:pop             
		super(((StringBuilder) (parcel)).toString());
	//   35   62:aload_0         
	//   36   63:aload_2         
	//   37   64:invokevirtual   #47  <Method String StringBuilder.toString()>
	//   38   67:invokespecial   #50  <Method void RuntimeException(String)>
	//   39   70:return          
	}
}
