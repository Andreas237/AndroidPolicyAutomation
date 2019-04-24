.class public Lcom/huawei/pay/ui/widget/DownloadProgressDialog;
.super Landroid/app/AlertDialog;
.source "SourceFile"


# instance fields
.field private file_isdowning_size:Landroid/widget/TextView;

.field private progressBar:Landroid/widget/ProgressBar;

.field private progressNum:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 42
    invoke-direct {p0, p1}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;)V

    .line 43
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 44
    sget v0, Lcom/huawei/paycommonbase/R$layout;->dialog_download_progress_bank:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 45
    sget v0, Lcom/huawei/paycommonbase/R$id;->AppUpdateDialog_progressbar:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressBar:Landroid/widget/ProgressBar;

    .line 46
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 47
    sget v0, Lcom/huawei/paycommonbase/R$id;->file_isdowning_size:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->file_isdowning_size:Landroid/widget/TextView;

    .line 48
    sget v0, Lcom/huawei/paycommonbase/R$id;->AppUpdateDialog_progress:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressNum:Landroid/widget/TextView;

    .line 49
    invoke-static {p1, p0, v3}, Lcom/huawei/pay/ui/util/UiUtil;->setDialogView(Landroid/content/Context;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    .line 54
    invoke-direct {p0, p1, p2}, Landroid/app/AlertDialog;-><init>(Landroid/content/Context;I)V

    .line 55
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 56
    sget v0, Lcom/huawei/paycommonbase/R$layout;->dialog_download_progress_bank:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 57
    sget v0, Lcom/huawei/paycommonbase/R$id;->AppUpdateDialog_progressbar:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressBar:Landroid/widget/ProgressBar;

    .line 58
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 59
    sget v0, Lcom/huawei/paycommonbase/R$id;->file_isdowning_size:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->file_isdowning_size:Landroid/widget/TextView;

    .line 60
    sget v0, Lcom/huawei/paycommonbase/R$id;->AppUpdateDialog_progress:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressNum:Landroid/widget/TextView;

    .line 61
    invoke-static {p1, p0, v3}, Lcom/huawei/pay/ui/util/UiUtil;->setDialogView(Landroid/content/Context;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 62
    return-void
.end method

.method private showBottom(Lcom/huawei/pay/ui/widget/DownloadProgressDialog;)Landroid/view/WindowManager$LayoutParams;
    .locals 7

    .line 73
    invoke-virtual {p1}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 74
    const/16 v0, 0x50

    invoke-virtual {v5, v0}, Landroid/view/Window;->setGravity(I)V

    .line 75
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 76
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v6

    .line 77
    const/4 v0, -0x1

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 78
    const/4 v0, -0x2

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 79
    return-object v6
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 68
    invoke-super {p0, p1}, Landroid/app/AlertDialog;->onCreate(Landroid/os/Bundle;)V

    .line 69
    invoke-direct {p0, p0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->showBottom(Lcom/huawei/pay/ui/widget/DownloadProgressDialog;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    .line 70
    return-void
.end method

.method public updateProgress(ILjava/lang/String;)V
    .locals 4

    .line 84
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 85
    invoke-virtual {p0}, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 86
    if-eqz v3, :cond_0

    .line 88
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->progressNum:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/huawei/pay/ui/widget/DownloadProgressDialog;->file_isdowning_size:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 91
    return-void
.end method
