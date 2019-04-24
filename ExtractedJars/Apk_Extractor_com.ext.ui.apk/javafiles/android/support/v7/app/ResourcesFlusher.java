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
	//*  12   30:ifnull          84
	//*  13   33:getstatic       #64  <Field Field sDrawableCacheField>
	//*  14   36:aload_0         
	//*  15   37:invokevirtual   #74  <Method Object Field.get(Object)>
	//*  16   40:checkcast       #76  <Class Map>
	//*  17   43:astore_0        
	//*  18   44:aload_0         
	//*  19   45:ifnull          84
	//*  20   48:aload_0         
	//*  21   49:invokeinterface #79  <Method void Map.clear()>
	//*  22   54:iconst_1        
	//*  23   55:ireturn         
			catch(NoSuchFieldException nosuchfieldexception)
	//*  24   56:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   25   57:ldc1            #8   <String "ResourcesFlusher">
	//   26   59:ldc1            #81  <String "Could not retrieve Resources#mDrawableCache field">
	//   27   61:aload_1         
	//   28   62:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   29   65:pop             
			}
			sDrawableCacheFieldFetched = true;
		}
		if(sDrawableCacheField != null)
		{
			try
			{
				resources = ((Resources) ((Map)sDrawableCacheField.get(((Object) (resources)))));
			}
	//*  30   66:goto            23
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  31   69:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   32   70:ldc1            #8   <String "ResourcesFlusher">
	//   33   72:ldc1            #89  <String "Could not retrieve value from Resources#mDrawableCache">
	//   34   74:aload_0         
	//   35   75:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   36   78:pop             
				resources = null;
	//   37   79:aconst_null     
	//   38   80:astore_0        
			}
			if(resources != null)
			{
				((Map) (resources)).clear();
				return true;
			}
		}
	//*  39   81:goto            44
		return false;
	//   40   84:iconst_0        
	//   41   85:ireturn         
	}

	private static boolean flushMarshmallows(Resources resources)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
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
	//*  13   29:getstatic       #64  <Field Field sDrawableCacheField>
	//*  14   32:ifnull          72
	//*  15   35:getstatic       #64  <Field Field sDrawableCacheField>
	//*  16   38:aload_0         
	//*  17   39:invokevirtual   #74  <Method Object Field.get(Object)>
	//*  18   42:astore_0        
	//*  19   43:aload_0         
	//*  20   44:ifnonnull       77
	//*  21   47:iconst_0        
	//*  22   48:ireturn         
			catch(NoSuchFieldException nosuchfieldexception)
	//*  23   49:astore_2        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   24   50:ldc1            #8   <String "ResourcesFlusher">
	//   25   52:ldc1            #81  <String "Could not retrieve Resources#mDrawableCache field">
	//   26   54:aload_2         
	//   27   55:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   28   58:pop             
			}
			sDrawableCacheFieldFetched = true;
		}
		if(sDrawableCacheField == null) goto _L2; else goto _L1
_L1:
		resources = ((Resources) (sDrawableCacheField.get(((Object) (resources)))));
_L4:
		if(resources == null)
			return false;
		break; /* Loop/switch isn't completed */
	//*  29   59:goto            25
		resources;
	//   30   62:astore_0        
		Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   31   63:ldc1            #8   <String "ResourcesFlusher">
	//   32   65:ldc1            #89  <String "Could not retrieve value from Resources#mDrawableCache">
	//   33   67:aload_0         
	//   34   68:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   35   71:pop             
_L2:
		resources = null;
	//   36   72:aconst_null     
	//   37   73:astore_0        
		if(true) goto _L4; else goto _L3
	//   38   74:goto            43
_L3:
		if(resources == null || !flushThemedResourcesCache(((Object) (resources))))
	//*  39   77:aload_0         
	//*  40   78:ifnull          90
	//*  41   81:aload_0         
	//*  42   82:invokestatic    #95  <Method boolean flushThemedResourcesCache(Object)>
	//*  43   85:ifeq            90
	//*  44   88:iload_1         
	//*  45   89:ireturn         
			flag = false;
	//   46   90:iconst_0        
	//   47   91:istore_1        
		return flag;
	//*  48   92:goto            88
	}

	private static boolean flushNougats(Resources resources)
	{
		boolean flag;
		flag = true;
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
		if(sResourcesImplField != null) goto _L2; else goto _L1
_L1:
		return false;
	//*  23   47:goto            25
_L2:
		try
		{
			resources = ((Resources) (sResourcesImplField.get(((Object) (resources)))));
	//   24   50:getstatic       #102 <Field Field sResourcesImplField>
	//   25   53:aload_0         
	//   26   54:invokevirtual   #74  <Method Object Field.get(Object)>
	//   27   57:astore_0        
		}
	//*  28   58:aload_0         
	//*  29   59:ifnull          35
	//*  30   62:getstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  31   65:ifne            91
	//*  32   68:aload_0         
	//*  33   69:invokevirtual   #108 <Method Class Object.getClass()>
	//*  34   72:ldc1            #56  <String "mDrawableCache">
	//*  35   74:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//*  36   77:putstatic       #64  <Field Field sDrawableCacheField>
	//*  37   80:getstatic       #64  <Field Field sDrawableCacheField>
	//*  38   83:iconst_1        
	//*  39   84:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
	//*  40   87:iconst_1        
	//*  41   88:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  42   91:getstatic       #64  <Field Field sDrawableCacheField>
	//*  43   94:ifnull          156
	//*  44   97:getstatic       #64  <Field Field sDrawableCacheField>
	//*  45  100:aload_0         
	//*  46  101:invokevirtual   #74  <Method Object Field.get(Object)>
	//*  47  104:astore_0        
	//*  48  105:aload_0         
	//*  49  106:ifnull          161
	//*  50  109:aload_0         
	//*  51  110:invokestatic    #95  <Method boolean flushThemedResourcesCache(Object)>
	//*  52  113:ifeq            161
	//*  53  116:iload_1         
	//*  54  117:ireturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*  55  118:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", ((Throwable) (resources)));
	//   56  119:ldc1            #8   <String "ResourcesFlusher">
	//   57  121:ldc1            #110 <String "Could not retrieve value from Resources#mResourcesImpl">
	//   58  123:aload_0         
	//   59  124:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   60  127:pop             
			resources = null;
	//   61  128:aconst_null     
	//   62  129:astore_0        
		}
		if(resources == null) goto _L1; else goto _L3
_L3:
		if(!sDrawableCacheFieldFetched)
		{
			try
			{
				sDrawableCacheField = ((Object) (resources)).getClass().getDeclaredField("mDrawableCache");
				sDrawableCacheField.setAccessible(true);
			}
	//*  63  130:goto            58
			catch(NoSuchFieldException nosuchfieldexception1)
	//*  64  133:astore_2        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", ((Throwable) (nosuchfieldexception1)));
	//   65  134:ldc1            #8   <String "ResourcesFlusher">
	//   66  136:ldc1            #112 <String "Could not retrieve ResourcesImpl#mDrawableCache field">
	//   67  138:aload_2         
	//   68  139:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   69  142:pop             
			}
			sDrawableCacheFieldFetched = true;
		}
		if(sDrawableCacheField == null)
			break MISSING_BLOCK_LABEL_156;
		resources = ((Resources) (sDrawableCacheField.get(((Object) (resources)))));
_L4:
		if(resources == null || !flushThemedResourcesCache(((Object) (resources))))
	//*  70  143:goto            87
	//*  71  146:astore_0        
	//*  72  147:ldc1            #8   <String "ResourcesFlusher">
	//*  73  149:ldc1            #114 <String "Could not retrieve value from ResourcesImpl#mDrawableCache">
	//*  74  151:aload_0         
	//*  75  152:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//*  76  155:pop             
	//*  77  156:aconst_null     
	//*  78  157:astore_0        
	//*  79  158:goto            105
			flag = false;
	//   80  161:iconst_0        
	//   81  162:istore_1        
		return flag;
		resources;
		Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", ((Throwable) (resources)));
		resources = null;
		  goto _L4
	//*  82  163:goto            116
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
		try
		{
			obj = ((Object) ((LongSparseArray)sThemedResourceCache_mUnthemedEntriesField.get(obj)));
	//   40   88:getstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   41   91:aload_0         
	//   42   92:invokevirtual   #74  <Method Object Field.get(Object)>
	//   43   95:checkcast       #139 <Class LongSparseArray>
	//   44   98:astore_0        
		}
	//*  45   99:aload_0         
	//*  46  100:ifnull          124
	//*  47  103:aload_0         
	//*  48  104:invokevirtual   #140 <Method void LongSparseArray.clear()>
	//*  49  107:iconst_1        
	//*  50  108:ireturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  51  109:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", ((Throwable) (obj)));
	//   52  110:ldc1            #8   <String "ResourcesFlusher">
	//   53  112:ldc1            #142 <String "Could not retrieve value from ThemedResourceCache#mUnthemedEntries">
	//   54  114:aload_0         
	//   55  115:invokestatic    #87  <Method int Log.e(String, String, Throwable)>
	//   56  118:pop             
			obj = null;
	//   57  119:aconst_null     
	//   58  120:astore_0        
		}
		if(obj != null)
		{
			((LongSparseArray) (obj)).clear();
			return true;
		} else
	//*  59  121:goto            99
		{
			return false;
	//   60  124:iconst_0        
	//   61  125:ireturn         
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
