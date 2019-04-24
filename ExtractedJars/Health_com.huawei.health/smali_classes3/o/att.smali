.class public Lo/att;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    return-void
.end method

.method private c(Landroid/content/ContentValues;Ljava/lang/String;I)V
    .locals 1

    .line 226
    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 228
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 230
    :cond_0
    return-void
.end method

.method private c(Landroid/content/ContentValues;Ljava/lang/String;J)V
    .locals 2

    .line 211
    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-eqz v0, :cond_0

    .line 213
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 215
    :cond_0
    return-void
.end method

.method private d(Landroid/content/ContentValues;Ljava/lang/String;I)V
    .locals 1

    .line 273
    const/4 v0, -0x1

    if-eq p3, v0, :cond_0

    .line 275
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 277
    :cond_0
    return-void
.end method

.method private d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 241
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    invoke-virtual {p1, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    :cond_0
    return-void
.end method

.method private e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 256
    move-object v1, p3

    .line 257
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    const-string v1, ""

    .line 261
    :cond_0
    invoke-virtual {p1, p2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;
    .locals 4

    .line 138
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->resetSortPinYin()V

    .line 139
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->buildSearchPinyin()V

    .line 142
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 144
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    .line 147
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 148
    const-string v0, "group_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 150
    const-string v0, "manager_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getManagerId()J

    move-result-wide v1

    invoke-direct {p0, v3, v0, v1, v2}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;J)V

    .line 152
    const-string v0, "group_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    const-string v0, "sort_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSortPinYin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    const-string v0, "group_type"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupType()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 158
    const-string v0, "group_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "old_group_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getOldGroupImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    const-string v0, "group_image_download_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupImageDownloadUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "disturb_mode"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getDisturbMode()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 163
    const-string v0, "save_to_contract_mode"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSaveToContractMode()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 164
    const-string v0, "show_nickname_mode"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getShowNicknameMode()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 166
    const-string v0, "stick_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getStickTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "create_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getCreateTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "group_member_version"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupMemberVersion()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    const-string v0, "site_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSiteID()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 172
    const-string v0, "qr_code"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getQrCode()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "qr_expire_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getQrExpireTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v0, "grp_name_flag"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGrpNameFlag()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->c(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 178
    const-string v0, "group_state"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 180
    const-string v0, "search_full_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSearchFullPinyin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    const-string v0, "search_short_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    const-string v0, "search_pinyin_fenci"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    return-object v3
.end method

.method public a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;
    .locals 3

    .line 58
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 59
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 60
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 62
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setOldGroupImageUrl(Ljava/lang/String;)V

    .line 63
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setManagerId(J)V

    .line 65
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSortPinYin(Ljava/lang/String;)V

    .line 66
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 67
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 68
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 69
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 70
    return-object v2
.end method

.method public c()[Ljava/lang/String;
    .locals 3

    .line 80
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_group.group_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_group.group_name"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_group.group_image_url"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_group.old_group_image_url"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_group.group_image_download_url"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_group.manager_id"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_group.sort_pinyin"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_group.group_type"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_group.search_full_pinyin"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_group.search_short_pinyin"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_group.search_pinyin_fenci"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    return-object v0
.end method

.method public d(Lcom/huawei/health/sns/model/group/Group;)Landroid/content/ContentValues;
    .locals 4

    .line 195
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 196
    const-string v0, "group_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 198
    const-string v0, "group_state"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/Group;->getState()I

    move-result v1

    invoke-direct {p0, v3, v0, v1}, Lo/att;->d(Landroid/content/ContentValues;Ljava/lang/String;I)V

    .line 199
    return-object v3
.end method

.method public e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/Group;
    .locals 3

    .line 103
    new-instance v2, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 104
    const-string v0, "group_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setGroupId(J)V

    .line 105
    const-string v0, "group_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupName(Ljava/lang/String;)V

    .line 106
    const-string v0, "group_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupType(I)V

    .line 107
    const-string v0, "group_image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageUrl(Ljava/lang/String;)V

    .line 108
    const-string v0, "old_group_image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setOldGroupImageUrl(Ljava/lang/String;)V

    .line 109
    const-string v0, "group_image_download_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupImageDownloadUrl(Ljava/lang/String;)V

    .line 110
    const-string v0, "manager_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/Group;->setManagerId(J)V

    .line 111
    const-string v0, "disturb_mode"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setDisturbMode(I)V

    .line 112
    const-string v0, "save_to_contract_mode"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSaveToContractMode(I)V

    .line 113
    const-string v0, "show_nickname_mode"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setShowNicknameMode(I)V

    .line 114
    const-string v0, "stick_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setStickTime(Ljava/lang/String;)V

    .line 115
    const-string v0, "create_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setCreateTime(Ljava/lang/String;)V

    .line 116
    const-string v0, "site_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSiteID(I)V

    .line 117
    const-string v0, "qr_code"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setQrCode(Ljava/lang/String;)V

    .line 118
    const-string v0, "qr_expire_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setQrExpireTime(Ljava/lang/String;)V

    .line 119
    const-string v0, "group_member_version"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGroupMemberVersion(Ljava/lang/String;)V

    .line 120
    const-string v0, "grp_name_flag"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setGrpNameFlag(I)V

    .line 121
    const-string v0, "group_state"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setState(I)V

    .line 122
    const-string v0, "sort_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSortPinYin(Ljava/lang/String;)V

    .line 123
    const-string v0, "search_full_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 124
    const-string v0, "search_short_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 125
    const-string v0, "search_pinyin_fenci"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/Group;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 126
    return-object v2
.end method
