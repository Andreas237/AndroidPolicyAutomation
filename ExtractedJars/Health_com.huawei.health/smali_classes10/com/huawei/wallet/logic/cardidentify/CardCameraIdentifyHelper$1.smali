.class Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/wallet/logic/event/IEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->b(Landroid/app/Activity;Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;


# direct methods
.method constructor <init>(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;->a:Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEventCallBack(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V
    .locals 5

    .line 62
    sget-object v0, Lcom/huawei/wallet/logic/event/IEventType;->b:Lcom/huawei/wallet/logic/event/IEventType;

    if-ne p1, v0, :cond_1

    .line 64
    if-eqz p2, :cond_0

    instance-of v0, p2, Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 66
    new-instance v2, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;

    invoke-direct {v2}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;-><init>()V

    .line 68
    move-object v3, p2

    :try_start_0
    check-cast v3, Landroid/content/Intent;

    .line 69
    const-string v0, "exocr.bankcard.scanResult"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 70
    invoke-virtual {v2, v4}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->b(Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->b()Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/idencard/camera/base/CardResultInfoManager;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;->d(Landroid/graphics/Bitmap;)V

    .line 72
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;->a:Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-static {v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->c(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;->onIndetify(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto :goto_0

    .line 73
    :catch_0
    move-exception v3

    .line 75
    const-string v0, "ClassCastException."

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 77
    :goto_0
    goto :goto_1

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;->a:Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-static {v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->c(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;->onIndetify(Lcom/huawei/wallet/logic/cardidentify/CardIdentifyInfo;)V

    goto :goto_1

    .line 83
    :cond_1
    sget-object v0, Lcom/huawei/wallet/logic/event/IEventType;->a:Lcom/huawei/wallet/logic/event/IEventType;

    if-ne p1, v0, :cond_2

    .line 85
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;->a:Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-static {v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->c(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;->onSwitch2Input()V

    goto :goto_1

    .line 87
    :cond_2
    sget-object v0, Lcom/huawei/wallet/logic/event/IEventType;->e:Lcom/huawei/wallet/logic/event/IEventType;

    if-ne p1, v0, :cond_3

    .line 89
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;->a:Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;

    invoke-static {v0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->c(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;->onCardBackPressed()V

    .line 91
    :cond_3
    :goto_1
    return-void
.end method
