.class public Lcom/tencent/open/e;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<Landroid/graphics/Bitmap;Ljava/lang/Void;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/text/SimpleDateFormat;


# instance fields
.field private b:Lcom/tencent/open/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd-HHmmss"

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Lcom/tencent/open/e;->a:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/open/e$a;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/tencent/open/e;->b:Lcom/tencent/open/e$a;

    .line 38
    return-void
.end method

.method private a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 7

    .line 140
    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 141
    iget v3, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 142
    const/4 v4, 0x1

    .line 144
    if-gt v2, p3, :cond_0

    if-le v3, p2, :cond_2

    .line 145
    :cond_0
    int-to-float v0, v2

    int-to-float v1, p3

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 146
    int-to-float v0, v3

    int-to-float v1, p2

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 147
    if-ge v5, v6, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v6

    .line 149
    :cond_2
    :goto_0
    return v4
.end method

.method private a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 11

    .line 95
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 96
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 97
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    div-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-le v0, v1, :cond_0

    .line 98
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 99
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x32

    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 101
    :cond_0
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 102
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 104
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 105
    const/4 v6, 0x0

    .line 107
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v4, v0, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    goto :goto_0

    .line 108
    :catch_0
    move-exception v7

    .line 109
    const-string v0, "openSDK_LOG"

    const-string v1, "VoiceHelper decodeStream has OutOfMemoryError!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 116
    const/high16 v7, 0x43a00000    # 320.0f

    .line 117
    const/high16 v8, 0x43a00000    # 320.0f

    .line 119
    const/16 v0, 0x140

    const/16 v1, 0x140

    invoke-direct {p0, v5, v0, v1}, Lcom/tencent/open/e;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v9

    .line 121
    if-gtz v9, :cond_1

    .line 122
    const/4 v9, 0x1

    .line 125
    :cond_1
    const-string v0, "comp"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "comp be="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    iput v9, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 128
    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 130
    const/4 v0, 0x0

    :try_start_1
    invoke-static {v4, v0, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 133
    goto :goto_1

    .line 131
    :catch_1
    move-exception v10

    .line 132
    const-string v0, "openSDK_LOG"

    const-string v1, "VoiceHelper decodeStream has OutOfMemoryError!"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    :goto_1
    return-object v6
.end method

.method private a(J)Ljava/lang/String;
    .locals 2

    .line 224
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 225
    sget-object v0, Lcom/tencent/open/e;->a:Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)V
    .locals 2

    .line 155
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 158
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    :cond_0
    goto :goto_0

    .line 161
    :catch_0
    move-exception v1

    .line 164
    :cond_1
    :goto_0
    return-void
.end method

.method public static a()Z
    .locals 3

    .line 234
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    .line 235
    const-string v0, "mounted"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    const/4 v0, 0x1

    return v0

    .line 238
    :cond_0
    new-instance v2, Ljava/io/File;

    const-string v0, "/mnt/sdcard-ext"

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 239
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 240
    const/4 v0, 0x1

    return v0

    .line 242
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private b()Ljava/lang/String;
    .locals 4

    .line 210
    const-string v1, "."

    .line 211
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    .line 212
    const-string v0, "mounted"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 215
    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v0, "/mnt/sdcard-ext"

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 217
    const-string v1, "/mnt/sdcard-ext"

    .line 220
    :cond_1
    :goto_0
    return-object v1
.end method

.method private b(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 11

    .line 170
    const/4 v3, 0x0

    .line 171
    const-string v4, ""

    .line 173
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/tencent/open/e;->a(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/tencent/open/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".AppCenterWebBuffer"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 177
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    move-result v0

    .line 183
    :cond_0
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 184
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 187
    :cond_1
    invoke-virtual {v8}, Ljava/io/File;->createNewFile()Z

    .line 189
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    .line 191
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 193
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    if-eqz v3, :cond_3

    .line 200
    :try_start_1
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 202
    goto :goto_1

    .line 201
    :catch_0
    move-exception v5

    .line 202
    goto :goto_1

    .line 195
    :catch_1
    move-exception v5

    .line 196
    const-string v4, ""

    .line 198
    if-eqz v3, :cond_3

    .line 200
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 202
    goto :goto_1

    .line 201
    :catch_2
    move-exception v5

    .line 202
    goto :goto_1

    .line 198
    :catchall_0
    move-exception v9

    if-eqz v3, :cond_2

    .line 200
    :try_start_3
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 202
    goto :goto_0

    .line 201
    :catch_3
    move-exception v10

    .line 202
    :cond_2
    :goto_0
    throw v9

    .line 206
    :cond_3
    :goto_1
    return-object v4
.end method


# virtual methods
.method protected varargs a([Landroid/graphics/Bitmap;)Ljava/util/HashMap;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([Landroid/graphics/Bitmap;)Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;"
        }
    .end annotation

    .line 43
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 46
    const/4 v0, 0x0

    :try_start_0
    aget-object v3, p1, v0

    .line 48
    if-eqz v3, :cond_2

    .line 49
    const-string v4, ""

    .line 51
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    const/16 v1, 0x140

    if-gt v0, v1, :cond_0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    const/16 v1, 0x140

    if-le v0, v1, :cond_1

    .line 52
    :cond_0
    invoke-direct {p0, v3}, Lcom/tencent/open/e;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 53
    invoke-direct {p0, v5}, Lcom/tencent/open/e;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    .line 55
    const/4 v5, 0x0

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-direct {p0, v3}, Lcom/tencent/open/e;->b(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v4

    .line 60
    :goto_0
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 61
    const/4 v3, 0x0

    .line 63
    const-string v0, "ResultType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    const-string v0, "ResultValue"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    :cond_2
    goto :goto_1

    .line 66
    :catch_0
    move-exception v3

    .line 67
    const-string v0, "ResultType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v0, "ResultValue"

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :goto_1
    return-object v2
.end method

.method protected a(Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 76
    const-string v0, "ResultType"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 77
    iget-object v0, p0, Lcom/tencent/open/e;->b:Lcom/tencent/open/e$a;

    const-string v1, "ResultValue"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tencent/open/e$a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/tencent/open/e;->b:Lcom/tencent/open/e$a;

    const-string v1, "ResultValue"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/tencent/open/e$a;->b(Ljava/lang/String;)V

    .line 82
    :goto_0
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 83
    return-void
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, [Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lcom/tencent/open/e;->a([Landroid/graphics/Bitmap;)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method protected synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .line 21
    move-object v0, p1

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Lcom/tencent/open/e;->a(Ljava/util/HashMap;)V

    return-void
.end method
