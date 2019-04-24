.class public Lcom/huawei/openalliance/ad/j/c;
.super Lcom/huawei/openalliance/ad/j/k;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/views/a/c;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/j/k;-><init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/c;->d()V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/views/a/c;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/c;->b:Lcom/huawei/openalliance/ad/views/a/c;

    return-void
.end method

.method public b()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/j/c$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/c$1;-><init>(Lcom/huawei/openalliance/ad/j/c;)V

    const/16 v1, 0x1f40

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v0, v2

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/j/c;->a(J)V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/j/c;->f()V

    return-void
.end method

.method protected d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/c;->b:Lcom/huawei/openalliance/ad/views/a/c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/c;->b:Lcom/huawei/openalliance/ad/views/a/c;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/views/a/c;->b()V

    :cond_0
    invoke-super {p0}, Lcom/huawei/openalliance/ad/j/k;->d()V

    return-void
.end method
