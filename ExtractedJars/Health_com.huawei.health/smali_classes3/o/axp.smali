.class public Lo/axp;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 161
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    invoke-virtual {p1, p2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentValues;
    .locals 5

    .line 176
    invoke-virtual {p0, p1}, Lo/axp;->d(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentValues;

    move-result-object v4

    .line 177
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 179
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 182
    :cond_0
    return-object v4
.end method

.method public a(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotify;
    .locals 7

    .line 220
    new-instance v2, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/UserNotify;-><init>()V

    .line 221
    const-string v0, "user_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->setUserId(J)V

    .line 222
    const-string v0, "image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setImageUrl(Ljava/lang/String;)V

    .line 223
    const-string v0, "old_image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setOldImageUrl(Ljava/lang/String;)V

    .line 224
    const-string v0, "image_download_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setUrlDownload(Ljava/lang/String;)V

    .line 225
    const-string v0, "nick_name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNickName(Ljava/lang/String;)V

    .line 226
    const-string v0, "phone_digest"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setPhoneDigest(Ljava/lang/String;)V

    .line 227
    const-string v0, "newly_recieved_notify"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    .line 228
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 229
    :goto_0
    invoke-virtual {v2, v4}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 230
    const-string v0, "type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->e(I)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 231
    const-string v0, "state"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setState(I)V

    .line 232
    const-string v0, "notifiedSide"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNotifiedSide(I)V

    .line 233
    const-string v0, "send_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setSendTime(Ljava/lang/String;)V

    .line 234
    const-string v0, "note"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNote(Ljava/lang/String;)V

    .line 236
    new-instance v5, Lcom/huawei/health/sns/server/user/Origin;

    const-string v0, "frd_origin_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const-string v1, "frd_origin_desc"

    .line 237
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    .line 238
    invoke-virtual {v2, v5}, Lcom/huawei/health/sns/model/user/UserNotify;->setFrdOrigin(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 240
    new-instance v6, Lcom/huawei/health/sns/server/user/Origin;

    const-string v0, "my_origin_type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const-string v1, "my_origin_desc"

    .line 241
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v6, v0, v1}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    .line 242
    invoke-virtual {v2, v6}, Lcom/huawei/health/sns/model/user/UserNotify;->setMyOrigin(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 243
    return-object v2
.end method

.method public b(Lcom/huawei/health/sns/model/user/UserNotifyNote;)Landroid/content/ContentValues;
    .locals 5

    .line 194
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 195
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getId()I

    move-result v0

    if-lez v0, :cond_0

    .line 197
    const-string v0, "id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 200
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 202
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 204
    :cond_1
    const-string v0, "note"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    const-string v0, "send_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSendTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v4, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 207
    const-string v0, "sender"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getSender()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 208
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 209
    return-object v4
.end method

.method public b(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotifyNote;
    .locals 3

    .line 254
    new-instance v2, Lcom/huawei/health/sns/model/user/UserNotifyNote;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/user/UserNotifyNote;-><init>()V

    .line 255
    const-string v0, "id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setId(I)V

    .line 256
    const-string v0, "user_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setUserId(J)V

    .line 257
    const-string v0, "note"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setNote(Ljava/lang/String;)V

    .line 258
    const-string v0, "sender"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setSender(I)V

    .line 259
    const-string v0, "send_time"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setSendTime(Ljava/lang/String;)V

    .line 260
    const-string v0, "type"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/UserNotifyNote;->setType(I)V

    .line 261
    return-object v2
.end method

.method public d(Lcom/huawei/health/sns/model/user/UserNotify;)Landroid/content/ContentValues;
    .locals 6

    .line 117
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 119
    const-string v0, "image_url"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v0, "old_image_url"

    .line 121
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getOldImageUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, ""

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getOldImageUrl()Ljava/lang/String;

    move-result-object v1

    .line 120
    :goto_1
    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v0, "image_download_url"

    .line 123
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v1, ""

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUrlDownload()Ljava/lang/String;

    move-result-object v1

    .line 122
    :goto_2
    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    const-string v0, "nick_name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v0, "phone_digest"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v0, "send_time"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getSendTime()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "note"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNote()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->isReaded()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    .line 130
    :goto_3
    const-string v0, "newly_recieved_notify"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 131
    const-string v0, "type"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v1

    if-nez v1, :cond_4

    const/4 v1, -0x1

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getType()Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/UserNotify$b;->c()I

    move-result v1

    :goto_4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 132
    const-string v0, "state"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getState()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 133
    const-string v0, "notifiedSide"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNotifiedSide()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 136
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getFrdOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v4

    .line 137
    if-eqz v4, :cond_5

    .line 139
    const-string v0, "frd_origin_type"

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 140
    const-string v0, "frd_origin_desc"

    invoke-virtual {v4}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/UserNotify;->getMyOrigin()Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v5

    .line 144
    if-eqz v5, :cond_6

    .line 146
    const-string v0, "my_origin_type"

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/Origin;->getType_()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 147
    const-string v0, "my_origin_desc"

    invoke-virtual {v5}, Lcom/huawei/health/sns/server/user/Origin;->getDesc_()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lo/axp;->e(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    :cond_6
    return-object v2
.end method

.method public d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/user/UserNotify;
    .locals 6

    .line 84
    new-instance v3, Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/UserNotify;-><init>()V

    .line 85
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/user/UserNotify;->setUserId(J)V

    .line 86
    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setImageUrl(Ljava/lang/String;)V

    .line 87
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setUrlDownload(Ljava/lang/String;)V

    .line 88
    const/4 v0, 0x3

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNickName(Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x4

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setContactName(Ljava/lang/String;)V

    .line 90
    const/4 v0, 0x5

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setPhoneDigest(Ljava/lang/String;)V

    .line 91
    const/4 v0, 0x6

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    .line 92
    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 93
    :goto_0
    invoke-virtual {v3, v5}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsReaded(Z)V

    .line 94
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lcom/huawei/health/sns/model/user/UserNotify$b;->e(I)Lcom/huawei/health/sns/model/user/UserNotify$b;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setType(Lcom/huawei/health/sns/model/user/UserNotify$b;)V

    .line 95
    const/16 v0, 0x8

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setSendTime(Ljava/lang/String;)V

    .line 96
    const/16 v0, 0x9

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNote(Ljava/lang/String;)V

    .line 97
    const/16 v0, 0xa

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setState(I)V

    .line 98
    const/16 v0, 0xb

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setNotifiedSide(I)V

    .line 99
    const/16 v0, 0xc

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setIsFriend(I)V

    .line 100
    const/16 v0, 0xd

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setOldImageUrl(Ljava/lang/String;)V

    .line 101
    const/16 v0, 0xe

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setRemarkName(Ljava/lang/String;)V

    .line 102
    const/16 v0, 0xf

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setPhoneNumber(Ljava/lang/String;)V

    .line 103
    const/16 v0, 0x10

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setAccount(Ljava/lang/String;)V

    .line 104
    const/16 v0, 0x11

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setGender(I)V

    .line 105
    const/16 v0, 0x12

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setProvince(Ljava/lang/String;)V

    .line 106
    const/16 v0, 0x13

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setCity(Ljava/lang/String;)V

    .line 107
    const/16 v0, 0x14

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setSignature(Ljava/lang/String;)V

    .line 108
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    const/16 v1, 0x15

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 109
    const/16 v2, 0x16

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    .line 108
    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setFrdOrigin(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 110
    new-instance v0, Lcom/huawei/health/sns/server/user/Origin;

    const/16 v1, 0x17

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    .line 111
    const/16 v2, 0x18

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/health/sns/server/user/Origin;-><init>(ILjava/lang/String;)V

    .line 110
    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/user/UserNotify;->setMyOrigin(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 112
    return-object v3
.end method
