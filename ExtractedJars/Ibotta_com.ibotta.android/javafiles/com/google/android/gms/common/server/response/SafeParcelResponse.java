// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.*;
import com.google.android.gms.common.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastSafeParcelableJsonResponse, SafeParcelResponseCreator, FieldMappingDictionary, FastJsonResponse

public class SafeParcelResponse extends FastSafeParcelableJsonResponse
{

	SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldmappingdictionary)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void FastSafeParcelableJsonResponse()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int zzal>
		zzxq = (Parcel)Preconditions.checkNotNull(((Object) (parcel)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object)>
	//    8   14:checkcast       #56  <Class Parcel>
	//    9   17:putfield        #58  <Field Parcel zzxq>
		zzxr = 2;
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #60  <Field int zzxr>
		zzwn = fieldmappingdictionary;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #62  <Field FieldMappingDictionary zzwn>
		parcel = ((Parcel) (zzwn));
	//   16   30:aload_0         
	//   17   31:getfield        #62  <Field FieldMappingDictionary zzwn>
	//   18   34:astore_2        
		if(parcel == null)
	//*  19   35:aload_2         
	//*  20   36:ifnonnull       44
			parcel = null;
	//   21   39:aconst_null     
	//   22   40:astore_2        
		else
	//*  23   41:goto            49
			parcel = ((Parcel) (((FieldMappingDictionary) (parcel)).getRootClassName()));
	//   24   44:aload_2         
	//   25   45:invokevirtual   #68  <Method String FieldMappingDictionary.getRootClassName()>
	//   26   48:astore_2        
		mClassName = ((String) (parcel));
	//   27   49:aload_0         
	//   28   50:aload_2         
	//   29   51:putfield        #70  <Field String mClassName>
		zzxs = 2;
	//   30   54:aload_0         
	//   31   55:iconst_2        
	//   32   56:putfield        #72  <Field int zzxs>
	//   33   59:return          
	}

	private SafeParcelResponse(SafeParcelable safeparcelable, FieldMappingDictionary fieldmappingdictionary, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void FastSafeParcelableJsonResponse()>
		zzal = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #48  <Field int zzal>
		zzxq = Parcel.obtain();
	//    5    9:aload_0         
	//    6   10:invokestatic    #79  <Method Parcel Parcel.obtain()>
	//    7   13:putfield        #58  <Field Parcel zzxq>
		safeparcelable.writeToParcel(zzxq, 0);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #58  <Field Parcel zzxq>
	//   11   21:iconst_0        
	//   12   22:invokeinterface #85  <Method void SafeParcelable.writeToParcel(Parcel, int)>
		zzxr = 1;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #60  <Field int zzxr>
		zzwn = (FieldMappingDictionary)Preconditions.checkNotNull(((Object) (fieldmappingdictionary)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object)>
	//   19   37:checkcast       #64  <Class FieldMappingDictionary>
	//   20   40:putfield        #62  <Field FieldMappingDictionary zzwn>
		mClassName = (String)Preconditions.checkNotNull(((Object) (s)));
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object)>
	//   24   48:checkcast       #87  <Class String>
	//   25   51:putfield        #70  <Field String mClassName>
		zzxs = 2;
	//   26   54:aload_0         
	//   27   55:iconst_2        
	//   28   56:putfield        #72  <Field int zzxs>
	//   29   59:return          
	}

	public SafeParcelResponse(FieldMappingDictionary fieldmappingdictionary)
	{
		this(fieldmappingdictionary, fieldmappingdictionary.getRootClassName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #68  <Method String FieldMappingDictionary.getRootClassName()>
	//    4    6:invokespecial   #91  <Method void SafeParcelResponse(FieldMappingDictionary, String)>
	//    5    9:return          
	}

	public SafeParcelResponse(FieldMappingDictionary fieldmappingdictionary, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void FastSafeParcelableJsonResponse()>
		zzal = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #48  <Field int zzal>
		zzxq = Parcel.obtain();
	//    5    9:aload_0         
	//    6   10:invokestatic    #79  <Method Parcel Parcel.obtain()>
	//    7   13:putfield        #58  <Field Parcel zzxq>
		zzxr = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #60  <Field int zzxr>
		zzwn = (FieldMappingDictionary)Preconditions.checkNotNull(((Object) (fieldmappingdictionary)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object)>
	//   14   26:checkcast       #64  <Class FieldMappingDictionary>
	//   15   29:putfield        #62  <Field FieldMappingDictionary zzwn>
		mClassName = (String)Preconditions.checkNotNull(((Object) (s)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokestatic    #54  <Method Object Preconditions.checkNotNull(Object)>
	//   19   37:checkcast       #87  <Class String>
	//   20   40:putfield        #70  <Field String mClassName>
		zzxs = 0;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #72  <Field int zzxs>
	//   24   48:return          
	}

	public static HashMap convertBundleToStringMap(Bundle bundle)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #95  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void HashMap()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) (bundle.getString(s)))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #102 <Method Set Bundle.keySet()>
	//*   6   12:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            51
			s = (String)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #118 <Method Object Iterator.next()>
	//   13   33:checkcast       #87  <Class String>
	//   14   36:astore_3        

	//   15   37:aload_1         
	//   16   38:aload_3         
	//   17   39:aload_0         
	//   18   40:aload_3         
	//   19   41:invokevirtual   #122 <Method String Bundle.getString(String)>
	//   20   44:invokevirtual   #126 <Method Object HashMap.put(Object, Object)>
	//   21   47:pop             
	//*  22   48:goto            18
		return hashmap;
	//   23   51:aload_1         
	//   24   52:areturn         
	}

	public static Bundle convertStringMapToBundle(HashMap hashmap)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #98  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void Bundle()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); bundle.putString(s, (String)hashmap.get(((Object) (s)))))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #132 <Method Set HashMap.keySet()>
	//*   6   12:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            53
			s = (String)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #118 <Method Object Iterator.next()>
	//   13   33:checkcast       #87  <Class String>
	//   14   36:astore_3        

	//   15   37:aload_1         
	//   16   38:aload_3         
	//   17   39:aload_0         
	//   18   40:aload_3         
	//   19   41:invokevirtual   #135 <Method Object HashMap.get(Object)>
	//   20   44:checkcast       #87  <Class String>
	//   21   47:invokevirtual   #139 <Method void Bundle.putString(String, String)>
	//*  22   50:goto            18
		return bundle;
	//   23   53:aload_1         
	//   24   54:areturn         
	}

	public static SafeParcelResponse from(FastJsonResponse fastjsonresponse)
	{
		String s = ((Object) (fastjsonresponse)).getClass().getCanonicalName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #153 <Method String Class.getCanonicalName()>
	//    3    7:astore_1        
		FieldMappingDictionary fieldmappingdictionary = zza(fastjsonresponse);
	//    4    8:aload_0         
	//    5    9:invokestatic    #157 <Method FieldMappingDictionary zza(FastJsonResponse)>
	//    6   12:astore_2        
		return new SafeParcelResponse((SafeParcelable)fastjsonresponse, fieldmappingdictionary, s);
	//    7   13:new             #2   <Class SafeParcelResponse>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:checkcast       #81  <Class SafeParcelable>
	//   11   21:aload_2         
	//   12   22:aload_1         
	//   13   23:invokespecial   #159 <Method void SafeParcelResponse(SafeParcelable, FieldMappingDictionary, String)>
	//   14   26:areturn         
	}

	public static FieldMappingDictionary generateDictionary(Class class1)
	{
		FieldMappingDictionary fieldmappingdictionary;
		try
		{
			fieldmappingdictionary = zza((FastJsonResponse)class1.newInstance());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method Object Class.newInstance()>
	//    2    4:checkcast       #171 <Class FastJsonResponse>
	//    3    7:invokestatic    #157 <Method FieldMappingDictionary zza(FastJsonResponse)>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:areturn         
	//*   7   13:astore_1        
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #153 <Method String Class.getCanonicalName()>
	//*  10   18:invokestatic    #175 <Method String String.valueOf(Object)>
	//*  11   21:astore_0        
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #179 <Method int String.length()>
	//*  14   26:ifeq            39
	//*  15   29:ldc1            #181 <String "Could not access object of type ">
	//*  16   31:aload_0         
	//*  17   32:invokevirtual   #184 <Method String String.concat(String)>
	//*  18   35:astore_0        
	//*  19   36:goto            49
	//*  20   39:new             #87  <Class String>
	//*  21   42:dup             
	//*  22   43:ldc1            #181 <String "Could not access object of type ">
	//*  23   45:invokespecial   #187 <Method void String(String)>
	//*  24   48:astore_0        
	//*  25   49:new             #189 <Class IllegalStateException>
	//*  26   52:dup             
	//*  27   53:aload_0         
	//*  28   54:aload_1         
	//*  29   55:invokespecial   #192 <Method void IllegalStateException(String, Throwable)>
	//*  30   58:athrow          
		catch(InstantiationException instantiationexception)
	//*  31   59:astore_1        
		{
			class1 = ((Class) (String.valueOf(((Object) (class1.getCanonicalName())))));
	//   32   60:aload_0         
	//   33   61:invokevirtual   #153 <Method String Class.getCanonicalName()>
	//   34   64:invokestatic    #175 <Method String String.valueOf(Object)>
	//   35   67:astore_0        
			if(((String) (class1)).length() != 0)
	//*  36   68:aload_0         
	//*  37   69:invokevirtual   #179 <Method int String.length()>
	//*  38   72:ifeq            85
				class1 = ((Class) ("Could not instantiate an object of type ".concat(((String) (class1)))));
	//   39   75:ldc1            #194 <String "Could not instantiate an object of type ">
	//   40   77:aload_0         
	//   41   78:invokevirtual   #184 <Method String String.concat(String)>
	//   42   81:astore_0        
			else
	//*  43   82:goto            95
				class1 = ((Class) (new String("Could not instantiate an object of type ")));
	//   44   85:new             #87  <Class String>
	//   45   88:dup             
	//   46   89:ldc1            #194 <String "Could not instantiate an object of type ">
	//   47   91:invokespecial   #187 <Method void String(String)>
	//   48   94:astore_0        
			throw new IllegalStateException(((String) (class1)), ((Throwable) (instantiationexception)));
	//   49   95:new             #189 <Class IllegalStateException>
	//   50   98:dup             
	//   51   99:aload_0         
	//   52  100:aload_1         
	//   53  101:invokespecial   #192 <Method void IllegalStateException(String, Throwable)>
	//   54  104:athrow          
		}
		catch(IllegalAccessException illegalaccessexception)
		{
			class1 = ((Class) (String.valueOf(((Object) (class1.getCanonicalName())))));
			if(((String) (class1)).length() != 0)
				class1 = ((Class) ("Could not access object of type ".concat(((String) (class1)))));
			else
				class1 = ((Class) (new String("Could not access object of type ")));
			throw new IllegalStateException(((String) (class1)), ((Throwable) (illegalaccessexception)));
		}
		return fieldmappingdictionary;
	}

	private static FieldMappingDictionary zza(FastJsonResponse fastjsonresponse)
	{
		FieldMappingDictionary fieldmappingdictionary = new FieldMappingDictionary(((Object) (fastjsonresponse)).getClass());
	//    0    0:new             #64  <Class FieldMappingDictionary>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #148 <Method Class Object.getClass()>
	//    4    8:invokespecial   #198 <Method void FieldMappingDictionary(Class)>
	//    5   11:astore_1        
		zza(fieldmappingdictionary, fastjsonresponse);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokestatic    #201 <Method void zza(FieldMappingDictionary, FastJsonResponse)>
		fieldmappingdictionary.copyInternalFieldMappings();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #204 <Method void FieldMappingDictionary.copyInternalFieldMappings()>
		fieldmappingdictionary.linkFields();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #207 <Method void FieldMappingDictionary.linkFields()>
		return fieldmappingdictionary;
	//   13   25:aload_1         
	//   14   26:areturn         
	}

	private static void zza(FieldMappingDictionary fieldmappingdictionary, FastJsonResponse fastjsonresponse)
	{
		Object obj = ((Object) (((Object) (fastjsonresponse)).getClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #148 <Method Class Object.getClass()>
	//    2    4:astore_3        
		if(!fieldmappingdictionary.hasFieldMappingForClass(((Class) (obj))))
	//*   3    5:aload_0         
	//*   4    6:aload_3         
	//*   5    7:invokevirtual   #211 <Method boolean FieldMappingDictionary.hasFieldMappingForClass(Class)>
	//*   6   10:ifne            188
		{
			Map map = fastjsonresponse.getFieldMappings();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #215 <Method Map FastJsonResponse.getFieldMappings()>
	//    9   17:astore_2        
			fieldmappingdictionary.put(((Class) (obj)), map);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #218 <Method void FieldMappingDictionary.put(Class, Map)>
			obj = ((Object) (map.keySet().iterator()));
	//   14   24:aload_2         
	//   15   25:invokeinterface #221 <Method Set Map.keySet()>
	//   16   30:invokeinterface #108 <Method Iterator Set.iterator()>
	//   17   35:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   18   36:aload_3         
	//   19   37:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//   20   42:ifeq            188
				fastjsonresponse = ((FastJsonResponse) ((FastJsonResponse.Field)map.get(((Object) ((String)((Iterator) (obj)).next())))));
	//   21   45:aload_2         
	//   22   46:aload_3         
	//   23   47:invokeinterface #118 <Method Object Iterator.next()>
	//   24   52:checkcast       #87  <Class String>
	//   25   55:invokeinterface #222 <Method Object Map.get(Object)>
	//   26   60:checkcast       #224 <Class FastJsonResponse$Field>
	//   27   63:astore_1        
				Class class1 = ((FastJsonResponse.Field) (fastjsonresponse)).getConcreteType();
	//   28   64:aload_1         
	//   29   65:invokevirtual   #227 <Method Class FastJsonResponse$Field.getConcreteType()>
	//   30   68:astore          4
				if(class1 != null)
	//*  31   70:aload           4
	//*  32   72:ifnull          36
					try
					{
						zza(fieldmappingdictionary, (FastJsonResponse)class1.newInstance());
	//   33   75:aload_0         
	//   34   76:aload           4
	//   35   78:invokevirtual   #169 <Method Object Class.newInstance()>
	//   36   81:checkcast       #171 <Class FastJsonResponse>
	//   37   84:invokestatic    #201 <Method void zza(FieldMappingDictionary, FastJsonResponse)>
					}
	//*  38   87:goto            36
	//*  39   90:astore_2        
	//*  40   91:aload_1         
	//*  41   92:invokevirtual   #227 <Method Class FastJsonResponse$Field.getConcreteType()>
	//*  42   95:invokevirtual   #153 <Method String Class.getCanonicalName()>
	//*  43   98:invokestatic    #175 <Method String String.valueOf(Object)>
	//*  44  101:astore_0        
	//*  45  102:aload_0         
	//*  46  103:invokevirtual   #179 <Method int String.length()>
	//*  47  106:ifeq            119
	//*  48  109:ldc1            #181 <String "Could not access object of type ">
	//*  49  111:aload_0         
	//*  50  112:invokevirtual   #184 <Method String String.concat(String)>
	//*  51  115:astore_0        
	//*  52  116:goto            129
	//*  53  119:new             #87  <Class String>
	//*  54  122:dup             
	//*  55  123:ldc1            #181 <String "Could not access object of type ">
	//*  56  125:invokespecial   #187 <Method void String(String)>
	//*  57  128:astore_0        
	//*  58  129:new             #189 <Class IllegalStateException>
	//*  59  132:dup             
	//*  60  133:aload_0         
	//*  61  134:aload_2         
	//*  62  135:invokespecial   #192 <Method void IllegalStateException(String, Throwable)>
	//*  63  138:athrow          
					catch(InstantiationException instantiationexception)
	//*  64  139:astore_2        
					{
						fieldmappingdictionary = ((FieldMappingDictionary) (String.valueOf(((Object) (((FastJsonResponse.Field) (fastjsonresponse)).getConcreteType().getCanonicalName())))));
	//   65  140:aload_1         
	//   66  141:invokevirtual   #227 <Method Class FastJsonResponse$Field.getConcreteType()>
	//   67  144:invokevirtual   #153 <Method String Class.getCanonicalName()>
	//   68  147:invokestatic    #175 <Method String String.valueOf(Object)>
	//   69  150:astore_0        
						if(((String) (fieldmappingdictionary)).length() != 0)
	//*  70  151:aload_0         
	//*  71  152:invokevirtual   #179 <Method int String.length()>
	//*  72  155:ifeq            168
							fieldmappingdictionary = ((FieldMappingDictionary) ("Could not instantiate an object of type ".concat(((String) (fieldmappingdictionary)))));
	//   73  158:ldc1            #194 <String "Could not instantiate an object of type ">
	//   74  160:aload_0         
	//   75  161:invokevirtual   #184 <Method String String.concat(String)>
	//   76  164:astore_0        
						else
	//*  77  165:goto            178
							fieldmappingdictionary = ((FieldMappingDictionary) (new String("Could not instantiate an object of type ")));
	//   78  168:new             #87  <Class String>
	//   79  171:dup             
	//   80  172:ldc1            #194 <String "Could not instantiate an object of type ">
	//   81  174:invokespecial   #187 <Method void String(String)>
	//   82  177:astore_0        
						throw new IllegalStateException(((String) (fieldmappingdictionary)), ((Throwable) (instantiationexception)));
	//   83  178:new             #189 <Class IllegalStateException>
	//   84  181:dup             
	//   85  182:aload_0         
	//   86  183:aload_2         
	//   87  184:invokespecial   #192 <Method void IllegalStateException(String, Throwable)>
	//   88  187:athrow          
					}
					catch(IllegalAccessException illegalaccessexception)
					{
						fieldmappingdictionary = ((FieldMappingDictionary) (String.valueOf(((Object) (((FastJsonResponse.Field) (fastjsonresponse)).getConcreteType().getCanonicalName())))));
						if(((String) (fieldmappingdictionary)).length() != 0)
							fieldmappingdictionary = ((FieldMappingDictionary) ("Could not access object of type ".concat(((String) (fieldmappingdictionary)))));
						else
							fieldmappingdictionary = ((FieldMappingDictionary) (new String("Could not access object of type ")));
						throw new IllegalStateException(((String) (fieldmappingdictionary)), ((Throwable) (illegalaccessexception)));
					}
			} while(true);
		}
	//   89  188:return          
	}

	private static void zza(StringBuilder stringbuilder, int i, Object obj)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 205
	//	               1 205
	//	               2 205
	//	               3 205
	//	               4 205
	//	               5 205
	//	               6 205
	//	               7 176
	//	               8 147
	//	               9 118
	//	               10 109
	//	               11 99
		default:
			stringbuilder = new StringBuilder(26);
	//    2   64:new             #230 <Class StringBuilder>
	//    3   67:dup             
	//    4   68:bipush          26
	//    5   70:invokespecial   #233 <Method void StringBuilder(int)>
	//    6   73:astore_0        
			stringbuilder.append("Unknown type = ");
	//    7   74:aload_0         
	//    8   75:ldc1            #235 <String "Unknown type = ">
	//    9   77:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   10   80:pop             
			stringbuilder.append(i);
	//   11   81:aload_0         
	//   12   82:iload_1         
	//   13   83:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//   14   86:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   15   87:new             #244 <Class IllegalArgumentException>
	//   16   90:dup             
	//   17   91:aload_0         
	//   18   92:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   19   95:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   20   98:athrow          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//   21   99:new             #244 <Class IllegalArgumentException>
	//   22  102:dup             
	//   23  103:ldc1            #250 <String "Method does not accept concrete type.">
	//   24  105:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//   25  108:athrow          

		case 10: // '\n'
			MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj);
	//   26  109:aload_0         
	//   27  110:aload_2         
	//   28  111:checkcast       #95  <Class HashMap>
	//   29  114:invokestatic    #256 <Method void MapUtils.writeStringMapToJson(StringBuilder, HashMap)>
			return;
	//   30  117:return          

		case 9: // '\t'
			stringbuilder.append("\"");
	//   31  118:aload_0         
	//   32  119:ldc2            #258 <String "\"">
	//   33  122:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   34  125:pop             
			stringbuilder.append(Base64Utils.encodeUrlSafe((byte[])obj));
	//   35  126:aload_0         
	//   36  127:aload_2         
	//   37  128:checkcast       #260 <Class byte[]>
	//   38  131:invokestatic    #266 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//   39  134:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   40  137:pop             
			stringbuilder.append("\"");
	//   41  138:aload_0         
	//   42  139:ldc2            #258 <String "\"">
	//   43  142:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   44  145:pop             
			return;
	//   45  146:return          

		case 8: // '\b'
			stringbuilder.append("\"");
	//   46  147:aload_0         
	//   47  148:ldc2            #258 <String "\"">
	//   48  151:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   49  154:pop             
			stringbuilder.append(Base64Utils.encode((byte[])obj));
	//   50  155:aload_0         
	//   51  156:aload_2         
	//   52  157:checkcast       #260 <Class byte[]>
	//   53  160:invokestatic    #269 <Method String Base64Utils.encode(byte[])>
	//   54  163:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   55  166:pop             
			stringbuilder.append("\"");
	//   56  167:aload_0         
	//   57  168:ldc2            #258 <String "\"">
	//   58  171:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   59  174:pop             
			return;
	//   60  175:return          

		case 7: // '\007'
			stringbuilder.append("\"");
	//   61  176:aload_0         
	//   62  177:ldc2            #258 <String "\"">
	//   63  180:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   64  183:pop             
			stringbuilder.append(JsonUtils.escapeString(obj.toString()));
	//   65  184:aload_0         
	//   66  185:aload_2         
	//   67  186:invokevirtual   #270 <Method String Object.toString()>
	//   68  189:invokestatic    #275 <Method String JsonUtils.escapeString(String)>
	//   69  192:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   70  195:pop             
			stringbuilder.append("\"");
	//   71  196:aload_0         
	//   72  197:ldc2            #258 <String "\"">
	//   73  200:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   74  203:pop             
			return;
	//   75  204:return          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			stringbuilder.append(obj);
	//   76  205:aload_0         
	//   77  206:aload_2         
	//   78  207:invokevirtual   #278 <Method StringBuilder StringBuilder.append(Object)>
	//   79  210:pop             
			return;
	//   80  211:return          
		}
	}

	private final void zza(StringBuilder stringbuilder, Map map, Parcel parcel)
	{
		SparseArray sparsearray = new SparseArray();
	//    0    0:new             #281 <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #282 <Method void SparseArray()>
	//    3    7:astore          7
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); sparsearray.put(((FastJsonResponse.Field)entry.getValue()).getSafeParcelableFieldId(), ((Object) (entry))))
	//*   4    9:aload_2         
	//*   5   10:invokeinterface #285 <Method Set Map.entrySet()>
	//*   6   15:invokeinterface #108 <Method Iterator Set.iterator()>
	//*   7   20:astore_2        
	//*   8   21:aload_2         
	//*   9   22:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  10   27:ifeq            64
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   30:aload_2         
	//   12   31:invokeinterface #118 <Method Object Iterator.next()>
	//   13   36:checkcast       #287 <Class java.util.Map$Entry>
	//   14   39:astore          8

	//   15   41:aload           7
	//   16   43:aload           8
	//   17   45:invokeinterface #290 <Method Object java.util.Map$Entry.getValue()>
	//   18   50:checkcast       #224 <Class FastJsonResponse$Field>
	//   19   53:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   20   56:aload           8
	//   21   58:invokevirtual   #296 <Method void SparseArray.put(int, Object)>
	//*  22   61:goto            21
		stringbuilder.append('{');
	//   23   64:aload_1         
	//   24   65:bipush          123
	//   25   67:invokevirtual   #299 <Method StringBuilder StringBuilder.append(char)>
	//   26   70:pop             
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//   27   71:aload_3         
	//   28   72:invokestatic    #305 <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//   29   75:istore          5
		int i = 0;
	//   30   77:iconst_0        
	//   31   78:istore          4
label0:
		do
		{
label1:
			{
				int k;
label2:
				{
label3:
					{
label4:
						{
label5:
							{
label6:
								{
label7:
									{
label8:
										{
label9:
											{
label10:
												{
													Object obj;
label11:
													{
label12:
														{
label13:
															{
																if(parcel.dataPosition() >= j)
																	break label0;
	//   32   80:aload_3         
	//   33   81:invokevirtual   #308 <Method int Parcel.dataPosition()>
	//   34   84:iload           5
	//   35   86:icmpge          1147
																k = SafeParcelReader.readHeader(parcel);
	//   36   89:aload_3         
	//   37   90:invokestatic    #311 <Method int SafeParcelReader.readHeader(Parcel)>
	//   38   93:istore          6
																obj = ((Object) ((java.util.Map.Entry)sparsearray.get(SafeParcelReader.getFieldId(k))));
	//   39   95:aload           7
	//   40   97:iload           6
	//   41   99:invokestatic    #315 <Method int SafeParcelReader.getFieldId(int)>
	//   42  102:invokevirtual   #318 <Method Object SparseArray.get(int)>
	//   43  105:checkcast       #287 <Class java.util.Map$Entry>
	//   44  108:astore          8
																if(obj == null)
																	continue;
	//   45  110:aload           8
	//   46  112:ifnull          80
																if(i != 0)
	//*  47  115:iload           4
	//*  48  117:ifeq            128
																	stringbuilder.append(",");
	//   49  120:aload_1         
	//   50  121:ldc2            #320 <String ",">
	//   51  124:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   52  127:pop             
																map = ((Map) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   53  128:aload           8
	//   54  130:invokeinterface #323 <Method Object java.util.Map$Entry.getKey()>
	//   55  135:checkcast       #87  <Class String>
	//   56  138:astore_2        
																obj = ((Object) ((FastJsonResponse.Field)((java.util.Map.Entry) (obj)).getValue()));
	//   57  139:aload           8
	//   58  141:invokeinterface #290 <Method Object java.util.Map$Entry.getValue()>
	//   59  146:checkcast       #224 <Class FastJsonResponse$Field>
	//   60  149:astore          8
																stringbuilder.append("\"");
	//   61  151:aload_1         
	//   62  152:ldc2            #258 <String "\"">
	//   63  155:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   64  158:pop             
																stringbuilder.append(((String) (map)));
	//   65  159:aload_1         
	//   66  160:aload_2         
	//   67  161:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   68  164:pop             
																stringbuilder.append("\":");
	//   69  165:aload_1         
	//   70  166:ldc2            #325 <String "\":">
	//   71  169:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   72  172:pop             
																if(((FastJsonResponse.Field) (obj)).hasConverter())
	//*  73  173:aload           8
	//*  74  175:invokevirtual   #328 <Method boolean FastJsonResponse$Field.hasConverter()>
	//*  75  178:ifeq            434
																{
																	switch(((FastJsonResponse.Field) (obj)).getTypeOut())
	//*  76  181:aload           8
	//*  77  183:invokevirtual   #331 <Method int FastJsonResponse$Field.getTypeOut()>
																	{
	//*  78  186:tableswitch     0 11: default 248
	//	               0 407
	//	               1 397
	//	               2 384
	//	               3 371
	//	               4 358
	//	               5 348
	//	               6 335
	//	               7 325
	//	               8 315
	//	               9 315
	//	               10 302
	//	               11 292
																	default:
																		i = ((FastJsonResponse.Field) (obj)).getTypeOut();
	//   79  248:aload           8
	//   80  250:invokevirtual   #331 <Method int FastJsonResponse$Field.getTypeOut()>
	//   81  253:istore          4
																		stringbuilder = new StringBuilder(36);
	//   82  255:new             #230 <Class StringBuilder>
	//   83  258:dup             
	//   84  259:bipush          36
	//   85  261:invokespecial   #233 <Method void StringBuilder(int)>
	//   86  264:astore_1        
																		stringbuilder.append("Unknown field out type = ");
	//   87  265:aload_1         
	//   88  266:ldc2            #333 <String "Unknown field out type = ">
	//   89  269:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   90  272:pop             
																		stringbuilder.append(i);
	//   91  273:aload_1         
	//   92  274:iload           4
	//   93  276:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//   94  279:pop             
																		throw new IllegalArgumentException(stringbuilder.toString());
	//   95  280:new             #244 <Class IllegalArgumentException>
	//   96  283:dup             
	//   97  284:aload_1         
	//   98  285:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   99  288:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//  100  291:athrow          

																	case 11: // '\013'
																		throw new IllegalArgumentException("Method does not accept concrete type.");
	//  101  292:new             #244 <Class IllegalArgumentException>
	//  102  295:dup             
	//  103  296:ldc1            #250 <String "Method does not accept concrete type.">
	//  104  298:invokespecial   #248 <Method void IllegalArgumentException(String)>
	//  105  301:athrow          

																	case 10: // '\n'
																		map = ((Map) (convertBundleToStringMap(SafeParcelReader.createBundle(parcel, k))));
	//  106  302:aload_3         
	//  107  303:iload           6
	//  108  305:invokestatic    #337 <Method Bundle SafeParcelReader.createBundle(Parcel, int)>
	//  109  308:invokestatic    #339 <Method HashMap convertBundleToStringMap(Bundle)>
	//  110  311:astore_2        
																		break;

	//* 111  312:goto            417
																	case 8: // '\b'
																	case 9: // '\t'
																		map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  112  315:aload_3         
	//  113  316:iload           6
	//  114  318:invokestatic    #343 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  115  321:astore_2        
																		break;

	//* 116  322:goto            417
																	case 7: // '\007'
																		map = ((Map) (SafeParcelReader.createString(parcel, k)));
	//  117  325:aload_3         
	//  118  326:iload           6
	//  119  328:invokestatic    #347 <Method String SafeParcelReader.createString(Parcel, int)>
	//  120  331:astore_2        
																		break;

	//* 121  332:goto            417
																	case 6: // '\006'
																		map = ((Map) (Boolean.valueOf(SafeParcelReader.readBoolean(parcel, k))));
	//  122  335:aload_3         
	//  123  336:iload           6
	//  124  338:invokestatic    #351 <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//  125  341:invokestatic    #356 <Method Boolean Boolean.valueOf(boolean)>
	//  126  344:astore_2        
																		break;

	//* 127  345:goto            417
																	case 5: // '\005'
																		map = ((Map) (SafeParcelReader.createBigDecimal(parcel, k)));
	//  128  348:aload_3         
	//  129  349:iload           6
	//  130  351:invokestatic    #360 <Method BigDecimal SafeParcelReader.createBigDecimal(Parcel, int)>
	//  131  354:astore_2        
																		break;

	//* 132  355:goto            417
																	case 4: // '\004'
																		map = ((Map) (Double.valueOf(SafeParcelReader.readDouble(parcel, k))));
	//  133  358:aload_3         
	//  134  359:iload           6
	//  135  361:invokestatic    #364 <Method double SafeParcelReader.readDouble(Parcel, int)>
	//  136  364:invokestatic    #369 <Method Double Double.valueOf(double)>
	//  137  367:astore_2        
																		break;

	//* 138  368:goto            417
																	case 3: // '\003'
																		map = ((Map) (Float.valueOf(SafeParcelReader.readFloat(parcel, k))));
	//  139  371:aload_3         
	//  140  372:iload           6
	//  141  374:invokestatic    #373 <Method float SafeParcelReader.readFloat(Parcel, int)>
	//  142  377:invokestatic    #378 <Method Float Float.valueOf(float)>
	//  143  380:astore_2        
																		break;

	//* 144  381:goto            417
																	case 2: // '\002'
																		map = ((Map) (Long.valueOf(SafeParcelReader.readLong(parcel, k))));
	//  145  384:aload_3         
	//  146  385:iload           6
	//  147  387:invokestatic    #382 <Method long SafeParcelReader.readLong(Parcel, int)>
	//  148  390:invokestatic    #387 <Method Long Long.valueOf(long)>
	//  149  393:astore_2        
																		break;

	//* 150  394:goto            417
																	case 1: // '\001'
																		map = ((Map) (SafeParcelReader.createBigInteger(parcel, k)));
	//  151  397:aload_3         
	//  152  398:iload           6
	//  153  400:invokestatic    #391 <Method BigInteger SafeParcelReader.createBigInteger(Parcel, int)>
	//  154  403:astore_2        
																		break;

	//* 155  404:goto            417
																	case 0: // '\0'
																		map = ((Map) (Integer.valueOf(SafeParcelReader.readInt(parcel, k))));
	//  156  407:aload_3         
	//  157  408:iload           6
	//  158  410:invokestatic    #395 <Method int SafeParcelReader.readInt(Parcel, int)>
	//  159  413:invokestatic    #400 <Method Integer Integer.valueOf(int)>
	//  160  416:astore_2        
																		break;
																	}
																	zzb(stringbuilder, ((FastJsonResponse.Field) (obj)), ((FastJsonResponse)this).getOriginalValue(((FastJsonResponse.Field) (obj)), ((Object) (map))));
	//  161  417:aload_0         
	//  162  418:aload_1         
	//  163  419:aload           8
	//  164  421:aload_0         
	//  165  422:aload           8
	//  166  424:aload_2         
	//  167  425:invokevirtual   #404 <Method Object FastJsonResponse.getOriginalValue(FastJsonResponse$Field, Object)>
	//  168  428:invokespecial   #408 <Method void zzb(StringBuilder, FastJsonResponse$Field, Object)>
																	break label1;
	//  169  431:goto            1141
																}
																if(!((FastJsonResponse.Field) (obj)).isTypeOutArray())
																	break label11;
	//  170  434:aload           8
	//  171  436:invokevirtual   #411 <Method boolean FastJsonResponse$Field.isTypeOutArray()>
	//  172  439:ifeq            710
																stringbuilder.append("[");
	//  173  442:aload_1         
	//  174  443:ldc2            #413 <String "[">
	//  175  446:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  176  449:pop             
																switch(((FastJsonResponse.Field) (obj)).getTypeOut())
	//* 177  450:aload           8
	//* 178  452:invokevirtual   #331 <Method int FastJsonResponse$Field.getTypeOut()>
																{
	//* 179  455:tableswitch     0 11: default 516
	//	               0 693
	//	               1 678
	//	               2 665
	//	               3 652
	//	               4 639
	//	               5 629
	//	               6 616
	//	               7 603
	//	               8 592
	//	               9 592
	//	               10 592
	//	               11 527
																default:
																	throw new IllegalStateException("Unknown field type out.");
	//  180  516:new             #189 <Class IllegalStateException>
	//  181  519:dup             
	//  182  520:ldc2            #415 <String "Unknown field type out.">
	//  183  523:invokespecial   #416 <Method void IllegalStateException(String)>
	//  184  526:athrow          

																case 0: // '\0'
																	break label13;

																case 11: // '\013'
																	map = ((Map) (SafeParcelReader.createParcelArray(parcel, k)));
	//  185  527:aload_3         
	//  186  528:iload           6
	//  187  530:invokestatic    #420 <Method Parcel[] SafeParcelReader.createParcelArray(Parcel, int)>
	//  188  533:astore_2        
																	k = map.length;
	//  189  534:aload_2         
	//  190  535:arraylength     
	//  191  536:istore          6
																	for(i = 0; i < k; i++)
	//* 192  538:iconst_0        
	//* 193  539:istore          4
	//* 194  541:iload           4
	//* 195  543:iload           6
	//* 196  545:icmpge          703
																	{
																		if(i > 0)
	//* 197  548:iload           4
	//* 198  550:ifle            561
																			stringbuilder.append(",");
	//  199  553:aload_1         
	//  200  554:ldc2            #320 <String ",">
	//  201  557:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  202  560:pop             
																		((Parcel) (map[i])).setDataPosition(0);
	//  203  561:aload_2         
	//  204  562:iload           4
	//  205  564:aaload          
	//  206  565:iconst_0        
	//  207  566:invokevirtual   #423 <Method void Parcel.setDataPosition(int)>
																		zza(stringbuilder, ((FastJsonResponse.Field) (obj)).getConcreteTypeFieldMappingFromDictionary(), ((Parcel) (map[i])));
	//  208  569:aload_0         
	//  209  570:aload_1         
	//  210  571:aload           8
	//  211  573:invokevirtual   #426 <Method Map FastJsonResponse$Field.getConcreteTypeFieldMappingFromDictionary()>
	//  212  576:aload_2         
	//  213  577:iload           4
	//  214  579:aaload          
	//  215  580:invokespecial   #428 <Method void zza(StringBuilder, Map, Parcel)>
																	}

	//  216  583:iload           4
	//  217  585:iconst_1        
	//  218  586:iadd            
	//  219  587:istore          4
																	break label12;
	//  220  589:goto            541

																case 8: // '\b'
																case 9: // '\t'
																case 10: // '\n'
																	throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
	//  221  592:new             #430 <Class UnsupportedOperationException>
	//  222  595:dup             
	//  223  596:ldc2            #432 <String "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported">
	//  224  599:invokespecial   #433 <Method void UnsupportedOperationException(String)>
	//  225  602:athrow          

																case 7: // '\007'
																	ArrayUtils.writeStringArray(stringbuilder, SafeParcelReader.createStringArray(parcel, k));
	//  226  603:aload_1         
	//  227  604:aload_3         
	//  228  605:iload           6
	//  229  607:invokestatic    #437 <Method String[] SafeParcelReader.createStringArray(Parcel, int)>
	//  230  610:invokestatic    #443 <Method void ArrayUtils.writeStringArray(StringBuilder, String[])>
																	break label12;
	//  231  613:goto            703

																case 6: // '\006'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createBooleanArray(parcel, k));
	//  232  616:aload_1         
	//  233  617:aload_3         
	//  234  618:iload           6
	//  235  620:invokestatic    #447 <Method boolean[] SafeParcelReader.createBooleanArray(Parcel, int)>
	//  236  623:invokestatic    #451 <Method void ArrayUtils.writeArray(StringBuilder, boolean[])>
																	break label12;
	//  237  626:goto            703

																case 5: // '\005'
																	map = ((Map) (SafeParcelReader.createBigDecimalArray(parcel, k)));
	//  238  629:aload_3         
	//  239  630:iload           6
	//  240  632:invokestatic    #455 <Method BigDecimal[] SafeParcelReader.createBigDecimalArray(Parcel, int)>
	//  241  635:astore_2        
																	break;
	//  242  636:goto            685

																case 4: // '\004'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createDoubleArray(parcel, k));
	//  243  639:aload_1         
	//  244  640:aload_3         
	//  245  641:iload           6
	//  246  643:invokestatic    #459 <Method double[] SafeParcelReader.createDoubleArray(Parcel, int)>
	//  247  646:invokestatic    #462 <Method void ArrayUtils.writeArray(StringBuilder, double[])>
																	break label12;
	//  248  649:goto            703

																case 3: // '\003'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createFloatArray(parcel, k));
	//  249  652:aload_1         
	//  250  653:aload_3         
	//  251  654:iload           6
	//  252  656:invokestatic    #466 <Method float[] SafeParcelReader.createFloatArray(Parcel, int)>
	//  253  659:invokestatic    #469 <Method void ArrayUtils.writeArray(StringBuilder, float[])>
																	break label12;
	//  254  662:goto            703

																case 2: // '\002'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createLongArray(parcel, k));
	//  255  665:aload_1         
	//  256  666:aload_3         
	//  257  667:iload           6
	//  258  669:invokestatic    #473 <Method long[] SafeParcelReader.createLongArray(Parcel, int)>
	//  259  672:invokestatic    #476 <Method void ArrayUtils.writeArray(StringBuilder, long[])>
																	break label12;
	//  260  675:goto            703

																case 1: // '\001'
																	map = ((Map) (SafeParcelReader.createBigIntegerArray(parcel, k)));
	//  261  678:aload_3         
	//  262  679:iload           6
	//  263  681:invokestatic    #480 <Method BigInteger[] SafeParcelReader.createBigIntegerArray(Parcel, int)>
	//  264  684:astore_2        
																	break;
																}
																ArrayUtils.writeArray(stringbuilder, ((Object []) (map)));
	//  265  685:aload_1         
	//  266  686:aload_2         
	//  267  687:invokestatic    #483 <Method void ArrayUtils.writeArray(StringBuilder, Object[])>
																break label12;
	//  268  690:goto            703
															}
															ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createIntArray(parcel, k));
	//  269  693:aload_1         
	//  270  694:aload_3         
	//  271  695:iload           6
	//  272  697:invokestatic    #487 <Method int[] SafeParcelReader.createIntArray(Parcel, int)>
	//  273  700:invokestatic    #490 <Method void ArrayUtils.writeArray(StringBuilder, int[])>
														}
														map = "]";
	//  274  703:ldc2            #492 <String "]">
	//  275  706:astore_2        
														break label10;
	//  276  707:goto            1039
													}
													switch(((FastJsonResponse.Field) (obj)).getTypeOut())
	//* 277  710:aload           8
	//* 278  712:invokevirtual   #331 <Method int FastJsonResponse$Field.getTypeOut()>
													{
	//* 279  715:tableswitch     0 11: default 776
	//	               0 1130
	//	               1 1114
	//	               2 1100
	//	               3 1086
	//	               4 1072
	//	               5 1062
	//	               6 1048
	//	               7 1009
	//	               8 986
	//	               9 963
	//	               10 813
	//	               11 787
													default:
														throw new IllegalStateException("Unknown field type out");
	//  280  776:new             #189 <Class IllegalStateException>
	//  281  779:dup             
	//  282  780:ldc2            #494 <String "Unknown field type out">
	//  283  783:invokespecial   #416 <Method void IllegalStateException(String)>
	//  284  786:athrow          

													case 0: // '\0'
														break label2;

													case 1: // '\001'
														break label4;

													case 2: // '\002'
														break label5;

													case 3: // '\003'
														break label6;

													case 4: // '\004'
														break label7;

													case 5: // '\005'
														break label8;

													case 6: // '\006'
														break label9;

													case 11: // '\013'
														map = ((Map) (SafeParcelReader.createParcel(parcel, k)));
	//  285  787:aload_3         
	//  286  788:iload           6
	//  287  790:invokestatic    #498 <Method Parcel SafeParcelReader.createParcel(Parcel, int)>
	//  288  793:astore_2        
														((Parcel) (map)).setDataPosition(0);
	//  289  794:aload_2         
	//  290  795:iconst_0        
	//  291  796:invokevirtual   #423 <Method void Parcel.setDataPosition(int)>
														zza(stringbuilder, ((FastJsonResponse.Field) (obj)).getConcreteTypeFieldMappingFromDictionary(), ((Parcel) (map)));
	//  292  799:aload_0         
	//  293  800:aload_1         
	//  294  801:aload           8
	//  295  803:invokevirtual   #426 <Method Map FastJsonResponse$Field.getConcreteTypeFieldMappingFromDictionary()>
	//  296  806:aload_2         
	//  297  807:invokespecial   #428 <Method void zza(StringBuilder, Map, Parcel)>
														break label1;
	//  298  810:goto            1141

													case 10: // '\n'
														map = ((Map) (SafeParcelReader.createBundle(parcel, k)));
	//  299  813:aload_3         
	//  300  814:iload           6
	//  301  816:invokestatic    #337 <Method Bundle SafeParcelReader.createBundle(Parcel, int)>
	//  302  819:astore_2        
														Object obj1 = ((Object) (((Bundle) (map)).keySet()));
	//  303  820:aload_2         
	//  304  821:invokevirtual   #102 <Method Set Bundle.keySet()>
	//  305  824:astore          8
														((Set) (obj1)).size();
	//  306  826:aload           8
	//  307  828:invokeinterface #501 <Method int Set.size()>
	//  308  833:pop             
														stringbuilder.append("{");
	//  309  834:aload_1         
	//  310  835:ldc2            #503 <String "{">
	//  311  838:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  312  841:pop             
														obj1 = ((Object) (((Set) (obj1)).iterator()));
	//  313  842:aload           8
	//  314  844:invokeinterface #108 <Method Iterator Set.iterator()>
	//  315  849:astore          8
														for(i = 1; ((Iterator) (obj1)).hasNext(); i = 0)
	//* 316  851:iconst_1        
	//* 317  852:istore          4
	//* 318  854:aload           8
	//* 319  856:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//* 320  861:ifeq            956
														{
															String s = (String)((Iterator) (obj1)).next();
	//  321  864:aload           8
	//  322  866:invokeinterface #118 <Method Object Iterator.next()>
	//  323  871:checkcast       #87  <Class String>
	//  324  874:astore          9
															if(i == 0)
	//* 325  876:iload           4
	//* 326  878:ifne            889
																stringbuilder.append(",");
	//  327  881:aload_1         
	//  328  882:ldc2            #320 <String ",">
	//  329  885:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  330  888:pop             
															stringbuilder.append("\"");
	//  331  889:aload_1         
	//  332  890:ldc2            #258 <String "\"">
	//  333  893:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  334  896:pop             
															stringbuilder.append(s);
	//  335  897:aload_1         
	//  336  898:aload           9
	//  337  900:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  338  903:pop             
															stringbuilder.append("\"");
	//  339  904:aload_1         
	//  340  905:ldc2            #258 <String "\"">
	//  341  908:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  342  911:pop             
															stringbuilder.append(":");
	//  343  912:aload_1         
	//  344  913:ldc2            #505 <String ":">
	//  345  916:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  346  919:pop             
															stringbuilder.append("\"");
	//  347  920:aload_1         
	//  348  921:ldc2            #258 <String "\"">
	//  349  924:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  350  927:pop             
															stringbuilder.append(JsonUtils.escapeString(((Bundle) (map)).getString(s)));
	//  351  928:aload_1         
	//  352  929:aload_2         
	//  353  930:aload           9
	//  354  932:invokevirtual   #122 <Method String Bundle.getString(String)>
	//  355  935:invokestatic    #275 <Method String JsonUtils.escapeString(String)>
	//  356  938:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  357  941:pop             
															stringbuilder.append("\"");
	//  358  942:aload_1         
	//  359  943:ldc2            #258 <String "\"">
	//  360  946:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  361  949:pop             
														}

	//  362  950:iconst_0        
	//  363  951:istore          4
	//* 364  953:goto            854
														map = "}";
	//  365  956:ldc2            #507 <String "}">
	//  366  959:astore_2        
														break label10;
	//  367  960:goto            1039

													case 9: // '\t'
														map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  368  963:aload_3         
	//  369  964:iload           6
	//  370  966:invokestatic    #343 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  371  969:astore_2        
														stringbuilder.append("\"");
	//  372  970:aload_1         
	//  373  971:ldc2            #258 <String "\"">
	//  374  974:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  375  977:pop             
														map = ((Map) (Base64Utils.encodeUrlSafe(((byte []) (map)))));
	//  376  978:aload_2         
	//  377  979:invokestatic    #266 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//  378  982:astore_2        
														break;
	//  379  983:goto            1029

													case 8: // '\b'
														map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  380  986:aload_3         
	//  381  987:iload           6
	//  382  989:invokestatic    #343 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  383  992:astore_2        
														stringbuilder.append("\"");
	//  384  993:aload_1         
	//  385  994:ldc2            #258 <String "\"">
	//  386  997:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  387 1000:pop             
														map = ((Map) (Base64Utils.encode(((byte []) (map)))));
	//  388 1001:aload_2         
	//  389 1002:invokestatic    #269 <Method String Base64Utils.encode(byte[])>
	//  390 1005:astore_2        
														break;
	//  391 1006:goto            1029

													case 7: // '\007'
														map = ((Map) (SafeParcelReader.createString(parcel, k)));
	//  392 1009:aload_3         
	//  393 1010:iload           6
	//  394 1012:invokestatic    #347 <Method String SafeParcelReader.createString(Parcel, int)>
	//  395 1015:astore_2        
														stringbuilder.append("\"");
	//  396 1016:aload_1         
	//  397 1017:ldc2            #258 <String "\"">
	//  398 1020:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  399 1023:pop             
														map = ((Map) (JsonUtils.escapeString(((String) (map)))));
	//  400 1024:aload_2         
	//  401 1025:invokestatic    #275 <Method String JsonUtils.escapeString(String)>
	//  402 1028:astore_2        
														break;
													}
													stringbuilder.append(((String) (map)));
	//  403 1029:aload_1         
	//  404 1030:aload_2         
	//  405 1031:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  406 1034:pop             
													map = "\"";
	//  407 1035:ldc2            #258 <String "\"">
	//  408 1038:astore_2        
												}
												stringbuilder.append(((String) (map)));
	//  409 1039:aload_1         
	//  410 1040:aload_2         
	//  411 1041:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  412 1044:pop             
												break label1;
	//  413 1045:goto            1141
											}
											stringbuilder.append(SafeParcelReader.readBoolean(parcel, k));
	//  414 1048:aload_1         
	//  415 1049:aload_3         
	//  416 1050:iload           6
	//  417 1052:invokestatic    #351 <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//  418 1055:invokevirtual   #510 <Method StringBuilder StringBuilder.append(boolean)>
	//  419 1058:pop             
											break label1;
	//  420 1059:goto            1141
										}
										map = ((Map) (SafeParcelReader.createBigDecimal(parcel, k)));
	//  421 1062:aload_3         
	//  422 1063:iload           6
	//  423 1065:invokestatic    #360 <Method BigDecimal SafeParcelReader.createBigDecimal(Parcel, int)>
	//  424 1068:astore_2        
										break label3;
	//  425 1069:goto            1121
									}
									stringbuilder.append(SafeParcelReader.readDouble(parcel, k));
	//  426 1072:aload_1         
	//  427 1073:aload_3         
	//  428 1074:iload           6
	//  429 1076:invokestatic    #364 <Method double SafeParcelReader.readDouble(Parcel, int)>
	//  430 1079:invokevirtual   #513 <Method StringBuilder StringBuilder.append(double)>
	//  431 1082:pop             
									break label1;
	//  432 1083:goto            1141
								}
								stringbuilder.append(SafeParcelReader.readFloat(parcel, k));
	//  433 1086:aload_1         
	//  434 1087:aload_3         
	//  435 1088:iload           6
	//  436 1090:invokestatic    #373 <Method float SafeParcelReader.readFloat(Parcel, int)>
	//  437 1093:invokevirtual   #516 <Method StringBuilder StringBuilder.append(float)>
	//  438 1096:pop             
								break label1;
	//  439 1097:goto            1141
							}
							stringbuilder.append(SafeParcelReader.readLong(parcel, k));
	//  440 1100:aload_1         
	//  441 1101:aload_3         
	//  442 1102:iload           6
	//  443 1104:invokestatic    #382 <Method long SafeParcelReader.readLong(Parcel, int)>
	//  444 1107:invokevirtual   #519 <Method StringBuilder StringBuilder.append(long)>
	//  445 1110:pop             
							break label1;
	//  446 1111:goto            1141
						}
						map = ((Map) (SafeParcelReader.createBigInteger(parcel, k)));
	//  447 1114:aload_3         
	//  448 1115:iload           6
	//  449 1117:invokestatic    #391 <Method BigInteger SafeParcelReader.createBigInteger(Parcel, int)>
	//  450 1120:astore_2        
					}
					stringbuilder.append(((Object) (map)));
	//  451 1121:aload_1         
	//  452 1122:aload_2         
	//  453 1123:invokevirtual   #278 <Method StringBuilder StringBuilder.append(Object)>
	//  454 1126:pop             
					break label1;
	//  455 1127:goto            1141
				}
				stringbuilder.append(SafeParcelReader.readInt(parcel, k));
	//  456 1130:aload_1         
	//  457 1131:aload_3         
	//  458 1132:iload           6
	//  459 1134:invokestatic    #395 <Method int SafeParcelReader.readInt(Parcel, int)>
	//  460 1137:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//  461 1140:pop             
			}
			i = 1;
	//  462 1141:iconst_1        
	//  463 1142:istore          4
		} while(true);
	//  464 1144:goto            80
		if(parcel.dataPosition() == j)
	//* 465 1147:aload_3         
	//* 466 1148:invokevirtual   #308 <Method int Parcel.dataPosition()>
	//* 467 1151:iload           5
	//* 468 1153:icmpne          1164
		{
			stringbuilder.append('}');
	//  469 1156:aload_1         
	//  470 1157:bipush          125
	//  471 1159:invokevirtual   #299 <Method StringBuilder StringBuilder.append(char)>
	//  472 1162:pop             
			return;
	//  473 1163:return          
		} else
		{
			stringbuilder = new StringBuilder(37);
	//  474 1164:new             #230 <Class StringBuilder>
	//  475 1167:dup             
	//  476 1168:bipush          37
	//  477 1170:invokespecial   #233 <Method void StringBuilder(int)>
	//  478 1173:astore_1        
			stringbuilder.append("Overread allowed size end=");
	//  479 1174:aload_1         
	//  480 1175:ldc2            #521 <String "Overread allowed size end=">
	//  481 1178:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//  482 1181:pop             
			stringbuilder.append(j);
	//  483 1182:aload_1         
	//  484 1183:iload           5
	//  485 1185:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//  486 1188:pop             
			throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(stringbuilder.toString(), parcel);
	//  487 1189:new             #523 <Class com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException>
	//  488 1192:dup             
	//  489 1193:aload_1         
	//  490 1194:invokevirtual   #247 <Method String StringBuilder.toString()>
	//  491 1197:aload_3         
	//  492 1198:invokespecial   #526 <Method void com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(String, Parcel)>
	//  493 1201:athrow          
		}
	}

	private final void zzb(FastJsonResponse.Field field)
	{
		if(field.isValidSafeParcelableFieldId())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #531 <Method boolean FastJsonResponse$Field.isValidSafeParcelableFieldId()>
	//*   2    4:ifeq            96
		{
			field = ((FastJsonResponse.Field) (zzxq));
	//    3    7:aload_0         
	//    4    8:getfield        #58  <Field Parcel zzxq>
	//    5   11:astore_1        
			if(field != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          85
			{
				switch(zzxs)
	//*   8   16:aload_0         
	//*   9   17:getfield        #72  <Field int zzxs>
				{
	//*  10   20:tableswitch     0 2: default 48
	//	               0 71
	//	               1 70
	//	               2 59
				default:
					throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
	//   11   48:new             #189 <Class IllegalStateException>
	//   12   51:dup             
	//   13   52:ldc2            #533 <String "Unknown parse state in SafeParcelResponse.">
	//   14   55:invokespecial   #416 <Method void IllegalStateException(String)>
	//   15   58:athrow          

				case 2: // '\002'
					throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
	//   16   59:new             #189 <Class IllegalStateException>
	//   17   62:dup             
	//   18   63:ldc2            #535 <String "Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.">
	//   19   66:invokespecial   #416 <Method void IllegalStateException(String)>
	//   20   69:athrow          

				case 1: // '\001'
					return;
	//   21   70:return          

				case 0: // '\0'
					zzxt = SafeParcelWriter.beginObjectHeader(((Parcel) (field)));
	//   22   71:aload_0         
	//   23   72:aload_1         
	//   24   73:invokestatic    #540 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   25   76:putfield        #542 <Field int zzxt>
					break;
				}
				zzxs = 1;
	//   26   79:aload_0         
	//   27   80:iconst_1        
	//   28   81:putfield        #72  <Field int zzxs>
				return;
	//   29   84:return          
			} else
			{
				throw new IllegalStateException("Internal Parcel object is null.");
	//   30   85:new             #189 <Class IllegalStateException>
	//   31   88:dup             
	//   32   89:ldc2            #544 <String "Internal Parcel object is null.">
	//   33   92:invokespecial   #416 <Method void IllegalStateException(String)>
	//   34   95:athrow          
			}
		} else
		{
			throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
	//   35   96:new             #189 <Class IllegalStateException>
	//   36   99:dup             
	//   37  100:ldc2            #546 <String "Field does not have a valid safe parcelable field id.">
	//   38  103:invokespecial   #416 <Method void IllegalStateException(String)>
	//   39  106:athrow          
		}
	}

	private final void zzb(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
	{
		if(field.isTypeInArray())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #550 <Method boolean FastJsonResponse$Field.isTypeInArray()>
	//*   2    4:ifeq            81
		{
			obj = ((Object) ((ArrayList)obj));
	//    3    7:aload_3         
	//    4    8:checkcast       #552 <Class ArrayList>
	//    5   11:astore_3        
			stringbuilder.append("[");
	//    6   12:aload_1         
	//    7   13:ldc2            #413 <String "[">
	//    8   16:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
			int j = ((ArrayList) (obj)).size();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #553 <Method int ArrayList.size()>
	//   12   24:istore          5
			for(int i = 0; i < j; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore          4
	//*  15   29:iload           4
	//*  16   31:iload           5
	//*  17   33:icmpge          72
			{
				if(i != 0)
	//*  18   36:iload           4
	//*  19   38:ifeq            49
					stringbuilder.append(",");
	//   20   41:aload_1         
	//   21   42:ldc2            #320 <String ",">
	//   22   45:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
				zza(stringbuilder, field.getTypeIn(), ((ArrayList) (obj)).get(i));
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #556 <Method int FastJsonResponse$Field.getTypeIn()>
	//   27   54:aload_3         
	//   28   55:iload           4
	//   29   57:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   30   60:invokestatic    #559 <Method void zza(StringBuilder, int, Object)>
			}

	//   31   63:iload           4
	//   32   65:iconst_1        
	//   33   66:iadd            
	//   34   67:istore          4
	//*  35   69:goto            29
			stringbuilder.append("]");
	//   36   72:aload_1         
	//   37   73:ldc2            #492 <String "]">
	//   38   76:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
			return;
	//   40   80:return          
		} else
		{
			zza(stringbuilder, field.getTypeIn(), obj);
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:invokevirtual   #556 <Method int FastJsonResponse$Field.getTypeIn()>
	//   44   86:aload_3         
	//   45   87:invokestatic    #559 <Method void zza(StringBuilder, int, Object)>
			return;
	//   46   90:return          
		}
	}

	public void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		s = ((String) (new ArrayList()));
	//    3    5:new             #552 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #565 <Method void ArrayList()>
	//    6   12:astore_2        
		arraylist.size();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #553 <Method int ArrayList.size()>
	//    9   17:pop             
		arraylist = (ArrayList)arraylist;
	//   10   18:aload_3         
	//   11   19:checkcast       #552 <Class ArrayList>
	//   12   22:astore_3        
		int j = arraylist.size();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #553 <Method int ArrayList.size()>
	//   15   27:istore          5
		for(int i = 0; i < j;)
	//*  16   29:iconst_0        
	//*  17   30:istore          4
	//*  18   32:iload           4
	//*  19   34:iload           5
	//*  20   36:icmpge          72
		{
			Object obj = arraylist.get(i);
	//   21   39:aload_3         
	//   22   40:iload           4
	//   23   42:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   24   45:astore          6
			i++;
	//   25   47:iload           4
	//   26   49:iconst_1        
	//   27   50:iadd            
	//   28   51:istore          4
			((ArrayList) (s)).add(((Object) (((SafeParcelResponse)(FastJsonResponse)obj).getParcel())));
	//   29   53:aload_2         
	//   30   54:aload           6
	//   31   56:checkcast       #171 <Class FastJsonResponse>
	//   32   59:checkcast       #2   <Class SafeParcelResponse>
	//   33   62:invokevirtual   #567 <Method Parcel getParcel()>
	//   34   65:invokevirtual   #571 <Method boolean ArrayList.add(Object)>
	//   35   68:pop             
		}

	//*  36   69:goto            32
		SafeParcelWriter.writeParcelList(zzxq, field.getSafeParcelableFieldId(), ((java.util.List) (s)), true);
	//   37   72:aload_0         
	//   38   73:getfield        #58  <Field Parcel zzxq>
	//   39   76:aload_1         
	//   40   77:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   41   80:aload_2         
	//   42   81:iconst_1        
	//   43   82:invokestatic    #575 <Method void SafeParcelWriter.writeParcelList(Parcel, int, java.util.List, boolean)>
	//   44   85:return          
	}

	public void addConcreteTypeInternal(FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		s = ((String) (((SafeParcelResponse)fastjsonresponse).getParcel()));
	//    3    5:aload_3         
	//    4    6:checkcast       #2   <Class SafeParcelResponse>
	//    5    9:invokevirtual   #567 <Method Parcel getParcel()>
	//    6   12:astore_2        
		SafeParcelWriter.writeParcel(zzxq, field.getSafeParcelableFieldId(), ((Parcel) (s)), true);
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field Parcel zzxq>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:invokestatic    #582 <Method void SafeParcelWriter.writeParcel(Parcel, int, Parcel, boolean)>
	//   14   26:return          
	}

	public Map getFieldMappings()
	{
		FieldMappingDictionary fieldmappingdictionary = zzwn;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field FieldMappingDictionary zzwn>
	//    2    4:astore_1        
		if(fieldmappingdictionary == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return fieldmappingdictionary.getFieldMapping(mClassName);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #70  <Field String mClassName>
	//   10   16:invokevirtual   #587 <Method Map FieldMappingDictionary.getFieldMapping(String)>
	//   11   19:areturn         
	}

	public Parcel getParcel()
	{
		switch(zzxs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field int zzxs>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 31
	//	               1 42
	//*   3   28:goto            58
		case 0: // '\0'
			zzxt = SafeParcelWriter.beginObjectHeader(zzxq);
	//    4   31:aload_0         
	//    5   32:aload_0         
	//    6   33:getfield        #58  <Field Parcel zzxq>
	//    7   36:invokestatic    #540 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    8   39:putfield        #542 <Field int zzxt>
			// fall through

		case 1: // '\001'
			SafeParcelWriter.finishObjectHeader(zzxq, zzxt);
	//    9   42:aload_0         
	//   10   43:getfield        #58  <Field Parcel zzxq>
	//   11   46:aload_0         
	//   12   47:getfield        #542 <Field int zzxt>
	//   13   50:invokestatic    #591 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
			zzxs = 2;
	//   14   53:aload_0         
	//   15   54:iconst_2        
	//   16   55:putfield        #72  <Field int zzxs>
			// fall through

		default:
			return zzxq;
	//   17   58:aload_0         
	//   18   59:getfield        #58  <Field Parcel zzxq>
	//   19   62:areturn         
		}
	}

	public Object getValueObject(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #430 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #595 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #433 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public int getVersionCode()
	{
		return zzal;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int zzal>
	//    2    4:ireturn         
	}

	public SafeParcelable inflate(android.os.Parcelable.Creator creator)
	{
		Parcel parcel = getParcel();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #567 <Method Parcel getParcel()>
	//    2    4:astore_2        
		parcel.setDataPosition(0);
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #423 <Method void Parcel.setDataPosition(int)>
		return (SafeParcelable)creator.createFromParcel(parcel);
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokeinterface #603 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//    9   17:checkcast       #81  <Class SafeParcelable>
	//   10   20:areturn         
	}

	public boolean isPrimitiveFieldSet(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #430 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #595 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #433 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBigDecimalInternal(FastJsonResponse.Field field, String s, BigDecimal bigdecimal)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeBigDecimal(zzxq, field.getSafeParcelableFieldId(), bigdecimal, true);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #612 <Method void SafeParcelWriter.writeBigDecimal(Parcel, int, BigDecimal, boolean)>
	//   10   18:return          
	}

	protected void setBigDecimalsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new BigDecimal[j]));
	//    6   11:iload           5
	//    7   13:anewarray       BigDecimal[]
	//    8   16:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          4
	//*  11   20:iload           4
	//*  12   22:iload           5
	//*  13   24:icmpge          49
			s[i] = ((/*<invalid signature>*/java.lang.Object) ((BigDecimal)arraylist.get(i)));
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #616 <Class BigDecimal>
	//   20   39:aastore         

	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
	//*  25   46:goto            20
		SafeParcelWriter.writeBigDecimalArray(zzxq, field.getSafeParcelableFieldId(), ((BigDecimal []) (s)), true);
	//   26   49:aload_0         
	//   27   50:getfield        #58  <Field Parcel zzxq>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #620 <Method void SafeParcelWriter.writeBigDecimalArray(Parcel, int, BigDecimal[], boolean)>
	//   33   62:return          
	}

	protected void setBigIntegerInternal(FastJsonResponse.Field field, String s, BigInteger biginteger)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeBigInteger(zzxq, field.getSafeParcelableFieldId(), biginteger, true);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #627 <Method void SafeParcelWriter.writeBigInteger(Parcel, int, BigInteger, boolean)>
	//   10   18:return          
	}

	protected void setBigIntegersInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new BigInteger[j]));
	//    6   11:iload           5
	//    7   13:anewarray       BigInteger[]
	//    8   16:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          4
	//*  11   20:iload           4
	//*  12   22:iload           5
	//*  13   24:icmpge          49
			s[i] = ((/*<invalid signature>*/java.lang.Object) ((BigInteger)arraylist.get(i)));
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #631 <Class BigInteger>
	//   20   39:aastore         

	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
	//*  25   46:goto            20
		SafeParcelWriter.writeBigIntegerArray(zzxq, field.getSafeParcelableFieldId(), ((BigInteger []) (s)), true);
	//   26   49:aload_0         
	//   27   50:getfield        #58  <Field Parcel zzxq>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #635 <Method void SafeParcelWriter.writeBigIntegerArray(Parcel, int, BigInteger[], boolean)>
	//   33   62:return          
	}

	protected void setBooleanInternal(FastJsonResponse.Field field, String s, boolean flag)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeBoolean(zzxq, field.getSafeParcelableFieldId(), flag);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:iload_3         
	//    8   14:invokestatic    #642 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
	//    9   17:return          
	}

	protected void setBooleansInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new boolean[j]));
	//    6   11:iload           5
	//    7   13:newarray        boolean[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((byte) (((Boolean)arraylist.get(i)).booleanValue()));
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #353 <Class Boolean>
	//   20   38:invokevirtual   #647 <Method boolean Boolean.booleanValue()>
	//   21   41:bastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeBooleanArray(zzxq, field.getSafeParcelableFieldId(), ((boolean []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #58  <Field Parcel zzxq>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #651 <Method void SafeParcelWriter.writeBooleanArray(Parcel, int, boolean[], boolean)>
	//   34   64:return          
	}

	protected void setDecodedBytesInternal(FastJsonResponse.Field field, String s, byte abyte0[])
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeByteArray(zzxq, field.getSafeParcelableFieldId(), abyte0, true);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #658 <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
	//   10   18:return          
	}

	protected void setDoubleInternal(FastJsonResponse.Field field, String s, double d)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeDouble(zzxq, field.getSafeParcelableFieldId(), d);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:dload_3         
	//    8   14:invokestatic    #665 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
	//    9   17:return          
	}

	protected void setDoublesInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new double[j]));
	//    6   11:iload           5
	//    7   13:newarray        double[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Double)arraylist.get(i)).doubleValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #366 <Class Double>
	//   20   38:invokevirtual   #671 <Method double Double.doubleValue()>
	//   21   41:dastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeDoubleArray(zzxq, field.getSafeParcelableFieldId(), ((double []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #58  <Field Parcel zzxq>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #675 <Method void SafeParcelWriter.writeDoubleArray(Parcel, int, double[], boolean)>
	//   34   64:return          
	}

	protected void setFloatInternal(FastJsonResponse.Field field, String s, float f)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeFloat(zzxq, field.getSafeParcelableFieldId(), f);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:fload_3         
	//    8   14:invokestatic    #682 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
	//    9   17:return          
	}

	protected void setFloatsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new float[j]));
	//    6   11:iload           5
	//    7   13:newarray        float[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Float)arraylist.get(i)).floatValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #375 <Class Float>
	//   20   38:invokevirtual   #688 <Method float Float.floatValue()>
	//   21   41:fastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeFloatArray(zzxq, field.getSafeParcelableFieldId(), ((float []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #58  <Field Parcel zzxq>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #692 <Method void SafeParcelWriter.writeFloatArray(Parcel, int, float[], boolean)>
	//   34   64:return          
	}

	protected void setIntegerInternal(FastJsonResponse.Field field, String s, int i)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeInt(zzxq, field.getSafeParcelableFieldId(), i);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:iload_3         
	//    8   14:invokestatic    #699 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
	//    9   17:return          
	}

	protected void setIntegersInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new int[j]));
	//    6   11:iload           5
	//    7   13:newarray        int[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Integer)arraylist.get(i)).intValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #397 <Class Integer>
	//   20   38:invokevirtual   #704 <Method int Integer.intValue()>
	//   21   41:iastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeIntArray(zzxq, field.getSafeParcelableFieldId(), ((int []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #58  <Field Parcel zzxq>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #708 <Method void SafeParcelWriter.writeIntArray(Parcel, int, int[], boolean)>
	//   34   64:return          
	}

	protected void setLongInternal(FastJsonResponse.Field field, String s, long l)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeLong(zzxq, field.getSafeParcelableFieldId(), l);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:lload_3         
	//    8   14:invokestatic    #715 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
	//    9   17:return          
	}

	protected void setLongsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new long[j]));
	//    6   11:iload           5
	//    7   13:newarray        long[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Long)arraylist.get(i)).longValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #384 <Class Long>
	//   20   38:invokevirtual   #721 <Method long Long.longValue()>
	//   21   41:lastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeLongArray(zzxq, field.getSafeParcelableFieldId(), ((long []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #58  <Field Parcel zzxq>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #725 <Method void SafeParcelWriter.writeLongArray(Parcel, int, long[], boolean)>
	//   34   64:return          
	}

	protected void setStringInternal(FastJsonResponse.Field field, String s, String s1)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		SafeParcelWriter.writeString(zzxq, field.getSafeParcelableFieldId(), s1, true);
	//    3    5:aload_0         
	//    4    6:getfield        #58  <Field Parcel zzxq>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #732 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
	//   10   18:return          
	}

	protected void setStringMapInternal(FastJsonResponse.Field field, String s, Map map)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		s = ((String) (new Bundle()));
	//    3    5:new             #98  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #131 <Method void Bundle()>
	//    6   12:astore_2        
		String s1;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((Bundle) (s)).putString(s1, (String)map.get(((Object) (s1)))))
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #221 <Method Set Map.keySet()>
	//*   9   19:invokeinterface #108 <Method Iterator Set.iterator()>
	//*  10   24:astore          4
	//*  11   26:aload           4
	//*  12   28:invokeinterface #114 <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            68
			s1 = (String)iterator.next();
	//   14   36:aload           4
	//   15   38:invokeinterface #118 <Method Object Iterator.next()>
	//   16   43:checkcast       #87  <Class String>
	//   17   46:astore          5

	//   18   48:aload_2         
	//   19   49:aload           5
	//   20   51:aload_3         
	//   21   52:aload           5
	//   22   54:invokeinterface #222 <Method Object Map.get(Object)>
	//   23   59:checkcast       #87  <Class String>
	//   24   62:invokevirtual   #139 <Method void Bundle.putString(String, String)>
	//*  25   65:goto            26
		SafeParcelWriter.writeBundle(zzxq, field.getSafeParcelableFieldId(), ((Bundle) (s)), true);
	//   26   68:aload_0         
	//   27   69:getfield        #58  <Field Parcel zzxq>
	//   28   72:aload_1         
	//   29   73:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   76:aload_2         
	//   31   77:iconst_1        
	//   32   78:invokestatic    #739 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
	//   33   81:return          
	}

	protected void setStringsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zzb(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #564 <Method void zzb(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #553 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new String[j]));
	//    6   11:iload           5
	//    7   13:anewarray       String[]
	//    8   16:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          4
	//*  11   20:iload           4
	//*  12   22:iload           5
	//*  13   24:icmpge          49
			s[i] = ((/*<invalid signature>*/java.lang.Object) ((String)arraylist.get(i)));
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:invokevirtual   #557 <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #87  <Class String>
	//   20   39:aastore         

	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
	//*  25   46:goto            20
		SafeParcelWriter.writeStringArray(zzxq, field.getSafeParcelableFieldId(), ((String []) (s)), true);
	//   26   49:aload_0         
	//   27   50:getfield        #58  <Field Parcel zzxq>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #293 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #744 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
	//   33   62:return          
	}

	public String toString()
	{
		Preconditions.checkNotNull(((Object) (zzwn)), "Cannot convert to JSON on client side.");
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field FieldMappingDictionary zzwn>
	//    2    4:ldc2            #747 <String "Cannot convert to JSON on client side.">
	//    3    7:invokestatic    #749 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4   10:pop             
		Parcel parcel = getParcel();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #567 <Method Parcel getParcel()>
	//    7   15:astore_1        
		parcel.setDataPosition(0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #423 <Method void Parcel.setDataPosition(int)>
		StringBuilder stringbuilder = new StringBuilder(100);
	//   11   21:new             #230 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:bipush          100
	//   14   27:invokespecial   #233 <Method void StringBuilder(int)>
	//   15   30:astore_2        
		zza(stringbuilder, zzwn.getFieldMapping(mClassName), parcel);
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #62  <Field FieldMappingDictionary zzwn>
	//   20   37:aload_0         
	//   21   38:getfield        #70  <Field String mClassName>
	//   22   41:invokevirtual   #587 <Method Map FieldMappingDictionary.getFieldMapping(String)>
	//   23   44:aload_1         
	//   24   45:invokespecial   #428 <Method void zza(StringBuilder, Map, Parcel)>
		return stringbuilder.toString();
	//   25   48:aload_2         
	//   26   49:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   27   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #540 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #751 <Method int getVersionCode()>
	//    7   11:invokestatic    #699 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcel(parcel, 2, getParcel(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #567 <Method Parcel getParcel()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #582 <Method void SafeParcelWriter.writeParcel(Parcel, int, Parcel, boolean)>
		int k = zzxr;
	//   14   24:aload_0         
	//   15   25:getfield        #60  <Field int zzxr>
	//   16   28:istore          4
		FieldMappingDictionary fieldmappingdictionary;
		switch(k)
	//*  17   30:iload           4
		{
	//*  18   32:tableswitch     0 2: default 60
	//	               0 106
	//	               1 97
	//	               2 97
		default:
			parcel = ((Parcel) (new StringBuilder(34)));
	//   19   60:new             #230 <Class StringBuilder>
	//   20   63:dup             
	//   21   64:bipush          34
	//   22   66:invokespecial   #233 <Method void StringBuilder(int)>
	//   23   69:astore_1        
			((StringBuilder) (parcel)).append("Invalid creation type: ");
	//   24   70:aload_1         
	//   25   71:ldc2            #753 <String "Invalid creation type: ">
	//   26   74:invokevirtual   #239 <Method StringBuilder StringBuilder.append(String)>
	//   27   77:pop             
			((StringBuilder) (parcel)).append(k);
	//   28   78:aload_1         
	//   29   79:iload           4
	//   30   81:invokevirtual   #242 <Method StringBuilder StringBuilder.append(int)>
	//   31   84:pop             
			throw new IllegalStateException(((StringBuilder) (parcel)).toString());
	//   32   85:new             #189 <Class IllegalStateException>
	//   33   88:dup             
	//   34   89:aload_1         
	//   35   90:invokevirtual   #247 <Method String StringBuilder.toString()>
	//   36   93:invokespecial   #416 <Method void IllegalStateException(String)>
	//   37   96:athrow          

		case 1: // '\001'
		case 2: // '\002'
			fieldmappingdictionary = zzwn;
	//   38   97:aload_0         
	//   39   98:getfield        #62  <Field FieldMappingDictionary zzwn>
	//   40  101:astore          5
			break;

	//*  41  103:goto            109
		case 0: // '\0'
			fieldmappingdictionary = null;
	//   42  106:aconst_null     
	//   43  107:astore          5
			break;
		}
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (fieldmappingdictionary)), i, false);
	//   44  109:aload_1         
	//   45  110:iconst_3        
	//   46  111:aload           5
	//   47  113:iload_2         
	//   48  114:iconst_0        
	//   49  115:invokestatic    #757 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   50  118:aload_1         
	//   51  119:iload_3         
	//   52  120:invokestatic    #591 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   53  123:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new SafeParcelResponseCreator();
	private final String mClassName;
	private final int zzal;
	private final FieldMappingDictionary zzwn;
	private final Parcel zzxq;
	private final int zzxr;
	private int zzxs;
	private int zzxt;

	static 
	{
	//    0    0:new             #36  <Class SafeParcelResponseCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void SafeParcelResponseCreator()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
