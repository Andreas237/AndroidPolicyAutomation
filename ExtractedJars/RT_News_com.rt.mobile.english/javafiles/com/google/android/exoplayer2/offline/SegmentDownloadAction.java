// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.util.Assertions;
import java.io.*;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.offline:
//			DownloadAction

public abstract class SegmentDownloadAction extends DownloadAction
{
	protected static abstract class SegmentDownloadActionDeserializer extends DownloadAction.Deserializer
	{

		protected abstract DownloadAction createDownloadAction(Uri uri, boolean flag, byte abyte0[], List list);

		public final DownloadAction readFromStream(int i, DataInputStream datainputstream)
			throws IOException
		{
			Uri uri = Uri.parse(datainputstream.readUTF());
		//    0    0:aload_2         
		//    1    1:invokevirtual   #25  <Method String DataInputStream.readUTF()>
		//    2    4:invokestatic    #31  <Method Uri Uri.parse(String)>
		//    3    7:astore          5
			boolean flag = datainputstream.readBoolean();
		//    4    9:aload_2         
		//    5   10:invokevirtual   #35  <Method boolean DataInputStream.readBoolean()>
		//    6   13:istore          4
			byte abyte0[] = new byte[datainputstream.readInt()];
		//    7   15:aload_2         
		//    8   16:invokevirtual   #39  <Method int DataInputStream.readInt()>
		//    9   19:newarray        byte[]
		//   10   21:astore          6
			datainputstream.readFully(abyte0);
		//   11   23:aload_2         
		//   12   24:aload           6
		//   13   26:invokevirtual   #43  <Method void DataInputStream.readFully(byte[])>
			int j = datainputstream.readInt();
		//   14   29:aload_2         
		//   15   30:invokevirtual   #39  <Method int DataInputStream.readInt()>
		//   16   33:istore_3        
			ArrayList arraylist = new ArrayList();
		//   17   34:new             #45  <Class ArrayList>
		//   18   37:dup             
		//   19   38:invokespecial   #48  <Method void ArrayList()>
		//   20   41:astore          7
			for(i = 0; i < j; i++)
		//*  21   43:iconst_0        
		//*  22   44:istore_1        
		//*  23   45:iload_1         
		//*  24   46:iload_3         
		//*  25   47:icmpge          70
				((List) (arraylist)).add(readKey(datainputstream));
		//   26   50:aload           7
		//   27   52:aload_0         
		//   28   53:aload_2         
		//   29   54:invokevirtual   #52  <Method Object readKey(DataInputStream)>
		//   30   57:invokeinterface #58  <Method boolean List.add(Object)>
		//   31   62:pop             

		//   32   63:iload_1         
		//   33   64:iconst_1        
		//   34   65:iadd            
		//   35   66:istore_1        
		//*  36   67:goto            45
			return createDownloadAction(uri, flag, abyte0, ((List) (arraylist)));
		//   37   70:aload_0         
		//   38   71:aload           5
		//   39   73:iload           4
		//   40   75:aload           6
		//   41   77:aload           7
		//   42   79:invokevirtual   #60  <Method DownloadAction createDownloadAction(Uri, boolean, byte[], List)>
		//   43   82:areturn         
		}

		protected abstract Object readKey(DataInputStream datainputstream)
			throws IOException;

		public SegmentDownloadActionDeserializer(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #12  <Method void DownloadAction$Deserializer(String, int)>
		//    4    6:return          
		}
	}


	protected SegmentDownloadAction(String s, int i, Uri uri, boolean flag, byte abyte0[], List list)
	{
		super(s, i, uri, flag, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #17  <Method void DownloadAction(String, int, Uri, boolean, byte[])>
		if(flag)
	//*   7   11:iload           4
	//*   8   13:ifeq            34
		{
			Assertions.checkArgument(list.isEmpty());
	//    9   16:aload           6
	//   10   18:invokeinterface #23  <Method boolean List.isEmpty()>
	//   11   23:invokestatic    #29  <Method void Assertions.checkArgument(boolean)>
			keys = Collections.emptyList();
	//   12   26:aload_0         
	//   13   27:invokestatic    #35  <Method List Collections.emptyList()>
	//   14   30:putfield        #37  <Field List keys>
			return;
	//   15   33:return          
		} else
		{
			s = ((String) (new ArrayList(((java.util.Collection) (list)))));
	//   16   34:new             #39  <Class ArrayList>
	//   17   37:dup             
	//   18   38:aload           6
	//   19   40:invokespecial   #42  <Method void ArrayList(java.util.Collection)>
	//   20   43:astore_1        
			Collections.sort(((List) (s)));
	//   21   44:aload_1         
	//   22   45:invokestatic    #46  <Method void Collections.sort(List)>
			keys = Collections.unmodifiableList(((List) (s)));
	//   23   48:aload_0         
	//   24   49:aload_1         
	//   25   50:invokestatic    #50  <Method List Collections.unmodifiableList(List)>
	//   26   53:putfield        #37  <Field List keys>
			return;
	//   27   56:return          
		}
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
		if(!super.equals(obj))
	//*   5    7:aload_0         
	//*   6    8:aload_1         
	//*   7    9:invokespecial   #58  <Method boolean DownloadAction.equals(Object)>
	//*   8   12:ifne            17
		{
			return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
		} else
		{
			obj = ((Object) ((SegmentDownloadAction)obj));
	//   11   17:aload_1         
	//   12   18:checkcast       #2   <Class SegmentDownloadAction>
	//   13   21:astore_1        
			return keys.equals(((Object) (((SegmentDownloadAction) (obj)).keys)));
	//   14   22:aload_0         
	//   15   23:getfield        #37  <Field List keys>
	//   16   26:aload_1         
	//   17   27:getfield        #37  <Field List keys>
	//   18   30:invokeinterface #59  <Method boolean List.equals(Object)>
	//   19   35:ireturn         
		}
	}

	public int hashCode()
	{
		return 31 * super.hashCode() + keys.hashCode();
	//    0    0:bipush          31
	//    1    2:aload_0         
	//    2    3:invokespecial   #63  <Method int DownloadAction.hashCode()>
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #37  <Field List keys>
	//    6   11:invokeinterface #64  <Method int List.hashCode()>
	//    7   16:iadd            
	//    8   17:ireturn         
	}

	protected abstract void writeKey(DataOutputStream dataoutputstream, Comparable comparable)
		throws IOException;

	public final void writeToStream(DataOutputStream dataoutputstream)
		throws IOException
	{
		dataoutputstream.writeUTF(uri.toString());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #74  <Field Uri uri>
	//    3    5:invokevirtual   #80  <Method String Uri.toString()>
	//    4    8:invokevirtual   #86  <Method void DataOutputStream.writeUTF(String)>
		dataoutputstream.writeBoolean(isRemoveAction);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #90  <Field boolean isRemoveAction>
	//    8   16:invokevirtual   #93  <Method void DataOutputStream.writeBoolean(boolean)>
		byte abyte0[] = data;
	//    9   19:aload_0         
	//   10   20:getfield        #97  <Field byte[] data>
	//   11   23:astore_3        
		int i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_2        
		dataoutputstream.writeInt(abyte0.length);
	//   14   26:aload_1         
	//   15   27:aload_3         
	//   16   28:arraylength     
	//   17   29:invokevirtual   #101 <Method void DataOutputStream.writeInt(int)>
		dataoutputstream.write(data);
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:getfield        #97  <Field byte[] data>
	//   21   37:invokevirtual   #105 <Method void DataOutputStream.write(byte[])>
		dataoutputstream.writeInt(keys.size());
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #37  <Field List keys>
	//   25   45:invokeinterface #108 <Method int List.size()>
	//   26   50:invokevirtual   #101 <Method void DataOutputStream.writeInt(int)>
		for(; i < keys.size(); i++)
	//*  27   53:iload_2         
	//*  28   54:aload_0         
	//*  29   55:getfield        #37  <Field List keys>
	//*  30   58:invokeinterface #108 <Method int List.size()>
	//*  31   63:icmpge          91
			writeKey(dataoutputstream, (Comparable)keys.get(i));
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:aload_0         
	//   35   69:getfield        #37  <Field List keys>
	//   36   72:iload_2         
	//   37   73:invokeinterface #112 <Method Object List.get(int)>
	//   38   78:checkcast       #114 <Class Comparable>
	//   39   81:invokevirtual   #116 <Method void writeKey(DataOutputStream, Comparable)>

	//   40   84:iload_2         
	//   41   85:iconst_1        
	//   42   86:iadd            
	//   43   87:istore_2        
	//*  44   88:goto            53
	//   45   91:return          
	}

	public final List keys;
}
