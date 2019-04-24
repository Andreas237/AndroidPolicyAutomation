.class public Lo/aua;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;
    .locals 3

    .line 67
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 68
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 69
    const/16 v0, 0xd

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 70
    const/16 v0, 0xe

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 71
    return-object v2
.end method

.method public c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 3

    .line 82
    new-instance v2, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 83
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 84
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 85
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserGroupNickname(Ljava/lang/String;)V

    .line 86
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 87
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 88
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 90
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 91
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setContactName(Ljava/lang/String;)V

    .line 92
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserSearchFullPinyin(Ljava/lang/String;)V

    .line 93
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserSearchShortPinyin(Ljava/lang/String;)V

    .line 94
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserSearchPinyinFenci(Ljava/lang/String;)V

    .line 95
    return-object v2
.end method

.method public e()[Ljava/lang/String;
    .locals 3

    .line 105
    const/16 v0, 0xf

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_group_member.user_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_group_member.group_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_group_member.user_group_nickname"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_full_pinyin"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_short_pinyin"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_pinyin_fenci"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_user.nick_name"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_user.remark_name"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_user.display_name"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_user.search_full_pinyin"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user.search_short_pinyin"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_user.search_pinyin_fenci"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_group.group_id"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_group.group_name"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_group.group_type"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    return-object v0
.end method
