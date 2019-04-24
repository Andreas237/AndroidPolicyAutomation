// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.res.Resources;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

class ResourcesFlusher
{

	ResourcesFlusher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	static boolean flush(Resources resources)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return flushNougats(resources);
	//    3    8:aload_0         
	//    4    9:invokestatic    #36  <Method boolean flushNougats(Resources)>
	//    5   12:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   6   13:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          23
	//*   8   18:icmplt          26
			return flushMarshmallows(resources);
	//    9   21:aload_0         
	//   10   22:invokestatic    #39  <Method boolean flushMarshmallows(Resources)>
	//   11   25:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  12   26:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   29:bipush          21
	//*  14   31:icmplt          39
			return flushLollipops(resources);
	//   15   34:aload_0         
	//   16   35:invokestatic    #42  <Method boolean flushLollipops(Resources)>
	//   17   38:ireturn         
		else
			return false;
	//   18   39:iconst_0        
	//   19   40:ireturn         
	}

	private static boolean flushLollipops(Resources resources)
	{
		if(!sDrawableCacheFieldFetched)
	//*   0    0:getstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*   1    3:ifne            27
		{
			try
			{
				sDrawableCacheField = ((Class) (android/content/res/Resources)).getDeclaredField("mDrawableCache");
	//    2    6:ldc1            #54  <Class Resources>
	//    3    8:ldc1            #56  <String "mDrawableCache">
	//    4   10:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #64  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//    6   16:getstatic       #64  <Field Field sDrawableCacheField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:iconst_1        
	//*  10   24:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  11   27:getstatic       #64  <Field Field sDrawableCacheField>
	//*  12   30:ifnull          86
	//*  13   33:aconst_null     
	//*  14   34:astore_1        
	//*  15   35:getstatic       #64  <Field Field sDrawableCacheField>
	//*  16   38:aload_0         
	//*  17   39:invokevirtual   #74  <Method Object Field.get(Object)>
	//*  18   42:checkcast       #76  <Class Map>
	//*  19   45:astore_0        
	//*  20   46:aload_0         
	//*  21   47:ifnull          86
	//*  22   50:aload_0         
	//*  23   51:invokeinterface #79  <Method void Map.clear()>
	//*  24   56:iconst_1        
	//*  25   57:ireturn         
			// Misplaced declaration of an exception variable
			catch(NoSuchFieldException nosuchfieldexception)
	//*  26   58:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   27   59:ldc1            #8   <String "ResourcesFlusher">
	//   28   61:ldc1            #81  <String "Could not retrieve Resources#mDrawableCache field">
	//   29   63:aload_1         
	//   30   64:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   31   67:pop             
			}
			sDrawableCacheFieldFetched = true;
		}
		if(sDrawableCacheField != null)
		{
			NoSuchFieldException nosuchfieldexception = null;
			try
			{
				resources = ((Resources) ((Map)sDrawableCacheField.get(((Object) (resources)))));
			}
	//*  32   68:goto            23
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  33   71:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   34   72:ldc1            #8   <String "ResourcesFlusher">
	//   35   74:ldc1            #89  <String "Could not retrieve value from Resources#mDrawableCache">
	//   36   76:aload_0         
	//   37   77:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   38   80:pop             
				resources = ((Resources) (nosuchfieldexception));
	//   39   81:aload_1         
	//   40   82:astore_0        
			}
			if(resources != null)
			{
				((Map) (resources)).clear();
				return true;
			}
		}
	//*  41   83:goto            46
		return false;
	//   42   86:iconst_0        
	//   43   87:ireturn         
	}

	private static boolean flushMarshmallows(Resources resources)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		Object obj;
		Object obj1;
		if(!sDrawableCacheFieldFetched)
	//*   2    2:getstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*   3    5:ifne            29
		{
			try
			{
				sDrawableCacheField = ((Class) (android/content/res/Resources)).getDeclaredField("mDrawableCache");
	//    4    8:ldc1            #54  <Class Resources>
	//    5   10:ldc1            #56  <String "mDrawableCache">
	//    6   12:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//    7   15:putstatic       #64  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//    8   18:getstatic       #64  <Field Field sDrawableCacheField>
	//    9   21:iconst_1        
	//   10   22:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
			}
	//*  11   25:iconst_1        
	//*  12   26:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  13   29:aconst_null     
	//*  14   30:astore_3        
	//*  15   31:aload_3         
	//*  16   32:astore_2        
	//*  17   33:getstatic       #64  <Field Field sDrawableCacheField>
	//*  18   36:ifnull          47
	//*  19   39:getstatic       #64  <Field Field sDrawableCacheField>
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #74  <Method Object Field.get(Object)>
	//*  22   46:astore_2        
	//*  23   47:aload_2         
	//*  24   48:ifnonnull       81
	//*  25   51:iconst_0        
	//*  26   52:ireturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  27   53:astore_2        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (obj)));
	//   28   54:ldc1            #8   <String "ResourcesFlusher">
	//   29   56:ldc1            #81  <String "Could not retrieve Resources#mDrawableCache field">
	//   30   58:aload_2         
	//   31   59:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   32   62:pop             
			}
			sDrawableCacheFieldFetched = true;
		}
		obj1 = null;
		obj = ((Object) (obj1));
		if(sDrawableCacheField != null)
			try
			{
				obj = sDrawableCacheField.get(((Object) (resources)));
			}
	//*  33   63:goto            25
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  34   66:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   35   67:ldc1            #8   <String "ResourcesFlusher">
	//   36   69:ldc1            #89  <String "Could not retrieve value from Resources#mDrawableCache">
	//   37   71:aload_0         
	//   38   72:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   39   75:pop             
				obj = ((Object) (obj1));
	//   40   76:aload_3         
	//   41   77:astore_2        
			}
		if(obj == null)
			return false;
	//*  42   78:goto            47
		if(obj == null || !flushThemedResourcesCache(obj))
	//*  43   81:aload_2         
	//*  44   82:ifnull          94
	//*  45   85:aload_2         
	//*  46   86:invokestatic    #95  <Method boolean flushThemedResourcesCache(Object)>
	//*  47   89:ifeq            94
	//*  48   92:iload_1         
	//*  49   93:ireturn         
			flag = false;
	//   50   94:iconst_0        
	//   51   95:istore_1        
		return flag;
	//*  52   96:goto            92
	}

	private static boolean flushNougats(Resources resources)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
		if(!sResourcesImplFieldFetched)
	//*   2    2:getstatic       #98  <Field boolean sResourcesImplFieldFetched>
	//*   3    5:ifne            29
		{
			try
			{
				sResourcesImplField = ((Class) (android/content/res/Resources)).getDeclaredField("mResourcesImpl");
	//    4    8:ldc1            #54  <Class Resources>
	//    5   10:ldc1            #100 <String "mResourcesImpl">
	//    6   12:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//    7   15:putstatic       #102 <Field Field sResourcesImplField>
				sResourcesImplField.setAccessible(true);
	//    8   18:getstatic       #102 <Field Field sResourcesImplField>
	//    9   21:iconst_1        
	//   10   22:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
			}
	//*  11   25:iconst_1        
	//*  12   26:putstatic       #98  <Field boolean sResourcesImplFieldFetched>
	//*  13   29:getstatic       #102 <Field Field sResourcesImplField>
	//*  14   32:ifnonnull       50
	//*  15   35:iconst_0        
	//*  16   36:ireturn         
			catch(NoSuchFieldException nosuchfieldexception)
	//*  17   37:astore_2        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", ((Throwable) (nosuchfieldexception)));
	//   18   38:ldc1            #8   <String "ResourcesFlusher">
	//   19   40:ldc1            #104 <String "Could not retrieve Resources#mResourcesImpl field">
	//   20   42:aload_2         
	//   21   43:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   22   46:pop             
			}
			sResourcesImplFieldFetched = true;
		}
		if(sResourcesImplField != null)
	//*  23   47:goto            25
		{
			Object obj = null;
	//   24   50:aconst_null     
	//   25   51:astore_2        
			try
			{
				resources = ((Resources) (sResourcesImplField.get(((Object) (resources)))));
	//   26   52:getstatic       #102 <Field Field sResourcesImplField>
	//   27   55:aload_0         
	//   28   56:invokevirtual   #74  <Method Object Field.get(Object)>
	//   29   59:astore_0        
			}
	//*  30   60:aload_0         
	//*  31   61:ifnull          35
	//*  32   64:getstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  33   67:ifne            93
	//*  34   70:aload_0         
	//*  35   71:invokevirtual   #108 <Method Class Object.getClass()>
	//*  36   74:ldc1            #56  <String "mDrawableCache">
	//*  37   76:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//*  38   79:putstatic       #64  <Field Field sDrawableCacheField>
	//*  39   82:getstatic       #64  <Field Field sDrawableCacheField>
	//*  40   85:iconst_1        
	//*  41   86:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
	//*  42   89:iconst_1        
	//*  43   90:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  44   93:aconst_null     
	//*  45   94:astore_3        
	//*  46   95:aload_3         
	//*  47   96:astore_2        
	//*  48   97:getstatic       #64  <Field Field sDrawableCacheField>
	//*  49  100:ifnull          111
	//*  50  103:getstatic       #64  <Field Field sDrawableCacheField>
	//*  51  106:aload_0         
	//*  52  107:invokevirtual   #74  <Method Object Field.get(Object)>
	//*  53  110:astore_2        
	//*  54  111:aload_2         
	//*  55  112:ifnull          167
	//*  56  115:aload_2         
	//*  57  116:invokestatic    #95  <Method boolean flushThemedResourcesCache(Object)>
	//*  58  119:ifeq            167
	//*  59  122:iload_1         
	//*  60  123:ireturn         
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  61  124:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", ((Throwable) (resources)));
	//   62  125:ldc1            #8   <String "ResourcesFlusher">
	//   63  127:ldc1            #110 <String "Could not retrieve value from Resources#mResourcesImpl">
	//   64  129:aload_0         
	//   65  130:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   66  133:pop             
				resources = ((Resources) (obj));
	//   67  134:aload_2         
	//   68  135:astore_0        
			}
			if(resources != null)
			{
				Object obj1;
				if(!sDrawableCacheFieldFetched)
				{
					try
					{
						sDrawableCacheField = ((Object) (resources)).getClass().getDeclaredField("mDrawableCache");
						sDrawableCacheField.setAccessible(true);
					}
	//*  69  136:goto            60
					catch(NoSuchFieldException nosuchfieldexception1)
	//*  70  139:astore_2        
					{
						Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", ((Throwable) (nosuchfieldexception1)));
	//   71  140:ldc1            #8   <String "ResourcesFlusher">
	//   72  142:ldc1            #112 <String "Could not retrieve ResourcesImpl#mDrawableCache field">
	//   73  144:aload_2         
	//   74  145:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   75  148:pop             
					}
					sDrawableCacheFieldFetched = true;
				}
				obj1 = null;
				obj = ((Object) (obj1));
				if(sDrawableCacheField != null)
					try
					{
						obj = sDrawableCacheField.get(((Object) (resources)));
					}
	//*  76  149:goto            89
					// Misplaced declaration of an exception variable
					catch(Resources resources)
	//*  77  152:astore_0        
					{
						Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", ((Throwable) (resources)));
	//   78  153:ldc1            #8   <String "ResourcesFlusher">
	//   79  155:ldc1            #114 <String "Could not retrieve value from ResourcesImpl#mDrawableCache">
	//   80  157:aload_0         
	//   81  158:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   82  161:pop             
						nosuchfieldexception1 = ((NoSuchFieldException) (obj1));
	//   83  162:aload_3         
	//   84  163:astore_2        
					}
				if(obj == null || !flushThemedResourcesCache(obj))
	//*  85  164:goto            111
					flag = false;
	//   86  167:iconst_0        
	//   87  168:istore_1        
				return flag;
			}
		}
		return false;
	//*  88  169:goto            122
	}

	private static boolean flushThemedResourcesCache(Object obj)
	{
		if(!sThemedResourceCacheClazzFetched)
	//*   0    0:getstatic       #119 <Field boolean sThemedResourceCacheClazzFetched>
	//*   1    3:ifne            18
		{
			try
			{
				sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
	//    2    6:ldc1            #121 <String "android.content.res.ThemedResourceCache">
	//    3    8:invokestatic    #125 <Method Class Class.forName(String)>
	//    4   11:putstatic       #127 <Field Class sThemedResourceCacheClazz>
			}
	//*   5   14:iconst_1        
	//*   6   15:putstatic       #119 <Field boolean sThemedResourceCacheClazzFetched>
	//*   7   18:getstatic       #127 <Field Class sThemedResourceCacheClazz>
	//*   8   21:ifnonnull       39
	//*   9   24:iconst_0        
	//*  10   25:ireturn         
			catch(ClassNotFoundException classnotfoundexception)
	//*  11   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", ((Throwable) (classnotfoundexception)));
	//   12   27:ldc1            #8   <String "ResourcesFlusher">
	//   13   29:ldc1            #129 <String "Could not find ThemedResourceCache class">
	//   14   31:aload_1         
	//   15   32:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   16   35:pop             
			}
			sThemedResourceCacheClazzFetched = true;
		}
		if(sThemedResourceCacheClazz == null)
			return false;
	//*  17   36:goto            14
		if(!sThemedResourceCache_mUnthemedEntriesFieldFetched)
	//*  18   39:getstatic       #131 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
	//*  19   42:ifne            67
		{
			try
			{
				sThemedResourceCache_mUnthemedEntriesField = sThemedResourceCacheClazz.getDeclaredField("mUnthemedEntries");
	//   20   45:getstatic       #127 <Field Class sThemedResourceCacheClazz>
	//   21   48:ldc1            #133 <String "mUnthemedEntries">
	//   22   50:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//   23   53:putstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
				sThemedResourceCache_mUnthemedEntriesField.setAccessible(true);
	//   24   56:getstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   25   59:iconst_1        
	//   26   60:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
			}
	//*  27   63:iconst_1        
	//*  28   64:putstatic       #131 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
	//*  29   67:getstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//*  30   70:ifnonnull       88
	//*  31   73:iconst_0        
	//*  32   74:ireturn         
			catch(NoSuchFieldException nosuchfieldexception)
	//*  33   75:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ((Throwable) (nosuchfieldexception)));
	//   34   76:ldc1            #8   <String "ResourcesFlusher">
	//   35   78:ldc1            #137 <String "Could not retrieve ThemedResourceCache#mUnthemedEntries field">
	//   36   80:aload_1         
	//   37   81:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   38   84:pop             
			}
			sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
		}
		if(sThemedResourceCache_mUnthemedEntriesField == null)
			return false;
	//*  39   85:goto            63
		Object obj1 = null;
	//   40   88:aconst_null     
	//   41   89:astore_1        
		try
		{
			obj = ((Object) ((LongSparseArray)sThemedResourceCache_mUnthemedEntriesField.get(obj)));
	//   42   90:getstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   43   93:aload_0         
	//   44   94:invokevirtual   #74  <Method Object Field.get(Object)>
	//   45   97:checkcast       #139 <Class LongSparseArray>
	//   46  100:astore_0        
		}
	//*  47  101:aload_0         
	//*  48  102:ifnull          126
	//*  49  105:aload_0         
	//*  50  106:invokevirtual   #140 <Method void LongSparseArray.clear()>
	//*  51  109:iconst_1        
	//*  52  110:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  53  111:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", ((Throwable) (obj)));
	//   54  112:ldc1            #8   <String "ResourcesFlusher">
	//   55  114:ldc1            #142 <String "Could not retrieve value from ThemedResourceCache#mUnthemedEntries">
	//   56  116:aload_0         
	//   57  117:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   58  120:pop             
			obj = ((Object) (obj1));
	//   59  121:aload_1         
	//   60  122:astore_0        
		}
		if(obj != null)
		{
			((LongSparseArray) (obj)).clear();
			return true;
		} else
	//*  61  123:goto            101
		{
			return false;
	//   62  126:iconst_0        
	//   63  127:ireturn         
		}
	}

	private static final String TAG = "ResourcesFlusher";
	private static Field sDrawableCacheField;
	private static boolean sDrawableCacheFieldFetched;
	private static Field sResourcesImplField;
	private static boolean sResourcesImplFieldFetched;
	private static Class sThemedResourceCacheClazz;
	private static boolean sThemedResourceCacheClazzFetched;
	private static Field sThemedResourceCache_mUnthemedEntriesField;
	private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;
}
