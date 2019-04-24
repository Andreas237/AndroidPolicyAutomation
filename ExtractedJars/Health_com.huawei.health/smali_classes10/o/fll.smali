.class public final Lo/fll;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Z

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(IZI)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    if-ltz p1, :cond_0

    const/4 v0, 0x7

    if-ge v0, p1, :cond_1

    .line 46
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Block option\'s szx must be between 0 and 7 inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_1
    if-ltz p3, :cond_2

    const v0, 0xfffff

    if-ge v0, p3, :cond_3

    .line 48
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Block option\'s num must be between 0 and 524288 inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_3
    iput p1, p0, Lo/fll;->d:I

    .line 51
    iput-boolean p2, p0, Lo/fll;->b:Z

    .line 52
    iput p3, p0, Lo/fll;->c:I

    .line 54
    return-void
.end method

.method public constructor <init>(Lo/fll;)V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    if-nez p1, :cond_0

    .line 65
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 67
    :cond_0
    invoke-virtual {p1}, Lo/fll;->c()I

    move-result v0

    iput v0, p0, Lo/fll;->d:I

    .line 68
    invoke-virtual {p1}, Lo/fll;->a()Z

    move-result v0

    iput-boolean v0, p0, Lo/fll;->b:Z

    .line 69
    invoke-virtual {p1}, Lo/fll;->b()I

    move-result v0

    iput v0, p0, Lo/fll;->c:I

    .line 71
    return-void
.end method

.method public constructor <init>([B)V
    .locals 6

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    if-nez p1, :cond_0

    .line 83
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 84
    :cond_0
    array-length v0, p1

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    .line 85
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Block option\'s length must at most 3 bytes inclusive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 86
    :cond_1
    array-length v0, p1

    if-nez v0, :cond_2

    .line 87
    const/4 v0, 0x0

    iput v0, p0, Lo/fll;->d:I

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/fll;->b:Z

    .line 89
    const/4 v0, 0x0

    iput v0, p0, Lo/fll;->c:I

    goto :goto_2

    .line 92
    :cond_2
    array-length v0, p1

    add-int/lit8 v0, v0, -0x1

    aget-byte v3, p1, v0

    .line 93
    and-int/lit8 v0, v3, 0x7

    iput v0, p0, Lo/fll;->d:I

    .line 94
    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/fll;->b:Z

    .line 95
    and-int/lit16 v0, v3, 0xff

    shr-int/lit8 v4, v0, 0x4

    .line 96
    const/4 v5, 0x1

    :goto_1
    array-length v0, p1

    if-ge v5, v0, :cond_4

    .line 97
    array-length v0, p1

    sub-int/2addr v0, v5

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    mul-int/lit8 v1, v5, 0x8

    add-int/lit8 v1, v1, -0x4

    shl-int/2addr v0, v1

    add-int/2addr v4, v0

    .line 96
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 99
    :cond_4
    iput v4, p0, Lo/fll;->c:I

    .line 101
    :goto_2
    return-void
.end method

.method public static d(I)I
    .locals 3

    .line 234
    const/16 v0, 0x400

    if-lt p0, v0, :cond_0

    .line 235
    const/4 v0, 0x6

    return v0

    .line 236
    :cond_0
    const/16 v0, 0x10

    if-gt p0, v0, :cond_1

    .line 237
    const/4 v0, 0x0

    return v0

    .line 239
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v2

    .line 240
    invoke-static {v2}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    return v0
.end method

.method public static e(I)I
    .locals 2

    .line 255
    if-gtz p0, :cond_0

    .line 256
    const/16 v0, 0x10

    return v0

    .line 257
    :cond_0
    const/4 v0, 0x6

    if-lt p0, v0, :cond_1

    .line 258
    const/16 v0, 0x400

    return v0

    .line 260
    :cond_1
    add-int/lit8 v0, p0, 0x4

    const/4 v1, 0x1

    shl-int v0, v1, v0

    return v0
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lo/fll;->b:Z

    return v0
.end method

.method public b()I
    .locals 1

    .line 137
    iget v0, p0, Lo/fll;->c:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 109
    iget v0, p0, Lo/fll;->d:I

    return v0
.end method

.method public d()I
    .locals 2

    .line 118
    iget v0, p0, Lo/fll;->d:I

    add-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    shl-int v0, v1, v0

    return v0
.end method

.method public e()[B
    .locals 4

    .line 165
    iget v0, p0, Lo/fll;->d:I

    iget-boolean v1, p0, Lo/fll;->b:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int v3, v0, v1

    .line 166
    iget v0, p0, Lo/fll;->c:I

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lo/fll;->b:Z

    if-nez v0, :cond_1

    iget v0, p0, Lo/fll;->d:I

    if-nez v0, :cond_1

    .line 167
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 168
    :cond_1
    iget v0, p0, Lo/fll;->c:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    .line 169
    const/4 v0, 0x1

    new-array v0, v0, [B

    iget v1, p0, Lo/fll;->c:I

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v1, v3

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    return-object v0

    .line 170
    :cond_2
    iget v0, p0, Lo/fll;->c:I

    const/16 v1, 0x1000

    if-ge v0, v1, :cond_3

    .line 171
    const/4 v0, 0x2

    new-array v0, v0, [B

    iget v1, p0, Lo/fll;->c:I

    shr-int/lit8 v1, v1, 0x4

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lo/fll;->c:I

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v1, v3

    int-to-byte v1, v1

    const/4 v2, 0x1

    aput-byte v1, v0, v2

    return-object v0

    .line 176
    :cond_3
    const/4 v0, 0x3

    new-array v0, v0, [B

    iget v1, p0, Lo/fll;->c:I

    shr-int/lit8 v1, v1, 0xc

    int-to-byte v1, v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lo/fll;->c:I

    shr-int/lit8 v1, v1, 0x4

    int-to-byte v1, v1

    const/4 v2, 0x1

    aput-byte v1, v0, v2

    iget v1, p0, Lo/fll;->c:I

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v1, v3

    int-to-byte v1, v1

    const/4 v2, 0x2

    aput-byte v1, v0, v2

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 200
    instance-of v0, p1, Lo/fll;

    if-nez v0, :cond_0

    .line 201
    const/4 v0, 0x0

    return v0

    .line 203
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/fll;

    .line 204
    iget v0, p0, Lo/fll;->d:I

    iget v1, v2, Lo/fll;->d:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/fll;->c:I

    iget v1, v2, Lo/fll;->c:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lo/fll;->b:Z

    iget-boolean v1, v2, Lo/fll;->b:Z

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()I
    .locals 2

    .line 190
    iget v0, p0, Lo/fll;->c:I

    iget v1, p0, Lo/fll;->d:I

    invoke-static {v1}, Lo/fll;->e(I)I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 209
    iget v2, p0, Lo/fll;->d:I

    .line 210
    mul-int/lit8 v0, v2, 0x1f

    iget-boolean v1, p0, Lo/fll;->b:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int v2, v0, v1

    .line 211
    mul-int/lit8 v0, v2, 0x1f

    iget v1, p0, Lo/fll;->c:I

    add-int v2, v0, v1

    .line 212
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 195
    const-string v0, "(szx=%d/%d, m=%b, num=%d)"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lo/fll;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fll;->d:I

    invoke-static {v2}, Lo/fll;->e(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-boolean v2, p0, Lo/fll;->b:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/fll;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
