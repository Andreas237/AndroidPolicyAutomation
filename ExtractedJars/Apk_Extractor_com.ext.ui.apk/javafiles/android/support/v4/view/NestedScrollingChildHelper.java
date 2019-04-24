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
	//    6   13:astore          9
			if(viewparent != null)
	//*   7   15:aload           9
	//*   8   17:ifnonnull       22
	//*   9   20:iconst_0        
	//*  10   21:ireturn         
			{
				if(i != 0 || j != 0)
	//*  11   22:iload_1         
	//*  12   23:ifne            30
	//*  13   26:iload_2         
	//*  14   27:ifeq            161
				{
					int l;
					int i1;
					boolean flag;
					if(ai1 != null)
	//*  15   30:aload           4
	//*  16   32:ifnull          181
					{
						mView.getLocationInWindow(ai1);
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field View mView>
	//   19   39:aload           4
	//   20   41:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
						i1 = ai1[0];
	//   21   44:aload           4
	//   22   46:iconst_0        
	//   23   47:iaload          
	//   24   48:istore          7
						l = ai1[1];
	//   25   50:aload           4
	//   26   52:iconst_1        
	//   27   53:iaload          
	//   28   54:istore          6
					} else
	//*  29   56:aload_3         
	//*  30   57:ifnonnull       178
	//*  31   60:aload_0         
	//*  32   61:getfield        #65  <Field int[] mTempNestedScrollConsumed>
	//*  33   64:ifnonnull       74
	//*  34   67:aload_0         
	//*  35   68:iconst_2        
	//*  36   69:newarray        int[]
	//*  37   71:putfield        #65  <Field int[] mTempNestedScrollConsumed>
	//*  38   74:aload_0         
	//*  39   75:getfield        #65  <Field int[] mTempNestedScrollConsumed>
	//*  40   78:astore_3        
	//*  41   79:aload_3         
	//*  42   80:iconst_0        
	//*  43   81:iconst_0        
	//*  44   82:iastore         
	//*  45   83:aload_3         
	//*  46   84:iconst_1        
	//*  47   85:iconst_0        
	//*  48   86:iastore         
	//*  49   87:aload           9
	//*  50   89:aload_0         
	//*  51   90:getfield        #21  <Field View mView>
	//*  52   93:iload_1         
	//*  53   94:iload_2         
	//*  54   95:aload_3         
	//*  55   96:iload           5
	//*  56   98:invokestatic    #69  <Method void ViewParentCompat.onNestedPreScroll(ViewParent, View, int, int, int[], int)>
	//*  57  101:aload           4
	//*  58  103:ifnull          137
	//*  59  106:aload_0         
	//*  60  107:getfield        #21  <Field View mView>
	//*  61  110:aload           4
	//*  62  112:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
	//*  63  115:aload           4
	//*  64  117:iconst_0        
	//*  65  118:aload           4
	//*  66  120:iconst_0        
	//*  67  121:iaload          
	//*  68  122:iload           7
	//*  69  124:isub            
	//*  70  125:iastore         
	//*  71  126:aload           4
	//*  72  128:iconst_1        
	//*  73  129:aload           4
	//*  74  131:iconst_1        
	//*  75  132:iaload          
	//*  76  133:iload           6
	//*  77  135:isub            
	//*  78  136:iastore         
	//*  79  137:aload_3         
	//*  80  138:iconst_0        
	//*  81  139:iaload          
	//*  82  140:ifne            149
	//*  83  143:aload_3         
	//*  84  144:iconst_1        
	//*  85  145:iaload          
	//*  86  146:ifeq            155
	//*  87  149:iconst_1        
	//*  88  150:istore          8
	//*  89  152:iload           8
	//*  90  154:ireturn         
	//*  91  155:iconst_0        
	//*  92  156:istore          8
	//*  93  158:goto            152
	//*  94  161:aload           4
	//*  95  163:ifnull          20
	//*  96  166:aload           4
	//*  97  168:iconst_0        
	//*  98  169:iconst_0        
	//*  99  170:iastore         
	//* 100  171:aload           4
	//* 101  173:iconst_1        
	//* 102  174:iconst_0        
	//* 103  175:iastore         
	//* 104  176:iconst_0        
	//* 105  177:ireturn         
	//* 106  178:goto            79
					{
						l = 0;
	//  107  181:iconst_0        
	//  108  182:istore          6
						i1 = 0;
	//  109  184:iconst_0        
	//  110  185:istore          7
					}
					if(ai == null)
					{
						if(mTempNestedScrollConsumed == null)
							mTempNestedScrollConsumed = new int[2];
						ai = mTempNestedScrollConsumed;
					}
					ai[0] = 0;
					ai[1] = 0;
					ViewParentCompat.onNestedPreScroll(viewparent, mView, i, j, ai, k);
					if(ai1 != null)
					{
						mView.getLocationInWindow(ai1);
						ai1[0] = ai1[0] - i1;
						ai1[1] = ai1[1] - l;
					}
					if(ai[0] != 0 || ai[1] != 0)
						flag = true;
					else
						flag = false;
					return flag;
				}
				if(ai1 != null)
				{
					ai1[0] = 0;
					ai1[1] = 0;
					return false;
				}
			}
		}
		return false;
	//* 111  187:goto            56
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
	//*   2    4:ifeq            134
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
	//*  18   36:ifeq            119
			{
				int j1;
				int k1;
				if(ai != null)
	//*  19   39:aload           5
	//*  20   41:ifnull          136
				{
					mView.getLocationInWindow(ai);
	//   21   44:aload_0         
	//   22   45:getfield        #21  <Field View mView>
	//   23   48:aload           5
	//   24   50:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
					k1 = ai[0];
	//   25   53:aload           5
	//   26   55:iconst_0        
	//   27   56:iaload          
	//   28   57:istore          8
					j1 = ai[1];
	//   29   59:aload           5
	//   30   61:iconst_1        
	//   31   62:iaload          
	//   32   63:istore          7
				} else
	//*  33   65:aload           9
	//*  34   67:aload_0         
	//*  35   68:getfield        #21  <Field View mView>
	//*  36   71:iload_1         
	//*  37   72:iload_2         
	//*  38   73:iload_3         
	//*  39   74:iload           4
	//*  40   76:iload           6
	//*  41   78:invokestatic    #78  <Method void ViewParentCompat.onNestedScroll(ViewParent, View, int, int, int, int, int)>
	//*  42   81:aload           5
	//*  43   83:ifnull          117
	//*  44   86:aload_0         
	//*  45   87:getfield        #21  <Field View mView>
	//*  46   90:aload           5
	//*  47   92:invokevirtual   #63  <Method void View.getLocationInWindow(int[])>
	//*  48   95:aload           5
	//*  49   97:iconst_0        
	//*  50   98:aload           5
	//*  51  100:iconst_0        
	//*  52  101:iaload          
	//*  53  102:iload           8
	//*  54  104:isub            
	//*  55  105:iastore         
	//*  56  106:aload           5
	//*  57  108:iconst_1        
	//*  58  109:aload           5
	//*  59  111:iconst_1        
	//*  60  112:iaload          
	//*  61  113:iload           7
	//*  62  115:isub            
	//*  63  116:iastore         
	//*  64  117:iconst_1        
	//*  65  118:ireturn         
	//*  66  119:aload           5
	//*  67  121:ifnull          134
	//*  68  124:aload           5
	//*  69  126:iconst_0        
	//*  70  127:iconst_0        
	//*  71  128:iastore         
	//*  72  129:aload           5
	//*  73  131:iconst_1        
	//*  74  132:iconst_0        
	//*  75  133:iastore         
	//*  76  134:iconst_0        
	//*  77  135:ireturn         
				{
					j1 = 0;
	//   78  136:iconst_0        
	//   79  137:istore          7
					k1 = 0;
	//   80  139:iconst_0        
	//   81  140:istore          8
				}
				ViewParentCompat.onNestedScroll(viewparent, mView, i, j, k, l, i1);
				if(ai != null)
				{
					mView.getLocationInWindow(ai);
					ai[0] = ai[0] - k1;
					ai[1] = ai[1] - j1;
				}
				return true;
			}
			if(ai != null)
			{
				ai[0] = 0;
				ai[1] = 0;
			}
		}
		return false;
	//*  82  142:goto            65
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
