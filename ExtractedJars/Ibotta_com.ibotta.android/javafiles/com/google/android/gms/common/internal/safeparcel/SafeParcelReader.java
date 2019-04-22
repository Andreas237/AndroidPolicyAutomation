// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal.safeparcel;

import android.os.*;
import android.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SafeParcelReader
{
	public static class ParseException extends RuntimeException
	{

		public ParseException(String s, Parcel parcel)
		{
			int i = parcel.dataPosition();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #15  <Method int Parcel.dataPosition()>
		//    2    4:istore_3        
			int j = parcel.dataSize();
		//    3    5:aload_2         
		//    4    6:invokevirtual   #18  <Method int Parcel.dataSize()>
		//    5    9:istore          4
			parcel = ((Parcel) (new StringBuilder(String.valueOf(((Object) (s))).length() + 41)));
		//    6   11:new             #20  <Class StringBuilder>
		//    7   14:dup             
		//    8   15:aload_1         
		//    9   16:invokestatic    #26  <Method String String.valueOf(Object)>
		//   10   19:invokevirtual   #29  <Method int String.length()>
		//   11   22:bipush          41
		//   12   24:iadd            
		//   13   25:invokespecial   #32  <Method void StringBuilder(int)>
		//   14   28:astore_2        
			((StringBuilder) (parcel)).append(s);
		//   15   29:aload_2         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   18   34:pop             
			((StringBuilder) (parcel)).append(" Parcel: pos=");
		//   19   35:aload_2         
		//   20   36:ldc1            #38  <String " Parcel: pos=">
		//   21   38:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   22   41:pop             
			((StringBuilder) (parcel)).append(i);
		//   23   42:aload_2         
		//   24   43:iload_3         
		//   25   44:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   26   47:pop             
			((StringBuilder) (parcel)).append(" size=");
		//   27   48:aload_2         
		//   28   49:ldc1            #43  <String " size=">
		//   29   51:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
		//   30   54:pop             
			((StringBuilder) (parcel)).append(j);
		//   31   55:aload_2         
		//   32   56:iload           4
		//   33   58:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   34   61:pop             
			super(((StringBuilder) (parcel)).toString());
		//   35   62:aload_0         
		//   36   63:aload_2         
		//   37   64:invokevirtual   #47  <Method String StringBuilder.toString()>
		//   38   67:invokespecial   #50  <Method void RuntimeException(String)>
		//   39   70:return          
		}
	}


	private SafeParcelReader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static BigDecimal createBigDecimal(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			byte abyte0[] = parcel.createByteArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   13   21:astore          4
			int k = parcel.readInt();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #31  <Method int Parcel.readInt()>
	//   16   27:istore_3        
			parcel.setDataPosition(j + i);
	//   17   28:aload_0         
	//   18   29:iload_2         
	//   19   30:iload_1         
	//   20   31:iadd            
	//   21   32:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return new BigDecimal(new BigInteger(abyte0), k);
	//   22   35:new             #37  <Class BigDecimal>
	//   23   38:dup             
	//   24   39:new             #39  <Class BigInteger>
	//   25   42:dup             
	//   26   43:aload           4
	//   27   45:invokespecial   #42  <Method void BigInteger(byte[])>
	//   28   48:iload_3         
	//   29   49:invokespecial   #45  <Method void BigDecimal(BigInteger, int)>
	//   30   52:areturn         
		}
	}

	public static BigDecimal[] createBigDecimalArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		BigDecimal abigdecimal[] = new BigDecimal[l];
	//   14   23:iload           4
	//   15   25:anewarray       BigDecimal[]
	//   16   28:astore          6
		for(i = 0; i < l; i++)
	//*  17   30:iconst_0        
	//*  18   31:istore_1        
	//*  19   32:iload_1         
	//*  20   33:iload           4
	//*  21   35:icmpge          79
		{
			byte abyte0[] = parcel.createByteArray();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   24   42:astore          7
			int i1 = parcel.readInt();
	//   25   44:aload_0         
	//   26   45:invokevirtual   #31  <Method int Parcel.readInt()>
	//   27   48:istore          5
			abigdecimal[i] = new BigDecimal(new BigInteger(abyte0), i1);
	//   28   50:aload           6
	//   29   52:iload_1         
	//   30   53:new             #37  <Class BigDecimal>
	//   31   56:dup             
	//   32   57:new             #39  <Class BigInteger>
	//   33   60:dup             
	//   34   61:aload           7
	//   35   63:invokespecial   #42  <Method void BigInteger(byte[])>
	//   36   66:iload           5
	//   37   68:invokespecial   #45  <Method void BigDecimal(BigInteger, int)>
	//   38   71:aastore         
		}

	//   39   72:iload_1         
	//   40   73:iconst_1        
	//   41   74:iadd            
	//   42   75:istore_1        
	//*  43   76:goto            32
		parcel.setDataPosition(k + j);
	//   44   79:aload_0         
	//   45   80:iload_3         
	//   46   81:iload_2         
	//   47   82:iadd            
	//   48   83:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return abigdecimal;
	//   49   86:aload           6
	//   50   88:areturn         
	}

	public static BigInteger createBigInteger(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			byte abyte0[] = parcel.createByteArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return new BigInteger(abyte0);
	//   19   29:new             #39  <Class BigInteger>
	//   20   32:dup             
	//   21   33:aload_3         
	//   22   34:invokespecial   #42  <Method void BigInteger(byte[])>
	//   23   37:areturn         
		}
	}

	public static BigInteger[] createBigIntegerArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		BigInteger abiginteger[] = new BigInteger[l];
	//   14   23:iload           4
	//   15   25:anewarray       BigInteger[]
	//   16   28:astore          5
		for(i = 0; i < l; i++)
	//*  17   30:iconst_0        
	//*  18   31:istore_1        
	//*  19   32:iload_1         
	//*  20   33:iload           4
	//*  21   35:icmpge          60
			abiginteger[i] = new BigInteger(parcel.createByteArray());
	//   22   38:aload           5
	//   23   40:iload_1         
	//   24   41:new             #39  <Class BigInteger>
	//   25   44:dup             
	//   26   45:aload_0         
	//   27   46:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   28   49:invokespecial   #42  <Method void BigInteger(byte[])>
	//   29   52:aastore         

	//   30   53:iload_1         
	//   31   54:iconst_1        
	//   32   55:iadd            
	//   33   56:istore_1        
	//*  34   57:goto            32
		parcel.setDataPosition(k + j);
	//   35   60:aload_0         
	//   36   61:iload_3         
	//   37   62:iload_2         
	//   38   63:iadd            
	//   39   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return abiginteger;
	//   40   67:aload           5
	//   41   69:areturn         
	}

	public static boolean[] createBooleanArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			boolean aflag[] = parcel.createBooleanArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #56  <Method boolean[] Parcel.createBooleanArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return aflag;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createBooleanList(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   17:new             #60  <Class ArrayList>
	//   12   20:dup             
	//   13   21:invokespecial   #61  <Method void ArrayList()>
	//   14   24:astore          6
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          74
		{
			boolean flag;
			if(parcel.readInt() != 0)
	//*  23   40:aload_0         
	//*  24   41:invokevirtual   #31  <Method int Parcel.readInt()>
	//*  25   44:ifeq            53
				flag = true;
	//   26   47:iconst_1        
	//   27   48:istore          5
			else
	//*  28   50:goto            56
				flag = false;
	//   29   53:iconst_0        
	//   30   54:istore          5
			arraylist.add(((Object) (Boolean.valueOf(flag))));
	//   31   56:aload           6
	//   32   58:iload           5
	//   33   60:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   34   63:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   35   66:pop             
		}

	//   36   67:iload_1         
	//   37   68:iconst_1        
	//   38   69:iadd            
	//   39   70:istore_1        
	//*  40   71:goto            34
		parcel.setDataPosition(k + j);
	//   41   74:aload_0         
	//   42   75:iload_3         
	//   43   76:iload_2         
	//   44   77:iadd            
	//   45   78:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return arraylist;
	//   46   81:aload           6
	//   47   83:areturn         
	}

	public static Bundle createBundle(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			Bundle bundle = parcel.readBundle();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #79  <Method Bundle Parcel.readBundle()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return bundle;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static byte[] createByteArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			byte abyte0[] = parcel.createByteArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return abyte0;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static byte[][] createByteArrayArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		byte abyte0[][] = new byte[l][];
	//   14   23:iload           4
	//   15   25:anewarray       byte[][]
	//   16   28:astore          5
		for(i = 0; i < l; i++)
	//*  17   30:iconst_0        
	//*  18   31:istore_1        
	//*  19   32:iload_1         
	//*  20   33:iload           4
	//*  21   35:icmpge          53
			abyte0[i] = parcel.createByteArray();
	//   22   38:aload           5
	//   23   40:iload_1         
	//   24   41:aload_0         
	//   25   42:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   26   45:aastore         

	//   27   46:iload_1         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_1        
	//*  31   50:goto            32
		parcel.setDataPosition(k + j);
	//   32   53:aload_0         
	//   33   54:iload_3         
	//   34   55:iload_2         
	//   35   56:iadd            
	//   36   57:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return abyte0;
	//   37   60:aload           5
	//   38   62:areturn         
	}

	public static SparseArray createByteArraySparseArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		SparseArray sparsearray = new SparseArray(l);
	//   14   23:new             #88  <Class SparseArray>
	//   15   26:dup             
	//   16   27:iload           4
	//   17   29:invokespecial   #90  <Method void SparseArray(int)>
	//   18   32:astore          5
		for(i = 0; i < l; i++)
	//*  19   34:iconst_0        
	//*  20   35:istore_1        
	//*  21   36:iload_1         
	//*  22   37:iload           4
	//*  23   39:icmpge          62
			sparsearray.append(parcel.readInt(), ((Object) (parcel.createByteArray())));
	//   24   42:aload           5
	//   25   44:aload_0         
	//   26   45:invokevirtual   #31  <Method int Parcel.readInt()>
	//   27   48:aload_0         
	//   28   49:invokevirtual   #28  <Method byte[] Parcel.createByteArray()>
	//   29   52:invokevirtual   #94  <Method void SparseArray.append(int, Object)>

	//   30   55:iload_1         
	//   31   56:iconst_1        
	//   32   57:iadd            
	//   33   58:istore_1        
	//*  34   59:goto            36
		parcel.setDataPosition(k + j);
	//   35   62:aload_0         
	//   36   63:iload_3         
	//   37   64:iload_2         
	//   38   65:iadd            
	//   39   66:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   40   69:aload           5
	//   41   71:areturn         
	}

	public static char[] createCharArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			char ac[] = parcel.createCharArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #100 <Method char[] Parcel.createCharArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ac;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static double[] createDoubleArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			double ad[] = parcel.createDoubleArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #105 <Method double[] Parcel.createDoubleArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ad;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createDoubleList(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   17:new             #60  <Class ArrayList>
	//   12   20:dup             
	//   13   21:invokespecial   #61  <Method void ArrayList()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			arraylist.add(((Object) (Double.valueOf(parcel.readDouble()))));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #110 <Method double Parcel.readDouble()>
	//   26   46:invokestatic    #115 <Method Double Double.valueOf(double)>
	//   27   49:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   28   52:pop             

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return arraylist;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static SparseArray createDoubleSparseArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		SparseArray sparsearray = new SparseArray();
	//   11   17:new             #88  <Class SparseArray>
	//   12   20:dup             
	//   13   21:invokespecial   #118 <Method void SparseArray()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          63
			sparsearray.append(parcel.readInt(), ((Object) (Double.valueOf(parcel.readDouble()))));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #31  <Method int Parcel.readInt()>
	//   26   46:aload_0         
	//   27   47:invokevirtual   #110 <Method double Parcel.readDouble()>
	//   28   50:invokestatic    #115 <Method Double Double.valueOf(double)>
	//   29   53:invokevirtual   #94  <Method void SparseArray.append(int, Object)>

	//   30   56:iload_1         
	//   31   57:iconst_1        
	//   32   58:iadd            
	//   33   59:istore_1        
	//*  34   60:goto            34
		parcel.setDataPosition(k + j);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:iload_2         
	//   38   66:iadd            
	//   39   67:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   40   70:aload           5
	//   41   72:areturn         
	}

	public static float[] createFloatArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			float af[] = parcel.createFloatArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #124 <Method float[] Parcel.createFloatArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return af;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createFloatList(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   17:new             #60  <Class ArrayList>
	//   12   20:dup             
	//   13   21:invokespecial   #61  <Method void ArrayList()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			arraylist.add(((Object) (Float.valueOf(parcel.readFloat()))));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #129 <Method float Parcel.readFloat()>
	//   26   46:invokestatic    #134 <Method Float Float.valueOf(float)>
	//   27   49:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   28   52:pop             

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return arraylist;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static SparseArray createFloatSparseArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		SparseArray sparsearray = new SparseArray();
	//   11   17:new             #88  <Class SparseArray>
	//   12   20:dup             
	//   13   21:invokespecial   #118 <Method void SparseArray()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          63
			sparsearray.append(parcel.readInt(), ((Object) (Float.valueOf(parcel.readFloat()))));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #31  <Method int Parcel.readInt()>
	//   26   46:aload_0         
	//   27   47:invokevirtual   #129 <Method float Parcel.readFloat()>
	//   28   50:invokestatic    #134 <Method Float Float.valueOf(float)>
	//   29   53:invokevirtual   #94  <Method void SparseArray.append(int, Object)>

	//   30   56:iload_1         
	//   31   57:iconst_1        
	//   32   58:iadd            
	//   33   59:istore_1        
	//*  34   60:goto            34
		parcel.setDataPosition(k + j);
	//   35   63:aload_0         
	//   36   64:iload_3         
	//   37   65:iload_2         
	//   38   66:iadd            
	//   39   67:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   40   70:aload           5
	//   41   72:areturn         
	}

	public static IBinder[] createIBinderArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			IBinder aibinder[] = parcel.createBinderArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #143 <Method IBinder[] Parcel.createBinderArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return aibinder;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createIBinderList(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			ArrayList arraylist = parcel.createBinderArrayList();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #148 <Method ArrayList Parcel.createBinderArrayList()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return arraylist;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static SparseArray createIBinderSparseArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		SparseArray sparsearray = new SparseArray(l);
	//   14   23:new             #88  <Class SparseArray>
	//   15   26:dup             
	//   16   27:iload           4
	//   17   29:invokespecial   #90  <Method void SparseArray(int)>
	//   18   32:astore          5
		for(i = 0; i < l; i++)
	//*  19   34:iconst_0        
	//*  20   35:istore_1        
	//*  21   36:iload_1         
	//*  22   37:iload           4
	//*  23   39:icmpge          62
			sparsearray.append(parcel.readInt(), ((Object) (parcel.readStrongBinder())));
	//   24   42:aload           5
	//   25   44:aload_0         
	//   26   45:invokevirtual   #31  <Method int Parcel.readInt()>
	//   27   48:aload_0         
	//   28   49:invokevirtual   #154 <Method IBinder Parcel.readStrongBinder()>
	//   29   52:invokevirtual   #94  <Method void SparseArray.append(int, Object)>

	//   30   55:iload_1         
	//   31   56:iconst_1        
	//   32   57:iadd            
	//   33   58:istore_1        
	//*  34   59:goto            36
		parcel.setDataPosition(k + j);
	//   35   62:aload_0         
	//   36   63:iload_3         
	//   37   64:iload_2         
	//   38   65:iadd            
	//   39   66:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   40   69:aload           5
	//   41   71:areturn         
	}

	public static int[] createIntArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			int ai[] = parcel.createIntArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #160 <Method int[] Parcel.createIntArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ai;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createIntegerList(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   17:new             #60  <Class ArrayList>
	//   12   20:dup             
	//   13   21:invokespecial   #61  <Method void ArrayList()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			arraylist.add(((Object) (Integer.valueOf(parcel.readInt()))));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #31  <Method int Parcel.readInt()>
	//   26   46:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//   27   49:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   28   52:pop             

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return arraylist;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static long[] createLongArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			long al[] = parcel.createLongArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #172 <Method long[] Parcel.createLongArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return al;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createLongList(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		ArrayList arraylist = new ArrayList();
	//   11   17:new             #60  <Class ArrayList>
	//   12   20:dup             
	//   13   21:invokespecial   #61  <Method void ArrayList()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			arraylist.add(((Object) (Long.valueOf(parcel.readLong()))));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #177 <Method long Parcel.readLong()>
	//   26   46:invokestatic    #182 <Method Long Long.valueOf(long)>
	//   27   49:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   28   52:pop             

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return arraylist;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static Parcel createParcel(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			Parcel parcel1 = Parcel.obtain();
	//   11   17:invokestatic    #189 <Method Parcel Parcel.obtain()>
	//   12   20:astore_3        
			parcel1.appendFrom(parcel, j, i);
	//   13   21:aload_3         
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:invokevirtual   #193 <Method void Parcel.appendFrom(Parcel, int, int)>
			parcel.setDataPosition(j + i);
	//   18   28:aload_0         
	//   19   29:iload_2         
	//   20   30:iload_1         
	//   21   31:iadd            
	//   22   32:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return parcel1;
	//   23   35:aload_3         
	//   24   36:areturn         
		}
	}

	public static Parcel[] createParcelArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		Parcel aparcel[] = new Parcel[l];
	//   14   23:iload           4
	//   15   25:anewarray       Parcel[]
	//   16   28:astore          7
		for(i = 0; i < l; i++)
	//*  17   30:iconst_0        
	//*  18   31:istore_1        
	//*  19   32:iload_1         
	//*  20   33:iload           4
	//*  21   35:icmpge          100
		{
			int i1 = parcel.readInt();
	//   22   38:aload_0         
	//   23   39:invokevirtual   #31  <Method int Parcel.readInt()>
	//   24   42:istore          5
			if(i1 != 0)
	//*  25   44:iload           5
	//*  26   46:ifeq            88
			{
				int j1 = parcel.dataPosition();
	//   27   49:aload_0         
	//   28   50:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//   29   53:istore          6
				Parcel parcel1 = Parcel.obtain();
	//   30   55:invokestatic    #189 <Method Parcel Parcel.obtain()>
	//   31   58:astore          8
				parcel1.appendFrom(parcel, j1, i1);
	//   32   60:aload           8
	//   33   62:aload_0         
	//   34   63:iload           6
	//   35   65:iload           5
	//   36   67:invokevirtual   #193 <Method void Parcel.appendFrom(Parcel, int, int)>
				aparcel[i] = parcel1;
	//   37   70:aload           7
	//   38   72:iload_1         
	//   39   73:aload           8
	//   40   75:aastore         
				parcel.setDataPosition(j1 + i1);
	//   41   76:aload_0         
	//   42   77:iload           6
	//   43   79:iload           5
	//   44   81:iadd            
	//   45   82:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			} else
	//*  46   85:goto            93
			{
				aparcel[i] = null;
	//   47   88:aload           7
	//   48   90:iload_1         
	//   49   91:aconst_null     
	//   50   92:aastore         
			}
		}

	//   51   93:iload_1         
	//   52   94:iconst_1        
	//   53   95:iadd            
	//   54   96:istore_1        
	//*  55   97:goto            32
		parcel.setDataPosition(k + j);
	//   56  100:aload_0         
	//   57  101:iload_3         
	//   58  102:iload_2         
	//   59  103:iadd            
	//   60  104:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return aparcel;
	//   61  107:aload           7
	//   62  109:areturn         
	}

	public static ArrayList createParcelList(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		ArrayList arraylist = new ArrayList();
	//   14   23:new             #60  <Class ArrayList>
	//   15   26:dup             
	//   16   27:invokespecial   #61  <Method void ArrayList()>
	//   17   30:astore          7
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          106
		{
			int i1 = parcel.readInt();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #31  <Method int Parcel.readInt()>
	//   25   44:istore          5
			if(i1 != 0)
	//*  26   46:iload           5
	//*  27   48:ifeq            92
			{
				int j1 = parcel.dataPosition();
	//   28   51:aload_0         
	//   29   52:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//   30   55:istore          6
				Parcel parcel1 = Parcel.obtain();
	//   31   57:invokestatic    #189 <Method Parcel Parcel.obtain()>
	//   32   60:astore          8
				parcel1.appendFrom(parcel, j1, i1);
	//   33   62:aload           8
	//   34   64:aload_0         
	//   35   65:iload           6
	//   36   67:iload           5
	//   37   69:invokevirtual   #193 <Method void Parcel.appendFrom(Parcel, int, int)>
				arraylist.add(((Object) (parcel1)));
	//   38   72:aload           7
	//   39   74:aload           8
	//   40   76:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   41   79:pop             
				parcel.setDataPosition(j1 + i1);
	//   42   80:aload_0         
	//   43   81:iload           6
	//   44   83:iload           5
	//   45   85:iadd            
	//   46   86:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			} else
	//*  47   89:goto            99
			{
				arraylist.add(((Object) (null)));
	//   48   92:aload           7
	//   49   94:aconst_null     
	//   50   95:invokevirtual   #71  <Method boolean ArrayList.add(Object)>
	//   51   98:pop             
			}
		}

	//   52   99:iload_1         
	//   53  100:iconst_1        
	//   54  101:iadd            
	//   55  102:istore_1        
	//*  56  103:goto            34
		parcel.setDataPosition(k + j);
	//   57  106:aload_0         
	//   58  107:iload_3         
	//   59  108:iload_2         
	//   60  109:iadd            
	//   61  110:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return arraylist;
	//   62  113:aload           7
	//   63  115:areturn         
	}

	public static SparseArray createParcelSparseArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		int l = parcel.readInt();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   21:istore          4
		SparseArray sparsearray = new SparseArray();
	//   14   23:new             #88  <Class SparseArray>
	//   15   26:dup             
	//   16   27:invokespecial   #118 <Method void SparseArray()>
	//   17   30:astore          8
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          114
		{
			int i1 = parcel.readInt();
	//   23   40:aload_0         
	//   24   41:invokevirtual   #31  <Method int Parcel.readInt()>
	//   25   44:istore          5
			int j1 = parcel.readInt();
	//   26   46:aload_0         
	//   27   47:invokevirtual   #31  <Method int Parcel.readInt()>
	//   28   50:istore          6
			if(j1 != 0)
	//*  29   52:iload           6
	//*  30   54:ifeq            99
			{
				int k1 = parcel.dataPosition();
	//   31   57:aload_0         
	//   32   58:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//   33   61:istore          7
				Parcel parcel1 = Parcel.obtain();
	//   34   63:invokestatic    #189 <Method Parcel Parcel.obtain()>
	//   35   66:astore          9
				parcel1.appendFrom(parcel, k1, j1);
	//   36   68:aload           9
	//   37   70:aload_0         
	//   38   71:iload           7
	//   39   73:iload           6
	//   40   75:invokevirtual   #193 <Method void Parcel.appendFrom(Parcel, int, int)>
				sparsearray.append(i1, ((Object) (parcel1)));
	//   41   78:aload           8
	//   42   80:iload           5
	//   43   82:aload           9
	//   44   84:invokevirtual   #94  <Method void SparseArray.append(int, Object)>
				parcel.setDataPosition(k1 + j1);
	//   45   87:aload_0         
	//   46   88:iload           7
	//   47   90:iload           6
	//   48   92:iadd            
	//   49   93:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			} else
	//*  50   96:goto            107
			{
				sparsearray.append(i1, ((Object) (null)));
	//   51   99:aload           8
	//   52  101:iload           5
	//   53  103:aconst_null     
	//   54  104:invokevirtual   #94  <Method void SparseArray.append(int, Object)>
			}
		}

	//   55  107:iload_1         
	//   56  108:iconst_1        
	//   57  109:iadd            
	//   58  110:istore_1        
	//*  59  111:goto            34
		parcel.setDataPosition(k + j);
	//   60  114:aload_0         
	//   61  115:iload_3         
	//   62  116:iload_2         
	//   63  117:iadd            
	//   64  118:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   65  121:aload           8
	//   66  123:areturn         
	}

	public static Parcelable createParcelable(Parcel parcel, int i, android.os.Parcelable.Creator creator)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			creator = ((android.os.Parcelable.Creator) ((Parcelable)creator.createFromParcel(parcel)));
	//   11   17:aload_2         
	//   12   18:aload_0         
	//   13   19:invokeinterface #207 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   14   24:checkcast       #209 <Class Parcelable>
	//   15   27:astore_2        
			parcel.setDataPosition(j + i);
	//   16   28:aload_0         
	//   17   29:iload_3         
	//   18   30:iload_1         
	//   19   31:iadd            
	//   20   32:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ((Parcelable) (creator));
	//   21   35:aload_2         
	//   22   36:areturn         
		}
	}

	public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			SparseBooleanArray sparsebooleanarray = parcel.readSparseBooleanArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #216 <Method SparseBooleanArray Parcel.readSparseBooleanArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return sparsebooleanarray;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static SparseIntArray createSparseIntArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		SparseIntArray sparseintarray = new SparseIntArray();
	//   11   17:new             #220 <Class SparseIntArray>
	//   12   20:dup             
	//   13   21:invokespecial   #221 <Method void SparseIntArray()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			sparseintarray.append(parcel.readInt(), parcel.readInt());
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #31  <Method int Parcel.readInt()>
	//   26   46:aload_0         
	//   27   47:invokevirtual   #31  <Method int Parcel.readInt()>
	//   28   50:invokevirtual   #224 <Method void SparseIntArray.append(int, int)>

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparseintarray;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static SparseLongArray createSparseLongArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		SparseLongArray sparselongarray = new SparseLongArray();
	//   11   17:new             #228 <Class SparseLongArray>
	//   12   20:dup             
	//   13   21:invokespecial   #229 <Method void SparseLongArray()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			sparselongarray.append(parcel.readInt(), parcel.readLong());
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #31  <Method int Parcel.readInt()>
	//   26   46:aload_0         
	//   27   47:invokevirtual   #177 <Method long Parcel.readLong()>
	//   28   50:invokevirtual   #232 <Method void SparseLongArray.append(int, long)>

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparselongarray;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static String createString(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			String s = parcel.readString();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #238 <Method String Parcel.readString()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return s;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static String[] createStringArray(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			String as[] = parcel.createStringArray();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #243 <Method String[] Parcel.createStringArray()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return as;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static ArrayList createStringList(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			ArrayList arraylist = parcel.createStringArrayList();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #247 <Method ArrayList Parcel.createStringArrayList()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return arraylist;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static SparseArray createStringSparseArray(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(j == 0)
	//*   7   11:iload_2         
	//*   8   12:ifne            17
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		SparseArray sparsearray = new SparseArray();
	//   11   17:new             #88  <Class SparseArray>
	//   12   20:dup             
	//   13   21:invokespecial   #118 <Method void SparseArray()>
	//   14   24:astore          5
		int l = parcel.readInt();
	//   15   26:aload_0         
	//   16   27:invokevirtual   #31  <Method int Parcel.readInt()>
	//   17   30:istore          4
		for(i = 0; i < l; i++)
	//*  18   32:iconst_0        
	//*  19   33:istore_1        
	//*  20   34:iload_1         
	//*  21   35:iload           4
	//*  22   37:icmpge          60
			sparsearray.append(parcel.readInt(), ((Object) (parcel.readString())));
	//   23   40:aload           5
	//   24   42:aload_0         
	//   25   43:invokevirtual   #31  <Method int Parcel.readInt()>
	//   26   46:aload_0         
	//   27   47:invokevirtual   #238 <Method String Parcel.readString()>
	//   28   50:invokevirtual   #94  <Method void SparseArray.append(int, Object)>

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:iadd            
	//   32   56:istore_1        
	//*  33   57:goto            34
		parcel.setDataPosition(k + j);
	//   34   60:aload_0         
	//   35   61:iload_3         
	//   36   62:iload_2         
	//   37   63:iadd            
	//   38   64:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   39   67:aload           5
	//   40   69:areturn         
	}

	public static Object[] createTypedArray(Parcel parcel, int i, android.os.Parcelable.Creator creator)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			creator = ((android.os.Parcelable.Creator) (parcel.createTypedArray(creator)));
	//   11   17:aload_0         
	//   12   18:aload_2         
	//   13   19:invokevirtual   #255 <Method Object[] Parcel.createTypedArray(android.os.Parcelable$Creator)>
	//   14   22:astore_2        
			parcel.setDataPosition(j + i);
	//   15   23:aload_0         
	//   16   24:iload_3         
	//   17   25:iload_1         
	//   18   26:iadd            
	//   19   27:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ((Object []) (creator));
	//   20   30:aload_2         
	//   21   31:areturn         
		}
	}

	public static ArrayList createTypedList(Parcel parcel, int i, android.os.Parcelable.Creator creator)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_3        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			creator = ((android.os.Parcelable.Creator) (parcel.createTypedArrayList(creator)));
	//   11   17:aload_0         
	//   12   18:aload_2         
	//   13   19:invokevirtual   #262 <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//   14   22:astore_2        
			parcel.setDataPosition(j + i);
	//   15   23:aload_0         
	//   16   24:iload_3         
	//   17   25:iload_1         
	//   18   26:iadd            
	//   19   27:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ((ArrayList) (creator));
	//   20   30:aload_2         
	//   21   31:areturn         
		}
	}

	public static SparseArray createTypedSparseArray(Parcel parcel, int i, android.os.Parcelable.Creator creator)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_3        
		int k = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore          4
		if(j == 0)
	//*   7   12:iload_3         
	//*   8   13:ifne            18
			return null;
	//    9   16:aconst_null     
	//   10   17:areturn         
		int l = parcel.readInt();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   22:istore          5
		SparseArray sparsearray = new SparseArray();
	//   14   24:new             #88  <Class SparseArray>
	//   15   27:dup             
	//   16   28:invokespecial   #118 <Method void SparseArray()>
	//   17   31:astore          8
		for(i = 0; i < l; i++)
	//*  18   33:iconst_0        
	//*  19   34:istore_1        
	//*  20   35:iload_1         
	//*  21   36:iload           5
	//*  22   38:icmpge          85
		{
			int i1 = parcel.readInt();
	//   23   41:aload_0         
	//   24   42:invokevirtual   #31  <Method int Parcel.readInt()>
	//   25   45:istore          6
			Object obj;
			if(parcel.readInt() != 0)
	//*  26   47:aload_0         
	//*  27   48:invokevirtual   #31  <Method int Parcel.readInt()>
	//*  28   51:ifeq            66
				obj = creator.createFromParcel(parcel);
	//   29   54:aload_2         
	//   30   55:aload_0         
	//   31   56:invokeinterface #207 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   32   61:astore          7
			else
	//*  33   63:goto            69
				obj = null;
	//   34   66:aconst_null     
	//   35   67:astore          7
			sparsearray.append(i1, obj);
	//   36   69:aload           8
	//   37   71:iload           6
	//   38   73:aload           7
	//   39   75:invokevirtual   #94  <Method void SparseArray.append(int, Object)>
		}

	//   40   78:iload_1         
	//   41   79:iconst_1        
	//   42   80:iadd            
	//   43   81:istore_1        
	//*  44   82:goto            35
		parcel.setDataPosition(k + j);
	//   45   85:aload_0         
	//   46   86:iload           4
	//   47   88:iload_3         
	//   48   89:iadd            
	//   49   90:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
		return sparsearray;
	//   50   93:aload           8
	//   51   95:areturn         
	}

	public static void ensureAtEnd(Parcel parcel, int i)
	{
		if(parcel.dataPosition() == i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(37);
	//    5    9:new             #270 <Class StringBuilder>
	//    6   12:dup             
	//    7   13:bipush          37
	//    8   15:invokespecial   #271 <Method void StringBuilder(int)>
	//    9   18:astore_2        
			stringbuilder.append("Overread allowed size end=");
	//   10   19:aload_2         
	//   11   20:ldc2            #273 <String "Overread allowed size end=">
	//   12   23:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(i);
	//   14   27:aload_2         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
			throw new ParseException(stringbuilder.toString(), parcel);
	//   18   33:new             #6   <Class SafeParcelReader$ParseException>
	//   19   36:dup             
	//   20   37:aload_2         
	//   21   38:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   22   41:aload_0         
	//   23   42:invokespecial   #285 <Method void SafeParcelReader$ParseException(String, Parcel)>
	//   24   45:athrow          
		}
	}

	public static int getFieldId(int i)
	{
		return i & 0xffff;
	//    0    0:iload_0         
	//    1    1:ldc2            #288 <Int 65535>
	//    2    4:iand            
	//    3    5:ireturn         
	}

	public static boolean readBoolean(Parcel parcel, int i)
	{
		zza(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return parcel.readInt() != 0;
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//    6   10:ifeq            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
	}

	public static Boolean readBooleanObject(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		zza(parcel, i, j, 4);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:iconst_4        
	//   12   16:invokestatic    #298 <Method void zza(Parcel, int, int, int)>
		boolean flag;
		if(parcel.readInt() != 0)
	//*  13   19:aload_0         
	//*  14   20:invokevirtual   #31  <Method int Parcel.readInt()>
	//*  15   23:ifeq            31
			flag = true;
	//   16   26:iconst_1        
	//   17   27:istore_3        
		else
	//*  18   28:goto            33
			flag = false;
	//   19   31:iconst_0        
	//   20   32:istore_3        
		return Boolean.valueOf(flag);
	//   21   33:iload_3         
	//   22   34:invokestatic    #67  <Method Boolean Boolean.valueOf(boolean)>
	//   23   37:areturn         
	}

	public static byte readByte(Parcel parcel, int i)
	{
		zza(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return (byte)parcel.readInt();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//    6   10:int2byte        
	//    7   11:ireturn         
	}

	public static char readChar(Parcel parcel, int i)
	{
		zza(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return (char)parcel.readInt();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//    6   10:int2char        
	//    7   11:ireturn         
	}

	public static double readDouble(Parcel parcel, int i)
	{
		zza(parcel, i, 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return parcel.readDouble();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #110 <Method double Parcel.readDouble()>
	//    6   11:dreturn         
	}

	public static Double readDoubleObject(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            12
		{
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		} else
		{
			zza(parcel, i, j, 8);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:bipush          8
	//   12   17:invokestatic    #298 <Method void zza(Parcel, int, int, int)>
			return Double.valueOf(parcel.readDouble());
	//   13   20:aload_0         
	//   14   21:invokevirtual   #110 <Method double Parcel.readDouble()>
	//   15   24:invokestatic    #115 <Method Double Double.valueOf(double)>
	//   16   27:areturn         
		}
	}

	public static float readFloat(Parcel parcel, int i)
	{
		zza(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return parcel.readFloat();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #129 <Method float Parcel.readFloat()>
	//    6   10:freturn         
	}

	public static Float readFloatObject(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            12
		{
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		} else
		{
			zza(parcel, i, j, 4);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:iconst_4        
	//   12   16:invokestatic    #298 <Method void zza(Parcel, int, int, int)>
			return Float.valueOf(parcel.readFloat());
	//   13   19:aload_0         
	//   14   20:invokevirtual   #129 <Method float Parcel.readFloat()>
	//   15   23:invokestatic    #134 <Method Float Float.valueOf(float)>
	//   16   26:areturn         
		}
	}

	public static int readHeader(Parcel parcel)
	{
		return parcel.readInt();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method int Parcel.readInt()>
	//    2    4:ireturn         
	}

	public static IBinder readIBinder(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore_2        
		if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            17
		{
			return null;
	//    9   15:aconst_null     
	//   10   16:areturn         
		} else
		{
			IBinder ibinder = parcel.readStrongBinder();
	//   11   17:aload_0         
	//   12   18:invokevirtual   #154 <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_3        
			parcel.setDataPosition(j + i);
	//   14   22:aload_0         
	//   15   23:iload_2         
	//   16   24:iload_1         
	//   17   25:iadd            
	//   18   26:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return ibinder;
	//   19   29:aload_3         
	//   20   30:areturn         
		}
	}

	public static int readInt(Parcel parcel, int i)
	{
		zza(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return parcel.readInt();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//    6   10:ireturn         
	}

	public static Integer readIntegerObject(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            12
		{
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		} else
		{
			zza(parcel, i, j, 4);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:iconst_4        
	//   12   16:invokestatic    #298 <Method void zza(Parcel, int, int, int)>
			return Integer.valueOf(parcel.readInt());
	//   13   19:aload_0         
	//   14   20:invokevirtual   #31  <Method int Parcel.readInt()>
	//   15   23:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//   16   26:areturn         
		}
	}

	public static void readList(Parcel parcel, int i, List list, ClassLoader classloader)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		int j = parcel.dataPosition();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    6   10:istore          4
		if(i == 0)
	//*   7   12:iload_1         
	//*   8   13:ifne            17
		{
			return;
	//    9   16:return          
		} else
		{
			parcel.readList(list, classloader);
	//   10   17:aload_0         
	//   11   18:aload_2         
	//   12   19:aload_3         
	//   13   20:invokevirtual   #319 <Method void Parcel.readList(List, ClassLoader)>
			parcel.setDataPosition(j + i);
	//   14   23:aload_0         
	//   15   24:iload           4
	//   16   26:iload_1         
	//   17   27:iadd            
	//   18   28:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
			return;
	//   19   31:return          
		}
	}

	public static long readLong(Parcel parcel, int i)
	{
		zza(parcel, i, 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return parcel.readLong();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #177 <Method long Parcel.readLong()>
	//    6   11:lreturn         
	}

	public static Long readLongObject(Parcel parcel, int i)
	{
		int j = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_2        
		if(j == 0)
	//*   4    6:iload_2         
	//*   5    7:ifne            12
		{
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		} else
		{
			zza(parcel, i, j, 8);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:bipush          8
	//   12   17:invokestatic    #298 <Method void zza(Parcel, int, int, int)>
			return Long.valueOf(parcel.readLong());
	//   13   20:aload_0         
	//   14   21:invokevirtual   #177 <Method long Parcel.readLong()>
	//   15   24:invokestatic    #182 <Method Long Long.valueOf(long)>
	//   16   27:areturn         
		}
	}

	public static short readShort(Parcel parcel, int i)
	{
		zza(parcel, i, 4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_4        
	//    3    3:invokestatic    #293 <Method void zza(Parcel, int, int)>
		return (short)parcel.readInt();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method int Parcel.readInt()>
	//    6   10:int2short       
	//    7   11:ireturn         
	}

	public static int readSize(Parcel parcel, int i)
	{
		if((i & 0xffff0000) != 0xffff0000)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #325 <Int 0xffff0000>
	//*   2    4:iand            
	//*   3    5:ldc2            #325 <Int 0xffff0000>
	//*   4    8:icmpeq          20
			return i >> 16 & 0xffff;
	//    5   11:iload_1         
	//    6   12:bipush          16
	//    7   14:ishr            
	//    8   15:ldc2            #288 <Int 65535>
	//    9   18:iand            
	//   10   19:ireturn         
		else
			return parcel.readInt();
	//   11   20:aload_0         
	//   12   21:invokevirtual   #31  <Method int Parcel.readInt()>
	//   13   24:ireturn         
	}

	public static void skipUnknownField(Parcel parcel, int i)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		parcel.setDataPosition(parcel.dataPosition() + i);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    7   11:iload_1         
	//    8   12:iadd            
	//    9   13:invokevirtual   #35  <Method void Parcel.setDataPosition(int)>
	//   10   16:return          
	}

	public static int validateObjectHeader(Parcel parcel)
	{
		int j = readHeader(parcel);
	//    0    0:aload_0         
	//    1    1:invokestatic    #329 <Method int readHeader(Parcel)>
	//    2    4:istore_2        
		int k = readSize(parcel, j);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    6   10:istore_3        
		int i = parcel.dataPosition();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #24  <Method int Parcel.dataPosition()>
	//    9   15:istore_1        
		if(getFieldId(j) != 20293)
	//*  10   16:iload_2         
	//*  11   17:invokestatic    #331 <Method int getFieldId(int)>
	//*  12   20:sipush          20293
	//*  13   23:icmpeq          79
		{
			String s = String.valueOf(((Object) (Integer.toHexString(j))));
	//   14   26:iload_2         
	//   15   27:invokestatic    #335 <Method String Integer.toHexString(int)>
	//   16   30:invokestatic    #340 <Method String String.valueOf(Object)>
	//   17   33:astore          4
			if(s.length() != 0)
	//*  18   35:aload           4
	//*  19   37:invokevirtual   #343 <Method int String.length()>
	//*  20   40:ifeq            56
				s = "Expected object header. Got 0x".concat(s);
	//   21   43:ldc2            #345 <String "Expected object header. Got 0x">
	//   22   46:aload           4
	//   23   48:invokevirtual   #349 <Method String String.concat(String)>
	//   24   51:astore          4
			else
	//*  25   53:goto            68
				s = new String("Expected object header. Got 0x");
	//   26   56:new             #337 <Class String>
	//   27   59:dup             
	//   28   60:ldc2            #345 <String "Expected object header. Got 0x">
	//   29   63:invokespecial   #352 <Method void String(String)>
	//   30   66:astore          4
			throw new ParseException(s, parcel);
	//   31   68:new             #6   <Class SafeParcelReader$ParseException>
	//   32   71:dup             
	//   33   72:aload           4
	//   34   74:aload_0         
	//   35   75:invokespecial   #285 <Method void SafeParcelReader$ParseException(String, Parcel)>
	//   36   78:athrow          
		}
		j = k + i;
	//   37   79:iload_3         
	//   38   80:iload_1         
	//   39   81:iadd            
	//   40   82:istore_2        
		if(j >= i && j <= parcel.dataSize())
	//*  41   83:iload_2         
	//*  42   84:iload_1         
	//*  43   85:icmplt          98
	//*  44   88:iload_2         
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #355 <Method int Parcel.dataSize()>
	//*  47   93:icmpgt          98
		{
			return j;
	//   48   96:iload_2         
	//   49   97:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(54);
	//   50   98:new             #270 <Class StringBuilder>
	//   51  101:dup             
	//   52  102:bipush          54
	//   53  104:invokespecial   #271 <Method void StringBuilder(int)>
	//   54  107:astore          4
			stringbuilder.append("Size read is invalid start=");
	//   55  109:aload           4
	//   56  111:ldc2            #357 <String "Size read is invalid start=">
	//   57  114:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   58  117:pop             
			stringbuilder.append(i);
	//   59  118:aload           4
	//   60  120:iload_1         
	//   61  121:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   62  124:pop             
			stringbuilder.append(" end=");
	//   63  125:aload           4
	//   64  127:ldc2            #359 <String " end=">
	//   65  130:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   66  133:pop             
			stringbuilder.append(j);
	//   67  134:aload           4
	//   68  136:iload_2         
	//   69  137:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   70  140:pop             
			throw new ParseException(stringbuilder.toString(), parcel);
	//   71  141:new             #6   <Class SafeParcelReader$ParseException>
	//   72  144:dup             
	//   73  145:aload           4
	//   74  147:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   75  150:aload_0         
	//   76  151:invokespecial   #285 <Method void SafeParcelReader$ParseException(String, Parcel)>
	//   77  154:athrow          
		}
	}

	private static void zza(Parcel parcel, int i, int j)
	{
		i = readSize(parcel, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #18  <Method int readSize(Parcel, int)>
	//    3    5:istore_1        
		if(i == j)
	//*   4    6:iload_1         
	//*   5    7:iload_2         
	//*   6    8:icmpne          12
		{
			return;
	//    7   11:return          
		} else
		{
			String s = Integer.toHexString(i);
	//    8   12:iload_1         
	//    9   13:invokestatic    #335 <Method String Integer.toHexString(int)>
	//   10   16:astore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 46);
	//   11   17:new             #270 <Class StringBuilder>
	//   12   20:dup             
	//   13   21:aload_3         
	//   14   22:invokestatic    #340 <Method String String.valueOf(Object)>
	//   15   25:invokevirtual   #343 <Method int String.length()>
	//   16   28:bipush          46
	//   17   30:iadd            
	//   18   31:invokespecial   #271 <Method void StringBuilder(int)>
	//   19   34:astore          4
			stringbuilder.append("Expected size ");
	//   20   36:aload           4
	//   21   38:ldc2            #361 <String "Expected size ">
	//   22   41:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(j);
	//   24   45:aload           4
	//   25   47:iload_2         
	//   26   48:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   27   51:pop             
			stringbuilder.append(" got ");
	//   28   52:aload           4
	//   29   54:ldc2            #363 <String " got ">
	//   30   57:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			stringbuilder.append(i);
	//   32   61:aload           4
	//   33   63:iload_1         
	//   34   64:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   35   67:pop             
			stringbuilder.append(" (0x");
	//   36   68:aload           4
	//   37   70:ldc2            #365 <String " (0x">
	//   38   73:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			stringbuilder.append(s);
	//   40   77:aload           4
	//   41   79:aload_3         
	//   42   80:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
			stringbuilder.append(")");
	//   44   84:aload           4
	//   45   86:ldc2            #367 <String ")">
	//   46   89:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:pop             
			throw new ParseException(stringbuilder.toString(), parcel);
	//   48   93:new             #6   <Class SafeParcelReader$ParseException>
	//   49   96:dup             
	//   50   97:aload           4
	//   51   99:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   52  102:aload_0         
	//   53  103:invokespecial   #285 <Method void SafeParcelReader$ParseException(String, Parcel)>
	//   54  106:athrow          
		}
	}

	private static void zza(Parcel parcel, int i, int j, int k)
	{
		if(j == k)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:icmpne          6
		{
			return;
	//    3    5:return          
		} else
		{
			String s = Integer.toHexString(j);
	//    4    6:iload_2         
	//    5    7:invokestatic    #335 <Method String Integer.toHexString(int)>
	//    6   10:astore          4
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 46);
	//    7   12:new             #270 <Class StringBuilder>
	//    8   15:dup             
	//    9   16:aload           4
	//   10   18:invokestatic    #340 <Method String String.valueOf(Object)>
	//   11   21:invokevirtual   #343 <Method int String.length()>
	//   12   24:bipush          46
	//   13   26:iadd            
	//   14   27:invokespecial   #271 <Method void StringBuilder(int)>
	//   15   30:astore          5
			stringbuilder.append("Expected size ");
	//   16   32:aload           5
	//   17   34:ldc2            #361 <String "Expected size ">
	//   18   37:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(k);
	//   20   41:aload           5
	//   21   43:iload_3         
	//   22   44:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   23   47:pop             
			stringbuilder.append(" got ");
	//   24   48:aload           5
	//   25   50:ldc2            #363 <String " got ">
	//   26   53:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append(j);
	//   28   57:aload           5
	//   29   59:iload_2         
	//   30   60:invokevirtual   #279 <Method StringBuilder StringBuilder.append(int)>
	//   31   63:pop             
			stringbuilder.append(" (0x");
	//   32   64:aload           5
	//   33   66:ldc2            #365 <String " (0x">
	//   34   69:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
			stringbuilder.append(s);
	//   36   73:aload           5
	//   37   75:aload           4
	//   38   77:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
			stringbuilder.append(")");
	//   40   81:aload           5
	//   41   83:ldc2            #367 <String ")">
	//   42   86:invokevirtual   #276 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
			throw new ParseException(stringbuilder.toString(), parcel);
	//   44   90:new             #6   <Class SafeParcelReader$ParseException>
	//   45   93:dup             
	//   46   94:aload           5
	//   47   96:invokevirtual   #282 <Method String StringBuilder.toString()>
	//   48   99:aload_0         
	//   49  100:invokespecial   #285 <Method void SafeParcelReader$ParseException(String, Parcel)>
	//   50  103:athrow          
		}
	}
}
