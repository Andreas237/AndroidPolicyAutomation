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
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	static boolean flush(Resources resources)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i >= 24)
	//*   2    4:iload_1         
	//*   3    5:bipush          24
	//*   4    7:icmplt          15
			return flushNougats(resources);
	//    5   10:aload_0         
	//    6   11:invokestatic    #37  <Method boolean flushNougats(Resources)>
	//    7   14:ireturn         
		if(i >= 23)
	//*   8   15:iload_1         
	//*   9   16:bipush          23
	//*  10   18:icmplt          26
			return flushMarshmallows(resources);
	//   11   21:aload_0         
	//   12   22:invokestatic    #40  <Method boolean flushMarshmallows(Resources)>
	//   13   25:ireturn         
		if(i >= 21)
	//*  14   26:iload_1         
	//*  15   27:bipush          21
	//*  16   29:icmplt          37
			return flushLollipops(resources);
	//   17   32:aload_0         
	//   18   33:invokestatic    #43  <Method boolean flushLollipops(Resources)>
	//   19   36:ireturn         
		else
			return false;
	//   20   37:iconst_0        
	//   21   38:ireturn         
	}

	private static boolean flushLollipops(Resources resources)
	{
		if(!sDrawableCacheFieldFetched)
	//*   0    0:getstatic       #50  <Field boolean sDrawableCacheFieldFetched>
	//*   1    3:ifne            40
		{
			try
			{
				sDrawableCacheField = ((Class) (android/content/res/Resources)).getDeclaredField("mDrawableCache");
	//    2    6:ldc1            #52  <Class Resources>
	//    3    8:ldc1            #54  <String "mDrawableCache">
	//    4   10:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #62  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//    6   16:getstatic       #62  <Field Field sDrawableCacheField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #68  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #70  <String "Could not retrieve Resources#mDrawableCache field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #50  <Field boolean sDrawableCacheFieldFetched>
		}
		if(sDrawableCacheField != null)
	//*  18   40:getstatic       #62  <Field Field sDrawableCacheField>
	//*  19   43:ifnull          86
		{
			Object obj = null;
	//   20   46:aconst_null     
	//   21   47:astore_1        
			try
			{
				resources = ((Resources) ((Map)sDrawableCacheField.get(((Object) (resources)))));
	//   22   48:getstatic       #62  <Field Field sDrawableCacheField>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #80  <Method Object Field.get(Object)>
	//   25   55:checkcast       #82  <Class Map>
	//   26   58:astore_0        
			}
	//*  27   59:goto            74
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  28   62:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   29   63:ldc1            #8   <String "ResourcesFlusher">
	//   30   65:ldc1            #84  <String "Could not retrieve value from Resources#mDrawableCache">
	//   31   67:aload_0         
	//   32   68:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   33   71:pop             
				resources = ((Resources) (obj));
	//   34   72:aload_1         
	//   35   73:astore_0        
			}
			if(resources != null)
	//*  36   74:aload_0         
	//*  37   75:ifnull          86
			{
				((Map) (resources)).clear();
	//   38   78:aload_0         
	//   39   79:invokeinterface #87  <Method void Map.clear()>
				return true;
	//   40   84:iconst_1        
	//   41   85:ireturn         
			}
		}
		return false;
	//   42   86:iconst_0        
	//   43   87:ireturn         
	}

	private static boolean flushMarshmallows(Resources resources)
	{
		if(!sDrawableCacheFieldFetched)
	//*   0    0:getstatic       #50  <Field boolean sDrawableCacheFieldFetched>
	//*   1    3:ifne            40
		{
			try
			{
				sDrawableCacheField = ((Class) (android/content/res/Resources)).getDeclaredField("mDrawableCache");
	//    2    6:ldc1            #52  <Class Resources>
	//    3    8:ldc1            #54  <String "mDrawableCache">
	//    4   10:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #62  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//    6   16:getstatic       #62  <Field Field sDrawableCacheField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #68  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #70  <String "Could not retrieve Resources#mDrawableCache field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #50  <Field boolean sDrawableCacheFieldFetched>
		}
		Object obj1 = null;
	//   18   40:aconst_null     
	//   19   41:astore_2        
		Object obj = ((Object) (obj1));
	//   20   42:aload_2         
	//   21   43:astore_1        
		if(sDrawableCacheField != null)
	//*  22   44:getstatic       #62  <Field Field sDrawableCacheField>
	//*  23   47:ifnull          73
			try
			{
				obj = sDrawableCacheField.get(((Object) (resources)));
	//   24   50:getstatic       #62  <Field Field sDrawableCacheField>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #80  <Method Object Field.get(Object)>
	//   27   57:astore_1        
			}
	//*  28   58:goto            73
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  29   61:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   30   62:ldc1            #8   <String "ResourcesFlusher">
	//   31   64:ldc1            #84  <String "Could not retrieve value from Resources#mDrawableCache">
	//   32   66:aload_0         
	//   33   67:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   34   70:pop             
				obj = ((Object) (obj1));
	//   35   71:aload_2         
	//   36   72:astore_1        
			}
		if(obj == null)
	//*  37   73:aload_1         
	//*  38   74:ifnonnull       79
			return false;
	//   39   77:iconst_0        
	//   40   78:ireturn         
		return obj != null && flushThemedResourcesCache(obj);
	//   41   79:aload_1         
	//   42   80:ifnull          92
	//   43   83:aload_1         
	//   44   84:invokestatic    #91  <Method boolean flushThemedResourcesCache(Object)>
	//   45   87:ifeq            92
	//   46   90:iconst_1        
	//   47   91:ireturn         
	//   48   92:iconst_0        
	//   49   93:ireturn         
	}

	private static boolean flushNougats(Resources resources)
	{
		if(!sResourcesImplFieldFetched)
	//*   0    0:getstatic       #93  <Field boolean sResourcesImplFieldFetched>
	//*   1    3:ifne            40
		{
			try
			{
				sResourcesImplField = ((Class) (android/content/res/Resources)).getDeclaredField("mResourcesImpl");
	//    2    6:ldc1            #52  <Class Resources>
	//    3    8:ldc1            #95  <String "mResourcesImpl">
	//    4   10:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #97  <Field Field sResourcesImplField>
				sResourcesImplField.setAccessible(true);
	//    6   16:getstatic       #97  <Field Field sResourcesImplField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #68  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #99  <String "Could not retrieve Resources#mResourcesImpl field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sResourcesImplFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #93  <Field boolean sResourcesImplFieldFetched>
		}
		if(sResourcesImplField == null)
	//*  18   40:getstatic       #97  <Field Field sResourcesImplField>
	//*  19   43:ifnonnull       48
			return false;
	//   20   46:iconst_0        
	//   21   47:ireturn         
		Object obj = null;
	//   22   48:aconst_null     
	//   23   49:astore_1        
		try
		{
			resources = ((Resources) (sResourcesImplField.get(((Object) (resources)))));
	//   24   50:getstatic       #97  <Field Field sResourcesImplField>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #80  <Method Object Field.get(Object)>
	//   27   57:astore_0        
		}
	//*  28   58:goto            73
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*  29   61:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", ((Throwable) (resources)));
	//   30   62:ldc1            #8   <String "ResourcesFlusher">
	//   31   64:ldc1            #101 <String "Could not retrieve value from Resources#mResourcesImpl">
	//   32   66:aload_0         
	//   33   67:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   34   70:pop             
			resources = ((Resources) (obj));
	//   35   71:aload_1         
	//   36   72:astore_0        
		}
		if(resources == null)
	//*  37   73:aload_0         
	//*  38   74:ifnonnull       79
			return false;
	//   39   77:iconst_0        
	//   40   78:ireturn         
		if(!sDrawableCacheFieldFetched)
	//*  41   79:getstatic       #50  <Field boolean sDrawableCacheFieldFetched>
	//*  42   82:ifne            121
		{
			try
			{
				sDrawableCacheField = ((Object) (resources)).getClass().getDeclaredField("mDrawableCache");
	//   43   85:aload_0         
	//   44   86:invokevirtual   #105 <Method Class Object.getClass()>
	//   45   89:ldc1            #54  <String "mDrawableCache">
	//   46   91:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//   47   94:putstatic       #62  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//   48   97:getstatic       #62  <Field Field sDrawableCacheField>
	//   49  100:iconst_1        
	//   50  101:invokevirtual   #68  <Method void Field.setAccessible(boolean)>
			}
	//*  51  104:goto            117
			catch(NoSuchFieldException nosuchfieldexception1)
	//*  52  107:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", ((Throwable) (nosuchfieldexception1)));
	//   53  108:ldc1            #8   <String "ResourcesFlusher">
	//   54  110:ldc1            #107 <String "Could not retrieve ResourcesImpl#mDrawableCache field">
	//   55  112:aload_1         
	//   56  113:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   57  116:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   58  117:iconst_1        
	//   59  118:putstatic       #50  <Field boolean sDrawableCacheFieldFetched>
		}
		Object obj1 = null;
	//   60  121:aconst_null     
	//   61  122:astore_2        
		nosuchfieldexception1 = ((NoSuchFieldException) (obj1));
	//   62  123:aload_2         
	//   63  124:astore_1        
		if(sDrawableCacheField != null)
	//*  64  125:getstatic       #62  <Field Field sDrawableCacheField>
	//*  65  128:ifnull          154
			try
			{
				nosuchfieldexception1 = ((NoSuchFieldException) (sDrawableCacheField.get(((Object) (resources)))));
	//   66  131:getstatic       #62  <Field Field sDrawableCacheField>
	//   67  134:aload_0         
	//   68  135:invokevirtual   #80  <Method Object Field.get(Object)>
	//   69  138:astore_1        
			}
	//*  70  139:goto            154
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  71  142:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", ((Throwable) (resources)));
	//   72  143:ldc1            #8   <String "ResourcesFlusher">
	//   73  145:ldc1            #109 <String "Could not retrieve value from ResourcesImpl#mDrawableCache">
	//   74  147:aload_0         
	//   75  148:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   76  151:pop             
				nosuchfieldexception1 = ((NoSuchFieldException) (obj1));
	//   77  152:aload_2         
	//   78  153:astore_1        
			}
		return nosuchfieldexception1 != null && flushThemedResourcesCache(((Object) (nosuchfieldexception1)));
	//   79  154:aload_1         
	//   80  155:ifnull          167
	//   81  158:aload_1         
	//   82  159:invokestatic    #91  <Method boolean flushThemedResourcesCache(Object)>
	//   83  162:ifeq            167
	//   84  165:iconst_1        
	//   85  166:ireturn         
	//   86  167:iconst_0        
	//   87  168:ireturn         
	}

	private static boolean flushThemedResourcesCache(Object obj)
	{
		if(!sThemedResourceCacheClazzFetched)
	//*   0    0:getstatic       #113 <Field boolean sThemedResourceCacheClazzFetched>
	//*   1    3:ifne            31
		{
			try
			{
				sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
	//    2    6:ldc1            #115 <String "android.content.res.ThemedResourceCache">
	//    3    8:invokestatic    #119 <Method Class Class.forName(String)>
	//    4   11:putstatic       #121 <Field Class sThemedResourceCacheClazz>
			}
	//*   5   14:goto            27
			catch(ClassNotFoundException classnotfoundexception)
	//*   6   17:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", ((Throwable) (classnotfoundexception)));
	//    7   18:ldc1            #8   <String "ResourcesFlusher">
	//    8   20:ldc1            #123 <String "Could not find ThemedResourceCache class">
	//    9   22:aload_1         
	//   10   23:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   11   26:pop             
			}
			sThemedResourceCacheClazzFetched = true;
	//   12   27:iconst_1        
	//   13   28:putstatic       #113 <Field boolean sThemedResourceCacheClazzFetched>
		}
		if(sThemedResourceCacheClazz == null)
	//*  14   31:getstatic       #121 <Field Class sThemedResourceCacheClazz>
	//*  15   34:ifnonnull       39
			return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
		if(!sThemedResourceCache_mUnthemedEntriesFieldFetched)
	//*  18   39:getstatic       #125 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
	//*  19   42:ifne            80
		{
			try
			{
				sThemedResourceCache_mUnthemedEntriesField = sThemedResourceCacheClazz.getDeclaredField("mUnthemedEntries");
	//   20   45:getstatic       #121 <Field Class sThemedResourceCacheClazz>
	//   21   48:ldc1            #127 <String "mUnthemedEntries">
	//   22   50:invokevirtual   #60  <Method Field Class.getDeclaredField(String)>
	//   23   53:putstatic       #129 <Field Field sThemedResourceCache_mUnthemedEntriesField>
				sThemedResourceCache_mUnthemedEntriesField.setAccessible(true);
	//   24   56:getstatic       #129 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   25   59:iconst_1        
	//   26   60:invokevirtual   #68  <Method void Field.setAccessible(boolean)>
			}
	//*  27   63:goto            76
			catch(NoSuchFieldException nosuchfieldexception)
	//*  28   66:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ((Throwable) (nosuchfieldexception)));
	//   29   67:ldc1            #8   <String "ResourcesFlusher">
	//   30   69:ldc1            #131 <String "Could not retrieve ThemedResourceCache#mUnthemedEntries field">
	//   31   71:aload_1         
	//   32   72:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   33   75:pop             
			}
			sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
	//   34   76:iconst_1        
	//   35   77:putstatic       #125 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
		}
		if(sThemedResourceCache_mUnthemedEntriesField == null)
	//*  36   80:getstatic       #129 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//*  37   83:ifnonnull       88
			return false;
	//   38   86:iconst_0        
	//   39   87:ireturn         
		Object obj1 = null;
	//   40   88:aconst_null     
	//   41   89:astore_1        
		try
		{
			obj = ((Object) ((LongSparseArray)sThemedResourceCache_mUnthemedEntriesField.get(obj)));
	//   42   90:getstatic       #129 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   43   93:aload_0         
	//   44   94:invokevirtual   #80  <Method Object Field.get(Object)>
	//   45   97:checkcast       #133 <Class LongSparseArray>
	//   46  100:astore_0        
		}
	//*  47  101:goto            116
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  48  104:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", ((Throwable) (obj)));
	//   49  105:ldc1            #8   <String "ResourcesFlusher">
	//   50  107:ldc1            #135 <String "Could not retrieve value from ThemedResourceCache#mUnthemedEntries">
	//   51  109:aload_0         
	//   52  110:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//   53  113:pop             
			obj = ((Object) (obj1));
	//   54  114:aload_1         
	//   55  115:astore_0        
		}
		if(obj != null)
	//*  56  116:aload_0         
	//*  57  117:ifnull          126
		{
			((LongSparseArray) (obj)).clear();
	//   58  120:aload_0         
	//   59  121:invokevirtual   #136 <Method void LongSparseArray.clear()>
			return true;
	//   60  124:iconst_1        
	//   61  125:ireturn         
		} else
		{
			return false;
	//   62  126:iconst_0        
	//   63  127:ireturn         
		}
	}

	private static final String TAG = "ResourcesFlusher";
	private static Field sDrawableCacheField;
	private static boolean sDrawableCacheFieldFetched = false;
	private static Field sResourcesImplField;
	private static boolean sResourcesImplFieldFetched = false;
	private static Class sThemedResourceCacheClazz;
	private static boolean sThemedResourceCacheClazzFetched = false;
	private static Field sThemedResourceCache_mUnthemedEntriesField;
	private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched = false;
}
