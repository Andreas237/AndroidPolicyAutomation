.class public Lo/qs;
.super Lo/ob;
.source "SourceFile"


# static fields
.field private static final c:[B


# instance fields
.field private final d:[I

.field private e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/qs;->c:[B

    return-void
.end method

.method public constructor <init>(Lo/om;)V
    .locals 1

    .line 45
    invoke-direct {p0, p1}, Lo/ob;-><init>(Lo/om;)V

    .line 46
    sget-object v0, Lo/qs;->c:[B

    iput-object v0, p0, Lo/qs;->e:[B

    .line 47
    const/16 v0, 0x20

    new-array v0, v0, [I

    iput-object v0, p0, Lo/qs;->d:[I

    .line 48
    return-void
.end method

.method private a(I)V
    .locals 3

    .line 131
    iget-object v0, p0, Lo/qs;->e:[B

    array-length v0, v0

    if-ge v0, p1, :cond_0

    .line 132
    new-array v0, p1, [B

    iput-object v0, p0, Lo/qs;->e:[B

    .line 134
    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/16 v0, 0x20

    if-ge v2, v0, :cond_1

    .line 135
    iget-object v0, p0, Lo/qs;->d:[I

    const/4 v1, 0x0

    aput v1, v0, v2

    .line 134
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 137
    :cond_1
    return-void
.end method

.method private static b([I)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 141
    array-length v2, p0

    .line 142
    const/4 v3, 0x0

    .line 143
    const/4 v4, 0x0

    .line 144
    const/4 v5, 0x0

    .line 145
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_2

    .line 146
    aget v0, p0, v6

    if-le v0, v5, :cond_0

    .line 147
    move v4, v6

    .line 148
    aget v5, p0, v6

    .line 150
    :cond_0
    aget v0, p0, v6

    if-le v0, v3, :cond_1

    .line 151
    aget v3, p0, v6

    .line 145
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 156
    :cond_2
    const/4 v6, 0x0

    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v2, :cond_4

    .line 159
    sub-int v9, v8, v4

    .line 161
    aget v0, p0, v8

    mul-int/2addr v0, v9

    mul-int v10, v0, v9

    .line 162
    if-le v10, v7, :cond_3

    .line 163
    move v6, v8

    .line 164
    move v7, v10

    .line 158
    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 169
    :cond_4
    if-le v4, v6, :cond_5

    .line 170
    move v8, v4

    .line 171
    move v4, v6

    .line 172
    move v6, v8

    .line 177
    :cond_5
    sub-int v0, v6, v4

    div-int/lit8 v1, v2, 0x10

    if-gt v0, v1, :cond_6

    .line 178
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 182
    :cond_6
    add-int/lit8 v8, v6, -0x1

    .line 183
    const/4 v9, -0x1

    .line 184
    add-int/lit8 v10, v6, -0x1

    :goto_2
    if-le v10, v4, :cond_8

    .line 185
    sub-int v11, v10, v4

    .line 186
    mul-int v0, v11, v11

    sub-int v1, v6, v10

    mul-int/2addr v0, v1

    aget v1, p0, v10

    sub-int v1, v3, v1

    mul-int v12, v0, v1

    .line 187
    if-le v12, v9, :cond_7

    .line 188
    move v8, v10

    .line 189
    move v9, v12

    .line 184
    :cond_7
    add-int/lit8 v10, v10, -0x1

    goto :goto_2

    .line 193
    :cond_8
    shl-int/lit8 v0, v8, 0x3

    return v0
.end method


# virtual methods
.method public a(ILo/qm;)Lo/qm;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 53
    invoke-virtual {p0}, Lo/qs;->a()Lo/om;

    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lo/om;->getWidth()I

    move-result v4

    .line 55
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lo/qm;->d()I

    move-result v0

    if-ge v0, v4, :cond_1

    .line 56
    :cond_0
    new-instance v0, Lo/qm;

    move v1, v4

    invoke-direct {v0, v1}, Lo/qm;-><init>(I)V

    move-object p2, v0

    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p2}, Lo/qm;->c()V

    .line 61
    :goto_0
    invoke-direct {p0, v4}, Lo/qs;->a(I)V

    .line 62
    iget-object v0, p0, Lo/qs;->e:[B

    invoke-virtual {v3, p1, v0}, Lo/om;->getRow(I[B)[B

    move-result-object v5

    .line 63
    iget-object v6, p0, Lo/qs;->d:[I

    .line 64
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v4, :cond_2

    .line 65
    aget-byte v0, v5, v7

    and-int/lit16 v8, v0, 0xff

    .line 66
    shr-int/lit8 v0, v8, 0x3

    aget v1, v6, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, v6, v0

    .line 64
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 68
    :cond_2
    invoke-static {v6}, Lo/qs;->b([I)I

    move-result v7

    .line 70
    const/4 v0, 0x0

    aget-byte v0, v5, v0

    and-int/lit16 v8, v0, 0xff

    .line 71
    const/4 v0, 0x1

    aget-byte v0, v5, v0

    and-int/lit16 v9, v0, 0xff

    .line 72
    const/4 v10, 0x1

    :goto_2
    add-int/lit8 v0, v4, -0x1

    if-ge v10, v0, :cond_4

    .line 73
    add-int/lit8 v0, v10, 0x1

    aget-byte v0, v5, v0

    and-int/lit16 v11, v0, 0xff

    .line 75
    mul-int/lit8 v0, v9, 0x4

    sub-int/2addr v0, v8

    sub-int/2addr v0, v11

    div-int/lit8 v12, v0, 0x2

    .line 76
    if-ge v12, v7, :cond_3

    .line 77
    invoke-virtual {p2, v10}, Lo/qm;->c(I)V

    .line 79
    :cond_3
    move v8, v9

    .line 80
    move v9, v11

    .line 72
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 82
    :cond_4
    return-object p2
.end method

.method public b()Lo/qr;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 88
    invoke-virtual {p0}, Lo/qs;->a()Lo/om;

    move-result-object v3

    .line 89
    invoke-virtual {v3}, Lo/om;->getWidth()I

    move-result v4

    .line 90
    invoke-virtual {v3}, Lo/om;->getHeight()I

    move-result v5

    .line 91
    new-instance v6, Lo/qr;

    invoke-direct {v6, v4, v5}, Lo/qr;-><init>(II)V

    .line 95
    invoke-direct {p0, v4}, Lo/qs;->a(I)V

    .line 96
    iget-object v7, p0, Lo/qs;->d:[I

    .line 97
    const/4 v8, 0x1

    :goto_0
    const/4 v0, 0x5

    if-ge v8, v0, :cond_1

    .line 98
    mul-int v0, v5, v8

    div-int/lit8 v9, v0, 0x5

    .line 99
    iget-object v0, p0, Lo/qs;->e:[B

    invoke-virtual {v3, v9, v0}, Lo/om;->getRow(I[B)[B

    move-result-object v10

    .line 100
    mul-int/lit8 v0, v4, 0x4

    div-int/lit8 v11, v0, 0x5

    .line 101
    div-int/lit8 v12, v4, 0x5

    :goto_1
    if-ge v12, v11, :cond_0

    .line 102
    aget-byte v0, v10, v12

    and-int/lit16 v13, v0, 0xff

    .line 103
    shr-int/lit8 v0, v13, 0x3

    aget v1, v7, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, v7, v0

    .line 101
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 97
    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 106
    :cond_1
    invoke-static {v7}, Lo/qs;->b([I)I

    move-result v8

    .line 111
    invoke-virtual {v3}, Lo/om;->getMatrix()[B

    move-result-object v9

    .line 112
    const/4 v10, 0x0

    :goto_2
    if-ge v10, v5, :cond_4

    .line 113
    mul-int v11, v10, v4

    .line 114
    const/4 v12, 0x0

    :goto_3
    if-ge v12, v4, :cond_3

    .line 115
    add-int v0, v11, v12

    aget-byte v0, v9, v0

    and-int/lit16 v13, v0, 0xff

    .line 116
    if-ge v13, v8, :cond_2

    .line 117
    invoke-virtual {v6, v12, v10}, Lo/qr;->a(II)V

    .line 114
    :cond_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 112
    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 122
    :cond_4
    return-object v6
.end method

.method public d(Lo/om;)Lo/ob;
    .locals 1

    .line 127
    new-instance v0, Lo/qs;

    invoke-direct {v0, p1}, Lo/qs;-><init>(Lo/om;)V

    return-object v0
.end method
