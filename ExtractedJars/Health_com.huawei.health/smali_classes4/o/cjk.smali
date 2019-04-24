.class public Lo/cjk;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I

.field private e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lo/cjk;->e:[B

    const/16 v0, 0x400

    iput v0, p0, Lo/cjk;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lo/cjk;->b:I

    iget v0, p0, Lo/cjk;->a:I

    new-array v0, v0, [B

    iput-object v0, p0, Lo/cjk;->e:[B

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lo/cjk;->e:[B

    const/16 v0, 0x400

    iput v0, p0, Lo/cjk;->a:I

    const/4 v0, 0x0

    iput v0, p0, Lo/cjk;->b:I

    iput p1, p0, Lo/cjk;->a:I

    new-array v0, p1, [B

    iput-object v0, p0, Lo/cjk;->e:[B

    return-void
.end method


# virtual methods
.method public a([BI)V
    .locals 6

    if-gtz p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lo/cjk;->e:[B

    array-length v0, v0

    iget v1, p0, Lo/cjk;->b:I

    sub-int/2addr v0, v1

    if-lt v0, p2, :cond_1

    iget-object v0, p0, Lo/cjk;->e:[B

    iget v1, p0, Lo/cjk;->b:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/cjk;->e:[B

    array-length v0, v0

    add-int/2addr v0, p2

    shl-int/lit8 v4, v0, 0x1

    new-array v5, v4, [B

    iget-object v0, p0, Lo/cjk;->e:[B

    iget v1, p0, Lo/cjk;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lo/cjk;->b:I

    const/4 v1, 0x0

    invoke-static {p1, v1, v5, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v5, p0, Lo/cjk;->e:[B

    :goto_0
    iget v0, p0, Lo/cjk;->b:I

    add-int/2addr v0, p2

    iput v0, p0, Lo/cjk;->b:I

    return-void
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lo/cjk;->b:I

    return v0
.end method

.method public e()[B
    .locals 5

    iget v0, p0, Lo/cjk;->b:I

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    iget v0, p0, Lo/cjk;->b:I

    new-array v4, v0, [B

    iget-object v0, p0, Lo/cjk;->e:[B

    iget v1, p0, Lo/cjk;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v4
.end method
