// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ActionProvider;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserView, ActivityChooserModel

private class ActivityChooserView$Callbacks
	implements android.widget.r, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow$OnDismissListener
{

	private void notifyOnDismissListener()
	{
		if(mOnDismissListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field ActivityChooserView this$0>
	//*   2    4:getfield        #30  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
	//*   3    7:ifnull          22
			mOnDismissListener.onDismiss();
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field ActivityChooserView this$0>
	//    6   14:getfield        #30  <Field android.widget.PopupWindow$OnDismissListener ActivityChooserView.mOnDismissListener>
	//    7   17:invokeinterface #33  <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//    8   22:return          
	}

	public void onClick(View view)
	{
		if(view == mDefaultActivityButton)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field ActivityChooserView this$0>
	//*   3    5:getfield        #39  <Field android.widget.FrameLayout ActivityChooserView.mDefaultActivityButton>
	//*   4    8:if_acmpne       83
		{
			dismissPopup();
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field ActivityChooserView this$0>
	//    7   15:invokevirtual   #43  <Method boolean ActivityChooserView.dismissPopup()>
	//    8   18:pop             
			view = ((View) (mAdapter.getDefaultActivity()));
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field ActivityChooserView this$0>
	//   11   23:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   12   26:invokevirtual   #53  <Method android.content.pm.ResolveInfo ActivityChooserView$ActivityChooserViewAdapter.getDefaultActivity()>
	//   13   29:astore_1        
			int i = mAdapter.getDataModel().getActivityIndex(((android.content.pm.ResolveInfo) (view)));
	//   14   30:aload_0         
	//   15   31:getfield        #21  <Field ActivityChooserView this$0>
	//   16   34:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   17   37:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #63  <Method int ActivityChooserModel.getActivityIndex(android.content.pm.ResolveInfo)>
	//   20   44:istore_2        
			view = ((View) (mAdapter.getDataModel().chooseActivity(i)));
	//   21   45:aload_0         
	//   22   46:getfield        #21  <Field ActivityChooserView this$0>
	//   23   49:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   24   52:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   25   55:iload_2         
	//   26   56:invokevirtual   #67  <Method Intent ActivityChooserModel.chooseActivity(int)>
	//   27   59:astore_1        
			if(view != null)
	//*  28   60:aload_1         
	//*  29   61:ifnull          82
			{
				((Intent) (view)).addFlags(0x80000);
	//   30   64:aload_1         
	//   31   65:ldc1            #68  <Int 0x80000>
	//   32   67:invokevirtual   #73  <Method Intent Intent.addFlags(int)>
	//   33   70:pop             
				getContext().startActivity(((Intent) (view)));
	//   34   71:aload_0         
	//   35   72:getfield        #21  <Field ActivityChooserView this$0>
	//   36   75:invokevirtual   #77  <Method Context ActivityChooserView.getContext()>
	//   37   78:aload_1         
	//   38   79:invokevirtual   #83  <Method void Context.startActivity(Intent)>
			}
			return;
	//   39   82:return          
		}
		if(view == mExpandActivityOverflowButton)
	//*  40   83:aload_1         
	//*  41   84:aload_0         
	//*  42   85:getfield        #21  <Field ActivityChooserView this$0>
	//*  43   88:getfield        #86  <Field android.widget.FrameLayout ActivityChooserView.mExpandActivityOverflowButton>
	//*  44   91:if_acmpne       117
		{
			mIsSelectingDefaultActivity = false;
	//   45   94:aload_0         
	//   46   95:getfield        #21  <Field ActivityChooserView this$0>
	//   47   98:iconst_0        
	//   48   99:putfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
			showPopupUnchecked(mInitialActivityCount);
	//   49  102:aload_0         
	//   50  103:getfield        #21  <Field ActivityChooserView this$0>
	//   51  106:aload_0         
	//   52  107:getfield        #21  <Field ActivityChooserView this$0>
	//   53  110:getfield        #94  <Field int ActivityChooserView.mInitialActivityCount>
	//   54  113:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
			return;
	//   55  116:return          
		} else
		{
			throw new IllegalArgumentException();
	//   56  117:new             #100 <Class IllegalArgumentException>
	//   57  120:dup             
	//   58  121:invokespecial   #101 <Method void IllegalArgumentException()>
	//   59  124:athrow          
		}
	}

	public void onDismiss()
	{
		notifyOnDismissListener();
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void notifyOnDismissListener()>
		if(mProvider != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #21  <Field ActivityChooserView this$0>
	//*   4    8:getfield        #107 <Field ActionProvider ActivityChooserView.mProvider>
	//*   5   11:ifnull          25
			mProvider.subUiVisibilityChanged(false);
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field ActivityChooserView this$0>
	//    8   18:getfield        #107 <Field ActionProvider ActivityChooserView.mProvider>
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #113 <Method void ActionProvider.subUiVisibilityChanged(boolean)>
	//   11   25:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		((ooserViewAdapter)adapterview.getAdapter()).getItemViewType(i);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #121 <Method android.widget.Adapter AdapterView.getAdapter()>
	//    2    4:checkcast       #49  <Class ActivityChooserView$ActivityChooserViewAdapter>
	//    3    7:iload_3         
	//    4    8:invokevirtual   #125 <Method int ActivityChooserView$ActivityChooserViewAdapter.getItemViewType(int)>
		JVM INSTR tableswitch 0 1: default 32
	//	               0 50
	//	               1 40;
	//    5   11:tableswitch     0 1: default 32
	//	               0 50
	//	               1 40
		   goto _L1 _L2 _L3
_L1:
		throw new IllegalArgumentException();
	//    6   32:new             #100 <Class IllegalArgumentException>
	//    7   35:dup             
	//    8   36:invokespecial   #101 <Method void IllegalArgumentException()>
	//    9   39:athrow          
_L3:
		showPopupUnchecked(0x7fffffff);
	//   10   40:aload_0         
	//   11   41:getfield        #21  <Field ActivityChooserView this$0>
	//   12   44:ldc1            #126 <Int 0x7fffffff>
	//   13   46:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
_L5:
		return;
	//   14   49:return          
_L2:
		dismissPopup();
	//   15   50:aload_0         
	//   16   51:getfield        #21  <Field ActivityChooserView this$0>
	//   17   54:invokevirtual   #43  <Method boolean ActivityChooserView.dismissPopup()>
	//   18   57:pop             
		if(!mIsSelectingDefaultActivity)
			break; /* Loop/switch isn't completed */
	//   19   58:aload_0         
	//   20   59:getfield        #21  <Field ActivityChooserView this$0>
	//   21   62:getfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
	//   22   65:ifeq            87
		if(i > 0)
	//*  23   68:iload_3         
	//*  24   69:ifle            49
		{
			mAdapter.getDataModel().setDefaultActivity(i);
	//   25   72:aload_0         
	//   26   73:getfield        #21  <Field ActivityChooserView this$0>
	//   27   76:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//   28   79:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//   29   82:iload_3         
	//   30   83:invokevirtual   #129 <Method void ActivityChooserModel.setDefaultActivity(int)>
			return;
	//   31   86:return          
		}
		if(true) goto _L5; else goto _L4
_L4:
		if(!mAdapter.getShowDefaultActivity())
	//*  32   87:aload_0         
	//*  33   88:getfield        #21  <Field ActivityChooserView this$0>
	//*  34   91:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//*  35   94:invokevirtual   #132 <Method boolean ActivityChooserView$ActivityChooserViewAdapter.getShowDefaultActivity()>
	//*  36   97:ifeq            138
	//*  37  100:aload_0         
	//*  38  101:getfield        #21  <Field ActivityChooserView this$0>
	//*  39  104:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//*  40  107:invokevirtual   #57  <Method ActivityChooserModel ActivityChooserView$ActivityChooserViewAdapter.getDataModel()>
	//*  41  110:iload_3         
	//*  42  111:invokevirtual   #67  <Method Intent ActivityChooserModel.chooseActivity(int)>
	//*  43  114:astore_1        
	//*  44  115:aload_1         
	//*  45  116:ifnull          49
	//*  46  119:aload_1         
	//*  47  120:ldc1            #68  <Int 0x80000>
	//*  48  122:invokevirtual   #73  <Method Intent Intent.addFlags(int)>
	//*  49  125:pop             
	//*  50  126:aload_0         
	//*  51  127:getfield        #21  <Field ActivityChooserView this$0>
	//*  52  130:invokevirtual   #77  <Method Context ActivityChooserView.getContext()>
	//*  53  133:aload_1         
	//*  54  134:invokevirtual   #83  <Method void Context.startActivity(Intent)>
	//*  55  137:return          
			i++;
	//   56  138:iload_3         
	//   57  139:iconst_1        
	//   58  140:iadd            
	//   59  141:istore_3        
		adapterview = ((AdapterView) (mAdapter.getDataModel().chooseActivity(i)));
		if(adapterview != null)
		{
			((Intent) (adapterview)).addFlags(0x80000);
			getContext().startActivity(((Intent) (adapterview)));
			return;
		}
		if(true) goto _L5; else goto _L6
	//   60  142:goto            100
_L6:
	}

	public boolean onLongClick(View view)
	{
		if(view == mDefaultActivityButton)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #21  <Field ActivityChooserView this$0>
	//*   3    5:getfield        #39  <Field android.widget.FrameLayout ActivityChooserView.mDefaultActivityButton>
	//*   4    8:if_acmpne       48
		{
			if(mAdapter.getCount() > 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #21  <Field ActivityChooserView this$0>
	//*   7   15:getfield        #47  <Field ActivityChooserView$ActivityChooserViewAdapter ActivityChooserView.mAdapter>
	//*   8   18:invokevirtual   #140 <Method int ActivityChooserView$ActivityChooserViewAdapter.getCount()>
	//*   9   21:ifle            46
			{
				mIsSelectingDefaultActivity = true;
	//   10   24:aload_0         
	//   11   25:getfield        #21  <Field ActivityChooserView this$0>
	//   12   28:iconst_1        
	//   13   29:putfield        #90  <Field boolean ActivityChooserView.mIsSelectingDefaultActivity>
				showPopupUnchecked(mInitialActivityCount);
	//   14   32:aload_0         
	//   15   33:getfield        #21  <Field ActivityChooserView this$0>
	//   16   36:aload_0         
	//   17   37:getfield        #21  <Field ActivityChooserView this$0>
	//   18   40:getfield        #94  <Field int ActivityChooserView.mInitialActivityCount>
	//   19   43:invokevirtual   #98  <Method void ActivityChooserView.showPopupUnchecked(int)>
			}
			return true;
	//   20   46:iconst_1        
	//   21   47:ireturn         
		} else
		{
			throw new IllegalArgumentException();
	//   22   48:new             #100 <Class IllegalArgumentException>
	//   23   51:dup             
	//   24   52:invokespecial   #101 <Method void IllegalArgumentException()>
	//   25   55:athrow          
		}
	}

	final ActivityChooserView this$0;

	ActivityChooserView$Callbacks()
	{
		this$0 = ActivityChooserView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ActivityChooserView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
