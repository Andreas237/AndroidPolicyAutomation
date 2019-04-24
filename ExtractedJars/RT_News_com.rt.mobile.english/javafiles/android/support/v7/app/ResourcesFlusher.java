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
	//*   1    3:ifne            40
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
	//*   9   23:goto            36
			catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #72  <String "Could not retrieve Resources#mDrawableCache field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
			}
			sDrawableCacheFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
		}
		if(sDrawableCacheField != null)
	//*  18   40:getstatic       #64  <Field Field sDrawableCacheField>
	//*  19   43:ifnull          84
		{
			try
			{
				resources = ((Resources) ((Map)sDrawableCacheField.get(((Object) (resources)))));
	//   20   46:getstatic       #64  <Field Field sDrawableCacheField>
	//   21   49:aload_0         
	//   22   50:invokevirtual   #82  <Method Object Field.get(Object)>
	//   23   53:checkcast       #84  <Class Map>
	//   24   56:astore_0        
			}
	//*  25   57:goto            72
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  26   60:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   27   61:ldc1            #8   <String "ResourcesFlusher">
	//   28   63:ldc1            #86  <String "Could not retrieve value from Resources#mDrawableCache">
	//   29   65:aload_0         
	//   30   66:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   31   69:pop             
				resources = null;
	//   32   70:aconst_null     
	//   33   71:astore_0        
			}
			if(resources != null)
	//*  34   72:aload_0         
	//*  35   73:ifnull          84
			{
				((Map) (resources)).clear();
	//   36   76:aload_0         
	//   37   77:invokeinterface #89  <Method void Map.clear()>
				return true;
	//   38   82:iconst_1        
	//   39   83:ireturn         
			}
		}
		return false;
	//   40   84:iconst_0        
	//   41   85:ireturn         
	}

	private static boolean flushMarshmallows(Resources resources)
	{
label0:
		{
			if(!sDrawableCacheFieldFetched)
	//*   0    0:getstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*   1    3:ifne            40
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
	//*   9   23:goto            36
				catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_3        
				{
					Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #72  <String "Could not retrieve Resources#mDrawableCache field">
	//   13   31:aload_3         
	//   14   32:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
				}
				sDrawableCacheFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
			}
			if(sDrawableCacheField != null)
	//*  18   40:getstatic       #64  <Field Field sDrawableCacheField>
	//*  19   43:ifnull          67
				try
				{
					resources = ((Resources) (sDrawableCacheField.get(((Object) (resources)))));
	//   20   46:getstatic       #64  <Field Field sDrawableCacheField>
	//   21   49:aload_0         
	//   22   50:invokevirtual   #82  <Method Object Field.get(Object)>
	//   23   53:astore_0        
					break label0;
	//   24   54:goto            69
				}
				// Misplaced declaration of an exception variable
				catch(Resources resources)
	//*  25   57:astore_0        
				{
					Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable) (resources)));
	//   26   58:ldc1            #8   <String "ResourcesFlusher">
	//   27   60:ldc1            #86  <String "Could not retrieve value from Resources#mDrawableCache">
	//   28   62:aload_0         
	//   29   63:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   30   66:pop             
				}
			resources = null;
	//   31   67:aconst_null     
	//   32   68:astore_0        
		}
		boolean flag1 = false;
	//   33   69:iconst_0        
	//   34   70:istore_2        
		if(resources == null)
	//*  35   71:aload_0         
	//*  36   72:ifnonnull       77
			return false;
	//   37   75:iconst_0        
	//   38   76:ireturn         
		boolean flag = flag1;
	//   39   77:iload_2         
	//   40   78:istore_1        
		if(resources != null)
	//*  41   79:aload_0         
	//*  42   80:ifnull          94
		{
			flag = flag1;
	//   43   83:iload_2         
	//   44   84:istore_1        
			if(flushThemedResourcesCache(((Object) (resources))))
	//*  45   85:aload_0         
	//*  46   86:invokestatic    #95  <Method boolean flushThemedResourcesCache(Object)>
	//*  47   89:ifeq            94
				flag = true;
	//   48   92:iconst_1        
	//   49   93:istore_1        
		}
		return flag;
	//   50   94:iload_1         
	//   51   95:ireturn         
	}

	private static boolean flushNougats(Resources resources)
	{
label0:
		{
			if(!sResourcesImplFieldFetched)
	//*   0    0:getstatic       #98  <Field boolean sResourcesImplFieldFetched>
	//*   1    3:ifne            40
			{
				try
				{
					sResourcesImplField = ((Class) (android/content/res/Resources)).getDeclaredField("mResourcesImpl");
	//    2    6:ldc1            #54  <Class Resources>
	//    3    8:ldc1            #100 <String "mResourcesImpl">
	//    4   10:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//    5   13:putstatic       #102 <Field Field sResourcesImplField>
					sResourcesImplField.setAccessible(true);
	//    6   16:getstatic       #102 <Field Field sResourcesImplField>
	//    7   19:iconst_1        
	//    8   20:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
				}
	//*   9   23:goto            36
				catch(NoSuchFieldException nosuchfieldexception)
	//*  10   26:astore_1        
				{
					Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", ((Throwable) (nosuchfieldexception)));
	//   11   27:ldc1            #8   <String "ResourcesFlusher">
	//   12   29:ldc1            #104 <String "Could not retrieve Resources#mResourcesImpl field">
	//   13   31:aload_1         
	//   14   32:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   15   35:pop             
				}
				sResourcesImplFieldFetched = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #98  <Field boolean sResourcesImplFieldFetched>
			}
			if(sResourcesImplField == null)
	//*  18   40:getstatic       #102 <Field Field sResourcesImplField>
	//*  19   43:ifnonnull       48
				return false;
	//   20   46:iconst_0        
	//   21   47:ireturn         
			try
			{
				resources = ((Resources) (sResourcesImplField.get(((Object) (resources)))));
	//   22   48:getstatic       #102 <Field Field sResourcesImplField>
	//   23   51:aload_0         
	//   24   52:invokevirtual   #82  <Method Object Field.get(Object)>
	//   25   55:astore_0        
			}
	//*  26   56:goto            71
			// Misplaced declaration of an exception variable
			catch(Resources resources)
	//*  27   59:astore_0        
			{
				Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", ((Throwable) (resources)));
	//   28   60:ldc1            #8   <String "ResourcesFlusher">
	//   29   62:ldc1            #106 <String "Could not retrieve value from Resources#mResourcesImpl">
	//   30   64:aload_0         
	//   31   65:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   32   68:pop             
				resources = null;
	//   33   69:aconst_null     
	//   34   70:astore_0        
			}
			if(resources == null)
	//*  35   71:aload_0         
	//*  36   72:ifnonnull       77
				return false;
	//   37   75:iconst_0        
	//   38   76:ireturn         
			if(!sDrawableCacheFieldFetched)
	//*  39   77:getstatic       #52  <Field boolean sDrawableCacheFieldFetched>
	//*  40   80:ifne            119
			{
				try
				{
					sDrawableCacheField = ((Object) (resources)).getClass().getDeclaredField("mDrawableCache");
	//   41   83:aload_0         
	//   42   84:invokevirtual   #110 <Method Class Object.getClass()>
	//   43   87:ldc1            #56  <String "mDrawableCache">
	//   44   89:invokevirtual   #62  <Method Field Class.getDeclaredField(String)>
	//   45   92:putstatic       #64  <Field Field sDrawableCacheField>
					sDrawableCacheField.setAccessible(true);
	//   46   95:getstatic       #64  <Field Field sDrawableCacheField>
	//   47   98:iconst_1        
	//   48   99:invokevirtual   #70  <Method void Field.setAccessible(boolean)>
				}
	//*  49  102:goto            115
				catch(NoSuchFieldException nosuchfieldexception1)
	//*  50  105:astore_1        
				{
					Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", ((Throwable) (nosuchfieldexception1)));
	//   51  106:ldc1            #8   <String "ResourcesFlusher">
	//   52  108:ldc1            #112 <String "Could not retrieve ResourcesImpl#mDrawableCache field">
	//   53  110:aload_1         
	//   54  111:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   55  114:pop             
				}
				sDrawableCacheFieldFetched = true;
	//   56  115:iconst_1        
	//   57  116:putstatic       #52  <Field boolean sDrawableCacheFieldFetched>
			}
			if(sDrawableCacheField != null)
	//*  58  119:getstatic       #64  <Field Field sDrawableCacheField>
	//*  59  122:ifnull          146
				try
				{
					resources = ((Resources) (sDrawableCacheField.get(((Object) (resources)))));
	//   60  125:getstatic       #64  <Field Field sDrawableCacheField>
	//   61  128:aload_0         
	//   62  129:invokevirtual   #82  <Method Object Field.get(Object)>
	//   63  132:astore_0        
					break label0;
	//   64  133:goto            148
				}
				// Misplaced declaration of an exception variable
				catch(Resources resources)
	//*  65  136:astore_0        
				{
					Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", ((Throwable) (resources)));
	//   66  137:ldc1            #8   <String "ResourcesFlusher">
	//   67  139:ldc1            #114 <String "Could not retrieve value from ResourcesImpl#mDrawableCache">
	//   68  141:aload_0         
	//   69  142:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   70  145:pop             
				}
			resources = null;
	//   71  146:aconst_null     
	//   72  147:astore_0        
		}
		return resources != null && flushThemedResourcesCache(((Object) (resources)));
	//   73  148:aload_0         
	//   74  149:ifnull          161
	//   75  152:aload_0         
	//   76  153:invokestatic    #95  <Method boolean flushThemedResourcesCache(Object)>
	//   77  156:ifeq            161
	//   78  159:iconst_1        
	//   79  160:ireturn         
	//   80  161:iconst_0        
	//   81  162:ireturn         
	}

	private static boolean flushThemedResourcesCache(Object obj)
	{
		if(!sThemedResourceCacheClazzFetched)
	//*   0    0:getstatic       #119 <Field boolean sThemedResourceCacheClazzFetched>
	//*   1    3:ifne            31
		{
			try
			{
				sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
	//    2    6:ldc1            #121 <String "android.content.res.ThemedResourceCache">
	//    3    8:invokestatic    #125 <Method Class Class.forName(String)>
	//    4   11:putstatic       #127 <Field Class sThemedResourceCacheClazz>
			}
	//*   5   14:goto            27
			catch(ClassNotFoundException classnotfoundexception)
	//*   6   17:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", ((Throwable) (classnotfoundexception)));
	//    7   18:ldc1            #8   <String "ResourcesFlusher">
	//    8   20:ldc1            #129 <String "Could not find ThemedResourceCache class">
	//    9   22:aload_1         
	//   10   23:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   11   26:pop             
			}
			sThemedResourceCacheClazzFetched = true;
	//   12   27:iconst_1        
	//   13   28:putstatic       #119 <Field boolean sThemedResourceCacheClazzFetched>
		}
		if(sThemedResourceCacheClazz == null)
	//*  14   31:getstatic       #127 <Field Class sThemedResourceCacheClazz>
	//*  15   34:ifnonnull       39
			return false;
	//   16   37:iconst_0        
	//   17   38:ireturn         
		if(!sThemedResourceCache_mUnthemedEntriesFieldFetched)
	//*  18   39:getstatic       #131 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
	//*  19   42:ifne            80
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
	//*  27   63:goto            76
			catch(NoSuchFieldException nosuchfieldexception)
	//*  28   66:astore_1        
			{
				Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ((Throwable) (nosuchfieldexception)));
	//   29   67:ldc1            #8   <String "ResourcesFlusher">
	//   30   69:ldc1            #137 <String "Could not retrieve ThemedResourceCache#mUnthemedEntries field">
	//   31   71:aload_1         
	//   32   72:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   33   75:pop             
			}
			sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
	//   34   76:iconst_1        
	//   35   77:putstatic       #131 <Field boolean sThemedResourceCache_mUnthemedEntriesFieldFetched>
		}
		if(sThemedResourceCache_mUnthemedEntriesField == null)
	//*  36   80:getstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//*  37   83:ifnonnull       88
			return false;
	//   38   86:iconst_0        
	//   39   87:ireturn         
		try
		{
			obj = ((Object) ((LongSparseArray)sThemedResourceCache_mUnthemedEntriesField.get(obj)));
	//   40   88:getstatic       #135 <Field Field sThemedResourceCache_mUnthemedEntriesField>
	//   41   91:aload_0         
	//   42   92:invokevirtual   #82  <Method Object Field.get(Object)>
	//   43   95:checkcast       #139 <Class LongSparseArray>
	//   44   98:astore_0        
		}
	//*  45   99:goto            114
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  46  102:astore_0        
		{
			Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", ((Throwable) (obj)));
	//   47  103:ldc1            #8   <String "ResourcesFlusher">
	//   48  105:ldc1            #141 <String "Could not retrieve value from ThemedResourceCache#mUnthemedEntries">
	//   49  107:aload_0         
	//   50  108:invokestatic    #78  <Method int Log.e(String, String, Throwable)>
	//   51  111:pop             
			obj = null;
	//   52  112:aconst_null     
	//   53  113:astore_0        
		}
		if(obj != null)
	//*  54  114:aload_0         
	//*  55  115:ifnull          124
		{
			((LongSparseArray) (obj)).clear();
	//   56  118:aload_0         
	//   57  119:invokevirtual   #142 <Method void LongSparseArray.clear()>
			return true;
	//   58  122:iconst_1        
	//   59  123:ireturn         
		} else
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
