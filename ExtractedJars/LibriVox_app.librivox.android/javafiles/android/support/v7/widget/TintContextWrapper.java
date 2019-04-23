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
	//    2    2:invokespecial   #25  <Method void ContextWrapper(Context)>
		if(VectorEnabledTintResources.shouldBeUsed())
	//*   3    5:invokestatic    #31  <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*   4    8:ifeq            50
		{
			mResources = ((Resources) (new VectorEnabledTintResources(((Context) (this)), context.getResources())));
	//    5   11:aload_0         
	//    6   12:new             #27  <Class VectorEnabledTintResources>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #37  <Method Resources Context.getResources()>
	//   11   21:invokespecial   #40  <Method void VectorEnabledTintResources(Context, Resources)>
	//   12   24:putfield        #42  <Field Resources mResources>
			mTheme = mResources.newTheme();
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #42  <Field Resources mResources>
	//   16   32:invokevirtual   #48  <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   17   35:putfield        #50  <Field android.content.res.Resources$Theme mTheme>
			mTheme.setTo(context.getTheme());
	//   18   38:aload_0         
	//   19   39:getfield        #50  <Field android.content.res.Resources$Theme mTheme>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #53  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   22   46:invokevirtual   #59  <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			return;
	//   23   49:return          
		} else
		{
			mResources = ((Resources) (new TintResources(((Context) (this)), context.getResources())));
	//   24   50:aload_0         
	//   25   51:new             #61  <Class TintResources>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #37  <Method Resources Context.getResources()>
	//   30   60:invokespecial   #62  <Method void TintResources(Context, Resources)>
	//   31   63:putfield        #42  <Field Resources mResources>
			mTheme = null;
	//   32   66:aload_0         
	//   33   67:aconst_null     
	//   34   68:putfield        #50  <Field android.content.res.Resources$Theme mTheme>
			return;
	//   35   71:return          
		}
	}

	private static boolean shouldWrap(Context context)
	{
		boolean flag1 = context instanceof TintContextWrapper;
	//    0    0:aload_0         
	//    1    1:instanceof      #2   <Class TintContextWrapper>
	//    2    4:istore_2        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(!flag1 && !(context.getResources() instanceof TintResources))
	//*   5    7:iload_2         
	//*   6    8:ifne            51
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #37  <Method Resources Context.getResources()>
	//*   9   15:instanceof      #61  <Class TintResources>
	//*  10   18:ifne            51
		{
			if(context.getResources() instanceof VectorEnabledTintResources)
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #37  <Method Resources Context.getResources()>
	//*  13   25:instanceof      #27  <Class VectorEnabledTintResources>
	//*  14   28:ifeq            33
				return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
			if(android.os.Build.VERSION.SDK_INT < 21 || VectorEnabledTintResources.shouldBeUsed())
	//*  17   33:getstatic       #70  <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   36:bipush          21
	//*  19   38:icmplt          47
	//*  20   41:invokestatic    #31  <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*  21   44:ifeq            49
				flag = true;
	//   22   47:iconst_1        
	//   23   48:istore_1        
			return flag;
	//   24   49:iload_1         
	//   25   50:ireturn         
		} else
		{
			return false;
	//   26   51:iconst_0        
	//   27   52:ireturn         
		}
	}

	public static Context wrap(Context context)
	{
		if(!shouldWrap(context)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokestatic    #74  <Method boolean shouldWrap(Context)>
	//    2    4:ifeq            166
_L1:
		Object obj1 = CACHE_LOCK;
	//    3    7:getstatic       #21  <Field Object CACHE_LOCK>
	//    4   10:astore_3        
		obj1;
	//    5   11:aload_3         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		if(sCache != null) goto _L4; else goto _L3
	//    7   13:getstatic       #76  <Field ArrayList sCache>
	//    8   16:ifnonnull       32
_L3:
		sCache = new ArrayList();
	//    9   19:new             #78  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #79  <Method void ArrayList()>
	//   12   26:putstatic       #76  <Field ArrayList sCache>
		  goto _L5
	//*  13   29:goto            133
_L4:
		int i = sCache.size() - 1;
	//   14   32:getstatic       #76  <Field ArrayList sCache>
	//   15   35:invokevirtual   #83  <Method int ArrayList.size()>
	//   16   38:iconst_1        
	//   17   39:isub            
	//   18   40:istore_1        
_L14:
		if(i < 0) goto _L7; else goto _L6
	//   19   41:iload_1         
	//   20   42:iflt            78
_L6:
		Object obj = ((Object) ((WeakReference)sCache.get(i)));
	//   21   45:getstatic       #76  <Field ArrayList sCache>
	//   22   48:iload_1         
	//   23   49:invokevirtual   #87  <Method Object ArrayList.get(int)>
	//   24   52:checkcast       #89  <Class WeakReference>
	//   25   55:astore_2        
		if(obj == null) goto _L9; else goto _L8
	//   26   56:aload_2         
	//   27   57:ifnull          67
_L8:
		if(((WeakReference) (obj)).get() != null) goto _L10; else goto _L9
	//   28   60:aload_2         
	//   29   61:invokevirtual   #92  <Method Object WeakReference.get()>
	//   30   64:ifnonnull       168
_L9:
		sCache.remove(i);
	//   31   67:getstatic       #76  <Field ArrayList sCache>
	//   32   70:iload_1         
	//   33   71:invokevirtual   #95  <Method Object ArrayList.remove(int)>
	//   34   74:pop             
		  goto _L10
	//*  35   75:goto            168
_L7:
		i = sCache.size() - 1;
	//   36   78:getstatic       #76  <Field ArrayList sCache>
	//   37   81:invokevirtual   #83  <Method int ArrayList.size()>
	//   38   84:iconst_1        
	//   39   85:isub            
	//   40   86:istore_1        
_L16:
		if(i < 0) goto _L5; else goto _L11
	//   41   87:iload_1         
	//   42   88:iflt            133
_L11:
		obj = ((Object) ((WeakReference)sCache.get(i)));
	//   43   91:getstatic       #76  <Field ArrayList sCache>
	//   44   94:iload_1         
	//   45   95:invokevirtual   #87  <Method Object ArrayList.get(int)>
	//   46   98:checkcast       #89  <Class WeakReference>
	//   47  101:astore_2        
		if(obj == null) goto _L13; else goto _L12
	//   48  102:aload_2         
	//   49  103:ifnull          175
_L12:
		obj = ((Object) ((TintContextWrapper)((WeakReference) (obj)).get()));
	//   50  106:aload_2         
	//   51  107:invokevirtual   #92  <Method Object WeakReference.get()>
	//   52  110:checkcast       #2   <Class TintContextWrapper>
	//   53  113:astore_2        
	//*  54  114:goto            117
_L15:
		if(obj == null)
			break MISSING_BLOCK_LABEL_180;
	//   55  117:aload_2         
	//   56  118:ifnull          180
		if(((TintContextWrapper) (obj)).getBaseContext() != context)
			break MISSING_BLOCK_LABEL_180;
	//   57  121:aload_2         
	//   58  122:invokevirtual   #99  <Method Context getBaseContext()>
	//   59  125:aload_0         
	//   60  126:if_acmpne       180
		obj1;
	//   61  129:aload_3         
		JVM INSTR monitorexit ;
	//   62  130:monitorexit     
		return ((Context) (obj));
	//   63  131:aload_2         
	//   64  132:areturn         
_L5:
		context = ((Context) (new TintContextWrapper(context)));
	//   65  133:new             #2   <Class TintContextWrapper>
	//   66  136:dup             
	//   67  137:aload_0         
	//   68  138:invokespecial   #100 <Method void TintContextWrapper(Context)>
	//   69  141:astore_0        
		sCache.add(((Object) (new WeakReference(((Object) (context))))));
	//   70  142:getstatic       #76  <Field ArrayList sCache>
	//   71  145:new             #89  <Class WeakReference>
	//   72  148:dup             
	//   73  149:aload_0         
	//   74  150:invokespecial   #103 <Method void WeakReference(Object)>
	//   75  153:invokevirtual   #107 <Method boolean ArrayList.add(Object)>
	//   76  156:pop             
		obj1;
	//   77  157:aload_3         
		JVM INSTR monitorexit ;
	//   78  158:monitorexit     
		return context;
	//   79  159:aload_0         
	//   80  160:areturn         
		context;
	//   81  161:astore_0        
		obj1;
	//   82  162:aload_3         
		JVM INSTR monitorexit ;
	//   83  163:monitorexit     
		throw context;
	//   84  164:aload_0         
	//   85  165:athrow          
_L2:
		return context;
	//   86  166:aload_0         
	//   87  167:areturn         
_L10:
		i--;
	//   88  168:iload_1         
	//   89  169:iconst_1        
	//   90  170:isub            
	//   91  171:istore_1        
		  goto _L14
	//*  92  172:goto            41
_L13:
		obj = null;
	//   93  175:aconst_null     
	//   94  176:astore_2        
		  goto _L15
	//*  95  177:goto            117
		i--;
	//   96  180:iload_1         
	//   97  181:iconst_1        
	//   98  182:isub            
	//   99  183:istore_1        
		  goto _L16
	//* 100  184:goto            87
	}

	public AssetManager getAssets()
	{
		return mResources.getAssets();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Resources mResources>
	//    2    4:invokevirtual   #111 <Method AssetManager Resources.getAssets()>
	//    3    7:areturn         
	}

	public Resources getResources()
	{
		return mResources;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Resources mResources>
	//    2    4:areturn         
	}

	public android.content.res.Resources.Theme getTheme()
	{
		android.content.res.Resources.Theme theme1 = mTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field android.content.res.Resources$Theme mTheme>
	//    2    4:astore_2        
		android.content.res.Resources.Theme theme = theme1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(theme1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       16
			theme = super.getTheme();
	//    7   11:aload_0         
	//    8   12:invokespecial   #112 <Method android.content.res.Resources$Theme ContextWrapper.getTheme()>
	//    9   15:astore_1        
		return theme;
	//   10   16:aload_1         
	//   11   17:areturn         
	}

	public void setTheme(int i)
	{
		android.content.res.Resources.Theme theme = mTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field android.content.res.Resources$Theme mTheme>
	//    2    4:astore_2        
		if(theme == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			super.setTheme(i);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:invokespecial   #116 <Method void ContextWrapper.setTheme(int)>
			return;
	//    8   14:return          
		} else
		{
			theme.applyStyle(i, true);
	//    9   15:aload_2         
	//   10   16:iload_1         
	//   11   17:iconst_1        
	//   12   18:invokevirtual   #120 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			return;
	//   13   21:return          
		}
	}

	private static final Object CACHE_LOCK = new Object();
	private static ArrayList sCache;
	private final Resources mResources;
	private final android.content.res.Resources.Theme mTheme;

	static 
	{
	//    0    0:new             #16  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void Object()>
	//    3    7:putstatic       #21  <Field Object CACHE_LOCK>
	//*   4   10:return          
	}
}
