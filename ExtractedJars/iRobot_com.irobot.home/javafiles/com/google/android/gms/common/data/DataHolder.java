// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.*;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			zac, zab

public final class DataHolder extends AbstractSafeParcelable
	implements Closeable
{
	public static class Builder
	{

		static String[] zaa(Builder builder1)
		{
			return builder1.zalp;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field String[] zalp>
		//    2    4:areturn         
		}

		static ArrayList zab(Builder builder1)
		{
			return builder1.zaly;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field ArrayList zaly>
		//    2    4:areturn         
		}

		public DataHolder build(int i)
		{
			return new DataHolder(this, i, ((Bundle) (null)), ((zab) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aconst_null     
		//    5    7:aconst_null     
		//    6    8:invokespecial   #64  <Method void DataHolder(DataHolder$Builder, int, Bundle, zab)>
		//    7   11:areturn         
		}

		public DataHolder build(int i, Bundle bundle)
		{
			return new DataHolder(this, i, bundle, -1, ((zab) (null)));
		//    0    0:new             #6   <Class DataHolder>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:aload_2         
		//    5    7:iconst_m1       
		//    6    8:aconst_null     
		//    7    9:invokespecial   #69  <Method void DataHolder(DataHolder$Builder, int, Bundle, int, zab)>
		//    8   12:areturn         
		}

		public Builder withRow(ContentValues contentvalues)
		{
			Asserts.checkNotNull(((Object) (contentvalues)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #76  <Method void Asserts.checkNotNull(Object)>
			HashMap hashmap = new HashMap(contentvalues.size());
		//    2    4:new             #44  <Class HashMap>
		//    3    7:dup             
		//    4    8:aload_1         
		//    5    9:invokevirtual   #82  <Method int ContentValues.size()>
		//    6   12:invokespecial   #85  <Method void HashMap(int)>
		//    7   15:astore_2        
			java.util.Map.Entry entry;
			for(contentvalues = ((ContentValues) (contentvalues.valueSet().iterator())); ((Iterator) (contentvalues)).hasNext(); hashmap.put(((Object) ((String)entry.getKey())), entry.getValue()))
		//*   8   16:aload_1         
		//*   9   17:invokevirtual   #89  <Method Set ContentValues.valueSet()>
		//*  10   20:invokeinterface #95  <Method Iterator Set.iterator()>
		//*  11   25:astore_1        
		//*  12   26:aload_1         
		//*  13   27:invokeinterface #101 <Method boolean Iterator.hasNext()>
		//*  14   32:ifeq            68
				entry = (java.util.Map.Entry)((Iterator) (contentvalues)).next();
		//   15   35:aload_1         
		//   16   36:invokeinterface #105 <Method Object Iterator.next()>
		//   17   41:checkcast       #107 <Class java.util.Map$Entry>
		//   18   44:astore_3        

		//   19   45:aload_2         
		//   20   46:aload_3         
		//   21   47:invokeinterface #110 <Method Object java.util.Map$Entry.getKey()>
		//   22   52:checkcast       #112 <Class String>
		//   23   55:aload_3         
		//   24   56:invokeinterface #115 <Method Object java.util.Map$Entry.getValue()>
		//   25   61:invokevirtual   #119 <Method Object HashMap.put(Object, Object)>
		//   26   64:pop             
		//*  27   65:goto            26
			return zaa(hashmap);
		//   28   68:aload_0         
		//   29   69:aload_2         
		//   30   70:invokevirtual   #122 <Method DataHolder$Builder zaa(HashMap)>
		//   31   73:areturn         
		}

		public Builder zaa(HashMap hashmap)
		{
			Asserts.checkNotNull(((Object) (hashmap)));
		//    0    0:aload_1         
		//    1    1:invokestatic    #76  <Method void Asserts.checkNotNull(Object)>
			if(zalz != null) goto _L2; else goto _L1
		//    2    4:aload_0         
		//    3    5:getfield        #42  <Field String zalz>
		//    4    8:ifnonnull       16
_L1:
			int i;
			i = -1;
		//    5   11:iconst_m1       
		//    6   12:istore_2        
			break MISSING_BLOCK_LABEL_78;
		//    7   13:goto            78
_L2:
			Integer integer;
			Object obj = hashmap.get(((Object) (zalz)));
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #42  <Field String zalz>
		//   11   21:invokevirtual   #125 <Method Object HashMap.get(Object)>
		//   12   24:astore_3        
			if(obj == null)
		//*  13   25:aload_3         
		//*  14   26:ifnonnull       32
				continue; /* Loop/switch isn't completed */
		//   15   29:goto            11
			integer = (Integer)zama.get(obj);
		//   16   32:aload_0         
		//   17   33:getfield        #47  <Field HashMap zama>
		//   18   36:aload_3         
		//   19   37:invokevirtual   #125 <Method Object HashMap.get(Object)>
		//   20   40:checkcast       #127 <Class Integer>
		//   21   43:astore          4
			if(integer != null)
				break; /* Loop/switch isn't completed */
		//   22   45:aload           4
		//   23   47:ifnonnull       72
			zama.put(obj, ((Object) (Integer.valueOf(zaly.size()))));
		//   24   50:aload_0         
		//   25   51:getfield        #47  <Field HashMap zama>
		//   26   54:aload_3         
		//   27   55:aload_0         
		//   28   56:getfield        #40  <Field ArrayList zaly>
		//   29   59:invokevirtual   #128 <Method int ArrayList.size()>
		//   30   62:invokestatic    #132 <Method Integer Integer.valueOf(int)>
		//   31   65:invokevirtual   #119 <Method Object HashMap.put(Object, Object)>
		//   32   68:pop             
			if(true) goto _L1; else goto _L3
		//   33   69:goto            11
_L3:
			i = integer.intValue();
		//   34   72:aload           4
		//   35   74:invokevirtual   #135 <Method int Integer.intValue()>
		//   36   77:istore_2        
			if(i == -1)
		//*  37   78:iload_2         
		//*  38   79:iconst_m1       
		//*  39   80:icmpne          95
			{
				zaly.add(((Object) (hashmap)));
		//   40   83:aload_0         
		//   41   84:getfield        #40  <Field ArrayList zaly>
		//   42   87:aload_1         
		//   43   88:invokevirtual   #139 <Method boolean ArrayList.add(Object)>
		//   44   91:pop             
			} else
		//*  45   92:goto            113
			{
				zaly.remove(i);
		//   46   95:aload_0         
		//   47   96:getfield        #40  <Field ArrayList zaly>
		//   48   99:iload_2         
		//   49  100:invokevirtual   #143 <Method Object ArrayList.remove(int)>
		//   50  103:pop             
				zaly.add(i, ((Object) (hashmap)));
		//   51  104:aload_0         
		//   52  105:getfield        #40  <Field ArrayList zaly>
		//   53  108:iload_2         
		//   54  109:aload_1         
		//   55  110:invokevirtual   #146 <Method void ArrayList.add(int, Object)>
			}
			zamb = false;
		//   56  113:aload_0         
		//   57  114:iconst_0        
		//   58  115:putfield        #49  <Field boolean zamb>
			return this;
		//   59  118:aload_0         
		//   60  119:areturn         
		}

		private final String zalp[];
		private final ArrayList zaly;
		private final String zalz;
		private final HashMap zama;
		private boolean zamb;
		private String zamc;

		private Builder(String as[], String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			zalp = (String[])Preconditions.checkNotNull(((Object) (as)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #33  <Class String[]>
		//    6   12:putfield        #35  <Field String[] zalp>
			zaly = new ArrayList();
		//    7   15:aload_0         
		//    8   16:new             #37  <Class ArrayList>
		//    9   19:dup             
		//   10   20:invokespecial   #38  <Method void ArrayList()>
		//   11   23:putfield        #40  <Field ArrayList zaly>
			zalz = s;
		//   12   26:aload_0         
		//   13   27:aload_2         
		//   14   28:putfield        #42  <Field String zalz>
			zama = new HashMap();
		//   15   31:aload_0         
		//   16   32:new             #44  <Class HashMap>
		//   17   35:dup             
		//   18   36:invokespecial   #45  <Method void HashMap()>
		//   19   39:putfield        #47  <Field HashMap zama>
			zamb = false;
		//   20   42:aload_0         
		//   21   43:iconst_0        
		//   22   44:putfield        #49  <Field boolean zamb>
			zamc = null;
		//   23   47:aload_0         
		//   24   48:aconst_null     
		//   25   49:putfield        #51  <Field String zamc>
		//   26   52:return          
		}

		Builder(String as[], String s, zab zab1)
		{
			this(as, ((String) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #55  <Method void DataHolder$Builder(String[], String)>
		//    4    6:return          
		}
	}

	public static final class zaa extends RuntimeException
	{

		public zaa(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void RuntimeException(String)>
		//    3    5:return          
		}
	}


	DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void AbstractSafeParcelable()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #77  <Field boolean mClosed>
		zalw = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #79  <Field boolean zalw>
		zale = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #81  <Field int zale>
		zalp = as;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:putfield        #83  <Field String[] zalp>
		zalr = acursorwindow;
	//   14   24:aload_0         
	//   15   25:aload_3         
	//   16   26:putfield        #85  <Field CursorWindow[] zalr>
		zals = j;
	//   17   29:aload_0         
	//   18   30:iload           4
	//   19   32:putfield        #87  <Field int zals>
		zalt = bundle;
	//   20   35:aload_0         
	//   21   36:aload           5
	//   22   38:putfield        #89  <Field Bundle zalt>
	//   23   41:return          
	}

	public DataHolder(Cursor cursor, int i, Bundle bundle)
	{
		this(new CursorWrapper(cursor), i, bundle);
	//    0    0:aload_0         
	//    1    1:new             #94  <Class CursorWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #97  <Method void CursorWrapper(Cursor)>
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #100 <Method void DataHolder(CursorWrapper, int, Bundle)>
	//    8   14:return          
	}

	private DataHolder(Builder builder1, int i, Bundle bundle)
	{
		this(Builder.zaa(builder1), zaa(builder1, -1), i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:invokestatic    #107 <Method CursorWindow[] zaa(DataHolder$Builder, int)>
	//    6   10:iload_2         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #110 <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    9   15:return          
	}

	private DataHolder(Builder builder1, int i, Bundle bundle, int j)
	{
		this(Builder.zaa(builder1), zaa(builder1, -1), i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//    3    5:aload_1         
	//    4    6:iconst_m1       
	//    5    7:invokestatic    #107 <Method CursorWindow[] zaa(DataHolder$Builder, int)>
	//    6   10:iload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #110 <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    9   15:return          
	}

	DataHolder(Builder builder1, int i, Bundle bundle, int j, zab zab1)
	{
		this(builder1, i, bundle, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:iconst_m1       
	//    5    5:invokespecial   #114 <Method void DataHolder(DataHolder$Builder, int, Bundle, int)>
	//    6    8:return          
	}

	DataHolder(Builder builder1, int i, Bundle bundle, zab zab1)
	{
		this(builder1, i, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #117 <Method void DataHolder(DataHolder$Builder, int, Bundle)>
	//    5    7:return          
	}

	private DataHolder(CursorWrapper cursorwrapper, int i, Bundle bundle)
	{
		this(cursorwrapper.getColumnNames(), zaa(cursorwrapper), i, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #121 <Method String[] CursorWrapper.getColumnNames()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #124 <Method CursorWindow[] zaa(CursorWrapper)>
	//    5    9:iload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #110 <Method void DataHolder(String[], CursorWindow[], int, Bundle)>
	//    8   14:return          
	}

	public DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void AbstractSafeParcelable()>
		mClosed = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #77  <Field boolean mClosed>
		zalw = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #79  <Field boolean zalw>
		zale = 1;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #81  <Field int zale>
		zalp = (String[])Preconditions.checkNotNull(((Object) (as)));
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokestatic    #130 <Method Object Preconditions.checkNotNull(Object)>
	//   14   24:checkcast       #131 <Class String[]>
	//   15   27:putfield        #83  <Field String[] zalp>
		zalr = (CursorWindow[])Preconditions.checkNotNull(((Object) (acursorwindow)));
	//   16   30:aload_0         
	//   17   31:aload_2         
	//   18   32:invokestatic    #130 <Method Object Preconditions.checkNotNull(Object)>
	//   19   35:checkcast       #132 <Class CursorWindow[]>
	//   20   38:putfield        #85  <Field CursorWindow[] zalr>
		zals = i;
	//   21   41:aload_0         
	//   22   42:iload_3         
	//   23   43:putfield        #87  <Field int zals>
		zalt = bundle;
	//   24   46:aload_0         
	//   25   47:aload           4
	//   26   49:putfield        #89  <Field Bundle zalt>
		zaca();
	//   27   52:aload_0         
	//   28   53:invokevirtual   #135 <Method void zaca()>
	//   29   56:return          
	}

	public static Builder builder(String as[])
	{
		return new Builder(as, ((String) (null)), ((zab) (null)));
	//    0    0:new             #8   <Class DataHolder$Builder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokespecial   #140 <Method void DataHolder$Builder(String[], String, zab)>
	//    6   10:areturn         
	}

	public static DataHolder empty(int i)
	{
		return new DataHolder(zalx, i, ((Bundle) (null)));
	//    0    0:new             #2   <Class DataHolder>
	//    1    3:dup             
	//    2    4:getstatic       #70  <Field DataHolder$Builder zalx>
	//    3    7:iload_0         
	//    4    8:aconst_null     
	//    5    9:invokespecial   #117 <Method void DataHolder(DataHolder$Builder, int, Bundle)>
	//    6   12:areturn         
	}

	private final void zaa(String s, int i)
	{
		if(zalq != null && zalq.containsKey(s))
	//*   0    0:aload_0         
	//*   1    1:getfield        #145 <Field Bundle zalq>
	//*   2    4:ifnull          67
	//*   3    7:aload_0         
	//*   4    8:getfield        #145 <Field Bundle zalq>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #151 <Method boolean Bundle.containsKey(String)>
	//*   7   15:ifne            21
	//*   8   18:goto            67
		{
			if(isClosed())
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #155 <Method boolean isClosed()>
	//*  11   25:ifeq            38
				throw new IllegalArgumentException("Buffer is closed.");
	//   12   28:new             #157 <Class IllegalArgumentException>
	//   13   31:dup             
	//   14   32:ldc1            #159 <String "Buffer is closed.">
	//   15   34:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   16   37:athrow          
			if(i >= 0 && i < zalv)
	//*  17   38:iload_2         
	//*  18   39:iflt            54
	//*  19   42:iload_2         
	//*  20   43:aload_0         
	//*  21   44:getfield        #164 <Field int zalv>
	//*  22   47:icmplt          53
	//*  23   50:goto            54
				return;
	//   24   53:return          
			else
				throw new CursorIndexOutOfBoundsException(i, zalv);
	//   25   54:new             #166 <Class CursorIndexOutOfBoundsException>
	//   26   57:dup             
	//   27   58:iload_2         
	//   28   59:aload_0         
	//   29   60:getfield        #164 <Field int zalv>
	//   30   63:invokespecial   #169 <Method void CursorIndexOutOfBoundsException(int, int)>
	//   31   66:athrow          
		}
		s = String.valueOf(((Object) (s)));
	//   32   67:aload_1         
	//   33   68:invokestatic    #173 <Method String String.valueOf(Object)>
	//   34   71:astore_1        
		if(s.length() != 0)
	//*  35   72:aload_1         
	//*  36   73:invokevirtual   #177 <Method int String.length()>
	//*  37   76:ifeq            89
			s = "No such column: ".concat(s);
	//   38   79:ldc1            #179 <String "No such column: ">
	//   39   81:aload_1         
	//   40   82:invokevirtual   #183 <Method String String.concat(String)>
	//   41   85:astore_1        
		else
	//*  42   86:goto            99
			s = new String("No such column: ");
	//   43   89:new             #65  <Class String>
	//   44   92:dup             
	//   45   93:ldc1            #179 <String "No such column: ">
	//   46   95:invokespecial   #184 <Method void String(String)>
	//   47   98:astore_1        
		throw new IllegalArgumentException(s);
	//   48   99:new             #157 <Class IllegalArgumentException>
	//   49  102:dup             
	//   50  103:aload_1         
	//   51  104:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   52  107:athrow          
	}

	private static CursorWindow[] zaa(Builder builder1, int i)
	{
		int j;
		boolean flag;
		int l;
		Object obj1;
		Object obj2;
		ArrayList arraylist;
		j = Builder.zaa(builder1).length;
	//    0    0:aload_0         
	//    1    1:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//    2    4:arraylength     
	//    3    5:istore_2        
		flag = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
		if(j == 0)
	//*   6    9:iload_2         
	//*   7   10:ifne            18
			return new CursorWindow[0];
	//    8   13:iconst_0        
	//    9   14:anewarray       CursorWindow[]
	//   10   17:areturn         
		if(i >= 0 && i < Builder.zab(builder1).size())
	//*  11   18:iload_1         
	//*  12   19:iflt            50
	//*  13   22:iload_1         
	//*  14   23:aload_0         
	//*  15   24:invokestatic    #192 <Method ArrayList DataHolder$Builder.zab(DataHolder$Builder)>
	//*  16   27:invokevirtual   #197 <Method int ArrayList.size()>
	//*  17   30:icmplt          36
	//*  18   33:goto            50
			obj2 = ((Object) (Builder.zab(builder1).subList(0, i)));
	//   19   36:aload_0         
	//   20   37:invokestatic    #192 <Method ArrayList DataHolder$Builder.zab(DataHolder$Builder)>
	//   21   40:iconst_0        
	//   22   41:iload_1         
	//   23   42:invokevirtual   #201 <Method List ArrayList.subList(int, int)>
	//   24   45:astore          11
		else
	//*  25   47:goto            56
			obj2 = ((Object) (Builder.zab(builder1)));
	//   26   50:aload_0         
	//   27   51:invokestatic    #192 <Method ArrayList DataHolder$Builder.zab(DataHolder$Builder)>
	//   28   54:astore          11
		l = ((List) (obj2)).size();
	//   29   56:aload           11
	//   30   58:invokeinterface #204 <Method int List.size()>
	//   31   63:istore          5
		obj1 = ((Object) (new CursorWindow(false)));
	//   32   65:new             #188 <Class CursorWindow>
	//   33   68:dup             
	//   34   69:iconst_0        
	//   35   70:invokespecial   #207 <Method void CursorWindow(boolean)>
	//   36   73:astore          10
		arraylist = new ArrayList();
	//   37   75:new             #194 <Class ArrayList>
	//   38   78:dup             
	//   39   79:invokespecial   #208 <Method void ArrayList()>
	//   40   82:astore          12
		arraylist.add(obj1);
	//   41   84:aload           12
	//   42   86:aload           10
	//   43   88:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//   44   91:pop             
		((CursorWindow) (obj1)).setNumColumns(Builder.zaa(builder1).length);
	//   45   92:aload           10
	//   46   94:aload_0         
	//   47   95:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//   48   98:arraylength     
	//   49   99:invokevirtual   #216 <Method boolean CursorWindow.setNumColumns(int)>
	//   50  102:pop             
		i = 0;
	//   51  103:iconst_0        
	//   52  104:istore_1        
		j = 0;
	//   53  105:iconst_0        
	//   54  106:istore_2        
_L10:
		if(i >= l) goto _L2; else goto _L1
	//   55  107:iload_1         
	//   56  108:iload           5
	//   57  110:icmpge          756
_L1:
		Object obj = obj1;
	//   58  113:aload           10
	//   59  115:astore          9
		if(((CursorWindow) (obj1)).allocRow())
			break MISSING_BLOCK_LABEL_250;
	//   60  117:aload           10
	//   61  119:invokevirtual   #219 <Method boolean CursorWindow.allocRow()>
	//   62  122:ifne            250
		obj = ((Object) (new StringBuilder(72)));
	//   63  125:new             #221 <Class StringBuilder>
	//   64  128:dup             
	//   65  129:bipush          72
	//   66  131:invokespecial   #224 <Method void StringBuilder(int)>
	//   67  134:astore          9
		((StringBuilder) (obj)).append("Allocating additional cursor window for large data set (row ");
	//   68  136:aload           9
	//   69  138:ldc1            #226 <String "Allocating additional cursor window for large data set (row ">
	//   70  140:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
		((StringBuilder) (obj)).append(i);
	//   72  144:aload           9
	//   73  146:iload_1         
	//   74  147:invokevirtual   #233 <Method StringBuilder StringBuilder.append(int)>
	//   75  150:pop             
		((StringBuilder) (obj)).append(")");
	//   76  151:aload           9
	//   77  153:ldc1            #235 <String ")">
	//   78  155:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   79  158:pop             
		Log.d("DataHolder", ((StringBuilder) (obj)).toString());
	//   80  159:ldc1            #237 <String "DataHolder">
	//   81  161:aload           9
	//   82  163:invokevirtual   #241 <Method String StringBuilder.toString()>
	//   83  166:invokestatic    #247 <Method int Log.d(String, String)>
	//   84  169:pop             
		obj1 = ((Object) (new CursorWindow(false)));
	//   85  170:new             #188 <Class CursorWindow>
	//   86  173:dup             
	//   87  174:iconst_0        
	//   88  175:invokespecial   #207 <Method void CursorWindow(boolean)>
	//   89  178:astore          10
		((CursorWindow) (obj1)).setStartPosition(i);
	//   90  180:aload           10
	//   91  182:iload_1         
	//   92  183:invokevirtual   #250 <Method void CursorWindow.setStartPosition(int)>
		((CursorWindow) (obj1)).setNumColumns(Builder.zaa(builder1).length);
	//   93  186:aload           10
	//   94  188:aload_0         
	//   95  189:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//   96  192:arraylength     
	//   97  193:invokevirtual   #216 <Method boolean CursorWindow.setNumColumns(int)>
	//   98  196:pop             
		arraylist.add(obj1);
	//   99  197:aload           12
	//  100  199:aload           10
	//  101  201:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//  102  204:pop             
		obj = obj1;
	//  103  205:aload           10
	//  104  207:astore          9
		if(!((CursorWindow) (obj1)).allocRow())
	//* 105  209:aload           10
	//* 106  211:invokevirtual   #219 <Method boolean CursorWindow.allocRow()>
	//* 107  214:ifne            250
		{
			Log.e("DataHolder", "Unable to allocate row to hold data.");
	//  108  217:ldc1            #237 <String "DataHolder">
	//  109  219:ldc1            #252 <String "Unable to allocate row to hold data.">
	//  110  221:invokestatic    #255 <Method int Log.e(String, String)>
	//  111  224:pop             
			arraylist.remove(obj1);
	//  112  225:aload           12
	//  113  227:aload           10
	//  114  229:invokevirtual   #258 <Method boolean ArrayList.remove(Object)>
	//  115  232:pop             
			return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//  116  233:aload           12
	//  117  235:aload           12
	//  118  237:invokevirtual   #197 <Method int ArrayList.size()>
	//  119  240:anewarray       CursorWindow[]
	//  120  243:invokevirtual   #262 <Method Object[] ArrayList.toArray(Object[])>
	//  121  246:checkcast       #132 <Class CursorWindow[]>
	//  122  249:areturn         
		}
		Map map = (Map)((List) (obj2)).get(i);
	//  123  250:aload           11
	//  124  252:iload_1         
	//  125  253:invokeinterface #266 <Method Object List.get(int)>
	//  126  258:checkcast       #268 <Class Map>
	//  127  261:astore          13
		int k;
		boolean flag1;
		k = 0;
	//  128  263:iconst_0        
	//  129  264:istore_3        
		flag1 = true;
	//  130  265:iconst_1        
	//  131  266:istore          6
_L11:
		if(k >= Builder.zaa(builder1).length || !flag1) goto _L4; else goto _L3
	//  132  268:iload_3         
	//  133  269:aload_0         
	//  134  270:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//  135  273:arraylength     
	//  136  274:icmpge          591
	//  137  277:iload           6
	//  138  279:ifeq            591
_L3:
		Object obj3;
		obj1 = ((Object) (Builder.zaa(builder1)[k]));
	//  139  282:aload_0         
	//  140  283:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//  141  286:iload_3         
	//  142  287:aaload          
	//  143  288:astore          10
		obj3 = map.get(obj1);
	//  144  290:aload           13
	//  145  292:aload           10
	//  146  294:invokeinterface #270 <Method Object Map.get(Object)>
	//  147  299:astore          14
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_318;
	//  148  301:aload           14
	//  149  303:ifnonnull       318
		flag1 = ((CursorWindow) (obj)).putNull(i, k);
	//  150  306:aload           9
	//  151  308:iload_1         
	//  152  309:iload_3         
	//  153  310:invokevirtual   #274 <Method boolean CursorWindow.putNull(int, int)>
	//  154  313:istore          6
		break MISSING_BLOCK_LABEL_779;
	//  155  315:goto            779
		if(obj3 instanceof String)
	//* 156  318:aload           14
	//* 157  320:instanceof      #65  <Class String>
	//* 158  323:ifeq            343
		{
			flag1 = ((CursorWindow) (obj)).putString((String)obj3, i, k);
	//  159  326:aload           9
	//  160  328:aload           14
	//  161  330:checkcast       #65  <Class String>
	//  162  333:iload_1         
	//  163  334:iload_3         
	//  164  335:invokevirtual   #278 <Method boolean CursorWindow.putString(String, int, int)>
	//  165  338:istore          6
			break MISSING_BLOCK_LABEL_779;
	//  166  340:goto            779
		}
		if(!(obj3 instanceof Long)) goto _L6; else goto _L5
	//  167  343:aload           14
	//  168  345:instanceof      #280 <Class Long>
	//  169  348:ifeq            375
_L5:
		long l1 = ((Long)obj3).longValue();
	//  170  351:aload           14
	//  171  353:checkcast       #280 <Class Long>
	//  172  356:invokevirtual   #284 <Method long Long.longValue()>
	//  173  359:lstore          7
_L9:
		flag1 = ((CursorWindow) (obj)).putLong(l1, i, k);
	//  174  361:aload           9
	//  175  363:lload           7
	//  176  365:iload_1         
	//  177  366:iload_3         
	//  178  367:invokevirtual   #288 <Method boolean CursorWindow.putLong(long, int, int)>
	//  179  370:istore          6
		break MISSING_BLOCK_LABEL_779;
	//  180  372:goto            779
_L6:
		if(obj3 instanceof Integer)
	//* 181  375:aload           14
	//* 182  377:instanceof      #290 <Class Integer>
	//* 183  380:ifeq            404
		{
			flag1 = ((CursorWindow) (obj)).putLong(((Integer)obj3).intValue(), i, k);
	//  184  383:aload           9
	//  185  385:aload           14
	//  186  387:checkcast       #290 <Class Integer>
	//  187  390:invokevirtual   #293 <Method int Integer.intValue()>
	//  188  393:i2l             
	//  189  394:iload_1         
	//  190  395:iload_3         
	//  191  396:invokevirtual   #288 <Method boolean CursorWindow.putLong(long, int, int)>
	//  192  399:istore          6
			break MISSING_BLOCK_LABEL_779;
	//  193  401:goto            779
		}
		if(!(obj3 instanceof Boolean)) goto _L8; else goto _L7
	//  194  404:aload           14
	//  195  406:instanceof      #295 <Class Boolean>
	//  196  409:ifeq            429
_L7:
		if(((Boolean)obj3).booleanValue())
	//* 197  412:aload           14
	//* 198  414:checkcast       #295 <Class Boolean>
	//* 199  417:invokevirtual   #298 <Method boolean Boolean.booleanValue()>
	//* 200  420:ifeq            773
			l1 = 1L;
	//  201  423:lconst_1        
	//  202  424:lstore          7
		else
	//* 203  426:goto            361
	//* 204  429:aload           14
	//* 205  431:instanceof      #300 <Class byte[]>
	//* 206  434:ifeq            454
	//* 207  437:aload           9
	//* 208  439:aload           14
	//* 209  441:checkcast       #300 <Class byte[]>
	//* 210  444:iload_1         
	//* 211  445:iload_3         
	//* 212  446:invokevirtual   #304 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//* 213  449:istore          6
	//* 214  451:goto            779
	//* 215  454:aload           14
	//* 216  456:instanceof      #306 <Class Double>
	//* 217  459:ifeq            482
	//* 218  462:aload           9
	//* 219  464:aload           14
	//* 220  466:checkcast       #306 <Class Double>
	//* 221  469:invokevirtual   #310 <Method double Double.doubleValue()>
	//* 222  472:iload_1         
	//* 223  473:iload_3         
	//* 224  474:invokevirtual   #314 <Method boolean CursorWindow.putDouble(double, int, int)>
	//* 225  477:istore          6
	//* 226  479:goto            779
	//* 227  482:aload           14
	//* 228  484:instanceof      #316 <Class Float>
	//* 229  487:ifeq            511
	//* 230  490:aload           9
	//* 231  492:aload           14
	//* 232  494:checkcast       #316 <Class Float>
	//* 233  497:invokevirtual   #320 <Method float Float.floatValue()>
	//* 234  500:f2d             
	//* 235  501:iload_1         
	//* 236  502:iload_3         
	//* 237  503:invokevirtual   #314 <Method boolean CursorWindow.putDouble(double, int, int)>
	//* 238  506:istore          6
	//* 239  508:goto            779
	//* 240  511:aload           14
	//* 241  513:invokestatic    #173 <Method String String.valueOf(Object)>
	//* 242  516:astore_0        
	//* 243  517:new             #221 <Class StringBuilder>
	//* 244  520:dup             
	//* 245  521:aload           10
	//* 246  523:invokestatic    #173 <Method String String.valueOf(Object)>
	//* 247  526:invokevirtual   #177 <Method int String.length()>
	//* 248  529:bipush          32
	//* 249  531:iadd            
	//* 250  532:aload_0         
	//* 251  533:invokestatic    #173 <Method String String.valueOf(Object)>
	//* 252  536:invokevirtual   #177 <Method int String.length()>
	//* 253  539:iadd            
	//* 254  540:invokespecial   #224 <Method void StringBuilder(int)>
	//* 255  543:astore          9
	//* 256  545:aload           9
	//* 257  547:ldc2            #322 <String "Unsupported object for column ">
	//* 258  550:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//* 259  553:pop             
	//* 260  554:aload           9
	//* 261  556:aload           10
	//* 262  558:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//* 263  561:pop             
	//* 264  562:aload           9
	//* 265  564:ldc2            #324 <String ": ">
	//* 266  567:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//* 267  570:pop             
	//* 268  571:aload           9
	//* 269  573:aload_0         
	//* 270  574:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//* 271  577:pop             
	//* 272  578:new             #157 <Class IllegalArgumentException>
	//* 273  581:dup             
	//* 274  582:aload           9
	//* 275  584:invokevirtual   #241 <Method String StringBuilder.toString()>
	//* 276  587:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//* 277  590:athrow          
	//* 278  591:iload           6
	//* 279  593:ifne            707
	//* 280  596:iload_2         
	//* 281  597:ifeq            611
	//* 282  600:new             #11  <Class DataHolder$zaa>
	//* 283  603:dup             
	//* 284  604:ldc2            #326 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//* 285  607:invokespecial   #327 <Method void DataHolder$zaa(String)>
	//* 286  610:athrow          
	//* 287  611:new             #221 <Class StringBuilder>
	//* 288  614:dup             
	//* 289  615:bipush          74
	//* 290  617:invokespecial   #224 <Method void StringBuilder(int)>
	//* 291  620:astore          10
	//* 292  622:aload           10
	//* 293  624:ldc2            #329 <String "Couldn't populate window data for row ">
	//* 294  627:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//* 295  630:pop             
	//* 296  631:aload           10
	//* 297  633:iload_1         
	//* 298  634:invokevirtual   #233 <Method StringBuilder StringBuilder.append(int)>
	//* 299  637:pop             
	//* 300  638:aload           10
	//* 301  640:ldc2            #331 <String " - allocating new window.">
	//* 302  643:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//* 303  646:pop             
	//* 304  647:ldc1            #237 <String "DataHolder">
	//* 305  649:aload           10
	//* 306  651:invokevirtual   #241 <Method String StringBuilder.toString()>
	//* 307  654:invokestatic    #247 <Method int Log.d(String, String)>
	//* 308  657:pop             
	//* 309  658:aload           9
	//* 310  660:invokevirtual   #334 <Method void CursorWindow.freeLastRow()>
	//* 311  663:new             #188 <Class CursorWindow>
	//* 312  666:dup             
	//* 313  667:iconst_0        
	//* 314  668:invokespecial   #207 <Method void CursorWindow(boolean)>
	//* 315  671:astore          9
	//* 316  673:aload           9
	//* 317  675:iload_1         
	//* 318  676:invokevirtual   #250 <Method void CursorWindow.setStartPosition(int)>
	//* 319  679:aload           9
	//* 320  681:aload_0         
	//* 321  682:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//* 322  685:arraylength     
	//* 323  686:invokevirtual   #216 <Method boolean CursorWindow.setNumColumns(int)>
	//* 324  689:pop             
	//* 325  690:aload           12
	//* 326  692:aload           9
	//* 327  694:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//* 328  697:pop             
	//* 329  698:iload_1         
	//* 330  699:iconst_1        
	//* 331  700:isub            
	//* 332  701:istore_1        
	//* 333  702:iconst_1        
	//* 334  703:istore_2        
	//* 335  704:goto            709
	//* 336  707:iconst_0        
	//* 337  708:istore_2        
	//* 338  709:iload_1         
	//* 339  710:iconst_1        
	//* 340  711:iadd            
	//* 341  712:istore_1        
	//* 342  713:aload           9
	//* 343  715:astore          10
	//* 344  717:goto            107
	//* 345  720:astore_0        
	//* 346  721:aload           12
	//* 347  723:invokevirtual   #197 <Method int ArrayList.size()>
	//* 348  726:istore_2        
	//* 349  727:iload           4
	//* 350  729:istore_1        
	//* 351  730:iload_1         
	//* 352  731:iload_2         
	//* 353  732:icmpge          754
	//* 354  735:aload           12
	//* 355  737:iload_1         
	//* 356  738:invokevirtual   #335 <Method Object ArrayList.get(int)>
	//* 357  741:checkcast       #188 <Class CursorWindow>
	//* 358  744:invokevirtual   #338 <Method void CursorWindow.close()>
	//* 359  747:iload_1         
	//* 360  748:iconst_1        
	//* 361  749:iadd            
	//* 362  750:istore_1        
	//* 363  751:goto            730
	//* 364  754:aload_0         
	//* 365  755:athrow          
	//* 366  756:aload           12
	//* 367  758:aload           12
	//* 368  760:invokevirtual   #197 <Method int ArrayList.size()>
	//* 369  763:anewarray       CursorWindow[]
	//* 370  766:invokevirtual   #262 <Method Object[] ArrayList.toArray(Object[])>
	//* 371  769:checkcast       #132 <Class CursorWindow[]>
	//* 372  772:areturn         
			l1 = 0L;
	//  373  773:lconst_0        
	//  374  774:lstore          7
		if(true) goto _L9; else goto _L8
	//  375  776:goto            361
_L8:
		if(obj3 instanceof byte[])
		{
			flag1 = ((CursorWindow) (obj)).putBlob((byte[])obj3, i, k);
			break MISSING_BLOCK_LABEL_779;
		}
		if(obj3 instanceof Double)
		{
			flag1 = ((CursorWindow) (obj)).putDouble(((Double)obj3).doubleValue(), i, k);
			break MISSING_BLOCK_LABEL_779;
		}
		break MISSING_BLOCK_LABEL_482;
_L4:
		if(flag1)
			break MISSING_BLOCK_LABEL_707;
		if(!j)
			break MISSING_BLOCK_LABEL_611;
		throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		obj1 = ((Object) (new StringBuilder(74)));
		((StringBuilder) (obj1)).append("Couldn't populate window data for row ");
		((StringBuilder) (obj1)).append(i);
		((StringBuilder) (obj1)).append(" - allocating new window.");
		Log.d("DataHolder", ((StringBuilder) (obj1)).toString());
		((CursorWindow) (obj)).freeLastRow();
		obj = ((Object) (new CursorWindow(false)));
		((CursorWindow) (obj)).setStartPosition(i);
		((CursorWindow) (obj)).setNumColumns(Builder.zaa(builder1).length);
		arraylist.add(obj);
		i--;
		j = 1;
		break MISSING_BLOCK_LABEL_709;
		j = 0;
		i++;
		obj1 = obj;
		  goto _L10
		if(obj3 instanceof Float)
		{
			flag1 = ((CursorWindow) (obj)).putDouble(((Float)obj3).floatValue(), i, k);
			break MISSING_BLOCK_LABEL_779;
		}
		try
		{
			builder1 = ((Builder) (String.valueOf(obj3)));
			obj = ((Object) (new StringBuilder(String.valueOf(obj1).length() + 32 + String.valueOf(((Object) (builder1))).length())));
			((StringBuilder) (obj)).append("Unsupported object for column ");
			((StringBuilder) (obj)).append(((String) (obj1)));
			((StringBuilder) (obj)).append(": ");
			((StringBuilder) (obj)).append(((String) (builder1)));
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
		}
		// Misplaced declaration of an exception variable
		catch(Builder builder1)
		{
			j = arraylist.size();
		}
		for(i = ((int) (flag)); i < j; i++)
			((CursorWindow)arraylist.get(i)).close();

		throw builder1;
_L2:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
		k++;
	//  376  779:iload_3         
	//  377  780:iconst_1        
	//  378  781:iadd            
	//  379  782:istore_3        
		  goto _L11
	//* 380  783:goto            268
	}

	private static CursorWindow[] zaa(CursorWrapper cursorwrapper)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #194 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #208 <Method void ArrayList()>
	//    3    7:astore          5
		int j;
		CursorWindow cursorwindow;
		j = cursorwrapper.getCount();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #341 <Method int CursorWrapper.getCount()>
	//    6   13:istore_2        
		cursorwindow = cursorwrapper.getWindow();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #345 <Method CursorWindow CursorWrapper.getWindow()>
	//    9   18:astore          4
		if(cursorwindow == null) goto _L2; else goto _L1
	//   10   20:aload           4
	//   11   22:ifnull          185
_L1:
		if(cursorwindow.getStartPosition() != 0) goto _L2; else goto _L3
	//   12   25:aload           4
	//   13   27:invokevirtual   #348 <Method int CursorWindow.getStartPosition()>
	//   14   30:ifne            185
_L3:
		int i;
		cursorwindow.acquireReference();
	//   15   33:aload           4
	//   16   35:invokevirtual   #351 <Method void CursorWindow.acquireReference()>
		cursorwrapper.setWindow(((CursorWindow) (null)));
	//   17   38:aload_0         
	//   18   39:aconst_null     
	//   19   40:invokevirtual   #355 <Method void CursorWrapper.setWindow(CursorWindow)>
		arraylist.add(((Object) (cursorwindow)));
	//   20   43:aload           5
	//   21   45:aload           4
	//   22   47:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//   23   50:pop             
		i = cursorwindow.getNumRows();
	//   24   51:aload           4
	//   25   53:invokevirtual   #358 <Method int CursorWindow.getNumRows()>
	//   26   56:istore_1        
	//*  27   57:goto            60
_L5:
		if(i >= j)
			break MISSING_BLOCK_LABEL_155;
	//   28   60:iload_1         
	//   29   61:iload_2         
	//   30   62:icmpge          155
		if(!cursorwrapper.moveToPosition(i))
			break MISSING_BLOCK_LABEL_155;
	//   31   65:aload_0         
	//   32   66:iload_1         
	//   33   67:invokevirtual   #361 <Method boolean CursorWrapper.moveToPosition(int)>
	//   34   70:ifeq            155
		cursorwindow = cursorwrapper.getWindow();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #345 <Method CursorWindow CursorWrapper.getWindow()>
	//   37   77:astore          4
		if(cursorwindow == null)
			break MISSING_BLOCK_LABEL_97;
	//   38   79:aload           4
	//   39   81:ifnull          97
		cursorwindow.acquireReference();
	//   40   84:aload           4
	//   41   86:invokevirtual   #351 <Method void CursorWindow.acquireReference()>
		cursorwrapper.setWindow(((CursorWindow) (null)));
	//   42   89:aload_0         
	//   43   90:aconst_null     
	//   44   91:invokevirtual   #355 <Method void CursorWrapper.setWindow(CursorWindow)>
		break MISSING_BLOCK_LABEL_120;
	//   45   94:goto            120
		cursorwindow = new CursorWindow(false);
	//   46   97:new             #188 <Class CursorWindow>
	//   47  100:dup             
	//   48  101:iconst_0        
	//   49  102:invokespecial   #207 <Method void CursorWindow(boolean)>
	//   50  105:astore          4
		cursorwindow.setStartPosition(i);
	//   51  107:aload           4
	//   52  109:iload_1         
	//   53  110:invokevirtual   #250 <Method void CursorWindow.setStartPosition(int)>
		cursorwrapper.fillWindow(i, cursorwindow);
	//   54  113:aload_0         
	//   55  114:iload_1         
	//   56  115:aload           4
	//   57  117:invokevirtual   #365 <Method void CursorWrapper.fillWindow(int, CursorWindow)>
		int k;
		if(cursorwindow.getNumRows() == 0)
			break MISSING_BLOCK_LABEL_155;
	//   58  120:aload           4
	//   59  122:invokevirtual   #358 <Method int CursorWindow.getNumRows()>
	//   60  125:ifeq            155
		arraylist.add(((Object) (cursorwindow)));
	//   61  128:aload           5
	//   62  130:aload           4
	//   63  132:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//   64  135:pop             
		i = cursorwindow.getStartPosition();
	//   65  136:aload           4
	//   66  138:invokevirtual   #348 <Method int CursorWindow.getStartPosition()>
	//   67  141:istore_1        
		k = cursorwindow.getNumRows();
	//   68  142:aload           4
	//   69  144:invokevirtual   #358 <Method int CursorWindow.getNumRows()>
	//   70  147:istore_3        
		i += k;
	//   71  148:iload_1         
	//   72  149:iload_3         
	//   73  150:iadd            
	//   74  151:istore_1        
		continue; /* Loop/switch isn't completed */
	//   75  152:goto            60
		cursorwrapper.close();
	//   76  155:aload_0         
	//   77  156:invokevirtual   #366 <Method void CursorWrapper.close()>
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//   78  159:aload           5
	//   79  161:aload           5
	//   80  163:invokevirtual   #197 <Method int ArrayList.size()>
	//   81  166:anewarray       CursorWindow[]
	//   82  169:invokevirtual   #262 <Method Object[] ArrayList.toArray(Object[])>
	//   83  172:checkcast       #132 <Class CursorWindow[]>
	//   84  175:areturn         
		Exception exception;
		exception;
	//   85  176:astore          4
		cursorwrapper.close();
	//   86  178:aload_0         
	//   87  179:invokevirtual   #366 <Method void CursorWrapper.close()>
		throw exception;
	//   88  182:aload           4
	//   89  184:athrow          
_L2:
		i = 0;
	//   90  185:iconst_0        
	//   91  186:istore_1        
		if(true) goto _L5; else goto _L4
	//   92  187:goto            60
_L4:
	}

	public final void close()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mClosed) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #77  <Field boolean mClosed>
	//    4    6:ifne            41
_L1:
		mClosed = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #77  <Field boolean mClosed>
		int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
_L3:
		if(i >= zalr.length)
			break; /* Loop/switch isn't completed */
	//   10   16:iload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #85  <Field CursorWindow[] zalr>
	//   13   21:arraylength     
	//   14   22:icmpge          41
		zalr[i].close();
	//   15   25:aload_0         
	//   16   26:getfield        #85  <Field CursorWindow[] zalr>
	//   17   29:iload_1         
	//   18   30:aaload          
	//   19   31:invokevirtual   #338 <Method void CursorWindow.close()>
		i++;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
		if(true) goto _L3; else goto _L2
	//   24   38:goto            16
_L2:
		this;
	//   25   41:aload_0         
		JVM INSTR monitorexit ;
	//   26   42:monitorexit     
		return;
	//   27   43:return          
		Exception exception;
		exception;
	//   28   44:astore_2        
		this;
	//   29   45:aload_0         
		JVM INSTR monitorexit ;
	//   30   46:monitorexit     
		throw exception;
	//   31   47:aload_2         
	//   32   48:athrow          
	}

	protected final void finalize()
	{
		if(zalw && zalr.length > 0 && !isClosed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field boolean zalw>
	//*   2    4:ifeq            82
	//*   3    7:aload_0         
	//*   4    8:getfield        #85  <Field CursorWindow[] zalr>
	//*   5   11:arraylength     
	//*   6   12:ifle            82
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #155 <Method boolean isClosed()>
	//*   9   19:ifne            82
		{
			close();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #368 <Method void close()>
			String s = ((Object)this).toString();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #371 <Method String Object.toString()>
	//   14   30:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 178);
	//   15   31:new             #221 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokestatic    #173 <Method String String.valueOf(Object)>
	//   19   39:invokevirtual   #177 <Method int String.length()>
	//   20   42:sipush          178
	//   21   45:iadd            
	//   22   46:invokespecial   #224 <Method void StringBuilder(int)>
	//   23   49:astore_2        
			stringbuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
	//   24   50:aload_2         
	//   25   51:ldc2            #373 <String "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ">
	//   26   54:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
			stringbuilder.append(s);
	//   28   58:aload_2         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
			stringbuilder.append(")");
	//   32   64:aload_2         
	//   33   65:ldc1            #235 <String ")">
	//   34   67:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
			Log.e("DataBuffer", stringbuilder.toString());
	//   36   71:ldc2            #375 <String "DataBuffer">
	//   37   74:aload_2         
	//   38   75:invokevirtual   #241 <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #255 <Method int Log.e(String, String)>
	//   40   81:pop             
		}
		((Object)this).finalize();
	//   41   82:aload_0         
	//   42   83:invokespecial   #377 <Method void Object.finalize()>
		return;
	//   43   86:return          
		Exception exception;
		exception;
	//   44   87:astore_1        
		((Object)this).finalize();
	//   45   88:aload_0         
	//   46   89:invokespecial   #377 <Method void Object.finalize()>
		throw exception;
	//   47   92:aload_1         
	//   48   93:athrow          
	}

	public final boolean getBoolean(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return Long.valueOf(zalr[j].getLong(i, zalq.getInt(s))).longValue() == 1L;
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #388 <Method long CursorWindow.getLong(int, int)>
	//   14   24:invokestatic    #391 <Method Long Long.valueOf(long)>
	//   15   27:invokevirtual   #284 <Method long Long.longValue()>
	//   16   30:lconst_1        
	//   17   31:lcmp            
	//   18   32:ifne            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	public final byte[] getByteArray(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].getBlob(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #397 <Method byte[] CursorWindow.getBlob(int, int)>
	//   14   24:areturn         
	}

	public final int getCount()
	{
		return zalv;
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field int zalv>
	//    2    4:ireturn         
	}

	public final int getInteger(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].getInt(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #402 <Method int CursorWindow.getInt(int, int)>
	//   14   24:ireturn         
	}

	public final long getLong(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].getLong(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #388 <Method long CursorWindow.getLong(int, int)>
	//   14   24:lreturn         
	}

	public final Bundle getMetadata()
	{
		return zalt;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Bundle zalt>
	//    2    4:areturn         
	}

	public final int getStatusCode()
	{
		return zals;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int zals>
	//    2    4:ireturn         
	}

	public final String getString(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].getString(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #409 <Method String CursorWindow.getString(int, int)>
	//   14   24:areturn         
	}

	public final int getWindowIndex(int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(i >= 0 && i < zalv)
	//*   2    2:iload_1         
	//*   3    3:iflt            20
	//*   4    6:iload_1         
	//*   5    7:aload_0         
	//*   6    8:getfield        #164 <Field int zalv>
	//*   7   11:icmpge          20
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore          4
		else
	//*  10   17:goto            23
			flag = false;
	//   11   20:iconst_0        
	//   12   21:istore          4
		Preconditions.checkState(flag);
	//   13   23:iload           4
	//   14   25:invokestatic    #414 <Method void Preconditions.checkState(boolean)>
		int j;
		do
		{
			j = k;
	//   15   28:iload_3         
	//   16   29:istore_2        
			if(k >= zalu.length)
				break;
	//   17   30:iload_3         
	//   18   31:aload_0         
	//   19   32:getfield        #416 <Field int[] zalu>
	//   20   35:arraylength     
	//   21   36:icmpge          63
			if(i < zalu[k])
	//*  22   39:iload_1         
	//*  23   40:aload_0         
	//*  24   41:getfield        #416 <Field int[] zalu>
	//*  25   44:iload_3         
	//*  26   45:iaload          
	//*  27   46:icmpge          56
			{
				j = k - 1;
	//   28   49:iload_3         
	//   29   50:iconst_1        
	//   30   51:isub            
	//   31   52:istore_2        
				break;
	//   32   53:goto            63
			}
			k++;
	//   33   56:iload_3         
	//   34   57:iconst_1        
	//   35   58:iadd            
	//   36   59:istore_3        
		} while(true);
	//   37   60:goto            28
		i = j;
	//   38   63:iload_2         
	//   39   64:istore_1        
		if(j == zalu.length)
	//*  40   65:iload_2         
	//*  41   66:aload_0         
	//*  42   67:getfield        #416 <Field int[] zalu>
	//*  43   70:arraylength     
	//*  44   71:icmpne          78
			i = j - 1;
	//   45   74:iload_2         
	//   46   75:iconst_1        
	//   47   76:isub            
	//   48   77:istore_1        
		return i;
	//   49   78:iload_1         
	//   50   79:ireturn         
	}

	public final boolean hasColumn(String s)
	{
		return zalq.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Bundle zalq>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #151 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
	}

	public final boolean hasNull(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].isNull(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #421 <Method boolean CursorWindow.isNull(int, int)>
	//   14   24:ireturn         
	}

	public final boolean isClosed()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = mClosed;
	//    2    2:aload_0         
	//    3    3:getfield        #77  <Field boolean mClosed>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return flag;
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

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #429 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeStringArray(parcel, 1, zalp, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field String[] zalp>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #433 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 2, ((android.os.Parcelable []) (zalr)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #85  <Field CursorWindow[] zalr>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #437 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #439 <Method int getStatusCode()>
	//   20   32:invokestatic    #443 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #445 <Method Bundle getMetadata()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #449 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, zale);
	//   27   45:aload_1         
	//   28   46:sipush          1000
	//   29   49:aload_0         
	//   30   50:getfield        #81  <Field int zale>
	//   31   53:invokestatic    #443 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   32   56:aload_1         
	//   33   57:iload_3         
	//   34   58:invokestatic    #452 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		if((i & 1) != 0)
	//*  35   61:iload_2         
	//*  36   62:iconst_1        
	//*  37   63:iand            
	//*  38   64:ifeq            71
			close();
	//   39   67:aload_0         
	//   40   68:invokevirtual   #368 <Method void close()>
	//   41   71:return          
	}

	public final float zaa(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].getFloat(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #457 <Method float CursorWindow.getFloat(int, int)>
	//   14   24:freturn         
	}

	public final void zaa(String s, int i, int j, CharArrayBuffer chararraybuffer)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		zalr[j].copyStringToBuffer(i, zalq.getInt(s), chararraybuffer);
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:aload           4
	//   14   23:invokevirtual   #462 <Method void CursorWindow.copyStringToBuffer(int, int, CharArrayBuffer)>
	//   15   26:return          
	}

	public final double zab(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #380 <Method void zaa(String, int)>
		return zalr[j].getDouble(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #384 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #467 <Method double CursorWindow.getDouble(int, int)>
	//   14   24:dreturn         
	}

	public final void zaca()
	{
		zalq = new Bundle();
	//    0    0:aload_0         
	//    1    1:new             #147 <Class Bundle>
	//    2    4:dup             
	//    3    5:invokespecial   #468 <Method void Bundle()>
	//    4    8:putfield        #145 <Field Bundle zalq>
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		for(int i = 0; i < zalp.length; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #83  <Field String[] zalp>
	//*  12   20:arraylength     
	//*  13   21:icmpge          45
			zalq.putInt(zalp[i], i);
	//   14   24:aload_0         
	//   15   25:getfield        #145 <Field Bundle zalq>
	//   16   28:aload_0         
	//   17   29:getfield        #83  <Field String[] zalp>
	//   18   32:iload_1         
	//   19   33:aaload          
	//   20   34:iload_1         
	//   21   35:invokevirtual   #471 <Method void Bundle.putInt(String, int)>

	//   22   38:iload_1         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_1        
	//*  26   42:goto            15
		zalu = new int[zalr.length];
	//   27   45:aload_0         
	//   28   46:aload_0         
	//   29   47:getfield        #85  <Field CursorWindow[] zalr>
	//   30   50:arraylength     
	//   31   51:newarray        int[]
	//   32   53:putfield        #416 <Field int[] zalu>
		int k = 0;
	//   33   56:iconst_0        
	//   34   57:istore_2        
		for(int j = ((int) (flag)); j < zalr.length; j++)
	//*  35   58:iload_3         
	//*  36   59:istore_1        
	//*  37   60:iload_1         
	//*  38   61:aload_0         
	//*  39   62:getfield        #85  <Field CursorWindow[] zalr>
	//*  40   65:arraylength     
	//*  41   66:icmpge          109
		{
			zalu[j] = k;
	//   42   69:aload_0         
	//   43   70:getfield        #416 <Field int[] zalu>
	//   44   73:iload_1         
	//   45   74:iload_2         
	//   46   75:iastore         
			int l = zalr[j].getStartPosition();
	//   47   76:aload_0         
	//   48   77:getfield        #85  <Field CursorWindow[] zalr>
	//   49   80:iload_1         
	//   50   81:aaload          
	//   51   82:invokevirtual   #348 <Method int CursorWindow.getStartPosition()>
	//   52   85:istore_3        
			k += zalr[j].getNumRows() - (k - l);
	//   53   86:iload_2         
	//   54   87:aload_0         
	//   55   88:getfield        #85  <Field CursorWindow[] zalr>
	//   56   91:iload_1         
	//   57   92:aaload          
	//   58   93:invokevirtual   #358 <Method int CursorWindow.getNumRows()>
	//   59   96:iload_2         
	//   60   97:iload_3         
	//   61   98:isub            
	//   62   99:isub            
	//   63  100:iadd            
	//   64  101:istore_2        
		}

	//   65  102:iload_1         
	//   66  103:iconst_1        
	//   67  104:iadd            
	//   68  105:istore_1        
	//*  69  106:goto            60
		zalv = k;
	//   70  109:aload_0         
	//   71  110:iload_2         
	//   72  111:putfield        #164 <Field int zalv>
	//   73  114:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zac();
	private static final Builder zalx = new zab(new String[0], ((String) (null)));
	private boolean mClosed;
	private final int zale;
	private final String zalp[];
	private Bundle zalq;
	private final CursorWindow zalr[];
	private final int zals;
	private final Bundle zalt;
	private int zalu[];
	private int zalv;
	private boolean zalw;

	static 
	{
	//    0    0:new             #56  <Class zac>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void zac()>
	//    3    7:putstatic       #61  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #63  <Class zab>
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:anewarray       String[]
	//    8   18:aconst_null     
	//    9   19:invokespecial   #68  <Method void zab(String[], String)>
	//   10   22:putstatic       #70  <Field DataHolder$Builder zalx>
	//*  11   25:return          
	}
}
