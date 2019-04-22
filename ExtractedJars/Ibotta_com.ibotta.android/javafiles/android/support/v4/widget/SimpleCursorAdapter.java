// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			ResourceCursorAdapter

public class SimpleCursorAdapter extends ResourceCursorAdapter
{
	public static interface CursorToStringConverter
	{

		public abstract CharSequence convertToString(Cursor cursor);
	}

	public static interface ViewBinder
	{

		public abstract boolean setViewValue(View view, Cursor cursor, int i);
	}


	private void findColumns(Cursor cursor, String as[])
	{
		if(cursor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			int j = as.length;
	//    2    4:aload_2         
	//    3    5:arraylength     
	//    4    6:istore          4
			int ai[] = mFrom;
	//    5    8:aload_0         
	//    6    9:getfield        #29  <Field int[] mFrom>
	//    7   12:astore          5
			if(ai == null || ai.length != j)
	//*   8   14:aload           5
	//*   9   16:ifnull          27
	//*  10   19:aload           5
	//*  11   21:arraylength     
	//*  12   22:iload           4
	//*  13   24:icmpeq          35
				mFrom = new int[j];
	//   14   27:aload_0         
	//   15   28:iload           4
	//   16   30:newarray        int[]
	//   17   32:putfield        #29  <Field int[] mFrom>
			for(int i = 0; i < j; i++)
	//*  18   35:iconst_0        
	//*  19   36:istore_3        
	//*  20   37:iload_3         
	//*  21   38:iload           4
	//*  22   40:icmpge          70
				mFrom[i] = cursor.getColumnIndexOrThrow(as[i]);
	//   23   43:aload_0         
	//   24   44:getfield        #29  <Field int[] mFrom>
	//   25   47:iload_3         
	//   26   48:aload_1         
	//   27   49:aload_2         
	//   28   50:iload_3         
	//   29   51:aaload          
	//   30   52:invokeinterface #35  <Method int Cursor.getColumnIndexOrThrow(String)>
	//   31   57:iastore         

	//   32   58:iload_3         
	//   33   59:iconst_1        
	//   34   60:iadd            
	//   35   61:istore_3        
		} else
	//*  36   62:goto            37
		{
			mFrom = null;
	//   37   65:aload_0         
	//   38   66:aconst_null     
	//   39   67:putfield        #29  <Field int[] mFrom>
		}
	//   40   70:return          
	}

	public void bindView(View view, Context context, Cursor cursor)
	{
		ViewBinder viewbinder = mViewBinder;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field SimpleCursorAdapter$ViewBinder mViewBinder>
	//    2    4:astore          9
		int ai[] = mTo;
	//    3    6:aload_0         
	//    4    7:getfield        #42  <Field int[] mTo>
	//    5   10:astore          10
		int j = ai.length;
	//    6   12:aload           10
	//    7   14:arraylength     
	//    8   15:istore          5
		int ai1[] = mFrom;
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field int[] mFrom>
	//   11   21:astore          11
		for(int i = 0; i < j; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore          4
	//*  14   26:iload           4
	//*  15   28:iload           5
	//*  16   30:icmpge          204
		{
			View view1 = view.findViewById(ai[i]);
	//   17   33:aload_1         
	//   18   34:aload           10
	//   19   36:iload           4
	//   20   38:iaload          
	//   21   39:invokevirtual   #48  <Method View View.findViewById(int)>
	//   22   42:astore          8
			if(view1 == null)
				continue;
	//   23   44:aload           8
	//   24   46:ifnull          195
			boolean flag;
			if(viewbinder != null)
	//*  25   49:aload           9
	//*  26   51:ifnull          74
				flag = viewbinder.setViewValue(view1, cursor, ai1[i]);
	//   27   54:aload           9
	//   28   56:aload           8
	//   29   58:aload_3         
	//   30   59:aload           11
	//   31   61:iload           4
	//   32   63:iaload          
	//   33   64:invokeinterface #52  <Method boolean SimpleCursorAdapter$ViewBinder.setViewValue(View, Cursor, int)>
	//   34   69:istore          6
			else
	//*  35   71:goto            77
				flag = false;
	//   36   74:iconst_0        
	//   37   75:istore          6
			if(flag)
				continue;
	//   38   77:iload           6
	//   39   79:ifne            195
			String s = cursor.getString(ai1[i]);
	//   40   82:aload_3         
	//   41   83:aload           11
	//   42   85:iload           4
	//   43   87:iaload          
	//   44   88:invokeinterface #56  <Method String Cursor.getString(int)>
	//   45   93:astore          7
			context = ((Context) (s));
	//   46   95:aload           7
	//   47   97:astore_2        
			if(s == null)
	//*  48   98:aload           7
	//*  49  100:ifnonnull       106
				context = "";
	//   50  103:ldc1            #58  <String "">
	//   51  105:astore_2        
			if(view1 instanceof TextView)
	//*  52  106:aload           8
	//*  53  108:instanceof      #60  <Class TextView>
	//*  54  111:ifeq            127
			{
				setViewText((TextView)view1, ((String) (context)));
	//   55  114:aload_0         
	//   56  115:aload           8
	//   57  117:checkcast       #60  <Class TextView>
	//   58  120:aload_2         
	//   59  121:invokevirtual   #64  <Method void setViewText(TextView, String)>
				continue;
	//   60  124:goto            195
			}
			if(view1 instanceof ImageView)
	//*  61  127:aload           8
	//*  62  129:instanceof      #66  <Class ImageView>
	//*  63  132:ifeq            148
			{
				setViewImage((ImageView)view1, ((String) (context)));
	//   64  135:aload_0         
	//   65  136:aload           8
	//   66  138:checkcast       #66  <Class ImageView>
	//   67  141:aload_2         
	//   68  142:invokevirtual   #70  <Method void setViewImage(ImageView, String)>
			} else
	//*  69  145:goto            195
			{
				view = ((View) (new StringBuilder()));
	//   70  148:new             #72  <Class StringBuilder>
	//   71  151:dup             
	//   72  152:invokespecial   #76  <Method void StringBuilder()>
	//   73  155:astore_1        
				((StringBuilder) (view)).append(((Object) (view1)).getClass().getName());
	//   74  156:aload_1         
	//   75  157:aload           8
	//   76  159:invokevirtual   #82  <Method Class Object.getClass()>
	//   77  162:invokevirtual   #88  <Method String Class.getName()>
	//   78  165:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   79  168:pop             
				((StringBuilder) (view)).append(" is not a ");
	//   80  169:aload_1         
	//   81  170:ldc1            #94  <String " is not a ">
	//   82  172:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   83  175:pop             
				((StringBuilder) (view)).append(" view that can be bounds by this SimpleCursorAdapter");
	//   84  176:aload_1         
	//   85  177:ldc1            #96  <String " view that can be bounds by this SimpleCursorAdapter">
	//   86  179:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   87  182:pop             
				throw new IllegalStateException(((StringBuilder) (view)).toString());
	//   88  183:new             #98  <Class IllegalStateException>
	//   89  186:dup             
	//   90  187:aload_1         
	//   91  188:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   92  191:invokespecial   #104 <Method void IllegalStateException(String)>
	//   93  194:athrow          
			}
		}

	//   94  195:iload           4
	//   95  197:iconst_1        
	//   96  198:iadd            
	//   97  199:istore          4
	//*  98  201:goto            26
	//   99  204:return          
	}

	public CharSequence convertToString(Cursor cursor)
	{
		CursorToStringConverter cursortostringconverter = mCursorToStringConverter;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field SimpleCursorAdapter$CursorToStringConverter mCursorToStringConverter>
	//    2    4:astore_3        
		if(cursortostringconverter != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
			return cursortostringconverter.convertToString(cursor);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokeinterface #110 <Method CharSequence SimpleCursorAdapter$CursorToStringConverter.convertToString(Cursor)>
	//    8   16:areturn         
		int i = mStringConversionColumn;
	//    9   17:aload_0         
	//   10   18:getfield        #112 <Field int mStringConversionColumn>
	//   11   21:istore_2        
		if(i > -1)
	//*  12   22:iload_2         
	//*  13   23:iconst_m1       
	//*  14   24:icmple          35
			return ((CharSequence) (cursor.getString(i)));
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:invokeinterface #56  <Method String Cursor.getString(int)>
	//   18   34:areturn         
		else
			return super.convertToString(cursor);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokespecial   #113 <Method CharSequence ResourceCursorAdapter.convertToString(Cursor)>
	//   22   40:areturn         
	}

	public void setViewImage(ImageView imageview, String s)
	{
		NumberFormatException numberformatexception;
		try
		{
			imageview.setImageResource(Integer.parseInt(s));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #120 <Method int Integer.parseInt(String)>
	//    3    5:invokevirtual   #124 <Method void ImageView.setImageResource(int)>
			return;
	//    4    8:return          
		}
	//*   5    9:aload_1         
	//*   6   10:aload_2         
	//*   7   11:invokestatic    #130 <Method Uri Uri.parse(String)>
	//*   8   14:invokevirtual   #134 <Method void ImageView.setImageURI(Uri)>
	//*   9   17:return          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			imageview.setImageURI(Uri.parse(s));
		}
	//*  10   18:astore_3        
	//*  11   19:goto            9
	}

	public void setViewText(TextView textview, String s)
	{
		textview.setText(((CharSequence) (s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #138 <Method void TextView.setText(CharSequence)>
	//    3    5:return          
	}

	public Cursor swapCursor(Cursor cursor)
	{
		findColumns(cursor, mOriginalFrom);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #142 <Field String[] mOriginalFrom>
	//    4    6:invokespecial   #144 <Method void findColumns(Cursor, String[])>
		return super.swapCursor(cursor);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #146 <Method Cursor ResourceCursorAdapter.swapCursor(Cursor)>
	//    8   14:areturn         
	}

	private CursorToStringConverter mCursorToStringConverter;
	protected int mFrom[];
	String mOriginalFrom[];
	private int mStringConversionColumn;
	protected int mTo[];
	private ViewBinder mViewBinder;
}
