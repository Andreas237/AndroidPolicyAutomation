.class public Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;,
        Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;,
        Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownloadProgressListener;,
        Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;,
        Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;
    }
.end annotation


# static fields
.field public static final APP_ID_PARAM:Ljava/lang/String; = "appId"

.field private static final DOWN_LOAD_URL:Ljava/lang/String; = "http://a.vmall.com/appdl/C27162"

.field private static final PACKAGE_NAME:Ljava/lang/String; = "com.huawei.appmarket"

.field public static final PACKAGE_NAME_PARAM:Ljava/lang/String; = "packageName"


# instance fields
.field private apkFilePath:Ljava/lang/String;

.field private appIdInAppMarket:Ljava/lang/String;

.field private appPkgName:Ljava/lang/String;

.field private cancelDownTipDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

.field private downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

.field private handler:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;

.field private installMarketProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

.field private mContext:Landroid/content/Context;

.field private remindDownMarketDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appPkgName:Ljava/lang/String;

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appIdInAppMarket:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    .line 74
    new-instance v0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->handler:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;

    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->apkFilePath:Ljava/lang/String;

    .line 82
    iput-object p1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    .line 83
    iput-object p2, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appPkgName:Ljava/lang/String;

    .line 84
    iput-object p3, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appIdInAppMarket:Ljava/lang/String;

    .line 85
    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeRemindDownMarketDialog()V

    return-void
.end method

.method static synthetic access$1000(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Landroid/os/Message;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->dealWithMesg(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic access$1100(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->apkFilePath:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->startDownAppMarket()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->handleDownloadNow()V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->createCancelDownDialog()V

    return-void
.end method

.method static synthetic access$800(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeCancelDownDialog()V

    return-void
.end method

.method static synthetic access$900(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)Landroid/content/Context;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method private closeCancelDownDialog()V
    .locals 2

    .line 236
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->cancelDownTipDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->cancelDownTipDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dismiss()V

    .line 239
    :cond_0
    return-void
.end method

.method private closeDownProgressDialog()V
    .locals 2

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->dismiss()V

    .line 208
    :cond_0
    return-void
.end method

.method private closeInstallMarketProgressDialog()V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->installMarketProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 275
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->installMarketProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->dismiss()V

    .line 277
    :cond_0
    return-void
.end method

.method private closeRemindDownMarketDialog()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->remindDownMarketDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->remindDownMarketDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->dismiss()V

    .line 128
    :cond_0
    return-void
.end method

.method private createCancelDownDialog()V
    .locals 7

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_cancel_download:I

    .line 227
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_sure:I

    .line 229
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v2, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v4, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_cancel:I

    .line 230
    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;

    const/4 v2, 0x0

    invoke-direct {v6, p0, v2}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$CancelDownMarketListener;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V

    .line 226
    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;->createAlertDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->cancelDownTipDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->cancelDownTipDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->show()V

    .line 233
    return-void
.end method

.method private createDownloadProgressDialog()V
    .locals 3

    .line 199
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    new-instance v1, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownloadProgressListener;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownloadProgressListener;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;->createProgressBarDialog(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->show()V

    .line 202
    return-void
.end method

.method private createInstallMarketProgressDialog()V
    .locals 2

    .line 268
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->hwpay_installing:I

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;->createProgressDialog(Landroid/content/Context;I)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->installMarketProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

    .line 270
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->installMarketProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->show()V

    .line 271
    return-void
.end method

.method private createRemindDownMarketDialog()V
    .locals 7

    .line 116
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->reminder_down_market_description:I

    .line 117
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v3, Lcom/huawei/wallet/R$string;->down_btn:I

    .line 118
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v4, Lcom/huawei/wallet/R$string;->cancel:I

    .line 119
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;

    const/4 v1, 0x0

    invoke-direct {v6, p0, v1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$RemindDownMarketListener;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V

    .line 116
    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v6}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;->createAlertDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogListener;)Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->remindDownMarketDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->remindDownMarketDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomAlertDialog;->show()V

    .line 122
    return-void
.end method

.method private dealDownSuccessMsg(Landroid/os/Message;)V
    .locals 6

    .line 385
    const/4 v5, 0x0

    .line 386
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 388
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/wallet/logic/down/AppBean;

    .line 390
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 392
    invoke-virtual {v5}, Lcom/huawei/wallet/logic/down/AppBean;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->apkFilePath:Ljava/lang/String;

    .line 393
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->handler:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;

    .line 395
    invoke-virtual {v5}, Lcom/huawei/wallet/logic/down/AppBean;->c()Ljava/lang/String;

    move-result-object v3

    .line 396
    invoke-virtual {v5}, Lcom/huawei/wallet/logic/down/AppBean;->d()Ljava/lang/String;

    move-result-object v4

    .line 393
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 400
    :cond_1
    const-string v0, "AppOpenOrDownHelper dealDownSuccessMsg appBeans is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 402
    :goto_0
    return-void
.end method

.method private dealWithMesg(Landroid/os/Message;)V
    .locals 3

    .line 320
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 324
    :sswitch_0
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->updateProgress(I)V

    .line 326
    goto/16 :goto_0

    .line 330
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 331
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->downProgressDialog:Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->udpateView(Ljava/lang/String;)V

    .line 332
    goto :goto_0

    .line 335
    :sswitch_2
    const-string v0, "AppOpenOrDownHelper down success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 336
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeRemindDownMarketDialog()V

    .line 337
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeDownProgressDialog()V

    .line 338
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeCancelDownDialog()V

    .line 339
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->dealDownSuccessMsg(Landroid/os/Message;)V

    .line 340
    goto :goto_0

    .line 343
    :sswitch_3
    const-string v0, "AppOpenOrDownHelper down fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 344
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeRemindDownMarketDialog()V

    .line 345
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeDownProgressDialog()V

    .line 346
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeCancelDownDialog()V

    .line 347
    goto :goto_0

    .line 350
    :sswitch_4
    const-string v0, "AppOpenOrDownHelper install silence."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 351
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->createInstallMarketProgressDialog()V

    .line 352
    goto :goto_0

    .line 355
    :sswitch_5
    const-string v0, "AppOpenOrDownHelper install silence success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 356
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeInstallMarketProgressDialog()V

    .line 357
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->deleteDownFile()V

    .line 358
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->jumpToAppMarketDetail()V

    .line 359
    goto :goto_0

    .line 362
    :sswitch_6
    const-string v0, "AppOpenOrDownHelper install silence fail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 363
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->closeInstallMarketProgressDialog()V

    .line 364
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->deleteDownFile()V

    .line 365
    goto :goto_0

    .line 368
    :sswitch_7
    const-string v0, "AppOpenOrDownHelper install normal success."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 369
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->jumpToAppMarketDetail()V

    .line 370
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->deleteDownFile()V

    .line 371
    .line 376
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7d1 -> :sswitch_6
        0x1 -> :sswitch_5
        0x14d -> :sswitch_7
        0x3e9 -> :sswitch_3
        0x3ea -> :sswitch_0
        0x3ed -> :sswitch_4
        0x3ef -> :sswitch_1
        0x3f1 -> :sswitch_2
    .end sparse-switch
.end method

.method private deleteDownFile()V
    .locals 1

    .line 405
    new-instance v0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V

    .line 418
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 419
    return-void
.end method

.method private handleDownloadNow()V
    .locals 10

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->createDownloadProgressDialog()V

    .line 184
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->handler:Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;

    const-string v3, "http://a.vmall.com/appdl/C27162"

    const-string v4, "com.huawei.appmarket"

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    invoke-virtual/range {v0 .. v9}, Lcom/huawei/wallet/logic/down/AppDownManager;->e(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    goto :goto_0

    .line 189
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    sget v1, Lcom/huawei/wallet/R$string;->no_network:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 191
    :goto_0
    return-void
.end method

.method private jumpToAppMarketDetail()V
    .locals 2

    .line 280
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appIdInAppMarket:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    const-string v0, "AppOpenOrDownHelper JumpHwMarketDetail appIdInAppMarket is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 284
    return-void

    .line 286
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appIdInAppMarket:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/down/AppDownManager;->e(Ljava/lang/String;)V

    .line 287
    return-void
.end method

.method private startDownAppMarket()V
    .locals 5

    .line 150
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dsx;->d(Landroid/content/Context;)V

    .line 151
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$MyPermissionsResultsCallback;-><init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$1;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lo/dsx;->c(Lo/dsx$a;[Ljava/lang/String;)V

    .line 153
    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->a()V

    .line 292
    return-void
.end method

.method public startOpenOrDown()V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appPkgName:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dtc;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appPkgName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    goto :goto_0

    .line 95
    :catch_0
    move-exception v3

    .line 97
    const-string v0, "starting BankApp occurs ActivityNotFoundException."

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 100
    :goto_0
    goto :goto_1

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->b()Z

    move-result v2

    .line 102
    if-eqz v2, :cond_1

    .line 103
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/logic/down/AppDownManager;->d(Landroid/content/Context;)Lcom/huawei/wallet/logic/down/AppDownManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->appIdInAppMarket:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/logic/down/AppDownManager;->e(Ljava/lang/String;)V

    goto :goto_1

    .line 105
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->createRemindDownMarketDialog()V

    .line 108
    :goto_1
    return-void
.end method
