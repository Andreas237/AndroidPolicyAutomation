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
	//    1    1:invokespecial   #19  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field View mView>
	//    5    9:return          
	}

	private ViewParent getNestedScrollingParentForType(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 31
	//	               1 26
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 1: // '\001'
			return mNestedScrollingParentNonTouch;
	//    4   26:aload_0         
	//    5   27:getfield        #27  <Field ViewParent mNestedScrollingParentNonTouch>
	//    6   30:areturn         

		case 0: // '\0'
			return mNestedScrollingParentTouch;
	//    7   31:aload_0         
	//    8   32:getfield        #29  <Field ViewParent mNestedScrollingParentTouch>
	//    9   35:areturn         
		}
	}

	private void setNestedScrollingParentForType(int i, ViewParent viewparent)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 31
	//	               1 25
		default:
			return;
	//    2   24:return          

		case 1: // '\001'
			mNestedScrollingParentNonTouch = viewparent;
	//    3   25:aload_0         
	//    4   26:aload_2         
	//    5   27:putfield        #27  <Field ViewParent mNestedScrollingParentNonTouch>
			return;
	//    6   30:return          

		case 0: // '\0'
			mNestedScrollingParentTouch = viewparent;
	//    7   31:aload_0         
	//    8   32:aload_2         
	//    9   33:putfield        #29  <Field ViewParent mNestedScrollingParentTouch>
			return;
	//   10   36:return          
		}
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		if(isNestedScrollingEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            32
		{
			ViewParent viewparent = getNestedScrollingParentForType(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    6   12:astore          4
			if(viewparent != null)
	//*   7   14:aload           4
	//*   8   16:ifnull          32
				return ViewParentCompat.onNestedFling(viewparent, mView, f, f1, flag);
	//    9   19:aload           4
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field View mView>
	//   12   25:fload_1         
	//   13   26:fload_2         
	//   14   27:iload_3         
	//   15   28:invokestatic    #45  <Method boolean ViewParentCompat.onNestedFling(ViewParent, View, float, float, boolean)>
	//   16   31:ireturn         
		}
		return false;
	//   17   32:iconst_0        
	//   18   33:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		if(isNestedScrollingEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            28
		{
			ViewParent viewparent = getNestedScrollingParentForType(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    6   12:astore_3        
			if(viewparent != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          28
				return ViewParentCompat.onNestedPreFling(viewparent, mView, f, f1);
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:getfield        #21  <Field View mView>
	//   12   22:fload_1         
	//   13   23:fload_2         
	//   14   24:invokestatic    #51  <Method boolean ViewParentCompat.onNestedPreFling(ViewParent, View, float, float)>
	//   15   27:ireturn         
		}
		return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return dispatchNestedPreScroll(i, j, ai, ai1, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #57  <Method boolean dispatchNestedPreScroll(int, int, int[], int[], int)>
	//    7   10:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[], int k)
	{
		if(isNestedScrollingEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            199
		{
			ViewParent viewparent = getNestedScrollingParentForType(k);
	//    3    7:aload_0         
	//    4    8:iload           5
	//    5   10:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    6   13:astore          10
			if(viewparent == null)
	//*   7   15:aload           10
	//*   8   17:ifnonnull       22
				return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
			boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore          8
			if(i == 0 && j == 0)
	//*  13   25:iload_1         
	//*  14   26:ifne            53
	//*  15   29:iload_2         
	//*  16   30:ifeq            36
	//*  17   33:goto            53
			{
				if(ai1 != null)
	//*  18   36:aload           4
	//*  19   38:ifnull          199
				{
					ai1[0] = 0;
	//   20   41:aload           4
	//   21   43:iconst_0        
	//   22   44:iconst_0        
	//   23   45:iastore         
					ai1[1] = 0;
	//   24   46:aload           4
	//   25   48:iconst_1        
	//   26   49:iconst_0        
	//   27   50:iastore         
					return false;
	//   28   51:iconst_0        
	//   29   52:ireturn         
				}
			} else
			{
				int l;
				int i1;
				if(ai1 != null)
	//*  30   53:aload           4
	//*  31   55:ifnull          82
				{
					mView.getLocationInWindow(ai1);
	//   32   58:aload_0         
	//   33   59:getfield        #21  <Field View mView>
	//   34   62:aload           4
	//   35   64:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					l = ai1[0];
	//   36   67:aload           4
	//   37   69:iconst_0        
	//   38   70:iaload          
	//   39   71:istore          6
					i1 = ai1[1];
	//   40   73:aload           4
	//   41   75:iconst_1        
	//   42   76:iaload          
	//   43   77:istore          7
				} else
	//*  44   79:goto            89
				{
					l = 0;
	//   45   82:iconst_0        
	//   46   83:istore          6
					i1 = l;
	//   47   85:iload           6
	//   48   87:istore          7
				}
				int ai2[] = ai;
	//   49   89:aload_3         
	//   50   90:astore          9
				if(ai == null)
	//*  51   92:aload_3         
	//*  52   93:ifnonnull       116
				{
					if(mTempNestedScrollConsumed == null)
	//*  53   96:aload_0         
	//*  54   97:getfield        #65  <Field int[] mTempNestedScrollConsumed>
	//*  55  100:ifnonnull       110
						mTempNestedScrollConsumed = new int[2];
	//   56  103:aload_0         
	//   57  104:iconst_2        
	//   58  105:newarray        int[]
	//   59  107:putfield        #65  <Field int[] mTempNestedScrollConsumed>
					ai2 = mTempNestedScrollConsumed;
	//   60  110:aload_0         
	//   61  111:getfield        #65  <Field int[] mTempNestedScrollConsumed>
	//   62  114:astore          9
				}
				ai2[0] = 0;
	//   63  116:aload           9
	//   64  118:iconst_0        
	//   65  119:iconst_0        
	//   66  120:iastore         
				ai2[1] = 0;
	//   67  121:aload           9
	//   68  123:iconst_1        
	//   69  124:iconst_0        
	//   70  125:iastore         
				ViewParentCompat.onNestedPreScroll(viewparent, mView, i, j, ai2, k);
	//   71  126:aload           10
	//   72  128:aload_0         
	//   73  129:getfield        #21  <Field View mView>
	//   74  132:iload_1         
	//   75  133:iload_2         
	//   76  134:aload           9
	//   77  136:iload           5
	//   78  138:invokestatic    #69  <Method void ViewParentCompat.onNestedPreScroll(ViewParent, View, int, int, int[], int)>
				if(ai1 != null)
	//*  79  141:aload           4
	//*  80  143:ifnull          177
				{
					mView.getLocationInWindow(ai1);
	//   81  146:aload_0         
	//   82  147:getfield        #21  <Field View mView>
	//   83  150:aload           4
	//   84  152:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					ai1[0] = ai1[0] - l;
	//   85  155:aload           4
	//   86  157:iconst_0        
	//   87  158:aload           4
	//   88  160:iconst_0        
	//   89  161:iaload          
	//   90  162:iload           6
	//   91  164:isub            
	//   92  165:iastore         
					ai1[1] = ai1[1] - i1;
	//   93  166:aload           4
	//   94  168:iconst_1        
	//   95  169:aload           4
	//   96  171:iconst_1        
	//   97  172:iaload          
	//   98  173:iload           7
	//   99  175:isub            
	//  100  176:iastore         
				}
				if(ai2[0] == 0)
	//* 101  177:aload           9
	//* 102  179:iconst_0        
	//* 103  180:iaload          
	//* 104  181:ifne            196
				{
					if(ai2[1] != 0)
	//* 105  184:aload           9
	//* 106  186:iconst_1        
	//* 107  187:iaload          
	//* 108  188:ifeq            193
						return true;
	//  109  191:iconst_1        
	//  110  192:ireturn         
					flag = false;
	//  111  193:iconst_0        
	//  112  194:istore          8
				}
				return flag;
	//  113  196:iload           8
	//  114  198:ireturn         
			}
		}
		return false;
	//  115  199:iconst_0        
	//  116  200:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return dispatchNestedScroll(i, j, k, l, ai, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #74  <Method boolean dispatchNestedScroll(int, int, int, int, int[], int)>
	//    8   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[], int i1)
	{
		if(isNestedScrollingEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   2    4:ifeq            149
		{
			ViewParent viewparent = getNestedScrollingParentForType(i1);
	//    3    7:aload_0         
	//    4    8:iload           6
	//    5   10:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    6   13:astore          9
			if(viewparent == null)
	//*   7   15:aload           9
	//*   8   17:ifnonnull       22
				return false;
	//    9   20:iconst_0        
	//   10   21:ireturn         
			if(i == 0 && j == 0 && k == 0 && l == 0)
	//*  11   22:iload_1         
	//*  12   23:ifne            59
	//*  13   26:iload_2         
	//*  14   27:ifne            59
	//*  15   30:iload_3         
	//*  16   31:ifne            59
	//*  17   34:iload           4
	//*  18   36:ifeq            42
	//*  19   39:goto            59
			{
				if(ai != null)
	//*  20   42:aload           5
	//*  21   44:ifnull          149
				{
					ai[0] = 0;
	//   22   47:aload           5
	//   23   49:iconst_0        
	//   24   50:iconst_0        
	//   25   51:iastore         
					ai[1] = 0;
	//   26   52:aload           5
	//   27   54:iconst_1        
	//   28   55:iconst_0        
	//   29   56:iastore         
					return false;
	//   30   57:iconst_0        
	//   31   58:ireturn         
				}
			} else
			{
				int j1;
				int k1;
				if(ai != null)
	//*  32   59:aload           5
	//*  33   61:ifnull          88
				{
					mView.getLocationInWindow(ai);
	//   34   64:aload_0         
	//   35   65:getfield        #21  <Field View mView>
	//   36   68:aload           5
	//   37   70:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					j1 = ai[0];
	//   38   73:aload           5
	//   39   75:iconst_0        
	//   40   76:iaload          
	//   41   77:istore          7
					k1 = ai[1];
	//   42   79:aload           5
	//   43   81:iconst_1        
	//   44   82:iaload          
	//   45   83:istore          8
				} else
	//*  46   85:goto            95
				{
					j1 = 0;
	//   47   88:iconst_0        
	//   48   89:istore          7
					k1 = j1;
	//   49   91:iload           7
	//   50   93:istore          8
				}
				ViewParentCompat.onNestedScroll(viewparent, mView, i, j, k, l, i1);
	//   51   95:aload           9
	//   52   97:aload_0         
	//   53   98:getfield        #21  <Field View mView>
	//   54  101:iload_1         
	//   55  102:iload_2         
	//   56  103:iload_3         
	//   57  104:iload           4
	//   58  106:iload           6
	//   59  108:invokestatic    #78  <Method void ViewParentCompat.onNestedScroll(ViewParent, View, int, int, int, int, int)>
				if(ai != null)
	//*  60  111:aload           5
	//*  61  113:ifnull          147
				{
					mView.getLocationInWindow(ai);
	//   62  116:aload_0         
	//   63  117:getfield        #21  <Field View mView>
	//   64  120:aload           5
	//   65  122:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					ai[0] = ai[0] - j1;
	//   66  125:aload           5
	//   67  127:iconst_0        
	//   68  128:aload           5
	//   69  130:iconst_0        
	//   70  131:iaload          
	//   71  132:iload           7
	//   72  134:isub            
	//   73  135:iastore         
					ai[1] = ai[1] - k1;
	//   74  136:aload           5
	//   75  138:iconst_1        
	//   76  139:aload           5
	//   77  141:iconst_1        
	//   78  142:iaload          
	//   79  143:iload           8
	//   80  145:isub            
	//   81  146:iastore         
				}
				return true;
	//   82  147:iconst_1        
	//   83  148:ireturn         
			}
		}
		return false;
	//   84  149:iconst_0        
	//   85  150:ireturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return hasNestedScrollingParent(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #82  <Method boolean hasNestedScrollingParent(int)>
	//    3    5:ireturn         
	}

	public boolean hasNestedScrollingParent(int i)
	{
		return getNestedScrollingParentForType(i) != null;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mIsNestedScrollingEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean mIsNestedScrollingEnabled>
	//    2    4:ireturn         
	}

	public void onDetachedFromWindow()
	{
		ViewCompat.stopNestedScroll(mView);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View mView>
	//    2    4:invokestatic    #90  <Method void ViewCompat.stopNestedScroll(View)>
	//    3    7:return          
	}

	public void onStopNestedScroll(View view)
	{
		ViewCompat.stopNestedScroll(mView);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field View mView>
	//    2    4:invokestatic    #90  <Method void ViewCompat.stopNestedScroll(View)>
	//    3    7:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		if(mIsNestedScrollingEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean mIsNestedScrollingEnabled>
	//*   2    4:ifeq            14
			ViewCompat.stopNestedScroll(mView);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field View mView>
	//    5   11:invokestatic    #90  <Method void ViewCompat.stopNestedScroll(View)>
		mIsNestedScrollingEnabled = flag;
	//    6   14:aload_0         
	//    7   15:iload_1         
	//    8   16:putfield        #84  <Field boolean mIsNestedScrollingEnabled>
	//    9   19:return          
	}

	public boolean startNestedScroll(int i)
	{
		return startNestedScroll(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #97  <Method boolean startNestedScroll(int, int)>
	//    4    6:ireturn         
	}

	public boolean startNestedScroll(int i, int j)
	{
		if(hasNestedScrollingParent(j))
	//*   0    0:aload_0         
	//*   1    1:iload_2         
	//*   2    2:invokevirtual   #82  <Method boolean hasNestedScrollingParent(int)>
	//*   3    5:ifeq            10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		if(isNestedScrollingEnabled())
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   8   14:ifeq            93
		{
			ViewParent viewparent = mView.getParent();
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field View mView>
	//   11   21:invokevirtual   #101 <Method ViewParent View.getParent()>
	//   12   24:astore_3        
			View view = mView;
	//   13   25:aload_0         
	//   14   26:getfield        #21  <Field View mView>
	//   15   29:astore          4
			for(; viewparent != null; viewparent = viewparent.getParent())
	//*  16   31:aload_3         
	//*  17   32:ifnull          93
			{
				if(ViewParentCompat.onStartNestedScroll(viewparent, view, mView, i, j))
	//*  18   35:aload_3         
	//*  19   36:aload           4
	//*  20   38:aload_0         
	//*  21   39:getfield        #21  <Field View mView>
	//*  22   42:iload_1         
	//*  23   43:iload_2         
	//*  24   44:invokestatic    #105 <Method boolean ViewParentCompat.onStartNestedScroll(ViewParent, View, View, int, int)>
	//*  25   47:ifeq            70
				{
					setNestedScrollingParentForType(j, viewparent);
	//   26   50:aload_0         
	//   27   51:iload_2         
	//   28   52:aload_3         
	//   29   53:invokespecial   #107 <Method void setNestedScrollingParentForType(int, ViewParent)>
					ViewParentCompat.onNestedScrollAccepted(viewparent, view, mView, i, j);
	//   30   56:aload_3         
	//   31   57:aload           4
	//   32   59:aload_0         
	//   33   60:getfield        #21  <Field View mView>
	//   34   63:iload_1         
	//   35   64:iload_2         
	//   36   65:invokestatic    #111 <Method void ViewParentCompat.onNestedScrollAccepted(ViewParent, View, View, int, int)>
					return true;
	//   37   68:iconst_1        
	//   38   69:ireturn         
				}
				if(viewparent instanceof View)
	//*  39   70:aload_3         
	//*  40   71:instanceof      #59  <Class View>
	//*  41   74:ifeq            83
					view = (View)viewparent;
	//   42   77:aload_3         
	//   43   78:checkcast       #59  <Class View>
	//   44   81:astore          4
			}

	//   45   83:aload_3         
	//   46   84:invokeinterface #114 <Method ViewParent ViewParent.getParent()>
	//   47   89:astore_3        
		}
	//*  48   90:goto            31
		return false;
	//   49   93:iconst_0        
	//   50   94:ireturn         
	}

	public void stopNestedScroll()
	{
		stopNestedScroll(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #117 <Method void stopNestedScroll(int)>
	//    3    5:return          
	}

	public void stopNestedScroll(int i)
	{
		ViewParent viewparent = getNestedScrollingParentForType(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    3    5:astore_2        
		if(viewparent != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          25
		{
			ViewParentCompat.onStopNestedScroll(viewparent, mView, i);
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:getfield        #21  <Field View mView>
	//    9   15:iload_1         
	//   10   16:invokestatic    #120 <Method void ViewParentCompat.onStopNestedScroll(ViewParent, View, int)>
			setNestedScrollingParentForType(i, ((ViewParent) (null)));
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:aconst_null     
	//   14   22:invokespecial   #107 <Method void setNestedScrollingParentForType(int, ViewParent)>
		}
	//   15   25:return          
	}

	private boolean mIsNestedScrollingEnabled;
	private ViewParent mNestedScrollingParentNonTouch;
	private ViewParent mNestedScrollingParentTouch;
	private int mTempNestedScrollConsumed[];
	private final View mView;
}
