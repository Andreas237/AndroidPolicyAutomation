.class public final Lo/fpq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:B

.field private b:I

.field private final d:Ljava/io/ByteArrayInputStream;


# direct methods
.method public constructor <init>([B)V
    .locals 2

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/io/ByteArrayInputStream;

    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iput-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    .line 49
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/fpq;->a:B

    .line 50
    const/4 v0, -0x1

    iput v0, p0, Lo/fpq;->b:I

    .line 51
    return-void
.end method

.method private e()V
    .locals 2

    .line 218
    iget-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v1

    .line 220
    if-ltz v1, :cond_0

    .line 222
    int-to-byte v0, v1

    iput-byte v0, p0, Lo/fpq;->a:B

    goto :goto_0

    .line 226
    :cond_0
    const/4 v0, 0x0

    iput-byte v0, p0, Lo/fpq;->a:B

    .line 230
    :goto_0
    const/4 v0, 0x7

    iput v0, p0, Lo/fpq;->b:I

    .line 231
    return-void
.end method


# virtual methods
.method public a()B
    .locals 2

    .line 165
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fpq;->d(I)[B

    move-result-object v1

    .line 167
    const/4 v0, 0x0

    aget-byte v0, v1, v0

    return v0
.end method

.method public a(I)Z
    .locals 2

    .line 197
    iget-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v1

    .line 198
    if-lt v1, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()Z
    .locals 1

    .line 186
    iget-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(I)I
    .locals 5

    .line 100
    const/4 v2, 0x0

    .line 102
    add-int/lit8 v3, p1, -0x1

    :goto_0
    if-ltz v3, :cond_3

    .line 105
    iget v0, p0, Lo/fpq;->b:I

    if-gez v0, :cond_0

    .line 106
    invoke-direct {p0}, Lo/fpq;->e()V

    .line 110
    :cond_0
    iget-byte v0, p0, Lo/fpq;->a:B

    iget v1, p0, Lo/fpq;->b:I

    shr-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 111
    :goto_1
    if-eqz v4, :cond_2

    .line 113
    const/4 v0, 0x1

    shl-int/2addr v0, v3

    or-int/2addr v2, v0

    .line 117
    :cond_2
    iget v0, p0, Lo/fpq;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fpq;->b:I

    .line 102
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 121
    :cond_3
    return v2
.end method

.method public c()[B
    .locals 1

    .line 176
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lo/fpq;->d(I)[B

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 3

    .line 207
    iget-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    iget v1, p0, Lo/fpq;->b:I

    add-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    return v0
.end method

.method public d(I)[B
    .locals 6

    .line 134
    move v3, p1

    .line 136
    if-gez v3, :cond_0

    .line 137
    iget-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v3

    .line 140
    :cond_0
    new-array v4, v3, [B

    .line 143
    iget v0, p0, Lo/fpq;->b:I

    if-ltz v0, :cond_2

    .line 145
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    .line 146
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/fpq;->c(I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 145
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    goto :goto_1

    .line 153
    :cond_2
    iget-object v0, p0, Lo/fpq;->d:Ljava/io/ByteArrayInputStream;

    array-length v1, v4

    const/4 v2, 0x0

    invoke-virtual {v0, v4, v2, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I

    .line 156
    :goto_1
    return-object v4
.end method

.method public e(I)J
    .locals 6

    .line 66
    const-wide/16 v2, 0x0

    .line 68
    add-int/lit8 v4, p1, -0x1

    :goto_0
    if-ltz v4, :cond_3

    .line 71
    iget v0, p0, Lo/fpq;->b:I

    if-gez v0, :cond_0

    .line 72
    invoke-direct {p0}, Lo/fpq;->e()V

    .line 76
    :cond_0
    iget-byte v0, p0, Lo/fpq;->a:B

    iget v1, p0, Lo/fpq;->b:I

    shr-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 77
    :goto_1
    if-eqz v5, :cond_2

    .line 79
    const-wide/16 v0, 0x1

    shl-long/2addr v0, v4

    or-long/2addr v2, v0

    .line 83
    :cond_2
    iget v0, p0, Lo/fpq;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/fpq;->b:I

    .line 68
    add-int/lit8 v4, v4, -0x1

    goto :goto_0

    .line 87
    :cond_3
    return-wide v2
.end method
