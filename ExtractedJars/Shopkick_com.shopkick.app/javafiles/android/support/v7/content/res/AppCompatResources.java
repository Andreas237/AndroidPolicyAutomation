// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.content.res;

import android.content.Context;
import android.content.res.*;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ColorStateListInflaterCompat;
import android.support.v7.widget.AppCompatDrawableManager;
import android.util.*;
import java.util.WeakHashMap;

public final class AppCompatResources
{
	private static class ColorStateListCacheEntry
	{

		final Configuration configuration;
		final ColorStateList value;

		ColorStateListCacheEntry(ColorStateList colorstatelist, Configuration configuration1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			value = colorstatelist;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field ColorStateList value>
			configuration = configuration1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field Configuration configuration>
		//    8   14:return          
		}
	}


	private AppCompatResources()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	private static void addColorStateListToCache(Context context, int i, ColorStateList colorstatelist)
	{
		Object obj = sColorStateCacheLock;
	//    0    0:getstatic       #38  <Field Object sColorStateCacheLock>
	//    1    3:astore          5
		obj;
	//    2    5:aload           5
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		SparseArray sparsearray1 = (SparseArray)sColorStateCaches.get(((Object) (context)));
	//    4    8:getstatic       #35  <Field WeakHashMap sColorStateCaches>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #47  <Method Object WeakHashMap.get(Object)>
	//    7   15:checkcast       #49  <Class SparseArray>
	//    8   18:astore          4
		SparseArray sparsearray;
		sparsearray = sparsearray1;
	//    9   20:aload           4
	//   10   22:astore_3        
		if(sparsearray1 != null)
			break MISSING_BLOCK_LABEL_45;
	//   11   23:aload           4
	//   12   25:ifnonnull       45
		sparsearray = new SparseArray();
	//   13   28:new             #49  <Class SparseArray>
	//   14   31:dup             
	//   15   32:invokespecial   #50  <Method void SparseArray()>
	//   16   35:astore_3        
		sColorStateCaches.put(((Object) (context)), ((Object) (sparsearray)));
	//   17   36:getstatic       #35  <Field WeakHashMap sColorStateCaches>
	//   18   39:aload_0         
	//   19   40:aload_3         
	//   20   41:invokevirtual   #54  <Method Object WeakHashMap.put(Object, Object)>
	//   21   44:pop             
		sparsearray.append(i, ((Object) (new ColorStateListCacheEntry(colorstatelist, context.getResources().getConfiguration()))));
	//   22   45:aload_3         
	//   23   46:iload_1         
	//   24   47:new             #6   <Class AppCompatResources$ColorStateListCacheEntry>
	//   25   50:dup             
	//   26   51:aload_2         
	//   27   52:aload_0         
	//   28   53:invokevirtual   #60  <Method Resources Context.getResources()>
	//   29   56:invokevirtual   #66  <Method Configuration Resources.getConfiguration()>
	//   30   59:invokespecial   #69  <Method void AppCompatResources$ColorStateListCacheEntry(ColorStateList, Configuration)>
	//   31   62:invokevirtual   #73  <Method void SparseArray.append(int, Object)>
		obj;
	//   32   65:aload           5
		JVM INSTR monitorexit ;
	//   33   67:monitorexit     
		return;
	//   34   68:return          
		context;
	//   35   69:astore_0        
		obj;
	//   36   70:aload           5
		JVM INSTR monitorexit ;
	//   37   72:monitorexit     
		throw context;
	//   38   73:aload_0         
	//   39   74:athrow          
	}

	private static ColorStateList getCachedColorStateList(Context context, int i)
	{
		Object obj = sColorStateCacheLock;
	//    0    0:getstatic       #38  <Field Object sColorStateCacheLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		SparseArray sparsearray = (SparseArray)sColorStateCaches.get(((Object) (context)));
	//    4    6:getstatic       #35  <Field WeakHashMap sColorStateCaches>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #47  <Method Object WeakHashMap.get(Object)>
	//    7   13:checkcast       #49  <Class SparseArray>
	//    8   16:astore_3        
		if(sparsearray == null)
			break MISSING_BLOCK_LABEL_76;
	//    9   17:aload_3         
	//   10   18:ifnull          76
		ColorStateListCacheEntry colorstatelistcacheentry;
		if(sparsearray.size() <= 0)
			break MISSING_BLOCK_LABEL_76;
	//   11   21:aload_3         
	//   12   22:invokevirtual   #81  <Method int SparseArray.size()>
	//   13   25:ifle            76
		colorstatelistcacheentry = (ColorStateListCacheEntry)sparsearray.get(i);
	//   14   28:aload_3         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #84  <Method Object SparseArray.get(int)>
	//   17   33:checkcast       #6   <Class AppCompatResources$ColorStateListCacheEntry>
	//   18   36:astore          4
		if(colorstatelistcacheentry == null)
			break MISSING_BLOCK_LABEL_76;
	//   19   38:aload           4
	//   20   40:ifnull          76
		if(!colorstatelistcacheentry.configuration.equals(context.getResources().getConfiguration()))
			break MISSING_BLOCK_LABEL_71;
	//   21   43:aload           4
	//   22   45:getfield        #88  <Field Configuration AppCompatResources$ColorStateListCacheEntry.configuration>
	//   23   48:aload_0         
	//   24   49:invokevirtual   #60  <Method Resources Context.getResources()>
	//   25   52:invokevirtual   #66  <Method Configuration Resources.getConfiguration()>
	//   26   55:invokevirtual   #94  <Method boolean Configuration.equals(Configuration)>
	//   27   58:ifeq            71
		context = ((Context) (colorstatelistcacheentry.value));
	//   28   61:aload           4
	//   29   63:getfield        #98  <Field ColorStateList AppCompatResources$ColorStateListCacheEntry.value>
	//   30   66:astore_0        
		obj;
	//   31   67:aload_2         
		JVM INSTR monitorexit ;
	//   32   68:monitorexit     
		return ((ColorStateList) (context));
	//   33   69:aload_0         
	//   34   70:areturn         
		sparsearray.remove(i);
	//   35   71:aload_3         
	//   36   72:iload_1         
	//   37   73:invokevirtual   #101 <Method void SparseArray.remove(int)>
		obj;
	//   38   76:aload_2         
		JVM INSTR monitorexit ;
	//   39   77:monitorexit     
		return null;
	//   40   78:aconst_null     
	//   41   79:areturn         
		context;
	//   42   80:astore_0        
		obj;
	//   43   81:aload_2         
		JVM INSTR monitorexit ;
	//   44   82:monitorexit     
		throw context;
	//   45   83:aload_0         
	//   46   84:athrow          
	}

	public static ColorStateList getColorStateList(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #109 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #112 <Method ColorStateList Context.getColorStateList(int)>
	//    6   13:areturn         
		ColorStateList colorstatelist = getCachedColorStateList(context, i);
	//    7   14:aload_0         
	//    8   15:iload_1         
	//    9   16:invokestatic    #114 <Method ColorStateList getCachedColorStateList(Context, int)>
	//   10   19:astore_2        
		if(colorstatelist != null)
	//*  11   20:aload_2         
	//*  12   21:ifnull          26
			return colorstatelist;
	//   13   24:aload_2         
	//   14   25:areturn         
		colorstatelist = inflateColorStateList(context, i);
	//   15   26:aload_0         
	//   16   27:iload_1         
	//   17   28:invokestatic    #117 <Method ColorStateList inflateColorStateList(Context, int)>
	//   18   31:astore_2        
		if(colorstatelist != null)
	//*  19   32:aload_2         
	//*  20   33:ifnull          44
		{
			addColorStateListToCache(context, i, colorstatelist);
	//   21   36:aload_0         
	//   22   37:iload_1         
	//   23   38:aload_2         
	//   24   39:invokestatic    #119 <Method void addColorStateListToCache(Context, int, ColorStateList)>
			return colorstatelist;
	//   25   42:aload_2         
	//   26   43:areturn         
		} else
		{
			return ContextCompat.getColorStateList(context, i);
	//   27   44:aload_0         
	//   28   45:iload_1         
	//   29   46:invokestatic    #123 <Method ColorStateList ContextCompat.getColorStateList(Context, int)>
	//   30   49:areturn         
		}
	}

	public static Drawable getDrawable(Context context, int i)
	{
		return AppCompatDrawableManager.get().getDrawable(context, i);
	//    0    0:invokestatic    #131 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #133 <Method Drawable AppCompatDrawableManager.getDrawable(Context, int)>
	//    4    8:areturn         
	}

	private static TypedValue getTypedValue()
	{
		TypedValue typedvalue1 = (TypedValue)TL_TYPED_VALUE.get();
	//    0    0:getstatic       #28  <Field ThreadLocal TL_TYPED_VALUE>
	//    1    3:invokevirtual   #138 <Method Object ThreadLocal.get()>
	//    2    6:checkcast       #140 <Class TypedValue>
	//    3    9:astore_1        
		TypedValue typedvalue = typedvalue1;
	//    4   10:aload_1         
	//    5   11:astore_0        
		if(typedvalue1 == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       31
		{
			typedvalue = new TypedValue();
	//    8   16:new             #140 <Class TypedValue>
	//    9   19:dup             
	//   10   20:invokespecial   #141 <Method void TypedValue()>
	//   11   23:astore_0        
			TL_TYPED_VALUE.set(((Object) (typedvalue)));
	//   12   24:getstatic       #28  <Field ThreadLocal TL_TYPED_VALUE>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #145 <Method void ThreadLocal.set(Object)>
		}
		return typedvalue;
	//   15   31:aload_0         
	//   16   32:areturn         
	}

	private static ColorStateList inflateColorStateList(Context context, int i)
	{
		if(isColorInt(context, i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokestatic    #151 <Method boolean isColorInt(Context, int)>
	//*   3    5:ifeq            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		Resources resources = context.getResources();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #60  <Method Resources Context.getResources()>
	//    8   14:astore_2        
		android.content.res.XmlResourceParser xmlresourceparser = resources.getXml(i);
	//    9   15:aload_2         
	//   10   16:iload_1         
	//   11   17:invokevirtual   #155 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   12   20:astore_3        
		try
		{
			context = ((Context) (ColorStateListInflaterCompat.createFromXml(resources, ((org.xmlpull.v1.XmlPullParser) (xmlresourceparser)), context.getTheme())));
	//   13   21:aload_2         
	//   14   22:aload_3         
	//   15   23:aload_0         
	//   16   24:invokevirtual   #159 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   17   27:invokestatic    #165 <Method ColorStateList ColorStateListInflaterCompat.createFromXml(Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme)>
	//   18   30:astore_0        
		}
	//*  19   31:aload_0         
	//*  20   32:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  21   33:astore_0        
		{
			Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", ((Throwable) (context)));
	//   22   34:ldc1            #11  <String "AppCompatResources">
	//   23   36:ldc1            #167 <String "Failed to inflate ColorStateList, leaving it to the framework">
	//   24   38:aload_0         
	//   25   39:invokestatic    #173 <Method int Log.e(String, String, Throwable)>
	//   26   42:pop             
			return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
		}
		return ((ColorStateList) (context));
	}

	private static boolean isColorInt(Context context, int i)
	{
		context = ((Context) (context.getResources()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method Resources Context.getResources()>
	//    2    4:astore_0        
		TypedValue typedvalue = getTypedValue();
	//    3    5:invokestatic    #175 <Method TypedValue getTypedValue()>
	//    4    8:astore_2        
		((Resources) (context)).getValue(i, typedvalue, true);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:iconst_1        
	//    9   13:invokevirtual   #179 <Method void Resources.getValue(int, TypedValue, boolean)>
		return typedvalue.type >= 28 && typedvalue.type <= 31;
	//   10   16:aload_2         
	//   11   17:getfield        #182 <Field int TypedValue.type>
	//   12   20:bipush          28
	//   13   22:icmplt          36
	//   14   25:aload_2         
	//   15   26:getfield        #182 <Field int TypedValue.type>
	//   16   29:bipush          31
	//   17   31:icmpgt          36
	//   18   34:iconst_1        
	//   19   35:ireturn         
	//   20   36:iconst_0        
	//   21   37:ireturn         
	}

	private static final String LOG_TAG = "AppCompatResources";
	private static final ThreadLocal TL_TYPED_VALUE = new ThreadLocal();
	private static final Object sColorStateCacheLock = new Object();
	private static final WeakHashMap sColorStateCaches = new WeakHashMap(0);

	static 
	{
	//    0    0:new             #23  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ThreadLocal()>
	//    3    7:putstatic       #28  <Field ThreadLocal TL_TYPED_VALUE>
	//    4   10:new             #30  <Class WeakHashMap>
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:invokespecial   #33  <Method void WeakHashMap(int)>
	//    8   18:putstatic       #35  <Field WeakHashMap sColorStateCaches>
	//    9   21:new             #4   <Class Object>
	//   10   24:dup             
	//   11   25:invokespecial   #36  <Method void Object()>
	//   12   28:putstatic       #38  <Field Object sColorStateCacheLock>
	//*  13   31:return          
	}
}
