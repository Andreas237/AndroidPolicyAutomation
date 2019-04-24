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
			if(zapx == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #91  <Field String zapx>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return zapx;
		//    5    9:aload_0         
		//    6   10:getfield        #91  <Field String zapx>
		//    7   13:areturn         
		}

		private final zaa zaco()
		{
			if(zapz == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return com.google.android.gms.common.server.converter.zaa.zaa(zapz);
		//    5    9:aload_0         
		//    6   10:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//    7   13:invokestatic    #156 <Method zaa zaa.zaa(FastJsonResponse$FieldConverter)>
		//    8   16:areturn         
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
			Class class1 = zapw;
		//   41   95:aload_0         
		//   42   96:getfield        #89  <Field Class zapw>
		//   43   99:astore_2        
			if(class1 != null)
		//*  44  100:aload_2         
		//*  45  101:ifnull          115
				tostringhelper.add("concreteType.class", ((Object) (class1.getCanonicalName())));
		//   46  104:aload_1         
		//   47  105:ldc1            #209 <String "concreteType.class">
		//   48  107:aload_2         
		//   49  108:invokevirtual   #110 <Method String Class.getCanonicalName()>
		//   50  111:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   51  114:pop             
			if(zapz != null)
		//*  52  115:aload_0         
		//*  53  116:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//*  54  119:ifnull          139
				tostringhelper.add("converterName", ((Object) (((Object) (zapz)).getClass().getCanonicalName())));
		//   55  122:aload_1         
		//   56  123:ldc1            #211 <String "converterName">
		//   57  125:aload_0         
		//   58  126:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//   59  129:invokevirtual   #217 <Method Class Object.getClass()>
		//   60  132:invokevirtual   #110 <Method String Class.getCanonicalName()>
		//   61  135:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
		//   62  138:pop             
			return tostringhelper.toString();
		//   63  139:aload_1         
		//   64  140:invokevirtual   #219 <Method String com.google.android.gms.common.internal.Objects$ToStringHelper.toString()>
		//   65  143:areturn         
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
		{
			if(zapw == com/google/android/gms/common/server/response/SafeParcelResponse)
		//*   0    0:aload_0         
		//*   1    1:getfield        #89  <Field Class zapw>
		//*   2    4:ldc1            #93  <Class SafeParcelResponse>
		//*   3    6:if_acmpne       36
			{
				Preconditions.checkNotNull(((Object) (zapy)), "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
		//    4    9:aload_0         
		//    5   10:getfield        #253 <Field zak zapy>
		//    6   13:ldc2            #264 <String "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.">
		//    7   16:invokestatic    #270 <Method Object Preconditions.checkNotNull(Object, Object)>
		//    8   19:pop             
				return ((FastJsonResponse) (new SafeParcelResponse(zapy, zapx)));
		//    9   20:new             #93  <Class SafeParcelResponse>
		//   10   23:dup             
		//   11   24:aload_0         
		//   12   25:getfield        #253 <Field zak zapy>
		//   13   28:aload_0         
		//   14   29:getfield        #91  <Field String zapx>
		//   15   32:invokespecial   #273 <Method void SafeParcelResponse(zak, String)>
		//   16   35:areturn         
			} else
			{
				return (FastJsonResponse)zapw.newInstance();
		//   17   36:aload_0         
		//   18   37:getfield        #89  <Field Class zapw>
		//   19   40:invokevirtual   #277 <Method Object Class.newInstance()>
		//   20   43:checkcast       #7   <Class FastJsonResponse>
		//   21   46:areturn         
			}
		}

		public final Map zacq()
		{
			Preconditions.checkNotNull(((Object) (zapx)));
		//    0    0:aload_0         
		//    1    1:getfield        #91  <Field String zapx>
		//    2    4:invokestatic    #281 <Method Object Preconditions.checkNotNull(Object)>
		//    3    7:pop             
			Preconditions.checkNotNull(((Object) (zapy)));
		//    4    8:aload_0         
		//    5    9:getfield        #253 <Field zak zapy>
		//    6   12:invokestatic    #281 <Method Object Preconditions.checkNotNull(Object)>
		//    7   15:pop             
			return zapy.zai(zapx);
		//    8   16:aload_0         
		//    9   17:getfield        #253 <Field zak zapy>
		//   10   20:aload_0         
		//   11   21:getfield        #91  <Field String zapx>
		//   12   24:invokevirtual   #287 <Method Map zak.zai(String)>
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
		//*  27   50:ifnonnull       65
				s = null;
		//   28   53:aconst_null     
		//   29   54:astore          5
			else
		//*  30   56:aload_0         
		//*  31   57:aload           5
		//*  32   59:putfield        #91  <Field String zapx>
		//*  33   62:goto            75
				s = class1.getCanonicalName();
		//   34   65:aload           7
		//   35   67:invokevirtual   #110 <Method String Class.getCanonicalName()>
		//   36   70:astore          5
			zapx = s;
		//*  37   72:goto            56
			zapz = fieldconverter;
		//   38   75:aload_0         
		//   39   76:aload           8
		//   40   78:putfield        #95  <Field FastJsonResponse$FieldConverter zapz>
		//   41   81:return          
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
	//*  35  118:ifeq            264
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
	//*  53  151:ifeq            264
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
	//*  72  187:ifeq            264
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
	//*  84  211:ifeq            264
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
	//* 103  247:ifeq            264
				setIntegerInternal(field, s, ((Integer)obj).intValue());
	//  104  250:aload_0         
	//  105  251:aload_1         
	//  106  252:aload           4
	//  107  254:aload_2         
	//  108  255:checkcast       #110 <Class Integer>
	//  109  258:invokevirtual   #114 <Method int Integer.intValue()>
	//  110  261:invokevirtual   #118 <Method void setIntegerInternal(FastJsonResponse$Field, String, int)>
			break;
		}
	//  111  264:return          
	}

	private static void zaa(StringBuilder stringbuilder, Field field, Object obj)
	{
		if(field.zapq == 11)
	//*   0    0:aload_1         
	//*   1    1:getfield        #124 <Field int FastJsonResponse$Field.zapq>
	//*   2    4:bipush          11
	//*   3    6:icmpne          31
			field = ((Field) (((FastJsonResponse)field.zapw.cast(obj)).toString()));
	//    4    9:aload_1         
	//    5   10:getfield        #128 <Field Class FastJsonResponse$Field.zapw>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #133 <Method Object Class.cast(Object)>
	//    8   17:checkcast       #2   <Class FastJsonResponse>
	//    9   20:invokevirtual   #134 <Method String toString()>
	//   10   23:astore_1        
		else
	//*  11   24:aload_0         
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  14   29:pop             
	//*  15   30:return          
		if(field.zapq == 7)
	//*  16   31:aload_1         
	//*  17   32:getfield        #124 <Field int FastJsonResponse$Field.zapq>
	//*  18   35:bipush          7
	//*  19   37:icmpne          65
		{
			stringbuilder.append("\"");
	//   20   40:aload_0         
	//   21   41:ldc1            #136 <String "\"">
	//   22   43:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			stringbuilder.append(JsonUtils.escapeString((String)obj));
	//   24   47:aload_0         
	//   25   48:aload_2         
	//   26   49:checkcast       #65  <Class String>
	//   27   52:invokestatic    #142 <Method String JsonUtils.escapeString(String)>
	//   28   55:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			field = "\"";
	//   30   59:ldc1            #136 <String "\"">
	//   31   61:astore_1        
		} else
	//*  32   62:goto            24
		{
			stringbuilder.append(obj);
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
			return;
	//   37   71:return          
		}
		stringbuilder.append(((String) (field)));
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
		StringBuilder stringbuilder;
		Map map;
		Iterator iterator;
		map = getFieldMappings();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #283 <Method Map getFieldMappings()>
	//    2    4:astore          5
		stringbuilder = new StringBuilder(100);
	//    3    6:new             #33  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:bipush          100
	//    6   12:invokespecial   #36  <Method void StringBuilder(int)>
	//    7   15:astore          4
		iterator = map.keySet().iterator();
	//    8   17:aload           5
	//    9   19:invokeinterface #289 <Method Set Map.keySet()>
	//   10   24:invokeinterface #295 <Method Iterator Set.iterator()>
	//   11   29:astore          6
_L9:
		Field field;
		Object obj2;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   12   31:aload           6
	//   13   33:invokeinterface #300 <Method boolean Iterator.hasNext()>
	//   14   38:ifeq            353
		String s2 = (String)iterator.next();
	//   15   41:aload           6
	//   16   43:invokeinterface #304 <Method Object Iterator.next()>
	//   17   48:checkcast       #65  <Class String>
	//   18   51:astore          8
		field = (Field)map.get(((Object) (s2)));
	//   19   53:aload           5
	//   20   55:aload           8
	//   21   57:invokeinterface #306 <Method Object Map.get(Object)>
	//   22   62:checkcast       #6   <Class FastJsonResponse$Field>
	//   23   65:astore          7
		if(!isFieldSet(field))
			continue; /* Loop/switch isn't completed */
	//   24   67:aload_0         
	//   25   68:aload           7
	//   26   70:invokevirtual   #308 <Method boolean isFieldSet(FastJsonResponse$Field)>
	//   27   73:ifeq            31
		obj2 = zab(field, getFieldValue(field));
	//   28   76:aload           7
	//   29   78:aload_0         
	//   30   79:aload           7
	//   31   81:invokevirtual   #310 <Method Object getFieldValue(FastJsonResponse$Field)>
	//   32   84:invokestatic    #312 <Method Object zab(FastJsonResponse$Field, Object)>
	//   33   87:astore          9
		String s;
		if(stringbuilder.length() == 0)
	//*  34   89:aload           4
	//*  35   91:invokevirtual   #313 <Method int StringBuilder.length()>
	//*  36   94:ifne            111
			s = "{";
	//   37   97:ldc2            #315 <String "{">
	//   38  100:astore_3        
		else
	//*  39  101:aload           4
	//*  40  103:aload_3         
	//*  41  104:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  42  107:pop             
	//*  43  108:goto            118
			s = ",";
	//   44  111:ldc2            #317 <String ",">
	//   45  114:astore_3        
		stringbuilder.append(s);
	//*  46  115:goto            101
		stringbuilder.append("\"");
	//   47  118:aload           4
	//   48  120:ldc1            #136 <String "\"">
	//   49  122:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   50  125:pop             
		stringbuilder.append(s2);
	//   51  126:aload           4
	//   52  128:aload           8
	//   53  130:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   54  133:pop             
		stringbuilder.append("\":");
	//   55  134:aload           4
	//   56  136:ldc2            #319 <String "\":">
	//   57  139:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   58  142:pop             
		if(obj2 != null) goto _L2; else goto _L1
	//   59  143:aload           9
	//   60  145:ifnonnull       162
_L1:
		Object obj = "null";
	//   61  148:ldc2            #321 <String "null">
	//   62  151:astore_3        
_L7:
		stringbuilder.append(((String) (obj)));
	//   63  152:aload           4
	//   64  154:aload_3         
	//   65  155:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   66  158:pop             
		continue; /* Loop/switch isn't completed */
	//   67  159:goto            31
_L2:
		field.zaps;
	//   68  162:aload           7
	//   69  164:getfield        #31  <Field int FastJsonResponse$Field.zaps>
		JVM INSTR tableswitch 8 10: default 192
	//	               8 258
	//	               9 238
	//	               10 225;
	//   70  167:tableswitch     8 10: default 192
	//	               8 258
	//	               9 238
	//	               10 225
		   goto _L3 _L4 _L5 _L6
	//*  71  192:aload           7
	//*  72  194:getfield        #324 <Field boolean FastJsonResponse$Field.zapr>
	//*  73  197:ifeq            341
	//*  74  200:aload           9
	//*  75  202:checkcast       #326 <Class ArrayList>
	//*  76  205:astore_3        
	//*  77  206:aload           4
	//*  78  208:ldc2            #328 <String "[">
	//*  79  211:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//*  80  214:pop             
	//*  81  215:iconst_0        
	//*  82  216:istore_1        
	//*  83  217:aload_3         
	//*  84  218:invokevirtual   #331 <Method int ArrayList.size()>
	//*  85  221:istore_2        
	//*  86  222:goto            288
_L6:
		MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj2);
	//   87  225:aload           4
	//   88  227:aload           9
	//   89  229:checkcast       #333 <Class HashMap>
	//   90  232:invokestatic    #339 <Method void MapUtils.writeStringMapToJson(StringBuilder, HashMap)>
		continue; /* Loop/switch isn't completed */
	//   91  235:goto            31
_L5:
		stringbuilder.append("\"");
	//   92  238:aload           4
	//   93  240:ldc1            #136 <String "\"">
	//   94  242:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   95  245:pop             
		obj = ((Object) (Base64Utils.encodeUrlSafe((byte[])obj2)));
	//   96  246:aload           9
	//   97  248:checkcast       #59  <Class byte[]>
	//   98  251:invokestatic    #345 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//   99  254:astore_3        
		break; /* Loop/switch isn't completed */
	//  100  255:goto            275
_L4:
		stringbuilder.append("\"");
	//  101  258:aload           4
	//  102  260:ldc1            #136 <String "\"">
	//  103  262:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  104  265:pop             
		obj = ((Object) (Base64Utils.encode((byte[])obj2)));
	//  105  266:aload           9
	//  106  268:checkcast       #59  <Class byte[]>
	//  107  271:invokestatic    #348 <Method String Base64Utils.encode(byte[])>
	//  108  274:astore_3        
		stringbuilder.append(((String) (obj)));
	//  109  275:aload           4
	//  110  277:aload_3         
	//  111  278:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  112  281:pop             
		obj = "\"";
	//  113  282:ldc1            #136 <String "\"">
	//  114  284:astore_3        
		  goto _L7
_L3:
		if(!field.zapr)
			break MISSING_BLOCK_LABEL_341;
		obj = ((Object) ((ArrayList)obj2));
		stringbuilder.append("[");
		int i = 0;
		for(int j = ((ArrayList) (obj)).size(); i < j; i++)
	//* 115  285:goto            152
	//* 116  288:iload_1         
	//* 117  289:iload_2         
	//* 118  290:icmpge          334
		{
			if(i > 0)
	//* 119  293:iload_1         
	//* 120  294:ifle            306
				stringbuilder.append(",");
	//  121  297:aload           4
	//  122  299:ldc2            #317 <String ",">
	//  123  302:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//  124  305:pop             
			Object obj1 = ((ArrayList) (obj)).get(i);
	//  125  306:aload_3         
	//  126  307:iload_1         
	//  127  308:invokevirtual   #351 <Method Object ArrayList.get(int)>
	//  128  311:astore          8
			if(obj1 != null)
	//* 129  313:aload           8
	//* 130  315:ifnull          327
				zaa(stringbuilder, field, obj1);
	//  131  318:aload           4
	//  132  320:aload           7
	//  133  322:aload           8
	//  134  324:invokestatic    #353 <Method void zaa(StringBuilder, FastJsonResponse$Field, Object)>
		}

	//  135  327:iload_1         
	//  136  328:iconst_1        
	//  137  329:iadd            
	//  138  330:istore_1        
	//* 139  331:goto            288
		obj = "]";
	//  140  334:ldc2            #355 <String "]">
	//  141  337:astore_3        
		  goto _L7
	//* 142  338:goto            152
		zaa(stringbuilder, field, obj2);
	//  143  341:aload           4
	//  144  343:aload           7
	//  145  345:aload           9
	//  146  347:invokestatic    #353 <Method void zaa(StringBuilder, FastJsonResponse$Field, Object)>
		if(true) goto _L9; else goto _L8
	//  147  350:goto            31
_L8:
		String s1;
		if(stringbuilder.length() > 0)
	//* 148  353:aload           4
	//* 149  355:invokevirtual   #313 <Method int StringBuilder.length()>
	//* 150  358:ifle            375
			s1 = "}";
	//  151  361:ldc2            #357 <String "}">
	//  152  364:astore_3        
		else
	//* 153  365:aload           4
	//* 154  367:aload_3         
	//* 155  368:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//* 156  371:pop             
	//* 157  372:goto            382
			s1 = "{}";
	//  158  375:ldc2            #359 <String "{}">
	//  159  378:astore_3        
		stringbuilder.append(s1);
	//* 160  379:goto            365
		return stringbuilder.toString();
	//  161  382:aload           4
	//  162  384:invokevirtual   #51  <Method String StringBuilder.toString()>
	//  163  387:areturn         
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
