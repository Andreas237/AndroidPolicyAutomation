// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import java.util.regex.Pattern;

public class TableLayoutBindingAdapter
{

	public TableLayoutBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private static SparseBooleanArray parseColumns(CharSequence charsequence)
	{
		SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
	//    0    0:new             #31  <Class SparseBooleanArray>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void SparseBooleanArray()>
	//    3    7:astore          4
		if(charsequence != null) goto _L2; else goto _L1
	//    4    9:aload_0         
	//    5   10:ifnonnull       16
_L1:
		return sparsebooleanarray;
	//    6   13:aload           4
	//    7   15:areturn         
_L2:
		int i;
		int j;
		charsequence = ((CharSequence) (sColumnPattern.split(charsequence)));
	//    8   16:getstatic       #21  <Field Pattern sColumnPattern>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #36  <Method String[] Pattern.split(CharSequence)>
	//   11   23:astore_0        
		j = charsequence.length;
	//   12   24:aload_0         
	//   13   25:arraylength     
	//   14   26:istore_2        
		i = 0;
	//   15   27:iconst_0        
	//   16   28:istore_1        
_L4:
		String s;
		if(i >= j)
			continue; /* Loop/switch isn't completed */
	//   17   29:iload_1         
	//   18   30:iload_2         
	//   19   31:icmpge          13
		s = ((String) (charsequence[i]));
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:aaload          
	//   23   37:astore          5
		int k = Integer.parseInt(s);
	//   24   39:aload           5
	//   25   41:invokestatic    #42  <Method int Integer.parseInt(String)>
	//   26   44:istore_3        
		if(k >= 0)
	//*  27   45:iload_3         
	//*  28   46:iflt            56
			try
			{
				sparsebooleanarray.put(k, true);
	//   29   49:aload           4
	//   30   51:iload_3         
	//   31   52:iconst_1        
	//   32   53:invokevirtual   #46  <Method void SparseBooleanArray.put(int, boolean)>
			}
	//*  33   56:iload_1         
	//*  34   57:iconst_1        
	//*  35   58:iadd            
	//*  36   59:istore_1        
	//*  37   60:goto            29
			catch(NumberFormatException numberformatexception) { }
	//   38   63:astore          5
		i++;
		if(true) goto _L4; else goto _L3
	//   39   65:goto            56
_L3:
		if(true) goto _L1; else goto _L5
_L5:
	}

	public static void setCollapseColumns(TableLayout tablelayout, CharSequence charsequence)
	{
		charsequence = ((CharSequence) (parseColumns(charsequence)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method SparseBooleanArray parseColumns(CharSequence)>
	//    2    4:astore_1        
		for(int i = 0; i < 20; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:bipush          20
	//*   7   10:icmpge          42
		{
			boolean flag = ((SparseBooleanArray) (charsequence)).get(i, false);
	//    8   13:aload_1         
	//    9   14:iload_2         
	//   10   15:iconst_0        
	//   11   16:invokevirtual   #57  <Method boolean SparseBooleanArray.get(int, boolean)>
	//   12   19:istore_3        
			if(flag != tablelayout.isColumnCollapsed(i))
	//*  13   20:iload_3         
	//*  14   21:aload_0         
	//*  15   22:iload_2         
	//*  16   23:invokevirtual   #63  <Method boolean TableLayout.isColumnCollapsed(int)>
	//*  17   26:icmpeq          35
				tablelayout.setColumnCollapsed(i, flag);
	//   18   29:aload_0         
	//   19   30:iload_2         
	//   20   31:iload_3         
	//   21   32:invokevirtual   #66  <Method void TableLayout.setColumnCollapsed(int, boolean)>
		}

	//   22   35:iload_2         
	//   23   36:iconst_1        
	//   24   37:iadd            
	//   25   38:istore_2        
	//*  26   39:goto            7
	//   27   42:return          
	}

	public static void setShrinkColumns(TableLayout tablelayout, CharSequence charsequence)
	{
		if(charsequence != null && charsequence.length() > 0 && charsequence.charAt(0) == '*')
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #75  <Method int CharSequence.length()>
	//*   4   10:ifle            31
	//*   5   13:aload_1         
	//*   6   14:iconst_0        
	//*   7   15:invokeinterface #79  <Method char CharSequence.charAt(int)>
	//*   8   20:bipush          42
	//*   9   22:icmpne          31
		{
			tablelayout.setShrinkAllColumns(true);
	//   10   25:aload_0         
	//   11   26:iconst_1        
	//   12   27:invokevirtual   #83  <Method void TableLayout.setShrinkAllColumns(boolean)>
		} else
	//*  13   30:return          
		{
			tablelayout.setShrinkAllColumns(false);
	//   14   31:aload_0         
	//   15   32:iconst_0        
	//   16   33:invokevirtual   #83  <Method void TableLayout.setShrinkAllColumns(boolean)>
			charsequence = ((CharSequence) (parseColumns(charsequence)));
	//   17   36:aload_1         
	//   18   37:invokestatic    #53  <Method SparseBooleanArray parseColumns(CharSequence)>
	//   19   40:astore_1        
			int j = ((SparseBooleanArray) (charsequence)).size();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #86  <Method int SparseBooleanArray.size()>
	//   22   45:istore_3        
			int i = 0;
	//   23   46:iconst_0        
	//   24   47:istore_2        
			while(i < j) 
	//*  25   48:iload_2         
	//*  26   49:iload_3         
	//*  27   50:icmpge          30
			{
				int k = ((SparseBooleanArray) (charsequence)).keyAt(i);
	//   28   53:aload_1         
	//   29   54:iload_2         
	//   30   55:invokevirtual   #90  <Method int SparseBooleanArray.keyAt(int)>
	//   31   58:istore          4
				boolean flag = ((SparseBooleanArray) (charsequence)).valueAt(i);
	//   32   60:aload_1         
	//   33   61:iload_2         
	//   34   62:invokevirtual   #93  <Method boolean SparseBooleanArray.valueAt(int)>
	//   35   65:istore          5
				if(flag)
	//*  36   67:iload           5
	//*  37   69:ifeq            80
					tablelayout.setColumnShrinkable(k, flag);
	//   38   72:aload_0         
	//   39   73:iload           4
	//   40   75:iload           5
	//   41   77:invokevirtual   #96  <Method void TableLayout.setColumnShrinkable(int, boolean)>
				i++;
	//   42   80:iload_2         
	//   43   81:iconst_1        
	//   44   82:iadd            
	//   45   83:istore_2        
			}
		}
	//*  46   84:goto            48
	}

	public static void setStretchColumns(TableLayout tablelayout, CharSequence charsequence)
	{
		if(charsequence != null && charsequence.length() > 0 && charsequence.charAt(0) == '*')
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #75  <Method int CharSequence.length()>
	//*   4   10:ifle            31
	//*   5   13:aload_1         
	//*   6   14:iconst_0        
	//*   7   15:invokeinterface #79  <Method char CharSequence.charAt(int)>
	//*   8   20:bipush          42
	//*   9   22:icmpne          31
		{
			tablelayout.setStretchAllColumns(true);
	//   10   25:aload_0         
	//   11   26:iconst_1        
	//   12   27:invokevirtual   #101 <Method void TableLayout.setStretchAllColumns(boolean)>
		} else
	//*  13   30:return          
		{
			tablelayout.setStretchAllColumns(false);
	//   14   31:aload_0         
	//   15   32:iconst_0        
	//   16   33:invokevirtual   #101 <Method void TableLayout.setStretchAllColumns(boolean)>
			charsequence = ((CharSequence) (parseColumns(charsequence)));
	//   17   36:aload_1         
	//   18   37:invokestatic    #53  <Method SparseBooleanArray parseColumns(CharSequence)>
	//   19   40:astore_1        
			int j = ((SparseBooleanArray) (charsequence)).size();
	//   20   41:aload_1         
	//   21   42:invokevirtual   #86  <Method int SparseBooleanArray.size()>
	//   22   45:istore_3        
			int i = 0;
	//   23   46:iconst_0        
	//   24   47:istore_2        
			while(i < j) 
	//*  25   48:iload_2         
	//*  26   49:iload_3         
	//*  27   50:icmpge          30
			{
				int k = ((SparseBooleanArray) (charsequence)).keyAt(i);
	//   28   53:aload_1         
	//   29   54:iload_2         
	//   30   55:invokevirtual   #90  <Method int SparseBooleanArray.keyAt(int)>
	//   31   58:istore          4
				boolean flag = ((SparseBooleanArray) (charsequence)).valueAt(i);
	//   32   60:aload_1         
	//   33   61:iload_2         
	//   34   62:invokevirtual   #93  <Method boolean SparseBooleanArray.valueAt(int)>
	//   35   65:istore          5
				if(flag)
	//*  36   67:iload           5
	//*  37   69:ifeq            80
					tablelayout.setColumnStretchable(k, flag);
	//   38   72:aload_0         
	//   39   73:iload           4
	//   40   75:iload           5
	//   41   77:invokevirtual   #104 <Method void TableLayout.setColumnStretchable(int, boolean)>
				i++;
	//   42   80:iload_2         
	//   43   81:iconst_1        
	//   44   82:iadd            
	//   45   83:istore_2        
			}
		}
	//*  46   84:goto            48
	}

	private static final int MAX_COLUMNS = 20;
	private static Pattern sColumnPattern = Pattern.compile("\\s*,\\s*");

	static 
	{
	//    0    0:ldc1            #13  <String "\\s*,\\s*">
	//    1    2:invokestatic    #19  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #21  <Field Pattern sColumnPattern>
	//*   3    8:return          
	}
}
