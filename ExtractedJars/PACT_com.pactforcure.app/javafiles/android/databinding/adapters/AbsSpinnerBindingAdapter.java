// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.widget.*;
import java.util.List;

// Referenced classes of package android.databinding.adapters:
//			ObservableListAdapter

public class AbsSpinnerBindingAdapter
{

	public AbsSpinnerBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void setEntries(AbsSpinner absspinner, List list)
	{
		if(list != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          47
		{
			SpinnerAdapter spinneradapter = absspinner.getAdapter();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method SpinnerAdapter AbsSpinner.getAdapter()>
	//    4    8:astore_2        
			if(spinneradapter instanceof ObservableListAdapter)
	//*   5    9:aload_2         
	//*   6   10:instanceof      #22  <Class ObservableListAdapter>
	//*   7   13:ifeq            25
			{
				((ObservableListAdapter)spinneradapter).setList(list);
	//    8   16:aload_2         
	//    9   17:checkcast       #22  <Class ObservableListAdapter>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #26  <Method void ObservableListAdapter.setList(List)>
				return;
	//   12   24:return          
			} else
			{
				absspinner.setAdapter(((SpinnerAdapter) (new ObservableListAdapter(absspinner.getContext(), list, 0x1090008, 0x1090009, 0))));
	//   13   25:aload_0         
	//   14   26:new             #22  <Class ObservableListAdapter>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokevirtual   #30  <Method android.content.Context AbsSpinner.getContext()>
	//   18   34:aload_1         
	//   19   35:ldc1            #31  <Int 0x1090008>
	//   20   37:ldc1            #32  <Int 0x1090009>
	//   21   39:iconst_0        
	//   22   40:invokespecial   #35  <Method void ObservableListAdapter(android.content.Context, List, int, int, int)>
	//   23   43:invokevirtual   #39  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
				return;
	//   24   46:return          
			}
		} else
		{
			absspinner.setAdapter(((SpinnerAdapter) (null)));
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:invokevirtual   #39  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
			return;
	//   28   52:return          
		}
	}

	public static void setEntries(AbsSpinner absspinner, CharSequence acharsequence[])
	{
		if(acharsequence == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          104
_L1:
		boolean flag;
		int i;
		SpinnerAdapter spinneradapter;
		spinneradapter = absspinner.getAdapter();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method SpinnerAdapter AbsSpinner.getAdapter()>
	//    4    8:astore          5
		i = 1;
	//    5   10:iconst_1        
	//    6   11:istore_3        
		flag = ((boolean) (i));
	//    7   12:iload_3         
	//    8   13:istore_2        
		if(spinneradapter == null) goto _L4; else goto _L3
	//    9   14:aload           5
	//   10   16:ifnull          66
_L3:
		flag = ((boolean) (i));
	//   11   19:iload_3         
	//   12   20:istore_2        
		if(spinneradapter.getCount() != acharsequence.length) goto _L4; else goto _L5
	//   13   21:aload           5
	//   14   23:invokeinterface #49  <Method int SpinnerAdapter.getCount()>
	//   15   28:aload_1         
	//   16   29:arraylength     
	//   17   30:icmpne          66
_L5:
		boolean flag1;
		flag1 = false;
	//   18   33:iconst_0        
	//   19   34:istore          4
		i = 0;
	//   20   36:iconst_0        
	//   21   37:istore_3        
_L9:
		flag = flag1;
	//   22   38:iload           4
	//   23   40:istore_2        
		if(i >= acharsequence.length) goto _L4; else goto _L6
	//   24   41:iload_3         
	//   25   42:aload_1         
	//   26   43:arraylength     
	//   27   44:icmpge          66
_L6:
		if(((Object) (acharsequence[i])).equals(spinneradapter.getItem(i))) goto _L8; else goto _L7
	//   28   47:aload_1         
	//   29   48:iload_3         
	//   30   49:aaload          
	//   31   50:aload           5
	//   32   52:iload_3         
	//   33   53:invokeinterface #53  <Method Object SpinnerAdapter.getItem(int)>
	//   34   58:invokevirtual   #57  <Method boolean Object.equals(Object)>
	//   35   61:ifne            97
_L7:
		flag = true;
	//   36   64:iconst_1        
	//   37   65:istore_2        
_L4:
		if(flag)
	//*  38   66:iload_2         
	//*  39   67:ifeq            96
		{
			acharsequence = ((CharSequence []) (new ArrayAdapter(absspinner.getContext(), 0x1090008, ((Object []) (acharsequence)))));
	//   40   70:new             #59  <Class ArrayAdapter>
	//   41   73:dup             
	//   42   74:aload_0         
	//   43   75:invokevirtual   #30  <Method android.content.Context AbsSpinner.getContext()>
	//   44   78:ldc1            #31  <Int 0x1090008>
	//   45   80:aload_1         
	//   46   81:invokespecial   #62  <Method void ArrayAdapter(android.content.Context, int, Object[])>
	//   47   84:astore_1        
			((ArrayAdapter) (acharsequence)).setDropDownViewResource(0x1090009);
	//   48   85:aload_1         
	//   49   86:ldc1            #32  <Int 0x1090009>
	//   50   88:invokevirtual   #66  <Method void ArrayAdapter.setDropDownViewResource(int)>
			absspinner.setAdapter(((SpinnerAdapter) (acharsequence)));
	//   51   91:aload_0         
	//   52   92:aload_1         
	//   53   93:invokevirtual   #39  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
		}
		return;
	//   54   96:return          
_L8:
		i++;
	//   55   97:iload_3         
	//   56   98:iconst_1        
	//   57   99:iadd            
	//   58  100:istore_3        
		if(true) goto _L9; else goto _L2
	//   59  101:goto            38
_L2:
		absspinner.setAdapter(((SpinnerAdapter) (null)));
	//   60  104:aload_0         
	//   61  105:aconst_null     
	//   62  106:invokevirtual   #39  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
		return;
	//   63  109:return          
	}
}
