// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.DialogInterface;
import android.preference.ListPreference;

public class ListPreferenceMultiSelect extends ListPreference
{

	private void a()
	{
		CharSequence acharsequence[];
		String as[];
		acharsequence = getEntryValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #13  <Method CharSequence[] getEntryValues()>
	//    2    4:astore_3        
		as = a(((CharSequence) (getValue())));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #17  <Method String getValue()>
	//    5    9:invokestatic    #20  <Method String[] a(CharSequence)>
	//    6   12:astore          4
		if(as == null) goto _L2; else goto _L1
	//    7   14:aload           4
	//    8   16:ifnull          77
_L1:
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
_L4:
		if(i < as.length)
	//*  11   21:iload_1         
	//*  12   22:aload           4
	//*  13   24:arraylength     
	//*  14   25:icmpge          77
		{
			String s = as[i].trim();
	//   15   28:aload           4
	//   16   30:iload_1         
	//   17   31:aaload          
	//   18   32:invokevirtual   #25  <Method String String.trim()>
	//   19   35:astore          5
			int j = 0;
	//   20   37:iconst_0        
	//   21   38:istore_2        
			do
			{
label0:
				{
					if(j < acharsequence.length)
	//*  22   39:iload_2         
	//*  23   40:aload_3         
	//*  24   41:arraylength     
	//*  25   42:icmpge          63
					{
						if(!((Object) (acharsequence[j])).equals(((Object) (s))))
							break label0;
	//   26   45:aload_3         
	//   27   46:iload_2         
	//   28   47:aaload          
	//   29   48:aload           5
	//   30   50:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//   31   53:ifeq            70
						a[j] = true;
	//   32   56:aload_0         
	//   33   57:getfield        #33  <Field boolean[] a>
	//   34   60:iload_2         
	//   35   61:iconst_1        
	//   36   62:bastore         
					}
					i++;
	//   37   63:iload_1         
	//   38   64:iconst_1        
	//   39   65:iadd            
	//   40   66:istore_1        
					continue; /* Loop/switch isn't completed */
	//   41   67:goto            21
				}
				j++;
	//   42   70:iload_2         
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:istore_2        
			} while(true);
	//   46   74:goto            39
		}
_L2:
		return;
	//   47   77:return          
		if(true) goto _L4; else goto _L3
_L3:
	}

	public static String[] a(CharSequence charsequence)
	{
		if("".equals(((Object) (charsequence))))
	//*   0    0:ldc1            #36  <String "">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #37  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            11
			return null;
	//    4    9:aconst_null     
	//    5   10:areturn         
		else
			return ((String)charsequence).split(":");
	//    6   11:aload_0         
	//    7   12:checkcast       #22  <Class String>
	//    8   15:ldc1            #39  <String ":">
	//    9   17:invokevirtual   #43  <Method String[] String.split(String)>
	//   10   20:areturn         
	}

	static boolean[] a(ListPreferenceMultiSelect listpreferencemultiselect)
	{
		return listpreferencemultiselect.a;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean[] a>
	//    2    4:areturn         
	}

	protected void onDialogClosed(boolean flag)
	{
		CharSequence acharsequence[] = getEntryValues();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #13  <Method CharSequence[] getEntryValues()>
	//    2    4:astore_3        
		if(flag && acharsequence != null)
	//*   3    5:iload_1         
	//*   4    6:ifeq            110
	//*   5    9:aload_3         
	//*   6   10:ifnull          110
		{
			Object obj = ((Object) (new StringBuffer()));
	//    7   13:new             #48  <Class StringBuffer>
	//    8   16:dup             
	//    9   17:invokespecial   #51  <Method void StringBuffer()>
	//   10   20:astore          4
			for(int i = 0; i < acharsequence.length; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore_2        
	//*  13   24:iload_2         
	//*  14   25:aload_3         
	//*  15   26:arraylength     
	//*  16   27:icmpge          60
				if(a[i])
	//*  17   30:aload_0         
	//*  18   31:getfield        #33  <Field boolean[] a>
	//*  19   34:iload_2         
	//*  20   35:baload          
	//*  21   36:ifeq            53
					((StringBuffer) (obj)).append(acharsequence[i]).append(":");
	//   22   39:aload           4
	//   23   41:aload_3         
	//   24   42:iload_2         
	//   25   43:aaload          
	//   26   44:invokevirtual   #55  <Method StringBuffer StringBuffer.append(CharSequence)>
	//   27   47:ldc1            #39  <String ":">
	//   28   49:invokevirtual   #58  <Method StringBuffer StringBuffer.append(String)>
	//   29   52:pop             

	//   30   53:iload_2         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:istore_2        
	//*  34   57:goto            24
			if(callChangeListener(obj))
	//*  35   60:aload_0         
	//*  36   61:aload           4
	//*  37   63:invokevirtual   #61  <Method boolean callChangeListener(Object)>
	//*  38   66:ifeq            110
			{
				obj = ((Object) (((StringBuffer) (obj)).toString()));
	//   39   69:aload           4
	//   40   71:invokevirtual   #64  <Method String StringBuffer.toString()>
	//   41   74:astore          4
				String s = ((String) (obj));
	//   42   76:aload           4
	//   43   78:astore_3        
				if(((String) (obj)).length() > 0)
	//*  44   79:aload           4
	//*  45   81:invokevirtual   #68  <Method int String.length()>
	//*  46   84:ifle            105
					s = ((String) (obj)).substring(0, ((String) (obj)).length() - ":".length());
	//   47   87:aload           4
	//   48   89:iconst_0        
	//   49   90:aload           4
	//   50   92:invokevirtual   #68  <Method int String.length()>
	//   51   95:ldc1            #39  <String ":">
	//   52   97:invokevirtual   #68  <Method int String.length()>
	//   53  100:isub            
	//   54  101:invokevirtual   #72  <Method String String.substring(int, int)>
	//   55  104:astore_3        
				setValue(s);
	//   56  105:aload_0         
	//   57  106:aload_3         
	//   58  107:invokevirtual   #76  <Method void setValue(String)>
			}
		}
	//   59  110:return          
	}

	protected void onPrepareDialogBuilder(android.app.AlertDialog.Builder builder)
	{
		CharSequence acharsequence[] = getEntries();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method CharSequence[] getEntries()>
	//    2    4:astore_2        
		CharSequence acharsequence1[] = getEntryValues();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #13  <Method CharSequence[] getEntryValues()>
	//    5    9:astore_3        
		if(acharsequence == null || acharsequence1 == null || acharsequence.length != acharsequence1.length)
	//*   6   10:aload_2         
	//*   7   11:ifnull          25
	//*   8   14:aload_3         
	//*   9   15:ifnull          25
	//*  10   18:aload_2         
	//*  11   19:arraylength     
	//*  12   20:aload_3         
	//*  13   21:arraylength     
	//*  14   22:icmpeq          35
		{
			throw new IllegalStateException("ListPreference requires an entries array and an entryValues array which are both the same length");
	//   15   25:new             #83  <Class IllegalStateException>
	//   16   28:dup             
	//   17   29:ldc1            #85  <String "ListPreference requires an entries array and an entryValues array which are both the same length">
	//   18   31:invokespecial   #87  <Method void IllegalStateException(String)>
	//   19   34:athrow          
		} else
		{
			a();
	//   20   35:aload_0         
	//   21   36:invokespecial   #89  <Method void a()>
			builder.setMultiChoiceItems(acharsequence, a, new android.content.DialogInterface.OnMultiChoiceClickListener() {

				public void onClick(DialogInterface dialoginterface, int i, boolean flag)
				{
					ListPreferenceMultiSelect.a(a)[i] = flag;
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ListPreferenceMultiSelect a>
				//    2    4:invokestatic    #26  <Method boolean[] ListPreferenceMultiSelect.a(ListPreferenceMultiSelect)>
				//    3    7:iload_2         
				//    4    8:iload_3         
				//    5    9:bastore         
				//    6   10:return          
				}

				final ListPreferenceMultiSelect a;

			
			{
				a = ListPreferenceMultiSelect.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ListPreferenceMultiSelect a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   22   39:aload_1         
	//   23   40:aload_2         
	//   24   41:aload_0         
	//   25   42:getfield        #33  <Field boolean[] a>
	//   26   45:new             #6   <Class ListPreferenceMultiSelect$1>
	//   27   48:dup             
	//   28   49:aload_0         
	//   29   50:invokespecial   #92  <Method void ListPreferenceMultiSelect$1(ListPreferenceMultiSelect)>
	//   30   53:invokevirtual   #98  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMultiChoiceItems(CharSequence[], boolean[], android.content.DialogInterface$OnMultiChoiceClickListener)>
	//   31   56:pop             
			return;
	//   32   57:return          
		}
	}

	public void setEntries(CharSequence acharsequence[])
	{
		super.setEntries(acharsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #102 <Method void ListPreference.setEntries(CharSequence[])>
		a = new boolean[acharsequence.length];
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:newarray        boolean[]
	//    7   10:putfield        #33  <Field boolean[] a>
	//    8   13:return          
	}

	private boolean a[];
}
