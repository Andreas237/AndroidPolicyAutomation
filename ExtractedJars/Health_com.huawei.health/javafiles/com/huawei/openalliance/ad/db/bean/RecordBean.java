// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.db.bean;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.huawei.openalliance.ad.annotations.b;
import com.huawei.openalliance.ad.annotations.d;
import com.huawei.openalliance.ad.g.c;
import com.huawei.openalliance.ad.utils.*;
import java.lang.reflect.*;
import java.util.*;
import org.json.JSONException;

// Referenced classes of package com.huawei.openalliance.ad.db.bean:
//			EncryptionField

public class RecordBean
{

	public RecordBean()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void Object()>
	//    2    4:return          
	}

	private String cutUnderline(String s)
	{
		if(s.endsWith("_"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #70  <String "_">
	//*   2    3:invokevirtual   #74  <Method boolean String.endsWith(String)>
	//*   3    6:ifeq            21
			return s.substring(0, s.length() - 1);
	//    4    9:aload_1         
	//    5   10:iconst_0        
	//    6   11:aload_1         
	//    7   12:invokevirtual   #78  <Method int String.length()>
	//    8   15:iconst_1        
	//    9   16:isub            
	//   10   17:invokevirtual   #82  <Method String String.substring(int, int)>
	//   11   20:areturn         
		else
			return s;
	//   12   21:aload_1         
	//   13   22:areturn         
	}

	private String getDbFieldName(Field field)
	{
		b b1 = (b)field.getAnnotation(com/huawei/openalliance/ad/annotations/b);
	//    0    0:aload_1         
	//    1    1:ldc1            #86  <Class b>
	//    2    3:invokevirtual   #92  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//    3    6:checkcast       #86  <Class b>
	//    4    9:astore_2        
		if(b1 != null && !TextUtils.isEmpty(((CharSequence) (b1.a()))))
	//*   5   10:aload_2         
	//*   6   11:ifnull          33
	//*   7   14:aload_2         
	//*   8   15:invokeinterface #96  <Method String b.a()>
	//*   9   20:invokestatic    #102 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            33
			return b1.a();
	//   11   26:aload_2         
	//   12   27:invokeinterface #96  <Method String b.a()>
	//   13   32:areturn         
		else
			return cutUnderline(field.getName());
	//   14   33:aload_0         
	//   15   34:aload_1         
	//   16   35:invokevirtual   #105 <Method String Field.getName()>
	//   17   38:invokespecial   #107 <Method String cutUnderline(String)>
	//   18   41:areturn         
	}

	private void injectEncryptionField(String s, Field field)
	{
		Object obj2 = ((Object) (field.getGenericType()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #113 <Method java.lang.reflect.Type Field.getGenericType()>
	//    2    4:astore          6
		Object obj = null;
	//    3    6:aconst_null     
	//    4    7:astore_3        
		Object obj1 = null;
	//    5    8:aconst_null     
	//    6    9:astore          5
		Class class1 = ((Class) (obj1));
	//    7   11:aload           5
	//    8   13:astore          4
		if(obj2 instanceof ParameterizedType)
	//*   9   15:aload           6
	//*  10   17:instanceof      #115 <Class ParameterizedType>
	//*  11   20:ifeq            73
		{
			java.lang.reflect.Type type = x.a(0, (ParameterizedType)obj2);
	//   12   23:iconst_0        
	//   13   24:aload           6
	//   14   26:checkcast       #115 <Class ParameterizedType>
	//   15   29:invokestatic    #120 <Method java.lang.reflect.Type x.a(int, ParameterizedType)>
	//   16   32:astore          7
			obj2 = ((Object) (x.a(type)));
	//   17   34:aload           7
	//   18   36:invokestatic    #123 <Method Class x.a(java.lang.reflect.Type)>
	//   19   39:astore          6
			obj = obj2;
	//   20   41:aload           6
	//   21   43:astore_3        
			class1 = ((Class) (obj1));
	//   22   44:aload           5
	//   23   46:astore          4
			if(type instanceof ParameterizedType)
	//*  24   48:aload           7
	//*  25   50:instanceof      #115 <Class ParameterizedType>
	//*  26   53:ifeq            73
			{
				class1 = x.a(x.a(0, (ParameterizedType)type));
	//   27   56:iconst_0        
	//   28   57:aload           7
	//   29   59:checkcast       #115 <Class ParameterizedType>
	//   30   62:invokestatic    #120 <Method java.lang.reflect.Type x.a(int, ParameterizedType)>
	//   31   65:invokestatic    #123 <Method Class x.a(java.lang.reflect.Type)>
	//   32   68:astore          4
				obj = obj2;
	//   33   70:aload           6
	//   34   72:astore_3        
			}
		}
		if(obj != null)
	//*  35   73:aload_3         
	//*  36   74:ifnull          100
		{
			obj = ((Object) (new EncryptionField(((Class) (obj)), class1)));
	//   37   77:new             #63  <Class EncryptionField>
	//   38   80:dup             
	//   39   81:aload_3         
	//   40   82:aload           4
	//   41   84:invokespecial   #126 <Method void EncryptionField(Class, Class)>
	//   42   87:astore_3        
			((EncryptionField) (obj)).setCipherField(s);
	//   43   88:aload_3         
	//   44   89:aload_1         
	//   45   90:invokevirtual   #130 <Method void EncryptionField.setCipherField(String)>
			field.set(((Object) (this)), obj);
	//   46   93:aload_2         
	//   47   94:aload_0         
	//   48   95:aload_3         
	//   49   96:invokevirtual   #134 <Method void Field.set(Object, Object)>
			return;
	//   50   99:return          
		} else
		{
			c.c("RecordBean", (new StringBuilder()).append("Cannot find member class from ").append(((Object) (field))).toString());
	//   51  100:ldc1            #22  <String "RecordBean">
	//   52  102:new             #136 <Class StringBuilder>
	//   53  105:dup             
	//   54  106:invokespecial   #137 <Method void StringBuilder()>
	//   55  109:ldc1            #139 <String "Cannot find member class from ">
	//   56  111:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   57  114:aload_2         
	//   58  115:invokevirtual   #146 <Method StringBuilder StringBuilder.append(Object)>
	//   59  118:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   60  121:invokestatic    #155 <Method void c.c(String, String)>
			return;
	//   61  124:return          
		}
	}

	private void injectOtherTypeData(String s, Field field, Class class1)
	{
		try
		{
			field.set(((Object) (this)), p.a(s, class1, new Class[] {
				x.a(field)
			}));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:anewarray       Class[]
	//    6    8:dup             
	//    7    9:iconst_0        
	//    8   10:aload_2         
	//    9   11:invokestatic    #166 <Method Class x.a(Field)>
	//   10   14:aastore         
	//   11   15:invokestatic    #171 <Method Object p.a(String, Class, Class[])>
	//   12   18:invokevirtual   #134 <Method void Field.set(Object, Object)>
			return;
	//   13   21:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  14   22:astore_1        
		{
			return;
	//   15   23:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  16   24:astore_1        
		{
			c.c("RecordBean", "toBean - other field injection Exception");
	//   17   25:ldc1            #22  <String "RecordBean">
	//   18   27:ldc1            #173 <String "toBean - other field injection Exception">
	//   19   29:invokestatic    #155 <Method void c.c(String, String)>
		}
	//   20   32:return          
	}

	private boolean isDbField(Field field)
	{
		if(field != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          45
		{
			String s = field.getName();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method String Field.getName()>
	//    4    8:astore_2        
			return !Modifier.isStatic(field.getModifiers()) && s != null && !s.contains("$") && !field.isAnnotationPresent(com/huawei/openalliance/ad/annotations/d);
	//    5    9:aload_1         
	//    6   10:invokevirtual   #178 <Method int Field.getModifiers()>
	//    7   13:invokestatic    #184 <Method boolean Modifier.isStatic(int)>
	//    8   16:ifne            43
	//    9   19:aload_2         
	//   10   20:ifnull          43
	//   11   23:aload_2         
	//   12   24:ldc1            #186 <String "$">
	//   13   26:invokevirtual   #189 <Method boolean String.contains(CharSequence)>
	//   14   29:ifne            43
	//   15   32:aload_1         
	//   16   33:ldc1            #191 <Class d>
	//   17   35:invokevirtual   #195 <Method boolean Field.isAnnotationPresent(Class)>
	//   18   38:ifne            43
	//   19   41:iconst_1        
	//   20   42:ireturn         
	//   21   43:iconst_0        
	//   22   44:ireturn         
		} else
		{
			return false;
	//   23   45:iconst_0        
	//   24   46:ireturn         
		}
	}

	public String getDefaultTableName()
	{
		return ((Object)this).getClass().getSimpleName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Class Object.getClass()>
	//    2    4:invokevirtual   #203 <Method String Class.getSimpleName()>
	//    3    7:areturn         
	}

	public List getFieldList()
	{
		Field afield[] = x.a(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Class Object.getClass()>
	//    2    4:invokestatic    #208 <Method Field[] x.a(Class)>
	//    3    7:astore_2        
		ArrayList arraylist = new ArrayList();
	//    4    8:new             #210 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #211 <Method void ArrayList()>
	//    7   15:astore_3        
		for(int i = 0; i < afield.length; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_1        
	//*  10   18:iload_1         
	//*  11   19:aload_2         
	//*  12   20:arraylength     
	//*  13   21:icmpge          68
		{
			afield[i] = x.a(afield[i], true);
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:aload_2         
	//   17   27:iload_1         
	//   18   28:aaload          
	//   19   29:iconst_1        
	//   20   30:invokestatic    #214 <Method Field x.a(Field, boolean)>
	//   21   33:aastore         
			if(isDbField(afield[i]))
	//*  22   34:aload_0         
	//*  23   35:aload_2         
	//*  24   36:iload_1         
	//*  25   37:aaload          
	//*  26   38:invokespecial   #216 <Method boolean isDbField(Field)>
	//*  27   41:ifne            47
	//*  28   44:goto            61
				((List) (arraylist)).add(((Object) (getDbFieldName(afield[i]))));
	//   29   47:aload_3         
	//   30   48:aload_0         
	//   31   49:aload_2         
	//   32   50:iload_1         
	//   33   51:aaload          
	//   34   52:invokespecial   #218 <Method String getDbFieldName(Field)>
	//   35   55:invokeinterface #224 <Method boolean List.add(Object)>
	//   36   60:pop             
		}

	//   37   61:iload_1         
	//   38   62:iconst_1        
	//   39   63:iadd            
	//   40   64:istore_1        
	//*  41   65:goto            18
		return ((List) (arraylist));
	//   42   68:aload_3         
	//   43   69:areturn         
	}

	public byte[] getKey()
	{
		return key;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field byte[] key>
	//    2    4:areturn         
	}

	public String getTableScheme()
	{
		return getTableScheme(getDefaultTableName());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #233 <Method String getDefaultTableName()>
	//    3    5:invokevirtual   #235 <Method String getTableScheme(String)>
	//    4    8:areturn         
	}

	public String getTableScheme(String s)
	{
		Field afield[] = x.a(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Class Object.getClass()>
	//    2    4:invokestatic    #208 <Method Field[] x.a(Class)>
	//    3    7:astore          4
		StringBuilder stringbuilder = new StringBuilder();
	//    4    9:new             #136 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #137 <Method void StringBuilder()>
	//    7   16:astore          5
		stringbuilder.append("create table ");
	//    8   18:aload           5
	//    9   20:ldc1            #237 <String "create table ">
	//   10   22:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
		stringbuilder.append(s);
	//   12   26:aload           5
	//   13   28:aload_1         
	//   14   29:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append(" ( ");
	//   16   33:aload           5
	//   17   35:ldc1            #239 <String " ( ">
	//   18   37:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		stringbuilder.append("_id INTEGER primary key autoincrement ");
	//   20   41:aload           5
	//   21   43:ldc1            #241 <String "_id INTEGER primary key autoincrement ">
	//   22   45:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
		for(int i = 0; i < afield.length; i++)
	//*  24   49:iconst_0        
	//*  25   50:istore_2        
	//*  26   51:iload_2         
	//*  27   52:aload           4
	//*  28   54:arraylength     
	//*  29   55:icmpge          185
		{
			afield[i] = x.a(afield[i], true);
	//   30   58:aload           4
	//   31   60:iload_2         
	//   32   61:aload           4
	//   33   63:iload_2         
	//   34   64:aaload          
	//   35   65:iconst_1        
	//   36   66:invokestatic    #214 <Method Field x.a(Field, boolean)>
	//   37   69:aastore         
			if(!isDbField(afield[i]))
	//*  38   70:aload_0         
	//*  39   71:aload           4
	//*  40   73:iload_2         
	//*  41   74:aaload          
	//*  42   75:invokespecial   #216 <Method boolean isDbField(Field)>
	//*  43   78:ifne            84
				continue;
	//   44   81:goto            178
			String s1 = (String)DBTypeMap.get(((Object) (afield[i].getType())));
	//   45   84:getstatic       #35  <Field Map DBTypeMap>
	//   46   87:aload           4
	//   47   89:iload_2         
	//   48   90:aaload          
	//   49   91:invokevirtual   #244 <Method Class Field.getType()>
	//   50   94:invokeinterface #248 <Method Object Map.get(Object)>
	//   51   99:checkcast       #37  <Class String>
	//   52  102:astore_3        
			s = s1;
	//   53  103:aload_3         
	//   54  104:astore_1        
			if(s1 == null)
	//*  55  105:aload_3         
	//*  56  106:ifnonnull       112
				s = "TEXT";
	//   57  109:ldc1            #39  <String "TEXT">
	//   58  111:astore_1        
			s1 = getDbFieldName(afield[i]);
	//   59  112:aload_0         
	//   60  113:aload           4
	//   61  115:iload_2         
	//   62  116:aaload          
	//   63  117:invokespecial   #218 <Method String getDbFieldName(Field)>
	//   64  120:astore_3        
			stringbuilder.append(" , ");
	//   65  121:aload           5
	//   66  123:ldc1            #250 <String " , ">
	//   67  125:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   68  128:pop             
			stringbuilder.append(s1);
	//   69  129:aload           5
	//   70  131:aload_3         
	//   71  132:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   72  135:pop             
			stringbuilder.append(' ');
	//   73  136:aload           5
	//   74  138:bipush          32
	//   75  140:invokevirtual   #253 <Method StringBuilder StringBuilder.append(char)>
	//   76  143:pop             
			stringbuilder.append(s);
	//   77  144:aload           5
	//   78  146:aload_1         
	//   79  147:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   80  150:pop             
			if(getUnique() != null && getUnique().equals(((Object) (s1))))
	//*  81  151:aload_0         
	//*  82  152:invokevirtual   #256 <Method String getUnique()>
	//*  83  155:ifnull          178
	//*  84  158:aload_0         
	//*  85  159:invokevirtual   #256 <Method String getUnique()>
	//*  86  162:aload_3         
	//*  87  163:invokevirtual   #259 <Method boolean String.equals(Object)>
	//*  88  166:ifeq            178
				stringbuilder.append(" unique");
	//   89  169:aload           5
	//   90  171:ldc2            #261 <String " unique">
	//   91  174:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//   92  177:pop             
		}

	//   93  178:iload_2         
	//   94  179:iconst_1        
	//   95  180:iadd            
	//   96  181:istore_2        
	//*  97  182:goto            51
		stringbuilder.append(" ) ");
	//   98  185:aload           5
	//   99  187:ldc2            #263 <String " ) ">
	//  100  190:invokevirtual   #143 <Method StringBuilder StringBuilder.append(String)>
	//  101  193:pop             
		return stringbuilder.toString();
	//  102  194:aload           5
	//  103  196:invokevirtual   #149 <Method String StringBuilder.toString()>
	//  104  199:areturn         
	}

	public String getUnique()
	{
		return "";
	//    0    0:ldc2            #265 <String "">
	//    1    3:areturn         
	}

	public void setKey(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       10
		{
			key = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #230 <Field byte[] key>
			return;
	//    5    9:return          
		} else
		{
			byte abyte1[] = new byte[abyte0.length];
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:newarray        byte[]
	//    9   14:astore_2        
			System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, abyte0.length);
	//   10   15:aload_1         
	//   11   16:iconst_0        
	//   12   17:aload_2         
	//   13   18:iconst_0        
	//   14   19:aload_1         
	//   15   20:arraylength     
	//   16   21:invokestatic    #273 <Method void System.arraycopy(Object, int, Object, int, int)>
			key = abyte1;
	//   17   24:aload_0         
	//   18   25:aload_2         
	//   19   26:putfield        #230 <Field byte[] key>
			return;
	//   20   29:return          
		}
	}

	public void toBean(Cursor cursor)
	{
		int i;
		Field afield[];
		afield = x.a(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Class Object.getClass()>
	//    2    4:invokestatic    #208 <Method Field[] x.a(Class)>
	//    3    7:astore          5
		i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
_L3:
		if(i >= afield.length) goto _L2; else goto _L1
	//    6   11:iload_2         
	//    7   12:aload           5
	//    8   14:arraylength     
	//    9   15:icmpge          313
_L1:
		afield[i] = x.a(afield[i], true);
	//   10   18:aload           5
	//   11   20:iload_2         
	//   12   21:aload           5
	//   13   23:iload_2         
	//   14   24:aaload          
	//   15   25:iconst_1        
	//   16   26:invokestatic    #214 <Method Field x.a(Field, boolean)>
	//   17   29:aastore         
		String s = afield[i].getName();
	//   18   30:aload           5
	//   19   32:iload_2         
	//   20   33:aaload          
	//   21   34:invokevirtual   #105 <Method String Field.getName()>
	//   22   37:astore          6
		if(!Modifier.isStatic(afield[i].getModifiers()) && "_id".equals(((Object) (s))))
	//*  23   39:aload           5
	//*  24   41:iload_2         
	//*  25   42:aaload          
	//*  26   43:invokevirtual   #178 <Method int Field.getModifiers()>
	//*  27   46:invokestatic    #184 <Method boolean Modifier.isStatic(int)>
	//*  28   49:ifne            89
	//*  29   52:ldc1            #19  <String "_id">
	//*  30   54:aload           6
	//*  31   56:invokevirtual   #259 <Method boolean String.equals(Object)>
	//*  32   59:ifeq            89
		{
			int j = cursor.getColumnIndex(s);
	//   33   62:aload_1         
	//   34   63:aload           6
	//   35   65:invokeinterface #283 <Method int Cursor.getColumnIndex(String)>
	//   36   70:istore_3        
			afield[i].set(((Object) (this)), ((Object) (cursor.getString(j))));
	//   37   71:aload           5
	//   38   73:iload_2         
	//   39   74:aaload          
	//   40   75:aload_0         
	//   41   76:aload_1         
	//   42   77:iload_3         
	//   43   78:invokeinterface #287 <Method String Cursor.getString(int)>
	//   44   83:invokevirtual   #134 <Method void Field.set(Object, Object)>
			continue; /* Loop/switch isn't completed */
	//   45   86:goto            306
		}
		boolean flag = isDbField(afield[i]);
	//   46   89:aload_0         
	//   47   90:aload           5
	//   48   92:iload_2         
	//   49   93:aaload          
	//   50   94:invokespecial   #216 <Method boolean isDbField(Field)>
	//   51   97:istore          4
		if(!flag)
	//*  52   99:iload           4
	//*  53  101:ifne            107
			continue; /* Loop/switch isn't completed */
	//   54  104:goto            306
		int k;
		Class class1;
		class1 = afield[i].getType();
	//   55  107:aload           5
	//   56  109:iload_2         
	//   57  110:aaload          
	//   58  111:invokevirtual   #244 <Method Class Field.getType()>
	//   59  114:astore          6
		k = cursor.getColumnIndex(getDbFieldName(afield[i]));
	//   60  116:aload_1         
	//   61  117:aload_0         
	//   62  118:aload           5
	//   63  120:iload_2         
	//   64  121:aaload          
	//   65  122:invokespecial   #218 <Method String getDbFieldName(Field)>
	//   66  125:invokeinterface #283 <Method int Cursor.getColumnIndex(String)>
	//   67  130:istore_3        
		if(k == -1)
	//*  68  131:iload_3         
	//*  69  132:iconst_m1       
	//*  70  133:icmpne          139
			continue; /* Loop/switch isn't completed */
	//   71  136:goto            306
		if(java/lang/String == class1)
	//*  72  139:ldc1            #37  <Class String>
	//*  73  141:aload           6
	//*  74  143:if_acmpne       164
		{
			try
			{
				afield[i].set(((Object) (this)), ((Object) (cursor.getString(k))));
	//   75  146:aload           5
	//   76  148:iload_2         
	//   77  149:aaload          
	//   78  150:aload_0         
	//   79  151:aload_1         
	//   80  152:iload_3         
	//   81  153:invokeinterface #287 <Method String Cursor.getString(int)>
	//   82  158:invokevirtual   #134 <Method void Field.set(Object, Object)>
			}
	//*  83  161:goto            293
	//*  84  164:getstatic       #56  <Field Class Integer.TYPE>
	//*  85  167:aload           6
	//*  86  169:if_acmpne       193
	//*  87  172:aload           5
	//*  88  174:iload_2         
	//*  89  175:aaload          
	//*  90  176:aload_0         
	//*  91  177:aload_1         
	//*  92  178:iload_3         
	//*  93  179:invokeinterface #291 <Method int Cursor.getInt(int)>
	//*  94  184:invokestatic    #295 <Method Integer Integer.valueOf(int)>
	//*  95  187:invokevirtual   #134 <Method void Field.set(Object, Object)>
	//*  96  190:goto            293
	//*  97  193:getstatic       #51  <Field Class Long.TYPE>
	//*  98  196:aload           6
	//*  99  198:if_acmpne       222
	//* 100  201:aload           5
	//* 101  203:iload_2         
	//* 102  204:aaload          
	//* 103  205:aload_0         
	//* 104  206:aload_1         
	//* 105  207:iload_3         
	//* 106  208:invokeinterface #299 <Method long Cursor.getLong(int)>
	//* 107  213:invokestatic    #302 <Method Long Long.valueOf(long)>
	//* 108  216:invokevirtual   #134 <Method void Field.set(Object, Object)>
	//* 109  219:goto            293
	//* 110  222:getstatic       #59  <Field Class Float.TYPE>
	//* 111  225:aload           6
	//* 112  227:if_acmpne       251
	//* 113  230:aload           5
	//* 114  232:iload_2         
	//* 115  233:aaload          
	//* 116  234:aload_0         
	//* 117  235:aload_1         
	//* 118  236:iload_3         
	//* 119  237:invokeinterface #306 <Method float Cursor.getFloat(int)>
	//* 120  242:invokestatic    #309 <Method Float Float.valueOf(float)>
	//* 121  245:invokevirtual   #134 <Method void Field.set(Object, Object)>
	//* 122  248:goto            293
	//* 123  251:ldc1            #63  <Class EncryptionField>
	//* 124  253:aload           6
	//* 125  255:if_acmpne       276
	//* 126  258:aload_0         
	//* 127  259:aload_1         
	//* 128  260:iload_3         
	//* 129  261:invokeinterface #287 <Method String Cursor.getString(int)>
	//* 130  266:aload           5
	//* 131  268:iload_2         
	//* 132  269:aaload          
	//* 133  270:invokespecial   #311 <Method void injectEncryptionField(String, Field)>
	//* 134  273:goto            293
	//* 135  276:aload_0         
	//* 136  277:aload_1         
	//* 137  278:iload_3         
	//* 138  279:invokeinterface #287 <Method String Cursor.getString(int)>
	//* 139  284:aload           5
	//* 140  286:iload_2         
	//* 141  287:aaload          
	//* 142  288:aload           6
	//* 143  290:invokespecial   #313 <Method void injectOtherTypeData(String, Field, Class)>
	//* 144  293:goto            306
			catch(IllegalAccessException illegalaccessexception)
	//* 145  296:astore          6
			{
				c.c("RecordBean", "toBean IllegalAccessException");
	//  146  298:ldc1            #22  <String "RecordBean">
	//  147  300:ldc2            #315 <String "toBean IllegalAccessException">
	//  148  303:invokestatic    #155 <Method void c.c(String, String)>
			}
			continue; /* Loop/switch isn't completed */
		}
		if(Integer.TYPE == class1)
		{
			afield[i].set(((Object) (this)), ((Object) (Integer.valueOf(cursor.getInt(k)))));
			continue; /* Loop/switch isn't completed */
		}
		if(Long.TYPE == class1)
		{
			afield[i].set(((Object) (this)), ((Object) (Long.valueOf(cursor.getLong(k)))));
			continue; /* Loop/switch isn't completed */
		}
		if(Float.TYPE == class1)
		{
			afield[i].set(((Object) (this)), ((Object) (Float.valueOf(cursor.getFloat(k)))));
			continue; /* Loop/switch isn't completed */
		}
		if(com/huawei/openalliance/ad/db/bean/EncryptionField != class1)
			break MISSING_BLOCK_LABEL_276;
		injectEncryptionField(cursor.getString(k), afield[i]);
		continue; /* Loop/switch isn't completed */
		injectOtherTypeData(cursor.getString(k), afield[i], class1);
		i++;
	//  149  306:iload_2         
	//  150  307:iconst_1        
	//  151  308:iadd            
	//  152  309:istore_2        
		  goto _L3
	//* 153  310:goto            11
_L2:
	//  154  313:return          
	}

	public ContentValues toRecord(Context context)
	{
		int i;
		Field afield[];
		ContentValues contentvalues;
		afield = x.a(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Class Object.getClass()>
	//    2    4:invokestatic    #208 <Method Field[] x.a(Class)>
	//    3    7:astore          4
		contentvalues = new ContentValues();
	//    4    9:new             #319 <Class ContentValues>
	//    5   12:dup             
	//    6   13:invokespecial   #320 <Method void ContentValues()>
	//    7   16:astore          5
		i = 0;
	//    8   18:iconst_0        
	//    9   19:istore_2        
_L3:
		if(i >= afield.length) goto _L2; else goto _L1
	//   10   20:iload_2         
	//   11   21:aload           4
	//   12   23:arraylength     
	//   13   24:icmpge          236
_L1:
		Object obj;
		boolean flag;
		try
		{
			afield[i] = x.a(afield[i], true);
	//   14   27:aload           4
	//   15   29:iload_2         
	//   16   30:aload           4
	//   17   32:iload_2         
	//   18   33:aaload          
	//   19   34:iconst_1        
	//   20   35:invokestatic    #214 <Method Field x.a(Field, boolean)>
	//   21   38:aastore         
			flag = isDbField(afield[i]);
	//   22   39:aload_0         
	//   23   40:aload           4
	//   24   42:iload_2         
	//   25   43:aaload          
	//   26   44:invokespecial   #216 <Method boolean isDbField(Field)>
	//   27   47:istore_3        
		}
	//*  28   48:iload_3         
	//*  29   49:ifne            55
	//*  30   52:goto            229
	//*  31   55:aload           4
	//*  32   57:iload_2         
	//*  33   58:aaload          
	//*  34   59:aload_0         
	//*  35   60:invokevirtual   #321 <Method Object Field.get(Object)>
	//*  36   63:astore          7
	//*  37   65:aload           7
	//*  38   67:ifnonnull       73
	//*  39   70:goto            229
	//*  40   73:goto            89
		catch(IllegalAccessException illegalaccessexception)
	//*  41   76:astore          6
		{
			c.c("RecordBean", "toRecord IllegalAccessException");
	//   42   78:ldc1            #22  <String "RecordBean">
	//   43   80:ldc2            #323 <String "toRecord IllegalAccessException">
	//   44   83:invokestatic    #155 <Method void c.c(String, String)>
			continue; /* Loop/switch isn't completed */
	//   45   86:goto            229
		}
		if(!flag)
			continue; /* Loop/switch isn't completed */
		obj = afield[i].get(((Object) (this)));
		if(obj == null)
			continue; /* Loop/switch isn't completed */
		String s = getDbFieldName(afield[i]);
	//   46   89:aload_0         
	//   47   90:aload           4
	//   48   92:iload_2         
	//   49   93:aaload          
	//   50   94:invokespecial   #218 <Method String getDbFieldName(Field)>
	//   51   97:astore          6
		if(obj instanceof String)
	//*  52   99:aload           7
	//*  53  101:instanceof      #37  <Class String>
	//*  54  104:ifeq            122
		{
			contentvalues.put(s, (String)obj);
	//   55  107:aload           5
	//   56  109:aload           6
	//   57  111:aload           7
	//   58  113:checkcast       #37  <Class String>
	//   59  116:invokevirtual   #325 <Method void ContentValues.put(String, String)>
			continue; /* Loop/switch isn't completed */
	//   60  119:goto            229
		}
		if(obj instanceof Integer)
	//*  61  122:aload           7
	//*  62  124:instanceof      #55  <Class Integer>
	//*  63  127:ifeq            145
		{
			contentvalues.put(s, (Integer)obj);
	//   64  130:aload           5
	//   65  132:aload           6
	//   66  134:aload           7
	//   67  136:checkcast       #55  <Class Integer>
	//   68  139:invokevirtual   #328 <Method void ContentValues.put(String, Integer)>
			continue; /* Loop/switch isn't completed */
	//   69  142:goto            229
		}
		if(obj instanceof Long)
	//*  70  145:aload           7
	//*  71  147:instanceof      #47  <Class Long>
	//*  72  150:ifeq            168
		{
			contentvalues.put(s, (Long)obj);
	//   73  153:aload           5
	//   74  155:aload           6
	//   75  157:aload           7
	//   76  159:checkcast       #47  <Class Long>
	//   77  162:invokevirtual   #331 <Method void ContentValues.put(String, Long)>
			continue; /* Loop/switch isn't completed */
	//   78  165:goto            229
		}
		if(obj instanceof EncryptionField)
	//*  79  168:aload           7
	//*  80  170:instanceof      #63  <Class EncryptionField>
	//*  81  173:ifeq            217
		{
			obj = ((Object) ((EncryptionField)obj));
	//   82  176:aload           7
	//   83  178:checkcast       #63  <Class EncryptionField>
	//   84  181:astore          7
			if(key == null)
	//*  85  183:aload_0         
	//*  86  184:getfield        #230 <Field byte[] key>
	//*  87  187:ifnonnull       198
				key = y.b(context);
	//   88  190:aload_0         
	//   89  191:aload_1         
	//   90  192:invokestatic    #337 <Method byte[] y.b(Context)>
	//   91  195:putfield        #230 <Field byte[] key>
			contentvalues.put(s, ((EncryptionField) (obj)).getEncryptedFieldValue(key));
	//   92  198:aload           5
	//   93  200:aload           6
	//   94  202:aload           7
	//   95  204:aload_0         
	//   96  205:getfield        #230 <Field byte[] key>
	//   97  208:invokevirtual   #341 <Method String EncryptionField.getEncryptedFieldValue(byte[])>
	//   98  211:invokevirtual   #325 <Method void ContentValues.put(String, String)>
		} else
	//*  99  214:goto            229
		{
			contentvalues.put(s, p.b(obj));
	//  100  217:aload           5
	//  101  219:aload           6
	//  102  221:aload           7
	//  103  223:invokestatic    #344 <Method String p.b(Object)>
	//  104  226:invokevirtual   #325 <Method void ContentValues.put(String, String)>
		}
		i++;
	//  105  229:iload_2         
	//  106  230:iconst_1        
	//  107  231:iadd            
	//  108  232:istore_2        
		  goto _L3
	//* 109  233:goto            20
_L2:
		return contentvalues;
	//  110  236:aload           5
	//  111  238:areturn         
	}

	private static Map DBTypeMap;
	private static final boolean DEBUG = false;
	public static final String ID = "_id";
	public static final String TAG = "RecordBean";
	private byte key[];

	static 
	{
		DBTypeMap = ((Map) (new HashMap(4)));
	//    0    0:new             #29  <Class HashMap>
	//    1    3:dup             
	//    2    4:iconst_4        
	//    3    5:invokespecial   #33  <Method void HashMap(int)>
	//    4    8:putstatic       #35  <Field Map DBTypeMap>
		DBTypeMap.put(java/lang/String, "TEXT");
	//    5   11:getstatic       #35  <Field Map DBTypeMap>
	//    6   14:ldc1            #37  <Class String>
	//    7   16:ldc1            #39  <String "TEXT">
	//    8   18:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//    9   23:pop             
		DBTypeMap.put(((Object) (Long.TYPE)), "INTEGER");
	//   10   24:getstatic       #35  <Field Map DBTypeMap>
	//   11   27:getstatic       #51  <Field Class Long.TYPE>
	//   12   30:ldc1            #53  <String "INTEGER">
	//   13   32:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//   14   37:pop             
		DBTypeMap.put(((Object) (Integer.TYPE)), "INTEGER");
	//   15   38:getstatic       #35  <Field Map DBTypeMap>
	//   16   41:getstatic       #56  <Field Class Integer.TYPE>
	//   17   44:ldc1            #53  <String "INTEGER">
	//   18   46:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//   19   51:pop             
		DBTypeMap.put(((Object) (Float.TYPE)), "REAL");
	//   20   52:getstatic       #35  <Field Map DBTypeMap>
	//   21   55:getstatic       #59  <Field Class Float.TYPE>
	//   22   58:ldc1            #61  <String "REAL">
	//   23   60:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//   24   65:pop             
		DBTypeMap.put(com/huawei/openalliance/ad/db/bean/EncryptionField, "TEXT");
	//   25   66:getstatic       #35  <Field Map DBTypeMap>
	//   26   69:ldc1            #63  <Class EncryptionField>
	//   27   71:ldc1            #39  <String "TEXT">
	//   28   73:invokeinterface #45  <Method Object Map.put(Object, Object)>
	//   29   78:pop             
	//*  30   79:return          
	}

	// Unreferenced inner class com/huawei/openalliance/ad/db/bean/RecordBean$DATA_TYPE
	/* block-local class not found */
	class DATA_TYPE {}

}
