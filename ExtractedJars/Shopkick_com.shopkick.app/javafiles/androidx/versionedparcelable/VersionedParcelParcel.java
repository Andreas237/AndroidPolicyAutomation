// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.versionedparcelable;

import android.os.*;
import android.util.SparseIntArray;

// Referenced classes of package androidx.versionedparcelable:
//			VersionedParcel

class VersionedParcelParcel extends VersionedParcel
{

	VersionedParcelParcel(Parcel parcel)
	{
		this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #33  <Method int Parcel.dataPosition()>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method int Parcel.dataSize()>
	//    6   10:ldc1            #38  <String "">
	//    7   12:invokespecial   #41  <Method void VersionedParcelParcel(Parcel, int, int, String)>
	//    8   15:return          
	}

	VersionedParcelParcel(Parcel parcel, int i, int j, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void VersionedParcel()>
		mPositionLookup = new SparseIntArray();
	//    2    4:aload_0         
	//    3    5:new             #47  <Class SparseIntArray>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void SparseIntArray()>
	//    6   12:putfield        #50  <Field SparseIntArray mPositionLookup>
		mCurrentField = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #52  <Field int mCurrentField>
		mNextRead = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #54  <Field int mNextRead>
		mParcel = parcel;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #56  <Field Parcel mParcel>
		mOffset = i;
	//   16   30:aload_0         
	//   17   31:iload_2         
	//   18   32:putfield        #58  <Field int mOffset>
		mEnd = j;
	//   19   35:aload_0         
	//   20   36:iload_3         
	//   21   37:putfield        #60  <Field int mEnd>
		mNextRead = mOffset;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #58  <Field int mOffset>
	//   25   45:putfield        #54  <Field int mNextRead>
		mPrefix = s;
	//   26   48:aload_0         
	//   27   49:aload           4
	//   28   51:putfield        #62  <Field String mPrefix>
	//   29   54:return          
	}

	private int readUntilField(int i)
	{
		do
		{
			int j = mNextRead;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int mNextRead>
	//    2    4:istore_2        
			if(j < mEnd)
	//*   3    5:iload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #60  <Field int mEnd>
	//*   6   10:icmpge          60
			{
				mParcel.setDataPosition(j);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Parcel mParcel>
	//    9   17:iload_2         
	//   10   18:invokevirtual   #68  <Method void Parcel.setDataPosition(int)>
				j = mParcel.readInt();
	//   11   21:aload_0         
	//   12   22:getfield        #56  <Field Parcel mParcel>
	//   13   25:invokevirtual   #71  <Method int Parcel.readInt()>
	//   14   28:istore_2        
				int k = mParcel.readInt();
	//   15   29:aload_0         
	//   16   30:getfield        #56  <Field Parcel mParcel>
	//   17   33:invokevirtual   #71  <Method int Parcel.readInt()>
	//   18   36:istore_3        
				mNextRead = mNextRead + j;
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #54  <Field int mNextRead>
	//   22   42:iload_2         
	//   23   43:iadd            
	//   24   44:putfield        #54  <Field int mNextRead>
				if(k == i)
	//*  25   47:iload_3         
	//*  26   48:iload_1         
	//*  27   49:icmpne          0
					return mParcel.dataPosition();
	//   28   52:aload_0         
	//   29   53:getfield        #56  <Field Parcel mParcel>
	//   30   56:invokevirtual   #33  <Method int Parcel.dataPosition()>
	//   31   59:ireturn         
			} else
			{
				return -1;
	//   32   60:iconst_m1       
	//   33   61:ireturn         
			}
		} while(true);
	}

	public void closeField()
	{
		int i = mCurrentField;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int mCurrentField>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            52
		{
			i = mPositionLookup.get(i);
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field SparseIntArray mPositionLookup>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #75  <Method int SparseIntArray.get(int)>
	//    9   17:istore_1        
			int j = mParcel.dataPosition();
	//   10   18:aload_0         
	//   11   19:getfield        #56  <Field Parcel mParcel>
	//   12   22:invokevirtual   #33  <Method int Parcel.dataPosition()>
	//   13   25:istore_2        
			mParcel.setDataPosition(i);
	//   14   26:aload_0         
	//   15   27:getfield        #56  <Field Parcel mParcel>
	//   16   30:iload_1         
	//   17   31:invokevirtual   #68  <Method void Parcel.setDataPosition(int)>
			mParcel.writeInt(j - i);
	//   18   34:aload_0         
	//   19   35:getfield        #56  <Field Parcel mParcel>
	//   20   38:iload_2         
	//   21   39:iload_1         
	//   22   40:isub            
	//   23   41:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			mParcel.setDataPosition(j);
	//   24   44:aload_0         
	//   25   45:getfield        #56  <Field Parcel mParcel>
	//   26   48:iload_2         
	//   27   49:invokevirtual   #68  <Method void Parcel.setDataPosition(int)>
		}
	//   28   52:return          
	}

	protected VersionedParcel createSubParcel()
	{
		Parcel parcel = mParcel;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:astore          4
		int k = parcel.dataPosition();
	//    3    6:aload           4
	//    4    8:invokevirtual   #33  <Method int Parcel.dataPosition()>
	//    5   11:istore_3        
		int j = mNextRead;
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field int mNextRead>
	//    8   16:istore_2        
		int i = j;
	//    9   17:iload_2         
	//   10   18:istore_1        
		if(j == mOffset)
	//*  11   19:iload_2         
	//*  12   20:aload_0         
	//*  13   21:getfield        #58  <Field int mOffset>
	//*  14   24:icmpne          32
			i = mEnd;
	//   15   27:aload_0         
	//   16   28:getfield        #60  <Field int mEnd>
	//   17   31:istore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   32:new             #82  <Class StringBuilder>
	//   19   35:dup             
	//   20   36:invokespecial   #83  <Method void StringBuilder()>
	//   21   39:astore          5
		stringbuilder.append(mPrefix);
	//   22   41:aload           5
	//   23   43:aload_0         
	//   24   44:getfield        #62  <Field String mPrefix>
	//   25   47:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
		stringbuilder.append("  ");
	//   27   51:aload           5
	//   28   53:ldc1            #89  <String "  ">
	//   29   55:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		return ((VersionedParcel) (new VersionedParcelParcel(parcel, k, i, stringbuilder.toString())));
	//   31   59:new             #2   <Class VersionedParcelParcel>
	//   32   62:dup             
	//   33   63:aload           4
	//   34   65:iload_3         
	//   35   66:iload_1         
	//   36   67:aload           5
	//   37   69:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   38   72:invokespecial   #41  <Method void VersionedParcelParcel(Parcel, int, int, String)>
	//   39   75:areturn         
	}

	public boolean readBoolean()
	{
		return mParcel.readInt() != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #71  <Method int Parcel.readInt()>
	//    3    7:ifeq            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public Bundle readBundle()
	{
		return mParcel.readBundle(((Object)this).getClass().getClassLoader());
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #103 <Method Class Object.getClass()>
	//    4    8:invokevirtual   #109 <Method ClassLoader Class.getClassLoader()>
	//    5   11:invokevirtual   #112 <Method Bundle Parcel.readBundle(ClassLoader)>
	//    6   14:areturn         
	}

	public byte[] readByteArray()
	{
		int i = mParcel.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #71  <Method int Parcel.readInt()>
	//    3    7:istore_1        
		if(i < 0)
	//*   4    8:iload_1         
	//*   5    9:ifge            14
		{
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		} else
		{
			byte abyte0[] = new byte[i];
	//    8   14:iload_1         
	//    9   15:newarray        byte[]
	//   10   17:astore_2        
			mParcel.readByteArray(abyte0);
	//   11   18:aload_0         
	//   12   19:getfield        #56  <Field Parcel mParcel>
	//   13   22:aload_2         
	//   14   23:invokevirtual   #117 <Method void Parcel.readByteArray(byte[])>
			return abyte0;
	//   15   26:aload_2         
	//   16   27:areturn         
		}
	}

	public double readDouble()
	{
		return mParcel.readDouble();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #121 <Method double Parcel.readDouble()>
	//    3    7:dreturn         
	}

	public boolean readField(int i)
	{
		i = readUntilField(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #125 <Method int readUntilField(int)>
	//    3    5:istore_1        
		if(i == -1)
	//*   4    6:iload_1         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          13
		{
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		} else
		{
			mParcel.setDataPosition(i);
	//    9   13:aload_0         
	//   10   14:getfield        #56  <Field Parcel mParcel>
	//   11   17:iload_1         
	//   12   18:invokevirtual   #68  <Method void Parcel.setDataPosition(int)>
			return true;
	//   13   21:iconst_1        
	//   14   22:ireturn         
		}
	}

	public float readFloat()
	{
		return mParcel.readFloat();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #129 <Method float Parcel.readFloat()>
	//    3    7:freturn         
	}

	public int readInt()
	{
		return mParcel.readInt();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #71  <Method int Parcel.readInt()>
	//    3    7:ireturn         
	}

	public long readLong()
	{
		return mParcel.readLong();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #133 <Method long Parcel.readLong()>
	//    3    7:lreturn         
	}

	public Parcelable readParcelable()
	{
		return mParcel.readParcelable(((Object)this).getClass().getClassLoader());
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #103 <Method Class Object.getClass()>
	//    4    8:invokevirtual   #109 <Method ClassLoader Class.getClassLoader()>
	//    5   11:invokevirtual   #138 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//    6   14:areturn         
	}

	public String readString()
	{
		return mParcel.readString();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #143 <Method String Parcel.readString()>
	//    3    7:areturn         
	}

	public IBinder readStrongBinder()
	{
		return mParcel.readStrongBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:invokevirtual   #147 <Method IBinder Parcel.readStrongBinder()>
	//    3    7:areturn         
	}

	public void setOutputField(int i)
	{
		closeField();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #150 <Method void closeField()>
		mCurrentField = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #52  <Field int mCurrentField>
		mPositionLookup.put(i, mParcel.dataPosition());
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field SparseIntArray mPositionLookup>
	//    7   13:iload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #56  <Field Parcel mParcel>
	//   10   18:invokevirtual   #33  <Method int Parcel.dataPosition()>
	//   11   21:invokevirtual   #154 <Method void SparseIntArray.put(int, int)>
		writeInt(0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #155 <Method void writeInt(int)>
		writeInt(i);
	//   15   29:aload_0         
	//   16   30:iload_1         
	//   17   31:invokevirtual   #155 <Method void writeInt(int)>
	//   18   34:return          
	}

	public void writeBoolean(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #159 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #161 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #166 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void writeBundle(Bundle bundle)
	{
		mParcel.writeBundle(bundle);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public void writeByteArray(byte abyte0[])
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
		{
			mParcel.writeInt(abyte0.length);
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Parcel mParcel>
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			mParcel.writeByteArray(abyte0);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Parcel mParcel>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #173 <Method void Parcel.writeByteArray(byte[])>
			return;
	//   11   21:return          
		} else
		{
			mParcel.writeInt(-1);
	//   12   22:aload_0         
	//   13   23:getfield        #56  <Field Parcel mParcel>
	//   14   26:iconst_m1       
	//   15   27:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			return;
	//   16   30:return          
		}
	}

	public void writeByteArray(byte abyte0[], int i, int j)
	{
		if(abyte0 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			mParcel.writeInt(abyte0.length);
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field Parcel mParcel>
	//    4    8:aload_1         
	//    5    9:arraylength     
	//    6   10:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			mParcel.writeByteArray(abyte0, i, j);
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field Parcel mParcel>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #176 <Method void Parcel.writeByteArray(byte[], int, int)>
			return;
	//   13   23:return          
		} else
		{
			mParcel.writeInt(-1);
	//   14   24:aload_0         
	//   15   25:getfield        #56  <Field Parcel mParcel>
	//   16   28:iconst_m1       
	//   17   29:invokevirtual   #78  <Method void Parcel.writeInt(int)>
			return;
	//   18   32:return          
		}
	}

	public void writeDouble(double d)
	{
		mParcel.writeDouble(d);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #180 <Method void Parcel.writeDouble(double)>
	//    4    8:return          
	}

	public void writeFloat(float f)
	{
		mParcel.writeFloat(f);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #184 <Method void Parcel.writeFloat(float)>
	//    4    8:return          
	}

	public void writeInt(int i)
	{
		mParcel.writeInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method void Parcel.writeInt(int)>
	//    4    8:return          
	}

	public void writeLong(long l)
	{
		mParcel.writeLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #188 <Method void Parcel.writeLong(long)>
	//    4    8:return          
	}

	public void writeParcelable(Parcelable parcelable)
	{
		mParcel.writeParcelable(parcelable, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #193 <Method void Parcel.writeParcelable(Parcelable, int)>
	//    5    9:return          
	}

	public void writeString(String s)
	{
		mParcel.writeString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #196 <Method void Parcel.writeString(String)>
	//    4    8:return          
	}

	public void writeStrongBinder(IBinder ibinder)
	{
		mParcel.writeStrongBinder(ibinder);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #200 <Method void Parcel.writeStrongBinder(IBinder)>
	//    4    8:return          
	}

	public void writeStrongInterface(IInterface iinterface)
	{
		mParcel.writeStrongInterface(iinterface);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Parcel mParcel>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #204 <Method void Parcel.writeStrongInterface(IInterface)>
	//    4    8:return          
	}

	private static final boolean DEBUG = false;
	private static final String TAG = "VersionedParcelParcel";
	private int mCurrentField;
	private final int mEnd;
	private int mNextRead;
	private final int mOffset;
	private final Parcel mParcel;
	private final SparseIntArray mPositionLookup;
	private final String mPrefix;
}
