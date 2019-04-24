.class public Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;,
        Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

.field private F:I

.field private G:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

.field private I:Landroid/widget/LinearLayout;

.field a:Landroid/widget/FrameLayout;

.field b:Lo/efy;

.field c:Lo/efy;

.field d:Lo/efy;

.field e:Lo/efy;

.field f:Landroid/support/v7/widget/RecyclerView;

.field g:Lo/bvf;

.field h:Landroid/support/v4/view/ViewPager;

.field i:Lo/bvk;

.field private j:Lo/emr;

.field k:Landroid/support/v4/view/ViewPager;

.field l:Landroid/widget/ImageView;

.field m:Landroid/view/View;

.field private n:Landroid/content/Context;

.field o:Lo/bvk;

.field p:Lo/efy;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bvj;>;"
        }
    .end annotation
.end field

.field private t:Z

.field private u:Landroid/widget/ExpandableListView;

.field private v:J

.field private w:Lo/bvg;

.field private x:J

.field private y:Landroid/os/Handler;

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->t:Z

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->s:Ljava/util/List;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    .line 95
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    .line 96
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    .line 121
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$1;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->E:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    .line 130
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->G:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Ljava/util/List;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    return-object v0
.end method

.method private a()V
    .locals 4

    .line 278
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 282
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 283
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 285
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 286
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_0

    .line 288
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 291
    :goto_0
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    const/4 v1, 0x0

    if-gt v1, v0, :cond_1

    .line 292
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->l:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 294
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->l:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 297
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    invoke-virtual {v0, v1, v2, v3}, Lo/bvf;->a(III)V

    .line 298
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->o:Lo/bvk;

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    invoke-virtual {v1, v2}, Lo/bvk;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 300
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h()V

    .line 302
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    invoke-virtual {v0}, Lo/bvf;->getItemCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 303
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->I:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 304
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    goto :goto_2

    .line 306
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->I:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 310
    :goto_2
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;I)I
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    return p1
.end method

.method private b()V
    .locals 3

    .line 186
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 187
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    .line 188
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    .line 189
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    .line 191
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calendar_card_view_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    .line 192
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calendar_card_week_view_pager:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    .line 195
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->l:Landroid/widget/ImageView;

    .line 197
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_last:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 198
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_next:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_week:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 200
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mouth:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 201
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_all:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 203
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calendar_day_textView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    .line 204
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    invoke-virtual {v0, p0}, Lo/efy;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_trainevent_time:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a:Landroid/widget/FrameLayout;

    .line 208
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_tv_tevent_stime:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b:Lo/efy;

    .line 210
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_time_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c:Lo/efy;

    .line 211
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calorie_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->e:Lo/efy;

    .line 212
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_order_num:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/efy;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d:Lo/efy;

    .line 214
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_sug_data_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m:Landroid/view/View;

    .line 216
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_sug_data_calendar_card_RecyclerView:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    .line 217
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_data_calendar_card_no_data_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->I:Landroid/widget/LinearLayout;

    .line 218
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_data_calendar_card_no_data1:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$4;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    return-void
.end method

.method private b(J)V
    .locals 4

    .line 437
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 438
    return-void

    .line 440
    :cond_0
    const/4 v2, 0x0

    .line 442
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 443
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 445
    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 447
    const-string v0, "entrance"

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    const-string v0, "stay_time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    const-string v0, "1130016"

    invoke-static {v0, v3}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 450
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->l()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;I)I
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/os/Handler;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->y:Landroid/os/Handler;

    return-object v0
.end method

.method private c()V
    .locals 5

    .line 313
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 315
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 317
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 318
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 321
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    if-ltz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->l:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    goto :goto_0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->l:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 329
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    iget v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bvf;->b(IIII)V

    .line 330
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i:Lo/bvk;

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    invoke-virtual {v1, v2}, Lo/bvk;->e(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 331
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    invoke-virtual {v0}, Lo/bvf;->getItemCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 332
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->I:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 333
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    goto :goto_1

    .line 335
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->I:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 338
    :goto_1
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g()V

    .line 339
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/widget/ExpandableListView;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    return-object v0
.end method

.method private d()V
    .locals 2

    .line 342
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    .line 343
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c()V

    .line 345
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/WorkoutRecord;)V
    .locals 6

    .line 638
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showFitnessDetail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessResultActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 640
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 641
    const-string v0, "workout_record"

    invoke-virtual {v5, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 642
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 643
    const-string v0, "entrance"

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 644
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->startActivity(Landroid/content/Intent;)V

    .line 645
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Landroid/content/Context;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    return-object p1
.end method

.method private e()V
    .locals 2

    .line 261
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 262
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 263
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 266
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 267
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->I:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 269
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/efy;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 273
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    invoke-virtual {v0}, Lo/bvf;->b()V

    .line 274
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m()V

    .line 275
    return-void
.end method

.method private f()V
    .locals 2

    .line 348
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    .line 349
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c()V

    .line 350
    return-void
.end method

.method static synthetic f(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a()V

    return-void
.end method

.method static synthetic g(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)I
    .locals 1

    .line 62
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    return v0
.end method

.method private g()V
    .locals 9

    .line 353
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v4

    .line 354
    const-string v5, "%1$s - %2$s"

    .line 355
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    invoke-static {v0, v1, v2, v3}, Lo/bzt;->e(IIII)Ljava/util/Date;

    move-result-object v6

    .line 356
    invoke-static {v6}, Lo/bzt;->b(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 357
    invoke-static {v6}, Lo/bzt;->c(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 359
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b:Lo/efy;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 361
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m()V

    .line 362
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 363
    return-void
.end method

.method private h()V
    .locals 9

    .line 377
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/text/SimpleDateFormat;->getDateInstance(I)Ljava/text/DateFormat;

    move-result-object v4

    .line 378
    const-string v5, "%1$s - %2$s"

    .line 379
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v2}, Lo/bzt;->b(IIII)Ljava/util/Date;

    move-result-object v6

    .line 380
    invoke-static {v6}, Lo/bzt;->a(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 381
    invoke-static {v6}, Lo/bzt;->e(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 382
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b:Lo/efy;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 383
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->m()V

    .line 384
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p:Lo/efy;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 385
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c()V

    return-void
.end method

.method private i()V
    .locals 2

    .line 367
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    .line 368
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a()V

    .line 369
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Z
    .locals 1

    .line 62
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->t:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)I
    .locals 1

    .line 62
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    return v0
.end method

.method private k()V
    .locals 2

    .line 372
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    .line 373
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a()V

    .line 374
    return-void
.end method

.method private l()V
    .locals 2

    .line 500
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->G:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireExerciseRecordByAll(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 501
    return-void
.end method

.method private m()V
    .locals 10

    .line 388
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    invoke-virtual {v0}, Lo/bvf;->e()Lo/bvj;

    move-result-object v6

    .line 389
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 391
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_fitness_min:I

    invoke-virtual {v6}, Lo/bvj;->e()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Lo/bzr;->k(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_history_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_history_unit:I

    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v7

    .line 393
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_chart_kcal:I

    .line 394
    invoke-virtual {v6}, Lo/bvj;->a()F

    move-result v3

    invoke-static {v3}, Lo/bzr;->c(F)Ljava/lang/String;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_history_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_history_unit:I

    .line 393
    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v8

    .line 396
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    const-string v1, "\\d"

    sget v2, Lcom/huawei/health/suggestion/R$string;->sug_times:I

    .line 397
    invoke-virtual {v6}, Lo/bvj;->d()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v4, Lcom/huawei/health/suggestion/R$style;->sug_text_history_num:I

    sget v5, Lcom/huawei/health/suggestion/R$style;->sug_text_history_unit:I

    .line 396
    invoke-static/range {v0 .. v5}, Lo/buk;->b(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Object;II)Landroid/text/SpannableString;

    move-result-object v9

    .line 400
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c:Lo/efy;

    invoke-virtual {v0, v7}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->e:Lo/efy;

    invoke-virtual {v0, v8}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 402
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d:Lo/efy;

    invoke-virtual {v0, v9}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 405
    :cond_0
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->r()V

    return-void
.end method

.method private n()V
    .locals 4

    .line 453
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loadingImage enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 455
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 457
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q()V

    return-void
.end method

.method private o()V
    .locals 4

    .line 408
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 409
    return-void

    .line 411
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 412
    const/4 v3, 0x0

    .line 413
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 414
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "entrance"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 416
    :cond_1
    const-string v0, "entrance"

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    const-string v0, "1130011"

    invoke-static {v0, v2}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 419
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)Ljava/util/List;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->s:Ljava/util/List;

    return-object v0
.end method

.method private p()V
    .locals 4

    .line 461
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 463
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->j:Lo/emr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/emr;->setDoubleClickEnable(Z)V

    .line 464
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->j:Lo/emr;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setBackToTopListener(Lo/emr$a;)V

    .line 471
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->y:Landroid/os/Handler;

    const/4 v1, 0x3

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 473
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->E:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->downloadFitnessRecordFromCloud(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 476
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$b;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-static {v0}, Lo/bsu;->d(Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;)V

    .line 477
    return-void
.end method

.method private q()V
    .locals 10

    .line 505
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 506
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_exercise_hestroy_calendar_card_LinearLayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 507
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 508
    new-instance v0, Lo/bvf;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    invoke-direct {v0, v1}, Lo/bvf;-><init>(Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    .line 510
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->g:Lo/bvf;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 512
    new-instance v0, Lo/bvk;

    new-instance v1, Lo/bvf;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    invoke-direct {v1, v2}, Lo/bvf;-><init>(Ljava/util/List;)V

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    iget v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    const/4 v5, 0x1

    invoke-direct/range {v0 .. v5}, Lo/bvk;-><init>(Lo/bvf;IIIZ)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i:Lo/bvk;

    .line 513
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i:Lo/bvk;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 514
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i:Lo/bvk;

    invoke-virtual {v1}, Lo/bvk;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$3;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 536
    new-instance v0, Lo/bvk;

    new-instance v1, Lo/bvf;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    invoke-direct {v1, v2}, Lo/bvf;-><init>(Ljava/util/List;)V

    iget v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->A:I

    iget v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->D:I

    iget v4, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->C:I

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bvk;-><init>(Lo/bvf;IIIZ)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->o:Lo/bvk;

    .line 538
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->o:Lo/bvk;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 539
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->o:Lo/bvk;

    invoke-virtual {v1}, Lo/bvk;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 540
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$8;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 561
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_week:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/RadioButton;

    .line 562
    invoke-virtual {v6}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 563
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c()V

    .line 566
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mouth:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/RadioButton;

    .line 567
    invoke-virtual {v7}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 568
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a()V

    .line 571
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_all:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/RadioButton;

    .line 572
    invoke-virtual {v8}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 573
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->e()V

    .line 578
    :cond_2
    new-instance v0, Lo/bvg;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->z:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lo/bvg;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->w:Lo/bvg;

    .line 579
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->w:Lo/bvg;

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 581
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->w:Lo/bvg;

    invoke-virtual {v0}, Lo/bvg;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->s:Ljava/util/List;

    .line 584
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    .line 585
    const/4 v7, 0x2

    .line 586
    if-le v6, v7, :cond_3

    move v8, v7

    goto :goto_0

    :cond_3
    move v8, v6

    .line 588
    :goto_0
    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_4

    .line 589
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    invoke-virtual {v0, v9}, Landroid/widget/ExpandableListView;->expandGroup(I)Z

    .line 588
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 591
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 593
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$10;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 620
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$9;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$9;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 628
    return-void
.end method

.method private r()V
    .locals 2

    .line 631
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 632
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 634
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 635
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 230
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    .line 231
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_last:I

    if-ne v1, v0, :cond_1

    .line 232
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 233
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k()V

    goto/16 :goto_0

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getVisibility()I

    move-result v0

    if-nez v0, :cond_8

    .line 235
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->f()V

    goto/16 :goto_0

    .line 237
    :cond_1
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_event_next:I

    if-ne v1, v0, :cond_3

    .line 238
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    .line 239
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->i()V

    goto :goto_0

    .line 240
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getVisibility()I

    move-result v0

    if-nez v0, :cond_8

    .line 241
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->d()V

    goto :goto_0

    .line 243
    :cond_3
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_week:I

    if-ne v1, v0, :cond_4

    .line 244
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c()V

    goto :goto_0

    .line 245
    :cond_4
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_mouth:I

    if-ne v1, v0, :cond_5

    .line 246
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a()V

    goto :goto_0

    .line 247
    :cond_5
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_all:I

    if-ne v1, v0, :cond_6

    .line 248
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->e()V

    goto :goto_0

    .line 249
    :cond_6
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_calendar_day_textView:I

    if-ne v1, v0, :cond_8

    .line 250
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->k:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 251
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->F:I

    .line 252
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->a()V

    goto :goto_0

    .line 253
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->h:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getVisibility()I

    move-result v0

    if-nez v0, :cond_8

    .line 254
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->B:I

    .line 255
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->c()V

    .line 258
    :cond_8
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 152
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lo/bxd;->a(Ljava/lang/ref/WeakReference;)V

    .line 155
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->o()V

    .line 156
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->v:J

    .line 157
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 158
    sget v0, Lcom/huawei/health/suggestion/R$layout;->sug_fitness_exercise_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->setContentView(I)V

    .line 159
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 160
    iput-object p0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n:Landroid/content/Context;

    .line 161
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_fitness_exercise_my_history:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ExpandableListView;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    .line 162
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    .line 163
    sget v0, Lcom/huawei/health/suggestion/R$id;->no_fitness_exercise_history_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->r:Landroid/widget/RelativeLayout;

    .line 164
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_fitness_exercise_history_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->q:Landroid/widget/RelativeLayout;

    .line 166
    sget v0, Lcom/huawei/health/suggestion/R$id;->hw_fitness_exercise_history_loading_view:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lhuawei/widget/HwProgressBar;

    .line 167
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Lhuawei/widget/HwProgressBar;->setLayerType(ILandroid/graphics/Paint;)V

    .line 169
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$d;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->y:Landroid/os/Handler;

    .line 170
    sget v0, Lcom/huawei/health/suggestion/R$id;->health_sport_history_title_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->j:Lo/emr;

    .line 172
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_exercise_hestroy_calendar_card_LinearLayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b()V

    goto :goto_0

    .line 176
    :cond_0
    sget v0, Lcom/huawei/health/suggestion/R$id;->sug_fitness_exercise_hestroy_calendar_card_LinearLayout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->u:Landroid/widget/ExpandableListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ExpandableListView;->setVisibility(I)V

    .line 180
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->n()V

    .line 181
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->p()V

    .line 182
    return-void
.end method

.method public onDestroy()V
    .locals 6

    .line 423
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 425
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->x:J

    .line 426
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 427
    const-string v0, "time"

    iget-wide v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->x:J

    iget-wide v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->v:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u505c\u7559\u65f6\u957f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 429
    const-string v0, "1130012"

    invoke-static {v0, v5}, Lo/bzm;->c(Ljava/lang/String;Ljava/util/Map;)V

    .line 430
    iget-wide v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->x:J

    iget-wide v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->v:J

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b(J)V

    .line 431
    invoke-static {}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getInstance()Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->unregResultCallback()V

    .line 432
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->E:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    .line 433
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->G:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    .line 434
    return-void
.end method
