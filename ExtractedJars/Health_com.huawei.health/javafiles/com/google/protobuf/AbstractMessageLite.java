// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.*;
import java.util.*;

// Referenced classes of package com.google.protobuf:
//			MessageLite, ByteString, UninitializedMessageException, CodedOutputStream, 
//			Internal, LazyStringList, PrimitiveNonBoxingCollection, ExtensionRegistryLite, 
//			CodedInputStream, InvalidProtocolBufferException

public abstract class AbstractMessageLite
	implements MessageLite
{
	public static abstract class Builder
		implements MessageLite.Builder
	{

		protected static void addAll(Iterable iterable, Collection collection)
		{
			addAll(iterable, (List)collection);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #23  <Class List>
		//    3    5:invokestatic    #26  <Method void addAll(Iterable, List)>
		//    4    8:return          
		}

		protected static void addAll(Iterable iterable, List list)
		{
			Internal.checkNotNull(((Object) (iterable)));
		//    0    0:aload_0         
		//    1    1:invokestatic    #35  <Method Object Internal.checkNotNull(Object)>
		//    2    4:pop             
			if(iterable instanceof LazyStringList)
		//*   3    5:aload_0         
		//*   4    6:instanceof      #37  <Class LazyStringList>
		//*   5    9:ifeq            173
			{
				List list1 = ((LazyStringList)iterable).getUnderlyingElements();
		//    6   12:aload_0         
		//    7   13:checkcast       #37  <Class LazyStringList>
		//    8   16:invokeinterface #41  <Method List LazyStringList.getUnderlyingElements()>
		//    9   21:astore          4
				iterable = ((Iterable) ((LazyStringList)list));
		//   10   23:aload_1         
		//   11   24:checkcast       #37  <Class LazyStringList>
		//   12   27:astore_0        
				int j = list.size();
		//   13   28:aload_1         
		//   14   29:invokeinterface #45  <Method int List.size()>
		//   15   34:istore_3        
				for(list = ((List) (list1.iterator())); ((Iterator) (list)).hasNext();)
		//*  16   35:aload           4
		//*  17   37:invokeinterface #49  <Method Iterator List.iterator()>
		//*  18   42:astore_1        
		//*  19   43:aload_1         
		//*  20   44:invokeinterface #55  <Method boolean Iterator.hasNext()>
		//*  21   49:ifeq            172
				{
					Object obj = ((Iterator) (list)).next();
		//   22   52:aload_1         
		//   23   53:invokeinterface #59  <Method Object Iterator.next()>
		//   24   58:astore          4
					if(obj == null)
		//*  25   60:aload           4
		//*  26   62:ifnonnull       135
					{
						list = ((List) ((new StringBuilder()).append("Element at index ").append(((LazyStringList) (iterable)).size() - j).append(" is null.").toString()));
		//   27   65:new             #61  <Class StringBuilder>
		//   28   68:dup             
		//   29   69:invokespecial   #62  <Method void StringBuilder()>
		//   30   72:ldc1            #64  <String "Element at index ">
		//   31   74:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   32   77:aload_0         
		//   33   78:invokeinterface #69  <Method int LazyStringList.size()>
		//   34   83:iload_3         
		//   35   84:isub            
		//   36   85:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
		//   37   88:ldc1            #74  <String " is null.">
		//   38   90:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   39   93:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   40   96:astore_1        
						for(int i = ((LazyStringList) (iterable)).size() - 1; i >= j; i--)
		//*  41   97:aload_0         
		//*  42   98:invokeinterface #69  <Method int LazyStringList.size()>
		//*  43  103:iconst_1        
		//*  44  104:isub            
		//*  45  105:istore_2        
		//*  46  106:iload_2         
		//*  47  107:iload_3         
		//*  48  108:icmplt          126
							((LazyStringList) (iterable)).remove(i);
		//   49  111:aload_0         
		//   50  112:iload_2         
		//   51  113:invokeinterface #82  <Method Object LazyStringList.remove(int)>
		//   52  118:pop             

		//   53  119:iload_2         
		//   54  120:iconst_1        
		//   55  121:isub            
		//   56  122:istore_2        
		//*  57  123:goto            106
						throw new NullPointerException(((String) (list)));
		//   58  126:new             #84  <Class NullPointerException>
		//   59  129:dup             
		//   60  130:aload_1         
		//   61  131:invokespecial   #87  <Method void NullPointerException(String)>
		//   62  134:athrow          
					}
					if(obj instanceof ByteString)
		//*  63  135:aload           4
		//*  64  137:instanceof      #89  <Class ByteString>
		//*  65  140:ifeq            157
						((LazyStringList) (iterable)).add((ByteString)obj);
		//   66  143:aload_0         
		//   67  144:aload           4
		//   68  146:checkcast       #89  <Class ByteString>
		//   69  149:invokeinterface #93  <Method void LazyStringList.add(ByteString)>
					else
		//*  70  154:goto            169
						((LazyStringList) (iterable)).add(((Object) ((String)obj)));
		//   71  157:aload_0         
		//   72  158:aload           4
		//   73  160:checkcast       #95  <Class String>
		//   74  163:invokeinterface #98  <Method boolean LazyStringList.add(Object)>
		//   75  168:pop             
				}

		//*  76  169:goto            43
				return;
		//   77  172:return          
			}
			if(iterable instanceof PrimitiveNonBoxingCollection)
		//*  78  173:aload_0         
		//*  79  174:instanceof      #100 <Class PrimitiveNonBoxingCollection>
		//*  80  177:ifeq            192
			{
				list.addAll((Collection)iterable);
		//   81  180:aload_1         
		//   82  181:aload_0         
		//   83  182:checkcast       #102 <Class Collection>
		//   84  185:invokeinterface #105 <Method boolean List.addAll(Collection)>
		//   85  190:pop             
				return;
		//   86  191:return          
			} else
			{
				addAllCheckingNulls(iterable, list);
		//   87  192:aload_0         
		//   88  193:aload_1         
		//   89  194:invokestatic    #108 <Method void addAllCheckingNulls(Iterable, List)>
				return;
		//   90  197:return          
			}
		}

		private static void addAllCheckingNulls(Iterable iterable, List list)
		{
			if((list instanceof ArrayList) && (iterable instanceof Collection))
		//*   0    0:aload_1         
		//*   1    1:instanceof      #111 <Class ArrayList>
		//*   2    4:ifeq            37
		//*   3    7:aload_0         
		//*   4    8:instanceof      #102 <Class Collection>
		//*   5   11:ifeq            37
				((ArrayList)list).ensureCapacity(list.size() + ((Collection)iterable).size());
		//    6   14:aload_1         
		//    7   15:checkcast       #111 <Class ArrayList>
		//    8   18:aload_1         
		//    9   19:invokeinterface #45  <Method int List.size()>
		//   10   24:aload_0         
		//   11   25:checkcast       #102 <Class Collection>
		//   12   28:invokeinterface #112 <Method int Collection.size()>
		//   13   33:iadd            
		//   14   34:invokevirtual   #116 <Method void ArrayList.ensureCapacity(int)>
			int j = list.size();
		//   15   37:aload_1         
		//   16   38:invokeinterface #45  <Method int List.size()>
		//   17   43:istore_3        
			Object obj;
			for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); list.add(obj))
		//*  18   44:aload_0         
		//*  19   45:invokeinterface #119 <Method Iterator Iterable.iterator()>
		//*  20   50:astore_0        
		//*  21   51:aload_0         
		//*  22   52:invokeinterface #55  <Method boolean Iterator.hasNext()>
		//*  23   57:ifeq            155
			{
				obj = ((Iterator) (iterable)).next();
		//   24   60:aload_0         
		//   25   61:invokeinterface #59  <Method Object Iterator.next()>
		//   26   66:astore          4
				if(obj == null)
		//*  27   68:aload           4
		//*  28   70:ifnonnull       143
				{
					iterable = ((Iterable) ((new StringBuilder()).append("Element at index ").append(list.size() - j).append(" is null.").toString()));
		//   29   73:new             #61  <Class StringBuilder>
		//   30   76:dup             
		//   31   77:invokespecial   #62  <Method void StringBuilder()>
		//   32   80:ldc1            #64  <String "Element at index ">
		//   33   82:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   34   85:aload_1         
		//   35   86:invokeinterface #45  <Method int List.size()>
		//   36   91:iload_3         
		//   37   92:isub            
		//   38   93:invokevirtual   #72  <Method StringBuilder StringBuilder.append(int)>
		//   39   96:ldc1            #74  <String " is null.">
		//   40   98:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   41  101:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   42  104:astore_0        
					for(int i = list.size() - 1; i >= j; i--)
		//*  43  105:aload_1         
		//*  44  106:invokeinterface #45  <Method int List.size()>
		//*  45  111:iconst_1        
		//*  46  112:isub            
		//*  47  113:istore_2        
		//*  48  114:iload_2         
		//*  49  115:iload_3         
		//*  50  116:icmplt          134
						list.remove(i);
		//   51  119:aload_1         
		//   52  120:iload_2         
		//   53  121:invokeinterface #120 <Method Object List.remove(int)>
		//   54  126:pop             

		//   55  127:iload_2         
		//   56  128:iconst_1        
		//   57  129:isub            
		//   58  130:istore_2        
		//*  59  131:goto            114
					throw new NullPointerException(((String) (iterable)));
		//   60  134:new             #84  <Class NullPointerException>
		//   61  137:dup             
		//   62  138:aload_0         
		//   63  139:invokespecial   #87  <Method void NullPointerException(String)>
		//   64  142:athrow          
				}
			}

		//   65  143:aload_1         
		//   66  144:aload           4
		//   67  146:invokeinterface #121 <Method boolean List.add(Object)>
		//   68  151:pop             
		//*  69  152:goto            51
		//   70  155:return          
		}

		private String getReadingExceptionMessage(String s)
		{
			return (new StringBuilder()).append("Reading ").append(((Object)this).getClass().getName()).append(" from a ").append(s).append(" threw an IOException (should never happen).").toString();
		//    0    0:new             #61  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #62  <Method void StringBuilder()>
		//    3    7:ldc1            #125 <String "Reading ">
		//    4    9:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//    5   12:aload_0         
		//    6   13:invokevirtual   #129 <Method Class Object.getClass()>
		//    7   16:invokevirtual   #134 <Method String Class.getName()>
		//    8   19:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//    9   22:ldc1            #136 <String " from a ">
		//   10   24:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   13   31:ldc1            #138 <String " threw an IOException (should never happen).">
		//   14   33:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
		//   15   36:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   16   39:areturn         
		}

		protected static UninitializedMessageException newUninitializedMessageException(MessageLite messagelite)
		{
			return new UninitializedMessageException(messagelite);
		//    0    0:new             #142 <Class UninitializedMessageException>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #145 <Method void UninitializedMessageException(MessageLite)>
		//    4    8:areturn         
		}

		public abstract Builder clone();

		public volatile MessageLite.Builder clone()
		{
			return ((MessageLite.Builder) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method AbstractMessageLite$Builder clone()>
		//    2    4:areturn         
		}

		public volatile Object clone()
			throws CloneNotSupportedException
		{
			return ((Object) (clone()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method AbstractMessageLite$Builder clone()>
		//    2    4:areturn         
		}

		protected abstract Builder internalMergeFrom(AbstractMessageLite abstractmessagelite);

		public boolean mergeDelimitedFrom(InputStream inputstream)
			throws IOException
		{
			return mergeDelimitedFrom(inputstream, ExtensionRegistryLite.getEmptyRegistry());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #165 <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
		//    3    5:invokevirtual   #168 <Method boolean mergeDelimitedFrom(InputStream, ExtensionRegistryLite)>
		//    4    8:ireturn         
		}

		public boolean mergeDelimitedFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			int i = inputstream.read();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #173 <Method int InputStream.read()>
		//    2    4:istore_3        
			if(i == -1)
		//*   3    5:iload_3         
		//*   4    6:iconst_m1       
		//*   5    7:icmpne          12
			{
				return false;
		//    6   10:iconst_0        
		//    7   11:ireturn         
			} else
			{
				mergeFrom(((InputStream) (new LimitedInputStream(inputstream, CodedInputStream.readRawVarint32(i, inputstream)))), extensionregistrylite);
		//    8   12:aload_0         
		//    9   13:new             #12  <Class AbstractMessageLite$Builder$LimitedInputStream>
		//   10   16:dup             
		//   11   17:aload_1         
		//   12   18:iload_3         
		//   13   19:aload_1         
		//   14   20:invokestatic    #179 <Method int CodedInputStream.readRawVarint32(int, InputStream)>
		//   15   23:invokespecial   #182 <Method void AbstractMessageLite$Builder$LimitedInputStream(InputStream, int)>
		//   16   26:aload_2         
		//   17   27:invokevirtual   #186 <Method AbstractMessageLite$Builder mergeFrom(InputStream, ExtensionRegistryLite)>
		//   18   30:pop             
				return true;
		//   19   31:iconst_1        
		//   20   32:ireturn         
			}
		}

		public Builder mergeFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			try
			{
				bytestring = ((ByteString) (bytestring.newCodedInput()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #193 <Method CodedInputStream ByteString.newCodedInput()>
		//    2    4:astore_1        
				mergeFrom(((CodedInputStream) (bytestring)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #196 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream)>
		//    6   10:pop             
				((CodedInputStream) (bytestring)).checkLastTagWas(0);
		//    7   11:aload_1         
		//    8   12:iconst_0        
		//    9   13:invokevirtual   #199 <Method void CodedInputStream.checkLastTagWas(int)>
			}
		//*  10   16:aload_0         
		//*  11   17:areturn         
			// Misplaced declaration of an exception variable
			catch(ByteString bytestring)
		//*  12   18:astore_1        
			{
				throw bytestring;
		//   13   19:aload_1         
		//   14   20:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(ByteString bytestring)
		//*  15   21:astore_1        
			{
				throw new RuntimeException(getReadingExceptionMessage("ByteString"), ((Throwable) (bytestring)));
		//   16   22:new             #201 <Class RuntimeException>
		//   17   25:dup             
		//   18   26:aload_0         
		//   19   27:ldc1            #203 <String "ByteString">
		//   20   29:invokespecial   #205 <Method String getReadingExceptionMessage(String)>
		//   21   32:aload_1         
		//   22   33:invokespecial   #208 <Method void RuntimeException(String, Throwable)>
		//   23   36:athrow          
			}
			return this;
		}

		public Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			try
			{
				bytestring = ((ByteString) (bytestring.newCodedInput()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #193 <Method CodedInputStream ByteString.newCodedInput()>
		//    2    4:astore_1        
				mergeFrom(((CodedInputStream) (bytestring)), extensionregistrylite);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #213 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    7   11:pop             
				((CodedInputStream) (bytestring)).checkLastTagWas(0);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:invokevirtual   #199 <Method void CodedInputStream.checkLastTagWas(int)>
			}
		//*  11   17:aload_0         
		//*  12   18:areturn         
			// Misplaced declaration of an exception variable
			catch(ByteString bytestring)
		//*  13   19:astore_1        
			{
				throw bytestring;
		//   14   20:aload_1         
		//   15   21:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(ByteString bytestring)
		//*  16   22:astore_1        
			{
				throw new RuntimeException(getReadingExceptionMessage("ByteString"), ((Throwable) (bytestring)));
		//   17   23:new             #201 <Class RuntimeException>
		//   18   26:dup             
		//   19   27:aload_0         
		//   20   28:ldc1            #203 <String "ByteString">
		//   21   30:invokespecial   #205 <Method String getReadingExceptionMessage(String)>
		//   22   33:aload_1         
		//   23   34:invokespecial   #208 <Method void RuntimeException(String, Throwable)>
		//   24   37:athrow          
			}
			return this;
		}

		public Builder mergeFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return mergeFrom(codedinputstream, ExtensionRegistryLite.getEmptyRegistry());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #165 <Method ExtensionRegistryLite ExtensionRegistryLite.getEmptyRegistry()>
		//    3    5:invokevirtual   #213 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    8:areturn         
		}

		public abstract Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException;

		public Builder mergeFrom(MessageLite messagelite)
		{
			if(!((Object) (getDefaultInstanceForType())).getClass().isInstance(((Object) (messagelite))))
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #220 <Method MessageLite getDefaultInstanceForType()>
		//*   2    4:invokevirtual   #129 <Method Class Object.getClass()>
		//*   3    7:aload_1         
		//*   4    8:invokevirtual   #223 <Method boolean Class.isInstance(Object)>
		//*   5   11:ifne            24
				throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
		//    6   14:new             #225 <Class IllegalArgumentException>
		//    7   17:dup             
		//    8   18:ldc1            #227 <String "mergeFrom(MessageLite) can only merge messages of the same type.">
		//    9   20:invokespecial   #228 <Method void IllegalArgumentException(String)>
		//   10   23:athrow          
			else
				return internalMergeFrom((AbstractMessageLite)messagelite);
		//   11   24:aload_0         
		//   12   25:aload_1         
		//   13   26:checkcast       #9   <Class AbstractMessageLite>
		//   14   29:invokevirtual   #230 <Method AbstractMessageLite$Builder internalMergeFrom(AbstractMessageLite)>
		//   15   32:areturn         
		}

		public Builder mergeFrom(InputStream inputstream)
			throws IOException
		{
			inputstream = ((InputStream) (CodedInputStream.newInstance(inputstream)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #236 <Method CodedInputStream CodedInputStream.newInstance(InputStream)>
		//    2    4:astore_1        
			mergeFrom(((CodedInputStream) (inputstream)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #196 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream)>
		//    6   10:pop             
			((CodedInputStream) (inputstream)).checkLastTagWas(0);
		//    7   11:aload_1         
		//    8   12:iconst_0        
		//    9   13:invokevirtual   #199 <Method void CodedInputStream.checkLastTagWas(int)>
			return this;
		//   10   16:aload_0         
		//   11   17:areturn         
		}

		public Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			inputstream = ((InputStream) (CodedInputStream.newInstance(inputstream)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #236 <Method CodedInputStream CodedInputStream.newInstance(InputStream)>
		//    2    4:astore_1        
			mergeFrom(((CodedInputStream) (inputstream)), extensionregistrylite);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #213 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    7   11:pop             
			((CodedInputStream) (inputstream)).checkLastTagWas(0);
		//    8   12:aload_1         
		//    9   13:iconst_0        
		//   10   14:invokevirtual   #199 <Method void CodedInputStream.checkLastTagWas(int)>
			return this;
		//   11   17:aload_0         
		//   12   18:areturn         
		}

		public Builder mergeFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return mergeFrom(abyte0, 0, abyte0.length);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:aload_1         
		//    4    4:arraylength     
		//    5    5:invokevirtual   #242 <Method AbstractMessageLite$Builder mergeFrom(byte[], int, int)>
		//    6    8:areturn         
		}

		public Builder mergeFrom(byte abyte0[], int i, int j)
			throws InvalidProtocolBufferException
		{
			try
			{
				abyte0 = ((byte []) (CodedInputStream.newInstance(abyte0, i, j)));
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #246 <Method CodedInputStream CodedInputStream.newInstance(byte[], int, int)>
		//    4    6:astore_1        
				mergeFrom(((CodedInputStream) (abyte0)));
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:invokevirtual   #196 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream)>
		//    8   12:pop             
				((CodedInputStream) (abyte0)).checkLastTagWas(0);
		//    9   13:aload_1         
		//   10   14:iconst_0        
		//   11   15:invokevirtual   #199 <Method void CodedInputStream.checkLastTagWas(int)>
			}
		//*  12   18:aload_0         
		//*  13   19:areturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  14   20:astore_1        
			{
				throw abyte0;
		//   15   21:aload_1         
		//   16   22:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  17   23:astore_1        
			{
				throw new RuntimeException(getReadingExceptionMessage("byte array"), ((Throwable) (abyte0)));
		//   18   24:new             #201 <Class RuntimeException>
		//   19   27:dup             
		//   20   28:aload_0         
		//   21   29:ldc1            #248 <String "byte array">
		//   22   31:invokespecial   #205 <Method String getReadingExceptionMessage(String)>
		//   23   34:aload_1         
		//   24   35:invokespecial   #208 <Method void RuntimeException(String, Throwable)>
		//   25   38:athrow          
			}
			return this;
		}

		public Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			try
			{
				abyte0 = ((byte []) (CodedInputStream.newInstance(abyte0, i, j)));
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #246 <Method CodedInputStream CodedInputStream.newInstance(byte[], int, int)>
		//    4    6:astore_1        
				mergeFrom(((CodedInputStream) (abyte0)), extensionregistrylite);
		//    5    7:aload_0         
		//    6    8:aload_1         
		//    7    9:aload           4
		//    8   11:invokevirtual   #213 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    9   14:pop             
				((CodedInputStream) (abyte0)).checkLastTagWas(0);
		//   10   15:aload_1         
		//   11   16:iconst_0        
		//   12   17:invokevirtual   #199 <Method void CodedInputStream.checkLastTagWas(int)>
			}
		//*  13   20:aload_0         
		//*  14   21:areturn         
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  15   22:astore_1        
			{
				throw abyte0;
		//   16   23:aload_1         
		//   17   24:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  18   25:astore_1        
			{
				throw new RuntimeException(getReadingExceptionMessage("byte array"), ((Throwable) (abyte0)));
		//   19   26:new             #201 <Class RuntimeException>
		//   20   29:dup             
		//   21   30:aload_0         
		//   22   31:ldc1            #248 <String "byte array">
		//   23   33:invokespecial   #205 <Method String getReadingExceptionMessage(String)>
		//   24   36:aload_1         
		//   25   37:invokespecial   #208 <Method void RuntimeException(String, Throwable)>
		//   26   40:athrow          
			}
			return this;
		}

		public Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return mergeFrom(abyte0, 0, abyte0.length, extensionregistrylite);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:aload_1         
		//    4    4:arraylength     
		//    5    5:aload_2         
		//    6    6:invokevirtual   #254 <Method AbstractMessageLite$Builder mergeFrom(byte[], int, int, ExtensionRegistryLite)>
		//    7    9:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(ByteString bytestring)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(bytestring)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #258 <Method AbstractMessageLite$Builder mergeFrom(ByteString)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(ByteString bytestring, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(bytestring, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #261 <Method AbstractMessageLite$Builder mergeFrom(ByteString, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #196 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(CodedInputStream codedinputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(codedinputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #213 <Method AbstractMessageLite$Builder mergeFrom(CodedInputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(MessageLite messagelite)
		{
			return ((MessageLite.Builder) (mergeFrom(messagelite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #266 <Method AbstractMessageLite$Builder mergeFrom(MessageLite)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(InputStream inputstream)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #269 <Method AbstractMessageLite$Builder mergeFrom(InputStream)>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(InputStream inputstream, ExtensionRegistryLite extensionregistrylite)
			throws IOException
		{
			return ((MessageLite.Builder) (mergeFrom(inputstream, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #186 <Method AbstractMessageLite$Builder mergeFrom(InputStream, ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[])
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #273 <Method AbstractMessageLite$Builder mergeFrom(byte[])>
		//    3    5:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[], int i, int j)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0, i, j)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #242 <Method AbstractMessageLite$Builder mergeFrom(byte[], int, int)>
		//    5    7:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[], int i, int j, ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0, i, j, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:aload           4
		//    5    6:invokevirtual   #254 <Method AbstractMessageLite$Builder mergeFrom(byte[], int, int, ExtensionRegistryLite)>
		//    6    9:areturn         
		}

		public volatile MessageLite.Builder mergeFrom(byte abyte0[], ExtensionRegistryLite extensionregistrylite)
			throws InvalidProtocolBufferException
		{
			return ((MessageLite.Builder) (mergeFrom(abyte0, extensionregistrylite)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #278 <Method AbstractMessageLite$Builder mergeFrom(byte[], ExtensionRegistryLite)>
		//    4    6:areturn         
		}

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}
	}

	static final class Builder.LimitedInputStream extends FilterInputStream
	{

		public int available()
			throws IOException
		{
			return Math.min(super.available(), limit);
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method int FilterInputStream.available()>
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field int limit>
		//    4    8:invokestatic    #32  <Method int Math.min(int, int)>
		//    5   11:ireturn         
		}

		public int read()
			throws IOException
		{
			if(limit <= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field int limit>
		//*   2    4:ifgt            9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			int i = super.read();
		//    5    9:aload_0         
		//    6   10:invokespecial   #36  <Method int FilterInputStream.read()>
		//    7   13:istore_1        
			if(i >= 0)
		//*   8   14:iload_1         
		//*   9   15:iflt            28
				limit = limit - 1;
		//   10   18:aload_0         
		//   11   19:aload_0         
		//   12   20:getfield        #19  <Field int limit>
		//   13   23:iconst_1        
		//   14   24:isub            
		//   15   25:putfield        #19  <Field int limit>
			return i;
		//   16   28:iload_1         
		//   17   29:ireturn         
		}

		public int read(byte abyte0[], int i, int j)
			throws IOException
		{
			if(limit <= 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field int limit>
		//*   2    4:ifgt            9
				return -1;
		//    3    7:iconst_m1       
		//    4    8:ireturn         
			i = super.read(abyte0, i, Math.min(j, limit));
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:iload_2         
		//    8   12:iload_3         
		//    9   13:aload_0         
		//   10   14:getfield        #19  <Field int limit>
		//   11   17:invokestatic    #32  <Method int Math.min(int, int)>
		//   12   20:invokespecial   #39  <Method int FilterInputStream.read(byte[], int, int)>
		//   13   23:istore_2        
			if(i >= 0)
		//*  14   24:iload_2         
		//*  15   25:iflt            38
				limit = limit - i;
		//   16   28:aload_0         
		//   17   29:aload_0         
		//   18   30:getfield        #19  <Field int limit>
		//   19   33:iload_2         
		//   20   34:isub            
		//   21   35:putfield        #19  <Field int limit>
			return i;
		//   22   38:iload_2         
		//   23   39:ireturn         
		}

		public long skip(long l)
			throws IOException
		{
			l = super.skip(Math.min(l, limit));
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:aload_0         
		//    3    3:getfield        #19  <Field int limit>
		//    4    6:i2l             
		//    5    7:invokestatic    #44  <Method long Math.min(long, long)>
		//    6   10:invokespecial   #46  <Method long FilterInputStream.skip(long)>
		//    7   13:lstore_1        
			if(l >= 0L)
		//*   8   14:lload_1         
		//*   9   15:lconst_0        
		//*  10   16:lcmp            
		//*  11   17:iflt            32
				limit = (int)((long)limit - l);
		//   12   20:aload_0         
		//   13   21:aload_0         
		//   14   22:getfield        #19  <Field int limit>
		//   15   25:i2l             
		//   16   26:lload_1         
		//   17   27:lsub            
		//   18   28:l2i             
		//   19   29:putfield        #19  <Field int limit>
			return l;
		//   20   32:lload_1         
		//   21   33:lreturn         
		}

		private int limit;

		Builder.LimitedInputStream(InputStream inputstream, int i)
		{
			super(inputstream);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #17  <Method void FilterInputStream(InputStream)>
			limit = i;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #19  <Field int limit>
		//    6   10:return          
		}
	}


	public AbstractMessageLite()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		memoizedHashCode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int memoizedHashCode>
	//    5    9:return          
	}

	protected static void addAll(Iterable iterable, Collection collection)
	{
		Builder.addAll(iterable, (List)collection);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class List>
	//    3    5:invokestatic    #30  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
	//    4    8:return          
	}

	protected static void addAll(Iterable iterable, List list)
	{
		Builder.addAll(iterable, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #30  <Method void AbstractMessageLite$Builder.addAll(Iterable, List)>
	//    3    5:return          
	}

	protected static void checkByteStringIsUtf8(ByteString bytestring)
		throws IllegalArgumentException
	{
		if(!bytestring.isValidUtf8())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #44  <Method boolean ByteString.isValidUtf8()>
	//*   2    4:ifne            17
			throw new IllegalArgumentException("Byte string is not UTF-8.");
	//    3    7:new             #38  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #46  <String "Byte string is not UTF-8.">
	//    6   13:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return;
	//    8   17:return          
	}

	private String getSerializingExceptionMessage(String s)
	{
		return (new StringBuilder()).append("Serializing ").append(((Object)this).getClass().getName()).append(" to a ").append(s).append(" threw an IOException (should never happen).").toString();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:ldc1            #57  <String "Serializing ">
	//    4    9:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #65  <Method Class Object.getClass()>
	//    7   16:invokevirtual   #71  <Method String Class.getName()>
	//    8   19:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:ldc1            #73  <String " to a ">
	//   10   24:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_1         
	//   12   28:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #75  <String " threw an IOException (should never happen).">
	//   14   33:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   39:areturn         
	}

	UninitializedMessageException newUninitializedMessageException()
	{
		return new UninitializedMessageException(((MessageLite) (this)));
	//    0    0:new             #82  <Class UninitializedMessageException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #85  <Method void UninitializedMessageException(MessageLite)>
	//    4    8:areturn         
	}

	public byte[] toByteArray()
	{
		byte abyte0[];
		try
		{
			abyte0 = new byte[getSerializedSize()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method int getSerializedSize()>
	//    2    4:newarray        byte[]
	//    3    6:astore_1        
			CodedOutputStream codedoutputstream = CodedOutputStream.newInstance(abyte0);
	//    4    7:aload_1         
	//    5    8:invokestatic    #99  <Method CodedOutputStream CodedOutputStream.newInstance(byte[])>
	//    6   11:astore_2        
			writeTo(codedoutputstream);
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #103 <Method void writeTo(CodedOutputStream)>
			codedoutputstream.checkNoSpaceLeft();
	//   10   17:aload_2         
	//   11   18:invokevirtual   #106 <Method void CodedOutputStream.checkNoSpaceLeft()>
		}
	//*  12   21:aload_1         
	//*  13   22:areturn         
		catch(IOException ioexception)
	//*  14   23:astore_1        
		{
			throw new RuntimeException(getSerializingExceptionMessage("byte array"), ((Throwable) (ioexception)));
	//   15   24:new             #108 <Class RuntimeException>
	//   16   27:dup             
	//   17   28:aload_0         
	//   18   29:ldc1            #110 <String "byte array">
	//   19   31:invokespecial   #112 <Method String getSerializingExceptionMessage(String)>
	//   20   34:aload_1         
	//   21   35:invokespecial   #115 <Method void RuntimeException(String, Throwable)>
	//   22   38:athrow          
		}
		return abyte0;
	}

	public ByteString toByteString()
	{
		Object obj;
		try
		{
			obj = ((Object) (ByteString.newCodedBuilder(getSerializedSize())));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method int getSerializedSize()>
	//    2    4:invokestatic    #121 <Method ByteString$CodedBuilder ByteString.newCodedBuilder(int)>
	//    3    7:astore_1        
			writeTo(((ByteString.CodedBuilder) (obj)).getCodedOutput());
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #127 <Method CodedOutputStream ByteString$CodedBuilder.getCodedOutput()>
	//    7   13:invokevirtual   #103 <Method void writeTo(CodedOutputStream)>
			obj = ((Object) (((ByteString.CodedBuilder) (obj)).build()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #130 <Method ByteString ByteString$CodedBuilder.build()>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(IOException ioexception)
	//*  13   23:astore_1        
		{
			throw new RuntimeException(getSerializingExceptionMessage("ByteString"), ((Throwable) (ioexception)));
	//   14   24:new             #108 <Class RuntimeException>
	//   15   27:dup             
	//   16   28:aload_0         
	//   17   29:ldc1            #132 <String "ByteString">
	//   18   31:invokespecial   #112 <Method String getSerializingExceptionMessage(String)>
	//   19   34:aload_1         
	//   20   35:invokespecial   #115 <Method void RuntimeException(String, Throwable)>
	//   21   38:athrow          
		}
		return ((ByteString) (obj));
	}

	public void writeDelimitedTo(OutputStream outputstream)
		throws IOException
	{
		int i = getSerializedSize();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method int getSerializedSize()>
	//    2    4:istore_2        
		outputstream = ((OutputStream) (CodedOutputStream.newInstance(outputstream, CodedOutputStream.computePreferredBufferSize(CodedOutputStream.computeRawVarint32Size(i) + i))));
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #138 <Method int CodedOutputStream.computeRawVarint32Size(int)>
	//    6   10:iload_2         
	//    7   11:iadd            
	//    8   12:invokestatic    #141 <Method int CodedOutputStream.computePreferredBufferSize(int)>
	//    9   15:invokestatic    #144 <Method CodedOutputStream CodedOutputStream.newInstance(OutputStream, int)>
	//   10   18:astore_1        
		((CodedOutputStream) (outputstream)).writeRawVarint32(i);
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:invokevirtual   #148 <Method void CodedOutputStream.writeRawVarint32(int)>
		writeTo(((CodedOutputStream) (outputstream)));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #103 <Method void writeTo(CodedOutputStream)>
		((CodedOutputStream) (outputstream)).flush();
	//   17   29:aload_1         
	//   18   30:invokevirtual   #151 <Method void CodedOutputStream.flush()>
	//   19   33:return          
	}

	public void writeTo(OutputStream outputstream)
		throws IOException
	{
		outputstream = ((OutputStream) (CodedOutputStream.newInstance(outputstream, CodedOutputStream.computePreferredBufferSize(getSerializedSize()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #93  <Method int getSerializedSize()>
	//    3    5:invokestatic    #141 <Method int CodedOutputStream.computePreferredBufferSize(int)>
	//    4    8:invokestatic    #144 <Method CodedOutputStream CodedOutputStream.newInstance(OutputStream, int)>
	//    5   11:astore_1        
		writeTo(((CodedOutputStream) (outputstream)));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #103 <Method void writeTo(CodedOutputStream)>
		((CodedOutputStream) (outputstream)).flush();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #151 <Method void CodedOutputStream.flush()>
	//   11   21:return          
	}

	protected int memoizedHashCode;
}
