.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/RelativeLayout;

.field private d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Landroid/widget/ImageView;)V
    .locals 5

    .line 92
    const-string v0, "HealthDataBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initBackPressView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_health_rtl_back_black:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$drawable;->health_navbar_back_selector:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    .line 100
    :goto_0
    if-eqz p1, :cond_1

    .line 101
    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    :cond_1
    return-void
.end method

.method protected e()V
    .locals 7

    .line 66
    const-string v0, "HealthDataBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initTitleBarView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->statusbar_panel:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v4

    .line 71
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    invoke-static {v0}, Lo/ene;->b(Landroid/content/Context;)I

    move-result v5

    .line 72
    new-instance v6, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {v6, v0, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 73
    invoke-virtual {v4, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->btn_left_layout:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->b:Landroid/widget/RelativeLayout;

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    sget v1, Lcom/huawei/ui/main/R$id;->btn_left:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->a:Landroid/widget/ImageView;

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->a(Landroid/widget/ImageView;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->b:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity$4;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    :cond_0
    return-void
.end method

.method protected e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 57
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->c()Lo/acu;

    move-result-object v0

    if-nez v0, :cond_0

    .line 58
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, p1}, Lo/act;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 60
    :cond_0
    const-string v0, ""

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 62
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 52
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 53
    iput-object p0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDataBaseActivity;

    .line 54
    return-void
.end method
