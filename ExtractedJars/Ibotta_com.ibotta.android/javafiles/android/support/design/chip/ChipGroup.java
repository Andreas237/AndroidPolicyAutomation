// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.design.internal.FlowLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;

// Referenced classes of package android.support.design.chip:
//			Chip

public class ChipGroup extends FlowLayout
{
	private class CheckedStateTracker
		implements android.widget.CompoundButton.OnCheckedChangeListener
	{

		public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
		{
			if(protectFromCheckedChange)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ChipGroup this$0>
		//*   2    4:invokestatic    #19  <Method boolean ChipGroup.access$300(ChipGroup)>
		//*   3    7:ifeq            11
				return;
		//    4   10:return          
			int i = compoundbutton.getId();
		//    5   11:aload_1         
		//    6   12:invokevirtual   #25  <Method int CompoundButton.getId()>
		//    7   15:istore_3        
			if(flag)
		//*   8   16:iload_2         
		//*   9   17:ifeq            75
			{
				if(checkedId != -1 && checkedId != i && singleSelection)
		//*  10   20:aload_0         
		//*  11   21:getfield        #15  <Field ChipGroup this$0>
		//*  12   24:invokestatic    #29  <Method int ChipGroup.access$400(ChipGroup)>
		//*  13   27:iconst_m1       
		//*  14   28:icmpeq          66
		//*  15   31:aload_0         
		//*  16   32:getfield        #15  <Field ChipGroup this$0>
		//*  17   35:invokestatic    #29  <Method int ChipGroup.access$400(ChipGroup)>
		//*  18   38:iload_3         
		//*  19   39:icmpeq          66
		//*  20   42:aload_0         
		//*  21   43:getfield        #15  <Field ChipGroup this$0>
		//*  22   46:invokestatic    #32  <Method boolean ChipGroup.access$500(ChipGroup)>
		//*  23   49:ifeq            66
				{
					compoundbutton = ((CompoundButton) (ChipGroup.this));
		//   24   52:aload_0         
		//   25   53:getfield        #15  <Field ChipGroup this$0>
		//   26   56:astore_1        
					((ChipGroup) (compoundbutton)).setCheckedStateForView(((ChipGroup) (compoundbutton)).checkedId, false);
		//   27   57:aload_1         
		//   28   58:aload_1         
		//   29   59:invokestatic    #29  <Method int ChipGroup.access$400(ChipGroup)>
		//   30   62:iconst_0        
		//   31   63:invokestatic    #36  <Method void ChipGroup.access$600(ChipGroup, int, boolean)>
				}
				setCheckedId(i);
		//   32   66:aload_0         
		//   33   67:getfield        #15  <Field ChipGroup this$0>
		//   34   70:iload_3         
		//   35   71:invokestatic    #40  <Method void ChipGroup.access$700(ChipGroup, int)>
				return;
		//   36   74:return          
			}
			if(checkedId == i)
		//*  37   75:aload_0         
		//*  38   76:getfield        #15  <Field ChipGroup this$0>
		//*  39   79:invokestatic    #29  <Method int ChipGroup.access$400(ChipGroup)>
		//*  40   82:iload_3         
		//*  41   83:icmpne          94
				setCheckedId(-1);
		//   42   86:aload_0         
		//   43   87:getfield        #15  <Field ChipGroup this$0>
		//   44   90:iconst_m1       
		//   45   91:invokestatic    #40  <Method void ChipGroup.access$700(ChipGroup, int)>
		//   46   94:return          
		}

		final ChipGroup this$0;
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #11  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		//    4    6:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}
	}

	public static interface OnCheckedChangeListener
	{

		public abstract void onCheckedChanged(ChipGroup chipgroup, int i);
	}

	private class PassThroughHierarchyChangeListener
		implements android.view.ViewGroup.OnHierarchyChangeListener
	{

		public void onChildViewAdded(View view, View view1)
		{
			if(view == ChipGroup.this && (view1 instanceof Chip))
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #22  <Field ChipGroup this$0>
		//*   3    5:if_acmpne       62
		//*   4    8:aload_2         
		//*   5    9:instanceof      #24  <Class Chip>
		//*   6   12:ifeq            62
			{
				if(view1.getId() == -1)
		//*   7   15:aload_2         
		//*   8   16:invokevirtual   #30  <Method int View.getId()>
		//*   9   19:iconst_m1       
		//*  10   20:icmpne          48
				{
					int i;
					if(android.os.Build.VERSION.SDK_INT >= 17)
		//*  11   23:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
		//*  12   26:bipush          17
		//*  13   28:icmplt          38
						i = View.generateViewId();
		//   14   31:invokestatic    #39  <Method int View.generateViewId()>
		//   15   34:istore_3        
					else
		//*  16   35:goto            43
						i = ((Object) (view1)).hashCode();
		//   17   38:aload_2         
		//   18   39:invokevirtual   #42  <Method int Object.hashCode()>
		//   19   42:istore_3        
					view1.setId(i);
		//   20   43:aload_2         
		//   21   44:iload_3         
		//   22   45:invokevirtual   #46  <Method void View.setId(int)>
				}
				((Chip)view1).setOnCheckedChangeListenerInternal(((android.widget.CompoundButton.OnCheckedChangeListener) (checkedStateTracker)));
		//   23   48:aload_2         
		//   24   49:checkcast       #24  <Class Chip>
		//   25   52:aload_0         
		//   26   53:getfield        #22  <Field ChipGroup this$0>
		//   27   56:invokestatic    #50  <Method ChipGroup$CheckedStateTracker ChipGroup.access$800(ChipGroup)>
		//   28   59:invokevirtual   #54  <Method void Chip.setOnCheckedChangeListenerInternal(android.widget.CompoundButton$OnCheckedChangeListener)>
			}
			android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener = onHierarchyChangeListener;
		//   29   62:aload_0         
		//   30   63:getfield        #17  <Field android.view.ViewGroup$OnHierarchyChangeListener onHierarchyChangeListener>
		//   31   66:astore          4
			if(onhierarchychangelistener != null)
		//*  32   68:aload           4
		//*  33   70:ifnull          82
				onhierarchychangelistener.onChildViewAdded(view, view1);
		//   34   73:aload           4
		//   35   75:aload_1         
		//   36   76:aload_2         
		//   37   77:invokeinterface #56  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewAdded(View, View)>
		//   38   82:return          
		}

		public void onChildViewRemoved(View view, View view1)
		{
			if(view == ChipGroup.this && (view1 instanceof Chip))
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #22  <Field ChipGroup this$0>
		//*   3    5:if_acmpne       23
		//*   4    8:aload_2         
		//*   5    9:instanceof      #24  <Class Chip>
		//*   6   12:ifeq            23
				((Chip)view1).setOnCheckedChangeListenerInternal(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
		//    7   15:aload_2         
		//    8   16:checkcast       #24  <Class Chip>
		//    9   19:aconst_null     
		//   10   20:invokevirtual   #54  <Method void Chip.setOnCheckedChangeListenerInternal(android.widget.CompoundButton$OnCheckedChangeListener)>
			android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener = onHierarchyChangeListener;
		//   11   23:aload_0         
		//   12   24:getfield        #17  <Field android.view.ViewGroup$OnHierarchyChangeListener onHierarchyChangeListener>
		//   13   27:astore_3        
			if(onhierarchychangelistener != null)
		//*  14   28:aload_3         
		//*  15   29:ifnull          40
				onhierarchychangelistener.onChildViewRemoved(view, view1);
		//   16   32:aload_3         
		//   17   33:aload_1         
		//   18   34:aload_2         
		//   19   35:invokeinterface #59  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewRemoved(View, View)>
		//   20   40:return          
		}

		private android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;
		final ChipGroup this$0;


/*
		static android.view.ViewGroup.OnHierarchyChangeListener access$202(PassThroughHierarchyChangeListener passthroughhierarchychangelistener, android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
		{
			passthroughhierarchychangelistener.onHierarchyChangeListener = onhierarchychangelistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field android.view.ViewGroup$OnHierarchyChangeListener onHierarchyChangeListener>
			return onhierarchychangelistener;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

*/
	}


	private void setCheckedId(int i)
	{
		checkedId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int checkedId>
		OnCheckedChangeListener oncheckedchangelistener = onCheckedChangeListener;
	//    3    5:aload_0         
	//    4    6:getfield        #62  <Field ChipGroup$OnCheckedChangeListener onCheckedChangeListener>
	//    5    9:astore_2        
		if(oncheckedchangelistener != null && singleSelection)
	//*   6   10:aload_2         
	//*   7   11:ifnull          29
	//*   8   14:aload_0         
	//*   9   15:getfield        #44  <Field boolean singleSelection>
	//*  10   18:ifeq            29
			oncheckedchangelistener.onCheckedChanged(this, i);
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokeinterface #65  <Method void ChipGroup$OnCheckedChangeListener.onCheckedChanged(ChipGroup, int)>
	//   15   29:return          
	}

	private void setCheckedStateForView(int i, boolean flag)
	{
		View view = findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #69  <Method View findViewById(int)>
	//    3    5:astore_3        
		if(view instanceof Chip)
	//*   4    6:aload_3         
	//*   5    7:instanceof      #71  <Class Chip>
	//*   6   10:ifeq            31
		{
			protectFromCheckedChange = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #36  <Field boolean protectFromCheckedChange>
			((Chip)view).setChecked(flag);
	//   10   18:aload_3         
	//   11   19:checkcast       #71  <Class Chip>
	//   12   22:iload_2         
	//   13   23:invokevirtual   #75  <Method void Chip.setChecked(boolean)>
			protectFromCheckedChange = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #36  <Field boolean protectFromCheckedChange>
		}
	//   17   31:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(view instanceof Chip)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #71  <Class Chip>
	//*   2    4:ifeq            56
		{
			Chip chip = (Chip)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #71  <Class Chip>
	//    5   11:astore          5
			if(chip.isChecked())
	//*   6   13:aload           5
	//*   7   15:invokevirtual   #82  <Method boolean Chip.isChecked()>
	//*   8   18:ifeq            56
			{
				int j = checkedId;
	//    9   21:aload_0         
	//   10   22:getfield        #41  <Field int checkedId>
	//   11   25:istore          4
				if(j != -1 && singleSelection)
	//*  12   27:iload           4
	//*  13   29:iconst_m1       
	//*  14   30:icmpeq          47
	//*  15   33:aload_0         
	//*  16   34:getfield        #44  <Field boolean singleSelection>
	//*  17   37:ifeq            47
					setCheckedStateForView(j, false);
	//   18   40:aload_0         
	//   19   41:iload           4
	//   20   43:iconst_0        
	//   21   44:invokespecial   #50  <Method void setCheckedStateForView(int, boolean)>
				setCheckedId(chip.getId());
	//   22   47:aload_0         
	//   23   48:aload           5
	//   24   50:invokevirtual   #86  <Method int Chip.getId()>
	//   25   53:invokespecial   #56  <Method void setCheckedId(int)>
			}
		}
		super.addView(view, i, layoutparams);
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:iload_2         
	//   29   59:aload_3         
	//   30   60:invokespecial   #88  <Method void FlowLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//   31   63:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method boolean FlowLayout.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:ifeq            17
	//    4    8:aload_1         
	//    5    9:instanceof      #9   <Class ChipGroup$LayoutParams>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void clearCheck()
	{
		protectFromCheckedChange = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field boolean protectFromCheckedChange>
		for(int i = 0; i < getChildCount(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #97  <Method int getChildCount()>
	//*   8   12:icmpge          43
		{
			View view = getChildAt(i);
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:invokevirtual   #100 <Method View getChildAt(int)>
	//   12   20:astore_2        
			if(view instanceof Chip)
	//*  13   21:aload_2         
	//*  14   22:instanceof      #71  <Class Chip>
	//*  15   25:ifeq            36
				((Chip)view).setChecked(false);
	//   16   28:aload_2         
	//   17   29:checkcast       #71  <Class Chip>
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #75  <Method void Chip.setChecked(boolean)>
		}

	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_1        
	//*  24   40:goto            7
		protectFromCheckedChange = false;
	//   25   43:aload_0         
	//   26   44:iconst_0        
	//   27   45:putfield        #36  <Field boolean protectFromCheckedChange>
		setCheckedId(-1);
	//   28   48:aload_0         
	//   29   49:iconst_m1       
	//   30   50:invokespecial   #56  <Method void setCheckedId(int)>
	//   31   53:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(-2, -2)));
	//    0    0:new             #9   <Class ChipGroup$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #106 <Method void ChipGroup$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #9   <Class ChipGroup$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #112 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #115 <Method void ChipGroup$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #9   <Class ChipGroup$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #119 <Method void ChipGroup$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getCheckedChipId()
	{
		if(singleSelection)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean singleSelection>
	//*   2    4:ifeq            12
			return checkedId;
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field int checkedId>
	//    5   11:ireturn         
		else
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
	}

	public int getChipSpacingHorizontal()
	{
		return chipSpacingHorizontal;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field int chipSpacingHorizontal>
	//    2    4:ireturn         
	}

	public int getChipSpacingVertical()
	{
		return chipSpacingVertical;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field int chipSpacingVertical>
	//    2    4:ireturn         
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void FlowLayout.onFinishInflate()>
		int i = checkedId;
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field int checkedId>
	//    4    8:istore_1        
		if(i != -1)
	//*   5    9:iload_1         
	//*   6   10:iconst_m1       
	//*   7   11:icmpeq          28
		{
			setCheckedStateForView(i, true);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:iconst_1        
	//   11   17:invokespecial   #50  <Method void setCheckedStateForView(int, boolean)>
			setCheckedId(checkedId);
	//   12   20:aload_0         
	//   13   21:aload_0         
	//   14   22:getfield        #41  <Field int checkedId>
	//   15   25:invokespecial   #56  <Method void setCheckedId(int)>
		}
	//   16   28:return          
	}

	public void setChipSpacing(int i)
	{
		setChipSpacingHorizontal(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #134 <Method void setChipSpacingHorizontal(int)>
		setChipSpacingVertical(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #137 <Method void setChipSpacingVertical(int)>
	//    6   10:return          
	}

	public void setChipSpacingHorizontal(int i)
	{
		if(chipSpacingHorizontal != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #124 <Field int chipSpacingHorizontal>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          22
		{
			chipSpacingHorizontal = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #124 <Field int chipSpacingHorizontal>
			setItemSpacing(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #140 <Method void setItemSpacing(int)>
			requestLayout();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #143 <Method void requestLayout()>
		}
	//   12   22:return          
	}

	public void setChipSpacingHorizontalResource(int i)
	{
		setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #149 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #155 <Method int Resources.getDimensionPixelOffset(int)>
	//    5    9:invokevirtual   #134 <Method void setChipSpacingHorizontal(int)>
	//    6   12:return          
	}

	public void setChipSpacingResource(int i)
	{
		setChipSpacing(getResources().getDimensionPixelOffset(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #149 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #155 <Method int Resources.getDimensionPixelOffset(int)>
	//    5    9:invokevirtual   #158 <Method void setChipSpacing(int)>
	//    6   12:return          
	}

	public void setChipSpacingVertical(int i)
	{
		if(chipSpacingVertical != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field int chipSpacingVertical>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          22
		{
			chipSpacingVertical = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #127 <Field int chipSpacingVertical>
			setLineSpacing(i);
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:invokevirtual   #161 <Method void setLineSpacing(int)>
			requestLayout();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #143 <Method void requestLayout()>
		}
	//   12   22:return          
	}

	public void setChipSpacingVerticalResource(int i)
	{
		setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #149 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #155 <Method int Resources.getDimensionPixelOffset(int)>
	//    5    9:invokevirtual   #137 <Method void setChipSpacingVertical(int)>
	//    6   12:return          
	}

	public void setDividerDrawableHorizontal(Drawable drawable)
	{
		throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
	//    0    0:new             #167 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #169 <String "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.">
	//    3    6:invokespecial   #172 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setDividerDrawableVertical(Drawable drawable)
	{
		throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
	//    0    0:new             #167 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #169 <String "Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.">
	//    3    6:invokespecial   #172 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setFlexWrap(int i)
	{
		throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
	//    0    0:new             #167 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #177 <String "Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.">
	//    3    6:invokespecial   #172 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setOnCheckedChangeListener(OnCheckedChangeListener oncheckedchangelistener)
	{
		onCheckedChangeListener = oncheckedchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field ChipGroup$OnCheckedChangeListener onCheckedChangeListener>
	//    3    5:return          
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
	{
		passThroughListener.onHierarchyChangeListener = onhierarchychangelistener;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field ChipGroup$PassThroughHierarchyChangeListener passThroughListener>
	//    2    4:aload_1         
	//    3    5:invokestatic    #187 <Method android.view.ViewGroup$OnHierarchyChangeListener ChipGroup$PassThroughHierarchyChangeListener.access$202(ChipGroup$PassThroughHierarchyChangeListener, android.view.ViewGroup$OnHierarchyChangeListener)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setShowDividerHorizontal(int i)
	{
		throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
	//    0    0:new             #167 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #190 <String "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.">
	//    3    6:invokespecial   #172 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setShowDividerVertical(int i)
	{
		throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
	//    0    0:new             #167 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #190 <String "Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.">
	//    3    6:invokespecial   #172 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public void setSingleLine(int i)
	{
		setSingleLine(getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #149 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #197 <Method boolean Resources.getBoolean(int)>
	//    5    9:invokevirtual   #199 <Method void setSingleLine(boolean)>
	//    6   12:return          
	}

	public void setSingleSelection(int i)
	{
		setSingleSelection(getResources().getBoolean(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #149 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #197 <Method boolean Resources.getBoolean(int)>
	//    5    9:invokevirtual   #202 <Method void setSingleSelection(boolean)>
	//    6   12:return          
	}

	public void setSingleSelection(boolean flag)
	{
		if(singleSelection != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field boolean singleSelection>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			singleSelection = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #44  <Field boolean singleSelection>
			clearCheck();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #204 <Method void clearCheck()>
		}
	//    9   17:return          
	}

	private int checkedId;
	private final CheckedStateTracker checkedStateTracker;
	private int chipSpacingHorizontal;
	private int chipSpacingVertical;
	private OnCheckedChangeListener onCheckedChangeListener;
	private PassThroughHierarchyChangeListener passThroughListener;
	private boolean protectFromCheckedChange;
	private boolean singleSelection;


/*
	static boolean access$300(ChipGroup chipgroup)
	{
		return chipgroup.protectFromCheckedChange;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field boolean protectFromCheckedChange>
	//    2    4:ireturn         
	}

*/


/*
	static int access$400(ChipGroup chipgroup)
	{
		return chipgroup.checkedId;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int checkedId>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$500(ChipGroup chipgroup)
	{
		return chipgroup.singleSelection;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean singleSelection>
	//    2    4:ireturn         
	}

*/


/*
	static void access$600(ChipGroup chipgroup, int i, boolean flag)
	{
		chipgroup.setCheckedStateForView(i, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #50  <Method void setCheckedStateForView(int, boolean)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$700(ChipGroup chipgroup, int i)
	{
		chipgroup.setCheckedId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #56  <Method void setCheckedId(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static CheckedStateTracker access$800(ChipGroup chipgroup)
	{
		return chipgroup.checkedStateTracker;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ChipGroup$CheckedStateTracker checkedStateTracker>
	//    2    4:areturn         
	}

*/
}
