// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.file;

import android.app.AlertDialog;
import android.content.*;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.ci;
import android.support.v7.widget.*;
import android.view.*;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import com.ext.ui.BaseActivity;
import java.io.File;
import java.io.FilenameFilter;
import java.util.*;

public class FilePickerActivity extends BaseActivity
	implements android.support.v7.bv.b, android.widget.AdapterView.OnItemClickListener
{
	private class a
		implements FilenameFilter
	{

		public boolean accept(File file, String s)
		{
			boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          5
			if(!(new File(file, s)).isDirectory()) goto _L2; else goto _L1
		//    2    3:new             #26  <Class File>
		//    3    6:dup             
		//    4    7:aload_1         
		//    5    8:aload_2         
		//    6    9:invokespecial   #29  <Method void File(File, String)>
		//    7   12:invokevirtual   #33  <Method boolean File.isDirectory()>
		//    8   15:ifeq            24
_L1:
			boolean flag = true;
		//    9   18:iconst_1        
		//   10   19:istore          4
_L4:
			return flag;
		//   11   21:iload           4
		//   12   23:ireturn         
_L2:
label0:
			{
				if(b == null || b.length <= 0)
					break label0;
		//   13   24:aload_0         
		//   14   25:getfield        #21  <Field String[] b>
		//   15   28:ifnull          76
		//   16   31:aload_0         
		//   17   32:getfield        #21  <Field String[] b>
		//   18   35:arraylength     
		//   19   36:ifle            76
				int l = 0;
		//   20   39:iconst_0        
		//   21   40:istore_3        
				do
				{
					flag = flag1;
		//   22   41:iload           5
		//   23   43:istore          4
					if(l >= b.length)
						break;
		//   24   45:iload_3         
		//   25   46:aload_0         
		//   26   47:getfield        #21  <Field String[] b>
		//   27   50:arraylength     
		//   28   51:icmpge          21
					if(s.endsWith(b[l]))
		//*  29   54:aload_2         
		//*  30   55:aload_0         
		//*  31   56:getfield        #21  <Field String[] b>
		//*  32   59:iload_3         
		//*  33   60:aaload          
		//*  34   61:invokevirtual   #39  <Method boolean String.endsWith(String)>
		//*  35   64:ifeq            69
						return true;
		//   36   67:iconst_1        
		//   37   68:ireturn         
					l++;
		//   38   69:iload_3         
		//   39   70:iconst_1        
		//   40   71:iadd            
		//   41   72:istore_3        
				} while(true);
		//   42   73:goto            41
			}
			if(true) goto _L4; else goto _L3
_L3:
			return true;
		//   43   76:iconst_1        
		//   44   77:ireturn         
		}

		final FilePickerActivity a;
		private String b[];

		public a(String as[])
		{
			a = FilePickerActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field FilePickerActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			b = as;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field String[] b>
		//    8   14:return          
		}
	}

	private class b
		implements Comparator
	{

		public int a(File file, File file1)
		{
			if(file == file1)
		//*   0    0:aload_1         
		//*   1    1:aload_2         
		//*   2    2:if_acmpne       7
				return 0;
		//    3    5:iconst_0        
		//    4    6:ireturn         
			if(file.isDirectory() && file1.isFile())
		//*   5    7:aload_1         
		//*   6    8:invokevirtual   #30  <Method boolean File.isDirectory()>
		//*   7   11:ifeq            23
		//*   8   14:aload_2         
		//*   9   15:invokevirtual   #33  <Method boolean File.isFile()>
		//*  10   18:ifeq            23
				return -1;
		//   11   21:iconst_m1       
		//   12   22:ireturn         
			if(file.isFile() && file1.isDirectory())
		//*  13   23:aload_1         
		//*  14   24:invokevirtual   #33  <Method boolean File.isFile()>
		//*  15   27:ifeq            39
		//*  16   30:aload_2         
		//*  17   31:invokevirtual   #30  <Method boolean File.isDirectory()>
		//*  18   34:ifeq            39
				return 1;
		//   19   37:iconst_1        
		//   20   38:ireturn         
			else
				return file.getName().compareToIgnoreCase(file1.getName());
		//   21   39:aload_1         
		//   22   40:invokevirtual   #37  <Method String File.getName()>
		//   23   43:aload_2         
		//   24   44:invokevirtual   #37  <Method String File.getName()>
		//   25   47:invokevirtual   #43  <Method int String.compareToIgnoreCase(String)>
		//   26   50:ireturn         
		}

		public int compare(Object obj, Object obj1)
		{
			return a((File)obj, (File)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class File>
		//    3    5:aload_2         
		//    4    6:checkcast       #26  <Class File>
		//    5    9:invokevirtual   #47  <Method int a(File, File)>
		//    6   12:ireturn         
		}

		final FilePickerActivity a;

		private b()
		{
			a = FilePickerActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field FilePickerActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	private class c extends android.support.v7.widget.RecyclerView.Adapter
	{

		static android.support.v7.bv.b a(c c1)
		{
			return c1.c;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field android.support.v7.bv$b c>
		//    2    4:areturn         
		}

		public a a(ViewGroup viewgroup, int l)
		{
			viewgroup = ((ViewGroup) (((LayoutInflater)a.getSystemService("layout_inflater")).inflate(0x7f0b002b, viewgroup, false)));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field FilePickerActivity a>
		//    2    4:ldc1            #36  <String "layout_inflater">
		//    3    6:invokevirtual   #40  <Method Object FilePickerActivity.getSystemService(String)>
		//    4    9:checkcast       #42  <Class LayoutInflater>
		//    5   12:ldc1            #43  <Int 0x7f0b002b>
		//    6   14:aload_1         
		//    7   15:iconst_0        
		//    8   16:invokevirtual   #47  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//    9   19:astore_1        
			a a1 = new a(this, ((View) (viewgroup)));
		//   10   20:new             #12  <Class FilePickerActivity$c$a>
		//   11   23:dup             
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokespecial   #50  <Method void FilePickerActivity$c$a(FilePickerActivity$c, View)>
		//   15   29:astore_3        
			((View) (viewgroup)).setOnClickListener(new android.view.View.OnClickListener(this, ((View) (viewgroup))) {

				public void onClick(View view)
				{
					c.a(b).onAdapterViewClick(a);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field FilePickerActivity$c b>
				//    2    4:invokestatic    #32  <Method android.support.v7.bv$b FilePickerActivity$c.a(FilePickerActivity$c)>
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field View a>
				//    5   11:invokeinterface #37  <Method void android.support.v7.bv$b.onAdapterViewClick(View)>
				//    6   16:return          
				}

				final View a;
				final c b;

			
			{
				b = c1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field FilePickerActivity$c b>
				a = view;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field View a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//   16   30:aload_1         
		//   17   31:new             #10  <Class FilePickerActivity$c$1>
		//   18   34:dup             
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokespecial   #51  <Method void FilePickerActivity$c$1(FilePickerActivity$c, View)>
		//   22   40:invokevirtual   #57  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			return a1;
		//   23   43:aload_3         
		//   24   44:areturn         
		}

		public void a(a a1, int l)
		{
			c = ((android.support.v7.bv.b) (a));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #22  <Field FilePickerActivity a>
		//    3    5:putfield        #33  <Field android.support.v7.bv$b c>
			File file = (File)b.get(l);
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field List b>
		//    6   12:iload_2         
		//    7   13:invokeinterface #64  <Method Object List.get(int)>
		//    8   18:checkcast       #66  <Class File>
		//    9   21:astore_3        
			a.a(a1).setText(((CharSequence) (file.getName())));
		//   10   22:aload_1         
		//   11   23:invokestatic    #69  <Method TextView FilePickerActivity$c$a.a(FilePickerActivity$c$a)>
		//   12   26:aload_3         
		//   13   27:invokevirtual   #73  <Method String File.getName()>
		//   14   30:invokevirtual   #79  <Method void TextView.setText(CharSequence)>
			if(file.isFile())
		//*  15   33:aload_3         
		//*  16   34:invokevirtual   #83  <Method boolean File.isFile()>
		//*  17   37:ifeq            50
			{
				a.b(a1).setImageResource(0x7f080061);
		//   18   40:aload_1         
		//   19   41:invokestatic    #86  <Method ImageView FilePickerActivity$c$a.b(FilePickerActivity$c$a)>
		//   20   44:ldc1            #87  <Int 0x7f080061>
		//   21   46:invokevirtual   #93  <Method void ImageView.setImageResource(int)>
				return;
		//   22   49:return          
			} else
			{
				a.b(a1).setImageResource(0x7f080062);
		//   23   50:aload_1         
		//   24   51:invokestatic    #86  <Method ImageView FilePickerActivity$c$a.b(FilePickerActivity$c$a)>
		//   25   54:ldc1            #94  <Int 0x7f080062>
		//   26   56:invokevirtual   #93  <Method void ImageView.setImageResource(int)>
				return;
		//   27   59:return          
			}
		}

		public int getItemCount()
		{
			return b.size();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field List b>
		//    2    4:invokeinterface #99  <Method int List.size()>
		//    3    9:ireturn         
		}

		public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int l)
		{
			a((a)viewholder, l);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #12  <Class FilePickerActivity$c$a>
		//    3    5:iload_2         
		//    4    6:invokevirtual   #103 <Method void a(FilePickerActivity$c$a, int)>
		//    5    9:return          
		}

		public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int l)
		{
			return ((android.support.v7.widget.RecyclerView.ViewHolder) (a(viewgroup, l)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #107 <Method FilePickerActivity$c$a a(ViewGroup, int)>
		//    4    6:areturn         
		}

		final FilePickerActivity a;
		private List b;
		private android.support.v7.bv.b c;

		public c(List list)
		{
			a = FilePickerActivity.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field FilePickerActivity a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void android.support.v7.widget.RecyclerView$Adapter()>
			b = list;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #27  <Field List b>
		//    8   14:return          
		}
	}

	public class c.a extends android.support.v7.widget.RecyclerView.ViewHolder
	{

		static TextView a(c.a a1)
		{
			return a1.c;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field TextView c>
		//    2    4:areturn         
		}

		static ImageView b(c.a a1)
		{
			return a1.b;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field ImageView b>
		//    2    4:areturn         
		}

		final c a;
		private ImageView b;
		private TextView c;

		public c.a(c c1, View view)
		{
			a = c1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field FilePickerActivity$c a>
			super(view);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #21  <Method void android.support.v7.widget.RecyclerView$ViewHolder(View)>
			b = (ImageView)view.findViewById(0x7f090054);
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:ldc1            #22  <Int 0x7f090054>
		//    9   14:invokevirtual   #28  <Method View View.findViewById(int)>
		//   10   17:checkcast       #30  <Class ImageView>
		//   11   20:putfield        #32  <Field ImageView b>
			c = (TextView)view.findViewById(0x7f090055);
		//   12   23:aload_0         
		//   13   24:aload_2         
		//   14   25:ldc1            #33  <Int 0x7f090055>
		//   15   27:invokevirtual   #28  <Method View View.findViewById(int)>
		//   16   30:checkcast       #35  <Class TextView>
		//   17   33:putfield        #37  <Field TextView c>
		//   18   36:return          
		}
	}


	public FilePickerActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void BaseActivity()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #50  <Field boolean d>
		k = (new StringBuilder()).append("").append(((Class) (com/ext/file/FilePickerActivity)).getSimpleName()).toString();
	//    5    9:aload_0         
	//    6   10:new             #52  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #53  <Method void StringBuilder()>
	//    9   17:ldc1            #55  <String "">
	//   10   19:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:ldc1            #2   <Class FilePickerActivity>
	//   12   24:invokevirtual   #65  <Method String Class.getSimpleName()>
	//   13   27:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   15   33:putfield        #70  <Field String k>
	//   16   36:return          
	}

	private void a(Context context)
	{
		context = ((Context) (LayoutInflater.from(context).inflate(0x7f0b002c, ((ViewGroup) (null)))));
	//    0    0:aload_1         
	//    1    1:invokestatic    #78  <Method LayoutInflater LayoutInflater.from(Context)>
	//    2    4:ldc1            #79  <Int 0x7f0b002c>
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #83  <Method View LayoutInflater.inflate(int, ViewGroup)>
	//    5   10:astore_1        
		EditText edittext = (EditText)((View) (context)).findViewById(0x7f09004a);
	//    6   11:aload_1         
	//    7   12:ldc1            #84  <Int 0x7f09004a>
	//    8   14:invokevirtual   #90  <Method View View.findViewById(int)>
	//    9   17:checkcast       #92  <Class EditText>
	//   10   20:astore_2        
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (new ContextThemeWrapper(((Context) (this)), 0x7f0e0002))));
	//   11   21:new             #94  <Class android.app.AlertDialog$Builder>
	//   12   24:dup             
	//   13   25:new             #96  <Class ContextThemeWrapper>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:ldc1            #97  <Int 0x7f0e0002>
	//   17   32:invokespecial   #100 <Method void ContextThemeWrapper(Context, int)>
	//   18   35:invokespecial   #102 <Method void android.app.AlertDialog$Builder(Context)>
	//   19   38:astore_3        
		builder.setTitle(((CharSequence) (getString(0x7f0d003d))));
	//   20   39:aload_3         
	//   21   40:aload_0         
	//   22   41:ldc1            #103 <Int 0x7f0d003d>
	//   23   43:invokevirtual   #107 <Method String getString(int)>
	//   24   46:invokevirtual   #111 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   25   49:pop             
		builder.setView(((View) (context)));
	//   26   50:aload_3         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #115 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(View)>
	//   29   55:pop             
		builder.setPositiveButton(0x7f0d0072, new android.content.DialogInterface.OnClickListener(edittext) {

			public void onClick(DialogInterface dialoginterface, int l)
			{
				((InputMethodManager)b.getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FilePickerActivity b>
			//    2    4:ldc1            #28  <String "input_method">
			//    3    6:invokevirtual   #32  <Method Object FilePickerActivity.getSystemService(String)>
			//    4    9:checkcast       #34  <Class InputMethodManager>
			//    5   12:aload_0         
			//    6   13:getfield        #20  <Field EditText a>
			//    7   16:invokevirtual   #40  <Method android.os.IBinder EditText.getWindowToken()>
			//    8   19:iconst_0        
			//    9   20:invokevirtual   #44  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
			//   10   23:pop             
				dialoginterface = ((DialogInterface) (((Object) (a.getText())).toString().trim()));
			//   11   24:aload_0         
			//   12   25:getfield        #20  <Field EditText a>
			//   13   28:invokevirtual   #48  <Method android.text.Editable EditText.getText()>
			//   14   31:invokevirtual   #52  <Method String Object.toString()>
			//   15   34:invokevirtual   #57  <Method String String.trim()>
			//   16   37:astore_1        
				if(((String) (dialoginterface)).length() == 0)
			//*  17   38:aload_1         
			//*  18   39:invokevirtual   #61  <Method int String.length()>
			//*  19   42:ifne            46
					return;
			//   20   45:return          
				dialoginterface = ((DialogInterface) (new File((new StringBuilder()).append(((Object) (b.a))).append("/").append(((String) (dialoginterface))).toString())));
			//   21   46:new             #63  <Class File>
			//   22   49:dup             
			//   23   50:new             #65  <Class StringBuilder>
			//   24   53:dup             
			//   25   54:invokespecial   #66  <Method void StringBuilder()>
			//   26   57:aload_0         
			//   27   58:getfield        #18  <Field FilePickerActivity b>
			//   28   61:getfield        #69  <Field File FilePickerActivity.a>
			//   29   64:invokevirtual   #73  <Method StringBuilder StringBuilder.append(Object)>
			//   30   67:ldc1            #75  <String "/">
			//   31   69:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
			//   32   72:aload_1         
			//   33   73:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
			//   34   76:invokevirtual   #79  <Method String StringBuilder.toString()>
			//   35   79:invokespecial   #82  <Method void File(String)>
			//   36   82:astore_1        
				if(((File) (dialoginterface)).isDirectory())
			//*  37   83:aload_1         
			//*  38   84:invokevirtual   #86  <Method boolean File.isDirectory()>
			//*  39   87:ifeq            114
				{
					Toast.makeText(((Context) (b)), ((CharSequence) (b.getResources().getString(0x7f0d0073))), 1).show();
			//   40   90:aload_0         
			//   41   91:getfield        #18  <Field FilePickerActivity b>
			//   42   94:aload_0         
			//   43   95:getfield        #18  <Field FilePickerActivity b>
			//   44   98:invokevirtual   #90  <Method Resources FilePickerActivity.getResources()>
			//   45  101:ldc1            #91  <Int 0x7f0d0073>
			//   46  103:invokevirtual   #97  <Method String Resources.getString(int)>
			//   47  106:iconst_1        
			//   48  107:invokestatic    #103 <Method Toast Toast.makeText(Context, CharSequence, int)>
			//   49  110:invokevirtual   #106 <Method void Toast.show()>
					return;
			//   50  113:return          
				}
				if(((File) (dialoginterface)).mkdir() || ((File) (dialoginterface)).isDirectory())
			//*  51  114:aload_1         
			//*  52  115:invokevirtual   #109 <Method boolean File.mkdir()>
			//*  53  118:ifne            128
			//*  54  121:aload_1         
			//*  55  122:invokevirtual   #86  <Method boolean File.isDirectory()>
			//*  56  125:ifeq            136
				{
					b.a();
			//   57  128:aload_0         
			//   58  129:getfield        #18  <Field FilePickerActivity b>
			//   59  132:invokevirtual   #111 <Method void FilePickerActivity.a()>
					return;
			//   60  135:return          
				} else
				{
					Toast.makeText(((Context) (b)), ((CharSequence) (b.getResources().getString(0x7f0d0074))), 1).show();
			//   61  136:aload_0         
			//   62  137:getfield        #18  <Field FilePickerActivity b>
			//   63  140:aload_0         
			//   64  141:getfield        #18  <Field FilePickerActivity b>
			//   65  144:invokevirtual   #90  <Method Resources FilePickerActivity.getResources()>
			//   66  147:ldc1            #112 <Int 0x7f0d0074>
			//   67  149:invokevirtual   #97  <Method String Resources.getString(int)>
			//   68  152:iconst_1        
			//   69  153:invokestatic    #103 <Method Toast Toast.makeText(Context, CharSequence, int)>
			//   70  156:invokevirtual   #106 <Method void Toast.show()>
					return;
			//   71  159:return          
				}
			}

			final EditText a;
			final FilePickerActivity b;

			
			{
				b = FilePickerActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field FilePickerActivity b>
				a = edittext;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field EditText a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   30   56:aload_3         
	//   31   57:ldc1            #116 <Int 0x7f0d0072>
	//   32   59:new             #10  <Class FilePickerActivity$1>
	//   33   62:dup             
	//   34   63:aload_0         
	//   35   64:aload_2         
	//   36   65:invokespecial   #119 <Method void FilePickerActivity$1(FilePickerActivity, EditText)>
	//   37   68:invokevirtual   #123 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   38   71:pop             
		builder.setNegativeButton(0x7f0d0071, new android.content.DialogInterface.OnClickListener(edittext) {

			public void onClick(DialogInterface dialoginterface, int l)
			{
				((InputMethodManager)b.getSystemService("input_method")).hideSoftInputFromWindow(a.getWindowToken(), 0);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field FilePickerActivity b>
			//    2    4:ldc1            #28  <String "input_method">
			//    3    6:invokevirtual   #32  <Method Object FilePickerActivity.getSystemService(String)>
			//    4    9:checkcast       #34  <Class InputMethodManager>
			//    5   12:aload_0         
			//    6   13:getfield        #20  <Field EditText a>
			//    7   16:invokevirtual   #40  <Method android.os.IBinder EditText.getWindowToken()>
			//    8   19:iconst_0        
			//    9   20:invokevirtual   #44  <Method boolean InputMethodManager.hideSoftInputFromWindow(android.os.IBinder, int)>
			//   10   23:pop             
			//   11   24:return          
			}

			final EditText a;
			final FilePickerActivity b;

			
			{
				b = FilePickerActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field FilePickerActivity b>
				a = edittext;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field EditText a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   39   72:aload_3         
	//   40   73:ldc1            #124 <Int 0x7f0d0071>
	//   41   75:new             #12  <Class FilePickerActivity$2>
	//   42   78:dup             
	//   43   79:aload_0         
	//   44   80:aload_2         
	//   45   81:invokespecial   #125 <Method void FilePickerActivity$2(FilePickerActivity, EditText)>
	//   46   84:invokevirtual   #128 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setNegativeButton(int, android.content.DialogInterface$OnClickListener)>
	//   47   87:pop             
		builder.create().show();
	//   48   88:aload_3         
	//   49   89:invokevirtual   #132 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   50   92:invokevirtual   #137 <Method void AlertDialog.show()>
	//   51   95:return          
	}

	protected void a()
	{
		b.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ArrayList b>
	//    2    4:invokevirtual   #144 <Method void ArrayList.clear()>
		a a1 = new a(e);
	//    3    7:new             #14  <Class FilePickerActivity$a>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #146 <Field String[] e>
	//    8   16:invokespecial   #149 <Method void FilePickerActivity$a(FilePickerActivity, String[])>
	//    9   19:astore_3        
		h.setText(((CharSequence) (a.getAbsolutePath())));
	//   10   20:aload_0         
	//   11   21:getfield        #151 <Field TextView h>
	//   12   24:aload_0         
	//   13   25:getfield        #153 <Field File a>
	//   14   28:invokevirtual   #158 <Method String File.getAbsolutePath()>
	//   15   31:invokevirtual   #164 <Method void TextView.setText(CharSequence)>
		File afile[] = a.listFiles(((FilenameFilter) (a1)));
	//   16   34:aload_0         
	//   17   35:getfield        #153 <Field File a>
	//   18   38:aload_3         
	//   19   39:invokevirtual   #168 <Method File[] File.listFiles(FilenameFilter)>
	//   20   42:astore_3        
		if(afile != null && afile.length > 0)
	//*  21   43:aload_3         
	//*  22   44:ifnull          143
	//*  23   47:aload_3         
	//*  24   48:arraylength     
	//*  25   49:ifle            143
		{
			int i1 = afile.length;
	//   26   52:aload_3         
	//   27   53:arraylength     
	//   28   54:istore_2        
			int l = 0;
	//   29   55:iconst_0        
	//   30   56:istore_1        
			while(l < i1) 
	//*  31   57:iload_1         
	//*  32   58:iload_2         
	//*  33   59:icmpge          102
			{
				File file = afile[l];
	//   34   62:aload_3         
	//   35   63:iload_1         
	//   36   64:aaload          
	//   37   65:astore          4
				if(!file.isHidden() || d)
	//*  38   67:aload           4
	//*  39   69:invokevirtual   #172 <Method boolean File.isHidden()>
	//*  40   72:ifeq            89
	//*  41   75:aload_0         
	//*  42   76:getfield        #50  <Field boolean d>
	//*  43   79:ifne            89
	//*  44   82:iload_1         
	//*  45   83:iconst_1        
	//*  46   84:iadd            
	//*  47   85:istore_1        
	//*  48   86:goto            57
					b.add(((Object) (file)));
	//   49   89:aload_0         
	//   50   90:getfield        #139 <Field ArrayList b>
	//   51   93:aload           4
	//   52   95:invokevirtual   #176 <Method boolean ArrayList.add(Object)>
	//   53   98:pop             
				l++;
			}
	//*  54   99:goto            82
			Collections.sort(((List) (b)), ((Comparator) (new b())));
	//   55  102:aload_0         
	//   56  103:getfield        #139 <Field ArrayList b>
	//   57  106:new             #17  <Class FilePickerActivity$b>
	//   58  109:dup             
	//   59  110:aload_0         
	//   60  111:aconst_null     
	//   61  112:invokespecial   #179 <Method void FilePickerActivity$b(FilePickerActivity, FilePickerActivity$1)>
	//   62  115:invokestatic    #185 <Method void Collections.sort(List, Comparator)>
			g.setVisibility(0);
	//   63  118:aload_0         
	//   64  119:getfield        #187 <Field RecyclerView g>
	//   65  122:iconst_0        
	//   66  123:invokevirtual   #193 <Method void RecyclerView.setVisibility(int)>
			i.setVisibility(8);
	//   67  126:aload_0         
	//   68  127:getfield        #195 <Field TextView i>
	//   69  130:bipush          8
	//   70  132:invokevirtual   #196 <Method void TextView.setVisibility(int)>
		} else
	//*  71  135:aload_0         
	//*  72  136:getfield        #198 <Field FilePickerActivity$c c>
	//*  73  139:invokevirtual   #201 <Method void FilePickerActivity$c.notifyDataSetChanged()>
	//*  74  142:return          
		{
			i.setVisibility(0);
	//   75  143:aload_0         
	//   76  144:getfield        #195 <Field TextView i>
	//   77  147:iconst_0        
	//   78  148:invokevirtual   #196 <Method void TextView.setVisibility(int)>
			g.setVisibility(8);
	//   79  151:aload_0         
	//   80  152:getfield        #187 <Field RecyclerView g>
	//   81  155:bipush          8
	//   82  157:invokevirtual   #193 <Method void RecyclerView.setVisibility(int)>
		}
		c.notifyDataSetChanged();
	//*  83  160:goto            135
	}

	public void a(View view, int l)
	{
	//    0    0:return          
	}

	public void b(View view, int l)
	{
	//    0    0:return          
	}

	public void onAdapterViewClick(View view)
	{
		int l = g.getChildAdapterPosition(view);
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field RecyclerView g>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #208 <Method int RecyclerView.getChildAdapterPosition(View)>
	//    4    8:istore_2        
		view = ((View) ((File)b.get(l)));
	//    5    9:aload_0         
	//    6   10:getfield        #139 <Field ArrayList b>
	//    7   13:iload_2         
	//    8   14:invokevirtual   #212 <Method Object ArrayList.get(int)>
	//    9   17:checkcast       #155 <Class File>
	//   10   20:astore_1        
		if(((File) (view)).isFile())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #215 <Method boolean File.isFile()>
	//*  13   25:ifeq            46
		{
			(new Intent()).putExtra("file_path", ((File) (view)).getAbsolutePath());
	//   14   28:new             #217 <Class Intent>
	//   15   31:dup             
	//   16   32:invokespecial   #218 <Method void Intent()>
	//   17   35:ldc1            #220 <String "file_path">
	//   18   37:aload_1         
	//   19   38:invokevirtual   #158 <Method String File.getAbsolutePath()>
	//   20   41:invokevirtual   #224 <Method Intent Intent.putExtra(String, String)>
	//   21   44:pop             
			return;
	//   22   45:return          
		} else
		{
			a = ((File) (view));
	//   23   46:aload_0         
	//   24   47:aload_1         
	//   25   48:putfield        #153 <Field File a>
			a();
	//   26   51:aload_0         
	//   27   52:invokevirtual   #226 <Method void a()>
			return;
	//   28   55:return          
		}
	}

	public void onBackPressed()
	{
		super.onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #229 <Method void BaseActivity.onBackPressed()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #233 <Method void BaseActivity.onCreate(Bundle)>
		setContentView(0x7f0b002a);
	//    3    5:aload_0         
	//    4    6:ldc1            #234 <Int 0x7f0b002a>
	//    5    8:invokevirtual   #237 <Method void setContentView(int)>
		j = (Toolbar)findViewById(0x7f090079);
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:ldc1            #238 <Int 0x7f090079>
	//    9   15:invokevirtual   #239 <Method View findViewById(int)>
	//   10   18:checkcast       #241 <Class Toolbar>
	//   11   21:putfield        #243 <Field Toolbar j>
		j.setNavigationIcon(0x7f080067);
	//   12   24:aload_0         
	//   13   25:getfield        #243 <Field Toolbar j>
	//   14   28:ldc1            #244 <Int 0x7f080067>
	//   15   30:invokevirtual   #247 <Method void Toolbar.setNavigationIcon(int)>
		setSupportActionBar(j);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:getfield        #243 <Field Toolbar j>
	//   19   38:invokevirtual   #251 <Method void setSupportActionBar(Toolbar)>
		g = (RecyclerView)findViewById(0x7f09008e);
	//   20   41:aload_0         
	//   21   42:aload_0         
	//   22   43:ldc1            #252 <Int 0x7f09008e>
	//   23   45:invokevirtual   #239 <Method View findViewById(int)>
	//   24   48:checkcast       #189 <Class RecyclerView>
	//   25   51:putfield        #187 <Field RecyclerView g>
		h = (TextView)findViewById(0x7f0900d2);
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:ldc1            #253 <Int 0x7f0900d2>
	//   29   58:invokevirtual   #239 <Method View findViewById(int)>
	//   30   61:checkcast       #160 <Class TextView>
	//   31   64:putfield        #151 <Field TextView h>
		i = (TextView)findViewById(0x7f09007e);
	//   32   67:aload_0         
	//   33   68:aload_0         
	//   34   69:ldc1            #254 <Int 0x7f09007e>
	//   35   71:invokevirtual   #239 <Method View findViewById(int)>
	//   36   74:checkcast       #160 <Class TextView>
	//   37   77:putfield        #195 <Field TextView i>
		f = ((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(((Context) (this)))));
	//   38   80:aload_0         
	//   39   81:new             #256 <Class LinearLayoutManager>
	//   40   84:dup             
	//   41   85:aload_0         
	//   42   86:invokespecial   #257 <Method void LinearLayoutManager(Context)>
	//   43   89:putfield        #259 <Field android.support.v7.widget.RecyclerView$LayoutManager f>
		g.setLayoutManager(f);
	//   44   92:aload_0         
	//   45   93:getfield        #187 <Field RecyclerView g>
	//   46   96:aload_0         
	//   47   97:getfield        #259 <Field android.support.v7.widget.RecyclerView$LayoutManager f>
	//   48  100:invokevirtual   #263 <Method void RecyclerView.setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
		a = new File("/");
	//   49  103:aload_0         
	//   50  104:new             #155 <Class File>
	//   51  107:dup             
	//   52  108:ldc2            #265 <String "/">
	//   53  111:invokespecial   #268 <Method void File(String)>
	//   54  114:putfield        #153 <Field File a>
		b = new ArrayList();
	//   55  117:aload_0         
	//   56  118:new             #141 <Class ArrayList>
	//   57  121:dup             
	//   58  122:invokespecial   #269 <Method void ArrayList()>
	//   59  125:putfield        #139 <Field ArrayList b>
		c = new c(((List) (b)));
	//   60  128:aload_0         
	//   61  129:new             #20  <Class FilePickerActivity$c>
	//   62  132:dup             
	//   63  133:aload_0         
	//   64  134:aload_0         
	//   65  135:getfield        #139 <Field ArrayList b>
	//   66  138:invokespecial   #272 <Method void FilePickerActivity$c(FilePickerActivity, List)>
	//   67  141:putfield        #198 <Field FilePickerActivity$c c>
		g.setAdapter(((android.support.v7.widget.RecyclerView.Adapter) (c)));
	//   68  144:aload_0         
	//   69  145:getfield        #187 <Field RecyclerView g>
	//   70  148:aload_0         
	//   71  149:getfield        #198 <Field FilePickerActivity$c c>
	//   72  152:invokevirtual   #276 <Method void RecyclerView.setAdapter(android.support.v7.widget.RecyclerView$Adapter)>
		e = new String[0];
	//   73  155:aload_0         
	//   74  156:iconst_0        
	//   75  157:anewarray       String[]
	//   76  160:putfield        #146 <Field String[] e>
		if(getIntent().hasExtra("file_path"))
	//*  77  163:aload_0         
	//*  78  164:invokevirtual   #282 <Method Intent getIntent()>
	//*  79  167:ldc1            #220 <String "file_path">
	//*  80  169:invokevirtual   #286 <Method boolean Intent.hasExtra(String)>
	//*  81  172:ifeq            213
		{
			a = new File(getIntent().getStringExtra("file_path"));
	//   82  175:aload_0         
	//   83  176:new             #155 <Class File>
	//   84  179:dup             
	//   85  180:aload_0         
	//   86  181:invokevirtual   #282 <Method Intent getIntent()>
	//   87  184:ldc1            #220 <String "file_path">
	//   88  186:invokevirtual   #290 <Method String Intent.getStringExtra(String)>
	//   89  189:invokespecial   #268 <Method void File(String)>
	//   90  192:putfield        #153 <Field File a>
			if(!a.exists())
	//*  91  195:aload_0         
	//*  92  196:getfield        #153 <Field File a>
	//*  93  199:invokevirtual   #293 <Method boolean File.exists()>
	//*  94  202:ifne            213
				a.mkdir();
	//   95  205:aload_0         
	//   96  206:getfield        #153 <Field File a>
	//   97  209:invokevirtual   #296 <Method boolean File.mkdir()>
	//   98  212:pop             
		}
		if(getIntent().hasExtra("show_hidden_files"))
	//*  99  213:aload_0         
	//* 100  214:invokevirtual   #282 <Method Intent getIntent()>
	//* 101  217:ldc2            #298 <String "show_hidden_files">
	//* 102  220:invokevirtual   #286 <Method boolean Intent.hasExtra(String)>
	//* 103  223:ifeq            241
			d = getIntent().getBooleanExtra("show_hidden_files", false);
	//  104  226:aload_0         
	//  105  227:aload_0         
	//  106  228:invokevirtual   #282 <Method Intent getIntent()>
	//  107  231:ldc2            #298 <String "show_hidden_files">
	//  108  234:iconst_0        
	//  109  235:invokevirtual   #302 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  110  238:putfield        #50  <Field boolean d>
		if(getIntent().hasExtra("accepted_file_extensions"))
	//* 111  241:aload_0         
	//* 112  242:invokevirtual   #282 <Method Intent getIntent()>
	//* 113  245:ldc2            #304 <String "accepted_file_extensions">
	//* 114  248:invokevirtual   #286 <Method boolean Intent.hasExtra(String)>
	//* 115  251:ifeq            283
		{
			bundle = ((Bundle) (getIntent().getStringArrayListExtra("accepted_file_extensions")));
	//  116  254:aload_0         
	//  117  255:invokevirtual   #282 <Method Intent getIntent()>
	//  118  258:ldc2            #304 <String "accepted_file_extensions">
	//  119  261:invokevirtual   #308 <Method ArrayList Intent.getStringArrayListExtra(String)>
	//  120  264:astore_1        
			e = (String[])((ArrayList) (bundle)).toArray(((Object []) (new String[((ArrayList) (bundle)).size()])));
	//  121  265:aload_0         
	//  122  266:aload_1         
	//  123  267:aload_1         
	//  124  268:invokevirtual   #312 <Method int ArrayList.size()>
	//  125  271:anewarray       String[]
	//  126  274:invokevirtual   #316 <Method Object[] ArrayList.toArray(Object[])>
	//  127  277:checkcast       #317 <Class String[]>
	//  128  280:putfield        #146 <Field String[] e>
		}
	//  129  283:return          
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(0x7f0c0000, menu);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method MenuInflater getMenuInflater()>
	//    2    4:ldc2            #324 <Int 0x7f0c0000>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #329 <Method void MenuInflater.inflate(int, Menu)>
		return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
	}

	public void onItemClick(AdapterView adapterview, View view, int l, long l1)
	{
	//    0    0:return          
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		if(menuitem.getItemId() == 0x102002c)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #342 <Method int MenuItem.getItemId()>
	//*   2    6:ldc2            #343 <Int 0x102002c>
	//*   3    9:icmpne          45
			if(a.getParentFile() != null)
	//*   4   12:aload_0         
	//*   5   13:getfield        #153 <Field File a>
	//*   6   16:invokevirtual   #347 <Method File File.getParentFile()>
	//*   7   19:ifnull          39
			{
				a = a.getParentFile();
	//    8   22:aload_0         
	//    9   23:aload_0         
	//   10   24:getfield        #153 <Field File a>
	//   11   27:invokevirtual   #347 <Method File File.getParentFile()>
	//   12   30:putfield        #153 <Field File a>
				a();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #226 <Method void a()>
				return true;
	//   15   37:iconst_1        
	//   16   38:ireturn         
			} else
			{
				finish();
	//   17   39:aload_0         
	//   18   40:invokevirtual   #350 <Method void finish()>
				return true;
	//   19   43:iconst_1        
	//   20   44:ireturn         
			}
		if(menuitem.getItemId() == 0x7f09001a)
	//*  21   45:aload_1         
	//*  22   46:invokeinterface #342 <Method int MenuItem.getItemId()>
	//*  23   51:ldc2            #351 <Int 0x7f09001a>
	//*  24   54:icmpne          172
		{
			try
			{
				if(!a.exists())
	//*  25   57:aload_0         
	//*  26   58:getfield        #153 <Field File a>
	//*  27   61:invokevirtual   #293 <Method boolean File.exists()>
	//*  28   64:ifne            75
					a.mkdirs();
	//   29   67:aload_0         
	//   30   68:getfield        #153 <Field File a>
	//   31   71:invokevirtual   #354 <Method boolean File.mkdirs()>
	//   32   74:pop             
			}
	//*  33   75:aload_0         
	//*  34   76:getfield        #153 <Field File a>
	//*  35   79:invokevirtual   #357 <Method boolean File.canWrite()>
	//*  36   82:ifeq            152
	//*  37   85:new             #217 <Class Intent>
	//*  38   88:dup             
	//*  39   89:invokespecial   #218 <Method void Intent()>
	//*  40   92:astore_1        
	//*  41   93:aload_1         
	//*  42   94:ldc1            #220 <String "file_path">
	//*  43   96:aload_0         
	//*  44   97:getfield        #153 <Field File a>
	//*  45  100:invokevirtual   #158 <Method String File.getAbsolutePath()>
	//*  46  103:invokevirtual   #224 <Method Intent Intent.putExtra(String, String)>
	//*  47  106:pop             
	//*  48  107:aload_0         
	//*  49  108:iconst_m1       
	//*  50  109:aload_1         
	//*  51  110:invokevirtual   #361 <Method void setResult(int, Intent)>
	//*  52  113:aload_0         
	//*  53  114:getfield        #70  <Field String k>
	//*  54  117:new             #52  <Class StringBuilder>
	//*  55  120:dup             
	//*  56  121:invokespecial   #53  <Method void StringBuilder()>
	//*  57  124:ldc2            #363 <String "setting dir path ">
	//*  58  127:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  59  130:aload_0         
	//*  60  131:getfield        #153 <Field File a>
	//*  61  134:invokevirtual   #158 <Method String File.getAbsolutePath()>
	//*  62  137:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//*  63  140:invokevirtual   #68  <Method String StringBuilder.toString()>
	//*  64  143:invokestatic    #368 <Method void ci.a(String, String)>
	//*  65  146:aload_0         
	//*  66  147:invokevirtual   #350 <Method void finish()>
	//*  67  150:iconst_1        
	//*  68  151:ireturn         
	//*  69  152:aload_0         
	//*  70  153:aload_0         
	//*  71  154:invokevirtual   #372 <Method Resources getResources()>
	//*  72  157:ldc2            #373 <Int 0x7f0d0075>
	//*  73  160:invokevirtual   #376 <Method String Resources.getString(int)>
	//*  74  163:iconst_1        
	//*  75  164:invokestatic    #382 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//*  76  167:invokevirtual   #383 <Method void Toast.show()>
	//*  77  170:iconst_1        
	//*  78  171:ireturn         
	//*  79  172:aload_1         
	//*  80  173:invokeinterface #342 <Method int MenuItem.getItemId()>
	//*  81  178:ldc2            #384 <Int 0x7f090010>
	//*  82  181:icmpne          221
	//*  83  184:aload_0         
	//*  84  185:getfield        #153 <Field File a>
	//*  85  188:invokevirtual   #357 <Method boolean File.canWrite()>
	//*  86  191:ifeq            201
	//*  87  194:aload_0         
	//*  88  195:aload_0         
	//*  89  196:invokespecial   #386 <Method void a(Context)>
	//*  90  199:iconst_1        
	//*  91  200:ireturn         
	//*  92  201:aload_0         
	//*  93  202:aload_0         
	//*  94  203:invokevirtual   #372 <Method Resources getResources()>
	//*  95  206:ldc2            #387 <Int 0x7f0d0074>
	//*  96  209:invokevirtual   #376 <Method String Resources.getString(int)>
	//*  97  212:iconst_1        
	//*  98  213:invokestatic    #382 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//*  99  216:invokevirtual   #383 <Method void Toast.show()>
	//* 100  219:iconst_1        
	//* 101  220:ireturn         
	//* 102  221:aload_1         
	//* 103  222:invokeinterface #342 <Method int MenuItem.getItemId()>
	//* 104  227:ldc2            #343 <Int 0x102002c>
	//* 105  230:icmpne          266
	//* 106  233:aload_0         
	//* 107  234:getfield        #153 <Field File a>
	//* 108  237:invokevirtual   #347 <Method File File.getParentFile()>
	//* 109  240:ifnull          260
	//* 110  243:aload_0         
	//* 111  244:aload_0         
	//* 112  245:getfield        #153 <Field File a>
	//* 113  248:invokevirtual   #347 <Method File File.getParentFile()>
	//* 114  251:putfield        #153 <Field File a>
	//* 115  254:aload_0         
	//* 116  255:invokevirtual   #226 <Method void a()>
	//* 117  258:iconst_1        
	//* 118  259:ireturn         
	//* 119  260:aload_0         
	//* 120  261:invokevirtual   #350 <Method void finish()>
	//* 121  264:iconst_1        
	//* 122  265:ireturn         
	//* 123  266:aload_0         
	//* 124  267:aload_1         
	//* 125  268:invokespecial   #389 <Method boolean BaseActivity.onOptionsItemSelected(MenuItem)>
	//* 126  271:ireturn         
			// Misplaced declaration of an exception variable
			catch(MenuItem menuitem) { }
	//  127  272:astore_1        
			if(a.canWrite())
			{
				menuitem = ((MenuItem) (new Intent()));
				((Intent) (menuitem)).putExtra("file_path", a.getAbsolutePath());
				setResult(-1, ((Intent) (menuitem)));
				ci.a(k, (new StringBuilder()).append("setting dir path ").append(a.getAbsolutePath()).toString());
				finish();
				return true;
			} else
			{
				Toast.makeText(((Context) (this)), ((CharSequence) (getResources().getString(0x7f0d0075))), 1).show();
				return true;
			}
		}
		if(menuitem.getItemId() == 0x7f090010)
			if(a.canWrite())
			{
				a(((Context) (this)));
				return true;
			} else
			{
				Toast.makeText(((Context) (this)), ((CharSequence) (getResources().getString(0x7f0d0074))), 1).show();
				return true;
			}
		if(menuitem.getItemId() == 0x102002c)
		{
			if(a.getParentFile() != null)
			{
				a = a.getParentFile();
				a();
				return true;
			} else
			{
				finish();
				return true;
			}
		} else
		{
			return super.onOptionsItemSelected(menuitem);
		}
	//* 128  273:goto            75
	}

	protected void onResume()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method void a()>
		super.onResume();
	//    2    4:aload_0         
	//    3    5:invokespecial   #392 <Method void BaseActivity.onResume()>
	//    4    8:return          
	}

	protected File a;
	protected ArrayList b;
	protected c c;
	protected boolean d;
	protected String e[];
	android.support.v7.widget.RecyclerView.LayoutManager f;
	private RecyclerView g;
	private TextView h;
	private TextView i;
	private Toolbar j;
	private String k;
}
