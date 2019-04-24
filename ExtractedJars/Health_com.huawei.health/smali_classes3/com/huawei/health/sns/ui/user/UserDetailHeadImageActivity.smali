.class public Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;
.super Lcom/huawei/health/sns/ui/base/SNSBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$b;
    }
.end annotation


# instance fields
.field private g:Landroid/widget/ImageView;

.field private h:Landroid/os/Handler;

.field private k:Lcom/huawei/health/sns/model/user/User;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;-><init>()V

    .line 50
    new-instance v0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$b;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->h:Landroid/os/Handler;

    return-void
.end method

.method private a()V
    .locals 1

    .line 163
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 165
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)Lcom/huawei/health/sns/model/user/User;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->sns_cloudsetting_default_head_img:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    goto :goto_0

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    .line 152
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v5

    .line 151
    invoke-static/range {v0 .. v5}, Lo/bbn;->a(JLandroid/widget/ImageView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 156
    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)Landroid/os/Handler;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->h:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 3

    .line 122
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    .line 123
    if-eqz v1, :cond_1

    .line 125
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    .line 126
    if-nez v2, :cond_0

    .line 128
    return-void

    .line 130
    :cond_0
    const-string v0, "bundleKeyUser"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 132
    const-string v0, "bundleKeyUser"

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/user/User;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->k:Lcom/huawei/health/sns/model/user/User;

    .line 135
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->g:Landroid/widget/ImageView;

    new-instance v1, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$1;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 180
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 96
    sget v0, Lcom/huawei/android/sns/R$color;->sns_image_detail_bg:I

    iput v0, p0, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->b:I

    .line 97
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->requestWindowFeature(I)Z

    .line 100
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    const/16 v2, 0x400

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 103
    invoke-static {}, Lo/bom;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x8000000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 108
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_user_detail_head_image_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->setContentView(I)V

    .line 110
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->c()V

    .line 112
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->a()V

    .line 113
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->b()V

    .line 114
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;->e()V

    .line 115
    return-void
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 186
    sget v0, Lcom/huawei/android/sns/R$array;->head_image_save_item:I

    new-instance v1, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity$4;-><init>(Lcom/huawei/health/sns/ui/user/UserDetailHeadImageActivity;)V

    invoke-static {p0, v0, v1}, Lo/boj;->e(Landroid/app/Activity;ILo/boj$a;)V

    .line 196
    const/4 v0, 0x0

    return v0
.end method
