.class public final Lo/on;
.super Lo/om;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>([BIIIIIIZ)V
    .locals 2

    .line 47
    invoke-direct {p0, p6, p7}, Lo/om;-><init>(II)V

    .line 49
    add-int v0, p4, p6

    if-gt v0, p2, :cond_0

    add-int v0, p5, p7

    if-le v0, p3, :cond_1

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Crop rectangle does not fit within image data."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 53
    :cond_1
    iput-object p1, p0, Lo/on;->a:[B

    .line 54
    iput p2, p0, Lo/on;->d:I

    .line 55
    iput p3, p0, Lo/on;->b:I

    .line 56
    iput p4, p0, Lo/on;->c:I

    .line 57
    iput p5, p0, Lo/on;->e:I

    .line 58
    if-eqz p8, :cond_2

    .line 59
    invoke-direct {p0, p6, p7}, Lo/on;->b(II)V

    .line 61
    :cond_2
    return-void
.end method

.method private b(II)V
    .locals 9

    .line 158
    iget-object v2, p0, Lo/on;->a:[B

    .line 159
    const/4 v3, 0x0

    iget v0, p0, Lo/on;->e:I

    iget v1, p0, Lo/on;->d:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/on;->c:I

    add-int v4, v0, v1

    :goto_0
    if-ge v3, p2, :cond_1

    .line 160
    div-int/lit8 v0, p1, 0x2

    add-int v5, v4, v0

    .line 161
    move v6, v4

    add-int v0, v4, p1

    add-int/lit8 v7, v0, -0x1

    :goto_1
    if-ge v6, v5, :cond_0

    .line 162
    aget-byte v8, v2, v6

    .line 163
    aget-byte v0, v2, v7

    aput-byte v0, v2, v6

    .line 164
    aput-byte v8, v2, v7

    .line 161
    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v7, v7, -0x1

    goto :goto_1

    .line 159
    :cond_0
    add-int/lit8 v3, v3, 0x1

    iget v0, p0, Lo/on;->d:I

    add-int/2addr v4, v0

    goto :goto_0

    .line 167
    :cond_1
    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 154
    invoke-virtual {p0}, Lo/on;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public b()I
    .locals 2

    .line 147
    invoke-virtual {p0}, Lo/on;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public crop(IIII)Lo/om;
    .locals 9

    .line 115
    new-instance v0, Lo/on;

    iget-object v1, p0, Lo/on;->a:[B

    iget v2, p0, Lo/on;->d:I

    iget v3, p0, Lo/on;->b:I

    iget v4, p0, Lo/on;->c:I

    add-int/2addr v4, p1

    iget v5, p0, Lo/on;->e:I

    add-int/2addr v5, p2

    move v6, p3

    move v7, p4

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lo/on;-><init>([BIIIIIIZ)V

    return-object v0
.end method

.method public d()[I
    .locals 12

    .line 126
    invoke-virtual {p0}, Lo/on;->getWidth()I

    move-result v0

    div-int/lit8 v3, v0, 0x2

    .line 127
    invoke-virtual {p0}, Lo/on;->getHeight()I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 128
    mul-int v0, v3, v4

    new-array v5, v0, [I

    .line 129
    iget-object v6, p0, Lo/on;->a:[B

    .line 130
    iget v0, p0, Lo/on;->e:I

    iget v1, p0, Lo/on;->d:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/on;->c:I

    add-int v7, v0, v1

    .line 132
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v4, :cond_1

    .line 133
    mul-int v9, v8, v3

    .line 134
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v3, :cond_0

    .line 135
    mul-int/lit8 v0, v10, 0x2

    add-int/2addr v0, v7

    aget-byte v0, v6, v0

    and-int/lit16 v11, v0, 0xff

    .line 136
    add-int v0, v9, v10

    const v1, 0x10101

    mul-int/2addr v1, v11

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    aput v1, v5, v0

    .line 134
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 138
    :cond_0
    iget v0, p0, Lo/on;->d:I

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v7, v0

    .line 132
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 140
    :cond_1
    return-object v5
.end method

.method public getMatrix()[B
    .locals 10

    .line 79
    invoke-virtual {p0}, Lo/on;->getWidth()I

    move-result v2

    .line 80
    invoke-virtual {p0}, Lo/on;->getHeight()I

    move-result v3

    .line 84
    iget v0, p0, Lo/on;->d:I

    if-ne v2, v0, :cond_0

    iget v0, p0, Lo/on;->b:I

    if-ne v3, v0, :cond_0

    .line 85
    iget-object v0, p0, Lo/on;->a:[B

    return-object v0

    .line 88
    :cond_0
    mul-int v4, v2, v3

    .line 89
    new-array v5, v4, [B

    .line 90
    iget v0, p0, Lo/on;->e:I

    iget v1, p0, Lo/on;->d:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/on;->c:I

    add-int v6, v0, v1

    .line 93
    iget v0, p0, Lo/on;->d:I

    if-ne v2, v0, :cond_1

    .line 94
    iget-object v0, p0, Lo/on;->a:[B

    const/4 v1, 0x0

    invoke-static {v0, v6, v5, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    return-object v5

    .line 99
    :cond_1
    iget-object v7, p0, Lo/on;->a:[B

    .line 100
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_2

    .line 101
    mul-int v9, v8, v2

    .line 102
    invoke-static {v7, v6, v5, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    iget v0, p0, Lo/on;->d:I

    add-int/2addr v6, v0

    .line 100
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 105
    :cond_2
    return-object v5
.end method

.method public getRow(I[B)[B
    .locals 5

    .line 65
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lo/on;->getHeight()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 66
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

    .line 68
    :cond_1
    invoke-virtual {p0}, Lo/on;->getWidth()I

    move-result v3

    .line 69
    if-eqz p2, :cond_2

    array-length v0, p2

    if-ge v0, v3, :cond_3

    .line 70
    :cond_2
    new-array p2, v3, [B

    .line 72
    :cond_3
    iget v0, p0, Lo/on;->e:I

    add-int/2addr v0, p1

    iget v1, p0, Lo/on;->d:I

    mul-int/2addr v0, v1

    iget v1, p0, Lo/on;->c:I

    add-int v4, v0, v1

    .line 73
    iget-object v0, p0, Lo/on;->a:[B

    const/4 v1, 0x0

    invoke-static {v0, v4, p2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    return-object p2
.end method

.method public isCropSupported()Z
    .locals 1

    .line 110
    const/4 v0, 0x1

    return v0
.end method
