// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.io.*;

public class DataOutputAsStream extends OutputStream
{

	public DataOutputAsStream(DataOutput dataoutput)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void OutputStream()>
		_output = dataoutput;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field DataOutput _output>
	//    5    9:return          
	}

	public void write(int i)
		throws IOException
	{
		_output.write(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field DataOutput _output>
	//    2    4:iload_1         
	//    3    5:invokeinterface #22  <Method void DataOutput.write(int)>
	//    4   10:return          
	}

	public void write(byte abyte0[])
		throws IOException
	{
		_output.write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field DataOutput _output>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokeinterface #27  <Method void DataOutput.write(byte[], int, int)>
	//    7   13:return          
	}

	public void write(byte abyte0[], int i, int j)
		throws IOException
	{
		_output.write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field DataOutput _output>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #27  <Method void DataOutput.write(byte[], int, int)>
	//    6   12:return          
	}

	protected final DataOutput _output;
}
