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
	//   13   21:new             #10  <Class BottomSheetDialog$3>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #42  <Method void BottomSheetDialog$3(BottomSheetDialog)>
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
	//   12   18:new             #10  <Class BottomSheetDialog$3>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:invokespecial   #42  <Method void BottomSheetDialog$3(BottomSheetDialog)>
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
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            38
		{
			TypedValue typedvalue = new TypedValue();
	//    4    6:new             #53  <Class TypedValue>
	//    5    9:dup             
	//    6   10:invokespecial   #56  <Method void TypedValue()>
	//    7   13:astore_3        
			if(context.getTheme().resolveAttribute(android.support.design.R.attr.bottomSheetDialogTheme, typedvalue, true))
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #62  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  10   18:getstatic       #68  <Field int android.support.design.R$attr.bottomSheetDialogTheme>
	//*  11   21:aload_3         
	//*  12   22:iconst_1        
	//*  13   23:invokevirtual   #74  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  14   26:ifeq            34
				return typedvalue.resourceId;
	//   15   29:aload_3         
	//   16   30:getfield        #77  <Field int TypedValue.resourceId>
	//   17   33:ireturn         
			j = android.support.design.R.style.Theme_Design_Light_BottomSheetDialog;
	//   18   34:getstatic       #82  <Field int android.support.design.R$style.Theme_Design_Light_BottomSheetDialog>
	//   19   37:istore_2        
		}
		return j;
	//   20   38:iload_2         
	//   21   39:ireturn         
	}

	private View wrapInBottomSheet(int i, View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		CoordinatorLayout coordinatorlayout = (CoordinatorLayout)View.inflate(getContext(), android.support.design.R.layout.design_bottom_sheet_dialog, ((android.view.ViewGroup) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method Context getContext()>
	//    2    4:getstatic       #93  <Field int android.support.design.R$layout.design_bottom_sheet_dialog>
	//    3    7:aconst_null     
	//    4    8:invokestatic    #99  <Method View View.inflate(Context, int, android.view.ViewGroup)>
	//    5   11:checkcast       #101 <Class CoordinatorLayout>
	//    6   14:astore          5
		View view1 = view;
	//    7   16:aload_2         
	//    8   17:astore          4
		if(i != 0)
	//*   9   19:iload_1         
	//*  10   20:ifeq            43
		{
			view1 = view;
	//   11   23:aload_2         
	//   12   24:astore          4
			if(view == null)
	//*  13   26:aload_2         
	//*  14   27:ifnonnull       43
				view1 = getLayoutInflater().inflate(i, ((android.view.ViewGroup) (coordinatorlayout)), false);
	//   15   30:aload_0         
	//   16   31:invokevirtual   #105 <Method LayoutInflater getLayoutInflater()>
	//   17   34:iload_1         
	//   18   35:aload           5
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #110 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   21   41:astore          4
		}
		view = ((View) ((FrameLayout)coordinatorlayout.findViewById(android.support.design.R.id.design_bottom_sheet)));
	//   22   43:aload           5
	//   23   45:getstatic       #115 <Field int android.support.design.R$id.design_bottom_sheet>
	//   24   48:invokevirtual   #119 <Method View CoordinatorLayout.findViewById(int)>
	//   25   51:checkcast       #121 <Class FrameLayout>
	//   26   54:astore_2        
		mBehavior = BottomSheetBehavior.from(view);
	//   27   55:aload_0         
	//   28   56:aload_2         
	//   29   57:invokestatic    #127 <Method BottomSheetBehavior BottomSheetBehavior.from(View)>
	//   30   60:putfield        #129 <Field BottomSheetBehavior mBehavior>
		mBehavior.setBottomSheetCallback(mBottomSheetCallback);
	//   31   63:aload_0         
	//   32   64:getfield        #129 <Field BottomSheetBehavior mBehavior>
	//   33   67:aload_0         
	//   34   68:getfield        #44  <Field BottomSheetBehavior$BottomSheetCallback mBottomSheetCallback>
	//   35   71:invokevirtual   #133 <Method void BottomSheetBehavior.setBottomSheetCallback(BottomSheetBehavior$BottomSheetCallback)>
		mBehavior.setHideable(mCancelable);
	//   36   74:aload_0         
	//   37   75:getfield        #129 <Field BottomSheetBehavior mBehavior>
	//   38   78:aload_0         
	//   39   79:getfield        #37  <Field boolean mCancelable>
	//   40   82:invokevirtual   #137 <Method void BottomSheetBehavior.setHideable(boolean)>
		if(layoutparams == null)
	//*  41   85:aload_3         
	//*  42   86:ifnonnull       98
			((FrameLayout) (view)).addView(view1);
	//   43   89:aload_2         
	//   44   90:aload           4
	//   45   92:invokevirtual   #141 <Method void FrameLayout.addView(View)>
		else
	//*  46   95:goto            105
			((FrameLayout) (view)).addView(view1, layoutparams);
	//   47   98:aload_2         
	//   48   99:aload           4
	//   49  101:aload_3         
	//   50  102:invokevirtual   #144 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		coordinatorlayout.findViewById(android.support.design.R.id.touch_outside).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view2)
			{
				if(c.mCancelable && c.isShowing() && c.shouldWindowCloseOnTouchOutside())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field BottomSheetDialog c>
			//*   2    4:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
			//*   3    7:ifeq            37
			//*   4   10:aload_0         
			//*   5   11:getfield        #17  <Field BottomSheetDialog c>
			//*   6   14:invokevirtual   #31  <Method boolean BottomSheetDialog.isShowing()>
			//*   7   17:ifeq            37
			//*   8   20:aload_0         
			//*   9   21:getfield        #17  <Field BottomSheetDialog c>
			//*  10   24:invokevirtual   #34  <Method boolean BottomSheetDialog.shouldWindowCloseOnTouchOutside()>
			//*  11   27:ifeq            37
					c.cancel();
			//   12   30:aload_0         
			//   13   31:getfield        #17  <Field BottomSheetDialog c>
			//   14   34:invokevirtual   #37  <Method void BottomSheetDialog.cancel()>
			//   15   37:return          
			}

			final BottomSheetDialog c;

			
			{
				c = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BottomSheetDialog c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   51  105:aload           5
	//   52  107:getstatic       #147 <Field int android.support.design.R$id.touch_outside>
	//   53  110:invokevirtual   #119 <Method View CoordinatorLayout.findViewById(int)>
	//   54  113:new             #12  <Class BottomSheetDialog$4>
	//   55  116:dup             
	//   56  117:aload_0         
	//   57  118:invokespecial   #148 <Method void BottomSheetDialog$4(BottomSheetDialog)>
	//   58  121:invokevirtual   #152 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (new AccessibilityDelegateCompat() {

			public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
			{
				super.onInitializeAccessibilityNodeInfo(view2, accessibilitynodeinfocompat);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				if(e.mCancelable)
			//*   4    6:aload_0         
			//*   5    7:getfield        #15  <Field BottomSheetDialog e>
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
				if(j == 0x100000 && e.mCancelable)
			//*   0    0:iload_2         
			//*   1    1:ldc1            #28  <Int 0x100000>
			//*   2    3:icmpne          25
			//*   3    6:aload_0         
			//*   4    7:getfield        #15  <Field BottomSheetDialog e>
			//*   5   10:getfield        #27  <Field boolean BottomSheetDialog.mCancelable>
			//*   6   13:ifeq            25
				{
					e.cancel();
			//    7   16:aload_0         
			//    8   17:getfield        #15  <Field BottomSheetDialog e>
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

			final BottomSheetDialog e;

			
			{
				e = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BottomSheetDialog e>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AccessibilityDelegateCompat()>
			//    5    9:return          
			}
		}
)));
	//   59  124:aload_2         
	//   60  125:new             #8   <Class BottomSheetDialog$2>
	//   61  128:dup             
	//   62  129:aload_0         
	//   63  130:invokespecial   #153 <Method void BottomSheetDialog$2(BottomSheetDialog)>
	//   64  133:invokestatic    #159 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		((FrameLayout) (view)).setOnTouchListener(new android.view.View.OnTouchListener() {

			public boolean onTouch(View view2, MotionEvent motionevent)
			{
				return true;
			//    0    0:iconst_1        
			//    1    1:ireturn         
			}

			final BottomSheetDialog d;

			
			{
				d = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BottomSheetDialog d>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   65  136:aload_2         
	//   66  137:new             #6   <Class BottomSheetDialog$1>
	//   67  140:dup             
	//   68  141:aload_0         
	//   69  142:invokespecial   #160 <Method void BottomSheetDialog$1(BottomSheetDialog)>
	//   70  145:invokevirtual   #164 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		return ((View) (coordinatorlayout));
	//   71  148:aload           5
	//   72  150:areturn         
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #168 <Method void AppCompatDialog.onCreate(Bundle)>
		getWindow().setLayout(-1, -1);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #172 <Method Window getWindow()>
	//    5    9:iconst_m1       
	//    6   10:iconst_m1       
	//    7   11:invokevirtual   #178 <Method void Window.setLayout(int, int)>
	//    8   14:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #181 <Method void AppCompatDialog.onStart()>
		if(mBehavior != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #129 <Field BottomSheetBehavior mBehavior>
	//*   4    8:ifnull          19
			mBehavior.setState(4);
	//    5   11:aload_0         
	//    6   12:getfield        #129 <Field BottomSheetBehavior mBehavior>
	//    7   15:iconst_4        
	//    8   16:invokevirtual   #185 <Method void BottomSheetBehavior.setState(int)>
	//    9   19:return          
	}

	public void setCancelable(boolean flag)
	{
		super.setCancelable(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #188 <Method void AppCompatDialog.setCancelable(boolean)>
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
	//*  11   19:getfield        #129 <Field BottomSheetBehavior mBehavior>
	//*  12   22:ifnull          33
				mBehavior.setHideable(flag);
	//   13   25:aload_0         
	//   14   26:getfield        #129 <Field BottomSheetBehavior mBehavior>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #137 <Method void BottomSheetBehavior.setHideable(boolean)>
		}
	//   17   33:return          
	}

	public void setCanceledOnTouchOutside(boolean flag)
	{
		super.setCanceledOnTouchOutside(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #191 <Method void AppCompatDialog.setCanceledOnTouchOutside(boolean)>
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
	//   16   28:putfield        #193 <Field boolean mCanceledOnTouchOutsideSet>
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
	//    5    5:invokespecial   #197 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #199 <Method void AppCompatDialog.setContentView(View)>
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
	//    5    5:invokespecial   #197 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #199 <Method void AppCompatDialog.setContentView(View)>
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
	//    5    5:invokespecial   #197 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #199 <Method void AppCompatDialog.setContentView(View)>
	//    7   11:return          
	}

	boolean shouldWindowCloseOnTouchOutside()
	{
		if(!mCanceledOnTouchOutsideSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #193 <Field boolean mCanceledOnTouchOutsideSet>
	//*   2    4:ifne            58
		{
			if(android.os.Build.VERSION.SDK_INT < 11)
	//*   3    7:getstatic       #206 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          11
	//*   5   12:icmpge          23
			{
				mCanceledOnTouchOutside = true;
	//    6   15:aload_0         
	//    7   16:iconst_1        
	//    8   17:putfield        #39  <Field boolean mCanceledOnTouchOutside>
			} else
	//*   9   20:goto            53
			{
				TypedArray typedarray = getContext().obtainStyledAttributes(new int[] {
					0x101035b
				});
	//   10   23:aload_0         
	//   11   24:invokevirtual   #88  <Method Context getContext()>
	//   12   27:iconst_1        
	//   13   28:newarray        int[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:ldc1            #207 <Int 0x101035b>
	//   17   34:iastore         
	//   18   35:invokevirtual   #211 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   19   38:astore_1        
				mCanceledOnTouchOutside = typedarray.getBoolean(0, true);
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:iconst_0        
	//   23   42:iconst_1        
	//   24   43:invokevirtual   #217 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   25   46:putfield        #39  <Field boolean mCanceledOnTouchOutside>
				typedarray.recycle();
	//   26   49:aload_1         
	//   27   50:invokevirtual   #220 <Method void TypedArray.recycle()>
			}
			mCanceledOnTouchOutsideSet = true;
	//   28   53:aload_0         
	//   29   54:iconst_1        
	//   30   55:putfield        #193 <Field boolean mCanceledOnTouchOutsideSet>
		}
		return mCanceledOnTouchOutside;
	//   31   58:aload_0         
	//   32   59:getfield        #39  <Field boolean mCanceledOnTouchOutside>
	//   33   62:ireturn         
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
				b.cancel();
		//    3    5:aload_0         
		//    4    6:getfield        #12  <Field BottomSheetDialog b>
		//    5    9:invokevirtual   #25  <Method void BottomSheetDialog.cancel()>
		//    6   12:return          
		}

		final BottomSheetDialog b;

			
			{
				b = BottomSheetDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field BottomSheetDialog b>
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
