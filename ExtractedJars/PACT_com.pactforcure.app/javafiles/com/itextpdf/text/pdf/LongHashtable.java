// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.error_messages.MessageLocalization;
import java.util.*;

public class LongHashtable
	implements Cloneable
{
	static class Entry
	{

		protected Object clone()
		{
			int i = hash;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field int hash>
		//    2    4:istore_1        
			long l = key;
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field long key>
		//    5    9:lstore_2        
			long l1 = value;
		//    6   10:aload_0         
		//    7   11:getfield        #25  <Field long value>
		//    8   14:lstore          4
			Entry entry;
			if(next != null)
		//*   9   16:aload_0         
		//*  10   17:getfield        #27  <Field LongHashtable$Entry next>
		//*  11   20:ifnull          49
				entry = (Entry)next.clone();
		//   12   23:aload_0         
		//   13   24:getfield        #27  <Field LongHashtable$Entry next>
		//   14   27:invokevirtual   #32  <Method Object clone()>
		//   15   30:checkcast       #2   <Class LongHashtable$Entry>
		//   16   33:astore          6
			else
		//*  17   35:new             #2   <Class LongHashtable$Entry>
		//*  18   38:dup             
		//*  19   39:iload_1         
		//*  20   40:lload_2         
		//*  21   41:lload           4
		//*  22   43:aload           6
		//*  23   45:invokespecial   #34  <Method void LongHashtable$Entry(int, long, long, LongHashtable$Entry)>
		//*  24   48:areturn         
				entry = null;
		//   25   49:aconst_null     
		//   26   50:astore          6
			return ((Object) (new Entry(i, l, l1, entry)));
		//*  27   52:goto            35
		}

		public long getKey()
		{
			return key;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field long key>
		//    2    4:lreturn         
		}

		public long getValue()
		{
			return value;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field long value>
		//    2    4:lreturn         
		}

		int hash;
		long key;
		Entry next;
		long value;

		protected Entry(int i, long l, long l1, Entry entry)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			hash = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int hash>
			key = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #23  <Field long key>
			value = l1;
		//    8   14:aload_0         
		//    9   15:lload           4
		//   10   17:putfield        #25  <Field long value>
			next = entry;
		//   11   20:aload_0         
		//   12   21:aload           6
		//   13   23:putfield        #27  <Field LongHashtable$Entry next>
		//   14   26:return          
		}
	}

	static class LongHashtableIterator
		implements Iterator
	{

		public boolean hasNext()
		{
			if(entry != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field LongHashtable$Entry entry>
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
		//   16   26:getfield        #23  <Field LongHashtable$Entry[] table>
		//   17   29:aload_0         
		//   18   30:getfield        #25  <Field int index>
		//   19   33:aaload          
		//   20   34:astore_2        
					entry = entry1;
		//   21   35:aload_0         
		//   22   36:aload_2         
		//   23   37:putfield        #30  <Field LongHashtable$Entry entry>
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
		//*   1    1:getfield        #30  <Field LongHashtable$Entry entry>
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
		//   14   24:getfield        #23  <Field LongHashtable$Entry[] table>
		//   15   27:aload_0         
		//   16   28:getfield        #25  <Field int index>
		//   17   31:aaload          
		//   18   32:astore_2        
					entry = entry1;
		//   19   33:aload_0         
		//   20   34:aload_2         
		//   21   35:putfield        #30  <Field LongHashtable$Entry entry>
				} while(entry1 == null);
		//   22   38:aload_2         
		//   23   39:ifnull          7
			if(entry != null)
		//*  24   42:aload_0         
		//*  25   43:getfield        #30  <Field LongHashtable$Entry entry>
		//*  26   46:ifnull          64
			{
				Entry entry2 = entry;
		//   27   49:aload_0         
		//   28   50:getfield        #30  <Field LongHashtable$Entry entry>
		//   29   53:astore_2        
				entry = entry2.next;
		//   30   54:aload_0         
		//   31   55:aload_2         
		//   32   56:getfield        #36  <Field LongHashtable$Entry LongHashtable$Entry.next>
		//   33   59:putfield        #30  <Field LongHashtable$Entry entry>
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
		//    1    1:invokevirtual   #52  <Method LongHashtable$Entry next()>
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

		LongHashtableIterator(Entry aentry[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			table = aentry;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field LongHashtable$Entry[] table>
			index = aentry.length;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:arraylength     
		//    8   12:putfield        #25  <Field int index>
		//    9   15:return          
		}
	}


	public LongHashtable()
	{
		this(150, 0.75F);
	//    0    0:aload_0         
	//    1    1:sipush          150
	//    2    4:ldc1            #22  <Float 0.75F>
	//    3    6:invokespecial   #25  <Method void LongHashtable(int, float)>
	//    4    9:return          
	}

	public LongHashtable(int i)
	{
		this(i, 0.75F);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #22  <Float 0.75F>
	//    3    4:invokespecial   #25  <Method void LongHashtable(int, float)>
	//    4    7:return          
	}

	public LongHashtable(int i, float f)
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
	//   40   70:putfield        #57  <Field LongHashtable$Entry[] table>
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
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
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
		LongHashtable longhashtable;
		Entry aentry[];
		try
		{
			longhashtable = (LongHashtable)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class LongHashtable>
	//    3    7:astore          4
			longhashtable.table = new Entry[table.length];
	//    4    9:aload           4
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field LongHashtable$Entry[] table>
	//    7   15:arraylength     
	//    8   16:anewarray       Entry[]
	//    9   19:putfield        #57  <Field LongHashtable$Entry[] table>
			i = table.length;
	//   10   22:aload_0         
	//   11   23:getfield        #57  <Field LongHashtable$Entry[] table>
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
	//*  21   38:getfield        #57  <Field LongHashtable$Entry[] table>
	//*  22   41:astore          5
	//*  23   43:aload_0         
	//*  24   44:getfield        #57  <Field LongHashtable$Entry[] table>
	//*  25   47:iload_2         
	//*  26   48:aaload          
	//*  27   49:ifnull          75
	//*  28   52:aload_0         
	//*  29   53:getfield        #57  <Field LongHashtable$Entry[] table>
	//*  30   56:iload_2         
	//*  31   57:aaload          
	//*  32   58:invokevirtual   #69  <Method Object LongHashtable$Entry.clone()>
	//*  33   61:checkcast       #8   <Class LongHashtable$Entry>
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
		aentry = longhashtable.table;
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
		return ((Object) (longhashtable));
	//   50   89:aload           4
	//   51   91:areturn         
		if(true) goto _L7; else goto _L6
_L6:
	}

	public boolean contains(long l)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
	//    2    4:astore          6
		int i = aentry.length;
	//    3    6:aload           6
	//    4    8:arraylength     
	//    5    9:istore_3        
		do
		{
			int j = i - 1;
	//    6   10:iload_3         
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:istore          4
			if(i > 0)
	//*  10   15:iload_3         
	//*  11   16:ifle            59
			{
				for(Entry entry = aentry[j]; entry != null; entry = entry.next)
	//*  12   19:aload           6
	//*  13   21:iload           4
	//*  14   23:aaload          
	//*  15   24:astore          5
	//*  16   26:aload           5
	//*  17   28:ifnull          53
					if(entry.value == l)
	//*  18   31:aload           5
	//*  19   33:getfield        #78  <Field long LongHashtable$Entry.value>
	//*  20   36:lload_1         
	//*  21   37:lcmp            
	//*  22   38:ifne            43
						return true;
	//   23   41:iconst_1        
	//   24   42:ireturn         

	//   25   43:aload           5
	//   26   45:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   27   48:astore          5
	//*  28   50:goto            26
				i = j;
	//   29   53:iload           4
	//   30   55:istore_3        
			} else
	//*  31   56:goto            10
			{
				return false;
	//   32   59:iconst_0        
	//   33   60:ireturn         
			}
		} while(true);
	}

	public boolean containsKey(long l)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
	//    2    4:astore          4
		int i = (int)(l >>> 32 ^ l);
	//    3    6:lload_1         
	//    4    7:bipush          32
	//    5    9:lushr           
	//    6   10:lload_1         
	//    7   11:lxor            
	//    8   12:l2i             
	//    9   13:istore_3        
		for(Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.next)
	//*  10   14:aload           4
	//*  11   16:ldc1            #84  <Int 0x7fffffff>
	//*  12   18:iload_3         
	//*  13   19:iand            
	//*  14   20:aload           4
	//*  15   22:arraylength     
	//*  16   23:irem            
	//*  17   24:aaload          
	//*  18   25:astore          4
	//*  19   27:aload           4
	//*  20   29:ifnull          63
			if(entry.hash == i && entry.key == l)
	//*  21   32:aload           4
	//*  22   34:getfield        #87  <Field int LongHashtable$Entry.hash>
	//*  23   37:iload_3         
	//*  24   38:icmpne          53
	//*  25   41:aload           4
	//*  26   43:getfield        #90  <Field long LongHashtable$Entry.key>
	//*  27   46:lload_1         
	//*  28   47:lcmp            
	//*  29   48:ifne            53
				return true;
	//   30   51:iconst_1        
	//   31   52:ireturn         

	//   32   53:aload           4
	//   33   55:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   34   58:astore          4
	//*  35   60:goto            27
		return false;
	//   36   63:iconst_0        
	//   37   64:ireturn         
	}

	public boolean containsValue(long l)
	{
		return contains(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #93  <Method boolean contains(long)>
	//    3    5:ireturn         
	}

	public long get(long l)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
	//    2    4:astore          4
		int i = (int)(l >>> 32 ^ l);
	//    3    6:lload_1         
	//    4    7:bipush          32
	//    5    9:lushr           
	//    6   10:lload_1         
	//    7   11:lxor            
	//    8   12:l2i             
	//    9   13:istore_3        
		for(Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.next)
	//*  10   14:aload           4
	//*  11   16:ldc1            #84  <Int 0x7fffffff>
	//*  12   18:iload_3         
	//*  13   19:iand            
	//*  14   20:aload           4
	//*  15   22:arraylength     
	//*  16   23:irem            
	//*  17   24:aaload          
	//*  18   25:astore          4
	//*  19   27:aload           4
	//*  20   29:ifnull          67
			if(entry.hash == i && entry.key == l)
	//*  21   32:aload           4
	//*  22   34:getfield        #87  <Field int LongHashtable$Entry.hash>
	//*  23   37:iload_3         
	//*  24   38:icmpne          57
	//*  25   41:aload           4
	//*  26   43:getfield        #90  <Field long LongHashtable$Entry.key>
	//*  27   46:lload_1         
	//*  28   47:lcmp            
	//*  29   48:ifne            57
				return entry.value;
	//   30   51:aload           4
	//   31   53:getfield        #78  <Field long LongHashtable$Entry.value>
	//   32   56:lreturn         

	//   33   57:aload           4
	//   34   59:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   35   62:astore          4
	//*  36   64:goto            27
		return 0L;
	//   37   67:lconst_0        
	//   38   68:lreturn         
	}

	public Iterator getEntryIterator()
	{
		return ((Iterator) (new LongHashtableIterator(table)));
	//    0    0:new             #11  <Class LongHashtable$LongHashtableIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field LongHashtable$Entry[] table>
	//    4    8:invokespecial   #100 <Method void LongHashtable$LongHashtableIterator(LongHashtable$Entry[])>
	//    5   11:areturn         
	}

	public long[] getKeys()
	{
		long al[] = new long[count];
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int count>
	//    2    4:newarray        long[]
	//    3    6:astore          7
		int i = table.length;
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field LongHashtable$Entry[] table>
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
	//   29   47:getfield        #57  <Field LongHashtable$Entry[] table>
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
				return al;
	//   44   78:aload           7
	//   45   80:areturn         
			entry = entry1.next;
	//   46   81:aload           6
	//   47   83:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   48   86:astore          5
			al[j] = entry1.key;
	//   49   88:aload           7
	//   50   90:iload_2         
	//   51   91:aload           6
	//   52   93:getfield        #90  <Field long LongHashtable$Entry.key>
	//   53   96:lastore         
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

	public long getOneKey()
	{
		if(count != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field int count>
	//*   2    4:ifne            9
	//*   3    7:lconst_0        
	//*   4    8:lreturn         
		{
			int i = table.length;
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field LongHashtable$Entry[] table>
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
	//   20   29:getfield        #57  <Field LongHashtable$Entry[] table>
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
	//   34   54:getfield        #90  <Field long LongHashtable$Entry.key>
	//   35   57:lreturn         
		}
		return 0L;
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

	public long put(long l, long l1)
	{
		Entry aentry1[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
	//    2    4:astore          8
		int j = (int)(l >>> 32 ^ l);
	//    3    6:lload_1         
	//    4    7:bipush          32
	//    5    9:lushr           
	//    6   10:lload_1         
	//    7   11:lxor            
	//    8   12:l2i             
	//    9   13:istore          6
		int i = (j & 0x7fffffff) % aentry1.length;
	//   10   15:iload           6
	//   11   17:ldc1            #84  <Int 0x7fffffff>
	//   12   19:iand            
	//   13   20:aload           8
	//   14   22:arraylength     
	//   15   23:irem            
	//   16   24:istore          5
		for(Entry entry = aentry1[i]; entry != null; entry = entry.next)
	//*  17   26:aload           8
	//*  18   28:iload           5
	//*  19   30:aaload          
	//*  20   31:astore          7
	//*  21   33:aload           7
	//*  22   35:ifnull          82
			if(entry.hash == j && entry.key == l)
	//*  23   38:aload           7
	//*  24   40:getfield        #87  <Field int LongHashtable$Entry.hash>
	//*  25   43:iload           6
	//*  26   45:icmpne          72
	//*  27   48:aload           7
	//*  28   50:getfield        #90  <Field long LongHashtable$Entry.key>
	//*  29   53:lload_1         
	//*  30   54:lcmp            
	//*  31   55:ifne            72
			{
				l = entry.value;
	//   32   58:aload           7
	//   33   60:getfield        #78  <Field long LongHashtable$Entry.value>
	//   34   63:lstore_1        
				entry.value = l1;
	//   35   64:aload           7
	//   36   66:lload_3         
	//   37   67:putfield        #78  <Field long LongHashtable$Entry.value>
				return l;
	//   38   70:lload_1         
	//   39   71:lreturn         
			}

	//   40   72:aload           7
	//   41   74:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   42   77:astore          7
	//*  43   79:goto            33
		Entry aentry[] = aentry1;
	//   44   82:aload           8
	//   45   84:astore          7
		if(count >= threshold)
	//*  46   86:aload_0         
	//*  47   87:getfield        #62  <Field int count>
	//*  48   90:aload_0         
	//*  49   91:getfield        #59  <Field int threshold>
	//*  50   94:icmplt          118
		{
			rehash();
	//   51   97:aload_0         
	//   52   98:invokevirtual   #113 <Method void rehash()>
			aentry = table;
	//   53  101:aload_0         
	//   54  102:getfield        #57  <Field LongHashtable$Entry[] table>
	//   55  105:astore          7
			i = (j & 0x7fffffff) % aentry.length;
	//   56  107:iload           6
	//   57  109:ldc1            #84  <Int 0x7fffffff>
	//   58  111:iand            
	//   59  112:aload           7
	//   60  114:arraylength     
	//   61  115:irem            
	//   62  116:istore          5
		}
		aentry[i] = new Entry(j, l, l1, aentry[i]);
	//   63  118:aload           7
	//   64  120:iload           5
	//   65  122:new             #8   <Class LongHashtable$Entry>
	//   66  125:dup             
	//   67  126:iload           6
	//   68  128:lload_1         
	//   69  129:lload_3         
	//   70  130:aload           7
	//   71  132:iload           5
	//   72  134:aaload          
	//   73  135:invokespecial   #116 <Method void LongHashtable$Entry(int, long, long, LongHashtable$Entry)>
	//   74  138:aastore         
		count = count + 1;
	//   75  139:aload_0         
	//   76  140:aload_0         
	//   77  141:getfield        #62  <Field int count>
	//   78  144:iconst_1        
	//   79  145:iadd            
	//   80  146:putfield        #62  <Field int count>
		return 0L;
	//   81  149:lconst_0        
	//   82  150:lreturn         
	}

	protected void rehash()
	{
		int i = table.length;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
	//    2    4:arraylength     
	//    3    5:istore_1        
		Entry aentry[] = table;
	//    4    6:aload_0         
	//    5    7:getfield        #57  <Field LongHashtable$Entry[] table>
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
	//   26   39:putfield        #57  <Field LongHashtable$Entry[] table>
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
	//   40   63:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   41   66:astore          5
					i = (entry.hash & 0x7fffffff) % k;
	//   42   68:aload           4
	//   43   70:getfield        #87  <Field int LongHashtable$Entry.hash>
	//   44   73:ldc1            #84  <Int 0x7fffffff>
	//   45   75:iand            
	//   46   76:iload_3         
	//   47   77:irem            
	//   48   78:istore_1        
					entry.next = aentry1[i];
	//   49   79:aload           4
	//   50   81:aload           7
	//   51   83:iload_1         
	//   52   84:aaload          
	//   53   85:putfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
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

	public long remove(long l)
	{
		Entry aentry[] = table;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field LongHashtable$Entry[] table>
	//    2    4:astore          7
		int i = (int)(l >>> 32 ^ l);
	//    3    6:lload_1         
	//    4    7:bipush          32
	//    5    9:lushr           
	//    6   10:lload_1         
	//    7   11:lxor            
	//    8   12:l2i             
	//    9   13:istore_3        
		int j = (0x7fffffff & i) % aentry.length;
	//   10   14:ldc1            #84  <Int 0x7fffffff>
	//   11   16:iload_3         
	//   12   17:iand            
	//   13   18:aload           7
	//   14   20:arraylength     
	//   15   21:irem            
	//   16   22:istore          4
		Entry entry = aentry[j];
	//   17   24:aload           7
	//   18   26:iload           4
	//   19   28:aaload          
	//   20   29:astore          5
		Entry entry1 = null;
	//   21   31:aconst_null     
	//   22   32:astore          6
		for(; entry != null; entry = entry.next)
	//*  23   34:aload           5
	//*  24   36:ifnull          124
		{
			if(entry.hash == i && entry.key == l)
	//*  25   39:aload           5
	//*  26   41:getfield        #87  <Field int LongHashtable$Entry.hash>
	//*  27   44:iload_3         
	//*  28   45:icmpne          110
	//*  29   48:aload           5
	//*  30   50:getfield        #90  <Field long LongHashtable$Entry.key>
	//*  31   53:lload_1         
	//*  32   54:lcmp            
	//*  33   55:ifne            110
			{
				if(entry1 != null)
	//*  34   58:aload           6
	//*  35   60:ifnull          97
					entry1.next = entry.next;
	//   36   63:aload           6
	//   37   65:aload           5
	//   38   67:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   39   70:putfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
				else
	//*  40   73:aload_0         
	//*  41   74:aload_0         
	//*  42   75:getfield        #62  <Field int count>
	//*  43   78:iconst_1        
	//*  44   79:isub            
	//*  45   80:putfield        #62  <Field int count>
	//*  46   83:aload           5
	//*  47   85:getfield        #78  <Field long LongHashtable$Entry.value>
	//*  48   88:lstore_1        
	//*  49   89:aload           5
	//*  50   91:lconst_0        
	//*  51   92:putfield        #78  <Field long LongHashtable$Entry.value>
	//*  52   95:lload_1         
	//*  53   96:lreturn         
					aentry[j] = entry.next;
	//   54   97:aload           7
	//   55   99:iload           4
	//   56  101:aload           5
	//   57  103:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   58  106:aastore         
				count = count - 1;
				l = entry.value;
				entry.value = 0L;
				return l;
			}
	//*  59  107:goto            73
			entry1 = entry;
	//   60  110:aload           5
	//   61  112:astore          6
		}

	//   62  114:aload           5
	//   63  116:getfield        #82  <Field LongHashtable$Entry LongHashtable$Entry.next>
	//   64  119:astore          5
	//*  65  121:goto            34
		return 0L;
	//   66  124:lconst_0        
	//   67  125:lreturn         
	}

	public int size()
	{
		return count;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int count>
	//    2    4:ireturn         
	}

	public long[] toOrderedKeys()
	{
		long al[] = getKeys();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #122 <Method long[] getKeys()>
	//    2    4:astore_1        
		Arrays.sort(al);
	//    3    5:aload_1         
	//    4    6:invokestatic    #128 <Method void Arrays.sort(long[])>
		return al;
	//    5    9:aload_1         
	//    6   10:areturn         
	}

	private transient int count;
	private float loadFactor;
	private transient Entry table[];
	private int threshold;
}
