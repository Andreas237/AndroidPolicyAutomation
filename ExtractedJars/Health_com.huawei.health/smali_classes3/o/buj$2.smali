.class Lo/buj$2;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/buj;->d(Ljava/util/List;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/buj;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/buj;Ljava/util/List;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/buj$2;->b:Lo/buj;

    iput-object p2, p0, Lo/buj$2;->d:Ljava/util/List;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/OperationPage;)I
    .locals 1

    .line 147
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireEmui90ImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 148
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_layout_social_cardview_9_0:I

    return v0

    .line 150
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_layout_social_cardview:I

    return v0
.end method

.method private b(Lcom/huawei/health/suggestion/model/OperationPage;Landroid/view/View;)V
    .locals 3

    .line 101
    sget v0, Lcom/huawei/health/suggestion/R$id;->card_image:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    .line 102
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 103
    new-instance v0, Lo/buj$2$1;

    invoke-direct {v0, p0, p1}, Lo/buj$2$1;-><init>(Lo/buj$2;Lcom/huawei/health/suggestion/model/OperationPage;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    invoke-direct {p0, p1}, Lo/buj$2;->d(Lcom/huawei/health/suggestion/model/OperationPage;)Ljava/lang/String;

    move-result-object v2

    .line 114
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->sug_bg_trining_defuct:I

    invoke-static {v2, v1, v0}, Lo/cam;->b(Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 115
    return-void
.end method

.method private b(Lcom/huawei/health/suggestion/model/OperationPage;Lo/efy;)V
    .locals 2

    .line 134
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->bg_banner_label_rlt:I

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/efy;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 137
    :cond_0
    iget-object v0, p0, Lo/buj$2;->b:Lo/buj;

    invoke-static {v0, p1}, Lo/buj;->b(Lo/buj;Lcom/huawei/health/suggestion/model/OperationPage;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 139
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquirePictureUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lo/efy;->setVisibility(I)V

    goto :goto_0

    .line 142
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Lo/efy;->setVisibility(I)V

    .line 144
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/OperationPage;)Ljava/lang/String;
    .locals 2

    .line 118
    const-string v1, ""

    .line 119
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireEmui90ImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 120
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireEmui90ImageUrl()Ljava/lang/String;

    move-result-object v1

    .line 121
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    const-string v1, "sug_banner.png"

    goto :goto_0

    .line 125
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquirePictureUrl()Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 127
    const-string v1, "sug_banner.png"

    .line 130
    :cond_1
    :goto_0
    return-object v1
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 156
    move-object v0, p3

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 157
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 73
    iget-object v0, p0, Lo/buj$2;->b:Lo/buj;

    invoke-static {v0}, Lo/buj;->e(Lo/buj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/buj$2;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 74
    :cond_0
    iget-object v0, p0, Lo/buj$2;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 76
    :cond_1
    const v0, 0x7fffffff

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 7

    .line 86
    iget-object v0, p0, Lo/buj$2;->b:Lo/buj;

    invoke-static {v0}, Lo/buj;->e(Lo/buj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int v2, p2, v0

    .line 88
    iget-object v0, p0, Lo/buj$2;->b:Lo/buj;

    invoke-static {v0}, Lo/buj;->e(Lo/buj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/OperationPage;

    .line 90
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    .line 91
    invoke-direct {p0, v3}, Lo/buj$2;->b(Lcom/huawei/health/suggestion/model/OperationPage;)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$id;->tv_tips_knowledge:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/efy;

    .line 94
    invoke-direct {p0, v3, v6}, Lo/buj$2;->b(Lcom/huawei/health/suggestion/model/OperationPage;Lo/efy;)V

    .line 95
    invoke-direct {p0, v3, v5}, Lo/buj$2;->b(Lcom/huawei/health/suggestion/model/OperationPage;Landroid/view/View;)V

    .line 96
    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 97
    return-object v5
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 81
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
