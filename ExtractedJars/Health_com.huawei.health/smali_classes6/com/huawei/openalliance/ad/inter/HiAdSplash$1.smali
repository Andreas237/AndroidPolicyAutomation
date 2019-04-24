.class Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/HiAdSplash;->isAvailable(Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

.field final synthetic b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->c()Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    move-result-object v5

    sget-object v0, Lcom/huawei/openalliance/ad/constant/AdLoadMode;->CACHE:Lcom/huawei/openalliance/ad/constant/AdLoadMode;

    if-ne v0, v5, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->g()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->b(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->c(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getAdIds()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOrientation()I

    move-result v2

    iget-object v3, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v3

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/e/a/e;->h()J

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/huawei/openalliance/ad/e/a/a;->a(Ljava/lang/String;IJ)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;-><init>(Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->b(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
