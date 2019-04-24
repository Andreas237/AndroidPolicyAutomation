.class public Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;
.super Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private b:Lo/emr;

.field private c:Landroid/content/Context;

.field private d:Landroid/support/v7/widget/RecyclerView;

.field private e:Lo/bil;

.field private h:I

.field private i:J

.field private k:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;-><init>()V

    .line 48
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->i:J

    .line 49
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->h:I

    .line 59
    new-instance v0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$b;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->k:Landroid/os/Handler;

    return-void
.end method

.method private a()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 184
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/bht;->b(Landroid/content/Context;)Lo/bht;

    move-result-object v0

    const-string v1, "getGroupMemList"

    invoke-virtual {v0, v1}, Lo/bht;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 186
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupMemList is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 189
    :cond_0
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGroupMemList result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    :goto_0
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 193
    const-string v0, "resultCode"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 194
    const/4 v0, 0x0

    if-eq v0, v7, :cond_1

    .line 195
    const-string v0, "0"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 196
    const-string v0, "groupMemberList"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 197
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v9, v0, :cond_1

    .line 198
    new-instance v10, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v10}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 199
    invoke-virtual {v8, v9}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    .line 200
    const-string v0, "groupId"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 201
    const-string v0, "userId"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v10, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 202
    const-string v0, "state"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 203
    const-string v0, "isManager"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setManager(Z)V

    .line 204
    const-string v0, "joinTime"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 205
    const-string v0, "userNickname"

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 206
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 212
    :cond_1
    goto :goto_2

    .line 210
    :catch_0
    move-exception v6

    .line 211
    const-string v0, "Group_HealthGroupMembListActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 213
    :goto_2
    return-object v4
.end method

.method static synthetic b(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/bil;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e:Lo/bil;

    return-object v0
.end method

.method private b()V
    .locals 6

    .line 93
    sget v0, Lcom/huawei/android/sns/R$id;->titlebar_panel:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/emr;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    .line 94
    sget v0, Lcom/huawei/android/sns/R$id;->group_member_rcy:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView;

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    .line 95
    new-instance v4, Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 96
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/support/v7/widget/LinearLayoutManager;->setOrientation(I)V

    .line 97
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->a()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->a:Ljava/util/List;

    .line 98
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->getIntent()Landroid/content/Intent;

    move-result-object v5

    .line 99
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 100
    const-string v0, "EXTRA_GROUP_ID"

    const-wide/16 v1, 0x0

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->i:J

    .line 101
    const-string v0, "EXTRA_MEMB_LIST_TYPE"

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->h:I

    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->finish()V

    .line 104
    return-void

    .line 106
    :goto_0
    new-instance v0, Lo/bil;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->a:Ljava/util/List;

    iget v3, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->h:I

    invoke-direct {v0, v1, v2, v3}, Lo/bil;-><init>(Landroid/content/Context;Ljava/util/List;I)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e:Lo/bil;

    .line 107
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0, v4}, Landroid/support/v7/widget/RecyclerView;->setLayoutManager(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->d:Landroid/support/v7/widget/RecyclerView;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e:Lo/bil;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView;->setAdapter(Landroid/support/v7/widget/RecyclerView$Adapter;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->e:Lo/bil;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$4;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1}, Lo/bil;->c(Lo/bil$d;)V

    .line 124
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->h:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 126
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$5;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 157
    :cond_1
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->h:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_member:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    goto :goto_1

    .line 159
    :cond_2
    iget v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->h:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 161
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->health_navbar_cancel_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonVisibility(I)V

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_group_setting_group_member_select:I

    invoke-virtual {p0, v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->ic_appbar_confirm_dissable:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    new-instance v1, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity$2;-><init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)V

    invoke-virtual {v0, v1}, Lo/emr;->setRightButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 177
    :cond_3
    :goto_1
    return-void
.end method

.method static synthetic d(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Lo/emr;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b:Lo/emr;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;)Landroid/content/Context;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->c:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 86
    invoke-super {p0, p1}, Lcom/huawei/health/sns/ui/group/HealthGroupBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 87
    sget v0, Lcom/huawei/android/sns/R$layout;->activity_health_group_memb_delete:I

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->setContentView(I)V

    .line 88
    iput-object p0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->c:Landroid/content/Context;

    .line 89
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthGroupMembListActivity;->b()V

    .line 90
    return-void
.end method
