.class public final Lo/bae;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 3

    .line 141
    const/4 v1, 0x0

    .line 143
    const/16 v0, 0x1e

    invoke-static {p0, v0}, Lo/bae;->a([BI)[B

    move-result-object v2

    .line 144
    array-length v0, v2

    if-lez v0, :cond_0

    .line 146
    invoke-static {}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->createLinkBlobItem()Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v1

    .line 147
    invoke-static {v2}, Lo/bae;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobData(Ljava/lang/String;)V

    .line 149
    :cond_0
    return-object v1
.end method

.method private static a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B
    .locals 12

    .line 38
    if-nez p0, :cond_0

    .line 40
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 43
    :cond_0
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 44
    const/16 v0, 0x55

    invoke-virtual {p0, p1, v0, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 45
    mul-int/lit16 v0, p2, 0x400

    int-to-float v0, v0

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    array-length v1, v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v8, v0

    .line 47
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 48
    invoke-virtual {v9, v8, v8}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 50
    move-object v0, p0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 52
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 53
    const/16 v0, 0x55

    invoke-virtual {v10, p1, v0, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 55
    :goto_0
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    mul-int/lit16 v1, p2, 0x400

    if-le v0, v1, :cond_2

    .line 57
    const v0, 0x3f666666    # 0.9f

    const v1, 0x3f666666    # 0.9f

    invoke-virtual {v9, v0, v1}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 58
    move-object v11, v10

    .line 59
    move-object v0, v10

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 60
    if-eq v10, v11, :cond_1

    invoke-virtual {v11}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->recycle()V

    .line 64
    :cond_1
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 65
    const/16 v0, 0x55

    invoke-virtual {v10, p1, v0, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v10}, Landroid/graphics/Bitmap;->recycle()V

    .line 68
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method private static a([BI)[B
    .locals 3

    .line 80
    if-nez p0, :cond_0

    .line 82
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 85
    :cond_0
    array-length v0, p0

    mul-int/lit16 v1, p1, 0x400

    if-le v0, v1, :cond_1

    .line 87
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 88
    invoke-static {v2, p1}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v0

    return-object v0

    .line 92
    :cond_1
    return-object p0
.end method

.method public static b(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 3

    .line 159
    const/4 v1, 0x0

    .line 160
    if-eqz p0, :cond_0

    .line 162
    invoke-static {}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->createIconBlobItem()Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v1

    .line 164
    const/4 v0, 0x4

    invoke-static {p0, v0}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v2

    .line 166
    invoke-static {v2}, Lo/bae;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobData(Ljava/lang/String;)V

    .line 168
    :cond_0
    return-object v1
.end method

.method public static c(Landroid/graphics/Bitmap;I)[B
    .locals 1

    .line 26
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-static {p0, v0, p1}, Lo/bae;->a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/graphics/Bitmap;)Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;
    .locals 3

    .line 122
    const/4 v1, 0x0

    .line 123
    if-eqz p0, :cond_0

    .line 125
    invoke-static {}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->createLinkBlobItem()Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;

    move-result-object v1

    .line 127
    const/16 v0, 0x1e

    invoke-static {p0, v0}, Lo/bae;->c(Landroid/graphics/Bitmap;I)[B

    move-result-object v2

    .line 128
    invoke-static {v2}, Lo/bae;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/sns/server/im/message/impl/packet/LinkMsgBlobItem;->setBlobData(Ljava/lang/String;)V

    .line 130
    :cond_0
    return-object v1
.end method

.method public static e([B)Ljava/lang/String;
    .locals 2

    .line 104
    const/4 v1, 0x0

    .line 105
    if-eqz p0, :cond_0

    array-length v0, p0

    if-gtz v0, :cond_1

    .line 107
    :cond_0
    return-object v1

    .line 110
    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 111
    return-object v1
.end method
