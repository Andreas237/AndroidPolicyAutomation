// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.design.animation.MotionSpec;
import android.support.design.internal.ViewUtils;
import android.support.design.resources.TextAppearance;
import android.support.design.ripple.RippleUtils;
import android.support.v4.text.BidiFormatter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import java.lang.reflect.*;
import java.util.List;

// Referenced classes of package android.support.design.chip:
//			ChipDrawable

public class Chip extends AppCompatCheckBox
	implements ChipDrawable.Delegate
{
	private class ChipTouchHelper extends ExploreByTouchHelper
	{

		protected int getVirtualViewAt(float f, float f1)
		{
			return !hasCloseIcon() || !getCloseIconTouchBounds().contains(f, f1) ? -1 : 0;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field Chip this$0>
		//    2    4:invokestatic    #17  <Method boolean Chip.access$100(Chip)>
		//    3    7:ifeq            27
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field Chip this$0>
		//    6   14:invokestatic    #21  <Method RectF Chip.access$200(Chip)>
		//    7   17:fload_1         
		//    8   18:fload_2         
		//    9   19:invokevirtual   #27  <Method boolean RectF.contains(float, float)>
		//   10   22:ifeq            27
		//   11   25:iconst_0        
		//   12   26:ireturn         
		//   13   27:iconst_m1       
		//   14   28:ireturn         
		}

		protected void getVisibleVirtualViews(List list)
		{
			if(hasCloseIcon())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field Chip this$0>
		//*   2    4:invokestatic    #17  <Method boolean Chip.access$100(Chip)>
		//*   3    7:ifeq            21
				list.add(((Object) (Integer.valueOf(0))));
		//    4   10:aload_1         
		//    5   11:iconst_0        
		//    6   12:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//    7   15:invokeinterface #42  <Method boolean List.add(Object)>
		//    8   20:pop             
		//    9   21:return          
		}

		protected boolean onPerformActionForVirtualView(int i, int j, Bundle bundle)
		{
			if(j == 16 && i == 0)
		//*   0    0:iload_2         
		//*   1    1:bipush          16
		//*   2    3:icmpne          18
		//*   3    6:iload_1         
		//*   4    7:ifne            18
				return performCloseIconClick();
		//    5   10:aload_0         
		//    6   11:getfield        #13  <Field Chip this$0>
		//    7   14:invokevirtual   #50  <Method boolean Chip.performCloseIconClick()>
		//    8   17:ireturn         
			else
				return false;
		//    9   18:iconst_0        
		//   10   19:ireturn         
		}

		protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			boolean flag;
			if(chipDrawable != null && chipDrawable.isCheckable())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field Chip this$0>
		//*   2    4:invokestatic    #56  <Method ChipDrawable Chip.access$000(Chip)>
		//*   3    7:ifnull          28
		//*   4   10:aload_0         
		//*   5   11:getfield        #13  <Field Chip this$0>
		//*   6   14:invokestatic    #56  <Method ChipDrawable Chip.access$000(Chip)>
		//*   7   17:invokevirtual   #61  <Method boolean ChipDrawable.isCheckable()>
		//*   8   20:ifeq            28
				flag = true;
		//    9   23:iconst_1        
		//   10   24:istore_2        
			else
		//*  11   25:goto            30
				flag = false;
		//   12   28:iconst_0        
		//   13   29:istore_2        
			accessibilitynodeinfocompat.setCheckable(flag);
		//   14   30:aload_1         
		//   15   31:iload_2         
		//   16   32:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setCheckable(boolean)>
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/design/chip/Chip)).getName())));
		//   17   35:aload_1         
		//   18   36:ldc1            #6   <Class Chip>
		//   19   38:invokevirtual   #73  <Method String Class.getName()>
		//   20   41:invokevirtual   #77  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			CharSequence charsequence = getText();
		//   21   44:aload_0         
		//   22   45:getfield        #13  <Field Chip this$0>
		//   23   48:invokevirtual   #81  <Method CharSequence Chip.getText()>
		//   24   51:astore_3        
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//*  25   52:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
		//*  26   55:bipush          23
		//*  27   57:icmplt          66
			{
				accessibilitynodeinfocompat.setText(charsequence);
		//   28   60:aload_1         
		//   29   61:aload_3         
		//   30   62:invokevirtual   #90  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
				return;
		//   31   65:return          
			} else
			{
				accessibilitynodeinfocompat.setContentDescription(charsequence);
		//   32   66:aload_1         
		//   33   67:aload_3         
		//   34   68:invokevirtual   #93  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
				return;
		//   35   71:return          
			}
		}

		protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			if(hasCloseIcon())
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field Chip this$0>
		//*   2    4:invokestatic    #17  <Method boolean Chip.access$100(Chip)>
		//*   3    7:ifeq            115
			{
				CharSequence charsequence = getCloseIconContentDescription();
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field Chip this$0>
		//    6   14:invokevirtual   #98  <Method CharSequence Chip.getCloseIconContentDescription()>
		//    7   17:astore_3        
				if(charsequence != null)
		//*   8   18:aload_3         
		//*   9   19:ifnull          30
				{
					accessibilitynodeinfocompat.setContentDescription(charsequence);
		//   10   22:aload_2         
		//   11   23:aload_3         
		//   12   24:invokevirtual   #93  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
				} else
		//*  13   27:goto            85
				{
					Object obj = ((Object) (getText()));
		//   14   30:aload_0         
		//   15   31:getfield        #13  <Field Chip this$0>
		//   16   34:invokevirtual   #81  <Method CharSequence Chip.getText()>
		//   17   37:astore_3        
					Context context = getContext();
		//   18   38:aload_0         
		//   19   39:getfield        #13  <Field Chip this$0>
		//   20   42:invokevirtual   #102 <Method Context Chip.getContext()>
		//   21   45:astore          4
					i = android.support.design.R.string.mtrl_chip_close_icon_content_description;
		//   22   47:getstatic       #107 <Field int android.support.design.R$string.mtrl_chip_close_icon_content_description>
		//   23   50:istore_1        
					if(TextUtils.isEmpty(((CharSequence) (obj))))
		//*  24   51:aload_3         
		//*  25   52:invokestatic    #113 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  26   55:ifne            61
		//*  27   58:goto            64
						obj = "";
		//   28   61:ldc1            #115 <String "">
		//   29   63:astore_3        
					accessibilitynodeinfocompat.setContentDescription(((CharSequence) (context.getString(i, new Object[] {
						obj
					}).trim())));
		//   30   64:aload_2         
		//   31   65:aload           4
		//   32   67:iload_1         
		//   33   68:iconst_1        
		//   34   69:anewarray       Object[]
		//   35   72:dup             
		//   36   73:iconst_0        
		//   37   74:aload_3         
		//   38   75:aastore         
		//   39   76:invokevirtual   #123 <Method String Context.getString(int, Object[])>
		//   40   79:invokevirtual   #128 <Method String String.trim()>
		//   41   82:invokevirtual   #93  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
				}
				accessibilitynodeinfocompat.setBoundsInParent(getCloseIconTouchBoundsInt());
		//   42   85:aload_2         
		//   43   86:aload_0         
		//   44   87:getfield        #13  <Field Chip this$0>
		//   45   90:invokestatic    #132 <Method Rect Chip.access$300(Chip)>
		//   46   93:invokevirtual   #136 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
				accessibilitynodeinfocompat.addAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
		//   47   96:aload_2         
		//   48   97:getstatic       #142 <Field android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat.ACTION_CLICK>
		//   49  100:invokevirtual   #146 <Method void AccessibilityNodeInfoCompat.addAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat)>
				accessibilitynodeinfocompat.setEnabled(isEnabled());
		//   50  103:aload_2         
		//   51  104:aload_0         
		//   52  105:getfield        #13  <Field Chip this$0>
		//   53  108:invokevirtual   #149 <Method boolean Chip.isEnabled()>
		//   54  111:invokevirtual   #152 <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
				return;
		//   55  114:return          
			} else
			{
				accessibilitynodeinfocompat.setContentDescription("");
		//   56  115:aload_2         
		//   57  116:ldc1            #115 <String "">
		//   58  118:invokevirtual   #93  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
				accessibilitynodeinfocompat.setBoundsInParent(Chip.EMPTY_BOUNDS);
		//   59  121:aload_2         
		//   60  122:invokestatic    #156 <Method Rect Chip.access$400()>
		//   61  125:invokevirtual   #136 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
				return;
		//   62  128:return          
			}
		}

		final Chip this$0;
	}


	private void applyChipDrawable(ChipDrawable chipdrawable)
	{
		chipdrawable.setDelegate(((ChipDrawable.Delegate) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #81  <Method void ChipDrawable.setDelegate(ChipDrawable$Delegate)>
	//    3    5:return          
	}

	private float calculateTextOffsetFromStart(ChipDrawable chipdrawable)
	{
		float f = getChipStartPadding() + chipdrawable.calculateChipIconWidth() + getTextStartPadding();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method float getChipStartPadding()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #91  <Method float ChipDrawable.calculateChipIconWidth()>
	//    4    8:fadd            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #94  <Method float getTextStartPadding()>
	//    7   13:fadd            
	//    8   14:fstore_2        
		if(ViewCompat.getLayoutDirection(((View) (this))) == 0)
	//*   9   15:aload_0         
	//*  10   16:invokestatic    #100 <Method int ViewCompat.getLayoutDirection(View)>
	//*  11   19:ifne            24
			return f;
	//   12   22:fload_2         
	//   13   23:freturn         
		else
			return -f;
	//   14   24:fload_2         
	//   15   25:fneg            
	//   16   26:freturn         
	}

	private int[] createCloseIconDrawableState()
	{
		boolean flag1 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method boolean isEnabled()>
	//    2    4:istore          4
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int j;
		if(flag1)
	//*   5    8:iload           4
	//*   6   10:ifeq            18
			j = 1;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            20
			j = 0;
	//   10   18:iconst_0        
	//   11   19:istore_2        
		int i = j;
	//   12   20:iload_2         
	//   13   21:istore_1        
		if(closeIconFocused)
	//*  14   22:aload_0         
	//*  15   23:getfield        #107 <Field boolean closeIconFocused>
	//*  16   26:ifeq            33
			i = j + 1;
	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_1        
		j = i;
	//   21   33:iload_1         
	//   22   34:istore_2        
		if(closeIconHovered)
	//*  23   35:aload_0         
	//*  24   36:getfield        #109 <Field boolean closeIconHovered>
	//*  25   39:ifeq            46
			j = i + 1;
	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_2        
		i = j;
	//   30   46:iload_2         
	//   31   47:istore_1        
		if(closeIconPressed)
	//*  32   48:aload_0         
	//*  33   49:getfield        #111 <Field boolean closeIconPressed>
	//*  34   52:ifeq            59
			i = j + 1;
	//   35   55:iload_2         
	//   36   56:iconst_1        
	//   37   57:iadd            
	//   38   58:istore_1        
		j = i;
	//   39   59:iload_1         
	//   40   60:istore_2        
		if(isChecked())
	//*  41   61:aload_0         
	//*  42   62:invokevirtual   #114 <Method boolean isChecked()>
	//*  43   65:ifeq            72
			j = i + 1;
	//   44   68:iload_1         
	//   45   69:iconst_1        
	//   46   70:iadd            
	//   47   71:istore_2        
		int ai[] = new int[j];
	//   48   72:iload_2         
	//   49   73:newarray        int[]
	//   50   75:astore          5
		j = ((int) (flag));
	//   51   77:iload_3         
	//   52   78:istore_2        
		if(isEnabled())
	//*  53   79:aload_0         
	//*  54   80:invokevirtual   #105 <Method boolean isEnabled()>
	//*  55   83:ifeq            94
		{
			ai[0] = 0x101009e;
	//   56   86:aload           5
	//   57   88:iconst_0        
	//   58   89:ldc1            #115 <Int 0x101009e>
	//   59   91:iastore         
			j = 1;
	//   60   92:iconst_1        
	//   61   93:istore_2        
		}
		i = j;
	//   62   94:iload_2         
	//   63   95:istore_1        
		if(closeIconFocused)
	//*  64   96:aload_0         
	//*  65   97:getfield        #107 <Field boolean closeIconFocused>
	//*  66  100:ifeq            113
		{
			ai[j] = 0x101009c;
	//   67  103:aload           5
	//   68  105:iload_2         
	//   69  106:ldc1            #116 <Int 0x101009c>
	//   70  108:iastore         
			i = j + 1;
	//   71  109:iload_2         
	//   72  110:iconst_1        
	//   73  111:iadd            
	//   74  112:istore_1        
		}
		j = i;
	//   75  113:iload_1         
	//   76  114:istore_2        
		if(closeIconHovered)
	//*  77  115:aload_0         
	//*  78  116:getfield        #109 <Field boolean closeIconHovered>
	//*  79  119:ifeq            132
		{
			ai[i] = 0x1010367;
	//   80  122:aload           5
	//   81  124:iload_1         
	//   82  125:ldc1            #117 <Int 0x1010367>
	//   83  127:iastore         
			j = i + 1;
	//   84  128:iload_1         
	//   85  129:iconst_1        
	//   86  130:iadd            
	//   87  131:istore_2        
		}
		i = j;
	//   88  132:iload_2         
	//   89  133:istore_1        
		if(closeIconPressed)
	//*  90  134:aload_0         
	//*  91  135:getfield        #111 <Field boolean closeIconPressed>
	//*  92  138:ifeq            151
		{
			ai[j] = 0x10100a7;
	//   93  141:aload           5
	//   94  143:iload_2         
	//   95  144:ldc1            #118 <Int 0x10100a7>
	//   96  146:iastore         
			i = j + 1;
	//   97  147:iload_2         
	//   98  148:iconst_1        
	//   99  149:iadd            
	//  100  150:istore_1        
		}
		if(isChecked())
	//* 101  151:aload_0         
	//* 102  152:invokevirtual   #114 <Method boolean isChecked()>
	//* 103  155:ifeq            164
			ai[i] = 0x10100a1;
	//  104  158:aload           5
	//  105  160:iload_1         
	//  106  161:ldc1            #46  <Int 0x10100a1>
	//  107  163:iastore         
		return ai;
	//  108  164:aload           5
	//  109  166:areturn         
	}

	private void ensureFocus()
	{
		if(focusedVirtualView == 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int focusedVirtualView>
	//*   2    4:ldc1            #122 <Int 0x80000000>
	//*   3    6:icmpne          14
			setFocusedVirtualView(-1);
	//    4    9:aload_0         
	//    5   10:iconst_m1       
	//    6   11:invokespecial   #126 <Method void setFocusedVirtualView(int)>
	//    7   14:return          
	}

	private RectF getCloseIconTouchBounds()
	{
		rectF.setEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field RectF rectF>
	//    2    4:invokevirtual   #133 <Method void RectF.setEmpty()>
		if(hasCloseIcon())
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #59  <Method boolean hasCloseIcon()>
	//*   5   11:ifeq            25
			chipDrawable.getCloseIconTouchBounds(rectF);
	//    6   14:aload_0         
	//    7   15:getfield        #53  <Field ChipDrawable chipDrawable>
	//    8   18:aload_0         
	//    9   19:getfield        #128 <Field RectF rectF>
	//   10   22:invokevirtual   #136 <Method void ChipDrawable.getCloseIconTouchBounds(RectF)>
		return rectF;
	//   11   25:aload_0         
	//   12   26:getfield        #128 <Field RectF rectF>
	//   13   29:areturn         
	}

	private Rect getCloseIconTouchBoundsInt()
	{
		RectF rectf = getCloseIconTouchBounds();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method RectF getCloseIconTouchBounds()>
	//    2    4:astore_1        
		rect.set((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom);
	//    3    5:aload_0         
	//    4    6:getfield        #138 <Field Rect rect>
	//    5    9:aload_1         
	//    6   10:getfield        #142 <Field float RectF.left>
	//    7   13:f2i             
	//    8   14:aload_1         
	//    9   15:getfield        #145 <Field float RectF.top>
	//   10   18:f2i             
	//   11   19:aload_1         
	//   12   20:getfield        #148 <Field float RectF.right>
	//   13   23:f2i             
	//   14   24:aload_1         
	//   15   25:getfield        #151 <Field float RectF.bottom>
	//   16   28:f2i             
	//   17   29:invokevirtual   #155 <Method void Rect.set(int, int, int, int)>
		return rect;
	//   18   32:aload_0         
	//   19   33:getfield        #138 <Field Rect rect>
	//   20   36:areturn         
	}

	private TextAppearance getTextAppearance()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getTextAppearance();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #159 <Method TextAppearance ChipDrawable.getTextAppearance()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	private boolean handleAccessibilityExit(MotionEvent motionevent)
	{
		if(motionevent.getAction() != 10)
			break MISSING_BLOCK_LABEL_133;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #179 <Method int MotionEvent.getAction()>
	//    2    4:bipush          10
	//    3    6:icmpne          133
		motionevent = ((MotionEvent) (((Class) (android/support/v4/widget/ExploreByTouchHelper)).getDeclaredField("mHoveredVirtualViewId")));
	//    4    9:ldc1            #181 <Class ExploreByTouchHelper>
	//    5   11:ldc1            #183 <String "mHoveredVirtualViewId">
	//    6   13:invokevirtual   #189 <Method Field Class.getDeclaredField(String)>
	//    7   16:astore_1        
		((Field) (motionevent)).setAccessible(true);
	//    8   17:aload_1         
	//    9   18:iconst_1        
	//   10   19:invokevirtual   #195 <Method void Field.setAccessible(boolean)>
		if(((Integer)((Field) (motionevent)).get(((Object) (touchHelper)))).intValue() == 0x80000000)
			break MISSING_BLOCK_LABEL_133;
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:getfield        #197 <Field Chip$ChipTouchHelper touchHelper>
	//   14   27:invokevirtual   #201 <Method Object Field.get(Object)>
	//   15   30:checkcast       #203 <Class Integer>
	//   16   33:invokevirtual   #206 <Method int Integer.intValue()>
	//   17   36:ldc1            #122 <Int 0x80000000>
	//   18   38:icmpeq          133
		motionevent = ((MotionEvent) (((Class) (android/support/v4/widget/ExploreByTouchHelper)).getDeclaredMethod("updateHoveredVirtualView", new Class[] {
			Integer.TYPE
		})));
	//   19   41:ldc1            #181 <Class ExploreByTouchHelper>
	//   20   43:ldc1            #208 <String "updateHoveredVirtualView">
	//   21   45:iconst_1        
	//   22   46:anewarray       Class[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:getstatic       #212 <Field Class Integer.TYPE>
	//   26   54:aastore         
	//   27   55:invokevirtual   #216 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   28   58:astore_1        
		((Method) (motionevent)).setAccessible(true);
	//   29   59:aload_1         
	//   30   60:iconst_1        
	//   31   61:invokevirtual   #219 <Method void Method.setAccessible(boolean)>
		((Method) (motionevent)).invoke(((Object) (touchHelper)), new Object[] {
			Integer.valueOf(0x80000000)
		});
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #197 <Field Chip$ChipTouchHelper touchHelper>
	//   35   69:iconst_1        
	//   36   70:anewarray       Object[]
	//   37   73:dup             
	//   38   74:iconst_0        
	//   39   75:ldc1            #122 <Int 0x80000000>
	//   40   77:invokestatic    #225 <Method Integer Integer.valueOf(int)>
	//   41   80:aastore         
	//   42   81:invokevirtual   #229 <Method Object Method.invoke(Object, Object[])>
	//   43   84:pop             
		return true;
	//   44   85:iconst_1        
	//   45   86:ireturn         
		motionevent;
	//   46   87:astore_1        
		Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable) (motionevent)));
	//   47   88:ldc1            #231 <String "Chip">
	//   48   90:ldc1            #233 <String "Unable to send Accessibility Exit event">
	//   49   92:aload_1         
	//   50   93:invokestatic    #239 <Method int Log.e(String, String, Throwable)>
	//   51   96:pop             
		return false;
	//   52   97:iconst_0        
	//   53   98:ireturn         
		motionevent;
	//   54   99:astore_1        
		Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable) (motionevent)));
	//   55  100:ldc1            #231 <String "Chip">
	//   56  102:ldc1            #233 <String "Unable to send Accessibility Exit event">
	//   57  104:aload_1         
	//   58  105:invokestatic    #239 <Method int Log.e(String, String, Throwable)>
	//   59  108:pop             
		return false;
	//   60  109:iconst_0        
	//   61  110:ireturn         
		motionevent;
	//   62  111:astore_1        
		Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable) (motionevent)));
	//   63  112:ldc1            #231 <String "Chip">
	//   64  114:ldc1            #233 <String "Unable to send Accessibility Exit event">
	//   65  116:aload_1         
	//   66  117:invokestatic    #239 <Method int Log.e(String, String, Throwable)>
	//   67  120:pop             
		return false;
	//   68  121:iconst_0        
	//   69  122:ireturn         
		motionevent;
	//   70  123:astore_1        
		Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable) (motionevent)));
	//   71  124:ldc1            #231 <String "Chip">
	//   72  126:ldc1            #233 <String "Unable to send Accessibility Exit event">
	//   73  128:aload_1         
	//   74  129:invokestatic    #239 <Method int Log.e(String, String, Throwable)>
	//   75  132:pop             
		return false;
	//   76  133:iconst_0        
	//   77  134:ireturn         
	}

	private boolean hasCloseIcon()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		return chipdrawable != null && chipdrawable.getCloseIcon() != null;
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #243 <Method Drawable ChipDrawable.getCloseIcon()>
	//    7   13:ifnull          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private boolean moveFocus(boolean flag)
	{
		ensureFocus();
	//    0    0:aload_0         
	//    1    1:invokespecial   #247 <Method void ensureFocus()>
		if(flag)
	//*   2    4:iload_1         
	//*   3    5:ifeq            23
		{
			if(focusedVirtualView == -1)
	//*   4    8:aload_0         
	//*   5    9:getfield        #121 <Field int focusedVirtualView>
	//*   6   12:iconst_m1       
	//*   7   13:icmpne          37
			{
				setFocusedVirtualView(0);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokespecial   #126 <Method void setFocusedVirtualView(int)>
				return true;
	//   11   21:iconst_1        
	//   12   22:ireturn         
			}
		} else
		if(focusedVirtualView == 0)
	//*  13   23:aload_0         
	//*  14   24:getfield        #121 <Field int focusedVirtualView>
	//*  15   27:ifne            37
		{
			setFocusedVirtualView(-1);
	//   16   30:aload_0         
	//   17   31:iconst_m1       
	//   18   32:invokespecial   #126 <Method void setFocusedVirtualView(int)>
			return true;
	//   19   35:iconst_1        
	//   20   36:ireturn         
		}
		return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	private void setCloseIconFocused(boolean flag)
	{
		if(closeIconFocused != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field boolean closeIconFocused>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			closeIconFocused = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #107 <Field boolean closeIconFocused>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #251 <Method void refreshDrawableState()>
		}
	//    9   17:return          
	}

	private void setCloseIconHovered(boolean flag)
	{
		if(closeIconHovered != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean closeIconHovered>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			closeIconHovered = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #109 <Field boolean closeIconHovered>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #251 <Method void refreshDrawableState()>
		}
	//    9   17:return          
	}

	private void setCloseIconPressed(boolean flag)
	{
		if(closeIconPressed != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field boolean closeIconPressed>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			closeIconPressed = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #111 <Field boolean closeIconPressed>
			refreshDrawableState();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #251 <Method void refreshDrawableState()>
		}
	//    9   17:return          
	}

	private void setFocusedVirtualView(int i)
	{
		int j = focusedVirtualView;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int focusedVirtualView>
	//    2    4:istore_2        
		if(j != i)
	//*   3    5:iload_2         
	//*   4    6:iload_1         
	//*   5    7:icmpeq          33
		{
			if(j == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            19
				setCloseIconFocused(false);
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #255 <Method void setCloseIconFocused(boolean)>
			focusedVirtualView = i;
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:putfield        #121 <Field int focusedVirtualView>
			if(i == 0)
	//*  14   24:iload_1         
	//*  15   25:ifne            33
				setCloseIconFocused(true);
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:invokespecial   #255 <Method void setCloseIconFocused(boolean)>
		}
	//   19   33:return          
	}

	private void unapplyChipDrawable(ChipDrawable chipdrawable)
	{
		if(chipdrawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			chipdrawable.setDelegate(((ChipDrawable.Delegate) (null)));
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #81  <Method void ChipDrawable.setDelegate(ChipDrawable$Delegate)>
	//    5    9:return          
	}

	private void updatePaddingInternal()
	{
label0:
		{
			float f;
label1:
			{
				if(TextUtils.isEmpty(getText()))
					break label0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #261 <Method CharSequence getText()>
	//    2    4:invokestatic    #267 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifne            207
				ChipDrawable chipdrawable = chipDrawable;
	//    4   10:aload_0         
	//    5   11:getfield        #53  <Field ChipDrawable chipDrawable>
	//    6   14:astore_3        
				if(chipdrawable == null)
	//*   7   15:aload_3         
	//*   8   16:ifnonnull       20
					return;
	//    9   19:return          
				float f1 = chipdrawable.getChipStartPadding() + chipDrawable.getChipEndPadding() + chipDrawable.getTextStartPadding() + chipDrawable.getTextEndPadding();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #268 <Method float ChipDrawable.getChipStartPadding()>
	//   12   24:aload_0         
	//   13   25:getfield        #53  <Field ChipDrawable chipDrawable>
	//   14   28:invokevirtual   #271 <Method float ChipDrawable.getChipEndPadding()>
	//   15   31:fadd            
	//   16   32:aload_0         
	//   17   33:getfield        #53  <Field ChipDrawable chipDrawable>
	//   18   36:invokevirtual   #272 <Method float ChipDrawable.getTextStartPadding()>
	//   19   39:fadd            
	//   20   40:aload_0         
	//   21   41:getfield        #53  <Field ChipDrawable chipDrawable>
	//   22   44:invokevirtual   #275 <Method float ChipDrawable.getTextEndPadding()>
	//   23   47:fadd            
	//   24   48:fstore_2        
				if(!chipDrawable.isChipIconVisible() || chipDrawable.getChipIcon() == null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #53  <Field ChipDrawable chipDrawable>
	//*  27   53:invokevirtual   #278 <Method boolean ChipDrawable.isChipIconVisible()>
	//*  28   56:ifeq            69
	//*  29   59:aload_0         
	//*  30   60:getfield        #53  <Field ChipDrawable chipDrawable>
	//*  31   63:invokevirtual   #281 <Method Drawable ChipDrawable.getChipIcon()>
	//*  32   66:ifnonnull       102
				{
					f = f1;
	//   33   69:fload_2         
	//   34   70:fstore_1        
					if(chipDrawable.getCheckedIcon() == null)
						break label1;
	//   35   71:aload_0         
	//   36   72:getfield        #53  <Field ChipDrawable chipDrawable>
	//   37   75:invokevirtual   #284 <Method Drawable ChipDrawable.getCheckedIcon()>
	//   38   78:ifnull          128
					f = f1;
	//   39   81:fload_2         
	//   40   82:fstore_1        
					if(!chipDrawable.isCheckedIconVisible())
						break label1;
	//   41   83:aload_0         
	//   42   84:getfield        #53  <Field ChipDrawable chipDrawable>
	//   43   87:invokevirtual   #287 <Method boolean ChipDrawable.isCheckedIconVisible()>
	//   44   90:ifeq            128
					f = f1;
	//   45   93:fload_2         
	//   46   94:fstore_1        
					if(!isChecked())
						break label1;
	//   47   95:aload_0         
	//   48   96:invokevirtual   #114 <Method boolean isChecked()>
	//   49   99:ifeq            128
				}
				f = f1 + (chipDrawable.getIconStartPadding() + chipDrawable.getIconEndPadding() + chipDrawable.getChipIconSize());
	//   50  102:fload_2         
	//   51  103:aload_0         
	//   52  104:getfield        #53  <Field ChipDrawable chipDrawable>
	//   53  107:invokevirtual   #290 <Method float ChipDrawable.getIconStartPadding()>
	//   54  110:aload_0         
	//   55  111:getfield        #53  <Field ChipDrawable chipDrawable>
	//   56  114:invokevirtual   #293 <Method float ChipDrawable.getIconEndPadding()>
	//   57  117:fadd            
	//   58  118:aload_0         
	//   59  119:getfield        #53  <Field ChipDrawable chipDrawable>
	//   60  122:invokevirtual   #296 <Method float ChipDrawable.getChipIconSize()>
	//   61  125:fadd            
	//   62  126:fadd            
	//   63  127:fstore_1        
			}
			float f2 = f;
	//   64  128:fload_1         
	//   65  129:fstore_2        
			if(chipDrawable.isCloseIconVisible())
	//*  66  130:aload_0         
	//*  67  131:getfield        #53  <Field ChipDrawable chipDrawable>
	//*  68  134:invokevirtual   #299 <Method boolean ChipDrawable.isCloseIconVisible()>
	//*  69  137:ifeq            178
			{
				f2 = f;
	//   70  140:fload_1         
	//   71  141:fstore_2        
				if(chipDrawable.getCloseIcon() != null)
	//*  72  142:aload_0         
	//*  73  143:getfield        #53  <Field ChipDrawable chipDrawable>
	//*  74  146:invokevirtual   #243 <Method Drawable ChipDrawable.getCloseIcon()>
	//*  75  149:ifnull          178
					f2 = f + (chipDrawable.getCloseIconStartPadding() + chipDrawable.getCloseIconEndPadding() + chipDrawable.getCloseIconSize());
	//   76  152:fload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #53  <Field ChipDrawable chipDrawable>
	//   79  157:invokevirtual   #302 <Method float ChipDrawable.getCloseIconStartPadding()>
	//   80  160:aload_0         
	//   81  161:getfield        #53  <Field ChipDrawable chipDrawable>
	//   82  164:invokevirtual   #305 <Method float ChipDrawable.getCloseIconEndPadding()>
	//   83  167:fadd            
	//   84  168:aload_0         
	//   85  169:getfield        #53  <Field ChipDrawable chipDrawable>
	//   86  172:invokevirtual   #308 <Method float ChipDrawable.getCloseIconSize()>
	//   87  175:fadd            
	//   88  176:fadd            
	//   89  177:fstore_2        
			}
			if((float)ViewCompat.getPaddingEnd(((View) (this))) != f2)
	//*  90  178:aload_0         
	//*  91  179:invokestatic    #311 <Method int ViewCompat.getPaddingEnd(View)>
	//*  92  182:i2f             
	//*  93  183:fload_2         
	//*  94  184:fcmpl           
	//*  95  185:ifeq            206
				ViewCompat.setPaddingRelative(((View) (this)), ViewCompat.getPaddingStart(((View) (this))), getPaddingTop(), (int)f2, getPaddingBottom());
	//   96  188:aload_0         
	//   97  189:aload_0         
	//   98  190:invokestatic    #314 <Method int ViewCompat.getPaddingStart(View)>
	//   99  193:aload_0         
	//  100  194:invokevirtual   #317 <Method int getPaddingTop()>
	//  101  197:fload_2         
	//  102  198:f2i             
	//  103  199:aload_0         
	//  104  200:invokevirtual   #320 <Method int getPaddingBottom()>
	//  105  203:invokestatic    #324 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
			return;
	//  106  206:return          
		}
	//  107  207:return          
	}

	private void updateTextPaintDrawState(TextAppearance textappearance)
	{
		TextPaint textpaint = getPaint();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #330 <Method TextPaint getPaint()>
	//    2    4:astore_2        
		textpaint.drawableState = chipDrawable.getState();
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #53  <Field ChipDrawable chipDrawable>
	//    6   10:invokevirtual   #333 <Method int[] ChipDrawable.getState()>
	//    7   13:putfield        #338 <Field int[] TextPaint.drawableState>
		textappearance.updateDrawState(getContext(), textpaint, fontCallback);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #342 <Method Context getContext()>
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #344 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   14   26:invokevirtual   #350 <Method void TextAppearance.updateDrawState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
	//   15   29:return          
	}

	protected boolean dispatchHoverEvent(MotionEvent motionevent)
	{
		return handleAccessibilityExit(motionevent) || touchHelper.dispatchHoverEvent(motionevent) || super.dispatchHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #353 <Method boolean handleAccessibilityExit(MotionEvent)>
	//    3    5:ifne            32
	//    4    8:aload_0         
	//    5    9:getfield        #197 <Field Chip$ChipTouchHelper touchHelper>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #355 <Method boolean Chip$ChipTouchHelper.dispatchHoverEvent(MotionEvent)>
	//    8   16:ifne            32
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokespecial   #356 <Method boolean AppCompatCheckBox.dispatchHoverEvent(MotionEvent)>
	//   12   24:ifeq            30
	//   13   27:goto            32
	//   14   30:iconst_0        
	//   15   31:ireturn         
	//   16   32:iconst_1        
	//   17   33:ireturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return touchHelper.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field Chip$ChipTouchHelper touchHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #360 <Method boolean Chip$ChipTouchHelper.dispatchKeyEvent(KeyEvent)>
	//    4    8:ifne            24
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #361 <Method boolean AppCompatCheckBox.dispatchKeyEvent(KeyEvent)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #364 <Method void AppCompatCheckBox.drawableStateChanged()>
		ChipDrawable chipdrawable = chipDrawable;
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field ChipDrawable chipDrawable>
	//    4    8:astore_2        
		boolean flag;
		if(chipdrawable != null && chipdrawable.isCloseIconStateful())
	//*   5    9:aload_2         
	//*   6   10:ifnull          35
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #367 <Method boolean ChipDrawable.isCloseIconStateful()>
	//*   9   17:ifeq            35
			flag = chipDrawable.setCloseIconState(createCloseIconDrawableState());
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field ChipDrawable chipDrawable>
	//   12   24:aload_0         
	//   13   25:invokespecial   #369 <Method int[] createCloseIconDrawableState()>
	//   14   28:invokevirtual   #373 <Method boolean ChipDrawable.setCloseIconState(int[])>
	//   15   31:istore_1        
		else
	//*  16   32:goto            37
			flag = false;
	//   17   35:iconst_0        
	//   18   36:istore_1        
		if(flag)
	//*  19   37:iload_1         
	//*  20   38:ifeq            45
			invalidate();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #376 <Method void invalidate()>
	//   23   45:return          
	}

	public Drawable getCheckedIcon()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCheckedIcon();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #284 <Method Drawable ChipDrawable.getCheckedIcon()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public ColorStateList getChipBackgroundColor()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipBackgroundColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #380 <Method ColorStateList ChipDrawable.getChipBackgroundColor()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getChipCornerRadius()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipCornerRadius();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #383 <Method float ChipDrawable.getChipCornerRadius()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public Drawable getChipDrawable()
	{
		return ((Drawable) (chipDrawable));
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:areturn         
	}

	public float getChipEndPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipEndPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #271 <Method float ChipDrawable.getChipEndPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public Drawable getChipIcon()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipIcon();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #281 <Method Drawable ChipDrawable.getChipIcon()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getChipIconSize()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipIconSize();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #296 <Method float ChipDrawable.getChipIconSize()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public ColorStateList getChipIconTint()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipIconTint();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #387 <Method ColorStateList ChipDrawable.getChipIconTint()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getChipMinHeight()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipMinHeight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #390 <Method float ChipDrawable.getChipMinHeight()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public float getChipStartPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipStartPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #268 <Method float ChipDrawable.getChipStartPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public ColorStateList getChipStrokeColor()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipStrokeColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #393 <Method ColorStateList ChipDrawable.getChipStrokeColor()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getChipStrokeWidth()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getChipStrokeWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #396 <Method float ChipDrawable.getChipStrokeWidth()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public CharSequence getChipText()
	{
		return getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #261 <Method CharSequence getText()>
	//    2    4:areturn         
	}

	public Drawable getCloseIcon()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCloseIcon();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #243 <Method Drawable ChipDrawable.getCloseIcon()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public CharSequence getCloseIconContentDescription()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCloseIconContentDescription();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #402 <Method CharSequence ChipDrawable.getCloseIconContentDescription()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getCloseIconEndPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCloseIconEndPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #305 <Method float ChipDrawable.getCloseIconEndPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public float getCloseIconSize()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCloseIconSize();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #308 <Method float ChipDrawable.getCloseIconSize()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public float getCloseIconStartPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCloseIconStartPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #302 <Method float ChipDrawable.getCloseIconStartPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public ColorStateList getCloseIconTint()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getCloseIconTint();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #405 <Method ColorStateList ChipDrawable.getCloseIconTint()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public android.text.TextUtils.TruncateAt getEllipsize()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getEllipsize();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #409 <Method android.text.TextUtils$TruncateAt ChipDrawable.getEllipsize()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public void getFocusedRect(Rect rect1)
	{
		if(focusedVirtualView == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field int focusedVirtualView>
	//*   2    4:ifne            16
		{
			rect1.set(getCloseIconTouchBoundsInt());
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:invokespecial   #71  <Method Rect getCloseIconTouchBoundsInt()>
	//    6   12:invokevirtual   #413 <Method void Rect.set(Rect)>
			return;
	//    7   15:return          
		} else
		{
			super.getFocusedRect(rect1);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #415 <Method void AppCompatCheckBox.getFocusedRect(Rect)>
			return;
	//   11   21:return          
		}
	}

	public MotionSpec getHideMotionSpec()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getHideMotionSpec();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #419 <Method MotionSpec ChipDrawable.getHideMotionSpec()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public float getIconEndPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getIconEndPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #293 <Method float ChipDrawable.getIconEndPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public float getIconStartPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getIconStartPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #290 <Method float ChipDrawable.getIconStartPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public ColorStateList getRippleColor()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getRippleColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #422 <Method ColorStateList ChipDrawable.getRippleColor()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public MotionSpec getShowMotionSpec()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getShowMotionSpec();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #425 <Method MotionSpec ChipDrawable.getShowMotionSpec()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public CharSequence getText()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getText();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #426 <Method CharSequence ChipDrawable.getText()>
	//    7   13:areturn         
		else
			return "";
	//    8   14:ldc2            #428 <String "">
	//    9   17:areturn         
	}

	public float getTextEndPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getTextEndPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #275 <Method float ChipDrawable.getTextEndPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public float getTextStartPadding()
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_1        
		if(chipdrawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return chipdrawable.getTextStartPadding();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #272 <Method float ChipDrawable.getTextStartPadding()>
	//    7   13:freturn         
		else
			return 0.0F;
	//    8   14:fconst_0        
	//    9   15:freturn         
	}

	public void onChipDrawableSizeChange()
	{
		updatePaddingInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #431 <Method void updatePaddingInternal()>
		requestLayout();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #434 <Method void requestLayout()>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   4    8:getstatic       #439 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          21
	//*   6   13:icmplt          20
			invalidateOutline();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #442 <Method void invalidateOutline()>
	//    9   20:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #446 <Method int[] AppCompatCheckBox.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #114 <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, SELECTED_STATE);
	//    9   15:aload_2         
	//   10   16:getstatic       #48  <Field int[] SELECTED_STATE>
	//   11   19:invokestatic    #450 <Method int[] mergeDrawableStates(int[], int[])>
	//   12   22:pop             
		return ai;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	protected void onDraw(Canvas canvas)
	{
		if(!TextUtils.isEmpty(getText()))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #261 <Method CharSequence getText()>
	//*   2    4:invokestatic    #267 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifne            58
		{
			ChipDrawable chipdrawable = chipDrawable;
	//    4   10:aload_0         
	//    5   11:getfield        #53  <Field ChipDrawable chipDrawable>
	//    6   14:astore_3        
			if(chipdrawable != null && !chipdrawable.shouldDrawText())
	//*   7   15:aload_3         
	//*   8   16:ifnull          58
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #455 <Method boolean ChipDrawable.shouldDrawText()>
	//*  11   23:ifeq            29
	//*  12   26:goto            58
			{
				int i = canvas.save();
	//   13   29:aload_1         
	//   14   30:invokevirtual   #460 <Method int Canvas.save()>
	//   15   33:istore_2        
				canvas.translate(calculateTextOffsetFromStart(chipDrawable), 0.0F);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #53  <Field ChipDrawable chipDrawable>
	//   20   40:invokespecial   #462 <Method float calculateTextOffsetFromStart(ChipDrawable)>
	//   21   43:fconst_0        
	//   22   44:invokevirtual   #466 <Method void Canvas.translate(float, float)>
				super.onDraw(canvas);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokespecial   #468 <Method void AppCompatCheckBox.onDraw(Canvas)>
				canvas.restoreToCount(i);
	//   26   52:aload_1         
	//   27   53:iload_2         
	//   28   54:invokevirtual   #471 <Method void Canvas.restoreToCount(int)>
				return;
	//   29   57:return          
			}
		}
		super.onDraw(canvas);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:invokespecial   #468 <Method void AppCompatCheckBox.onDraw(Canvas)>
	//   33   63:return          
	}

	protected void onFocusChanged(boolean flag, int i, Rect rect1)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            12
			setFocusedVirtualView(-1);
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #126 <Method void setFocusedVirtualView(int)>
		else
	//*   5    9:goto            18
			setFocusedVirtualView(0x80000000);
	//    6   12:aload_0         
	//    7   13:ldc1            #122 <Int 0x80000000>
	//    8   15:invokespecial   #126 <Method void setFocusedVirtualView(int)>
		invalidate();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #376 <Method void invalidate()>
		super.onFocusChanged(flag, i, rect1);
	//   11   22:aload_0         
	//   12   23:iload_1         
	//   13   24:iload_2         
	//   14   25:aload_3         
	//   15   26:invokespecial   #475 <Method void AppCompatCheckBox.onFocusChanged(boolean, int, Rect)>
		touchHelper.onFocusChanged(flag, i, rect1);
	//   16   29:aload_0         
	//   17   30:getfield        #197 <Field Chip$ChipTouchHelper touchHelper>
	//   18   33:iload_1         
	//   19   34:iload_2         
	//   20   35:aload_3         
	//   21   36:invokevirtual   #476 <Method void Chip$ChipTouchHelper.onFocusChanged(boolean, int, Rect)>
	//   22   39:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #480 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i != 7)
	//*   3    5:iload_2         
	//*   4    6:bipush          7
	//*   5    8:icmpeq          28
		{
			if(i == 10)
	//*   6   11:iload_2         
	//*   7   12:bipush          10
	//*   8   14:icmpeq          20
	//*   9   17:goto            47
				setCloseIconHovered(false);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:invokespecial   #482 <Method void setCloseIconHovered(boolean)>
		} else
	//*  13   25:goto            47
		{
			setCloseIconHovered(getCloseIconTouchBounds().contains(motionevent.getX(), motionevent.getY()));
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:invokespecial   #65  <Method RectF getCloseIconTouchBounds()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #485 <Method float MotionEvent.getX()>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #488 <Method float MotionEvent.getY()>
	//   21   41:invokevirtual   #492 <Method boolean RectF.contains(float, float)>
	//   22   44:invokespecial   #482 <Method void setCloseIconHovered(boolean)>
		}
		return super.onHoverEvent(motionevent);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:invokespecial   #494 <Method boolean AppCompatCheckBox.onHoverEvent(MotionEvent)>
	//   26   52:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		int j;
		boolean flag1;
		j = keyevent.getKeyCode();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #501 <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_3        
		flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
		if(j == 61) goto _L2; else goto _L1
	//    5    8:iload_3         
	//    6    9:bipush          61
	//    7   11:icmpeq          153
_L1:
		if(j == 66) goto _L4; else goto _L3
	//    8   14:iload_3         
	//    9   15:bipush          66
	//   10   17:icmpeq          105
_L3:
		j;
	//   11   20:iload_3         
		JVM INSTR tableswitch 21 23: default 48
	//	               21 81
	//	               22 55
	//	               23 105;
	//   12   21:tableswitch     21 23: default 48
	//	               21 81
	//	               22 55
	//	               23 105
		   goto _L5 _L6 _L7 _L4
_L5:
		boolean flag;
		flag = flag1;
	//   13   48:iload           5
	//   14   50:istore          4
		break; /* Loop/switch isn't completed */
	//   15   52:goto            247
_L7:
		flag = flag1;
	//   16   55:iload           5
	//   17   57:istore          4
		if(keyevent.hasNoModifiers())
	//*  18   59:aload_2         
	//*  19   60:invokevirtual   #504 <Method boolean KeyEvent.hasNoModifiers()>
	//*  20   63:ifeq            247
			flag = moveFocus(ViewUtils.isLayoutRtl(((View) (this))) ^ true);
	//   21   66:aload_0         
	//   22   67:aload_0         
	//   23   68:invokestatic    #510 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   24   71:iconst_1        
	//   25   72:ixor            
	//   26   73:invokespecial   #512 <Method boolean moveFocus(boolean)>
	//   27   76:istore          4
		break; /* Loop/switch isn't completed */
	//   28   78:goto            247
_L6:
		flag = flag1;
	//   29   81:iload           5
	//   30   83:istore          4
		if(keyevent.hasNoModifiers())
	//*  31   85:aload_2         
	//*  32   86:invokevirtual   #504 <Method boolean KeyEvent.hasNoModifiers()>
	//*  33   89:ifeq            247
			flag = moveFocus(ViewUtils.isLayoutRtl(((View) (this))));
	//   34   92:aload_0         
	//   35   93:aload_0         
	//   36   94:invokestatic    #510 <Method boolean ViewUtils.isLayoutRtl(View)>
	//   37   97:invokespecial   #512 <Method boolean moveFocus(boolean)>
	//   38  100:istore          4
		break; /* Loop/switch isn't completed */
	//   39  102:goto            247
_L4:
		switch(focusedVirtualView)
	//*  40  105:aload_0         
	//*  41  106:getfield        #121 <Field int focusedVirtualView>
		{
	//*  42  109:tableswitch     -1 0: default 132
	//	               -1 146
	//	               0 139
		default:
			flag = flag1;
	//   43  132:iload           5
	//   44  134:istore          4
			break;

	//*  45  136:goto            247
		case 0: // '\0'
			performCloseIconClick();
	//   46  139:aload_0         
	//   47  140:invokevirtual   #515 <Method boolean performCloseIconClick()>
	//   48  143:pop             
			return true;
	//   49  144:iconst_1        
	//   50  145:ireturn         

		case -1: 
			performClick();
	//   51  146:aload_0         
	//   52  147:invokevirtual   #518 <Method boolean performClick()>
	//   53  150:pop             
			return true;
	//   54  151:iconst_1        
	//   55  152:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L2:
		byte byte0;
		if(keyevent.hasNoModifiers())
	//*  56  153:aload_2         
	//*  57  154:invokevirtual   #504 <Method boolean KeyEvent.hasNoModifiers()>
	//*  58  157:ifeq            165
			byte0 = 2;
	//   59  160:iconst_2        
	//   60  161:istore_3        
		else
	//*  61  162:goto            180
		if(keyevent.hasModifiers(1))
	//*  62  165:aload_2         
	//*  63  166:iconst_1        
	//*  64  167:invokevirtual   #522 <Method boolean KeyEvent.hasModifiers(int)>
	//*  65  170:ifeq            178
			byte0 = 1;
	//   66  173:iconst_1        
	//   67  174:istore_3        
		else
	//*  68  175:goto            180
			byte0 = 0;
	//   69  178:iconst_0        
	//   70  179:istore_3        
		flag = flag1;
	//   71  180:iload           5
	//   72  182:istore          4
		if(byte0 != 0)
	//*  73  184:iload_3         
	//*  74  185:ifeq            247
		{
			android.view.ViewParent viewparent = getParent();
	//   75  188:aload_0         
	//   76  189:invokevirtual   #526 <Method android.view.ViewParent getParent()>
	//   77  192:astore          8
			Object obj = ((Object) (this));
	//   78  194:aload_0         
	//   79  195:astore          6
			View view;
			do
			{
				view = ((View) (obj)).focusSearch(((int) (byte0)));
	//   80  197:aload           6
	//   81  199:iload_3         
	//   82  200:invokevirtual   #532 <Method View View.focusSearch(int)>
	//   83  203:astore          7
				if(view == null || view == this)
					break;
	//   84  205:aload           7
	//   85  207:ifnull          230
	//   86  210:aload           7
	//   87  212:aload_0         
	//   88  213:if_acmpeq       230
				obj = ((Object) (view));
	//   89  216:aload           7
	//   90  218:astore          6
			} while(view.getParent() == viewparent);
	//   91  220:aload           7
	//   92  222:invokevirtual   #533 <Method android.view.ViewParent View.getParent()>
	//   93  225:aload           8
	//   94  227:if_acmpeq       197
			flag = flag1;
	//   95  230:iload           5
	//   96  232:istore          4
			if(view != null)
	//*  97  234:aload           7
	//*  98  236:ifnull          247
			{
				view.requestFocus();
	//   99  239:aload           7
	//  100  241:invokevirtual   #536 <Method boolean View.requestFocus()>
	//  101  244:pop             
				return true;
	//  102  245:iconst_1        
	//  103  246:ireturn         
			}
		}
		if(flag)
	//* 104  247:iload           4
	//* 105  249:ifeq            258
		{
			invalidate();
	//  106  252:aload_0         
	//  107  253:invokevirtual   #376 <Method void invalidate()>
			return true;
	//  108  256:iconst_1        
	//  109  257:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//  110  258:aload_0         
	//  111  259:iload_1         
	//  112  260:aload_2         
	//  113  261:invokespecial   #538 <Method boolean AppCompatCheckBox.onKeyDown(int, KeyEvent)>
	//  114  264:ireturn         
		}
	}

	public PointerIcon onResolvePointerIcon(MotionEvent motionevent, int i)
	{
		if(getCloseIconTouchBounds().contains(motionevent.getX(), motionevent.getY()) && isEnabled())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #65  <Method RectF getCloseIconTouchBounds()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #485 <Method float MotionEvent.getX()>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #488 <Method float MotionEvent.getY()>
	//*   6   12:invokevirtual   #492 <Method boolean RectF.contains(float, float)>
	//*   7   15:ifeq            36
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #105 <Method boolean isEnabled()>
	//*  10   22:ifeq            36
			return PointerIcon.getSystemIcon(getContext(), 1002);
	//   11   25:aload_0         
	//   12   26:invokevirtual   #342 <Method Context getContext()>
	//   13   29:sipush          1002
	//   14   32:invokestatic    #548 <Method PointerIcon PointerIcon.getSystemIcon(Context, int)>
	//   15   35:areturn         
		else
			return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag;
		boolean flag1;
label0:
		{
label1:
			{
				boolean flag2;
label2:
				{
					int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #480 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
					flag2 = getCloseIconTouchBounds().contains(motionevent.getX(), motionevent.getY());
	//    3    5:aload_0         
	//    4    6:invokespecial   #65  <Method RectF getCloseIconTouchBounds()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #485 <Method float MotionEvent.getX()>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #488 <Method float MotionEvent.getY()>
	//    9   17:invokevirtual   #492 <Method boolean RectF.contains(float, float)>
	//   10   20:istore          4
					flag1 = false;
	//   11   22:iconst_0        
	//   12   23:istore_3        
					switch(i)
	//*  13   24:iload_2         
					{
	//*  14   25:tableswitch     0 3: default 56
	//	               0 108
	//	               1 81
	//	               2 59
	//	               3 98
					default:
						break label1;
	//   15   56:goto            123

					case 0: // '\0'
						break label2;

					case 2: // '\002'
						if(closeIconPressed)
	//*  16   59:aload_0         
	//*  17   60:getfield        #111 <Field boolean closeIconPressed>
	//*  18   63:ifeq            123
						{
							if(!flag2)
	//*  19   66:iload           4
	//*  20   68:ifne            76
								setCloseIconPressed(false);
	//   21   71:aload_0         
	//   22   72:iconst_0        
	//   23   73:invokespecial   #551 <Method void setCloseIconPressed(boolean)>
							flag = true;
	//   24   76:iconst_1        
	//   25   77:istore_2        
							break label0;
	//   26   78:goto            125
						}
						break label1;

					case 1: // '\001'
						if(closeIconPressed)
	//*  27   81:aload_0         
	//*  28   82:getfield        #111 <Field boolean closeIconPressed>
	//*  29   85:ifeq            98
						{
							performCloseIconClick();
	//   30   88:aload_0         
	//   31   89:invokevirtual   #515 <Method boolean performCloseIconClick()>
	//   32   92:pop             
							flag = true;
	//   33   93:iconst_1        
	//   34   94:istore_2        
							break;
	//   35   95:goto            100
						}
						// fall through

					case 3: // '\003'
						flag = false;
	//   36   98:iconst_0        
	//   37   99:istore_2        
						break;
					}
					setCloseIconPressed(false);
	//   38  100:aload_0         
	//   39  101:iconst_0        
	//   40  102:invokespecial   #551 <Method void setCloseIconPressed(boolean)>
					break label0;
	//   41  105:goto            125
				}
				if(flag2)
	//*  42  108:iload           4
	//*  43  110:ifeq            123
				{
					setCloseIconPressed(true);
	//   44  113:aload_0         
	//   45  114:iconst_1        
	//   46  115:invokespecial   #551 <Method void setCloseIconPressed(boolean)>
					flag = true;
	//   47  118:iconst_1        
	//   48  119:istore_2        
					break label0;
	//   49  120:goto            125
				}
			}
			flag = false;
	//   50  123:iconst_0        
	//   51  124:istore_2        
		}
		if(flag || super.onTouchEvent(motionevent))
	//*  52  125:iload_2         
	//*  53  126:ifne            137
	//*  54  129:aload_0         
	//*  55  130:aload_1         
	//*  56  131:invokespecial   #553 <Method boolean AppCompatCheckBox.onTouchEvent(MotionEvent)>
	//*  57  134:ifeq            139
			flag1 = true;
	//   58  137:iconst_1        
	//   59  138:istore_3        
		return flag1;
	//   60  139:iload_3         
	//   61  140:ireturn         
	}

	public boolean performCloseIconClick()
	{
		playSoundEffect(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #557 <Method void playSoundEffect(int)>
		android.view.View.OnClickListener onclicklistener = onCloseIconClickListener;
	//    3    5:aload_0         
	//    4    6:getfield        #559 <Field android.view.View$OnClickListener onCloseIconClickListener>
	//    5    9:astore_2        
		boolean flag;
		if(onclicklistener != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
		{
			onclicklistener.onClick(((View) (this)));
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:invokeinterface #565 <Method void android.view.View$OnClickListener.onClick(View)>
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_1        
		} else
	//*  13   23:goto            28
		{
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_1        
		}
		touchHelper.sendEventForVirtualView(0, 1);
	//   16   28:aload_0         
	//   17   29:getfield        #197 <Field Chip$ChipTouchHelper touchHelper>
	//   18   32:iconst_0        
	//   19   33:iconst_1        
	//   20   34:invokevirtual   #569 <Method boolean Chip$ChipTouchHelper.sendEventForVirtualView(int, int)>
	//   21   37:pop             
		return flag;
	//   22   38:iload_1         
	//   23   39:ireturn         
	}

	public void setBackground(Drawable drawable)
	{
		if(drawable != chipDrawable && drawable != ripple)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #53  <Field ChipDrawable chipDrawable>
	//*   3    5:if_acmpeq       30
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #573 <Field RippleDrawable ripple>
	//*   7   13:if_acmpne       19
	//*   8   16:goto            30
		{
			throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
	//    9   19:new             #575 <Class UnsupportedOperationException>
	//   10   22:dup             
	//   11   23:ldc2            #577 <String "Do not set the background; Chip manages its own background drawable.">
	//   12   26:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   13   29:athrow          
		} else
		{
			super.setBackground(drawable);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #582 <Method void AppCompatCheckBox.setBackground(Drawable)>
			return;
	//   17   35:return          
		}
	}

	public void setBackgroundColor(int i)
	{
		throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
	//    0    0:new             #575 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #585 <String "Do not set the background color; Chip manages its own background drawable.">
	//    3    7:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		if(drawable != chipDrawable && drawable != ripple)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #53  <Field ChipDrawable chipDrawable>
	//*   3    5:if_acmpeq       30
	//*   4    8:aload_1         
	//*   5    9:aload_0         
	//*   6   10:getfield        #573 <Field RippleDrawable ripple>
	//*   7   13:if_acmpne       19
	//*   8   16:goto            30
		{
			throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
	//    9   19:new             #575 <Class UnsupportedOperationException>
	//   10   22:dup             
	//   11   23:ldc2            #588 <String "Do not set the background drawable; Chip manages its own background drawable.">
	//   12   26:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   13   29:athrow          
		} else
		{
			super.setBackgroundDrawable(drawable);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #590 <Method void AppCompatCheckBox.setBackgroundDrawable(Drawable)>
			return;
	//   17   35:return          
		}
	}

	public void setBackgroundResource(int i)
	{
		throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
	//    0    0:new             #575 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #593 <String "Do not set the background resource; Chip manages its own background drawable.">
	//    3    7:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
	//    0    0:new             #575 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #597 <String "Do not set the background tint list; Chip manages its own background drawable.">
	//    3    7:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
	//    0    0:new             #575 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #601 <String "Do not set the background tint mode; Chip manages its own background drawable.">
	//    3    7:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public void setCheckable(boolean flag)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCheckable(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #604 <Method void ChipDrawable.setCheckable(boolean)>
	//    8   14:return          
	}

	public void setCheckableResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCheckableResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #608 <Method void ChipDrawable.setCheckableResource(int)>
	//    8   14:return          
	}

	public void setChecked(boolean flag)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_3        
		if(chipdrawable == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       15
		{
			deferredCheckedValue = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #611 <Field boolean deferredCheckedValue>
			return;
	//    8   14:return          
		}
		if(chipdrawable.isCheckable())
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #614 <Method boolean ChipDrawable.isCheckable()>
	//*  11   19:ifeq            54
		{
			boolean flag1 = isChecked();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #114 <Method boolean isChecked()>
	//   14   26:istore_2        
			super.setChecked(flag);
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:invokespecial   #616 <Method void AppCompatCheckBox.setChecked(boolean)>
			if(flag1 != flag)
	//*  18   32:iload_2         
	//*  19   33:iload_1         
	//*  20   34:icmpeq          54
			{
				android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener = onCheckedChangeListenerInternal;
	//   21   37:aload_0         
	//   22   38:getfield        #618 <Field android.widget.CompoundButton$OnCheckedChangeListener onCheckedChangeListenerInternal>
	//   23   41:astore_3        
				if(oncheckedchangelistener != null)
	//*  24   42:aload_3         
	//*  25   43:ifnull          54
					oncheckedchangelistener.onCheckedChanged(((android.widget.CompoundButton) (this)), flag);
	//   26   46:aload_3         
	//   27   47:aload_0         
	//   28   48:iload_1         
	//   29   49:invokeinterface #624 <Method void android.widget.CompoundButton$OnCheckedChangeListener.onCheckedChanged(android.widget.CompoundButton, boolean)>
			}
		}
	//   30   54:return          
	}

	public void setCheckedIcon(Drawable drawable)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCheckedIcon(drawable);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #627 <Method void ChipDrawable.setCheckedIcon(Drawable)>
	//    8   14:return          
	}

	public void setCheckedIconEnabled(boolean flag)
	{
		setCheckedIconVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #631 <Method void setCheckedIconVisible(boolean)>
	//    3    5:return          
	}

	public void setCheckedIconEnabledResource(int i)
	{
		setCheckedIconVisible(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #634 <Method void setCheckedIconVisible(int)>
	//    3    5:return          
	}

	public void setCheckedIconResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCheckedIconResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #638 <Method void ChipDrawable.setCheckedIconResource(int)>
	//    8   14:return          
	}

	public void setCheckedIconVisible(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCheckedIconVisible(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #639 <Method void ChipDrawable.setCheckedIconVisible(int)>
	//    8   14:return          
	}

	public void setCheckedIconVisible(boolean flag)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCheckedIconVisible(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #640 <Method void ChipDrawable.setCheckedIconVisible(boolean)>
	//    8   14:return          
	}

	public void setChipBackgroundColor(ColorStateList colorstatelist)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipBackgroundColor(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #643 <Method void ChipDrawable.setChipBackgroundColor(ColorStateList)>
	//    8   14:return          
	}

	public void setChipBackgroundColorResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipBackgroundColorResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #647 <Method void ChipDrawable.setChipBackgroundColorResource(int)>
	//    8   14:return          
	}

	public void setChipCornerRadius(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipCornerRadius(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #651 <Method void ChipDrawable.setChipCornerRadius(float)>
	//    8   14:return          
	}

	public void setChipCornerRadiusResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipCornerRadiusResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #655 <Method void ChipDrawable.setChipCornerRadiusResource(int)>
	//    8   14:return          
	}

	public void setChipDrawable(ChipDrawable chipdrawable)
	{
		ChipDrawable chipdrawable1 = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable1 != chipdrawable)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       93
		{
			unapplyChipDrawable(chipdrawable1);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #658 <Method void unapplyChipDrawable(ChipDrawable)>
			chipDrawable = chipdrawable;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #53  <Field ChipDrawable chipDrawable>
			applyChipDrawable(chipDrawable);
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #53  <Field ChipDrawable chipDrawable>
	//   15   25:invokespecial   #660 <Method void applyChipDrawable(ChipDrawable)>
			if(RippleUtils.USE_FRAMEWORK_RIPPLE)
	//*  16   28:getstatic       #665 <Field boolean RippleUtils.USE_FRAMEWORK_RIPPLE>
	//*  17   31:ifeq            77
			{
				ripple = new RippleDrawable(RippleUtils.convertToRippleDrawableColor(chipDrawable.getRippleColor()), ((Drawable) (chipDrawable)), ((Drawable) (null)));
	//   18   34:aload_0         
	//   19   35:new             #667 <Class RippleDrawable>
	//   20   38:dup             
	//   21   39:aload_0         
	//   22   40:getfield        #53  <Field ChipDrawable chipDrawable>
	//   23   43:invokevirtual   #422 <Method ColorStateList ChipDrawable.getRippleColor()>
	//   24   46:invokestatic    #671 <Method ColorStateList RippleUtils.convertToRippleDrawableColor(ColorStateList)>
	//   25   49:aload_0         
	//   26   50:getfield        #53  <Field ChipDrawable chipDrawable>
	//   27   53:aconst_null     
	//   28   54:invokespecial   #674 <Method void RippleDrawable(ColorStateList, Drawable, Drawable)>
	//   29   57:putfield        #573 <Field RippleDrawable ripple>
				chipDrawable.setUseCompatRipple(false);
	//   30   60:aload_0         
	//   31   61:getfield        #53  <Field ChipDrawable chipDrawable>
	//   32   64:iconst_0        
	//   33   65:invokevirtual   #677 <Method void ChipDrawable.setUseCompatRipple(boolean)>
				ViewCompat.setBackground(((View) (this)), ((Drawable) (ripple)));
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #573 <Field RippleDrawable ripple>
	//   37   73:invokestatic    #680 <Method void ViewCompat.setBackground(View, Drawable)>
				return;
	//   38   76:return          
			}
			chipDrawable.setUseCompatRipple(true);
	//   39   77:aload_0         
	//   40   78:getfield        #53  <Field ChipDrawable chipDrawable>
	//   41   81:iconst_1        
	//   42   82:invokevirtual   #677 <Method void ChipDrawable.setUseCompatRipple(boolean)>
			ViewCompat.setBackground(((View) (this)), ((Drawable) (chipDrawable)));
	//   43   85:aload_0         
	//   44   86:aload_0         
	//   45   87:getfield        #53  <Field ChipDrawable chipDrawable>
	//   46   90:invokestatic    #680 <Method void ViewCompat.setBackground(View, Drawable)>
		}
	//   47   93:return          
	}

	public void setChipEndPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipEndPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #683 <Method void ChipDrawable.setChipEndPadding(float)>
	//    8   14:return          
	}

	public void setChipEndPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipEndPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #686 <Method void ChipDrawable.setChipEndPaddingResource(int)>
	//    8   14:return          
	}

	public void setChipIcon(Drawable drawable)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIcon(drawable);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #689 <Method void ChipDrawable.setChipIcon(Drawable)>
	//    8   14:return          
	}

	public void setChipIconEnabled(boolean flag)
	{
		setChipIconVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #693 <Method void setChipIconVisible(boolean)>
	//    3    5:return          
	}

	public void setChipIconEnabledResource(int i)
	{
		setChipIconVisible(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #696 <Method void setChipIconVisible(int)>
	//    3    5:return          
	}

	public void setChipIconResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #699 <Method void ChipDrawable.setChipIconResource(int)>
	//    8   14:return          
	}

	public void setChipIconSize(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconSize(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #702 <Method void ChipDrawable.setChipIconSize(float)>
	//    8   14:return          
	}

	public void setChipIconSizeResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconSizeResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #705 <Method void ChipDrawable.setChipIconSizeResource(int)>
	//    8   14:return          
	}

	public void setChipIconTint(ColorStateList colorstatelist)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconTint(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #708 <Method void ChipDrawable.setChipIconTint(ColorStateList)>
	//    8   14:return          
	}

	public void setChipIconTintResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconTintResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #711 <Method void ChipDrawable.setChipIconTintResource(int)>
	//    8   14:return          
	}

	public void setChipIconVisible(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconVisible(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #712 <Method void ChipDrawable.setChipIconVisible(int)>
	//    8   14:return          
	}

	public void setChipIconVisible(boolean flag)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipIconVisible(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #713 <Method void ChipDrawable.setChipIconVisible(boolean)>
	//    8   14:return          
	}

	public void setChipMinHeight(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipMinHeight(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #716 <Method void ChipDrawable.setChipMinHeight(float)>
	//    8   14:return          
	}

	public void setChipMinHeightResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipMinHeightResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #719 <Method void ChipDrawable.setChipMinHeightResource(int)>
	//    8   14:return          
	}

	public void setChipStartPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipStartPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #722 <Method void ChipDrawable.setChipStartPadding(float)>
	//    8   14:return          
	}

	public void setChipStartPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipStartPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #725 <Method void ChipDrawable.setChipStartPaddingResource(int)>
	//    8   14:return          
	}

	public void setChipStrokeColor(ColorStateList colorstatelist)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipStrokeColor(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #728 <Method void ChipDrawable.setChipStrokeColor(ColorStateList)>
	//    8   14:return          
	}

	public void setChipStrokeColorResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipStrokeColorResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #731 <Method void ChipDrawable.setChipStrokeColorResource(int)>
	//    8   14:return          
	}

	public void setChipStrokeWidth(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipStrokeWidth(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #734 <Method void ChipDrawable.setChipStrokeWidth(float)>
	//    8   14:return          
	}

	public void setChipStrokeWidthResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setChipStrokeWidthResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #737 <Method void ChipDrawable.setChipStrokeWidthResource(int)>
	//    8   14:return          
	}

	public void setChipText(CharSequence charsequence)
	{
		setText(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #742 <Method void setText(CharSequence)>
	//    3    5:return          
	}

	public void setChipTextResource(int i)
	{
		setText(((CharSequence) (getResources().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #748 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #754 <Method String Resources.getString(int)>
	//    5    9:invokevirtual   #742 <Method void setText(CharSequence)>
	//    6   12:return          
	}

	public void setCloseIcon(Drawable drawable)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIcon(drawable);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #757 <Method void ChipDrawable.setCloseIcon(Drawable)>
	//    8   14:return          
	}

	public void setCloseIconContentDescription(CharSequence charsequence)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconContentDescription(charsequence);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #760 <Method void ChipDrawable.setCloseIconContentDescription(CharSequence)>
	//    8   14:return          
	}

	public void setCloseIconEnabled(boolean flag)
	{
		setCloseIconVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #764 <Method void setCloseIconVisible(boolean)>
	//    3    5:return          
	}

	public void setCloseIconEnabledResource(int i)
	{
		setCloseIconVisible(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #767 <Method void setCloseIconVisible(int)>
	//    3    5:return          
	}

	public void setCloseIconEndPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconEndPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #770 <Method void ChipDrawable.setCloseIconEndPadding(float)>
	//    8   14:return          
	}

	public void setCloseIconEndPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconEndPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #773 <Method void ChipDrawable.setCloseIconEndPaddingResource(int)>
	//    8   14:return          
	}

	public void setCloseIconResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #776 <Method void ChipDrawable.setCloseIconResource(int)>
	//    8   14:return          
	}

	public void setCloseIconSize(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconSize(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #779 <Method void ChipDrawable.setCloseIconSize(float)>
	//    8   14:return          
	}

	public void setCloseIconSizeResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconSizeResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #782 <Method void ChipDrawable.setCloseIconSizeResource(int)>
	//    8   14:return          
	}

	public void setCloseIconStartPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconStartPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #785 <Method void ChipDrawable.setCloseIconStartPadding(float)>
	//    8   14:return          
	}

	public void setCloseIconStartPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconStartPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #788 <Method void ChipDrawable.setCloseIconStartPaddingResource(int)>
	//    8   14:return          
	}

	public void setCloseIconTint(ColorStateList colorstatelist)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconTint(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #791 <Method void ChipDrawable.setCloseIconTint(ColorStateList)>
	//    8   14:return          
	}

	public void setCloseIconTintResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconTintResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #794 <Method void ChipDrawable.setCloseIconTintResource(int)>
	//    8   14:return          
	}

	public void setCloseIconVisible(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconVisible(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #795 <Method void ChipDrawable.setCloseIconVisible(int)>
	//    8   14:return          
	}

	public void setCloseIconVisible(boolean flag)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setCloseIconVisible(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #796 <Method void ChipDrawable.setCloseIconVisible(boolean)>
	//    8   14:return          
	}

	public void setCompoundDrawables(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
		{
			if(drawable2 == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       18
			{
				super.setCompoundDrawables(drawable, drawable1, drawable2, drawable3);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #800 <Method void AppCompatCheckBox.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
				return;
	//   10   17:return          
			} else
			{
				throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
	//   11   18:new             #575 <Class UnsupportedOperationException>
	//   12   21:dup             
	//   13   22:ldc2            #802 <String "Please set end drawable using R.attr#closeIcon.">
	//   14   25:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
	//   16   29:new             #575 <Class UnsupportedOperationException>
	//   17   32:dup             
	//   18   33:ldc2            #804 <String "Please set start drawable using R.attr#chipIcon.">
	//   19   36:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   20   39:athrow          
		}
	}

	public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
		{
			if(drawable2 == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       18
			{
				super.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #807 <Method void AppCompatCheckBox.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
				return;
	//   10   17:return          
			} else
			{
				throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
	//   11   18:new             #575 <Class UnsupportedOperationException>
	//   12   21:dup             
	//   13   22:ldc2            #802 <String "Please set end drawable using R.attr#closeIcon.">
	//   14   25:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
	//   16   29:new             #575 <Class UnsupportedOperationException>
	//   17   32:dup             
	//   18   33:ldc2            #804 <String "Please set start drawable using R.attr#chipIcon.">
	//   19   36:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   20   39:athrow          
		}
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int j, int k, int l)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            29
		{
			if(k == 0)
	//*   2    4:iload_3         
	//*   3    5:ifne            18
			{
				super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, j, k, l);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokespecial   #810 <Method void AppCompatCheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(int, int, int, int)>
				return;
	//   10   17:return          
			} else
			{
				throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
	//   11   18:new             #575 <Class UnsupportedOperationException>
	//   12   21:dup             
	//   13   22:ldc2            #802 <String "Please set end drawable using R.attr#closeIcon.">
	//   14   25:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
	//   16   29:new             #575 <Class UnsupportedOperationException>
	//   17   32:dup             
	//   18   33:ldc2            #804 <String "Please set start drawable using R.attr#chipIcon.">
	//   19   36:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   20   39:athrow          
		}
	}

	public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
		{
			if(drawable2 == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       18
			{
				super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #812 <Method void AppCompatCheckBox.setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
				return;
	//   10   17:return          
			} else
			{
				throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
	//   11   18:new             #575 <Class UnsupportedOperationException>
	//   12   21:dup             
	//   13   22:ldc2            #802 <String "Please set end drawable using R.attr#closeIcon.">
	//   14   25:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
	//   16   29:new             #575 <Class UnsupportedOperationException>
	//   17   32:dup             
	//   18   33:ldc2            #804 <String "Please set start drawable using R.attr#chipIcon.">
	//   19   36:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   20   39:athrow          
		}
	}

	public void setCompoundDrawablesWithIntrinsicBounds(int i, int j, int k, int l)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            29
		{
			if(k == 0)
	//*   2    4:iload_3         
	//*   3    5:ifne            18
			{
				super.setCompoundDrawablesWithIntrinsicBounds(i, j, k, l);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokespecial   #815 <Method void AppCompatCheckBox.setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
				return;
	//   10   17:return          
			} else
			{
				throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
	//   11   18:new             #575 <Class UnsupportedOperationException>
	//   12   21:dup             
	//   13   22:ldc2            #802 <String "Please set end drawable using R.attr#closeIcon.">
	//   14   25:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
	//   16   29:new             #575 <Class UnsupportedOperationException>
	//   17   32:dup             
	//   18   33:ldc2            #804 <String "Please set start drawable using R.attr#chipIcon.">
	//   19   36:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   20   39:athrow          
		}
	}

	public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       29
		{
			if(drawable2 == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       18
			{
				super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable1, drawable2, drawable3);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #817 <Method void AppCompatCheckBox.setCompoundDrawablesWithIntrinsicBounds(Drawable, Drawable, Drawable, Drawable)>
				return;
	//   10   17:return          
			} else
			{
				throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
	//   11   18:new             #575 <Class UnsupportedOperationException>
	//   12   21:dup             
	//   13   22:ldc2            #819 <String "Please set right drawable using R.attr#closeIcon.">
	//   14   25:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   15   28:athrow          
			}
		} else
		{
			throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
	//   16   29:new             #575 <Class UnsupportedOperationException>
	//   17   32:dup             
	//   18   33:ldc2            #821 <String "Please set left drawable using R.attr#chipIcon.">
	//   19   36:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   20   39:athrow          
		}
	}

	public void setEllipsize(android.text.TextUtils.TruncateAt truncateat)
	{
		if(chipDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(truncateat != android.text.TextUtils.TruncateAt.MARQUEE)
	//*   4    8:aload_1         
	//*   5    9:getstatic       #829 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.MARQUEE>
	//*   6   12:if_acmpeq       35
		{
			super.setEllipsize(truncateat);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #831 <Method void AppCompatCheckBox.setEllipsize(android.text.TextUtils$TruncateAt)>
			ChipDrawable chipdrawable = chipDrawable;
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field ChipDrawable chipDrawable>
	//   12   24:astore_2        
			if(chipdrawable != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          34
				chipdrawable.setEllipsize(truncateat);
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #832 <Method void ChipDrawable.setEllipsize(android.text.TextUtils$TruncateAt)>
			return;
	//   18   34:return          
		} else
		{
			throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
	//   19   35:new             #575 <Class UnsupportedOperationException>
	//   20   38:dup             
	//   21   39:ldc2            #834 <String "Text within a chip are not allowed to scroll.">
	//   22   42:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   23   45:athrow          
		}
	}

	public void setGravity(int i)
	{
		if(i != 0x800013)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #836 <Int 0x800013>
	//*   2    4:icmpeq          17
		{
			Log.w("Chip", "Chip text must be vertically center and start aligned");
	//    3    7:ldc1            #231 <String "Chip">
	//    4    9:ldc2            #838 <String "Chip text must be vertically center and start aligned">
	//    5   12:invokestatic    #842 <Method int Log.w(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		} else
		{
			super.setGravity(i);
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:invokespecial   #844 <Method void AppCompatCheckBox.setGravity(int)>
			return;
	//   11   22:return          
		}
	}

	public void setHideMotionSpec(MotionSpec motionspec)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setHideMotionSpec(motionspec);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #848 <Method void ChipDrawable.setHideMotionSpec(MotionSpec)>
	//    8   14:return          
	}

	public void setHideMotionSpecResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setHideMotionSpecResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #852 <Method void ChipDrawable.setHideMotionSpecResource(int)>
	//    8   14:return          
	}

	public void setIconEndPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setIconEndPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #855 <Method void ChipDrawable.setIconEndPadding(float)>
	//    8   14:return          
	}

	public void setIconEndPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setIconEndPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #858 <Method void ChipDrawable.setIconEndPaddingResource(int)>
	//    8   14:return          
	}

	public void setIconStartPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setIconStartPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #861 <Method void ChipDrawable.setIconStartPadding(float)>
	//    8   14:return          
	}

	public void setIconStartPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setIconStartPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #864 <Method void ChipDrawable.setIconStartPaddingResource(int)>
	//    8   14:return          
	}

	public void setLines(int i)
	{
		if(i <= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          11
		{
			super.setLines(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #867 <Method void AppCompatCheckBox.setLines(int)>
			return;
	//    6   10:return          
		} else
		{
			throw new UnsupportedOperationException("Chip does not support multi-line text");
	//    7   11:new             #575 <Class UnsupportedOperationException>
	//    8   14:dup             
	//    9   15:ldc2            #869 <String "Chip does not support multi-line text">
	//   10   18:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   11   21:athrow          
		}
	}

	public void setMaxLines(int i)
	{
		if(i <= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          11
		{
			super.setMaxLines(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #872 <Method void AppCompatCheckBox.setMaxLines(int)>
			return;
	//    6   10:return          
		} else
		{
			throw new UnsupportedOperationException("Chip does not support multi-line text");
	//    7   11:new             #575 <Class UnsupportedOperationException>
	//    8   14:dup             
	//    9   15:ldc2            #869 <String "Chip does not support multi-line text">
	//   10   18:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   11   21:athrow          
		}
	}

	public void setMaxWidth(int i)
	{
		super.setMaxWidth(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #876 <Method void AppCompatCheckBox.setMaxWidth(int)>
		ChipDrawable chipdrawable = chipDrawable;
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field ChipDrawable chipDrawable>
	//    5    9:astore_2        
		if(chipdrawable != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			chipdrawable.setMaxWidth(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #877 <Method void ChipDrawable.setMaxWidth(int)>
	//   11   19:return          
	}

	public void setMinLines(int i)
	{
		if(i <= 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpgt          11
		{
			super.setMinLines(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokespecial   #880 <Method void AppCompatCheckBox.setMinLines(int)>
			return;
	//    6   10:return          
		} else
		{
			throw new UnsupportedOperationException("Chip does not support multi-line text");
	//    7   11:new             #575 <Class UnsupportedOperationException>
	//    8   14:dup             
	//    9   15:ldc2            #869 <String "Chip does not support multi-line text">
	//   10   18:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   11   21:athrow          
		}
	}

	void setOnCheckedChangeListenerInternal(android.widget.CompoundButton.OnCheckedChangeListener oncheckedchangelistener)
	{
		onCheckedChangeListenerInternal = oncheckedchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #618 <Field android.widget.CompoundButton$OnCheckedChangeListener onCheckedChangeListenerInternal>
	//    3    5:return          
	}

	public void setOnCloseIconClickListener(android.view.View.OnClickListener onclicklistener)
	{
		onCloseIconClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #559 <Field android.view.View$OnClickListener onCloseIconClickListener>
	//    3    5:return          
	}

	public void setRippleColor(ColorStateList colorstatelist)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setRippleColor(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #887 <Method void ChipDrawable.setRippleColor(ColorStateList)>
	//    8   14:return          
	}

	public void setRippleColorResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setRippleColorResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #890 <Method void ChipDrawable.setRippleColorResource(int)>
	//    8   14:return          
	}

	public void setShowMotionSpec(MotionSpec motionspec)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setShowMotionSpec(motionspec);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #893 <Method void ChipDrawable.setShowMotionSpec(MotionSpec)>
	//    8   14:return          
	}

	public void setShowMotionSpecResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setShowMotionSpecResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #896 <Method void ChipDrawable.setShowMotionSpecResource(int)>
	//    8   14:return          
	}

	public void setSingleLine(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
		{
			super.setSingleLine(flag);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #899 <Method void AppCompatCheckBox.setSingleLine(boolean)>
			return;
	//    5    9:return          
		} else
		{
			throw new UnsupportedOperationException("Chip does not support multi-line text");
	//    6   10:new             #575 <Class UnsupportedOperationException>
	//    7   13:dup             
	//    8   14:ldc2            #869 <String "Chip does not support multi-line text">
	//    9   17:invokespecial   #580 <Method void UnsupportedOperationException(String)>
	//   10   20:athrow          
		}
	}

	public void setText(CharSequence charsequence, android.widget.TextView.BufferType buffertype)
	{
		if(chipDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		Object obj = ((Object) (charsequence));
	//    4    8:aload_1         
	//    5    9:astore_3        
		if(charsequence == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       18
			obj = "";
	//    8   14:ldc2            #428 <String "">
	//    9   17:astore_3        
		charsequence = BidiFormatter.getInstance().unicodeWrap(((CharSequence) (obj)));
	//   10   18:invokestatic    #906 <Method BidiFormatter BidiFormatter.getInstance()>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #910 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   13   25:astore_1        
		if(chipDrawable.shouldDrawText())
	//*  14   26:aload_0         
	//*  15   27:getfield        #53  <Field ChipDrawable chipDrawable>
	//*  16   30:invokevirtual   #455 <Method boolean ChipDrawable.shouldDrawText()>
	//*  17   33:ifeq            38
			charsequence = null;
	//   18   36:aconst_null     
	//   19   37:astore_1        
		super.setText(charsequence, buffertype);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokespecial   #912 <Method void AppCompatCheckBox.setText(CharSequence, android.widget.TextView$BufferType)>
		charsequence = ((CharSequence) (chipDrawable));
	//   24   44:aload_0         
	//   25   45:getfield        #53  <Field ChipDrawable chipDrawable>
	//   26   48:astore_1        
		if(charsequence != null)
	//*  27   49:aload_1         
	//*  28   50:ifnull          58
			((ChipDrawable) (charsequence)).setText(((CharSequence) (obj)));
	//   29   53:aload_1         
	//   30   54:aload_3         
	//   31   55:invokevirtual   #913 <Method void ChipDrawable.setText(CharSequence)>
	//   32   58:return          
	}

	public void setTextAppearance(int i)
	{
		super.setTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #916 <Method void AppCompatCheckBox.setTextAppearance(int)>
		ChipDrawable chipdrawable = chipDrawable;
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field ChipDrawable chipDrawable>
	//    5    9:astore_2        
		if(chipdrawable != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			chipdrawable.setTextAppearanceResource(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #919 <Method void ChipDrawable.setTextAppearanceResource(int)>
		if(getTextAppearance() != null)
	//*  11   19:aload_0         
	//*  12   20:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//*  13   23:ifnull          53
		{
			getTextAppearance().updateMeasureState(getContext(), getPaint(), fontCallback);
	//   14   26:aload_0         
	//   15   27:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #342 <Method Context getContext()>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #330 <Method TextPaint getPaint()>
	//   20   38:aload_0         
	//   21   39:getfield        #344 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   22   42:invokevirtual   #923 <Method void TextAppearance.updateMeasureState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
			updateTextPaintDrawState(getTextAppearance());
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//   26   50:invokespecial   #925 <Method void updateTextPaintDrawState(TextAppearance)>
		}
	//   27   53:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #928 <Method void AppCompatCheckBox.setTextAppearance(Context, int)>
		ChipDrawable chipdrawable = chipDrawable;
	//    4    6:aload_0         
	//    5    7:getfield        #53  <Field ChipDrawable chipDrawable>
	//    6   10:astore_3        
		if(chipdrawable != null)
	//*   7   11:aload_3         
	//*   8   12:ifnull          20
			chipdrawable.setTextAppearanceResource(i);
	//    9   15:aload_3         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #919 <Method void ChipDrawable.setTextAppearanceResource(int)>
		if(getTextAppearance() != null)
	//*  12   20:aload_0         
	//*  13   21:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//*  14   24:ifnull          51
		{
			getTextAppearance().updateMeasureState(context, getPaint(), fontCallback);
	//   15   27:aload_0         
	//   16   28:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #330 <Method TextPaint getPaint()>
	//   20   36:aload_0         
	//   21   37:getfield        #344 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   22   40:invokevirtual   #923 <Method void TextAppearance.updateMeasureState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
			updateTextPaintDrawState(getTextAppearance());
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//   26   48:invokespecial   #925 <Method void updateTextPaintDrawState(TextAppearance)>
		}
	//   27   51:return          
	}

	public void setTextAppearance(TextAppearance textappearance)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setTextAppearance(textappearance);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #930 <Method void ChipDrawable.setTextAppearance(TextAppearance)>
		if(getTextAppearance() != null)
	//*   8   14:aload_0         
	//*   9   15:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//*  10   18:ifnull          45
		{
			getTextAppearance().updateMeasureState(getContext(), getPaint(), fontCallback);
	//   11   21:aload_0         
	//   12   22:invokespecial   #920 <Method TextAppearance getTextAppearance()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #342 <Method Context getContext()>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #330 <Method TextPaint getPaint()>
	//   17   33:aload_0         
	//   18   34:getfield        #344 <Field android.support.v4.content.res.ResourcesCompat$FontCallback fontCallback>
	//   19   37:invokevirtual   #923 <Method void TextAppearance.updateMeasureState(Context, TextPaint, android.support.v4.content.res.ResourcesCompat$FontCallback)>
			updateTextPaintDrawState(textappearance);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokespecial   #925 <Method void updateTextPaintDrawState(TextAppearance)>
		}
	//   23   45:return          
	}

	public void setTextAppearanceResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setTextAppearanceResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #919 <Method void ChipDrawable.setTextAppearanceResource(int)>
		setTextAppearance(getContext(), i);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #342 <Method Context getContext()>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #932 <Method void setTextAppearance(Context, int)>
	//   13   23:return          
	}

	public void setTextEndPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setTextEndPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #935 <Method void ChipDrawable.setTextEndPadding(float)>
	//    8   14:return          
	}

	public void setTextEndPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setTextEndPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #938 <Method void ChipDrawable.setTextEndPaddingResource(int)>
	//    8   14:return          
	}

	public void setTextStartPadding(float f)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setTextStartPadding(f);
	//    5    9:aload_2         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #941 <Method void ChipDrawable.setTextStartPadding(float)>
	//    8   14:return          
	}

	public void setTextStartPaddingResource(int i)
	{
		ChipDrawable chipdrawable = chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:astore_2        
		if(chipdrawable != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			chipdrawable.setTextStartPaddingResource(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #944 <Method void ChipDrawable.setTextStartPaddingResource(int)>
	//    8   14:return          
	}

	private static final Rect EMPTY_BOUNDS = new Rect();
	private static final int SELECTED_STATE[] = {
		0x10100a1
	};
	private ChipDrawable chipDrawable;
	private boolean closeIconFocused;
	private boolean closeIconHovered;
	private boolean closeIconPressed;
	private boolean deferredCheckedValue;
	private int focusedVirtualView;
	private final android.support.v4.content.res.ResourcesCompat.FontCallback fontCallback;
	private android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListenerInternal;
	private android.view.View.OnClickListener onCloseIconClickListener;
	private final Rect rect;
	private final RectF rectF;
	private RippleDrawable ripple;
	private final ChipTouchHelper touchHelper;

	static 
	{
	//    0    0:new             #40  <Class Rect>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void Rect()>
	//    3    7:putstatic       #45  <Field Rect EMPTY_BOUNDS>
	//    4   10:iconst_1        
	//    5   11:newarray        int[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:ldc1            #46  <Int 0x10100a1>
	//    9   17:iastore         
	//   10   18:putstatic       #48  <Field int[] SELECTED_STATE>
	//*  11   21:return          
	}


/*
	static ChipDrawable access$000(Chip chip)
	{
		return chip.chipDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ChipDrawable chipDrawable>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(Chip chip)
	{
		return chip.hasCloseIcon();
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method boolean hasCloseIcon()>
	//    2    4:ireturn         
	}

*/


/*
	static RectF access$200(Chip chip)
	{
		return chip.getCloseIconTouchBounds();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method RectF getCloseIconTouchBounds()>
	//    2    4:areturn         
	}

*/


/*
	static Rect access$300(Chip chip)
	{
		return chip.getCloseIconTouchBoundsInt();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method Rect getCloseIconTouchBoundsInt()>
	//    2    4:areturn         
	}

*/


/*
	static Rect access$400()
	{
		return EMPTY_BOUNDS;
	//    0    0:getstatic       #45  <Field Rect EMPTY_BOUNDS>
	//    1    3:areturn         
	}

*/
}
