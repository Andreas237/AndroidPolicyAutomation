.class Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a()Ljava/lang/Boolean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    iget-object v2, v2, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    invoke-static {v2}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->d(Lcom/huawei/openalliance/ad/inter/HiAdSplash;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->b:Lcom/huawei/openalliance/ad/inter/HiAdSplash;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1$1;->a:Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/inter/HiAdSplash$1;->a:Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/inter/HiAdSplash;->a(Lcom/huawei/openalliance/ad/inter/HiAdSplash;Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;)V

    :goto_0
    return-void
.end method
