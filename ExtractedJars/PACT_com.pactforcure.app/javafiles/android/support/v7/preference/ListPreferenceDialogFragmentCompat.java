// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.preference:
//			PreferenceDialogFragmentCompat, ListPreference

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat
{

	public ListPreferenceDialogFragmentCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void PreferenceDialogFragmentCompat()>
	//    2    4:return          
	}

	private static CharSequence[] getCharSequenceArray(Bundle bundle, String s)
	{
		bundle = ((Bundle) (bundle.getStringArrayList(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method ArrayList Bundle.getStringArrayList(String)>
	//    3    5:astore_0        
		if(bundle == null)
	//*   4    6:aload_0         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return (CharSequence[])((ArrayList) (bundle)).toArray(((Object []) (new CharSequence[((ArrayList) (bundle)).size()])));
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:invokevirtual   #44  <Method int ArrayList.size()>
	//   11   17:anewarray       CharSequence[]
	//   12   20:invokevirtual   #50  <Method Object[] ArrayList.toArray(Object[])>
	//   13   23:checkcast       #51  <Class CharSequence[]>
	//   14   26:areturn         
	}

	private ListPreference getListPreference()
	{
		return (ListPreference)getPreference();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method DialogPreference getPreference()>
	//    2    4:checkcast       #59  <Class ListPreference>
	//    3    7:areturn         
	}

	public static ListPreferenceDialogFragmentCompat newInstance(String s)
	{
		ListPreferenceDialogFragmentCompat listpreferencedialogfragmentcompat = new ListPreferenceDialogFragmentCompat();
	//    0    0:new             #2   <Class ListPreferenceDialogFragmentCompat>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void ListPreferenceDialogFragmentCompat()>
	//    3    7:astore_1        
		Bundle bundle = new Bundle(1);
	//    4    8:new             #34  <Class Bundle>
	//    5   11:dup             
	//    6   12:iconst_1        
	//    7   13:invokespecial   #65  <Method void Bundle(int)>
	//    8   16:astore_2        
		bundle.putString("key", s);
	//    9   17:aload_2         
	//   10   18:ldc1            #67  <String "key">
	//   11   20:aload_0         
	//   12   21:invokevirtual   #71  <Method void Bundle.putString(String, String)>
		listpreferencedialogfragmentcompat.setArguments(bundle);
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokevirtual   #75  <Method void setArguments(Bundle)>
		return listpreferencedialogfragmentcompat;
	//   16   29:aload_1         
	//   17   30:areturn         
	}

	private static void putCharSequenceArray(Bundle bundle, String s, CharSequence acharsequence[])
	{
		ArrayList arraylist = new ArrayList(acharsequence.length);
	//    0    0:new             #40  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:invokespecial   #78  <Method void ArrayList(int)>
	//    5    9:astore          5
		int j = acharsequence.length;
	//    6   11:aload_2         
	//    7   12:arraylength     
	//    8   13:istore          4
		for(int i = 0; i < j; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:iload           4
	//*  13   20:icmpge          44
			arraylist.add(((Object) (acharsequence[i].toString())));
	//   14   23:aload           5
	//   15   25:aload_2         
	//   16   26:iload_3         
	//   17   27:aaload          
	//   18   28:invokeinterface #82  <Method String CharSequence.toString()>
	//   19   33:invokevirtual   #86  <Method boolean ArrayList.add(Object)>
	//   20   36:pop             

	//   21   37:iload_3         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_3        
	//*  25   41:goto            17
		bundle.putStringArrayList(s, arraylist);
	//   26   44:aload_0         
	//   27   45:aload_1         
	//   28   46:aload           5
	//   29   48:invokevirtual   #90  <Method void Bundle.putStringArrayList(String, ArrayList)>
	//   30   51:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #93  <Method void PreferenceDialogFragmentCompat.onCreate(Bundle)>
		if(bundle == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       67
		{
			bundle = ((Bundle) (getListPreference()));
	//    5    9:aload_0         
	//    6   10:invokespecial   #95  <Method ListPreference getListPreference()>
	//    7   13:astore_1        
			if(((ListPreference) (bundle)).getEntries() == null || ((ListPreference) (bundle)).getEntryValues() == null)
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #99  <Method CharSequence[] ListPreference.getEntries()>
	//*  10   18:ifnull          28
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #102 <Method CharSequence[] ListPreference.getEntryValues()>
	//*  13   25:ifnonnull       38
			{
				throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
	//   14   28:new             #104 <Class IllegalStateException>
	//   15   31:dup             
	//   16   32:ldc1            #106 <String "ListPreference requires an entries array and an entryValues array.">
	//   17   34:invokespecial   #109 <Method void IllegalStateException(String)>
	//   18   37:athrow          
			} else
			{
				mClickedDialogEntryIndex = ((ListPreference) (bundle)).findIndexOfValue(((ListPreference) (bundle)).getValue());
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:aload_1         
	//   22   41:invokevirtual   #112 <Method String ListPreference.getValue()>
	//   23   44:invokevirtual   #116 <Method int ListPreference.findIndexOfValue(String)>
	//   24   47:putfield        #30  <Field int mClickedDialogEntryIndex>
				mEntries = ((ListPreference) (bundle)).getEntries();
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:invokevirtual   #99  <Method CharSequence[] ListPreference.getEntries()>
	//   28   55:putfield        #118 <Field CharSequence[] mEntries>
				mEntryValues = ((ListPreference) (bundle)).getEntryValues();
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:invokevirtual   #102 <Method CharSequence[] ListPreference.getEntryValues()>
	//   32   63:putfield        #120 <Field CharSequence[] mEntryValues>
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
	//   38   72:invokevirtual   #124 <Method int Bundle.getInt(String, int)>
	//   39   75:putfield        #30  <Field int mClickedDialogEntryIndex>
			mEntries = getCharSequenceArray(bundle, "ListPreferenceDialogFragment.entries");
	//   40   78:aload_0         
	//   41   79:aload_1         
	//   42   80:ldc1            #10  <String "ListPreferenceDialogFragment.entries">
	//   43   82:invokestatic    #126 <Method CharSequence[] getCharSequenceArray(Bundle, String)>
	//   44   85:putfield        #118 <Field CharSequence[] mEntries>
			mEntryValues = getCharSequenceArray(bundle, "ListPreferenceDialogFragment.entryValues");
	//   45   88:aload_0         
	//   46   89:aload_1         
	//   47   90:ldc1            #13  <String "ListPreferenceDialogFragment.entryValues">
	//   48   92:invokestatic    #126 <Method CharSequence[] getCharSequenceArray(Bundle, String)>
	//   49   95:putfield        #120 <Field CharSequence[] mEntryValues>
			return;
	//   50   98:return          
		}
	}

	public void onDialogClosed(boolean flag)
	{
		ListPreference listpreference = getListPreference();
	//    0    0:aload_0         
	//    1    1:invokespecial   #95  <Method ListPreference getListPreference()>
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
	//    9   17:getfield        #120 <Field CharSequence[] mEntryValues>
	//   10   20:aload_0         
	//   11   21:getfield        #30  <Field int mClickedDialogEntryIndex>
	//   12   24:aaload          
	//   13   25:invokeinterface #82  <Method String CharSequence.toString()>
	//   14   30:astore_3        
			if(listpreference.callChangeListener(((Object) (s))))
	//*  15   31:aload_2         
	//*  16   32:aload_3         
	//*  17   33:invokevirtual   #131 <Method boolean ListPreference.callChangeListener(Object)>
	//*  18   36:ifeq            44
				listpreference.setValue(s);
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #134 <Method void ListPreference.setValue(String)>
		}
	//   22   44:return          
	}

	protected void onPrepareDialogBuilder(android.support.v7.app.AlertDialog.Builder builder)
	{
		super.onPrepareDialogBuilder(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #138 <Method void PreferenceDialogFragmentCompat.onPrepareDialogBuilder(android.support.v7.app.AlertDialog$Builder)>
		builder.setSingleChoiceItems(mEntries, mClickedDialogEntryIndex, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				mClickedDialogEntryIndex = i;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ListPreferenceDialogFragmentCompat this$0>
			//    2    4:iload_2         
			//    3    5:invokestatic    #27  <Method int ListPreferenceDialogFragmentCompat.access$002(ListPreferenceDialogFragmentCompat, int)>
			//    4    8:pop             
				ListPreferenceDialogFragmentCompat.this.onClick(dialoginterface, -1);
			//    5    9:aload_0         
			//    6   10:getfield        #17  <Field ListPreferenceDialogFragmentCompat this$0>
			//    7   13:aload_1         
			//    8   14:iconst_m1       
			//    9   15:invokevirtual   #29  <Method void ListPreferenceDialogFragmentCompat.onClick(DialogInterface, int)>
				dialoginterface.dismiss();
			//   10   18:aload_1         
			//   11   19:invokeinterface #34  <Method void DialogInterface.dismiss()>
			//   12   24:return          
			}

			final ListPreferenceDialogFragmentCompat this$0;

			
			{
				this$0 = ListPreferenceDialogFragmentCompat.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPreferenceDialogFragmentCompat this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #118 <Field CharSequence[] mEntries>
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field int mClickedDialogEntryIndex>
	//    8   14:new             #6   <Class ListPreferenceDialogFragmentCompat$1>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:invokespecial   #141 <Method void ListPreferenceDialogFragmentCompat$1(ListPreferenceDialogFragmentCompat)>
	//   12   22:invokevirtual   #147 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setSingleChoiceItems(CharSequence[], int, android.content.DialogInterface$OnClickListener)>
	//   13   25:pop             
		builder.setPositiveButton(((CharSequence) (null)), ((android.content.DialogInterface.OnClickListener) (null)));
	//   14   26:aload_1         
	//   15   27:aconst_null     
	//   16   28:aconst_null     
	//   17   29:invokevirtual   #151 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   18   32:pop             
	//   19   33:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method void PreferenceDialogFragmentCompat.onSaveInstanceState(Bundle)>
		bundle.putInt("ListPreferenceDialogFragment.index", mClickedDialogEntryIndex);
	//    3    5:aload_1         
	//    4    6:ldc1            #16  <String "ListPreferenceDialogFragment.index">
	//    5    8:aload_0         
	//    6    9:getfield        #30  <Field int mClickedDialogEntryIndex>
	//    7   12:invokevirtual   #159 <Method void Bundle.putInt(String, int)>
		putCharSequenceArray(bundle, "ListPreferenceDialogFragment.entries", mEntries);
	//    8   15:aload_1         
	//    9   16:ldc1            #10  <String "ListPreferenceDialogFragment.entries">
	//   10   18:aload_0         
	//   11   19:getfield        #118 <Field CharSequence[] mEntries>
	//   12   22:invokestatic    #161 <Method void putCharSequenceArray(Bundle, String, CharSequence[])>
		putCharSequenceArray(bundle, "ListPreferenceDialogFragment.entryValues", mEntryValues);
	//   13   25:aload_1         
	//   14   26:ldc1            #13  <String "ListPreferenceDialogFragment.entryValues">
	//   15   28:aload_0         
	//   16   29:getfield        #120 <Field CharSequence[] mEntryValues>
	//   17   32:invokestatic    #161 <Method void putCharSequenceArray(Bundle, String, CharSequence[])>
	//   18   35:return          
	}

	private static final String SAVE_STATE_ENTRIES = "ListPreferenceDialogFragment.entries";
	private static final String SAVE_STATE_ENTRY_VALUES = "ListPreferenceDialogFragment.entryValues";
	private static final String SAVE_STATE_INDEX = "ListPreferenceDialogFragment.index";
	private int mClickedDialogEntryIndex;
	private CharSequence mEntries[];
	private CharSequence mEntryValues[];


/*
	static int access$002(ListPreferenceDialogFragmentCompat listpreferencedialogfragmentcompat, int i)
	{
		listpreferencedialogfragmentcompat.mClickedDialogEntryIndex = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mClickedDialogEntryIndex>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/
}
