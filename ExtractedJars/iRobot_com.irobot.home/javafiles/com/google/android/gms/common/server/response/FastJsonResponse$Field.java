// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.zaa;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastJsonResponse, zai, SafeParcelResponse, zak

public static class FastJsonResponse$Field extends AbstractSafeParcelable
{

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
	//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
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
	//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   12:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   15:areturn         
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
	//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
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
	//   10   14:invokespecial   #116 <Method void FastJsonResponse$Field(int, boolean, int, boolean, String, int, Class, FastJsonResponse$FieldConverter)>
	//   11   17:areturn         
	}

	public static FastJsonResponse$Field withConverter(String s, int i, onverter onverter, boolean flag)
	{
		return new FastJsonResponse$Field(onverter.zacj(), flag, onverter.zack(), false, s, i, ((Class) (null)), onverter);
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

	static onverter zaa(FastJsonResponse$Field fastjsonresponse$field)
	{
		return fastjsonresponse$field.zapz;
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
		com.google.android.gms.common.internal.Objects$ToStringHelper objects$tostringhelper = Objects.toStringHelper(((Object) (this))).add("versionCode", ((Object) (Integer.valueOf(zale)))).add("typeIn", ((Object) (Integer.valueOf(zapq)))).add("typeInArray", ((Object) (Boolean.valueOf(zapr)))).add("typeOut", ((Object) (Integer.valueOf(zaps)))).add("typeOutArray", ((Object) (Boolean.valueOf(zapt)))).add("outputFieldName", ((Object) (zapu))).add("safeParcelFieldId", ((Object) (Integer.valueOf(zapv)))).add("concreteTypeName", ((Object) (zacm())));
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
			objects$tostringhelper.add("concreteType.class", ((Object) (class1.getCanonicalName())));
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
			objects$tostringhelper.add("converterName", ((Object) (((Object) (zapz)).getClass().getCanonicalName())));
	//   55  122:aload_1         
	//   56  123:ldc1            #211 <String "converterName">
	//   57  125:aload_0         
	//   58  126:getfield        #95  <Field FastJsonResponse$FieldConverter zapz>
	//   59  129:invokevirtual   #217 <Method Class Object.getClass()>
	//   60  132:invokevirtual   #110 <Method String Class.getCanonicalName()>
	//   61  135:invokevirtual   #186 <Method com.google.android.gms.common.internal.Objects$ToStringHelper com.google.android.gms.common.internal.Objects$ToStringHelper.add(String, Object)>
	//   62  138:pop             
		return objects$tostringhelper.toString();
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

	public final FastJsonResponse$Field zacl()
	{
		return new FastJsonResponse$Field(zale, zapq, zapr, zaps, zapt, zapu, zapv, zapx, zaco());
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
	private onverter zapz;

	static 
	{
	//    0    0:new             #63  <Class zai>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void zai()>
	//    3    7:putstatic       #68  <Field zai CREATOR>
	//*   4   10:return          
	}

	FastJsonResponse$Field(int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
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

	private FastJsonResponse$Field(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
			onverter onverter)
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
		zapz = onverter;
	//   38   75:aload_0         
	//   39   76:aload           8
	//   40   78:putfield        #95  <Field FastJsonResponse$FieldConverter zapz>
	//   41   81:return          
	}
}
