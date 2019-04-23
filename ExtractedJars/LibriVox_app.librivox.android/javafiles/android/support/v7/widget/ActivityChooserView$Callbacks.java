// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.d;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, ActivityChooserModel

class ActivityChooserView$Callbacks
	implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.r, android.widget.PopupWindow$OnDismissListener
{

	private void notifyOnDismissListener()
	{
		if(mOnDismissListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ActivityChooserView this$0>
	//*   2    4:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
	//*   3    7:ifnull          22
			mOnDismissListener.onDismiss();
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field ActivityChooserView this$0>
	//    6   14:getfield        #29  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
	//    7   17:invokeinterface #32  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//    8   22:return          
	}

	public void onClick(View view)
	{
label0:
		{
			if(view == mDefaultActivityButton)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field ActivityChooserView this$0>
	//*   3    5:getfield        #38  <Field android.widget.FrameLayout ActivityChooserView.mDefaultActivityButton>
	//*   4    8:if_acmpne       83
			{
				dismissPopup();
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field ActivityChooserView this$0>
	//    7   15:invokevirtual   #42  <Method boolean ActivityChooserView.dismissPopup()>
	//    8   18:pop             
				view = ((View) (mAdapter.getDefaultActivity()));
	//    9   19:aload_0         
	//   10   20:getfield        #18  <Field ActivityChooserView this$0>
	//   11   23:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   12   26:invokevirtual   #52  <Method android.content.pm.ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
	//   13   29:astore_1        
				int i = mAdapter.getDataModel().getActivityIndex(((android.content.pm.ResolveInfo) (view)));
	//   14   30:aload_0         
	//   15   31:getfield        #18  <Field ActivityChooserView this$0>
	//   16   34:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   17   37:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #62  <Method int ActivityChooserModel.getActivityIndex(android.content.pm.ResolveInfo)>
	//   20   44:istore_2        
				view = ((View) (mAdapter.getDataModel().chooseActivity(i)));
	//   21   45:aload_0         
	//   22   46:getfield        #18  <Field ActivityChooserView this$0>
	//   23   49:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   24   52:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   25   55:iload_2         
	//   26   56:invokevirtual   #66  <Method Intent ActivityChooserModel.chooseActivity(int)>
	//   27   59:astore_1        
				if(view != null)
	//*  28   60:aload_1         
	//*  29   61:ifnull          112
				{
					((Intent) (view)).addFlags(0x80000);
	//   30   64:aload_1         
	//   31   65:ldc1            #67  <Int 0x80000>
	//   32   67:invokevirtual   #72  <Method Intent Intent.addFlags(int)>
	//   33   70:pop             
					getContext().startActivity(((Intent) (view)));
	//   34   71:aload_0         
	//   35   72:getfield        #18  <Field ActivityChooserView this$0>
	//   36   75:invokevirtual   #76  <Method Context ActivityChooserView.getContext()>
	//   37   78:aload_1         
	//   38   79:invokevirtual   #82  <Method void Context.startActivity(Intent)>
					return;
	//   39   82:return          
				}
			} else
			{
				if(view != mExpandActivityOverflowButton)
					break label0;
	//   40   83:aload_1         
	//   41   84:aload_0         
	//   42   85:getfield        #18  <Field ActivityChooserView this$0>
	//   43   88:getfield        #85  <Field android.widget.FrameLayout ActivityChooserView.mExpandActivityOverflowButton>
	//   44   91:if_acmpne       113
				view = ((View) (ActivityChooserView.this));
	//   45   94:aload_0         
	//   46   95:getfield        #18  <Field ActivityChooserView this$0>
	//   47   98:astore_1        
				view.mIsSelectingDefaultActivity = false;
	//   48   99:aload_1         
	//   49  100:iconst_0        
	//   50  101:putfield        #89  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
				((ActivityChooserView) (view)).showPopupUnchecked(((ActivityChooserView) (view)).mInitialActivityCount);
	//   51  104:aload_1         
	//   52  105:aload_1         
	//   53  106:getfield        #93  <Field int ActivityChooserView.mInitialActivityCount>
	//   54  109:invokevirtual   #97  <Method void ActivityChooserView.showPopupUnchecked(int)>
			}
			return;
	//   55  112:return          
		}
		throw new IllegalArgumentException();
	//   56  113:new             #99  <Class IllegalArgumentException>
	//   57  116:dup             
	//   58  117:invokespecial   #100 <Method void IllegalArgumentException()>
	//   59  120:athrow          
	}

	public void onDismiss()
	{
		notifyOnDismissListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void notifyOnDismissListener()>
		if(mProvider != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field ActivityChooserView this$0>
	//*   4    8:getfield        #106 <Field d ActivityChooserView.mProvider>
	//*   5   11:ifnull          25
			mProvider.subUiVisibilityChanged(false);
	//    6   14:aload_0         
	//    7   15:getfield        #18  <Field ActivityChooserView this$0>
	//    8   18:getfield        #106 <Field d ActivityChooserView.mProvider>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #112 <Method void d.subUiVisibilityChanged(boolean)>
	//   11   25:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		switch(((ooserViewAdapter)adapterview.getAdapter()).getItemViewType(i))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #120 <Method android.widget.Adapter AdapterView.getAdapter()>
	//*   2    4:checkcast       #48  <Class ActivityChooserView$ActivityChooserViewAdapter>
	//*   3    7:iload_3         
	//*   4    8:invokevirtual   #124 <Method int ActivityChooserView$ActivityChooserViewAdapter.getItemViewType(int)>
		{
	//*   5   11:tableswitch     0 1: default 32
	//	               0 50
	//	               1 40
		default:
			throw new IllegalArgumentException();
	//    6   32:new             #99  <Class IllegalArgumentException>
	//    7   35:dup             
	//    8   36:invokespecial   #100 <Method void IllegalArgumentException()>
	//    9   39:athrow          

		case 1: // '\001'
			showPopupUnchecked(0x7fffffff);
	//   10   40:aload_0         
	//   11   41:getfield        #18  <Field ActivityChooserView this$0>
	//   12   44:ldc1            #125 <Int 0x7fffffff>
	//   13   46:invokevirtual   #97  <Method void ActivityChooserView.showPopupUnchecked(int)>
			return;
	//   14   49:return          

		case 0: // '\0'
			dismissPopup();
	//   15   50:aload_0         
	//   16   51:getfield        #18  <Field ActivityChooserView this$0>
	//   17   54:invokevirtual   #42  <Method boolean ActivityChooserView.dismissPopup()>
	//   18   57:pop             
			break;
		}
		if(mIsSelectingDefaultActivity)
	//*  19   58:aload_0         
	//*  20   59:getfield        #18  <Field ActivityChooserView this$0>
	//*  21   62:getfield        #89  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
	//*  22   65:ifeq            87
		{
			if(i > 0)
	//*  23   68:iload_3         
	//*  24   69:ifle            144
			{
				mAdapter.getDataModel().setDefaultActivity(i);
	//   25   72:aload_0         
	//   26   73:getfield        #18  <Field ActivityChooserView this$0>
	//   27   76:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   28   79:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   29   82:iload_3         
	//   30   83:invokevirtual   #128 <Method void ActivityChooserModel.setDefaultActivity(int)>
				return;
	//   31   86:return          
			}
		} else
		{
			if(!mAdapter.getShowDefaultActivity())
	//*  32   87:aload_0         
	//*  33   88:getfield        #18  <Field ActivityChooserView this$0>
	//*  34   91:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//*  35   94:invokevirtual   #131 <Method boolean ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity()>
	//*  36   97:ifeq            103
	//*  37  100:goto            107
				i++;
	//   38  103:iload_3         
	//   39  104:iconst_1        
	//   40  105:iadd            
	//   41  106:istore_3        
			adapterview = ((AdapterView) (mAdapter.getDataModel().chooseActivity(i)));
	//   42  107:aload_0         
	//   43  108:getfield        #18  <Field ActivityChooserView this$0>
	//   44  111:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   45  114:invokevirtual   #56  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   46  117:iload_3         
	//   47  118:invokevirtual   #66  <Method Intent ActivityChooserModel.chooseActivity(int)>
	//   48  121:astore_1        
			if(adapterview != null)
	//*  49  122:aload_1         
	//*  50  123:ifnull          144
			{
				((Intent) (adapterview)).addFlags(0x80000);
	//   51  126:aload_1         
	//   52  127:ldc1            #67  <Int 0x80000>
	//   53  129:invokevirtual   #72  <Method Intent Intent.addFlags(int)>
	//   54  132:pop             
				getContext().startActivity(((Intent) (adapterview)));
	//   55  133:aload_0         
	//   56  134:getfield        #18  <Field ActivityChooserView this$0>
	//   57  137:invokevirtual   #76  <Method Context ActivityChooserView.getContext()>
	//   58  140:aload_1         
	//   59  141:invokevirtual   #82  <Method void Context.startActivity(Intent)>
			}
		}
	//   60  144:return          
	}

	public boolean onLongClick(View view)
	{
		if(view == mDefaultActivityButton)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #18  <Field ActivityChooserView this$0>
	//*   3    5:getfield        #38  <Field android.widget.FrameLayout ActivityChooserView.mDefaultActivityButton>
	//*   4    8:if_acmpne       44
		{
			if(mAdapter.getCount() > 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #18  <Field ActivityChooserView this$0>
	//*   7   15:getfield        #46  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//*   8   18:invokevirtual   #137 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
	//*   9   21:ifle            42
			{
				view = ((View) (ActivityChooserView.this));
	//   10   24:aload_0         
	//   11   25:getfield        #18  <Field ActivityChooserView this$0>
	//   12   28:astore_1        
				view.mIsSelectingDefaultActivity = true;
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:putfield        #89  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
				((ActivityChooserView) (view)).showPopupUnchecked(((ActivityChooserView) (view)).mInitialActivityCount);
	//   16   34:aload_1         
	//   17   35:aload_1         
	//   18   36:getfield        #93  <Field int ActivityChooserView.mInitialActivityCount>
	//   19   39:invokevirtual   #97  <Method void ActivityChooserView.showPopupUnchecked(int)>
			}
			return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
		} else
		{
			throw new IllegalArgumentException();
	//   22   44:new             #99  <Class IllegalArgumentException>
	//   23   47:dup             
	//   24   48:invokespecial   #100 <Method void IllegalArgumentException()>
	//   25   51:athrow          
		}
	}

	final ActivityChooserView this$0;

	ActivityChooserView$Callbacks()
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
