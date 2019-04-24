.class public final Lcom/huawei/feedback/logic/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "FeedbackDraftLogic"

.field private static final b:I = 0x32000

.field private static final c:I = 0x200000


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 14

    .line 117
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "imagePath is empty!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const/4 v0, 0x0

    return-object v0

    .line 124
    :cond_0
    const/4 v2, 0x0

    .line 126
    :try_start_0
    invoke-static {p0}, Lcom/huawei/feedback/e;->b(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v2

    .line 135
    goto :goto_0

    .line 127
    :catch_0
    move-exception v3

    .line 129
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "imagePath FileNotFoundException!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 131
    :catch_1
    move-exception v3

    .line 133
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "imagePath IOException!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    const/4 v0, 0x0

    return-object v0

    .line 138
    :goto_0
    invoke-static {}, Lcom/huawei/feedback/e;->a()Ljava/lang/String;

    move-result-object v3

    .line 139
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    .line 141
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "storagePath null!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const v0, 0x32000

    if-gt v2, v0, :cond_1

    .line 144
    return-object p0

    .line 146
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 149
    :cond_2
    const/4 v4, 0x0

    .line 151
    const v0, 0x32000

    if-gt v2, v0, :cond_3

    .line 153
    :try_start_1
    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    move-object v4, v0

    .line 156
    goto/16 :goto_2

    .line 154
    :catch_2
    move-exception v5

    .line 155
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "size less than 200K\uff0cOutOfMemoryError"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    goto/16 :goto_2

    .line 159
    :cond_3
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 160
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 162
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 165
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-float v6, v0

    .line 166
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-float v7, v0

    .line 168
    const/high16 v8, 0x43f00000    # 480.0f

    .line 169
    const v9, 0x44558000    # 854.0f

    .line 171
    const/4 v10, 0x1

    .line 173
    div-float v0, v6, v8

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v11, v0

    .line 174
    div-float v0, v7, v9

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v12, v0

    .line 176
    const/4 v0, 0x1

    if-gt v11, v0, :cond_4

    const/4 v0, 0x1

    if-le v12, v0, :cond_6

    .line 177
    :cond_4
    if-le v11, v12, :cond_5

    .line 179
    move v10, v11

    goto :goto_1

    .line 181
    :cond_5
    move v10, v12

    .line 185
    :cond_6
    :goto_1
    iput v10, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 187
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 188
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inInputShareable:Z

    .line 190
    :try_start_2
    invoke-static {p0, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v0

    move-object v4, v0

    .line 193
    goto :goto_2

    .line 191
    :catch_3
    move-exception v13

    .line 192
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "OutOfMemoryError"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :goto_2
    const/4 v0, 0x0

    if-ne v0, v4, :cond_7

    .line 197
    const/4 v0, 0x0

    return-object v0

    .line 200
    :cond_7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    const-string v0, "/phoneservice/image"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    new-instance v6, Ljava/io/File;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_8

    .line 206
    const/4 v0, 0x0

    return-object v0

    .line 209
    :cond_8
    const/16 v0, 0x2f

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/feedback/e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 211
    invoke-static {v4, v7}, Lcom/huawei/feedback/logic/d;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 212
    const/4 v0, 0x0

    return-object v0

    .line 217
    :cond_9
    :try_start_3
    invoke-static {v7}, Lcom/huawei/feedback/e;->b(Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    move-result v2

    .line 221
    goto :goto_3

    .line 218
    :catch_4
    move-exception v8

    .line 219
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "getFileSize IOException!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 220
    const/4 v0, 0x0

    return-object v0

    .line 222
    :goto_3
    const/high16 v0, 0x200000

    if-le v2, v0, :cond_a

    .line 223
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "imageSize > FILE_SIZE_2M!"

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_a
    return-object v7
.end method

.method public static a(Landroid/graphics/Bitmap;Ljava/lang/String;)Z
    .locals 9

    .line 239
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 259
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 260
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v3, v0

    .line 261
    const-string v0, "FeedbackDraftLogic"

    invoke-static {v2, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 263
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 264
    const/4 v5, 0x0

    .line 267
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    .line 268
    const v0, 0x32000

    if-le v3, v0, :cond_0

    .line 270
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x5a

    invoke-virtual {p0, v0, v1, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_0

    .line 273
    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 276
    :goto_0
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 284
    const-string v0, "FeedbackDraftLogic"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 285
    goto :goto_1

    .line 277
    :catch_0
    move-exception v6

    .line 278
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "compressPictureQuality FileNotFoundException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 279
    const/4 v7, 0x0

    .line 284
    const-string v0, "FeedbackDraftLogic"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    return v7

    .line 280
    :catch_1
    move-exception v6

    .line 281
    const-string v0, "FeedbackDraftLogic"

    const-string v1, "compressPictureQuality IOException"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 282
    const/4 v7, 0x0

    .line 284
    const-string v0, "FeedbackDraftLogic"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    return v7

    :catchall_0
    move-exception v8

    const-string v0, "FeedbackDraftLogic"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    throw v8

    .line 286
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
