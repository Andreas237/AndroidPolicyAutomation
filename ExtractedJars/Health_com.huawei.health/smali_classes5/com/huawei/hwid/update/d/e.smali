.class public Lcom/huawei/hwid/update/d/e;
.super Lcom/huawei/hwid/update/d/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwid/update/d/e$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/ProgressBar;

.field private b:Landroid/widget/TextView;

.field private c:I

.field private d:Landroid/content/DialogInterface$OnKeyListener;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 22
    invoke-direct {p0}, Lcom/huawei/hwid/update/d/b;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwid/update/d/e;->c:I

    .line 87
    new-instance v0, Lcom/huawei/hwid/update/d/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/hwid/update/d/e$a;-><init>(Lcom/huawei/hwid/update/d/e$1;)V

    iput-object v0, p0, Lcom/huawei/hwid/update/d/e;->d:Landroid/content/DialogInterface$OnKeyListener;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/AlertDialog;
    .locals 5

    .line 42
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->g()I

    move-result v1

    invoke-direct {v3, v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 44
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->f()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->f()Landroid/app/Activity;

    move-result-object v1

    const-string v2, "cs_download_progress"

    invoke-static {v1, v2}, Lcom/huawei/hwid/core/d/i;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 45
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 47
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 48
    iget-object v0, p0, Lcom/huawei/hwid/update/d/e;->d:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v3, v0}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    .line 50
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->f()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "download_info_progress"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/hwid/update/d/e;->a:Landroid/widget/ProgressBar;

    .line 51
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->f()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "hms_progress_text"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/hwid/update/d/e;->b:Landroid/widget/TextView;

    .line 53
    iget v0, p0, Lcom/huawei/hwid/update/d/e;->c:I

    invoke-virtual {p0, v0}, Lcom/huawei/hwid/update/d/e;->b(I)V

    .line 54
    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/huawei/hwid/update/d/e;->c:I

    .line 59
    return-void
.end method

.method b(I)V
    .locals 5

    .line 66
    invoke-virtual {p0}, Lcom/huawei/hwid/update/d/e;->f()Landroid/app/Activity;

    move-result-object v2

    .line 67
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    :cond_0
    const-string v0, "DownloadProgress"

    const-string v1, "In setDownloading, The activity is null or finishing."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    return-void

    .line 72
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwid/update/d/e;->b:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/hwid/update/d/e;->a:Landroid/widget/ProgressBar;

    if-nez v0, :cond_3

    .line 73
    :cond_2
    return-void

    .line 76
    :cond_3
    iget-object v0, p0, Lcom/huawei/hwid/update/d/e;->a:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 78
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v3

    .line 79
    int-to-float v0, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-virtual {v3, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    .line 81
    iget-object v0, p0, Lcom/huawei/hwid/update/d/e;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    return-void
.end method
