.class public Lo/bvb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:Landroid/app/Dialog;


# direct methods
.method private constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Landroid/app/Dialog;

    sget v1, Lcom/huawei/health/suggestion/R$style;->sugDialogStyle:I

    invoke-direct {v0, p1, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    .line 23
    return-void
.end method

.method public static c(Landroid/app/Activity;)Lo/bvb;
    .locals 1

    .line 26
    new-instance v0, Lo/bvb;

    invoke-direct {v0, p0}, Lo/bvb;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/app/Dialog;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    return-object v0
.end method

.method public a(II)Lo/bvb;
    .locals 4

    .line 76
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 77
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/Button;

    if-eqz v0, :cond_0

    .line 78
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {v0, p2}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    .line 80
    :cond_0
    const-string v0, "HS_DialogHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    :cond_1
    :goto_0
    return-object p0
.end method

.method public b(I)Ljava/lang/String;
    .locals 2

    .line 128
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 129
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/Button;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {v0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 133
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public c()Lo/bvb;
    .locals 1

    .line 110
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 111
    return-object p0
.end method

.method public d()Lo/bvb;
    .locals 1

    .line 105
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 106
    return-object p0
.end method

.method public d(ILandroid/view/View$OnClickListener;)Lo/bvb;
    .locals 2

    .line 47
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 48
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    :cond_0
    return-object p0
.end method

.method public d(ILjava/lang/String;)Lo/bvb;
    .locals 4

    .line 87
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 88
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Landroid/widget/Button;

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {v0, p2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 91
    :cond_0
    const-string v0, "HS_DialogHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not button"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    :cond_1
    :goto_0
    return-object p0
.end method

.method public e(I)Lo/bvb;
    .locals 2

    .line 30
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(I)V

    .line 31
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 32
    return-object p0
.end method

.method public e(ILjava/lang/String;)Lo/bvb;
    .locals 4

    .line 54
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 55
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v0, v0, Lo/efy;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    invoke-virtual {v0, p2}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "HS_DialogHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not textview"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :cond_1
    :goto_0
    return-object p0
.end method

.method public e()Z
    .locals 1

    .line 115
    iget-object v0, p0, Lo/bvb;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    return v0
.end method
