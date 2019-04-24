// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;

// Referenced classes of package android.support.v7.preference:
//			ListPreference, PreferenceViewHolder

public class DropDownPreference extends ListPreference
{

	public DropDownPreference(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void DropDownPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public DropDownPreference(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, R.attr.dropdownPreferenceStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #27  <Field int R$attr.dropdownPreferenceStyle>
	//    4    6:invokespecial   #30  <Method void DropDownPreference(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public DropDownPreference(Context context, AttributeSet attributeset, int i)
	{
		this(context, attributeset, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #33  <Method void DropDownPreference(Context, AttributeSet, int, int)>
	//    6    8:return          
	}

	public DropDownPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #34  <Method void ListPreference(Context, AttributeSet, int, int)>
		mItemSelectedListener = new android.widget.AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView adapterview, View view, int k, long l)
			{
				if(k >= 0)
			//*   0    0:iload_3         
			//*   1    1:iflt            52
				{
					adapterview = ((AdapterView) (getEntryValues()[k].toString()));
			//    2    4:aload_0         
			//    3    5:getfield        #14  <Field DropDownPreference this$0>
			//    4    8:invokevirtual   #24  <Method CharSequence[] DropDownPreference.getEntryValues()>
			//    5   11:iload_3         
			//    6   12:aaload          
			//    7   13:invokeinterface #30  <Method String CharSequence.toString()>
			//    8   18:astore_1        
					if(!((String) (adapterview)).equals(((Object) (getValue()))) && callChangeListener(((Object) (adapterview))))
			//*   9   19:aload_1         
			//*  10   20:aload_0         
			//*  11   21:getfield        #14  <Field DropDownPreference this$0>
			//*  12   24:invokevirtual   #33  <Method String DropDownPreference.getValue()>
			//*  13   27:invokevirtual   #39  <Method boolean String.equals(Object)>
			//*  14   30:ifne            52
			//*  15   33:aload_0         
			//*  16   34:getfield        #14  <Field DropDownPreference this$0>
			//*  17   37:aload_1         
			//*  18   38:invokevirtual   #42  <Method boolean DropDownPreference.callChangeListener(Object)>
			//*  19   41:ifeq            52
						setValue(((String) (adapterview)));
			//   20   44:aload_0         
			//   21   45:getfield        #14  <Field DropDownPreference this$0>
			//   22   48:aload_1         
			//   23   49:invokevirtual   #46  <Method void DropDownPreference.setValue(String)>
				}
			//   24   52:return          
			}

			public void onNothingSelected(AdapterView adapterview)
			{
			//    0    0:return          
			}

			final DropDownPreference this$0;

			
			{
				this$0 = DropDownPreference.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field DropDownPreference this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    6    9:aload_0         
	//    7   10:new             #6   <Class DropDownPreference$1>
	//    8   13:dup             
	//    9   14:aload_0         
	//   10   15:invokespecial   #37  <Method void DropDownPreference$1(DropDownPreference)>
	//   11   18:putfield        #39  <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
		mContext = context;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:putfield        #41  <Field Context mContext>
		mAdapter = createAdapter();
	//   15   26:aload_0         
	//   16   27:aload_0         
	//   17   28:invokevirtual   #45  <Method ArrayAdapter createAdapter()>
	//   18   31:putfield        #47  <Field ArrayAdapter mAdapter>
		updateEntries();
	//   19   34:aload_0         
	//   20   35:invokespecial   #51  <Method void updateEntries()>
	//   21   38:return          
	}

	private void updateEntries()
	{
		mAdapter.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayAdapter mAdapter>
	//    2    4:invokevirtual   #56  <Method void ArrayAdapter.clear()>
		if(getEntries() != null)
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #60  <Method CharSequence[] getEntries()>
	//*   5   11:ifnull          55
		{
			CharSequence acharsequence[] = getEntries();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #60  <Method CharSequence[] getEntries()>
	//    8   18:astore_3        
			int j = acharsequence.length;
	//    9   19:aload_3         
	//   10   20:arraylength     
	//   11   21:istore_2        
			for(int i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_1        
	//*  14   24:iload_1         
	//*  15   25:iload_2         
	//*  16   26:icmpge          55
			{
				CharSequence charsequence = acharsequence[i];
	//   17   29:aload_3         
	//   18   30:iload_1         
	//   19   31:aaload          
	//   20   32:astore          4
				mAdapter.add(((Object) (charsequence.toString())));
	//   21   34:aload_0         
	//   22   35:getfield        #47  <Field ArrayAdapter mAdapter>
	//   23   38:aload           4
	//   24   40:invokeinterface #66  <Method String CharSequence.toString()>
	//   25   45:invokevirtual   #70  <Method void ArrayAdapter.add(Object)>
			}

	//   26   48:iload_1         
	//   27   49:iconst_1        
	//   28   50:iadd            
	//   29   51:istore_1        
		}
	//*  30   52:goto            24
	//   31   55:return          
	}

	protected ArrayAdapter createAdapter()
	{
		return new ArrayAdapter(mContext, 0x1090009);
	//    0    0:new             #53  <Class ArrayAdapter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field Context mContext>
	//    4    8:ldc1            #71  <Int 0x1090009>
	//    5   10:invokespecial   #74  <Method void ArrayAdapter(Context, int)>
	//    6   13:areturn         
	}

	public int findSpinnerIndexOfValue(String s)
	{
		CharSequence acharsequence[] = getEntryValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method CharSequence[] getEntryValues()>
	//    2    4:astore_3        
		if(s != null && acharsequence != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          41
	//*   5    9:aload_3         
	//*   6   10:ifnull          41
		{
			for(int i = acharsequence.length - 1; i >= 0; i--)
	//*   7   13:aload_3         
	//*   8   14:arraylength     
	//*   9   15:iconst_1        
	//*  10   16:isub            
	//*  11   17:istore_2        
	//*  12   18:iload_2         
	//*  13   19:iflt            41
				if(((Object) (acharsequence[i])).equals(((Object) (s))))
	//*  14   22:aload_3         
	//*  15   23:iload_2         
	//*  16   24:aaload          
	//*  17   25:aload_1         
	//*  18   26:invokevirtual   #89  <Method boolean Object.equals(Object)>
	//*  19   29:ifeq            34
					return i;
	//   20   32:iload_2         
	//   21   33:ireturn         

	//   22   34:iload_2         
	//   23   35:iconst_1        
	//   24   36:isub            
	//   25   37:istore_2        
		}
	//*  26   38:goto            18
		return -1;
	//   27   41:iconst_m1       
	//   28   42:ireturn         
	}

	protected void notifyChanged()
	{
		super.notifyChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void ListPreference.notifyChanged()>
		mAdapter.notifyDataSetChanged();
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field ArrayAdapter mAdapter>
	//    4    8:invokevirtual   #96  <Method void ArrayAdapter.notifyDataSetChanged()>
	//    5   11:return          
	}

	public void onBindViewHolder(PreferenceViewHolder preferenceviewholder)
	{
		mSpinner = (Spinner)preferenceviewholder.itemView.findViewById(R.id.spinner);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #104 <Field View PreferenceViewHolder.itemView>
	//    3    5:getstatic       #109 <Field int R$id.spinner>
	//    4    8:invokevirtual   #115 <Method View View.findViewById(int)>
	//    5   11:checkcast       #117 <Class Spinner>
	//    6   14:putfield        #119 <Field Spinner mSpinner>
		mSpinner.setAdapter(((android.widget.SpinnerAdapter) (mAdapter)));
	//    7   17:aload_0         
	//    8   18:getfield        #119 <Field Spinner mSpinner>
	//    9   21:aload_0         
	//   10   22:getfield        #47  <Field ArrayAdapter mAdapter>
	//   11   25:invokevirtual   #123 <Method void Spinner.setAdapter(android.widget.SpinnerAdapter)>
		mSpinner.setOnItemSelectedListener(mItemSelectedListener);
	//   12   28:aload_0         
	//   13   29:getfield        #119 <Field Spinner mSpinner>
	//   14   32:aload_0         
	//   15   33:getfield        #39  <Field android.widget.AdapterView$OnItemSelectedListener mItemSelectedListener>
	//   16   36:invokevirtual   #127 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
		mSpinner.setSelection(findSpinnerIndexOfValue(getValue()));
	//   17   39:aload_0         
	//   18   40:getfield        #119 <Field Spinner mSpinner>
	//   19   43:aload_0         
	//   20   44:aload_0         
	//   21   45:invokevirtual   #130 <Method String getValue()>
	//   22   48:invokevirtual   #132 <Method int findSpinnerIndexOfValue(String)>
	//   23   51:invokevirtual   #136 <Method void Spinner.setSelection(int)>
		super.onBindViewHolder(preferenceviewholder);
	//   24   54:aload_0         
	//   25   55:aload_1         
	//   26   56:invokespecial   #138 <Method void ListPreference.onBindViewHolder(PreferenceViewHolder)>
	//   27   59:return          
	}

	protected void onClick()
	{
		mSpinner.performClick();
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field Spinner mSpinner>
	//    2    4:invokevirtual   #143 <Method boolean Spinner.performClick()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void setEntries(CharSequence acharsequence[])
	{
		super.setEntries(acharsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #148 <Method void ListPreference.setEntries(CharSequence[])>
		updateEntries();
	//    3    5:aload_0         
	//    4    6:invokespecial   #51  <Method void updateEntries()>
	//    5    9:return          
	}

	public void setValueIndex(int i)
	{
		setValue(getEntryValues()[i].toString());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #83  <Method CharSequence[] getEntryValues()>
	//    3    5:iload_1         
	//    4    6:aaload          
	//    5    7:invokeinterface #66  <Method String CharSequence.toString()>
	//    6   12:invokevirtual   #154 <Method void setValue(String)>
	//    7   15:return          
	}

	private final ArrayAdapter mAdapter;
	private final Context mContext;
	private final android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
	private Spinner mSpinner;
}
