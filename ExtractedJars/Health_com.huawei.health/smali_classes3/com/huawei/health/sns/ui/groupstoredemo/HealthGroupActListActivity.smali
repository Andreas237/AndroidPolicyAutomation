.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;,
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$c;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;>;"
        }
    .end annotation
.end field

.field private d:Lo/bim;

.field private e:Landroid/support/v7/widget/RecyclerView;

.field private f:Landroid/content/Context;

.field private g:I

.field private h:Landroid/view/View;

.field private i:I

.field private k:Ljava/lang/String;

.field private l:Lcom/huawei/health/sns/model/group/Group;

.field private m:Landroid/os/Handler;

.field private n:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;

.field private o:Z

.field private p:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->k:Ljava/lang/String;

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->o:Z

    .line 75
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->p:J

    .line 87
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$c;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->m:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->i:I

    return v0
.end method

.method private a()V
    .locals 2

    .line 125
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bim;->e(Z)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    invoke-virtual {v0}, Lo/bim;->notifyDataSetChanged()V

    .line 130
    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 14

    .line 305
    const/16 v5, 0xc8

    .line 306
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getGroupActivityList"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 307
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupActivityList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 310
    :cond_0
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "/getGroupActivityList resCode Error : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\n "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "result = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 313
    :goto_0
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 314
    const-string v0, "resultCode"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 315
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 316
    const-string v0, "0"

    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    const-string v0, "currentTime"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->k:Ljava/lang/String;

    .line 319
    const-string v0, "totalCount"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->g:I

    .line 321
    new-instance v9, Lo/dcy;

    invoke-direct {v9}, Lo/dcy;-><init>()V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->f:Landroid/content/Context;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->p:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_ACT_LIST_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->k:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v9}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 324
    const-string v0, "groupActivityList"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    .line 326
    const/4 v11, 0x0

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 328
    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 329
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 330
    invoke-direct {p0, v13}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    move-result-object v11

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c:Ljava/util/List;

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 328
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 333
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->i:I

    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->i:I

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->m:Landroid/os/Handler;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    :cond_2
    goto :goto_2

    .line 337
    :catch_0
    move-exception v7

    .line 338
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    :goto_2
    return-void
.end method

.method private b()V
    .locals 5

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    .line 229
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c:Ljava/util/List;

    .line 232
    sget v0, Lcom/huawei/android/sns/R$id;->create_group_act_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->h:Landroid/view/View;

    .line 233
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->h:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 235
    sget v0, Lcom/huawei/android/sns/R$id;->group_act_list_recycler:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e:Landroid/support/v7/widget/RecyclerView;

    .line 236
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 237
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 238
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 239
    new-instance v0, Lo/bim;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->l:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v0, p0, v1, v2}, Lo/bim;-><init>(Landroid/app/Activity;Ljava/util/List;Lcom/huawei/health/sns/model/group/Group;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    .line 240
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 242
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e:Landroid/support/v7/widget/RecyclerView;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$3;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->addOnScrollListener(Landroid/support/v7/widget/RecyclerView$OnScrollListener;)V

    .line 261
    sget v0, Lcom/huawei/android/sns/R$id;->group_manager_bottom:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a:Landroid/widget/RelativeLayout;

    .line 262
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->l:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 263
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView(): group is a null object"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 265
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 272
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a(I)V

    return-void
.end method

.method private c()V
    .locals 6

    .line 275
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 276
    if-eqz v4, :cond_2

    .line 277
    invoke-virtual {v4}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 278
    if-eqz v5, :cond_1

    const-string v0, "EXTRA_HEALTH_GROUP_ACT_LIST_GROUP"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 279
    const-string v0, "EXTRA_HEALTH_GROUP_ACT_LIST_GROUP"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->l:Lcom/huawei/health/sns/model/group/Group;

    .line 280
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->l:Lcom/huawei/health/sns/model/group/Group;

    if-nez v0, :cond_0

    .line 281
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->finish()V

    .line 282
    return-void

    .line 284
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->l:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->p:J

    .line 286
    :cond_1
    goto :goto_0

    .line 287
    :cond_2
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "intent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->finish()V

    .line 289
    return-void

    .line 291
    :goto_0
    return-void
.end method

.method private c(Landroid/content/Intent;)V
    .locals 4

    .line 210
    if-eqz p1, :cond_1

    const-string v0, "activityId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 211
    const-string v0, "activityId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 212
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 213
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 214
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    .line 215
    if-eqz v3, :cond_0

    .line 216
    invoke-virtual {v3}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 217
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 218
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    invoke-virtual {v0}, Lo/bim;->notifyDataSetChanged()V

    .line 219
    goto :goto_1

    .line 213
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 225
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V
    .locals 0

    .line 50
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->g:I

    return v0
.end method

.method private d()V
    .locals 3

    .line 154
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->n:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;

    .line 155
    new-instance v2, Landroid/content/IntentFilter;

    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 156
    const-string v0, "ACTION_MODIFY_GROUP_ACTIVITY_SUCC"

    invoke-virtual {v2, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->n:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 158
    return-void
.end method

.method private e(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;
    .locals 4

    .line 349
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 350
    const/4 v0, 0x0

    return-object v0

    .line 352
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

    .line 353
    return-object v3
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;)Lo/bim;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d:Lo/bim;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 198
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createEventResult:\u6d3b\u52a8\u6709\u66f4\u65b0\uff0c\u5237\u65b0\u5217\u8868"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 200
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->g:I

    .line 201
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->i:I

    .line 202
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a(I)V

    .line 203
    return-void
.end method

.method private h()V
    .locals 3

    .line 369
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 370
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->l:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 372
    const/16 v0, 0x59

    invoke-virtual {p0, v2, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 373
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 174
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 175
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult isRestore:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->o:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->o:Z

    if-eqz v0, :cond_0

    .line 177
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->o:Z

    .line 178
    return-void

    .line 180
    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    .line 181
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 183
    :sswitch_0
    invoke-direct {p0, p3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c(Landroid/content/Intent;)V

    .line 184
    goto :goto_0

    .line 186
    :sswitch_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->e()V

    .line 187
    .line 192
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

    .line 359
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->h:Landroid/view/View;

    if-ne p1, v0, :cond_0

    .line 360
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->h()V

    .line 362
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 134
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 135
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    iput-object p0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->f:Landroid/content/Context;

    .line 137
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_group_act_list:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->setContentView(I)V

    .line 138
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->c()V

    .line 139
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->b()V

    .line 140
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->a(I)V

    .line 141
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->d()V

    .line 142
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 146
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->f:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->n:Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity$e;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 148
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 162
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 163
    const-string v0, "Group_HealthGroupActListActiv"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onRestoreInstanceState"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActListActivity;->o:Z

    .line 165
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 169
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 170
    return-void
.end method
