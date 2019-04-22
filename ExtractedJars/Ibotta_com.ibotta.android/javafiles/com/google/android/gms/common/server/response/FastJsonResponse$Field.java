// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastJsonResponse, FieldCreator, SafeParcelResponse, FieldMappingDictionary

public static class FastJsonResponse$Field extends AbstractSafeParcelable
{

	public static FastJsonResponse$Field forBase64(String s)
	{
		return new FastJsonResponse$Field(8, false, 8, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:iconst_0        
	//    4    7:bipush          8
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBase64(String s, int i)
	{
		return new FastJsonResponse$Field(8, false, 8, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          8
	//    3    6:iconst_0        
	//    4    7:bipush          8
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBase64UrlSafe(String s)
	{
		return new FastJsonResponse$Field(9, false, 9, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          9
	//    3    6:iconst_0        
	//    4    7:bipush          9
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBase64UrlSafe(String s, int i)
	{
		return new FastJsonResponse$Field(9, false, 9, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          9
	//    3    6:iconst_0        
	//    4    7:bipush          9
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBigDecimal(String s)
	{
		return new FastJsonResponse$Field(5, false, 5, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:iconst_0        
	//    4    6:iconst_5        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigDecimal(String s, int i)
	{
		return new FastJsonResponse$Field(5, false, 5, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:iconst_0        
	//    4    6:iconst_5        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigDecimals(String s)
	{
		return new FastJsonResponse$Field(5, true, 5, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:iconst_1        
	//    4    6:iconst_5        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigDecimals(String s, int i)
	{
		return new FastJsonResponse$Field(5, true, 5, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_5        
	//    3    5:iconst_1        
	//    4    6:iconst_5        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigInteger(String s)
	{
		return new FastJsonResponse$Field(1, false, 1, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigInteger(String s, int i)
	{
		return new FastJsonResponse$Field(1, false, 1, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:iconst_0        
	//    4    6:iconst_1        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigIntegers(String s)
	{
		return new FastJsonResponse$Field(0, true, 1, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBigIntegers(String s, int i)
	{
		return new FastJsonResponse$Field(0, true, 1, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forBoolean(String s)
	{
		return new FastJsonResponse$Field(6, false, 6, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:iconst_0        
	//    4    7:bipush          6
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBoolean(String s, int i)
	{
		return new FastJsonResponse$Field(6, false, 6, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:iconst_0        
	//    4    7:bipush          6
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBooleans(String s)
	{
		return new FastJsonResponse$Field(6, true, 6, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:iconst_1        
	//    4    7:bipush          6
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forBooleans(String s, int i)
	{
		return new FastJsonResponse$Field(6, true, 6, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          6
	//    3    6:iconst_1        
	//    4    7:bipush          6
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forConcreteType(String s, int i, Class class1)
	{
		return new FastJsonResponse$Field(11, false, 11, false, s, i, class1, ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_0        
	//    4    7:bipush          11
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forConcreteType(String s, Class class1)
	{
		return new FastJsonResponse$Field(11, false, 11, false, s, -1, class1, ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_0        
	//    4    7:bipush          11
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aload_1         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forConcreteTypeArray(String s, int i, Class class1)
	{
		return new FastJsonResponse$Field(11, true, 11, true, s, i, class1, ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_1        
	//    4    7:bipush          11
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_2         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forConcreteTypeArray(String s, Class class1)
	{
		return new FastJsonResponse$Field(11, true, 11, true, s, -1, class1, ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          11
	//    3    6:iconst_1        
	//    4    7:bipush          11
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aload_1         
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forDouble(String s)
	{
		return new FastJsonResponse$Field(4, false, 4, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forDouble(String s, int i)
	{
		return new FastJsonResponse$Field(4, false, 4, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_0        
	//    4    6:iconst_4        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forDoubles(String s)
	{
		return new FastJsonResponse$Field(4, true, 4, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_1        
	//    4    6:iconst_4        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forDoubles(String s, int i)
	{
		return new FastJsonResponse$Field(4, true, 4, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:iconst_1        
	//    4    6:iconst_4        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forFloat(String s)
	{
		return new FastJsonResponse$Field(3, false, 3, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:iconst_0        
	//    4    6:iconst_3        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forFloat(String s, int i)
	{
		return new FastJsonResponse$Field(3, false, 3, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:iconst_0        
	//    4    6:iconst_3        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forFloats(String s)
	{
		return new FastJsonResponse$Field(3, true, 3, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:iconst_1        
	//    4    6:iconst_3        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forFloats(String s, int i)
	{
		return new FastJsonResponse$Field(3, true, 3, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:iconst_1        
	//    4    6:iconst_3        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forInteger(String s)
	{
		return new FastJsonResponse$Field(0, false, 0, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forInteger(String s, int i)
	{
		return new FastJsonResponse$Field(0, false, 0, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forIntegers(String s)
	{
		return new FastJsonResponse$Field(0, true, 0, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forIntegers(String s, int i)
	{
		return new FastJsonResponse$Field(0, true, 0, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_1        
	//    4    6:iconst_0        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forLong(String s)
	{
		return new FastJsonResponse$Field(2, false, 2, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:iconst_0        
	//    4    6:iconst_2        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forLong(String s, int i)
	{
		return new FastJsonResponse$Field(2, false, 2, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:iconst_0        
	//    4    6:iconst_2        
	//    5    7:iconst_0        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forLongs(String s)
	{
		return new FastJsonResponse$Field(2, true, 2, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:iconst_1        
	//    4    6:iconst_2        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iconst_m1       
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forLongs(String s, int i)
	{
		return new FastJsonResponse$Field(2, true, 2, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:iconst_1        
	//    4    6:iconst_2        
	//    5    7:iconst_1        
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:aconst_null     
	//    9   11:aconst_null     
	//   10   12:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
	}

	public static FastJsonResponse$Field forString(String s)
	{
		return new FastJsonResponse$Field(7, false, 7, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_0        
	//    4    7:bipush          7
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forString(String s, int i)
	{
		return new FastJsonResponse$Field(7, false, 7, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_0        
	//    4    7:bipush          7
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forStringMap(String s)
	{
		return new FastJsonResponse$Field(10, false, 10, false, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:iconst_0        
	//    4    7:bipush          10
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forStringMap(String s, int i)
	{
		return new FastJsonResponse$Field(10, false, 10, false, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          10
	//    3    6:iconst_0        
	//    4    7:bipush          10
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forStrings(String s)
	{
		return new FastJsonResponse$Field(7, true, 7, true, s, -1, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_1        
	//    4    7:bipush          7
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field forStrings(String s, int i)
	{
		return new FastJsonResponse$Field(7, true, 7, true, s, i, ((Class) (null)), ((onverter) (null)));
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:bipush          7
	//    3    6:iconst_1        
	//    4    7:bipush          7
	//    5    9:iconst_1        
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aconst_null     
	//    9   13:aconst_null     
	//   10   14:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field withConverter(String s, int i, onverter onverter, boolean flag)
	{
		return new FastJsonResponse$Field(onverter.getTypeIn(), flag, onverter.getTypeOut(), false, s, i, ((Class) (null)), onverter);
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokeinterface #184 <Method int FastJsonResponse$FieldConverter.getTypeIn()>
	//    4   10:iload_3         
	//    5   11:aload_2         
	//    6   12:invokeinterface #186 <Method int FastJsonResponse$FieldConverter.getTypeOut()>
	//    7   17:iconst_0        
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:aconst_null     
	//   11   21:aload_2         
	//   12   22:invokespecial   #114 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   13   25:areturn         
	}

	public static FastJsonResponse$Field withConverter(String s, int i, Class class1, boolean flag)
	{
		try
		{
			s = ((String) (withConverter(s, i, (onverter)class1.newInstance(), flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #196 <Method Object Class.newInstance()>
	//    4    6:checkcast       #181 <Class FastJsonResponse$FieldConverter>
	//    5    9:iload_3         
	//    6   10:invokestatic    #198 <Method FastJsonResponse$Field withConverter(String, int, FastJsonResponse$FieldConverter, boolean)>
	//    7   13:astore_0        
		}
	//*   8   14:aload_0         
	//*   9   15:areturn         
	//*  10   16:astore_0        
	//*  11   17:new             #200 <Class RuntimeException>
	//*  12   20:dup             
	//*  13   21:aload_0         
	//*  14   22:invokespecial   #203 <Method void RuntimeException(Throwable)>
	//*  15   25:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  16   26:astore_0        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   17   27:new             #200 <Class RuntimeException>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:invokespecial   #203 <Method void RuntimeException(Throwable)>
	//   21   35:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RuntimeException(((Throwable) (s)));
		}
		return ((FastJsonResponse$Field) (s));
	}

	public static FastJsonResponse$Field withConverter(String s, onverter onverter, boolean flag)
	{
		return withConverter(s, -1, onverter, flag);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #198 <Method FastJsonResponse$Field withConverter(String, int, FastJsonResponse$FieldConverter, boolean)>
	//    5    7:areturn         
	}

	public static FastJsonResponse$Field withConverter(String s, Class class1, boolean flag)
	{
		return withConverter(s, -1, class1, flag);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #209 <Method FastJsonResponse$Field withConverter(String, int, Class, boolean)>
	//    5    7:areturn         
	}

	static onverter zza(FastJsonResponse$Field fastjsonresponse$field)
	{
		return fastjsonresponse$field.zzwo;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//    2    4:areturn         
	}

	private final String zzcz()
	{
		String s1 = mConcreteTypeName;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String mConcreteTypeName>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       13
			s = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
		return s;
	//    9   13:aload_1         
	//   10   14:areturn         
	}

	private final ConverterWrapper zzda()
	{
		onverter onverter = zzwo;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//    2    4:astore_1        
		if(onverter == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ConverterWrapper.wrap(onverter);
	//    7   11:aload_1         
	//    8   12:invokestatic    #219 <Method ConverterWrapper ConverterWrapper.wrap(FastJsonResponse$FieldConverter)>
	//    9   15:areturn         
	}

	public Object convert(Object obj)
	{
		return zzwo.convert(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//    2    4:aload_1         
	//    3    5:invokeinterface #223 <Method Object FastJsonResponse$FieldConverter.convert(Object)>
	//    4   10:areturn         
	}

	public Object convertBack(Object obj)
	{
		return zzwo.convertBack(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//    2    4:aload_1         
	//    3    5:invokeinterface #227 <Method Object FastJsonResponse$FieldConverter.convertBack(Object)>
	//    4   10:areturn         
	}

	public FastJsonResponse$Field copyForDictionary()
	{
		return new FastJsonResponse$Field(zzal, mTypeIn, mTypeInArray, mTypeOut, mTypeOutArray, mOutputFieldName, mSafeParcelableFieldId, mConcreteTypeName, zzda());
	//    0    0:new             #2   <Class FastJsonResponse$Field>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field int zzal>
	//    4    8:aload_0         
	//    5    9:getfield        #75  <Field int mTypeIn>
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field boolean mTypeInArray>
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field int mTypeOut>
	//   10   20:aload_0         
	//   11   21:getfield        #81  <Field boolean mTypeOutArray>
	//   12   24:aload_0         
	//   13   25:getfield        #83  <Field String mOutputFieldName>
	//   14   28:aload_0         
	//   15   29:getfield        #85  <Field int mSafeParcelableFieldId>
	//   16   32:aload_0         
	//   17   33:getfield        #89  <Field String mConcreteTypeName>
	//   18   36:aload_0         
	//   19   37:invokespecial   #232 <Method ConverterWrapper zzda()>
	//   20   40:invokespecial   #234 <Method void FastJsonResponse$Field(int, int, boolean, int, boolean, String, int, String, ConverterWrapper)>
	//   21   43:areturn         
	}

	public Class getConcreteType()
	{
		return mConcreteType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Class mConcreteType>
	//    2    4:areturn         
	}

	public Map getConcreteTypeFieldMappingFromDictionary()
	{
		Preconditions.checkNotNull(((Object) (mConcreteTypeName)));
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field String mConcreteTypeName>
	//    2    4:invokestatic    #245 <Method Object Preconditions.checkNotNull(Object)>
	//    3    7:pop             
		Preconditions.checkNotNull(((Object) (zzwn)));
	//    4    8:aload_0         
	//    5    9:getfield        #247 <Field FieldMappingDictionary zzwn>
	//    6   12:invokestatic    #245 <Method Object Preconditions.checkNotNull(Object)>
	//    7   15:pop             
		return zzwn.getFieldMapping(mConcreteTypeName);
	//    8   16:aload_0         
	//    9   17:getfield        #247 <Field FieldMappingDictionary zzwn>
	//   10   20:aload_0         
	//   11   21:getfield        #89  <Field String mConcreteTypeName>
	//   12   24:invokevirtual   #253 <Method Map FieldMappingDictionary.getFieldMapping(String)>
	//   13   27:areturn         
	}

	public String getOutputFieldName()
	{
		return mOutputFieldName;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field String mOutputFieldName>
	//    2    4:areturn         
	}

	public int getSafeParcelableFieldId()
	{
		return mSafeParcelableFieldId;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int mSafeParcelableFieldId>
	//    2    4:ireturn         
	}

	public int getTypeIn()
	{
		return mTypeIn;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field int mTypeIn>
	//    2    4:ireturn         
	}

	public int getTypeOut()
	{
		return mTypeOut;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field int mTypeOut>
	//    2    4:ireturn         
	}

	public int getVersionCode()
	{
		return zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int zzal>
	//    2    4:ireturn         
	}

	public boolean hasConverter()
	{
		return zzwo != null;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isTypeInArray()
	{
		return mTypeInArray;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean mTypeInArray>
	//    2    4:ireturn         
	}

	public boolean isTypeOutArray()
	{
		return mTypeOutArray;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean mTypeOutArray>
	//    2    4:ireturn         
	}

	public boolean isValidSafeParcelableFieldId()
	{
		return mSafeParcelableFieldId != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field int mSafeParcelableFieldId>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public FastJsonResponse newConcreteTypeInstance()
		throws InstantiationException, IllegalAccessException
	{
		Class class1 = mConcreteType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field Class mConcreteType>
	//    2    4:astore_1        
		if(class1 == com/google/android/gms/common/server/response/SafeParcelResponse)
	//*   3    5:aload_1         
	//*   4    6:ldc1            #91  <Class SafeParcelResponse>
	//*   5    8:if_acmpne       38
		{
			Preconditions.checkNotNull(((Object) (zzwn)), "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
	//    6   11:aload_0         
	//    7   12:getfield        #247 <Field FieldMappingDictionary zzwn>
	//    8   15:ldc2            #261 <String "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.">
	//    9   18:invokestatic    #264 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   10   21:pop             
			return ((FastJsonResponse) (new SafeParcelResponse(zzwn, mConcreteTypeName)));
	//   11   22:new             #91  <Class SafeParcelResponse>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:getfield        #247 <Field FieldMappingDictionary zzwn>
	//   15   30:aload_0         
	//   16   31:getfield        #89  <Field String mConcreteTypeName>
	//   17   34:invokespecial   #267 <Method void SafeParcelResponse(FieldMappingDictionary, String)>
	//   18   37:areturn         
		} else
		{
			return (FastJsonResponse)class1.newInstance();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #196 <Method Object Class.newInstance()>
	//   21   42:checkcast       #7   <Class FastJsonResponse>
	//   22   45:areturn         
		}
	}

	public void setFieldMappingDictionary(FieldMappingDictionary fieldmappingdictionary)
	{
		zzwn = fieldmappingdictionary;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #247 <Field FieldMappingDictionary zzwn>
	//    3    5:return          
	}

	public String toString()
	{
		com.google.android.gms.common.internal.Objects$ToStringHelper objects$tostringhelper = Objects.toStringHelper(((Object) (this))).add("versionCode", ((Object) (Integer.valueOf(zzal)))).add("typeIn", ((Object) (Integer.valueOf(mTypeIn)))).add("typeInArray", ((Object) (Boolean.valueOf(mTypeInArray)))).add("typeOut", ((Object) (Integer.valueOf(mTypeOut)))).add("typeOutArray", ((Object) (Boolean.valueOf(mTypeOutArray)))).add("outputFieldName", ((Object) (mOutputFieldName))).add("safeParcelFieldId", ((Object) (Integer.valueOf(mSafeParcelableFieldId)))).add("concreteTypeName", ((Object) (zzcz())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #277 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
	//    2    4:ldc2            #279 <String "versionCode">
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field int zzal>
	//    5   11:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//    6   14:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//    7   17:ldc2            #293 <String "typeIn">
	//    8   20:aload_0         
	//    9   21:getfield        #75  <Field int mTypeIn>
	//   10   24:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   11   27:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   12   30:ldc2            #295 <String "typeInArray">
	//   13   33:aload_0         
	//   14   34:getfield        #77  <Field boolean mTypeInArray>
	//   15   37:invokestatic    #300 <Method Boolean Boolean.valueOf(boolean)>
	//   16   40:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   17   43:ldc2            #302 <String "typeOut">
	//   18   46:aload_0         
	//   19   47:getfield        #79  <Field int mTypeOut>
	//   20   50:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   21   53:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   22   56:ldc2            #304 <String "typeOutArray">
	//   23   59:aload_0         
	//   24   60:getfield        #81  <Field boolean mTypeOutArray>
	//   25   63:invokestatic    #300 <Method Boolean Boolean.valueOf(boolean)>
	//   26   66:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   27   69:ldc2            #306 <String "outputFieldName">
	//   28   72:aload_0         
	//   29   73:getfield        #83  <Field String mOutputFieldName>
	//   30   76:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   31   79:ldc2            #308 <String "safeParcelFieldId">
	//   32   82:aload_0         
	//   33   83:getfield        #85  <Field int mSafeParcelableFieldId>
	//   34   86:invokestatic    #285 <Method Integer Integer.valueOf(int)>
	//   35   89:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   36   92:ldc2            #310 <String "concreteTypeName">
	//   37   95:aload_0         
	//   38   96:invokespecial   #312 <Method String zzcz()>
	//   39   99:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   40  102:astore_1        
		Object obj = ((Object) (getConcreteType()));
	//   41  103:aload_0         
	//   42  104:invokevirtual   #314 <Method Class getConcreteType()>
	//   43  107:astore_2        
		if(obj != null)
	//*  44  108:aload_2         
	//*  45  109:ifnull          124
			objects$tostringhelper.add("concreteType.class", ((Object) (((Class) (obj)).getCanonicalName())));
	//   46  112:aload_1         
	//   47  113:ldc2            #316 <String "concreteType.class">
	//   48  116:aload_2         
	//   49  117:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//   50  120:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   51  123:pop             
		obj = ((Object) (zzwo));
	//   52  124:aload_0         
	//   53  125:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//   54  128:astore_2        
		if(obj != null)
	//*  55  129:aload_2         
	//*  56  130:ifnull          148
			objects$tostringhelper.add("converterName", ((Object) (obj.getClass().getCanonicalName())));
	//   57  133:aload_1         
	//   58  134:ldc2            #318 <String "converterName">
	//   59  137:aload_2         
	//   60  138:invokevirtual   #323 <Method Class Object.getClass()>
	//   61  141:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//   62  144:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   63  147:pop             
		return objects$tostringhelper.toString();
	//   64  148:aload_1         
	//   65  149:invokevirtual   #325 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
	//   66  152:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #333 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #335 <Method int getVersionCode()>
	//    7   11:invokestatic    #339 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, getTypeIn());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #340 <Method int getTypeIn()>
	//   12   20:invokestatic    #339 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 3, isTypeInArray());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #342 <Method boolean isTypeInArray()>
	//   17   29:invokestatic    #346 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeInt(parcel, 4, getTypeOut());
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #347 <Method int getTypeOut()>
	//   22   38:invokestatic    #339 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBoolean(parcel, 5, isTypeOutArray());
	//   23   41:aload_1         
	//   24   42:iconst_5        
	//   25   43:aload_0         
	//   26   44:invokevirtual   #349 <Method boolean isTypeOutArray()>
	//   27   47:invokestatic    #346 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getOutputFieldName(), false);
	//   28   50:aload_1         
	//   29   51:bipush          6
	//   30   53:aload_0         
	//   31   54:invokevirtual   #351 <Method String getOutputFieldName()>
	//   32   57:iconst_0        
	//   33   58:invokestatic    #355 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
	//   34   61:aload_1         
	//   35   62:bipush          7
	//   36   64:aload_0         
	//   37   65:invokevirtual   #357 <Method int getSafeParcelableFieldId()>
	//   38   68:invokestatic    #339 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 8, zzcz(), false);
	//   39   71:aload_1         
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:invokespecial   #312 <Method String zzcz()>
	//   43   78:iconst_0        
	//   44   79:invokestatic    #355 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 9, ((android.os.Parcelable) (zzda())), i, false);
	//   45   82:aload_1         
	//   46   83:bipush          9
	//   47   85:aload_0         
	//   48   86:invokespecial   #232 <Method ConverterWrapper zzda()>
	//   49   89:iload_2         
	//   50   90:iconst_0        
	//   51   91:invokestatic    #361 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   52   94:aload_1         
	//   53   95:iload_3         
	//   54   96:invokestatic    #364 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   55   99:return          
	}

	public static final FieldCreator CREATOR = new FieldCreator();
	protected final Class mConcreteType;
	protected final String mConcreteTypeName;
	protected final String mOutputFieldName;
	protected final int mSafeParcelableFieldId;
	protected final int mTypeIn;
	protected final boolean mTypeInArray;
	protected final int mTypeOut;
	protected final boolean mTypeOutArray;
	private final int zzal;
	private FieldMappingDictionary zzwn;
	private onverter zzwo;

	static 
	{
	//    0    0:new             #61  <Class FieldCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #64  <Method void FieldCreator()>
	//    3    7:putstatic       #66  <Field FieldCreator CREATOR>
	//*   4   10:return          
	}

	FastJsonResponse$Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
			String s1, ConverterWrapper converterwrapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #73  <Field int zzal>
		mTypeIn = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #75  <Field int mTypeIn>
		mTypeInArray = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #77  <Field boolean mTypeInArray>
		mTypeOut = k;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #79  <Field int mTypeOut>
		mTypeOutArray = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #81  <Field boolean mTypeOutArray>
		mOutputFieldName = s;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #83  <Field String mOutputFieldName>
		mSafeParcelableFieldId = l;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #85  <Field int mSafeParcelableFieldId>
		if(s1 == null)
	//*  23   43:aload           8
	//*  24   45:ifnonnull       61
		{
			mConcreteType = null;
	//   25   48:aload_0         
	//   26   49:aconst_null     
	//   27   50:putfield        #87  <Field Class mConcreteType>
			mConcreteTypeName = null;
	//   28   53:aload_0         
	//   29   54:aconst_null     
	//   30   55:putfield        #89  <Field String mConcreteTypeName>
		} else
	//*  31   58:goto            73
		{
			mConcreteType = com/google/android/gms/common/server/response/SafeParcelResponse;
	//   32   61:aload_0         
	//   33   62:ldc1            #91  <Class SafeParcelResponse>
	//   34   64:putfield        #87  <Field Class mConcreteType>
			mConcreteTypeName = s1;
	//   35   67:aload_0         
	//   36   68:aload           8
	//   37   70:putfield        #89  <Field String mConcreteTypeName>
		}
		if(converterwrapper == null)
	//*  38   73:aload           9
	//*  39   75:ifnonnull       84
		{
			zzwo = null;
	//   40   78:aload_0         
	//   41   79:aconst_null     
	//   42   80:putfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
			return;
	//   43   83:return          
		} else
		{
			zzwo = converterwrapper.unwrap();
	//   44   84:aload_0         
	//   45   85:aload           9
	//   46   87:invokevirtual   #99  <Method FastJsonResponse$FieldConverter ConverterWrapper.unwrap()>
	//   47   90:putfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
			return;
	//   48   93:return          
		}
	}

	protected FastJsonResponse$Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
			onverter onverter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void AbstractSafeParcelable()>
		zzal = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #73  <Field int zzal>
		mTypeIn = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #75  <Field int mTypeIn>
		mTypeInArray = flag;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #77  <Field boolean mTypeInArray>
		mTypeOut = j;
	//   11   19:aload_0         
	//   12   20:iload_3         
	//   13   21:putfield        #79  <Field int mTypeOut>
		mTypeOutArray = flag1;
	//   14   24:aload_0         
	//   15   25:iload           4
	//   16   27:putfield        #81  <Field boolean mTypeOutArray>
		mOutputFieldName = s;
	//   17   30:aload_0         
	//   18   31:aload           5
	//   19   33:putfield        #83  <Field String mOutputFieldName>
		mSafeParcelableFieldId = k;
	//   20   36:aload_0         
	//   21   37:iload           6
	//   22   39:putfield        #85  <Field int mSafeParcelableFieldId>
		mConcreteType = class1;
	//   23   42:aload_0         
	//   24   43:aload           7
	//   25   45:putfield        #87  <Field Class mConcreteType>
		if(class1 == null)
	//*  26   48:aload           7
	//*  27   50:ifnonnull       59
			s = null;
	//   28   53:aconst_null     
	//   29   54:astore          5
		else
	//*  30   56:goto            66
			s = class1.getCanonicalName();
	//   31   59:aload           7
	//   32   61:invokevirtual   #108 <Method String Class.getCanonicalName()>
	//   33   64:astore          5
		mConcreteTypeName = s;
	//   34   66:aload_0         
	//   35   67:aload           5
	//   36   69:putfield        #89  <Field String mConcreteTypeName>
		zzwo = onverter;
	//   37   72:aload_0         
	//   38   73:aload           8
	//   39   75:putfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
	//   40   78:return          
	}
}
