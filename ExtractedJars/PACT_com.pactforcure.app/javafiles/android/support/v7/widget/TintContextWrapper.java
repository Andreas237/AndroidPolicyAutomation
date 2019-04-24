// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			VectorEnabledTintResources, TintResources

public class TintContextWrapper extends ContextWrapper
{

	private TintContextWrapper(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void ContextWrapper(Context)>
		if(VectorEnabledTintResources.shouldBeUsed())
	//*   3    5:invokestatic    #37  <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*   4    8:ifeq            50
		{
			mResources = ((Resources) (new VectorEnabledTintResources(((Context) (this)), context.getResources())));
	//    5   11:aload_0         
	//    6   12:new             #33  <Class VectorEnabledTintResources>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #43  <Method Resources Context.getResources()>
	//   11   21:invokespecial   #46  <Method void VectorEnabledTintResources(Context, Resources)>
	//   12   24:putfield        #48  <Field Resources mResources>
			mTheme = mResources.newTheme();
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #48  <Field Resources mResources>
	//   16   32:invokevirtual   #54  <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   17   35:putfield        #56  <Field android.content.res.Resources$Theme mTheme>
			mTheme.setTo(context.getTheme());
	//   18   38:aload_0         
	//   19   39:getfield        #56  <Field android.content.res.Resources$Theme mTheme>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #59  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   22   46:invokevirtual   #65  <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			return;
	//   23   49:return          
		} else
		{
			mResources = ((Resources) (new TintResources(((Context) (this)), context.getResources())));
	//   24   50:aload_0         
	//   25   51:new             #67  <Class TintResources>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #43  <Method Resources Context.getResources()>
	//   30   60:invokespecial   #68  <Method void TintResources(Context, Resources)>
	//   31   63:putfield        #48  <Field Resources mResources>
			mTheme = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #56  <Field android.content.res.Resources$Theme mTheme>
			return;
	//   35   71:return          
		}
	}

	private static boolean shouldWrap(Context context)
	{
		while((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources) || android.os.Build.VERSION.SDK_INT >= 21 && !VectorEnabledTintResources.shouldBeUsed()) 
	//*   0    0:aload_0         
	//*   1    1:instanceof      #2   <Class TintContextWrapper>
	//*   2    4:ifne            27
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #43  <Method Resources Context.getResources()>
	//*   5   11:instanceof      #67  <Class TintResources>
	//*   6   14:ifne            27
	//*   7   17:aload_0         
	//*   8   18:invokevirtual   #43  <Method Resources Context.getResources()>
	//*   9   21:instanceof      #33  <Class VectorEnabledTintResources>
	//*  10   24:ifeq            29
			return false;
	//   11   27:iconst_0        
	//   12   28:ireturn         
	//   13   29:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//   14   32:bipush          21
	//   15   34:icmplt          43
	//   16   37:invokestatic    #37  <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//   17   40:ifeq            27
		return true;
	//   18   43:iconst_1        
	//   19   44:ireturn         
	}

	public static Context wrap(Context context)
	{
		if(!shouldWrap(context)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method boolean shouldWrap(Context)>
	//    2    4:ifeq            172
_L1:
		Object obj1 = CACHE_LOCK;
	//    3    7:getstatic       #26  <Field Object CACHE_LOCK>
	//    4   10:astore_3        
		obj1;
	//    5   11:aload_3         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		if(sCache != null) goto _L4; else goto _L3
	//    7   13:getstatic       #83  <Field ArrayList sCache>
	//    8   16:ifnonnull       57
_L3:
		sCache = new ArrayList();
	//    9   19:new             #85  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #86  <Method void ArrayList()>
	//   12   26:putstatic       #83  <Field ArrayList sCache>
_L6:
		context = ((Context) (new TintContextWrapper(context)));
	//   13   29:new             #2   <Class TintContextWrapper>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #87  <Method void TintContextWrapper(Context)>
	//   17   37:astore_0        
		sCache.add(((Object) (new WeakReference(((Object) (context))))));
	//   18   38:getstatic       #83  <Field ArrayList sCache>
	//   19   41:new             #89  <Class WeakReference>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:invokespecial   #92  <Method void WeakReference(Object)>
	//   23   49:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//   24   52:pop             
	//*  25   53:aload_3         
		return context;
	//   26   54:monitorexit     
	//   27   55:aload_0         
	//   28   56:areturn         
_L4:
		int i = sCache.size() - 1;
	//   29   57:getstatic       #83  <Field ArrayList sCache>
	//   30   60:invokevirtual   #100 <Method int ArrayList.size()>
	//   31   63:iconst_1        
	//   32   64:isub            
	//   33   65:istore_1        
_L13:
		if(i < 0)
			break MISSING_BLOCK_LABEL_103;
	//   34   66:iload_1         
	//   35   67:iflt            103
		Object obj = ((Object) ((WeakReference)sCache.get(i)));
	//   36   70:getstatic       #83  <Field ArrayList sCache>
	//   37   73:iload_1         
	//   38   74:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   39   77:checkcast       #89  <Class WeakReference>
	//   40   80:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_92;
	//   41   81:aload_2         
	//   42   82:ifnull          92
		if(((WeakReference) (obj)).get() != null)
			break MISSING_BLOCK_LABEL_174;
	//   43   85:aload_2         
	//   44   86:invokevirtual   #107 <Method Object WeakReference.get()>
	//   45   89:ifnonnull       174
		sCache.remove(i);
	//   46   92:getstatic       #83  <Field ArrayList sCache>
	//   47   95:iload_1         
	//   48   96:invokevirtual   #110 <Method Object ArrayList.remove(int)>
	//   49   99:pop             
		break MISSING_BLOCK_LABEL_174;
	//   50  100:goto            174
		i = sCache.size() - 1;
	//   51  103:getstatic       #83  <Field ArrayList sCache>
	//   52  106:invokevirtual   #100 <Method int ArrayList.size()>
	//   53  109:iconst_1        
	//   54  110:isub            
	//   55  111:istore_1        
_L12:
		if(i < 0) goto _L6; else goto _L5
	//   56  112:iload_1         
	//   57  113:iflt            29
_L5:
		obj = ((Object) ((WeakReference)sCache.get(i)));
	//   58  116:getstatic       #83  <Field ArrayList sCache>
	//   59  119:iload_1         
	//   60  120:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   61  123:checkcast       #89  <Class WeakReference>
	//   62  126:astore_2        
		if(obj == null) goto _L8; else goto _L7
	//   63  127:aload_2         
	//   64  128:ifnull          160
_L7:
		obj = ((Object) ((TintContextWrapper)((WeakReference) (obj)).get()));
	//   65  131:aload_2         
	//   66  132:invokevirtual   #107 <Method Object WeakReference.get()>
	//   67  135:checkcast       #2   <Class TintContextWrapper>
	//   68  138:astore_2        
_L10:
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   69  139:aload_2         
	//   70  140:ifnull          165
		if(((TintContextWrapper) (obj)).getBaseContext() != context)
			break; /* Loop/switch isn't completed */
	//   71  143:aload_2         
	//   72  144:invokevirtual   #114 <Method Context getBaseContext()>
	//   73  147:aload_0         
	//   74  148:if_acmpne       165
		obj1;
	//   75  151:aload_3         
		JVM INSTR monitorexit ;
	//   76  152:monitorexit     
		return ((Context) (obj));
	//   77  153:aload_2         
	//   78  154:areturn         
		context;
	//   79  155:astore_0        
		obj1;
	//   80  156:aload_3         
		JVM INSTR monitorexit ;
	//   81  157:monitorexit     
		throw context;
	//   82  158:aload_0         
	//   83  159:athrow          
_L8:
		obj = null;
	//   84  160:aconst_null     
	//   85  161:astore_2        
		if(true) goto _L10; else goto _L9
	//   86  162:goto            139
_L9:
		i--;
	//   87  165:iload_1         
	//   88  166:iconst_1        
	//   89  167:isub            
	//   90  168:istore_1        
		if(true) goto _L12; else goto _L11
_L11:
		  goto _L6
	//*  91  169:goto            112
_L2:
		return context;
	//   92  172:aload_0         
	//   93  173:areturn         
		i--;
	//   94  174:iload_1         
	//   95  175:iconst_1        
	//   96  176:isub            
	//   97  177:istore_1        
		  goto _L13
	//*  98  178:goto            66
	}

	public AssetManager getAssets()
	{
		return mResources.getAssets();
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Resources mResources>
	//    2    4:invokevirtual   #118 <Method AssetManager Resources.getAssets()>
	//    3    7:areturn         
	}

	public Resources getResources()
	{
		return mResources;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Resources mResources>
	//    2    4:areturn         
	}

	public android.content.res.Resources.Theme getTheme()
	{
		if(mTheme == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field android.content.res.Resources$Theme mTheme>
	//*   2    4:ifnonnull       12
			return super.getTheme();
	//    3    7:aload_0         
	//    4    8:invokespecial   #119 <Method android.content.res.Resources$Theme ContextWrapper.getTheme()>
	//    5   11:areturn         
		else
			return mTheme;
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field android.content.res.Resources$Theme mTheme>
	//    8   16:areturn         
	}

	public void setTheme(int i)
	{
		if(mTheme == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field android.content.res.Resources$Theme mTheme>
	//*   2    4:ifnonnull       13
		{
			super.setTheme(i);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokespecial   #123 <Method void ContextWrapper.setTheme(int)>
			return;
	//    6   12:return          
		} else
		{
			mTheme.applyStyle(i, true);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field android.content.res.Resources$Theme mTheme>
	//    9   17:iload_1         
	//   10   18:iconst_1        
	//   11   19:invokevirtual   #127 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			return;
	//   12   22:return          
		}
	}

	private static final Object CACHE_LOCK = new Object();
	private static ArrayList sCache;
	private final Resources mResources;
	private final android.content.res.Resources.Theme mTheme;

	static 
	{
	//    0    0:new             #21  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Object()>
	//    3    7:putstatic       #26  <Field Object CACHE_LOCK>
	//*   4   10:return          
	}
}
