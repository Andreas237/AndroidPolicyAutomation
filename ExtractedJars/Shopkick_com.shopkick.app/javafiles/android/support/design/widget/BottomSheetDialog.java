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
		cancelable = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #37  <Field boolean cancelable>
		canceledOnTouchOutside = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #39  <Field boolean canceledOnTouchOutside>
	//   12   20:aload_0         
	//   13   21:new             #12  <Class BottomSheetDialog$4>
	//   14   24:dup             
	//   15   25:aload_0         
	//   16   26:invokespecial   #42  <Method void BottomSheetDialog$4(BottomSheetDialog)>
	//   17   29:putfield        #44  <Field BottomSheetBehavior$BottomSheetCallback bottomSheetCallback>
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
		cancelable = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #37  <Field boolean cancelable>
		canceledOnTouchOutside = true;
	//    8   12:aload_0         
	//    9   13:iconst_1        
	//   10   14:putfield        #39  <Field boolean canceledOnTouchOutside>
	//   11   17:aload_0         
	//   12   18:new             #12  <Class BottomSheetDialog$4>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:invokespecial   #42  <Method void BottomSheetDialog$4(BottomSheetDialog)>
	//   16   26:putfield        #44  <Field BottomSheetBehavior$BottomSheetCallback bottomSheetCallback>
		supportRequestWindowFeature(1);
	//   17   29:aload_0         
	//   18   30:iconst_1        
	//   19   31:invokevirtual   #48  <Method boolean supportRequestWindowFeature(int)>
	//   20   34:pop             
		cancelable = flag;
	//   21   35:aload_0         
	//   22   36:iload_2         
	//   23   37:putfield        #37  <Field boolean cancelable>
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
		behavior = BottomSheetBehavior.from(view);
	//   32   68:aload_0         
	//   33   69:aload_2         
	//   34   70:invokestatic    #131 <Method BottomSheetBehavior BottomSheetBehavior.from(View)>
	//   35   73:putfield        #133 <Field BottomSheetBehavior behavior>
		behavior.setBottomSheetCallback(bottomSheetCallback);
	//   36   76:aload_0         
	//   37   77:getfield        #133 <Field BottomSheetBehavior behavior>
	//   38   80:aload_0         
	//   39   81:getfield        #44  <Field BottomSheetBehavior$BottomSheetCallback bottomSheetCallback>
	//   40   84:invokevirtual   #137 <Method void BottomSheetBehavior.setBottomSheetCallback(BottomSheetBehavior$BottomSheetCallback)>
		behavior.setHideable(cancelable);
	//   41   87:aload_0         
	//   42   88:getfield        #133 <Field BottomSheetBehavior behavior>
	//   43   91:aload_0         
	//   44   92:getfield        #37  <Field boolean cancelable>
	//   45   95:invokevirtual   #141 <Method void BottomSheetBehavior.setHideable(boolean)>
		if(layoutparams == null)
	//*  46   98:aload_3         
	//*  47   99:ifnonnull       111
			((FrameLayout) (view)).addView(view1);
	//   48  102:aload_2         
	//   49  103:aload           4
	//   50  105:invokevirtual   #145 <Method void FrameLayout.addView(View)>
		else
	//*  51  108:goto            118
			((FrameLayout) (view)).addView(view1, layoutparams);
	//   52  111:aload_2         
	//   53  112:aload           4
	//   54  114:aload_3         
	//   55  115:invokevirtual   #148 <Method void FrameLayout.addView(View, android.view.ViewGroup$LayoutParams)>
		coordinatorlayout.findViewById(android.support.design.R.id.touch_outside).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view2)
			{
				if(cancelable && isShowing() && shouldWindowCloseOnTouchOutside())
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field BottomSheetDialog this$0>
			//*   2    4:getfield        #27  <Field boolean BottomSheetDialog.cancelable>
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
	//   56  118:aload           6
	//   57  120:getstatic       #151 <Field int android.support.design.R$id.touch_outside>
	//   58  123:invokevirtual   #125 <Method View CoordinatorLayout.findViewById(int)>
	//   59  126:new             #6   <Class BottomSheetDialog$1>
	//   60  129:dup             
	//   61  130:aload_0         
	//   62  131:invokespecial   #152 <Method void BottomSheetDialog$1(BottomSheetDialog)>
	//   63  134:invokevirtual   #156 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (new AccessibilityDelegateCompat() {

			public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
			{
				super.onInitializeAccessibilityNodeInfo(view2, accessibilitynodeinfocompat);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #23  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				if(cancelable)
			//*   4    6:aload_0         
			//*   5    7:getfield        #15  <Field BottomSheetDialog this$0>
			//*   6   10:getfield        #27  <Field boolean BottomSheetDialog.cancelable>
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
				if(j == 0x100000 && cancelable)
			//*   0    0:iload_2         
			//*   1    1:ldc1            #28  <Int 0x100000>
			//*   2    3:icmpne          25
			//*   3    6:aload_0         
			//*   4    7:getfield        #15  <Field BottomSheetDialog this$0>
			//*   5   10:getfield        #27  <Field boolean BottomSheetDialog.cancelable>
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
	//   64  137:aload_2         
	//   65  138:new             #8   <Class BottomSheetDialog$2>
	//   66  141:dup             
	//   67  142:aload_0         
	//   68  143:invokespecial   #157 <Method void BottomSheetDialog$2(BottomSheetDialog)>
	//   69  146:invokestatic    #163 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
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
	//   70  149:aload_2         
	//   71  150:new             #10  <Class BottomSheetDialog$3>
	//   72  153:dup             
	//   73  154:aload_0         
	//   74  155:invokespecial   #164 <Method void BottomSheetDialog$3(BottomSheetDialog)>
	//   75  158:invokevirtual   #168 <Method void FrameLayout.setOnTouchListener(android.view.View$OnTouchListener)>
		return ((View) (framelayout));
	//   76  161:aload           5
	//   77  163:areturn         
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
		BottomSheetBehavior bottomsheetbehavior = behavior;
	//    2    4:aload_0         
	//    3    5:getfield        #133 <Field BottomSheetBehavior behavior>
	//    4    8:astore_1        
		if(bottomsheetbehavior != null && bottomsheetbehavior.getState() == 5)
	//*   5    9:aload_1         
	//*   6   10:ifnull          29
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #203 <Method int BottomSheetBehavior.getState()>
	//*   9   17:iconst_5        
	//*  10   18:icmpne          29
			behavior.setState(4);
	//   11   21:aload_0         
	//   12   22:getfield        #133 <Field BottomSheetBehavior behavior>
	//   13   25:iconst_4        
	//   14   26:invokevirtual   #206 <Method void BottomSheetBehavior.setState(int)>
	//   15   29:return          
	}

	public void setCancelable(boolean flag)
	{
		super.setCancelable(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #209 <Method void AppCompatDialog.setCancelable(boolean)>
		if(cancelable != flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field boolean cancelable>
	//*   5    9:iload_1         
	//*   6   10:icmpeq          32
		{
			cancelable = flag;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #37  <Field boolean cancelable>
			BottomSheetBehavior bottomsheetbehavior = behavior;
	//   10   18:aload_0         
	//   11   19:getfield        #133 <Field BottomSheetBehavior behavior>
	//   12   22:astore_2        
			if(bottomsheetbehavior != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          32
				bottomsheetbehavior.setHideable(flag);
	//   15   27:aload_2         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #141 <Method void BottomSheetBehavior.setHideable(boolean)>
		}
	//   18   32:return          
	}

	public void setCanceledOnTouchOutside(boolean flag)
	{
		super.setCanceledOnTouchOutside(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #212 <Method void AppCompatDialog.setCanceledOnTouchOutside(boolean)>
		if(flag && !cancelable)
	//*   3    5:iload_1         
	//*   4    6:ifeq            21
	//*   5    9:aload_0         
	//*   6   10:getfield        #37  <Field boolean cancelable>
	//*   7   13:ifne            21
			cancelable = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #37  <Field boolean cancelable>
		canceledOnTouchOutside = flag;
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:putfield        #39  <Field boolean canceledOnTouchOutside>
		canceledOnTouchOutsideSet = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #214 <Field boolean canceledOnTouchOutsideSet>
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
	//    5    5:invokespecial   #218 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #220 <Method void AppCompatDialog.setContentView(View)>
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
	//    5    5:invokespecial   #218 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #220 <Method void AppCompatDialog.setContentView(View)>
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
	//    5    5:invokespecial   #218 <Method View wrapInBottomSheet(int, View, android.view.ViewGroup$LayoutParams)>
	//    6    8:invokespecial   #220 <Method void AppCompatDialog.setContentView(View)>
	//    7   11:return          
	}

	boolean shouldWindowCloseOnTouchOutside()
	{
		if(!canceledOnTouchOutsideSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field boolean canceledOnTouchOutsideSet>
	//*   2    4:ifne            42
		{
			TypedArray typedarray = getContext().obtainStyledAttributes(new int[] {
				0x101035b
			});
	//    3    7:aload_0         
	//    4    8:invokevirtual   #88  <Method Context getContext()>
	//    5   11:iconst_1        
	//    6   12:newarray        int[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:ldc1            #223 <Int 0x101035b>
	//   10   18:iastore         
	//   11   19:invokevirtual   #227 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   12   22:astore_1        
			canceledOnTouchOutside = typedarray.getBoolean(0, true);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:iconst_1        
	//   17   27:invokevirtual   #233 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   18   30:putfield        #39  <Field boolean canceledOnTouchOutside>
			typedarray.recycle();
	//   19   33:aload_1         
	//   20   34:invokevirtual   #236 <Method void TypedArray.recycle()>
			canceledOnTouchOutsideSet = true;
	//   21   37:aload_0         
	//   22   38:iconst_1        
	//   23   39:putfield        #214 <Field boolean canceledOnTouchOutsideSet>
		}
		return canceledOnTouchOutside;
	//   24   42:aload_0         
	//   25   43:getfield        #39  <Field boolean canceledOnTouchOutside>
	//   26   46:ireturn         
	}

	private BottomSheetBehavior behavior;
	private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() {

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
	boolean cancelable;
	private boolean canceledOnTouchOutside;
	private boolean canceledOnTouchOutsideSet;
}
