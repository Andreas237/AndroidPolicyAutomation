.class public Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;,
        Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;>;"
        }
    .end annotation
.end field

.field private b:Landroid/widget/RelativeLayout;

.field private c:Lo/bhm;

.field private d:Landroid/support/v7/widget/RecyclerView;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;>;"
        }
    .end annotation
.end field

.field private f:Landroid/content/Context;

.field private g:I

.field private h:Ljava/lang/String;

.field private i:I

.field private k:Landroid/view/View;

.field private l:J

.field private m:Landroid/os/Handler;

.field private n:Z

.field private o:Lcom/huawei/health/sns/model/group/Group;

.field private p:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->h:Ljava/lang/String;

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->n:Z

    .line 72
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->l:J

    .line 84
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$b;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;I)I
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->g:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Lo/bhm;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    return-object v0
.end method

.method private a()V
    .locals 5

    .line 232
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    .line 233
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a:Ljava/util/List;

    .line 236
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_act_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->k:Landroid/view/View;

    .line 237
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->k:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 239
    sget v0, Lcom/huawei/android/sns/R$id;->group_act_list_recycler:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    .line 240
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 241
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 242
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 243
    new-instance v0, Lo/bhm;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v0, p0, v1, v2}, Lo/bhm;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/huawei/health/sns/model/group/Group;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    .line 244
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 246
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 265
    sget v0, Lcom/huawei/android/sns/R$id;->group_manager_bottom:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b:Landroid/widget/RelativeLayout;

    .line 266
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 267
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView(): group is a null object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0

    .line 272
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 275
    :goto_0
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 4

    .line 214
    if-eqz p1, :cond_1

    const-string v0, "activityId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    const-string v0, "activityId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 216
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 217
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 218
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    .line 219
    if-eqz v3, :cond_0

    .line 220
    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    invoke-virtual {v0}, Lo/bhm;->notifyDataSetChanged()V

    .line 223
    goto :goto_1

    .line 217
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 229
    :cond_1
    :goto_1
    return-void
.end method

.method private b()V
    .locals 4

    .line 202
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createEventResult:\u6d3b\u52a8\u6709\u66f4\u65b0\uff0c\u5237\u65b0\u5217\u8868"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 204
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->i:I

    .line 205
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->g:I

    .line 206
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b(I)V

    .line 207
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 302
    new-instance v2, Lo/aoi;

    invoke-direct {v2}, Lo/aoi;-><init>()V

    .line 303
    invoke-virtual {v2, p1}, Lo/aoi;->e(I)V

    .line 304
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->l:J

    invoke-virtual {v2, v0, v1}, Lo/aoi;->a(J)V

    .line 305
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V

    invoke-static {v2, v0}, Lo/aoc;->b(Lo/aoi;Lo/aol;)V

    .line 347
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;I)I
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->i:I

    return p1
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Landroid/content/Context;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    return-object v0
.end method

.method private c(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;
    .locals 4

    .line 354
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 355
    const/4 v0, 0x0

    return-object v0

    .line 357
    :cond_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    .line 358
    return-object v3
.end method

.method private c()V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bhm;->b(Z)V

    .line 125
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c:Lo/bhm;

    invoke-virtual {v0}, Lo/bhm;->notifyDataSetChanged()V

    .line 127
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->g:I

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->h:Ljava/lang/String;

    return-object p1
.end method

.method private d()V
    .locals 6

    .line 278
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 279
    if-eqz v4, :cond_2

    .line 280
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 281
    if-eqz v5, :cond_1

    const-string v0, "EXTRA_HEALTH_GROUP_ACT_LIST_GROUP"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 282
    const-string v0, "EXTRA_HEALTH_GROUP_ACT_LIST_GROUP"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    .line 283
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 284
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->finish()V

    .line 285
    return-void

    .line 287
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->l:J

    .line 289
    :cond_1
    goto :goto_0

    .line 290
    :cond_2
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->finish()V

    .line 292
    return-void

    .line 294
    :goto_0
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->i:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->c(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 3

    .line 158
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->p:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;

    .line 159
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 160
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->p:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 162
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;I)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b(I)V

    return-void
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Landroid/os/Handler;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->m:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)J
    .locals 2

    .line 47
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->l:J

    return-wide v0
.end method

.method private h()V
    .locals 3

    .line 374
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 375
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->o:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 377
    const/16 v0, 0x59

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 378
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b()V

    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;)Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 178
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 179
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult isRestore:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->n:Z

    if-eqz v0, :cond_0

    .line 181
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->n:Z

    .line 182
    return-void

    .line 184
    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 185
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 187
    :sswitch_0
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a(Landroid/content/Intent;)V

    .line 188
    goto :goto_0

    .line 190
    :sswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b()V

    .line 191
    .line 196
    :cond_1
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x58 -> :sswitch_0
        0x59 -> :sswitch_1
    .end sparse-switch
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->k:Landroid/view/View;

    if-ne p1, v0, :cond_0

    .line 365
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->h()V

    .line 367
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 131
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 132
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    .line 134
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_group_act_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->setContentView(I)V

    .line 135
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->d()V

    .line 136
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->a()V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthNetworkErrorActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->startActivity(Landroid/content/Intent;)V

    .line 141
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->finish()V

    .line 142
    return-void

    .line 144
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->b(I)V

    .line 145
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->e()V

    .line 146
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 150
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 151
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->p:Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity$a;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 152
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 166
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 167
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestoreInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActListActivity;->n:Z

    .line 169
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 173
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 174
    return-void
.end method
