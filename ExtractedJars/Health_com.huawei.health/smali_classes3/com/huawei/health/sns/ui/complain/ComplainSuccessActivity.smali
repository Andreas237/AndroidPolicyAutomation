.class public Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"


# instance fields
.field private f:Landroid/view/View;

.field private k:Lo/egd;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    return-void
.end method

.method private a()V
    .locals 8

    .line 74
    invoke-static {p0}, Lo/boi;->d(Landroid/app/Activity;)I

    move-result v5

    .line 75
    invoke-static {p0}, Lo/bmo;->b(Landroid/content/Context;)I

    move-result v6

    .line 76
    int-to-double v0, v5

    const-wide v2, 0x3fd3333333333333L    # 0.3

    mul-double/2addr v0, v2

    double-to-int v7, v0

    .line 77
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->f:Landroid/view/View;

    sub-int v1, v7, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Lo/boi;->d(Landroid/view/View;IIII)V

    .line 78
    return-void
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 66
    sget v0, Lcom/huawei/android/sns/R$id;->content_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->d:Landroid/view/View;

    .line 67
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->a()V

    .line 84
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->k:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 85
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 86
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 36
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 38
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->getActionBar()Landroid/app/ActionBar;

    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    invoke-static {}, Lo/brg;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 44
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_activity_complain_success:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->setContentView(I)V

    .line 45
    sget v0, Lcom/huawei/android/sns/R$id;->close_button:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->k:Lo/egd;

    .line 46
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->k:Lo/egd;

    new-instance v1, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity$4;-><init>(Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->k:Lo/egd;

    invoke-static {p0, v0}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 57
    sget v0, Lcom/huawei/android/sns/R$id;->layout_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->f:Landroid/view/View;

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/complain/ComplainSuccessActivity;->a()V

    .line 61
    return-void
.end method
