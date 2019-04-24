.class public Lo/buj;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/buj$d;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/support/v4/view/ViewPager;

.field private d:Lo/buj$d;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;"
        }
    .end annotation
.end field

.field private g:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    .line 48
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {}, Lo/buj;->c()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/buj;->e:Ljava/util/List;

    .line 45
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/buj;->g:Z

    .line 50
    iget-object v0, p0, Lo/buj;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->vp_head:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    .line 51
    iget-object v0, p0, Lo/buj;->itemView:Landroid/view/View;

    sget v1, Lcom/huawei/health/suggestion/R$id;->ll_operation_dot:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lo/buj;->b:Landroid/widget/LinearLayout;

    .line 52
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/buj;->a:Landroid/os/Handler;

    .line 53
    return-void
.end method

.method static synthetic a(Lo/buj;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic b(Lo/buj;)Landroid/widget/LinearLayout;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/buj;->b:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic b(Lo/buj;Lcom/huawei/health/suggestion/model/OperationPage;)Ljava/lang/String;
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lo/buj;->c(Lcom/huawei/health/suggestion/model/OperationPage;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;)V"
        }
    .end annotation

    .line 222
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 223
    :cond_0
    return-void

    .line 225
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/buj;->g:Z

    .line 226
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 227
    new-instance v4, Landroid/view/View;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 228
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v1, v2}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 229
    if-nez v3, :cond_3

    .line 230
    sget v0, Lcom/huawei/health/suggestion/R$drawable;->btn_health_point_white_sel:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 231
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 232
    const/4 v0, 0x0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    goto :goto_1

    .line 234
    :cond_2
    const/4 v0, 0x0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    goto :goto_1

    .line 237
    :cond_3
    sget v0, Lcom/huawei/health/suggestion/R$mipmap;->btn_health_point_white_nor:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 238
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 239
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    goto :goto_1

    .line 241
    :cond_4
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v0

    iput v0, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 245
    :goto_1
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    iget-object v0, p0, Lo/buj;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 226
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 248
    :cond_5
    return-void
.end method

.method private static c()I
    .locals 1

    .line 56
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_item_fitness_operation_9_0:I

    return v0
.end method

.method static synthetic c(Lo/buj;)Landroid/os/Handler;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/buj;->a:Landroid/os/Handler;

    return-object v0
.end method

.method private c(Lcom/huawei/health/suggestion/model/OperationPage;)Ljava/lang/String;
    .locals 3

    .line 251
    const-string v2, ""

    .line 252
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/OperationPage;->acquireType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 254
    :pswitch_0
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_courses:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 255
    goto :goto_1

    .line 257
    :pswitch_1
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_tips:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 259
    goto :goto_1

    .line 261
    :pswitch_2
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_news:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 263
    goto :goto_1

    .line 265
    :pswitch_3
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_activity:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 267
    goto :goto_1

    .line 269
    :goto_0
    const-string v2, ""

    .line 271
    :goto_1
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic e(Lo/buj;)Ljava/util/List;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/buj;->e:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public b()V
    .locals 2

    .line 275
    iget-object v0, p0, Lo/buj;->d:Lo/buj$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 276
    iget-object v0, p0, Lo/buj;->d:Lo/buj$d;

    invoke-virtual {v0}, Lo/buj$d;->e()V

    .line 277
    const/4 v0, 0x0

    iput-object v0, p0, Lo/buj;->d:Lo/buj$d;

    .line 280
    :cond_0
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 281
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->clearOnPageChangeListeners()V

    .line 282
    const/4 v0, 0x0

    iput-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    .line 285
    :cond_1
    iget-object v0, p0, Lo/buj;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 286
    iget-object v0, p0, Lo/buj;->a:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 287
    const/4 v0, 0x0

    iput-object v0, p0, Lo/buj;->a:Landroid/os/Handler;

    .line 290
    :cond_2
    iget-object v0, p0, Lo/buj;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 291
    const/4 v0, 0x0

    iput-object v0, p0, Lo/buj;->b:Landroid/widget/LinearLayout;

    .line 292
    return-void
.end method

.method public d(Ljava/util/List;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/OperationPage;>;J)V"
        }
    .end annotation

    .line 60
    const-string v0, "FitnessCourseBannerViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setBannerDataAndRefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 62
    :cond_0
    return-void

    .line 64
    :cond_1
    iget-boolean v0, p0, Lo/buj;->g:Z

    if-nez v0, :cond_2

    .line 65
    invoke-direct {p0, p1}, Lo/buj;->b(Ljava/util/List;)V

    .line 68
    :cond_2
    iget-object v0, p0, Lo/buj;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 69
    iget-object v0, p0, Lo/buj;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 70
    new-instance v4, Lo/buj$2;

    invoke-direct {v4, p0, p1}, Lo/buj$2;-><init>(Lo/buj;Ljava/util/List;)V

    .line 159
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 160
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lo/buj$4;

    invoke-direct {v1, p0, p1}, Lo/buj$4;-><init>(Lo/buj;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 187
    const v5, 0x3fffffff    # 1.9999999f

    .line 188
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    rem-int v0, v5, v0

    sub-int v6, v5, v0

    .line 189
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lo/buj;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 190
    iget-object v0, p0, Lo/buj;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v6}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 191
    iget-object v0, p0, Lo/buj;->d:Lo/buj$d;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    iget-object v0, p0, Lo/buj;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 193
    new-instance v0, Lo/buj$d;

    invoke-direct {v0, p0}, Lo/buj$d;-><init>(Lo/buj;)V

    iput-object v0, p0, Lo/buj;->d:Lo/buj$d;

    .line 194
    iget-object v0, p0, Lo/buj;->d:Lo/buj$d;

    invoke-virtual {v0, p2, p3}, Lo/buj$d;->b(J)V

    .line 196
    :cond_3
    return-void
.end method
