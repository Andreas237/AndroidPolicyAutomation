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
			Object obj = ((Object) (zalz));
		//    2    4:aload_0         
		//    3    5:getfield        #42  <Field String zalz>
		//    4    8:astore_3        
			int i;
			if(obj == null)
		//*   5    9:aload_3         
		//*   6   10:ifnonnull       18
			{
				i = -1;
		//    7   13:iconst_m1       
		//    8   14:istore_2        
			} else
		//*   9   15:goto            81
			{
				obj = hashmap.get(obj);
		//   10   18:aload_1         
		//   11   19:aload_3         
		//   12   20:invokevirtual   #125 <Method Object HashMap.get(Object)>
		//   13   23:astore_3        
				if(obj == null)
		//*  14   24:aload_3         
		//*  15   25:ifnonnull       33
				{
					i = -1;
		//   16   28:iconst_m1       
		//   17   29:istore_2        
				} else
		//*  18   30:goto            81
				{
					Integer integer = (Integer)zama.get(obj);
		//   19   33:aload_0         
		//   20   34:getfield        #47  <Field HashMap zama>
		//   21   37:aload_3         
		//   22   38:invokevirtual   #125 <Method Object HashMap.get(Object)>
		//   23   41:checkcast       #127 <Class Integer>
		//   24   44:astore          4
					if(integer == null)
		//*  25   46:aload           4
		//*  26   48:ifnonnull       75
					{
						zama.put(obj, ((Object) (Integer.valueOf(zaly.size()))));
		//   27   51:aload_0         
		//   28   52:getfield        #47  <Field HashMap zama>
		//   29   55:aload_3         
		//   30   56:aload_0         
		//   31   57:getfield        #40  <Field ArrayList zaly>
		//   32   60:invokevirtual   #128 <Method int ArrayList.size()>
		//   33   63:invokestatic    #132 <Method Integer Integer.valueOf(int)>
		//   34   66:invokevirtual   #119 <Method Object HashMap.put(Object, Object)>
		//   35   69:pop             
						i = -1;
		//   36   70:iconst_m1       
		//   37   71:istore_2        
					} else
		//*  38   72:goto            81
					{
						i = integer.intValue();
		//   39   75:aload           4
		//   40   77:invokevirtual   #135 <Method int Integer.intValue()>
		//   41   80:istore_2        
					}
				}
			}
			if(i == -1)
		//*  42   81:iload_2         
		//*  43   82:iconst_m1       
		//*  44   83:icmpne          98
			{
				zaly.add(((Object) (hashmap)));
		//   45   86:aload_0         
		//   46   87:getfield        #40  <Field ArrayList zaly>
		//   47   90:aload_1         
		//   48   91:invokevirtual   #139 <Method boolean ArrayList.add(Object)>
		//   49   94:pop             
			} else
		//*  50   95:goto            116
			{
				zaly.remove(i);
		//   51   98:aload_0         
		//   52   99:getfield        #40  <Field ArrayList zaly>
		//   53  102:iload_2         
		//   54  103:invokevirtual   #143 <Method Object ArrayList.remove(int)>
		//   55  106:pop             
				zaly.add(i, ((Object) (hashmap)));
		//   56  107:aload_0         
		//   57  108:getfield        #40  <Field ArrayList zaly>
		//   58  111:iload_2         
		//   59  112:aload_1         
		//   60  113:invokevirtual   #146 <Method void ArrayList.add(int, Object)>
			}
			zamb = false;
		//   61  116:aload_0         
		//   62  117:iconst_0        
		//   63  118:putfield        #49  <Field boolean zamb>
			return this;
		//   64  121:aload_0         
		//   65  122:areturn         
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
		Bundle bundle = zalq;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Bundle zalq>
	//    2    4:astore_3        
		if(bundle != null && bundle.containsKey(s))
	//*   3    5:aload_3         
	//*   4    6:ifnull          63
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #151 <Method boolean Bundle.containsKey(String)>
	//*   8   14:ifne            20
	//*   9   17:goto            63
			if(!isClosed())
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #155 <Method boolean isClosed()>
	//*  12   24:ifne            53
			{
				if(i >= 0 && i < zalv)
	//*  13   27:iload_2         
	//*  14   28:iflt            40
	//*  15   31:iload_2         
	//*  16   32:aload_0         
	//*  17   33:getfield        #157 <Field int zalv>
	//*  18   36:icmpge          40
					return;
	//   19   39:return          
				else
					throw new CursorIndexOutOfBoundsException(i, zalv);
	//   20   40:new             #159 <Class CursorIndexOutOfBoundsException>
	//   21   43:dup             
	//   22   44:iload_2         
	//   23   45:aload_0         
	//   24   46:getfield        #157 <Field int zalv>
	//   25   49:invokespecial   #162 <Method void CursorIndexOutOfBoundsException(int, int)>
	//   26   52:athrow          
			} else
			{
				throw new IllegalArgumentException("Buffer is closed.");
	//   27   53:new             #164 <Class IllegalArgumentException>
	//   28   56:dup             
	//   29   57:ldc1            #166 <String "Buffer is closed.">
	//   30   59:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   31   62:athrow          
			}
		s = String.valueOf(((Object) (s)));
	//   32   63:aload_1         
	//   33   64:invokestatic    #173 <Method String String.valueOf(Object)>
	//   34   67:astore_1        
		if(s.length() != 0)
	//*  35   68:aload_1         
	//*  36   69:invokevirtual   #177 <Method int String.length()>
	//*  37   72:ifeq            85
			s = "No such column: ".concat(s);
	//   38   75:ldc1            #179 <String "No such column: ">
	//   39   77:aload_1         
	//   40   78:invokevirtual   #183 <Method String String.concat(String)>
	//   41   81:astore_1        
		else
	//*  42   82:goto            95
			s = new String("No such column: ");
	//   43   85:new             #65  <Class String>
	//   44   88:dup             
	//   45   89:ldc1            #179 <String "No such column: ">
	//   46   91:invokespecial   #184 <Method void String(String)>
	//   47   94:astore_1        
		throw new IllegalArgumentException(s);
	//   48   95:new             #164 <Class IllegalArgumentException>
	//   49   98:dup             
	//   50   99:aload_1         
	//   51  100:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//   52  103:athrow          
	}

	private static CursorWindow[] zaa(Builder builder1, int i)
	{
		boolean flag;
		boolean flag1;
		int i1;
		Object obj1;
		Object obj2;
		ArrayList arraylist;
		int j = Builder.zaa(builder1).length;
	//    0    0:aload_0         
	//    1    1:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//    2    4:arraylength     
	//    3    5:istore_2        
		flag1 = false;
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
		i1 = ((List) (obj2)).size();
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
		flag = false;
	//   51  103:iconst_0        
	//   52  104:istore_2        
		i = ((int) (flag));
	//   53  105:iload_2         
	//   54  106:istore_1        
_L2:
		Object obj;
		if(i >= i1)
			break; /* Loop/switch isn't completed */
	//   55  107:iload_1         
	//   56  108:iload           5
	//   57  110:icmpge          766
		obj = obj1;
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
		int l;
		l = 0;
	//  128  263:iconst_0        
	//  129  264:istore_3        
		int k;
		long l1;
		Object obj3;
		for(boolean flag2 = true; l >= Builder.zaa(builder1).length || !flag2; l++)
			break MISSING_BLOCK_LABEL_601;

	//  130  265:iconst_1        
	//  131  266:istore          6
	//  132  268:iload_3         
	//  133  269:aload_0         
	//  134  270:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//  135  273:arraylength     
	//  136  274:icmpge          601
	//  137  277:iload           6
	//  138  279:ifeq            601
	//  139  282:aload_0         
	//  140  283:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//  141  286:iload_3         
	//  142  287:aaload          
	//  143  288:astore          10
	//  144  290:aload           13
	//  145  292:aload           10
	//  146  294:invokeinterface #270 <Method Object Map.get(Object)>
	//  147  299:astore          14
	//  148  301:aload           14
	//  149  303:ifnonnull       318
	//  150  306:aload           9
	//  151  308:iload_1         
	//  152  309:iload_3         
	//  153  310:invokevirtual   #274 <Method boolean CursorWindow.putNull(int, int)>
	//  154  313:istore          6
	//  155  315:goto            789
	//  156  318:aload           14
	//  157  320:instanceof      #65  <Class String>
	//  158  323:ifeq            343
	//  159  326:aload           9
	//  160  328:aload           14
	//  161  330:checkcast       #65  <Class String>
	//  162  333:iload_1         
	//  163  334:iload_3         
	//  164  335:invokevirtual   #278 <Method boolean CursorWindow.putString(String, int, int)>
	//  165  338:istore          6
	//  166  340:goto            789
	//  167  343:aload           14
	//  168  345:instanceof      #280 <Class Long>
	//  169  348:ifeq            371
	//  170  351:aload           9
	//  171  353:aload           14
	//  172  355:checkcast       #280 <Class Long>
	//  173  358:invokevirtual   #284 <Method long Long.longValue()>
	//  174  361:iload_1         
	//  175  362:iload_3         
	//  176  363:invokevirtual   #288 <Method boolean CursorWindow.putLong(long, int, int)>
	//  177  366:istore          6
	//  178  368:goto            789
	//  179  371:aload           14
	//  180  373:instanceof      #290 <Class Integer>
	//  181  376:ifeq            400
	//  182  379:aload           9
	//  183  381:aload           14
	//  184  383:checkcast       #290 <Class Integer>
	//  185  386:invokevirtual   #293 <Method int Integer.intValue()>
	//  186  389:i2l             
	//  187  390:iload_1         
	//  188  391:iload_3         
	//  189  392:invokevirtual   #288 <Method boolean CursorWindow.putLong(long, int, int)>
	//  190  395:istore          6
	//  191  397:goto            789
	//  192  400:aload           14
	//  193  402:instanceof      #295 <Class Boolean>
	//  194  405:ifeq            439
	//  195  408:aload           14
	//  196  410:checkcast       #295 <Class Boolean>
	//  197  413:invokevirtual   #298 <Method boolean Boolean.booleanValue()>
	//  198  416:ifeq            783
	//  199  419:lconst_1        
	//  200  420:lstore          7
	//  201  422:goto            425
	//  202  425:aload           9
	//  203  427:lload           7
	//  204  429:iload_1         
	//  205  430:iload_3         
	//  206  431:invokevirtual   #288 <Method boolean CursorWindow.putLong(long, int, int)>
	//  207  434:istore          6
	//  208  436:goto            789
	//  209  439:aload           14
	//  210  441:instanceof      #300 <Class byte[]>
	//  211  444:ifeq            464
	//  212  447:aload           9
	//  213  449:aload           14
	//  214  451:checkcast       #300 <Class byte[]>
	//  215  454:iload_1         
	//  216  455:iload_3         
	//  217  456:invokevirtual   #304 <Method boolean CursorWindow.putBlob(byte[], int, int)>
	//  218  459:istore          6
	//  219  461:goto            789
	//  220  464:aload           14
	//  221  466:instanceof      #306 <Class Double>
	//  222  469:ifeq            492
	//  223  472:aload           9
	//  224  474:aload           14
	//  225  476:checkcast       #306 <Class Double>
	//  226  479:invokevirtual   #310 <Method double Double.doubleValue()>
	//  227  482:iload_1         
	//  228  483:iload_3         
	//  229  484:invokevirtual   #314 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  230  487:istore          6
	//  231  489:goto            789
	//  232  492:aload           14
	//  233  494:instanceof      #316 <Class Float>
	//  234  497:ifeq            521
	//  235  500:aload           9
	//  236  502:aload           14
	//  237  504:checkcast       #316 <Class Float>
	//  238  507:invokevirtual   #320 <Method float Float.floatValue()>
	//  239  510:f2d             
	//  240  511:iload_1         
	//  241  512:iload_3         
	//  242  513:invokevirtual   #314 <Method boolean CursorWindow.putDouble(double, int, int)>
	//  243  516:istore          6
	//  244  518:goto            789
	//  245  521:aload           14
	//  246  523:invokestatic    #173 <Method String String.valueOf(Object)>
	//  247  526:astore_0        
	//  248  527:new             #221 <Class StringBuilder>
	//  249  530:dup             
	//  250  531:aload           10
	//  251  533:invokestatic    #173 <Method String String.valueOf(Object)>
	//  252  536:invokevirtual   #177 <Method int String.length()>
	//  253  539:bipush          32
	//  254  541:iadd            
	//  255  542:aload_0         
	//  256  543:invokestatic    #173 <Method String String.valueOf(Object)>
	//  257  546:invokevirtual   #177 <Method int String.length()>
	//  258  549:iadd            
	//  259  550:invokespecial   #224 <Method void StringBuilder(int)>
	//  260  553:astore          9
	//  261  555:aload           9
	//  262  557:ldc2            #322 <String "Unsupported object for column ">
	//  263  560:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  264  563:pop             
	//  265  564:aload           9
	//  266  566:aload           10
	//  267  568:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  268  571:pop             
	//  269  572:aload           9
	//  270  574:ldc2            #324 <String ": ">
	//  271  577:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  272  580:pop             
	//  273  581:aload           9
	//  274  583:aload_0         
	//  275  584:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  276  587:pop             
	//  277  588:new             #164 <Class IllegalArgumentException>
	//  278  591:dup             
	//  279  592:aload           9
	//  280  594:invokevirtual   #241 <Method String StringBuilder.toString()>
	//  281  597:invokespecial   #169 <Method void IllegalArgumentException(String)>
	//  282  600:athrow          
	//  283  601:iload           6
	//  284  603:ifne            717
	//  285  606:iload_2         
	//  286  607:ifne            706
	//  287  610:new             #221 <Class StringBuilder>
	//  288  613:dup             
	//  289  614:bipush          74
	//  290  616:invokespecial   #224 <Method void StringBuilder(int)>
	//  291  619:astore          10
	//  292  621:aload           10
	//  293  623:ldc2            #326 <String "Couldn't populate window data for row ">
	//  294  626:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  295  629:pop             
	//  296  630:aload           10
	//  297  632:iload_1         
	//  298  633:invokevirtual   #233 <Method StringBuilder StringBuilder.append(int)>
	//  299  636:pop             
	//  300  637:aload           10
	//  301  639:ldc2            #328 <String " - allocating new window.">
	//  302  642:invokevirtual   #230 <Method StringBuilder StringBuilder.append(String)>
	//  303  645:pop             
	//  304  646:ldc1            #237 <String "DataHolder">
	//  305  648:aload           10
	//  306  650:invokevirtual   #241 <Method String StringBuilder.toString()>
	//  307  653:invokestatic    #247 <Method int Log.d(String, String)>
	//  308  656:pop             
	//  309  657:aload           9
	//  310  659:invokevirtual   #331 <Method void CursorWindow.freeLastRow()>
	//  311  662:new             #188 <Class CursorWindow>
	//  312  665:dup             
	//  313  666:iconst_0        
	//  314  667:invokespecial   #207 <Method void CursorWindow(boolean)>
	//  315  670:astore          9
	//  316  672:aload           9
	//  317  674:iload_1         
	//  318  675:invokevirtual   #250 <Method void CursorWindow.setStartPosition(int)>
	//  319  678:aload           9
	//  320  680:aload_0         
	//  321  681:invokestatic    #104 <Method String[] DataHolder$Builder.zaa(DataHolder$Builder)>
	//  322  684:arraylength     
	//  323  685:invokevirtual   #216 <Method boolean CursorWindow.setNumColumns(int)>
	//  324  688:pop             
	//  325  689:aload           12
	//  326  691:aload           9
	//  327  693:invokevirtual   #212 <Method boolean ArrayList.add(Object)>
	//  328  696:pop             
	//  329  697:iload_1         
	//  330  698:iconst_1        
	//  331  699:isub            
	//  332  700:istore_1        
	//  333  701:iconst_1        
	//  334  702:istore_2        
	//  335  703:goto            719
	//  336  706:new             #11  <Class DataHolder$zaa>
	//  337  709:dup             
	//  338  710:ldc2            #333 <String "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.">
	//  339  713:invokespecial   #334 <Method void DataHolder$zaa(String)>
	//  340  716:athrow          
	//  341  717:iconst_0        
	//  342  718:istore_2        
	//  343  719:iload_1         
	//  344  720:iconst_1        
	//  345  721:iadd            
	//  346  722:istore_1        
	//  347  723:aload           9
	//  348  725:astore          10
	//  349  727:goto            107
	//  350  730:astore_0        
	//  351  731:aload           12
	//  352  733:invokevirtual   #197 <Method int ArrayList.size()>
	//  353  736:istore_2        
	//  354  737:iload           4
	//  355  739:istore_1        
	//  356  740:iload_1         
	//  357  741:iload_2         
	//  358  742:icmpge          764
	//  359  745:aload           12
	//  360  747:iload_1         
	//  361  748:invokevirtual   #335 <Method Object ArrayList.get(int)>
	//  362  751:checkcast       #188 <Class CursorWindow>
	//  363  754:invokevirtual   #338 <Method void CursorWindow.close()>
	//  364  757:iload_1         
	//  365  758:iconst_1        
	//  366  759:iadd            
	//  367  760:istore_1        
	//  368  761:goto            740
	//  369  764:aload_0         
	//  370  765:athrow          
	//  371  766:aload           12
	//  372  768:aload           12
	//  373  770:invokevirtual   #197 <Method int ArrayList.size()>
	//  374  773:anewarray       CursorWindow[]
	//  375  776:invokevirtual   #262 <Method Object[] ArrayList.toArray(Object[])>
	//  376  779:checkcast       #132 <Class CursorWindow[]>
	//  377  782:areturn         
	//  378  783:lconst_0        
	//  379  784:lstore          7
	//  380  786:goto            425
	//  381  789:iload_3         
	//  382  790:iconst_1        
	//  383  791:iadd            
	//  384  792:istore_3        
		obj1 = ((Object) (Builder.zaa(builder1)[l]));
		obj3 = map.get(obj1);
		if(obj3 != null)
			break MISSING_BLOCK_LABEL_318;
		flag2 = ((CursorWindow) (obj)).putNull(i, l);
		break MISSING_BLOCK_LABEL_789;
		if(obj3 instanceof String)
		{
			flag2 = ((CursorWindow) (obj)).putString((String)obj3, i, l);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Long)
		{
			flag2 = ((CursorWindow) (obj)).putLong(((Long)obj3).longValue(), i, l);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Integer)
		{
			flag2 = ((CursorWindow) (obj)).putLong(((Integer)obj3).intValue(), i, l);
			break MISSING_BLOCK_LABEL_789;
		}
		if(!(obj3 instanceof Boolean))
			break MISSING_BLOCK_LABEL_439;
		if(((Boolean)obj3).booleanValue())
			l1 = 1L;
		else
			l1 = 0L;
		flag2 = ((CursorWindow) (obj)).putLong(l1, i, l);
		break MISSING_BLOCK_LABEL_789;
		if(obj3 instanceof byte[])
		{
			flag2 = ((CursorWindow) (obj)).putBlob((byte[])obj3, i, l);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Double)
		{
			flag2 = ((CursorWindow) (obj)).putDouble(((Double)obj3).doubleValue(), i, l);
			break MISSING_BLOCK_LABEL_789;
		}
		if(obj3 instanceof Float)
		{
			flag2 = ((CursorWindow) (obj)).putDouble(((Float)obj3).floatValue(), i, l);
			break MISSING_BLOCK_LABEL_789;
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
			k = arraylist.size();
		}
		break MISSING_BLOCK_LABEL_737;
		if(flag2)
			break MISSING_BLOCK_LABEL_717;
		if(flag)
			break MISSING_BLOCK_LABEL_706;
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
		flag = true;
		break MISSING_BLOCK_LABEL_719;
		throw new zaa("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
		flag = false;
		i++;
		obj1 = obj;
		if(true) goto _L2; else goto _L1
		for(i = ((int) (flag1)); i < k; i++)
			((CursorWindow)arraylist.get(i)).close();

		throw builder1;
_L1:
		return (CursorWindow[])arraylist.toArray(((Object []) (new CursorWindow[arraylist.size()])));
	//* 385  793:goto            268
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
		throws Throwable
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
	//   11   23:invokevirtual   #370 <Method void close()>
			String s = ((Object)this).toString();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #373 <Method String Object.toString()>
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
	//   25   51:ldc2            #375 <String "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ">
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
	//   36   71:ldc2            #377 <String "DataBuffer">
	//   37   74:aload_2         
	//   38   75:invokevirtual   #241 <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #255 <Method int Log.e(String, String)>
	//   40   81:pop             
		}
		((Object)this).finalize();
	//   41   82:aload_0         
	//   42   83:invokespecial   #379 <Method void Object.finalize()>
		return;
	//   43   86:return          
		Exception exception;
		exception;
	//   44   87:astore_1        
		((Object)this).finalize();
	//   45   88:aload_0         
	//   46   89:invokespecial   #379 <Method void Object.finalize()>
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
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return Long.valueOf(zalr[j].getLong(i, zalq.getInt(s))).longValue() == 1L;
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #391 <Method long CursorWindow.getLong(int, int)>
	//   14   24:invokestatic    #394 <Method Long Long.valueOf(long)>
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
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].getBlob(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #400 <Method byte[] CursorWindow.getBlob(int, int)>
	//   14   24:areturn         
	}

	public final int getCount()
	{
		return zalv;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field int zalv>
	//    2    4:ireturn         
	}

	public final int getInteger(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].getInt(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #405 <Method int CursorWindow.getInt(int, int)>
	//   14   24:ireturn         
	}

	public final long getLong(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].getLong(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #391 <Method long CursorWindow.getLong(int, int)>
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
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].getString(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #412 <Method String CursorWindow.getString(int, int)>
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
	//*   6    8:getfield        #157 <Field int zalv>
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
	//   14   25:invokestatic    #417 <Method void Preconditions.checkState(boolean)>
		int j;
		do
		{
			int ai[] = zalu;
	//   15   28:aload_0         
	//   16   29:getfield        #419 <Field int[] zalu>
	//   17   32:astore          5
			j = k;
	//   18   34:iload_3         
	//   19   35:istore_2        
			if(k >= ai.length)
				break;
	//   20   36:iload_3         
	//   21   37:aload           5
	//   22   39:arraylength     
	//   23   40:icmpge          65
			if(i < ai[k])
	//*  24   43:iload_1         
	//*  25   44:aload           5
	//*  26   46:iload_3         
	//*  27   47:iaload          
	//*  28   48:icmpge          58
			{
				j = k - 1;
	//   29   51:iload_3         
	//   30   52:iconst_1        
	//   31   53:isub            
	//   32   54:istore_2        
				break;
	//   33   55:goto            65
			}
			k++;
	//   34   58:iload_3         
	//   35   59:iconst_1        
	//   36   60:iadd            
	//   37   61:istore_3        
		} while(true);
	//   38   62:goto            28
		i = j;
	//   39   65:iload_2         
	//   40   66:istore_1        
		if(j == zalu.length)
	//*  41   67:iload_2         
	//*  42   68:aload_0         
	//*  43   69:getfield        #419 <Field int[] zalu>
	//*  44   72:arraylength     
	//*  45   73:icmpne          80
			i = j - 1;
	//   46   76:iload_2         
	//   47   77:iconst_1        
	//   48   78:isub            
	//   49   79:istore_1        
		return i;
	//   50   80:iload_1         
	//   51   81:ireturn         
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
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].isNull(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #424 <Method boolean CursorWindow.isNull(int, int)>
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
	//    1    1:invokestatic    #432 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeStringArray(parcel, 1, zalp, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #83  <Field String[] zalp>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #436 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 2, ((android.os.Parcelable []) (zalr)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #85  <Field CursorWindow[] zalr>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #440 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:invokevirtual   #442 <Method int getStatusCode()>
	//   20   32:invokestatic    #446 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
	//   21   35:aload_1         
	//   22   36:iconst_4        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #448 <Method Bundle getMetadata()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #452 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeInt(parcel, 1000, zale);
	//   27   45:aload_1         
	//   28   46:sipush          1000
	//   29   49:aload_0         
	//   30   50:getfield        #81  <Field int zale>
	//   31   53:invokestatic    #446 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   32   56:aload_1         
	//   33   57:iload_3         
	//   34   58:invokestatic    #455 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
		if((i & 1) != 0)
	//*  35   61:iload_2         
	//*  36   62:iconst_1        
	//*  37   63:iand            
	//*  38   64:ifeq            71
			close();
	//   39   67:aload_0         
	//   40   68:invokevirtual   #370 <Method void close()>
	//   41   71:return          
	}

	public final float zaa(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].getFloat(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #460 <Method float CursorWindow.getFloat(int, int)>
	//   14   24:freturn         
	}

	public final void zaa(String s, int i, int j, CharArrayBuffer chararraybuffer)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		zalr[j].copyStringToBuffer(i, zalq.getInt(s), chararraybuffer);
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:aload           4
	//   14   23:invokevirtual   #465 <Method void CursorWindow.copyStringToBuffer(int, int, CharArrayBuffer)>
	//   15   26:return          
	}

	public final double zab(String s, int i, int j)
	{
		zaa(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #383 <Method void zaa(String, int)>
		return zalr[j].getDouble(i, zalq.getInt(s));
	//    4    6:aload_0         
	//    5    7:getfield        #85  <Field CursorWindow[] zalr>
	//    6   10:iload_3         
	//    7   11:aaload          
	//    8   12:iload_2         
	//    9   13:aload_0         
	//   10   14:getfield        #145 <Field Bundle zalq>
	//   11   17:aload_1         
	//   12   18:invokevirtual   #387 <Method int Bundle.getInt(String)>
	//   13   21:invokevirtual   #470 <Method double CursorWindow.getDouble(int, int)>
	//   14   24:dreturn         
	}

	public final void zaca()
	{
		zalq = new Bundle();
	//    0    0:aload_0         
	//    1    1:new             #147 <Class Bundle>
	//    2    4:dup             
	//    3    5:invokespecial   #471 <Method void Bundle()>
	//    4    8:putfield        #145 <Field Bundle zalq>
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		do
		{
			String as[] = zalp;
	//    9   15:aload_0         
	//   10   16:getfield        #83  <Field String[] zalp>
	//   11   19:astore          4
			if(i >= as.length)
				break;
	//   12   21:iload_1         
	//   13   22:aload           4
	//   14   24:arraylength     
	//   15   25:icmpge          47
			zalq.putInt(as[i], i);
	//   16   28:aload_0         
	//   17   29:getfield        #145 <Field Bundle zalq>
	//   18   32:aload           4
	//   19   34:iload_1         
	//   20   35:aaload          
	//   21   36:iload_1         
	//   22   37:invokevirtual   #474 <Method void Bundle.putInt(String, int)>
			i++;
	//   23   40:iload_1         
	//   24   41:iconst_1        
	//   25   42:iadd            
	//   26   43:istore_1        
		} while(true);
	//   27   44:goto            15
		zalu = new int[zalr.length];
	//   28   47:aload_0         
	//   29   48:aload_0         
	//   30   49:getfield        #85  <Field CursorWindow[] zalr>
	//   31   52:arraylength     
	//   32   53:newarray        int[]
	//   33   55:putfield        #419 <Field int[] zalu>
		int j = 0;
	//   34   58:iconst_0        
	//   35   59:istore_2        
		i = ((int) (flag));
	//   36   60:iload_3         
	//   37   61:istore_1        
		do
		{
			CursorWindow acursorwindow[] = zalr;
	//   38   62:aload_0         
	//   39   63:getfield        #85  <Field CursorWindow[] zalr>
	//   40   66:astore          4
			if(i < acursorwindow.length)
	//*  41   68:iload_1         
	//*  42   69:aload           4
	//*  43   71:arraylength     
	//*  44   72:icmpge          113
			{
				zalu[i] = j;
	//   45   75:aload_0         
	//   46   76:getfield        #419 <Field int[] zalu>
	//   47   79:iload_1         
	//   48   80:iload_2         
	//   49   81:iastore         
				int k = acursorwindow[i].getStartPosition();
	//   50   82:aload           4
	//   51   84:iload_1         
	//   52   85:aaload          
	//   53   86:invokevirtual   #348 <Method int CursorWindow.getStartPosition()>
	//   54   89:istore_3        
				j += zalr[i].getNumRows() - (j - k);
	//   55   90:iload_2         
	//   56   91:aload_0         
	//   57   92:getfield        #85  <Field CursorWindow[] zalr>
	//   58   95:iload_1         
	//   59   96:aaload          
	//   60   97:invokevirtual   #358 <Method int CursorWindow.getNumRows()>
	//   61  100:iload_2         
	//   62  101:iload_3         
	//   63  102:isub            
	//   64  103:isub            
	//   65  104:iadd            
	//   66  105:istore_2        
				i++;
	//   67  106:iload_1         
	//   68  107:iconst_1        
	//   69  108:iadd            
	//   70  109:istore_1        
			} else
	//*  71  110:goto            62
			{
				zalv = j;
	//   72  113:aload_0         
	//   73  114:iload_2         
	//   74  115:putfield        #157 <Field int zalv>
				return;
	//   75  118:return          
			}
		} while(true);
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
