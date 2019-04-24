.class public Lo/eex;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private g:I

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const/4 v0, 0x1

    iput v0, p0, Lo/eex;->a:I

    .line 6
    const/16 v0, 0x3c

    iput v0, p0, Lo/eex;->d:I

    .line 7
    const/16 v0, 0xaa

    iput v0, p0, Lo/eex;->b:I

    .line 8
    const/16 v0, 0x5000

    iput v0, p0, Lo/eex;->e:I

    .line 9
    const/16 v0, 0x6e

    iput v0, p0, Lo/eex;->c:I

    .line 10
    const/16 v0, 0x2d0

    iput v0, p0, Lo/eex;->g:I

    .line 11
    const/4 v0, 0x5

    iput v0, p0, Lo/eex;->i:I

    .line 12
    const/16 v0, 0x14

    iput v0, p0, Lo/eex;->k:I

    return-void
.end method


# virtual methods
.method public a()[I
    .locals 3

    .line 49
    const/16 v0, 0x8

    new-array v0, v0, [I

    iget v1, p0, Lo/eex;->a:I

    const/4 v2, 0x0

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->d:I

    const/4 v2, 0x1

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->b:I

    const/4 v2, 0x2

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->e:I

    const/4 v2, 0x3

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->c:I

    const/4 v2, 0x4

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->g:I

    const/4 v2, 0x5

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->i:I

    const/4 v2, 0x6

    aput v1, v0, v2

    iget v1, p0, Lo/eex;->k:I

    const/4 v2, 0x7

    aput v1, v0, v2

    return-object v0
.end method

.method public b(III)Z
    .locals 2

    .line 15
    const/4 v1, 0x0

    .line 16
    if-ltz p1, :cond_0

    const/4 v0, 0x2

    if-gt p1, v0, :cond_0

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    const/16 v0, 0xc8

    if-gt p2, v0, :cond_0

    const/16 v0, 0x64

    if-lt p3, v0, :cond_0

    const/16 v0, 0x12c

    if-le p3, v0, :cond_1

    .line 17
    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    .line 20
    :cond_1
    const/4 v1, 0x1

    .line 21
    iput p1, p0, Lo/eex;->a:I

    .line 22
    iput p2, p0, Lo/eex;->d:I

    .line 23
    iput p3, p0, Lo/eex;->b:I

    .line 25
    :goto_0
    return v1
.end method

.method public b([I)Z
    .locals 6

    .line 29
    if-nez p1, :cond_0

    .line 30
    const/4 v0, 0x0

    return v0

    .line 32
    :cond_0
    array-length v0, p1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    .line 33
    const/4 v0, 0x0

    return v0

    .line 35
    :cond_1
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    aget v5, v2, v4

    .line 36
    if-gtz v5, :cond_2

    .line 37
    const/4 v0, 0x0

    return v0

    .line 35
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 40
    :cond_3
    const/4 v0, 0x0

    aget v0, p1, v0

    iput v0, p0, Lo/eex;->e:I

    .line 41
    const/4 v0, 0x1

    aget v0, p1, v0

    iput v0, p0, Lo/eex;->c:I

    .line 42
    const/4 v0, 0x2

    aget v0, p1, v0

    iput v0, p0, Lo/eex;->g:I

    .line 43
    const/4 v0, 0x3

    aget v0, p1, v0

    iput v0, p0, Lo/eex;->i:I

    .line 44
    const/4 v0, 0x4

    aget v0, p1, v0

    iput v0, p0, Lo/eex;->k:I

    .line 45
    const/4 v0, 0x1

    return v0
.end method
