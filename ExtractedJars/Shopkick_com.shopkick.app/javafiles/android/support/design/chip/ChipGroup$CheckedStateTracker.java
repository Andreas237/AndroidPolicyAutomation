// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.chip;

import android.widget.CompoundButton;

// Referenced classes of package android.support.design.chip:
//			ChipGroup

private class ChipGroup$CheckedStateTracker
	implements android.widget.Listener
{

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(ChipGroup.access$300(ChipGroup.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ChipGroup this$0>
	//*   2    4:invokestatic    #28  <Method boolean ChipGroup.access$300(ChipGroup)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		int i = compoundbutton.getId();
	//    5   11:aload_1         
	//    6   12:invokevirtual   #34  <Method int CompoundButton.getId()>
	//    7   15:istore_3        
		if(flag)
	//*   8   16:iload_2         
	//*   9   17:ifeq            75
		{
			if(ChipGroup.access$400(ChipGroup.this) != -1 && ChipGroup.access$400(ChipGroup.this) != i && ChipGroup.access$500(ChipGroup.this))
	//*  10   20:aload_0         
	//*  11   21:getfield        #15  <Field ChipGroup this$0>
	//*  12   24:invokestatic    #38  <Method int ChipGroup.access$400(ChipGroup)>
	//*  13   27:iconst_m1       
	//*  14   28:icmpeq          66
	//*  15   31:aload_0         
	//*  16   32:getfield        #15  <Field ChipGroup this$0>
	//*  17   35:invokestatic    #38  <Method int ChipGroup.access$400(ChipGroup)>
	//*  18   38:iload_3         
	//*  19   39:icmpeq          66
	//*  20   42:aload_0         
	//*  21   43:getfield        #15  <Field ChipGroup this$0>
	//*  22   46:invokestatic    #41  <Method boolean ChipGroup.access$500(ChipGroup)>
	//*  23   49:ifeq            66
			{
				compoundbutton = ((CompoundButton) (ChipGroup.this));
	//   24   52:aload_0         
	//   25   53:getfield        #15  <Field ChipGroup this$0>
	//   26   56:astore_1        
				ChipGroup.access$600(((ChipGroup) (compoundbutton)), ChipGroup.access$400(((ChipGroup) (compoundbutton))), false);
	//   27   57:aload_1         
	//   28   58:aload_1         
	//   29   59:invokestatic    #38  <Method int ChipGroup.access$400(ChipGroup)>
	//   30   62:iconst_0        
	//   31   63:invokestatic    #45  <Method void ChipGroup.access$600(ChipGroup, int, boolean)>
			}
			ChipGroup.access$700(ChipGroup.this, i);
	//   32   66:aload_0         
	//   33   67:getfield        #15  <Field ChipGroup this$0>
	//   34   70:iload_3         
	//   35   71:invokestatic    #49  <Method void ChipGroup.access$700(ChipGroup, int)>
			return;
	//   36   74:return          
		}
		if(ChipGroup.access$400(ChipGroup.this) == i)
	//*  37   75:aload_0         
	//*  38   76:getfield        #15  <Field ChipGroup this$0>
	//*  39   79:invokestatic    #38  <Method int ChipGroup.access$400(ChipGroup)>
	//*  40   82:iload_3         
	//*  41   83:icmpne          94
			ChipGroup.access$700(ChipGroup.this, -1);
	//   42   86:aload_0         
	//   43   87:getfield        #15  <Field ChipGroup this$0>
	//   44   90:iconst_m1       
	//   45   91:invokestatic    #49  <Method void ChipGroup.access$700(ChipGroup, int)>
	//   46   94:return          
	}

	final ChipGroup this$0;

	private ChipGroup$CheckedStateTracker()
	{
		this$0 = ChipGroup.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ChipGroup this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}

	ChipGroup$CheckedStateTracker(ChipGroup._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void ChipGroup$CheckedStateTracker(ChipGroup)>
	//    3    5:return          
	}
}
