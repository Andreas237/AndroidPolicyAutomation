// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.view.animation.AnimationUtils;
import android.widget.*;

// Referenced classes of package android.support.v4.app:
//			Fragment

public class ListFragment extends Fragment
{

	public ListFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Fragment()>
	//    2    4:aload_0         
	//    3    5:new             #41  <Class Handler>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void Handler()>
	//    6   12:putfield        #44  <Field Handler mHandler>
	//    7   15:aload_0         
	//    8   16:new             #6   <Class ListFragment$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #47  <Method void ListFragment$1(ListFragment)>
	//   12   24:putfield        #49  <Field Runnable mRequestFocus>
	//   13   27:aload_0         
	//   14   28:new             #8   <Class ListFragment$2>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #50  <Method void ListFragment$2(ListFragment)>
	//   18   36:putfield        #52  <Field android.widget.AdapterView$OnItemClickListener mOnClickListener>
	//   19   39:return          
	}

	private void ensureList()
	{
		if(mList != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field ListView mList>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		Object obj = ((Object) (getView()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #60  <Method View getView()>
	//    6   12:astore_1        
		if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          254
		{
			if(obj instanceof ListView)
	//*   9   17:aload_1         
	//*  10   18:instanceof      #62  <Class ListView>
	//*  11   21:ifeq            35
			{
				mList = (ListView)obj;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:checkcast       #62  <Class ListView>
	//   15   29:putfield        #56  <Field ListView mList>
			} else
	//*  16   32:goto            190
			{
				mStandardEmptyView = (TextView)((View) (obj)).findViewById(0xff0001);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:ldc1            #11  <Int 0xff0001>
	//   20   39:invokevirtual   #68  <Method View View.findViewById(int)>
	//   21   42:checkcast       #70  <Class TextView>
	//   22   45:putfield        #72  <Field TextView mStandardEmptyView>
				TextView textview = mStandardEmptyView;
	//   23   48:aload_0         
	//   24   49:getfield        #72  <Field TextView mStandardEmptyView>
	//   25   52:astore_2        
				if(textview == null)
	//*  26   53:aload_2         
	//*  27   54:ifnonnull       70
					mEmptyView = ((View) (obj)).findViewById(0x1020004);
	//   28   57:aload_0         
	//   29   58:aload_1         
	//   30   59:ldc1            #73  <Int 0x1020004>
	//   31   61:invokevirtual   #68  <Method View View.findViewById(int)>
	//   32   64:putfield        #75  <Field View mEmptyView>
				else
	//*  33   67:goto            76
					textview.setVisibility(8);
	//   34   70:aload_2         
	//   35   71:bipush          8
	//   36   73:invokevirtual   #79  <Method void TextView.setVisibility(int)>
				mProgressContainer = ((View) (obj)).findViewById(0xff0002);
	//   37   76:aload_0         
	//   38   77:aload_1         
	//   39   78:ldc1            #15  <Int 0xff0002>
	//   40   80:invokevirtual   #68  <Method View View.findViewById(int)>
	//   41   83:putfield        #81  <Field View mProgressContainer>
				mListContainer = ((View) (obj)).findViewById(0xff0003);
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:ldc1            #13  <Int 0xff0003>
	//   45   90:invokevirtual   #68  <Method View View.findViewById(int)>
	//   46   93:putfield        #83  <Field View mListContainer>
				obj = ((Object) (((View) (obj)).findViewById(0x102000a)));
	//   47   96:aload_1         
	//   48   97:ldc1            #84  <Int 0x102000a>
	//   49   99:invokevirtual   #68  <Method View View.findViewById(int)>
	//   50  102:astore_1        
				if(!(obj instanceof ListView))
	//*  51  103:aload_1         
	//*  52  104:instanceof      #62  <Class ListView>
	//*  53  107:ifne            134
					if(obj == null)
	//*  54  110:aload_1         
	//*  55  111:ifnonnull       124
						throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
	//   56  114:new             #86  <Class RuntimeException>
	//   57  117:dup             
	//   58  118:ldc1            #88  <String "Your content must have a ListView whose id attribute is 'android.R.id.list'">
	//   59  120:invokespecial   #91  <Method void RuntimeException(String)>
	//   60  123:athrow          
					else
						throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
	//   61  124:new             #86  <Class RuntimeException>
	//   62  127:dup             
	//   63  128:ldc1            #93  <String "Content has view with id attribute 'android.R.id.list' that is not a ListView class">
	//   64  130:invokespecial   #91  <Method void RuntimeException(String)>
	//   65  133:athrow          
				mList = (ListView)obj;
	//   66  134:aload_0         
	//   67  135:aload_1         
	//   68  136:checkcast       #62  <Class ListView>
	//   69  139:putfield        #56  <Field ListView mList>
				obj = ((Object) (mEmptyView));
	//   70  142:aload_0         
	//   71  143:getfield        #75  <Field View mEmptyView>
	//   72  146:astore_1        
				if(obj != null)
	//*  73  147:aload_1         
	//*  74  148:ifnull          162
				{
					mList.setEmptyView(((View) (obj)));
	//   75  151:aload_0         
	//   76  152:getfield        #56  <Field ListView mList>
	//   77  155:aload_1         
	//   78  156:invokevirtual   #97  <Method void ListView.setEmptyView(View)>
				} else
	//*  79  159:goto            190
				{
					obj = ((Object) (mEmptyText));
	//   80  162:aload_0         
	//   81  163:getfield        #99  <Field CharSequence mEmptyText>
	//   82  166:astore_1        
					if(obj != null)
	//*  83  167:aload_1         
	//*  84  168:ifnull          190
					{
						mStandardEmptyView.setText(((CharSequence) (obj)));
	//   85  171:aload_0         
	//   86  172:getfield        #72  <Field TextView mStandardEmptyView>
	//   87  175:aload_1         
	//   88  176:invokevirtual   #103 <Method void TextView.setText(CharSequence)>
						mList.setEmptyView(((View) (mStandardEmptyView)));
	//   89  179:aload_0         
	//   90  180:getfield        #56  <Field ListView mList>
	//   91  183:aload_0         
	//   92  184:getfield        #72  <Field TextView mStandardEmptyView>
	//   93  187:invokevirtual   #97  <Method void ListView.setEmptyView(View)>
					}
				}
			}
			mListShown = true;
	//   94  190:aload_0         
	//   95  191:iconst_1        
	//   96  192:putfield        #105 <Field boolean mListShown>
			mList.setOnItemClickListener(mOnClickListener);
	//   97  195:aload_0         
	//   98  196:getfield        #56  <Field ListView mList>
	//   99  199:aload_0         
	//  100  200:getfield        #52  <Field android.widget.AdapterView$OnItemClickListener mOnClickListener>
	//  101  203:invokevirtual   #109 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			obj = ((Object) (mAdapter));
	//  102  206:aload_0         
	//  103  207:getfield        #111 <Field ListAdapter mAdapter>
	//  104  210:astore_1        
			if(obj != null)
	//* 105  211:aload_1         
	//* 106  212:ifnull          228
			{
				mAdapter = null;
	//  107  215:aload_0         
	//  108  216:aconst_null     
	//  109  217:putfield        #111 <Field ListAdapter mAdapter>
				setListAdapter(((ListAdapter) (obj)));
	//  110  220:aload_0         
	//  111  221:aload_1         
	//  112  222:invokevirtual   #115 <Method void setListAdapter(ListAdapter)>
			} else
	//* 113  225:goto            241
			if(mProgressContainer != null)
	//* 114  228:aload_0         
	//* 115  229:getfield        #81  <Field View mProgressContainer>
	//* 116  232:ifnull          241
				setListShown(false, false);
	//  117  235:aload_0         
	//  118  236:iconst_0        
	//  119  237:iconst_0        
	//  120  238:invokespecial   #119 <Method void setListShown(boolean, boolean)>
			mHandler.post(mRequestFocus);
	//  121  241:aload_0         
	//  122  242:getfield        #44  <Field Handler mHandler>
	//  123  245:aload_0         
	//  124  246:getfield        #49  <Field Runnable mRequestFocus>
	//  125  249:invokevirtual   #123 <Method boolean Handler.post(Runnable)>
	//  126  252:pop             
			return;
	//  127  253:return          
		} else
		{
			throw new IllegalStateException("Content view not yet created");
	//  128  254:new             #125 <Class IllegalStateException>
	//  129  257:dup             
	//  130  258:ldc1            #127 <String "Content view not yet created">
	//  131  260:invokespecial   #128 <Method void IllegalStateException(String)>
	//  132  263:athrow          
		}
	}

	private void setListShown(boolean flag, boolean flag1)
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		View view = mProgressContainer;
	//    2    4:aload_0         
	//    3    5:getfield        #81  <Field View mProgressContainer>
	//    4    8:astore_3        
		if(view != null)
	//*   5    9:aload_3         
	//*   6   10:ifnull          161
		{
			if(mListShown == flag)
	//*   7   13:aload_0         
	//*   8   14:getfield        #105 <Field boolean mListShown>
	//*   9   17:iload_1         
	//*  10   18:icmpne          22
				return;
	//   11   21:return          
			mListShown = flag;
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:putfield        #105 <Field boolean mListShown>
			if(flag)
	//*  15   27:iload_1         
	//*  16   28:ifeq            96
			{
				if(flag1)
	//*  17   31:iload_2         
	//*  18   32:ifeq            67
				{
					view.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0001));
	//   19   35:aload_3         
	//   20   36:aload_0         
	//   21   37:invokevirtual   #134 <Method android.content.Context getContext()>
	//   22   40:ldc1            #135 <Int 0x10a0001>
	//   23   42:invokestatic    #141 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   24   45:invokevirtual   #145 <Method void View.startAnimation(android.view.animation.Animation)>
					mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0000));
	//   25   48:aload_0         
	//   26   49:getfield        #83  <Field View mListContainer>
	//   27   52:aload_0         
	//   28   53:invokevirtual   #134 <Method android.content.Context getContext()>
	//   29   56:ldc1            #146 <Int 0x10a0000>
	//   30   58:invokestatic    #141 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   31   61:invokevirtual   #145 <Method void View.startAnimation(android.view.animation.Animation)>
				} else
	//*  32   64:goto            78
				{
					view.clearAnimation();
	//   33   67:aload_3         
	//   34   68:invokevirtual   #149 <Method void View.clearAnimation()>
					mListContainer.clearAnimation();
	//   35   71:aload_0         
	//   36   72:getfield        #83  <Field View mListContainer>
	//   37   75:invokevirtual   #149 <Method void View.clearAnimation()>
				}
				mProgressContainer.setVisibility(8);
	//   38   78:aload_0         
	//   39   79:getfield        #81  <Field View mProgressContainer>
	//   40   82:bipush          8
	//   41   84:invokevirtual   #150 <Method void View.setVisibility(int)>
				mListContainer.setVisibility(0);
	//   42   87:aload_0         
	//   43   88:getfield        #83  <Field View mListContainer>
	//   44   91:iconst_0        
	//   45   92:invokevirtual   #150 <Method void View.setVisibility(int)>
				return;
	//   46   95:return          
			}
			if(flag1)
	//*  47   96:iload_2         
	//*  48   97:ifeq            132
			{
				view.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0000));
	//   49  100:aload_3         
	//   50  101:aload_0         
	//   51  102:invokevirtual   #134 <Method android.content.Context getContext()>
	//   52  105:ldc1            #146 <Int 0x10a0000>
	//   53  107:invokestatic    #141 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   54  110:invokevirtual   #145 <Method void View.startAnimation(android.view.animation.Animation)>
				mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0001));
	//   55  113:aload_0         
	//   56  114:getfield        #83  <Field View mListContainer>
	//   57  117:aload_0         
	//   58  118:invokevirtual   #134 <Method android.content.Context getContext()>
	//   59  121:ldc1            #135 <Int 0x10a0001>
	//   60  123:invokestatic    #141 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   61  126:invokevirtual   #145 <Method void View.startAnimation(android.view.animation.Animation)>
			} else
	//*  62  129:goto            143
			{
				view.clearAnimation();
	//   63  132:aload_3         
	//   64  133:invokevirtual   #149 <Method void View.clearAnimation()>
				mListContainer.clearAnimation();
	//   65  136:aload_0         
	//   66  137:getfield        #83  <Field View mListContainer>
	//   67  140:invokevirtual   #149 <Method void View.clearAnimation()>
			}
			mProgressContainer.setVisibility(0);
	//   68  143:aload_0         
	//   69  144:getfield        #81  <Field View mProgressContainer>
	//   70  147:iconst_0        
	//   71  148:invokevirtual   #150 <Method void View.setVisibility(int)>
			mListContainer.setVisibility(8);
	//   72  151:aload_0         
	//   73  152:getfield        #83  <Field View mListContainer>
	//   74  155:bipush          8
	//   75  157:invokevirtual   #150 <Method void View.setVisibility(int)>
			return;
	//   76  160:return          
		} else
		{
			throw new IllegalStateException("Can't be used with a custom content view");
	//   77  161:new             #125 <Class IllegalStateException>
	//   78  164:dup             
	//   79  165:ldc1            #152 <String "Can't be used with a custom content view">
	//   80  167:invokespecial   #128 <Method void IllegalStateException(String)>
	//   81  170:athrow          
		}
	}

	public ListAdapter getListAdapter()
	{
		return mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field ListAdapter mAdapter>
	//    2    4:areturn         
	}

	public ListView getListView()
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		return mList;
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ListView mList>
	//    4    8:areturn         
	}

	public long getSelectedItemId()
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		return mList.getSelectedItemId();
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ListView mList>
	//    4    8:invokevirtual   #160 <Method long ListView.getSelectedItemId()>
	//    5   11:lreturn         
	}

	public int getSelectedItemPosition()
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		return mList.getSelectedItemPosition();
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ListView mList>
	//    4    8:invokevirtual   #164 <Method int ListView.getSelectedItemPosition()>
	//    5   11:ireturn         
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		viewgroup = ((ViewGroup) (getContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method android.content.Context getContext()>
	//    2    4:astore_2        
		layoutinflater = ((LayoutInflater) (new FrameLayout(((android.content.Context) (viewgroup)))));
	//    3    5:new             #168 <Class FrameLayout>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #171 <Method void FrameLayout(android.content.Context)>
	//    7   13:astore_1        
		bundle = ((Bundle) (new LinearLayout(((android.content.Context) (viewgroup)))));
	//    8   14:new             #173 <Class LinearLayout>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #174 <Method void LinearLayout(android.content.Context)>
	//   12   22:astore_3        
		((LinearLayout) (bundle)).setId(0xff0002);
	//   13   23:aload_3         
	//   14   24:ldc1            #15  <Int 0xff0002>
	//   15   26:invokevirtual   #177 <Method void LinearLayout.setId(int)>
		((LinearLayout) (bundle)).setOrientation(1);
	//   16   29:aload_3         
	//   17   30:iconst_1        
	//   18   31:invokevirtual   #180 <Method void LinearLayout.setOrientation(int)>
		((LinearLayout) (bundle)).setVisibility(8);
	//   19   34:aload_3         
	//   20   35:bipush          8
	//   21   37:invokevirtual   #181 <Method void LinearLayout.setVisibility(int)>
		((LinearLayout) (bundle)).setGravity(17);
	//   22   40:aload_3         
	//   23   41:bipush          17
	//   24   43:invokevirtual   #184 <Method void LinearLayout.setGravity(int)>
		((LinearLayout) (bundle)).addView(((View) (new ProgressBar(((android.content.Context) (viewgroup)), ((android.util.AttributeSet) (null)), 0x101007a))), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   25   46:aload_3         
	//   26   47:new             #186 <Class ProgressBar>
	//   27   50:dup             
	//   28   51:aload_2         
	//   29   52:aconst_null     
	//   30   53:ldc1            #187 <Int 0x101007a>
	//   31   55:invokespecial   #190 <Method void ProgressBar(android.content.Context, android.util.AttributeSet, int)>
	//   32   58:new             #192 <Class android.widget.FrameLayout$LayoutParams>
	//   33   61:dup             
	//   34   62:bipush          -2
	//   35   64:bipush          -2
	//   36   66:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   37   69:invokevirtual   #199 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		((FrameLayout) (layoutinflater)).addView(((View) (bundle)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   38   72:aload_1         
	//   39   73:aload_3         
	//   40   74:new             #192 <Class android.widget.FrameLayout$LayoutParams>
	//   41   77:dup             
	//   42   78:iconst_m1       
	//   43   79:iconst_m1       
	//   44   80:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   45   83:invokevirtual   #200 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		bundle = ((Bundle) (new FrameLayout(((android.content.Context) (viewgroup)))));
	//   46   86:new             #168 <Class FrameLayout>
	//   47   89:dup             
	//   48   90:aload_2         
	//   49   91:invokespecial   #171 <Method void FrameLayout(android.content.Context)>
	//   50   94:astore_3        
		((FrameLayout) (bundle)).setId(0xff0003);
	//   51   95:aload_3         
	//   52   96:ldc1            #13  <Int 0xff0003>
	//   53   98:invokevirtual   #201 <Method void FrameLayout.setId(int)>
		TextView textview = new TextView(((android.content.Context) (viewgroup)));
	//   54  101:new             #70  <Class TextView>
	//   55  104:dup             
	//   56  105:aload_2         
	//   57  106:invokespecial   #202 <Method void TextView(android.content.Context)>
	//   58  109:astore          4
		textview.setId(0xff0001);
	//   59  111:aload           4
	//   60  113:ldc1            #11  <Int 0xff0001>
	//   61  115:invokevirtual   #203 <Method void TextView.setId(int)>
		textview.setGravity(17);
	//   62  118:aload           4
	//   63  120:bipush          17
	//   64  122:invokevirtual   #204 <Method void TextView.setGravity(int)>
		((FrameLayout) (bundle)).addView(((View) (textview)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   65  125:aload_3         
	//   66  126:aload           4
	//   67  128:new             #192 <Class android.widget.FrameLayout$LayoutParams>
	//   68  131:dup             
	//   69  132:iconst_m1       
	//   70  133:iconst_m1       
	//   71  134:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   72  137:invokevirtual   #200 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		viewgroup = ((ViewGroup) (new ListView(((android.content.Context) (viewgroup)))));
	//   73  140:new             #62  <Class ListView>
	//   74  143:dup             
	//   75  144:aload_2         
	//   76  145:invokespecial   #205 <Method void ListView(android.content.Context)>
	//   77  148:astore_2        
		((ListView) (viewgroup)).setId(0x102000a);
	//   78  149:aload_2         
	//   79  150:ldc1            #84  <Int 0x102000a>
	//   80  152:invokevirtual   #206 <Method void ListView.setId(int)>
		((ListView) (viewgroup)).setDrawSelectorOnTop(false);
	//   81  155:aload_2         
	//   82  156:iconst_0        
	//   83  157:invokevirtual   #210 <Method void ListView.setDrawSelectorOnTop(boolean)>
		((FrameLayout) (bundle)).addView(((View) (viewgroup)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   84  160:aload_3         
	//   85  161:aload_2         
	//   86  162:new             #192 <Class android.widget.FrameLayout$LayoutParams>
	//   87  165:dup             
	//   88  166:iconst_m1       
	//   89  167:iconst_m1       
	//   90  168:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   91  171:invokevirtual   #200 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		((FrameLayout) (layoutinflater)).addView(((View) (bundle)), ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   92  174:aload_1         
	//   93  175:aload_3         
	//   94  176:new             #192 <Class android.widget.FrameLayout$LayoutParams>
	//   95  179:dup             
	//   96  180:iconst_m1       
	//   97  181:iconst_m1       
	//   98  182:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   99  185:invokevirtual   #200 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		((FrameLayout) (layoutinflater)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//  100  188:aload_1         
	//  101  189:new             #192 <Class android.widget.FrameLayout$LayoutParams>
	//  102  192:dup             
	//  103  193:iconst_m1       
	//  104  194:iconst_m1       
	//  105  195:invokespecial   #195 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//  106  198:invokevirtual   #214 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		return ((View) (layoutinflater));
	//  107  201:aload_1         
	//  108  202:areturn         
	}

	public void onDestroyView()
	{
		mHandler.removeCallbacks(mRequestFocus);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #49  <Field Runnable mRequestFocus>
	//    4    8:invokevirtual   #219 <Method void Handler.removeCallbacks(Runnable)>
		mList = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #56  <Field ListView mList>
		mListShown = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #105 <Field boolean mListShown>
		mListContainer = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #83  <Field View mListContainer>
		mProgressContainer = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #81  <Field View mProgressContainer>
		mEmptyView = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #75  <Field View mEmptyView>
		mStandardEmptyView = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #72  <Field TextView mStandardEmptyView>
		super.onDestroyView();
	//   23   41:aload_0         
	//   24   42:invokespecial   #221 <Method void Fragment.onDestroyView()>
	//   25   45:return          
	}

	public void onListItemClick(ListView listview, View view, int i, long l)
	{
	//    0    0:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #229 <Method void Fragment.onViewCreated(View, Bundle)>
		ensureList();
	//    4    6:aload_0         
	//    5    7:invokespecial   #130 <Method void ensureList()>
	//    6   10:return          
	}

	public void setEmptyText(CharSequence charsequence)
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		TextView textview = mStandardEmptyView;
	//    2    4:aload_0         
	//    3    5:getfield        #72  <Field TextView mStandardEmptyView>
	//    4    8:astore_2        
		if(textview != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          42
		{
			textview.setText(charsequence);
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #103 <Method void TextView.setText(CharSequence)>
			if(mEmptyText == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #99  <Field CharSequence mEmptyText>
	//*  12   22:ifnonnull       36
				mList.setEmptyView(((View) (mStandardEmptyView)));
	//   13   25:aload_0         
	//   14   26:getfield        #56  <Field ListView mList>
	//   15   29:aload_0         
	//   16   30:getfield        #72  <Field TextView mStandardEmptyView>
	//   17   33:invokevirtual   #97  <Method void ListView.setEmptyView(View)>
			mEmptyText = charsequence;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #99  <Field CharSequence mEmptyText>
			return;
	//   21   41:return          
		} else
		{
			throw new IllegalStateException("Can't be used with a custom content view");
	//   22   42:new             #125 <Class IllegalStateException>
	//   23   45:dup             
	//   24   46:ldc1            #152 <String "Can't be used with a custom content view">
	//   25   48:invokespecial   #128 <Method void IllegalStateException(String)>
	//   26   51:athrow          
		}
	}

	public void setListAdapter(ListAdapter listadapter)
	{
		Object obj = ((Object) (mAdapter));
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field ListAdapter mAdapter>
	//    2    4:astore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag;
		if(obj != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          18
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			flag = false;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		mAdapter = listadapter;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #111 <Field ListAdapter mAdapter>
		obj = ((Object) (mList));
	//   15   25:aload_0         
	//   16   26:getfield        #56  <Field ListView mList>
	//   17   29:astore          4
		if(obj != null)
	//*  18   31:aload           4
	//*  19   33:ifnull          71
		{
			((ListView) (obj)).setAdapter(listadapter);
	//   20   36:aload           4
	//   21   38:aload_1         
	//   22   39:invokevirtual   #234 <Method void ListView.setAdapter(ListAdapter)>
			if(!mListShown && !flag)
	//*  23   42:aload_0         
	//*  24   43:getfield        #105 <Field boolean mListShown>
	//*  25   46:ifne            71
	//*  26   49:iload_2         
	//*  27   50:ifne            71
			{
				if(getView().getWindowToken() != null)
	//*  28   53:aload_0         
	//*  29   54:invokevirtual   #60  <Method View getView()>
	//*  30   57:invokevirtual   #238 <Method android.os.IBinder View.getWindowToken()>
	//*  31   60:ifnull          65
					flag1 = true;
	//   32   63:iconst_1        
	//   33   64:istore_3        
				setListShown(true, flag1);
	//   34   65:aload_0         
	//   35   66:iconst_1        
	//   36   67:iload_3         
	//   37   68:invokespecial   #119 <Method void setListShown(boolean, boolean)>
			}
		}
	//   38   71:return          
	}

	public void setListShown(boolean flag)
	{
		setListShown(flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #119 <Method void setListShown(boolean, boolean)>
	//    4    6:return          
	}

	public void setListShownNoAnimation(boolean flag)
	{
		setListShown(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #119 <Method void setListShown(boolean, boolean)>
	//    4    6:return          
	}

	public void setSelection(int i)
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		mList.setSelection(i);
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field ListView mList>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #242 <Method void ListView.setSelection(int)>
	//    6   12:return          
	}

	static final int INTERNAL_EMPTY_ID = 0xff0001;
	static final int INTERNAL_LIST_CONTAINER_ID = 0xff0003;
	static final int INTERNAL_PROGRESS_CONTAINER_ID = 0xff0002;
	ListAdapter mAdapter;
	CharSequence mEmptyText;
	View mEmptyView;
	private final Handler mHandler = new Handler();
	ListView mList;
	View mListContainer;
	boolean mListShown;
	private final android.widget.AdapterView.OnItemClickListener mOnClickListener = new android.widget.AdapterView.OnItemClickListener() {

		public void onItemClick(AdapterView adapterview, View view, int i, long l)
		{
			onListItemClick((ListView)adapterview, view, i, l);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ListFragment this$0>
		//    2    4:aload_1         
		//    3    5:checkcast       #22  <Class ListView>
		//    4    8:aload_2         
		//    5    9:iload_3         
		//    6   10:lload           4
		//    7   12:invokevirtual   #26  <Method void ListFragment.onListItemClick(ListView, View, int, long)>
		//    8   15:return          
		}

		final ListFragment this$0;

			
			{
				this$0 = ListFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ListFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	View mProgressContainer;
	private final Runnable mRequestFocus = new Runnable() {

		public void run()
		{
			mList.focusableViewAvailable(((View) (mList)));
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field ListFragment this$0>
		//    2    4:getfield        #23  <Field ListView ListFragment.mList>
		//    3    7:aload_0         
		//    4    8:getfield        #14  <Field ListFragment this$0>
		//    5   11:getfield        #23  <Field ListView ListFragment.mList>
		//    6   14:invokevirtual   #29  <Method void ListView.focusableViewAvailable(View)>
		//    7   17:return          
		}

		final ListFragment this$0;

			
			{
				this$0 = ListFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ListFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	TextView mStandardEmptyView;
}
