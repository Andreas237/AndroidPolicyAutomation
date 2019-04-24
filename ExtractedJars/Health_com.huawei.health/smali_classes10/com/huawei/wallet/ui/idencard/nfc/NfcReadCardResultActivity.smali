.class public Lcom/huawei/wallet/ui/idencard/nfc/NfcReadCardResultActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 38
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 40
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/nfc/NfcReadCardResultActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 41
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 42
    return-void

    .line 44
    :cond_0
    const-string v0, "android.nfc.action.TECH_DISCOVERED"

    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    const-string v0, "is_activity_main_task"

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 49
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 50
    const-class v0, Lcom/huawei/wallet/ui/idencard/nfc/NfcReadCardResultActivity;

    invoke-virtual {v3, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 51
    const v0, 0x8000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 52
    invoke-virtual {p0, v3}, Lcom/huawei/wallet/ui/idencard/nfc/NfcReadCardResultActivity;->startActivity(Landroid/content/Intent;)V

    .line 55
    :cond_1
    invoke-static {}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c()Lcom/huawei/wallet/logic/event/EventDispatchManager;

    move-result-object v0

    sget-object v1, Lcom/huawei/wallet/logic/event/IEventType;->d:Lcom/huawei/wallet/logic/event/IEventType;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/wallet/logic/event/EventDispatchManager;->c(Lcom/huawei/wallet/logic/event/IEventType;Ljava/lang/Object;)V

    .line 57
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/wallet/ui/idencard/nfc/NfcReadCardResultActivity;->finish()V

    .line 58
    return-void
.end method
