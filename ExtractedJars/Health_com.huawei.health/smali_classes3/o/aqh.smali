.class public Lo/aqh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/content/ContentValues;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 4

    .line 156
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgTypeData()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    move-result-object v2

    .line 157
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getMsgType()Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;->f:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase$a;

    if-ne v0, v1, :cond_0

    .line 159
    move-object v3, v2

    check-cast v3, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    .line 160
    const-string v0, "msg_data1"

    invoke-virtual {v3}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->toJson()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    :cond_0
    return-void
.end method

.method public static b(Landroid/net/Uri;)J
    .locals 5

    .line 173
    const-wide/16 v2, 0x0

    .line 175
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 177
    const-string v0, "ChatDBUtil"

    const-string v1, "getIdByUri but uri is null. "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    return-wide v2

    .line 183
    :cond_0
    :try_start_0
    invoke-static {p0}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v2

    .line 194
    goto :goto_0

    .line 185
    :catch_0
    move-exception v4

    .line 187
    const-string v0, "ChatDBUtil"

    const-string v1, "parseId UnsupportedOperationException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    invoke-static {p0}, Lo/aqh;->d(Landroid/net/Uri;)J

    move-result-wide v2

    .line 194
    goto :goto_0

    .line 190
    :catch_1
    move-exception v4

    .line 192
    const-string v0, "ChatDBUtil"

    const-string v1, "parseId NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    invoke-static {p0}, Lo/aqh;->d(Landroid/net/Uri;)J

    move-result-wide v2

    .line 195
    :goto_0
    return-wide v2
.end method

.method public static b(Lcom/huawei/health/sns/model/chat/MessageItem;)Landroid/content/ContentValues;
    .locals 4

    .line 106
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 108
    const-string v0, "user_id"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 109
    const-string v0, "msg_status"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 110
    const-string v0, "chat_type"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getChatType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 111
    const-string v0, "msg_content"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    const-string v0, "assist_json"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgAssistJson()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    const-string v0, "msg_content_type"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 114
    const-string v0, "msg_date"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgDate()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 115
    const-string v0, "send_msg_status"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSendMsgStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 116
    const-string v0, "media_thumbnail"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbnail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v0, "msg_id"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    const-string v0, "media_id"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    const-string v0, "media_url"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    const-string v0, "media_time"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    const-string v0, "media_size"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaSize()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 122
    const-string v0, "media_remark"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaRemark()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 127
    const-string v0, "played"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 130
    :cond_0
    const-string v0, "sender_id"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 131
    const-string v0, "receicer_id"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getReceiverId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 132
    const-string v0, "seq"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSeq()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 133
    const-string v0, "previous_seq"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getPreviousSeq()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 134
    const-string v0, "pic_mts_url"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaMtsUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const-string v0, "pic_forward_url"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getForwardUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    const-string v0, "mts_download_status"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getDownloadStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 137
    const-string v0, "mts_ori_download_status"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getOriginalDownStatus()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 138
    const-string v0, "mts_thumb_flag"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMediaThumbFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "is_reffered_self"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getIsRefferedSelf()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 140
    const-string v0, "sender_name"

    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getSenderName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 143
    invoke-static {v3, p0}, Lo/aqh;->a(Landroid/content/ContentValues;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 145
    :cond_1
    return-object v3
.end method

.method public static b(Landroid/database/Cursor;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/ArrayList<Lcom/huawei/health/sns/model/chat/MessageItem;>;"
        }
    .end annotation

    .line 69
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 71
    :cond_0
    const-string v0, "ChatDBUtil"

    const-string v1, "getMessageItemDataToList the cursor is null or cursor.getCount()==0"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 82
    :cond_2
    :try_start_0
    new-instance v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 83
    invoke-virtual {v3, p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->buildFromCursor(Landroid/database/Cursor;)V

    .line 84
    invoke-static {v3, p0}, Lo/aqh;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/database/Cursor;)V

    .line 86
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_2

    .line 93
    goto :goto_0

    .line 90
    :catch_0
    move-exception v3

    .line 92
    const-string v0, "ChatDBUtil"

    const-string v1, "getMessageItemData IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    :goto_0
    return-object v2
.end method

.method private static d(Landroid/net/Uri;)J
    .locals 6

    .line 203
    const-wide/16 v3, 0x0

    .line 206
    :try_start_0
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-wide v0

    move-wide v3, v0

    .line 215
    goto :goto_0

    .line 208
    :catch_0
    move-exception v5

    .line 210
    const-string v0, "ChatDBUtil"

    const-string v1, "parseLong NumberFormatException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    goto :goto_0

    .line 212
    :catch_1
    move-exception v5

    .line 214
    const-string v0, "ChatDBUtil"

    const-string v1, "parseLong IndexOutOfBoundsException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    :goto_0
    return-wide v3
.end method

.method public static d(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/MessageItem;
    .locals 4

    .line 28
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 30
    :cond_0
    const-string v0, "ChatDBUtil"

    const-string v1, "getMessageItemData the cursor is null or cursor.getCount()==0"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    const/4 v0, 0x0

    return-object v0

    .line 33
    :cond_1
    new-instance v2, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v2}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 36
    :try_start_0
    invoke-virtual {v2, p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->buildFromCursor(Landroid/database/Cursor;)V

    .line 37
    invoke-static {v2, p0}, Lo/aqh;->d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/database/Cursor;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    goto :goto_0

    .line 39
    :catch_0
    move-exception v3

    .line 41
    const-string v0, "ChatDBUtil"

    const-string v1, "getMessageItemData IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    :goto_0
    return-object v2
.end method

.method private static d(Lcom/huawei/health/sns/model/chat/MessageItem;Landroid/database/Cursor;)V
    .locals 3

    .line 54
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContentType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 56
    const-string v0, "msg_data1"

    .line 57
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 56
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;->fromJson(Ljava/lang/String;)Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v2

    .line 58
    invoke-virtual {p0, v2}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgTypeData(Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    .line 60
    :cond_0
    return-void
.end method
