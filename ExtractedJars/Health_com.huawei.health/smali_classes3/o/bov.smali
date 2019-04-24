.class public Lo/bov;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 17

    .line 40
    const/4 v3, 0x1

    .line 42
    new-instance v4, Ljava/io/File;

    move-object/from16 v0, p0

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 43
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    const/4 v0, 0x0

    return v0

    .line 49
    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v5

    .line 51
    cmp-long v0, v5, p2

    if-ltz v0, :cond_6

    .line 53
    new-instance v7, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v7}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 55
    move-object/from16 v0, p0

    invoke-static {v0, v7}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 56
    iget v8, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 57
    iget v9, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 59
    long-to-float v0, v5

    move-wide/from16 v1, p2

    long-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    .line 60
    int-to-double v0, v8

    div-double/2addr v0, v10

    double-to-int v0, v0

    iput v0, v7, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 61
    int-to-double v0, v9

    div-double/2addr v0, v10

    double-to-int v0, v0

    iput v0, v7, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 62
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    add-double/2addr v0, v10

    double-to-int v0, v0

    iput v0, v7, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 63
    const/4 v0, 0x0

    iput-boolean v0, v7, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 65
    move-object/from16 v0, p0

    invoke-static {v0, v7}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 66
    new-instance v4, Ljava/io/File;

    move-object/from16 v0, p1

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 67
    const/4 v13, 0x0

    .line 70
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v13, v0

    .line 71
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x32

    invoke-virtual {v12, v0, v1, v13}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 72
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    const/4 v0, 0x0

    if-eq v0, v13, :cond_1

    .line 85
    :try_start_1
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 91
    :cond_1
    goto :goto_0

    .line 88
    :catch_0
    move-exception v14

    .line 90
    const-string v0, "PictureUtil"

    const-string v1, "compressPic fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_0
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 95
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    .line 74
    :catch_1
    move-exception v14

    .line 76
    const-string v0, "PictureUtil"

    const-string v1, "compressPic fail"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    const/4 v3, 0x0

    .line 83
    const/4 v0, 0x0

    if-eq v0, v13, :cond_2

    .line 85
    :try_start_3
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 91
    :cond_2
    goto :goto_1

    .line 88
    :catch_2
    move-exception v14

    .line 90
    const-string v0, "PictureUtil"

    const-string v1, "compressPic fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_1
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_5

    .line 95
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_3

    .line 81
    :catchall_0
    move-exception v15

    .line 83
    const/4 v0, 0x0

    if-eq v0, v13, :cond_3

    .line 85
    :try_start_4
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 91
    :cond_3
    goto :goto_2

    .line 88
    :catch_3
    move-exception v16

    .line 90
    const-string v0, "PictureUtil"

    const-string v1, "compressPic fail"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :goto_2
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 95
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 97
    :cond_4
    throw v15

    .line 99
    :cond_5
    :goto_3
    goto :goto_4

    .line 103
    :cond_6
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/bot;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    :goto_4
    return v3
.end method

.method public static d(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 10

    .line 114
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 116
    const/4 v0, 0x0

    return-object v0

    .line 119
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    .line 120
    const/4 v7, 0x0

    .line 121
    if-nez v6, :cond_1

    .line 123
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 125
    :cond_1
    const-string v0, "file"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 127
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    .line 129
    :cond_2
    const-string v0, "content"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 131
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, p1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_data"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 133
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 135
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 137
    const-string v0, "_data"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 138
    const/4 v0, -0x1

    if-le v9, v0, :cond_3

    .line 140
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 143
    :cond_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 146
    :cond_4
    :goto_0
    return-object v7
.end method
