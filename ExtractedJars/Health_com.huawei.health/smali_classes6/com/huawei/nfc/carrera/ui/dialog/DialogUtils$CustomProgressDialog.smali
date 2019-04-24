.class public Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CustomProgressDialog"
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private progressDialog:Lo/yw;


# direct methods
.method private constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 348
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 349
    invoke-static {p1}, Lo/yk;->c(Landroid/content/Context;)Lo/yw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    .line 350
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->mContext:Landroid/content/Context;

    .line 351
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->hwpay_installing:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/yw;->a(Ljava/lang/CharSequence;)V

    .line 352
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yw;->setCanceledOnTouchOutside(Z)V

    .line 353
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yw;->setCancelable(Z)V

    .line 354
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V
    .locals 0

    .line 341
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 379
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 381
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->dismiss()V

    .line 383
    :cond_0
    return-void
.end method

.method public show()V
    .locals 3

    .line 358
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 360
    return-void

    .line 362
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 364
    return-void

    .line 368
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressDialog;->progressDialog:Lo/yw;

    invoke-interface {v0}, Lo/yw;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 373
    goto :goto_0

    .line 370
    :catch_0
    move-exception v2

    .line 372
    const-string v0, "show CustomProgressDialog failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 375
    :goto_0
    return-void
.end method
