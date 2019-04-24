.class public Lcom/huawei/health/sns/ui/group/HealthGroupActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;,
        Lcom/huawei/health/sns/ui/group/HealthGroupActivity$c;
    }
.end annotation


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Landroid/widget/ImageView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/view/View;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/TextView;

.field private G:Landroid/widget/TextView;

.field private H:Landroid/widget/TextView;

.field private I:Landroid/widget/TextView;

.field private J:Landroid/widget/TextView;

.field private K:Lo/bho;

.field private L:Landroid/widget/TextView;

.field private M:Landroid/widget/TextView;

.field private N:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private O:Lo/egd;

.field private P:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;"
        }
    .end annotation
.end field

.field private Q:Lo/egd;

.field private R:Lo/bhr;

.field private S:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;"
        }
    .end annotation
.end field

.field private T:Lo/egd;

.field private U:Lo/egd;

.field private V:Lo/egd;

.field private W:Lo/egd;

.field private X:Lo/egd;

.field private Y:Landroid/widget/LinearLayout;

.field private Z:Landroid/widget/ImageView;

.field private a:Landroid/view/View;

.field private aA:Ljava/lang/String;

.field private aB:Ljava/lang/String;

.field private aD:Ljava/lang/String;

.field private aE:Ljava/lang/String;

.field private aa:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/egd;>;"
        }
    .end annotation
.end field

.field private ab:Landroid/widget/LinearLayout;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/TextView;

.field private ae:Landroid/widget/TextView;

.field private af:Landroid/widget/RelativeLayout;

.field private ag:Landroid/widget/RelativeLayout;

.field private ah:Lo/egd;

.field private ai:Lcom/huawei/health/sns/model/group/Group;

.field private aj:Landroid/widget/LinearLayout;

.field private ak:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

.field private al:[Ljava/lang/String;

.field private am:J

.field private an:Landroid/widget/RelativeLayout;

.field private ao:[Ljava/lang/String;

.field private ap:Lo/egn;

.field private aq:Ljava/lang/String;

.field private ar:Ljava/lang/String;

.field private as:Landroid/os/Handler;

.field private at:Z

.field private au:Lo/bgn;

.field private av:Lo/bgp;

.field private aw:I

.field private ax:Ljava/lang/String;

.field private ay:Ljava/lang/String;

.field private az:Z

.field private b:Lo/elz;

.field private c:Landroid/app/Activity;

.field private d:Lo/emr;

.field private e:Landroid/content/Intent;

.field private f:Landroid/widget/ImageView;

.field private g:Landroid/widget/ImageView;

.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/ImageView;

.field private j:Lo/egd;

.field private k:Landroid/widget/ImageView;

.field private l:Landroid/widget/TextView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/support/v7/widget/RecyclerView;

.field private s:Landroid/widget/LinearLayout;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/support/v7/widget/RecyclerView;

.field private v:Landroid/widget/TextView;

.field private w:Lo/elp;

.field private x:Landroid/view/View;

.field private y:Landroid/widget/LinearLayout;

.field private z:Landroid/widget/RelativeLayout;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    .line 172
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 176
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    .line 177
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ao:[Ljava/lang/String;

    .line 180
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ap:Lo/egn;

    .line 183
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aq:Ljava/lang/String;

    .line 184
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->at:Z

    .line 196
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    .line 271
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$c;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$c;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    .line 278
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->az:Z

    .line 973
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 974
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 975
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    return-void
.end method

.method static synthetic A(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/view/View;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    return-object v0
.end method

.method private A()V
    .locals 3

    .line 2140
    new-instance v0, Lo/atg;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atg;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v0, v1, v2}, Lo/atg;->e(J)V

    .line 2141
    return-void
.end method

.method static synthetic B(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    return-object v0
.end method

.method private B()V
    .locals 6

    .line 2498
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupQR groupid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2499
    new-instance v4, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/twodimcode/HealthTwoDimCodeActivity;

    invoke-direct {v4, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2500
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 2501
    const-string v0, "bundleKeyGroupId"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 2502
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 2503
    invoke-virtual {p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 2504
    return-void
.end method

.method static synthetic C(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ab:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private C()V
    .locals 5

    .line 2190
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    const/16 v3, 0x351

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 2191
    return-void
.end method

.method private D()V
    .locals 3

    .line 2133
    new-instance v0, Lo/ate;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/ate;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    const/16 v2, 0x343

    invoke-virtual {v0, v2, v1}, Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V

    .line 2134
    return-void
.end method

.method static synthetic D(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)[Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic E(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h()V

    return-void
.end method

.method static synthetic F(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v()V

    return-void
.end method

.method static synthetic G(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic H(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic I(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    return-object v0
.end method

.method private I()V
    .locals 4

    .line 2507
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupMembListActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2508
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 2509
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x2

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2510
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 2511
    return-void
.end method

.method private a(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;
    .locals 6

    .line 1900
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1901
    const/4 v0, 0x0

    return-object v0

    .line 1903
    :cond_0
    new-instance v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;-><init>()V

    .line 1905
    const-string v0, "activityId"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityId(Ljava/lang/String;)V

    .line 1906
    const-string v0, "activityName"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityName(Ljava/lang/String;)V

    .line 1907
    const-string v0, "activityStatus"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityStatus(I)V

    .line 1908
    const-string v0, "activityType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setActivityType(I)V

    .line 1909
    const-string v0, "beginTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setBeginTime(Ljava/lang/String;)V

    .line 1910
    const-string v0, "details"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setDetails(Ljava/lang/String;)V

    .line 1911
    const-string v0, "endTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setEndTime(Ljava/lang/String;)V

    .line 1912
    const-string v0, "goalValue"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setGoalValue(D)V

    .line 1913
    const-string v0, "imgUrl"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setImgUrl(Ljava/lang/String;)V

    .line 1914
    const-string v0, "lastTime"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setLastTime(Ljava/lang/String;)V

    .line 1915
    const-string v0, "numberOfPeople"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setNumberOfPeople(I)V

    .line 1916
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1917
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->setStatus(I)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1921
    :cond_1
    goto :goto_0

    .line 1919
    :catch_0
    move-exception v5

    .line 1920
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!!! HealthServerGroupActivity will be null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1922
    :goto_0
    return-object v4
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aq:Ljava/lang/String;

    return-object p1
.end method

.method private a(I)V
    .locals 3

    .line 1848
    new-instance v2, Lo/aoi;

    invoke-direct {v2}, Lo/aoi;-><init>()V

    .line 1849
    invoke-virtual {v2, p1}, Lo/aoi;->e(I)V

    .line 1850
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/aoi;->a(I)V

    .line 1851
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v2, v0, v1}, Lo/aoi;->a(J)V

    .line 1852
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$3;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$3;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-static {v2, v0}, Lo/aoc;->b(Lo/aoi;Lo/aol;)V

    .line 1893
    return-void
.end method

.method private a(Landroid/os/Message;)V
    .locals 8

    .line 1050
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupRank"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    if-nez p1, :cond_0

    .line 1052
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupRank msg == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1053
    return-void

    .line 1055
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1056
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ad:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1058
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 1059
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshGroupRank handledGroupRankList size is = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1060
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshGroupRank befor clear listHealthGroupRanks size is = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1061
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-direct {p0, v0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/util/List;Ljava/util/List;)Z

    move-result v6

    .line 1062
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "refreshGroupRank -- isNeedRefresh : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1063
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1064
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1066
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshGroupRank after clear listHealthGroupRanks size is = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1067
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "refreshGroupRank listHealthGroupRanks = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1068
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1069
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1071
    new-instance v7, Lo/dcy;

    invoke-direct {v7}, Lo/dcy;-><init>()V

    .line 1072
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1073
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "healthwalk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1074
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1075
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1076
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1077
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_0

    .line 1078
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1079
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1080
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1081
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1083
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->a()V

    .line 1084
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1085
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1086
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_RUN_DISTANCE"

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_0

    .line 1088
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1089
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1090
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1091
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1093
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->c()V

    .line 1094
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1095
    const-string v0, "RANK_TYPE_RIDING_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1096
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_RIDING_DISTANCE"

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_0

    .line 1099
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1100
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1102
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1104
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->d()V

    .line 1105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1106
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1107
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_FITNESS_DURATION"

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_0

    .line 1109
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1111
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1114
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->e()V

    .line 1115
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1116
    const-string v0, "RANK_TYPE_SWIMMING_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1117
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_SWIMMING_DISTANCE"

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto/16 :goto_0

    .line 1119
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1120
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1122
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1123
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    goto :goto_0

    .line 1126
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->b()V

    .line 1128
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1130
    :cond_b
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->a()V

    .line 1131
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1132
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1133
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_USER_SELECT_RANK_TYPE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "RANK_TYPE_RUN_DISTANCE"

    invoke-static {v0, v1, v2, v3, v7}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1136
    :cond_c
    :goto_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 1137
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    .line 1138
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1139
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 1140
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_month"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1141
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1142
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ab:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_month:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1144
    :cond_d
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_week"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1145
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ab:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1146
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Y:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1147
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_week:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 1149
    :cond_e
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Y:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1150
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ab:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1151
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_rank_by_day:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1152
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1153
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    .line 1155
    :cond_f
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v()V

    goto :goto_1

    .line 1158
    :cond_10
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentTimePeriod is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getScrollState()I

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->isComputingLayout()Z

    move-result v0

    if-nez v0, :cond_11

    .line 1162
    if-eqz v6, :cond_12

    .line 1163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0}, Lo/bhr;->notifyDataSetChanged()V

    goto :goto_2

    .line 1166
    :cond_11
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupRank: \u754c\u9762\u5904\u4e8e\u6ed1\u52a8\u6216\u8005\u6d4b\u91cf\u4e2d\uff0c\u6570\u636e\u5237\u65b0\u5f02\u5e38"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1168
    :cond_12
    :goto_2
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 1994
    if-nez p1, :cond_0

    .line 1995
    return-void

    .line 1997
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 1999
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Lcom/huawei/health/sns/model/group/Group;)V

    .line 2001
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2003
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->o:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ID:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2004
    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Landroid/view/View;)V

    return-void
.end method

.method private b()V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x3
    .end annotation

    .line 393
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d:Lo/emr;

    .line 394
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 395
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$5;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 401
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->scroll_view:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/elz;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b:Lo/elz;

    .line 403
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_img:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f:Landroid/widget/ImageView;

    .line 404
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->iv_group_head_grey:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h:Landroid/widget/ImageView;

    .line 405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->iv_group_head_background:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i:Landroid/widget/ImageView;

    .line 406
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_name_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    .line 407
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_id_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->o:Landroid/widget/TextView;

    .line 408
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_type_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    .line 409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_qr_img:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a:Landroid/view/View;

    .line 410
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_profile_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->C:Landroid/widget/TextView;

    .line 413
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_add_group_profile:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->j:Lo/egd;

    .line 415
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d()V

    .line 417
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->m:Landroid/widget/TextView;

    .line 418
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_number:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->p:Landroid/widget/TextView;

    .line 419
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_list_recycler:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    .line 420
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_activity_line:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z:Landroid/widget/RelativeLayout;

    .line 421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->no_group_activity_line:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->q:Landroid/widget/LinearLayout;

    .line 422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->no_group_activity_txt:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n:Landroid/widget/TextView;

    .line 423
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->create_group_act_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    .line 424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_raning_recycle_view:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    .line 426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_ranking_lly:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->y:Landroid/widget/LinearLayout;

    .line 427
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_choose_sport_type:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    .line 428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_choose_sport_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    .line 429
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 430
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_rank_by_day:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Y:Landroid/widget/LinearLayout;

    .line 431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_show_rank_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ab:Landroid/widget/LinearLayout;

    .line 432
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->txt_group_rank_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ac:Landroid/widget/TextView;

    .line 433
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_manager_no_activity_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ae:Landroid/widget/TextView;

    .line 434
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_manager_create_activity_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ah:Lo/egd;

    .line 435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->layout_group_manager_create_activity_btn:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aj:Landroid/widget/LinearLayout;

    .line 436
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ah:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 437
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_head_rl:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->af:Landroid/widget/RelativeLayout;

    .line 440
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_6days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->O:Lo/egd;

    .line 441
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->O:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 442
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_5days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Q:Lo/egd;

    .line 443
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Q:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 444
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_4days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->U:Lo/egd;

    .line 445
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->U:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_3days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->W:Lo/egd;

    .line 447
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->W:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_2days:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->V:Lo/egd;

    .line 449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->V:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_last_day:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->T:Lo/egd;

    .line 451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->T:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->btn_rank_by_today:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->X:Lo/egd;

    .line 453
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->X:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 454
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t()V

    .line 456
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->text_show_sport_type:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    .line 457
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->text_show_sport_date:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    .line 458
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->iv_sport_type_arrow_down:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    .line 460
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->u()V

    .line 462
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->img_activity:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->A:Landroid/widget/ImageView;

    .line 463
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->img_act_more:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->B:Landroid/widget/ImageView;

    .line 464
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 467
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->B:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 469
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->txt_act_name:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->E:Landroid/widget/TextView;

    .line 470
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->txt_act_data_status:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->G:Landroid/widget/TextView;

    .line 472
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->activity_rule_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    .line 473
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->activity_state:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->L:Landroid/widget/TextView;

    .line 474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->sign_up_tag_tv:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->J:Landroid/widget/TextView;

    .line 477
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_more_arrow:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->g:Landroid/widget/ImageView;

    .line 478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 479
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 481
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->g:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 483
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$id;->group_member_activity_more_arrow:I

    invoke-static {v0, v1}, Lo/enc;->c(Landroid/app/Activity;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k:Landroid/widget/ImageView;

    .line 484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 485
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->common_ui_arrow_left:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_2

    .line 487
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_health_list_arrow_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 490
    :goto_2
    sget v0, Lcom/huawei/android/sns/R$id;->group_member_lly:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->s:Landroid/widget/LinearLayout;

    .line 491
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 493
    new-instance v0, Lo/bho;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->N:Ljava/util/List;

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-direct {v0, v1, v2, v3, v4}, Lo/bho;-><init>(Landroid/content/Context;Ljava/util/List;J)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->K:Lo/bho;

    .line 494
    new-instance v5, Landroid/support/v7/widget/GridLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/4 v1, 0x6

    invoke-direct {v5, v0, v1}, Landroid/support/v7/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 495
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->K:Lo/bho;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 496
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->u:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v5}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 498
    new-instance v0, Lo/bhr;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Lo/bhr;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    .line 499
    new-instance v6, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-direct {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 500
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 501
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v6}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 502
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->R:Lo/bhr;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 504
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    .line 505
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 507
    sget v0, Lcom/huawei/android/sns/R$id;->layout_loading:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->an:Landroid/widget/RelativeLayout;

    .line 508
    sget v0, Lcom/huawei/android/sns/R$id;->net_work_layout:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    .line 509
    sget v0, Lcom/huawei/android/sns/R$id;->tv_no_data:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ad:Landroid/widget/TextView;

    .line 510
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 511
    sget v0, Lcom/huawei/android/sns/R$id;->tips_no_net_work:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->F:Landroid/widget/TextView;

    .line 512
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 513
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView is not NetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 514
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 515
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->F:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_no_net_work_pls_click_again:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    :cond_3
    return-void
.end method

.method private b(I)V
    .locals 3

    .line 2096
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v0, p1, v1, v2}, Lo/atb;->e(IJ)V

    .line 2097
    return-void
.end method

.method private b(J)V
    .locals 5

    .line 799
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "groupId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 800
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 801
    return-void

    .line 803
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 804
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 805
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;

    invoke-direct {v0, p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$17;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;J)V

    invoke-static {v4, v0}, Lo/anz;->a(Ljava/util/List;Lo/aog;)V

    .line 838
    return-void
.end method

.method private b(Landroid/os/Message;)V
    .locals 9

    .line 2149
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2150
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 2151
    const/4 v5, 0x0

    .line 2152
    if-eqz v4, :cond_1

    .line 2153
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 2154
    const-string v0, "bundleKeyNormalMemberCount"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v6

    .line 2155
    if-eqz v5, :cond_1

    .line 2158
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Ljava/util/ArrayList;)V

    .line 2159
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u5458\u4e2a\u6570\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2160
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 2161
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6210\u5458\u4fe1\u606f\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2162
    goto :goto_0

    .line 2163
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/util/ArrayList;)V

    .line 2165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lo/boa;->e(Landroid/content/Context;Ljava/lang/Long;I)V

    .line 2168
    :cond_1
    return-void
.end method

.method private b(Landroid/view/View;)V
    .locals 7

    .line 2318
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_rank_date:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 2319
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    .line 2320
    sget v0, Lcom/huawei/android/sns/R$id;->ll_rank_by_month:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 2321
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_month"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2322
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_checked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 2324
    :cond_0
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_unchecked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2326
    :goto_0
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$9;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$9;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2345
    sget v0, Lcom/huawei/android/sns/R$id;->ll_rank_by_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    .line 2346
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_week"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2347
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_middle_item_checked_bg:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 2349
    :cond_1
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_middle_item_unchecked_bg:I

    invoke-virtual {v5, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2351
    :goto_1
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$8;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$8;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2370
    sget v0, Lcom/huawei/android/sns/R$id;->ll_rank_by_day:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 2371
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_day"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2372
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_checked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 2374
    :cond_2
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_unchecked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2376
    :goto_2
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$6;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$6;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2398
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 2399
    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Landroid/view/View;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .line 2305
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h()V

    .line 2306
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    .line 2307
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v()V

    .line 2308
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 2309
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 2310
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 2309
    invoke-static {v0, v1, v2, p1, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2311
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r()V

    .line 2312
    return-void
.end method

.method private b(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 2082
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->p:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

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

    .line 2084
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2085
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->N:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2086
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->K:Lo/bho;

    invoke-virtual {v0}, Lo/bho;->notifyDataSetChanged()V

    .line 2089
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z()V

    .line 2090
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 1317
    const/4 v4, 0x0

    .line 1318
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1319
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1320
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 1321
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 1323
    :try_start_0
    invoke-virtual {v5, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    move-object v6, v0

    .line 1324
    invoke-virtual {v5, p2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v7, v0

    .line 1327
    goto :goto_0

    .line 1325
    :catch_0
    move-exception v8

    .line 1326
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sdf.parse() fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1328
    :goto_0
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 1329
    const/4 v4, 0x0

    goto :goto_1

    .line 1330
    :cond_0
    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    .line 1331
    const/4 v4, 0x1

    .line 1333
    :cond_1
    :goto_1
    goto :goto_2

    .line 1334
    :cond_2
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "date1 or date2 is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1336
    :goto_2
    return v4
.end method

.method private b(Ljava/util/List;Ljava/util/List;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)Z"
        }
    .end annotation

    .line 1383
    const/4 v4, 0x0

    .line 1384
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->az:Z

    if-eqz v0, :cond_0

    .line 1385
    const/4 v4, 0x1

    .line 1386
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->az:Z

    goto/16 :goto_1

    .line 1387
    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    .line 1388
    :cond_1
    const/4 v4, 0x1

    goto/16 :goto_1

    .line 1389
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_3

    .line 1390
    const/4 v4, 0x1

    goto/16 :goto_1

    .line 1392
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1393
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1394
    invoke-interface {v5, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1395
    invoke-interface {v6, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1396
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 1397
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 1398
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    .line 1399
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "oldRank:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1400
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newRank:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1401
    invoke-virtual {v8}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1402
    const/4 v4, 0x1

    .line 1403
    goto :goto_1

    .line 1396
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 1407
    :cond_5
    :goto_1
    return v4
.end method

.method private c(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;
    .locals 6

    .line 1824
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1825
    const/4 v0, 0x0

    return-object v0

    .line 1827
    :cond_0
    new-instance v4, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    invoke-direct {v4}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;-><init>()V

    .line 1829
    const-string v0, "distance"

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDistance(J)V

    .line 1830
    const-string v0, "steps"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setSteps(J)V

    .line 1831
    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1832
    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setDuration(J)V

    .line 1834
    :cond_1
    const-string v0, "huid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;->setHuid(J)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1837
    goto :goto_0

    .line 1835
    :catch_0
    move-exception v5

    .line 1836
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "!!! healthGroupRank will be null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1838
    :goto_0
    return-object v4
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    return-object p1
.end method

.method private c(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    .line 1370
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1371
    const-string v0, "0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1372
    add-int/lit8 v0, p2, 0x1

    invoke-virtual {p1, v0, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1374
    :cond_0
    return-object v1
.end method

.method private c()V
    .locals 16

    .line 582
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 583
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const v2, 0x44116000    # 581.5f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    goto :goto_0

    .line 585
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v2, 0x432a0000    # 170.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 587
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v3

    .line 588
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLineCount()I

    move-result v4

    .line 589
    const/4 v0, 0x3

    if-le v4, v0, :cond_1

    .line 590
    const/4 v4, 0x3

    .line 592
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v5

    .line 593
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v6

    .line 594
    const-string v7, ""

    .line 595
    const/4 v8, 0x0

    .line 597
    if-eqz v4, :cond_2

    .line 598
    const/4 v10, 0x0

    :goto_1
    if-ge v10, v4, :cond_2

    .line 599
    invoke-virtual {v3, v10}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v9

    .line 600
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 601
    move v8, v9

    .line 598
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 605
    :cond_2
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 606
    invoke-virtual {v6, v7}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v10

    .line 608
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 609
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const v1, 0x44116000    # 581.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v10

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    sub-float v11, v0, v1

    goto :goto_2

    .line 611
    :cond_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v1, 0x432a0000    # 170.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v10

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    int-to-float v1, v1

    sub-float v11, v0, v1

    .line 613
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v12

    .line 614
    new-instance v13, Landroid/widget/RelativeLayout$LayoutParams;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-direct {v13, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 615
    div-int v14, v5, v4

    .line 616
    sub-int v0, v5, v14

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v1

    sub-int v1, v14, v1

    div-int/lit8 v1, v1, 0x2

    add-int v15, v0, v1

    .line 617
    int-to-float v0, v12

    cmpl-float v0, v11, v0

    if-ltz v0, :cond_4

    .line 618
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v0, v10

    float-to-int v0, v0

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 619
    iput v15, v13, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    goto :goto_4

    .line 621
    :cond_4
    const/4 v0, 0x3

    if-ne v4, v0, :cond_5

    .line 622
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v1, 0x432a0000    # 170.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    sub-int/2addr v0, v12

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 623
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 624
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const v1, 0x44116000    # 581.5f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    sub-int/2addr v0, v12

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v1, v2}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    goto :goto_3

    .line 627
    :cond_5
    const/4 v0, 0x0

    iput v0, v13, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 629
    :cond_6
    :goto_3
    iput v5, v13, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 631
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 633
    :cond_7
    return-void
.end method

.method private c(Landroid/os/Message;)V
    .locals 6

    .line 1932
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 1933
    if-eqz v4, :cond_2

    .line 1934
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 1935
    if-eqz v5, :cond_1

    .line 1936
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1937
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo group type is family."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1940
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 1942
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->C()V

    goto :goto_0

    .line 1946
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w()V

    .line 1949
    :cond_2
    :goto_0
    return-void
.end method

.method private c(Landroid/view/View;)V
    .locals 8

    .line 636
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_quit:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 637
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    .line 639
    sget v0, Lcom/huawei/android/sns/R$id;->line_setting:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 640
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$15;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$15;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 649
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v5

    .line 650
    sget v0, Lcom/huawei/android/sns/R$id;->line_help:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 651
    if-eqz v5, :cond_0

    .line 652
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$11;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 661
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 662
    sget v0, Lcom/huawei/android/sns/R$id;->setting_line_view:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 663
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 665
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d:Lo/emr;

    const/16 v2, 0x11

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 666
    return-void
.end method

.method private c(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 5

    .line 2013
    const-string v4, ""

    .line 2014
    if-eqz p1, :cond_5

    .line 2015
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7fa4\u7ec4\u5934\u50cf\uff1agetGroupImageUrl"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2016
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7fa4\u7ec4\u5934\u50cf\uff1agetGroupImageDownloadUrl"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2017
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7fa4\u7ec4\u5934\u50cf\uff1agetOldGroupImageUrl"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2018
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2019
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 2020
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2021
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 2022
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2023
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v4

    .line 2025
    :cond_2
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 2026
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2027
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    .line 2028
    invoke-virtual {v0, v4}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$1;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    .line 2029
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    goto :goto_1

    .line 2055
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2056
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2057
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2058
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_blur_bg_default:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_1

    .line 2060
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_blur_bg_new:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 2070
    :cond_5
    :goto_1
    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;I)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(I)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Landroid/os/Message;)V

    return-void
.end method

.method private c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V
    .locals 9

    .line 1513
    if-eqz p1, :cond_2

    .line 1514
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1516
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id6:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1517
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1516
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1518
    goto/16 :goto_0

    .line 1520
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id5:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1521
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1520
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1522
    goto/16 :goto_0

    .line 1524
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_bike:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1525
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getGoalValue()D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 1524
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1526
    goto :goto_0

    .line 1528
    :sswitch_3
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_walk:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 1529
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1530
    goto :goto_0

    .line 1532
    :sswitch_4
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_run:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 1533
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1534
    goto :goto_0

    .line 1536
    :sswitch_5
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_ride:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 1537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1538
    goto :goto_0

    .line 1540
    :sswitch_6
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swim:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 1541
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1542
    goto :goto_0

    .line 1544
    :sswitch_7
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_fitness:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 1545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->M:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1546
    .line 1550
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityStatus()I

    move-result v0

    if-eqz v0, :cond_0

    .line 1551
    invoke-virtual {p1}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1552
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->J:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 1554
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->J:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1557
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

.method private c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V"
        }
    .end annotation

    .line 1616
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 1618
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "processUpdateSelfDatas start groupRankList is null or size <0"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1622
    :cond_1
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 1623
    invoke-interface {v8}, Ljava/util/List;->clear()V

    .line 1624
    invoke-interface {v8, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1629
    const-wide/16 v9, 0x0

    .line 1630
    const-wide/16 v11, 0x0

    .line 1634
    const-string v13, ""

    .line 1637
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 1638
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_month"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1639
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/bht;->c(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    .line 1640
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->d()J

    move-result-wide v11

    goto :goto_0

    .line 1641
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_week"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1642
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/bht;->e(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v9

    .line 1643
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0}, Lo/bht;->d()J

    move-result-wide v11

    goto :goto_0

    .line 1644
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_day"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1645
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0}, Lo/bht;->d(Ljava/lang/String;)J

    move-result-wide v9

    .line 1646
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/bht;->g(Ljava/lang/String;)J

    move-result-wide v11

    .line 1648
    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    move-wide v1, v9

    move-wide v3, v11

    const/16 v5, 0x14

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v13

    .line 1649
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1650
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ac:Landroid/widget/TextView;

    invoke-virtual {v0, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1652
    :cond_5
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "groupCreateTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1653
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentRankDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1655
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", groupType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1657
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    move-wide v1, v9

    move-wide v3, v11

    iget-object v5, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    new-instance v6, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;

    move-object/from16 v7, p2

    invoke-direct {v6, p0, v8, v7}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$2;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual/range {v0 .. v6}, Lo/bht;->b(JJLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1683
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;
    .locals 1

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 6

    .line 524
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->l:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$12;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$12;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->post(Ljava/lang/Runnable;)Z

    .line 531
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 532
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(J)V

    .line 536
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 537
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 538
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "healthwalk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 539
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_main_time_line_walking:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 540
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 541
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_start_track_sport_type_run:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 542
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 543
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_start_track_sport_type_cycle:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 544
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 545
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_type_group_type_workout:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 546
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_settings_one_level_menu_settings_item_text_id10:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 548
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 549
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_device_setting_other:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 552
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 556
    :cond_7
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 557
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 559
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->C:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_has_no_description:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 561
    :goto_1
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 562
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 563
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupDesc"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 568
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_a

    .line 569
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 570
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->j:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 571
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->j:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 573
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->j:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 576
    :cond_a
    :goto_2
    return-void
.end method

.method private d(Landroid/os/Message;)V
    .locals 11

    .line 1414
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupAct"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1415
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    .line 1417
    if-nez v5, :cond_2

    .line 1419
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 1420
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 1421
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1422
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_create_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1424
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1425
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1426
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ae:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1427
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aj:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1428
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ah:Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    goto :goto_0

    .line 1430
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1431
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_no_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1432
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V

    .line 1433
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1435
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1436
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ae:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1437
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aj:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1438
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ah:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 1440
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_1

    .line 1442
    :cond_1
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshGroupAct  group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 1446
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1447
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ae:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1448
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aj:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1449
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ah:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 1450
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_activity:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1451
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_user_profile_more:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1452
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1454
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$19;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1462
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1463
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$18;

    invoke-direct {v1, p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$18;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1473
    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1474
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getImgUrl()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->A:Landroid/widget/ImageView;

    const/4 v4, 0x4

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bht;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 1476
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->E:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getActivityName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1478
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getBeginTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1479
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1480
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->getEndTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1481
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, v8}, Lo/bht;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1483
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP_ACT_CURRENT_TIME"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aq:Ljava/lang/String;

    .line 1484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aq:Ljava/lang/String;

    invoke-virtual {v0, p0, v5, v1}, Lo/bht;->a(Landroid/content/Context;Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1485
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1486
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->L:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1501
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->G:Landroid/widget/TextView;

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

    .line 1503
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;)V

    .line 1506
    :goto_1
    return-void
.end method

.method private d(Landroid/view/View;)V
    .locals 5

    .line 2265
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 2266
    const/4 v0, 0x2

    new-array v3, v0, [I

    .line 2267
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->getLocationOnScreen([I)V

    .line 2268
    const/4 v0, 0x1

    aget v0, v3, v0

    sub-int v0, v2, v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v1

    sub-int v4, v0, v1

    .line 2269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/high16 v1, 0x43200000    # 160.0f

    invoke-static {v0, v1}, Lo/boi;->c(Landroid/content/Context;F)I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 2270
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->at:Z

    .line 2271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b:Lo/elz;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$7;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$7;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v0, v1}, Lo/elz;->post(Ljava/lang/Runnable;)Z

    .line 2277
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b:Lo/elz;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;

    invoke-direct {v1, p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$10;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lo/elz;->setScrollViewListener(Lo/ely;)V

    goto :goto_0

    .line 2291
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    if-ne p1, v0, :cond_1

    .line 2292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Landroid/view/View;)V

    goto :goto_0

    .line 2293
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    if-ne p1, v0, :cond_2

    .line 2294
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Landroid/view/View;)V

    .line 2297
    :cond_2
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 4

    .line 1958
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    .line 1960
    if-nez p1, :cond_0

    .line 1961
    return-void

    .line 1963
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(J)V

    .line 1971
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getCreateTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    .line 1972
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " groupCreateTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1974
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildLocalGroupInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 1976
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->K:Lo/bho;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/bho;->a(Z)V

    goto :goto_0

    .line 1978
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->K:Lo/bho;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bho;->a(Z)V

    .line 1981
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->hw_health_grop_more_img:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1982
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Lcom/huawei/health/sns/model/group/Group;)V

    .line 1983
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D()V

    .line 1985
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->A()V

    .line 1986
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->n()V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;I)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(I)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/view/View;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Landroid/view/View;)V

    return-void
.end method

.method private d(Ljava/util/ArrayList;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 2176
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 2177
    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v2

    invoke-virtual {v2}, Lo/aoq;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2178
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2179
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aB:Ljava/lang/String;

    goto :goto_1

    .line 2183
    :cond_0
    goto :goto_0

    .line 2184
    :cond_1
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Z)Z
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->at:Z

    return p1
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;
    .locals 1

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    return-object p1
.end method

.method private e()V
    .locals 10

    .line 364
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "HEALTH_GROUP__ACTIVITY_SAVE"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 365
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 367
    :try_start_0
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6, v5}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 368
    const/4 v7, 0x0

    .line 369
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v8, v0, :cond_0

    .line 370
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    .line 371
    invoke-direct {p0, v9}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a(Lorg/json/JSONObject;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;

    move-result-object v7

    .line 369
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 373
    :cond_0
    new-instance v8, Landroid/os/Message;

    invoke-direct {v8}, Landroid/os/Message;-><init>()V

    .line 374
    const v0, 0x8002

    iput v0, v8, Landroid/os/Message;->what:I

    .line 375
    iput-object v7, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 376
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    goto :goto_1

    .line 377
    :catch_0
    move-exception v6

    .line 378
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    goto :goto_1

    .line 381
    :cond_1
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 382
    const v0, 0x8002

    iput v0, v6, Landroid/os/Message;->what:I

    .line 383
    const/4 v0, 0x0

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 384
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 386
    :goto_1
    return-void
.end method

.method private e(Landroid/os/Message;)V
    .locals 6

    .line 2113
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 2114
    if-eqz v4, :cond_1

    .line 2115
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 2116
    if-eqz v5, :cond_1

    .line 2117
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2120
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "group.getGroupType() == Group.TYPE_FAMILY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2122
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Lcom/huawei/health/sns/model/group/Group;)V

    .line 2126
    :cond_1
    :goto_0
    return-void
.end method

.method private e(Landroid/view/View;)V
    .locals 7

    .line 2405
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->pop_custom_view_health_group_rank_type:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 2406
    new-instance v0, Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-direct {v0, v1, v3}, Lo/elp;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    .line 2407
    sget v0, Lcom/huawei/android/sns/R$id;->line_distance_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 2408
    sget v0, Lcom/huawei/android/sns/R$id;->txt_distance_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 2409
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "run"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2410
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 2411
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2412
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 2413
    :cond_2
    const-string v0, "swimming"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2414
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 2415
    :cond_3
    const-string v0, "riding"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2416
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2418
    :cond_4
    :goto_0
    const-string v0, "RANK_TYPE_STEPS"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2419
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_unchecked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 2421
    :cond_5
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_bottom_item_checked_bg:I

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2424
    :goto_1
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$13;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$13;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2464
    sget v0, Lcom/huawei/android/sns/R$id;->line_step_week:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 2465
    const-string v0, "RANK_TYPE_STEPS"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2466
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_checked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_2

    .line 2468
    :cond_6
    sget v0, Lcom/huawei/android/sns/R$drawable;->group_popview_top_item_unchecked_bg:I

    invoke-virtual {v6, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2470
    :goto_2
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$14;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-virtual {v6, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2484
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    const/16 v2, 0x13

    invoke-virtual {v0, v1, v2}, Lo/elp;->c(Landroid/view/View;I)V

    .line 2486
    return-void
.end method

.method private e(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 2

    .line 2214
    new-instance v0, Lo/bgg;

    invoke-direct {v0}, Lo/bgg;-><init>()V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0, v1, p1}, Lo/bgg;->a(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/group/Group;)V

    .line 2219
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->z()V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Ljava/util/List;)V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupRank;>;)V"
        }
    .end annotation

    .line 1687
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "sortHealthGroupRank start  currentRankType is :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1689
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1690
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->e(Ljava/util/List;)V

    .line 1691
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "sortHealthGroupRank end  sortGroupRankBySteps groupRankList size :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1692
    :cond_0
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1693
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->a(Ljava/util/List;)V

    .line 1694
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "sortHealthGroupRank end  sortGroupRankByDuration groupRankList size :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1696
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->d(Ljava/util/List;)V

    .line 1697
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "sortHealthGroupRank end  sortGroupRankByDistance groupRankList size :"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1699
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/bht;->b(Ljava/util/List;)V

    .line 1700
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sortHealthGroupRank end  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1701
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Z)Z
    .locals 0

    .line 104
    iput-boolean p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->az:Z

    return p1
.end method

.method static synthetic f(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method private f()V
    .locals 6

    .line 730
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e:Landroid/content/Intent;

    .line 731
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e:Landroid/content/Intent;

    if-eqz v0, :cond_3

    .line 732
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    .line 733
    if-eqz v5, :cond_1

    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 734
    const-string v0, "group"

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/model/group/Group;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    .line 736
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 737
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/group/Group;->getCreateTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bht;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    .line 738
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " groupCreateTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    goto :goto_0

    .line 741
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " initData  group == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 744
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e:Landroid/content/Intent;

    const-string v1, "EXTRA_GROUP_ID"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 746
    :goto_0
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(J)V

    .line 747
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_2

    .line 748
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    .line 749
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupDesc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    goto :goto_1

    .line 751
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e:Landroid/content/Intent;

    const-string v1, "groupType"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    .line 752
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e:Landroid/content/Intent;

    const-string v1, "groupDesc"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    .line 754
    :goto_1
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mGroupType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", mGroupDesc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 755
    goto :goto_2

    .line 756
    :cond_3
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIntent is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 758
    return-void

    .line 761
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->N:Ljava/util/List;

    .line 762
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->P:Ljava/util/List;

    .line 763
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->S:Ljava/util/List;

    .line 766
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 767
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 768
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 769
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 770
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 771
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

    .line 770
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 773
    :cond_4
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() currentRankType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 774
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 775
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 776
    const-string v0, "rank_date_by_day"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 777
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 778
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 779
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

    .line 778
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 781
    :cond_5
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initData() currentTimePeriod = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 783
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 784
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    .line 785
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 786
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 787
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    .line 786
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 790
    :cond_6
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(I)V

    .line 791
    return-void
.end method

.method private g()V
    .locals 5

    .line 867
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFeatureBroadcastReciver"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 868
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ak:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 869
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ak:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    .line 871
    :cond_0
    new-instance v4, Landroid/content/IntentFilter;

    invoke-direct {v4}, Landroid/content/IntentFilter;-><init>()V

    .line 872
    const-string v0, "HEALTH_ACTION_DISMISSED_GROUP_SUCCESS"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 873
    const-string v0, "HEALTH_ACTION_NOTIFY_GROUP_ACT_REFRESH_DATA"

    invoke-virtual {v4, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 874
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ak:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/content/LocalBroadcastManager;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 875
    return-void
.end method

.method static synthetic g(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c()V

    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lo/elp;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->w:Lo/elp;

    return-object v0
.end method

.method private h()V
    .locals 4

    .line 905
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 906
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "initView is not NetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 907
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 908
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 909
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->F:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_no_net_work_pls_click_again:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 911
    :cond_0
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showProgressOnloading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 912
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 913
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ad:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 914
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->an:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 916
    :goto_0
    return-void
.end method

.method static synthetic h(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Landroid/os/Message;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Landroid/os/Message;)V

    return-void
.end method

.method private i()V
    .locals 4

    .line 896
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeProgressOnloading"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 897
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->an:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 898
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 899
    return-void
.end method

.method private i(Landroid/os/Message;)V
    .locals 6

    .line 2198
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v4

    .line 2199
    if-eqz v4, :cond_0

    .line 2200
    const-string v0, "bundleKeyGroup"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/Group;

    .line 2201
    if-eqz v5, :cond_0

    .line 2202
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGroupInfo group = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/Group;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2203
    invoke-direct {p0, v5}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e(Lcom/huawei/health/sns/model/group/Group;)V

    .line 2206
    :cond_0
    return-void
.end method

.method static synthetic i(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->k()V

    return-void
.end method

.method static synthetic j(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/LinearLayout;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Y:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method private j()V
    .locals 3

    .line 2489
    new-instance v2, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    invoke-direct {v2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2490
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2491
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->startActivity(Landroid/content/Intent;)V

    .line 2492
    return-void
.end method

.method static synthetic k(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/app/Activity;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    return-object v0
.end method

.method private k()V
    .locals 4

    .line 701
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupSettingActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 702
    const-string v0, "EXTRA_GROUP_ID"

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v3, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 703
    const-string v0, "EXTRA_GROUP"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 704
    const-string v0, "EXTRA_NICK_NAME"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aB:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 705
    const-string v0, "groupDesc"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 706
    const-string v0, "groupType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 707
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x58

    invoke-virtual {v0, v3, v1}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 709
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lo/boa;->b(Landroid/content/Context;Ljava/lang/Long;)V

    .line 710
    return-void
.end method

.method private l()V
    .locals 4

    .line 933
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 934
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->an:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 935
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ad:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 936
    return-void
.end method

.method static synthetic l(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->s()V

    return-void
.end method

.method private m()V
    .locals 4

    .line 987
    const/16 v0, 0x348

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(I)V

    .line 989
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$16;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$16;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1000
    return-void
.end method

.method static synthetic m(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->t()V

    return-void
.end method

.method static synthetic n(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/os/Handler;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    return-object v0
.end method

.method private n()V
    .locals 4

    .line 922
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoServicePage"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 923
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->an:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r:Landroid/support/v7/widget/RecyclerView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setVisibility(I)V

    .line 925
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 926
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->F:Landroid/widget/TextView;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_unable_connect_server_tips:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 927
    return-void
.end method

.method private o()V
    .locals 4

    .line 955
    new-instance v0, Lo/bgn;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgn;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->au:Lo/bgn;

    .line 956
    new-instance v0, Lo/bgp;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/bgp;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->av:Lo/bgp;

    .line 957
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$g;->a:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->au:Lo/bgn;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 959
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lo/bbz$a;->b:Landroid/net/Uri;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->av:Lo/bgp;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 960
    return-void
.end method

.method static synthetic o(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->m()V

    return-void
.end method

.method private p()V
    .locals 2

    .line 948
    new-instance v0, Lo/axf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/axf;-><init>(Landroid/os/Handler;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/axf;->d(I)V

    .line 949
    return-void
.end method

.method static synthetic p(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->u()V

    return-void
.end method

.method static synthetic q(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aq:Ljava/lang/String;

    return-object v0
.end method

.method private q()V
    .locals 6

    .line 1212
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1213
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1214
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1215
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1216
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1217
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 1218
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

    .line 1217
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1219
    goto/16 :goto_0

    .line 1220
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 1221
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1222
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1225
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1226
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    goto/16 :goto_0

    .line 1228
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1229
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1232
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_riding_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1233
    const-string v0, "RANK_TYPE_RIDING_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    goto/16 :goto_0

    .line 1235
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1236
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1237
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 1239
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_result_time:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1240
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    goto/16 :goto_0

    .line 1242
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1244
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1246
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_swimming_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1247
    const-string v0, "RANK_TYPE_SWIMMING_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    goto :goto_0

    .line 1249
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1250
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1251
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    goto :goto_0

    .line 1254
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    const-string v1, "RANK_TYPE_STEPS"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_step_numbers:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1257
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_rank_type_detail_cumulative_running_distance:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1258
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1262
    :cond_b
    :goto_0
    return-void
.end method

.method static synthetic r(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->S:Ljava/util/List;

    return-object v0
.end method

.method private r()V
    .locals 6

    .line 1024
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1025
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1026
    const-string v0, "RANK_TYPE_STEPS"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    .line 1027
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1028
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1030
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 1031
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1032
    const-string v0, "rank_date_by_day"

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    .line 1033
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1034
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1036
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

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

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    .line 1037
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1038
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    .line 1039
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1040
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    .line 1041
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "health_group_user_last_select_rank_date"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    .line 1040
    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1043
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x()V

    .line 1044
    return-void
.end method

.method static synthetic s(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)J
    .locals 2

    .line 104
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    return-wide v0
.end method

.method private s()V
    .locals 6

    .line 1006
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    .line 1007
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 1008
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    .line 1009
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1010
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupType"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1012
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupDesc"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    .line 1013
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_1

    .line 1014
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/group/Group;->getHealthGroupDesc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    .line 1015
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 1016
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const/16 v1, 0x272b

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "groupDesc"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1018
    :cond_1
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d()V

    .line 1019
    return-void
.end method

.method static synthetic t(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Ljava/util/List;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->N:Ljava/util/List;

    return-object v0
.end method

.method private t()V
    .locals 2

    .line 1268
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 1269
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->X:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1270
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->T:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1271
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->V:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1272
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->W:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1273
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->U:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1274
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Q:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1275
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->O:Lo/egd;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1278
    :cond_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->y()V

    .line 1280
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v()V

    .line 1281
    return-void
.end method

.method private u()V
    .locals 2

    .line 1175
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1176
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "healthwalk"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1177
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1178
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto/16 :goto_0

    .line 1179
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "run"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1180
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1181
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 1182
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 1183
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "riding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1184
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1185
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 1186
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 1187
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "bodybuilding"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1188
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1189
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 1190
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1191
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "swimming"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1192
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1193
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 1194
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 1195
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    const-string v1, "other"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1196
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1197
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    goto :goto_0

    .line 1200
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Z:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1201
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 1202
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1205
    :cond_6
    :goto_0
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->q()V

    .line 1206
    return-void
.end method

.method static synthetic u(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V
    .locals 0

    .line 104
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r()V

    return-void
.end method

.method static synthetic v(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/TextView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->H:Landroid/widget/TextView;

    return-object v0
.end method

.method private v()V
    .locals 6

    .line 1287
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1288
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 1289
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " groupCreateTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    aget-object v3, v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1290
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ar:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-direct {p0, v0, v1}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    .line 1291
    if-eqz v5, :cond_1

    .line 1292
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 1293
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 1294
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1295
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_rank_by_day_button_checked_bg:I

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundResource(I)V

    goto :goto_1

    .line 1297
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    sget v1, Lcom/huawei/android/sns/R$drawable;->group_rank_by_day_button_unchecked_bg:I

    invoke-virtual {v0, v1}, Lo/egd;->setBackgroundResource(I)V

    goto :goto_1

    .line 1300
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 1301
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    const v1, 0x3e99999a    # 0.3f

    invoke-virtual {v0, v1}, Lo/egd;->setAlpha(F)V

    .line 1288
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_2
    goto :goto_2

    .line 1305
    :cond_3
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " currentRankDate is null."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1307
    :goto_2
    return-void
.end method

.method static synthetic w(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/widget/ImageView;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method private w()V
    .locals 5

    .line 2103
    new-instance v0, Lo/atb;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    const/16 v3, 0x349

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v1, v2, v4}, Lo/atb;->a(IJZ)V

    .line 2104
    return-void
.end method

.method private x()V
    .locals 12

    .line 1711
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupRankListFromeCloud "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1712
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1713
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupRankListFromeCloud  is not NetworkConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1714
    return-void

    .line 1716
    :cond_0
    new-instance v5, Lo/aok;

    invoke-direct {v5}, Lo/aok;-><init>()V

    .line 1717
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-virtual {v5, v0, v1}, Lo/aok;->b(J)V

    .line 1718
    const-string v0, "RANK_TYPE_STEPS"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1719
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/aok;->e(I)V

    goto :goto_0

    .line 1720
    :cond_1
    const-string v0, "RANK_TYPE_RUN_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1721
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/aok;->e(I)V

    goto :goto_0

    .line 1722
    :cond_2
    const-string v0, "RANK_TYPE_RIDING_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1723
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lo/aok;->e(I)V

    goto :goto_0

    .line 1724
    :cond_3
    const-string v0, "RANK_TYPE_SWIMMING_DISTANCE"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1725
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Lo/aok;->e(I)V

    goto :goto_0

    .line 1726
    :cond_4
    const-string v0, "RANK_TYPE_FITNESS_DURATION"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ay:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1727
    const/4 v0, 0x5

    invoke-virtual {v5, v0}, Lo/aok;->e(I)V

    .line 1730
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_month"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1731
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/aok;->a(I)V

    .line 1732
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/aok;->b(I)V

    .line 1733
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto/16 :goto_4

    .line 1734
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_week"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1735
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/aok;->a(I)V

    .line 1736
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/aok;->b(I)V

    .line 1737
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto/16 :goto_4

    .line 1738
    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aD:Ljava/lang/String;

    const-string v1, "rank_date_by_day"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1740
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 1741
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1742
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto/16 :goto_1

    .line 1743
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1744
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto :goto_1

    .line 1745
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1746
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto :goto_1

    .line 1747
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 1748
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto :goto_1

    .line 1749
    :cond_b
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1750
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto :goto_1

    .line 1751
    :cond_c
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1752
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    goto :goto_1

    .line 1753
    :cond_d
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 1754
    const/4 v0, 0x6

    iput v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    .line 1757
    :cond_e
    :goto_1
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lo/aok;->a(I)V

    .line 1758
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 1759
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 1760
    move-object v8, v6

    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_f

    aget-object v11, v8, v10

    .line 1761
    invoke-virtual {v7, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1760
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    .line 1763
    :cond_f
    const/4 v8, 0x0

    .line 1765
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v8, v0

    .line 1768
    goto :goto_3

    .line 1766
    :catch_0
    move-exception v9

    .line 1767
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1769
    :goto_3
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "healthRankRequest ----rankDateInt:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1770
    invoke-virtual {v5, v8}, Lo/aok;->b(I)V

    .line 1772
    :cond_10
    :goto_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->am:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5}, Lo/aok;->c()I

    move-result v2

    iget v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aw:I

    invoke-virtual {v5}, Lo/aok;->d()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/boa;->e(Landroid/content/Context;Ljava/lang/Long;III)V

    .line 1773
    new-instance v0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)V

    invoke-static {v5, v0}, Lo/aoc;->e(Lo/aok;Lo/aol;)V

    .line 1815
    return-void
.end method

.method static synthetic x(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->at:Z

    return v0
.end method

.method static synthetic y(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Lo/elz;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b:Lo/elz;

    return-object v0
.end method

.method private y()V
    .locals 7

    .line 1343
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 1344
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v5

    .line 1345
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    array-length v0, v0

    if-ge v6, v0, :cond_1

    .line 1346
    if-nez v6, :cond_0

    .line 1347
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 1348
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ao:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    aget-object v1, v1, v6

    const/16 v2, 0x8

    const/16 v3, 0xa

    invoke-direct {p0, v1, v2, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1349
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_today:I

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 1350
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    goto :goto_1

    .line 1352
    :cond_0
    const/4 v0, 0x5

    const/4 v1, -0x1

    invoke-virtual {v5, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 1353
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1354
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ao:[Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    aget-object v1, v1, v6

    const/16 v2, 0x8

    const/16 v3, 0xa

    invoke-direct {p0, v1, v2, v3}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v6

    .line 1355
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aa:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ao:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Lo/egd;->setText(Ljava/lang/CharSequence;)V

    .line 1345
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 1358
    :cond_1
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "currentRankDate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aE:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1359
    return-void
.end method

.method static synthetic z(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;)Landroid/view/View;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    return-object v0
.end method

.method private z()V
    .locals 5

    .line 1564
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handlerGroupRankInfoFromCloud start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1565
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->S:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 1566
    :cond_0
    return-void

    .line 1569
    :cond_1
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handlerGroupRankInfoFromCloud threadListHealthGroupRanks size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->S:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1571
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1572
    invoke-interface {v4}, Ljava/util/List;->clear()V

    .line 1573
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->S:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1574
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TAG_DOUBLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handlerGroupRankInfoFromCloud handerGroupRank size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1575
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->as:Landroid/os/Handler;

    new-instance v1, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;

    invoke-direct {v1, p0, v4}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity$20;-><init>(Lcom/huawei/health/sns/ui/group/HealthGroupActivity;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1610
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 884
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 885
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ak:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    if-eqz v0, :cond_0

    .line 886
    const-string v0, "Group_HealthGroupActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unregisterSyncBroadcastReceiver mReceiver != null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 887
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ak:Lcom/huawei/health/sns/ui/group/HealthGroupActivity$b;

    invoke-virtual {v0, v1}, Landroid/support/v4/content/LocalBroadcastManager;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 890
    :cond_0
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 714
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 715
    const/16 v0, 0x58

    if-ne p1, v0, :cond_0

    .line 716
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 717
    if-eqz p3, :cond_0

    const-string v0, "EXTRA_IS_QUIT_GROUP"

    invoke-virtual {p3, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 718
    const-string v0, "EXTRA_IS_QUIT_GROUP"

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 719
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 724
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 2223
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a:Landroid/view/View;

    if-ne p1, v0, :cond_0

    .line 2224
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->B()V

    goto/16 :goto_0

    .line 2225
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->s:Landroid/widget/LinearLayout;

    if-ne p1, v0, :cond_1

    .line 2226
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->I()V

    goto/16 :goto_0

    .line 2227
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    if-ne p1, v0, :cond_2

    .line 2228
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->x:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2229
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    if-ne p1, v0, :cond_3

    .line 2230
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->D:Landroid/view/View;

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->d(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2231
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->v:Landroid/widget/TextView;

    if-eq p1, v0, :cond_4

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ah:Lo/egd;

    if-ne p1, v0, :cond_5

    .line 2232
    :cond_4
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->j()V

    goto/16 :goto_0

    .line 2233
    :cond_5
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ag:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_6

    .line 2234
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->r()V

    goto/16 :goto_0

    .line 2235
    :cond_6
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->j:Lo/egd;

    if-ne p1, v0, :cond_7

    .line 2237
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/sns/ui/group/HealthGroupDescActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2238
    const-string v0, "group"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ai:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2239
    const-string v0, "groupDesc"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->ax:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2240
    const-string v0, "groupType"

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->aA:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2241
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 2242
    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->O:Lo/egd;

    if-ne p1, v0, :cond_8

    .line 2243
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2244
    :cond_8
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->Q:Lo/egd;

    if-ne p1, v0, :cond_9

    .line 2245
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2246
    :cond_9
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->U:Lo/egd;

    if-ne p1, v0, :cond_a

    .line 2247
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2248
    :cond_a
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->W:Lo/egd;

    if-ne p1, v0, :cond_b

    .line 2249
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2250
    :cond_b
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->V:Lo/egd;

    if-ne p1, v0, :cond_c

    .line 2251
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x2

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2252
    :cond_c
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->T:Lo/egd;

    if-ne p1, v0, :cond_d

    .line 2253
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 2254
    :cond_d
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->X:Lo/egd;

    if-ne p1, v0, :cond_e

    .line 2255
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->al:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-direct {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b(Ljava/lang/String;)V

    .line 2257
    :cond_e
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 348
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 349
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_group:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->setContentView(I)V

    .line 350
    iput-object p0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->c:Landroid/app/Activity;

    .line 351
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->f()V

    .line 352
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->b()V

    .line 353
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->p()V

    .line 355
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->o()V

    .line 356
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->g()V

    .line 359
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->e()V

    .line 360
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 879
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onDestroy()V

    .line 880
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->a()V

    .line 881
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 940
    invoke-super {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onResume()V

    .line 941
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupActivity;->m()V

    .line 942
    return-void
.end method
