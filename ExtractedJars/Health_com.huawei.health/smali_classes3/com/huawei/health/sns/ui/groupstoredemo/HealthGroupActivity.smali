.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$b;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Landroid/widget/TextView;

.field private C:Lo/egd;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/TextView;

.field private J:Landroid/widget/TextView;

.field private K:Lo/bin;

.field private L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private M:Lo/bij;

.field private N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;"
        }
    .end annotation
.end field

.field private O:Lo/egd;

.field private P:Lo/egd;

.field private Q:Lo/egd;

.field private R:Lo/egd;

.field private S:Lo/egd;

.field private T:Lo/egd;

.field private U:Landroid/widget/LinearLayout;

.field private V:Landroid/widget/LinearLayout;

.field private W:Lo/egd;

.field private X:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/egd;>;"
        }
    .end annotation
.end field

.field private Y:Landroid/widget/ImageView;

.field private Z:Landroid/widget/RelativeLayout;

.field private a:Landroid/app/Activity;

.field private aa:Landroid/widget/TextView;

.field private ab:Lo/egd;

.field private ac:Landroid/widget/TextView;

.field private ad:J

.field private ae:Ljava/lang/String;

.field private af:Lcom/huawei/health/sns/model/group/Group;

.field private ag:[Ljava/lang/String;

.field private ah:Landroid/widget/LinearLayout;

.field private ai:Z

.field private aj:Landroid/widget/RelativeLayout;

.field private ak:Ljava/lang/String;

.field private al:Ljava/lang/String;

.field private am:[Ljava/lang/String;

.field private an:I

.field private ao:Ljava/lang/Long;

.field private ap:Ljava/lang/String;

.field private aq:Ljava/lang/Long;

.field private ar:Landroid/os/Handler;

.field private as:Ljava/lang/String;

.field private at:Z

.field private au:Ljava/lang/String;

.field private av:Ljava/lang/String;

.field private aw:Ljava/lang/String;

.field private b:Lo/elz;

.field private c:Landroid/widget/ImageView;

.field private d:Landroid/view/View;

.field private e:Landroid/content/Intent;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/support/v7/widget/RecyclerView;

.field private u:Landroid/support/v7/widget/RecyclerView;

.field private v:Landroid/view/View;

.field private w:Lo/elp;

.field private x:Landroid/view/View;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    .line 155
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 160
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    .line 161
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->am:[Ljava/lang/String;

    .line 166
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->al:Ljava/lang/String;

    .line 167
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ai:Z

    .line 168
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 169
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    .line 176
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->an:I

    .line 235
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$b;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ar:Landroid/os/Handler;

    .line 241
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->at:Z

    .line 785
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    .line 786
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    .line 787
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/app/Activity;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    return-object v0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;"
        }
    .end annotation

    .line 604
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 606
    const-string v5, ""

    .line 607
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 608
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    .line 610
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 611
    const-string v0, "rank_date_by_month"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 612
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getGroupRankListByMonth"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 613
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    invoke-static {v0, p2}, Lo/bht;->c(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 614
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    goto :goto_0

    .line 615
    :cond_1
    const-string v0, "rank_date_by_week"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 616
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getGroupRankListByWeek"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 617
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    invoke-static {v0, p2}, Lo/bht;->e(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 618
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    goto :goto_0

    .line 620
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getGroupRankListByDay"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 621
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    invoke-static {p2}, Lo/bht;->d(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 622
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/bht;->g(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    .line 625
    :cond_3
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 626
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupRankList is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 628
    :cond_4
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupRankList result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    :goto_1
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 632
    const-string v0, "resultCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 633
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 634
    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 636
    const-string v0, "groupRankList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 637
    const/4 v9, 0x0

    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_5

    .line 638
    new-instance v10, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    invoke-direct {v10}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;-><init>()V

    .line 639
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 640
    const-string v0, "huid"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setHuid(J)V

    .line 641
    const-string v0, "distance"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDistance(J)V

    .line 642
    const-string v0, "duration"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDuration(J)V

    .line 643
    const-string v0, "steps"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setSteps(J)V

    .line 644
    const-string v0, "userNickname"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setNickName(Ljava/lang/String;)V

    .line 645
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 637
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 651
    :cond_5
    goto :goto_3

    .line 649
    :catch_0
    move-exception v6

    .line 650
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 656
    :goto_3
    return-object v4
.end method

.method private a()V
    .locals 6

    .line 549
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e:Landroid/content/Intent;

    .line 550
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e:Landroid/content/Intent;

    if-eqz v0, :cond_2

    .line 551
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 552
    if-eqz v5, :cond_1

    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 553
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    .line 555
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 556
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getCreateTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    .line 557
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 558
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ae:Ljava/lang/String;

    .line 559
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    .line 560
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupDesc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aw:Ljava/lang/String;

    goto :goto_0

    .line 562
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initData  group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 565
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e:Landroid/content/Intent;

    const-string v1, "EXTRA_GROUP_ID"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 567
    :goto_0
    goto :goto_1

    .line 568
    :cond_2
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIntent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 570
    return-void

    .line 573
    :goto_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    .line 574
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 575
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    .line 576
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 577
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 578
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_STEPS"

    .line 577
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 580
    :cond_3
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_time_period"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    .line 581
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 582
    const-string v0, "rank_date_by_day"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    .line 583
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 584
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 585
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_time_period"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rank_date_by_day"

    .line 584
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 587
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 588
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    .line 589
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 590
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 591
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    .line 590
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 594
    :cond_5
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->L:Ljava/util/List;

    .line 596
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->N:Ljava/util/List;

    .line 597
    return-void
.end method

.method private a(Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V
    .locals 9

    .line 1211
    if-eqz p1, :cond_2

    .line 1212
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1214
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1215
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1214
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1216
    goto/16 :goto_0

    .line 1218
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1219
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1218
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1220
    goto/16 :goto_0

    .line 1222
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_bike:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1223
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1222
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1224
    goto :goto_0

    .line 1226
    :sswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1227
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1228
    goto :goto_0

    .line 1230
    :sswitch_4
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1231
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1232
    goto :goto_0

    .line 1234
    :sswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_ride:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1235
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1236
    goto :goto_0

    .line 1238
    :sswitch_6
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swim:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1239
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1240
    goto :goto_0

    .line 1242
    :sswitch_7
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1244
    .line 1248
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityStatus()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1249
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1250
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->J:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 1252
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->J:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1255
    :cond_2
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
        0x67 -> :sswitch_2
        0xc9 -> :sswitch_3
        0xca -> :sswitch_4
        0xcb -> :sswitch_5
        0xcc -> :sswitch_7
        0xcd -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Landroid/view/View;)V

    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 1260
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1261
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->e(Ljava/util/List;)V

    goto :goto_0

    .line 1262
    :cond_0
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1263
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->a(Ljava/util/List;)V

    goto :goto_0

    .line 1265
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->d(Ljava/util/List;)V

    .line 1267
    :goto_0
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Ljava/util/List;)V

    .line 1268
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ai:Z

    return p1
.end method

.method private b(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    .line 1100
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1101
    const-string v0, "0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1102
    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p1, v0, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1104
    :cond_0
    return-object v1
.end method

.method private b()V
    .locals 4

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$5;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "healthwalk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_walking:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 453
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_run:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 455
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 456
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 457
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 458
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_type_group_type_workout:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 459
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 460
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id10:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 461
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 462
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_device_setting_other:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 465
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 469
    :cond_6
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aw:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aw:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 472
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->D:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_has_no_description:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_9

    .line 479
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aw:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->C:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 481
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->C:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 483
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->C:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 486
    :cond_9
    :goto_2
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 5

    .line 895
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 896
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 897
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->N:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 898
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "====refreshRankView()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 899
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getScrollState()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->isComputingLayout()Z

    move-result v0

    if-nez v0, :cond_0

    .line 900
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0}, Lo/bij;->notifyDataSetChanged()V

    goto :goto_0

    .line 902
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupRank: \u754c\u9762\u5904\u4e8e\u6ed1\u52a8\u6216\u8005\u6d4b\u91cf\u4e2d\uff0c\u6570\u636e\u5237\u65b0\u5f02\u5e38"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 904
    :goto_0
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 7

    .line 1521
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_rank_type:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1522
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->w:Lo/elp;

    .line 1523
    sget v0, Lcom/huawei/android/sns/R$id;->line_distance_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 1524
    sget v0, Lcom/huawei/android/sns/R$id;->txt_distance_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 1525
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "run"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1526
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1527
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1528
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1529
    :cond_2
    const-string v0, "swimming"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1530
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1531
    :cond_3
    const-string v0, "riding"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1532
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1534
    :cond_4
    :goto_0
    const-string v0, "RANK_TYPE_STEPS"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1535
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_unchecked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 1537
    :cond_5
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_checked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1540
    :goto_1
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1577
    sget v0, Lcom/huawei/android/sns/R$id;->line_step_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 1578
    const-string v0, "RANK_TYPE_STEPS"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1579
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_checked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 1581
    :cond_6
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_unchecked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1583
    :goto_2
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1594
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->w:Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 1596
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d()V

    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 660
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 661
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    new-instance v6, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;

    invoke-direct {v6, p0, p1, v7}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$2;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual/range {v0 .. v6}, Lo/bht;->b(JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 703
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    return-object p1
.end method

.method private c()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 711
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getGroupMemList"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 713
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 714
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupMemList is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 716
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupMemList result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    :goto_0
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 720
    const-string v0, "resultCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 721
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 722
    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 723
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ar:Landroid/os/Handler;

    const v1, 0x8006

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 724
    const-string v0, "groupMemberList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 725
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 726
    new-instance v10, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 727
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 728
    const-string v0, "groupId"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 729
    const-string v0, "userId"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 730
    const-string v0, "state"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 731
    const-string v0, "isManager"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setManager(Z)V

    .line 732
    const-string v0, "joinTime"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 733
    const-string v0, "userNickname"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 734
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 725
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 740
    :cond_1
    goto :goto_2

    .line 738
    :catch_0
    move-exception v6

    .line 739
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 741
    :goto_2
    return-object v4
.end method

.method private c(Landroid/view/View;)V
    .locals 5

    .line 1384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1385
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 1386
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getLocationOnScreen([I)V

    .line 1387
    const/4 v0, 0x1

    aget v0, v3, v0

    sub-int v0, v2, v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v1

    sub-int v4, v0, v1

    .line 1388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v1, 0x43200000    # 160.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 1389
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ai:Z

    .line 1390
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b:Lo/elz;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$8;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$8;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Lo/elz;->post(Ljava/lang/Runnable;)Z

    .line 1396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b:Lo/elz;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$7;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lo/elz;->setScrollViewListener(Lo/ely;)V

    goto :goto_0

    .line 1410
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    if-ne p1, v0, :cond_1

    .line 1411
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Landroid/view/View;)V

    goto :goto_0

    .line 1412
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x:Landroid/view/View;

    if-ne p1, v0, :cond_2

    .line 1413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Landroid/view/View;)V

    .line 1416
    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/util/List;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Ljava/util/List;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/os/Handler;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ar:Landroid/os/Handler;

    return-object v0
.end method

.method private d()V
    .locals 16

    .line 492
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 493
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const v2, 0x44116000    # 581.5f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    goto :goto_0

    .line 495
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v2, 0x432a0000    # 170.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 497
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v3

    .line 498
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v4

    .line 499
    const/4 v0, 0x3

    if-le v4, v0, :cond_1

    .line 500
    const/4 v4, 0x3

    .line 502
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v5

    .line 503
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v6

    .line 504
    const-string v7, ""

    .line 505
    const/4 v8, 0x0

    .line 507
    if-eqz v4, :cond_2

    .line 508
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v4, :cond_2

    .line 509
    invoke-virtual {v3, v10}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v9

    .line 510
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 511
    move v8, v9

    .line 508
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 515
    :cond_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 516
    invoke-virtual {v6, v7}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v10

    .line 518
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 519
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const v1, 0x44116000    # 581.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v10

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    sub-float v11, v0, v1

    goto :goto_2

    .line 521
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v1, 0x432a0000    # 170.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v10

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    sub-float v11, v0, v1

    .line 523
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v12

    .line 524
    new-instance v13, Landroid/widget/RelativeLayout$LayoutParams;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v13, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 525
    div-int v14, v5, v4

    .line 526
    sub-int v0, v5, v14

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v1

    sub-int v1, v14, v1

    div-int/lit8 v1, v1, 0x2

    add-int v15, v0, v1

    .line 527
    int-to-float v0, v12

    cmpl-float v0, v11, v0

    if-ltz v0, :cond_4

    .line 528
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 529
    iput v15, v13, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    goto :goto_4

    .line 531
    :cond_4
    const/4 v0, 0x3

    if-ne v4, v0, :cond_5

    .line 532
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v1, 0x432a0000    # 170.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    sub-int/2addr v0, v12

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 533
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 534
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const v1, 0x44116000    # 581.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    sub-int/2addr v0, v12

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    goto :goto_3

    .line 537
    :cond_5
    const/4 v0, 0x0

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 539
    :cond_6
    :goto_3
    iput v5, v13, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 541
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 543
    :cond_7
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 11

    .line 1144
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupAct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1147
    new-instance v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-direct {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;-><init>()V

    .line 1148
    const-string v0, "1000"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityId(Ljava/lang/String;)V

    .line 1149
    const-string v0, "\u5feb\u4e50\u6d41\u6c57\uff0c\u8f7b\u677e\u8dd1\u6b65\uff01"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityName(Ljava/lang/String;)V

    .line 1150
    const/16 v0, 0x66

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityType(I)V

    .line 1151
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setGoalValue(D)V

    .line 1152
    const-string v0, "\u7231\u8dd1\u6b65\uff0c\u7231\u5065\u5eb7\uff01"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setDetails(Ljava/lang/String;)V

    .line 1153
    const-string v0, "file:///android_asset/healthgroup/pic_activity_Challenge.png"

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setImgUrl(Ljava/lang/String;)V

    .line 1154
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setBeginTime(Ljava/lang/String;)V

    .line 1155
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setEndTime(Ljava/lang/String;)V

    .line 1156
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v2, 0x9a7ec800L

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setLastTime(Ljava/lang/String;)V

    .line 1157
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setNumberOfPeople(I)V

    .line 1158
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityStatus(I)V

    .line 1159
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setStatus(I)V

    .line 1162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->z:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aa:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1164
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ah:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ab:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1167
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->z:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_user_profile_more:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1168
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1170
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->z:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$3;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1178
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->r:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1179
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->r:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;

    invoke-direct {v1, p0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$6;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1189
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getImgUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->A:Landroid/widget/ImageView;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 1192
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1194
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1195
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1199
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_underway:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 1200
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->I:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1201
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->H:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1203
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V

    .line 1204
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 7

    .line 1437
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_rank_date:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 1438
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->w:Lo/elp;

    .line 1439
    sget v0, Lcom/huawei/android/sns/R$id;->ll_rank_by_month:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 1440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    const-string v1, "rank_date_by_month"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1441
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_checked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 1443
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_unchecked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1445
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$10;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$10;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1463
    sget v0, Lcom/huawei/android/sns/R$id;->ll_rank_by_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 1464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    const-string v1, "rank_date_by_week"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1465
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_middle_item_checked_bg:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 1467
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_middle_item_unchecked_bg:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1469
    :goto_1
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$9;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1487
    sget v0, Lcom/huawei/android/sns/R$id;->ll_rank_by_day:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 1488
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    const-string v1, "rank_date_by_day"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1489
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_checked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 1491
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_unchecked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 1493
    :goto_2
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity$11;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1514
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->w:Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 1515
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Landroid/view/View;)V

    return-void
.end method

.method private d(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 1274
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "upstickSelfAndSetRankNumb start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1275
    if-nez p1, :cond_0

    .line 1276
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGroupRankList == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1277
    return-void

    .line 1280
    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1281
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 1282
    if-nez v5, :cond_1

    .line 1283
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGroupRank == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1284
    goto :goto_1

    .line 1286
    :cond_1
    add-int/lit8 v0, v4, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setRankNumb(I)V

    .line 1280
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1290
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_3

    .line 1291
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "healthGroupRankList.size() <= 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1292
    return-void

    .line 1296
    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_5

    .line 1297
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->getHuid()J

    move-result-wide v0

    const-wide v2, 0x5d471fdcb4e9480L

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 1298
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1299
    goto :goto_3

    .line 1296
    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 1302
    :cond_5
    :goto_3
    return-void
.end method

.method private d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1047
    const/4 v4, 0x0

    .line 1048
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1049
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1050
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 1051
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 1053
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v6, v0

    .line 1054
    invoke-virtual {v5, p2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1057
    goto :goto_0

    .line 1055
    :catch_0
    move-exception v8

    .line 1056
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sdf.parse() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1058
    :goto_0
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1059
    const/4 v4, 0x0

    goto :goto_1

    .line 1060
    :cond_0
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 1061
    const/4 v4, 0x1

    .line 1063
    :cond_1
    :goto_1
    goto :goto_2

    .line 1064
    :cond_2
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "date1 or date2 is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1066
    :goto_2
    return v4
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x3
    .end annotation

    .line 319
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elz;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b:Lo/elz;

    .line 321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_img:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c:Landroid/widget/ImageView;

    .line 322
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v1}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v1

    const-string v2, "pic_round_group_default"

    invoke-virtual {v1, v2}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 323
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 324
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->iv_group_head_grey:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k:Landroid/widget/ImageView;

    .line 325
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 326
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->iv_group_head_background:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->g:Landroid/widget/ImageView;

    .line 327
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_rl:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Z:Landroid/widget/RelativeLayout;

    .line 328
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_name_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    .line 329
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ae:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_id_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->m:Landroid/widget/TextView;

    .line 331
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->m:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_qr_img:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d:Landroid/view/View;

    .line 333
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 334
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->g:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->g:Landroid/widget/ImageView;

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 337
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->g:Landroid/widget/ImageView;

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v2}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v2

    const-string v3, "pic_group_default"

    invoke-virtual {v2, v3}, Lo/bht;->c(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 340
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_type_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l:Landroid/widget/TextView;

    .line 341
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_profile_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->D:Landroid/widget/TextView;

    .line 342
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_add_group_profile:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->C:Lo/egd;

    .line 343
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b()V

    .line 346
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->p:Landroid/widget/TextView;

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_number:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o:Landroid/widget/TextView;

    .line 348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_list_recycler:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->t:Landroid/support/v7/widget/RecyclerView;

    .line 349
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->L:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xc8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 350
    new-instance v0, Lo/bin;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->L:Ljava/util/List;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bin;-><init>(Landroid/content/Context;Ljava/util/List;J)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->K:Lo/bin;

    .line 352
    new-instance v5, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/4 v1, 0x6

    invoke-direct {v5, v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->t:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->K:Lo/bin;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->t:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_more_arrow:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->f:Landroid/widget/ImageView;

    .line 356
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 359
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->f:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 361
    :goto_0
    sget v0, Lcom/huawei/android/sns/R$id;->group_member_lly:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->s:Landroid/widget/LinearLayout;

    .line 362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 365
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_activity_line:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->r:Landroid/widget/RelativeLayout;

    .line 366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->no_group_activity_line:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->q:Landroid/widget/LinearLayout;

    .line 367
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->no_group_activity_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->n:Landroid/widget/TextView;

    .line 368
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->create_group_act_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->z:Landroid/widget/TextView;

    .line 369
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->z:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 370
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_manager_no_activity_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aa:Landroid/widget/TextView;

    .line 371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_manager_create_activity_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ab:Lo/egd;

    .line 372
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_group_manager_create_activity_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ah:Landroid/widget/LinearLayout;

    .line 373
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ab:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->img_activity:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->A:Landroid/widget/ImageView;

    .line 375
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->img_act_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->j:Landroid/widget/ImageView;

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 377
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 379
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->j:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 381
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->txt_act_name:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->B:Landroid/widget/TextView;

    .line 382
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->txt_act_data_status:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->H:Landroid/widget/TextView;

    .line 383
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->activity_rule_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->E:Landroid/widget/TextView;

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->activity_state:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->I:Landroid/widget/TextView;

    .line 385
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->sign_up_tag_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->J:Landroid/widget/TextView;

    .line 386
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_activity_more_arrow:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->h:Landroid/widget/ImageView;

    .line 387
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 388
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 390
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->h:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 395
    :goto_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_raning_recycle_view:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    .line 396
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_ranking_lly:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->y:Landroid/widget/LinearLayout;

    .line 397
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_choose_sport_type:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    .line 398
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_choose_sport_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x:Landroid/view/View;

    .line 399
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 400
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_rank_by_day:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->U:Landroid/widget/LinearLayout;

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_show_rank_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->V:Landroid/widget/LinearLayout;

    .line 402
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->txt_group_rank_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ac:Landroid/widget/TextView;

    .line 404
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->text_show_sport_type:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->text_show_sport_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    .line 406
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->iv_sport_type_arrow_down:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_6days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->S:Lo/egd;

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->S:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_5days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->P:Lo/egd;

    .line 411
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->P:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_4days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Q:Lo/egd;

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Q:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_3days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->R:Lo/egd;

    .line 415
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->R:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 416
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_2days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->O:Lo/egd;

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->O:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 418
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_last_day:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->W:Lo/egd;

    .line 419
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->W:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 420
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_today:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->T:Lo/egd;

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->T:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 422
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->n()V

    .line 423
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->g()V

    .line 425
    new-instance v0, Lo/bij;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->N:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/bij;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    .line 426
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 427
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 433
    sget v0, Lcom/huawei/android/sns/R$id;->layout_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aj:Landroid/widget/RelativeLayout;

    .line 434
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->f()V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 6

    .line 1424
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k()V

    .line 1425
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    .line 1426
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o()V

    .line 1427
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 1429
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1428
    invoke-static {v0, v1, v2, p1, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1430
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i()V

    .line 1431
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;Z)Z
    .locals 0

    .line 89
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->at:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/view/View;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 754
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeProgressOnloading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aj:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 756
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 757
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/view/View;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x:Landroid/view/View;

    return-object v0
.end method

.method private g()V
    .locals 2

    .line 910
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 911
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "healthwalk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 912
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 913
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto/16 :goto_0

    .line 914
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 915
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 916
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 917
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 918
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 919
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 920
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 921
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 922
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 923
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 925
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 926
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 927
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 928
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 929
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 930
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 931
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 932
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0

    .line 935
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Y:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 936
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 937
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 939
    :cond_6
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->h()V

    .line 940
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Lo/elz;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b:Lo/elz;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 946
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 947
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 948
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    goto/16 :goto_0

    .line 950
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 951
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 952
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 953
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 955
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 956
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    goto/16 :goto_0

    .line 958
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 959
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 960
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 962
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 963
    const-string v0, "RANK_TYPE_RIDING_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    goto/16 :goto_0

    .line 965
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 966
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 967
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 969
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 970
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    goto/16 :goto_0

    .line 972
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 973
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 974
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 976
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 977
    const-string v0, "RANK_TYPE_SWIMMING_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    goto :goto_0

    .line 979
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 980
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 981
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    goto :goto_0

    .line 984
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 985
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 987
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 988
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    .line 992
    :cond_b
    :goto_0
    return-void
.end method

.method private i()V
    .locals 8

    .line 815
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    .line 816
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 817
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    .line 818
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 819
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_STEPS"

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 821
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_time_period"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    .line 822
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 823
    const-string v0, "rank_date_by_day"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    .line 824
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 825
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_time_period"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rank_date_by_day"

    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 827
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    .line 828
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 829
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    .line 830
    new-instance v6, Lo/dcy;

    invoke-direct {v6}, Lo/dcy;-><init>()V

    .line 831
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    .line 832
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    .line 831
    invoke-static {v0, v1, v2, v3, v6}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 834
    :cond_2
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 835
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0}, Lo/bij;->e()V

    .line 836
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 837
    :cond_3
    const-string v0, "RANK_TYPE_RIDING_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 838
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0}, Lo/bij;->c()V

    .line 839
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 840
    :cond_4
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 841
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0}, Lo/bij;->d()V

    .line 842
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 843
    :cond_5
    const-string v0, "RANK_TYPE_SWIMMING_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 844
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0}, Lo/bij;->a()V

    .line 845
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 846
    :cond_6
    const-string v0, "RANK_TYPE_STEPS"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 847
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->M:Lo/bij;

    invoke-virtual {v0}, Lo/bij;->b()V

    .line 848
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 857
    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    const-string v1, "rank_date_by_month"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 858
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->U:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 859
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->V:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 860
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_month:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 861
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/bht;->c(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 862
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    goto/16 :goto_1

    .line 863
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    const-string v1, "rank_date_by_week"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 864
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->V:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 865
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->U:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 866
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_week:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 867
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/bht;->e(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 868
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    goto :goto_1

    .line 870
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->U:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 871
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->V:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 872
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_day:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 873
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-static {v0}, Lo/bht;->d(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    .line 874
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bht;->g(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    .line 875
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o()V

    .line 880
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aq:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ao:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const/16 v5, 0x14

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v6

    .line 881
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 882
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ac:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 885
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->au:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    .line 891
    invoke-direct {p0, v7}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Ljava/util/List;)V

    .line 893
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ai:Z

    return v0
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->G:Landroid/widget/TextView;

    return-object v0
.end method

.method private k()V
    .locals 2

    .line 763
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aj:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 764
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 765
    return-void
.end method

.method private l()V
    .locals 3

    .line 1599
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1600
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1601
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 1602
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)[Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->U:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private m()V
    .locals 6

    .line 1608
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupQR groupid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1609
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1610
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 1611
    const-string v0, "bundleKeyGroupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 1612
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1613
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 1614
    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->V:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private n()V
    .locals 2

    .line 998
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 999
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->T:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->W:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1001
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->O:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1002
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->R:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1003
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Q:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1004
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->P:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1005
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->S:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1008
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->p()V

    .line 1010
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o()V

    .line 1011
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Landroid/widget/TextView;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->F:Landroid/widget/TextView;

    return-object v0
.end method

.method private o()V
    .locals 6

    .line 1017
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1018
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1019
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " groupCreateTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1020
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ak:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1021
    if-eqz v5, :cond_1

    .line 1022
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 1023
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 1024
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1025
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_rank_by_day_button_checked_bg:I

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundResource(I)V

    goto :goto_1

    .line 1027
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_rank_by_day_button_unchecked_bg:I

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundResource(I)V

    goto :goto_1

    .line 1030
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 1031
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 1018
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_2
    goto :goto_2

    .line 1035
    :cond_3
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " currentRankDate is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1037
    :goto_2
    return-void
.end method

.method private p()V
    .locals 7

    .line 1073
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1074
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 1075
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    array-length v0, v0

    if-ge v6, v0, :cond_1

    .line 1076
    if-nez v6, :cond_0

    .line 1077
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1078
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->am:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    aget-object v1, v1, v6

    const/16 v2, 0x8

    const/16 v3, 0xa

    invoke-direct {p0, v1, v2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1079
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_today:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 1080
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    goto :goto_1

    .line 1082
    :cond_0
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1084
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->am:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    aget-object v1, v1, v6

    const/16 v2, 0x8

    const/16 v3, 0xa

    invoke-direct {p0, v1, v2, v3}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->b(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1085
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->X:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->am:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 1075
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1088
    :cond_1
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentRankDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->k()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i()V

    return-void
.end method

.method static synthetic r(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Lo/elp;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->w:Lo/elp;

    return-object v0
.end method

.method private r()V
    .locals 4

    .line 1617
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1618
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1619
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1620
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1621
    return-void
.end method

.method static synthetic s(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->as:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic t(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)V
    .locals 0

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->o()V

    return-void
.end method

.method static synthetic u(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)J
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ad:J

    return-wide v0
.end method

.method static synthetic x(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->av:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic y(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1345
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->d:Landroid/view/View;

    if-ne p1, v0, :cond_0

    .line 1346
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->m()V

    goto/16 :goto_0

    .line 1347
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->s:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 1348
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->r()V

    goto/16 :goto_0

    .line 1349
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    if-ne p1, v0, :cond_2

    .line 1350
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->v:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Landroid/view/View;)V

    goto/16 :goto_0

    .line 1351
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x:Landroid/view/View;

    if-ne p1, v0, :cond_3

    .line 1352
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->x:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->c(Landroid/view/View;)V

    goto/16 :goto_0

    .line 1353
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->z:Landroid/widget/TextView;

    if-eq p1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ab:Lo/egd;

    if-ne p1, v0, :cond_5

    .line 1354
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->l()V

    goto/16 :goto_0

    .line 1355
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->C:Lo/egd;

    if-ne p1, v0, :cond_6

    .line 1356
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1357
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->af:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1358
    const-string v0, "groupDesc"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->aw:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1359
    const-string v0, "groupType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ap:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1360
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1361
    goto/16 :goto_0

    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->S:Lo/egd;

    if-ne p1, v0, :cond_7

    .line 1362
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1363
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->P:Lo/egd;

    if-ne p1, v0, :cond_8

    .line 1364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1365
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->Q:Lo/egd;

    if-ne p1, v0, :cond_9

    .line 1366
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1367
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->R:Lo/egd;

    if-ne p1, v0, :cond_a

    .line 1368
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1369
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->O:Lo/egd;

    if-ne p1, v0, :cond_b

    .line 1370
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1371
    :cond_b
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->W:Lo/egd;

    if-ne p1, v0, :cond_c

    .line 1372
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    goto :goto_0

    .line 1373
    :cond_c
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->T:Lo/egd;

    if-ne p1, v0, :cond_d

    .line 1374
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ag:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e(Ljava/lang/String;)V

    .line 1376
    :cond_d
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 302
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 303
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->setContentView(I)V

    .line 304
    iput-object p0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a:Landroid/app/Activity;

    .line 305
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->a()V

    .line 306
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->e()V

    .line 308
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 309
    const v0, 0x8002

    iput v0, v1, Landroid/os/Message;->what:I

    .line 310
    const/4 v0, 0x0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 311
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->ar:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 312
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 746
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 747
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 771
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 772
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupActivity;->i()V

    .line 773
    return-void
.end method
