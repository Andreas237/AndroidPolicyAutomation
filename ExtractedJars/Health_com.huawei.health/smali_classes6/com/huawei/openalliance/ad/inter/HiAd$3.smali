.class Lcom/huawei/openalliance/ad/inter/HiAd$3;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/inter/HiAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/HiAd;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/HiAd;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAd$3;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$3;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->e(Lcom/huawei/openalliance/ad/inter/HiAd;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/BroadcastReceiver;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/content/IntentFilter;

    if-eqz v6, :cond_1

    invoke-virtual {v6, v1}, Landroid/content/IntentFilter;->matchAction(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5, p1, p2}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    goto :goto_0

    :cond_2
    return-void
.end method
