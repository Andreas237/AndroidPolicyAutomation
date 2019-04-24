.class public Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$c;
    }
.end annotation


# instance fields
.field a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/xa;>;"
        }
    .end annotation
.end field

.field b:Lo/xz;

.field private c:Lo/ya;

.field private d:Landroid/support/v7/widget/RecyclerView;

.field e:Lo/eeh;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/support/v4/widget/SwipeRefreshLayout;

.field private h:Landroid/widget/TextView;

.field private i:I

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/content/Context;

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private n:I

.field private final o:Ljava/lang/String;

.field private p:J

.field private s:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->a:Ljava/util/ArrayList;

    .line 53
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->o:Ljava/lang/String;

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->n:I

    .line 57
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->p:J

    .line 122
    new-instance v0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$2;-><init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->s:Landroid/os/Handler;

    .line 301
    new-instance v0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$1;-><init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e:Lo/eeh;

    return-void
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->f:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->m:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic b(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Ljava/util/ArrayList;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->m:Ljava/util/ArrayList;

    return-object v0
.end method

.method private b(Lo/xa;)Z
    .locals 7

    .line 283
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 284
    const/4 v0, 0x0

    return v0

    .line 286
    :cond_0
    invoke-static {}, Lo/xo;->e()Lo/xo;

    move-result-object v4

    .line 287
    invoke-virtual {p1}, Lo/xa;->e()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lo/xo;->b(J)Lcom/huawei/sns/sdk/modelmsg/FriendInfo;

    move-result-object v5

    .line 288
    const/4 v6, 0x0

    .line 290
    iget-wide v0, v5, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->userId:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 291
    iget-object v0, v5, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->imagePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lo/xa;->c(Ljava/lang/String;)V

    .line 292
    iget-object v0, v5, Lcom/huawei/sns/sdk/modelmsg/FriendInfo;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lo/xa;->d(Ljava/lang/String;)V

    .line 293
    const/4 v0, 0x1

    return v0

    .line 296
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic c(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/content/Context;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->l:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;J)J
    .locals 0

    .line 40
    iput-wide p1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->p:J

    return-wide p1
.end method

.method static synthetic d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)Landroid/os/Handler;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->s:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->p:J

    return-wide v0
.end method

.method private e(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/xa;>;)Ljava/util/ArrayList<Ljava/lang/Long;>;"
        }
    .end annotation

    .line 267
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 268
    const/4 v2, 0x0

    .line 269
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 270
    const/4 v0, 0x0

    return-object v0

    .line 272
    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 273
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/xa;

    invoke-direct {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b(Lo/xa;)Z

    move-result v2

    .line 272
    .line 274
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 278
    :cond_1
    return-object v1
.end method

.method static synthetic i(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)I
    .locals 2

    .line 40
    iget v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->n:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->n:I

    return v0
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/xa;>;)V"
        }
    .end annotation

    .line 239
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 241
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c:Lo/ya;

    invoke-virtual {v0, p1}, Lo/ya;->e(Ljava/util/ArrayList;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/DefaultItemAnimator;

    invoke-direct {v1}, Landroid/support/v7/widget/DefaultItemAnimator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setItemAnimator(Landroid/support/v7/widget/RecyclerView$ItemAnimator;)V

    goto :goto_0

    .line 247
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c:Lo/ya;

    invoke-virtual {v0, p1}, Lo/ya;->e(Ljava/util/ArrayList;)V

    .line 248
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->k:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 250
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->h:Landroid/widget/TextView;

    sget v1, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_no_likes:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 256
    :goto_0
    return-void
.end method

.method public e()V
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b:Lo/xz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b:Lo/xz;

    invoke-virtual {v0}, Lo/xz;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b:Lo/xz;

    invoke-virtual {v0}, Lo/xz;->e()V

    .line 214
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->n:I

    .line 215
    return-void
.end method

.method public e(J)V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->s:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$5;-><init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 159
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 61
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 62
    sget v0, Lcom/huawei/bone/social/R$layout;->ids_social_activity_user_like_info:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->setContentView(I)V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->l:Landroid/content/Context;

    .line 64
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    .line 66
    if-eqz v4, :cond_0

    .line 67
    const-string v0, "likes"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->i:I

    .line 70
    :cond_0
    sget v0, Lcom/huawei/bone/social/R$id;->swipe_refresh_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->g:Landroid/support/v4/widget/SwipeRefreshLayout;

    .line 71
    sget v0, Lcom/huawei/bone/social/R$id;->recyclerView:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d:Landroid/support/v7/widget/RecyclerView;

    .line 72
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 73
    new-instance v0, Lo/ya;

    invoke-direct {v0, p0}, Lo/ya;-><init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c:Lo/ya;

    .line 74
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->c:Lo/ya;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 76
    sget v0, Lcom/huawei/bone/social/R$id;->id_no_history_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->k:Landroid/widget/RelativeLayout;

    .line 77
    sget v0, Lcom/huawei/bone/social/R$id;->id_no_like_lly:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->f:Landroid/widget/LinearLayout;

    .line 78
    sget v0, Lcom/huawei/bone/social/R$id;->id_no_item_tv:I

    invoke-virtual {p0, v0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->h:Landroid/widget/TextView;

    .line 79
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    .line 80
    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v6

    .line 81
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "height:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "topMargin1:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    int-to-double v0, v6

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    div-double/2addr v0, v2

    double-to-int v0, v0

    iput v0, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 88
    const-string v0, "PluginSocial_UserLikeDetailsActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "topMargin2:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, v5, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->f:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;

    invoke-direct {v1, p0, v5}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity$3;-><init>(Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;Landroid/widget/RelativeLayout$LayoutParams;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    .line 97
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->invalidate()V

    .line 98
    invoke-static {p0}, Lo/xp;->b(Landroid/content/Context;)Lo/xz;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b:Lo/xz;

    .line 99
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b:Lo/xz;

    if-eqz v0, :cond_1

    .line 100
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->b:Lo/xz;

    invoke-virtual {p0}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/bone/social/R$string;->IDS_plugin_social_processing:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/xz;->d(Ljava/lang/String;)V

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->g:Landroid/support/v4/widget/SwipeRefreshLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 104
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->e(J)V

    .line 120
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 332
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 333
    iget-object v0, p0, Lcom/huawei/bone/social/ui/UserLikeDetailsActivity;->s:Landroid/os/Handler;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 334
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 219
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onResume()V

    .line 228
    return-void
.end method
