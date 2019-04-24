.class public Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/TextView;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/widget/ImageView;

.field private f:Ljava/lang/String;

.field private g:Landroid/graphics/Bitmap;

.field private h:Ljava/lang/String;

.field private i:Landroid/widget/TextView;

.field private k:Landroid/os/HandlerThread;

.field private l:Landroid/content/Context;

.field private n:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private b()V
    .locals 7

    .line 108
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 109
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 110
    const-string v0, "imgUrl"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->h:Ljava/lang/String;

    .line 111
    const-string v0, "awardName"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->f:Ljava/lang/String;

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->h:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 114
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->h:Ljava/lang/String;

    .line 116
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->f:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 117
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->f:Ljava/lang/String;

    .line 119
    :cond_2
    const-string v0, "PLGACHIEVE_AchieveLotteryShareActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "init imgUrl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " awardName="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_nick:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->a:Landroid/widget/TextView;

    .line 122
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_text_prize_name:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->c:Landroid/widget/TextView;

    .line 123
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_head:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e:Landroid/widget/ImageView;

    .line 124
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_img_prize:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->b:Landroid/widget/ImageView;

    .line 125
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_title:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/emr;

    .line 126
    invoke-static {p0}, Lo/dxc;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 127
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_text_title:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->d:Landroid/widget/TextView;

    .line 128
    sget v0, Lcom/huawei/pluginachievement/R$id;->lottery_share_content:I

    invoke-static {p0, v0}, Lo/dxi;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->i:Landroid/widget/TextView;

    .line 129
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_lottery_share_title_2:I

    invoke-virtual {p0, v1}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Lo/dxc;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->i:Landroid/widget/TextView;

    sget v1, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_lottery_share_content:I

    invoke-virtual {p0, v1}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p0}, Lo/dxc;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e()V

    .line 133
    return-void
.end method

.method private c()V
    .locals 3

    .line 164
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dtm;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->l:Landroid/content/Context;

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 166
    return-void

    .line 169
    :cond_0
    sget v0, Lcom/huawei/pluginachievement/R$id;->share_rlayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 170
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;

    invoke-direct {v1, p0, v2}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 182
    return-void
.end method

.method private d()V
    .locals 2

    .line 61
    const-string v0, "PLGACHIEVE_AchieveLotteryShareActivity"

    const-string v1, "getData()"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e()V

    .line 63
    return-void
.end method

.method static synthetic d(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->c()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)Landroid/os/Handler;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->n:Landroid/os/Handler;

    return-object v0
.end method

.method private e()V
    .locals 5

    .line 136
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    invoke-static {p0}, Lcom/squareup/picasso/Picasso;->with(Landroid/content/Context;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->load(Ljava/lang/String;)Lcom/squareup/picasso/RequestCreator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->b:Landroid/widget/ImageView;

    new-instance v2, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$5;

    invoke-direct {v2, p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$5;-><init>(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)V

    invoke-virtual {v0, v1, v2}, Lcom/squareup/picasso/RequestCreator;->into(Landroid/widget/ImageView;Lcom/squareup/picasso/Callback;)V

    .line 151
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dtm;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 152
    invoke-virtual {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dtm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 153
    const-string v0, "PLGACHIEVE_AchieveLotteryShareActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "refresh() imgUrl="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " nick="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 156
    invoke-static {p0, v3}, Lo/dxg;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->g:Landroid/graphics/Bitmap;

    .line 157
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 161
    :cond_1
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 67
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 68
    iput-object p0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->l:Landroid/content/Context;

    .line 69
    sget v0, Lcom/huawei/pluginachievement/R$layout;->achieve_lottery_share:I

    invoke-virtual {p0, v0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->setContentView(I)V

    .line 70
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "handlerThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->k:Landroid/os/HandlerThread;

    .line 71
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->k:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 72
    new-instance v0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->k:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$c;-><init>(Landroid/os/Looper;Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)V

    iput-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->n:Landroid/os/Handler;

    .line 74
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->b()V

    .line 75
    invoke-direct {p0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->d()V

    .line 76
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 186
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 187
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->k:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->k:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->g:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 191
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 193
    :cond_1
    return-void
.end method
