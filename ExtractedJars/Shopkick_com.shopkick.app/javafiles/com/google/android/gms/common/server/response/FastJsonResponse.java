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
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.*;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			zai, SafeParcelResponse, zak

public abstract class FastJsonResponse
{
	public static class Field extends AbstractSafeParcelable
	{

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
		//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
		//   11   17:areturn         
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
		//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
		//   11   15:areturn         
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
		//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
		//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
		//   11   17:areturn         
		}

		public static Field withConverter(String s, int i, FieldConverter fieldconverter, boolean flag)
		{
			return new Field(fieldconverter.zacj(), flag, fieldconverter.zack(), false, s, i, ((Class) (null)), fieldconverter);
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:aload_2         
		//    3    5:invokeinterface #144 <Method int FastJsonResponse$FieldConverter.zacj()>
		//    4   10:iload_3         
		//    5   11:aload_2         
		//    6   12:invokeinterface #147 <Method int FastJsonResponse$FieldConverter.zack()>
		//    7   17:iconst_0        
		//    8   18:aload_0         
		//    9   19:iload_1         
		//   10   20:aconst_null     
		//   11   21:aload_2         
		//   12   22:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
		//   13   25:areturn         
		}

		static FieldConverter zaa(Field field)
		{
			return field.zapz;
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//    2    4:areturn         
		}

		private final String zacm()
		{
			String s = zapx;
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field String zapx>
		//    2    4:astore_1        
			if(s == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return s;
		//    7   11:aload_1         
		//    8   12:areturn         
		}

		private final zaa zaco()
		{
			FieldConverter fieldconverter = zapz;
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//    2    4:astore_1        
			if(fieldconverter == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return com.google.android.gms.common.server.converter.zaa.zaa(fieldconverter);
		//    7   11:aload_1         
		//    8   12:invokestatic    #156 <Method zaa zaa.zaa(FastJsonResponse$FieldConverter)>
		//    9   15:areturn         
		}

		public final Object convert(Object obj)
		{
			return zapz.convert(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//    2    4:aload_1         
		//    3    5:invokeinterface #160 <Method Object FastJsonResponse$FieldConverter.convert(Object)>
		//    4   10:areturn         
		}

		public final Object convertBack(Object obj)
		{
			return zapz.convertBack(obj);
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//    2    4:aload_1         
		//    3    5:invokeinterface #164 <Method Object FastJsonResponse$FieldConverter.convertBack(Object)>
		//    4   10:areturn         
		}

		public int getSafeParcelableFieldId()
		{
			return zapv;
		//    0    0:aload_0         
		//    1    1:getfield        #87  <Field int zapv>
		//    2    4:ireturn         
		}

		public String toString()
		{
			com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(((Object) (this))).add("versionCode", ((Object) (Integer.valueOf(zale)))).add("typeIn", ((Object) (Integer.valueOf(zapq)))).add("typeInArray", ((Object) (Boolean.valueOf(zapr)))).add("typeOut", ((Object) (Integer.valueOf(zaps)))).add("typeOutArray", ((Object) (Boolean.valueOf(zapt)))).add("outputFieldName", ((Object) (zapu))).add("safeParcelFieldId", ((Object) (Integer.valueOf(zapv)))).add("concreteTypeName", ((Object) (zacm())));
		//    0    0:aload_0         
		//    1    1:invokestatic    #172 <Method com.google.android.gms.common.internal.Objects$ToStringHelper Objects.toStringHelper(Object)>
		//    2    4:ldc1            #174 <String "versionCode">
		//    3    6:aload_0         
		//    4    7:getfield        #75  <Field int zale>
		//    5   10:invokestatic    #180 <Method Integer Integer.valueOf(int)>
		//    6   13:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//    7   16:ldc1            #188 <String "typeIn">
		//    8   18:aload_0         
		//    9   19:getfield        #77  <Field int zapq>
		//   10   22:invokestatic    #180 <Method Integer Integer.valueOf(int)>
		//   11   25:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   12   28:ldc1            #190 <String "typeInArray">
		//   13   30:aload_0         
		//   14   31:getfield        #79  <Field boolean zapr>
		//   15   34:invokestatic    #195 <Method Boolean Boolean.valueOf(boolean)>
		//   16   37:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   17   40:ldc1            #197 <String "typeOut">
		//   18   42:aload_0         
		//   19   43:getfield        #81  <Field int zaps>
		//   20   46:invokestatic    #180 <Method Integer Integer.valueOf(int)>
		//   21   49:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   22   52:ldc1            #199 <String "typeOutArray">
		//   23   54:aload_0         
		//   24   55:getfield        #83  <Field boolean zapt>
		//   25   58:invokestatic    #195 <Method Boolean Boolean.valueOf(boolean)>
		//   26   61:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   27   64:ldc1            #201 <String "outputFieldName">
		//   28   66:aload_0         
		//   29   67:getfield        #85  <Field String zapu>
		//   30   70:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   31   73:ldc1            #203 <String "safeParcelFieldId">
		//   32   75:aload_0         
		//   33   76:getfield        #87  <Field int zapv>
		//   34   79:invokestatic    #180 <Method Integer Integer.valueOf(int)>
		//   35   82:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   36   85:ldc1            #205 <String "concreteTypeName">
		//   37   87:aload_0         
		//   38   88:invokespecial   #207 <Method String zacm()>
		//   39   91:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   40   94:astore_1        
			Object obj = ((Object) (zapw));
		//   41   95:aload_0         
		//   42   96:getfield        #89  <Field Class zapw>
		//   43   99:astore_2        
			if(obj != null)
		//*  44  100:aload_2         
		//*  45  101:ifnull          115
				tostringhelper.add("concreteType.class", ((Object) (((Class) (obj)).getCanonicalName())));
		//   46  104:aload_1         
		//   47  105:ldc1            #209 <String "concreteType.class">
		//   48  107:aload_2         
		//   49  108:invokevirtual   #110 <Method String Class.getCanonicalName()>
		//   50  111:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   51  114:pop             
			obj = ((Object) (zapz));
		//   52  115:aload_0         
		//   53  116:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//   54  119:astore_2        
			if(obj != null)
		//*  55  120:aload_2         
		//*  56  121:ifnull          138
				tostringhelper.add("converterName", ((Object) (obj.getClass().getCanonicalName())));
		//   57  124:aload_1         
		//   58  125:ldc1            #211 <String "converterName">
		//   59  127:aload_2         
		//   60  128:invokevirtual   #217 <Method Class Object.getClass()>
		//   61  131:invokevirtual   #110 <Method String Class.getCanonicalName()>
		//   62  134:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   63  137:pop             
			return tostringhelper.toString();
		//   64  138:aload_1         
		//   65  139:invokevirtual   #219 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
		//   66  142:areturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			int j = SafeParcelWriter.beginObjectHeader(parcel);
		//    0    0:aload_1         
		//    1    1:invokestatic    #227 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
		//    2    4:istore_3        
			SafeParcelWriter.writeInt(parcel, 1, zale);
		//    3    5:aload_1         
		//    4    6:iconst_1        
		//    5    7:aload_0         
		//    6    8:getfield        #75  <Field int zale>
		//    7   11:invokestatic    #231 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeInt(parcel, 2, zapq);
		//    8   14:aload_1         
		//    9   15:iconst_2        
		//   10   16:aload_0         
		//   11   17:getfield        #77  <Field int zapq>
		//   12   20:invokestatic    #231 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeBoolean(parcel, 3, zapr);
		//   13   23:aload_1         
		//   14   24:iconst_3        
		//   15   25:aload_0         
		//   16   26:getfield        #79  <Field boolean zapr>
		//   17   29:invokestatic    #235 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
			SafeParcelWriter.writeInt(parcel, 4, zaps);
		//   18   32:aload_1         
		//   19   33:iconst_4        
		//   20   34:aload_0         
		//   21   35:getfield        #81  <Field int zaps>
		//   22   38:invokestatic    #231 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeBoolean(parcel, 5, zapt);
		//   23   41:aload_1         
		//   24   42:iconst_5        
		//   25   43:aload_0         
		//   26   44:getfield        #83  <Field boolean zapt>
		//   27   47:invokestatic    #235 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
			SafeParcelWriter.writeString(parcel, 6, zapu, false);
		//   28   50:aload_1         
		//   29   51:bipush          6
		//   30   53:aload_0         
		//   31   54:getfield        #85  <Field String zapu>
		//   32   57:iconst_0        
		//   33   58:invokestatic    #239 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
			SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
		//   34   61:aload_1         
		//   35   62:bipush          7
		//   36   64:aload_0         
		//   37   65:invokevirtual   #241 <Method int getSafeParcelableFieldId()>
		//   38   68:invokestatic    #231 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
			SafeParcelWriter.writeString(parcel, 8, zacm(), false);
		//   39   71:aload_1         
		//   40   72:bipush          8
		//   41   74:aload_0         
		//   42   75:invokespecial   #207 <Method String zacm()>
		//   43   78:iconst_0        
		//   44   79:invokestatic    #239 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
			SafeParcelWriter.writeParcelable(parcel, 9, ((android.os.Parcelable) (zaco())), i, false);
		//   45   82:aload_1         
		//   46   83:bipush          9
		//   47   85:aload_0         
		//   48   86:invokespecial   #243 <Method zaa zaco()>
		//   49   89:iload_2         
		//   50   90:iconst_0        
		//   51   91:invokestatic    #247 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
			SafeParcelWriter.finishObjectHeader(parcel, j);
		//   52   94:aload_1         
		//   53   95:iload_3         
		//   54   96:invokestatic    #250 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		//   55   99:return          
		}

		public final void zaa(zak zak1)
		{
			zapy = zak1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #253 <Field zak zapy>
		//    3    5:return          
		}

		public final Field zacl()
		{
			return new Field(zale, zapq, zapr, zaps, zapt, zapu, zapv, zapx, zaco());
		//    0    0:new             #2   <Class FastJsonResponse$Field>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #75  <Field int zale>
		//    4    8:aload_0         
		//    5    9:getfield        #77  <Field int zapq>
		//    6   12:aload_0         
		//    7   13:getfield        #79  <Field boolean zapr>
		//    8   16:aload_0         
		//    9   17:getfield        #81  <Field int zaps>
		//   10   20:aload_0         
		//   11   21:getfield        #83  <Field boolean zapt>
		//   12   24:aload_0         
		//   13   25:getfield        #85  <Field String zapu>
		//   14   28:aload_0         
		//   15   29:getfield        #87  <Field int zapv>
		//   16   32:aload_0         
		//   17   33:getfield        #91  <Field String zapx>
		//   18   36:aload_0         
		//   19   37:invokespecial   #243 <Method zaa zaco()>
		//   20   40:invokespecial   #257 <Method void FastJsonResponse$Field(int, int, boolean, int, boolean, String, int, String, zaa)>
		//   21   43:areturn         
		}

		public final boolean zacn()
		{
			return zapz != null;
		//    0    0:aload_0         
		//    1    1:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public final FastJsonResponse zacp()
			throws InstantiationException, IllegalAccessException
		{
			Class class1 = zapw;
		//    0    0:aload_0         
		//    1    1:getfield        #89  <Field Class zapw>
		//    2    4:astore_1        
			if(class1 == com/google/android/gms/common/server/response/SafeParcelResponse)
		//*   3    5:aload_1         
		//*   4    6:ldc1            #93  <Class SafeParcelResponse>
		//*   5    8:if_acmpne       38
			{
				Preconditions.checkNotNull(((Object) (zapy)), "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
		//    6   11:aload_0         
		//    7   12:getfield        #253 <Field zak zapy>
		//    8   15:ldc2            #268 <String "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.">
		//    9   18:invokestatic    #274 <Method Object Preconditions.checkNotNull(Object, Object)>
		//   10   21:pop             
				return ((FastJsonResponse) (new SafeParcelResponse(zapy, zapx)));
		//   11   22:new             #93  <Class SafeParcelResponse>
		//   12   25:dup             
		//   13   26:aload_0         
		//   14   27:getfield        #253 <Field zak zapy>
		//   15   30:aload_0         
		//   16   31:getfield        #91  <Field String zapx>
		//   17   34:invokespecial   #277 <Method void SafeParcelResponse(zak, String)>
		//   18   37:areturn         
			} else
			{
				return (FastJsonResponse)class1.newInstance();
		//   19   38:aload_1         
		//   20   39:invokevirtual   #281 <Method Object Class.newInstance()>
		//   21   42:checkcast       #7   <Class FastJsonResponse>
		//   22   45:areturn         
			}
		}

		public final Map zacq()
		{
			Preconditions.checkNotNull(((Object) (zapx)));
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field String zapx>
		//    2    4:invokestatic    #286 <Method Object Preconditions.checkNotNull(Object)>
		//    3    7:pop             
			Preconditions.checkNotNull(((Object) (zapy)));
		//    4    8:aload_0         
		//    5    9:getfield        #253 <Field zak zapy>
		//    6   12:invokestatic    #286 <Method Object Preconditions.checkNotNull(Object)>
		//    7   15:pop             
			return zapy.zai(zapx);
		//    8   16:aload_0         
		//    9   17:getfield        #253 <Field zak zapy>
		//   10   20:aload_0         
		//   11   21:getfield        #91  <Field String zapx>
		//   12   24:invokevirtual   #292 <Method Map zak.zai(String)>
		//   13   27:areturn         
		}

		public static final zai CREATOR = new zai();
		private final int zale;
		protected final int zapq;
		protected final boolean zapr;
		protected final int zaps;
		protected final boolean zapt;
		protected final String zapu;
		protected final int zapv;
		protected final Class zapw;
		private final String zapx;
		private zak zapy;
		private FieldConverter zapz;

		static 
		{
		//    0    0:new             #63  <Class zai>
		//    1    3:dup             
		//    2    4:invokespecial   #66  <Method void zai()>
		//    3    7:putstatic       #68  <Field zai CREATOR>
		//*   4   10:return          
		}

		Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
				String s1, zaa zaa1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void AbstractSafeParcelable()>
			zale = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #75  <Field int zale>
			zapq = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #77  <Field int zapq>
			zapr = flag;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #79  <Field boolean zapr>
			zaps = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #81  <Field int zaps>
			zapt = flag1;
		//   14   25:aload_0         
		//   15   26:iload           5
		//   16   28:putfield        #83  <Field boolean zapt>
			zapu = s;
		//   17   31:aload_0         
		//   18   32:aload           6
		//   19   34:putfield        #85  <Field String zapu>
			zapv = l;
		//   20   37:aload_0         
		//   21   38:iload           7
		//   22   40:putfield        #87  <Field int zapv>
			if(s1 == null)
		//*  23   43:aload           8
		//*  24   45:ifnonnull       61
			{
				zapw = null;
		//   25   48:aload_0         
		//   26   49:aconst_null     
		//   27   50:putfield        #89  <Field Class zapw>
				zapx = null;
		//   28   53:aload_0         
		//   29   54:aconst_null     
		//   30   55:putfield        #91  <Field String zapx>
			} else
		//*  31   58:goto            73
			{
				zapw = com/google/android/gms/common/server/response/SafeParcelResponse;
		//   32   61:aload_0         
		//   33   62:ldc1            #93  <Class SafeParcelResponse>
		//   34   64:putfield        #89  <Field Class zapw>
				zapx = s1;
		//   35   67:aload_0         
		//   36   68:aload           8
		//   37   70:putfield        #91  <Field String zapx>
			}
			if(zaa1 == null)
		//*  38   73:aload           9
		//*  39   75:ifnonnull       84
			{
				zapz = null;
		//   40   78:aload_0         
		//   41   79:aconst_null     
		//   42   80:putfield        #95  <Field FastJsonResponse$FieldConverter zapz>
				return;
		//   43   83:return          
			} else
			{
				zapz = zaa1.zaci();
		//   44   84:aload_0         
		//   45   85:aload           9
		//   46   87:invokevirtual   #101 <Method FastJsonResponse$FieldConverter zaa.zaci()>
		//   47   90:putfield        #95  <Field FastJsonResponse$FieldConverter zapz>
				return;
		//   48   93:return          
			}
		}

		private Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
				FieldConverter fieldconverter)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #73  <Method void AbstractSafeParcelable()>
			zale = 1;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #75  <Field int zale>
			zapq = i;
		//    5    9:aload_0         
		//    6   10:iload_1         
		//    7   11:putfield        #77  <Field int zapq>
			zapr = flag;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #79  <Field boolean zapr>
			zaps = j;
		//   11   19:aload_0         
		//   12   20:iload_3         
		//   13   21:putfield        #81  <Field int zaps>
			zapt = flag1;
		//   14   24:aload_0         
		//   15   25:iload           4
		//   16   27:putfield        #83  <Field boolean zapt>
			zapu = s;
		//   17   30:aload_0         
		//   18   31:aload           5
		//   19   33:putfield        #85  <Field String zapu>
			zapv = k;
		//   20   36:aload_0         
		//   21   37:iload           6
		//   22   39:putfield        #87  <Field int zapv>
			zapw = class1;
		//   23   42:aload_0         
		//   24   43:aload           7
		//   25   45:putfield        #89  <Field Class zapw>
			if(class1 == null)
		//*  26   48:aload           7
		//*  27   50:ifnonnull       61
				zapx = null;
		//   28   53:aload_0         
		//   29   54:aconst_null     
		//   30   55:putfield        #91  <Field String zapx>
			else
		//*  31   58:goto            70
				zapx = class1.getCanonicalName();
		//   32   61:aload_0         
		//   33   62:aload           7
		//   34   64:invokevirtual   #110 <Method String Class.getCanonicalName()>
		//   35   67:putfield        #91  <Field String zapx>
			zapz = fieldconverter;
		//   36   70:aload_0         
		//   37   71:aload           8
		//   38   73:putfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//   39   76:return          
		}
	}

	public static interface FieldConverter
	{

		public abstract Object convert(Object obj);

		public abstract Object convertBack(Object obj);

		public abstract int zacj();

		public abstract int zack();
	}


	public FastJsonResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	private final void zaa(Field field, Object obj)
	{
		String s = field.zapu;
	//    0    0:aload_1         
	//    1    1:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//    2    4:astore          4
		obj = field.convert(obj);
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #27  <Method Object FastJsonResponse$Field.convert(Object)>
	//    6   11:astore_2        
		switch(field.zaps)
	//*   7   12:aload_1         
	//*   8   13:getfield        #31  <Field int FastJsonResponse$Field.zaps>
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
			int i = field.zaps;
	//   10   72:aload_1         
	//   11   73:getfield        #31  <Field int FastJsonResponse$Field.zaps>
	//   12   76:istore_3        
			field = ((Field) (new StringBuilder(44)));
	//   13   77:new             #33  <Class StringBuilder>
	//   14   80:dup             
	//   15   81:bipush          44
	//   16   83:invokespecial   #36  <Method void StringBuilder(int)>
	//   17   86:astore_1        
			((StringBuilder) (field)).append("Unsupported type for conversion: ");
	//   18   87:aload_1         
	//   19   88:ldc1            #38  <String "Unsupported type for conversion: ">
	//   20   90:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   21   93:pop             
			((StringBuilder) (field)).append(i);
	//   22   94:aload_1         
	//   23   95:iload_3         
	//   24   96:invokevirtual   #45  <Method StringBuilder StringBuilder.append(int)>
	//   25   99:pop             
			throw new IllegalStateException(((StringBuilder) (field)).toString());
	//   26  100:new             #47  <Class IllegalStateException>
	//   27  103:dup             
	//   28  104:aload_1         
	//   29  105:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   30  108:invokespecial   #54  <Method void IllegalStateException(String)>
	//   31  111:athrow          

		case 8: // '\b'
		case 9: // '\t'
			if(zaa(s, obj))
	//*  32  112:aload           4
	//*  33  114:aload_2         
	//*  34  115:invokestatic    #57  <Method boolean zaa(String, Object)>
	//*  35  118:ifeq            265
			{
				setDecodedBytesInternal(field, s, (byte[])obj);
	//   36  121:aload_0         
	//   37  122:aload_1         
	//   38  123:aload           4
	//   39  125:aload_2         
	//   40  126:checkcast       #59  <Class byte[]>
	//   41  129:invokevirtual   #63  <Method void setDecodedBytesInternal(FastJsonResponse$Field, String, byte[])>
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
	//   47  138:checkcast       #65  <Class String>
	//   48  141:invokevirtual   #69  <Method void setStringInternal(FastJsonResponse$Field, String, String)>
			return;
	//   49  144:return          

		case 6: // '\006'
			if(zaa(s, obj))
	//*  50  145:aload           4
	//*  51  147:aload_2         
	//*  52  148:invokestatic    #57  <Method boolean zaa(String, Object)>
	//*  53  151:ifeq            265
			{
				setBooleanInternal(field, s, ((Boolean)obj).booleanValue());
	//   54  154:aload_0         
	//   55  155:aload_1         
	//   56  156:aload           4
	//   57  158:aload_2         
	//   58  159:checkcast       #71  <Class Boolean>
	//   59  162:invokevirtual   #75  <Method boolean Boolean.booleanValue()>
	//   60  165:invokevirtual   #79  <Method void setBooleanInternal(FastJsonResponse$Field, String, boolean)>
				return;
	//   61  168:return          
			}
			break;

		case 5: // '\005'
			zaa(field, s, (BigDecimal)obj);
	//   62  169:aload_0         
	//   63  170:aload_1         
	//   64  171:aload           4
	//   65  173:aload_2         
	//   66  174:checkcast       #81  <Class BigDecimal>
	//   67  177:invokevirtual   #84  <Method void zaa(FastJsonResponse$Field, String, BigDecimal)>
			return;
	//   68  180:return          

		case 4: // '\004'
			if(zaa(s, obj))
	//*  69  181:aload           4
	//*  70  183:aload_2         
	//*  71  184:invokestatic    #57  <Method boolean zaa(String, Object)>
	//*  72  187:ifeq            265
			{
				zaa(field, s, ((Double)obj).doubleValue());
	//   73  190:aload_0         
	//   74  191:aload_1         
	//   75  192:aload           4
	//   76  194:aload_2         
	//   77  195:checkcast       #86  <Class Double>
	//   78  198:invokevirtual   #90  <Method double Double.doubleValue()>
	//   79  201:invokevirtual   #93  <Method void zaa(FastJsonResponse$Field, String, double)>
				return;
	//   80  204:return          
			}
			break;

		case 2: // '\002'
			if(zaa(s, obj))
	//*  81  205:aload           4
	//*  82  207:aload_2         
	//*  83  208:invokestatic    #57  <Method boolean zaa(String, Object)>
	//*  84  211:ifeq            265
			{
				setLongInternal(field, s, ((Long)obj).longValue());
	//   85  214:aload_0         
	//   86  215:aload_1         
	//   87  216:aload           4
	//   88  218:aload_2         
	//   89  219:checkcast       #95  <Class Long>
	//   90  222:invokevirtual   #99  <Method long Long.longValue()>
	//   91  225:invokevirtual   #103 <Method void setLongInternal(FastJsonResponse$Field, String, long)>
				return;
	//   92  228:return          
			}
			break;

		case 1: // '\001'
			zaa(field, s, (BigInteger)obj);
	//   93  229:aload_0         
	//   94  230:aload_1         
	//   95  231:aload           4
	//   96  233:aload_2         
	//   97  234:checkcast       #105 <Class BigInteger>
	//   98  237:invokevirtual   #108 <Method void zaa(FastJsonResponse$Field, String, BigInteger)>
			return;
	//   99  240:return          

		case 0: // '\0'
			if(zaa(s, obj))
	//* 100  241:aload           4
	//* 101  243:aload_2         
	//* 102  244:invokestatic    #57  <Method boolean zaa(String, Object)>
	//* 103  247:ifeq            265
			{
				setIntegerInternal(field, s, ((Integer)obj).intValue());
	//  104  250:aload_0         
	//  105  251:aload_1         
	//  106  252:aload           4
	//  107  254:aload_2         
	//  108  255:checkcast       #110 <Class Integer>
	//  109  258:invokevirtual   #114 <Method int Integer.intValue()>
	//  110  261:invokevirtual   #118 <Method void setIntegerInternal(FastJsonResponse$Field, String, int)>
				return;
	//  111  264:return          
			}
			break;
		}
	//  112  265:return          
	}

	private static void zaa(StringBuilder stringbuilder, Field field, Object obj)
	{
		if(field.zapq == 11)
	//*   0    0:aload_1         
	//*   1    1:getfield        #124 <Field int FastJsonResponse$Field.zapq>
	//*   2    4:bipush          11
	//*   3    6:icmpne          29
		{
			stringbuilder.append(((FastJsonResponse)field.zapw.cast(obj)).toString());
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:getfield        #128 <Field Class FastJsonResponse$Field.zapw>
	//    7   14:aload_2         
	//    8   15:invokevirtual   #133 <Method Object Class.cast(Object)>
	//    9   18:checkcast       #2   <Class FastJsonResponse>
	//   10   21:invokevirtual   #134 <Method String toString()>
	//   11   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
			return;
	//   13   28:return          
		}
		if(field.zapq == 7)
	//*  14   29:aload_1         
	//*  15   30:getfield        #124 <Field int FastJsonResponse$Field.zapq>
	//*  16   33:bipush          7
	//*  17   35:icmpne          65
		{
			stringbuilder.append("\"");
	//   18   38:aload_0         
	//   19   39:ldc1            #136 <String "\"">
	//   20   41:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			stringbuilder.append(JsonUtils.escapeString((String)obj));
	//   22   45:aload_0         
	//   23   46:aload_2         
	//   24   47:checkcast       #65  <Class String>
	//   25   50:invokestatic    #142 <Method String JsonUtils.escapeString(String)>
	//   26   53:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append("\"");
	//   28   57:aload_0         
	//   29   58:ldc1            #136 <String "\"">
	//   30   60:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			return;
	//   32   64:return          
		} else
		{
			stringbuilder.append(obj);
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
			return;
	//   37   71:return          
		}
	}

	private static boolean zaa(String s, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       64
		{
			if(Log.isLoggable("FastJsonResponse", 6))
	//*   2    4:ldc1            #147 <String "FastJsonResponse">
	//*   3    6:bipush          6
	//*   4    8:invokestatic    #153 <Method boolean Log.isLoggable(String, int)>
	//*   5   11:ifeq            62
			{
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (s))).length() + 58)));
	//    6   14:new             #33  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:invokestatic    #157 <Method String String.valueOf(Object)>
	//   10   22:invokevirtual   #160 <Method int String.length()>
	//   11   25:bipush          58
	//   12   27:iadd            
	//   13   28:invokespecial   #36  <Method void StringBuilder(int)>
	//   14   31:astore_1        
				((StringBuilder) (obj)).append("Output field (");
	//   15   32:aload_1         
	//   16   33:ldc1            #162 <String "Output field (">
	//   17   35:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
				((StringBuilder) (obj)).append(s);
	//   19   39:aload_1         
	//   20   40:aload_0         
	//   21   41:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
				((StringBuilder) (obj)).append(") has a null value, but expected a primitive");
	//   23   45:aload_1         
	//   24   46:ldc1            #164 <String ") has a null value, but expected a primitive">
	//   25   48:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				Log.e("FastJsonResponse", ((StringBuilder) (obj)).toString());
	//   27   52:ldc1            #147 <String "FastJsonResponse">
	//   28   54:aload_1         
	//   29   55:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   30   58:invokestatic    #168 <Method int Log.e(String, String)>
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

	protected static Object zab(Field field, Object obj)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          13
			return field.convertBack(obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #177 <Method Object FastJsonResponse$Field.convertBack(Object)>
	//    6   12:areturn         
		else
			return obj;
	//    7   13:aload_1         
	//    8   14:areturn         
	}

	public void addConcreteTypeArrayInternal(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Concrete type array not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #184 <String "Concrete type array not supported">
	//    3    6:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void addConcreteTypeInternal(Field field, String s, FastJsonResponse fastjsonresponse)
	{
		throw new UnsupportedOperationException("Concrete type not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #191 <String "Concrete type not supported">
	//    3    6:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public abstract Map getFieldMappings();

	protected Object getFieldValue(Field field)
	{
		Object obj = ((Object) (field.zapu));
	//    0    0:aload_1         
	//    1    1:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//    2    4:astore          4
		if(field.zapw != null)
	//*   3    6:aload_1         
	//*   4    7:getfield        #128 <Field Class FastJsonResponse$Field.zapw>
	//*   5   10:ifnull          149
		{
			boolean flag;
			if(getValueObject(field.zapu) == null)
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//*   9   18:invokevirtual   #202 <Method Object getValueObject(String)>
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
				field.zapu
			});
	//   16   31:iload_3         
	//   17   32:ldc1            #204 <String "Concrete field shouldn't be value object: %s">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:aload_1         
	//   23   41:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   24   44:aastore         
	//   25   45:invokestatic    #210 <Method void Preconditions.checkState(boolean, String, Object[])>
			flag = field.zapt;
	//   26   48:aload_1         
	//   27   49:getfield        #214 <Field boolean FastJsonResponse$Field.zapt>
	//   28   52:istore_3        
			try
			{
				char c = Character.toUpperCase(((String) (obj)).charAt(0));
	//   29   53:aload           4
	//   30   55:iconst_0        
	//   31   56:invokevirtual   #218 <Method char String.charAt(int)>
	//   32   59:invokestatic    #224 <Method char Character.toUpperCase(char)>
	//   33   62:istore_2        
				field = ((Field) (((String) (obj)).substring(1)));
	//   34   63:aload           4
	//   35   65:iconst_1        
	//   36   66:invokevirtual   #228 <Method String String.substring(int)>
	//   37   69:astore_1        
				obj = ((Object) (new StringBuilder(String.valueOf(((Object) (field))).length() + 4)));
	//   38   70:new             #33  <Class StringBuilder>
	//   39   73:dup             
	//   40   74:aload_1         
	//   41   75:invokestatic    #157 <Method String String.valueOf(Object)>
	//   42   78:invokevirtual   #160 <Method int String.length()>
	//   43   81:iconst_4        
	//   44   82:iadd            
	//   45   83:invokespecial   #36  <Method void StringBuilder(int)>
	//   46   86:astore          4
				((StringBuilder) (obj)).append("get");
	//   47   88:aload           4
	//   48   90:ldc1            #230 <String "get">
	//   49   92:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   50   95:pop             
				((StringBuilder) (obj)).append(c);
	//   51   96:aload           4
	//   52   98:iload_2         
	//   53   99:invokevirtual   #233 <Method StringBuilder StringBuilder.append(char)>
	//   54  102:pop             
				((StringBuilder) (obj)).append(((String) (field)));
	//   55  103:aload           4
	//   56  105:aload_1         
	//   57  106:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   58  109:pop             
				field = ((Field) (((StringBuilder) (obj)).toString()));
	//   59  110:aload           4
	//   60  112:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   61  115:astore_1        
				field = ((Field) (((Object)this).getClass().getMethod(((String) (field)), new Class[0]).invoke(((Object) (this)), new Object[0])));
	//   62  116:aload_0         
	//   63  117:invokevirtual   #237 <Method Class Object.getClass()>
	//   64  120:aload_1         
	//   65  121:iconst_0        
	//   66  122:anewarray       Class[]
	//   67  125:invokevirtual   #241 <Method Method Class.getMethod(String, Class[])>
	//   68  128:aload_0         
	//   69  129:iconst_0        
	//   70  130:anewarray       Object[]
	//   71  133:invokevirtual   #247 <Method Object Method.invoke(Object, Object[])>
	//   72  136:astore_1        
			}
	//*  73  137:aload_1         
	//*  74  138:areturn         
			// Misplaced declaration of an exception variable
			catch(Field field)
	//*  75  139:astore_1        
			{
				throw new RuntimeException(((Throwable) (field)));
	//   76  140:new             #249 <Class RuntimeException>
	//   77  143:dup             
	//   78  144:aload_1         
	//   79  145:invokespecial   #252 <Method void RuntimeException(Throwable)>
	//   80  148:athrow          
			}
			return ((Object) (field));
		} else
		{
			return getValueObject(field.zapu);
	//   81  149:aload_0         
	//   82  150:aload_1         
	//   83  151:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   84  154:invokevirtual   #202 <Method Object getValueObject(String)>
	//   85  157:areturn         
		}
	}

	protected abstract Object getValueObject(String s);

	protected boolean isFieldSet(Field field)
	{
		if(field.zaps == 11)
	//*   0    0:aload_1         
	//*   1    1:getfield        #31  <Field int FastJsonResponse$Field.zaps>
	//*   2    4:bipush          11
	//*   3    6:icmpne          48
		{
			if(field.zapt)
	//*   4    9:aload_1         
	//*   5   10:getfield        #214 <Field boolean FastJsonResponse$Field.zapt>
	//*   6   13:ifeq            32
			{
				field = ((Field) (field.zapu));
	//    7   16:aload_1         
	//    8   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//    9   20:astore_1        
				throw new UnsupportedOperationException("Concrete type arrays not supported");
	//   10   21:new             #182 <Class UnsupportedOperationException>
	//   11   24:dup             
	//   12   25:ldc2            #256 <String "Concrete type arrays not supported">
	//   13   28:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//   14   31:athrow          
			} else
			{
				field = ((Field) (field.zapu));
	//   15   32:aload_1         
	//   16   33:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   17   36:astore_1        
				throw new UnsupportedOperationException("Concrete types not supported");
	//   18   37:new             #182 <Class UnsupportedOperationException>
	//   19   40:dup             
	//   20   41:ldc2            #258 <String "Concrete types not supported">
	//   21   44:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//   22   47:athrow          
			}
		} else
		{
			return isPrimitiveFieldSet(field.zapu);
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   26   53:invokevirtual   #262 <Method boolean isPrimitiveFieldSet(String)>
	//   27   56:ireturn         
		}
	}

	protected abstract boolean isPrimitiveFieldSet(String s);

	protected void setBooleanInternal(Field field, String s, boolean flag)
	{
		throw new UnsupportedOperationException("Boolean not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #264 <String "Boolean not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setDecodedBytesInternal(Field field, String s, byte abyte0[])
	{
		throw new UnsupportedOperationException("byte[] not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #267 <String "byte[] not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setIntegerInternal(Field field, String s, int i)
	{
		throw new UnsupportedOperationException("Integer not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #270 <String "Integer not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setLongInternal(Field field, String s, long l)
	{
		throw new UnsupportedOperationException("Long not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #273 <String "Long not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setStringInternal(Field field, String s, String s1)
	{
		throw new UnsupportedOperationException("String not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #276 <String "String not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setStringsInternal(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("String list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #280 <String "String list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public String toString()
	{
		Map map = getFieldMappings();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method Map getFieldMappings()>
	//    2    4:astore_3        
		StringBuilder stringbuilder = new StringBuilder(100);
	//    3    5:new             #33  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:bipush          100
	//    6   11:invokespecial   #36  <Method void StringBuilder(int)>
	//    7   14:astore          4
		Iterator iterator = map.keySet().iterator();
	//    8   16:aload_3         
	//    9   17:invokeinterface #289 <Method Set Map.keySet()>
	//   10   22:invokeinterface #295 <Method Iterator Set.iterator()>
	//   11   27:astore          5
		do
		{
			if(!iterator.hasNext())
				break;
	//   12   29:aload           5
	//   13   31:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//   14   36:ifeq            373
			String s = (String)iterator.next();
	//   15   39:aload           5
	//   16   41:invokeinterface #304 <Method Object Iterator.next()>
	//   17   46:checkcast       #65  <Class String>
	//   18   49:astore          7
			Field field = (Field)map.get(((Object) (s)));
	//   19   51:aload_3         
	//   20   52:aload           7
	//   21   54:invokeinterface #306 <Method Object Map.get(Object)>
	//   22   59:checkcast       #6   <Class FastJsonResponse$Field>
	//   23   62:astore          6
			if(!isFieldSet(field))
				continue;
	//   24   64:aload_0         
	//   25   65:aload           6
	//   26   67:invokevirtual   #308 <Method boolean isFieldSet(FastJsonResponse$Field)>
	//   27   70:ifeq            29
			Object obj = zab(field, getFieldValue(field));
	//   28   73:aload           6
	//   29   75:aload_0         
	//   30   76:aload           6
	//   31   78:invokevirtual   #310 <Method Object getFieldValue(FastJsonResponse$Field)>
	//   32   81:invokestatic    #312 <Method Object zab(FastJsonResponse$Field, Object)>
	//   33   84:astore          8
			if(stringbuilder.length() == 0)
	//*  34   86:aload           4
	//*  35   88:invokevirtual   #313 <Method int StringBuilder.length()>
	//*  36   91:ifne            106
				stringbuilder.append("{");
	//   37   94:aload           4
	//   38   96:ldc2            #315 <String "{">
	//   39   99:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   40  102:pop             
			else
	//*  41  103:goto            115
				stringbuilder.append(",");
	//   42  106:aload           4
	//   43  108:ldc2            #317 <String ",">
	//   44  111:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   45  114:pop             
			stringbuilder.append("\"");
	//   46  115:aload           4
	//   47  117:ldc1            #136 <String "\"">
	//   48  119:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   49  122:pop             
			stringbuilder.append(s);
	//   50  123:aload           4
	//   51  125:aload           7
	//   52  127:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   53  130:pop             
			stringbuilder.append("\":");
	//   54  131:aload           4
	//   55  133:ldc2            #319 <String "\":">
	//   56  136:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   57  139:pop             
			if(obj == null)
	//*  58  140:aload           8
	//*  59  142:ifnonnull       157
			{
				stringbuilder.append("null");
	//   60  145:aload           4
	//   61  147:ldc2            #321 <String "null">
	//   62  150:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   63  153:pop             
				continue;
	//   64  154:goto            29
			}
			switch(field.zaps)
	//*  65  157:aload           6
	//*  66  159:getfield        #31  <Field int FastJsonResponse$Field.zaps>
			{
	//*  67  162:tableswitch     8 10: default 188
	//	               8 269
	//	               9 236
	//	               10 223
			default:
				if(field.zapr)
	//*  68  188:aload           6
	//*  69  190:getfield        #324 <Field boolean FastJsonResponse$Field.zapr>
	//*  70  193:ifeq            361
				{
					ArrayList arraylist = (ArrayList)obj;
	//   71  196:aload           8
	//   72  198:checkcast       #326 <Class ArrayList>
	//   73  201:astore          7
					stringbuilder.append("[");
	//   74  203:aload           4
	//   75  205:ldc2            #328 <String "[">
	//   76  208:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   77  211:pop             
					int i = 0;
	//   78  212:iconst_0        
	//   79  213:istore_1        
					for(int j = arraylist.size(); i < j; i++)
	//*  80  214:aload           7
	//*  81  216:invokevirtual   #331 <Method int ArrayList.size()>
	//*  82  219:istore_2        
	//*  83  220:goto            302
	//*  84  223:aload           4
	//*  85  225:aload           8
	//*  86  227:checkcast       #333 <Class HashMap>
	//*  87  230:invokestatic    #339 <Method void MapUtils.writeStringMapToJson(StringBuilder, HashMap)>
	//*  88  233:goto            29
	//*  89  236:aload           4
	//*  90  238:ldc1            #136 <String "\"">
	//*  91  240:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  92  243:pop             
	//*  93  244:aload           4
	//*  94  246:aload           8
	//*  95  248:checkcast       #59  <Class byte[]>
	//*  96  251:invokestatic    #345 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//*  97  254:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  98  257:pop             
	//*  99  258:aload           4
	//* 100  260:ldc1            #136 <String "\"">
	//* 101  262:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 102  265:pop             
	//* 103  266:goto            29
	//* 104  269:aload           4
	//* 105  271:ldc1            #136 <String "\"">
	//* 106  273:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 107  276:pop             
	//* 108  277:aload           4
	//* 109  279:aload           8
	//* 110  281:checkcast       #59  <Class byte[]>
	//* 111  284:invokestatic    #348 <Method String Base64Utils.encode(byte[])>
	//* 112  287:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 113  290:pop             
	//* 114  291:aload           4
	//* 115  293:ldc1            #136 <String "\"">
	//* 116  295:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 117  298:pop             
	//* 118  299:goto            29
	//* 119  302:iload_1         
	//* 120  303:iload_2         
	//* 121  304:icmpge          349
					{
						if(i > 0)
	//* 122  307:iload_1         
	//* 123  308:ifle            320
							stringbuilder.append(",");
	//  124  311:aload           4
	//  125  313:ldc2            #317 <String ",">
	//  126  316:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  127  319:pop             
						obj = arraylist.get(i);
	//  128  320:aload           7
	//  129  322:iload_1         
	//  130  323:invokevirtual   #351 <Method Object ArrayList.get(int)>
	//  131  326:astore          8
						if(obj != null)
	//* 132  328:aload           8
	//* 133  330:ifnull          342
							zaa(stringbuilder, field, obj);
	//  134  333:aload           4
	//  135  335:aload           6
	//  136  337:aload           8
	//  137  339:invokestatic    #353 <Method void zaa(StringBuilder, FastJsonResponse$Field, Object)>
					}

	//  138  342:iload_1         
	//  139  343:iconst_1        
	//  140  344:iadd            
	//  141  345:istore_1        
	//* 142  346:goto            302
					stringbuilder.append("]");
	//  143  349:aload           4
	//  144  351:ldc2            #355 <String "]">
	//  145  354:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  146  357:pop             
					break;
	//  147  358:goto            29
				}
				zaa(stringbuilder, field, obj);
	//  148  361:aload           4
	//  149  363:aload           6
	//  150  365:aload           8
	//  151  367:invokestatic    #353 <Method void zaa(StringBuilder, FastJsonResponse$Field, Object)>
				break;

			case 10: // '\n'
				MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj);
				break;

			case 9: // '\t'
				stringbuilder.append("\"");
				stringbuilder.append(Base64Utils.encodeUrlSafe((byte[])obj));
				stringbuilder.append("\"");
				break;

			case 8: // '\b'
				stringbuilder.append("\"");
				stringbuilder.append(Base64Utils.encode((byte[])obj));
				stringbuilder.append("\"");
				break;
			}
		} while(true);
	//  152  370:goto            29
		if(stringbuilder.length() > 0)
	//* 153  373:aload           4
	//* 154  375:invokevirtual   #313 <Method int StringBuilder.length()>
	//* 155  378:ifle            393
			stringbuilder.append("}");
	//  156  381:aload           4
	//  157  383:ldc2            #357 <String "}">
	//  158  386:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  159  389:pop             
		else
	//* 160  390:goto            402
			stringbuilder.append("{}");
	//  161  393:aload           4
	//  162  395:ldc2            #359 <String "{}">
	//  163  398:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  164  401:pop             
		return stringbuilder.toString();
	//  165  402:aload           4
	//  166  404:invokevirtual   #51  <Method String StringBuilder.toString()>
	//  167  407:areturn         
	}

	public final void zaa(Field field, double d)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zaa(field, ((Object) (Double.valueOf(d))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:dload_2         
	//    6   10:invokestatic    #363 <Method Double Double.valueOf(double)>
	//    7   13:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			zaa(field, field.zapu, d);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   13   23:dload_2         
	//   14   24:invokevirtual   #93  <Method void zaa(FastJsonResponse$Field, String, double)>
			return;
	//   15   27:return          
		}
	}

	public final void zaa(Field field, float f)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zaa(field, ((Object) (Float.valueOf(f))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:fload_2         
	//    6   10:invokestatic    #372 <Method Float Float.valueOf(float)>
	//    7   13:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			zaa(field, field.zapu, f);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   13   23:fload_2         
	//   14   24:invokevirtual   #375 <Method void zaa(FastJsonResponse$Field, String, float)>
			return;
	//   15   27:return          
		}
	}

	public final void zaa(Field field, int i)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zaa(field, ((Object) (Integer.valueOf(i))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #380 <Method Integer Integer.valueOf(int)>
	//    7   13:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setIntegerInternal(field, field.zapu, i);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #118 <Method void setIntegerInternal(FastJsonResponse$Field, String, int)>
			return;
	//   15   27:return          
		}
	}

	public final void zaa(Field field, long l)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zaa(field, ((Object) (Long.valueOf(l))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:lload_2         
	//    6   10:invokestatic    #385 <Method Long Long.valueOf(long)>
	//    7   13:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setLongInternal(field, field.zapu, l);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   13   23:lload_2         
	//   14   24:invokevirtual   #103 <Method void setLongInternal(FastJsonResponse$Field, String, long)>
			return;
	//   15   27:return          
		}
	}

	public final void zaa(Field field, String s)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (s)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setStringInternal(field, field.zapu, s);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #69  <Method void setStringInternal(FastJsonResponse$Field, String, String)>
			return;
	//   14   24:return          
		}
	}

	protected void zaa(Field field, String s, double d)
	{
		throw new UnsupportedOperationException("Double not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #390 <String "Double not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void zaa(Field field, String s, float f)
	{
		throw new UnsupportedOperationException("Float not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #393 <String "Float not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void zaa(Field field, String s, BigDecimal bigdecimal)
	{
		throw new UnsupportedOperationException("BigDecimal not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #396 <String "BigDecimal not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void zaa(Field field, String s, BigInteger biginteger)
	{
		throw new UnsupportedOperationException("BigInteger not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #399 <String "BigInteger not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void zaa(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Integer list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #402 <String "Integer list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void zaa(Field field, String s, Map map)
	{
		throw new UnsupportedOperationException("String map not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #406 <String "String map not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zaa(Field field, BigDecimal bigdecimal)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (bigdecimal)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zaa(field, field.zapu, bigdecimal);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #84  <Method void zaa(FastJsonResponse$Field, String, BigDecimal)>
			return;
	//   14   24:return          
		}
	}

	public final void zaa(Field field, BigInteger biginteger)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (biginteger)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zaa(field, field.zapu, biginteger);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #108 <Method void zaa(FastJsonResponse$Field, String, BigInteger)>
			return;
	//   14   24:return          
		}
	}

	public final void zaa(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zaa(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #414 <Method void zaa(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	public final void zaa(Field field, Map map)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (map)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zaa(field, field.zapu, map);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #418 <Method void zaa(FastJsonResponse$Field, String, Map)>
			return;
	//   14   24:return          
		}
	}

	public final void zaa(Field field, boolean flag)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          17
		{
			zaa(field, ((Object) (Boolean.valueOf(flag))));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokestatic    #423 <Method Boolean Boolean.valueOf(boolean)>
	//    7   13:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    8   16:return          
		} else
		{
			setBooleanInternal(field, field.zapu, flag);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #79  <Method void setBooleanInternal(FastJsonResponse$Field, String, boolean)>
			return;
	//   15   27:return          
		}
	}

	public final void zaa(Field field, byte abyte0[])
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (abyte0)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setDecodedBytesInternal(field, field.zapu, abyte0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #63  <Method void setDecodedBytesInternal(FastJsonResponse$Field, String, byte[])>
			return;
	//   14   24:return          
		}
	}

	protected void zab(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("BigInteger list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #428 <String "BigInteger list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zab(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zab(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #431 <Method void zab(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void zac(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Long list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #435 <String "Long list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zac(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zac(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #438 <Method void zac(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void zad(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Float list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #442 <String "Float list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zad(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zad(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #445 <Method void zad(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void zae(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Double list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #449 <String "Double list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zae(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zae(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #452 <Method void zae(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void zaf(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("BigDecimal list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #456 <String "BigDecimal list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zaf(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zaf(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #459 <Method void zaf(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	protected void zag(Field field, String s, ArrayList arraylist)
	{
		throw new UnsupportedOperationException("Boolean list not supported");
	//    0    0:new             #182 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #463 <String "Boolean list not supported">
	//    3    7:invokespecial   #185 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public final void zag(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			zag(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #466 <Method void zag(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}

	public final void zah(Field field, ArrayList arraylist)
	{
		if(com.google.android.gms.common.server.response.Field.zaa(field) != null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #174 <Method FastJsonResponse$FieldConverter com.google.android.gms.common.server.response.FastJsonResponse$Field.zaa(FastJsonResponse$Field)>
	//*   2    4:ifnull          14
		{
			zaa(field, ((Object) (arraylist)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #365 <Method void zaa(FastJsonResponse$Field, Object)>
			return;
	//    7   13:return          
		} else
		{
			setStringsInternal(field, field.zapu, arraylist);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #23  <Field String FastJsonResponse$Field.zapu>
	//   12   20:aload_2         
	//   13   21:invokevirtual   #470 <Method void setStringsInternal(FastJsonResponse$Field, String, ArrayList)>
			return;
	//   14   24:return          
		}
	}
}
