.class public Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;
.super Lo/om;


# instance fields
.field private final luminances:[B


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lo/om;-><init>(II)V

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    mul-int v0, v8, v9

    new-array v10, v0, [I

    move-object/from16 v0, p1

    move-object v1, v10

    move v3, v8

    move v6, v8

    move v7, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    mul-int v0, v8, v9

    new-array v0, v0, [B

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->luminances:[B

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v9, :cond_2

    mul-int v12, v11, v8

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v8, :cond_1

    add-int v0, v12, v13

    aget v14, v10, v0

    shr-int/lit8 v0, v14, 0x10

    and-int/lit16 v15, v0, 0xff

    shr-int/lit8 v0, v14, 0x8

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    and-int/lit16 v0, v14, 0xff

    move/from16 v17, v0

    move/from16 v0, v16

    if-ne v15, v0, :cond_0

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->luminances:[B

    add-int v1, v12, v13

    int-to-byte v2, v15

    aput-byte v2, v0, v1

    goto :goto_2

    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->luminances:[B

    add-int v1, v12, v13

    add-int v2, v15, v16

    add-int v2, v2, v16

    add-int v2, v2, v17

    shr-int/lit8 v2, v2, 0x2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-static {p1}, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->loadBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;-><init>(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static loadBitmap(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Couldn\'t open "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-object v3
.end method


# virtual methods
.method public getMatrix()[B
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->luminances:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->luminances:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public getRow(I[B)[B
    .locals 4

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->getHeight()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Requested row is outside the image: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->getWidth()I

    move-result v3

    if-eqz p2, :cond_2

    array-length v0, p2

    if-ge v0, v3, :cond_3

    :cond_2
    new-array p2, v3, [B

    :cond_3
    iget-object v0, p0, Lcom/huawei/qrcode/picture/recognition/RGBLuminanceSource;->luminances:[B

    mul-int v1, p1, v3

    const/4 v2, 0x0

    invoke-static {v0, v1, p2, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2
.end method
