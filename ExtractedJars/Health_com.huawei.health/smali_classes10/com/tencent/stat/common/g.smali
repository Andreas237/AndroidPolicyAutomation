.class public Lcom/tencent/stat/common/g;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/tencent/stat/common/g;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/tencent/stat/common/g;->a:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BI)[B
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Lcom/tencent/stat/common/g;->a([BIII)[B

    move-result-object v0

    return-object v0
.end method

.method public static a([BIII)[B
    .locals 6

    new-instance v4, Lcom/tencent/stat/common/i;

    mul-int/lit8 v0, p2, 0x3

    div-int/lit8 v0, v0, 0x4

    new-array v0, v0, [B

    invoke-direct {v4, p3, v0}, Lcom/tencent/stat/common/i;-><init>(I[B)V

    const/4 v0, 0x1

    invoke-virtual {v4, p0, p1, p2, v0}, Lcom/tencent/stat/common/i;->a([BIIZ)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "bad base-64"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget v0, v4, Lcom/tencent/stat/common/i;->b:I

    iget-object v1, v4, Lcom/tencent/stat/common/i;->a:[B

    array-length v1, v1

    if-ne v0, v1, :cond_1

    iget-object v0, v4, Lcom/tencent/stat/common/i;->a:[B

    return-object v0

    :cond_1
    iget v0, v4, Lcom/tencent/stat/common/i;->b:I

    new-array v5, v0, [B

    iget-object v0, v4, Lcom/tencent/stat/common/i;->a:[B

    iget v1, v4, Lcom/tencent/stat/common/i;->b:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v5
.end method

.method public static b([BI)[B
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Lcom/tencent/stat/common/g;->b([BIII)[B

    move-result-object v0

    return-object v0
.end method

.method public static b([BIII)[B
    .locals 4

    new-instance v2, Lcom/tencent/stat/common/j;

    const/4 v0, 0x0

    invoke-direct {v2, p3, v0}, Lcom/tencent/stat/common/j;-><init>(I[B)V

    div-int/lit8 v0, p2, 0x3

    mul-int/lit8 v3, v0, 0x4

    iget-boolean v0, v2, Lcom/tencent/stat/common/j;->d:Z

    if-eqz v0, :cond_0

    rem-int/lit8 v0, p2, 0x3

    if-lez v0, :cond_1

    add-int/lit8 v3, v3, 0x4

    goto :goto_0

    :cond_0
    rem-int/lit8 v0, p2, 0x3

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :pswitch_2
    add-int/lit8 v3, v3, 0x3

    :cond_1
    :goto_0
    iget-boolean v0, v2, Lcom/tencent/stat/common/j;->e:Z

    if-eqz v0, :cond_3

    if-lez p2, :cond_3

    add-int/lit8 v0, p2, -0x1

    div-int/lit8 v0, v0, 0x39

    add-int/lit8 v0, v0, 0x1

    iget-boolean v1, v2, Lcom/tencent/stat/common/j;->f:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    :goto_1
    mul-int/2addr v0, v1

    add-int/2addr v3, v0

    :cond_3
    new-array v0, v3, [B

    iput-object v0, v2, Lcom/tencent/stat/common/j;->a:[B

    const/4 v0, 0x1

    invoke-virtual {v2, p0, p1, p2, v0}, Lcom/tencent/stat/common/j;->a([BIIZ)Z

    sget-boolean v0, Lcom/tencent/stat/common/g;->a:Z

    if-nez v0, :cond_4

    iget v0, v2, Lcom/tencent/stat/common/j;->b:I

    if-eq v0, v3, :cond_4

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_4
    iget-object v0, v2, Lcom/tencent/stat/common/j;->a:[B

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
