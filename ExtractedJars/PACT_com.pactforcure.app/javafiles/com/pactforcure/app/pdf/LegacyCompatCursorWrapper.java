// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.pdf;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.net.Uri;
import java.util.Arrays;

public class LegacyCompatCursorWrapper extends CursorWrapper
{

	public LegacyCompatCursorWrapper(Cursor cursor)
	{
		this(cursor, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void LegacyCompatCursorWrapper(Cursor, String)>
	//    4    6:return          
	}

	public LegacyCompatCursorWrapper(Cursor cursor, String s)
	{
		this(cursor, s, ((Uri) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #20  <Method void LegacyCompatCursorWrapper(Cursor, String, Uri)>
	//    5    7:return          
	}

	public LegacyCompatCursorWrapper(Cursor cursor, String s, Uri uri)
	{
		super(cursor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void CursorWrapper(Cursor)>
		uriForDataColumn = uri;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #24  <Field Uri uriForDataColumn>
		if(cursor.getColumnIndex("_data") >= 0)
	//*   6   10:aload_1         
	//*   7   11:ldc1            #26  <String "_data">
	//*   8   13:invokeinterface #32  <Method int Cursor.getColumnIndex(String)>
	//*   9   18:iflt            48
			fakeDataColumn = -1;
	//   10   21:aload_0         
	//   11   22:iconst_m1       
	//   12   23:putfield        #34  <Field int fakeDataColumn>
		else
	//*  13   26:aload_1         
	//*  14   27:ldc1            #36  <String "mime_type">
	//*  15   29:invokeinterface #32  <Method int Cursor.getColumnIndex(String)>
	//*  16   34:iflt            61
	//*  17   37:aload_0         
	//*  18   38:iconst_m1       
	//*  19   39:putfield        #38  <Field int fakeMimeTypeColumn>
	//*  20   42:aload_0         
	//*  21   43:aload_2         
	//*  22   44:putfield        #40  <Field String mimeType>
	//*  23   47:return          
			fakeDataColumn = cursor.getColumnCount();
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokeinterface #44  <Method int Cursor.getColumnCount()>
	//   27   55:putfield        #34  <Field int fakeDataColumn>
		if(cursor.getColumnIndex("mime_type") >= 0)
			fakeMimeTypeColumn = -1;
		else
	//*  28   58:goto            26
		if(fakeDataColumn == -1)
	//*  29   61:aload_0         
	//*  30   62:getfield        #34  <Field int fakeDataColumn>
	//*  31   65:iconst_m1       
	//*  32   66:icmpne          82
			fakeMimeTypeColumn = cursor.getColumnCount();
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokeinterface #44  <Method int Cursor.getColumnCount()>
	//   36   76:putfield        #38  <Field int fakeMimeTypeColumn>
		else
	//*  37   79:goto            42
			fakeMimeTypeColumn = fakeDataColumn + 1;
	//   38   82:aload_0         
	//   39   83:aload_0         
	//   40   84:getfield        #34  <Field int fakeDataColumn>
	//   41   87:iconst_1        
	//   42   88:iadd            
	//   43   89:putfield        #38  <Field int fakeMimeTypeColumn>
		mimeType = s;
	//*  44   92:goto            42
	}

	private boolean cursorHasDataColumn()
	{
		return fakeDataColumn == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int fakeDataColumn>
	//    2    4:iconst_m1       
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private boolean cursorHasMimeTypeColumn()
	{
		return fakeMimeTypeColumn == -1;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int fakeMimeTypeColumn>
	//    2    4:iconst_m1       
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int getColumnCount()
	{
		int j = super.getColumnCount();
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method int CursorWrapper.getColumnCount()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(!cursorHasDataColumn())
	//*   5    7:aload_0         
	//*   6    8:invokespecial   #50  <Method boolean cursorHasDataColumn()>
	//*   7   11:ifne            18
			i = j + 1;
	//    8   14:iload_2         
	//    9   15:iconst_1        
	//   10   16:iadd            
	//   11   17:istore_1        
		j = i;
	//   12   18:iload_1         
	//   13   19:istore_2        
		if(!cursorHasMimeTypeColumn())
	//*  14   20:aload_0         
	//*  15   21:invokespecial   #52  <Method boolean cursorHasMimeTypeColumn()>
	//*  16   24:ifne            31
			j = i + 1;
	//   17   27:iload_1         
	//   18   28:iconst_1        
	//   19   29:iadd            
	//   20   30:istore_2        
		return j;
	//   21   31:iload_2         
	//   22   32:ireturn         
	}

	public int getColumnIndex(String s)
	{
		if(!cursorHasDataColumn() && "_data".equalsIgnoreCase(s))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #50  <Method boolean cursorHasDataColumn()>
	//*   2    4:ifne            21
	//*   3    7:ldc1            #26  <String "_data">
	//*   4    9:aload_1         
	//*   5   10:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*   6   13:ifeq            21
			return fakeDataColumn;
	//    7   16:aload_0         
	//    8   17:getfield        #34  <Field int fakeDataColumn>
	//    9   20:ireturn         
		if(!cursorHasMimeTypeColumn() && "mime_type".equalsIgnoreCase(s))
	//*  10   21:aload_0         
	//*  11   22:invokespecial   #52  <Method boolean cursorHasMimeTypeColumn()>
	//*  12   25:ifne            42
	//*  13   28:ldc1            #36  <String "mime_type">
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #58  <Method boolean String.equalsIgnoreCase(String)>
	//*  16   34:ifeq            42
			return fakeMimeTypeColumn;
	//   17   37:aload_0         
	//   18   38:getfield        #38  <Field int fakeMimeTypeColumn>
	//   19   41:ireturn         
		else
			return super.getColumnIndex(s);
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokespecial   #59  <Method int CursorWrapper.getColumnIndex(String)>
	//   23   47:ireturn         
	}

	public String getColumnName(int i)
	{
		if(i == fakeDataColumn)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #34  <Field int fakeDataColumn>
	//*   3    5:icmpne          11
			return "_data";
	//    4    8:ldc1            #26  <String "_data">
	//    5   10:areturn         
		if(i == fakeMimeTypeColumn)
	//*   6   11:iload_1         
	//*   7   12:aload_0         
	//*   8   13:getfield        #38  <Field int fakeMimeTypeColumn>
	//*   9   16:icmpne          22
			return "mime_type";
	//   10   19:ldc1            #36  <String "mime_type">
	//   11   21:areturn         
		else
			return super.getColumnName(i);
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:invokespecial   #63  <Method String CursorWrapper.getColumnName(int)>
	//   15   27:areturn         
	}

	public String[] getColumnNames()
	{
		String as[];
		if(cursorHasDataColumn() && cursorHasMimeTypeColumn())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #50  <Method boolean cursorHasDataColumn()>
	//*   2    4:ifeq            21
	//*   3    7:aload_0         
	//*   4    8:invokespecial   #52  <Method boolean cursorHasMimeTypeColumn()>
	//*   5   11:ifeq            21
		{
			as = super.getColumnNames();
	//    6   14:aload_0         
	//    7   15:invokespecial   #67  <Method String[] CursorWrapper.getColumnNames()>
	//    8   18:astore_1        
		} else
	//*   9   19:aload_1         
	//*  10   20:areturn         
		{
			String as1[] = (String[])Arrays.copyOf(((Object []) (super.getColumnNames())), getColumnCount());
	//   11   21:aload_0         
	//   12   22:invokespecial   #67  <Method String[] CursorWrapper.getColumnNames()>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #68  <Method int getColumnCount()>
	//   15   29:invokestatic    #74  <Method Object[] Arrays.copyOf(Object[], int)>
	//   16   32:checkcast       #76  <Class String[]>
	//   17   35:astore_2        
			if(!cursorHasDataColumn())
	//*  18   36:aload_0         
	//*  19   37:invokespecial   #50  <Method boolean cursorHasDataColumn()>
	//*  20   40:ifne            51
				as1[fakeDataColumn] = "_data";
	//   21   43:aload_2         
	//   22   44:aload_0         
	//   23   45:getfield        #34  <Field int fakeDataColumn>
	//   24   48:ldc1            #26  <String "_data">
	//   25   50:aastore         
			as = as1;
	//   26   51:aload_2         
	//   27   52:astore_1        
			if(!cursorHasMimeTypeColumn())
	//*  28   53:aload_0         
	//*  29   54:invokespecial   #52  <Method boolean cursorHasMimeTypeColumn()>
	//*  30   57:ifne            19
			{
				as1[fakeMimeTypeColumn] = "mime_type";
	//   31   60:aload_2         
	//   32   61:aload_0         
	//   33   62:getfield        #38  <Field int fakeMimeTypeColumn>
	//   34   65:ldc1            #36  <String "mime_type">
	//   35   67:aastore         
				return as1;
	//   36   68:aload_2         
	//   37   69:areturn         
			}
		}
		return as;
	}

	public String getString(int i)
	{
		if(!cursorHasDataColumn() && i == fakeDataColumn)
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #50  <Method boolean cursorHasDataColumn()>
	//*   2    4:ifne            32
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #34  <Field int fakeDataColumn>
	//*   6   12:icmpne          32
			if(uriForDataColumn != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #24  <Field Uri uriForDataColumn>
	//*   9   19:ifnull          30
				return uriForDataColumn.toString();
	//   10   22:aload_0         
	//   11   23:getfield        #24  <Field Uri uriForDataColumn>
	//   12   26:invokevirtual   #83  <Method String Uri.toString()>
	//   13   29:areturn         
			else
				return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
		if(!cursorHasMimeTypeColumn() && i == fakeMimeTypeColumn)
	//*  16   32:aload_0         
	//*  17   33:invokespecial   #52  <Method boolean cursorHasMimeTypeColumn()>
	//*  18   36:ifne            52
	//*  19   39:iload_1         
	//*  20   40:aload_0         
	//*  21   41:getfield        #38  <Field int fakeMimeTypeColumn>
	//*  22   44:icmpne          52
			return mimeType;
	//   23   47:aload_0         
	//   24   48:getfield        #40  <Field String mimeType>
	//   25   51:areturn         
		else
			return super.getString(i);
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:invokespecial   #85  <Method String CursorWrapper.getString(int)>
	//   29   57:areturn         
	}

	public int getType(int i)
	{
		while(!cursorHasDataColumn() && i == fakeDataColumn || !cursorHasMimeTypeColumn() && i == fakeMimeTypeColumn) 
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #50  <Method boolean cursorHasDataColumn()>
	//*   2    4:ifne            17
	//*   3    7:iload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #34  <Field int fakeDataColumn>
	//*   6   12:icmpne          17
			return 3;
	//    7   15:iconst_3        
	//    8   16:ireturn         
	//    9   17:aload_0         
	//   10   18:invokespecial   #52  <Method boolean cursorHasMimeTypeColumn()>
	//   11   21:ifne            32
	//   12   24:iload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #38  <Field int fakeMimeTypeColumn>
	//   15   29:icmpeq          15
		return super.getType(i);
	//   16   32:aload_0         
	//   17   33:iload_1         
	//   18   34:invokespecial   #89  <Method int CursorWrapper.getType(int)>
	//   19   37:ireturn         
	}

	private final int fakeDataColumn;
	private final int fakeMimeTypeColumn;
	private final String mimeType;
	private final Uri uriForDataColumn;
}
