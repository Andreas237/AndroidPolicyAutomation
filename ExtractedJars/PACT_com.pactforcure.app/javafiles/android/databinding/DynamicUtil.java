// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;


public class DynamicUtil
{

	public DynamicUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static byte safeUnbox(Byte byte1)
	{
		if(byte1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return byte1.byteValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #17  <Method byte Byte.byteValue()>
	//    6   10:ireturn         
	}

	public static char safeUnbox(Character character)
	{
		if(character == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return '\0';
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return character.charValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method char Character.charValue()>
	//    6   10:ireturn         
	}

	public static double safeUnbox(Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0.0D;
	//    2    4:dconst_0        
	//    3    5:dreturn         
		else
			return double1.doubleValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method double Double.doubleValue()>
	//    6   10:dreturn         
	}

	public static float safeUnbox(Float float1)
	{
		if(float1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0.0F;
	//    2    4:fconst_0        
	//    3    5:freturn         
		else
			return float1.floatValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #38  <Method float Float.floatValue()>
	//    6   10:freturn         
	}

	public static int safeUnbox(Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return integer.intValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #45  <Method int Integer.intValue()>
	//    6   10:ireturn         
	}

	public static long safeUnbox(Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0L;
	//    2    4:lconst_0        
	//    3    5:lreturn         
		else
			return long1.longValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #52  <Method long Long.longValue()>
	//    6   10:lreturn         
	}

	public static short safeUnbox(Short short1)
	{
		if(short1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return short1.shortValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #59  <Method short Short.shortValue()>
	//    6   10:ireturn         
	}

	public static boolean safeUnbox(Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		else
			return boolean1.booleanValue();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #66  <Method boolean Boolean.booleanValue()>
	//    6   10:ireturn         
	}
}
