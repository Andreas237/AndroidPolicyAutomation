.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v7/widget/RecyclerView;

.field private b:Lo/bik;

.field private c:Landroid/view/View;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation
.end field

.field private e:Landroid/app/Activity;

.field private h:Lo/ems$d;

.field private i:Lo/ems;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->d:Ljava/util/List;

    .line 125
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->h:Lo/ems$d;

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)Z
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->b()Z

    move-result v0

    return v0
.end method

.method private b(Landroid/view/View;)V
    .locals 5

    .line 93
    sget v0, Lcom/huawei/android/sns/R$id;->health_group_list_recyclerview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->a:Landroid/support/v7/widget/RecyclerView;

    .line 94
    sget v0, Lcom/huawei/android/sns/R$id;->group_lly:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->c:Landroid/view/View;

    .line 95
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 96
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->d:Ljava/util/List;

    .line 97
    new-instance v0, Lo/bik;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->d:Ljava/util/List;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-direct {v0, v1, v2}, Lo/bik;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->b:Lo/bik;

    .line 98
    new-instance v3, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-direct {v3, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 99
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 100
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->a:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->a:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->b:Lo/bik;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 103
    sget v0, Lcom/huawei/android/sns/R$id;->health_group_list_toolbar:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/ems;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    .line 104
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/ems;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    sget v1, Lcom/huawei/android/sns/R$layout;->hw_toolbar_bottomview:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 106
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    invoke-virtual {v0, v4}, Lo/ems;->d(Landroid/view/View;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->h:Lo/ems$d;

    invoke-virtual {v0, v1}, Lo/ems;->setOnSingleTapListener(Lo/ems$d;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    sget v1, Lcom/huawei/android/sns/R$drawable;->ic_addition_create_group:I

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 110
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_create:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    sget v1, Lcom/huawei/android/sns/R$drawable;->scan_qr:I

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIcon(II)V

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_scan:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/ems;->setIconTitle(ILjava/lang/CharSequence;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    const/4 v1, 0x2

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Lo/ems;->setIconVisible(II)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->i:Lo/ems;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/ems;->a(Landroid/app/Activity;)V

    .line 118
    return-void
.end method

.method private b()Z
    .locals 4

    .line 160
    const/4 v0, 0x3

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "android.permission.CAMERA"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v1, 0x2

    aput-object v0, v3, v1

    .line 161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_healthshop_permission_str:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1}, Lo/bhq;->d(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;)Landroid/app/Activity;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    return-object v0
.end method

.method private d()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/group/Group;>;"
        }
    .end annotation

    .line 168
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 169
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getHealthGroupInfoList"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 170
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupInfoByIds is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 173
    :cond_0
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupInfoByIds result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    :goto_0
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 177
    const-string v0, "resultCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 178
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 179
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HttpPost result:resultCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 181
    const-string v0, "groupInfoList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 182
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 183
    new-instance v10, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 184
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 185
    const-string v0, "groupId"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    .line 186
    const-string v0, "groupName"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 187
    const-string v0, "groupDesc"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 188
    const-string v0, "groupType"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 189
    const-string v0, "createTime"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    .line 190
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 191
    invoke-virtual {v10, v13}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 192
    invoke-virtual {v10, v14}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupDesc(Ljava/lang/String;)V

    .line 193
    invoke-virtual {v10, v15}, Lcom/huawei/health/sns/model/group/Group;->setHealthGroupType(Ljava/lang/String;)V

    .line 194
    move-object/from16 v0, v16

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/Group;->setCreateTime(Ljava/lang/String;)V

    .line 195
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 201
    :cond_1
    goto :goto_2

    .line 199
    :catch_0
    move-exception v6

    .line 200
    const-string v0, "Group_HealthGroupListFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :goto_2
    return-object v4
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 86
    sget v0, Lcom/huawei/android/sns/R$layout;->fragment_health_group_list:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->e:Landroid/app/Activity;

    .line 88
    invoke-direct {p0, v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupListFragment;->b(Landroid/view/View;)V

    .line 89
    return-object v2
.end method

.method public onDestroy()V
    .locals 0

    .line 122
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroy()V

    .line 123
    return-void
.end method

.method public onResume()V
    .locals 0

    .line 151
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 152
    return-void
.end method
