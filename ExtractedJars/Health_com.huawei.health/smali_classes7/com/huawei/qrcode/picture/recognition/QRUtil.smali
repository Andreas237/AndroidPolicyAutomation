.class public Lcom/huawei/qrcode/picture/recognition/QRUtil;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static decode(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 8

    const/4 v2, 0x0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "QRUtil decode bitmap is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    return-object v2

    :cond_0
    :try_start_0
    new-instance v3, Ljava/util/Hashtable;

    invoke-direct {v3}, Ljava/util/Hashtable;-><init>()V

    sget-object v0, Lo/og;->e:Lo/og;

    const-string v1, "utf-8"

    invoke-virtual {v3, v0, v1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;

    invoke-direct {v4, p0}, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v5, Lo/oj;

    new-instance v0, Lo/qt;

    invoke-direct {v0, v4}, Lo/qt;-><init>(Lo/om;)V

    invoke-direct {v5, v0}, Lo/oj;-><init>(Lo/ob;)V

    new-instance v6, Lo/ua;

    invoke-direct {v6}, Lo/ua;-><init>()V

    invoke-virtual {v6, v5, v3}, Lo/ua;->e(Lo/oj;Ljava/util/Map;)Lo/or;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-virtual {v7}, Lo/or;->e()Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_1
    const-string v0, "QRUtil decode result is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lo/of; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lo/oh; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_4

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v3

    const-string v0, "QRUtil decode NotFoundException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_1

    :catch_1
    move-exception v3

    const-string v0, "QRUtil decode FormatException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_1

    :catch_2
    move-exception v3

    const-string v0, "QRUtil decode NotFoundException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_1

    :catch_3
    move-exception v3

    const-string v0, "QRUtil decode ChecksumException: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_1

    :catch_4
    move-exception v3

    const-string v0, "QRUtil decode OutOfMemoryError: "

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/qrcode/util/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_1
    return-object v2
.end method

.method public static decodeBitmap(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "QRUtil decodeBitmap context is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const-string v0, "QRUtil decodeBitmap uri is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0, p1}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->getBitmapByUri1(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->decode(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->recycleBitmap(Landroid/graphics/Bitmap;)V

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v2

    :cond_2
    const-string v0, "QRUtil decodeBitmap by uri qrCode is null, keep on recognition."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    invoke-static {p0, p1}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->getBitmapByUri2(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->decode(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->recycleBitmap(Landroid/graphics/Bitmap;)V

    return-object v2
.end method

.method public static decodeBitmap(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "QRUtil decodeBitmap bitmapPath is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p0}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->getBitmap1(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->decode(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->recycleBitmap(Landroid/graphics/Bitmap;)V

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    const-string v0, "QRUtil decodeBitmap qrCode is null, keep on recognition."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    invoke-static {p0}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->getBitmap2(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->decode(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Lcom/huawei/qrcode/picture/recognition/QRUtil;->recycleBitmap(Landroid/graphics/Bitmap;)V

    return-object v2
.end method

.method private static getBitmap1(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    const/4 v2, 0x0

    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/lit16 v0, v0, 0x190

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    return-object v2
.end method

.method private static getBitmap2(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    const/4 v1, 0x0

    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    iput-object v0, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    return-object v1
.end method

.method private static getBitmapByUri1(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-string v0, "QRUtil getBitmapByUri1 uri is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    const-string v0, "QRUtil getBitmapByUri1 mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    :try_start_0
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    const-string v0, "QRUtil getBitmapByUri1 stream is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-object v5

    :cond_3
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v3, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    const/4 v3, 0x0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    if-nez v3, :cond_5

    const-string v0, "QRUtil getBitmapByUri1 stream is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_5
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_4
    goto :goto_1

    :catch_1
    move-exception v6

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_1
    return-object v5

    :cond_5
    :try_start_4
    iget v0, v4, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    div-int/lit16 v0, v0, 0x190

    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iget v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    if-gtz v0, :cond_6

    const/4 v0, 0x1

    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    :cond_6
    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    const/4 v0, 0x0

    invoke-static {v3, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v0

    move-object v2, v0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_7

    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :cond_7
    goto :goto_3

    :catch_2
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_3

    :catch_3
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri1 IOException==: "

    const/4 v1, 0x0

    :try_start_6
    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_8

    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    :cond_8
    goto :goto_3

    :catch_4
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_3

    :catch_5
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    :try_start_8
    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_9

    :try_start_9
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    :cond_9
    goto :goto_3

    :catch_6
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_3

    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v3, :cond_a

    :try_start_a
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    :cond_a
    goto :goto_2

    :catch_7
    move-exception v8

    const-string v0, "QRUtil getBitmapByUri1 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_2
    throw v7

    :goto_3
    return-object v2
.end method

.method private static getBitmapByUri2(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    const-string v0, "QRUtil getBitmapByUri2 mContext is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const-string v0, "QRUtil getBitmapByUri2 uri is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    :try_start_0
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    iput-object v0, v4, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    const/4 v0, 0x0

    if-ne v0, v3, :cond_3

    const-string v0, "QRUtil getBitmapByUri2 stream is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v6

    const-string v0, "QRUtil getBitmapByUri2 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v6, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_0
    return-object v5

    :cond_3
    const/4 v0, 0x0

    :try_start_2
    invoke-static {v3, v0, v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    move-object v2, v0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_4
    goto :goto_2

    :catch_1
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri2 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_2

    :catch_2
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri2 IOException--: "

    const/4 v1, 0x0

    :try_start_4
    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_5

    :try_start_5
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :cond_5
    goto :goto_2

    :catch_3
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri2 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_2

    :catch_4
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri2 OutOfMemoryError: "

    const/4 v1, 0x0

    :try_start_6
    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v0, 0x0

    if-eq v0, v3, :cond_6

    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    :cond_6
    goto :goto_2

    :catch_5
    move-exception v4

    const-string v0, "QRUtil getBitmapByUri2 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v4, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    goto :goto_2

    :catchall_0
    move-exception v7

    const/4 v0, 0x0

    if-eq v0, v3, :cond_7

    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6

    :cond_7
    goto :goto_1

    :catch_6
    move-exception v8

    const-string v0, "QRUtil getBitmapByUri2 IOException: "

    const/4 v1, 0x0

    invoke-static {v0, v8, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    :goto_1
    throw v7

    :goto_2
    return-object v2
.end method

.method private static recycleBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method
