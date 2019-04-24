.class public Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;
.super Landroid/support/v4/app/FragmentActivity;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;
.implements Lcom/huawei/pay/ui/PayAlertDialogFragment$AlertDialogListener;
.implements Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;
.implements Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;


# static fields
.field private static final REMINDER_DIALOG:I = 0x12d


# instance fields
.field private downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

.field private mSureDialog:Lo/egv;

.field private progress:Lo/egn;

.field private reminderDialog:Lcom/huawei/pay/ui/PayAlertDialogFragment;

.field private savePath:Ljava/lang/String;

.field private signature:Ljava/lang/String;

.field private totalSize:Ljava/lang/String;

.field private unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->startProgress(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)Lo/egv;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Lo/egv;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->startAppDownOrInstall(Lo/egv;)V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Landroid/content/DialogInterface;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downOrInstallApp(Landroid/content/DialogInterface;)V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->createCancelDialog()V

    return-void
.end method

.method private createCancelDialog()V
    .locals 6

    .line 320
    sget v0, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 321
    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_cancel_download:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_sure:I

    .line 322
    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    sget v0, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 320
    const/16 v0, 0x12d

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->newInstance(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/huawei/pay/ui/PayAlertDialogFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->reminderDialog:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->reminderDialog:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showFragmentTransactionDialogs(Landroid/support/v4/app/DialogFragment;)V

    .line 326
    return-void
.end method

.method private downOrInstallApp(Landroid/content/DialogInterface;)V
    .locals 2

    .line 186
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getAPKPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 190
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->installApk()V

    goto :goto_0

    .line 195
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ecz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadAPP(Landroid/content/DialogInterface;)V

    goto :goto_0

    .line 201
    :cond_1
    sget v0, Lcom/huawei/wallet/R$string;->no_network:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 202
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 203
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 206
    :goto_0
    return-void
.end method

.method private downloadAPP(Landroid/content/DialogInterface;)V
    .locals 3

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->cleanTemp()V

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getLocalSavePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->savePath:Ljava/lang/String;

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->url:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->savePath:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->download(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 228
    return-void
.end method

.method private downloadDismiss()V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->dismiss()V

    .line 278
    :cond_0
    return-void
.end method

.method private getUnionPayData()V
    .locals 1

    .line 98
    new-instance v0, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0, p0, p0, p0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->registerListeners(Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInstallCallBack;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/UnionpayInfoCallback;Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/listener/DownLoadCallback;)V

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->getUnionpayAPKInfo()V

    .line 103
    return-void
.end method

.method private hidePromptDialog()V
    .locals 2

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->reminderDialog:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->reminderDialog:Lcom/huawei/pay/ui/PayAlertDialogFragment;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/PayAlertDialogFragment;->dismiss()V

    .line 334
    :cond_0
    return-void
.end method

.method private installApk()V
    .locals 2

    .line 300
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->signature:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->install(Ljava/lang/String;)V

    .line 304
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->isAppHasInstallPermission()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 306
    sget v0, Lcom/huawei/wallet/R$string;->nfc_relativite_apk_install_tip:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->startProgress(Ljava/lang/String;)V

    goto :goto_0

    .line 310
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 312
    :goto_0
    return-void
.end method

.method private loadApplicationTheme()V
    .locals 6

    .line 523
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 524
    if-nez v4, :cond_0

    .line 525
    const-string v0, "loadApplicationTheme() if (theme == null)"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 526
    return-void

    .line 529
    :cond_0
    const/4 v5, 0x0

    .line 531
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_1

    .line 532
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "HealthTheme"

    const-string v2, "style"

    const-string v3, "com.huawei.health"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    goto :goto_0

    .line 534
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "WearTheme"

    const-string v2, "style"

    const-string v3, "com.huawei.bone"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    .line 556
    :goto_0
    if-nez v5, :cond_2

    .line 557
    const-string v0, "onCreate if (themeId == 0)"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    goto :goto_1

    .line 559
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCreate if (themeId == 0) ELSE themeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;Z)V

    .line 561
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->setTheme(I)V

    .line 564
    :goto_1
    return-void
.end method

.method private showDialog()V
    .locals 4

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    if-nez v0, :cond_0

    .line 108
    new-instance v0, Lo/egv$b;

    invoke-direct {v0, p0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    sget v1, Lcom/huawei/wallet/R$string;->nfc_card_list_dialog_title:I

    .line 109
    invoke-virtual {v0, v1}, Lo/egv$b;->b(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->nfc_relativite_apk_download_tip:I

    .line 110
    invoke-virtual {v0, v1}, Lo/egv$b;->e(I)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_cancel:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$2;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V

    .line 111
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$string;->huaweipay_hcoin_use_flow_sure:I

    new-instance v2, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$1;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V

    .line 118
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    move-result-object v3

    .line 125
    invoke-virtual {v3}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 129
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 132
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->mSureDialog:Lo/egv;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$3;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V

    invoke-virtual {v0, v1}, Lo/egv;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 142
    return-void
.end method

.method private showDownloadProgress(ILjava/lang/String;)V
    .locals 2

    .line 237
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    return-void

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    if-nez v0, :cond_1

    .line 244
    new-instance v0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    sget v1, Lcom/huawei/wallet/R$style;->common_dialog21:I

    invoke-direct {v0, p0, v1}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    .line 247
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->isShowing()Z

    move-result v0

    if-nez v0, :cond_2

    .line 249
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->setCanceledOnTouchOutside(Z)V

    .line 250
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->setCancelable(Z)V

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    invoke-virtual {v0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->show()V

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$5;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;)V

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 266
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDialog:Lcom/huawei/pay/ui/widget/DownloadProgressDialog;

    invoke-virtual {v0, p1, p2}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->updateProgress(ILjava/lang/String;)V

    .line 267
    return-void
.end method

.method private startAppDownOrInstall(Lo/egv;)V
    .locals 5

    .line 152
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dsx;->d(Landroid/content/Context;)V

    .line 153
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    new-instance v1, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity$4;-><init>(Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;Lo/egv;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, p0, v2}, Lo/dsx;->e(Lo/dsx$a;Landroid/app/Activity;[Ljava/lang/String;)V

    .line 176
    return-void
.end method

.method private startProgress(Ljava/lang/String;)V
    .locals 2

    .line 285
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 286
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    .line 287
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0, p1}, Lo/egn;->e(Ljava/lang/String;)V

    .line 288
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->a()V

    .line 290
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->show()V

    .line 293
    :cond_1
    return-void
.end method


# virtual methods
.method public downLoadConnected(J)V
    .locals 4

    .line 472
    invoke-static {p0, p1, p2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->totalSize:Ljava/lang/String;

    .line 473
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide/16 v1, 0x0

    invoke-static {p0, v1, v2}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->totalSize:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 474
    const/4 v0, 0x0

    invoke-direct {p0, v0, v3}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showDownloadProgress(ILjava/lang/String;)V

    .line 475
    return-void
.end method

.method public downLoadFailed(I)V
    .locals 1

    .line 445
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 447
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 449
    :cond_0
    const/4 v0, 0x5

    if-ne p1, v0, :cond_1

    .line 451
    sget v0, Lcom/huawei/wallet/R$string;->nfc_relativite_apk_download_cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 455
    :cond_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_relativite_apk_download_fail:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;)V

    .line 457
    :goto_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDismiss()V

    .line 458
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 460
    return-void
.end method

.method public downLoadSuccess(Ljava/lang/String;)V
    .locals 0

    .line 438
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->downloadDismiss()V

    .line 439
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->installApk()V

    .line 440
    return-void
.end method

.method public downProgress(IJ)V
    .locals 3

    .line 465
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0, p2, p3}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->totalSize:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 466
    invoke-direct {p0, p1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showDownloadProgress(ILjava/lang/String;)V

    .line 467
    return-void
.end method

.method public failed(ILjava/lang/String;)V
    .locals 2

    .line 376
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 378
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 379
    sget v0, Lcom/huawei/wallet/R$string;->no_network:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;Ljava/lang/String;)V

    .line 381
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 382
    return-void
.end method

.method protected initSystemBar()V
    .locals 3

    .line 491
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 493
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 494
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 495
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_0

    .line 497
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    const/high16 v2, 0x4000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 502
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 506
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->d:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    if-ne v0, v1, :cond_4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_4

    .line 508
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_2

    .line 509
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 511
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_3

    .line 512
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 514
    :cond_3
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 517
    :cond_4
    return-void
.end method

.method public installFailed(ILjava/lang/String;)V
    .locals 2

    .line 426
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 428
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 429
    sget v0, Lcom/huawei/wallet/R$string;->nfc_relativite_apk_install_failed:I

    invoke-static {p0, v0}, Lcom/huawei/pay/ui/util/ToastManager;->show(Landroid/content/Context;I)V

    .line 431
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->delete()Z

    .line 432
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 433
    return-void
.end method

.method public installSuccess()V
    .locals 2

    .line 414
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 418
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->delete()Z

    .line 419
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->setResult(I)V

    .line 420
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 421
    return-void
.end method

.method public onAlertDialogKeyBack(I)V
    .locals 1

    .line 405
    const/16 v0, 0x12d

    if-ne v0, p1, :cond_0

    .line 407
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->hidePromptDialog()V

    .line 409
    :cond_0
    return-void
.end method

.method public onAlertDialogNegativeClick(I)V
    .locals 1

    .line 396
    const/16 v0, 0x12d

    if-ne v0, p1, :cond_0

    .line 398
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->hidePromptDialog()V

    .line 400
    :cond_0
    return-void
.end method

.method public onAlertDialogPositiveClick(I)V
    .locals 1

    .line 387
    const/16 v0, 0x12d

    if-ne v0, p1, :cond_0

    .line 389
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->cancelDown()V

    .line 391
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 79
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->setRequestedOrientation(I)V

    .line 81
    sget v0, Lcom/huawei/wallet/R$layout;->nfc_download_dialog:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->setContentView(I)V

    .line 85
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->loadApplicationTheme()V

    .line 86
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->initSystemBar()V

    .line 89
    sget v0, Lcom/huawei/wallet/R$string;->nfc_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->startProgress(Ljava/lang/String;)V

    .line 92
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getUnionPayData()V

    .line 93
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 480
    invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V

    .line 481
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    if-eqz v0, :cond_0

    .line 483
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->unComponent:Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/filedownload/unionpay/UnionpayComponent;->unregisterListeners()V

    .line 485
    :cond_0
    return-void
.end method

.method public showFragmentTransactionDialogs(Landroid/support/v4/app/DialogFragment;)V
    .locals 3

    .line 343
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 345
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v2

    .line 346
    const-string v0, "alertdialog"

    invoke-virtual {v2, p1, v0}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 347
    invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 353
    :cond_0
    goto :goto_0

    .line 350
    :catch_0
    move-exception v2

    .line 352
    const-string v0, "IllegalStateException"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 354
    :goto_0
    return-void
.end method

.method public success(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 360
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 362
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->url:Ljava/lang/String;

    .line 363
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->signature:Ljava/lang/String;

    .line 364
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->progress:Lo/egn;

    invoke-virtual {v0}, Lo/egn;->dismiss()V

    .line 365
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->showDialog()V

    goto :goto_0

    .line 369
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bindcard/DownLoadDialogActivity;->finish()V

    .line 371
    :goto_0
    return-void
.end method
