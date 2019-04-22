// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.view.View;

// Referenced classes of package android.support.design.chip:
//			ChipGroup, Chip

private class ChipGroup$PassThroughHierarchyChangeListener
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
			((Chip)view1).setOnCheckedChangeListenerInternal(((android.widget.CompoundButton.OnCheckedChangeListener) (ChipGroup.access$800(ChipGroup.this))));
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
	static android.view.ViewGroup.OnHierarchyChangeListener access$202(ChipGroup$PassThroughHierarchyChangeListener chipgroup$passthroughhierarchychangelistener, android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
	{
		chipgroup$passthroughhierarchychangelistener.onHierarchyChangeListener = onhierarchychangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field android.view.ViewGroup$OnHierarchyChangeListener onHierarchyChangeListener>
		return onhierarchychangelistener;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
