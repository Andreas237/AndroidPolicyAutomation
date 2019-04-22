// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.DisplayMetrics;
import android.util.SparseArray;

class DrawableContainer extends Drawable
	implements android.graphics.drawable.Drawable.Callback
{
	static class BlockInvalidateCallback
		implements android.graphics.drawable.Drawable.Callback
	{

		public void invalidateDrawable(Drawable drawable)
		{
		//    0    0:return          
		}

		public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
		{
			android.graphics.drawable.Drawable.Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
		//    2    4:astore          5
			if(callback != null)
		//*   3    6:aload           5
		//*   4    8:ifnull          21
				callback.scheduleDrawable(drawable, runnable, l);
		//    5   11:aload           5
		//    6   13:aload_1         
		//    7   14:aload_2         
		//    8   15:lload_3         
		//    9   16:invokeinterface #26  <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
		//   10   21:return          
		}

		public void unscheduleDrawable(Drawable drawable, Runnable runnable)
		{
			android.graphics.drawable.Drawable.Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
		//    2    4:astore_3        
			if(callback != null)
		//*   3    5:aload_3         
		//*   4    6:ifnull          17
				callback.unscheduleDrawable(drawable, runnable);
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:aload_2         
		//    8   12:invokeinterface #30  <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
		//    9   17:return          
		}

		public android.graphics.drawable.Drawable.Callback unwrap()
		{
			android.graphics.drawable.Drawable.Callback callback = mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
		//    2    4:astore_1        
			mCallback = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
			return callback;
		//    6   10:aload_1         
		//    7   11:areturn         
		}

		public BlockInvalidateCallback wrap(android.graphics.drawable.Drawable.Callback callback)
		{
			mCallback = callback;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field android.graphics.drawable.Drawable$Callback mCallback>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private android.graphics.drawable.Drawable.Callback mCallback;

		BlockInvalidateCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	static abstract class DrawableContainerState extends android.graphics.drawable.Drawable.ConstantState
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

		DrawableContainerState(DrawableContainerState drawablecontainerstate, DrawableContainer drawablecontainer, Resources resources)
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
			if(drawablecontainerstate != null)
		//*  30   53:aload_1         
		//*  31   54:ifnull          65
				drawablecontainer = ((DrawableContainer) (drawablecontainerstate.mSourceRes));
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
			if(drawablecontainerstate != null)
		//*  41   72:aload_1         
		//*  42   73:ifnull          85
				i = drawablecontainerstate.mDensity;
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
			if(drawablecontainerstate != null)
		//*  54   98:aload_1         
		//*  55   99:ifnull          488
			{
				mChangingConfigurations = drawablecontainerstate.mChangingConfigurations;
		//   56  102:aload_0         
		//   57  103:aload_1         
		//   58  104:getfield        #80  <Field int mChangingConfigurations>
		//   59  107:putfield        #80  <Field int mChangingConfigurations>
				mChildrenChangingConfigurations = drawablecontainerstate.mChildrenChangingConfigurations;
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
				mVariablePadding = drawablecontainerstate.mVariablePadding;
		//   70  128:aload_0         
		//   71  129:aload_1         
		//   72  130:getfield        #62  <Field boolean mVariablePadding>
		//   73  133:putfield        #62  <Field boolean mVariablePadding>
				mConstantSize = drawablecontainerstate.mConstantSize;
		//   74  136:aload_0         
		//   75  137:aload_1         
		//   76  138:getfield        #64  <Field boolean mConstantSize>
		//   77  141:putfield        #64  <Field boolean mConstantSize>
				mDither = drawablecontainerstate.mDither;
		//   78  144:aload_0         
		//   79  145:aload_1         
		//   80  146:getfield        #66  <Field boolean mDither>
		//   81  149:putfield        #66  <Field boolean mDither>
				mMutated = drawablecontainerstate.mMutated;
		//   82  152:aload_0         
		//   83  153:aload_1         
		//   84  154:getfield        #88  <Field boolean mMutated>
		//   85  157:putfield        #88  <Field boolean mMutated>
				mLayoutDirection = drawablecontainerstate.mLayoutDirection;
		//   86  160:aload_0         
		//   87  161:aload_1         
		//   88  162:getfield        #90  <Field int mLayoutDirection>
		//   89  165:putfield        #90  <Field int mLayoutDirection>
				mEnterFadeDuration = drawablecontainerstate.mEnterFadeDuration;
		//   90  168:aload_0         
		//   91  169:aload_1         
		//   92  170:getfield        #68  <Field int mEnterFadeDuration>
		//   93  173:putfield        #68  <Field int mEnterFadeDuration>
				mExitFadeDuration = drawablecontainerstate.mExitFadeDuration;
		//   94  176:aload_0         
		//   95  177:aload_1         
		//   96  178:getfield        #70  <Field int mExitFadeDuration>
		//   97  181:putfield        #70  <Field int mExitFadeDuration>
				mAutoMirrored = drawablecontainerstate.mAutoMirrored;
		//   98  184:aload_0         
		//   99  185:aload_1         
		//  100  186:getfield        #92  <Field boolean mAutoMirrored>
		//  101  189:putfield        #92  <Field boolean mAutoMirrored>
				mColorFilter = drawablecontainerstate.mColorFilter;
		//  102  192:aload_0         
		//  103  193:aload_1         
		//  104  194:getfield        #94  <Field ColorFilter mColorFilter>
		//  105  197:putfield        #94  <Field ColorFilter mColorFilter>
				mHasColorFilter = drawablecontainerstate.mHasColorFilter;
		//  106  200:aload_0         
		//  107  201:aload_1         
		//  108  202:getfield        #96  <Field boolean mHasColorFilter>
		//  109  205:putfield        #96  <Field boolean mHasColorFilter>
				mTintList = drawablecontainerstate.mTintList;
		//  110  208:aload_0         
		//  111  209:aload_1         
		//  112  210:getfield        #98  <Field ColorStateList mTintList>
		//  113  213:putfield        #98  <Field ColorStateList mTintList>
				mTintMode = drawablecontainerstate.mTintMode;
		//  114  216:aload_0         
		//  115  217:aload_1         
		//  116  218:getfield        #100 <Field android.graphics.PorterDuff$Mode mTintMode>
		//  117  221:putfield        #100 <Field android.graphics.PorterDuff$Mode mTintMode>
				mHasTintList = drawablecontainerstate.mHasTintList;
		//  118  224:aload_0         
		//  119  225:aload_1         
		//  120  226:getfield        #102 <Field boolean mHasTintList>
		//  121  229:putfield        #102 <Field boolean mHasTintList>
				mHasTintMode = drawablecontainerstate.mHasTintMode;
		//  122  232:aload_0         
		//  123  233:aload_1         
		//  124  234:getfield        #104 <Field boolean mHasTintMode>
		//  125  237:putfield        #104 <Field boolean mHasTintMode>
				if(drawablecontainerstate.mDensity == mDensity)
		//* 126  240:aload_1         
		//* 127  241:getfield        #60  <Field int mDensity>
		//* 128  244:aload_0         
		//* 129  245:getfield        #60  <Field int mDensity>
		//* 130  248:icmpne          322
				{
					if(drawablecontainerstate.mCheckedPadding)
		//* 131  251:aload_1         
		//* 132  252:getfield        #106 <Field boolean mCheckedPadding>
		//* 133  255:ifeq            278
					{
						mConstantPadding = new Rect(drawablecontainerstate.mConstantPadding);
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
					if(drawablecontainerstate.mCheckedConstantSize)
		//* 144  278:aload_1         
		//* 145  279:getfield        #115 <Field boolean mCheckedConstantSize>
		//* 146  282:ifeq            322
					{
						mConstantWidth = drawablecontainerstate.mConstantWidth;
		//  147  285:aload_0         
		//  148  286:aload_1         
		//  149  287:getfield        #117 <Field int mConstantWidth>
		//  150  290:putfield        #117 <Field int mConstantWidth>
						mConstantHeight = drawablecontainerstate.mConstantHeight;
		//  151  293:aload_0         
		//  152  294:aload_1         
		//  153  295:getfield        #119 <Field int mConstantHeight>
		//  154  298:putfield        #119 <Field int mConstantHeight>
						mConstantMinimumWidth = drawablecontainerstate.mConstantMinimumWidth;
		//  155  301:aload_0         
		//  156  302:aload_1         
		//  157  303:getfield        #121 <Field int mConstantMinimumWidth>
		//  158  306:putfield        #121 <Field int mConstantMinimumWidth>
						mConstantMinimumHeight = drawablecontainerstate.mConstantMinimumHeight;
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
				if(drawablecontainerstate.mCheckedOpacity)
		//* 166  322:aload_1         
		//* 167  323:getfield        #125 <Field boolean mCheckedOpacity>
		//* 168  326:ifeq            342
				{
					mOpacity = drawablecontainerstate.mOpacity;
		//  169  329:aload_0         
		//  170  330:aload_1         
		//  171  331:getfield        #127 <Field int mOpacity>
		//  172  334:putfield        #127 <Field int mOpacity>
					mCheckedOpacity = true;
		//  173  337:aload_0         
		//  174  338:iconst_1        
		//  175  339:putfield        #125 <Field boolean mCheckedOpacity>
				}
				if(drawablecontainerstate.mCheckedStateful)
		//* 176  342:aload_1         
		//* 177  343:getfield        #129 <Field boolean mCheckedStateful>
		//* 178  346:ifeq            362
				{
					mStateful = drawablecontainerstate.mStateful;
		//  179  349:aload_0         
		//  180  350:aload_1         
		//  181  351:getfield        #131 <Field boolean mStateful>
		//  182  354:putfield        #131 <Field boolean mStateful>
					mCheckedStateful = true;
		//  183  357:aload_0         
		//  184  358:iconst_1        
		//  185  359:putfield        #129 <Field boolean mCheckedStateful>
				}
				drawablecontainer = ((DrawableContainer) (drawablecontainerstate.mDrawables));
		//  186  362:aload_1         
		//  187  363:getfield        #133 <Field Drawable[] mDrawables>
		//  188  366:astore_2        
				mDrawables = new Drawable[drawablecontainer.length];
		//  189  367:aload_0         
		//  190  368:aload_2         
		//  191  369:arraylength     
		//  192  370:anewarray       Drawable[]
		//  193  373:putfield        #133 <Field Drawable[] mDrawables>
				mNumChildren = drawablecontainerstate.mNumChildren;
		//  194  376:aload_0         
		//  195  377:aload_1         
		//  196  378:getfield        #137 <Field int mNumChildren>
		//  197  381:putfield        #137 <Field int mNumChildren>
				drawablecontainerstate = ((DrawableContainerState) (drawablecontainerstate.mDrawableFutures));
		//  198  384:aload_1         
		//  199  385:getfield        #139 <Field SparseArray mDrawableFutures>
		//  200  388:astore_1        
				if(drawablecontainerstate != null)
		//* 201  389:aload_1         
		//* 202  390:ifnull          404
					mDrawableFutures = ((SparseArray) (drawablecontainerstate)).clone();
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
						drawablecontainerstate = ((DrawableContainerState) (((Drawable) (drawablecontainer[j])).getConstantState()));
		//  227  443:aload_2         
		//  228  444:iload           4
		//  229  446:aaload          
		//  230  447:invokevirtual   #152 <Method android.graphics.drawable.Drawable$ConstantState Drawable.getConstantState()>
		//  231  450:astore_1        
						if(drawablecontainerstate != null)
		//* 232  451:aload_1         
		//* 233  452:ifnull          468
							mDrawableFutures.put(j, ((Object) (drawablecontainerstate)));
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


	DrawableContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Drawable()>
		mAlpha = 255;
	//    2    4:aload_0         
	//    3    5:sipush          255
	//    4    8:putfield        #45  <Field int mAlpha>
		mCurIndex = -1;
	//    5   11:aload_0         
	//    6   12:iconst_m1       
	//    7   13:putfield        #47  <Field int mCurIndex>
		mLastIndex = -1;
	//    8   16:aload_0         
	//    9   17:iconst_m1       
	//   10   18:putfield        #49  <Field int mLastIndex>
	//   11   21:return          
	}

	private void initializeDrawableForDisplay(Drawable drawable)
	{
		if(mBlockInvalidateCallback == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field DrawableContainer$BlockInvalidateCallback mBlockInvalidateCallback>
	//*   2    4:ifnonnull       18
			mBlockInvalidateCallback = new BlockInvalidateCallback();
	//    3    7:aload_0         
	//    4    8:new             #10  <Class DrawableContainer$BlockInvalidateCallback>
	//    5   11:dup             
	//    6   12:invokespecial   #55  <Method void DrawableContainer$BlockInvalidateCallback()>
	//    7   15:putfield        #54  <Field DrawableContainer$BlockInvalidateCallback mBlockInvalidateCallback>
		drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (mBlockInvalidateCallback.wrap(drawable.getCallback()))));
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #54  <Field DrawableContainer$BlockInvalidateCallback mBlockInvalidateCallback>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #59  <Method android.graphics.drawable.Drawable$Callback Drawable.getCallback()>
	//   13   27:invokevirtual   #63  <Method DrawableContainer$BlockInvalidateCallback DrawableContainer$BlockInvalidateCallback.wrap(android.graphics.drawable.Drawable$Callback)>
	//   14   30:invokevirtual   #67  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		if(mDrawableContainerState.mEnterFadeDuration <= 0 && mHasAlpha)
	//*  15   33:aload_0         
	//*  16   34:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  17   37:getfield        #72  <Field int DrawableContainer$DrawableContainerState.mEnterFadeDuration>
	//*  18   40:ifgt            58
	//*  19   43:aload_0         
	//*  20   44:getfield        #74  <Field boolean mHasAlpha>
	//*  21   47:ifeq            58
			drawable.setAlpha(mAlpha);
	//   22   50:aload_1         
	//   23   51:aload_0         
	//   24   52:getfield        #45  <Field int mAlpha>
	//   25   55:invokevirtual   #78  <Method void Drawable.setAlpha(int)>
		if(mDrawableContainerState.mHasColorFilter)
	//*  26   58:aload_0         
	//*  27   59:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  28   62:getfield        #81  <Field boolean DrawableContainer$DrawableContainerState.mHasColorFilter>
	//*  29   65:ifeq            82
		{
			drawable.setColorFilter(mDrawableContainerState.mColorFilter);
	//   30   68:aload_1         
	//   31   69:aload_0         
	//   32   70:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   33   73:getfield        #85  <Field ColorFilter DrawableContainer$DrawableContainerState.mColorFilter>
	//   34   76:invokevirtual   #89  <Method void Drawable.setColorFilter(ColorFilter)>
			break MISSING_BLOCK_LABEL_124;
	//   35   79:goto            124
		}
		if(mDrawableContainerState.mHasTintList)
	//*  36   82:aload_0         
	//*  37   83:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  38   86:getfield        #92  <Field boolean DrawableContainer$DrawableContainerState.mHasTintList>
	//*  39   89:ifeq            103
			DrawableCompat.setTintList(drawable, mDrawableContainerState.mTintList);
	//   40   92:aload_1         
	//   41   93:aload_0         
	//   42   94:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   43   97:getfield        #96  <Field ColorStateList DrawableContainer$DrawableContainerState.mTintList>
	//   44  100:invokestatic    #102 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		if(mDrawableContainerState.mHasTintMode)
	//*  45  103:aload_0         
	//*  46  104:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  47  107:getfield        #105 <Field boolean DrawableContainer$DrawableContainerState.mHasTintMode>
	//*  48  110:ifeq            124
			DrawableCompat.setTintMode(drawable, mDrawableContainerState.mTintMode);
	//   49  113:aload_1         
	//   50  114:aload_0         
	//   51  115:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   52  118:getfield        #109 <Field android.graphics.PorterDuff$Mode DrawableContainer$DrawableContainerState.mTintMode>
	//   53  121:invokestatic    #113 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		Rect rect;
		drawable.setVisible(isVisible(), true);
	//   54  124:aload_1         
	//   55  125:aload_0         
	//   56  126:invokevirtual   #117 <Method boolean isVisible()>
	//   57  129:iconst_1        
	//   58  130:invokevirtual   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   59  133:pop             
		drawable.setDither(mDrawableContainerState.mDither);
	//   60  134:aload_1         
	//   61  135:aload_0         
	//   62  136:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   63  139:getfield        #124 <Field boolean DrawableContainer$DrawableContainerState.mDither>
	//   64  142:invokevirtual   #128 <Method void Drawable.setDither(boolean)>
		drawable.setState(getState());
	//   65  145:aload_1         
	//   66  146:aload_0         
	//   67  147:invokevirtual   #132 <Method int[] getState()>
	//   68  150:invokevirtual   #136 <Method boolean Drawable.setState(int[])>
	//   69  153:pop             
		drawable.setLevel(getLevel());
	//   70  154:aload_1         
	//   71  155:aload_0         
	//   72  156:invokevirtual   #140 <Method int getLevel()>
	//   73  159:invokevirtual   #144 <Method boolean Drawable.setLevel(int)>
	//   74  162:pop             
		drawable.setBounds(getBounds());
	//   75  163:aload_1         
	//   76  164:aload_0         
	//   77  165:invokevirtual   #148 <Method Rect getBounds()>
	//   78  168:invokevirtual   #152 <Method void Drawable.setBounds(Rect)>
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  79  171:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*  80  174:bipush          23
	//*  81  176:icmplt          188
			drawable.setLayoutDirection(getLayoutDirection());
	//   82  179:aload_1         
	//   83  180:aload_0         
	//   84  181:invokevirtual   #160 <Method int getLayoutDirection()>
	//   85  184:invokevirtual   #163 <Method boolean Drawable.setLayoutDirection(int)>
	//   86  187:pop             
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  87  188:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*  88  191:bipush          19
	//*  89  193:icmplt          207
			drawable.setAutoMirrored(mDrawableContainerState.mAutoMirrored);
	//   90  196:aload_1         
	//   91  197:aload_0         
	//   92  198:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   93  201:getfield        #166 <Field boolean DrawableContainer$DrawableContainerState.mAutoMirrored>
	//   94  204:invokevirtual   #169 <Method void Drawable.setAutoMirrored(boolean)>
		rect = mHotspotBounds;
	//   95  207:aload_0         
	//   96  208:getfield        #171 <Field Rect mHotspotBounds>
	//   97  211:astore_2        
		if(android.os.Build.VERSION.SDK_INT < 21 || rect == null)
			break MISSING_BLOCK_LABEL_244;
	//   98  212:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//   99  215:bipush          21
	//  100  217:icmplt          244
	//  101  220:aload_2         
	//  102  221:ifnull          244
		drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
	//  103  224:aload_1         
	//  104  225:aload_2         
	//  105  226:getfield        #176 <Field int Rect.left>
	//  106  229:aload_2         
	//  107  230:getfield        #179 <Field int Rect.top>
	//  108  233:aload_2         
	//  109  234:getfield        #182 <Field int Rect.right>
	//  110  237:aload_2         
	//  111  238:getfield        #185 <Field int Rect.bottom>
	//  112  241:invokevirtual   #189 <Method void Drawable.setHotspotBounds(int, int, int, int)>
		drawable.setCallback(mBlockInvalidateCallback.unwrap());
	//  113  244:aload_1         
	//  114  245:aload_0         
	//  115  246:getfield        #54  <Field DrawableContainer$BlockInvalidateCallback mBlockInvalidateCallback>
	//  116  249:invokevirtual   #192 <Method android.graphics.drawable.Drawable$Callback DrawableContainer$BlockInvalidateCallback.unwrap()>
	//  117  252:invokevirtual   #67  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		return;
	//  118  255:return          
		Exception exception;
		exception;
	//  119  256:astore_2        
		drawable.setCallback(mBlockInvalidateCallback.unwrap());
	//  120  257:aload_1         
	//  121  258:aload_0         
	//  122  259:getfield        #54  <Field DrawableContainer$BlockInvalidateCallback mBlockInvalidateCallback>
	//  123  262:invokevirtual   #192 <Method android.graphics.drawable.Drawable$Callback DrawableContainer$BlockInvalidateCallback.unwrap()>
	//  124  265:invokevirtual   #67  <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		throw exception;
	//  125  268:aload_2         
	//  126  269:athrow          
	}

	private boolean needsMirroring()
	{
		return isAutoMirrored() && getLayoutDirection() == 1;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method boolean isAutoMirrored()>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:invokevirtual   #160 <Method int getLayoutDirection()>
	//    5   11:iconst_1        
	//    6   12:icmpne          17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	static int resolveDensity(Resources resources, int i)
	{
		if(resources != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
	//*   2    4:goto            15
			i = resources.getDisplayMetrics().densityDpi;
	//    3    7:aload_0         
	//    4    8:invokevirtual   #210 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    5   11:getfield        #215 <Field int DisplayMetrics.densityDpi>
	//    6   14:istore_1        
		int j = i;
	//    7   15:iload_1         
	//    8   16:istore_2        
		if(i == 0)
	//*   9   17:iload_1         
	//*  10   18:ifne            25
			j = 160;
	//   11   21:sipush          160
	//   12   24:istore_2        
		return j;
	//   13   25:iload_2         
	//   14   26:ireturn         
	}

	void animate(boolean flag)
	{
		int i;
		boolean flag1;
		long l;
label0:
		{
			flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
			mHasAlpha = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #74  <Field boolean mHasAlpha>
			l = SystemClock.uptimeMillis();
	//    5    7:invokestatic    #223 <Method long SystemClock.uptimeMillis()>
	//    6   10:lstore          4
			Drawable drawable = mCurrDrawable;
	//    7   12:aload_0         
	//    8   13:getfield        #225 <Field Drawable mCurrDrawable>
	//    9   16:astore          8
			if(drawable != null)
	//*  10   18:aload           8
	//*  11   20:ifnull          106
			{
				long l1 = mEnterAnimationEnd;
	//   12   23:aload_0         
	//   13   24:getfield        #227 <Field long mEnterAnimationEnd>
	//   14   27:lstore          6
				if(l1 != 0L)
	//*  15   29:lload           6
	//*  16   31:lconst_0        
	//*  17   32:lcmp            
	//*  18   33:ifeq            111
					if(l1 <= l)
	//*  19   36:lload           6
	//*  20   38:lload           4
	//*  21   40:lcmp            
	//*  22   41:ifgt            61
					{
						drawable.setAlpha(mAlpha);
	//   23   44:aload           8
	//   24   46:aload_0         
	//   25   47:getfield        #45  <Field int mAlpha>
	//   26   50:invokevirtual   #78  <Method void Drawable.setAlpha(int)>
						mEnterAnimationEnd = 0L;
	//   27   53:aload_0         
	//   28   54:lconst_0        
	//   29   55:putfield        #227 <Field long mEnterAnimationEnd>
					} else
	//*  30   58:goto            111
					{
						i = (int)((l1 - l) * 255L) / mDrawableContainerState.mEnterFadeDuration;
	//   31   61:lload           6
	//   32   63:lload           4
	//   33   65:lsub            
	//   34   66:ldc2w           #228 <Long 255L>
	//   35   69:lmul            
	//   36   70:l2i             
	//   37   71:aload_0         
	//   38   72:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   39   75:getfield        #72  <Field int DrawableContainer$DrawableContainerState.mEnterFadeDuration>
	//   40   78:idiv            
	//   41   79:istore_2        
						mCurrDrawable.setAlpha(((255 - i) * mAlpha) / 255);
	//   42   80:aload_0         
	//   43   81:getfield        #225 <Field Drawable mCurrDrawable>
	//   44   84:sipush          255
	//   45   87:iload_2         
	//   46   88:isub            
	//   47   89:aload_0         
	//   48   90:getfield        #45  <Field int mAlpha>
	//   49   93:imul            
	//   50   94:sipush          255
	//   51   97:idiv            
	//   52   98:invokevirtual   #78  <Method void Drawable.setAlpha(int)>
						i = 1;
	//   53  101:iconst_1        
	//   54  102:istore_2        
						break label0;
	//   55  103:goto            113
					}
			} else
			{
				mEnterAnimationEnd = 0L;
	//   56  106:aload_0         
	//   57  107:lconst_0        
	//   58  108:putfield        #227 <Field long mEnterAnimationEnd>
			}
			i = 0;
	//   59  111:iconst_0        
	//   60  112:istore_2        
		}
		Drawable drawable1 = mLastDrawable;
	//   61  113:aload_0         
	//   62  114:getfield        #231 <Field Drawable mLastDrawable>
	//   63  117:astore          8
		if(drawable1 != null)
	//*  64  119:aload           8
	//*  65  121:ifnull          212
		{
			long l2 = mExitAnimationEnd;
	//   66  124:aload_0         
	//   67  125:getfield        #233 <Field long mExitAnimationEnd>
	//   68  128:lstore          6
			if(l2 != 0L)
	//*  69  130:lload           6
	//*  70  132:lconst_0        
	//*  71  133:lcmp            
	//*  72  134:ifeq            217
				if(l2 <= l)
	//*  73  137:lload           6
	//*  74  139:lload           4
	//*  75  141:lcmp            
	//*  76  142:ifgt            171
				{
					drawable1.setVisible(false, false);
	//   77  145:aload           8
	//   78  147:iconst_0        
	//   79  148:iconst_0        
	//   80  149:invokevirtual   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   81  152:pop             
					mLastDrawable = null;
	//   82  153:aload_0         
	//   83  154:aconst_null     
	//   84  155:putfield        #231 <Field Drawable mLastDrawable>
					mLastIndex = -1;
	//   85  158:aload_0         
	//   86  159:iconst_m1       
	//   87  160:putfield        #49  <Field int mLastIndex>
					mExitAnimationEnd = 0L;
	//   88  163:aload_0         
	//   89  164:lconst_0        
	//   90  165:putfield        #233 <Field long mExitAnimationEnd>
				} else
	//*  91  168:goto            217
				{
					i = (int)((l2 - l) * 255L) / mDrawableContainerState.mExitFadeDuration;
	//   92  171:lload           6
	//   93  173:lload           4
	//   94  175:lsub            
	//   95  176:ldc2w           #228 <Long 255L>
	//   96  179:lmul            
	//   97  180:l2i             
	//   98  181:aload_0         
	//   99  182:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//  100  185:getfield        #236 <Field int DrawableContainer$DrawableContainerState.mExitFadeDuration>
	//  101  188:idiv            
	//  102  189:istore_2        
					mLastDrawable.setAlpha((i * mAlpha) / 255);
	//  103  190:aload_0         
	//  104  191:getfield        #231 <Field Drawable mLastDrawable>
	//  105  194:iload_2         
	//  106  195:aload_0         
	//  107  196:getfield        #45  <Field int mAlpha>
	//  108  199:imul            
	//  109  200:sipush          255
	//  110  203:idiv            
	//  111  204:invokevirtual   #78  <Method void Drawable.setAlpha(int)>
					i = ((int) (flag1));
	//  112  207:iload_3         
	//  113  208:istore_2        
				}
		} else
	//* 114  209:goto            217
		{
			mExitAnimationEnd = 0L;
	//  115  212:aload_0         
	//  116  213:lconst_0        
	//  117  214:putfield        #233 <Field long mExitAnimationEnd>
		}
		if(flag && i != 0)
	//* 118  217:iload_1         
	//* 119  218:ifeq            239
	//* 120  221:iload_2         
	//* 121  222:ifeq            239
			scheduleSelf(mAnimationRunnable, l + 16L);
	//  122  225:aload_0         
	//  123  226:aload_0         
	//  124  227:getfield        #238 <Field Runnable mAnimationRunnable>
	//  125  230:lload           4
	//  126  232:ldc2w           #239 <Long 16L>
	//  127  235:ladd            
	//  128  236:invokevirtual   #244 <Method void scheduleSelf(Runnable, long)>
	//  129  239:return          
	}

	public void applyTheme(android.content.res.Resources.Theme theme)
	{
		mDrawableContainerState.applyTheme(theme);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #251 <Method void DrawableContainer$DrawableContainerState.applyTheme(android.content.res.Resources$Theme)>
	//    4    8:return          
	}

	public boolean canApplyTheme()
	{
		return mDrawableContainerState.canApplyTheme();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:invokevirtual   #254 <Method boolean DrawableContainer$DrawableContainerState.canApplyTheme()>
	//    3    7:ireturn         
	}

	DrawableContainerState cloneConstantState()
	{
		return mDrawableContainerState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:areturn         
	}

	public void draw(Canvas canvas)
	{
		Drawable drawable = mCurrDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field Drawable mCurrDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable.draw(canvas);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #260 <Method void Drawable.draw(Canvas)>
		drawable = mLastDrawable;
	//    8   14:aload_0         
	//    9   15:getfield        #231 <Field Drawable mLastDrawable>
	//   10   18:astore_2        
		if(drawable != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          28
			drawable.draw(canvas);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #260 <Method void Drawable.draw(Canvas)>
	//   16   28:return          
	}

	public int getAlpha()
	{
		return mAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mAlpha>
	//    2    4:ireturn         
	}

	public int getChangingConfigurations()
	{
		return super.getChangingConfigurations() | mDrawableContainerState.getChangingConfigurations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #264 <Method int Drawable.getChangingConfigurations()>
	//    2    4:aload_0         
	//    3    5:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    4    8:invokevirtual   #265 <Method int DrawableContainer$DrawableContainerState.getChangingConfigurations()>
	//    5   11:ior             
	//    6   12:ireturn         
	}

	public final android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		if(mDrawableContainerState.canConstantState())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:invokevirtual   #270 <Method boolean DrawableContainer$DrawableContainerState.canConstantState()>
	//*   3    7:ifeq            26
		{
			mDrawableContainerState.mChangingConfigurations = getChangingConfigurations();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #271 <Method int getChangingConfigurations()>
	//    8   18:putfield        #274 <Field int DrawableContainer$DrawableContainerState.mChangingConfigurations>
			return ((android.graphics.drawable.Drawable.ConstantState) (mDrawableContainerState));
	//    9   21:aload_0         
	//   10   22:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   11   25:areturn         
		} else
		{
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		}
	}

	public Drawable getCurrent()
	{
		return mCurrDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field Drawable mCurrDrawable>
	//    2    4:areturn         
	}

	int getCurrentIndex()
	{
		return mCurIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int mCurIndex>
	//    2    4:ireturn         
	}

	public void getHotspotBounds(Rect rect)
	{
		Rect rect1 = mHotspotBounds;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field Rect mHotspotBounds>
	//    2    4:astore_2        
		if(rect1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			rect.set(rect1);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #281 <Method void Rect.set(Rect)>
			return;
	//    8   14:return          
		} else
		{
			super.getHotspotBounds(rect);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #283 <Method void Drawable.getHotspotBounds(Rect)>
			return;
	//   12   20:return          
		}
	}

	public int getIntrinsicHeight()
	{
		if(mDrawableContainerState.isConstantSize())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:invokevirtual   #287 <Method boolean DrawableContainer$DrawableContainerState.isConstantSize()>
	//*   3    7:ifeq            18
			return mDrawableContainerState.getConstantHeight();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    6   14:invokevirtual   #290 <Method int DrawableContainer$DrawableContainerState.getConstantHeight()>
	//    7   17:ireturn         
		Drawable drawable = mCurrDrawable;
	//    8   18:aload_0         
	//    9   19:getfield        #225 <Field Drawable mCurrDrawable>
	//   10   22:astore_1        
		if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          32
			return drawable.getIntrinsicHeight();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #292 <Method int Drawable.getIntrinsicHeight()>
	//   15   31:ireturn         
		else
			return -1;
	//   16   32:iconst_m1       
	//   17   33:ireturn         
	}

	public int getIntrinsicWidth()
	{
		if(mDrawableContainerState.isConstantSize())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:invokevirtual   #287 <Method boolean DrawableContainer$DrawableContainerState.isConstantSize()>
	//*   3    7:ifeq            18
			return mDrawableContainerState.getConstantWidth();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    6   14:invokevirtual   #296 <Method int DrawableContainer$DrawableContainerState.getConstantWidth()>
	//    7   17:ireturn         
		Drawable drawable = mCurrDrawable;
	//    8   18:aload_0         
	//    9   19:getfield        #225 <Field Drawable mCurrDrawable>
	//   10   22:astore_1        
		if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          32
			return drawable.getIntrinsicWidth();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #298 <Method int Drawable.getIntrinsicWidth()>
	//   15   31:ireturn         
		else
			return -1;
	//   16   32:iconst_m1       
	//   17   33:ireturn         
	}

	public int getMinimumHeight()
	{
		if(mDrawableContainerState.isConstantSize())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:invokevirtual   #287 <Method boolean DrawableContainer$DrawableContainerState.isConstantSize()>
	//*   3    7:ifeq            18
			return mDrawableContainerState.getConstantMinimumHeight();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    6   14:invokevirtual   #302 <Method int DrawableContainer$DrawableContainerState.getConstantMinimumHeight()>
	//    7   17:ireturn         
		Drawable drawable = mCurrDrawable;
	//    8   18:aload_0         
	//    9   19:getfield        #225 <Field Drawable mCurrDrawable>
	//   10   22:astore_1        
		if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          32
			return drawable.getMinimumHeight();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #304 <Method int Drawable.getMinimumHeight()>
	//   15   31:ireturn         
		else
			return 0;
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	public int getMinimumWidth()
	{
		if(mDrawableContainerState.isConstantSize())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:invokevirtual   #287 <Method boolean DrawableContainer$DrawableContainerState.isConstantSize()>
	//*   3    7:ifeq            18
			return mDrawableContainerState.getConstantMinimumWidth();
	//    4   10:aload_0         
	//    5   11:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    6   14:invokevirtual   #308 <Method int DrawableContainer$DrawableContainerState.getConstantMinimumWidth()>
	//    7   17:ireturn         
		Drawable drawable = mCurrDrawable;
	//    8   18:aload_0         
	//    9   19:getfield        #225 <Field Drawable mCurrDrawable>
	//   10   22:astore_1        
		if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          32
			return drawable.getMinimumWidth();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #310 <Method int Drawable.getMinimumWidth()>
	//   15   31:ireturn         
		else
			return 0;
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	public int getOpacity()
	{
		Drawable drawable = mCurrDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field Drawable mCurrDrawable>
	//    2    4:astore_1        
		if(drawable != null && drawable.isVisible())
	//*   3    5:aload_1         
	//*   4    6:ifnull          27
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #312 <Method boolean Drawable.isVisible()>
	//*   7   13:ifne            19
	//*   8   16:goto            27
			return mDrawableContainerState.getOpacity();
	//    9   19:aload_0         
	//   10   20:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   11   23:invokevirtual   #314 <Method int DrawableContainer$DrawableContainerState.getOpacity()>
	//   12   26:ireturn         
		else
			return -2;
	//   13   27:bipush          -2
	//   14   29:ireturn         
	}

	public void getOutline(Outline outline)
	{
		Drawable drawable = mCurrDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field Drawable mCurrDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable.getOutline(outline);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #318 <Method void Drawable.getOutline(Outline)>
	//    8   14:return          
	}

	public boolean getPadding(Rect rect)
	{
		Rect rect1 = mDrawableContainerState.getConstantPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:invokevirtual   #323 <Method Rect DrawableContainer$DrawableContainerState.getConstantPadding()>
	//    3    7:astore          6
		boolean flag;
		if(rect1 != null)
	//*   4    9:aload           6
	//*   5   11:ifnull          66
		{
			rect.set(rect1);
	//    6   14:aload_1         
	//    7   15:aload           6
	//    8   17:invokevirtual   #281 <Method void Rect.set(Rect)>
			int i = rect1.left;
	//    9   20:aload           6
	//   10   22:getfield        #176 <Field int Rect.left>
	//   11   25:istore_2        
			int k = rect1.top;
	//   12   26:aload           6
	//   13   28:getfield        #179 <Field int Rect.top>
	//   14   31:istore_3        
			int l = rect1.bottom;
	//   15   32:aload           6
	//   16   34:getfield        #185 <Field int Rect.bottom>
	//   17   37:istore          4
			if((rect1.right | (i | k | l)) != 0)
	//*  18   39:aload           6
	//*  19   41:getfield        #182 <Field int Rect.right>
	//*  20   44:iload_2         
	//*  21   45:iload_3         
	//*  22   46:ior             
	//*  23   47:iload           4
	//*  24   49:ior             
	//*  25   50:ior             
	//*  26   51:ifeq            60
				flag = true;
	//   27   54:iconst_1        
	//   28   55:istore          5
			else
	//*  29   57:goto            95
				flag = false;
	//   30   60:iconst_0        
	//   31   61:istore          5
		} else
	//*  32   63:goto            95
		{
			Drawable drawable = mCurrDrawable;
	//   33   66:aload_0         
	//   34   67:getfield        #225 <Field Drawable mCurrDrawable>
	//   35   70:astore          6
			if(drawable != null)
	//*  36   72:aload           6
	//*  37   74:ifnull          88
				flag = drawable.getPadding(rect);
	//   38   77:aload           6
	//   39   79:aload_1         
	//   40   80:invokevirtual   #325 <Method boolean Drawable.getPadding(Rect)>
	//   41   83:istore          5
			else
	//*  42   85:goto            95
				flag = super.getPadding(rect);
	//   43   88:aload_0         
	//   44   89:aload_1         
	//   45   90:invokespecial   #325 <Method boolean Drawable.getPadding(Rect)>
	//   46   93:istore          5
		}
		if(needsMirroring())
	//*  47   95:aload_0         
	//*  48   96:invokespecial   #327 <Method boolean needsMirroring()>
	//*  49   99:ifeq            120
		{
			int j = rect.left;
	//   50  102:aload_1         
	//   51  103:getfield        #176 <Field int Rect.left>
	//   52  106:istore_2        
			rect.left = rect.right;
	//   53  107:aload_1         
	//   54  108:aload_1         
	//   55  109:getfield        #182 <Field int Rect.right>
	//   56  112:putfield        #176 <Field int Rect.left>
			rect.right = j;
	//   57  115:aload_1         
	//   58  116:iload_2         
	//   59  117:putfield        #182 <Field int Rect.right>
		}
		return flag;
	//   60  120:iload           5
	//   61  122:ireturn         
	}

	public void invalidateDrawable(Drawable drawable)
	{
		DrawableContainerState drawablecontainerstate = mDrawableContainerState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:astore_2        
		if(drawablecontainerstate != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			drawablecontainerstate.invalidateCache();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #331 <Method void DrawableContainer$DrawableContainerState.invalidateCache()>
		if(drawable == mCurrDrawable && getCallback() != null)
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #225 <Field Drawable mCurrDrawable>
	//*  10   18:if_acmpne       38
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #332 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//*  13   25:ifnull          38
			getCallback().invalidateDrawable(((Drawable) (this)));
	//   14   28:aload_0         
	//   15   29:invokevirtual   #332 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//   16   32:aload_0         
	//   17   33:invokeinterface #334 <Method void android.graphics.drawable.Drawable$Callback.invalidateDrawable(Drawable)>
	//   18   38:return          
	}

	public boolean isAutoMirrored()
	{
		return mDrawableContainerState.mAutoMirrored;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:getfield        #166 <Field boolean DrawableContainer$DrawableContainerState.mAutoMirrored>
	//    3    7:ireturn         
	}

	public boolean isStateful()
	{
		return mDrawableContainerState.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:invokevirtual   #337 <Method boolean DrawableContainer$DrawableContainerState.isStateful()>
	//    3    7:ireturn         
	}

	public void jumpToCurrentState()
	{
		Drawable drawable = mLastDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field Drawable mLastDrawable>
	//    2    4:astore_2        
		boolean flag;
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          28
		{
			drawable.jumpToCurrentState();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #340 <Method void Drawable.jumpToCurrentState()>
			mLastDrawable = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #231 <Field Drawable mLastDrawable>
			mLastIndex = -1;
	//   10   18:aload_0         
	//   11   19:iconst_m1       
	//   12   20:putfield        #49  <Field int mLastIndex>
			flag = true;
	//   13   23:iconst_1        
	//   14   24:istore_1        
		} else
	//*  15   25:goto            30
		{
			flag = false;
	//   16   28:iconst_0        
	//   17   29:istore_1        
		}
		drawable = mCurrDrawable;
	//   18   30:aload_0         
	//   19   31:getfield        #225 <Field Drawable mCurrDrawable>
	//   20   34:astore_2        
		if(drawable != null)
	//*  21   35:aload_2         
	//*  22   36:ifnull          61
		{
			drawable.jumpToCurrentState();
	//   23   39:aload_2         
	//   24   40:invokevirtual   #340 <Method void Drawable.jumpToCurrentState()>
			if(mHasAlpha)
	//*  25   43:aload_0         
	//*  26   44:getfield        #74  <Field boolean mHasAlpha>
	//*  27   47:ifeq            61
				mCurrDrawable.setAlpha(mAlpha);
	//   28   50:aload_0         
	//   29   51:getfield        #225 <Field Drawable mCurrDrawable>
	//   30   54:aload_0         
	//   31   55:getfield        #45  <Field int mAlpha>
	//   32   58:invokevirtual   #78  <Method void Drawable.setAlpha(int)>
		}
		if(mExitAnimationEnd != 0L)
	//*  33   61:aload_0         
	//*  34   62:getfield        #233 <Field long mExitAnimationEnd>
	//*  35   65:lconst_0        
	//*  36   66:lcmp            
	//*  37   67:ifeq            77
		{
			mExitAnimationEnd = 0L;
	//   38   70:aload_0         
	//   39   71:lconst_0        
	//   40   72:putfield        #233 <Field long mExitAnimationEnd>
			flag = true;
	//   41   75:iconst_1        
	//   42   76:istore_1        
		}
		if(mEnterAnimationEnd != 0L)
	//*  43   77:aload_0         
	//*  44   78:getfield        #227 <Field long mEnterAnimationEnd>
	//*  45   81:lconst_0        
	//*  46   82:lcmp            
	//*  47   83:ifeq            93
		{
			mEnterAnimationEnd = 0L;
	//   48   86:aload_0         
	//   49   87:lconst_0        
	//   50   88:putfield        #227 <Field long mEnterAnimationEnd>
			flag = true;
	//   51   91:iconst_1        
	//   52   92:istore_1        
		}
		if(flag)
	//*  53   93:iload_1         
	//*  54   94:ifeq            101
			invalidateSelf();
	//   55   97:aload_0         
	//   56   98:invokevirtual   #343 <Method void invalidateSelf()>
	//   57  101:return          
	}

	public Drawable mutate()
	{
		if(!mMutated && super.mutate() == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #346 <Field boolean mMutated>
	//*   2    4:ifne            34
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #348 <Method Drawable Drawable.mutate()>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       34
		{
			DrawableContainerState drawablecontainerstate = cloneConstantState();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #350 <Method DrawableContainer$DrawableContainerState cloneConstantState()>
	//    9   19:astore_1        
			drawablecontainerstate.mutate();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #352 <Method void DrawableContainer$DrawableContainerState.mutate()>
			setConstantState(drawablecontainerstate);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #356 <Method void setConstantState(DrawableContainer$DrawableContainerState)>
			mMutated = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #346 <Field boolean mMutated>
		}
		return ((Drawable) (this));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		Drawable drawable = mLastDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field Drawable mLastDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable.setBounds(rect);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #152 <Method void Drawable.setBounds(Rect)>
		drawable = mCurrDrawable;
	//    8   14:aload_0         
	//    9   15:getfield        #225 <Field Drawable mCurrDrawable>
	//   10   18:astore_2        
		if(drawable != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          28
			drawable.setBounds(rect);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #152 <Method void Drawable.setBounds(Rect)>
	//   16   28:return          
	}

	public boolean onLayoutDirectionChanged(int i)
	{
		return mDrawableContainerState.setLayoutDirection(i, getCurrentIndex());
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #360 <Method int getCurrentIndex()>
	//    5    9:invokevirtual   #363 <Method boolean DrawableContainer$DrawableContainerState.setLayoutDirection(int, int)>
	//    6   12:ireturn         
	}

	protected boolean onLevelChange(int i)
	{
		Drawable drawable = mLastDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field Drawable mLastDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return drawable.setLevel(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #144 <Method boolean Drawable.setLevel(int)>
	//    8   14:ireturn         
		drawable = mCurrDrawable;
	//    9   15:aload_0         
	//   10   16:getfield        #225 <Field Drawable mCurrDrawable>
	//   11   19:astore_2        
		if(drawable != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			return drawable.setLevel(i);
	//   14   24:aload_2         
	//   15   25:iload_1         
	//   16   26:invokevirtual   #144 <Method boolean Drawable.setLevel(int)>
	//   17   29:ireturn         
		else
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
	}

	protected boolean onStateChange(int ai[])
	{
		Drawable drawable = mLastDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field Drawable mLastDrawable>
	//    2    4:astore_2        
		if(drawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			return drawable.setState(ai);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #136 <Method boolean Drawable.setState(int[])>
	//    8   14:ireturn         
		drawable = mCurrDrawable;
	//    9   15:aload_0         
	//   10   16:getfield        #225 <Field Drawable mCurrDrawable>
	//   11   19:astore_2        
		if(drawable != null)
	//*  12   20:aload_2         
	//*  13   21:ifnull          30
			return drawable.setState(ai);
	//   14   24:aload_2         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #136 <Method boolean Drawable.setState(int[])>
	//   17   29:ireturn         
		else
			return false;
	//   18   30:iconst_0        
	//   19   31:ireturn         
	}

	public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
	{
		if(drawable == mCurrDrawable && getCallback() != null)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #225 <Field Drawable mCurrDrawable>
	//*   3    5:if_acmpne       27
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #332 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//*   6   12:ifnull          27
			getCallback().scheduleDrawable(((Drawable) (this)), runnable, l);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #332 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:lload_3         
	//   12   22:invokeinterface #369 <Method void android.graphics.drawable.Drawable$Callback.scheduleDrawable(Drawable, Runnable, long)>
	//   13   27:return          
	}

	boolean selectDrawable(int i)
	{
		if(i == mCurIndex)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field int mCurIndex>
	//*   3    5:icmpne          10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		long l = SystemClock.uptimeMillis();
	//    6   10:invokestatic    #223 <Method long SystemClock.uptimeMillis()>
	//    7   13:lstore_2        
		if(mDrawableContainerState.mExitFadeDuration > 0)
	//*   8   14:aload_0         
	//*   9   15:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  10   18:getfield        #236 <Field int DrawableContainer$DrawableContainerState.mExitFadeDuration>
	//*  11   21:ifle            103
		{
			Drawable drawable = mLastDrawable;
	//   12   24:aload_0         
	//   13   25:getfield        #231 <Field Drawable mLastDrawable>
	//   14   28:astore          4
			if(drawable != null)
	//*  15   30:aload           4
	//*  16   32:ifnull          43
				drawable.setVisible(false, false);
	//   17   35:aload           4
	//   18   37:iconst_0        
	//   19   38:iconst_0        
	//   20   39:invokevirtual   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   21   42:pop             
			drawable = mCurrDrawable;
	//   22   43:aload_0         
	//   23   44:getfield        #225 <Field Drawable mCurrDrawable>
	//   24   47:astore          4
			if(drawable != null)
	//*  25   49:aload           4
	//*  26   51:ifnull          85
			{
				mLastDrawable = drawable;
	//   27   54:aload_0         
	//   28   55:aload           4
	//   29   57:putfield        #231 <Field Drawable mLastDrawable>
				mLastIndex = mCurIndex;
	//   30   60:aload_0         
	//   31   61:aload_0         
	//   32   62:getfield        #47  <Field int mCurIndex>
	//   33   65:putfield        #49  <Field int mLastIndex>
				mExitAnimationEnd = (long)mDrawableContainerState.mExitFadeDuration + l;
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   37   73:getfield        #236 <Field int DrawableContainer$DrawableContainerState.mExitFadeDuration>
	//   38   76:i2l             
	//   39   77:lload_2         
	//   40   78:ladd            
	//   41   79:putfield        #233 <Field long mExitAnimationEnd>
			} else
	//*  42   82:goto            122
			{
				mLastDrawable = null;
	//   43   85:aload_0         
	//   44   86:aconst_null     
	//   45   87:putfield        #231 <Field Drawable mLastDrawable>
				mLastIndex = -1;
	//   46   90:aload_0         
	//   47   91:iconst_m1       
	//   48   92:putfield        #49  <Field int mLastIndex>
				mExitAnimationEnd = 0L;
	//   49   95:aload_0         
	//   50   96:lconst_0        
	//   51   97:putfield        #233 <Field long mExitAnimationEnd>
			}
		} else
	//*  52  100:goto            122
		{
			Drawable drawable1 = mCurrDrawable;
	//   53  103:aload_0         
	//   54  104:getfield        #225 <Field Drawable mCurrDrawable>
	//   55  107:astore          4
			if(drawable1 != null)
	//*  56  109:aload           4
	//*  57  111:ifnull          122
				drawable1.setVisible(false, false);
	//   58  114:aload           4
	//   59  116:iconst_0        
	//   60  117:iconst_0        
	//   61  118:invokevirtual   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   62  121:pop             
		}
		if(i >= 0 && i < mDrawableContainerState.mNumChildren)
	//*  63  122:iload_1         
	//*  64  123:iflt            196
	//*  65  126:iload_1         
	//*  66  127:aload_0         
	//*  67  128:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  68  131:getfield        #373 <Field int DrawableContainer$DrawableContainerState.mNumChildren>
	//*  69  134:icmpge          196
		{
			Drawable drawable2 = mDrawableContainerState.getChild(i);
	//   70  137:aload_0         
	//   71  138:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   72  141:iload_1         
	//   73  142:invokevirtual   #377 <Method Drawable DrawableContainer$DrawableContainerState.getChild(int)>
	//   74  145:astore          4
			mCurrDrawable = drawable2;
	//   75  147:aload_0         
	//   76  148:aload           4
	//   77  150:putfield        #225 <Field Drawable mCurrDrawable>
			mCurIndex = i;
	//   78  153:aload_0         
	//   79  154:iload_1         
	//   80  155:putfield        #47  <Field int mCurIndex>
			if(drawable2 != null)
	//*  81  158:aload           4
	//*  82  160:ifnull          206
			{
				if(mDrawableContainerState.mEnterFadeDuration > 0)
	//*  83  163:aload_0         
	//*  84  164:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*  85  167:getfield        #72  <Field int DrawableContainer$DrawableContainerState.mEnterFadeDuration>
	//*  86  170:ifle            187
					mEnterAnimationEnd = l + (long)mDrawableContainerState.mEnterFadeDuration;
	//   87  173:aload_0         
	//   88  174:lload_2         
	//   89  175:aload_0         
	//   90  176:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   91  179:getfield        #72  <Field int DrawableContainer$DrawableContainerState.mEnterFadeDuration>
	//   92  182:i2l             
	//   93  183:ladd            
	//   94  184:putfield        #227 <Field long mEnterAnimationEnd>
				initializeDrawableForDisplay(drawable2);
	//   95  187:aload_0         
	//   96  188:aload           4
	//   97  190:invokespecial   #379 <Method void initializeDrawableForDisplay(Drawable)>
			}
		} else
	//*  98  193:goto            206
		{
			mCurrDrawable = null;
	//   99  196:aload_0         
	//  100  197:aconst_null     
	//  101  198:putfield        #225 <Field Drawable mCurrDrawable>
			mCurIndex = -1;
	//  102  201:aload_0         
	//  103  202:iconst_m1       
	//  104  203:putfield        #47  <Field int mCurIndex>
		}
		if(mEnterAnimationEnd != 0L || mExitAnimationEnd != 0L)
	//* 105  206:aload_0         
	//* 106  207:getfield        #227 <Field long mEnterAnimationEnd>
	//* 107  210:lconst_0        
	//* 108  211:lcmp            
	//* 109  212:ifne            224
	//* 110  215:aload_0         
	//* 111  216:getfield        #233 <Field long mExitAnimationEnd>
	//* 112  219:lconst_0        
	//* 113  220:lcmp            
	//* 114  221:ifeq            261
		{
			Runnable runnable = mAnimationRunnable;
	//  115  224:aload_0         
	//  116  225:getfield        #238 <Field Runnable mAnimationRunnable>
	//  117  228:astore          4
			if(runnable == null)
	//* 118  230:aload           4
	//* 119  232:ifnonnull       250
				mAnimationRunnable = new Runnable() {

					public void run()
					{
						animate(true);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field DrawableContainer this$0>
					//    2    4:iconst_1        
					//    3    5:invokevirtual   #26  <Method void DrawableContainer.animate(boolean)>
						invalidateSelf();
					//    4    8:aload_0         
					//    5    9:getfield        #17  <Field DrawableContainer this$0>
					//    6   12:invokevirtual   #29  <Method void DrawableContainer.invalidateSelf()>
					//    7   15:return          
					}

					final DrawableContainer this$0;

			
			{
				this$0 = DrawableContainer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DrawableContainer this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//  120  235:aload_0         
	//  121  236:new             #8   <Class DrawableContainer$1>
	//  122  239:dup             
	//  123  240:aload_0         
	//  124  241:invokespecial   #382 <Method void DrawableContainer$1(DrawableContainer)>
	//  125  244:putfield        #238 <Field Runnable mAnimationRunnable>
			else
	//* 126  247:goto            256
				unscheduleSelf(runnable);
	//  127  250:aload_0         
	//  128  251:aload           4
	//  129  253:invokevirtual   #386 <Method void unscheduleSelf(Runnable)>
			animate(true);
	//  130  256:aload_0         
	//  131  257:iconst_1        
	//  132  258:invokevirtual   #388 <Method void animate(boolean)>
		}
		invalidateSelf();
	//  133  261:aload_0         
	//  134  262:invokevirtual   #343 <Method void invalidateSelf()>
		return true;
	//  135  265:iconst_1        
	//  136  266:ireturn         
	}

	public void setAlpha(int i)
	{
		if(!mHasAlpha || mAlpha != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field boolean mHasAlpha>
	//*   2    4:ifeq            15
	//*   3    7:aload_0         
	//*   4    8:getfield        #45  <Field int mAlpha>
	//*   5   11:iload_1         
	//*   6   12:icmpeq          54
		{
			mHasAlpha = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #74  <Field boolean mHasAlpha>
			mAlpha = i;
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:putfield        #45  <Field int mAlpha>
			Drawable drawable = mCurrDrawable;
	//   13   25:aload_0         
	//   14   26:getfield        #225 <Field Drawable mCurrDrawable>
	//   15   29:astore_2        
			if(drawable != null)
	//*  16   30:aload_2         
	//*  17   31:ifnull          54
			{
				if(mEnterAnimationEnd == 0L)
	//*  18   34:aload_0         
	//*  19   35:getfield        #227 <Field long mEnterAnimationEnd>
	//*  20   38:lconst_0        
	//*  21   39:lcmp            
	//*  22   40:ifne            49
				{
					drawable.setAlpha(i);
	//   23   43:aload_2         
	//   24   44:iload_1         
	//   25   45:invokevirtual   #78  <Method void Drawable.setAlpha(int)>
					return;
	//   26   48:return          
				}
				animate(false);
	//   27   49:aload_0         
	//   28   50:iconst_0        
	//   29   51:invokevirtual   #388 <Method void animate(boolean)>
			}
		}
	//   30   54:return          
	}

	public void setAutoMirrored(boolean flag)
	{
		if(mDrawableContainerState.mAutoMirrored != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:getfield        #166 <Field boolean DrawableContainer$DrawableContainerState.mAutoMirrored>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          38
		{
			DrawableContainerState drawablecontainerstate = mDrawableContainerState;
	//    5   11:aload_0         
	//    6   12:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    7   15:astore_2        
			drawablecontainerstate.mAutoMirrored = flag;
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:putfield        #166 <Field boolean DrawableContainer$DrawableContainerState.mAutoMirrored>
			Drawable drawable = mCurrDrawable;
	//   11   21:aload_0         
	//   12   22:getfield        #225 <Field Drawable mCurrDrawable>
	//   13   25:astore_3        
			if(drawable != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          38
				DrawableCompat.setAutoMirrored(drawable, drawablecontainerstate.mAutoMirrored);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:getfield        #166 <Field boolean DrawableContainer$DrawableContainerState.mAutoMirrored>
	//   19   35:invokestatic    #391 <Method void DrawableCompat.setAutoMirrored(Drawable, boolean)>
		}
	//   20   38:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		DrawableContainerState drawablecontainerstate = mDrawableContainerState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:astore_2        
		drawablecontainerstate.mHasColorFilter = true;
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:putfield        #81  <Field boolean DrawableContainer$DrawableContainerState.mHasColorFilter>
		if(drawablecontainerstate.mColorFilter != colorfilter)
	//*   6   10:aload_2         
	//*   7   11:getfield        #85  <Field ColorFilter DrawableContainer$DrawableContainerState.mColorFilter>
	//*   8   14:aload_1         
	//*   9   15:if_acmpeq       40
		{
			mDrawableContainerState.mColorFilter = colorfilter;
	//   10   18:aload_0         
	//   11   19:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   12   22:aload_1         
	//   13   23:putfield        #85  <Field ColorFilter DrawableContainer$DrawableContainerState.mColorFilter>
			Drawable drawable = mCurrDrawable;
	//   14   26:aload_0         
	//   15   27:getfield        #225 <Field Drawable mCurrDrawable>
	//   16   30:astore_2        
			if(drawable != null)
	//*  17   31:aload_2         
	//*  18   32:ifnull          40
				drawable.setColorFilter(colorfilter);
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #89  <Method void Drawable.setColorFilter(ColorFilter)>
		}
	//   22   40:return          
	}

	protected void setConstantState(DrawableContainerState drawablecontainerstate)
	{
		mDrawableContainerState = drawablecontainerstate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
		int i = mCurIndex;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int mCurIndex>
	//    5    9:istore_2        
		if(i >= 0)
	//*   6   10:iload_2         
	//*   7   11:iflt            37
		{
			mCurrDrawable = drawablecontainerstate.getChild(i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #377 <Method Drawable DrawableContainer$DrawableContainerState.getChild(int)>
	//   12   20:putfield        #225 <Field Drawable mCurrDrawable>
			drawablecontainerstate = ((DrawableContainerState) (mCurrDrawable));
	//   13   23:aload_0         
	//   14   24:getfield        #225 <Field Drawable mCurrDrawable>
	//   15   27:astore_1        
			if(drawablecontainerstate != null)
	//*  16   28:aload_1         
	//*  17   29:ifnull          37
				initializeDrawableForDisplay(((Drawable) (drawablecontainerstate)));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokespecial   #379 <Method void initializeDrawableForDisplay(Drawable)>
		}
		mLastIndex = -1;
	//   21   37:aload_0         
	//   22   38:iconst_m1       
	//   23   39:putfield        #49  <Field int mLastIndex>
		mLastDrawable = null;
	//   24   42:aload_0         
	//   25   43:aconst_null     
	//   26   44:putfield        #231 <Field Drawable mLastDrawable>
	//   27   47:return          
	}

	public void setDither(boolean flag)
	{
		if(mDrawableContainerState.mDither != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//*   2    4:getfield        #124 <Field boolean DrawableContainer$DrawableContainerState.mDither>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          38
		{
			DrawableContainerState drawablecontainerstate = mDrawableContainerState;
	//    5   11:aload_0         
	//    6   12:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    7   15:astore_2        
			drawablecontainerstate.mDither = flag;
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:putfield        #124 <Field boolean DrawableContainer$DrawableContainerState.mDither>
			Drawable drawable = mCurrDrawable;
	//   11   21:aload_0         
	//   12   22:getfield        #225 <Field Drawable mCurrDrawable>
	//   13   25:astore_3        
			if(drawable != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          38
				drawable.setDither(drawablecontainerstate.mDither);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:getfield        #124 <Field boolean DrawableContainer$DrawableContainerState.mDither>
	//   19   35:invokevirtual   #128 <Method void Drawable.setDither(boolean)>
		}
	//   20   38:return          
	}

	public void setHotspot(float f, float f1)
	{
		Drawable drawable = mCurrDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field Drawable mCurrDrawable>
	//    2    4:astore_3        
		if(drawable != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          15
			DrawableCompat.setHotspot(drawable, f, f1);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:fload_2         
	//    8   12:invokestatic    #396 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//    9   15:return          
	}

	public void setHotspotBounds(int i, int j, int k, int l)
	{
		Object obj = ((Object) (mHotspotBounds));
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field Rect mHotspotBounds>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       30
			mHotspotBounds = new Rect(i, j, k, l);
	//    5   11:aload_0         
	//    6   12:new             #173 <Class Rect>
	//    7   15:dup             
	//    8   16:iload_1         
	//    9   17:iload_2         
	//   10   18:iload_3         
	//   11   19:iload           4
	//   12   21:invokespecial   #398 <Method void Rect(int, int, int, int)>
	//   13   24:putfield        #171 <Field Rect mHotspotBounds>
		else
	//*  14   27:goto            40
			((Rect) (obj)).set(i, j, k, l);
	//   15   30:aload           5
	//   16   32:iload_1         
	//   17   33:iload_2         
	//   18   34:iload_3         
	//   19   35:iload           4
	//   20   37:invokevirtual   #400 <Method void Rect.set(int, int, int, int)>
		obj = ((Object) (mCurrDrawable));
	//   21   40:aload_0         
	//   22   41:getfield        #225 <Field Drawable mCurrDrawable>
	//   23   44:astore          5
		if(obj != null)
	//*  24   46:aload           5
	//*  25   48:ifnull          61
			DrawableCompat.setHotspotBounds(((Drawable) (obj)), i, j, k, l);
	//   26   51:aload           5
	//   27   53:iload_1         
	//   28   54:iload_2         
	//   29   55:iload_3         
	//   30   56:iload           4
	//   31   58:invokestatic    #403 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
	//   32   61:return          
	}

	public void setTintList(ColorStateList colorstatelist)
	{
		DrawableContainerState drawablecontainerstate = mDrawableContainerState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:astore_2        
		drawablecontainerstate.mHasTintList = true;
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:putfield        #92  <Field boolean DrawableContainer$DrawableContainerState.mHasTintList>
		if(drawablecontainerstate.mTintList != colorstatelist)
	//*   6   10:aload_2         
	//*   7   11:getfield        #96  <Field ColorStateList DrawableContainer$DrawableContainerState.mTintList>
	//*   8   14:aload_1         
	//*   9   15:if_acmpeq       34
		{
			mDrawableContainerState.mTintList = colorstatelist;
	//   10   18:aload_0         
	//   11   19:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   12   22:aload_1         
	//   13   23:putfield        #96  <Field ColorStateList DrawableContainer$DrawableContainerState.mTintList>
			DrawableCompat.setTintList(mCurrDrawable, colorstatelist);
	//   14   26:aload_0         
	//   15   27:getfield        #225 <Field Drawable mCurrDrawable>
	//   16   30:aload_1         
	//   17   31:invokestatic    #102 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
		}
	//   18   34:return          
	}

	public void setTintMode(android.graphics.PorterDuff.Mode mode)
	{
		DrawableContainerState drawablecontainerstate = mDrawableContainerState;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:astore_2        
		drawablecontainerstate.mHasTintMode = true;
	//    3    5:aload_2         
	//    4    6:iconst_1        
	//    5    7:putfield        #105 <Field boolean DrawableContainer$DrawableContainerState.mHasTintMode>
		if(drawablecontainerstate.mTintMode != mode)
	//*   6   10:aload_2         
	//*   7   11:getfield        #109 <Field android.graphics.PorterDuff$Mode DrawableContainer$DrawableContainerState.mTintMode>
	//*   8   14:aload_1         
	//*   9   15:if_acmpeq       34
		{
			mDrawableContainerState.mTintMode = mode;
	//   10   18:aload_0         
	//   11   19:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//   12   22:aload_1         
	//   13   23:putfield        #109 <Field android.graphics.PorterDuff$Mode DrawableContainer$DrawableContainerState.mTintMode>
			DrawableCompat.setTintMode(mCurrDrawable, mode);
	//   14   26:aload_0         
	//   15   27:getfield        #225 <Field Drawable mCurrDrawable>
	//   16   30:aload_1         
	//   17   31:invokestatic    #113 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
		}
	//   18   34:return          
	}

	public boolean setVisible(boolean flag, boolean flag1)
	{
		boolean flag2 = super.setVisible(flag, flag1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//    4    6:istore_3        
		Drawable drawable = mLastDrawable;
	//    5    7:aload_0         
	//    6    8:getfield        #231 <Field Drawable mLastDrawable>
	//    7   11:astore          4
		if(drawable != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          26
			drawable.setVisible(flag, flag1);
	//   10   18:aload           4
	//   11   20:iload_1         
	//   12   21:iload_2         
	//   13   22:invokevirtual   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   14   25:pop             
		drawable = mCurrDrawable;
	//   15   26:aload_0         
	//   16   27:getfield        #225 <Field Drawable mCurrDrawable>
	//   17   30:astore          4
		if(drawable != null)
	//*  18   32:aload           4
	//*  19   34:ifnull          45
			drawable.setVisible(flag, flag1);
	//   20   37:aload           4
	//   21   39:iload_1         
	//   22   40:iload_2         
	//   23   41:invokevirtual   #121 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   24   44:pop             
		return flag2;
	//   25   45:iload_3         
	//   26   46:ireturn         
	}

	public void unscheduleDrawable(Drawable drawable, Runnable runnable)
	{
		if(drawable == mCurrDrawable && getCallback() != null)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #225 <Field Drawable mCurrDrawable>
	//*   3    5:if_acmpne       26
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #332 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//*   6   12:ifnull          26
			getCallback().unscheduleDrawable(((Drawable) (this)), runnable);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #332 <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokeinterface #409 <Method void android.graphics.drawable.Drawable$Callback.unscheduleDrawable(Drawable, Runnable)>
	//   12   26:return          
	}

	final void updateDensity(Resources resources)
	{
		mDrawableContainerState.updateDensity(resources);
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field DrawableContainer$DrawableContainerState mDrawableContainerState>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #413 <Method void DrawableContainer$DrawableContainerState.updateDensity(Resources)>
	//    4    8:return          
	}

	private int mAlpha;
	private Runnable mAnimationRunnable;
	private BlockInvalidateCallback mBlockInvalidateCallback;
	private int mCurIndex;
	private Drawable mCurrDrawable;
	private DrawableContainerState mDrawableContainerState;
	private long mEnterAnimationEnd;
	private long mExitAnimationEnd;
	private boolean mHasAlpha;
	private Rect mHotspotBounds;
	private Drawable mLastDrawable;
	private int mLastIndex;
	private boolean mMutated;
}
