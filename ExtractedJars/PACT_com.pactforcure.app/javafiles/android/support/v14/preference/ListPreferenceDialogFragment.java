// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v14.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.preference.ListPreference;

// Referenced classes of package android.support.v14.preference:
//			PreferenceDialogFragment

public class ListPreferenceDialogFragment extends PreferenceDialogFragment
{

	public ListPreferenceDialogFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void PreferenceDialogFragment()>
	//    2    4:return          
	}

	private ListPreference getListPreference()
	{
		return (ListPreference)getPreference();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method android.support.v7.preference.DialogPreference getPreference()>
	//    2    4:checkcast       #38  <Class ListPreference>
	//    3    7:areturn         
	}

	public static ListPreferenceDialogFragment newInstance(String s)
	{
		ListPreferenceDialogFragment listpreferencedialogfragment = new ListPreferenceDialogFragment();
	//    0    0:new             #2   <Class ListPreferenceDialogFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ListPreferenceDialogFragment()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle(1);
	//    4    8:new             #43  <Class Bundle>
	//    5   11:dup             
	//    6   12:iconst_1        
	//    7   13:invokespecial   #46  <Method void Bundle(int)>
	//    8   16:astore_2        
		bundle.putString("key", s);
	//    9   17:aload_2         
	//   10   18:ldc1            #48  <String "key">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #52  <Method void Bundle.putString(String, String)>
		listpreferencedialogfragment.setArguments(bundle);
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #56  <Method void setArguments(Bundle)>
		return listpreferencedialogfragment;
	//   16   29:aload_1         
	//   17   30:areturn         
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void PreferenceDialogFragment.onCreate(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       67
		{
			bundle = ((Bundle) (getListPreference()));
	//    5    9:aload_0         
	//    6   10:invokespecial   #61  <Method ListPreference getListPreference()>
	//    7   13:astore_1        
			if(((ListPreference) (bundle)).getEntries() == null || ((ListPreference) (bundle)).getEntryValues() == null)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #65  <Method CharSequence[] ListPreference.getEntries()>
	//*  10   18:ifnull          28
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #68  <Method CharSequence[] ListPreference.getEntryValues()>
	//*  13   25:ifnonnull       38
			{
				throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
	//   14   28:new             #70  <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc1            #72  <String "ListPreference requires an entries array and an entryValues array.">
	//   17   34:invokespecial   #75  <Method void IllegalStateException(String)>
	//   18   37:athrow          
			} else
			{
				mClickedDialogEntryIndex = ((ListPreference) (bundle)).findIndexOfValue(((ListPreference) (bundle)).getValue());
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #79  <Method String ListPreference.getValue()>
	//   23   44:invokevirtual   #83  <Method int ListPreference.findIndexOfValue(String)>
	//   24   47:putfield        #30  <Field int mClickedDialogEntryIndex>
				mEntries = ((ListPreference) (bundle)).getEntries();
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #65  <Method CharSequence[] ListPreference.getEntries()>
	//   28   55:putfield        #85  <Field CharSequence[] mEntries>
				mEntryValues = ((ListPreference) (bundle)).getEntryValues();
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #68  <Method CharSequence[] ListPreference.getEntryValues()>
	//   32   63:putfield        #87  <Field CharSequence[] mEntryValues>
				return;
	//   33   66:return          
			}
		} else
		{
			mClickedDialogEntryIndex = bundle.getInt("ListPreferenceDialogFragment.index", 0);
	//   34   67:aload_0         
	//   35   68:aload_1         
	//   36   69:ldc1            #16  <String "ListPreferenceDialogFragment.index">
	//   37   71:iconst_0        
	//   38   72:invokevirtual   #91  <Method int Bundle.getInt(String, int)>
	//   39   75:putfield        #30  <Field int mClickedDialogEntryIndex>
			mEntries = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:ldc1            #10  <String "ListPreferenceDialogFragment.entries">
	//   43   82:invokevirtual   #95  <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   44   85:putfield        #85  <Field CharSequence[] mEntries>
			mEntryValues = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:ldc1            #13  <String "ListPreferenceDialogFragment.entryValues">
	//   48   92:invokevirtual   #95  <Method CharSequence[] Bundle.getCharSequenceArray(String)>
	//   49   95:putfield        #87  <Field CharSequence[] mEntryValues>
			return;
	//   50   98:return          
		}
	}

	public void onDialogClosed(boolean flag)
	{
		ListPreference listpreference = getListPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method ListPreference getListPreference()>
	//    2    4:astore_2        
		if(flag && mClickedDialogEntryIndex >= 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            44
	//*   5    9:aload_0         
	//*   6   10:getfield        #30  <Field int mClickedDialogEntryIndex>
	//*   7   13:iflt            44
		{
			String s = mEntryValues[mClickedDialogEntryIndex].toString();
	//    8   16:aload_0         
	//    9   17:getfield        #87  <Field CharSequence[] mEntryValues>
	//   10   20:aload_0         
	//   11   21:getfield        #30  <Field int mClickedDialogEntryIndex>
	//   12   24:aaload          
	//   13   25:invokeinterface #102 <Method String CharSequence.toString()>
	//   14   30:astore_3        
			if(listpreference.callChangeListener(((Object) (s))))
	//*  15   31:aload_2         
	//*  16   32:aload_3         
	//*  17   33:invokevirtual   #106 <Method boolean ListPreference.callChangeListener(Object)>
	//*  18   36:ifeq            44
				listpreference.setValue(s);
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #109 <Method void ListPreference.setValue(String)>
		}
	//   22   44:return          
	}

	protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
	{
		super.onPrepareDialogBuilder(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #113 <Method void PreferenceDialogFragment.onPrepareDialogBuilder(android.app.AlertDialog$Builder)>
		builder.setSingleChoiceItems(mEntries, mClickedDialogEntryIndex, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				mClickedDialogEntryIndex = i;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ListPreferenceDialogFragment this$0>
			//    2    4:iload_2         
			//    3    5:invokestatic    #27  <Method int ListPreferenceDialogFragment.access$002(ListPreferenceDialogFragment, int)>
			//    4    8:pop             
				ListPreferenceDialogFragment.this.onClick(dialoginterface, -1);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field ListPreferenceDialogFragment this$0>
			//    7   13:aload_1         
			//    8   14:iconst_m1       
			//    9   15:invokevirtual   #29  <Method void ListPreferenceDialogFragment.onClick(DialogInterface, int)>
				dialoginterface.dismiss();
			//   10   18:aload_1         
			//   11   19:invokeinterface #34  <Method void DialogInterface.dismiss()>
			//   12   24:return          
			}

			final ListPreferenceDialogFragment this$0;

			
			{
				this$0 = ListPreferenceDialogFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPreferenceDialogFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CharSequence[] mEntries>
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field int mClickedDialogEntryIndex>
	//    8   14:new             #6   <Class ListPreferenceDialogFragment$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #116 <Method void ListPreferenceDialogFragment$1(ListPreferenceDialogFragment)>
	//   12   22:invokevirtual   #122 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setSingleChoiceItems(CharSequence[], int, android.content.DialogInterface$OnClickListener)>
	//   13   25:pop             
		builder.setPositiveButton(((CharSequence) (null)), ((android.content.DialogInterface.OnClickListener) (null)));
	//   14   26:aload_1         
	//   15   27:aconst_null     
	//   16   28:aconst_null     
	//   17   29:invokevirtual   #126 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   18   32:pop             
	//   19   33:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #130 <Method void PreferenceDialogFragment.onSaveInstanceState(Bundle)>
		bundle.putInt("ListPreferenceDialogFragment.index", mClickedDialogEntryIndex);
	//    3    5:aload_1         
	//    4    6:ldc1            #16  <String "ListPreferenceDialogFragment.index">
	//    5    8:aload_0         
	//    6    9:getfield        #30  <Field int mClickedDialogEntryIndex>
	//    7   12:invokevirtual   #134 <Method void Bundle.putInt(String, int)>
		bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", mEntries);
	//    8   15:aload_1         
	//    9   16:ldc1            #10  <String "ListPreferenceDialogFragment.entries">
	//   10   18:aload_0         
	//   11   19:getfield        #85  <Field CharSequence[] mEntries>
	//   12   22:invokevirtual   #138 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
		bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", mEntryValues);
	//   13   25:aload_1         
	//   14   26:ldc1            #13  <String "ListPreferenceDialogFragment.entryValues">
	//   15   28:aload_0         
	//   16   29:getfield        #87  <Field CharSequence[] mEntryValues>
	//   17   32:invokevirtual   #138 <Method void Bundle.putCharSequenceArray(String, CharSequence[])>
	//   18   35:return          
	}

	private static final String SAVE_STATE_ENTRIES = "ListPreferenceDialogFragment.entries";
	private static final String SAVE_STATE_ENTRY_VALUES = "ListPreferenceDialogFragment.entryValues";
	private static final String SAVE_STATE_INDEX = "ListPreferenceDialogFragment.index";
	private int mClickedDialogEntryIndex;
	private CharSequence mEntries[];
	private CharSequence mEntryValues[];


/*
	static int access$002(ListPreferenceDialogFragment listpreferencedialogfragment, int i)
	{
		listpreferencedialogfragment.mClickedDialogEntryIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mClickedDialogEntryIndex>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
