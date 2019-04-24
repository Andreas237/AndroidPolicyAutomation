.class Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/event/IEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;


# virtual methods
.method public onEventCallBack(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    .locals 4

    .line 171
    sget-object v0, Lcom/huawei/wallet/logic/event/IEventType;->d:Lcom/huawei/wallet/logic/event/IEventType;

    if-ne v0, p1, :cond_0

    .line 173
    instance-of v0, p2, Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 175
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper$1;->c:Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;

    invoke-static {v0}, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->a(Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper$1;->c:Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;

    move-object v1, p2

    check-cast v1, Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->c(Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v2

    .line 178
    new-instance v3, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;

    invoke-direct {v3}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;-><init>()V

    .line 179
    invoke-virtual {v3, v2}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->b(Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper$1;->c:Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;

    invoke-static {v0}, Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;->a(Lcom/huawei/wallet/logic/cardidentify/CardNFCIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;->onIndetify(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    .line 184
    :cond_0
    return-void
.end method
