// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.content.DialogInterface;
import java.util.Set;

// Referenced classes of package android.support.v14.preference:
//			MultiSelectListPreferenceDialogFragment

class MultiSelectListPreferenceDialogFragment$1
	implements android.content.
{

	public void onClick(DialogInterface dialoginterface, int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            47
		{
			MultiSelectListPreferenceDialogFragment.access$002(MultiSelectListPreferenceDialogFragment.this, MultiSelectListPreferenceDialogFragment.access$000(MultiSelectListPreferenceDialogFragment.this) | MultiSelectListPreferenceDialogFragment.access$200(MultiSelectListPreferenceDialogFragment.this).add(((Object) (MultiSelectListPreferenceDialogFragment.access$100(MultiSelectListPreferenceDialogFragment.this)[i].toString()))));
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//    6   12:invokestatic    #27  <Method boolean MultiSelectListPreferenceDialogFragment.access$000(MultiSelectListPreferenceDialogFragment)>
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//    9   19:invokestatic    #31  <Method Set MultiSelectListPreferenceDialogFragment.access$200(MultiSelectListPreferenceDialogFragment)>
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//   12   26:invokestatic    #35  <Method CharSequence[] MultiSelectListPreferenceDialogFragment.access$100(MultiSelectListPreferenceDialogFragment)>
	//   13   29:iload_2         
	//   14   30:aaload          
	//   15   31:invokeinterface #41  <Method String CharSequence.toString()>
	//   16   36:invokeinterface #47  <Method boolean Set.add(Object)>
	//   17   41:ior             
	//   18   42:invokestatic    #51  <Method boolean MultiSelectListPreferenceDialogFragment.access$002(MultiSelectListPreferenceDialogFragment, boolean)>
	//   19   45:pop             
			return;
	//   20   46:return          
		} else
		{
			MultiSelectListPreferenceDialogFragment.access$002(MultiSelectListPreferenceDialogFragment.this, MultiSelectListPreferenceDialogFragment.access$000(MultiSelectListPreferenceDialogFragment.this) | MultiSelectListPreferenceDialogFragment.access$200(MultiSelectListPreferenceDialogFragment.this).remove(((Object) (MultiSelectListPreferenceDialogFragment.access$100(MultiSelectListPreferenceDialogFragment.this)[i].toString()))));
	//   21   47:aload_0         
	//   22   48:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//   23   51:aload_0         
	//   24   52:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//   25   55:invokestatic    #27  <Method boolean MultiSelectListPreferenceDialogFragment.access$000(MultiSelectListPreferenceDialogFragment)>
	//   26   58:aload_0         
	//   27   59:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//   28   62:invokestatic    #31  <Method Set MultiSelectListPreferenceDialogFragment.access$200(MultiSelectListPreferenceDialogFragment)>
	//   29   65:aload_0         
	//   30   66:getfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
	//   31   69:invokestatic    #35  <Method CharSequence[] MultiSelectListPreferenceDialogFragment.access$100(MultiSelectListPreferenceDialogFragment)>
	//   32   72:iload_2         
	//   33   73:aaload          
	//   34   74:invokeinterface #41  <Method String CharSequence.toString()>
	//   35   79:invokeinterface #54  <Method boolean Set.remove(Object)>
	//   36   84:ior             
	//   37   85:invokestatic    #51  <Method boolean MultiSelectListPreferenceDialogFragment.access$002(MultiSelectListPreferenceDialogFragment, boolean)>
	//   38   88:pop             
			return;
	//   39   89:return          
		}
	}

	final MultiSelectListPreferenceDialogFragment this$0;

	MultiSelectListPreferenceDialogFragment$1()
	{
		this$0 = MultiSelectListPreferenceDialogFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MultiSelectListPreferenceDialogFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
