.class public Lo/atz;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/group/GroupMember;)Landroid/content/ContentValues;
    .locals 4

    .line 278
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->resetSortPinYin()V

    .line 279
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->buildSearchPinyin()V

    .line 281
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 282
    const-string v0, "group_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGroupId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 283
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 284
    const-string v0, "state"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 286
    const-string v0, "user_group_nickname"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    const-string v0, "grp_nickname_sort_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getGrpNicknameSortPinYin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getJoinTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 290
    const-string v0, "join_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getJoinTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    :cond_0
    const-string v0, "search_full_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getSearchFullPinyin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    const-string v0, "search_short_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v0, "search_pinyin_fenci"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/group/GroupMember;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    return-object v3
.end method

.method public a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 3

    .line 220
    new-instance v2, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 221
    const-string v0, "group_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 222
    const-string v0, "user_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 223
    const-string v0, "user_group_nickname"

    .line 224
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserGroupNickname(Ljava/lang/String;)V

    .line 225
    const-string v0, "join_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 226
    const-string v0, "state"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 227
    const-string v0, "grp_nickname_sort_pinyin"

    .line 228
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 227
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setGrpNicknameSortPinYin(Ljava/lang/String;)V

    .line 230
    const-string v0, "search_full_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 231
    const-string v0, "search_short_pinyin"

    .line 232
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 233
    const-string v0, "search_pinyin_fenci"

    .line 234
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 235
    return-object v2
.end method

.method public a()[Ljava/lang/String;
    .locals 9

    .line 153
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 155
    const-string v4, "t_user.remark_name"

    .line 156
    const-string v5, "t_group_member.user_group_nickname"

    .line 157
    const-string v6, "t_user.sort_pinyin"

    .line 158
    const-string v7, "t_group_member.grp_nickname_sort_pinyin"

    .line 160
    const-string v8, "t_user.contact_sort_pinyin"

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "case when "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is null or LENGTH(trim("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "))<1 then "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " case when "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is null or LENGTH(trim("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "))<1 then "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " case when "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not null or LENGTH(trim("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "))>0 then "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 167
    invoke-virtual {v3, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 168
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " else "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " end "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " else "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " end "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 170
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " else "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 171
    const-string v0, " end as pinyin_alias"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 173
    const/16 v0, 0x13

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_group_member.user_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_group_member.group_id"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v1, 0x2

    aput-object v5, v0, v1

    const-string v1, "t_group_member.join_time"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_group_member.state"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_user.nick_name"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v1, 0x6

    aput-object v4, v0, v1

    const-string v1, "t_user.image_url"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url_download"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_user.old_image_url"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user.site_id"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const/16 v1, 0xb

    aput-object v7, v0, v1

    .line 187
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user.search_full_pinyin"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_user.search_short_pinyin"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "t_user.search_pinyin_fenci"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_full_pinyin"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_short_pinyin"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_pinyin_fenci"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    .line 173
    return-object v0
.end method

.method public d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 3

    .line 204
    invoke-virtual {p0, p1}, Lo/atz;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v1

    .line 206
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 207
    invoke-virtual {v1, v2}, Lcom/huawei/health/sns/model/group/GroupMember;->setAliasName(Ljava/lang/String;)V

    .line 208
    return-object v1
.end method

.method public e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/group/GroupMember;
    .locals 3

    .line 246
    new-instance v2, Lcom/huawei/health/sns/model/group/GroupMember;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/group/GroupMember;-><init>()V

    .line 247
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserId(J)V

    .line 248
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/group/GroupMember;->setGroupId(J)V

    .line 249
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserGroupNickname(Ljava/lang/String;)V

    .line 250
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setJoinTime(Ljava/lang/String;)V

    .line 251
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setState(I)V

    .line 252
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserNickname(Ljava/lang/String;)V

    .line 253
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserRemarkName(Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageUrl(Ljava/lang/String;)V

    .line 255
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserImageDownloadUrl(Ljava/lang/String;)V

    .line 256
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setOldUserImageUrl(Ljava/lang/String;)V

    .line 257
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSiteId(I)V

    .line 258
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setGrpNicknameSortPinYin(Ljava/lang/String;)V

    .line 259
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setContactName(Ljava/lang/String;)V

    .line 260
    const/16 v0, 0xd

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserSearchFullPinyin(Ljava/lang/String;)V

    .line 261
    const/16 v0, 0xe

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserSearchShortPinyin(Ljava/lang/String;)V

    .line 262
    const/16 v0, 0xf

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setUserSearchPinyinFenci(Ljava/lang/String;)V

    .line 263
    const/16 v0, 0x10

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 264
    const/16 v0, 0x11

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 265
    const/16 v0, 0x12

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/group/GroupMember;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 266
    return-object v2
.end method

.method public e()[Ljava/lang/String;
    .locals 3

    .line 123
    const/16 v0, 0x13

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

    const-string v1, "t_group_member.join_time"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_group_member.state"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_user.nick_name"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_user.remark_name"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url_download"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_user.old_image_url"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user.site_id"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_group_member.grp_nickname_sort_pinyin"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_user.display_name"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user.search_full_pinyin"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_user.search_short_pinyin"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "t_user.search_pinyin_fenci"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_full_pinyin"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_short_pinyin"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "t_group_member.search_pinyin_fenci"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    return-object v0
.end method
