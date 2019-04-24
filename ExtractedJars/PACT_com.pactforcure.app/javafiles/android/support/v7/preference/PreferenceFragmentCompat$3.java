// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.preference:
//			PreferenceFragmentCompat, Preference

class PreferenceFragmentCompat$3
	implements Runnable
{

	public void run()
	{
		android.support.v7.widget.RecyclerView.Adapter adapter;
label0:
		{
			adapter = PreferenceFragmentCompat.access$200(PreferenceFragmentCompat.this).getAdapter();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field PreferenceFragmentCompat this$0>
	//    2    4:invokestatic    #34  <Method RecyclerView PreferenceFragmentCompat.access$200(PreferenceFragmentCompat)>
	//    3    7:invokevirtual   #40  <Method android.support.v7.widget.RecyclerView$Adapter RecyclerView.getAdapter()>
	//    4   10:astore_2        
			if(!(adapter instanceof ositionCallback))
	//*   5   11:aload_2         
	//*   6   12:instanceof      #42  <Class PreferenceGroup$PreferencePositionCallback>
	//*   7   15:ifne            32
			{
				if(adapter != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          69
					throw new IllegalStateException("Adapter must implement PreferencePositionCallback");
	//   10   22:new             #44  <Class IllegalStateException>
	//   11   25:dup             
	//   12   26:ldc1            #46  <String "Adapter must implement PreferencePositionCallback">
	//   13   28:invokespecial   #49  <Method void IllegalStateException(String)>
	//   14   31:athrow          
			} else
			{
				int i;
				if(val$preference != null)
	//*  15   32:aload_0         
	//*  16   33:getfield        #23  <Field Preference val$preference>
	//*  17   36:ifnull          70
					i = ((ositionCallback)adapter).getPreferenceAdapterPosition(val$preference);
	//   18   39:aload_2         
	//   19   40:checkcast       #42  <Class PreferenceGroup$PreferencePositionCallback>
	//   20   43:aload_0         
	//   21   44:getfield        #23  <Field Preference val$preference>
	//   22   47:invokeinterface #53  <Method int PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(Preference)>
	//   23   52:istore_1        
				else
	//*  24   53:iload_1         
	//*  25   54:iconst_m1       
	//*  26   55:icmpeq          87
	//*  27   58:aload_0         
	//*  28   59:getfield        #21  <Field PreferenceFragmentCompat this$0>
	//*  29   62:invokestatic    #34  <Method RecyclerView PreferenceFragmentCompat.access$200(PreferenceFragmentCompat)>
	//*  30   65:iload_1         
	//*  31   66:invokevirtual   #57  <Method void RecyclerView.scrollToPosition(int)>
	//*  32   69:return          
					i = ((ositionCallback)adapter).getPreferenceAdapterPosition(val$key);
	//   33   70:aload_2         
	//   34   71:checkcast       #42  <Class PreferenceGroup$PreferencePositionCallback>
	//   35   74:aload_0         
	//   36   75:getfield        #25  <Field String val$key>
	//   37   78:invokeinterface #60  <Method int PreferenceGroup$PreferencePositionCallback.getPreferenceAdapterPosition(String)>
	//   38   83:istore_1        
				if(i == -1)
					break label0;
				PreferenceFragmentCompat.access$200(PreferenceFragmentCompat.this).scrollToPosition(i);
			}
			return;
		}
	//*  39   84:goto            53
		adapter.registerAdapterDataObserver(((android.support.v7.widget.erver) (new rollToPreferenceObserver(adapter, PreferenceFragmentCompat.access$200(PreferenceFragmentCompat.this), val$preference, val$key))));
	//   40   87:aload_2         
	//   41   88:new             #62  <Class PreferenceFragmentCompat$ScrollToPreferenceObserver>
	//   42   91:dup             
	//   43   92:aload_2         
	//   44   93:aload_0         
	//   45   94:getfield        #21  <Field PreferenceFragmentCompat this$0>
	//   46   97:invokestatic    #34  <Method RecyclerView PreferenceFragmentCompat.access$200(PreferenceFragmentCompat)>
	//   47  100:aload_0         
	//   48  101:getfield        #23  <Field Preference val$preference>
	//   49  104:aload_0         
	//   50  105:getfield        #25  <Field String val$key>
	//   51  108:invokespecial   #65  <Method void PreferenceFragmentCompat$ScrollToPreferenceObserver(android.support.v7.widget.RecyclerView$Adapter, RecyclerView, Preference, String)>
	//   52  111:invokevirtual   #71  <Method void android.support.v7.widget.RecyclerView$Adapter.registerAdapterDataObserver(android.support.v7.widget.RecyclerView$AdapterDataObserver)>
	//   53  114:return          
	}

	final PreferenceFragmentCompat this$0;
	final String val$key;
	final Preference val$preference;

	PreferenceFragmentCompat$3()
	{
		this$0 = final_preferencefragmentcompat;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field PreferenceFragmentCompat this$0>
		val$preference = preference1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Preference val$preference>
		val$key = String.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String val$key>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
