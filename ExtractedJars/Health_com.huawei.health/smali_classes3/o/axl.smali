.class public Lo/axl;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    return-void
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 197
    move-object v1, p3

    .line 199
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    const-string v1, ""

    .line 203
    :cond_0
    invoke-virtual {p1, p2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    return-void
.end method

.method private e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 182
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 184
    invoke-virtual {p1, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    :cond_0
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;
    .locals 4

    .line 127
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 130
    const-string v0, "image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "old_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOldImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "image_url_download"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageURLDownload()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    const-string v0, "phone_digest"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :cond_0
    const-string v0, "display_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "phone_number"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    const-string v0, "nick_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v0, "remark_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "need_verify"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNeedVerify()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 143
    const-string v0, "gender"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getGender()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 144
    const-string v0, "national_code"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getNationalCode()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    const-string v0, "province"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getProvince()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    const-string v0, "account"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getAccount()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    const-string v0, "city"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getCity()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    const-string v0, "signature"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSignature()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    const-string v0, "sort_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSortPinYin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    const-string v0, "contact_sort_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getContactSortPinYin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "state"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getState()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 153
    const-string v0, "is_friend"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 154
    const-string v0, "relation"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 155
    const-string v0, "channel"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getChannel()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 156
    const-string v0, "site_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSiteId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 157
    const-string v0, "user_type"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 158
    const-string v0, "set_flags"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSetFlags()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "stick_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getStickTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRegisteredUser()I

    move-result v0

    if-lez v0, :cond_3

    .line 162
    const-string v0, "registered_user"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRegisteredUser()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 164
    :cond_3
    const-string v0, "last_update_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getLastUpdateTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "search_full_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSearchFullPinyin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "search_short_pinyin"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSearchShortPinyin()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const-string v0, "search_pinyin_fenci"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getSearchPinyinFenci()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "origin_type"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 169
    const-string v0, "origin_desc"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getOriginDesc()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v3, v0, v1}, Lo/axl;->a(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    return-object v3
.end method

.method public c(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/User;
    .locals 3

    .line 214
    new-instance v2, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 215
    const-string v0, "user_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 216
    const-string v0, "image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageUrl(Ljava/lang/String;)V

    .line 217
    const-string v0, "old_image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setOldImageUrl(Ljava/lang/String;)V

    .line 218
    const-string v0, "image_url_download"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setImageURLDownload(Ljava/lang/String;)V

    .line 219
    const-string v0, "phone_digest"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneDigest(Ljava/lang/String;)V

    .line 220
    const-string v0, "display_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactName(Ljava/lang/String;)V

    .line 221
    const-string v0, "phone_number"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setPhoneNumber(Ljava/lang/String;)V

    .line 222
    const-string v0, "nick_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNickName(Ljava/lang/String;)V

    .line 223
    const-string v0, "remark_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 224
    const-string v0, "need_verify"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNeedVerify(I)V

    .line 225
    const-string v0, "gender"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setGender(I)V

    .line 226
    const-string v0, "national_code"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setNationalCode(Ljava/lang/String;)V

    .line 227
    const-string v0, "province"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setProvince(Ljava/lang/String;)V

    .line 228
    const-string v0, "account"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setAccount(Ljava/lang/String;)V

    .line 229
    const-string v0, "city"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setCity(Ljava/lang/String;)V

    .line 230
    const-string v0, "signature"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSignature(Ljava/lang/String;)V

    .line 231
    const-string v0, "sort_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSortPinYin(Ljava/lang/String;)V

    .line 232
    const-string v0, "contact_sort_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setContactSortPinYin(Ljava/lang/String;)V

    .line 233
    const-string v0, "state"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 234
    const-string v0, "is_friend"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setIsFriend(I)V

    .line 235
    const-string v0, "relation"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 236
    const-string v0, "channel"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setChannel(I)V

    .line 237
    const-string v0, "registered_user"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setRegisteredUser(I)V

    .line 238
    const-string v0, "last_update_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setLastUpdateTime(Ljava/lang/String;)V

    .line 239
    const-string v0, "site_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSiteId(I)V

    .line 240
    const-string v0, "user_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setUserType(I)V

    .line 241
    const-string v0, "set_flags"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSetFlags(Ljava/lang/String;)V

    .line 242
    const-string v0, "stick_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setStickTime(Ljava/lang/String;)V

    .line 243
    const-string v0, "search_full_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 244
    const-string v0, "search_short_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 245
    const-string v0, "search_pinyin_fenci"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 246
    const-string v0, "origin_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginType(I)V

    .line 247
    const-string v0, "origin_desc"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setOriginDesc(Ljava/lang/String;)V

    .line 248
    return-object v2
.end method

.method public e(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;
    .locals 5

    .line 107
    new-instance v0, Lo/axl;

    invoke-direct {v0}, Lo/axl;-><init>()V

    invoke-virtual {v0, p1}, Lo/axl;->c(Lcom/huawei/health/sns/model/user/User;)Landroid/content/ContentValues;

    move-result-object v4

    .line 108
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 110
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 114
    :cond_0
    const-string v0, "old_image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    return-object v4
.end method

.method public e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/search/SNSSearchBean;
    .locals 3

    .line 259
    new-instance v2, Lcom/huawei/health/sns/model/search/SNSSearchBean;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/search/SNSSearchBean;-><init>()V

    .line 260
    const-string v0, "user_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserId(J)V

    .line 261
    const-string v0, "image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageUrl(Ljava/lang/String;)V

    .line 262
    const-string v0, "old_image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setOldImageUrl(Ljava/lang/String;)V

    .line 263
    const-string v0, "image_url_download"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setImageURLDownload(Ljava/lang/String;)V

    .line 264
    const-string v0, "phone_digest"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setPhoneDigest(Ljava/lang/String;)V

    .line 265
    const-string v0, "display_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setContactName(Ljava/lang/String;)V

    .line 266
    const-string v0, "phone_number"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setPhoneNumber(Ljava/lang/String;)V

    .line 267
    const-string v0, "nick_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setNickName(Ljava/lang/String;)V

    .line 268
    const-string v0, "remark_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setRemarkName(Ljava/lang/String;)V

    .line 269
    const-string v0, "need_verify"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setNeedVerify(I)V

    .line 270
    const-string v0, "gender"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setGender(I)V

    .line 271
    const-string v0, "national_code"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setNationalCode(Ljava/lang/String;)V

    .line 272
    const-string v0, "province"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setProvince(Ljava/lang/String;)V

    .line 273
    const-string v0, "account"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setAccount(Ljava/lang/String;)V

    .line 274
    const-string v0, "city"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setCity(Ljava/lang/String;)V

    .line 275
    const-string v0, "signature"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSignature(Ljava/lang/String;)V

    .line 276
    const-string v0, "sort_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSortPinYin(Ljava/lang/String;)V

    .line 277
    const-string v0, "contact_sort_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setContactSortPinYin(Ljava/lang/String;)V

    .line 278
    const-string v0, "state"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setState(I)V

    .line 279
    const-string v0, "is_friend"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setIsFriend(I)V

    .line 280
    const-string v0, "relation"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setRelation(I)V

    .line 281
    const-string v0, "channel"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setChannel(I)V

    .line 282
    const-string v0, "registered_user"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setRegisteredUser(I)V

    .line 283
    const-string v0, "last_update_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setLastUpdateTime(Ljava/lang/String;)V

    .line 284
    const-string v0, "site_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSiteId(I)V

    .line 285
    const-string v0, "user_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setUserType(I)V

    .line 286
    const-string v0, "set_flags"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSetFlags(Ljava/lang/String;)V

    .line 287
    const-string v0, "stick_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setStickTime(Ljava/lang/String;)V

    .line 288
    const-string v0, "search_full_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 289
    const-string v0, "search_short_pinyin"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 290
    const-string v0, "search_pinyin_fenci"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/search/SNSSearchBean;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 291
    return-object v2
.end method

.method public e()[Ljava/lang/String;
    .locals 8

    .line 44
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 46
    const-string v4, "t_user.remark_name"

    .line 47
    const-string v5, "t_user.nick_name"

    .line 48
    const-string v6, "t_user.sort_pinyin"

    .line 49
    const-string v7, "t_user.contact_sort_pinyin"

    .line 52
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

    .line 53
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

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " case when "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " is not null or LENGTH(trim("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "))>0 then "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 56
    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
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

    .line 58
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

    .line 59
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

    .line 60
    const-string v0, " end as user_sort_pinyin"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    const/16 v0, 0x22

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_user.user_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_user.old_image_url"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url_download"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_user.display_name"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_user.phone_number"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_user.phone_digest"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_user.nick_name"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_user.remark_name"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_user.need_verify"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_user.gender"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_user.national_code"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_user.province"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user.account"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_user.city"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "t_user.signature"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "t_user.sort_pinyin"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "t_user.contact_sort_pinyin"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "t_user.state"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "t_user.is_friend"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "t_user.relation"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "t_user.channel"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "t_user.registered_user"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "t_user.last_update_time"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "t_user.site_id"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    const-string v1, "t_user.user_type"

    const/16 v2, 0x19

    aput-object v1, v0, v2

    const-string v1, "t_user.set_flags"

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    const-string v1, "t_user.stick_time"

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    const-string v1, "t_user.search_full_pinyin"

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    const-string v1, "t_user.search_short_pinyin"

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    const-string v1, "t_user.search_pinyin_fenci"

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    const-string v1, "t_user.origin_type"

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    const-string v1, "t_user.origin_desc"

    const/16 v2, 0x20

    aput-object v1, v0, v2

    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x21

    aput-object v1, v0, v2

    .line 62
    return-object v0
.end method
