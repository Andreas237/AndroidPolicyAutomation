.class public final Lo/ot;
.super Lo/om;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:[B


# direct methods
.method public constructor <init>(II[I)V
    .locals 11

    .line 35
    invoke-direct {p0, p1, p2}, Lo/om;-><init>(II)V

    .line 37
    iput p1, p0, Lo/ot;->c:I

    .line 38
    iput p2, p0, Lo/ot;->a:I

    .line 39
    const/4 v0, 0x0

    iput v0, p0, Lo/ot;->d:I

    .line 40
    const/4 v0, 0x0

    iput v0, p0, Lo/ot;->b:I

    .line 44
    mul-int v0, p1, p2

    new-array v0, v0, [B

    iput-object v0, p0, Lo/ot;->e:[B

    .line 45
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p2, :cond_2

    .line 46
    mul-int v5, v4, p1

    .line 47
    const/4 v6, 0x0

    :goto_1
    if-ge v6, p1, :cond_1

    .line 48
    add-int v0, v5, v6

    aget v7, p3, v0

    .line 49
    shr-int/lit8 v0, v7, 0x10

    and-int/lit16 v8, v0, 0xff

    .line 50
    shr-int/lit8 v0, v7, 0x8

    and-int/lit16 v9, v0, 0xff

    .line 51
    and-int/lit16 v10, v7, 0xff

    .line 52
    if-ne v8, v9, :cond_0

    if-ne v9, v10, :cond_0

    .line 54
    iget-object v0, p0, Lo/ot;->e:[B

    add-int v1, v5, v6

    int-to-byte v2, v8

    aput-byte v2, v0, v1

    goto :goto_2

    .line 57
    :cond_0
    iget-object v0, p0, Lo/ot;->e:[B

    add-int v1, v5, v6

    mul-int/lit8 v2, v9, 0x2

    add-int/2addr v2, v8

    add-int/2addr v2, v10

    div-int/lit8 v2, v2, 0x4

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 47
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 45
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method private constructor <init>([BIIIIII)V
    .locals 2

    .line 70
    invoke-direct {p0, p6, p7}, Lo/om;-><init>(II)V

    .line 71
    add-int v0, p4, p6

    if-gt v0, p2, :cond_0

    add-int v0, p5, p7

    if-le v0, p3, :cond_1

    .line 72
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Crop rectangle does not fit within image data."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_1
    iput-object p1, p0, Lo/ot;->e:[B

    .line 75
    iput p2, p0, Lo/ot;->c:I

    .line 76
    iput p3, p0, Lo/ot;->a:I

    .line 77
    iput p4, p0, Lo/ot;->d:I

    .line 78
    iput p5, p0, Lo/ot;->b:I

    .line 79
    return-void
.end method


# virtual methods
.method public crop(IIII)Lo/om;
    .locals 8

    .line 133
    new-instance v0, Lo/ot;

    iget-object v1, p0, Lo/ot;->e:[B

    iget v2, p0, Lo/ot;->c:I

    iget v3, p0, Lo/ot;->a:I

    iget v4, p0, Lo/ot;->d:I

    add-int/2addr v4, p1

    iget v5, p0, Lo/ot;->b:I

    add-int/2addr v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lo/ot;-><init>([BIIIIII)V

    return-object v0
.end method

.method public getMatrix()[B
    .locals 10

    .line 97
    invoke-virtual {p0}, Lo/ot;->getWidth()I

    move-result v2

    .line 98
    invoke-virtual {p0}, Lo/ot;->getHeight()I

    move-result v3

    .line 102
    iget v0, p0, Lo/ot;->c:I

    if-ne v2, v0, :cond_0

    iget v0, p0, Lo/ot;->a:I

    if-ne v3, v0, :cond_0

    .line 103
    iget-object v0, p0, Lo/ot;->e:[B

    return-object v0

    .line 106
    :cond_0
    mul-int v4, v2, v3

    .line 107
    new-array v5, v4, [B

    .line 108
    iget v0, p0, Lo/ot;->b:I

    iget v1, p0, Lo/ot;->c:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/ot;->d:I

    add-int v6, v0, v1

    .line 111
    iget v0, p0, Lo/ot;->c:I

    if-ne v2, v0, :cond_1

    .line 112
    iget-object v0, p0, Lo/ot;->e:[B

    const/4 v1, 0x0

    invoke-static {v0, v6, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 113
    return-object v5

    .line 117
    :cond_1
    iget-object v7, p0, Lo/ot;->e:[B

    .line 118
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_2

    .line 119
    mul-int v9, v8, v2

    .line 120
    invoke-static {v7, v6, v5, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 121
    iget v0, p0, Lo/ot;->c:I

    add-int/2addr v6, v0

    .line 118
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 123
    :cond_2
    return-object v5
.end method

.method public getRow(I[B)[B
    .locals 5

    .line 83
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lo/ot;->getHeight()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 84
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

    .line 86
    :cond_1
    invoke-virtual {p0}, Lo/ot;->getWidth()I

    move-result v3

    .line 87
    if-eqz p2, :cond_2

    array-length v0, p2

    if-ge v0, v3, :cond_3

    .line 88
    :cond_2
    new-array p2, v3, [B

    .line 90
    :cond_3
    iget v0, p0, Lo/ot;->b:I

    add-int/2addr v0, p1

    iget v1, p0, Lo/ot;->c:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/ot;->d:I

    add-int v4, v0, v1

    .line 91
    iget-object v0, p0, Lo/ot;->e:[B

    const/4 v1, 0x0

    invoke-static {v0, v4, p2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 92
    return-object p2
.end method

.method public isCropSupported()Z
    .locals 1

    .line 128
    const/4 v0, 0x1

    return v0
.end method
