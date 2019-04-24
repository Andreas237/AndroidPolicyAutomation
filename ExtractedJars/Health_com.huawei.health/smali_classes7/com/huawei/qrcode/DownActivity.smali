.class public Lcom/huawei/qrcode/DownActivity;
.super Landroid/app/Activity;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;,
        Lcom/huawei/qrcode/DownActivity$NegativeBtnListener;,
        Lcom/huawei/qrcode/DownActivity$CancelDownKeyListener;,
        Lcom/huawei/qrcode/DownActivity$LocalHandler;
    }
.end annotation


# instance fields
.field private cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

.field private downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

.field private downLoadProgressSize:Landroid/widget/TextView;

.field private downLoadProgressText:Landroid/widget/TextView;

.field private downLoadProgressbar:Landroid/widget/ProgressBar;

.field private downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

.field private downUrl:Ljava/lang/String;

.field private eventId:Ljava/lang/String;

.field private handler:Lcom/huawei/qrcode/DownActivity$LocalHandler;

.field private hashValue:Ljava/lang/String;

.field private mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

.field private name:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

.field private qrcodeAppOperationInfo:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    new-instance v0, Lcom/huawei/qrcode/DownActivity$LocalHandler;

    invoke-direct {v0, p0}, Lcom/huawei/qrcode/DownActivity$LocalHandler;-><init>(Lcom/huawei/qrcode/DownActivity;)V

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->handler:Lcom/huawei/qrcode/DownActivity$LocalHandler;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/qrcode/DownActivity;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/DownActivity;->handlerMsg(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/qrcode/DownActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->startAppDown()V

    return-void
.end method

.method static synthetic access$500(Lcom/huawei/qrcode/DownActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->showCancelDownPromptDialog()V

    return-void
.end method

.method private cancelDownLoadIngProgress()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->dismiss()V

    :cond_0
    return-void
.end method

.method private cancelDownPromptDialogs()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->dismiss()V

    :cond_0
    return-void
.end method

.method private cancelInstallRemindProgress()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->dismiss()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    :cond_0
    return-void
.end method

.method private checkOnNewIntent()Z
    .locals 4

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "intent_event_callback_id"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownActivity eventId is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-direct {p0, v3}, Lcom/huawei/qrcode/DownActivity;->initBundleData(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private dealDownSuccessMsg(Landroid/os/Message;)V
    .locals 8

    const/4 v7, 0x0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lcom/huawei/qrcode/logic/down/AppBean;

    :cond_0
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    invoke-static {p0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/logic/down/AppDownManager;

    move-result-object v0

    move-object v1, p0

    iget-object v2, p0, Lcom/huawei/qrcode/DownActivity;->handler:Lcom/huawei/qrcode/DownActivity$LocalHandler;

    invoke-virtual {v7}, Lcom/huawei/qrcode/logic/down/AppBean;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7}, Lcom/huawei/qrcode/logic/down/AppBean;->getFilePath()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppOperationInfo:Ljava/lang/String;

    iget-object v6, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/qrcode/logic/down/AppDownManager;->installPackage(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v0, "DownActivity dealDownSuccessMsg appBeans is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    :goto_0
    return-void
.end method

.method private getPkgDesc()Ljava/lang/String;
    .locals 3

    const-string v2, ""

    const-string v0, "com.huawei.gamebox"

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "scanqrcode_sdk_hw_game"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    :cond_0
    const-string v0, "com.huawei.lives"

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "scanqrcode_sdk_hw_life"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v0, "com.huawei.appmarket"

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "scanqrcode_sdk_hw_market"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const-string v0, "com.huawei.android.hwpay"

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "scanqrcode_sdk_hw_pay"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    const-string v0, "com.huawei.hwid"

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "scanqrcode_sdk_hw_sociality"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    const-string v0, "com.huawei.wallet"

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "scanqrcode_sdk_hw_wallet"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_5
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v2, p0, Lcom/huawei/qrcode/DownActivity;->name:Ljava/lang/String;

    :cond_6
    return-object v2
.end method

.method private handlerMsg(Landroid/os/Message;)V
    .locals 6

    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    iget v5, p1, Landroid/os/Message;->arg1:I

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressbar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressText:Landroid/widget/TextView;

    const-string v1, "scanqrcode_sdk_down_progress1"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "%"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/qrcode/DownActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressSize:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "DownActivity down success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialogs()V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelDownLoadIngProgress()V

    invoke-direct {p0, p1}, Lcom/huawei/qrcode/DownActivity;->dealDownSuccessMsg(Landroid/os/Message;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "03010202"

    const-string v2, "01"

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportDownInstall(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :sswitch_3
    const-string v0, "DownActivity down fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialogs()V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelDownLoadIngProgress()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "03010202"

    const-string v2, "02"

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportDownInstall(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "scanqrcode_sdk_download_fail"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/DownActivity;->showToast(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "DownActivity install type system."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->d(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialogs()V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelDownLoadIngProgress()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "DownActivity silence  is installing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->remindInstallingApp()V

    goto/16 :goto_1

    :sswitch_6
    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "03010103"

    const-string v2, "01"

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportDownInstall(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelInstallRemindProgress()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownActivity eventId "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownActivity scan sdk jump. "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->jumpToApp()V

    goto :goto_0

    :cond_0
    const-string v0, "DownActivity scan sdk jump. "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/qrcode/logic/EventDispatchManager;->notifyListener(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeAllEventListener()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    :goto_0
    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    goto :goto_1

    :sswitch_7
    const-string v0, "DownActivity silence install fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/huawei/qrcode/logic/EventDispatchManager;->getInstance()Lcom/huawei/qrcode/logic/EventDispatchManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/qrcode/logic/EventDispatchManager;->removeAllEventListener()V

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->eventId:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "03010103"

    const-string v2, "02"

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportDownInstall(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->cancelInstallRemindProgress()V

    const-string v0, "scanqrcode_sdk_install_failed"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/DownActivity;->showToast(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d1 -> :sswitch_7
        0x1 -> :sswitch_6
        0x3e9 -> :sswitch_3
        0x3ea -> :sswitch_0
        0x3ed -> :sswitch_5
        0x3ef -> :sswitch_1
        0x3f1 -> :sswitch_2
        0x46e -> :sswitch_4
    .end sparse-switch
.end method

.method private initBundleData(Landroid/os/Bundle;)Z
    .locals 2

    const-string v0, "qrcodeAppInfo"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/huawei/qrcode/model/QrcodeAppInfo;

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const-string v0, "DownActivity initBundleData qrcodeAppInfo is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "DownActivity initBundleData qrcodeAppInfo not null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-virtual {v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppPackage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-virtual {v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppDownUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downUrl:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-virtual {v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getQrcodeAppOperationInfo()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppOperationInfo:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-virtual {v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->name:Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppInfo:Lcom/huawei/qrcode/model/QrcodeAppInfo;

    invoke-virtual {v0}, Lcom/huawei/qrcode/model/QrcodeAppInfo;->getHashValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->hashValue:Ljava/lang/String;

    const/4 v0, 0x1

    return v0
.end method

.method private jumpToApp()V
    .locals 4

    invoke-static {}, Lcom/huawei/qrcode/logic/jump/JumpManager;->getInstance()Lcom/huawei/qrcode/logic/jump/JumpManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->qrcodeAppOperationInfo:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/jump/JumpManager;->jumpToActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private remindInstallingApp()V
    .locals 2

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "DownActivity remindInstallAppProgress activity is finishing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "DownActivity remindInstallAppProgress mInstallRemindProDialog is showing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createProgressDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const-string v1, "scanqrcode_sdk_dialog_installing"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setMessage(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->mInstallRemindProDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwProgressDialogInterface;->show()V

    return-void
.end method

.method private showCancelDownPromptDialog()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_cancel_down_tip_title"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setTitle(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_cancel_down_tip_desc"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setMessage(I)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_dialog_yes"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/qrcode/DownActivity$4;

    invoke-direct {v2, p0}, Lcom/huawei/qrcode/DownActivity$4;-><init>(Lcom/huawei/qrcode/DownActivity;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_dialog_no"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/qrcode/DownActivity$NegativeBtnListener;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/huawei/qrcode/DownActivity$NegativeBtnListener;-><init>(Lcom/huawei/qrcode/DownActivity$1;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    new-instance v1, Lcom/huawei/qrcode/DownActivity$CancelDownKeyListener;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/huawei/qrcode/DownActivity$CancelDownKeyListener;-><init>(Lcom/huawei/qrcode/DownActivity$1;)V

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->cancelDownPromptDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->show()V

    return-void
.end method

.method private showDownAppRemindDialog()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_down_prompt_title"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setTitle(I)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_down_prompt_desc"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->getPkgDesc()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/qrcode/DownActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setMessage(Ljava/lang/String;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_agree_down_btn"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/qrcode/DownActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/qrcode/DownActivity$1;-><init>(Lcom/huawei/qrcode/DownActivity;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v1, "scanqrcode_sdk_cancel_down_btn"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/qrcode/DownActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/qrcode/DownActivity$2;-><init>(Lcom/huawei/qrcode/DownActivity;)V

    invoke-interface {v0, v1, v2}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    new-instance v5, Lcom/huawei/qrcode/DownActivity$3;

    invoke-direct {v5, p0}, Lcom/huawei/qrcode/DownActivity$3;-><init>(Lcom/huawei/qrcode/DownActivity;)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0, v5}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downRemindDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->show()V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "03010201"

    const-string v2, "01"

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/qrcode/logic/bi/SqrcodeSdkBiAnalytics;->reportDownInstall(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private showDownloadProgressDialog()V
    .locals 7

    invoke-static {p0}, Lcom/huawei/qrcode/widget/WidgetBuilder;->createDialog(Landroid/content/Context;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "scanqrcode_sdk_down_progress_dialog"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getLayoutId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    instance-of v0, v0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    check-cast v0, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;

    invoke-virtual {v0}, Lcom/huawei/qrcode/widget/custom/dialog/HwDialogCustom;->getContentView()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0, v5}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCustomContentView(Landroid/view/View;)Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const-string v0, "download_progress_ps"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressbar:Landroid/widget/ProgressBar;

    const-string v0, "download_progress_text_tv"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressText:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressText:Landroid/widget/TextView;

    const-string v1, "scanqrcode_sdk_down_progress1"

    invoke-static {p0, v1}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "0%"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v1, v2}, Lcom/huawei/qrcode/DownActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v0, "file_isdowning_size_tv"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressSize:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCanceledOnTouchOutside(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setCancelable(Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    new-instance v1, Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/qrcode/DownActivity$DialogOnKeyListener;-><init>(Lcom/huawei/qrcode/DownActivity;Lcom/huawei/qrcode/DownActivity$1;)V

    invoke-interface {v0, v1}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity;->downLoadProgressDialog:Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;

    invoke-interface {v0}, Lcom/huawei/qrcode/widgetinterface/dialog/HwDialogInterface;->show()V

    return-void
.end method

.method private showToast(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private startAppDown()V
    .locals 7

    invoke-static {p0}, Lcom/huawei/qrcode/util/Util;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->showDownloadProgressDialog()V

    invoke-static {p0}, Lcom/huawei/qrcode/logic/down/AppDownManager;->getInstance(Landroid/content/Context;)Lcom/huawei/qrcode/logic/down/AppDownManager;

    move-result-object v0

    move-object v1, p0

    iget-object v2, p0, Lcom/huawei/qrcode/DownActivity;->handler:Lcom/huawei/qrcode/DownActivity$LocalHandler;

    iget-object v3, p0, Lcom/huawei/qrcode/DownActivity;->downUrl:Ljava/lang/String;

    iget-object v4, p0, Lcom/huawei/qrcode/DownActivity;->packageName:Ljava/lang/String;

    iget-object v5, p0, Lcom/huawei/qrcode/DownActivity;->hashValue:Ljava/lang/String;

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/qrcode/logic/down/AppDownManager;->startDownLoadApp(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "DownActivity startAppDown no network."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    const-string v0, "scanqrcode_sdk_no_network"

    invoke-static {p0, v0}, Lcom/huawei/qrcode/util/ResourceUtil;->getStringId(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/qrcode/DownActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/qrcode/DownActivity;->showToast(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DownActivity onCreate arg0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->checkOnNewIntent()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "DownActivity onCreate bundle error, finish."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->e(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/huawei/qrcode/DownActivity;->finish()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/huawei/qrcode/DownActivity;->showDownAppRemindDialog()V

    return-void
.end method
