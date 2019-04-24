.class public Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$e;,
        Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$d;,
        Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$c;,
        Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$a;
    }
.end annotation


# instance fields
.field private a:Lo/emr;

.field private b:Landroid/widget/Button;

.field private c:Landroid/widget/Button;

.field private d:Landroid/widget/LinearLayout;

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/content/Context;

.field private g:Ljava/lang/Runnable;

.field private h:I

.field private i:Landroid/webkit/WebView;

.field private k:Landroid/os/Handler;

.field private m:Landroid/graphics/drawable/AnimationDrawable;

.field private n:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->e:Landroid/widget/LinearLayout;

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d:Landroid/widget/LinearLayout;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->c:Landroid/widget/Button;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b:Landroid/widget/Button;

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i:Landroid/webkit/WebView;

    .line 46
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->h:I

    .line 48
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$e;-><init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->k:Landroid/os/Handler;

    .line 51
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$a;-><init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->g:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/os/Handler;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->k:Landroid/os/Handler;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 103
    sget v0, Lcom/huawei/ui/main/R$id;->layout_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->e:Landroid/widget/LinearLayout;

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->e:Landroid/widget/LinearLayout;

    sget v1, Lcom/huawei/ui/main/R$id;->info_loading:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->n:Landroid/widget/ImageView;

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->n:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/AnimationDrawable;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 108
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i:Landroid/webkit/WebView;

    return-object v0
.end method

.method private b()V
    .locals 5

    .line 112
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    sget v0, Lcom/huawei/ui/main/R$id;->about_service_item_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->a:Lo/emr;

    .line 115
    sget v0, Lcom/huawei/ui/main/R$id;->layout_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d:Landroid/widget/LinearLayout;

    .line 117
    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 118
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 119
    const-string v0, "policytype"

    const/4 v1, 0x2

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->h:I

    .line 121
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->layout_retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d:Landroid/widget/LinearLayout;

    .line 123
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 124
    sget v0, Lcom/huawei/ui/main/R$id;->webview:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i:Landroid/webkit/WebView;

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i:Landroid/webkit/WebView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 126
    sget v0, Lcom/huawei/ui/main/R$id;->retry:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->c:Landroid/widget/Button;

    .line 127
    sget v0, Lcom/huawei/ui/main/R$id;->ok_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b:Landroid/widget/Button;

    .line 129
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->h:I

    if-nez v0, :cond_1

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->a:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_setting_about_service_item:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_0

    .line 132
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->a:Lo/emr;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_privacy:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 134
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->k:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 135
    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/Button;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->c:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->h:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/Button;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b:Landroid/widget/Button;

    return-object v0
.end method

.method static synthetic f(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->e:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/graphics/drawable/AnimationDrawable;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->m:Landroid/graphics/drawable/AnimationDrawable;

    return-object v0
.end method

.method static synthetic i(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d:Landroid/widget/LinearLayout;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 58
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 59
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_settings_about_privacy:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->setContentView(I)V

    .line 60
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->f:Landroid/content/Context;

    .line 61
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b()V

    .line 63
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->a()V

    .line 64
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 83
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 84
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return-void
.end method

.method public onPause()V
    .locals 4

    .line 98
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onPause()V

    .line 99
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    return-void
.end method

.method protected onRestart()V
    .locals 4

    .line 90
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onRestart()V

    .line 91
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void
.end method

.method public onResume()V
    .locals 4

    .line 76
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 77
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    return-void
.end method

.method public onStart()V
    .locals 4

    .line 69
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onStart()V

    .line 70
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onStart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    return-void
.end method
