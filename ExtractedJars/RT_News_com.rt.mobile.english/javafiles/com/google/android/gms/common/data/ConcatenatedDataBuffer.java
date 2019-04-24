// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer, ExclusionFilterable, TextFilterable, DataBufferIterator

public final class ConcatenatedDataBuffer
	implements DataBuffer, ExclusionFilterable, TextFilterable
{

	public ConcatenatedDataBuffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zznf = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field ArrayList zznf>
		zzng = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #27  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void ArrayList()>
	//   11   23:putfield        #32  <Field ArrayList zzng>
	//   12   26:return          
	}

	public ConcatenatedDataBuffer(DataBuffer databuffer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		zznf = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #27  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #28  <Method void ArrayList()>
	//    6   12:putfield        #30  <Field ArrayList zznf>
		zzng = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #27  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void ArrayList()>
	//   11   23:putfield        #32  <Field ArrayList zzng>
		append(databuffer);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokevirtual   #37  <Method void append(DataBuffer)>
	//   15   31:return          
	}

	public static ConcatenatedDataBuffer extend(ConcatenatedDataBuffer concatenateddatabuffer, DataBuffer databuffer)
	{
		ConcatenatedDataBuffer concatenateddatabuffer1 = new ConcatenatedDataBuffer();
	//    0    0:new             #2   <Class ConcatenatedDataBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ConcatenatedDataBuffer()>
	//    3    7:astore          4
		concatenateddatabuffer = ((ConcatenatedDataBuffer) ((ArrayList)concatenateddatabuffer.zznf));
	//    4    9:aload_0         
	//    5   10:getfield        #30  <Field ArrayList zznf>
	//    6   13:checkcast       #27  <Class ArrayList>
	//    7   16:astore_0        
		int j = ((ArrayList) (concatenateddatabuffer)).size();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #46  <Method int ArrayList.size()>
	//   10   21:istore_3        
		for(int i = 0; i < j;)
	//*  11   22:iconst_0        
	//*  12   23:istore_2        
	//*  13   24:iload_2         
	//*  14   25:iload_3         
	//*  15   26:icmpge          53
		{
			Object obj = ((ArrayList) (concatenateddatabuffer)).get(i);
	//   16   29:aload_0         
	//   17   30:iload_2         
	//   18   31:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   19   34:astore          5
			i++;
	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_2        
			concatenateddatabuffer1.append((DataBuffer)obj);
	//   24   40:aload           4
	//   25   42:aload           5
	//   26   44:checkcast       #7   <Class DataBuffer>
	//   27   47:invokevirtual   #37  <Method void append(DataBuffer)>
		}

	//*  28   50:goto            24
		concatenateddatabuffer1.append(databuffer);
	//   29   53:aload           4
	//   30   55:aload_1         
	//   31   56:invokevirtual   #37  <Method void append(DataBuffer)>
		return concatenateddatabuffer1;
	//   32   59:aload           4
	//   33   61:areturn         
	}

	public final void append(DataBuffer databuffer)
	{
		if(databuffer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		this;
	//    3    5:aload_0         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Bundle bundle;
		if(!zznf.isEmpty())
			break MISSING_BLOCK_LABEL_54;
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field ArrayList zznf>
	//    7   11:invokevirtual   #55  <Method boolean ArrayList.isEmpty()>
	//    8   14:ifeq            54
		mBundle = new Bundle();
	//    9   17:aload_0         
	//   10   18:new             #57  <Class Bundle>
	//   11   21:dup             
	//   12   22:invokespecial   #58  <Method void Bundle()>
	//   13   25:putfield        #60  <Field Bundle mBundle>
		bundle = databuffer.getMetadata();
	//   14   28:aload_1         
	//   15   29:invokeinterface #64  <Method Bundle DataBuffer.getMetadata()>
	//   16   34:astore_2        
		if(bundle == null)
			break MISSING_BLOCK_LABEL_54;
	//   17   35:aload_2         
	//   18   36:ifnull          54
		mBundle.putString("prev_page_token", bundle.getString("prev_page_token"));
	//   19   39:aload_0         
	//   20   40:getfield        #60  <Field Bundle mBundle>
	//   21   43:ldc1            #66  <String "prev_page_token">
	//   22   45:aload_2         
	//   23   46:ldc1            #66  <String "prev_page_token">
	//   24   48:invokevirtual   #70  <Method String Bundle.getString(String)>
	//   25   51:invokevirtual   #74  <Method void Bundle.putString(String, String)>
		zznf.add(((Object) (databuffer)));
	//   26   54:aload_0         
	//   27   55:getfield        #30  <Field ArrayList zznf>
	//   28   58:aload_1         
	//   29   59:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   30   62:pop             
		computeCounts();
	//   31   63:aload_0         
	//   32   64:invokevirtual   #81  <Method void computeCounts()>
		databuffer = ((DataBuffer) (databuffer.getMetadata()));
	//   33   67:aload_1         
	//   34   68:invokeinterface #64  <Method Bundle DataBuffer.getMetadata()>
	//   35   73:astore_1        
		if(databuffer == null)
			break MISSING_BLOCK_LABEL_96;
	//   36   74:aload_1         
	//   37   75:ifnull          96
		mBundle.putString("next_page_token", ((Bundle) (databuffer)).getString("next_page_token"));
	//   38   78:aload_0         
	//   39   79:getfield        #60  <Field Bundle mBundle>
	//   40   82:ldc1            #83  <String "next_page_token">
	//   41   84:aload_1         
	//   42   85:ldc1            #83  <String "next_page_token">
	//   43   87:invokevirtual   #70  <Method String Bundle.getString(String)>
	//   44   90:invokevirtual   #74  <Method void Bundle.putString(String, String)>
		break MISSING_BLOCK_LABEL_105;
	//   45   93:goto            105
		mBundle.remove("next_page_token");
	//   46   96:aload_0         
	//   47   97:getfield        #60  <Field Bundle mBundle>
	//   48  100:ldc1            #83  <String "next_page_token">
	//   49  102:invokevirtual   #87  <Method void Bundle.remove(String)>
		this;
	//   50  105:aload_0         
		JVM INSTR monitorexit ;
	//   51  106:monitorexit     
		return;
	//   52  107:return          
		databuffer;
	//   53  108:astore_1        
		this;
	//   54  109:aload_0         
		JVM INSTR monitorexit ;
	//   55  110:monitorexit     
		throw databuffer;
	//   56  111:aload_1         
	//   57  112:athrow          
	}

	public final void clearFilters()
	{
		int j = zznf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList zznf>
	//    2    4:invokevirtual   #46  <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          50
		{
			DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field ArrayList zznf>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #7   <Class DataBuffer>
	//   14   26:astore_3        
			if(databuffer instanceof ExclusionFilterable)
	//*  15   27:aload_3         
	//*  16   28:instanceof      #9   <Class ExclusionFilterable>
	//*  17   31:ifeq            43
				((ExclusionFilterable)databuffer).clearFilters();
	//   18   34:aload_3         
	//   19   35:checkcast       #9   <Class ExclusionFilterable>
	//   20   38:invokeinterface #90  <Method void ExclusionFilterable.clearFilters()>
		}

	//   21   43:iload_1         
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:istore_1        
	//*  25   47:goto            10
		computeCounts();
	//   26   50:aload_0         
	//   27   51:invokevirtual   #81  <Method void computeCounts()>
	//   28   54:return          
	}

	public final void close()
	{
		release();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method void release()>
	//    2    4:return          
	}

	public final void computeCounts()
	{
		zzng.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ArrayList zzng>
	//    2    4:invokevirtual   #99  <Method void ArrayList.clear()>
		int l = zznf.size();
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field ArrayList zznf>
	//    5   11:invokevirtual   #46  <Method int ArrayList.size()>
	//    6   14:istore          4
		int i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_1        
		int j;
		int k;
		for(j = 0; i < l; j = k)
	//*   9   18:iconst_0        
	//*  10   19:istore_2        
	//*  11   20:iload_1         
	//*  12   21:iload           4
	//*  13   23:icmpge          77
		{
			DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//   14   26:aload_0         
	//   15   27:getfield        #30  <Field ArrayList zznf>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   18   34:checkcast       #7   <Class DataBuffer>
	//   19   37:astore          5
			k = j;
	//   20   39:iload_2         
	//   21   40:istore_3        
			if(databuffer != null)
	//*  22   41:aload           5
	//*  23   43:ifnull          56
				k = j + databuffer.getCount();
	//   24   46:iload_2         
	//   25   47:aload           5
	//   26   49:invokeinterface #102 <Method int DataBuffer.getCount()>
	//   27   54:iadd            
	//   28   55:istore_3        
			zzng.add(((Object) (Integer.valueOf(k))));
	//   29   56:aload_0         
	//   30   57:getfield        #32  <Field ArrayList zzng>
	//   31   60:iload_3         
	//   32   61:invokestatic    #108 <Method Integer Integer.valueOf(int)>
	//   33   64:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   34   67:pop             
			i++;
	//   35   68:iload_1         
	//   36   69:iconst_1        
	//   37   70:iadd            
	//   38   71:istore_1        
		}

	//   39   72:iload_3         
	//   40   73:istore_2        
	//*  41   74:goto            20
		zznh = j;
	//   42   77:aload_0         
	//   43   78:iload_2         
	//   44   79:putfield        #110 <Field int zznh>
	//   45   82:return          
	}

	public final void filterOut(String s)
	{
		int j = zznf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList zznf>
	//    2    4:invokevirtual   #46  <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          54
		{
			DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field ArrayList zznf>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #7   <Class DataBuffer>
	//   14   26:astore          4
			if(databuffer instanceof ExclusionFilterable)
	//*  15   28:aload           4
	//*  16   30:instanceof      #9   <Class ExclusionFilterable>
	//*  17   33:ifeq            47
				((ExclusionFilterable)databuffer).filterOut(s);
	//   18   36:aload           4
	//   19   38:checkcast       #9   <Class ExclusionFilterable>
	//   20   41:aload_1         
	//   21   42:invokeinterface #113 <Method void ExclusionFilterable.filterOut(String)>
		}

	//   22   47:iload_2         
	//   23   48:iconst_1        
	//   24   49:iadd            
	//   25   50:istore_2        
	//*  26   51:goto            10
		computeCounts();
	//   27   54:aload_0         
	//   28   55:invokevirtual   #81  <Method void computeCounts()>
	//   29   58:return          
	}

	public final Object get(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		int k = zznf.size();
	//    4    4:aload_0         
	//    5    5:getfield        #30  <Field ArrayList zznf>
	//    6    8:invokevirtual   #46  <Method int ArrayList.size()>
	//    7   11:istore_3        
_L2:
		if(j >= k)
			break MISSING_BLOCK_LABEL_83;
	//    8   12:iload_2         
	//    9   13:iload_3         
	//   10   14:icmpge          83
		int l = ((Integer)zzng.get(j)).intValue();
	//   11   17:aload_0         
	//   12   18:getfield        #32  <Field ArrayList zzng>
	//   13   21:iload_2         
	//   14   22:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #104 <Class Integer>
	//   16   28:invokevirtual   #116 <Method int Integer.intValue()>
	//   17   31:istore          4
		if(i >= l)
			break MISSING_BLOCK_LABEL_94;
	//   18   33:iload_1         
	//   19   34:iload           4
	//   20   36:icmpge          94
		Object obj = ((Object) ((DataBuffer)zznf.get(j)));
	//   21   39:aload_0         
	//   22   40:getfield        #30  <Field ArrayList zznf>
	//   23   43:iload_2         
	//   24   44:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   25   47:checkcast       #7   <Class DataBuffer>
	//   26   50:astore          5
		if(obj == null)
			break MISSING_BLOCK_LABEL_94;
	//   27   52:aload           5
	//   28   54:ifnull          94
		obj = ((DataBuffer) (obj)).get((i - l) + ((DataBuffer) (obj)).getCount());
	//   29   57:aload           5
	//   30   59:iload_1         
	//   31   60:iload           4
	//   32   62:isub            
	//   33   63:aload           5
	//   34   65:invokeinterface #102 <Method int DataBuffer.getCount()>
	//   35   70:iadd            
	//   36   71:invokeinterface #117 <Method Object DataBuffer.get(int)>
	//   37   76:astore          5
		this;
	//   38   78:aload_0         
		JVM INSTR monitorexit ;
	//   39   79:monitorexit     
		return obj;
	//   40   80:aload           5
	//   41   82:areturn         
		this;
	//   42   83:aload_0         
		JVM INSTR monitorexit ;
	//   43   84:monitorexit     
		return ((Object) (null));
	//   44   85:aconst_null     
	//   45   86:areturn         
		Exception exception;
		exception;
	//   46   87:astore          5
		this;
	//   47   89:aload_0         
		JVM INSTR monitorexit ;
	//   48   90:monitorexit     
		throw exception;
	//   49   91:aload           5
	//   50   93:athrow          
		j++;
	//   51   94:iload_2         
	//   52   95:iconst_1        
	//   53   96:iadd            
	//   54   97:istore_2        
		if(true) goto _L2; else goto _L1
	//   55   98:goto            12
_L1:
	}

	public final int getCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = zznh;
	//    2    2:aload_0         
	//    3    3:getfield        #110 <Field int zznh>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
		this;
	//   10   12:aload_0         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public final Bundle getMetadata()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Bundle bundle = mBundle;
	//    2    2:aload_0         
	//    3    3:getfield        #60  <Field Bundle mBundle>
	//    4    6:astore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return bundle;
	//    7    9:aload_1         
	//    8   10:areturn         
		Exception exception;
		exception;
	//    9   11:astore_1        
		this;
	//   10   12:aload_0         
		JVM INSTR monitorexit ;
	//   11   13:monitorexit     
		throw exception;
	//   12   14:aload_1         
	//   13   15:athrow          
	}

	public final boolean isClosed()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new DataBufferIterator(((DataBuffer) (this)))));
	//    0    0:new             #123 <Class DataBufferIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #125 <Method void DataBufferIterator(DataBuffer)>
	//    4    8:areturn         
	}

	public final void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_1        
		int j = zznf.size();
	//    4    4:aload_0         
	//    5    5:getfield        #30  <Field ArrayList zznf>
	//    6    8:invokevirtual   #46  <Method int ArrayList.size()>
	//    7   11:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_42;
	//    8   12:iload_1         
	//    9   13:iload_2         
	//   10   14:icmpge          42
		DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//   11   17:aload_0         
	//   12   18:getfield        #30  <Field ArrayList zznf>
	//   13   21:iload_1         
	//   14   22:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   15   25:checkcast       #7   <Class DataBuffer>
	//   16   28:astore_3        
		if(databuffer == null)
			break MISSING_BLOCK_LABEL_69;
	//   17   29:aload_3         
	//   18   30:ifnull          69
		databuffer.release();
	//   19   33:aload_3         
	//   20   34:invokeinterface #127 <Method void DataBuffer.release()>
		break MISSING_BLOCK_LABEL_69;
	//   21   39:goto            69
		zznf.clear();
	//   22   42:aload_0         
	//   23   43:getfield        #30  <Field ArrayList zznf>
	//   24   46:invokevirtual   #99  <Method void ArrayList.clear()>
		zzng.clear();
	//   25   49:aload_0         
	//   26   50:getfield        #32  <Field ArrayList zzng>
	//   27   53:invokevirtual   #99  <Method void ArrayList.clear()>
		mBundle = null;
	//   28   56:aload_0         
	//   29   57:aconst_null     
	//   30   58:putfield        #60  <Field Bundle mBundle>
		this;
	//   31   61:aload_0         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		return;
	//   33   63:return          
		Exception exception;
		exception;
	//   34   64:astore_3        
		this;
	//   35   65:aload_0         
		JVM INSTR monitorexit ;
	//   36   66:monitorexit     
		throw exception;
	//   37   67:aload_3         
	//   38   68:athrow          
		i++;
	//   39   69:iload_1         
	//   40   70:iconst_1        
	//   41   71:iadd            
	//   42   72:istore_1        
		if(true) goto _L2; else goto _L1
	//   43   73:goto            12
_L1:
	}

	public final void setFilterTerm(Context context, TextFilterable.StringFilter stringfilter, String s)
	{
		int j = zznf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList zznf>
	//    2    4:invokevirtual   #46  <Method int ArrayList.size()>
	//    3    7:istore          5
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:iload           5
	//*   8   16:icmpge          63
		{
			DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field ArrayList zznf>
	//   11   23:iload           4
	//   12   25:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   13   28:checkcast       #7   <Class DataBuffer>
	//   14   31:astore          6
			if(databuffer instanceof TextFilterable)
	//*  15   33:aload           6
	//*  16   35:instanceof      #11  <Class TextFilterable>
	//*  17   38:ifeq            54
				((TextFilterable)databuffer).setFilterTerm(context, stringfilter, s);
	//   18   41:aload           6
	//   19   43:checkcast       #11  <Class TextFilterable>
	//   20   46:aload_1         
	//   21   47:aload_2         
	//   22   48:aload_3         
	//   23   49:invokeinterface #131 <Method void TextFilterable.setFilterTerm(Context, TextFilterable$StringFilter, String)>
		}

	//   24   54:iload           4
	//   25   56:iconst_1        
	//   26   57:iadd            
	//   27   58:istore          4
	//*  28   60:goto            12
		computeCounts();
	//   29   63:aload_0         
	//   30   64:invokevirtual   #81  <Method void computeCounts()>
	//   31   67:return          
	}

	public final void setFilterTerm(Context context, String s)
	{
		int j = zznf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList zznf>
	//    2    4:invokevirtual   #46  <Method int ArrayList.size()>
	//    3    7:istore          4
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore_3        
	//*   6   11:iload_3         
	//*   7   12:iload           4
	//*   8   14:icmpge          57
		{
			DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//    9   17:aload_0         
	//   10   18:getfield        #30  <Field ArrayList zznf>
	//   11   21:iload_3         
	//   12   22:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   13   25:checkcast       #7   <Class DataBuffer>
	//   14   28:astore          5
			if(databuffer instanceof TextFilterable)
	//*  15   30:aload           5
	//*  16   32:instanceof      #11  <Class TextFilterable>
	//*  17   35:ifeq            50
				((TextFilterable)databuffer).setFilterTerm(context, s);
	//   18   38:aload           5
	//   19   40:checkcast       #11  <Class TextFilterable>
	//   20   43:aload_1         
	//   21   44:aload_2         
	//   22   45:invokeinterface #134 <Method void TextFilterable.setFilterTerm(Context, String)>
		}

	//   23   50:iload_3         
	//   24   51:iconst_1        
	//   25   52:iadd            
	//   26   53:istore_3        
	//*  27   54:goto            11
		computeCounts();
	//   28   57:aload_0         
	//   29   58:invokevirtual   #81  <Method void computeCounts()>
	//   30   61:return          
	}

	public final Iterator singleRefIterator()
	{
		return iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #137 <Method Iterator iterator()>
	//    2    4:areturn         
	}

	public final void unfilter(String s)
	{
		int j = zznf.size();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ArrayList zznf>
	//    2    4:invokevirtual   #46  <Method int ArrayList.size()>
	//    3    7:istore_3        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          54
		{
			DataBuffer databuffer = (DataBuffer)zznf.get(i);
	//    9   15:aload_0         
	//   10   16:getfield        #30  <Field ArrayList zznf>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #50  <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #7   <Class DataBuffer>
	//   14   26:astore          4
			if(databuffer instanceof ExclusionFilterable)
	//*  15   28:aload           4
	//*  16   30:instanceof      #9   <Class ExclusionFilterable>
	//*  17   33:ifeq            47
				((ExclusionFilterable)databuffer).unfilter(s);
	//   18   36:aload           4
	//   19   38:checkcast       #9   <Class ExclusionFilterable>
	//   20   41:aload_1         
	//   21   42:invokeinterface #140 <Method void ExclusionFilterable.unfilter(String)>
		}

	//   22   47:iload_2         
	//   23   48:iconst_1        
	//   24   49:iadd            
	//   25   50:istore_2        
	//*  26   51:goto            10
		computeCounts();
	//   27   54:aload_0         
	//   28   55:invokevirtual   #81  <Method void computeCounts()>
	//   29   58:return          
	}

	private Bundle mBundle;
	private final ArrayList zznf;
	private final ArrayList zzng;
	private int zznh;
}
