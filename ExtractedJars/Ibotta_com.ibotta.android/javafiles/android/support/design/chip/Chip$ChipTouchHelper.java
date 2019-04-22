// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.text.TextUtils;
import java.util.List;

// Referenced classes of package android.support.design.chip:
//			Chip, ChipDrawable

private class Chip$ChipTouchHelper extends ExploreByTouchHelper
{

	protected int getVirtualViewAt(float f, float f1)
	{
		return !Chip.access$100(Chip.this) || !Chip.access$200(Chip.this).contains(f, f1) ? -1 : 0;
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
		if(Chip.access$100(Chip.this))
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
		if(Chip.access$000(Chip.this) != null && Chip.access$000(Chip.this).isCheckable())
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
		if(Chip.access$100(Chip.this))
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
			accessibilitynodeinfocompat.setBoundsInParent(Chip.access$300(Chip.this));
	//   42   85:aload_2         
	//   43   86:aload_0         
	//   44   87:getfield        #13  <Field Chip this$0>
	//   45   90:invokestatic    #132 <Method android.graphics.Rect Chip.access$300(Chip)>
	//   46   93:invokevirtual   #136 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(android.graphics.Rect)>
			accessibilitynodeinfocompat.addAction(android.support.v4.view.accessibility.Compat.AccessibilityActionCompat.ACTION_CLICK);
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
			accessibilitynodeinfocompat.setBoundsInParent(Chip.access$400());
	//   59  121:aload_2         
	//   60  122:invokestatic    #156 <Method android.graphics.Rect Chip.access$400()>
	//   61  125:invokevirtual   #136 <Method void AccessibilityNodeInfoCompat.setBoundsInParent(android.graphics.Rect)>
			return;
	//   62  128:return          
		}
	}

	final Chip this$0;
}
