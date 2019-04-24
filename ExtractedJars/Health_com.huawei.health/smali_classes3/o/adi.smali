.class public Lo/adi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field protected d:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    return-void
.end method

.method private a(I)I
    .locals 1

    .line 37
    and-int/lit8 v0, p1, 0xf

    return v0
.end method

.method private a([B)Ljava/lang/Integer;
    .locals 4

    .line 91
    const/4 v2, -0x1

    .line 92
    iput-object p1, p0, Lo/adi;->d:[B

    .line 94
    iget v0, p0, Lo/adi;->a:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 95
    const/16 v2, 0x12

    goto :goto_0

    .line 97
    :cond_0
    const/16 v2, 0x11

    .line 99
    :goto_0
    const/4 v0, 0x1

    invoke-direct {p0, v2, v0}, Lo/adi;->d(II)Ljava/lang/Integer;

    move-result-object v3

    .line 101
    return-object v3
.end method

.method private c(B)I
    .locals 1

    .line 41
    and-int/lit16 v0, p1, 0xff

    return v0
.end method

.method private d(BBBB)I
    .locals 3

    .line 50
    invoke-direct {p0, p1}, Lo/adi;->c(B)I

    move-result v0

    invoke-direct {p0, p2}, Lo/adi;->c(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    .line 51
    invoke-direct {p0, p3}, Lo/adi;->c(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    invoke-direct {p0, p4}, Lo/adi;->c(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    add-int/2addr v0, v1

    .line 50
    return v0
.end method

.method private d(II)Ljava/lang/Integer;
    .locals 5

    .line 64
    invoke-direct {p0, p1}, Lo/adi;->a(I)I

    move-result v0

    add-int/2addr v0, p2

    iget-object v1, p0, Lo/adi;->d:[B

    array-length v1, v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 66
    :cond_0
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 68
    :pswitch_0
    iget-object v0, p0, Lo/adi;->d:[B

    aget-byte v0, v0, p2

    invoke-direct {p0, v0}, Lo/adi;->c(B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 71
    :pswitch_1
    iget-object v0, p0, Lo/adi;->d:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/adi;->d:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    invoke-direct {p0, v0, v1}, Lo/adi;->e(BB)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 74
    :pswitch_2
    iget-object v0, p0, Lo/adi;->d:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/adi;->d:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    iget-object v2, p0, Lo/adi;->d:[B

    add-int/lit8 v3, p2, 0x2

    aget-byte v2, v2, v3

    iget-object v3, p0, Lo/adi;->d:[B

    add-int/lit8 v4, p2, 0x3

    aget-byte v3, v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lo/adi;->d(BBBB)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 77
    :pswitch_3
    iget-object v0, p0, Lo/adi;->d:[B

    aget-byte v0, v0, p2

    invoke-direct {p0, v0}, Lo/adi;->c(B)I

    move-result v0

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1}, Lo/adi;->e(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 80
    :pswitch_4
    iget-object v0, p0, Lo/adi;->d:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/adi;->d:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    invoke-direct {p0, v0, v1}, Lo/adi;->e(BB)I

    move-result v0

    const/16 v1, 0x10

    invoke-direct {p0, v0, v1}, Lo/adi;->e(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 84
    :pswitch_5
    iget-object v0, p0, Lo/adi;->d:[B

    aget-byte v0, v0, p2

    iget-object v1, p0, Lo/adi;->d:[B

    add-int/lit8 v2, p2, 0x1

    aget-byte v1, v1, v2

    iget-object v2, p0, Lo/adi;->d:[B

    add-int/lit8 v3, p2, 0x2

    aget-byte v2, v2, v3

    iget-object v3, p0, Lo/adi;->d:[B

    add-int/lit8 v4, p2, 0x3

    aget-byte v3, v3, v4

    invoke-direct {p0, v0, v1, v2, v3}, Lo/adi;->d(BBBB)I

    move-result v0

    const/16 v1, 0x20

    invoke-direct {p0, v0, v1}, Lo/adi;->e(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 87
    :goto_0
    :pswitch_6
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
        :pswitch_1
        :pswitch_6
        :pswitch_2
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_4
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method private e(BB)I
    .locals 3

    .line 46
    invoke-direct {p0, p1}, Lo/adi;->c(B)I

    move-result v0

    invoke-direct {p0, p2}, Lo/adi;->c(B)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    return v0
.end method

.method private e(II)I
    .locals 3

    .line 56
    add-int/lit8 v0, p2, -0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    and-int/2addr v0, p1

    if-eqz v0, :cond_0

    .line 57
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

    .line 59
    :cond_0
    return p1
.end method


# virtual methods
.method public b([B)Lo/afz;
    .locals 2

    .line 30
    new-instance v1, Lo/aga;

    invoke-direct {v1}, Lo/aga;-><init>()V

    .line 31
    invoke-direct {p0, p1}, Lo/adi;->a([B)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/aga;->e(Ljava/lang/Integer;)V

    .line 33
    return-object v1
.end method

.method public c(I)V
    .locals 0

    .line 25
    iput p1, p0, Lo/adi;->a:I

    .line 26
    return-void
.end method
