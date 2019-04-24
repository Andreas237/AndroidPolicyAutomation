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
		if(obj == null)
	//*   7   13:aload_1         
	//*   8   14:ifnonnull       27
			throw new IllegalStateException("Content view not yet created");
	//    9   17:new             #62  <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:ldc1            #64  <String "Content view not yet created">
	//   12   23:invokespecial   #67  <Method void IllegalStateException(String)>
	//   13   26:athrow          
		if(obj instanceof ListView)
	//*  14   27:aload_1         
	//*  15   28:instanceof      #69  <Class ListView>
	//*  16   31:ifeq            93
		{
			mList = (ListView)obj;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:checkcast       #69  <Class ListView>
	//   20   39:putfield        #56  <Field ListView mList>
		} else
	//*  21   42:aload_0         
	//*  22   43:iconst_1        
	//*  23   44:putfield        #71  <Field boolean mListShown>
	//*  24   47:aload_0         
	//*  25   48:getfield        #56  <Field ListView mList>
	//*  26   51:aload_0         
	//*  27   52:getfield        #52  <Field android.widget.AdapterView$OnItemClickListener mOnClickListener>
	//*  28   55:invokevirtual   #75  <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//*  29   58:aload_0         
	//*  30   59:getfield        #77  <Field ListAdapter mAdapter>
	//*  31   62:ifnull          254
	//*  32   65:aload_0         
	//*  33   66:getfield        #77  <Field ListAdapter mAdapter>
	//*  34   69:astore_1        
	//*  35   70:aload_0         
	//*  36   71:aconst_null     
	//*  37   72:putfield        #77  <Field ListAdapter mAdapter>
	//*  38   75:aload_0         
	//*  39   76:aload_1         
	//*  40   77:invokevirtual   #81  <Method void setListAdapter(ListAdapter)>
	//*  41   80:aload_0         
	//*  42   81:getfield        #44  <Field Handler mHandler>
	//*  43   84:aload_0         
	//*  44   85:getfield        #49  <Field Runnable mRequestFocus>
	//*  45   88:invokevirtual   #85  <Method boolean Handler.post(Runnable)>
	//*  46   91:pop             
	//*  47   92:return          
		{
			mStandardEmptyView = (TextView)((View) (obj)).findViewById(0xff0001);
	//   48   93:aload_0         
	//   49   94:aload_1         
	//   50   95:ldc1            #11  <Int 0xff0001>
	//   51   97:invokevirtual   #91  <Method View View.findViewById(int)>
	//   52  100:checkcast       #93  <Class TextView>
	//   53  103:putfield        #95  <Field TextView mStandardEmptyView>
			if(mStandardEmptyView == null)
	//*  54  106:aload_0         
	//*  55  107:getfield        #95  <Field TextView mStandardEmptyView>
	//*  56  110:ifnonnull       171
				mEmptyView = ((View) (obj)).findViewById(0x1020004);
	//   57  113:aload_0         
	//   58  114:aload_1         
	//   59  115:ldc1            #96  <Int 0x1020004>
	//   60  117:invokevirtual   #91  <Method View View.findViewById(int)>
	//   61  120:putfield        #98  <Field View mEmptyView>
			else
	//*  62  123:aload_0         
	//*  63  124:aload_1         
	//*  64  125:ldc1            #15  <Int 0xff0002>
	//*  65  127:invokevirtual   #91  <Method View View.findViewById(int)>
	//*  66  130:putfield        #100 <Field View mProgressContainer>
	//*  67  133:aload_0         
	//*  68  134:aload_1         
	//*  69  135:ldc1            #13  <Int 0xff0003>
	//*  70  137:invokevirtual   #91  <Method View View.findViewById(int)>
	//*  71  140:putfield        #102 <Field View mListContainer>
	//*  72  143:aload_1         
	//*  73  144:ldc1            #103 <Int 0x102000a>
	//*  74  146:invokevirtual   #91  <Method View View.findViewById(int)>
	//*  75  149:astore_1        
	//*  76  150:aload_1         
	//*  77  151:instanceof      #69  <Class ListView>
	//*  78  154:ifne            193
	//*  79  157:aload_1         
	//*  80  158:ifnonnull       183
	//*  81  161:new             #105 <Class RuntimeException>
	//*  82  164:dup             
	//*  83  165:ldc1            #107 <String "Your content must have a ListView whose id attribute is 'android.R.id.list'">
	//*  84  167:invokespecial   #108 <Method void RuntimeException(String)>
	//*  85  170:athrow          
				mStandardEmptyView.setVisibility(8);
	//   86  171:aload_0         
	//   87  172:getfield        #95  <Field TextView mStandardEmptyView>
	//   88  175:bipush          8
	//   89  177:invokevirtual   #112 <Method void TextView.setVisibility(int)>
			mProgressContainer = ((View) (obj)).findViewById(0xff0002);
			mListContainer = ((View) (obj)).findViewById(0xff0003);
			obj = ((Object) (((View) (obj)).findViewById(0x102000a)));
			if(!(obj instanceof ListView))
				if(obj == null)
					throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
				else
	//*  90  180:goto            123
					throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
	//   91  183:new             #105 <Class RuntimeException>
	//   92  186:dup             
	//   93  187:ldc1            #114 <String "Content has view with id attribute 'android.R.id.list' that is not a ListView class">
	//   94  189:invokespecial   #108 <Method void RuntimeException(String)>
	//   95  192:athrow          
			mList = (ListView)obj;
	//   96  193:aload_0         
	//   97  194:aload_1         
	//   98  195:checkcast       #69  <Class ListView>
	//   99  198:putfield        #56  <Field ListView mList>
			if(mEmptyView != null)
	//* 100  201:aload_0         
	//* 101  202:getfield        #98  <Field View mEmptyView>
	//* 102  205:ifnull          222
				mList.setEmptyView(mEmptyView);
	//  103  208:aload_0         
	//  104  209:getfield        #56  <Field ListView mList>
	//  105  212:aload_0         
	//  106  213:getfield        #98  <Field View mEmptyView>
	//  107  216:invokevirtual   #118 <Method void ListView.setEmptyView(View)>
			else
	//* 108  219:goto            42
			if(mEmptyText != null)
	//* 109  222:aload_0         
	//* 110  223:getfield        #120 <Field CharSequence mEmptyText>
	//* 111  226:ifnull          42
			{
				mStandardEmptyView.setText(mEmptyText);
	//  112  229:aload_0         
	//  113  230:getfield        #95  <Field TextView mStandardEmptyView>
	//  114  233:aload_0         
	//  115  234:getfield        #120 <Field CharSequence mEmptyText>
	//  116  237:invokevirtual   #124 <Method void TextView.setText(CharSequence)>
				mList.setEmptyView(((View) (mStandardEmptyView)));
	//  117  240:aload_0         
	//  118  241:getfield        #56  <Field ListView mList>
	//  119  244:aload_0         
	//  120  245:getfield        #95  <Field TextView mStandardEmptyView>
	//  121  248:invokevirtual   #118 <Method void ListView.setEmptyView(View)>
			}
		}
		mListShown = true;
		mList.setOnItemClickListener(mOnClickListener);
		if(mAdapter != null)
		{
			obj = ((Object) (mAdapter));
			mAdapter = null;
			setListAdapter(((ListAdapter) (obj)));
		} else
	//* 122  251:goto            42
		if(mProgressContainer != null)
	//* 123  254:aload_0         
	//* 124  255:getfield        #100 <Field View mProgressContainer>
	//* 125  258:ifnull          80
			setListShown(false, false);
	//  126  261:aload_0         
	//  127  262:iconst_0        
	//  128  263:iconst_0        
	//  129  264:invokespecial   #128 <Method void setListShown(boolean, boolean)>
		mHandler.post(mRequestFocus);
	//* 130  267:goto            80
	}

	private void setListShown(boolean flag, boolean flag1)
	{
		ensureList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void ensureList()>
		if(mProgressContainer == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #100 <Field View mProgressContainer>
	//*   4    8:ifnonnull       21
			throw new IllegalStateException("Can't be used with a custom content view");
	//    5   11:new             #62  <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #132 <String "Can't be used with a custom content view">
	//    8   17:invokespecial   #67  <Method void IllegalStateException(String)>
	//    9   20:athrow          
		if(mListShown == flag)
	//*  10   21:aload_0         
	//*  11   22:getfield        #71  <Field boolean mListShown>
	//*  12   25:iload_1         
	//*  13   26:icmpne          30
			return;
	//   14   29:return          
		mListShown = flag;
	//   15   30:aload_0         
	//   16   31:iload_1         
	//   17   32:putfield        #71  <Field boolean mListShown>
		if(flag)
	//*  18   35:iload_1         
	//*  19   36:ifeq            110
		{
			if(flag1)
	//*  20   39:iload_2         
	//*  21   40:ifeq            93
			{
				mProgressContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0001));
	//   22   43:aload_0         
	//   23   44:getfield        #100 <Field View mProgressContainer>
	//   24   47:aload_0         
	//   25   48:invokevirtual   #136 <Method android.content.Context getContext()>
	//   26   51:ldc1            #137 <Int 0x10a0001>
	//   27   53:invokestatic    #143 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   28   56:invokevirtual   #147 <Method void View.startAnimation(android.view.animation.Animation)>
				mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0000));
	//   29   59:aload_0         
	//   30   60:getfield        #102 <Field View mListContainer>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #136 <Method android.content.Context getContext()>
	//   33   67:ldc1            #148 <Int 0x10a0000>
	//   34   69:invokestatic    #143 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   35   72:invokevirtual   #147 <Method void View.startAnimation(android.view.animation.Animation)>
			} else
	//*  36   75:aload_0         
	//*  37   76:getfield        #100 <Field View mProgressContainer>
	//*  38   79:bipush          8
	//*  39   81:invokevirtual   #149 <Method void View.setVisibility(int)>
	//*  40   84:aload_0         
	//*  41   85:getfield        #102 <Field View mListContainer>
	//*  42   88:iconst_0        
	//*  43   89:invokevirtual   #149 <Method void View.setVisibility(int)>
	//*  44   92:return          
			{
				mProgressContainer.clearAnimation();
	//   45   93:aload_0         
	//   46   94:getfield        #100 <Field View mProgressContainer>
	//   47   97:invokevirtual   #152 <Method void View.clearAnimation()>
				mListContainer.clearAnimation();
	//   48  100:aload_0         
	//   49  101:getfield        #102 <Field View mListContainer>
	//   50  104:invokevirtual   #152 <Method void View.clearAnimation()>
			}
			mProgressContainer.setVisibility(8);
			mListContainer.setVisibility(0);
			return;
		}
	//*  51  107:goto            75
		if(flag1)
	//*  52  110:iload_2         
	//*  53  111:ifeq            164
		{
			mProgressContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0000));
	//   54  114:aload_0         
	//   55  115:getfield        #100 <Field View mProgressContainer>
	//   56  118:aload_0         
	//   57  119:invokevirtual   #136 <Method android.content.Context getContext()>
	//   58  122:ldc1            #148 <Int 0x10a0000>
	//   59  124:invokestatic    #143 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   60  127:invokevirtual   #147 <Method void View.startAnimation(android.view.animation.Animation)>
			mListContainer.startAnimation(AnimationUtils.loadAnimation(getContext(), 0x10a0001));
	//   61  130:aload_0         
	//   62  131:getfield        #102 <Field View mListContainer>
	//   63  134:aload_0         
	//   64  135:invokevirtual   #136 <Method android.content.Context getContext()>
	//   65  138:ldc1            #137 <Int 0x10a0001>
	//   66  140:invokestatic    #143 <Method android.view.animation.Animation AnimationUtils.loadAnimation(android.content.Context, int)>
	//   67  143:invokevirtual   #147 <Method void View.startAnimation(android.view.animation.Animation)>
		} else
	//*  68  146:aload_0         
	//*  69  147:getfield        #100 <Field View mProgressContainer>
	//*  70  150:iconst_0        
	//*  71  151:invokevirtual   #149 <Method void View.setVisibility(int)>
	//*  72  154:aload_0         
	//*  73  155:getfield        #102 <Field View mListContainer>
	//*  74  158:bipush          8
	//*  75  160:invokevirtual   #149 <Method void View.setVisibility(int)>
	//*  76  163:return          
		{
			mProgressContainer.clearAnimation();
	//   77  164:aload_0         
	//   78  165:getfield        #100 <Field View mProgressContainer>
	//   79  168:invokevirtual   #152 <Method void View.clearAnimation()>
			mListContainer.clearAnimation();
	//   80  171:aload_0         
	//   81  172:getfield        #102 <Field View mListContainer>
	//   82  175:invokevirtual   #152 <Method void View.clearAnimation()>
		}
		mProgressContainer.setVisibility(0);
		mListContainer.setVisibility(8);
	//*  83  178:goto            146
	}

	public ListAdapter getListAdapter()
	{
		return mAdapter;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field ListAdapter mAdapter>
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
	//    1    1:invokevirtual   #136 <Method android.content.Context getContext()>
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
	//   54  101:new             #93  <Class TextView>
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
	//   73  140:new             #69  <Class ListView>
	//   74  143:dup             
	//   75  144:aload_2         
	//   76  145:invokespecial   #205 <Method void ListView(android.content.Context)>
	//   77  148:astore_2        
		((ListView) (viewgroup)).setId(0x102000a);
	//   78  149:aload_2         
	//   79  150:ldc1            #103 <Int 0x102000a>
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
	//   10   18:putfield        #71  <Field boolean mListShown>
		mListContainer = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #102 <Field View mListContainer>
		mProgressContainer = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #100 <Field View mProgressContainer>
		mEmptyView = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #98  <Field View mEmptyView>
		mStandardEmptyView = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #95  <Field TextView mStandardEmptyView>
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
	//    3    3:invokespecial   #227 <Method void Fragment.onViewCreated(View, Bundle)>
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
		if(mStandardEmptyView == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #95  <Field TextView mStandardEmptyView>
	//*   4    8:ifnonnull       21
			throw new IllegalStateException("Can't be used with a custom content view");
	//    5   11:new             #62  <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #132 <String "Can't be used with a custom content view">
	//    8   17:invokespecial   #67  <Method void IllegalStateException(String)>
	//    9   20:athrow          
		mStandardEmptyView.setText(charsequence);
	//   10   21:aload_0         
	//   11   22:getfield        #95  <Field TextView mStandardEmptyView>
	//   12   25:aload_1         
	//   13   26:invokevirtual   #124 <Method void TextView.setText(CharSequence)>
		if(mEmptyText == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #120 <Field CharSequence mEmptyText>
	//*  16   33:ifnonnull       47
			mList.setEmptyView(((View) (mStandardEmptyView)));
	//   17   36:aload_0         
	//   18   37:getfield        #56  <Field ListView mList>
	//   19   40:aload_0         
	//   20   41:getfield        #95  <Field TextView mStandardEmptyView>
	//   21   44:invokevirtual   #118 <Method void ListView.setEmptyView(View)>
		mEmptyText = charsequence;
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:putfield        #120 <Field CharSequence mEmptyText>
	//   25   52:return          
	}

	public void setListAdapter(ListAdapter listadapter)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(mAdapter != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #77  <Field ListAdapter mAdapter>
	//*   4    6:ifnull          61
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:aload_1         
	//*   9   13:putfield        #77  <Field ListAdapter mAdapter>
	//*  10   16:aload_0         
	//*  11   17:getfield        #56  <Field ListView mList>
	//*  12   20:ifnull          60
	//*  13   23:aload_0         
	//*  14   24:getfield        #56  <Field ListView mList>
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #231 <Method void ListView.setAdapter(ListAdapter)>
	//*  17   31:aload_0         
	//*  18   32:getfield        #71  <Field boolean mListShown>
	//*  19   35:ifne            60
	//*  20   38:iload_2         
	//*  21   39:ifne            60
	//*  22   42:aload_0         
	//*  23   43:invokevirtual   #60  <Method View getView()>
	//*  24   46:invokevirtual   #235 <Method android.os.IBinder View.getWindowToken()>
	//*  25   49:ifnull          54
	//*  26   52:iconst_1        
	//*  27   53:istore_3        
	//*  28   54:aload_0         
	//*  29   55:iconst_1        
	//*  30   56:iload_3         
	//*  31   57:invokespecial   #128 <Method void setListShown(boolean, boolean)>
	//*  32   60:return          
			flag = false;
	//   33   61:iconst_0        
	//   34   62:istore_2        
		mAdapter = listadapter;
		if(mList != null)
		{
			mList.setAdapter(listadapter);
			if(!mListShown && !flag)
			{
				if(getView().getWindowToken() != null)
					flag1 = true;
				setListShown(true, flag1);
			}
		}
	//*  35   63:goto            11
	}

	public void setListShown(boolean flag)
	{
		setListShown(flag, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #128 <Method void setListShown(boolean, boolean)>
	//    4    6:return          
	}

	public void setListShownNoAnimation(boolean flag)
	{
		setListShown(flag, false);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #128 <Method void setListShown(boolean, boolean)>
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
	//    5    9:invokevirtual   #239 <Method void ListView.setSelection(int)>
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
