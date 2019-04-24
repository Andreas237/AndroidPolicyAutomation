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
		if((context instanceof TintContextWrapper) || (context.getResources() instanceof TintResources) || (context.getResources() instanceof VectorEnabledTintResources))
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
		return android.os.Build.VERSION.SDK_INT < 21 || VectorEnabledTintResources.shouldBeUsed();
	//   13   29:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
	//   14   32:bipush          21
	//   15   34:icmplt          43
	//   16   37:invokestatic    #37  <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//   17   40:ifeq            45
	//   18   43:iconst_1        
	//   19   44:ireturn         
	//   20   45:iconst_0        
	//   21   46:ireturn         
	}

	public static Context wrap(Context context)
	{
		if(!shouldWrap(context)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokestatic    #81  <Method boolean shouldWrap(Context)>
	//    2    4:ifeq            177
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
	//    8   16:ifnonnull       32
_L3:
		sCache = new ArrayList();
	//    9   19:new             #85  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #86  <Method void ArrayList()>
	//   12   26:putstatic       #83  <Field ArrayList sCache>
		  goto _L5
	//*  13   29:goto            144
_L4:
		int i = sCache.size() - 1;
	//   14   32:getstatic       #83  <Field ArrayList sCache>
	//   15   35:invokevirtual   #90  <Method int ArrayList.size()>
	//   16   38:iconst_1        
	//   17   39:isub            
	//   18   40:istore_1        
_L13:
		if(i < 0) goto _L7; else goto _L6
	//   19   41:iload_1         
	//   20   42:iflt            78
_L6:
		Object obj = ((Object) ((WeakReference)sCache.get(i)));
	//   21   45:getstatic       #83  <Field ArrayList sCache>
	//   22   48:iload_1         
	//   23   49:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//   24   52:checkcast       #96  <Class WeakReference>
	//   25   55:astore_2        
		if(obj == null) goto _L9; else goto _L8
	//   26   56:aload_2         
	//   27   57:ifnull          67
_L8:
		if(((WeakReference) (obj)).get() != null) goto _L10; else goto _L9
	//   28   60:aload_2         
	//   29   61:invokevirtual   #99  <Method Object WeakReference.get()>
	//   30   64:ifnonnull       179
_L9:
		sCache.remove(i);
	//   31   67:getstatic       #83  <Field ArrayList sCache>
	//   32   70:iload_1         
	//   33   71:invokevirtual   #102 <Method Object ArrayList.remove(int)>
	//   34   74:pop             
		  goto _L10
	//*  35   75:goto            179
_L7:
		i = sCache.size() - 1;
	//   36   78:getstatic       #83  <Field ArrayList sCache>
	//   37   81:invokevirtual   #90  <Method int ArrayList.size()>
	//   38   84:iconst_1        
	//   39   85:isub            
	//   40   86:istore_1        
_L12:
		if(i < 0) goto _L5; else goto _L11
	//   41   87:iload_1         
	//   42   88:iflt            144
_L11:
		obj = ((Object) ((WeakReference)sCache.get(i)));
	//   43   91:getstatic       #83  <Field ArrayList sCache>
	//   44   94:iload_1         
	//   45   95:invokevirtual   #94  <Method Object ArrayList.get(int)>
	//   46   98:checkcast       #96  <Class WeakReference>
	//   47  101:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_186;
	//   48  102:aload_2         
	//   49  103:ifnull          186
		obj = ((Object) ((TintContextWrapper)((WeakReference) (obj)).get()));
	//   50  106:aload_2         
	//   51  107:invokevirtual   #99  <Method Object WeakReference.get()>
	//   52  110:checkcast       #2   <Class TintContextWrapper>
	//   53  113:astore_2        
	//*  54  114:goto            117
_L14:
		if(obj == null)
			continue; /* Loop/switch isn't completed */
	//   55  117:aload_2         
	//   56  118:ifnull          137
		Context context1 = ((TintContextWrapper) (obj)).getBaseContext();
	//   57  121:aload_2         
	//   58  122:invokevirtual   #106 <Method Context getBaseContext()>
	//   59  125:astore          4
		if(context1 != context)
			continue; /* Loop/switch isn't completed */
	//   60  127:aload           4
	//   61  129:aload_0         
	//   62  130:if_acmpne       137
		obj1;
	//   63  133:aload_3         
		JVM INSTR monitorexit ;
	//   64  134:monitorexit     
		return ((Context) (obj));
	//   65  135:aload_2         
	//   66  136:areturn         
	//   67  137:iload_1         
	//   68  138:iconst_1        
	//   69  139:isub            
	//   70  140:istore_1        
		  goto _L12
	//*  71  141:goto            87
_L5:
		context = ((Context) (new TintContextWrapper(context)));
	//   72  144:new             #2   <Class TintContextWrapper>
	//   73  147:dup             
	//   74  148:aload_0         
	//   75  149:invokespecial   #107 <Method void TintContextWrapper(Context)>
	//   76  152:astore_0        
		sCache.add(((Object) (new WeakReference(((Object) (context))))));
	//   77  153:getstatic       #83  <Field ArrayList sCache>
	//   78  156:new             #96  <Class WeakReference>
	//   79  159:dup             
	//   80  160:aload_0         
	//   81  161:invokespecial   #110 <Method void WeakReference(Object)>
	//   82  164:invokevirtual   #114 <Method boolean ArrayList.add(Object)>
	//   83  167:pop             
		obj1;
	//   84  168:aload_3         
		JVM INSTR monitorexit ;
	//   85  169:monitorexit     
		return context;
	//   86  170:aload_0         
	//   87  171:areturn         
		context;
	//   88  172:astore_0        
	//*  89  173:aload_3         
		throw context;
	//   90  174:monitorexit     
	//   91  175:aload_0         
	//   92  176:athrow          
_L2:
		return context;
	//   93  177:aload_0         
	//   94  178:areturn         
_L10:
		i--;
	//   95  179:iload_1         
	//   96  180:iconst_1        
	//   97  181:isub            
	//   98  182:istore_1        
		  goto _L13
	//*  99  183:goto            41
		obj = null;
	//  100  186:aconst_null     
	//  101  187:astore_2        
		  goto _L14
	//* 102  188:goto            117
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
