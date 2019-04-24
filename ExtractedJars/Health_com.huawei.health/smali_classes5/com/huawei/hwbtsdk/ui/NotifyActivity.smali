.class public Lcom/huawei/hwbtsdk/ui/NotifyActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 5

    .line 68
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 69
    const-string v0, "NotifyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deviceName is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 71
    :cond_0
    const-string v0, "NotifyActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "send broadcast : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "com.huawei.health.action.ACTION_DOUBLE_PHONE_CONFIRM_OR_CANCEL"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "com.huawei.health.action.ACTION_DOUBLE_PHONE_CONFIRM_OR_CANCEL"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    const-string v0, "confirmOrCancel"

    invoke-virtual {v4, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 75
    sget-object v0, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {p0, v4, v0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 77
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/hwbtsdk/ui/NotifyActivity;ILjava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->b(ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 11

    .line 25
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    const-string v0, "NotifyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "NotifyActivity onCreate."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 29
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->getWindow()Landroid/view/Window;

    move-result-object v4

    .line 30
    const/16 v0, 0x50

    invoke-virtual {v4, v0}, Landroid/view/Window;->setGravity(I)V

    .line 31
    invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v5

    .line 32
    const/4 v0, -0x1

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 33
    const/4 v0, -0x2

    iput v0, v5, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 34
    invoke-virtual {v4, v5}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 36
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v6

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 39
    const-string v0, "deviceName"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 42
    :cond_0
    const/4 v8, 0x0

    .line 43
    new-instance v9, Lo/egv$b;

    invoke-direct {v9, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 44
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_hwh_open_service_pop_up_notification_note:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    .line 45
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_hw_health_double_phone_dialog_content1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    .line 46
    move-object v10, v7

    .line 47
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_settings_button_cancal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;

    invoke-direct {v1, p0, v10}, Lcom/huawei/hwbtsdk/ui/NotifyActivity$4;-><init>(Lcom/huawei/hwbtsdk/ui/NotifyActivity;Ljava/lang/String;)V

    invoke-virtual {v9, v0, v1}, Lo/egv$b;->e(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 55
    invoke-virtual {p0}, Lcom/huawei/hwbtsdk/ui/NotifyActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/hwbtsdk/R$string;->IDS_btsdk_confirm_connect:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;

    invoke-direct {v1, p0, v10}, Lcom/huawei/hwbtsdk/ui/NotifyActivity$3;-><init>(Lcom/huawei/hwbtsdk/ui/NotifyActivity;Ljava/lang/String;)V

    invoke-virtual {v9, v0, v1}, Lo/egv$b;->b(Ljava/lang/String;Landroid/view/View$OnClickListener;)Lo/egv$b;

    .line 62
    invoke-virtual {v9}, Lo/egv$b;->b()Lo/egv;

    move-result-object v8

    .line 63
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/egv;->setCancelable(Z)V

    .line 64
    invoke-virtual {v8}, Lo/egv;->show()V

    .line 65
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 81
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->x(Landroid/content/Context;)V

    .line 82
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 83
    return-void
.end method
