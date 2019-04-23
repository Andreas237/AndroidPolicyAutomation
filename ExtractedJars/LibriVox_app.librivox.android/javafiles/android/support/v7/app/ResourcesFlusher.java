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

	private ResourcesFlusher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	static void flush(Resources resources)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          9
			return;
	//    3    8:return          
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   4    9:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   12:bipush          24
	//*   6   14:icmplt          22
		{
			flushNougats(resources);
	//    7   17:aload_0         
	//    8   18:invokestatic    #35  <Method void flushNougats(Resources)>
			return;
	//    9   21:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   22:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   25:bipush          23
	//*  12   27:icmplt          35
		{
			flushMarshmallows(resources);
	//   13   30:aload_0         
	//   14   31:invokestatic    #38  <Method void flushMarshmallows(Resources)>
			return;
	//   15   34:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  16   35:getstatic       #32  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   38:bipush          21
	//*  18   40:icmplt          47
			flushLollipops(resources);
	//   19   43:aload_0         
	//   20   44:invokestatic    #41  <Method void flushLollipops(Resources)>
	//   21   47:return          
	}

	private static void flushLollipops(Resources resources)
	{
		if(!sDrawableCacheFieldFetched)
	//*   0    0:getstatic       #47  <Field boolean sDrawableCacheFieldFetched>
	//*   1    3:ifne            40
		{
			try
			{
				sDrawableCacheField = ((Class) (android/content/res/Resources)).getDeclaredField("mDrawableCache");
	//    2    6:ldc1            #49  <Class Resources>
	//    3    8:ldc1            #51  <String "mDrawableCache">
	//    4   10:invokevirtual   #57  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #59  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//    6   16:getstatic       #59  <Field Field sDrawableCacheField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #65  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #67  <String "Could not retrieve Resources#mDrawableCache field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #47  <Field boolean sDrawableCacheFieldFetched>
		}
		Field field = sDrawableCacheField;
	//   18   40:getstatic       #59  <Field Field sDrawableCacheField>
	//   19   43:astore_1        
		if(field != null)
	//*  20   44:aload_1         
	//*  21   45:ifnull          82
		{
			try
			{
				resources = ((Resources) ((Map)field.get(((Object) (resources)))));
	//   22   48:aload_1         
	//   23   49:aload_0         
	//   24   50:invokevirtual   #77  <Method Object Field.get(Object)>
	//   25   53:checkcast       #79  <Class Map>
	//   26   56:astore_0        
			}
	//*  27   57:goto            72
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  28   60:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   29   61:ldc1            #8   <String "ResourcesFlusher">
	//   30   63:ldc1            #81  <String "Could not retrieve value from Resources#mDrawableCache">
	//   31   65:aload_0         
	//   32   66:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   33   69:pop             
				resources = null;
	//   34   70:aconst_null     
	//   35   71:astore_0        
			}
			if(resources != null)
	//*  36   72:aload_0         
	//*  37   73:ifnull          82
				((Map) (resources)).clear();
	//   38   76:aload_0         
	//   39   77:invokeinterface #84  <Method void Map.clear()>
		}
	//   40   82:return          
	}

	private static void flushMarshmallows(Resources resources)
	{
		if(!sDrawableCacheFieldFetched)
	//*   0    0:getstatic       #47  <Field boolean sDrawableCacheFieldFetched>
	//*   1    3:ifne            40
		{
			try
			{
				sDrawableCacheField = ((Class) (android/content/res/Resources)).getDeclaredField("mDrawableCache");
	//    2    6:ldc1            #49  <Class Resources>
	//    3    8:ldc1            #51  <String "mDrawableCache">
	//    4   10:invokevirtual   #57  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #59  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//    6   16:getstatic       #59  <Field Field sDrawableCacheField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #65  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #67  <String "Could not retrieve Resources#mDrawableCache field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #47  <Field boolean sDrawableCacheFieldFetched>
		}
		Object obj1 = null;
	//   18   40:aconst_null     
	//   19   41:astore_2        
		Field field = sDrawableCacheField;
	//   20   42:getstatic       #59  <Field Field sDrawableCacheField>
	//   21   45:astore_3        
		Object obj = ((Object) (obj1));
	//   22   46:aload_2         
	//   23   47:astore_1        
		if(field != null)
	//*  24   48:aload_3         
	//*  25   49:ifnull          73
			try
			{
				obj = field.get(((Object) (resources)));
	//   26   52:aload_3         
	//   27   53:aload_0         
	//   28   54:invokevirtual   #77  <Method Object Field.get(Object)>
	//   29   57:astore_1        
			}
	//*  30   58:goto            73
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  31   61:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   32   62:ldc1            #8   <String "ResourcesFlusher">
	//   33   64:ldc1            #81  <String "Could not retrieve value from Resources#mDrawableCache">
	//   34   66:aload_0         
	//   35   67:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   36   70:pop             
				obj = ((Object) (obj1));
	//   37   71:aload_2         
	//   38   72:astore_1        
			}
		if(obj == null)
	//*  39   73:aload_1         
	//*  40   74:ifnonnull       78
		{
			return;
	//   41   77:return          
		} else
		{
			flushThemedResourcesCache(obj);
	//   42   78:aload_1         
	//   43   79:invokestatic    #88  <Method void flushThemedResourcesCache(Object)>
			return;
	//   44   82:return          
		}
	}

	private static void flushNougats(Resources resources)
	{
		if(!sResourcesImplFieldFetched)
	//*   0    0:getstatic       #90  <Field boolean sResourcesImplFieldFetched>
	//*   1    3:ifne            40
		{
			try
			{
				sResourcesImplField = ((Class) (android/content/res/Resources)).getDeclaredField("mResourcesImpl");
	//    2    6:ldc1            #49  <Class Resources>
	//    3    8:ldc1            #92  <String "mResourcesImpl">
	//    4   10:invokevirtual   #57  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #94  <Field Field sResourcesImplField>
				sResourcesImplField.setAccessible(true);
	//    6   16:getstatic       #94  <Field Field sResourcesImplField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #65  <Method void Field.setAccessible(boolean)>
			}
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #96  <String "Could not retrieve Resources#mResourcesImpl field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sResourcesImplFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #90  <Field boolean sResourcesImplFieldFetched>
		}
		Object obj = ((Object) (sResourcesImplField));
	//   18   40:getstatic       #94  <Field Field sResourcesImplField>
	//   19   43:astore_1        
		if(obj == null)
	//*  20   44:aload_1         
	//*  21   45:ifnonnull       49
			return;
	//   22   48:return          
		Object obj1 = null;
	//   23   49:aconst_null     
	//   24   50:astore_2        
		try
		{
			resources = ((Resources) (((Field) (obj)).get(((Object) (resources)))));
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:invokevirtual   #77  <Method Object Field.get(Object)>
	//   28   56:astore_0        
		}
	//*  29   57:goto            72
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*  30   60:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", ((Throwable) (resources)));
	//   31   61:ldc1            #8   <String "ResourcesFlusher">
	//   32   63:ldc1            #98  <String "Could not retrieve value from Resources#mResourcesImpl">
	//   33   65:aload_0         
	//   34   66:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   35   69:pop             
			resources = null;
	//   36   70:aconst_null     
	//   37   71:astore_0        
		}
		if(resources == null)
	//*  38   72:aload_0         
	//*  39   73:ifnonnull       77
			return;
	//   40   76:return          
		if(!sDrawableCacheFieldFetched)
	//*  41   77:getstatic       #47  <Field boolean sDrawableCacheFieldFetched>
	//*  42   80:ifne            119
		{
			try
			{
				sDrawableCacheField = ((Object) (resources)).getClass().getDeclaredField("mDrawableCache");
	//   43   83:aload_0         
	//   44   84:invokevirtual   #102 <Method Class Object.getClass()>
	//   45   87:ldc1            #51  <String "mDrawableCache">
	//   46   89:invokevirtual   #57  <Method Field Class.getDeclaredField(String)>
	//   47   92:putstatic       #59  <Field Field sDrawableCacheField>
				sDrawableCacheField.setAccessible(true);
	//   48   95:getstatic       #59  <Field Field sDrawableCacheField>
	//   49   98:iconst_1        
	//   50   99:invokevirtual   #65  <Method void Field.setAccessible(boolean)>
			}
	//*  51  102:goto            115
			catch(NoSuchFieldException nosuchfieldexception1)
	//*  52  105:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", ((Throwable) (nosuchfieldexception1)));
	//   53  106:ldc1            #8   <String "ResourcesFlusher">
	//   54  108:ldc1            #104 <String "Could not retrieve ResourcesImpl#mDrawableCache field">
	//   55  110:aload_1         
	//   56  111:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   57  114:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   58  115:iconst_1        
	//   59  116:putstatic       #47  <Field boolean sDrawableCacheFieldFetched>
		}
		Field field = sDrawableCacheField;
	//   60  119:getstatic       #59  <Field Field sDrawableCacheField>
	//   61  122:astore_3        
		nosuchfieldexception1 = ((NoSuchFieldException) (obj1));
	//   62  123:aload_2         
	//   63  124:astore_1        
		if(field != null)
	//*  64  125:aload_3         
	//*  65  126:ifnull          150
			try
			{
				nosuchfieldexception1 = ((NoSuchFieldException) (field.get(((Object) (resources)))));
	//   66  129:aload_3         
	//   67  130:aload_0         
	//   68  131:invokevirtual   #77  <Method Object Field.get(Object)>
	//   69  134:astore_1        
			}
	//*  70  135:goto            150
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  71  138:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", ((Throwable) (resources)));
	//   72  139:ldc1            #8   <String "ResourcesFlusher">
	//   73  141:ldc1            #106 <String "Could not retrieve value from ResourcesImpl#mDrawableCache">
	//   74  143:aload_0         
	//   75  144:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   76  147:pop             
				nosuchfieldexception1 = ((NoSuchFieldException) (obj1));
	//   77  148:aload_2         
	//   78  149:astore_1        
			}
		if(nosuchfieldexception1 != null)
	//*  79  150:aload_1         
	//*  80  151:ifnull          158
			flushThemedResourcesCache(((Object) (nosuchfieldexception1)));
	//   81  154:aload_1         
	//   82  155:invokestatic    #88  <Method void flushThemedResourcesCache(Object)>
	//   83  158:return          
	}

	private static void flushThemedResourcesCache(Object obj)
	{
		if(!sThemedResourceCacheClazzFetched)
	//*   0    0:getstatic       #110 <Field boolean sThemedResourceCacheClazzFetched>
	//*   1    3:ifne            31
		{
			try
			{
				sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
	//    2    6:ldc1            #112 <String "android.content.res.ThemedResourceCache">
	//    3    8:invokestatic    #116 <Method Class Class.forName(String)>
	//    4   11:putstatic       #118 <Field Class sThemedResourceCacheClazz>
			}
	//*   5   14:goto            27
			catch(ClassNotFoundException classnotfoundexception)
	//*   6   17:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", ((Throwable) (classnotfoundexception)));
	//    7   18:ldc1            #8   <String "ResourcesFlusher">
	//    8   20:ldc1            #120 <String "Could not find ThemedResourceCache class">
	//    9   22:aload_1         
	//   10   23:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   11   26:pop             
			}
			sThemedResourceCacheClazzFetched = true;
	//   12   27:iconst_1        
	//   13   28:putstatic       #110 <Field boolean sThemedResourceCacheClazzFetched>
		}
		Object obj1 = ((Object) (sThemedResourceCacheClazz));
	//   14   31:getstatic       #118 <Field Class sThemedResourceCacheClazz>
	//   15   34:astore_1        
		if(obj1 == null)
	//*  16   35:aload_1         
	//*  17   36:ifnonnull       40
			return;
	//   18   39:return          
		if(!sThemedResourceCache_mUnthemedEntriesFieldFetched)
	//*  19   40:getstatic       #122 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
	//*  20   43:ifne            79
		{
			try
			{
				sThemedResourceCache_mUnthemedEntriesField = ((Class) (obj1)).getDeclaredField("mUnthemedEntries");
	//   21   46:aload_1         
	//   22   47:ldc1            #124 <String "mUnthemedEntries">
	//   23   49:invokevirtual   #57  <Method Field Class.getDeclaredField(String)>
	//   24   52:putstatic       #126 <Field Field sThemedResourceCache_mUnthemedEntriesField>
				sThemedResourceCache_mUnthemedEntriesField.setAccessible(true);
	//   25   55:getstatic       #126 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   26   58:iconst_1        
	//   27   59:invokevirtual   #65  <Method void Field.setAccessible(boolean)>
			}
	//*  28   62:goto            75
			catch(NoSuchFieldException nosuchfieldexception)
	//*  29   65:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ((Throwable) (nosuchfieldexception)));
	//   30   66:ldc1            #8   <String "ResourcesFlusher">
	//   31   68:ldc1            #128 <String "Could not retrieve ThemedResourceCache#mUnthemedEntries field">
	//   32   70:aload_1         
	//   33   71:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   34   74:pop             
			}
			sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
	//   35   75:iconst_1        
	//   36   76:putstatic       #122 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
		}
		nosuchfieldexception = ((NoSuchFieldException) (sThemedResourceCache_mUnthemedEntriesField));
	//   37   79:getstatic       #126 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   38   82:astore_1        
		if(nosuchfieldexception == null)
	//*  39   83:aload_1         
	//*  40   84:ifnonnull       88
			return;
	//   41   87:return          
		try
		{
			obj = ((Object) ((LongSparseArray)((Field) (nosuchfieldexception)).get(obj)));
	//   42   88:aload_1         
	//   43   89:aload_0         
	//   44   90:invokevirtual   #77  <Method Object Field.get(Object)>
	//   45   93:checkcast       #130 <Class LongSparseArray>
	//   46   96:astore_0        
		}
	//*  47   97:goto            112
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  48  100:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", ((Throwable) (obj)));
	//   49  101:ldc1            #8   <String "ResourcesFlusher">
	//   50  103:ldc1            #132 <String "Could not retrieve value from ThemedResourceCache#mUnthemedEntries">
	//   51  105:aload_0         
	//   52  106:invokestatic    #73  <Method int Log.e(String, String, Throwable)>
	//   53  109:pop             
			obj = null;
	//   54  110:aconst_null     
	//   55  111:astore_0        
		}
		if(obj != null)
	//*  56  112:aload_0         
	//*  57  113:ifnull          120
			((LongSparseArray) (obj)).clear();
	//   58  116:aload_0         
	//   59  117:invokevirtual   #133 <Method void LongSparseArray.clear()>
	//   60  120:return          
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
