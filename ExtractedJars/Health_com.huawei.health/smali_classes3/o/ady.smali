.class public Lo/ady;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:F

.field private c:I

.field private d:I

.field private e:I

.field private f:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 38
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/ady;->a:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public a()[B
    .locals 7

    .line 71
    iget v2, p0, Lo/ady;->e:I

    .line 72
    iget v0, p0, Lo/ady;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 73
    or-int/lit16 v2, v2, 0x80

    .line 75
    :cond_0
    iget v0, p0, Lo/ady;->b:F

    const/high16 v1, 0x41200000    # 10.0f

    mul-float/2addr v0, v1

    float-to-int v3, v0

    .line 76
    and-int/lit16 v4, v3, 0xff

    .line 77
    shr-int/lit8 v0, v3, 0x8

    and-int/lit16 v5, v0, 0xff

    .line 78
    const/16 v0, 0x11

    new-array v6, v0, [B

    const/16 v0, -0x25

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    const/16 v0, 0xe

    const/4 v1, 0x1

    aput-byte v0, v6, v1

    const/16 v0, 0x9

    const/4 v1, 0x2

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/4 v1, 0x3

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x1

    aget-byte v0, v0, v1

    const/4 v1, 0x4

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x2

    aget-byte v0, v0, v1

    const/4 v1, 0x5

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x3

    aget-byte v0, v0, v1

    const/4 v1, 0x6

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x4

    aget-byte v0, v0, v1

    const/4 v1, 0x7

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x5

    aget-byte v0, v0, v1

    const/16 v1, 0x8

    aput-byte v0, v6, v1

    iget-object v0, p0, Lo/ady;->f:[B

    const/4 v1, 0x6

    aget-byte v0, v0, v1

    const/16 v1, 0x9

    aput-byte v0, v6, v1

    int-to-byte v0, v2

    const/16 v1, 0xa

    aput-byte v0, v6, v1

    iget v0, p0, Lo/ady;->c:I

    int-to-byte v0, v0

    const/16 v1, 0xb

    aput-byte v0, v6, v1

    const/4 v0, 0x0

    const/16 v1, 0xc

    aput-byte v0, v6, v1

    int-to-byte v0, v4

    const/16 v1, 0xd

    aput-byte v0, v6, v1

    int-to-byte v0, v5

    const/16 v1, 0xe

    aput-byte v0, v6, v1

    const/4 v0, -0x1

    const/16 v1, 0xf

    aput-byte v0, v6, v1

    const/4 v0, -0x1

    const/16 v1, 0x10

    aput-byte v0, v6, v1

    .line 97
    return-object v6
.end method

.method public b(F)V
    .locals 1

    .line 62
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lo/ady;->b:F

    .line 63
    return-void
.end method

.method public c(I)V
    .locals 1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ady;->d:I

    .line 30
    return-void
.end method

.method public c([B)V
    .locals 1

    .line 21
    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    iput-object v0, p0, Lo/ady;->f:[B

    .line 22
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/ady;->a:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 1

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ady;->c:I

    .line 55
    return-void
.end method

.method public e(I)V
    .locals 1

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/ady;->e:I

    .line 47
    return-void
.end method
