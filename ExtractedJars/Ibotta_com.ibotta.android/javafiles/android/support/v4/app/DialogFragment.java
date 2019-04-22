// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.*;

// Referenced classes of package android.support.v4.app:
//			Fragment, FragmentManager, FragmentTransaction, FragmentHostCallback

public class DialogFragment extends Fragment
	implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{

	public DialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Fragment()>
		mStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field int mStyle>
		mTheme = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #55  <Field int mTheme>
		mCancelable = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #57  <Field boolean mCancelable>
		mShowsDialog = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #59  <Field boolean mShowsDialog>
		mBackStackId = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #61  <Field int mBackStackId>
	//   17   29:return          
	}

	public void dismiss()
	{
		dismissInternal(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #67  <Method void dismissInternal(boolean)>
	//    3    5:return          
	}

	public void dismissAllowingStateLoss()
	{
		dismissInternal(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #67  <Method void dismissInternal(boolean)>
	//    3    5:return          
	}

	void dismissInternal(boolean flag)
	{
		if(mDismissed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field boolean mDismissed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mDismissed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #70  <Field boolean mDismissed>
		mShownByMe = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #72  <Field boolean mShownByMe>
		Object obj = ((Object) (mDialog));
	//   10   18:aload_0         
	//   11   19:getfield        #74  <Field Dialog mDialog>
	//   12   22:astore_2        
		if(obj != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          31
			((Dialog) (obj)).dismiss();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #78  <Method void Dialog.dismiss()>
		mViewDestroyed = true;
	//   17   31:aload_0         
	//   18   32:iconst_1        
	//   19   33:putfield        #80  <Field boolean mViewDestroyed>
		if(mBackStackId >= 0)
	//*  20   36:aload_0         
	//*  21   37:getfield        #61  <Field int mBackStackId>
	//*  22   40:iflt            61
		{
			getFragmentManager().popBackStack(mBackStackId, 1);
	//   23   43:aload_0         
	//   24   44:invokevirtual   #84  <Method FragmentManager getFragmentManager()>
	//   25   47:aload_0         
	//   26   48:getfield        #61  <Field int mBackStackId>
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #90  <Method void FragmentManager.popBackStack(int, int)>
			mBackStackId = -1;
	//   29   55:aload_0         
	//   30   56:iconst_m1       
	//   31   57:putfield        #61  <Field int mBackStackId>
			return;
	//   32   60:return          
		}
		obj = ((Object) (getFragmentManager().beginTransaction()));
	//   33   61:aload_0         
	//   34   62:invokevirtual   #84  <Method FragmentManager getFragmentManager()>
	//   35   65:invokevirtual   #94  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   36   68:astore_2        
		((FragmentTransaction) (obj)).remove(((Fragment) (this)));
	//   37   69:aload_2         
	//   38   70:aload_0         
	//   39   71:invokevirtual   #100 <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
	//   40   74:pop             
		if(flag)
	//*  41   75:iload_1         
	//*  42   76:ifeq            85
		{
			((FragmentTransaction) (obj)).commitAllowingStateLoss();
	//   43   79:aload_2         
	//   44   80:invokevirtual   #104 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   45   83:pop             
			return;
	//   46   84:return          
		} else
		{
			((FragmentTransaction) (obj)).commit();
	//   47   85:aload_2         
	//   48   86:invokevirtual   #107 <Method int FragmentTransaction.commit()>
	//   49   89:pop             
			return;
	//   50   90:return          
		}
	}

	public Dialog getDialog()
	{
		return mDialog;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field Dialog mDialog>
	//    2    4:areturn         
	}

	public boolean getShowsDialog()
	{
		return mShowsDialog;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field boolean mShowsDialog>
	//    2    4:ireturn         
	}

	public int getTheme()
	{
		return mTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mTheme>
	//    2    4:ireturn         
	}

	public boolean isCancelable()
	{
		return mCancelable;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field boolean mCancelable>
	//    2    4:ireturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #120 <Method void Fragment.onActivityCreated(Bundle)>
		if(!mShowsDialog)
	//*   3    5:aload_0         
	//*   4    6:getfield        #59  <Field boolean mShowsDialog>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		Object obj = ((Object) (getView()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #124 <Method View getView()>
	//    9   17:astore_2        
		if(obj != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          50
			if(((View) (obj)).getParent() == null)
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #130 <Method android.view.ViewParent View.getParent()>
	//*  14   26:ifnonnull       40
				mDialog.setContentView(((View) (obj)));
	//   15   29:aload_0         
	//   16   30:getfield        #74  <Field Dialog mDialog>
	//   17   33:aload_2         
	//   18   34:invokevirtual   #134 <Method void Dialog.setContentView(View)>
			else
	//*  19   37:goto            50
				throw new IllegalStateException("DialogFragment can not be attached to a container view");
	//   20   40:new             #136 <Class IllegalStateException>
	//   21   43:dup             
	//   22   44:ldc1            #138 <String "DialogFragment can not be attached to a container view">
	//   23   46:invokespecial   #141 <Method void IllegalStateException(String)>
	//   24   49:athrow          
		obj = ((Object) (getActivity()));
	//   25   50:aload_0         
	//   26   51:invokevirtual   #145 <Method FragmentActivity getActivity()>
	//   27   54:astore_2        
		if(obj != null)
	//*  28   55:aload_2         
	//*  29   56:ifnull          67
			mDialog.setOwnerActivity(((android.app.Activity) (obj)));
	//   30   59:aload_0         
	//   31   60:getfield        #74  <Field Dialog mDialog>
	//   32   63:aload_2         
	//   33   64:invokevirtual   #149 <Method void Dialog.setOwnerActivity(android.app.Activity)>
		mDialog.setCancelable(mCancelable);
	//   34   67:aload_0         
	//   35   68:getfield        #74  <Field Dialog mDialog>
	//   36   71:aload_0         
	//   37   72:getfield        #57  <Field boolean mCancelable>
	//   38   75:invokevirtual   #152 <Method void Dialog.setCancelable(boolean)>
		mDialog.setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (this)));
	//   39   78:aload_0         
	//   40   79:getfield        #74  <Field Dialog mDialog>
	//   41   82:aload_0         
	//   42   83:invokevirtual   #156 <Method void Dialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		mDialog.setOnDismissListener(((android.content.DialogInterface.OnDismissListener) (this)));
	//   43   86:aload_0         
	//   44   87:getfield        #74  <Field Dialog mDialog>
	//   45   90:aload_0         
	//   46   91:invokevirtual   #160 <Method void Dialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		if(bundle != null)
	//*  47   94:aload_1         
	//*  48   95:ifnull          117
		{
			bundle = bundle.getBundle("android:savedDialogState");
	//   49   98:aload_1         
	//   50   99:ldc1            #18  <String "android:savedDialogState">
	//   51  101:invokevirtual   #166 <Method Bundle Bundle.getBundle(String)>
	//   52  104:astore_1        
			if(bundle != null)
	//*  53  105:aload_1         
	//*  54  106:ifnull          117
				mDialog.onRestoreInstanceState(bundle);
	//   55  109:aload_0         
	//   56  110:getfield        #74  <Field Dialog mDialog>
	//   57  113:aload_1         
	//   58  114:invokevirtual   #169 <Method void Dialog.onRestoreInstanceState(Bundle)>
		}
	//   59  117:return          
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method void Fragment.onAttach(Context)>
		if(!mShownByMe)
	//*   3    5:aload_0         
	//*   4    6:getfield        #72  <Field boolean mShownByMe>
	//*   5    9:ifne            17
			mDismissed = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #70  <Field boolean mDismissed>
	//    9   17:return          
	}

	public void onCancel(DialogInterface dialoginterface)
	{
	//    0    0:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #179 <Method void Fragment.onCreate(Bundle)>
		boolean flag;
		if(mContainerId == 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #182 <Field int mContainerId>
	//*   5    9:ifne            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_2        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		mShowsDialog = flag;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #59  <Field boolean mShowsDialog>
		if(bundle != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          86
		{
			mStyle = bundle.getInt("android:style", 0);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:ldc1            #24  <String "android:style">
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #186 <Method int Bundle.getInt(String, int)>
	//   21   36:putfield        #53  <Field int mStyle>
			mTheme = bundle.getInt("android:theme", 0);
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:ldc1            #27  <String "android:theme">
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #186 <Method int Bundle.getInt(String, int)>
	//   27   47:putfield        #55  <Field int mTheme>
			mCancelable = bundle.getBoolean("android:cancelable", true);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:ldc1            #15  <String "android:cancelable">
	//   31   54:iconst_1        
	//   32   55:invokevirtual   #190 <Method boolean Bundle.getBoolean(String, boolean)>
	//   33   58:putfield        #57  <Field boolean mCancelable>
			mShowsDialog = bundle.getBoolean("android:showsDialog", mShowsDialog);
	//   34   61:aload_0         
	//   35   62:aload_1         
	//   36   63:ldc1            #21  <String "android:showsDialog">
	//   37   65:aload_0         
	//   38   66:getfield        #59  <Field boolean mShowsDialog>
	//   39   69:invokevirtual   #190 <Method boolean Bundle.getBoolean(String, boolean)>
	//   40   72:putfield        #59  <Field boolean mShowsDialog>
			mBackStackId = bundle.getInt("android:backStackId", -1);
	//   41   75:aload_0         
	//   42   76:aload_1         
	//   43   77:ldc1            #12  <String "android:backStackId">
	//   44   79:iconst_m1       
	//   45   80:invokevirtual   #186 <Method int Bundle.getInt(String, int)>
	//   46   83:putfield        #61  <Field int mBackStackId>
		}
	//   47   86:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		return new Dialog(((Context) (getActivity())), getTheme());
	//    0    0:new             #76  <Class Dialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #145 <Method FragmentActivity getActivity()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #195 <Method int getTheme()>
	//    6   12:invokespecial   #198 <Method void Dialog(Context, int)>
	//    7   15:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method void Fragment.onDestroyView()>
		Dialog dialog = mDialog;
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field Dialog mDialog>
	//    4    8:astore_1        
		if(dialog != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          27
		{
			mViewDestroyed = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #80  <Field boolean mViewDestroyed>
			dialog.dismiss();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #78  <Method void Dialog.dismiss()>
			mDialog = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #74  <Field Dialog mDialog>
		}
	//   15   27:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void Fragment.onDetach()>
		if(!mShownByMe && !mDismissed)
	//*   2    4:aload_0         
	//*   3    5:getfield        #72  <Field boolean mShownByMe>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:getfield        #70  <Field boolean mDismissed>
	//*   7   15:ifne            23
			mDismissed = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #70  <Field boolean mDismissed>
	//   11   23:return          
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		if(!mViewDestroyed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field boolean mViewDestroyed>
	//*   2    4:ifne            12
			dismissInternal(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #67  <Method void dismissInternal(boolean)>
	//    6   12:return          
	}

	public LayoutInflater onGetLayoutInflater(Bundle bundle)
	{
		if(!mShowsDialog)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean mShowsDialog>
	//*   2    4:ifne            13
			return super.onGetLayoutInflater(bundle);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #209 <Method LayoutInflater Fragment.onGetLayoutInflater(Bundle)>
	//    6   12:areturn         
		mDialog = onCreateDialog(bundle);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #211 <Method Dialog onCreateDialog(Bundle)>
	//   11   19:putfield        #74  <Field Dialog mDialog>
		bundle = ((Bundle) (mDialog));
	//   12   22:aload_0         
	//   13   23:getfield        #74  <Field Dialog mDialog>
	//   14   26:astore_1        
		if(bundle != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          56
		{
			setupDialog(((Dialog) (bundle)), mStyle);
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #53  <Field int mStyle>
	//   21   37:invokevirtual   #215 <Method void setupDialog(Dialog, int)>
			return (LayoutInflater)mDialog.getContext().getSystemService("layout_inflater");
	//   22   40:aload_0         
	//   23   41:getfield        #74  <Field Dialog mDialog>
	//   24   44:invokevirtual   #219 <Method Context Dialog.getContext()>
	//   25   47:ldc1            #221 <String "layout_inflater">
	//   26   49:invokevirtual   #227 <Method Object Context.getSystemService(String)>
	//   27   52:checkcast       #229 <Class LayoutInflater>
	//   28   55:areturn         
		} else
		{
			return (LayoutInflater)mHost.getContext().getSystemService("layout_inflater");
	//   29   56:aload_0         
	//   30   57:getfield        #233 <Field FragmentHostCallback mHost>
	//   31   60:invokevirtual   #236 <Method Context FragmentHostCallback.getContext()>
	//   32   63:ldc1            #221 <String "layout_inflater">
	//   33   65:invokevirtual   #227 <Method Object Context.getSystemService(String)>
	//   34   68:checkcast       #229 <Class LayoutInflater>
	//   35   71:areturn         
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #239 <Method void Fragment.onSaveInstanceState(Bundle)>
		Object obj = ((Object) (mDialog));
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field Dialog mDialog>
	//    5    9:astore          4
		if(obj != null)
	//*   6   11:aload           4
	//*   7   13:ifnull          36
		{
			obj = ((Object) (((Dialog) (obj)).onSaveInstanceState()));
	//    8   16:aload           4
	//    9   18:invokevirtual   #242 <Method Bundle Dialog.onSaveInstanceState()>
	//   10   21:astore          4
			if(obj != null)
	//*  11   23:aload           4
	//*  12   25:ifnull          36
				bundle.putBundle("android:savedDialogState", ((Bundle) (obj)));
	//   13   28:aload_1         
	//   14   29:ldc1            #18  <String "android:savedDialogState">
	//   15   31:aload           4
	//   16   33:invokevirtual   #246 <Method void Bundle.putBundle(String, Bundle)>
		}
		int i = mStyle;
	//   17   36:aload_0         
	//   18   37:getfield        #53  <Field int mStyle>
	//   19   40:istore_2        
		if(i != 0)
	//*  20   41:iload_2         
	//*  21   42:ifeq            52
			bundle.putInt("android:style", i);
	//   22   45:aload_1         
	//   23   46:ldc1            #24  <String "android:style">
	//   24   48:iload_2         
	//   25   49:invokevirtual   #250 <Method void Bundle.putInt(String, int)>
		i = mTheme;
	//   26   52:aload_0         
	//   27   53:getfield        #55  <Field int mTheme>
	//   28   56:istore_2        
		if(i != 0)
	//*  29   57:iload_2         
	//*  30   58:ifeq            68
			bundle.putInt("android:theme", i);
	//   31   61:aload_1         
	//   32   62:ldc1            #27  <String "android:theme">
	//   33   64:iload_2         
	//   34   65:invokevirtual   #250 <Method void Bundle.putInt(String, int)>
		boolean flag = mCancelable;
	//   35   68:aload_0         
	//   36   69:getfield        #57  <Field boolean mCancelable>
	//   37   72:istore_3        
		if(!flag)
	//*  38   73:iload_3         
	//*  39   74:ifne            84
			bundle.putBoolean("android:cancelable", flag);
	//   40   77:aload_1         
	//   41   78:ldc1            #15  <String "android:cancelable">
	//   42   80:iload_3         
	//   43   81:invokevirtual   #254 <Method void Bundle.putBoolean(String, boolean)>
		flag = mShowsDialog;
	//   44   84:aload_0         
	//   45   85:getfield        #59  <Field boolean mShowsDialog>
	//   46   88:istore_3        
		if(!flag)
	//*  47   89:iload_3         
	//*  48   90:ifne            100
			bundle.putBoolean("android:showsDialog", flag);
	//   49   93:aload_1         
	//   50   94:ldc1            #21  <String "android:showsDialog">
	//   51   96:iload_3         
	//   52   97:invokevirtual   #254 <Method void Bundle.putBoolean(String, boolean)>
		i = mBackStackId;
	//   53  100:aload_0         
	//   54  101:getfield        #61  <Field int mBackStackId>
	//   55  104:istore_2        
		if(i != -1)
	//*  56  105:iload_2         
	//*  57  106:iconst_m1       
	//*  58  107:icmpeq          117
			bundle.putInt("android:backStackId", i);
	//   59  110:aload_1         
	//   60  111:ldc1            #12  <String "android:backStackId">
	//   61  113:iload_2         
	//   62  114:invokevirtual   #250 <Method void Bundle.putInt(String, int)>
	//   63  117:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void Fragment.onStart()>
		Dialog dialog = mDialog;
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field Dialog mDialog>
	//    4    8:astore_1        
		if(dialog != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          22
		{
			mViewDestroyed = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #80  <Field boolean mViewDestroyed>
			dialog.show();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #260 <Method void Dialog.show()>
		}
	//   12   22:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method void Fragment.onStop()>
		Dialog dialog = mDialog;
	//    2    4:aload_0         
	//    3    5:getfield        #74  <Field Dialog mDialog>
	//    4    8:astore_1        
		if(dialog != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			dialog.hide();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #266 <Method void Dialog.hide()>
	//    9   17:return          
	}

	public void setCancelable(boolean flag)
	{
		mCancelable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field boolean mCancelable>
		Dialog dialog = mDialog;
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field Dialog mDialog>
	//    5    9:astore_2        
		if(dialog != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			dialog.setCancelable(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #152 <Method void Dialog.setCancelable(boolean)>
	//   11   19:return          
	}

	public void setShowsDialog(boolean flag)
	{
		mShowsDialog = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #59  <Field boolean mShowsDialog>
	//    3    5:return          
	}

	public void setStyle(int i, int j)
	{
		mStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int mStyle>
		i = mStyle;
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field int mStyle>
	//    5    9:istore_1        
		if(i == 2 || i == 3)
	//*   6   10:iload_1         
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          20
	//*   9   15:iload_1         
	//*  10   16:iconst_3        
	//*  11   17:icmpne          27
			mTheme = 0x1030059;
	//   12   20:aload_0         
	//   13   21:ldc2            #269 <Int 0x1030059>
	//   14   24:putfield        #55  <Field int mTheme>
		if(j != 0)
	//*  15   27:iload_2         
	//*  16   28:ifeq            36
			mTheme = j;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #55  <Field int mTheme>
	//   20   36:return          
	}

	public void setupDialog(Dialog dialog, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 38
	//	               2 38
	//	               3 29
		default:
			return;
	//    2   28:return          

		case 3: // '\003'
			dialog.getWindow().addFlags(24);
	//    3   29:aload_1         
	//    4   30:invokevirtual   #277 <Method Window Dialog.getWindow()>
	//    5   33:bipush          24
	//    6   35:invokevirtual   #283 <Method void Window.addFlags(int)>
			// fall through

		case 1: // '\001'
		case 2: // '\002'
			dialog.requestWindowFeature(1);
	//    7   38:aload_1         
	//    8   39:iconst_1        
	//    9   40:invokevirtual   #287 <Method boolean Dialog.requestWindowFeature(int)>
	//   10   43:pop             
			break;
		}
	//   11   44:return          
	}

	public int show(FragmentTransaction fragmenttransaction, String s)
	{
		mDismissed = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #70  <Field boolean mDismissed>
		mShownByMe = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean mShownByMe>
		fragmenttransaction.add(((Fragment) (this)), s);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #292 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   10   16:pop             
		mViewDestroyed = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #80  <Field boolean mViewDestroyed>
		mBackStackId = fragmenttransaction.commit();
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #107 <Method int FragmentTransaction.commit()>
	//   17   27:putfield        #61  <Field int mBackStackId>
		return mBackStackId;
	//   18   30:aload_0         
	//   19   31:getfield        #61  <Field int mBackStackId>
	//   20   34:ireturn         
	}

	public void show(FragmentManager fragmentmanager, String s)
	{
		mDismissed = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #70  <Field boolean mDismissed>
		mShownByMe = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean mShownByMe>
		fragmentmanager = ((FragmentManager) (fragmentmanager.beginTransaction()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #94  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    8   14:astore_1        
		((FragmentTransaction) (fragmentmanager)).add(((Fragment) (this)), s);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #292 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   13   21:pop             
		((FragmentTransaction) (fragmentmanager)).commit();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #107 <Method int FragmentTransaction.commit()>
	//   16   26:pop             
	//   17   27:return          
	}

	public void showNow(FragmentManager fragmentmanager, String s)
	{
		mDismissed = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #70  <Field boolean mDismissed>
		mShownByMe = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #72  <Field boolean mShownByMe>
		fragmentmanager = ((FragmentManager) (fragmentmanager.beginTransaction()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #94  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    8   14:astore_1        
		((FragmentTransaction) (fragmentmanager)).add(((Fragment) (this)), s);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #292 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   13   21:pop             
		((FragmentTransaction) (fragmentmanager)).commitNow();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #297 <Method void FragmentTransaction.commitNow()>
	//   16   26:return          
	}

	private static final String SAVED_BACK_STACK_ID = "android:backStackId";
	private static final String SAVED_CANCELABLE = "android:cancelable";
	private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
	private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
	private static final String SAVED_STYLE = "android:style";
	private static final String SAVED_THEME = "android:theme";
	public static final int STYLE_NORMAL = 0;
	public static final int STYLE_NO_FRAME = 2;
	public static final int STYLE_NO_INPUT = 3;
	public static final int STYLE_NO_TITLE = 1;
	int mBackStackId;
	boolean mCancelable;
	Dialog mDialog;
	boolean mDismissed;
	boolean mShownByMe;
	boolean mShowsDialog;
	int mStyle;
	int mTheme;
	boolean mViewDestroyed;
}
