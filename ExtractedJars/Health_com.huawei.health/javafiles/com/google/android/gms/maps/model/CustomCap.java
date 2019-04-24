// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.zzac;

// Referenced classes of package com.google.android.gms.maps.model:
//			Cap, BitmapDescriptor

public final class CustomCap extends Cap
{

	public CustomCap(BitmapDescriptor bitmapdescriptor)
	{
		this(bitmapdescriptor, 10F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #12  <Float 10F>
	//    3    4:invokespecial   #15  <Method void CustomCap(BitmapDescriptor, float)>
	//    4    7:return          
	}

	public CustomCap(BitmapDescriptor bitmapdescriptor, float f)
	{
		super((BitmapDescriptor)zzac.zzb(((Object) (bitmapdescriptor)), "bitmapDescriptor must not be null"), zza(f, "refWidth must be positive"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #19  <String "bitmapDescriptor must not be null">
	//    3    4:invokestatic    #25  <Method Object zzac.zzb(Object, Object)>
	//    4    7:checkcast       #27  <Class BitmapDescriptor>
	//    5   10:fload_2         
	//    6   11:ldc1            #29  <String "refWidth must be positive">
	//    7   13:invokestatic    #33  <Method float zza(float, String)>
	//    8   16:invokespecial   #34  <Method void Cap(BitmapDescriptor, float)>
		bitmapDescriptor = bitmapdescriptor;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #36  <Field BitmapDescriptor bitmapDescriptor>
		refWidth = f;
	//   12   24:aload_0         
	//   13   25:fload_2         
	//   14   26:putfield        #38  <Field float refWidth>
	//   15   29:return          
	}

	private static float zza(float f, String s)
	{
		if(f <= 0.0F)
	//*   0    0:fload_0         
	//*   1    1:fconst_0        
	//*   2    2:fcmpg           
	//*   3    3:ifgt            15
			throw new IllegalArgumentException(s);
	//    4    6:new             #40  <Class IllegalArgumentException>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokespecial   #43  <Method void IllegalArgumentException(String)>
	//    8   14:athrow          
		else
			return f;
	//    9   15:fload_0         
	//   10   16:freturn         
	}

	public String toString()
	{
		String s = String.valueOf(((Object) (bitmapDescriptor)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field BitmapDescriptor bitmapDescriptor>
	//    2    4:invokestatic    #51  <Method String String.valueOf(Object)>
	//    3    7:astore_2        
		float f = refWidth;
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field float refWidth>
	//    6   12:fstore_1        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 55)).append("[CustomCap: bitmapDescriptor=").append(s).append(" refWidth=").append(f).append("]").toString();
	//    7   13:new             #53  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #51  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #57  <Method int String.length()>
	//   12   24:bipush          55
	//   13   26:iadd            
	//   14   27:invokespecial   #60  <Method void StringBuilder(int)>
	//   15   30:ldc1            #62  <String "[CustomCap: bitmapDescriptor=">
	//   16   32:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_2         
	//   18   36:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:ldc1            #68  <String " refWidth=">
	//   20   41:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:fload_1         
	//   22   45:invokevirtual   #71  <Method StringBuilder StringBuilder.append(float)>
	//   23   48:ldc1            #73  <String "]">
	//   24   50:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   26   56:areturn         
	}

	public final BitmapDescriptor bitmapDescriptor;
	public final float refWidth;
}
