// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

// Referenced classes of package android.support.v7.graphics.drawable:
//			DrawableContainer

static abstract class DrawableContainer$DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState
{

	private void createAllFutures()
	{
		SparseArray sparsearray = mDrawableFutures;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field SparseArray mDrawableFutures>
	//    2    4:astore          4
		if(sparsearray != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          77
		{
			int j = sparsearray.size();
	//    5   11:aload           4
	//    6   13:invokevirtual   #162 <Method int SparseArray.size()>
	//    7   16:istore_2        
			for(int i = 0; i < j; i++)
	//*   8   17:iconst_0        
	//*   9   18:istore_1        
	//*  10   19:iload_1         
	//*  11   20:iload_2         
	//*  12   21:icmpge          72
			{
				int k = mDrawableFutures.keyAt(i);
	//   13   24:aload_0         
	//   14   25:getfield        #139 <Field SparseArray mDrawableFutures>
	//   15   28:iload_1         
	//   16   29:invokevirtual   #166 <Method int SparseArray.keyAt(int)>
	//   17   32:istore_3        
				android.graphics.drawable.Drawable.ConstantState constantstate = (android.graphics.drawable.Drawable.ConstantState)mDrawableFutures.valueAt(i);
	//   18   33:aload_0         
	//   19   34:getfield        #139 <Field SparseArray mDrawableFutures>
	//   20   37:iload_1         
	//   21   38:invokevirtual   #170 <Method Object SparseArray.valueAt(int)>
	//   22   41:checkcast       #4   <Class android.graphics.drawable.Drawable$ConstantState>
	//   23   44:astore          4
				mDrawables[k] = prepareDrawable(constantstate.newDrawable(mSourceRes));
	//   24   46:aload_0         
	//   25   47:getfield        #133 <Field Drawable[] mDrawables>
	//   26   50:iload_3         
	//   27   51:aload_0         
	//   28   52:aload           4
	//   29   54:aload_0         
	//   30   55:getfield        #74  <Field Resources mSourceRes>
	//   31   58:invokevirtual   #174 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   32   61:invokespecial   #178 <Method Drawable prepareDrawable(Drawable)>
	//   33   64:aastore         
			}

	//   34   65:iload_1         
	//   35   66:iconst_1        
	//   36   67:iadd            
	//   37   68:istore_1        
	//*  38   69:goto            19
			mDrawableFutures = null;
	//   39   72:aload_0         
	//   40   73:aconst_null     
	//   41   74:putfield        #139 <Field SparseArray mDrawableFutures>
		}
	//   42   77:return          
	}

	private Drawable prepareDrawable(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #183 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          17
			drawable.setLayoutDirection(mLayoutDirection);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #90  <Field int mLayoutDirection>
	//    6   13:invokevirtual   #187 <Method boolean Drawable.setLayoutDirection(int)>
	//    7   16:pop             
		drawable = drawable.mutate();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #191 <Method Drawable Drawable.mutate()>
	//   10   21:astore_1        
		drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (mOwner)));
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #72  <Field DrawableContainer mOwner>
	//   14   27:invokevirtual   #195 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		return drawable;
	//   15   30:aload_1         
	//   16   31:areturn         
	}

	public final int addChild(Drawable drawable)
	{
		int i = mNumChildren;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int mNumChildren>
	//    2    4:istore_2        
		if(i >= mDrawables.length)
	//*   3    5:iload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #133 <Field Drawable[] mDrawables>
	//*   6   10:arraylength     
	//*   7   11:icmplt          23
			growArray(i, i + 10);
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:iload_2         
	//   11   17:bipush          10
	//   12   19:iadd            
	//   13   20:invokevirtual   #201 <Method void growArray(int, int)>
		drawable.mutate();
	//   14   23:aload_1         
	//   15   24:invokevirtual   #191 <Method Drawable Drawable.mutate()>
	//   16   27:pop             
		drawable.setVisible(false, true);
	//   17   28:aload_1         
	//   18   29:iconst_0        
	//   19   30:iconst_1        
	//   20   31:invokevirtual   #205 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   34:pop             
		drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (mOwner)));
	//   22   35:aload_1         
	//   23   36:aload_0         
	//   24   37:getfield        #72  <Field DrawableContainer mOwner>
	//   25   40:invokevirtual   #195 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mDrawables[i] = drawable;
	//   26   43:aload_0         
	//   27   44:getfield        #133 <Field Drawable[] mDrawables>
	//   28   47:iload_2         
	//   29   48:aload_1         
	//   30   49:aastore         
		mNumChildren = mNumChildren + 1;
	//   31   50:aload_0         
	//   32   51:aload_0         
	//   33   52:getfield        #137 <Field int mNumChildren>
	//   34   55:iconst_1        
	//   35   56:iadd            
	//   36   57:putfield        #137 <Field int mNumChildren>
		int j = mChildrenChangingConfigurations;
	//   37   60:aload_0         
	//   38   61:getfield        #82  <Field int mChildrenChangingConfigurations>
	//   39   64:istore_3        
		mChildrenChangingConfigurations = drawable.getChangingConfigurations() | j;
	//   40   65:aload_0         
	//   41   66:aload_1         
	//   42   67:invokevirtual   #208 <Method int Drawable.getChangingConfigurations()>
	//   43   70:iload_3         
	//   44   71:ior             
	//   45   72:putfield        #82  <Field int mChildrenChangingConfigurations>
		invalidateCache();
	//   46   75:aload_0         
	//   47   76:invokevirtual   #211 <Method void invalidateCache()>
		mConstantPadding = null;
	//   48   79:aload_0         
	//   49   80:aconst_null     
	//   50   81:putfield        #110 <Field Rect mConstantPadding>
		mCheckedPadding = false;
	//   51   84:aload_0         
	//   52   85:iconst_0        
	//   53   86:putfield        #106 <Field boolean mCheckedPadding>
		mCheckedConstantSize = false;
	//   54   89:aload_0         
	//   55   90:iconst_0        
	//   56   91:putfield        #115 <Field boolean mCheckedConstantSize>
		mCheckedConstantState = false;
	//   57   94:aload_0         
	//   58   95:iconst_0        
	//   59   96:putfield        #84  <Field boolean mCheckedConstantState>
		return i;
	//   60   99:iload_2         
	//   61  100:ireturn         
	}

	final void applyTheme(android.content.res.Resources.Theme theme)
	{
		if(theme != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          82
		{
			createAllFutures();
	//    2    4:aload_0         
	//    3    5:invokespecial   #218 <Method void createAllFutures()>
			int j = mNumChildren;
	//    4    8:aload_0         
	//    5    9:getfield        #137 <Field int mNumChildren>
	//    6   12:istore_3        
			Drawable adrawable[] = mDrawables;
	//    7   13:aload_0         
	//    8   14:getfield        #133 <Field Drawable[] mDrawables>
	//    9   17:astore          4
			for(int i = 0; i < j; i++)
	//*  10   19:iconst_0        
	//*  11   20:istore_2        
	//*  12   21:iload_2         
	//*  13   22:iload_3         
	//*  14   23:icmpge          74
				if(adrawable[i] != null && adrawable[i].canApplyTheme())
	//*  15   26:aload           4
	//*  16   28:iload_2         
	//*  17   29:aaload          
	//*  18   30:ifnull          67
	//*  19   33:aload           4
	//*  20   35:iload_2         
	//*  21   36:aaload          
	//*  22   37:invokevirtual   #222 <Method boolean Drawable.canApplyTheme()>
	//*  23   40:ifeq            67
				{
					adrawable[i].applyTheme(theme);
	//   24   43:aload           4
	//   25   45:iload_2         
	//   26   46:aaload          
	//   27   47:aload_1         
	//   28   48:invokevirtual   #224 <Method void Drawable.applyTheme(android.content.res.Resources$Theme)>
					mChildrenChangingConfigurations = mChildrenChangingConfigurations | adrawable[i].getChangingConfigurations();
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #82  <Field int mChildrenChangingConfigurations>
	//   32   56:aload           4
	//   33   58:iload_2         
	//   34   59:aaload          
	//   35   60:invokevirtual   #208 <Method int Drawable.getChangingConfigurations()>
	//   36   63:ior             
	//   37   64:putfield        #82  <Field int mChildrenChangingConfigurations>
				}

	//   38   67:iload_2         
	//   39   68:iconst_1        
	//   40   69:iadd            
	//   41   70:istore_2        
	//*  42   71:goto            21
			updateDensity(theme.getResources());
	//   43   74:aload_0         
	//   44   75:aload_1         
	//   45   76:invokevirtual   #230 <Method Resources android.content.res.Resources$Theme.getResources()>
	//   46   79:invokevirtual   #234 <Method void updateDensity(Resources)>
		}
	//   47   82:return          
	}

	public boolean canApplyTheme()
	{
		int j = mNumChildren;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int mNumChildren>
	//    2    4:istore_2        
		Drawable adrawable[] = mDrawables;
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field Drawable[] mDrawables>
	//    5    9:astore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_2         
	//*  10   14:icmpge          72
		{
			Object obj = ((Object) (adrawable[i]));
	//   11   17:aload_3         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:astore          4
			if(obj != null)
	//*  15   22:aload           4
	//*  16   24:ifnull          37
			{
				if(((Drawable) (obj)).canApplyTheme())
	//*  17   27:aload           4
	//*  18   29:invokevirtual   #222 <Method boolean Drawable.canApplyTheme()>
	//*  19   32:ifeq            65
					return true;
	//   20   35:iconst_1        
	//   21   36:ireturn         
				continue;
			}
			obj = ((Object) ((android.graphics.drawable.Drawable.ConstantState)mDrawableFutures.get(i)));
	//   22   37:aload_0         
	//   23   38:getfield        #139 <Field SparseArray mDrawableFutures>
	//   24   41:iload_1         
	//   25   42:invokevirtual   #238 <Method Object SparseArray.get(int)>
	//   26   45:checkcast       #4   <Class android.graphics.drawable.Drawable$ConstantState>
	//   27   48:astore          4
			if(obj != null && ((android.graphics.drawable.Drawable.ConstantState) (obj)).canApplyTheme())
	//*  28   50:aload           4
	//*  29   52:ifnull          65
	//*  30   55:aload           4
	//*  31   57:invokevirtual   #239 <Method boolean android.graphics.drawable.Drawable$ConstantState.canApplyTheme()>
	//*  32   60:ifeq            65
				return true;
	//   33   63:iconst_1        
	//   34   64:ireturn         
		}

	//   35   65:iload_1         
	//   36   66:iconst_1        
	//   37   67:iadd            
	//   38   68:istore_1        
	//*  39   69:goto            12
		return false;
	//   40   72:iconst_0        
	//   41   73:ireturn         
	}

	public boolean canConstantState()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(!mCheckedConstantState)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:aload_0         
	//    3    3:getfield        #84  <Field boolean mCheckedConstantState>
	//    4    6:ifeq            18
		flag = mCanConstantState;
	//    5    9:aload_0         
	//    6   10:getfield        #86  <Field boolean mCanConstantState>
	//    7   13:istore_3        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return flag;
	//   10   16:iload_3         
	//   11   17:ireturn         
		int j;
		Drawable adrawable[];
		createAllFutures();
	//   12   18:aload_0         
	//   13   19:invokespecial   #218 <Method void createAllFutures()>
		mCheckedConstantState = true;
	//   14   22:aload_0         
	//   15   23:iconst_1        
	//   16   24:putfield        #84  <Field boolean mCheckedConstantState>
		j = mNumChildren;
	//   17   27:aload_0         
	//   18   28:getfield        #137 <Field int mNumChildren>
	//   19   31:istore_2        
		adrawable = mDrawables;
	//   20   32:aload_0         
	//   21   33:getfield        #133 <Field Drawable[] mDrawables>
	//   22   36:astore          4
		int i = 0;
	//   23   38:iconst_0        
	//   24   39:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   25   40:iload_1         
	//   26   41:iload_2         
	//   27   42:icmpge          71
		if(adrawable[i].getConstantState() != null)
			break MISSING_BLOCK_LABEL_64;
	//   28   45:aload           4
	//   29   47:iload_1         
	//   30   48:aaload          
	//   31   49:invokevirtual   #152 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//   32   52:ifnonnull       64
		mCanConstantState = false;
	//   33   55:aload_0         
	//   34   56:iconst_0        
	//   35   57:putfield        #86  <Field boolean mCanConstantState>
		this;
	//   36   60:aload_0         
		JVM INSTR monitorexit ;
	//   37   61:monitorexit     
		return false;
	//   38   62:iconst_0        
	//   39   63:ireturn         
		i++;
	//   40   64:iload_1         
	//   41   65:iconst_1        
	//   42   66:iadd            
	//   43   67:istore_1        
		if(true) goto _L2; else goto _L1
	//   44   68:goto            40
_L1:
		mCanConstantState = true;
	//   45   71:aload_0         
	//   46   72:iconst_1        
	//   47   73:putfield        #86  <Field boolean mCanConstantState>
		this;
	//   48   76:aload_0         
		JVM INSTR monitorexit ;
	//   49   77:monitorexit     
		return true;
	//   50   78:iconst_1        
	//   51   79:ireturn         
		Exception exception;
		exception;
	//   52   80:astore          4
	//*  53   82:aload_0         
		throw exception;
	//   54   83:monitorexit     
	//   55   84:aload           4
	//   56   86:athrow          
	}

	protected void computeConstantSize()
	{
		mCheckedConstantSize = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #115 <Field boolean mCheckedConstantSize>
		createAllFutures();
	//    3    5:aload_0         
	//    4    6:invokespecial   #218 <Method void createAllFutures()>
		int j = mNumChildren;
	//    5    9:aload_0         
	//    6   10:getfield        #137 <Field int mNumChildren>
	//    7   13:istore_2        
		Drawable adrawable[] = mDrawables;
	//    8   14:aload_0         
	//    9   15:getfield        #133 <Field Drawable[] mDrawables>
	//   10   18:astore          4
		mConstantHeight = -1;
	//   11   20:aload_0         
	//   12   21:iconst_m1       
	//   13   22:putfield        #119 <Field int mConstantHeight>
		mConstantWidth = -1;
	//   14   25:aload_0         
	//   15   26:iconst_m1       
	//   16   27:putfield        #117 <Field int mConstantWidth>
		int i = 0;
	//   17   30:iconst_0        
	//   18   31:istore_1        
		mConstantMinimumHeight = 0;
	//   19   32:aload_0         
	//   20   33:iconst_0        
	//   21   34:putfield        #123 <Field int mConstantMinimumHeight>
		mConstantMinimumWidth = 0;
	//   22   37:aload_0         
	//   23   38:iconst_0        
	//   24   39:putfield        #121 <Field int mConstantMinimumWidth>
		for(; i < j; i++)
	//*  25   42:iload_1         
	//*  26   43:iload_2         
	//*  27   44:icmpge          136
		{
			Drawable drawable = adrawable[i];
	//   28   47:aload           4
	//   29   49:iload_1         
	//   30   50:aaload          
	//   31   51:astore          5
			int k = drawable.getIntrinsicWidth();
	//   32   53:aload           5
	//   33   55:invokevirtual   #244 <Method int Drawable.getIntrinsicWidth()>
	//   34   58:istore_3        
			if(k > mConstantWidth)
	//*  35   59:iload_3         
	//*  36   60:aload_0         
	//*  37   61:getfield        #117 <Field int mConstantWidth>
	//*  38   64:icmple          72
				mConstantWidth = k;
	//   39   67:aload_0         
	//   40   68:iload_3         
	//   41   69:putfield        #117 <Field int mConstantWidth>
			k = drawable.getIntrinsicHeight();
	//   42   72:aload           5
	//   43   74:invokevirtual   #247 <Method int Drawable.getIntrinsicHeight()>
	//   44   77:istore_3        
			if(k > mConstantHeight)
	//*  45   78:iload_3         
	//*  46   79:aload_0         
	//*  47   80:getfield        #119 <Field int mConstantHeight>
	//*  48   83:icmple          91
				mConstantHeight = k;
	//   49   86:aload_0         
	//   50   87:iload_3         
	//   51   88:putfield        #119 <Field int mConstantHeight>
			k = drawable.getMinimumWidth();
	//   52   91:aload           5
	//   53   93:invokevirtual   #250 <Method int Drawable.getMinimumWidth()>
	//   54   96:istore_3        
			if(k > mConstantMinimumWidth)
	//*  55   97:iload_3         
	//*  56   98:aload_0         
	//*  57   99:getfield        #121 <Field int mConstantMinimumWidth>
	//*  58  102:icmple          110
				mConstantMinimumWidth = k;
	//   59  105:aload_0         
	//   60  106:iload_3         
	//   61  107:putfield        #121 <Field int mConstantMinimumWidth>
			k = drawable.getMinimumHeight();
	//   62  110:aload           5
	//   63  112:invokevirtual   #253 <Method int Drawable.getMinimumHeight()>
	//   64  115:istore_3        
			if(k > mConstantMinimumHeight)
	//*  65  116:iload_3         
	//*  66  117:aload_0         
	//*  67  118:getfield        #123 <Field int mConstantMinimumHeight>
	//*  68  121:icmple          129
				mConstantMinimumHeight = k;
	//   69  124:aload_0         
	//   70  125:iload_3         
	//   71  126:putfield        #123 <Field int mConstantMinimumHeight>
		}

	//   72  129:iload_1         
	//   73  130:iconst_1        
	//   74  131:iadd            
	//   75  132:istore_1        
	//*  76  133:goto            42
	//   77  136:return          
	}

	final int getCapacity()
	{
		return mDrawables.length;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Drawable[] mDrawables>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int getChangingConfigurations()
	{
		return mChangingConfigurations | mChildrenChangingConfigurations;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int mChangingConfigurations>
	//    2    4:aload_0         
	//    3    5:getfield        #82  <Field int mChildrenChangingConfigurations>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	public final Drawable getChild(int i)
	{
		Object obj = ((Object) (mDrawables[i]));
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Drawable[] mDrawables>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:astore_3        
		if(obj != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          13
			return ((Drawable) (obj));
	//    7   11:aload_3         
	//    8   12:areturn         
		obj = ((Object) (mDrawableFutures));
	//    9   13:aload_0         
	//   10   14:getfield        #139 <Field SparseArray mDrawableFutures>
	//   11   17:astore_3        
		if(obj != null)
	//*  12   18:aload_3         
	//*  13   19:ifnull          87
		{
			int j = ((SparseArray) (obj)).indexOfKey(i);
	//   14   22:aload_3         
	//   15   23:iload_1         
	//   16   24:invokevirtual   #259 <Method int SparseArray.indexOfKey(int)>
	//   17   27:istore_2        
			if(j >= 0)
	//*  18   28:iload_2         
	//*  19   29:iflt            87
			{
				Drawable drawable = prepareDrawable(((android.graphics.drawable.Drawable.ConstantState)mDrawableFutures.valueAt(j)).newDrawable(mSourceRes));
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:getfield        #139 <Field SparseArray mDrawableFutures>
	//   23   37:iload_2         
	//   24   38:invokevirtual   #170 <Method Object SparseArray.valueAt(int)>
	//   25   41:checkcast       #4   <Class android.graphics.drawable.Drawable$ConstantState>
	//   26   44:aload_0         
	//   27   45:getfield        #74  <Field Resources mSourceRes>
	//   28   48:invokevirtual   #174 <Method Drawable android.graphics.drawable.Drawable$ConstantState.newDrawable(Resources)>
	//   29   51:invokespecial   #178 <Method Drawable prepareDrawable(Drawable)>
	//   30   54:astore_3        
				mDrawables[i] = drawable;
	//   31   55:aload_0         
	//   32   56:getfield        #133 <Field Drawable[] mDrawables>
	//   33   59:iload_1         
	//   34   60:aload_3         
	//   35   61:aastore         
				mDrawableFutures.removeAt(j);
	//   36   62:aload_0         
	//   37   63:getfield        #139 <Field SparseArray mDrawableFutures>
	//   38   66:iload_2         
	//   39   67:invokevirtual   #262 <Method void SparseArray.removeAt(int)>
				if(mDrawableFutures.size() == 0)
	//*  40   70:aload_0         
	//*  41   71:getfield        #139 <Field SparseArray mDrawableFutures>
	//*  42   74:invokevirtual   #162 <Method int SparseArray.size()>
	//*  43   77:ifne            85
					mDrawableFutures = null;
	//   44   80:aload_0         
	//   45   81:aconst_null     
	//   46   82:putfield        #139 <Field SparseArray mDrawableFutures>
				return drawable;
	//   47   85:aload_3         
	//   48   86:areturn         
			}
		}
		return null;
	//   49   87:aconst_null     
	//   50   88:areturn         
	}

	public final int getChildCount()
	{
		return mNumChildren;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int mNumChildren>
	//    2    4:ireturn         
	}

	public final int getConstantHeight()
	{
		if(!mCheckedConstantSize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mCheckedConstantSize>
	//*   2    4:ifne            11
			computeConstantSize();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #266 <Method void computeConstantSize()>
		return mConstantHeight;
	//    5   11:aload_0         
	//    6   12:getfield        #119 <Field int mConstantHeight>
	//    7   15:ireturn         
	}

	public final int getConstantMinimumHeight()
	{
		if(!mCheckedConstantSize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mCheckedConstantSize>
	//*   2    4:ifne            11
			computeConstantSize();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #266 <Method void computeConstantSize()>
		return mConstantMinimumHeight;
	//    5   11:aload_0         
	//    6   12:getfield        #123 <Field int mConstantMinimumHeight>
	//    7   15:ireturn         
	}

	public final int getConstantMinimumWidth()
	{
		if(!mCheckedConstantSize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mCheckedConstantSize>
	//*   2    4:ifne            11
			computeConstantSize();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #266 <Method void computeConstantSize()>
		return mConstantMinimumWidth;
	//    5   11:aload_0         
	//    6   12:getfield        #121 <Field int mConstantMinimumWidth>
	//    7   15:ireturn         
	}

	public final Rect getConstantPadding()
	{
		if(mVariablePadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean mVariablePadding>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(mConstantPadding == null && !mCheckedPadding)
	//*   5    9:aload_0         
	//*   6   10:getfield        #110 <Field Rect mConstantPadding>
	//*   7   13:ifnonnull       216
	//*   8   16:aload_0         
	//*   9   17:getfield        #106 <Field boolean mCheckedPadding>
	//*  10   20:ifeq            26
	//*  11   23:goto            216
		{
			createAllFutures();
	//   12   26:aload_0         
	//   13   27:invokespecial   #218 <Method void createAllFutures()>
			Rect rect3 = new Rect();
	//   14   30:new             #108 <Class Rect>
	//   15   33:dup             
	//   16   34:invokespecial   #271 <Method void Rect()>
	//   17   37:astore          6
			int j = mNumChildren;
	//   18   39:aload_0         
	//   19   40:getfield        #137 <Field int mNumChildren>
	//   20   43:istore_2        
			Drawable adrawable[] = mDrawables;
	//   21   44:aload_0         
	//   22   45:getfield        #133 <Field Drawable[] mDrawables>
	//   23   48:astore          7
			Rect rect = null;
	//   24   50:aconst_null     
	//   25   51:astore_3        
			for(int i = 0; i < j;)
	//*  26   52:iconst_0        
	//*  27   53:istore_1        
	//*  28   54:iload_1         
	//*  29   55:iload_2         
	//*  30   56:icmpge          204
			{
				Rect rect2 = rect;
	//   31   59:aload_3         
	//   32   60:astore          5
				if(adrawable[i].getPadding(rect3))
	//*  33   62:aload           7
	//*  34   64:iload_1         
	//*  35   65:aaload          
	//*  36   66:aload           6
	//*  37   68:invokevirtual   #275 <Method boolean Drawable.getPadding(Rect)>
	//*  38   71:ifeq            194
				{
					Rect rect1 = rect;
	//   39   74:aload_3         
	//   40   75:astore          4
					if(rect == null)
	//*  41   77:aload_3         
	//*  42   78:ifnonnull       94
						rect1 = new Rect(0, 0, 0, 0);
	//   43   81:new             #108 <Class Rect>
	//   44   84:dup             
	//   45   85:iconst_0        
	//   46   86:iconst_0        
	//   47   87:iconst_0        
	//   48   88:iconst_0        
	//   49   89:invokespecial   #278 <Method void Rect(int, int, int, int)>
	//   50   92:astore          4
					if(rect3.left > rect1.left)
	//*  51   94:aload           6
	//*  52   96:getfield        #281 <Field int Rect.left>
	//*  53   99:aload           4
	//*  54  101:getfield        #281 <Field int Rect.left>
	//*  55  104:icmple          117
						rect1.left = rect3.left;
	//   56  107:aload           4
	//   57  109:aload           6
	//   58  111:getfield        #281 <Field int Rect.left>
	//   59  114:putfield        #281 <Field int Rect.left>
					if(rect3.top > rect1.top)
	//*  60  117:aload           6
	//*  61  119:getfield        #284 <Field int Rect.top>
	//*  62  122:aload           4
	//*  63  124:getfield        #284 <Field int Rect.top>
	//*  64  127:icmple          140
						rect1.top = rect3.top;
	//   65  130:aload           4
	//   66  132:aload           6
	//   67  134:getfield        #284 <Field int Rect.top>
	//   68  137:putfield        #284 <Field int Rect.top>
					if(rect3.right > rect1.right)
	//*  69  140:aload           6
	//*  70  142:getfield        #287 <Field int Rect.right>
	//*  71  145:aload           4
	//*  72  147:getfield        #287 <Field int Rect.right>
	//*  73  150:icmple          163
						rect1.right = rect3.right;
	//   74  153:aload           4
	//   75  155:aload           6
	//   76  157:getfield        #287 <Field int Rect.right>
	//   77  160:putfield        #287 <Field int Rect.right>
					rect2 = rect1;
	//   78  163:aload           4
	//   79  165:astore          5
					if(rect3.bottom > rect1.bottom)
	//*  80  167:aload           6
	//*  81  169:getfield        #290 <Field int Rect.bottom>
	//*  82  172:aload           4
	//*  83  174:getfield        #290 <Field int Rect.bottom>
	//*  84  177:icmple          194
					{
						rect1.bottom = rect3.bottom;
	//   85  180:aload           4
	//   86  182:aload           6
	//   87  184:getfield        #290 <Field int Rect.bottom>
	//   88  187:putfield        #290 <Field int Rect.bottom>
						rect2 = rect1;
	//   89  190:aload           4
	//   90  192:astore          5
					}
				}
				i++;
	//   91  194:iload_1         
	//   92  195:iconst_1        
	//   93  196:iadd            
	//   94  197:istore_1        
				rect = rect2;
	//   95  198:aload           5
	//   96  200:astore_3        
			}

	//*  97  201:goto            54
			mCheckedPadding = true;
	//   98  204:aload_0         
	//   99  205:iconst_1        
	//  100  206:putfield        #106 <Field boolean mCheckedPadding>
			mConstantPadding = rect;
	//  101  209:aload_0         
	//  102  210:aload_3         
	//  103  211:putfield        #110 <Field Rect mConstantPadding>
			return rect;
	//  104  214:aload_3         
	//  105  215:areturn         
		} else
		{
			return mConstantPadding;
	//  106  216:aload_0         
	//  107  217:getfield        #110 <Field Rect mConstantPadding>
	//  108  220:areturn         
		}
	}

	public final int getConstantWidth()
	{
		if(!mCheckedConstantSize)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean mCheckedConstantSize>
	//*   2    4:ifne            11
			computeConstantSize();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #266 <Method void computeConstantSize()>
		return mConstantWidth;
	//    5   11:aload_0         
	//    6   12:getfield        #117 <Field int mConstantWidth>
	//    7   15:ireturn         
	}

	public final int getOpacity()
	{
		if(mCheckedOpacity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field boolean mCheckedOpacity>
	//*   2    4:ifeq            12
			return mOpacity;
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field int mOpacity>
	//    5   11:ireturn         
		createAllFutures();
	//    6   12:aload_0         
	//    7   13:invokespecial   #218 <Method void createAllFutures()>
		int l = mNumChildren;
	//    8   16:aload_0         
	//    9   17:getfield        #137 <Field int mNumChildren>
	//   10   20:istore          4
		Drawable adrawable[] = mDrawables;
	//   11   22:aload_0         
	//   12   23:getfield        #133 <Field Drawable[] mDrawables>
	//   13   26:astore          5
		int i;
		if(l > 0)
	//*  14   28:iload           4
	//*  15   30:ifle            44
			i = adrawable[0].getOpacity();
	//   16   33:aload           5
	//   17   35:iconst_0        
	//   18   36:aaload          
	//   19   37:invokevirtual   #294 <Method int Drawable.getOpacity()>
	//   20   40:istore_1        
		else
	//*  21   41:goto            47
			i = -2;
	//   22   44:bipush          -2
	//   23   46:istore_1        
		boolean flag = true;
	//   24   47:iconst_1        
	//   25   48:istore_3        
		int k = i;
	//   26   49:iload_1         
	//   27   50:istore_2        
		for(int j = ((int) (flag)); j < l; j++)
	//*  28   51:iload_3         
	//*  29   52:istore_1        
	//*  30   53:iload_1         
	//*  31   54:iload           4
	//*  32   56:icmpge          78
			k = Drawable.resolveOpacity(k, adrawable[j].getOpacity());
	//   33   59:iload_2         
	//   34   60:aload           5
	//   35   62:iload_1         
	//   36   63:aaload          
	//   37   64:invokevirtual   #294 <Method int Drawable.getOpacity()>
	//   38   67:invokestatic    #298 <Method int Drawable.resolveOpacity(int, int)>
	//   39   70:istore_2        

	//   40   71:iload_1         
	//   41   72:iconst_1        
	//   42   73:iadd            
	//   43   74:istore_1        
	//*  44   75:goto            53
		mOpacity = k;
	//   45   78:aload_0         
	//   46   79:iload_2         
	//   47   80:putfield        #127 <Field int mOpacity>
		mCheckedOpacity = true;
	//   48   83:aload_0         
	//   49   84:iconst_1        
	//   50   85:putfield        #125 <Field boolean mCheckedOpacity>
		return k;
	//   51   88:iload_2         
	//   52   89:ireturn         
	}

	public void growArray(int i, int j)
	{
		Drawable adrawable[] = new Drawable[j];
	//    0    0:iload_2         
	//    1    1:anewarray       Drawable[]
	//    2    4:astore_3        
		System.arraycopy(((Object) (mDrawables)), 0, ((Object) (adrawable)), 0, i);
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field Drawable[] mDrawables>
	//    5    9:iconst_0        
	//    6   10:aload_3         
	//    7   11:iconst_0        
	//    8   12:iload_1         
	//    9   13:invokestatic    #304 <Method void System.arraycopy(Object, int, Object, int, int)>
		mDrawables = adrawable;
	//   10   16:aload_0         
	//   11   17:aload_3         
	//   12   18:putfield        #133 <Field Drawable[] mDrawables>
	//   13   21:return          
	}

	void invalidateCache()
	{
		mCheckedOpacity = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #125 <Field boolean mCheckedOpacity>
		mCheckedStateful = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #129 <Field boolean mCheckedStateful>
	//    6   10:return          
	}

	public final boolean isConstantSize()
	{
		return mConstantSize;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mConstantSize>
	//    2    4:ireturn         
	}

	public final boolean isStateful()
	{
		if(mCheckedStateful)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean mCheckedStateful>
	//*   2    4:ifeq            12
			return mStateful;
	//    3    7:aload_0         
	//    4    8:getfield        #131 <Field boolean mStateful>
	//    5   11:ireturn         
		createAllFutures();
	//    6   12:aload_0         
	//    7   13:invokespecial   #218 <Method void createAllFutures()>
		int j = mNumChildren;
	//    8   16:aload_0         
	//    9   17:getfield        #137 <Field int mNumChildren>
	//   10   20:istore_2        
		Drawable adrawable[] = mDrawables;
	//   11   21:aload_0         
	//   12   22:getfield        #133 <Field Drawable[] mDrawables>
	//   13   25:astore          5
		boolean flag1 = false;
	//   14   27:iconst_0        
	//   15   28:istore          4
		int i = 0;
	//   16   30:iconst_0        
	//   17   31:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//   18   32:iload           4
	//   19   34:istore_3        
			if(i >= j)
				break;
	//   20   35:iload_1         
	//   21   36:iload_2         
	//   22   37:icmpge          62
			if(adrawable[i].isStateful())
	//*  23   40:aload           5
	//*  24   42:iload_1         
	//*  25   43:aaload          
	//*  26   44:invokevirtual   #308 <Method boolean Drawable.isStateful()>
	//*  27   47:ifeq            55
			{
				flag = true;
	//   28   50:iconst_1        
	//   29   51:istore_3        
				break;
	//   30   52:goto            62
			}
			i++;
	//   31   55:iload_1         
	//   32   56:iconst_1        
	//   33   57:iadd            
	//   34   58:istore_1        
		} while(true);
	//   35   59:goto            32
		mStateful = flag;
	//   36   62:aload_0         
	//   37   63:iload_3         
	//   38   64:putfield        #131 <Field boolean mStateful>
		mCheckedStateful = true;
	//   39   67:aload_0         
	//   40   68:iconst_1        
	//   41   69:putfield        #129 <Field boolean mCheckedStateful>
		return flag;
	//   42   72:iload_3         
	//   43   73:ireturn         
	}

	void mutate()
	{
		int j = mNumChildren;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int mNumChildren>
	//    2    4:istore_2        
		Drawable adrawable[] = mDrawables;
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field Drawable[] mDrawables>
	//    5    9:astore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:iload_2         
	//*  10   14:icmpge          37
			if(adrawable[i] != null)
	//*  11   17:aload_3         
	//*  12   18:iload_1         
	//*  13   19:aaload          
	//*  14   20:ifnull          30
				adrawable[i].mutate();
	//   15   23:aload_3         
	//   16   24:iload_1         
	//   17   25:aaload          
	//   18   26:invokevirtual   #191 <Method Drawable Drawable.mutate()>
	//   19   29:pop             

	//   20   30:iload_1         
	//   21   31:iconst_1        
	//   22   32:iadd            
	//   23   33:istore_1        
	//*  24   34:goto            12
		mMutated = true;
	//   25   37:aload_0         
	//   26   38:iconst_1        
	//   27   39:putfield        #88  <Field boolean mMutated>
	//   28   42:return          
	}

	public final void setConstantSize(boolean flag)
	{
		mConstantSize = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #64  <Field boolean mConstantSize>
	//    3    5:return          
	}

	public final void setEnterFadeDuration(int i)
	{
		mEnterFadeDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field int mEnterFadeDuration>
	//    3    5:return          
	}

	public final void setExitFadeDuration(int i)
	{
		mExitFadeDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int mExitFadeDuration>
	//    3    5:return          
	}

	final boolean setLayoutDirection(int i, int j)
	{
		int l = mNumChildren;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int mNumChildren>
	//    2    4:istore          4
		Drawable adrawable[] = mDrawables;
	//    3    6:aload_0         
	//    4    7:getfield        #133 <Field Drawable[] mDrawables>
	//    5   10:astore          8
		int k = 0;
	//    6   12:iconst_0        
	//    7   13:istore_3        
		boolean flag1;
		boolean flag2;
		for(flag1 = false; k < l; flag1 = flag2)
	//*   8   14:iconst_0        
	//*   9   15:istore          6
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          82
		{
			flag2 = flag1;
	//   13   23:iload           6
	//   14   25:istore          7
			if(adrawable[k] != null)
	//*  15   27:aload           8
	//*  16   29:iload_3         
	//*  17   30:aaload          
	//*  18   31:ifnull          71
			{
				boolean flag;
				if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  19   34:getstatic       #183 <Field int android.os.Build$VERSION.SDK_INT>
	//*  20   37:bipush          23
	//*  21   39:icmplt          55
					flag = adrawable[k].setLayoutDirection(i);
	//   22   42:aload           8
	//   23   44:iload_3         
	//   24   45:aaload          
	//   25   46:iload_1         
	//   26   47:invokevirtual   #187 <Method boolean Drawable.setLayoutDirection(int)>
	//   27   50:istore          5
				else
	//*  28   52:goto            58
					flag = false;
	//   29   55:iconst_0        
	//   30   56:istore          5
				flag2 = flag1;
	//   31   58:iload           6
	//   32   60:istore          7
				if(k == j)
	//*  33   62:iload_3         
	//*  34   63:iload_2         
	//*  35   64:icmpne          71
					flag2 = flag;
	//   36   67:iload           5
	//   37   69:istore          7
			}
			k++;
	//   38   71:iload_3         
	//   39   72:iconst_1        
	//   40   73:iadd            
	//   41   74:istore_3        
		}

	//   42   75:iload           7
	//   43   77:istore          6
	//*  44   79:goto            17
		mLayoutDirection = i;
	//   45   82:aload_0         
	//   46   83:iload_1         
	//   47   84:putfield        #90  <Field int mLayoutDirection>
		return flag1;
	//   48   87:iload           6
	//   49   89:ireturn         
	}

	public final void setVariablePadding(boolean flag)
	{
		mVariablePadding = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean mVariablePadding>
	//    3    5:return          
	}

	final void updateDensity(Resources resources)
	{
		if(resources != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          43
		{
			mSourceRes = resources;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #74  <Field Resources mSourceRes>
			int i = DrawableContainer.resolveDensity(resources, mDensity);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #60  <Field int mDensity>
	//    8   14:invokestatic    #78  <Method int DrawableContainer.resolveDensity(Resources, int)>
	//    9   17:istore_2        
			int j = mDensity;
	//   10   18:aload_0         
	//   11   19:getfield        #60  <Field int mDensity>
	//   12   22:istore_3        
			mDensity = i;
	//   13   23:aload_0         
	//   14   24:iload_2         
	//   15   25:putfield        #60  <Field int mDensity>
			if(j != i)
	//*  16   28:iload_3         
	//*  17   29:iload_2         
	//*  18   30:icmpeq          43
			{
				mCheckedConstantSize = false;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #115 <Field boolean mCheckedConstantSize>
				mCheckedPadding = false;
	//   22   38:aload_0         
	//   23   39:iconst_0        
	//   24   40:putfield        #106 <Field boolean mCheckedPadding>
			}
		}
	//   25   43:return          
	}

	boolean mAutoMirrored;
	boolean mCanConstantState;
	int mChangingConfigurations;
	boolean mCheckedConstantSize;
	boolean mCheckedConstantState;
	boolean mCheckedOpacity;
	boolean mCheckedPadding;
	boolean mCheckedStateful;
	int mChildrenChangingConfigurations;
	ColorFilter mColorFilter;
	int mConstantHeight;
	int mConstantMinimumHeight;
	int mConstantMinimumWidth;
	Rect mConstantPadding;
	boolean mConstantSize;
	int mConstantWidth;
	int mDensity;
	boolean mDither;
	SparseArray mDrawableFutures;
	Drawable mDrawables[];
	int mEnterFadeDuration;
	int mExitFadeDuration;
	boolean mHasColorFilter;
	boolean mHasTintList;
	boolean mHasTintMode;
	int mLayoutDirection;
	boolean mMutated;
	int mNumChildren;
	int mOpacity;
	final DrawableContainer mOwner;
	Resources mSourceRes;
	boolean mStateful;
	ColorStateList mTintList;
	android.graphics.PorterDuff.Mode mTintMode;
	boolean mVariablePadding;

	DrawableContainer$DrawableContainerState(DrawableContainer$DrawableContainerState drawablecontainer$drawablecontainerstate, DrawableContainer drawablecontainer, Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void android.graphics.drawable.Drawable$ConstantState()>
		mDensity = 160;
	//    2    4:aload_0         
	//    3    5:sipush          160
	//    4    8:putfield        #60  <Field int mDensity>
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore          5
		mVariablePadding = false;
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:putfield        #62  <Field boolean mVariablePadding>
		mConstantSize = false;
	//   10   19:aload_0         
	//   11   20:iconst_0        
	//   12   21:putfield        #64  <Field boolean mConstantSize>
		mDither = true;
	//   13   24:aload_0         
	//   14   25:iconst_1        
	//   15   26:putfield        #66  <Field boolean mDither>
		mEnterFadeDuration = 0;
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:putfield        #68  <Field int mEnterFadeDuration>
		mExitFadeDuration = 0;
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:putfield        #70  <Field int mExitFadeDuration>
		mOwner = drawablecontainer;
	//   22   39:aload_0         
	//   23   40:aload_2         
	//   24   41:putfield        #72  <Field DrawableContainer mOwner>
		if(resources != null)
	//*  25   44:aload_3         
	//*  26   45:ifnull          53
			drawablecontainer = ((DrawableContainer) (resources));
	//   27   48:aload_3         
	//   28   49:astore_2        
		else
	//*  29   50:goto            67
		if(drawablecontainer$drawablecontainerstate != null)
	//*  30   53:aload_1         
	//*  31   54:ifnull          65
			drawablecontainer = ((DrawableContainer) (drawablecontainer$drawablecontainerstate.mSourceRes));
	//   32   57:aload_1         
	//   33   58:getfield        #74  <Field Resources mSourceRes>
	//   34   61:astore_2        
		else
	//*  35   62:goto            67
			drawablecontainer = null;
	//   36   65:aconst_null     
	//   37   66:astore_2        
		mSourceRes = ((Resources) (drawablecontainer));
	//   38   67:aload_0         
	//   39   68:aload_2         
	//   40   69:putfield        #74  <Field Resources mSourceRes>
		int i;
		if(drawablecontainer$drawablecontainerstate != null)
	//*  41   72:aload_1         
	//*  42   73:ifnull          85
			i = drawablecontainer$drawablecontainerstate.mDensity;
	//   43   76:aload_1         
	//   44   77:getfield        #60  <Field int mDensity>
	//   45   80:istore          4
		else
	//*  46   82:goto            88
			i = 0;
	//   47   85:iconst_0        
	//   48   86:istore          4
		mDensity = DrawableContainer.resolveDensity(resources, i);
	//   49   88:aload_0         
	//   50   89:aload_3         
	//   51   90:iload           4
	//   52   92:invokestatic    #78  <Method int DrawableContainer.resolveDensity(Resources, int)>
	//   53   95:putfield        #60  <Field int mDensity>
		if(drawablecontainer$drawablecontainerstate != null)
	//*  54   98:aload_1         
	//*  55   99:ifnull          488
		{
			mChangingConfigurations = drawablecontainer$drawablecontainerstate.mChangingConfigurations;
	//   56  102:aload_0         
	//   57  103:aload_1         
	//   58  104:getfield        #80  <Field int mChangingConfigurations>
	//   59  107:putfield        #80  <Field int mChangingConfigurations>
			mChildrenChangingConfigurations = drawablecontainer$drawablecontainerstate.mChildrenChangingConfigurations;
	//   60  110:aload_0         
	//   61  111:aload_1         
	//   62  112:getfield        #82  <Field int mChildrenChangingConfigurations>
	//   63  115:putfield        #82  <Field int mChildrenChangingConfigurations>
			mCheckedConstantState = true;
	//   64  118:aload_0         
	//   65  119:iconst_1        
	//   66  120:putfield        #84  <Field boolean mCheckedConstantState>
			mCanConstantState = true;
	//   67  123:aload_0         
	//   68  124:iconst_1        
	//   69  125:putfield        #86  <Field boolean mCanConstantState>
			mVariablePadding = drawablecontainer$drawablecontainerstate.mVariablePadding;
	//   70  128:aload_0         
	//   71  129:aload_1         
	//   72  130:getfield        #62  <Field boolean mVariablePadding>
	//   73  133:putfield        #62  <Field boolean mVariablePadding>
			mConstantSize = drawablecontainer$drawablecontainerstate.mConstantSize;
	//   74  136:aload_0         
	//   75  137:aload_1         
	//   76  138:getfield        #64  <Field boolean mConstantSize>
	//   77  141:putfield        #64  <Field boolean mConstantSize>
			mDither = drawablecontainer$drawablecontainerstate.mDither;
	//   78  144:aload_0         
	//   79  145:aload_1         
	//   80  146:getfield        #66  <Field boolean mDither>
	//   81  149:putfield        #66  <Field boolean mDither>
			mMutated = drawablecontainer$drawablecontainerstate.mMutated;
	//   82  152:aload_0         
	//   83  153:aload_1         
	//   84  154:getfield        #88  <Field boolean mMutated>
	//   85  157:putfield        #88  <Field boolean mMutated>
			mLayoutDirection = drawablecontainer$drawablecontainerstate.mLayoutDirection;
	//   86  160:aload_0         
	//   87  161:aload_1         
	//   88  162:getfield        #90  <Field int mLayoutDirection>
	//   89  165:putfield        #90  <Field int mLayoutDirection>
			mEnterFadeDuration = drawablecontainer$drawablecontainerstate.mEnterFadeDuration;
	//   90  168:aload_0         
	//   91  169:aload_1         
	//   92  170:getfield        #68  <Field int mEnterFadeDuration>
	//   93  173:putfield        #68  <Field int mEnterFadeDuration>
			mExitFadeDuration = drawablecontainer$drawablecontainerstate.mExitFadeDuration;
	//   94  176:aload_0         
	//   95  177:aload_1         
	//   96  178:getfield        #70  <Field int mExitFadeDuration>
	//   97  181:putfield        #70  <Field int mExitFadeDuration>
			mAutoMirrored = drawablecontainer$drawablecontainerstate.mAutoMirrored;
	//   98  184:aload_0         
	//   99  185:aload_1         
	//  100  186:getfield        #92  <Field boolean mAutoMirrored>
	//  101  189:putfield        #92  <Field boolean mAutoMirrored>
			mColorFilter = drawablecontainer$drawablecontainerstate.mColorFilter;
	//  102  192:aload_0         
	//  103  193:aload_1         
	//  104  194:getfield        #94  <Field ColorFilter mColorFilter>
	//  105  197:putfield        #94  <Field ColorFilter mColorFilter>
			mHasColorFilter = drawablecontainer$drawablecontainerstate.mHasColorFilter;
	//  106  200:aload_0         
	//  107  201:aload_1         
	//  108  202:getfield        #96  <Field boolean mHasColorFilter>
	//  109  205:putfield        #96  <Field boolean mHasColorFilter>
			mTintList = drawablecontainer$drawablecontainerstate.mTintList;
	//  110  208:aload_0         
	//  111  209:aload_1         
	//  112  210:getfield        #98  <Field ColorStateList mTintList>
	//  113  213:putfield        #98  <Field ColorStateList mTintList>
			mTintMode = drawablecontainer$drawablecontainerstate.mTintMode;
	//  114  216:aload_0         
	//  115  217:aload_1         
	//  116  218:getfield        #100 <Field android.graphics.PorterDuff$Mode mTintMode>
	//  117  221:putfield        #100 <Field android.graphics.PorterDuff$Mode mTintMode>
			mHasTintList = drawablecontainer$drawablecontainerstate.mHasTintList;
	//  118  224:aload_0         
	//  119  225:aload_1         
	//  120  226:getfield        #102 <Field boolean mHasTintList>
	//  121  229:putfield        #102 <Field boolean mHasTintList>
			mHasTintMode = drawablecontainer$drawablecontainerstate.mHasTintMode;
	//  122  232:aload_0         
	//  123  233:aload_1         
	//  124  234:getfield        #104 <Field boolean mHasTintMode>
	//  125  237:putfield        #104 <Field boolean mHasTintMode>
			if(drawablecontainer$drawablecontainerstate.mDensity == mDensity)
	//* 126  240:aload_1         
	//* 127  241:getfield        #60  <Field int mDensity>
	//* 128  244:aload_0         
	//* 129  245:getfield        #60  <Field int mDensity>
	//* 130  248:icmpne          322
			{
				if(drawablecontainer$drawablecontainerstate.mCheckedPadding)
	//* 131  251:aload_1         
	//* 132  252:getfield        #106 <Field boolean mCheckedPadding>
	//* 133  255:ifeq            278
				{
					mConstantPadding = new Rect(drawablecontainer$drawablecontainerstate.mConstantPadding);
	//  134  258:aload_0         
	//  135  259:new             #108 <Class Rect>
	//  136  262:dup             
	//  137  263:aload_1         
	//  138  264:getfield        #110 <Field Rect mConstantPadding>
	//  139  267:invokespecial   #113 <Method void Rect(Rect)>
	//  140  270:putfield        #110 <Field Rect mConstantPadding>
					mCheckedPadding = true;
	//  141  273:aload_0         
	//  142  274:iconst_1        
	//  143  275:putfield        #106 <Field boolean mCheckedPadding>
				}
				if(drawablecontainer$drawablecontainerstate.mCheckedConstantSize)
	//* 144  278:aload_1         
	//* 145  279:getfield        #115 <Field boolean mCheckedConstantSize>
	//* 146  282:ifeq            322
				{
					mConstantWidth = drawablecontainer$drawablecontainerstate.mConstantWidth;
	//  147  285:aload_0         
	//  148  286:aload_1         
	//  149  287:getfield        #117 <Field int mConstantWidth>
	//  150  290:putfield        #117 <Field int mConstantWidth>
					mConstantHeight = drawablecontainer$drawablecontainerstate.mConstantHeight;
	//  151  293:aload_0         
	//  152  294:aload_1         
	//  153  295:getfield        #119 <Field int mConstantHeight>
	//  154  298:putfield        #119 <Field int mConstantHeight>
					mConstantMinimumWidth = drawablecontainer$drawablecontainerstate.mConstantMinimumWidth;
	//  155  301:aload_0         
	//  156  302:aload_1         
	//  157  303:getfield        #121 <Field int mConstantMinimumWidth>
	//  158  306:putfield        #121 <Field int mConstantMinimumWidth>
					mConstantMinimumHeight = drawablecontainer$drawablecontainerstate.mConstantMinimumHeight;
	//  159  309:aload_0         
	//  160  310:aload_1         
	//  161  311:getfield        #123 <Field int mConstantMinimumHeight>
	//  162  314:putfield        #123 <Field int mConstantMinimumHeight>
					mCheckedConstantSize = true;
	//  163  317:aload_0         
	//  164  318:iconst_1        
	//  165  319:putfield        #115 <Field boolean mCheckedConstantSize>
				}
			}
			if(drawablecontainer$drawablecontainerstate.mCheckedOpacity)
	//* 166  322:aload_1         
	//* 167  323:getfield        #125 <Field boolean mCheckedOpacity>
	//* 168  326:ifeq            342
			{
				mOpacity = drawablecontainer$drawablecontainerstate.mOpacity;
	//  169  329:aload_0         
	//  170  330:aload_1         
	//  171  331:getfield        #127 <Field int mOpacity>
	//  172  334:putfield        #127 <Field int mOpacity>
				mCheckedOpacity = true;
	//  173  337:aload_0         
	//  174  338:iconst_1        
	//  175  339:putfield        #125 <Field boolean mCheckedOpacity>
			}
			if(drawablecontainer$drawablecontainerstate.mCheckedStateful)
	//* 176  342:aload_1         
	//* 177  343:getfield        #129 <Field boolean mCheckedStateful>
	//* 178  346:ifeq            362
			{
				mStateful = drawablecontainer$drawablecontainerstate.mStateful;
	//  179  349:aload_0         
	//  180  350:aload_1         
	//  181  351:getfield        #131 <Field boolean mStateful>
	//  182  354:putfield        #131 <Field boolean mStateful>
				mCheckedStateful = true;
	//  183  357:aload_0         
	//  184  358:iconst_1        
	//  185  359:putfield        #129 <Field boolean mCheckedStateful>
			}
			drawablecontainer = ((DrawableContainer) (drawablecontainer$drawablecontainerstate.mDrawables));
	//  186  362:aload_1         
	//  187  363:getfield        #133 <Field Drawable[] mDrawables>
	//  188  366:astore_2        
			mDrawables = new Drawable[drawablecontainer.length];
	//  189  367:aload_0         
	//  190  368:aload_2         
	//  191  369:arraylength     
	//  192  370:anewarray       Drawable[]
	//  193  373:putfield        #133 <Field Drawable[] mDrawables>
			mNumChildren = drawablecontainer$drawablecontainerstate.mNumChildren;
	//  194  376:aload_0         
	//  195  377:aload_1         
	//  196  378:getfield        #137 <Field int mNumChildren>
	//  197  381:putfield        #137 <Field int mNumChildren>
			drawablecontainer$drawablecontainerstate = ((DrawableContainer$DrawableContainerState) (drawablecontainer$drawablecontainerstate.mDrawableFutures));
	//  198  384:aload_1         
	//  199  385:getfield        #139 <Field SparseArray mDrawableFutures>
	//  200  388:astore_1        
			if(drawablecontainer$drawablecontainerstate != null)
	//* 201  389:aload_1         
	//* 202  390:ifnull          404
				mDrawableFutures = ((SparseArray) (drawablecontainer$drawablecontainerstate)).clone();
	//  203  393:aload_0         
	//  204  394:aload_1         
	//  205  395:invokevirtual   #145 <Method SparseArray SparseArray.clone()>
	//  206  398:putfield        #139 <Field SparseArray mDrawableFutures>
			else
	//* 207  401:goto            419
				mDrawableFutures = new SparseArray(mNumChildren);
	//  208  404:aload_0         
	//  209  405:new             #141 <Class SparseArray>
	//  210  408:dup             
	//  211  409:aload_0         
	//  212  410:getfield        #137 <Field int mNumChildren>
	//  213  413:invokespecial   #148 <Method void SparseArray(int)>
	//  214  416:putfield        #139 <Field SparseArray mDrawableFutures>
			int k = mNumChildren;
	//  215  419:aload_0         
	//  216  420:getfield        #137 <Field int mNumChildren>
	//  217  423:istore          6
			for(int j = ((int) (flag)); j < k; j++)
	//* 218  425:iload           5
	//* 219  427:istore          4
	//* 220  429:iload           4
	//* 221  431:iload           6
	//* 222  433:icmpge          502
				if(drawablecontainer[j] != null)
	//* 223  436:aload_2         
	//* 224  437:iload           4
	//* 225  439:aaload          
	//* 226  440:ifnull          479
				{
					drawablecontainer$drawablecontainerstate = ((DrawableContainer$DrawableContainerState) (((Drawable) (drawablecontainer[j])).getConstantState()));
	//  227  443:aload_2         
	//  228  444:iload           4
	//  229  446:aaload          
	//  230  447:invokevirtual   #152 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
	//  231  450:astore_1        
					if(drawablecontainer$drawablecontainerstate != null)
	//* 232  451:aload_1         
	//* 233  452:ifnull          468
						mDrawableFutures.put(j, ((Object) (drawablecontainer$drawablecontainerstate)));
	//  234  455:aload_0         
	//  235  456:getfield        #139 <Field SparseArray mDrawableFutures>
	//  236  459:iload           4
	//  237  461:aload_1         
	//  238  462:invokevirtual   #156 <Method void SparseArray.put(int, Object)>
					else
	//* 239  465:goto            479
						mDrawables[j] = ((Drawable) (drawablecontainer[j]));
	//  240  468:aload_0         
	//  241  469:getfield        #133 <Field Drawable[] mDrawables>
	//  242  472:iload           4
	//  243  474:aload_2         
	//  244  475:iload           4
	//  245  477:aaload          
	//  246  478:aastore         
				}

	//  247  479:iload           4
	//  248  481:iconst_1        
	//  249  482:iadd            
	//  250  483:istore          4
		} else
	//* 251  485:goto            429
		{
			mDrawables = new Drawable[10];
	//  252  488:aload_0         
	//  253  489:bipush          10
	//  254  491:anewarray       Drawable[]
	//  255  494:putfield        #133 <Field Drawable[] mDrawables>
			mNumChildren = 0;
	//  256  497:aload_0         
	//  257  498:iconst_0        
	//  258  499:putfield        #137 <Field int mNumChildren>
		}
	//  259  502:return          
	}
}
