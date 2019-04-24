.class public Lcom/huawei/health/suggestion/ui/TrainEventActivity;
.super Lcom/huawei/health/suggestion/ui/BaseStateActivity;
.source "SourceFile"

# interfaces
.implements Lo/buu$b;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/String;

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;>;"
        }
    .end annotation
.end field

.field private g:Lcom/huawei/health/suggestion/model/Plan;

.field private h:I

.field private i:Lo/enb;

.field private k:Ljava/lang/String;

.field private l:Landroid/graphics/PointF;

.field private m:I

.field private n:Lo/emq;

.field private o:Landroid/view/View;

.field private p:[Ljava/lang/String;

.field private q:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private r:Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

.field private s:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private t:Lo/buu;

.field private u:Lhuawei/widget/HwSubTabWidget$SubTab;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;-><init>()V

    .line 52
    const-string v0, "TrainEventActivity"

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->d:Ljava/lang/String;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    .line 68
    new-instance v0, Landroid/graphics/PointF;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->l:Landroid/graphics/PointF;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)[Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->p:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->g:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)Ljava/util/List;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    return-object v0
.end method

.method private c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;I)V
    .locals 3

    .line 194
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 195
    const-string v0, "joined"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 196
    const-string v0, "planid"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->k:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    const-string v0, "timezone"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 198
    const-string v0, "plantype"

    iget v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->h:I

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 199
    invoke-virtual {p1, v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;->setArguments(Landroid/os/Bundle;)V

    .line 200
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->l()V

    return-void
.end method

.method private l()V
    .locals 5

    .line 203
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->i:Lo/enb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/enb;->setOffscreenPageLimit(I)V

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->i:Lo/enb;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->r:Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

    invoke-virtual {v0, v1}, Lo/enb;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 205
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->t:Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->q:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->r:Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 206
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->t:Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->u:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->r:Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 207
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->t:Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->s:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->r:Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;->getItem(I)Landroid/support/v4/app/Fragment;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/buu;->b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V

    .line 230
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 248
    return-void
.end method

.method protected d()I
    .locals 1

    .line 89
    const/4 v0, 0x0

    return v0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 283
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 284
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->l:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 285
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->l:Landroid/graphics/PointF;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    iput v1, v0, Landroid/graphics/PointF;->y:F

    goto :goto_0

    .line 286
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 287
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->l:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    sub-float v3, v0, v1

    .line 288
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->m:I

    mul-int/lit8 v1, v1, 0x3

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 289
    const/4 v0, 0x1

    return v0

    .line 312
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public g()V
    .locals 1

    .line 95
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_activity_train_event2:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->setContentView(I)V

    .line 96
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->m:I

    .line 97
    return-void
.end method

.method public h()I
    .locals 1

    .line 84
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_loading_layout:I

    return v0
.end method

.method public i()V
    .locals 8

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    .line 128
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 129
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 130
    const-string v0, "TrainEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->finish()V

    .line 132
    return-void

    .line 134
    :cond_0
    const-string v0, "planid"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->k:Ljava/lang/String;

    .line 135
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->k:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 136
    const-string v0, "TrainEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the planid is null --initData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->finish()V

    .line 138
    return-void

    .line 140
    :cond_1
    const-string v0, "plantype"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->h:I

    .line 142
    iget v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->h:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 143
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/btj;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    move-result-object v5

    .line 144
    invoke-static {v5}, Lo/btm;->c(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->g:Lcom/huawei/health/suggestion/model/Plan;

    .line 145
    goto :goto_0

    .line 146
    :cond_2
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->k:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/bsp;->e(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/Plan;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->g:Lcom/huawei/health/suggestion/model/Plan;

    .line 149
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->g:Lcom/huawei/health/suggestion/model/Plan;

    if-eqz v0, :cond_3

    .line 150
    new-instance v5, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;-><init>()V

    .line 152
    new-instance v6, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;-><init>()V

    .line 154
    new-instance v7, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;

    invoke-direct {v7}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;-><init>()V

    .line 156
    const/4 v0, 0x2

    invoke-direct {p0, v5, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;I)V

    .line 157
    const/4 v0, 0x3

    invoke-direct {p0, v6, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;I)V

    .line 158
    const/4 v0, 0x4

    invoke-direct {p0, v7, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/TraineventBaseFm;I)V

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 161
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->f:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->k:Ljava/lang/String;

    new-instance v2, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)V

    invoke-interface {v0, v1, v2}, Lo/bsp;->i(Ljava/lang/String;Lo/bui;)Ljava/util/List;

    .line 186
    goto :goto_1

    .line 187
    :cond_3
    const-string v0, "TrainEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6ca1\u6709\u83b7\u53d6\u5230\u5386\u53f2\u52a0\u5165\u7684\u8ba1\u5212\uff0c\u9875\u9762\u81ea\u6bc1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->finish()V

    .line 191
    :goto_1
    return-void
.end method

.method public k()V
    .locals 5

    .line 102
    sget v0, Lcom/huawei/health/suggestion/R$id;->tool_bar:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ems;

    .line 103
    sget v0, Lcom/huawei/health/suggestion/R$layout;->activity_fit_bottom_view:I

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 104
    invoke-static {}, Lo/bzp;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_iv_report:I

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    sget v1, Lcom/huawei/health/suggestion/R$drawable;->sug_event_w_report:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 107
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_train_event_vp:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/enb;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->i:Lo/enb;

    .line 108
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_toreport:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->o:Landroid/view/View;

    .line 109
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->i:Lo/enb;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/enb;->setScanScroll(Z)V

    .line 110
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_pst:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emq;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->n:Lo/emq;

    .line 111
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_train_event_week:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_train_event_month:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget v1, Lcom/huawei/health/suggestion/R$string;->sug_train_event_total:I

    .line 112
    invoke-virtual {p0, v1}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->p:[Ljava/lang/String;

    .line 113
    new-instance v0, Lo/buu;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->i:Lo/enb;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->n:Lo/emq;

    invoke-direct {v0, p0, v1, v2}, Lo/buu;-><init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->t:Lo/buu;

    .line 114
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->t:Lo/buu;

    invoke-virtual {v0, p0}, Lo/buu;->e(Lo/buu$b;)V

    .line 115
    new-instance v0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;-><init>(Lcom/huawei/health/suggestion/ui/TrainEventActivity;Landroid/support/v4/app/FragmentManager;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->r:Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;

    .line 116
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->n:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->p:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->q:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 117
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->n:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->p:[Ljava/lang/String;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->u:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 118
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->n:Lo/emq;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->p:[Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->s:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 120
    invoke-virtual {v3, v4}, Lo/ems;->e(Landroid/view/View;)V

    .line 121
    invoke-virtual {v3, p0}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 122
    invoke-virtual {v3, p0}, Lo/ems;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 239
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/ui/TrainReportActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 240
    const-string v0, "plan"

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->g:Lcom/huawei/health/suggestion/model/Plan;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 241
    invoke-virtual {p0, v2}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 242
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 79
    invoke-super {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseStateActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x1000000

    const/high16 v2, 0x1000000

    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setFlags(II)V

    .line 81
    return-void
.end method
