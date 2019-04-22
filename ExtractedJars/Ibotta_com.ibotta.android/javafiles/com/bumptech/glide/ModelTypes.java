// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.net.URL;

interface ModelTypes
{

	public abstract Object load(Bitmap bitmap);

	public abstract Object load(Drawable drawable);

	public abstract Object load(Uri uri);

	public abstract Object load(File file);

	public abstract Object load(Integer integer);

	public abstract Object load(Object obj);

	public abstract Object load(String s);

	public abstract Object load(URL url);

	public abstract Object load(byte abyte0[]);
}
