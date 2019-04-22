// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import android.arch.persistence.room.migration.Migration;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.util.*;

// Referenced classes of package android.arch.persistence.room:
//			RoomDatabase

public static class RoomDatabase$MigrationContainer
{

	private void addMigration(Migration migration)
	{
		int i = migration.startVersion;
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field int Migration.startVersion>
	//    2    4:istore_2        
		int j = migration.endVersion;
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field int Migration.endVersion>
	//    5    9:istore_3        
		Object obj = ((Object) ((SparseArrayCompat)mMigrations.get(i)));
	//    6   10:aload_0         
	//    7   11:getfield        #19  <Field SparseArrayCompat mMigrations>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #35  <Method Object SparseArrayCompat.get(int)>
	//   10   18:checkcast       #16  <Class SparseArrayCompat>
	//   11   21:astore          5
		SparseArrayCompat sparsearraycompat = ((SparseArrayCompat) (obj));
	//   12   23:aload           5
	//   13   25:astore          4
		if(obj == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       51
		{
			sparsearraycompat = new SparseArrayCompat();
	//   16   32:new             #16  <Class SparseArrayCompat>
	//   17   35:dup             
	//   18   36:invokespecial   #17  <Method void SparseArrayCompat()>
	//   19   39:astore          4
			mMigrations.put(i, ((Object) (sparsearraycompat)));
	//   20   41:aload_0         
	//   21   42:getfield        #19  <Field SparseArrayCompat mMigrations>
	//   22   45:iload_2         
	//   23   46:aload           4
	//   24   48:invokevirtual   #39  <Method void SparseArrayCompat.put(int, Object)>
		}
		obj = ((Object) ((Migration)sparsearraycompat.get(j)));
	//   25   51:aload           4
	//   26   53:iload_3         
	//   27   54:invokevirtual   #35  <Method Object SparseArrayCompat.get(int)>
	//   28   57:checkcast       #24  <Class Migration>
	//   29   60:astore          5
		if(obj != null)
	//*  30   62:aload           5
	//*  31   64:ifnull          118
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   32   67:new             #41  <Class StringBuilder>
	//   33   70:dup             
	//   34   71:invokespecial   #42  <Method void StringBuilder()>
	//   35   74:astore          6
			stringbuilder.append("Overriding migration ");
	//   36   76:aload           6
	//   37   78:ldc1            #44  <String "Overriding migration ">
	//   38   80:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
			stringbuilder.append(obj);
	//   40   84:aload           6
	//   41   86:aload           5
	//   42   88:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   43   91:pop             
			stringbuilder.append(" with ");
	//   44   92:aload           6
	//   45   94:ldc1            #53  <String " with ">
	//   46   96:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   47   99:pop             
			stringbuilder.append(((Object) (migration)));
	//   48  100:aload           6
	//   49  102:aload_1         
	//   50  103:invokevirtual   #51  <Method StringBuilder StringBuilder.append(Object)>
	//   51  106:pop             
			Log.w("ROOM", stringbuilder.toString());
	//   52  107:ldc1            #55  <String "ROOM">
	//   53  109:aload           6
	//   54  111:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   55  114:invokestatic    #65  <Method int Log.w(String, String)>
	//   56  117:pop             
		}
		sparsearraycompat.append(j, ((Object) (migration)));
	//   57  118:aload           4
	//   58  120:iload_3         
	//   59  121:aload_1         
	//   60  122:invokevirtual   #67  <Method void SparseArrayCompat.append(int, Object)>
	//   61  125:return          
	}

	private List findUpMigrationPath(List list, boolean flag, int i, int j)
	{
		byte byte0;
		int l;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            13
		{
			byte0 = -1;
	//    2    4:iconst_m1       
	//    3    5:istore          6
			l = i;
	//    4    7:iload_3         
	//    5    8:istore          7
		} else
	//*   6   10:goto            19
		{
			byte0 = 1;
	//    7   13:iconst_1        
	//    8   14:istore          6
			l = i;
	//    9   16:iload_3         
	//   10   17:istore          7
		}
		while(flag ? l < j : l > j) 
	//*  11   19:iload_2         
	//*  12   20:ifeq            33
	//*  13   23:iload           7
	//*  14   25:iload           4
	//*  15   27:icmpge          205
	//*  16   30:goto            40
	//*  17   33:iload           7
	//*  18   35:iload           4
	//*  19   37:icmple          205
		{
			SparseArrayCompat sparsearraycompat = (SparseArrayCompat)mMigrations.get(l);
	//   20   40:aload_0         
	//   21   41:getfield        #19  <Field SparseArrayCompat mMigrations>
	//   22   44:iload           7
	//   23   46:invokevirtual   #35  <Method Object SparseArrayCompat.get(int)>
	//   24   49:checkcast       #16  <Class SparseArrayCompat>
	//   25   52:astore          11
			if(sparsearraycompat == null)
	//*  26   54:aload           11
	//*  27   56:ifnonnull       61
				return null;
	//   28   59:aconst_null     
	//   29   60:areturn         
			int i1 = sparsearraycompat.size();
	//   30   61:aload           11
	//   31   63:invokevirtual   #73  <Method int SparseArrayCompat.size()>
	//   32   66:istore          8
			boolean flag1 = false;
	//   33   68:iconst_0        
	//   34   69:istore          10
			int k;
			if(flag)
	//*  35   71:iload_2         
	//*  36   72:ifeq            87
			{
				k = i1 - 1;
	//   37   75:iload           8
	//   38   77:iconst_1        
	//   39   78:isub            
	//   40   79:istore          5
				i1 = -1;
	//   41   81:iconst_m1       
	//   42   82:istore          8
			} else
	//*  43   84:goto            90
			{
				k = 0;
	//   44   87:iconst_0        
	//   45   88:istore          5
			}
			int j1;
			do
			{
				i = ((int) (flag1));
	//   46   90:iload           10
	//   47   92:istore_3        
				j1 = l;
	//   48   93:iload           7
	//   49   95:istore          9
				if(k == i1)
					break;
	//   50   97:iload           5
	//   51   99:iload           8
	//   52  101:icmpeq          195
				j1 = sparsearraycompat.keyAt(k);
	//   53  104:aload           11
	//   54  106:iload           5
	//   55  108:invokevirtual   #77  <Method int SparseArrayCompat.keyAt(int)>
	//   56  111:istore          9
				if(flag)
	//*  57  113:iload_2         
	//*  58  114:ifeq            141
				{
					if(j1 <= j && j1 > l)
	//*  59  117:iload           9
	//*  60  119:iload           4
	//*  61  121:icmpgt          136
	//*  62  124:iload           9
	//*  63  126:iload           7
	//*  64  128:icmple          136
						i = 1;
	//   65  131:iconst_1        
	//   66  132:istore_3        
					else
	//*  67  133:goto            162
						i = 0;
	//   68  136:iconst_0        
	//   69  137:istore_3        
				} else
	//*  70  138:goto            162
				if(j1 >= j && j1 < l)
	//*  71  141:iload           9
	//*  72  143:iload           4
	//*  73  145:icmplt          160
	//*  74  148:iload           9
	//*  75  150:iload           7
	//*  76  152:icmpge          160
					i = 1;
	//   77  155:iconst_1        
	//   78  156:istore_3        
				else
	//*  79  157:goto            162
					i = 0;
	//   80  160:iconst_0        
	//   81  161:istore_3        
				if(i != 0)
	//*  82  162:iload_3         
	//*  83  163:ifeq            185
				{
					list.add(sparsearraycompat.valueAt(k));
	//   84  166:aload_1         
	//   85  167:aload           11
	//   86  169:iload           5
	//   87  171:invokevirtual   #80  <Method Object SparseArrayCompat.valueAt(int)>
	//   88  174:invokeinterface #86  <Method boolean List.add(Object)>
	//   89  179:pop             
					i = 1;
	//   90  180:iconst_1        
	//   91  181:istore_3        
					break;
	//   92  182:goto            195
				}
				k += ((int) (byte0));
	//   93  185:iload           5
	//   94  187:iload           6
	//   95  189:iadd            
	//   96  190:istore          5
			} while(true);
	//   97  192:goto            90
			l = j1;
	//   98  195:iload           9
	//   99  197:istore          7
			if(i == 0)
	//* 100  199:iload_3         
	//* 101  200:ifne            19
				return null;
	//  102  203:aconst_null     
	//  103  204:areturn         
		}
		return list;
	//  104  205:aload_1         
	//  105  206:areturn         
	}

	public transient void addMigrations(Migration amigration[])
	{
		int j = amigration.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          24
			addMigration(amigration[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokespecial   #93  <Method void addMigration(Migration)>

	//   13   17:iload_2         
	//   14   18:iconst_1        
	//   15   19:iadd            
	//   16   20:istore_2        
	//*  17   21:goto            5
	//   18   24:return          
	}

	public List findMigrationPath(int i, int j)
	{
		if(i == j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpne          9
			return Collections.emptyList();
	//    3    5:invokestatic    #103 <Method List Collections.emptyList()>
	//    4    8:areturn         
		boolean flag;
		if(j > i)
	//*   5    9:iload_2         
	//*   6   10:iload_1         
	//*   7   11:icmple          19
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_3        
		else
	//*  10   16:goto            21
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore_3        
		return findUpMigrationPath(((List) (new ArrayList())), flag, i, j);
	//   13   21:aload_0         
	//   14   22:new             #105 <Class ArrayList>
	//   15   25:dup             
	//   16   26:invokespecial   #106 <Method void ArrayList()>
	//   17   29:iload_3         
	//   18   30:iload_1         
	//   19   31:iload_2         
	//   20   32:invokespecial   #108 <Method List findUpMigrationPath(List, boolean, int, int)>
	//   21   35:areturn         
	}

	private SparseArrayCompat mMigrations;

	public RoomDatabase$MigrationContainer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mMigrations = new SparseArrayCompat();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class SparseArrayCompat>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void SparseArrayCompat()>
	//    6   12:putfield        #19  <Field SparseArrayCompat mMigrations>
	//    7   15:return          
	}
}
