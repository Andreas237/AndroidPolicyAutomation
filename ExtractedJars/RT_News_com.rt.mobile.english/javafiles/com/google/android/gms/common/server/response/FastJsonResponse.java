// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.util.*;
import java.io.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.zip.GZIPInputStream;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastParser, PostProcessor, FieldCreator, SafeParcelResponse, 
//			FieldMappingDictionary

public abstract class FastJsonResponse
{
	public static class Field extends AbstractSafeParcelable
	{

		public static Field forBase64(String s)
		{
			return new Field(8, false, 8, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBase64(String s, int i)
		{
			return new Field(8, false, 8, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBase64UrlSafe(String s)
		{
			return new Field(9, false, 9, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBase64UrlSafe(String s, int i)
		{
			return new Field(9, false, 9, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigDecimal(String s)
		{
			return new Field(5, false, 5, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigDecimal(String s, int i)
		{
			return new Field(5, false, 5, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigDecimals(String s)
		{
			return new Field(5, true, 5, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigDecimals(String s, int i)
		{
			return new Field(5, true, 5, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigInteger(String s)
		{
			return new Field(1, false, 1, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigInteger(String s, int i)
		{
			return new Field(1, false, 1, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigIntegers(String s)
		{
			return new Field(0, true, 1, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBigIntegers(String s, int i)
		{
			return new Field(0, true, 1, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBoolean(String s)
		{
			return new Field(6, false, 6, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBoolean(String s, int i)
		{
			return new Field(6, false, 6, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBooleans(String s)
		{
			return new Field(6, true, 6, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forBooleans(String s, int i)
		{
			return new Field(6, true, 6, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forConcreteType(String s, int i, Class class1)
		{
			return new Field(11, false, 11, false, s, i, class1, ((FieldConverter) (null)));
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

		public static Field forConcreteType(String s, Class class1)
		{
			return new Field(11, false, 11, false, s, -1, class1, ((FieldConverter) (null)));
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

		public static Field forConcreteTypeArray(String s, int i, Class class1)
		{
			return new Field(11, true, 11, true, s, i, class1, ((FieldConverter) (null)));
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

		public static Field forConcreteTypeArray(String s, Class class1)
		{
			return new Field(11, true, 11, true, s, -1, class1, ((FieldConverter) (null)));
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

		public static Field forDouble(String s)
		{
			return new Field(4, false, 4, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forDouble(String s, int i)
		{
			return new Field(4, false, 4, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forDoubles(String s)
		{
			return new Field(4, true, 4, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forDoubles(String s, int i)
		{
			return new Field(4, true, 4, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forFloat(String s)
		{
			return new Field(3, false, 3, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forFloat(String s, int i)
		{
			return new Field(3, false, 3, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forFloats(String s)
		{
			return new Field(3, true, 3, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forFloats(String s, int i)
		{
			return new Field(3, true, 3, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forInteger(String s)
		{
			return new Field(0, false, 0, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forInteger(String s, int i)
		{
			return new Field(0, false, 0, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forIntegers(String s)
		{
			return new Field(0, true, 0, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forIntegers(String s, int i)
		{
			return new Field(0, true, 0, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forLong(String s)
		{
			return new Field(2, false, 2, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forLong(String s, int i)
		{
			return new Field(2, false, 2, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forLongs(String s)
		{
			return new Field(2, true, 2, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forLongs(String s, int i)
		{
			return new Field(2, true, 2, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forString(String s)
		{
			return new Field(7, false, 7, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forString(String s, int i)
		{
			return new Field(7, false, 7, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forStringMap(String s)
		{
			return new Field(10, false, 10, false, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forStringMap(String s, int i)
		{
			return new Field(10, false, 10, false, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forStrings(String s)
		{
			return new Field(7, true, 7, true, s, -1, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field forStrings(String s, int i)
		{
			return new Field(7, true, 7, true, s, i, ((Class) (null)), ((FieldConverter) (null)));
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

		public static Field withConverter(String s, int i, FieldConverter fieldconverter, boolean flag)
		{
			return new Field(fieldconverter.getTypeIn(), flag, fieldconverter.getTypeOut(), false, s, i, ((Class) (null)), fieldconverter);
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

		public static Field withConverter(String s, int i, Class class1, boolean flag)
		{
			try
			{
				s = ((String) (withConverter(s, i, (FieldConverter)class1.newInstance(), flag)));
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
			return ((Field) (s));
		}

		public static Field withConverter(String s, FieldConverter fieldconverter, boolean flag)
		{
			return withConverter(s, -1, fieldconverter, flag);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:aload_1         
		//    3    3:iload_2         
		//    4    4:invokestatic    #198 <Method FastJsonResponse$Field withConverter(String, int, FastJsonResponse$FieldConverter, boolean)>
		//    5    7:areturn         
		}

		public static Field withConverter(String s, Class class1, boolean flag)
		{
			return withConverter(s, -1, class1, flag);
		//    0    0:aload_0         
		//    1    1:iconst_m1       
		//    2    2:aload_1         
		//    3    3:iload_2         
		//    4    4:invokestatic    #209 <Method FastJsonResponse$Field withConverter(String, int, Class, boolean)>
		//    5    7:areturn         
		}

		static FieldConverter zza(Field field)
		{
			return field.zzwo;
		//    0    0:aload_0         
		//    1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
		//    2    4:areturn         
		}

		private final String zzcz()
		{
			if(mConcreteTypeName == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #89  <Field String mConcreteTypeName>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return mConcreteTypeName;
		//    5    9:aload_0         
		//    6   10:getfield        #89  <Field String mConcreteTypeName>
		//    7   13:areturn         
		}

		private final ConverterWrapper zzda()
		{
			if(zzwo == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return ConverterWrapper.wrap(zzwo);
		//    5    9:aload_0         
		//    6   10:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
		//    7   13:invokestatic    #219 <Method ConverterWrapper ConverterWrapper.wrap(FastJsonResponse$FieldConverter)>
		//    8   16:areturn         
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

		public Field copyForDictionary()
		{
			return new Field(zzal, mTypeIn, mTypeInArray, mTypeOut, mTypeOutArray, mOutputFieldName, mSafeParcelableFieldId, mConcreteTypeName, zzda());
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
			if(mConcreteType == com/google/android/gms/common/server/response/SafeParcelResponse)
		//*   0    0:aload_0         
		//*   1    1:getfield        #87  <Field Class mConcreteType>
		//*   2    4:ldc1            #91  <Class SafeParcelResponse>
		//*   3    6:if_acmpne       36
			{
				Preconditions.checkNotNull(((Object) (zzwn)), "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
		//    4    9:aload_0         
		//    5   10:getfield        #247 <Field FieldMappingDictionary zzwn>
		//    6   13:ldc2            #261 <String "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.">
		//    7   16:invokestatic    #264 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    8   19:pop             
				return ((FastJsonResponse) (new SafeParcelResponse(zzwn, mConcreteTypeName)));
		//    9   20:new             #91  <Class SafeParcelResponse>
		//   10   23:dup             
		//   11   24:aload_0         
		//   12   25:getfield        #247 <Field FieldMappingDictionary zzwn>
		//   13   28:aload_0         
		//   14   29:getfield        #89  <Field String mConcreteTypeName>
		//   15   32:invokespecial   #267 <Method void SafeParcelResponse(FieldMappingDictionary, String)>
		//   16   35:areturn         
			} else
			{
				return (FastJsonResponse)mConcreteType.newInstance();
		//   17   36:aload_0         
		//   18   37:getfield        #87  <Field Class mConcreteType>
		//   19   40:invokevirtual   #196 <Method Object Class.newInstance()>
		//   20   43:checkcast       #7   <Class FastJsonResponse>
		//   21   46:areturn         
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
			com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(((Object) (this))).add("versionCode", ((Object) (Integer.valueOf(zzal)))).add("typeIn", ((Object) (Integer.valueOf(mTypeIn)))).add("typeInArray", ((Object) (Boolean.valueOf(mTypeInArray)))).add("typeOut", ((Object) (Integer.valueOf(mTypeOut)))).add("typeOutArray", ((Object) (Boolean.valueOf(mTypeOutArray)))).add("outputFieldName", ((Object) (mOutputFieldName))).add("safeParcelFieldId", ((Object) (Integer.valueOf(mSafeParcelableFieldId)))).add("concreteTypeName", ((Object) (zzcz())));
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
			Class class1 = getConcreteType();
		//   41  103:aload_0         
		//   42  104:invokevirtual   #314 <Method Class getConcreteType()>
		//   43  107:astore_2        
			if(class1 != null)
		//*  44  108:aload_2         
		//*  45  109:ifnull          124
				tostringhelper.add("concreteType.class", ((Object) (class1.getCanonicalName())));
		//   46  112:aload_1         
		//   47  113:ldc2            #316 <String "concreteType.class">
		//   48  116:aload_2         
		//   49  117:invokevirtual   #108 <Method String Class.getCanonicalName()>
		//   50  120:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   51  123:pop             
			if(zzwo != null)
		//*  52  124:aload_0         
		//*  53  125:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
		//*  54  128:ifnull          149
				tostringhelper.add("converterName", ((Object) (((Object) (zzwo)).getClass().getCanonicalName())));
		//   55  131:aload_1         
		//   56  132:ldc2            #318 <String "converterName">
		//   57  135:aload_0         
		//   58  136:getfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
		//   59  139:invokevirtual   #323 <Method Class Object.getClass()>
		//   60  142:invokevirtual   #108 <Method String Class.getCanonicalName()>
		//   61  145:invokevirtual   #291 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   62  148:pop             
			return tostringhelper.toString();
		//   63  149:aload_1         
		//   64  150:invokevirtual   #325 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
		//   65  153:areturn         
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
		private FieldConverter zzwo;

		static 
		{
		//    0    0:new             #61  <Class FieldCreator>
		//    1    3:dup             
		//    2    4:invokespecial   #64  <Method void FieldCreator()>
		//    3    7:putstatic       #66  <Field FieldCreator CREATOR>
		//*   4   10:return          
		}

		Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
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

		protected Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
				FieldConverter fieldconverter)
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
		//*  27   50:ifnonnull       65
				s = null;
		//   28   53:aconst_null     
		//   29   54:astore          5
			else
		//*  30   56:aload_0         
		//*  31   57:aload           5
		//*  32   59:putfield        #89  <Field String mConcreteTypeName>
		//*  33   62:goto            75
				s = class1.getCanonicalName();
		//   34   65:aload           7
		//   35   67:invokevirtual   #108 <Method String Class.getCanonicalName()>
		//   36   70:astore          5
			mConcreteTypeName = s;
		//*  37   72:goto            56
			zzwo = fieldconverter;
		//   38   75:aload_0         
		//   39   76:aload           8
		//   40   78:putfield        #93  <Field FastJsonResponse$FieldConverter zzwo>
		//   41   81:return          
		}
	}

	public static interface FieldConverter
	{

		public abstract Object convert(Object obj);

		public abstract Object convertBack(Object obj);

		public abstract int getTypeIn();

		public abstract int getTypeOut();
	}

	public static interface FieldType
	{

		public static final int BASE64 = 8;
		public static final int BASE64_URL_SAFE = 9;
		public static final int BIG_DECIMAL = 5;
		public static final int BIG_INTEGER = 1;
		public static final int BOOLEAN = 6;
		public static final int CONCRETE_TYPE = 11;
		public static final int DOUBLE = 4;
		public static final int FLOAT = 3;
		public static final int INT = 0;
		public static final int LONG = 2;
		public static final int STRING = 7;
		public static final int STRING_MAP = 10;
	}


	public FastJsonResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static InputStream getUnzippedStream(byte abyte0[])
	{
		ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
	//    0    0:new             #34  <Class ByteArrayInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #37  <Method void ByteArrayInputStream(byte[])>
	//    4    8:astore_1        
		if(IOUtils.isGzipByteBuffer(abyte0))
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #43  <Method boolean IOUtils.isGzipByteBuffer(byte[])>
	//*   7   13:ifeq            27
		{
			try
			{
				abyte0 = ((byte []) (new GZIPInputStream(((InputStream) (bytearrayinputstream)))));
	//    8   16:new             #45  <Class GZIPInputStream>
	//    9   19:dup             
	//   10   20:aload_1         
	//   11   21:invokespecial   #48  <Method void GZIPInputStream(InputStream)>
	//   12   24:astore_0        
			}
	//*  13   25:aload_0         
	//*  14   26:areturn         
	//*  15   27:aload_1         
	//*  16   28:areturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
	//*  17   29:astore_0        
			{
				return ((InputStream) (bytearrayinputstream));
	//   18   30:aload_1         
	//   19   31:areturn         
			}
			return ((InputStream) (abyte0));
		} else
		{
			return ((InputStream) (bytearrayinputstream));
		}
	}

	private final void zza(Field field, Object obj)
	{
		String s = field.getOutputFieldName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//    2    4:astore          4
		obj = field.convert(obj);
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #58  <Method Object FastJsonResponse$Field.convert(Object)>
	//    6   11:astore_2        
		switch(field.getTypeOut())
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #62  <Method int FastJsonResponse$Field.getTypeOut()>
		{
	//*   9   16:tableswitch     0 9: default 72
	//	               0 241
	//	               1 229
	//	               2 205
	//	               3 72
	//	               4 181
	//	               5 169
	//	               6 145
	//	               7 133
	//	               8 112
	//	               9 112
		case 3: // '\003'
		default:
			int i = field.getTypeOut();
	//   10   72:aload_1         
	//   11   73:invokevirtual   #62  <Method int FastJsonResponse$Field.getTypeOut()>
	//   12   76:istore_3        
			field = ((Field) (new StringBuilder(44)));
	//   13   77:new             #64  <Class StringBuilder>
	//   14   80:dup             
	//   15   81:bipush          44
	//   16   83:invokespecial   #67  <Method void StringBuilder(int)>
	//   17   86:astore_1        
			((StringBuilder) (field)).append("Unsupported type for conversion: ");
	//   18   87:aload_1         
	//   19   88:ldc1            #69  <String "Unsupported type for conversion: ">
	//   20   90:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   21   93:pop             
			((StringBuilder) (field)).append(i);
	//   22   94:aload_1         
	//   23   95:iload_3         
	//   24   96:invokevirtual   #76  <Method StringBuilder StringBuilder.append(int)>
	//   25   99:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   26  100:new             #78  <Class IllegalStateException>
	//   27  103:dup             
	//   28  104:aload_1         
	//   29  105:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   30  108:invokespecial   #84  <Method void IllegalStateException(String)>
	//   31  111:athrow          

		case 8: // '\b'
		case 9: // '\t'
			if(zzb(s, obj))
	//*  32  112:aload           4
	//*  33  114:aload_2         
	//*  34  115:invokestatic    #88  <Method boolean zzb(String, Object)>
	//*  35  118:ifeq            264
			{
				setDecodedBytesInternal(field, s, (byte[])obj);
	//   36  121:aload_0         
	//   37  122:aload_1         
	//   38  123:aload           4
	//   39  125:aload_2         
	//   40  126:checkcast       #89  <Class byte[]>
	//   41  129:invokevirtual   #93  <Method void setDecodedBytesInternal(FastJsonResponse$Field, String, byte[])>
				return;
	//   42  132:return          
			}
			break;

		case 7: // '\007'
			setStringInternal(field, s, (String)obj);
	//   43  133:aload_0         
	//   44  134:aload_1         
	//   45  135:aload           4
	//   46  137:aload_2         
	//   47  138:checkcast       #95  <Class String>
	//   48  141:invokevirtual   #99  <Method void setStringInternal(FastJsonResponse$Field, String, String)>
			return;
	//   49  144:return          

		case 6: // '\006'
			if(zzb(s, obj))
	//*  50  145:aload           4
	//*  51  147:aload_2         
	//*  52  148:invokestatic    #88  <Method boolean zzb(String, Object)>
	//*  53  151:ifeq            264
			{
				setBooleanInternal(field, s, ((Boolean)obj).booleanValue());
	//   54  154:aload_0         
	//   55  155:aload_1         
	//   56  156:aload           4
	//   57  158:aload_2         
	//   58  159:checkcast       #101 <Class Boolean>
	//   59  162:invokevirtual   #105 <Method boolean Boolean.booleanValue()>
	//   60  165:invokevirtual   #109 <Method void setBooleanInternal(FastJsonResponse$Field, String, boolean)>
				return;
	//   61  168:return          
			}
			break;

		case 5: // '\005'
			setBigDecimalInternal(field, s, (BigDecimal)obj);
	//   62  169:aload_0         
	//   63  170:aload_1         
	//   64  171:aload           4
	//   65  173:aload_2         
	//   66  174:checkcast       #111 <Class BigDecimal>
	//   67  177:invokevirtual   #115 <Method void setBigDecimalInternal(FastJsonResponse$Field, String, BigDecimal)>
			return;
	//   68  180:return          

		case 4: // '\004'
			if(zzb(s, obj))
	//*  69  181:aload           4
	//*  70  183:aload_2         
	//*  71  184:invokestatic    #88  <Method boolean zzb(String, Object)>
	//*  72  187:ifeq            264
			{
				setDoubleInternal(field, s, ((Double)obj).doubleValue());
	//   73  190:aload_0         
	//   74  191:aload_1         
	//   75  192:aload           4
	//   76  194:aload_2         
	//   77  195:checkcast       #117 <Class Double>
	//   78  198:invokevirtual   #121 <Method double Double.doubleValue()>
	//   79  201:invokevirtual   #125 <Method void setDoubleInternal(FastJsonResponse$Field, String, double)>
				return;
	//   80  204:return          
			}
			break;

		case 2: // '\002'
			if(zzb(s, obj))
	//*  81  205:aload           4
	//*  82  207:aload_2         
	//*  83  208:invokestatic    #88  <Method boolean zzb(String, Object)>
	//*  84  211:ifeq            264
			{
				setLongInternal(field, s, ((Long)obj).longValue());
	//   85  214:aload_0         
	//   86  215:aload_1         
	//   87  216:aload           4
	//   88  218:aload_2         
	//   89  219:checkcast       #127 <Class Long>
	//   90  222:invokevirtual   #131 <Method long Long.longValue()>
	//   91  225:invokevirtual   #135 <Method void setLongInternal(FastJsonResponse$Field, String, long)>
				return;
	//   92  228:return          
			}
			break;

		case 1: // '\001'
			setBigIntegerInternal(field, s, (BigInteger)obj);
	//   93  229:aload_0         
	//   94  230:aload_1         
	//   95  231:aload           4
	//   96  233:aload_2         
	//   97  234:checkcast       #137 <Class BigInteger>
	//   98  237:invokevirtual   #141 <Method void setBigIntegerInternal(FastJsonResponse$Field, String, BigInteger)>
			return;
	//   99  240:return          

		case 0: // '\0'
			if(zzb(s, obj))
	//* 100  241:aload           4
	//* 101  243:aload_2         
	//* 102  244:invokestatic    #88  <Method boolean zzb(String, Object)>
	//* 103  247:ifeq            264
				setIntegerInternal(field, s, ((Integer)obj).intValue());
	//  104  250:aload_0         
	//  105  251:aload_1         
	//  106  252:aload           4
	//  107  254:aload_2         
	//  108  255:checkcast       #143 <Class Integer>
	//  109  258:invokevirtual   #146 <Method int Integer.intValue()>
	//  110  261:invokevirtual   #150 <Method void setIntegerInternal(FastJsonResponse$Field, String, int)>
			break;
		}
	//  111  264:return          
	}

	private static void zza(StringBuilder stringbuilder, Field field, Object obj)
	{
		if(field.getTypeIn() == 11)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #156 <Method int FastJsonResponse$Field.getTypeIn()>
	//*   2    4:bipush          11
	//*   3    6:icmpne          31
			field = ((Field) (((FastJsonResponse)field.getConcreteType().cast(obj)).toString()));
	//    4    9:aload_1         
	//    5   10:invokevirtual   #160 <Method Class FastJsonResponse$Field.getConcreteType()>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #165 <Method Object Class.cast(Object)>
	//    8   17:checkcast       #2   <Class FastJsonResponse>
	//    9   20:invokevirtual   #166 <Method String toString()>
	//   10   23:astore_1        
		else
	//*  11   24:aload_0         
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  14   29:pop             
	//*  15   30:return          
		if(field.getTypeIn() == 7)
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #156 <Method int FastJsonResponse$Field.getTypeIn()>
	//*  18   35:bipush          7
	//*  19   37:icmpne          65
		{
			stringbuilder.append("\"");
	//   20   40:aload_0         
	//   21   41:ldc1            #17  <String "\"">
	//   22   43:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			stringbuilder.append(JsonUtils.escapeString((String)obj));
	//   24   47:aload_0         
	//   25   48:aload_2         
	//   26   49:checkcast       #95  <Class String>
	//   27   52:invokestatic    #172 <Method String JsonUtils.escapeString(String)>
	//   28   55:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			field = "\"";
	//   30   59:ldc1            #17  <String "\"">
	//   31   61:astore_1        
		} else
	//*  32   62:goto            24
		{
			stringbuilder.append(obj);
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #175 <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
			return;
	//   37   71:return          
		}
		stringbuilder.append(((String) (field)));
	}

	private static boolean zzb(String s, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       64
		{
			if(Log.isLoggable("FastJsonResponse", 6))
	//*   2    4:ldc1            #177 <String "FastJsonResponse">
	//*   3    6:bipush          6
	//*   4    8:invokestatic    #183 <Method boolean Log.isLoggable(String, int)>
	//*   5   11:ifeq            62
			{
				obj = ((Object) (new StringBuilder(58 + String.valueOf(((Object) (s))).length())));
	//    6   14:new             #64  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:bipush          58
	//    9   20:aload_0         
	//   10   21:invokestatic    #187 <Method String String.valueOf(Object)>
	//   11   24:invokevirtual   #190 <Method int String.length()>
	//   12   27:iadd            
	//   13   28:invokespecial   #67  <Method void StringBuilder(int)>
	//   14   31:astore_1        
				((StringBuilder) (obj)).append("Output field (");
	//   15   32:aload_1         
	//   16   33:ldc1            #192 <String "Output field (">
	//   17   35:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				((StringBuilder) (obj)).append(s);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
				((StringBuilder) (obj)).append(") has a null value, but expected a primitive");
	//   23   45:aload_1         
	//   24   46:ldc1            #194 <String ") has a null value, but expected a primitive">
	//   25   48:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				Log.e("FastJsonResponse", ((StringBuilder) (obj)).toString());
	//   27   52:ldc1            #177 <String "FastJsonResponse">
	//   28   54:aload_1         
	//   29   55:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   30   58:invokestatic    #198 <Method int Log.e(String, String)>
	//   31   61:pop             
			}
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		} else
		{
			return true;
	//   34   64:iconst_1        
	//   35   65:ireturn         
		}
	}

	public void addConcreteType(String s, FastJsonResponse fastjsonresponse)
	{
		throw new UnsupportedOperationException("Concrete type not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #205 <String "Concrete type not supported">
	//    3    6:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addConcreteTypeArray(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Concrete type array not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #211 <String "Concrete type array not supported">
	//    3    6:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addConcreteTypeArrayInternal(Field field, String s, ArrayList arraylist)
	{
		addConcreteTypeArray(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #216 <Method void addConcreteTypeArray(String, ArrayList)>
	//    4    6:return          
	}

	public void addConcreteTypeInternal(Field field, String s, FastJsonResponse fastjsonresponse)
	{
		addConcreteType(s, fastjsonresponse);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #221 <Method void addConcreteType(String, FastJsonResponse)>
	//    4    6:return          
	}

	public HashMap getConcreteTypeArrays()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public HashMap getConcreteTypes()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract Map getFieldMappings();

	protected Object getFieldValue(Field field)
	{
		Object obj = ((Object) (field.getOutputFieldName()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//    2    4:astore          4
		if(field.getConcreteType() != null)
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #160 <Method Class FastJsonResponse$Field.getConcreteType()>
	//*   5   10:ifnull          178
		{
			boolean flag;
			if(getValueObject(field.getOutputFieldName()) == null)
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//*   9   18:invokevirtual   #236 <Method Object getValueObject(String)>
	//*  10   21:ifnonnull       29
				flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_3        
			else
	//*  13   26:goto            31
				flag = false;
	//   14   29:iconst_0        
	//   15   30:istore_3        
			Preconditions.checkState(flag, "Concrete field shouldn't be value object: %s", new Object[] {
				field.getOutputFieldName()
			});
	//   16   31:iload_3         
	//   17   32:ldc1            #238 <String "Concrete field shouldn't be value object: %s">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:aload_1         
	//   23   41:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   24   44:aastore         
	//   25   45:invokestatic    #244 <Method void Preconditions.checkState(boolean, String, Object[])>
			if(field.isTypeOutArray())
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #247 <Method boolean FastJsonResponse$Field.isTypeOutArray()>
	//*  28   52:ifeq            63
				field = ((Field) (getConcreteTypeArrays()));
	//   29   55:aload_0         
	//   30   56:invokevirtual   #249 <Method HashMap getConcreteTypeArrays()>
	//   31   59:astore_1        
			else
	//*  32   60:goto            68
				field = ((Field) (getConcreteTypes()));
	//   33   63:aload_0         
	//   34   64:invokevirtual   #251 <Method HashMap getConcreteTypes()>
	//   35   67:astore_1        
			if(field != null)
	//*  36   68:aload_1         
	//*  37   69:ifnull          81
				return ((Map) (field)).get(obj);
	//   38   72:aload_1         
	//   39   73:aload           4
	//   40   75:invokeinterface #256 <Method Object Map.get(Object)>
	//   41   80:areturn         
			try
			{
				char c = Character.toUpperCase(((String) (obj)).charAt(0));
	//   42   81:aload           4
	//   43   83:iconst_0        
	//   44   84:invokevirtual   #260 <Method char String.charAt(int)>
	//   45   87:invokestatic    #266 <Method char Character.toUpperCase(char)>
	//   46   90:istore_2        
				field = ((Field) (((String) (obj)).substring(1)));
	//   47   91:aload           4
	//   48   93:iconst_1        
	//   49   94:invokevirtual   #270 <Method String String.substring(int)>
	//   50   97:astore_1        
				obj = ((Object) (new StringBuilder(4 + String.valueOf(((Object) (field))).length())));
	//   51   98:new             #64  <Class StringBuilder>
	//   52  101:dup             
	//   53  102:iconst_4        
	//   54  103:aload_1         
	//   55  104:invokestatic    #187 <Method String String.valueOf(Object)>
	//   56  107:invokevirtual   #190 <Method int String.length()>
	//   57  110:iadd            
	//   58  111:invokespecial   #67  <Method void StringBuilder(int)>
	//   59  114:astore          4
				((StringBuilder) (obj)).append("get");
	//   60  116:aload           4
	//   61  118:ldc2            #271 <String "get">
	//   62  121:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   63  124:pop             
				((StringBuilder) (obj)).append(c);
	//   64  125:aload           4
	//   65  127:iload_2         
	//   66  128:invokevirtual   #274 <Method StringBuilder StringBuilder.append(char)>
	//   67  131:pop             
				((StringBuilder) (obj)).append(((String) (field)));
	//   68  132:aload           4
	//   69  134:aload_1         
	//   70  135:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   71  138:pop             
				field = ((Field) (((StringBuilder) (obj)).toString()));
	//   72  139:aload           4
	//   73  141:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   74  144:astore_1        
				field = ((Field) (((Object)this).getClass().getMethod(((String) (field)), new Class[0]).invoke(((Object) (this)), new Object[0])));
	//   75  145:aload_0         
	//   76  146:invokevirtual   #277 <Method Class Object.getClass()>
	//   77  149:aload_1         
	//   78  150:iconst_0        
	//   79  151:anewarray       Class[]
	//   80  154:invokevirtual   #281 <Method Method Class.getMethod(String, Class[])>
	//   81  157:aload_0         
	//   82  158:iconst_0        
	//   83  159:anewarray       Object[]
	//   84  162:invokevirtual   #287 <Method Object Method.invoke(Object, Object[])>
	//   85  165:astore_1        
			}
	//*  86  166:aload_1         
	//*  87  167:areturn         
			// Misplaced declaration of an exception variable
			catch(Field field)
	//*  88  168:astore_1        
			{
				throw new RuntimeException(((Throwable) (field)));
	//   89  169:new             #289 <Class RuntimeException>
	//   90  172:dup             
	//   91  173:aload_1         
	//   92  174:invokespecial   #292 <Method void RuntimeException(Throwable)>
	//   93  177:athrow          
			}
			return ((Object) (field));
		} else
		{
			return getValueObject(field.getOutputFieldName());
	//   94  178:aload_0         
	//   95  179:aload_1         
	//   96  180:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   97  183:invokevirtual   #236 <Method Object getValueObject(String)>
	//   98  186:areturn         
		}
	}

	protected Object getOriginalValue(Field field, Object obj)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          13
			return field.convertBack(obj);
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #300 <Method Object FastJsonResponse$Field.convertBack(Object)>
	//    6   12:areturn         
		else
			return obj;
	//    7   13:aload_2         
	//    8   14:areturn         
	}

	public PostProcessor getPostProcessor()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] getResponseBody()
	{
		byte abyte0[];
		byte abyte1[];
		Preconditions.checkState(zzwm);
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field boolean zzwm>
	//    2    4:invokestatic    #311 <Method void Preconditions.checkState(boolean)>
		abyte1 = null;
	//    3    7:aconst_null     
	//    4    8:astore          4
		abyte0 = null;
	//    5   10:aconst_null     
	//    6   11:astore_2        
		int i;
		Object obj;
		try
		{
			obj = ((Object) (new GZIPInputStream(((InputStream) (new ByteArrayInputStream(zzwl))))));
	//    7   12:new             #45  <Class GZIPInputStream>
	//    8   15:dup             
	//    9   16:new             #34  <Class ByteArrayInputStream>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:getfield        #313 <Field byte[] zzwl>
	//   13   24:invokespecial   #37  <Method void ByteArrayInputStream(byte[])>
	//   14   27:invokespecial   #48  <Method void GZIPInputStream(InputStream)>
	//   15   30:astore_3        
		}
	//*  16   31:sipush          4096
	//*  17   34:newarray        byte[]
	//*  18   36:astore_2        
	//*  19   37:new             #315 <Class ByteArrayOutputStream>
	//*  20   40:dup             
	//*  21   41:invokespecial   #316 <Method void ByteArrayOutputStream()>
	//*  22   44:astore          4
	//*  23   46:aload_3         
	//*  24   47:aload_2         
	//*  25   48:iconst_0        
	//*  26   49:sipush          4096
	//*  27   52:invokevirtual   #322 <Method int InputStream.read(byte[], int, int)>
	//*  28   55:istore_1        
	//*  29   56:iload_1         
	//*  30   57:iconst_m1       
	//*  31   58:icmpeq          72
	//*  32   61:aload           4
	//*  33   63:aload_2         
	//*  34   64:iconst_0        
	//*  35   65:iload_1         
	//*  36   66:invokevirtual   #326 <Method void ByteArrayOutputStream.write(byte[], int, int)>
	//*  37   69:goto            46
	//*  38   72:aload           4
	//*  39   74:invokevirtual   #329 <Method void ByteArrayOutputStream.flush()>
	//*  40   77:aload           4
	//*  41   79:invokevirtual   #332 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  42   82:astore_2        
	//*  43   83:aload_3         
	//*  44   84:invokevirtual   #335 <Method void InputStream.close()>
	//*  45   87:aload_2         
	//*  46   88:areturn         
	//*  47   89:astore_2        
	//*  48   90:goto            125
	//*  49   93:goto            106
	//*  50   96:astore          4
	//*  51   98:aload_2         
	//*  52   99:astore_3        
	//*  53  100:aload           4
	//*  54  102:astore_2        
	//*  55  103:goto            125
	//*  56  106:aload_3         
	//*  57  107:astore_2        
	//*  58  108:aload_0         
	//*  59  109:getfield        #313 <Field byte[] zzwl>
	//*  60  112:astore          4
	//*  61  114:aload_3         
	//*  62  115:ifnull          122
	//*  63  118:aload_3         
	//*  64  119:invokevirtual   #335 <Method void InputStream.close()>
	//*  65  122:aload           4
	//*  66  124:areturn         
	//*  67  125:aload_3         
	//*  68  126:ifnull          133
	//*  69  129:aload_3         
	//*  70  130:invokevirtual   #335 <Method void InputStream.close()>
	//*  71  133:aload_2         
	//*  72  134:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  73  135:astore_2        
		{
			obj = ((Object) (abyte1));
	//   74  136:aload           4
	//   75  138:astore_3        
			continue; /* Loop/switch isn't completed */
	//   76  139:goto            106
		}
		abyte0 = new byte[4096];
		abyte1 = ((byte []) (new ByteArrayOutputStream()));
_L1:
		i = ((InputStream) (obj)).read(abyte0, 0, 4096);
		if(i == -1)
			break MISSING_BLOCK_LABEL_72;
		((ByteArrayOutputStream) (abyte1)).write(abyte0, 0, i);
		  goto _L1
		((ByteArrayOutputStream) (abyte1)).flush();
		abyte0 = ((ByteArrayOutputStream) (abyte1)).toByteArray();
		try
		{
			((InputStream) (obj)).close();
		}
	//*  77  142:astore_2        
	//*  78  143:goto            93
		catch(IOException ioexception1)
	//*  79  146:astore_3        
		{
			return abyte0;
	//   80  147:aload_2         
	//   81  148:areturn         
		}
		return abyte0;
		abyte0;
		  goto _L2
		abyte1;
		obj = ((Object) (abyte0));
		abyte0 = abyte1;
		  goto _L2
_L4:
		abyte0 = ((byte []) (obj));
		abyte1 = zzwl;
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			catch(IOException ioexception)
	//*  82  149:astore_2        
			{
				return abyte1;
	//   83  150:aload           4
	//   84  152:areturn         
			}
		return abyte1;
_L2:
		if(obj != null)
			try
			{
				((InputStream) (obj)).close();
			}
			catch(IOException ioexception2) { }
	//   85  153:astore_3        
		throw abyte0;
		abyte0;
		if(true) goto _L4; else goto _L3
_L3:
	//*  86  154:goto            133
	}

	public int getResponseCode()
	{
		Preconditions.checkState(zzwm);
	//    0    0:aload_0         
	//    1    1:getfield        #308 <Field boolean zzwm>
	//    2    4:invokestatic    #311 <Method void Preconditions.checkState(boolean)>
		return zzwk;
	//    3    7:aload_0         
	//    4    8:getfield        #338 <Field int zzwk>
	//    5   11:ireturn         
	}

	protected abstract Object getValueObject(String s);

	protected boolean isConcreteTypeArrayFieldSet(String s)
	{
		throw new UnsupportedOperationException("Concrete type arrays not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #342 <String "Concrete type arrays not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected boolean isConcreteTypeFieldSet(String s)
	{
		throw new UnsupportedOperationException("Concrete types not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #345 <String "Concrete types not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected boolean isFieldSet(Field field)
	{
		if(field.getTypeOut() == 11)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #62  <Method int FastJsonResponse$Field.getTypeOut()>
	//*   2    4:bipush          11
	//*   3    6:icmpne          34
		{
			if(field.isTypeOutArray())
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #247 <Method boolean FastJsonResponse$Field.isTypeOutArray()>
	//*   6   13:ifeq            25
				return isConcreteTypeArrayFieldSet(field.getOutputFieldName());
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   10   21:invokevirtual   #349 <Method boolean isConcreteTypeArrayFieldSet(String)>
	//   11   24:ireturn         
			else
				return isConcreteTypeFieldSet(field.getOutputFieldName());
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   15   30:invokevirtual   #351 <Method boolean isConcreteTypeFieldSet(String)>
	//   16   33:ireturn         
		} else
		{
			return isPrimitiveFieldSet(field.getOutputFieldName());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   20   39:invokevirtual   #354 <Method boolean isPrimitiveFieldSet(String)>
	//   21   42:ireturn         
		}
	}

	protected abstract boolean isPrimitiveFieldSet(String s);

	public void parseNetworkResponse(int i, byte abyte0[])
		throws FastParser.ParseException
	{
		InputStream inputstream;
		zzwk = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #338 <Field int zzwk>
		zzwl = abyte0;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #313 <Field byte[] zzwl>
		zzwm = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #308 <Field boolean zzwm>
		inputstream = getUnzippedStream(abyte0);
	//    9   15:aload_2         
	//   10   16:invokestatic    #360 <Method InputStream getUnzippedStream(byte[])>
	//   11   19:astore_3        
		(new FastParser()).parse(inputstream, this);
	//   12   20:new             #362 <Class FastParser>
	//   13   23:dup             
	//   14   24:invokespecial   #363 <Method void FastParser()>
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #367 <Method void FastParser.parse(InputStream, FastJsonResponse)>
		try
		{
			inputstream.close();
	//   18   32:aload_3         
	//   19   33:invokevirtual   #335 <Method void InputStream.close()>
			return;
	//   20   36:return          
		}
	//*  21   37:astore_2        
	//*  22   38:aload_3         
	//*  23   39:invokevirtual   #335 <Method void InputStream.close()>
	//*  24   42:aload_2         
	//*  25   43:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  26   44:astore_2        
		{
			return;
	//   27   45:return          
		}
		abyte0;
		try
		{
			inputstream.close();
		}
		catch(IOException ioexception) { }
	//   28   46:astore_3        
		throw abyte0;
	//*  29   47:goto            42
	}

	public final void setBigDecimal(Field field, BigDecimal bigdecimal)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (bigdecimal)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setBigDecimalInternal(field, field.getOutputFieldName(), bigdecimal);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #115 <Method void setBigDecimalInternal(FastJsonResponse$Field, String, BigDecimal)>
			return;
	//   14   24:return          
		}
	}

	protected void setBigDecimal(String s, BigDecimal bigdecimal)
	{
		throw new UnsupportedOperationException("BigDecimal not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #377 <String "BigDecimal not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBigDecimalInternal(Field field, String s, BigDecimal bigdecimal)
	{
		setBigDecimal(s, bigdecimal);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #379 <Method void setBigDecimal(String, BigDecimal)>
	//    4    6:return          
	}

	public final void setBigDecimals(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setBigDecimalsInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #385 <Method void setBigDecimalsInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setBigDecimals(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("BigDecimal list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #388 <String "BigDecimal list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBigDecimalsInternal(Field field, String s, ArrayList arraylist)
	{
		setBigDecimals(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #391 <Method void setBigDecimals(String, ArrayList)>
	//    4    6:return          
	}

	public final void setBigInteger(Field field, BigInteger biginteger)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (biginteger)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setBigIntegerInternal(field, field.getOutputFieldName(), biginteger);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #141 <Method void setBigIntegerInternal(FastJsonResponse$Field, String, BigInteger)>
			return;
	//   14   24:return          
		}
	}

	protected void setBigInteger(String s, BigInteger biginteger)
	{
		throw new UnsupportedOperationException("BigInteger not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #398 <String "BigInteger not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBigIntegerInternal(Field field, String s, BigInteger biginteger)
	{
		setBigInteger(s, biginteger);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #400 <Method void setBigInteger(String, BigInteger)>
	//    4    6:return          
	}

	public final void setBigIntegers(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setBigIntegersInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #405 <Method void setBigIntegersInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setBigIntegers(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("BigInteger list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #408 <String "BigInteger list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBigIntegersInternal(Field field, String s, ArrayList arraylist)
	{
		setBigIntegers(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #411 <Method void setBigIntegers(String, ArrayList)>
	//    4    6:return          
	}

	public final void setBoolean(Field field, boolean flag)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zza(field, ((Object) (Boolean.valueOf(flag))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #417 <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setBooleanInternal(field, field.getOutputFieldName(), flag);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #109 <Method void setBooleanInternal(FastJsonResponse$Field, String, boolean)>
			return;
	//   15   27:return          
		}
	}

	protected void setBoolean(String s, boolean flag)
	{
		throw new UnsupportedOperationException("Boolean not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #421 <String "Boolean not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBooleanInternal(Field field, String s, boolean flag)
	{
		setBoolean(s, flag);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #423 <Method void setBoolean(String, boolean)>
	//    4    6:return          
	}

	public final void setBooleans(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setBooleansInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #428 <Method void setBooleansInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setBooleans(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Boolean list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #431 <String "Boolean list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBooleansInternal(Field field, String s, ArrayList arraylist)
	{
		setBooleans(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #434 <Method void setBooleans(String, ArrayList)>
	//    4    6:return          
	}

	public final void setDecodedBytes(Field field, byte abyte0[])
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (abyte0)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setDecodedBytesInternal(field, field.getOutputFieldName(), abyte0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #93  <Method void setDecodedBytesInternal(FastJsonResponse$Field, String, byte[])>
			return;
	//   14   24:return          
		}
	}

	protected void setDecodedBytes(String s, byte abyte0[])
	{
		throw new UnsupportedOperationException("byte[] not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #441 <String "byte[] not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setDecodedBytesInternal(Field field, String s, byte abyte0[])
	{
		setDecodedBytes(s, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #443 <Method void setDecodedBytes(String, byte[])>
	//    4    6:return          
	}

	public final void setDouble(Field field, double d)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zza(field, ((Object) (Double.valueOf(d))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:dload_2         
	//    6   10:invokestatic    #449 <Method Double Double.valueOf(double)>
	//    7   13:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setDoubleInternal(field, field.getOutputFieldName(), d);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   13   23:dload_2         
	//   14   24:invokevirtual   #125 <Method void setDoubleInternal(FastJsonResponse$Field, String, double)>
			return;
	//   15   27:return          
		}
	}

	protected void setDouble(String s, double d)
	{
		throw new UnsupportedOperationException("Double not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #453 <String "Double not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setDoubleInternal(Field field, String s, double d)
	{
		setDouble(s, d);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:dload_3         
	//    3    3:invokevirtual   #455 <Method void setDouble(String, double)>
	//    4    6:return          
	}

	public final void setDoubles(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setDoublesInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #460 <Method void setDoublesInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setDoubles(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Double list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #463 <String "Double list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setDoublesInternal(Field field, String s, ArrayList arraylist)
	{
		setDoubles(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #466 <Method void setDoubles(String, ArrayList)>
	//    4    6:return          
	}

	public final void setFloat(Field field, float f)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zza(field, ((Object) (Float.valueOf(f))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:fload_2         
	//    6   10:invokestatic    #474 <Method Float Float.valueOf(float)>
	//    7   13:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setFloatInternal(field, field.getOutputFieldName(), f);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   13   23:fload_2         
	//   14   24:invokevirtual   #478 <Method void setFloatInternal(FastJsonResponse$Field, String, float)>
			return;
	//   15   27:return          
		}
	}

	protected void setFloat(String s, float f)
	{
		throw new UnsupportedOperationException("Float not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #482 <String "Float not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setFloatInternal(Field field, String s, float f)
	{
		setFloat(s, f);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #484 <Method void setFloat(String, float)>
	//    4    6:return          
	}

	public final void setFloats(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setFloatsInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #489 <Method void setFloatsInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setFloats(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Float list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #492 <String "Float list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setFloatsInternal(Field field, String s, ArrayList arraylist)
	{
		setFloats(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #495 <Method void setFloats(String, ArrayList)>
	//    4    6:return          
	}

	public final void setInteger(Field field, int i)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zza(field, ((Object) (Integer.valueOf(i))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #501 <Method Integer Integer.valueOf(int)>
	//    7   13:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setIntegerInternal(field, field.getOutputFieldName(), i);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #150 <Method void setIntegerInternal(FastJsonResponse$Field, String, int)>
			return;
	//   15   27:return          
		}
	}

	protected void setInteger(String s, int i)
	{
		throw new UnsupportedOperationException("Integer not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #505 <String "Integer not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setIntegerInternal(Field field, String s, int i)
	{
		setInteger(s, i);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #507 <Method void setInteger(String, int)>
	//    4    6:return          
	}

	public final void setIntegers(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setIntegersInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #512 <Method void setIntegersInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setIntegers(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Integer list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #515 <String "Integer list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setIntegersInternal(Field field, String s, ArrayList arraylist)
	{
		setIntegers(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #518 <Method void setIntegers(String, ArrayList)>
	//    4    6:return          
	}

	public final void setLong(Field field, long l)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zza(field, ((Object) (Long.valueOf(l))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:invokestatic    #524 <Method Long Long.valueOf(long)>
	//    7   13:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setLongInternal(field, field.getOutputFieldName(), l);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   13   23:lload_2         
	//   14   24:invokevirtual   #135 <Method void setLongInternal(FastJsonResponse$Field, String, long)>
			return;
	//   15   27:return          
		}
	}

	protected void setLong(String s, long l)
	{
		throw new UnsupportedOperationException("Long not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #528 <String "Long not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setLongInternal(Field field, String s, long l)
	{
		setLong(s, l);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:lload_3         
	//    3    3:invokevirtual   #530 <Method void setLong(String, long)>
	//    4    6:return          
	}

	public final void setLongs(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setLongsInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #535 <Method void setLongsInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setLongs(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Long list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #538 <String "Long list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setLongsInternal(Field field, String s, ArrayList arraylist)
	{
		setLongs(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #541 <Method void setLongs(String, ArrayList)>
	//    4    6:return          
	}

	public final void setString(Field field, String s)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (s)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setStringInternal(field, field.getOutputFieldName(), s);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #99  <Method void setStringInternal(FastJsonResponse$Field, String, String)>
			return;
	//   14   24:return          
		}
	}

	protected void setString(String s, String s1)
	{
		throw new UnsupportedOperationException("String not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #548 <String "String not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setStringInternal(Field field, String s, String s1)
	{
		setString(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #550 <Method void setString(String, String)>
	//    4    6:return          
	}

	public final void setStringMap(Field field, Map map)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (map)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setStringMapInternal(field, field.getOutputFieldName(), map);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #557 <Method void setStringMapInternal(FastJsonResponse$Field, String, Map)>
			return;
	//   14   24:return          
		}
	}

	protected void setStringMap(String s, Map map)
	{
		throw new UnsupportedOperationException("String map not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #561 <String "String map not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setStringMapInternal(Field field, String s, Map map)
	{
		setStringMap(s, map);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #564 <Method void setStringMap(String, Map)>
	//    4    6:return          
	}

	public final void setStrings(Field field, ArrayList arraylist)
	{
		if(Field.zza(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #297 <Method FastJsonResponse$FieldConverter FastJsonResponse$Field.zza(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zza(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #373 <Method void zza(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setStringsInternal(field, field.getOutputFieldName(), arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #54  <Method String FastJsonResponse$Field.getOutputFieldName()>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #569 <Method void setStringsInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void setStrings(String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("String list not supported");
	//    0    0:new             #203 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #572 <String "String list not supported">
	//    3    7:invokespecial   #206 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setStringsInternal(Field field, String s, ArrayList arraylist)
	{
		setStrings(s, arraylist);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #575 <Method void setStrings(String, ArrayList)>
	//    4    6:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder;
		Map map;
		Iterator iterator;
		map = getFieldMappings();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #578 <Method Map getFieldMappings()>
	//    2    4:astore          5
		stringbuilder = new StringBuilder(100);
	//    3    6:new             #64  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:bipush          100
	//    6   12:invokespecial   #67  <Method void StringBuilder(int)>
	//    7   15:astore          4
		iterator = map.keySet().iterator();
	//    8   17:aload           5
	//    9   19:invokeinterface #582 <Method Set Map.keySet()>
	//   10   24:invokeinterface #588 <Method Iterator Set.iterator()>
	//   11   29:astore          6
_L9:
		Field field;
		Object obj2;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   12   31:aload           6
	//   13   33:invokeinterface #593 <Method boolean Iterator.hasNext()>
	//   14   38:ifeq            357
		String s2 = (String)iterator.next();
	//   15   41:aload           6
	//   16   43:invokeinterface #597 <Method Object Iterator.next()>
	//   17   48:checkcast       #95  <Class String>
	//   18   51:astore          8
		field = (Field)map.get(((Object) (s2)));
	//   19   53:aload           5
	//   20   55:aload           8
	//   21   57:invokeinterface #256 <Method Object Map.get(Object)>
	//   22   62:checkcast       #6   <Class FastJsonResponse$Field>
	//   23   65:astore          7
		if(!isFieldSet(field))
			continue; /* Loop/switch isn't completed */
	//   24   67:aload_0         
	//   25   68:aload           7
	//   26   70:invokevirtual   #599 <Method boolean isFieldSet(FastJsonResponse$Field)>
	//   27   73:ifeq            31
		obj2 = getOriginalValue(field, getFieldValue(field));
	//   28   76:aload_0         
	//   29   77:aload           7
	//   30   79:aload_0         
	//   31   80:aload           7
	//   32   82:invokevirtual   #601 <Method Object getFieldValue(FastJsonResponse$Field)>
	//   33   85:invokevirtual   #603 <Method Object getOriginalValue(FastJsonResponse$Field, Object)>
	//   34   88:astore          9
		String s;
		if(stringbuilder.length() == 0)
	//*  35   90:aload           4
	//*  36   92:invokevirtual   #604 <Method int StringBuilder.length()>
	//*  37   95:ifne            112
			s = "{";
	//   38   98:ldc2            #606 <String "{">
	//   39  101:astore_3        
		else
	//*  40  102:aload           4
	//*  41  104:aload_3         
	//*  42  105:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  43  108:pop             
	//*  44  109:goto            119
			s = ",";
	//   45  112:ldc2            #608 <String ",">
	//   46  115:astore_3        
		stringbuilder.append(s);
	//*  47  116:goto            102
		stringbuilder.append("\"");
	//   48  119:aload           4
	//   49  121:ldc1            #17  <String "\"">
	//   50  123:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   51  126:pop             
		stringbuilder.append(s2);
	//   52  127:aload           4
	//   53  129:aload           8
	//   54  131:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   55  134:pop             
		stringbuilder.append("\":");
	//   56  135:aload           4
	//   57  137:ldc2            #610 <String "\":">
	//   58  140:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   59  143:pop             
		if(obj2 != null) goto _L2; else goto _L1
	//   60  144:aload           9
	//   61  146:ifnonnull       163
_L1:
		Object obj = "null";
	//   62  149:ldc2            #612 <String "null">
	//   63  152:astore_3        
_L7:
		stringbuilder.append(((String) (obj)));
	//   64  153:aload           4
	//   65  155:aload_3         
	//   66  156:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   67  159:pop             
		continue; /* Loop/switch isn't completed */
	//   68  160:goto            31
_L2:
		field.getTypeOut();
	//   69  163:aload           7
	//   70  165:invokevirtual   #62  <Method int FastJsonResponse$Field.getTypeOut()>
		JVM INSTR tableswitch 8 10: default 196
	//	               8 262
	//	               9 242
	//	               10 229;
	//   71  168:tableswitch     8 10: default 196
	//	               8 262
	//	               9 242
	//	               10 229
		   goto _L3 _L4 _L5 _L6
	//*  72  196:aload           7
	//*  73  198:invokevirtual   #615 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//*  74  201:ifeq            345
	//*  75  204:aload           9
	//*  76  206:checkcast       #617 <Class ArrayList>
	//*  77  209:astore_3        
	//*  78  210:aload           4
	//*  79  212:ldc2            #619 <String "[">
	//*  80  215:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//*  81  218:pop             
	//*  82  219:iconst_0        
	//*  83  220:istore_1        
	//*  84  221:aload_3         
	//*  85  222:invokevirtual   #622 <Method int ArrayList.size()>
	//*  86  225:istore_2        
	//*  87  226:goto            292
_L6:
		MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj2);
	//   88  229:aload           4
	//   89  231:aload           9
	//   90  233:checkcast       #624 <Class HashMap>
	//   91  236:invokestatic    #630 <Method void MapUtils.writeStringMapToJson(StringBuilder, HashMap)>
		continue; /* Loop/switch isn't completed */
	//   92  239:goto            31
_L5:
		stringbuilder.append("\"");
	//   93  242:aload           4
	//   94  244:ldc1            #17  <String "\"">
	//   95  246:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//   96  249:pop             
		obj = ((Object) (Base64Utils.encodeUrlSafe((byte[])obj2)));
	//   97  250:aload           9
	//   98  252:checkcast       #89  <Class byte[]>
	//   99  255:invokestatic    #636 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//  100  258:astore_3        
		break; /* Loop/switch isn't completed */
	//  101  259:goto            279
_L4:
		stringbuilder.append("\"");
	//  102  262:aload           4
	//  103  264:ldc1            #17  <String "\"">
	//  104  266:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  105  269:pop             
		obj = ((Object) (Base64Utils.encode((byte[])obj2)));
	//  106  270:aload           9
	//  107  272:checkcast       #89  <Class byte[]>
	//  108  275:invokestatic    #639 <Method String Base64Utils.encode(byte[])>
	//  109  278:astore_3        
		stringbuilder.append(((String) (obj)));
	//  110  279:aload           4
	//  111  281:aload_3         
	//  112  282:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  113  285:pop             
		obj = "\"";
	//  114  286:ldc1            #17  <String "\"">
	//  115  288:astore_3        
		  goto _L7
_L3:
		if(!field.isTypeInArray())
			break MISSING_BLOCK_LABEL_345;
		obj = ((Object) ((ArrayList)obj2));
		stringbuilder.append("[");
		int i = 0;
		for(int j = ((ArrayList) (obj)).size(); i < j; i++)
	//* 116  289:goto            153
	//* 117  292:iload_1         
	//* 118  293:iload_2         
	//* 119  294:icmpge          338
		{
			if(i > 0)
	//* 120  297:iload_1         
	//* 121  298:ifle            310
				stringbuilder.append(",");
	//  122  301:aload           4
	//  123  303:ldc2            #608 <String ",">
	//  124  306:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//  125  309:pop             
			Object obj1 = ((ArrayList) (obj)).get(i);
	//  126  310:aload_3         
	//  127  311:iload_1         
	//  128  312:invokevirtual   #642 <Method Object ArrayList.get(int)>
	//  129  315:astore          8
			if(obj1 != null)
	//* 130  317:aload           8
	//* 131  319:ifnull          331
				zza(stringbuilder, field, obj1);
	//  132  322:aload           4
	//  133  324:aload           7
	//  134  326:aload           8
	//  135  328:invokestatic    #644 <Method void zza(StringBuilder, FastJsonResponse$Field, Object)>
		}

	//  136  331:iload_1         
	//  137  332:iconst_1        
	//  138  333:iadd            
	//  139  334:istore_1        
	//* 140  335:goto            292
		obj = "]";
	//  141  338:ldc2            #646 <String "]">
	//  142  341:astore_3        
		  goto _L7
	//* 143  342:goto            153
		zza(stringbuilder, field, obj2);
	//  144  345:aload           4
	//  145  347:aload           7
	//  146  349:aload           9
	//  147  351:invokestatic    #644 <Method void zza(StringBuilder, FastJsonResponse$Field, Object)>
		if(true) goto _L9; else goto _L8
	//  148  354:goto            31
_L8:
		String s1;
		if(stringbuilder.length() > 0)
	//* 149  357:aload           4
	//* 150  359:invokevirtual   #604 <Method int StringBuilder.length()>
	//* 151  362:ifle            379
			s1 = "}";
	//  152  365:ldc2            #648 <String "}">
	//  153  368:astore_3        
		else
	//* 154  369:aload           4
	//* 155  371:aload_3         
	//* 156  372:invokevirtual   #73  <Method StringBuilder StringBuilder.append(String)>
	//* 157  375:pop             
	//* 158  376:goto            386
			s1 = "{}";
	//  159  379:ldc2            #650 <String "{}">
	//  160  382:astore_3        
		stringbuilder.append(s1);
	//* 161  383:goto            369
		return stringbuilder.toString();
	//  162  386:aload           4
	//  163  388:invokevirtual   #81  <Method String StringBuilder.toString()>
	//  164  391:areturn         
	}

	protected static final String QUOTE = "\"";
	private int zzwk;
	private byte zzwl[];
	private boolean zzwm;
}
