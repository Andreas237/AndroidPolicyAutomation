// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.*;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.app:
//			Fragment, FragmentManager, FragmentTransaction, FragmentHostCallback

public class DialogFragment extends Fragment
	implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener
{
	private static interface DialogStyle
		extends Annotation
	{
	}


	public DialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Fragment()>
		mStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #56  <Field int mStyle>
		mTheme = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #58  <Field int mTheme>
		mCancelable = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #60  <Field boolean mCancelable>
		mShowsDialog = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #62  <Field boolean mShowsDialog>
		mBackStackId = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #64  <Field int mBackStackId>
	//   17   29:return          
	}

	public void dismiss()
	{
		dismissInternal(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #70  <Method void dismissInternal(boolean)>
	//    3    5:return          
	}

	public void dismissAllowingStateLoss()
	{
		dismissInternal(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #70  <Method void dismissInternal(boolean)>
	//    3    5:return          
	}

	void dismissInternal(boolean flag)
	{
		if(mDismissed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mDismissed>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mDismissed = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #73  <Field boolean mDismissed>
		mShownByMe = false;
	//    7   13:aload_0         
	//    8   14:iconst_0        
	//    9   15:putfield        #75  <Field boolean mShownByMe>
		if(mDialog != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #77  <Field Dialog mDialog>
	//*  12   22:ifnull          32
			mDialog.dismiss();
	//   13   25:aload_0         
	//   14   26:getfield        #77  <Field Dialog mDialog>
	//   15   29:invokevirtual   #81  <Method void Dialog.dismiss()>
		mViewDestroyed = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #83  <Field boolean mViewDestroyed>
		if(mBackStackId >= 0)
	//*  19   37:aload_0         
	//*  20   38:getfield        #64  <Field int mBackStackId>
	//*  21   41:iflt            62
		{
			getFragmentManager().popBackStack(mBackStackId, 1);
	//   22   44:aload_0         
	//   23   45:invokevirtual   #87  <Method FragmentManager getFragmentManager()>
	//   24   48:aload_0         
	//   25   49:getfield        #64  <Field int mBackStackId>
	//   26   52:iconst_1        
	//   27   53:invokevirtual   #93  <Method void FragmentManager.popBackStack(int, int)>
			mBackStackId = -1;
	//   28   56:aload_0         
	//   29   57:iconst_m1       
	//   30   58:putfield        #64  <Field int mBackStackId>
			return;
	//   31   61:return          
		}
		FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #87  <Method FragmentManager getFragmentManager()>
	//   34   66:invokevirtual   #97  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   35   69:astore_2        
		fragmenttransaction.remove(((Fragment) (this)));
	//   36   70:aload_2         
	//   37   71:aload_0         
	//   38   72:invokevirtual   #103 <Method FragmentTransaction FragmentTransaction.remove(Fragment)>
	//   39   75:pop             
		if(flag)
	//*  40   76:iload_1         
	//*  41   77:ifeq            86
		{
			fragmenttransaction.commitAllowingStateLoss();
	//   42   80:aload_2         
	//   43   81:invokevirtual   #107 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   44   84:pop             
			return;
	//   45   85:return          
		} else
		{
			fragmenttransaction.commit();
	//   46   86:aload_2         
	//   47   87:invokevirtual   #110 <Method int FragmentTransaction.commit()>
	//   48   90:pop             
			return;
	//   49   91:return          
		}
	}

	public Dialog getDialog()
	{
		return mDialog;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Dialog mDialog>
	//    2    4:areturn         
	}

	public boolean getShowsDialog()
	{
		return mShowsDialog;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean mShowsDialog>
	//    2    4:ireturn         
	}

	public int getTheme()
	{
		return mTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int mTheme>
	//    2    4:ireturn         
	}

	public boolean isCancelable()
	{
		return mCancelable;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean mCancelable>
	//    2    4:ireturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void Fragment.onActivityCreated(Bundle)>
		if(!mShowsDialog)
	//*   3    5:aload_0         
	//*   4    6:getfield        #62  <Field boolean mShowsDialog>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		Object obj = ((Object) (getView()));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #126 <Method View getView()>
	//    9   17:astore_2        
		if(obj != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          47
		{
			if(((View) (obj)).getParent() != null)
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #132 <Method android.view.ViewParent View.getParent()>
	//*  14   26:ifnull          39
				throw new IllegalStateException("DialogFragment can not be attached to a container view");
	//   15   29:new             #134 <Class IllegalStateException>
	//   16   32:dup             
	//   17   33:ldc1            #136 <String "DialogFragment can not be attached to a container view">
	//   18   35:invokespecial   #139 <Method void IllegalStateException(String)>
	//   19   38:athrow          
			mDialog.setContentView(((View) (obj)));
	//   20   39:aload_0         
	//   21   40:getfield        #77  <Field Dialog mDialog>
	//   22   43:aload_2         
	//   23   44:invokevirtual   #143 <Method void Dialog.setContentView(View)>
		}
		obj = ((Object) (getActivity()));
	//   24   47:aload_0         
	//   25   48:invokevirtual   #147 <Method FragmentActivity getActivity()>
	//   26   51:astore_2        
		if(obj != null)
	//*  27   52:aload_2         
	//*  28   53:ifnull          64
			mDialog.setOwnerActivity(((android.app.Activity) (obj)));
	//   29   56:aload_0         
	//   30   57:getfield        #77  <Field Dialog mDialog>
	//   31   60:aload_2         
	//   32   61:invokevirtual   #151 <Method void Dialog.setOwnerActivity(android.app.Activity)>
		mDialog.setCancelable(mCancelable);
	//   33   64:aload_0         
	//   34   65:getfield        #77  <Field Dialog mDialog>
	//   35   68:aload_0         
	//   36   69:getfield        #60  <Field boolean mCancelable>
	//   37   72:invokevirtual   #154 <Method void Dialog.setCancelable(boolean)>
		mDialog.setOnCancelListener(((android.content.DialogInterface.OnCancelListener) (this)));
	//   38   75:aload_0         
	//   39   76:getfield        #77  <Field Dialog mDialog>
	//   40   79:aload_0         
	//   41   80:invokevirtual   #158 <Method void Dialog.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
		mDialog.setOnDismissListener(((android.content.DialogInterface.OnDismissListener) (this)));
	//   42   83:aload_0         
	//   43   84:getfield        #77  <Field Dialog mDialog>
	//   44   87:aload_0         
	//   45   88:invokevirtual   #162 <Method void Dialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		if(bundle != null)
	//*  46   91:aload_1         
	//*  47   92:ifnull          114
		{
			bundle = bundle.getBundle("android:savedDialogState");
	//   48   95:aload_1         
	//   49   96:ldc1            #21  <String "android:savedDialogState">
	//   50   98:invokevirtual   #168 <Method Bundle Bundle.getBundle(String)>
	//   51  101:astore_1        
			if(bundle != null)
	//*  52  102:aload_1         
	//*  53  103:ifnull          114
				mDialog.onRestoreInstanceState(bundle);
	//   54  106:aload_0         
	//   55  107:getfield        #77  <Field Dialog mDialog>
	//   56  110:aload_1         
	//   57  111:invokevirtual   #171 <Method void Dialog.onRestoreInstanceState(Bundle)>
		}
	//   58  114:return          
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #175 <Method void Fragment.onAttach(Context)>
		if(!mShownByMe)
	//*   3    5:aload_0         
	//*   4    6:getfield        #75  <Field boolean mShownByMe>
	//*   5    9:ifne            17
			mDismissed = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #73  <Field boolean mDismissed>
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
	//    2    2:invokespecial   #181 <Method void Fragment.onCreate(Bundle)>
		boolean flag;
		if(mContainerId == 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #184 <Field int mContainerId>
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
	//   13   21:putfield        #62  <Field boolean mShowsDialog>
		if(bundle != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          86
		{
			mStyle = bundle.getInt("android:style", 0);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:ldc1            #27  <String "android:style">
	//   19   32:iconst_0        
	//   20   33:invokevirtual   #188 <Method int Bundle.getInt(String, int)>
	//   21   36:putfield        #56  <Field int mStyle>
			mTheme = bundle.getInt("android:theme", 0);
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:ldc1            #30  <String "android:theme">
	//   25   43:iconst_0        
	//   26   44:invokevirtual   #188 <Method int Bundle.getInt(String, int)>
	//   27   47:putfield        #58  <Field int mTheme>
			mCancelable = bundle.getBoolean("android:cancelable", true);
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:ldc1            #18  <String "android:cancelable">
	//   31   54:iconst_1        
	//   32   55:invokevirtual   #192 <Method boolean Bundle.getBoolean(String, boolean)>
	//   33   58:putfield        #60  <Field boolean mCancelable>
			mShowsDialog = bundle.getBoolean("android:showsDialog", mShowsDialog);
	//   34   61:aload_0         
	//   35   62:aload_1         
	//   36   63:ldc1            #24  <String "android:showsDialog">
	//   37   65:aload_0         
	//   38   66:getfield        #62  <Field boolean mShowsDialog>
	//   39   69:invokevirtual   #192 <Method boolean Bundle.getBoolean(String, boolean)>
	//   40   72:putfield        #62  <Field boolean mShowsDialog>
			mBackStackId = bundle.getInt("android:backStackId", -1);
	//   41   75:aload_0         
	//   42   76:aload_1         
	//   43   77:ldc1            #15  <String "android:backStackId">
	//   44   79:iconst_m1       
	//   45   80:invokevirtual   #188 <Method int Bundle.getInt(String, int)>
	//   46   83:putfield        #64  <Field int mBackStackId>
		}
	//   47   86:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		return new Dialog(((Context) (getActivity())), getTheme());
	//    0    0:new             #79  <Class Dialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #147 <Method FragmentActivity getActivity()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #198 <Method int getTheme()>
	//    6   12:invokespecial   #201 <Method void Dialog(Context, int)>
	//    7   15:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #204 <Method void Fragment.onDestroyView()>
		if(mDialog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #77  <Field Dialog mDialog>
	//*   4    8:ifnull          28
		{
			mViewDestroyed = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #83  <Field boolean mViewDestroyed>
			mDialog.dismiss();
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field Dialog mDialog>
	//   10   20:invokevirtual   #81  <Method void Dialog.dismiss()>
			mDialog = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #77  <Field Dialog mDialog>
		}
	//   14   28:return          
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void Fragment.onDetach()>
		if(!mShownByMe && !mDismissed)
	//*   2    4:aload_0         
	//*   3    5:getfield        #75  <Field boolean mShownByMe>
	//*   4    8:ifne            23
	//*   5   11:aload_0         
	//*   6   12:getfield        #73  <Field boolean mDismissed>
	//*   7   15:ifne            23
			mDismissed = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #73  <Field boolean mDismissed>
	//   11   23:return          
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		if(!mViewDestroyed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #83  <Field boolean mViewDestroyed>
	//*   2    4:ifne            12
			dismissInternal(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #70  <Method void dismissInternal(boolean)>
	//    6   12:return          
	}

	public LayoutInflater onGetLayoutInflater(Bundle bundle)
	{
		if(!mShowsDialog)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean mShowsDialog>
	//*   2    4:ifne            13
			return super.onGetLayoutInflater(bundle);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #212 <Method LayoutInflater Fragment.onGetLayoutInflater(Bundle)>
	//    6   12:areturn         
		mDialog = onCreateDialog(bundle);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #214 <Method Dialog onCreateDialog(Bundle)>
	//   11   19:putfield        #77  <Field Dialog mDialog>
		if(mDialog != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #77  <Field Dialog mDialog>
	//*  14   26:ifnull          57
		{
			setupDialog(mDialog, mStyle);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #77  <Field Dialog mDialog>
	//   18   34:aload_0         
	//   19   35:getfield        #56  <Field int mStyle>
	//   20   38:invokevirtual   #218 <Method void setupDialog(Dialog, int)>
			return (LayoutInflater)mDialog.getContext().getSystemService("layout_inflater");
	//   21   41:aload_0         
	//   22   42:getfield        #77  <Field Dialog mDialog>
	//   23   45:invokevirtual   #222 <Method Context Dialog.getContext()>
	//   24   48:ldc1            #224 <String "layout_inflater">
	//   25   50:invokevirtual   #230 <Method Object Context.getSystemService(String)>
	//   26   53:checkcast       #232 <Class LayoutInflater>
	//   27   56:areturn         
		} else
		{
			return (LayoutInflater)mHost.getContext().getSystemService("layout_inflater");
	//   28   57:aload_0         
	//   29   58:getfield        #236 <Field FragmentHostCallback mHost>
	//   30   61:invokevirtual   #239 <Method Context FragmentHostCallback.getContext()>
	//   31   64:ldc1            #224 <String "layout_inflater">
	//   32   66:invokevirtual   #230 <Method Object Context.getSystemService(String)>
	//   33   69:checkcast       #232 <Class LayoutInflater>
	//   34   72:areturn         
		}
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #242 <Method void Fragment.onSaveInstanceState(Bundle)>
		if(mDialog != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #77  <Field Dialog mDialog>
	//*   5    9:ifnull          31
		{
			Bundle bundle1 = mDialog.onSaveInstanceState();
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field Dialog mDialog>
	//    8   16:invokevirtual   #245 <Method Bundle Dialog.onSaveInstanceState()>
	//    9   19:astore_2        
			if(bundle1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          31
				bundle.putBundle("android:savedDialogState", bundle1);
	//   12   24:aload_1         
	//   13   25:ldc1            #21  <String "android:savedDialogState">
	//   14   27:aload_2         
	//   15   28:invokevirtual   #249 <Method void Bundle.putBundle(String, Bundle)>
		}
		if(mStyle != 0)
	//*  16   31:aload_0         
	//*  17   32:getfield        #56  <Field int mStyle>
	//*  18   35:ifeq            48
			bundle.putInt("android:style", mStyle);
	//   19   38:aload_1         
	//   20   39:ldc1            #27  <String "android:style">
	//   21   41:aload_0         
	//   22   42:getfield        #56  <Field int mStyle>
	//   23   45:invokevirtual   #253 <Method void Bundle.putInt(String, int)>
		if(mTheme != 0)
	//*  24   48:aload_0         
	//*  25   49:getfield        #58  <Field int mTheme>
	//*  26   52:ifeq            65
			bundle.putInt("android:theme", mTheme);
	//   27   55:aload_1         
	//   28   56:ldc1            #30  <String "android:theme">
	//   29   58:aload_0         
	//   30   59:getfield        #58  <Field int mTheme>
	//   31   62:invokevirtual   #253 <Method void Bundle.putInt(String, int)>
		if(!mCancelable)
	//*  32   65:aload_0         
	//*  33   66:getfield        #60  <Field boolean mCancelable>
	//*  34   69:ifne            82
			bundle.putBoolean("android:cancelable", mCancelable);
	//   35   72:aload_1         
	//   36   73:ldc1            #18  <String "android:cancelable">
	//   37   75:aload_0         
	//   38   76:getfield        #60  <Field boolean mCancelable>
	//   39   79:invokevirtual   #257 <Method void Bundle.putBoolean(String, boolean)>
		if(!mShowsDialog)
	//*  40   82:aload_0         
	//*  41   83:getfield        #62  <Field boolean mShowsDialog>
	//*  42   86:ifne            99
			bundle.putBoolean("android:showsDialog", mShowsDialog);
	//   43   89:aload_1         
	//   44   90:ldc1            #24  <String "android:showsDialog">
	//   45   92:aload_0         
	//   46   93:getfield        #62  <Field boolean mShowsDialog>
	//   47   96:invokevirtual   #257 <Method void Bundle.putBoolean(String, boolean)>
		if(mBackStackId != -1)
	//*  48   99:aload_0         
	//*  49  100:getfield        #64  <Field int mBackStackId>
	//*  50  103:iconst_m1       
	//*  51  104:icmpeq          117
			bundle.putInt("android:backStackId", mBackStackId);
	//   52  107:aload_1         
	//   53  108:ldc1            #15  <String "android:backStackId">
	//   54  110:aload_0         
	//   55  111:getfield        #64  <Field int mBackStackId>
	//   56  114:invokevirtual   #253 <Method void Bundle.putInt(String, int)>
	//   57  117:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void Fragment.onStart()>
		if(mDialog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #77  <Field Dialog mDialog>
	//*   4    8:ifnull          23
		{
			mViewDestroyed = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #83  <Field boolean mViewDestroyed>
			mDialog.show();
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field Dialog mDialog>
	//   10   20:invokevirtual   #263 <Method void Dialog.show()>
		}
	//   11   23:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #266 <Method void Fragment.onStop()>
		if(mDialog != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #77  <Field Dialog mDialog>
	//*   4    8:ifnull          18
			mDialog.hide();
	//    5   11:aload_0         
	//    6   12:getfield        #77  <Field Dialog mDialog>
	//    7   15:invokevirtual   #269 <Method void Dialog.hide()>
	//    8   18:return          
	}

	public void setCancelable(boolean flag)
	{
		mCancelable = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #60  <Field boolean mCancelable>
		if(mDialog != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #77  <Field Dialog mDialog>
	//*   5    9:ifnull          20
			mDialog.setCancelable(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #77  <Field Dialog mDialog>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #154 <Method void Dialog.setCancelable(boolean)>
	//   10   20:return          
	}

	public void setShowsDialog(boolean flag)
	{
		mShowsDialog = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #62  <Field boolean mShowsDialog>
	//    3    5:return          
	}

	public void setStyle(int i, int j)
	{
		mStyle = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int mStyle>
		if(mStyle == 2 || mStyle == 3)
	//*   3    5:aload_0         
	//*   4    6:getfield        #56  <Field int mStyle>
	//*   5    9:iconst_2        
	//*   6   10:icmpeq          21
	//*   7   13:aload_0         
	//*   8   14:getfield        #56  <Field int mStyle>
	//*   9   17:iconst_3        
	//*  10   18:icmpne          28
			mTheme = 0x1030059;
	//   11   21:aload_0         
	//   12   22:ldc2            #272 <Int 0x1030059>
	//   13   25:putfield        #58  <Field int mTheme>
		if(j != 0)
	//*  14   28:iload_2         
	//*  15   29:ifeq            37
			mTheme = j;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:putfield        #58  <Field int mTheme>
	//   19   37:return          
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
	//    4   30:invokevirtual   #280 <Method Window Dialog.getWindow()>
	//    5   33:bipush          24
	//    6   35:invokevirtual   #286 <Method void Window.addFlags(int)>
			// fall through

		case 1: // '\001'
		case 2: // '\002'
			dialog.requestWindowFeature(1);
	//    7   38:aload_1         
	//    8   39:iconst_1        
	//    9   40:invokevirtual   #290 <Method boolean Dialog.requestWindowFeature(int)>
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
	//    2    2:putfield        #73  <Field boolean mDismissed>
		mShownByMe = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #75  <Field boolean mShownByMe>
		fragmenttransaction.add(((Fragment) (this)), s);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #295 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   10   16:pop             
		mViewDestroyed = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #83  <Field boolean mViewDestroyed>
		mBackStackId = fragmenttransaction.commit();
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #110 <Method int FragmentTransaction.commit()>
	//   17   27:putfield        #64  <Field int mBackStackId>
		return mBackStackId;
	//   18   30:aload_0         
	//   19   31:getfield        #64  <Field int mBackStackId>
	//   20   34:ireturn         
	}

	public void show(FragmentManager fragmentmanager, String s)
	{
		mDismissed = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #73  <Field boolean mDismissed>
		mShownByMe = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #75  <Field boolean mShownByMe>
		fragmentmanager = ((FragmentManager) (fragmentmanager.beginTransaction()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    8   14:astore_1        
		((FragmentTransaction) (fragmentmanager)).add(((Fragment) (this)), s);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #295 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   13   21:pop             
		((FragmentTransaction) (fragmentmanager)).commit();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #110 <Method int FragmentTransaction.commit()>
	//   16   26:pop             
	//   17   27:return          
	}

	public void showNow(FragmentManager fragmentmanager, String s)
	{
		mDismissed = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #73  <Field boolean mDismissed>
		mShownByMe = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #75  <Field boolean mShownByMe>
		fragmentmanager = ((FragmentManager) (fragmentmanager.beginTransaction()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #97  <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    8   14:astore_1        
		((FragmentTransaction) (fragmentmanager)).add(((Fragment) (this)), s);
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #295 <Method FragmentTransaction FragmentTransaction.add(Fragment, String)>
	//   13   21:pop             
		((FragmentTransaction) (fragmentmanager)).commitNow();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #300 <Method void FragmentTransaction.commitNow()>
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
