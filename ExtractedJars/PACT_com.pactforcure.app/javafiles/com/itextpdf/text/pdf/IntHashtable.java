// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.*;

public class IntHashtable
	implements Cloneable
{
	static class Entry
	{

		protected Object clone()
		{
			int i = hash;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field int hash>
		//    2    4:istore_1        
			int j = key;
		//    3    5:aload_0         
		//    4    6:getfield        #22  <Field int key>
		//    5    9:istore_2        
			int k = value;
		//    6   10:aload_0         
		//    7   11:getfield        #24  <Field int value>
		//    8   14:istore_3        
			Entry entry;
			if(next != null)
		//*   9   15:aload_0         
		//*  10   16:getfield        #26  <Field IntHashtable$Entry next>
		//*  11   19:ifnull          47
				entry = (Entry)next.clone();
		//   12   22:aload_0         
		//   13   23:getfield        #26  <Field IntHashtable$Entry next>
		//   14   26:invokevirtual   #31  <Method Object clone()>
		//   15   29:checkcast       #2   <Class IntHashtable$Entry>
		//   16   32:astore          4
			else
		//*  17   34:new             #2   <Class IntHashtable$Entry>
		//*  18   37:dup             
		//*  19   38:iload_1         
		//*  20   39:iload_2         
		//*  21   40:iload_3         
		//*  22   41:aload           4
		//*  23   43:invokespecial   #33  <Method void IntHashtable$Entry(int, int, int, IntHashtable$Entry)>
		//*  24   46:areturn         
				entry = null;
		//   25   47:aconst_null     
		//   26   48:astore          4
			return ((Object) (new Entry(i, j, k, entry)));
		//*  27   50:goto            34
		}

		public int getKey()
		{
			return key;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int key>
		//    2    4:ireturn         
		}

		public int getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int value>
		//    2    4:ireturn         
		}

		int hash;
		int key;
		Entry next;
		int value;

		protected Entry(int i, int j, int k, Entry entry)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			hash = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int hash>
			key = j;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int key>
			value = k;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int value>
			next = entry;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #26  <Field IntHashtable$Entry next>
		//   14   25:return          
		}
	}

	static class IntHashtableIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			if(entry != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field IntHashtable$Entry entry>
		//*   2    4:ifnull          9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			do
			{
				int i = index;
		//    5    9:aload_0         
		//    6   10:getfield        #25  <Field int index>
		//    7   13:istore_1        
				index = i - 1;
		//    8   14:aload_0         
		//    9   15:iload_1         
		//   10   16:iconst_1        
		//   11   17:isub            
		//   12   18:putfield        #25  <Field int index>
				if(i > 0)
		//*  13   21:iload_1         
		//*  14   22:ifle            46
				{
					Entry entry1 = table[index];
		//   15   25:aload_0         
		//   16   26:getfield        #23  <Field IntHashtable$Entry[] table>
		//   17   29:aload_0         
		//   18   30:getfield        #25  <Field int index>
		//   19   33:aaload          
		//   20   34:astore_2        
					entry = entry1;
		//   21   35:aload_0         
		//   22   36:aload_2         
		//   23   37:putfield        #30  <Field IntHashtable$Entry entry>
					if(entry1 != null)
		//*  24   40:aload_2         
		//*  25   41:ifnull          9
						return true;
		//   26   44:iconst_1        
		//   27   45:ireturn         
				} else
				{
					return false;
		//   28   46:iconst_0        
		//   29   47:ireturn         
				}
			} while(true);
		}

		public Entry next()
		{
			Entry entry1;
			if(entry == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field IntHashtable$Entry entry>
		//*   2    4:ifnonnull       42
				do
				{
					int i = index;
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field int index>
		//    5   11:istore_1        
					index = i - 1;
		//    6   12:aload_0         
		//    7   13:iload_1         
		//    8   14:iconst_1        
		//    9   15:isub            
		//   10   16:putfield        #25  <Field int index>
					if(i <= 0)
						break;
		//   11   19:iload_1         
		//   12   20:ifle            42
					entry1 = table[index];
		//   13   23:aload_0         
		//   14   24:getfield        #23  <Field IntHashtable$Entry[] table>
		//   15   27:aload_0         
		//   16   28:getfield        #25  <Field int index>
		//   17   31:aaload          
		//   18   32:astore_2        
					entry = entry1;
		//   19   33:aload_0         
		//   20   34:aload_2         
		//   21   35:putfield        #30  <Field IntHashtable$Entry entry>
				} while(entry1 == null);
		//   22   38:aload_2         
		//   23   39:ifnull          7
			if(entry != null)
		//*  24   42:aload_0         
		//*  25   43:getfield        #30  <Field IntHashtable$Entry entry>
		//*  26   46:ifnull          64
			{
				Entry entry2 = entry;
		//   27   49:aload_0         
		//   28   50:getfield        #30  <Field IntHashtable$Entry entry>
		//   29   53:astore_2        
				entry = entry2.next;
		//   30   54:aload_0         
		//   31   55:aload_2         
		//   32   56:getfield        #36  <Field IntHashtable$Entry IntHashtable$Entry.next>
		//   33   59:putfield        #30  <Field IntHashtable$Entry entry>
				return entry2;
		//   34   62:aload_2         
		//   35   63:areturn         
			} else
			{
				throw new NoSuchElementException(MessageLocalization.getComposedMessage("inthashtableiterator", new Object[0]));
		//   36   64:new             #38  <Class NoSuchElementException>
		//   37   67:dup             
		//   38   68:ldc1            #40  <String "inthashtableiterator">
		//   39   70:iconst_0        
		//   40   71:anewarray       Object[]
		//   41   74:invokestatic    #46  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//   42   77:invokespecial   #49  <Method void NoSuchElementException(String)>
		//   43   80:athrow          
			}
		}

		public volatile Object next()
		{
			return ((Object) (next()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #52  <Method IntHashtable$Entry next()>
		//    2    4:areturn         
		}

		public void remove()
		{
			throw new UnsupportedOperationException(MessageLocalization.getComposedMessage("remove.not.supported", new Object[0]));
		//    0    0:new             #55  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:ldc1            #57  <String "remove.not.supported">
		//    3    6:iconst_0        
		//    4    7:anewarray       Object[]
		//    5   10:invokestatic    #46  <Method String MessageLocalization.getComposedMessage(String, Object[])>
		//    6   13:invokespecial   #58  <Method void UnsupportedOperationException(String)>
		//    7   16:athrow          
		}

		Entry entry;
		int index;
		Entry table[];

		IntHashtableIterator(Entry aentry[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			table = aentry;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field IntHashtable$Entry[] table>
			index = aentry.length;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:arraylength     
		//    8   12:putfield        #25  <Field int index>
		//    9   15:return          
		}
	}


	public IntHashtable()
	{
		this(150, 0.75F);
	//    0    0:aload_0         
	//    1    1:sipush          150
	//    2    4:ldc1            #22  <Float 0.75F>
	//    3    6:invokespecial   #25  <Method void IntHashtable(int, float)>
	//    4    9:return          
	}

	public IntHashtable(int i)
	{
		this(i, 0.75F);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #22  <Float 0.75F>
	//    3    4:invokespecial   #25  <Method void IntHashtable(int, float)>
	//    4    7:return          
	}

	public IntHashtable(int i, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		if(i < 0)
	//*   2    4:iload_1         
	//*   3    5:ifge            22
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.capacity.1", i));
	//    4    8:new             #31  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #33  <String "illegal.capacity.1">
	//    7   14:iload_1         
	//    8   15:invokestatic    #39  <Method String MessageLocalization.getComposedMessage(String, int)>
	//    9   18:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   10   21:athrow          
		if(f <= 0.0F)
	//*  11   22:fload_2         
	//*  12   23:fconst_0        
	//*  13   24:fcmpg           
	//*  14   25:ifgt            52
			throw new IllegalArgumentException(MessageLocalization.getComposedMessage("illegal.load.1", new Object[] {
				String.valueOf(f)
			}));
	//   15   28:new             #31  <Class IllegalArgumentException>
	//   16   31:dup             
	//   17   32:ldc1            #44  <String "illegal.load.1">
	//   18   34:iconst_1        
	//   19   35:anewarray       Object[]
	//   20   38:dup             
	//   21   39:iconst_0        
	//   22   40:fload_2         
	//   23   41:invokestatic    #50  <Method String String.valueOf(float)>
	//   24   44:aastore         
	//   25   45:invokestatic    #53  <Method String MessageLocalization.getComposedMessage(String, Object[])>
	//   26   48:invokespecial   #42  <Method void IllegalArgumentException(String)>
	//   27   51:athrow          
		int j = i;
	//   28   52:iload_1         
	//   29   53:istore_3        
		if(i == 0)
	//*  30   54:iload_1         
	//*  31   55:ifne            60
			j = 1;
	//   32   58:iconst_1        
	//   33   59:istore_3        
		loadFactor = f;
	//   34   60:aload_0         
	//   35   61:fload_2         
	//   36   62:putfield        #55  <Field float loadFactor>
		table = new Entry[j];
	//   37   65:aload_0         
	//   38   66:iload_3         
	//   39   67:anewarray       Entry[]
	//   40   70:putfield        #57  <Field IntHashtable$Entry[] table>
		threshold = (int)((float)j * f);
	//   41   73:aload_0         
	//   42   74:iload_3         
	//   43   75:i2f             
	//   44   76:fload_2         
	//   45   77:fmul            
	//   46   78:f2i             
	//   47   79:putfield        #59  <Field int threshold>
	//   48   82:return          
	}

	public void clear()
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:astore_2        
		int i = aentry.length;
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:istore_1        
		do
		{
			i--;
	//    6    8:iload_1         
	//    7    9:iconst_1        
	//    8   10:isub            
	//    9   11:istore_1        
			if(i >= 0)
	//*  10   12:iload_1         
	//*  11   13:iflt            23
			{
				aentry[i] = null;
	//   12   16:aload_2         
	//   13   17:iload_1         
	//   14   18:aconst_null     
	//   15   19:aastore         
			} else
	//*  16   20:goto            8
			{
				count = 0;
	//   17   23:aload_0         
	//   18   24:iconst_0        
	//   19   25:putfield        #62  <Field int count>
				return;
	//   20   28:return          
			}
		} while(true);
	}

	public Object clone()
	{
		int i;
		int j;
		Entry entry;
		IntHashtable inthashtable;
		Entry aentry[];
		try
		{
			inthashtable = (IntHashtable)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class IntHashtable>
	//    3    7:astore          4
			inthashtable.table = new Entry[table.length];
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field IntHashtable$Entry[] table>
	//    7   15:arraylength     
	//    8   16:anewarray       Entry[]
	//    9   19:putfield        #57  <Field IntHashtable$Entry[] table>
			i = table.length;
	//   10   22:aload_0         
	//   11   23:getfield        #57  <Field IntHashtable$Entry[] table>
	//   12   26:arraylength     
	//   13   27:istore_1        
		}
	//*  14   28:iload_1         
	//*  15   29:iconst_1        
	//*  16   30:isub            
	//*  17   31:istore_2        
	//*  18   32:iload_1         
	//*  19   33:ifle            89
	//*  20   36:aload           4
	//*  21   38:getfield        #57  <Field IntHashtable$Entry[] table>
	//*  22   41:astore          5
	//*  23   43:aload_0         
	//*  24   44:getfield        #57  <Field IntHashtable$Entry[] table>
	//*  25   47:iload_2         
	//*  26   48:aaload          
	//*  27   49:ifnull          75
	//*  28   52:aload_0         
	//*  29   53:getfield        #57  <Field IntHashtable$Entry[] table>
	//*  30   56:iload_2         
	//*  31   57:aaload          
	//*  32   58:invokevirtual   #69  <Method Object IntHashtable$Entry.clone()>
	//*  33   61:checkcast       #8   <Class IntHashtable$Entry>
	//*  34   64:astore_3        
	//*  35   65:aload           5
	//*  36   67:iload_2         
	//*  37   68:aload_3         
	//*  38   69:aastore         
	//*  39   70:iload_2         
	//*  40   71:istore_1        
	//*  41   72:goto            28
	//*  42   75:aconst_null     
	//*  43   76:astore_3        
	//*  44   77:goto            65
		catch(CloneNotSupportedException clonenotsupportedexception)
	//*  45   80:astore_3        
		{
			throw new InternalError();
	//   46   81:new             #71  <Class InternalError>
	//   47   84:dup             
	//   48   85:invokespecial   #72  <Method void InternalError()>
	//   49   88:athrow          
		}
_L7:
		j = i - 1;
		if(i <= 0) goto _L2; else goto _L1
_L1:
		aentry = inthashtable.table;
		if(table[j] == null) goto _L4; else goto _L3
_L3:
		entry = (Entry)table[j].clone();
_L5:
		aentry[j] = entry;
		i = j;
		continue; /* Loop/switch isn't completed */
_L4:
		entry = null;
		if(true) goto _L5; else goto _L2
_L2:
		return ((Object) (inthashtable));
	//   50   89:aload           4
	//   51   91:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public boolean contains(int i)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:astore          5
		int j = aentry.length;
	//    3    6:aload           5
	//    4    8:arraylength     
	//    5    9:istore_2        
		do
		{
			int k = j - 1;
	//    6   10:iload_2         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:istore_3        
			if(j > 0)
	//*  10   14:iload_2         
	//*  11   15:ifle            55
			{
				for(Entry entry = aentry[k]; entry != null; entry = entry.next)
	//*  12   18:aload           5
	//*  13   20:iload_3         
	//*  14   21:aaload          
	//*  15   22:astore          4
	//*  16   24:aload           4
	//*  17   26:ifnull          50
					if(entry.value == i)
	//*  18   29:aload           4
	//*  19   31:getfield        #77  <Field int IntHashtable$Entry.value>
	//*  20   34:iload_1         
	//*  21   35:icmpne          40
						return true;
	//   22   38:iconst_1        
	//   23   39:ireturn         

	//   24   40:aload           4
	//   25   42:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   26   45:astore          4
	//*  27   47:goto            24
				j = k;
	//   28   50:iload_3         
	//   29   51:istore_2        
			} else
	//*  30   52:goto            10
			{
				return false;
	//   31   55:iconst_0        
	//   32   56:ireturn         
			}
		} while(true);
	}

	public boolean containsKey(int i)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:astore_2        
		for(Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.next)
	//*   3    5:aload_2         
	//*   4    6:ldc1            #83  <Int 0x7fffffff>
	//*   5    8:iload_1         
	//*   6    9:iand            
	//*   7   10:aload_2         
	//*   8   11:arraylength     
	//*   9   12:irem            
	//*  10   13:aaload          
	//*  11   14:astore_2        
	//*  12   15:aload_2         
	//*  13   16:ifnull          45
			if(entry.hash == i && entry.key == i)
	//*  14   19:aload_2         
	//*  15   20:getfield        #86  <Field int IntHashtable$Entry.hash>
	//*  16   23:iload_1         
	//*  17   24:icmpne          37
	//*  18   27:aload_2         
	//*  19   28:getfield        #89  <Field int IntHashtable$Entry.key>
	//*  20   31:iload_1         
	//*  21   32:icmpne          37
				return true;
	//   22   35:iconst_1        
	//   23   36:ireturn         

	//   24   37:aload_2         
	//   25   38:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   26   41:astore_2        
	//*  27   42:goto            15
		return false;
	//   28   45:iconst_0        
	//   29   46:ireturn         
	}

	public boolean containsValue(int i)
	{
		return contains(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #92  <Method boolean contains(int)>
	//    3    5:ireturn         
	}

	public int get(int i)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:astore_2        
		for(Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.next)
	//*   3    5:aload_2         
	//*   4    6:ldc1            #83  <Int 0x7fffffff>
	//*   5    8:iload_1         
	//*   6    9:iand            
	//*   7   10:aload_2         
	//*   8   11:arraylength     
	//*   9   12:irem            
	//*  10   13:aaload          
	//*  11   14:astore_2        
	//*  12   15:aload_2         
	//*  13   16:ifnull          48
			if(entry.hash == i && entry.key == i)
	//*  14   19:aload_2         
	//*  15   20:getfield        #86  <Field int IntHashtable$Entry.hash>
	//*  16   23:iload_1         
	//*  17   24:icmpne          40
	//*  18   27:aload_2         
	//*  19   28:getfield        #89  <Field int IntHashtable$Entry.key>
	//*  20   31:iload_1         
	//*  21   32:icmpne          40
				return entry.value;
	//   22   35:aload_2         
	//   23   36:getfield        #77  <Field int IntHashtable$Entry.value>
	//   24   39:ireturn         

	//   25   40:aload_2         
	//   26   41:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   27   44:astore_2        
	//*  28   45:goto            15
		return 0;
	//   29   48:iconst_0        
	//   30   49:ireturn         
	}

	public Iterator getEntryIterator()
	{
		return ((Iterator) (new IntHashtableIterator(table)));
	//    0    0:new             #11  <Class IntHashtable$IntHashtableIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field IntHashtable$Entry[] table>
	//    4    8:invokespecial   #99  <Method void IntHashtable$IntHashtableIterator(IntHashtable$Entry[])>
	//    5   11:areturn         
	}

	public int[] getKeys()
	{
		int ai[] = new int[count];
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int count>
	//    2    4:newarray        int[]
	//    3    6:astore          7
		int i = table.length;
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field IntHashtable$Entry[] table>
	//    6   12:arraylength     
	//    7   13:istore_1        
		Entry entry = null;
	//    8   14:aconst_null     
	//    9   15:astore          5
		int j = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
		do
		{
			Entry entry1 = entry;
	//   12   19:aload           5
	//   13   21:astore          6
			int k = i;
	//   14   23:iload_1         
	//   15   24:istore_3        
			if(entry == null)
	//*  16   25:aload           5
	//*  17   27:ifnonnull       73
				do
				{
					int l = i - 1;
	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:isub            
	//   21   33:istore          4
					entry1 = entry;
	//   22   35:aload           5
	//   23   37:astore          6
					k = l;
	//   24   39:iload           4
	//   25   41:istore_3        
					if(i <= 0)
						break;
	//   26   42:iload_1         
	//   27   43:ifle            73
					entry = table[l];
	//   28   46:aload_0         
	//   29   47:getfield        #57  <Field IntHashtable$Entry[] table>
	//   30   50:iload           4
	//   31   52:aaload          
	//   32   53:astore          5
					entry1 = entry;
	//   33   55:aload           5
	//   34   57:astore          6
					k = l;
	//   35   59:iload           4
	//   36   61:istore_3        
					if(entry != null)
						break;
	//   37   62:aload           5
	//   38   64:ifnonnull       73
					i = l;
	//   39   67:iload           4
	//   40   69:istore_1        
				} while(true);
	//   41   70:goto            30
			if(entry1 == null)
	//*  42   73:aload           6
	//*  43   75:ifnonnull       81
				return ai;
	//   44   78:aload           7
	//   45   80:areturn         
			entry = entry1.next;
	//   46   81:aload           6
	//   47   83:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   48   86:astore          5
			ai[j] = entry1.key;
	//   49   88:aload           7
	//   50   90:iload_2         
	//   51   91:aload           6
	//   52   93:getfield        #89  <Field int IntHashtable$Entry.key>
	//   53   96:iastore         
			j++;
	//   54   97:iload_2         
	//   55   98:iconst_1        
	//   56   99:iadd            
	//   57  100:istore_2        
			i = k;
	//   58  101:iload_3         
	//   59  102:istore_1        
		} while(true);
	//   60  103:goto            19
	}

	public int getOneKey()
	{
		if(count != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field int count>
	//*   2    4:ifne            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			int i = table.length;
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field IntHashtable$Entry[] table>
	//    7   13:arraylength     
	//    8   14:istore_1        
			Entry entry = null;
	//    9   15:aconst_null     
	//   10   16:astore_3        
			Entry entry1;
			do
			{
				int j = i - 1;
	//   11   17:iload_1         
	//   12   18:iconst_1        
	//   13   19:isub            
	//   14   20:istore_2        
				entry1 = entry;
	//   15   21:aload_3         
	//   16   22:astore          4
				if(i <= 0)
					break;
	//   17   24:iload_1         
	//   18   25:ifle            47
				entry = table[j];
	//   19   28:aload_0         
	//   20   29:getfield        #57  <Field IntHashtable$Entry[] table>
	//   21   32:iload_2         
	//   22   33:aaload          
	//   23   34:astore_3        
				entry1 = entry;
	//   24   35:aload_3         
	//   25   36:astore          4
				if(entry != null)
					break;
	//   26   38:aload_3         
	//   27   39:ifnonnull       47
				i = j;
	//   28   42:iload_2         
	//   29   43:istore_1        
			} while(true);
	//   30   44:goto            17
			if(entry1 != null)
	//*  31   47:aload           4
	//*  32   49:ifnull          7
				return entry1.key;
	//   33   52:aload           4
	//   34   54:getfield        #89  <Field int IntHashtable$Entry.key>
	//   35   57:ireturn         
		}
		return 0;
	}

	public boolean isEmpty()
	{
		return count == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int count>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public int put(int i, int j)
	{
		Entry aentry1[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:astore          5
		int k = (i & 0x7fffffff) % aentry1.length;
	//    3    6:iload_1         
	//    4    7:ldc1            #83  <Int 0x7fffffff>
	//    5    9:iand            
	//    6   10:aload           5
	//    7   12:arraylength     
	//    8   13:irem            
	//    9   14:istore_3        
		for(Entry entry = aentry1[k]; entry != null; entry = entry.next)
	//*  10   15:aload           5
	//*  11   17:iload_3         
	//*  12   18:aaload          
	//*  13   19:astore          4
	//*  14   21:aload           4
	//*  15   23:ifnull          68
			if(entry.hash == i && entry.key == i)
	//*  16   26:aload           4
	//*  17   28:getfield        #86  <Field int IntHashtable$Entry.hash>
	//*  18   31:iload_1         
	//*  19   32:icmpne          58
	//*  20   35:aload           4
	//*  21   37:getfield        #89  <Field int IntHashtable$Entry.key>
	//*  22   40:iload_1         
	//*  23   41:icmpne          58
			{
				i = entry.value;
	//   24   44:aload           4
	//   25   46:getfield        #77  <Field int IntHashtable$Entry.value>
	//   26   49:istore_1        
				entry.value = j;
	//   27   50:aload           4
	//   28   52:iload_2         
	//   29   53:putfield        #77  <Field int IntHashtable$Entry.value>
				return i;
	//   30   56:iload_1         
	//   31   57:ireturn         
			}

	//   32   58:aload           4
	//   33   60:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   34   63:astore          4
	//*  35   65:goto            21
		Entry aentry[] = aentry1;
	//   36   68:aload           5
	//   37   70:astore          4
		if(count >= threshold)
	//*  38   72:aload_0         
	//*  39   73:getfield        #62  <Field int count>
	//*  40   76:aload_0         
	//*  41   77:getfield        #59  <Field int threshold>
	//*  42   80:icmplt          102
		{
			rehash();
	//   43   83:aload_0         
	//   44   84:invokevirtual   #112 <Method void rehash()>
			aentry = table;
	//   45   87:aload_0         
	//   46   88:getfield        #57  <Field IntHashtable$Entry[] table>
	//   47   91:astore          4
			k = (i & 0x7fffffff) % aentry.length;
	//   48   93:iload_1         
	//   49   94:ldc1            #83  <Int 0x7fffffff>
	//   50   96:iand            
	//   51   97:aload           4
	//   52   99:arraylength     
	//   53  100:irem            
	//   54  101:istore_3        
		}
		aentry[k] = new Entry(i, i, j, aentry[k]);
	//   55  102:aload           4
	//   56  104:iload_3         
	//   57  105:new             #8   <Class IntHashtable$Entry>
	//   58  108:dup             
	//   59  109:iload_1         
	//   60  110:iload_1         
	//   61  111:iload_2         
	//   62  112:aload           4
	//   63  114:iload_3         
	//   64  115:aaload          
	//   65  116:invokespecial   #115 <Method void IntHashtable$Entry(int, int, int, IntHashtable$Entry)>
	//   66  119:aastore         
		count = count + 1;
	//   67  120:aload_0         
	//   68  121:aload_0         
	//   69  122:getfield        #62  <Field int count>
	//   70  125:iconst_1        
	//   71  126:iadd            
	//   72  127:putfield        #62  <Field int count>
		return 0;
	//   73  130:iconst_0        
	//   74  131:ireturn         
	}

	protected void rehash()
	{
		int i = table.length;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:arraylength     
	//    3    5:istore_1        
		Entry aentry[] = table;
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field IntHashtable$Entry[] table>
	//    6   10:astore          6
		int k = i * 2 + 1;
	//    7   12:iload_1         
	//    8   13:iconst_2        
	//    9   14:imul            
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:istore_3        
		Entry aentry1[] = new Entry[k];
	//   13   18:iload_3         
	//   14   19:anewarray       Entry[]
	//   15   22:astore          7
		threshold = (int)((float)k * loadFactor);
	//   16   24:aload_0         
	//   17   25:iload_3         
	//   18   26:i2f             
	//   19   27:aload_0         
	//   20   28:getfield        #55  <Field float loadFactor>
	//   21   31:fmul            
	//   22   32:f2i             
	//   23   33:putfield        #59  <Field int threshold>
		table = aentry1;
	//   24   36:aload_0         
	//   25   37:aload           7
	//   26   39:putfield        #57  <Field IntHashtable$Entry[] table>
		do
		{
			int j = i - 1;
	//   27   42:iload_1         
	//   28   43:iconst_1        
	//   29   44:isub            
	//   30   45:istore_2        
			if(i > 0)
	//*  31   46:iload_1         
	//*  32   47:ifle            106
			{
				Entry entry1;
				for(Entry entry = aentry[j]; entry != null; entry = entry1)
	//*  33   50:aload           6
	//*  34   52:iload_2         
	//*  35   53:aaload          
	//*  36   54:astore          4
	//*  37   56:aload           4
	//*  38   58:ifnull          101
				{
					entry1 = entry.next;
	//   39   61:aload           4
	//   40   63:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   41   66:astore          5
					i = (entry.hash & 0x7fffffff) % k;
	//   42   68:aload           4
	//   43   70:getfield        #86  <Field int IntHashtable$Entry.hash>
	//   44   73:ldc1            #83  <Int 0x7fffffff>
	//   45   75:iand            
	//   46   76:iload_3         
	//   47   77:irem            
	//   48   78:istore_1        
					entry.next = aentry1[i];
	//   49   79:aload           4
	//   50   81:aload           7
	//   51   83:iload_1         
	//   52   84:aaload          
	//   53   85:putfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
					aentry1[i] = entry;
	//   54   88:aload           7
	//   55   90:iload_1         
	//   56   91:aload           4
	//   57   93:aastore         
				}

	//   58   94:aload           5
	//   59   96:astore          4
	//*  60   98:goto            56
				i = j;
	//   61  101:iload_2         
	//   62  102:istore_1        
			} else
	//*  63  103:goto            42
			{
				return;
	//   64  106:return          
			}
		} while(true);
	}

	public int remove(int i)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field IntHashtable$Entry[] table>
	//    2    4:astore          5
		int j = (0x7fffffff & i) % aentry.length;
	//    3    6:ldc1            #83  <Int 0x7fffffff>
	//    4    8:iload_1         
	//    5    9:iand            
	//    6   10:aload           5
	//    7   12:arraylength     
	//    8   13:irem            
	//    9   14:istore_2        
		Entry entry = aentry[j];
	//   10   15:aload           5
	//   11   17:iload_2         
	//   12   18:aaload          
	//   13   19:astore_3        
		Entry entry1 = null;
	//   14   20:aconst_null     
	//   15   21:astore          4
		for(; entry != null; entry = entry.next)
	//*  16   23:aload_3         
	//*  17   24:ifnull          101
		{
			if(entry.hash == i && entry.key == i)
	//*  18   27:aload_3         
	//*  19   28:getfield        #86  <Field int IntHashtable$Entry.hash>
	//*  20   31:iload_1         
	//*  21   32:icmpne          90
	//*  22   35:aload_3         
	//*  23   36:getfield        #89  <Field int IntHashtable$Entry.key>
	//*  24   39:iload_1         
	//*  25   40:icmpne          90
			{
				if(entry1 != null)
	//*  26   43:aload           4
	//*  27   45:ifnull          79
					entry1.next = entry.next;
	//   28   48:aload           4
	//   29   50:aload_3         
	//   30   51:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   31   54:putfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
				else
	//*  32   57:aload_0         
	//*  33   58:aload_0         
	//*  34   59:getfield        #62  <Field int count>
	//*  35   62:iconst_1        
	//*  36   63:isub            
	//*  37   64:putfield        #62  <Field int count>
	//*  38   67:aload_3         
	//*  39   68:getfield        #77  <Field int IntHashtable$Entry.value>
	//*  40   71:istore_1        
	//*  41   72:aload_3         
	//*  42   73:iconst_0        
	//*  43   74:putfield        #77  <Field int IntHashtable$Entry.value>
	//*  44   77:iload_1         
	//*  45   78:ireturn         
					aentry[j] = entry.next;
	//   46   79:aload           5
	//   47   81:iload_2         
	//   48   82:aload_3         
	//   49   83:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   50   86:aastore         
				count = count - 1;
				i = entry.value;
				entry.value = 0;
				return i;
			}
	//*  51   87:goto            57
			entry1 = entry;
	//   52   90:aload_3         
	//   53   91:astore          4
		}

	//   54   93:aload_3         
	//   55   94:getfield        #81  <Field IntHashtable$Entry IntHashtable$Entry.next>
	//   56   97:astore_3        
	//*  57   98:goto            23
		return 0;
	//   58  101:iconst_0        
	//   59  102:ireturn         
	}

	public int size()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int count>
	//    2    4:ireturn         
	}

	public int[] toOrderedKeys()
	{
		int ai[] = getKeys();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #120 <Method int[] getKeys()>
	//    2    4:astore_1        
		Arrays.sort(ai);
	//    3    5:aload_1         
	//    4    6:invokestatic    #126 <Method void Arrays.sort(int[])>
		return ai;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	private transient int count;
	private float loadFactor;
	private transient Entry table[];
	private int threshold;
}
