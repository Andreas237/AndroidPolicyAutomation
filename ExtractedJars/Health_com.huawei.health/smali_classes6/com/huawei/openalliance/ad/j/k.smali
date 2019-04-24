.class public abstract Lcom/huawei/openalliance/ad/j/k;
.super Ljava/lang/Object;


# instance fields
.field protected a:Lcom/huawei/openalliance/ad/e/a/e;

.field private b:Lcom/huawei/openalliance/ad/f/a;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/openalliance/ad/e/a/e;Lcom/huawei/openalliance/ad/f/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "min_show_time_task"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->c:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "max_show_time_task"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->d:Ljava/lang/String;

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/k;->a:Lcom/huawei/openalliance/ad/e/a/e;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/k;->b:Lcom/huawei/openalliance/ad/f/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method protected a(J)V
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "start max show time task duration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/k$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/k$1;-><init>(Lcom/huawei/openalliance/ad/j/k;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/k;->d:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method protected b(J)V
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "start min show time task duration: %d"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/k$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/k$2;-><init>(Lcom/huawei/openalliance/ad/j/k;)V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/k;->c:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method protected d()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->b:Lcom/huawei/openalliance/ad/f/a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->b:Lcom/huawei/openalliance/ad/f/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/f/a;->b()V

    :cond_0
    return-void
.end method

.method protected e()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->b:Lcom/huawei/openalliance/ad/f/a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->b:Lcom/huawei/openalliance/ad/f/a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/f/a;->a()V

    :cond_0
    return-void
.end method

.method protected f()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->d:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected g()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/k;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    return-void
.end method
