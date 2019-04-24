.class Lo/acz$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Lo/acz$d;->a:[B

    .line 102
    return-void
.end method

.method private a(B)I
    .locals 1

    .line 139
    and-int/lit16 v0, p1, 0xff

    return v0
.end method

.method private c(BB)I
    .locals 3

    .line 144
    invoke-direct {p0, p1}, Lo/acz$d;->a(B)I

    move-result v0

    invoke-direct {p0, p2}, Lo/acz$d;->a(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    return v0
.end method

.method private d(II)I
    .locals 3

    .line 163
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    and-int/2addr v0, p1

    if-eqz v0, :cond_0

    .line 164
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    add-int/lit8 v1, p2, -0x1

    const/4 v2, 0x1

    shl-int v1, v2, v1

    add-int/lit8 v1, v1, -0x1

    and-int/2addr v1, p1

    sub-int/2addr v0, v1

    mul-int/lit8 p1, v0, -0x1

    .line 166
    :cond_0
    return p1
.end method

.method private e(BB)F
    .locals 8

    .line 155
    invoke-direct {p0, p1}, Lo/acz$d;->a(B)I

    move-result v0

    .line 156
    invoke-direct {p0, p2}, Lo/acz$d;->a(B)I

    move-result v1

    and-int/lit8 v1, v1, 0xf

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    .line 155
    const/16 v1, 0xc

    invoke-direct {p0, v0, v1}, Lo/acz$d;->d(II)I

    move-result v6

    .line 157
    invoke-direct {p0, p2}, Lo/acz$d;->a(B)I

    move-result v0

    shr-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lo/acz$d;->d(II)I

    move-result v7

    .line 158
    int-to-double v0, v6

    int-to-double v2, v7

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method private e(BBBB)I
    .locals 3

    .line 149
    invoke-direct {p0, p1}, Lo/acz$d;->a(B)I

    move-result v0

    invoke-direct {p0, p2}, Lo/acz$d;->a(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    .line 150
    invoke-direct {p0, p3}, Lo/acz$d;->a(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    invoke-direct {p0, p4}, Lo/acz$d;->a(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    add-int/2addr v0, v1

    .line 149
    return v0
.end method

.method private e(I)I
    .locals 1

    .line 134
    and-int/lit8 v0, p1, 0xf

    return v0
.end method


# virtual methods
.method public b(II)Ljava/lang/Integer;
    .locals 5

    .line 105
    invoke-direct {p0, p1}, Lo/acz$d;->e(I)I

    move-result v0

    add-int/2addr v0, p2

    iget-object v1, p0, Lo/acz$d;->a:[B

    array-length v1, v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 107
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 109
    :pswitch_0
    iget-object v0, p0, Lo/acz$d;->a:[B

    aget-byte v0, v0, p2

    invoke-direct {p0, v0}, Lo/acz$d;->a(B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 112
    :pswitch_1
    iget-object v0, p0, Lo/acz$d;->a:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/acz$d;->a:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    invoke-direct {p0, v0, v1}, Lo/acz$d;->c(BB)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 115
    :pswitch_2
    iget-object v0, p0, Lo/acz$d;->a:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/acz$d;->a:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    iget-object v2, p0, Lo/acz$d;->a:[B

    add-int/lit8 v3, p2, 0x2

    aget-byte v2, v2, v3

    iget-object v3, p0, Lo/acz$d;->a:[B

    add-int/lit8 v4, p2, 0x3

    aget-byte v3, v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lo/acz$d;->e(BBBB)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 119
    :goto_0
    :pswitch_3
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public c(II)Ljava/lang/Float;
    .locals 3

    .line 123
    invoke-direct {p0, p1}, Lo/acz$d;->e(I)I

    move-result v0

    add-int/2addr v0, p2

    iget-object v1, p0, Lo/acz$d;->a:[B

    array-length v1, v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 125
    :cond_0
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 127
    :sswitch_0
    iget-object v0, p0, Lo/acz$d;->a:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/acz$d;->a:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    invoke-direct {p0, v0, v1}, Lo/acz$d;->e(BB)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    .line 130
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x32 -> :sswitch_0
    .end sparse-switch
.end method
