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
	//	               0 26
	//	               1 31
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 0: // '\0'
			return mNestedScrollingParentTouch;
	//    4   26:aload_0         
	//    5   27:getfield        #27  <Field ViewParent mNestedScrollingParentTouch>
	//    6   30:areturn         

		case 1: // '\001'
			return mNestedScrollingParentNonTouch;
	//    7   31:aload_0         
	//    8   32:getfield        #29  <Field ViewParent mNestedScrollingParentNonTouch>
	//    9   35:areturn         
		}
	}

	private void setNestedScrollingParentForType(int i, ViewParent viewparent)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 25
	//	               1 31
		default:
			return;
	//    2   24:return          

		case 0: // '\0'
			mNestedScrollingParentTouch = viewparent;
	//    3   25:aload_0         
	//    4   26:aload_2         
	//    5   27:putfield        #27  <Field ViewParent mNestedScrollingParentTouch>
			return;
	//    6   30:return          

		case 1: // '\001'
			mNestedScrollingParentNonTouch = viewparent;
	//    7   31:aload_0         
	//    8   32:aload_2         
	//    9   33:putfield        #29  <Field ViewParent mNestedScrollingParentNonTouch>
			break;
		}
	//   10   36:return          
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		boolean flag1 = flag2;
	//    2    3:iload           5
	//    3    5:istore          4
		if(isNestedScrollingEnabled())
	//*   4    7:aload_0         
	//*   5    8:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   6   11:ifeq            44
		{
			ViewParent viewparent = getNestedScrollingParentForType(0);
	//    7   14:aload_0         
	//    8   15:iconst_0        
	//    9   16:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//   10   19:astore          6
			flag1 = flag2;
	//   11   21:iload           5
	//   12   23:istore          4
			if(viewparent != null)
	//*  13   25:aload           6
	//*  14   27:ifnull          44
				flag1 = ViewParentCompat.onNestedFling(viewparent, mView, f, f1, flag);
	//   15   30:aload           6
	//   16   32:aload_0         
	//   17   33:getfield        #21  <Field View mView>
	//   18   36:fload_1         
	//   19   37:fload_2         
	//   20   38:iload_3         
	//   21   39:invokestatic    #45  <Method boolean ViewParentCompat.onNestedFling(ViewParent, View, float, float, boolean)>
	//   22   42:istore          4
		}
		return flag1;
	//   23   44:iload           4
	//   24   46:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag = flag1;
	//    2    3:iload           4
	//    3    5:istore_3        
		if(isNestedScrollingEnabled())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #37  <Method boolean isNestedScrollingEnabled()>
	//*   6   10:ifeq            40
		{
			ViewParent viewparent = getNestedScrollingParentForType(0);
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//   10   18:astore          5
			flag = flag1;
	//   11   20:iload           4
	//   12   22:istore_3        
			if(viewparent != null)
	//*  13   23:aload           5
	//*  14   25:ifnull          40
				flag = ViewParentCompat.onNestedPreFling(viewparent, mView, f, f1);
	//   15   28:aload           5
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field View mView>
	//   18   34:fload_1         
	//   19   35:fload_2         
	//   20   36:invokestatic    #51  <Method boolean ViewParentCompat.onNestedPreFling(ViewParent, View, float, float)>
	//   21   39:istore_3        
		}
		return flag;
	//   22   40:iload_3         
	//   23   41:ireturn         
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
	//*   2    4:ifeq            20
		{
			ViewParent viewparent = getNestedScrollingParentForType(k);
	//    3    7:aload_0         
	//    4    8:iload           5
	//    5   10:invokespecial   #39  <Method ViewParent getNestedScrollingParentForType(int)>
	//    6   13:astore          10
			if(viewparent != null)
	//*   7   15:aload           10
	//*   8   17:ifnonnull       22
	//*   9   20:iconst_0        
	//*  10   21:ireturn         
			{
				if(i != 0 || j != 0)
	//*  11   22:iload_1         
	//*  12   23:ifne            30
	//*  13   26:iload_2         
	//*  14   27:ifeq            176
				{
					int l = 0;
	//   15   30:iconst_0        
	//   16   31:istore          6
					int i1 = 0;
	//   17   33:iconst_0        
	//   18   34:istore          7
					if(ai1 != null)
	//*  19   36:aload           4
	//*  20   38:ifnull          62
					{
						mView.getLocationInWindow(ai1);
	//   21   41:aload_0         
	//   22   42:getfield        #21  <Field View mView>
	//   23   45:aload           4
	//   24   47:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
						l = ai1[0];
	//   25   50:aload           4
	//   26   52:iconst_0        
	//   27   53:iaload          
	//   28   54:istore          6
						i1 = ai1[1];
	//   29   56:aload           4
	//   30   58:iconst_1        
	//   31   59:iaload          
	//   32   60:istore          7
					}
					int ai2[] = ai;
	//   33   62:aload_3         
	//   34   63:astore          9
					if(ai == null)
	//*  35   65:aload_3         
	//*  36   66:ifnonnull       89
					{
						if(mTempNestedScrollConsumed == null)
	//*  37   69:aload_0         
	//*  38   70:getfield        #65  <Field int[] mTempNestedScrollConsumed>
	//*  39   73:ifnonnull       83
							mTempNestedScrollConsumed = new int[2];
	//   40   76:aload_0         
	//   41   77:iconst_2        
	//   42   78:newarray        int[]
	//   43   80:putfield        #65  <Field int[] mTempNestedScrollConsumed>
						ai2 = mTempNestedScrollConsumed;
	//   44   83:aload_0         
	//   45   84:getfield        #65  <Field int[] mTempNestedScrollConsumed>
	//   46   87:astore          9
					}
					ai2[0] = 0;
	//   47   89:aload           9
	//   48   91:iconst_0        
	//   49   92:iconst_0        
	//   50   93:iastore         
					ai2[1] = 0;
	//   51   94:aload           9
	//   52   96:iconst_1        
	//   53   97:iconst_0        
	//   54   98:iastore         
					ViewParentCompat.onNestedPreScroll(viewparent, mView, i, j, ai2, k);
	//   55   99:aload           10
	//   56  101:aload_0         
	//   57  102:getfield        #21  <Field View mView>
	//   58  105:iload_1         
	//   59  106:iload_2         
	//   60  107:aload           9
	//   61  109:iload           5
	//   62  111:invokestatic    #69  <Method void ViewParentCompat.onNestedPreScroll(ViewParent, View, int, int, int[], int)>
					if(ai1 != null)
	//*  63  114:aload           4
	//*  64  116:ifnull          150
					{
						mView.getLocationInWindow(ai1);
	//   65  119:aload_0         
	//   66  120:getfield        #21  <Field View mView>
	//   67  123:aload           4
	//   68  125:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
						ai1[0] = ai1[0] - l;
	//   69  128:aload           4
	//   70  130:iconst_0        
	//   71  131:aload           4
	//   72  133:iconst_0        
	//   73  134:iaload          
	//   74  135:iload           6
	//   75  137:isub            
	//   76  138:iastore         
						ai1[1] = ai1[1] - i1;
	//   77  139:aload           4
	//   78  141:iconst_1        
	//   79  142:aload           4
	//   80  144:iconst_1        
	//   81  145:iaload          
	//   82  146:iload           7
	//   83  148:isub            
	//   84  149:iastore         
					}
					boolean flag;
					if(ai2[0] != 0 || ai2[1] != 0)
	//*  85  150:aload           9
	//*  86  152:iconst_0        
	//*  87  153:iaload          
	//*  88  154:ifne            164
	//*  89  157:aload           9
	//*  90  159:iconst_1        
	//*  91  160:iaload          
	//*  92  161:ifeq            170
						flag = true;
	//   93  164:iconst_1        
	//   94  165:istore          8
					else
	//*  95  167:iload           8
	//*  96  169:ireturn         
						flag = false;
	//   97  170:iconst_0        
	//   98  171:istore          8
					return flag;
				}
	//*  99  173:goto            167
				if(ai1 != null)
	//* 100  176:aload           4
	//* 101  178:ifnull          20
				{
					ai1[0] = 0;
	//  102  181:aload           4
	//  103  183:iconst_0        
	//  104  184:iconst_0        
	//  105  185:iastore         
					ai1[1] = 0;
	//  106  186:aload           4
	//  107  188:iconst_1        
	//  108  189:iconst_0        
	//  109  190:iastore         
					return false;
	//  110  191:iconst_0        
	//  111  192:ireturn         
				}
			}
		}
		return false;
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
	//*   2    4:ifeq            140
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
			if(i != 0 || j != 0 || k != 0 || l != 0)
	//*  11   22:iload_1         
	//*  12   23:ifne            39
	//*  13   26:iload_2         
	//*  14   27:ifne            39
	//*  15   30:iload_3         
	//*  16   31:ifne            39
	//*  17   34:iload           4
	//*  18   36:ifeq            125
			{
				int j1 = 0;
	//   19   39:iconst_0        
	//   20   40:istore          7
				int k1 = 0;
	//   21   42:iconst_0        
	//   22   43:istore          8
				if(ai != null)
	//*  23   45:aload           5
	//*  24   47:ifnull          71
				{
					mView.getLocationInWindow(ai);
	//   25   50:aload_0         
	//   26   51:getfield        #21  <Field View mView>
	//   27   54:aload           5
	//   28   56:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					j1 = ai[0];
	//   29   59:aload           5
	//   30   61:iconst_0        
	//   31   62:iaload          
	//   32   63:istore          7
					k1 = ai[1];
	//   33   65:aload           5
	//   34   67:iconst_1        
	//   35   68:iaload          
	//   36   69:istore          8
				}
				ViewParentCompat.onNestedScroll(viewparent, mView, i, j, k, l, i1);
	//   37   71:aload           9
	//   38   73:aload_0         
	//   39   74:getfield        #21  <Field View mView>
	//   40   77:iload_1         
	//   41   78:iload_2         
	//   42   79:iload_3         
	//   43   80:iload           4
	//   44   82:iload           6
	//   45   84:invokestatic    #78  <Method void ViewParentCompat.onNestedScroll(ViewParent, View, int, int, int, int, int)>
				if(ai != null)
	//*  46   87:aload           5
	//*  47   89:ifnull          123
				{
					mView.getLocationInWindow(ai);
	//   48   92:aload_0         
	//   49   93:getfield        #21  <Field View mView>
	//   50   96:aload           5
	//   51   98:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					ai[0] = ai[0] - j1;
	//   52  101:aload           5
	//   53  103:iconst_0        
	//   54  104:aload           5
	//   55  106:iconst_0        
	//   56  107:iaload          
	//   57  108:iload           7
	//   58  110:isub            
	//   59  111:iastore         
					ai[1] = ai[1] - k1;
	//   60  112:aload           5
	//   61  114:iconst_1        
	//   62  115:aload           5
	//   63  117:iconst_1        
	//   64  118:iaload          
	//   65  119:iload           8
	//   66  121:isub            
	//   67  122:iastore         
				}
				return true;
	//   68  123:iconst_1        
	//   69  124:ireturn         
			}
			if(ai != null)
	//*  70  125:aload           5
	//*  71  127:ifnull          140
			{
				ai[0] = 0;
	//   72  130:aload           5
	//   73  132:iconst_0        
	//   74  133:iconst_0        
	//   75  134:iastore         
				ai[1] = 0;
	//   76  135:aload           5
	//   77  137:iconst_1        
	//   78  138:iconst_0        
	//   79  139:iastore         
			}
		}
		return false;
	//   80  140:iconst_0        
	//   81  141:ireturn         
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
