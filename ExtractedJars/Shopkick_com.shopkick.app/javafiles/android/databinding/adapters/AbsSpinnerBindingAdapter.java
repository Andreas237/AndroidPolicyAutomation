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
	//    1    1:invokespecial   #12  <Method void Object()>
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
	//    3    5:invokevirtual   #23  <Method SpinnerAdapter AbsSpinner.getAdapter()>
	//    4    8:astore_2        
			if(spinneradapter instanceof ObservableListAdapter)
	//*   5    9:aload_2         
	//*   6   10:instanceof      #25  <Class ObservableListAdapter>
	//*   7   13:ifeq            25
			{
				((ObservableListAdapter)spinneradapter).setList(list);
	//    8   16:aload_2         
	//    9   17:checkcast       #25  <Class ObservableListAdapter>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #29  <Method void ObservableListAdapter.setList(List)>
				return;
	//   12   24:return          
			} else
			{
				absspinner.setAdapter(((SpinnerAdapter) (new ObservableListAdapter(absspinner.getContext(), list, 0x1090008, 0x1090009, 0))));
	//   13   25:aload_0         
	//   14   26:new             #25  <Class ObservableListAdapter>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:invokevirtual   #33  <Method android.content.Context AbsSpinner.getContext()>
	//   18   34:aload_1         
	//   19   35:ldc1            #34  <Int 0x1090008>
	//   20   37:ldc1            #35  <Int 0x1090009>
	//   21   39:iconst_0        
	//   22   40:invokespecial   #38  <Method void ObservableListAdapter(android.content.Context, List, int, int, int)>
	//   23   43:invokevirtual   #42  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
				return;
	//   24   46:return          
			}
		} else
		{
			absspinner.setAdapter(((SpinnerAdapter) (null)));
	//   25   47:aload_0         
	//   26   48:aconst_null     
	//   27   49:invokevirtual   #42  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
			return;
	//   28   52:return          
		}
	}

	public static void setEntries(AbsSpinner absspinner, CharSequence acharsequence[])
	{
label0:
		{
label1:
			{
				int i;
label2:
				{
					if(acharsequence == null)
						break label1;
	//    0    0:aload_1         
	//    1    1:ifnull          103
					SpinnerAdapter spinneradapter = absspinner.getAdapter();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #23  <Method SpinnerAdapter AbsSpinner.getAdapter()>
	//    4    8:astore          4
					boolean flag = true;
	//    5   10:iconst_1        
	//    6   11:istore_3        
					i = ((int) (flag));
	//    7   12:iload_3         
	//    8   13:istore_2        
					if(spinneradapter == null)
						break label2;
	//    9   14:aload           4
	//   10   16:ifnull          72
					i = ((int) (flag));
	//   11   19:iload_3         
	//   12   20:istore_2        
					if(spinneradapter.getCount() != acharsequence.length)
						break label2;
	//   13   21:aload           4
	//   14   23:invokeinterface #52  <Method int SpinnerAdapter.getCount()>
	//   15   28:aload_1         
	//   16   29:arraylength     
	//   17   30:icmpne          72
					i = 0;
	//   18   33:iconst_0        
	//   19   34:istore_2        
					do
					{
						if(i >= acharsequence.length)
							break;
	//   20   35:iload_2         
	//   21   36:aload_1         
	//   22   37:arraylength     
	//   23   38:icmpge          70
						if(!((Object) (acharsequence[i])).equals(spinneradapter.getItem(i)))
	//*  24   41:aload_1         
	//*  25   42:iload_2         
	//*  26   43:aaload          
	//*  27   44:aload           4
	//*  28   46:iload_2         
	//*  29   47:invokeinterface #56  <Method Object SpinnerAdapter.getItem(int)>
	//*  30   52:invokevirtual   #60  <Method boolean Object.equals(Object)>
	//*  31   55:ifne            63
						{
							i = ((int) (flag));
	//   32   58:iload_3         
	//   33   59:istore_2        
							break label2;
	//   34   60:goto            72
						}
						i++;
	//   35   63:iload_2         
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:istore_2        
					} while(true);
	//   39   67:goto            35
					i = 0;
	//   40   70:iconst_0        
	//   41   71:istore_2        
				}
				if(i != 0)
	//*  42   72:iload_2         
	//*  43   73:ifeq            108
				{
					acharsequence = ((CharSequence []) (new ArrayAdapter(absspinner.getContext(), 0x1090008, ((Object []) (acharsequence)))));
	//   44   76:new             #62  <Class ArrayAdapter>
	//   45   79:dup             
	//   46   80:aload_0         
	//   47   81:invokevirtual   #33  <Method android.content.Context AbsSpinner.getContext()>
	//   48   84:ldc1            #34  <Int 0x1090008>
	//   49   86:aload_1         
	//   50   87:invokespecial   #65  <Method void ArrayAdapter(android.content.Context, int, Object[])>
	//   51   90:astore_1        
					((ArrayAdapter) (acharsequence)).setDropDownViewResource(0x1090009);
	//   52   91:aload_1         
	//   53   92:ldc1            #35  <Int 0x1090009>
	//   54   94:invokevirtual   #69  <Method void ArrayAdapter.setDropDownViewResource(int)>
					absspinner.setAdapter(((SpinnerAdapter) (acharsequence)));
	//   55   97:aload_0         
	//   56   98:aload_1         
	//   57   99:invokevirtual   #42  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
					return;
	//   58  102:return          
				}
				break label0;
			}
			absspinner.setAdapter(((SpinnerAdapter) (null)));
	//   59  103:aload_0         
	//   60  104:aconst_null     
	//   61  105:invokevirtual   #42  <Method void AbsSpinner.setAdapter(SpinnerAdapter)>
		}
	//   62  108:return          
	}
}
