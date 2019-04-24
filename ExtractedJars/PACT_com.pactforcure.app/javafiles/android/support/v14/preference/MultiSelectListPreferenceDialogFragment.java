// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.preference.internal.AbstractMultiSelectListPreference;
import java.util.*;

// Referenced classes of package android.support.v14.preference:
//			PreferenceDialogFragment

public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment
{

	public MultiSelectListPreferenceDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void PreferenceDialogFragment()>
		mNewValues = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #33  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #34  <Method void HashSet()>
	//    6   12:putfield        #36  <Field Set mNewValues>
	//    7   15:return          
	}

	private AbstractMultiSelectListPreference getListPreference()
	{
		return (AbstractMultiSelectListPreference)getPreference();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method android.support.v7.preference.DialogPreference getPreference()>
	//    2    4:checkcast       #57  <Class AbstractMultiSelectListPreference>
	//    3    7:areturn         
	}

	public static MultiSelectListPreferenceDialogFragment newInstance(String s)
	{
		MultiSelectListPreferenceDialogFragment multiselectlistpreferencedialogfragment = new MultiSelectListPreferenceDialogFragment();
	//    0    0:new             #2   <Class MultiSelectListPreferenceDialogFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #60  <Method void MultiSelectListPreferenceDialogFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle(1);
	//    4    8:new             #62  <Class Bundle>
	//    5   11:dup             
	//    6   12:iconst_1        
	//    7   13:invokespecial   #65  <Method void Bundle(int)>
	//    8   16:astore_2        
		bundle.putString("key", s);
	//    9   17:aload_2         
	//   10   18:ldc1            #67  <String "key">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #71  <Method void Bundle.putString(String, String)>
		multiselectlistpreferencedialogfragment.setArguments(bundle);
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #75  <Method void setArguments(Bundle)>
		return multiselectlistpreferencedialogfragment;
	//   16   29:aload_1         
	//   17   30:areturn         
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method void PreferenceDialogFragment.onCreate(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       83
		{
			bundle = ((Bundle) (getListPreference()));
	//    5    9:aload_0         
	//    6   10:invokespecial   #80  <Method AbstractMultiSelectListPreference getListPreference()>
	//    7   13:astore_1        
			if(((AbstractMultiSelectListPreference) (bundle)).getEntries() == null || ((AbstractMultiSelectListPreference) (bundle)).getEntryValues() == null)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #84  <Method CharSequence[] AbstractMultiSelectListPreference.getEntries()>
	//*  10   18:ifnull          28
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #87  <Method CharSequence[] AbstractMultiSelectListPreference.getEntryValues()>
	//*  13   25:ifnonnull       38
			{
				throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
	//   14   28:new             #89  <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc1            #91  <String "MultiSelectListPreference requires an entries array and an entryValues array.">
	//   17   34:invokespecial   #94  <Method void IllegalStateException(String)>
	//   18   37:athrow          
			} else
			{
				mNewValues.clear();
	//   19   38:aload_0         
	//   20   39:getfield        #36  <Field Set mNewValues>
	//   21   42:invokeinterface #99  <Method void Set.clear()>
				mNewValues.addAll(((java.util.Collection) (((AbstractMultiSelectListPreference) (bundle)).getValues())));
	//   22   47:aload_0         
	//   23   48:getfield        #36  <Field Set mNewValues>
	//   24   51:aload_1         
	//   25   52:invokevirtual   #103 <Method Set AbstractMultiSelectListPreference.getValues()>
	//   26   55:invokeinterface #107 <Method boolean Set.addAll(java.util.Collection)>
	//   27   60:pop             
				mPreferenceChanged = false;
	//   28   61:aload_0         
	//   29   62:iconst_0        
	//   30   63:putfield        #41  <Field boolean mPreferenceChanged>
				mEntries = ((AbstractMultiSelectListPreference) (bundle)).getEntries();
	//   31   66:aload_0         
	//   32   67:aload_1         
	//   33   68:invokevirtual   #84  <Method CharSequence[] AbstractMultiSelectListPreference.getEntries()>
	//   34   71:putfield        #109 <Field CharSequence[] mEntries>
				mEntryValues = ((AbstractMultiSelectListPreference) (bundle)).getEntryValues();
	//   35   74:aload_0         
	//   36   75:aload_1         
	//   37   76:invokevirtual   #87  <Method CharSequence[] AbstractMultiSelectListPreference.getEntryValues()>
	//   38   79:putfield        #47  <Field CharSequence[] mEntryValues>
				return;
	//   39   82:return          
			}
		} else
		{
			mNewValues.clear();
	//   40   83:aload_0         
	//   41   84:getfield        #36  <Field Set mNewValues>
	//   42   87:invokeinterface #99  <Method void Set.clear()>
			mNewValues.addAll(((java.util.Collection) (bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"))));
	//   43   92:aload_0         
	//   44   93:getfield        #36  <Field Set mNewValues>
	//   45   96:aload_1         
	//   46   97:ldc1            #19  <String "MultiSelectListPreferenceDialogFragment.values">
	//   47   99:invokevirtual   #113 <Method ArrayList Bundle.getStringArrayList(String)>
	//   48  102:invokeinterface #107 <Method boolean Set.addAll(java.util.Collection)>
	//   49  107:pop             
			mPreferenceChanged = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
	//   50  108:aload_0         
	//   51  109:aload_1         
	//   52  110:ldc1            #10  <String "MultiSelectListPreferenceDialogFragment.changed">
	//   53  112:iconst_0        
	//   54  113:invokevirtual   #117 <Method boolean Bundle.getBoolean(String, boolean)>
	//   55  116:putfield        #41  <Field boolean mPreferenceChanged>
			mEntries = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
	//   56  119:aload_0         
	//   57  120:aload_1         
	//   58  121:ldc1            #13  <String "MultiSelectListPreferenceDialogFragment.entries">
	//   59  123:invokevirtual   #121 <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   60  126:putfield        #109 <Field CharSequence[] mEntries>
			mEntryValues = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
	//   61  129:aload_0         
	//   62  130:aload_1         
	//   63  131:ldc1            #16  <String "MultiSelectListPreferenceDialogFragment.entryValues">
	//   64  133:invokevirtual   #121 <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   65  136:putfield        #47  <Field CharSequence[] mEntryValues>
			return;
	//   66  139:return          
		}
	}

	public void onDialogClosed(boolean flag)
	{
		AbstractMultiSelectListPreference abstractmultiselectlistpreference = getListPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method AbstractMultiSelectListPreference getListPreference()>
	//    2    4:astore_2        
		if(flag && mPreferenceChanged)
	//*   3    5:iload_1         
	//*   4    6:ifeq            34
	//*   5    9:aload_0         
	//*   6   10:getfield        #41  <Field boolean mPreferenceChanged>
	//*   7   13:ifeq            34
		{
			Set set = mNewValues;
	//    8   16:aload_0         
	//    9   17:getfield        #36  <Field Set mNewValues>
	//   10   20:astore_3        
			if(abstractmultiselectlistpreference.callChangeListener(((Object) (set))))
	//*  11   21:aload_2         
	//*  12   22:aload_3         
	//*  13   23:invokevirtual   #127 <Method boolean AbstractMultiSelectListPreference.callChangeListener(Object)>
	//*  14   26:ifeq            34
				abstractmultiselectlistpreference.setValues(set);
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #131 <Method void AbstractMultiSelectListPreference.setValues(Set)>
		}
		mPreferenceChanged = false;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #41  <Field boolean mPreferenceChanged>
	//   21   39:return          
	}

	protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
	{
		super.onPrepareDialogBuilder(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #135 <Method void PreferenceDialogFragment.onPrepareDialogBuilder(android.app.AlertDialog$Builder)>
		int j = mEntryValues.length;
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field CharSequence[] mEntryValues>
	//    5    9:arraylength     
	//    6   10:istore_3        
		boolean aflag[] = new boolean[j];
	//    7   11:iload_3         
	//    8   12:newarray        boolean[]
	//    9   14:astore          4
		for(int i = 0; i < j; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_2        
	//*  12   18:iload_2         
	//*  13   19:iload_3         
	//*  14   20:icmpge          54
			aflag[i] = mNewValues.contains(((Object) (mEntryValues[i].toString())));
	//   15   23:aload           4
	//   16   25:iload_2         
	//   17   26:aload_0         
	//   18   27:getfield        #36  <Field Set mNewValues>
	//   19   30:aload_0         
	//   20   31:getfield        #47  <Field CharSequence[] mEntryValues>
	//   21   34:iload_2         
	//   22   35:aaload          
	//   23   36:invokeinterface #141 <Method String CharSequence.toString()>
	//   24   41:invokeinterface #144 <Method boolean Set.contains(Object)>
	//   25   46:bastore         

	//   26   47:iload_2         
	//   27   48:iconst_1        
	//   28   49:iadd            
	//   29   50:istore_2        
	//*  30   51:goto            18
		builder.setMultiChoiceItems(mEntries, aflag, new android.content.DialogInterface.OnMultiChoiceClickListener() {

			public void onClick(DialogInterface dialoginterface, int k, boolean flag)
			{
				if(flag)
			//*   0    0:iload_3         
			//*   1    1:ifeq            47
				{
					mPreferenceChanged = mPreferenceChanged | mNewValues.add(((Object) (mEntryValues[k].toString())));
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
					mPreferenceChanged = mPreferenceChanged | mNewValues.remove(((Object) (mEntryValues[k].toString())));
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
);
	//   31   54:aload_1         
	//   32   55:aload_0         
	//   33   56:getfield        #109 <Field CharSequence[] mEntries>
	//   34   59:aload           4
	//   35   61:new             #6   <Class MultiSelectListPreferenceDialogFragment$1>
	//   36   64:dup             
	//   37   65:aload_0         
	//   38   66:invokespecial   #147 <Method void MultiSelectListPreferenceDialogFragment$1(MultiSelectListPreferenceDialogFragment)>
	//   39   69:invokevirtual   #153 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMultiChoiceItems(CharSequence[], boolean[], android.content.DialogInterface$OnMultiChoiceClickListener)>
	//   40   72:pop             
	//   41   73:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #157 <Method void PreferenceDialogFragment.onSaveInstanceState(Bundle)>
		bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList(((java.util.Collection) (mNewValues))));
	//    3    5:aload_1         
	//    4    6:ldc1            #19  <String "MultiSelectListPreferenceDialogFragment.values">
	//    5    8:new             #159 <Class ArrayList>
	//    6   11:dup             
	//    7   12:aload_0         
	//    8   13:getfield        #36  <Field Set mNewValues>
	//    9   16:invokespecial   #162 <Method void ArrayList(java.util.Collection)>
	//   10   19:invokevirtual   #166 <Method void Bundle.putStringArrayList(String, ArrayList)>
		bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", mPreferenceChanged);
	//   11   22:aload_1         
	//   12   23:ldc1            #10  <String "MultiSelectListPreferenceDialogFragment.changed">
	//   13   25:aload_0         
	//   14   26:getfield        #41  <Field boolean mPreferenceChanged>
	//   15   29:invokevirtual   #170 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", mEntries);
	//   16   32:aload_1         
	//   17   33:ldc1            #13  <String "MultiSelectListPreferenceDialogFragment.entries">
	//   18   35:aload_0         
	//   19   36:getfield        #109 <Field CharSequence[] mEntries>
	//   20   39:invokevirtual   #174 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
		bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", mEntryValues);
	//   21   42:aload_1         
	//   22   43:ldc1            #16  <String "MultiSelectListPreferenceDialogFragment.entryValues">
	//   23   45:aload_0         
	//   24   46:getfield        #47  <Field CharSequence[] mEntryValues>
	//   25   49:invokevirtual   #174 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
	//   26   52:return          
	}

	private static final String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragment.changed";
	private static final String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragment.entries";
	private static final String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragment.entryValues";
	private static final String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragment.values";
	private CharSequence mEntries[];
	private CharSequence mEntryValues[];
	private Set mNewValues;
	private boolean mPreferenceChanged;


/*
	static boolean access$000(MultiSelectListPreferenceDialogFragment multiselectlistpreferencedialogfragment)
	{
		return multiselectlistpreferencedialogfragment.mPreferenceChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field boolean mPreferenceChanged>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$002(MultiSelectListPreferenceDialogFragment multiselectlistpreferencedialogfragment, boolean flag)
	{
		multiselectlistpreferencedialogfragment.mPreferenceChanged = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field boolean mPreferenceChanged>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static CharSequence[] access$100(MultiSelectListPreferenceDialogFragment multiselectlistpreferencedialogfragment)
	{
		return multiselectlistpreferencedialogfragment.mEntryValues;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field CharSequence[] mEntryValues>
	//    2    4:areturn         
	}

*/


/*
	static Set access$200(MultiSelectListPreferenceDialogFragment multiselectlistpreferencedialogfragment)
	{
		return multiselectlistpreferencedialogfragment.mNewValues;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Set mNewValues>
	//    2    4:areturn         
	}

*/
}
