// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			ViewParentCompat, ViewCompat

public class NestedScrollingChildHelper
{

	public NestedScrollingChildHelper(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field View mView>
	//    5    9:return          
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		if(isNestedScrollingEnabled() && mNestedScrollingParent != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            29
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//*   5   11:ifnull          29
			return ViewParentCompat.onNestedFling(mNestedScrollingParent, mView, f, f1, flag);
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field View mView>
	//   10   22:fload_1         
	//   11   23:fload_2         
	//   12   24:iload_3         
	//   13   25:invokestatic    #34  <Method boolean ViewParentCompat.onNestedFling(ViewParent, View, float, float, boolean)>
	//   14   28:ireturn         
		else
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		if(isNestedScrollingEnabled() && mNestedScrollingParent != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//*   5   11:ifnull          28
			return ViewParentCompat.onNestedPreFling(mNestedScrollingParent, mView, f, f1);
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field View mView>
	//   10   22:fload_1         
	//   11   23:fload_2         
	//   12   24:invokestatic    #40  <Method boolean ViewParentCompat.onNestedPreFling(ViewParent, View, float, float)>
	//   13   27:ireturn         
		else
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		if(isNestedScrollingEnabled() && mNestedScrollingParent != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            175
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//*   5   11:ifnull          175
		{
			if(i != 0 || j != 0)
	//*   6   14:iload_1         
	//*   7   15:ifne            22
	//*   8   18:iload_2         
	//*   9   19:ifeq            160
			{
				int k = 0;
	//   10   22:iconst_0        
	//   11   23:istore          5
				int l = 0;
	//   12   25:iconst_0        
	//   13   26:istore          6
				if(ai1 != null)
	//*  14   28:aload           4
	//*  15   30:ifnull          54
				{
					mView.getLocationInWindow(ai1);
	//   16   33:aload_0         
	//   17   34:getfield        #19  <Field View mView>
	//   18   37:aload           4
	//   19   39:invokevirtual   #48  <Method void View.getLocationInWindow(int[])>
					k = ai1[0];
	//   20   42:aload           4
	//   21   44:iconst_0        
	//   22   45:iaload          
	//   23   46:istore          5
					l = ai1[1];
	//   24   48:aload           4
	//   25   50:iconst_1        
	//   26   51:iaload          
	//   27   52:istore          6
				}
				int ai2[] = ai;
	//   28   54:aload_3         
	//   29   55:astore          7
				if(ai == null)
	//*  30   57:aload_3         
	//*  31   58:ifnonnull       81
				{
					if(mTempNestedScrollConsumed == null)
	//*  32   61:aload_0         
	//*  33   62:getfield        #50  <Field int[] mTempNestedScrollConsumed>
	//*  34   65:ifnonnull       75
						mTempNestedScrollConsumed = new int[2];
	//   35   68:aload_0         
	//   36   69:iconst_2        
	//   37   70:newarray        int[]
	//   38   72:putfield        #50  <Field int[] mTempNestedScrollConsumed>
					ai2 = mTempNestedScrollConsumed;
	//   39   75:aload_0         
	//   40   76:getfield        #50  <Field int[] mTempNestedScrollConsumed>
	//   41   79:astore          7
				}
				ai2[0] = 0;
	//   42   81:aload           7
	//   43   83:iconst_0        
	//   44   84:iconst_0        
	//   45   85:iastore         
				ai2[1] = 0;
	//   46   86:aload           7
	//   47   88:iconst_1        
	//   48   89:iconst_0        
	//   49   90:iastore         
				ViewParentCompat.onNestedPreScroll(mNestedScrollingParent, mView, i, j, ai2);
	//   50   91:aload_0         
	//   51   92:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//   52   95:aload_0         
	//   53   96:getfield        #19  <Field View mView>
	//   54   99:iload_1         
	//   55  100:iload_2         
	//   56  101:aload           7
	//   57  103:invokestatic    #54  <Method void ViewParentCompat.onNestedPreScroll(ViewParent, View, int, int, int[])>
				if(ai1 != null)
	//*  58  106:aload           4
	//*  59  108:ifnull          142
				{
					mView.getLocationInWindow(ai1);
	//   60  111:aload_0         
	//   61  112:getfield        #19  <Field View mView>
	//   62  115:aload           4
	//   63  117:invokevirtual   #48  <Method void View.getLocationInWindow(int[])>
					ai1[0] = ai1[0] - k;
	//   64  120:aload           4
	//   65  122:iconst_0        
	//   66  123:aload           4
	//   67  125:iconst_0        
	//   68  126:iaload          
	//   69  127:iload           5
	//   70  129:isub            
	//   71  130:iastore         
					ai1[1] = ai1[1] - l;
	//   72  131:aload           4
	//   73  133:iconst_1        
	//   74  134:aload           4
	//   75  136:iconst_1        
	//   76  137:iaload          
	//   77  138:iload           6
	//   78  140:isub            
	//   79  141:iastore         
				}
				return ai2[0] != 0 || ai2[1] != 0;
	//   80  142:aload           7
	//   81  144:iconst_0        
	//   82  145:iaload          
	//   83  146:ifne            156
	//   84  149:aload           7
	//   85  151:iconst_1        
	//   86  152:iaload          
	//   87  153:ifeq            158
	//   88  156:iconst_1        
	//   89  157:ireturn         
	//   90  158:iconst_0        
	//   91  159:ireturn         
			}
			if(ai1 != null)
	//*  92  160:aload           4
	//*  93  162:ifnull          175
			{
				ai1[0] = 0;
	//   94  165:aload           4
	//   95  167:iconst_0        
	//   96  168:iconst_0        
	//   97  169:iastore         
				ai1[1] = 0;
	//   98  170:aload           4
	//   99  172:iconst_1        
	//  100  173:iconst_0        
	//  101  174:iastore         
			}
		}
		return false;
	//  102  175:iconst_0        
	//  103  176:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		if(isNestedScrollingEnabled() && mNestedScrollingParent != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            132
	//*   3    7:aload_0         
	//*   4    8:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//*   5   11:ifnull          132
		{
			if(i != 0 || j != 0 || k != 0 || l != 0)
	//*   6   14:iload_1         
	//*   7   15:ifne            31
	//*   8   18:iload_2         
	//*   9   19:ifne            31
	//*  10   22:iload_3         
	//*  11   23:ifne            31
	//*  12   26:iload           4
	//*  13   28:ifeq            117
			{
				int i1 = 0;
	//   14   31:iconst_0        
	//   15   32:istore          6
				int j1 = 0;
	//   16   34:iconst_0        
	//   17   35:istore          7
				if(ai != null)
	//*  18   37:aload           5
	//*  19   39:ifnull          63
				{
					mView.getLocationInWindow(ai);
	//   20   42:aload_0         
	//   21   43:getfield        #19  <Field View mView>
	//   22   46:aload           5
	//   23   48:invokevirtual   #48  <Method void View.getLocationInWindow(int[])>
					i1 = ai[0];
	//   24   51:aload           5
	//   25   53:iconst_0        
	//   26   54:iaload          
	//   27   55:istore          6
					j1 = ai[1];
	//   28   57:aload           5
	//   29   59:iconst_1        
	//   30   60:iaload          
	//   31   61:istore          7
				}
				ViewParentCompat.onNestedScroll(mNestedScrollingParent, mView, i, j, k, l);
	//   32   63:aload_0         
	//   33   64:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//   34   67:aload_0         
	//   35   68:getfield        #19  <Field View mView>
	//   36   71:iload_1         
	//   37   72:iload_2         
	//   38   73:iload_3         
	//   39   74:iload           4
	//   40   76:invokestatic    #60  <Method void ViewParentCompat.onNestedScroll(ViewParent, View, int, int, int, int)>
				if(ai != null)
	//*  41   79:aload           5
	//*  42   81:ifnull          115
				{
					mView.getLocationInWindow(ai);
	//   43   84:aload_0         
	//   44   85:getfield        #19  <Field View mView>
	//   45   88:aload           5
	//   46   90:invokevirtual   #48  <Method void View.getLocationInWindow(int[])>
					ai[0] = ai[0] - i1;
	//   47   93:aload           5
	//   48   95:iconst_0        
	//   49   96:aload           5
	//   50   98:iconst_0        
	//   51   99:iaload          
	//   52  100:iload           6
	//   53  102:isub            
	//   54  103:iastore         
					ai[1] = ai[1] - j1;
	//   55  104:aload           5
	//   56  106:iconst_1        
	//   57  107:aload           5
	//   58  109:iconst_1        
	//   59  110:iaload          
	//   60  111:iload           7
	//   61  113:isub            
	//   62  114:iastore         
				}
				return true;
	//   63  115:iconst_1        
	//   64  116:ireturn         
			}
			if(ai != null)
	//*  65  117:aload           5
	//*  66  119:ifnull          132
			{
				ai[0] = 0;
	//   67  122:aload           5
	//   68  124:iconst_0        
	//   69  125:iconst_0        
	//   70  126:iastore         
				ai[1] = 0;
	//   71  127:aload           5
	//   72  129:iconst_1        
	//   73  130:iconst_0        
	//   74  131:iastore         
			}
		}
		return false;
	//   75  132:iconst_0        
	//   76  133:ireturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return mNestedScrollingParent != null;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mIsNestedScrollingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field boolean mIsNestedScrollingEnabled>
	//    2    4:ireturn         
	}

	public void onDetachedFromWindow()
	{
		ViewCompat.stopNestedScroll(mView);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field View mView>
	//    2    4:invokestatic    #69  <Method void ViewCompat.stopNestedScroll(View)>
	//    3    7:return          
	}

	public void onStopNestedScroll(View view)
	{
		ViewCompat.stopNestedScroll(mView);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field View mView>
	//    2    4:invokestatic    #69  <Method void ViewCompat.stopNestedScroll(View)>
	//    3    7:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		if(mIsNestedScrollingEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean mIsNestedScrollingEnabled>
	//*   2    4:ifeq            14
			ViewCompat.stopNestedScroll(mView);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field View mView>
	//    5   11:invokestatic    #69  <Method void ViewCompat.stopNestedScroll(View)>
		mIsNestedScrollingEnabled = flag;
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:putfield        #63  <Field boolean mIsNestedScrollingEnabled>
	//    9   19:return          
	}

	public boolean startNestedScroll(int i)
	{
		if(hasNestedScrollingParent())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #76  <Method boolean hasNestedScrollingParent()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(isNestedScrollingEnabled())
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #26  <Method boolean isNestedScrollingEnabled()>
	//*   7   13:ifeq            85
		{
			ViewParent viewparent = mView.getParent();
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field View mView>
	//   10   20:invokevirtual   #80  <Method ViewParent View.getParent()>
	//   11   23:astore_2        
			View view = mView;
	//   12   24:aload_0         
	//   13   25:getfield        #19  <Field View mView>
	//   14   28:astore_3        
			for(; viewparent != null; viewparent = viewparent.getParent())
	//*  15   29:aload_2         
	//*  16   30:ifnull          85
			{
				if(ViewParentCompat.onStartNestedScroll(viewparent, view, mView, i))
	//*  17   33:aload_2         
	//*  18   34:aload_3         
	//*  19   35:aload_0         
	//*  20   36:getfield        #19  <Field View mView>
	//*  21   39:iload_1         
	//*  22   40:invokestatic    #84  <Method boolean ViewParentCompat.onStartNestedScroll(ViewParent, View, View, int)>
	//*  23   43:ifeq            63
				{
					mNestedScrollingParent = viewparent;
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:putfield        #28  <Field ViewParent mNestedScrollingParent>
					ViewParentCompat.onNestedScrollAccepted(viewparent, view, mView, i);
	//   27   51:aload_2         
	//   28   52:aload_3         
	//   29   53:aload_0         
	//   30   54:getfield        #19  <Field View mView>
	//   31   57:iload_1         
	//   32   58:invokestatic    #88  <Method void ViewParentCompat.onNestedScrollAccepted(ViewParent, View, View, int)>
					return true;
	//   33   61:iconst_1        
	//   34   62:ireturn         
				}
				if(viewparent instanceof View)
	//*  35   63:aload_2         
	//*  36   64:instanceof      #44  <Class View>
	//*  37   67:ifeq            75
					view = (View)viewparent;
	//   38   70:aload_2         
	//   39   71:checkcast       #44  <Class View>
	//   40   74:astore_3        
			}

	//   41   75:aload_2         
	//   42   76:invokeinterface #91  <Method ViewParent ViewParent.getParent()>
	//   43   81:astore_2        
		}
	//*  44   82:goto            29
		return false;
	//   45   85:iconst_0        
	//   46   86:ireturn         
	}

	public void stopNestedScroll()
	{
		if(mNestedScrollingParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//*   2    4:ifnull          23
		{
			ViewParentCompat.onStopNestedScroll(mNestedScrollingParent, mView);
	//    3    7:aload_0         
	//    4    8:getfield        #28  <Field ViewParent mNestedScrollingParent>
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field View mView>
	//    7   15:invokestatic    #94  <Method void ViewParentCompat.onStopNestedScroll(ViewParent, View)>
			mNestedScrollingParent = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #28  <Field ViewParent mNestedScrollingParent>
		}
	//   11   23:return          
	}

	private boolean mIsNestedScrollingEnabled;
	private ViewParent mNestedScrollingParent;
	private int mTempNestedScrollConsumed[];
	private final View mView;
}
