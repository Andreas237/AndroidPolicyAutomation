// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;

public class CursorWrapper extends android.database.CursorWrapper
	implements CrossProcessCursor
{

	public CursorWrapper(Cursor cursor)
	{
		super(cursor);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void android.database.CursorWrapper(Cursor)>
		for(int i = 0; i < 10 && (cursor instanceof android.database.CursorWrapper); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:bipush          10
	//*   7   10:icmpge          35
	//*   8   13:aload_1         
	//*   9   14:instanceof      #4   <Class android.database.CursorWrapper>
	//*  10   17:ifeq            35
			cursor = ((android.database.CursorWrapper)cursor).getWrappedCursor();
	//   11   20:aload_1         
	//   12   21:checkcast       #4   <Class android.database.CursorWrapper>
	//   13   24:invokevirtual   #16  <Method Cursor android.database.CursorWrapper.getWrappedCursor()>
	//   14   27:astore_1        

	//   15   28:iload_2         
	//   16   29:iconst_1        
	//   17   30:iadd            
	//   18   31:istore_2        
	//*  19   32:goto            7
		if(!(cursor instanceof AbstractWindowedCursor))
	//*  20   35:aload_1         
	//*  21   36:instanceof      #18  <Class AbstractWindowedCursor>
	//*  22   39:ifne            89
		{
			cursor = ((Cursor) (String.valueOf(((Object) (((Object) (cursor)).getClass().getName())))));
	//   23   42:aload_1         
	//   24   43:invokevirtual   #24  <Method Class Object.getClass()>
	//   25   46:invokevirtual   #30  <Method String Class.getName()>
	//   26   49:invokestatic    #36  <Method String String.valueOf(Object)>
	//   27   52:astore_1        
			if(((String) (cursor)).length() != 0)
	//*  28   53:aload_1         
	//*  29   54:invokevirtual   #40  <Method int String.length()>
	//*  30   57:ifeq            70
				cursor = ((Cursor) ("Unknown type: ".concat(((String) (cursor)))));
	//   31   60:ldc1            #42  <String "Unknown type: ">
	//   32   62:aload_1         
	//   33   63:invokevirtual   #46  <Method String String.concat(String)>
	//   34   66:astore_1        
			else
	//*  35   67:goto            80
				cursor = ((Cursor) (new String("Unknown type: ")));
	//   36   70:new             #32  <Class String>
	//   37   73:dup             
	//   38   74:ldc1            #42  <String "Unknown type: ">
	//   39   76:invokespecial   #49  <Method void String(String)>
	//   40   79:astore_1        
			throw new IllegalArgumentException(((String) (cursor)));
	//   41   80:new             #51  <Class IllegalArgumentException>
	//   42   83:dup             
	//   43   84:aload_1         
	//   44   85:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   45   88:athrow          
		} else
		{
			zzxu = (AbstractWindowedCursor)cursor;
	//   46   89:aload_0         
	//   47   90:aload_1         
	//   48   91:checkcast       #18  <Class AbstractWindowedCursor>
	//   49   94:putfield        #54  <Field AbstractWindowedCursor zzxu>
			return;
	//   50   97:return          
		}
	}

	public void fillWindow(int i, CursorWindow cursorwindow)
	{
		zzxu.fillWindow(i, cursorwindow);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AbstractWindowedCursor zzxu>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #59  <Method void AbstractWindowedCursor.fillWindow(int, CursorWindow)>
	//    5    9:return          
	}

	public CursorWindow getWindow()
	{
		return zzxu.getWindow();
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AbstractWindowedCursor zzxu>
	//    2    4:invokevirtual   #63  <Method CursorWindow AbstractWindowedCursor.getWindow()>
	//    3    7:areturn         
	}

	public AbstractWindowedCursor getWrappedCursor()
	{
		return zzxu;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AbstractWindowedCursor zzxu>
	//    2    4:areturn         
	}

	public volatile Cursor getWrappedCursor()
	{
		return ((Cursor) (getWrappedCursor()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method AbstractWindowedCursor getWrappedCursor()>
	//    2    4:areturn         
	}

	public boolean onMove(int i, int j)
	{
		return zzxu.onMove(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AbstractWindowedCursor zzxu>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #70  <Method boolean AbstractWindowedCursor.onMove(int, int)>
	//    5    9:ireturn         
	}

	public void setWindow(CursorWindow cursorwindow)
	{
		zzxu.setWindow(cursorwindow);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field AbstractWindowedCursor zzxu>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #74  <Method void AbstractWindowedCursor.setWindow(CursorWindow)>
	//    4    8:return          
	}

	private AbstractWindowedCursor zzxu;
}
