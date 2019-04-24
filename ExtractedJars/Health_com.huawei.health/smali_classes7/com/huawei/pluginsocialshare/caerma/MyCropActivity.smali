.class public Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private c:Lo/ebw;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->c:Lo/ebw;

    return-void
.end method

.method private a(Ljava/lang/String;)I
    .locals 7

    .line 135
    const/4 v4, 0x0

    .line 137
    :try_start_0
    new-instance v5, Landroid/media/ExifInterface;

    invoke-direct {v5, p1}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    .line 138
    const-string v0, "Orientation"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    .line 141
    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    .line 143
    :sswitch_0
    const/16 v4, 0x5a

    .line 144
    goto :goto_0

    .line 146
    :sswitch_1
    const/16 v4, 0xb4

    .line 147
    goto :goto_0

    .line 149
    :sswitch_2
    const/16 v4, 0x10e

    .line 150
    .line 156
    :goto_0
    goto :goto_1

    .line 154
    :catch_0
    move-exception v5

    .line 155
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eIOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    :goto_1
    return v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x6 -> :sswitch_0
        0x8 -> :sswitch_2
    .end sparse-switch
.end method

.method private c(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 11

    .line 95
    if-nez p1, :cond_0

    .line 96
    const/4 v0, 0x0

    return-object v0

    .line 99
    :cond_0
    new-instance v4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 101
    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 102
    invoke-static {p1, v4}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 103
    iget v5, v4, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 105
    const/16 v0, 0x438

    if-le v5, v0, :cond_1

    div-int/lit16 v0, v5, 0x438

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    iput v0, v4, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 107
    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 108
    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 109
    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 111
    const/4 v0, 0x1

    iput-boolean v0, v4, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 115
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v6, v0

    .line 116
    invoke-virtual {v6}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, v4}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 121
    if-eqz v6, :cond_2

    .line 122
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    const/4 v6, 0x0

    .line 127
    :cond_2
    goto :goto_2

    .line 125
    :catch_0
    move-exception v8

    .line 126
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eIOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    goto :goto_2

    .line 117
    :catch_1
    move-exception v8

    .line 118
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eIOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    if-eqz v6, :cond_3

    .line 122
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 123
    const/4 v6, 0x0

    .line 127
    :cond_3
    goto :goto_2

    .line 125
    :catch_2
    move-exception v8

    .line 126
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eIOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    goto :goto_2

    .line 120
    :catchall_0
    move-exception v9

    .line 121
    if-eqz v6, :cond_4

    .line 122
    :try_start_4
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 123
    const/4 v6, 0x0

    .line 127
    :cond_4
    goto :goto_1

    .line 125
    :catch_3
    move-exception v10

    .line 126
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "eIOException e"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    :goto_1
    throw v9

    .line 130
    :goto_2
    return-object v7
.end method

.method private d(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 9

    .line 163
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 164
    int-to-float v0, p1

    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 166
    move-object v0, p2

    .line 167
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v7

    .line 166
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 168
    return-object v8
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 73
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->d:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    .line 74
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->finish()V

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->e:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_1

    .line 77
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->c:Lo/ebw;

    invoke-virtual {v0}, Lo/ebw;->c()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 79
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v3, v1, v2}, Landroid/provider/MediaStore$Images$Media;->insertImage(Landroid/content/ContentResolver;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 80
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 81
    const-string v0, "bitmap"

    invoke-virtual {v5, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 82
    const/4 v0, -0x1

    invoke-virtual {p0, v0, v5}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->setResult(ILandroid/content/Intent;)V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->finish()V

    .line 86
    :cond_1
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 37
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    sget v0, Lcom/huawei/pluginsocialshare/R$layout;->activity_clip_image:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->setContentView(I)V

    .line 40
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->iv_back:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->d:Landroid/widget/ImageView;

    .line 41
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->tv_use:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->e:Landroid/widget/ImageView;

    .line 42
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    sget v0, Lcom/huawei/pluginsocialshare/R$id;->clipImageLayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ebw;

    iput-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->c:Lo/ebw;

    .line 45
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 46
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 47
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->finish()V

    .line 49
    return-void

    .line 51
    :cond_0
    const-string v0, "path"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 52
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    const-string v0, "MyCropActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "path null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->finish()V

    .line 55
    return-void

    .line 58
    :cond_1
    invoke-direct {p0, v5}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->a(Ljava/lang/String;)I

    move-result v6

    .line 59
    invoke-direct {p0, v5}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 60
    if-eqz v7, :cond_3

    .line 61
    if-nez v6, :cond_2

    .line 62
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->c:Lo/ebw;

    invoke-virtual {v0, v7}, Lo/ebw;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 64
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->c:Lo/ebw;

    invoke-direct {p0, v6, v7}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->d(ILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ebw;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/pluginsocialshare/caerma/MyCropActivity;->finish()V

    .line 69
    :goto_0
    return-void
.end method
