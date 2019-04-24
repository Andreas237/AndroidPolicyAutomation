// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//			zzbxm

public static class zzbxm$zza extends IOException
{

	zzbxm$zza(int i, int j)
	{
		super((new StringBuilder(108)).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(j).append(").").toString());
	//    0    0:aload_0         
	//    1    1:new             #11  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:bipush          108
	//    4    7:invokespecial   #14  <Method void StringBuilder(int)>
	//    5   10:ldc1            #16  <String "CodedOutputStream was writing to a flat byte array and ran out of space (pos ">
	//    6   12:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//    9   19:ldc1            #25  <String " limit ">
	//   10   21:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:iload_2         
	//   12   25:invokevirtual   #23  <Method StringBuilder StringBuilder.append(int)>
	//   13   28:ldc1            #27  <String ").">
	//   14   30:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #31  <Method String StringBuilder.toString()>
	//   16   36:invokespecial   #34  <Method void IOException(String)>
	//   17   39:return          
	}
}
