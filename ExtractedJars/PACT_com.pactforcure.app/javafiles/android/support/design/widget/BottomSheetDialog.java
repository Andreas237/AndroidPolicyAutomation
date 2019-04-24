// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AppCompatDialog;
import android.util.TypedValue;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.widget:
//			CoordinatorLayout, BottomSheetBehavior

public class BottomSheetDialog extends AppCompatDialog
{

	public BottomSheetDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #27  <Method void BottomSheetDialog(Context, int)>
	//    4    6:return          
	}

	public BottomSheetDialog(Context context, int i)
	{
		super(context, getThemeResId(context, i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #34  <Method int getThemeResId(Context, int)>
	//    5    7:invokespecial   #35  <Method void AppCompatDialog(Context, int)>
		mCancelable = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #37  <Field boolean mCancelable>
		mCanceledOnTouchOutside = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #39  <Field boolean mCanceledOnTouchOutside>
	//   12   20:aload_0         
	//   13   21:new             #12  <Class BottomSheetDialog$4>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #42  <Method void BottomSheetDialog$4(BottomSheetDialog)>
	//   17   29:putfield        #44  <Field BottomSheetBehavior$BottomSheetCallback mBottomSheetCallback>
		supportRequestWindowFeature(1);
	//   18   32:aload_0         
	//   19   33:iconst_1        
	//   20   34:invokevirtual   #48  <Method boolean supportRequestWindowFeature(int)>
	//   21   37:pop             
	//   22   38:return          
	}

	protected BottomSheetDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		super(context, flag, oncancellistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #51  <Method void AppCompatDialog(Context, boolean, android.content.DialogInterface$OnCancelListener)>
		mCancelable = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #37  <Field boolean mCancelable>
		mCanceledOnTouchOutside = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #39  <Field boolean mCanceledOnTouchOutside>
	//   11   17:aload_0         
	//   12   18:new             #12  <Class BottomSheetDialog$4>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:invokespecial   #42  <Method void BottomSheetDialog$4(BottomSheetDialog)>
	//   16   26:putfield        #44  <Field BottomSheetBehavior$BottomSheetCallback mBottomSheetCallback>
		supportRequestWindowFeature(1);
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:invokevirtual   #48  <Method boolean supportRequestWindowFeature(int)>
	//   20   34:pop             
		mCancelable = flag;
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:putfield        #37  <Field boolean mCancelable>
	//   24   40:return          
	}

	private static int getThemeResId(Context context, int i)
	{
label0:
		{
			int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
			if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            34
			{
				TypedValue typedvalue = new TypedValue();
	//    4    6:new             #53  <Class TypedValue>
	//    5    9:dup             
	//    6   10:invokespecial   #56  <Method void TypedValue()>
	//    7   13:astore_3        
				if(!context.getTheme().resolveAttribute(android.support.design.R.attr.bottomSheetDialogTheme, typedvalue, true))
					break label0;
	//    8   14:aload_0         
	//    9   15:invokevirtual   #62  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   18:getstatic       #68  <Field int android.support.design.R$attr.bottomSheetDialogTheme>
	//   11   21:aload_3         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #74  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   26:ifeq            36
				j = typedvalue.resourceId;
	//   15   29:aload_3         
	//   16   30:getfield        #77  <Field int TypedValue.resourceId>
	//   17   33:istore_2        
			}
			return j;
	//   18   34:iload_2         
	//   19   35:ireturn         
		}
		return android.support.design.R.style.Theme_Design_Light_BottomSheetDialog;
	//   20   36:getstatic       #82  <Field int android.support.design.R$style.Theme_Design_Light_BottomSheetDialog>
	//   21   39:ireturn         
	}

	private View wrapInBottomSheet(int i, View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		FrameLayout framelayout = (FrameLayout)View.inflate(getContext(), android.support.design.R.layout.design_bottom_sheet_dialog, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Context getContext()>
	//    2    4:getstatic       #93  <Field int android.support.design.R$layout.design_bottom_sheet_dialog>
	//    3    7:aconst_null     
	//    4    8:invokestatic    #99  <Method View View.inflate(Context, int, android.view.ViewGroup)>
	//    5   11:checkcast       #101 <Class FrameLayout>
	//    6   14:astore          5
		CoordinatorLayout coordinatorlayout = (CoordinatorLayout)framelayout.findViewById(android.support.design.R.id.coordinator);
	//    7   16:aload           5
	//    8   18:getstatic       #106 <Field int android.support.design.R$id.coordinator>
	//    9   21:invokevirtual   #110 <Method View FrameLayout.findViewById(int)>
	//   10   24:checkcast       #112 <Class CoordinatorLayout>
	//   11   27:astore          6
		View view1 = view;
	//   12   29:aload_2         
	//   13   30:astore          4
		if(i != 0)
	//*  14   32:iload_1         
	//*  15   33:ifeq            56
		{
			view1 = view;
	//   16   36:aload_2         
	//   17   37:astore          4
			if(view == null)
	//*  18   39:aload_2         
	//*  19   40:ifnonnull       56
				view1 = getLayoutInflater().inflate(i, ((android.view.ViewGroup) (coordinatorlayout)), false);
	//   20   43:aload_0         
	//   21   44:invokevirtual   #116 <Method LayoutInflater getLayoutInflater()>
	//   22   47:iload_1         
	//   23   48:aload           6
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #121 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   26   54:astore          4
		}
		view = ((View) ((FrameLayout)coordinatorlayout.findViewById(android.support.design.R.id.design_bottom_sheet)));
	//   27   56:aload           6
	//   28   58:getstatic       #124 <Field int android.support.design.R$id.design_bottom_sheet>
	//   29   61:invokevirtual   #125 <Method View CoordinatorLayout.findViewById(int)>
	//   30   64:checkcast       #101 <Class FrameLayout>
	//   31   67:astore_2        
		mBehavior = BottomSheetBehavior.from(view);
	//   32   68:aload_0         
	//   33   69:aload_2         
	//   34   70:invokestatic    #131 <Method BottomSheetBehavior BottomSheetBehavior.from(View)>
	//   35   73:putfield        #133 <Field BottomSheetBehavior mBehavior>
		mBehavior.setBottomSheetCallback(mBottomSheetCallback);
	//   36   76:aload_0         
	//   37   77:getfield        #133 <Field BottomSheetBehavior mBehavior>
	//   38   80:aload_0         
	//   39   81:getfield        #44  <Field BottomSheetBehavior$BottomSheetCallback mBottomSheetCallback>
	//   40   84:invokevirtual   #137 <Method void BottomSheetBehavior.setBottomSheetCallback(BottomSheetBehavior$BottomSheetCallback)>
		mBehavior.setHideable(mCancelable);
	//   41   87:aload_0         
	//   42   88:getfield        #133 <Field BottomSheetBehavior mBehavior>
	//   43   91:aload_0         
	//   44   92:getfield        #37  <Field boolean mCancelable>
	//   45   95:invokevirtual   #141 <Method void BottomSheetBehavior.setHideable(boolean)>
		if(layoutparams == null)
	//*  46   98:aload_3         
	//*  47   99:ifnonnull       154
			((FrameLayout) (view)).addView(view1);
	//   48  102:aload_2         
	//   49  103:aload           4
	//   50  105:invokevirtual   #145 <Method void FrameLayout.addView(View)>
		else
	//*  51  108:aload           6
	//*  52  110:getstatic       #148 <Field int android.support.design.R$id.touch_outside>
	//*  53  113:invokevirtual   #125 <Method View CoordinatorLayout.findViewById(int)>
	//*  54  116:new             #6   <Class BottomSheetDialog$1>
	//*  55  119:dup             
	//*  56  120:aload_0         
	//*  57  121:invokespecial   #149 <Method void BottomSheetDialog$1(BottomSheetDialog)>
	//*  58  124:invokevirtual   #153 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//*  59  127:aload_2         
	//*  60  128:new             #8   <Class BottomSheetDialog$2>
	//*  61  131:dup             
	//*  62  132:aload_0         
	//*  63  133:invokespecial   #154 <Method void BottomSheetDialog$2(BottomSheetDialog)>
	//*  64  136:invokestatic    #160 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//*  65  139:aload_2         
	//*  66  140:new             #10  <Class BottomSheetDialog$3>
	//*  67  143:dup             
	//*  68  144:aload_0         
	//*  69  145:invokespecial   #161 <Method void BottomSheetDialog$3(BottomSheetDialog)>
	//*  70  148:invokevirtual   #165 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
	//*  71  151:aload           5
	//*  72  153:areturn         
			((FrameLayout) (view)).addView(view1, layoutparams);
	//   73  154:aload_2         
	//   74  155:aload           4
	//   75  157:aload_3         
	//   76  158:invokevirtual   #168 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		coordinatorlayout.findViewById(android.support.design.R.id.touch_outside).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view2)
			{
				if(mCancelable && isShowing() && shouldWindowCloseOnTouchOutside())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field BottomSheetDialog this$0>
			//*   2    4:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
			//*   3    7:ifeq            37
			//*   4   10:aload_0         
			//*   5   11:getfield        #17  <Field BottomSheetDialog this$0>
			//*   6   14:invokevirtual   #31  <Method boolean BottomSheetDialog.isShowing()>
			//*   7   17:ifeq            37
			//*   8   20:aload_0         
			//*   9   21:getfield        #17  <Field BottomSheetDialog this$0>
			//*  10   24:invokevirtual   #34  <Method boolean BottomSheetDialog.shouldWindowCloseOnTouchOutside()>
			//*  11   27:ifeq            37
					cancel();
			//   12   30:aload_0         
			//   13   31:getfield        #17  <Field BottomSheetDialog this$0>
			//   14   34:invokevirtual   #37  <Method void BottomSheetDialog.cancel()>
			//   15   37:return          
			}

			final BottomSheetDialog this$0;

			
			{
				this$0 = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BottomSheetDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (new AccessibilityDelegateCompat() {

			public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
			{
				super.onInitializeAccessibilityNodeInfo(view2, accessibilitynodeinfocompat);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				if(mCancelable)
			//*   4    6:aload_0         
			//*   5    7:getfield        #15  <Field BottomSheetDialog this$0>
			//*   6   10:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
			//*   7   13:ifeq            28
				{
					accessibilitynodeinfocompat.addAction(0x100000);
			//    8   16:aload_2         
			//    9   17:ldc1            #28  <Int 0x100000>
			//   10   19:invokevirtual   #34  <Method void AccessibilityNodeInfoCompat.addAction(int)>
					accessibilitynodeinfocompat.setDismissable(true);
			//   11   22:aload_2         
			//   12   23:iconst_1        
			//   13   24:invokevirtual   #38  <Method void AccessibilityNodeInfoCompat.setDismissable(boolean)>
					return;
			//   14   27:return          
				} else
				{
					accessibilitynodeinfocompat.setDismissable(false);
			//   15   28:aload_2         
			//   16   29:iconst_0        
			//   17   30:invokevirtual   #38  <Method void AccessibilityNodeInfoCompat.setDismissable(boolean)>
					return;
			//   18   33:return          
				}
			}

			public boolean performAccessibilityAction(View view2, int j, Bundle bundle)
			{
				if(j == 0x100000 && mCancelable)
			//*   0    0:iload_2         
			//*   1    1:ldc1            #28  <Int 0x100000>
			//*   2    3:icmpne          25
			//*   3    6:aload_0         
			//*   4    7:getfield        #15  <Field BottomSheetDialog this$0>
			//*   5   10:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
			//*   6   13:ifeq            25
				{
					cancel();
			//    7   16:aload_0         
			//    8   17:getfield        #15  <Field BottomSheetDialog this$0>
			//    9   20:invokevirtual   #43  <Method void BottomSheetDialog.cancel()>
					return true;
			//   10   23:iconst_1        
			//   11   24:ireturn         
				} else
				{
					return super.performAccessibilityAction(view2, j, bundle);
			//   12   25:aload_0         
			//   13   26:aload_1         
			//   14   27:iload_2         
			//   15   28:aload_3         
			//   16   29:invokespecial   #45  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
			//   17   32:ireturn         
				}
			}

			final BottomSheetDialog this$0;

			
			{
				this$0 = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BottomSheetDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AccessibilityDelegateCompat()>
			//    5    9:return          
			}
		}
)));
		((FrameLayout) (view)).setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view2, MotionEvent motionevent)
			{
				return true;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			final BottomSheetDialog this$0;

			
			{
				this$0 = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BottomSheetDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
		return ((View) (framelayout));
	//*  77  161:goto            108
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #172 <Method void AppCompatDialog.onCreate(Bundle)>
		bundle = ((Bundle) (getWindow()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #176 <Method Window getWindow()>
	//    5    9:astore_1        
		if(bundle != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          40
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   14:getstatic       #181 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   17:bipush          21
	//*  10   19:icmplt          34
			{
				((Window) (bundle)).clearFlags(0x4000000);
	//   11   22:aload_1         
	//   12   23:ldc1            #182 <Int 0x4000000>
	//   13   25:invokevirtual   #188 <Method void Window.clearFlags(int)>
				((Window) (bundle)).addFlags(0x80000000);
	//   14   28:aload_1         
	//   15   29:ldc1            #189 <Int 0x80000000>
	//   16   31:invokevirtual   #192 <Method void Window.addFlags(int)>
			}
			((Window) (bundle)).setLayout(-1, -1);
	//   17   34:aload_1         
	//   18   35:iconst_m1       
	//   19   36:iconst_m1       
	//   20   37:invokevirtual   #196 <Method void Window.setLayout(int, int)>
		}
	//   21   40:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method void AppCompatDialog.onStart()>
		if(mBehavior != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #133 <Field BottomSheetBehavior mBehavior>
	//*   4    8:ifnull          19
			mBehavior.setState(4);
	//    5   11:aload_0         
	//    6   12:getfield        #133 <Field BottomSheetBehavior mBehavior>
	//    7   15:iconst_4        
	//    8   16:invokevirtual   #202 <Method void BottomSheetBehavior.setState(int)>
	//    9   19:return          
	}

	public void setCancelable(boolean flag)
	{
		super.setCancelable(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #205 <Method void AppCompatDialog.setCancelable(boolean)>
		if(mCancelable != flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field boolean mCancelable>
	//*   5    9:iload_1         
	//*   6   10:icmpeq          33
		{
			mCancelable = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #37  <Field boolean mCancelable>
			if(mBehavior != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #133 <Field BottomSheetBehavior mBehavior>
	//*  12   22:ifnull          33
				mBehavior.setHideable(flag);
	//   13   25:aload_0         
	//   14   26:getfield        #133 <Field BottomSheetBehavior mBehavior>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #141 <Method void BottomSheetBehavior.setHideable(boolean)>
		}
	//   17   33:return          
	}

	public void setCanceledOnTouchOutside(boolean flag)
	{
		super.setCanceledOnTouchOutside(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #208 <Method void AppCompatDialog.setCanceledOnTouchOutside(boolean)>
		if(flag && !mCancelable)
	//*   3    5:iload_1         
	//*   4    6:ifeq            21
	//*   5    9:aload_0         
	//*   6   10:getfield        #37  <Field boolean mCancelable>
	//*   7   13:ifne            21
			mCancelable = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #37  <Field boolean mCancelable>
		mCanceledOnTouchOutside = flag;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:putfield        #39  <Field boolean mCanceledOnTouchOutside>
		mCanceledOnTouchOutsideSet = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #210 <Field boolean mCanceledOnTouchOutsideSet>
	//   17   31:return          
	}

	public void setContentView(int i)
	{
		super.setContentView(wrapInBottomSheet(i, ((View) (null)), ((android.view.ViewGroup.LayoutParams) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:aconst_null     
	//    4    4:aconst_null     
	//    5    5:invokespecial   #214 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #216 <Method void AppCompatDialog.setContentView(View)>
	//    7   11:return          
	}

	public void setContentView(View view)
	{
		super.setContentView(wrapInBottomSheet(0, view, ((android.view.ViewGroup.LayoutParams) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:aconst_null     
	//    5    5:invokespecial   #214 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #216 <Method void AppCompatDialog.setContentView(View)>
	//    7   11:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.setContentView(wrapInBottomSheet(0, view, layoutparams));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokespecial   #214 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #216 <Method void AppCompatDialog.setContentView(View)>
	//    7   11:return          
	}

	boolean shouldWindowCloseOnTouchOutside()
	{
		if(!mCanceledOnTouchOutsideSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field boolean mCanceledOnTouchOutsideSet>
	//*   2    4:ifne            25
		{
			if(android.os.Build.VERSION.SDK_INT < 11)
	//*   3    7:getstatic       #181 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          11
	//*   5   12:icmpge          30
			{
				mCanceledOnTouchOutside = true;
	//    6   15:aload_0         
	//    7   16:iconst_1        
	//    8   17:putfield        #39  <Field boolean mCanceledOnTouchOutside>
			} else
	//*   9   20:aload_0         
	//*  10   21:iconst_1        
	//*  11   22:putfield        #210 <Field boolean mCanceledOnTouchOutsideSet>
	//*  12   25:aload_0         
	//*  13   26:getfield        #39  <Field boolean mCanceledOnTouchOutside>
	//*  14   29:ireturn         
			{
				TypedArray typedarray = getContext().obtainStyledAttributes(new int[] {
					0x101035b
				});
	//   15   30:aload_0         
	//   16   31:invokevirtual   #88  <Method Context getContext()>
	//   17   34:iconst_1        
	//   18   35:newarray        int[]
	//   19   37:dup             
	//   20   38:iconst_0        
	//   21   39:ldc1            #219 <Int 0x101035b>
	//   22   41:iastore         
	//   23   42:invokevirtual   #223 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   24   45:astore_1        
				mCanceledOnTouchOutside = typedarray.getBoolean(0, true);
	//   25   46:aload_0         
	//   26   47:aload_1         
	//   27   48:iconst_0        
	//   28   49:iconst_1        
	//   29   50:invokevirtual   #229 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   30   53:putfield        #39  <Field boolean mCanceledOnTouchOutside>
				typedarray.recycle();
	//   31   56:aload_1         
	//   32   57:invokevirtual   #232 <Method void TypedArray.recycle()>
			}
			mCanceledOnTouchOutsideSet = true;
		}
		return mCanceledOnTouchOutside;
	//*  33   60:goto            20
	}

	private BottomSheetBehavior mBehavior;
	private BottomSheetBehavior.BottomSheetCallback mBottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {

		public void onSlide(View view, float f)
		{
		//    0    0:return          
		}

		public void onStateChanged(View view, int j)
		{
			if(j == 5)
		//*   0    0:iload_2         
		//*   1    1:iconst_5        
		//*   2    2:icmpne          12
				cancel();
		//    3    5:aload_0         
		//    4    6:getfield        #12  <Field BottomSheetDialog this$0>
		//    5    9:invokevirtual   #25  <Method void BottomSheetDialog.cancel()>
		//    6   12:return          
		}

		final BottomSheetDialog this$0;

			
			{
				this$0 = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BottomSheetDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BottomSheetBehavior$BottomSheetCallback()>
			//    5    9:return          
			}
	}
;
	boolean mCancelable;
	private boolean mCanceledOnTouchOutside;
	private boolean mCanceledOnTouchOutsideSet;
}
