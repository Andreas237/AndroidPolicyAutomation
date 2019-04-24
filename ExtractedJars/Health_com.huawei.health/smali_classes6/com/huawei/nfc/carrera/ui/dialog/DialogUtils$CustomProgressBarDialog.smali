.class public Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CustomProgressBarDialog"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;
    }
.end annotation


# instance fields
.field private downLoadProgressSize:Landroid/widget/TextView;

.field private downLoadProgressText:Landroid/widget/TextView;

.field private downLoadProgressbar:Landroid/widget/ProgressBar;

.field private mContext:Landroid/content/Context;

.field private progressBarDialog:Lo/yr;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;)V
    .locals 7

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    invoke-static {p1}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    .line 250
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->mContext:Landroid/content/Context;

    .line 251
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$layout;->file_download_progress_dialog:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 252
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    instance-of v0, v0, Lo/ys;

    if-eqz v0, :cond_0

    .line 254
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    check-cast v0, Lo/ys;

    invoke-virtual {v0}, Lo/ys;->a()Landroid/view/View;

    move-result-object v6

    .line 255
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {v6}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v6, v0, v2, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    invoke-interface {v0, v5}, Lo/yr;->d(Landroid/view/View;)Lo/yr;

    .line 258
    sget v0, Lcom/huawei/wallet/R$id;->download_progress_ps:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressbar:Landroid/widget/ProgressBar;

    .line 259
    sget v0, Lcom/huawei/wallet/R$id;->download_progress_text_tv:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressText:Landroid/widget/TextView;

    .line 260
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressText:Landroid/widget/TextView;

    sget v1, Lcom/huawei/wallet/R$string;->download_progress1:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "0%"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 261
    sget v0, Lcom/huawei/wallet/R$id;->file_isdowning_size_tv:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressSize:Landroid/widget/TextView;

    .line 262
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yr;->setCanceledOnTouchOutside(Z)V

    .line 263
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yr;->setCancelable(Z)V

    .line 264
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog$MyOnKeyListener;-><init>(Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V

    invoke-interface {v0, v1}, Lo/yr;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 265
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$1;)V
    .locals 0

    .line 222
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$OnDialogKeyBackListener;)V

    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    .line 328
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 330
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->dismiss()V

    .line 332
    :cond_0
    return-void
.end method

.method public getDialogObject()Lo/yr;
    .locals 1

    .line 302
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    return-object v0
.end method

.method public show()V
    .locals 3

    .line 307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 309
    return-void

    .line 311
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    return-void

    .line 317
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->progressBarDialog:Lo/yr;

    invoke-interface {v0}, Lo/yr;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 322
    goto :goto_0

    .line 319
    :catch_0
    move-exception v2

    .line 321
    const-string v0, "show CustomProgressBarDialog failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 324
    :goto_0
    return-void
.end method

.method public udpateView(Ljava/lang/String;)V
    .locals 1

    .line 297
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressSize:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    return-void
.end method

.method public updateProgress(I)V
    .locals 6

    .line 291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressbar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 292
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->downLoadProgressText:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/dialog/DialogUtils$CustomProgressBarDialog;->mContext:Landroid/content/Context;

    sget v2, Lcom/huawei/wallet/R$string;->download_progress1:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "%"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 293
    return-void
.end method
