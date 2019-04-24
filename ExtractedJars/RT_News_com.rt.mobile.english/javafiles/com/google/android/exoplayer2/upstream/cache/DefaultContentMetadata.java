// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream.cache;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.upstream.cache:
//			ContentMetadata, ContentMetadataMutations

public final class DefaultContentMetadata
	implements ContentMetadata
{

	private DefaultContentMetadata(Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		metadata = Collections.unmodifiableMap(map);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #36  <Method Map Collections.unmodifiableMap(Map)>
	//    5    9:putfield        #38  <Field Map metadata>
	//    6   12:return          
	}

	private static void addValues(HashMap hashmap, Map map)
	{
		String s;
		byte abyte0[];
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s)), ((Object) (abyte0))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #48  <Method Set Map.keySet()>
	//*   2    6:invokeinterface #54  <Method Iterator Set.iterator()>
	//*   3   11:astore_2        
	//*   4   12:aload_2         
	//*   5   13:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            100
		{
			s = (String)iterator.next();
	//    7   21:aload_2         
	//    8   22:invokeinterface #64  <Method Object Iterator.next()>
	//    9   27:checkcast       #66  <Class String>
	//   10   30:astore_3        
			abyte0 = getBytes(map.get(((Object) (s))));
	//   11   31:aload_1         
	//   12   32:aload_3         
	//   13   33:invokeinterface #70  <Method Object Map.get(Object)>
	//   14   38:invokestatic    #74  <Method byte[] getBytes(Object)>
	//   15   41:astore          4
			if(abyte0.length > 0xa00000)
	//*  16   43:aload           4
	//*  17   45:arraylength     
	//*  18   46:ldc1            #11  <Int 0xa00000>
	//*  19   48:icmple          89
				throw new IllegalArgumentException(String.format("The size of %s (%d) is greater than maximum allowed: %d", new Object[] {
					s, Integer.valueOf(abyte0.length), Integer.valueOf(0xa00000)
				}));
	//   20   51:new             #76  <Class IllegalArgumentException>
	//   21   54:dup             
	//   22   55:ldc1            #78  <String "The size of %s (%d) is greater than maximum allowed: %d">
	//   23   57:iconst_3        
	//   24   58:anewarray       Object[]
	//   25   61:dup             
	//   26   62:iconst_0        
	//   27   63:aload_3         
	//   28   64:aastore         
	//   29   65:dup             
	//   30   66:iconst_1        
	//   31   67:aload           4
	//   32   69:arraylength     
	//   33   70:invokestatic    #84  <Method Integer Integer.valueOf(int)>
	//   34   73:aastore         
	//   35   74:dup             
	//   36   75:iconst_2        
	//   37   76:ldc1            #11  <Int 0xa00000>
	//   38   78:invokestatic    #84  <Method Integer Integer.valueOf(int)>
	//   39   81:aastore         
	//   40   82:invokestatic    #88  <Method String String.format(String, Object[])>
	//   41   85:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   42   88:athrow          
		}

	//   43   89:aload_0         
	//   44   90:aload_3         
	//   45   91:aload           4
	//   46   93:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//   47   96:pop             
	//*  48   97:goto            12
	//   49  100:return          
	}

	private static Map applyMutations(Map map, ContentMetadataMutations contentmetadatamutations)
	{
		map = ((Map) (new HashMap(map)));
	//    0    0:new             #93  <Class HashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #101 <Method void HashMap(Map)>
	//    4    8:astore_0        
		removeValues(((HashMap) (map)), contentmetadatamutations.getRemovedValues());
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #107 <Method List ContentMetadataMutations.getRemovedValues()>
	//    8   14:invokestatic    #111 <Method void removeValues(HashMap, List)>
		addValues(((HashMap) (map)), contentmetadatamutations.getEditedValues());
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #114 <Method Map ContentMetadataMutations.getEditedValues()>
	//   12   22:invokestatic    #116 <Method void addValues(HashMap, Map)>
		return map;
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	private static byte[] getBytes(Object obj)
	{
		if(obj instanceof Long)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #119 <Class Long>
	//*   2    4:ifeq            26
			return ByteBuffer.allocate(8).putLong(((Long)obj).longValue()).array();
	//    3    7:bipush          8
	//    4    9:invokestatic    #125 <Method ByteBuffer ByteBuffer.allocate(int)>
	//    5   12:aload_0         
	//    6   13:checkcast       #119 <Class Long>
	//    7   16:invokevirtual   #129 <Method long Long.longValue()>
	//    8   19:invokevirtual   #133 <Method ByteBuffer ByteBuffer.putLong(long)>
	//    9   22:invokevirtual   #137 <Method byte[] ByteBuffer.array()>
	//   10   25:areturn         
		if(obj instanceof String)
	//*  11   26:aload_0         
	//*  12   27:instanceof      #66  <Class String>
	//*  13   30:ifeq            46
			return ((String)obj).getBytes(Charset.forName("UTF-8"));
	//   14   33:aload_0         
	//   15   34:checkcast       #66  <Class String>
	//   16   37:ldc1            #139 <String "UTF-8">
	//   17   39:invokestatic    #145 <Method Charset Charset.forName(String)>
	//   18   42:invokevirtual   #148 <Method byte[] String.getBytes(Charset)>
	//   19   45:areturn         
		if(obj instanceof byte[])
	//*  20   46:aload_0         
	//*  21   47:instanceof      #150 <Class byte[]>
	//*  22   50:ifeq            58
			return (byte[])obj;
	//   23   53:aload_0         
	//   24   54:checkcast       #150 <Class byte[]>
	//   25   57:areturn         
		else
			throw new IllegalArgumentException();
	//   26   58:new             #76  <Class IllegalArgumentException>
	//   27   61:dup             
	//   28   62:invokespecial   #151 <Method void IllegalArgumentException()>
	//   29   65:athrow          
	}

	private boolean isMetadataEqual(Map map)
	{
		if(metadata.size() != map.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Map metadata>
	//*   2    4:invokeinterface #157 <Method int Map.size()>
	//*   3    9:aload_1         
	//*   4   10:invokeinterface #157 <Method int Map.size()>
	//*   5   15:icmpeq          20
			return false;
	//    6   18:iconst_0        
	//    7   19:ireturn         
		for(Iterator iterator = metadata.entrySet().iterator(); iterator.hasNext();)
	//*   8   20:aload_0         
	//*   9   21:getfield        #38  <Field Map metadata>
	//*  10   24:invokeinterface #160 <Method Set Map.entrySet()>
	//*  11   29:invokeinterface #54  <Method Iterator Set.iterator()>
	//*  12   34:astore_2        
	//*  13   35:aload_2         
	//*  14   36:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  15   41:ifeq            86
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   16   44:aload_2         
	//   17   45:invokeinterface #64  <Method Object Iterator.next()>
	//   18   50:checkcast       #162 <Class java.util.Map$Entry>
	//   19   53:astore_3        
			if(!Arrays.equals((byte[])entry.getValue(), (byte[])map.get(entry.getKey())))
	//*  20   54:aload_3         
	//*  21   55:invokeinterface #165 <Method Object java.util.Map$Entry.getValue()>
	//*  22   60:checkcast       #150 <Class byte[]>
	//*  23   63:aload_1         
	//*  24   64:aload_3         
	//*  25   65:invokeinterface #168 <Method Object java.util.Map$Entry.getKey()>
	//*  26   70:invokeinterface #70  <Method Object Map.get(Object)>
	//*  27   75:checkcast       #150 <Class byte[]>
	//*  28   78:invokestatic    #174 <Method boolean Arrays.equals(byte[], byte[])>
	//*  29   81:ifne            35
				return false;
	//   30   84:iconst_0        
	//   31   85:ireturn         
		}

		return true;
	//   32   86:iconst_1        
	//   33   87:ireturn         
	}

	public static DefaultContentMetadata readFromStream(DataInputStream datainputstream)
		throws IOException
	{
		int j = datainputstream.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #184 <Method int DataInputStream.readInt()>
	//    2    4:istore_2        
		HashMap hashmap = new HashMap();
	//    3    5:new             #93  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #185 <Method void HashMap()>
	//    6   12:astore          4
		for(int i = 0; i < j;)
	//*   7   14:iconst_0        
	//*   8   15:istore_1        
	//*   9   16:iload_1         
	//*  10   17:iload_2         
	//*  11   18:icmpge          106
		{
			String s = datainputstream.readUTF();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #189 <Method String DataInputStream.readUTF()>
	//   14   25:astore          5
			int k = datainputstream.readInt();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #184 <Method int DataInputStream.readInt()>
	//   17   31:istore_3        
			if(k >= 0 && k <= 0xa00000)
	//*  18   32:iload_3         
	//*  19   33:iflt            73
	//*  20   36:iload_3         
	//*  21   37:ldc1            #11  <Int 0xa00000>
	//*  22   39:icmple          45
	//*  23   42:goto            73
			{
				byte abyte0[] = new byte[k];
	//   24   45:iload_3         
	//   25   46:newarray        byte[]
	//   26   48:astore          6
				datainputstream.readFully(abyte0);
	//   27   50:aload_0         
	//   28   51:aload           6
	//   29   53:invokevirtual   #193 <Method void DataInputStream.readFully(byte[])>
				hashmap.put(((Object) (s)), ((Object) (abyte0)));
	//   30   56:aload           4
	//   31   58:aload           5
	//   32   60:aload           6
	//   33   62:invokevirtual   #97  <Method Object HashMap.put(Object, Object)>
	//   34   65:pop             
				i++;
	//   35   66:iload_1         
	//   36   67:iconst_1        
	//   37   68:iadd            
	//   38   69:istore_1        
			} else
	//*  39   70:goto            16
			{
				datainputstream = ((DataInputStream) (new StringBuilder()));
	//   40   73:new             #195 <Class StringBuilder>
	//   41   76:dup             
	//   42   77:invokespecial   #196 <Method void StringBuilder()>
	//   43   80:astore_0        
				((StringBuilder) (datainputstream)).append("Invalid value size: ");
	//   44   81:aload_0         
	//   45   82:ldc1            #198 <String "Invalid value size: ">
	//   46   84:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   47   87:pop             
				((StringBuilder) (datainputstream)).append(k);
	//   48   88:aload_0         
	//   49   89:iload_3         
	//   50   90:invokevirtual   #205 <Method StringBuilder StringBuilder.append(int)>
	//   51   93:pop             
				throw new IOException(((StringBuilder) (datainputstream)).toString());
	//   52   94:new             #179 <Class IOException>
	//   53   97:dup             
	//   54   98:aload_0         
	//   55   99:invokevirtual   #208 <Method String StringBuilder.toString()>
	//   56  102:invokespecial   #209 <Method void IOException(String)>
	//   57  105:athrow          
			}
		}

		return new DefaultContentMetadata(((Map) (hashmap)));
	//   58  106:new             #2   <Class DefaultContentMetadata>
	//   59  109:dup             
	//   60  110:aload           4
	//   61  112:invokespecial   #27  <Method void DefaultContentMetadata(Map)>
	//   62  115:areturn         
	}

	private static void removeValues(HashMap hashmap, List list)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #213 <Method int List.size()>
	//*   5    9:icmpge          31
			hashmap.remove(list.get(i));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokeinterface #216 <Method Object List.get(int)>
	//   10   20:invokevirtual   #219 <Method Object HashMap.remove(Object)>
	//   11   23:pop             

	//   12   24:iload_2         
	//   13   25:iconst_1        
	//   14   26:iadd            
	//   15   27:istore_2        
	//*  16   28:goto            2
	//   17   31:return          
	}

	public final boolean contains(String s)
	{
		return metadata.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map metadata>
	//    2    4:aload_1         
	//    3    5:invokeinterface #226 <Method boolean Map.containsKey(Object)>
	//    4   10:ireturn         
	}

	public DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentmetadatamutations)
	{
		contentmetadatamutations = ((ContentMetadataMutations) (applyMutations(metadata, contentmetadatamutations)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map metadata>
	//    2    4:aload_1         
	//    3    5:invokestatic    #230 <Method Map applyMutations(Map, ContentMetadataMutations)>
	//    4    8:astore_1        
		if(isMetadataEqual(((Map) (contentmetadatamutations))))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokespecial   #232 <Method boolean isMetadataEqual(Map)>
	//*   8   14:ifeq            19
			return this;
	//    9   17:aload_0         
	//   10   18:areturn         
		else
			return new DefaultContentMetadata(((Map) (contentmetadatamutations)));
	//   11   19:new             #2   <Class DefaultContentMetadata>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #27  <Method void DefaultContentMetadata(Map)>
	//   15   27:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          37
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #237 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #237 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            37
			return isMetadataEqual(((DefaultContentMetadata)obj).metadata);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:checkcast       #2   <Class DefaultContentMetadata>
	//   16   30:getfield        #38  <Field Map metadata>
	//   17   33:invokespecial   #232 <Method boolean isMetadataEqual(Map)>
	//   18   36:ireturn         
		else
			return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	public final long get(String s, long l)
	{
		if(metadata.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Map metadata>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #226 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            33
			return ByteBuffer.wrap((byte[])metadata.get(((Object) (s)))).getLong();
	//    5   13:aload_0         
	//    6   14:getfield        #38  <Field Map metadata>
	//    7   17:aload_1         
	//    8   18:invokeinterface #70  <Method Object Map.get(Object)>
	//    9   23:checkcast       #150 <Class byte[]>
	//   10   26:invokestatic    #243 <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//   11   29:invokevirtual   #246 <Method long ByteBuffer.getLong()>
	//   12   32:lreturn         
		else
			return l;
	//   13   33:lload_2         
	//   14   34:lreturn         
	}

	public final String get(String s, String s1)
	{
		if(metadata.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Map metadata>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #226 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            39
			return new String((byte[])metadata.get(((Object) (s))), Charset.forName("UTF-8"));
	//    5   13:new             #66  <Class String>
	//    6   16:dup             
	//    7   17:aload_0         
	//    8   18:getfield        #38  <Field Map metadata>
	//    9   21:aload_1         
	//   10   22:invokeinterface #70  <Method Object Map.get(Object)>
	//   11   27:checkcast       #150 <Class byte[]>
	//   12   30:ldc1            #139 <String "UTF-8">
	//   13   32:invokestatic    #145 <Method Charset Charset.forName(String)>
	//   14   35:invokespecial   #250 <Method void String(byte[], Charset)>
	//   15   38:areturn         
		else
			return s1;
	//   16   39:aload_2         
	//   17   40:areturn         
	}

	public final byte[] get(String s, byte abyte0[])
	{
		if(metadata.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field Map metadata>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #226 <Method boolean Map.containsKey(Object)>
	//*   4   10:ifeq            34
		{
			s = ((String) ((byte[])metadata.get(((Object) (s)))));
	//    5   13:aload_0         
	//    6   14:getfield        #38  <Field Map metadata>
	//    7   17:aload_1         
	//    8   18:invokeinterface #70  <Method Object Map.get(Object)>
	//    9   23:checkcast       #150 <Class byte[]>
	//   10   26:astore_1        
			return Arrays.copyOf(((byte []) (s)), s.length);
	//   11   27:aload_1         
	//   12   28:aload_1         
	//   13   29:arraylength     
	//   14   30:invokestatic    #255 <Method byte[] Arrays.copyOf(byte[], int)>
	//   15   33:areturn         
		} else
		{
			return abyte0;
	//   16   34:aload_2         
	//   17   35:areturn         
		}
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #257 <Field int hashCode>
	//*   2    4:ifne            84
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
			for(Iterator iterator = metadata.entrySet().iterator(); iterator.hasNext();)
	//*   5    9:aload_0         
	//*   6   10:getfield        #38  <Field Map metadata>
	//*   7   13:invokeinterface #160 <Method Set Map.entrySet()>
	//*   8   18:invokeinterface #54  <Method Iterator Set.iterator()>
	//*   9   23:astore_3        
	//*  10   24:aload_3         
	//*  11   25:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  12   30:ifeq            79
			{
				java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   13   33:aload_3         
	//   14   34:invokeinterface #64  <Method Object Iterator.next()>
	//   15   39:checkcast       #162 <Class java.util.Map$Entry>
	//   16   42:astore          4
				int j = ((String)entry.getKey()).hashCode();
	//   17   44:aload           4
	//   18   46:invokeinterface #168 <Method Object java.util.Map$Entry.getKey()>
	//   19   51:checkcast       #66  <Class String>
	//   20   54:invokevirtual   #259 <Method int String.hashCode()>
	//   21   57:istore_2        
				i += Arrays.hashCode((byte[])entry.getValue()) ^ j;
	//   22   58:iload_1         
	//   23   59:aload           4
	//   24   61:invokeinterface #165 <Method Object java.util.Map$Entry.getValue()>
	//   25   66:checkcast       #150 <Class byte[]>
	//   26   69:invokestatic    #262 <Method int Arrays.hashCode(byte[])>
	//   27   72:iload_2         
	//   28   73:ixor            
	//   29   74:iadd            
	//   30   75:istore_1        
			}

	//*  31   76:goto            24
			hashCode = i;
	//   32   79:aload_0         
	//   33   80:iload_1         
	//   34   81:putfield        #257 <Field int hashCode>
		}
		return hashCode;
	//   35   84:aload_0         
	//   36   85:getfield        #257 <Field int hashCode>
	//   37   88:ireturn         
	}

	public void writeToStream(DataOutputStream dataoutputstream)
		throws IOException
	{
		dataoutputstream.writeInt(metadata.size());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #38  <Field Map metadata>
	//    3    5:invokeinterface #157 <Method int Map.size()>
	//    4   10:invokevirtual   #270 <Method void DataOutputStream.writeInt(int)>
		byte abyte0[];
		for(Iterator iterator = metadata.entrySet().iterator(); iterator.hasNext(); dataoutputstream.write(abyte0))
	//*   5   13:aload_0         
	//*   6   14:getfield        #38  <Field Map metadata>
	//*   7   17:invokeinterface #160 <Method Set Map.entrySet()>
	//*   8   22:invokeinterface #54  <Method Iterator Set.iterator()>
	//*   9   27:astore_2        
	//*  10   28:aload_2         
	//*  11   29:invokeinterface #60  <Method boolean Iterator.hasNext()>
	//*  12   34:ifeq            84
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   13   37:aload_2         
	//   14   38:invokeinterface #64  <Method Object Iterator.next()>
	//   15   43:checkcast       #162 <Class java.util.Map$Entry>
	//   16   46:astore_3        
			dataoutputstream.writeUTF((String)entry.getKey());
	//   17   47:aload_1         
	//   18   48:aload_3         
	//   19   49:invokeinterface #168 <Method Object java.util.Map$Entry.getKey()>
	//   20   54:checkcast       #66  <Class String>
	//   21   57:invokevirtual   #273 <Method void DataOutputStream.writeUTF(String)>
			abyte0 = (byte[])entry.getValue();
	//   22   60:aload_3         
	//   23   61:invokeinterface #165 <Method Object java.util.Map$Entry.getValue()>
	//   24   66:checkcast       #150 <Class byte[]>
	//   25   69:astore_3        
			dataoutputstream.writeInt(abyte0.length);
	//   26   70:aload_1         
	//   27   71:aload_3         
	//   28   72:arraylength     
	//   29   73:invokevirtual   #270 <Method void DataOutputStream.writeInt(int)>
		}

	//   30   76:aload_1         
	//   31   77:aload_3         
	//   32   78:invokevirtual   #276 <Method void DataOutputStream.write(byte[])>
	//*  33   81:goto            28
	//   34   84:return          
	}

	public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());
	private static final int MAX_VALUE_LENGTH = 0xa00000;
	private int hashCode;
	private final Map metadata;

	static 
	{
	//    0    0:new             #2   <Class DefaultContentMetadata>
	//    1    3:dup             
	//    2    4:invokestatic    #23  <Method Map Collections.emptyMap()>
	//    3    7:invokespecial   #27  <Method void DefaultContentMetadata(Map)>
	//    4   10:putstatic       #29  <Field DefaultContentMetadata EMPTY>
	//*   5   13:return          
	}
}
