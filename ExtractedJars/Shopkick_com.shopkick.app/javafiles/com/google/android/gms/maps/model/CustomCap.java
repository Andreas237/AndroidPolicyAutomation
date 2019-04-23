// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.Preconditions;

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
		BitmapDescriptor bitmapdescriptor1 = (BitmapDescriptor)Preconditions.checkNotNull(((Object) (bitmapdescriptor)), "bitmapDescriptor must not be null");
	//    0    0:aload_1         
	//    1    1:ldc1            #19  <String "bitmapDescriptor must not be null">
	//    2    3:invokestatic    #25  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:checkcast       #27  <Class BitmapDescriptor>
	//    4    9:astore_3        
		if(f > 0.0F)
	//*   5   10:fload_2         
	//*   6   11:fconst_0        
	//*   7   12:fcmpg           
	//*   8   13:ifle            33
		{
			super(bitmapdescriptor1, f);
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:fload_2         
	//   12   19:invokespecial   #28  <Method void Cap(BitmapDescriptor, float)>
			bitmapDescriptor = bitmapdescriptor;
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:putfield        #30  <Field BitmapDescriptor bitmapDescriptor>
			refWidth = f;
	//   16   27:aload_0         
	//   17   28:fload_2         
	//   18   29:putfield        #32  <Field float refWidth>
			return;
	//   19   32:return          
		} else
		{
			throw new IllegalArgumentException("refWidth must be positive");
	//   20   33:new             #34  <Class IllegalArgumentException>
	//   21   36:dup             
	//   22   37:ldc1            #36  <String "refWidth must be positive">
	//   23   39:invokespecial   #39  <Method void IllegalArgumentException(String)>
	//   24   42:athrow          
		}
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (bitmapDescriptor)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field BitmapDescriptor bitmapDescriptor>
	//    2    4:invokestatic    #47  <Method String String.valueOf(Object)>
	//    3    7:astore_2        
		float f = refWidth;
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field float refWidth>
	//    6   12:fstore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 55);
	//    7   13:new             #49  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:aload_2         
	//   10   18:invokestatic    #47  <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #53  <Method int String.length()>
	//   12   24:bipush          55
	//   13   26:iadd            
	//   14   27:invokespecial   #56  <Method void StringBuilder(int)>
	//   15   30:astore_3        
		stringbuilder.append("[CustomCap: bitmapDescriptor=");
	//   16   31:aload_3         
	//   17   32:ldc1            #58  <String "[CustomCap: bitmapDescriptor=">
	//   18   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
		stringbuilder.append(s);
	//   20   38:aload_3         
	//   21   39:aload_2         
	//   22   40:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		stringbuilder.append(" refWidth=");
	//   24   44:aload_3         
	//   25   45:ldc1            #64  <String " refWidth=">
	//   26   47:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(f);
	//   28   51:aload_3         
	//   29   52:fload_1         
	//   30   53:invokevirtual   #67  <Method StringBuilder StringBuilder.append(float)>
	//   31   56:pop             
		stringbuilder.append("]");
	//   32   57:aload_3         
	//   33   58:ldc1            #69  <String "]">
	//   34   60:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   35   63:pop             
		return stringbuilder.toString();
	//   36   64:aload_3         
	//   37   65:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   38   68:areturn         
	}

	public final BitmapDescriptor bitmapDescriptor;
	public final float refWidth;
}
