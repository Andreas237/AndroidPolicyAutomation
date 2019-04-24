.class public final Lo/edk;
.super Lo/om;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:[B

.field private final e:I


# direct methods
.method public constructor <init>([BIIIIII)V
    .locals 4

    .line 21
    invoke-direct {p0, p6, p7}, Lo/om;-><init>(II)V

    .line 23
    add-int v0, p4, p6

    if-gt v0, p2, :cond_0

    add-int v0, p5, p7

    if-le v0, p3, :cond_1

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Crop rectangle does not fit within image data."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 28
    array-length v0, p1

    new-array v0, v0, [B

    iput-object v0, p0, Lo/edk;->d:[B

    .line 29
    iget-object v0, p0, Lo/edk;->d:[B

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 31
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lo/edk;->d:[B

    .line 33
    :goto_0
    iput p2, p0, Lo/edk;->a:I

    .line 34
    iput p3, p0, Lo/edk;->c:I

    .line 35
    iput p4, p0, Lo/edk;->b:I

    .line 36
    iput p5, p0, Lo/edk;->e:I

    .line 37
    return-void
.end method


# virtual methods
.method public d()Landroid/graphics/Bitmap;
    .locals 17

    .line 100
    invoke-virtual/range {p0 .. p0}, Lo/edk;->getWidth()I

    move-result v8

    .line 101
    invoke-virtual/range {p0 .. p0}, Lo/edk;->getHeight()I

    move-result v9

    .line 102
    mul-int v0, v8, v9

    new-array v10, v0, [I

    .line 103
    move-object/from16 v0, p0

    iget-object v11, v0, Lo/edk;->d:[B

    .line 104
    move-object/from16 v0, p0

    iget v0, v0, Lo/edk;->e:I

    move-object/from16 v1, p0

    iget v1, v1, Lo/edk;->a:I

    mul-int/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/edk;->b:I

    add-int v12, v0, v1

    .line 106
    const/4 v13, 0x0

    :goto_0
    if-ge v13, v9, :cond_1

    .line 107
    mul-int v14, v13, v8

    .line 108
    const/4 v15, 0x0

    :goto_1
    if-ge v15, v8, :cond_0

    .line 109
    add-int v0, v12, v15

    aget-byte v0, v11, v0

    and-int/lit16 v1, v0, 0xff

    move/from16 v16, v1

    .line 110
    add-int v0, v14, v15

    const v1, 0x10101

    mul-int v1, v1, v16

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    aput v1, v10, v0

    .line 108
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 112
    :cond_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/edk;->a:I

    add-int/2addr v12, v0

    .line 106
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 115
    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v8, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 116
    move-object v0, v13

    move-object v1, v10

    move v3, v8

    move v6, v8

    move v7, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 117
    return-object v13
.end method

.method public getMatrix()[B
    .locals 12

    .line 41
    invoke-virtual {p0}, Lo/edk;->getWidth()I

    move-result v4

    .line 42
    invoke-virtual {p0}, Lo/edk;->getHeight()I

    move-result v5

    .line 44
    iget v0, p0, Lo/edk;->a:I

    if-ne v4, v0, :cond_1

    iget v0, p0, Lo/edk;->c:I

    if-ne v5, v0, :cond_1

    .line 45
    iget-object v0, p0, Lo/edk;->d:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 46
    iget-object v0, p0, Lo/edk;->d:[B

    array-length v0, v0

    new-array v6, v0, [B

    .line 47
    iget-object v0, p0, Lo/edk;->d:[B

    iget-object v1, p0, Lo/edk;->d:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v6, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 48
    return-object v6

    .line 50
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_1
    mul-int v6, v4, v5

    .line 55
    new-array v7, v6, [B

    .line 56
    iget v0, p0, Lo/edk;->e:I

    iget v1, p0, Lo/edk;->a:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/edk;->b:I

    add-int v8, v0, v1

    .line 58
    iget v0, p0, Lo/edk;->a:I

    if-ne v4, v0, :cond_2

    .line 59
    iget-object v0, p0, Lo/edk;->d:[B

    const/4 v1, 0x0

    invoke-static {v0, v8, v7, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 60
    return-object v7

    .line 63
    :cond_2
    iget-object v9, p0, Lo/edk;->d:[B

    .line 64
    const/4 v10, 0x0

    :goto_0
    if-ge v10, v5, :cond_3

    .line 65
    mul-int v11, v10, v4

    .line 66
    invoke-static {v9, v8, v7, v11, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    iget v0, p0, Lo/edk;->a:I

    add-int/2addr v8, v0

    .line 64
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 69
    :cond_3
    return-object v7
.end method

.method public getRow(I[B)[B
    .locals 5

    .line 74
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lo/edk;->getHeight()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 75
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

    .line 77
    :cond_1
    invoke-virtual {p0}, Lo/edk;->getWidth()I

    move-result v3

    .line 78
    if-eqz p2, :cond_2

    array-length v0, p2

    if-ge v0, v3, :cond_3

    .line 79
    :cond_2
    new-array p2, v3, [B

    .line 81
    :cond_3
    iget v0, p0, Lo/edk;->e:I

    add-int/2addr v0, p1

    iget v1, p0, Lo/edk;->a:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/edk;->b:I

    add-int v4, v0, v1

    .line 82
    iget-object v0, p0, Lo/edk;->d:[B

    const/4 v1, 0x0

    invoke-static {v0, v4, p2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 83
    return-object p2
.end method

.method public isCropSupported()Z
    .locals 1

    .line 96
    const/4 v0, 0x1

    return v0
.end method
