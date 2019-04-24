.class public Lo/bhc;
.super Lo/bfl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhc$b;,
        Lo/bhc$a;
    }
.end annotation


# instance fields
.field private f:I

.field private g:Landroid/widget/GridView;

.field private h:Landroid/widget/ImageView;

.field private i:Lo/bhc$a;

.field private k:Lo/bhc$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 91
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 62
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhc;->g:Landroid/widget/GridView;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhc;->h:Landroid/widget/ImageView;

    .line 82
    const/4 v0, 0x5

    iput v0, p0, Lo/bhc;->f:I

    .line 92
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$integer;->sns_normal_group_member_gridview_numcolumns:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lo/bhc;->f:I

    .line 93
    new-instance v0, Lo/bhc$b;

    iget v1, p0, Lo/bhc;->f:I

    invoke-direct {v0, p1, v1}, Lo/bhc$b;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/bhc;->k:Lo/bhc$b;

    .line 94
    new-instance v0, Lo/bhc$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/bhc$a;-><init>(Lo/bhc;Lo/bhc$1;)V

    iput-object v0, p0, Lo/bhc;->i:Lo/bhc$a;

    .line 95
    return-void
.end method

.method static synthetic a(Lo/bhc;)Landroid/content/Context;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic b(Lo/bhc;)Landroid/content/Context;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    return-object v0
.end method

.method private b(Lo/bfh;)V
    .locals 6

    .line 255
    instance-of v0, p1, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_1

    .line 257
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 259
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 260
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 261
    const-string v0, "bundleKeyUserId"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 262
    const-string v0, "bundleKeysrcType"

    const/4 v1, 0x2

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 263
    const-string v0, "bundleKeyGroupId"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 264
    const-string v0, "bundleKeyFriendAddType"

    sget-object v1, Lcom/huawei/health/sns/model/user/User$a;->f:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 267
    const-string v0, "sns_frd_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 268
    const-string v0, "sns_my_origin"

    new-instance v1, Lcom/huawei/health/sns/server/user/Origin;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(I)V

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 270
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 273
    const-string v0, "bundleKeyIsNeedGobackToHomeActivity"

    const/4 v1, 0x1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 275
    :cond_0
    invoke-virtual {v4, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 276
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 278
    :cond_1
    return-void
.end method

.method static synthetic c(Lo/bhc;)Landroid/widget/GridView;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bhc;->g:Landroid/widget/GridView;

    return-object v0
.end method

.method private c(ILo/bfh;)V
    .locals 7

    .line 160
    invoke-virtual {p2}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x23

    if-ne v0, v1, :cond_1

    .line 161
    invoke-virtual {p2}, Lo/bfh;->getChatType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 163
    iget-object v0, p0, Lo/bhc;->k:Lo/bhc$b;

    add-int/lit8 v1, p1, -0x1

    invoke-virtual {v0, v1}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v3

    .line 164
    if-eqz v3, :cond_0

    instance-of v0, v3, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_0

    .line 167
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 168
    const/4 v0, 0x1

    new-array v5, v0, [J

    .line 169
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    const/4 v2, 0x0

    aput-wide v0, v5, v2

    .line 170
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 171
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 173
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 174
    const-string v0, "ignore_list"

    invoke-virtual {v6, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 175
    const-string v0, "isCreateGroup"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 176
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    check-cast v0, Landroid/support/v4/app/FragmentActivity;

    const/16 v1, 0xa

    invoke-virtual {v0, v6, v1}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 178
    :cond_0
    goto/16 :goto_0

    .line 180
    :cond_1
    invoke-virtual {p2}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_2

    .line 181
    invoke-virtual {p2}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->D:Lo/bfp$c;

    if-ne v0, v1, :cond_2

    instance-of v0, p2, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_2

    .line 183
    move-object v3, p2

    check-cast v3, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 184
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/group/GroupActivity;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 185
    const-string v0, "groupId"

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v4, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 186
    const/high16 v0, 0x4000000

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 187
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 188
    goto/16 :goto_0

    .line 190
    :cond_2
    invoke-virtual {p2}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_3

    instance-of v0, p2, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_3

    .line 192
    invoke-static {}, Lo/anx;->g()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 193
    invoke-direct {p0, p2}, Lo/bhc;->b(Lo/bfh;)V

    goto/16 :goto_0

    .line 197
    :cond_3
    invoke-virtual {p2}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x23

    if-ne v1, v0, :cond_4

    .line 198
    invoke-virtual {p2}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    sget-object v1, Lo/bfp$c;->D:Lo/bfp$c;

    if-ne v0, v1, :cond_4

    .line 200
    invoke-direct {p0, p1}, Lo/bhc;->e(I)V

    goto :goto_0

    .line 203
    :cond_4
    invoke-virtual {p2}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x23

    if-ne v1, v0, :cond_5

    .line 205
    invoke-direct {p0, p1}, Lo/bhc;->d(I)V

    goto :goto_0

    .line 208
    :cond_5
    invoke-virtual {p2}, Lo/bfh;->getCardType()I

    move-result v0

    const/16 v1, 0x24

    if-ne v1, v0, :cond_6

    .line 210
    iget-object v0, p0, Lo/bhc;->k:Lo/bhc$b;

    add-int/lit8 v1, p1, -0x2

    invoke-virtual {v0, v1}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v3

    .line 211
    if-eqz v3, :cond_6

    instance-of v0, v3, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_6

    .line 214
    move-object v4, v3

    check-cast v4, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 215
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 216
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/chat/DeleteGroupMemberActivity;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 217
    const-string v0, "groupId"

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 218
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    check-cast v0, Landroid/support/v4/app/FragmentActivity;

    const/4 v1, 0x2

    invoke-virtual {v0, v5, v1}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 221
    :cond_6
    :goto_0
    return-void
.end method

.method private d(I)V
    .locals 6

    .line 230
    new-array v2, p1, [J

    .line 231
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_1

    .line 233
    iget-object v0, p0, Lo/bhc;->k:Lo/bhc$b;

    invoke-virtual {v0, v3}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v4

    .line 234
    if-eqz v4, :cond_0

    instance-of v0, v4, Lcom/huawei/health/sns/model/group/GroupMember;

    if-eqz v0, :cond_0

    .line 236
    move-object v5, v4

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 237
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v0

    aput-wide v0, v2, v3

    .line 231
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 240
    :cond_1
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 241
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/sns/ui/selector/UserSelectorActivity;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 243
    const-string v0, "select_type"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 244
    const-string v0, "ignore_list"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[J)Landroid/content/Intent;

    .line 245
    iget-object v0, p0, Lo/bhc;->d:Landroid/content/Context;

    check-cast v0, Landroid/support/v4/app/FragmentActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v3, v1}, Landroid/support/v4/app/FragmentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 246
    return-void
.end method

.method static synthetic d(Lo/bhc;ILo/bfh;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1, p2}, Lo/bhc;->c(ILo/bfh;)V

    return-void
.end method

.method static synthetic e(Lo/bhc;)Lo/bhc$b;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bhc;->k:Lo/bhc$b;

    return-object v0
.end method

.method private e(I)V
    .locals 2

    .line 287
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bhc$4;

    invoke-direct {v1, p0, p1}, Lo/bhc$4;-><init>(Lo/bhc;I)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 319
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 100
    sget v0, Lcom/huawei/android/sns/R$id;->grid_view_memeber:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lo/bhc;->g:Landroid/widget/GridView;

    .line 101
    sget v0, Lcom/huawei/android/sns/R$id;->divider_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bhc;->h:Landroid/widget/ImageView;

    .line 102
    invoke-virtual {p0, p1}, Lo/bhc;->a(Landroid/view/View;)V

    .line 103
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 3

    .line 109
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 110
    new-instance v2, Lo/ayb;

    invoke-direct {v2}, Lo/ayb;-><init>()V

    .line 111
    instance-of v0, p1, Lo/ayb;

    if-eqz v0, :cond_0

    .line 113
    move-object v2, p1

    check-cast v2, Lo/ayb;

    .line 115
    :cond_0
    iget-object v0, p0, Lo/bhc;->h:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lo/bfh;->isNeedHideDivider()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x8

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 117
    iget-object v0, p0, Lo/bhc;->k:Lo/bhc$b;

    invoke-virtual {v2}, Lo/ayb;->b()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bhc$b;->a(Ljava/util/ArrayList;)V

    .line 118
    iget-object v0, p0, Lo/bhc;->g:Landroid/widget/GridView;

    iget-object v1, p0, Lo/bhc;->k:Lo/bhc$b;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 119
    iget-object v0, p0, Lo/bhc;->g:Landroid/widget/GridView;

    iget-object v1, p0, Lo/bhc;->i:Lo/bhc$a;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 121
    iget-object v0, p0, Lo/bhc;->g:Landroid/widget/GridView;

    new-instance v1, Lo/bhc$1;

    invoke-direct {v1, p0}, Lo/bhc$1;-><init>(Lo/bhc;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->post(Ljava/lang/Runnable;)Z

    .line 133
    return-void
.end method
