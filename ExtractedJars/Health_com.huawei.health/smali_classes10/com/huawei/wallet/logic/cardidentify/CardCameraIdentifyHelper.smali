.class public Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->a:Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/app/Activity;Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;)V
    .locals 4

    .line 43
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 45
    const-string v0, "identifyCardByCamera begin to identify"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 46
    iput-object p2, p0, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;->a:Lcom/huawei/wallet/logic/cardidentify/ICardIdentifyCallBack;

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 50
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 52
    const-string v0, "isSupportHorVerSwitch"

    invoke-static {p1}, Lcom/huawei/wallet/utils/UIUtil;->a(Landroid/app/Activity;)Z

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 53
    const-class v0, Lcom/huawei/wallet/ui/idencard/camera/bankcard/BankCardCaptureActivity;

    invoke-virtual {v3, p1, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 54
    const-string v0, "event_callback_id"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    invoke-virtual {p1, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 57
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    new-instance v1, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;

    invoke-direct {v1, p0}, Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper$1;-><init>(Lcom/huawei/wallet/logic/cardidentify/CardCameraIdentifyHelper;)V

    invoke-virtual {v0, v2, v1}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->a(Ljava/lang/String;Lcom/huawei/wallet/logic/event/IEventListener;)V

    .line 93
    goto :goto_0

    .line 96
    :cond_0
    const-string v0, "identifyCardByCamera context is null or callback is null"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 98
    :goto_0
    return-void
.end method
