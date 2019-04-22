// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder

public class DataBufferRef
{

	public DataBufferRef(DataHolder dataholder, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mDataHolder = (DataHolder)Preconditions.checkNotNull(((Object) (dataholder)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #22  <Class DataHolder>
	//    6   12:putfield        #24  <Field DataHolder mDataHolder>
		setDataRow(i);
	//    7   15:aload_0         
	//    8   16:iload_2         
	//    9   17:invokevirtual   #28  <Method void setDataRow(int)>
	//   10   20:return          
	}

	protected void copyToBuffer(String s, CharArrayBuffer chararraybuffer)
	{
		mDataHolder.copyToBuffer(s, mDataRow, zznj, chararraybuffer);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #38  <Method void DataHolder.copyToBuffer(String, int, int, CharArrayBuffer)>
	//    9   17:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof DataBufferRef)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DataBufferRef>
	//*   2    4:ifeq            65
		{
			obj = ((Object) ((DataBufferRef)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class DataBufferRef>
	//    5   11:astore_1        
			if(Objects.equal(((Object) (Integer.valueOf(((DataBufferRef) (obj)).mDataRow))), ((Object) (Integer.valueOf(mDataRow)))) && Objects.equal(((Object) (Integer.valueOf(((DataBufferRef) (obj)).zznj))), ((Object) (Integer.valueOf(zznj)))) && ((DataBufferRef) (obj)).mDataHolder == mDataHolder)
	//*   6   12:aload_1         
	//*   7   13:getfield        #33  <Field int mDataRow>
	//*   8   16:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//*   9   19:aload_0         
	//*  10   20:getfield        #33  <Field int mDataRow>
	//*  11   23:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//*  12   26:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
	//*  13   29:ifeq            65
	//*  14   32:aload_1         
	//*  15   33:getfield        #35  <Field int zznj>
	//*  16   36:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//*  17   39:aload_0         
	//*  18   40:getfield        #35  <Field int zznj>
	//*  19   43:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//*  20   46:invokestatic    #52  <Method boolean Objects.equal(Object, Object)>
	//*  21   49:ifeq            65
	//*  22   52:aload_1         
	//*  23   53:getfield        #24  <Field DataHolder mDataHolder>
	//*  24   56:aload_0         
	//*  25   57:getfield        #24  <Field DataHolder mDataHolder>
	//*  26   60:if_acmpne       65
				return true;
	//   27   63:iconst_1        
	//   28   64:ireturn         
		}
		return false;
	//   29   65:iconst_0        
	//   30   66:ireturn         
	}

	protected boolean getBoolean(String s)
	{
		return mDataHolder.getBoolean(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #57  <Method boolean DataHolder.getBoolean(String, int, int)>
	//    8   16:ireturn         
	}

	protected byte[] getByteArray(String s)
	{
		return mDataHolder.getByteArray(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #62  <Method byte[] DataHolder.getByteArray(String, int, int)>
	//    8   16:areturn         
	}

	protected int getDataRow()
	{
		return mDataRow;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mDataRow>
	//    2    4:ireturn         
	}

	protected double getDouble(String s)
	{
		return mDataHolder.getDouble(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #69  <Method double DataHolder.getDouble(String, int, int)>
	//    8   16:dreturn         
	}

	protected float getFloat(String s)
	{
		return mDataHolder.getFloat(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #74  <Method float DataHolder.getFloat(String, int, int)>
	//    8   16:freturn         
	}

	protected int getInteger(String s)
	{
		return mDataHolder.getInteger(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #79  <Method int DataHolder.getInteger(String, int, int)>
	//    8   16:ireturn         
	}

	protected long getLong(String s)
	{
		return mDataHolder.getLong(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #84  <Method long DataHolder.getLong(String, int, int)>
	//    8   16:lreturn         
	}

	protected String getString(String s)
	{
		return mDataHolder.getString(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #89  <Method String DataHolder.getString(String, int, int)>
	//    8   16:areturn         
	}

	public boolean hasColumn(String s)
	{
		return mDataHolder.hasColumn(s);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #92  <Method boolean DataHolder.hasColumn(String)>
	//    4    8:ireturn         
	}

	protected boolean hasNull(String s)
	{
		return mDataHolder.hasNull(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #95  <Method boolean DataHolder.hasNull(String, int, int)>
	//    8   16:ireturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(mDataRow), Integer.valueOf(zznj), mDataHolder
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field int mDataRow>
	//    6   10:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #35  <Field int zznj>
	//   12   20:invokestatic    #46  <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #24  <Field DataHolder mDataHolder>
	//   18   30:aastore         
	//   19   31:invokestatic    #99  <Method int Objects.hashCode(Object[])>
	//   20   34:ireturn         
	}

	public boolean isDataValid()
	{
		return !mDataHolder.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:invokevirtual   #104 <Method boolean DataHolder.isClosed()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	protected Uri parseUri(String s)
	{
		return mDataHolder.parseUri(s, mDataRow, zznj);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field DataHolder mDataHolder>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field int mDataRow>
	//    5    9:aload_0         
	//    6   10:getfield        #35  <Field int zznj>
	//    7   13:invokevirtual   #109 <Method Uri DataHolder.parseUri(String, int, int)>
	//    8   16:areturn         
	}

	protected void setDataRow(int i)
	{
		boolean flag;
		if(i >= 0 && i < mDataHolder.getCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            20
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #24  <Field DataHolder mDataHolder>
	//*   5    9:invokevirtual   #112 <Method int DataHolder.getCount()>
	//*   6   12:icmpge          20
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			flag = false;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		Preconditions.checkState(flag);
	//   12   22:iload_2         
	//   13   23:invokestatic    #116 <Method void Preconditions.checkState(boolean)>
		mDataRow = i;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:putfield        #33  <Field int mDataRow>
		zznj = mDataHolder.getWindowIndex(mDataRow);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:getfield        #24  <Field DataHolder mDataHolder>
	//   20   36:aload_0         
	//   21   37:getfield        #33  <Field int mDataRow>
	//   22   40:invokevirtual   #120 <Method int DataHolder.getWindowIndex(int)>
	//   23   43:putfield        #35  <Field int zznj>
	//   24   46:return          
	}

	protected final DataHolder mDataHolder;
	protected int mDataRow;
	private int zznj;
}
