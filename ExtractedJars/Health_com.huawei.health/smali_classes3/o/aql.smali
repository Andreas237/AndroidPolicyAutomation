.class public Lo/aql;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private e:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    .line 38
    return-void
.end method

.method private a(Lcom/huawei/health/sns/model/chat/Assistant;)Landroid/content/ContentValues;
    .locals 4

    .line 245
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 246
    const-string v0, "user_id"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 247
    const-string v0, "introduction"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getIntroduction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    const-string v0, "menu"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getMenu()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    const-string v0, "channel"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getChannel()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 250
    const-string v0, "default_msg"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getDefaultMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    const-string v0, "emui_only"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getEmuiOnly()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    const-string v0, "appid"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getAppId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const-string v0, "name"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    const-string v0, "package"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    const-string v0, "require_version"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getRequireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    const-string v0, "company"

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getCompany()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    return-object v3
.end method

.method private a()[Ljava/lang/String;
    .locals 3

    .line 92
    const/16 v0, 0x19

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "t_assistant.user_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "t_assistant.introduction"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "t_assistant.channel"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "t_assistant.menu"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "t_assistant.default_msg"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "t_assistant.emui_only"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "t_assistant.appid"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "t_assistant.name"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "t_assistant.package"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "t_assistant.require_version"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "t_assistant.company"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "t_user.nick_name"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "t_user.image_url_download"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "t_user.old_image_url"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "t_user.set_flags"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "t_user.site_id"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "t_user.user_type"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "t_user.is_friend"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "t_user.search_full_pinyin"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "t_user.search_short_pinyin"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "t_user.search_pinyin_fenci"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "t_user.state"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "t_user.relation"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "t_user.stick_time"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    return-object v0
.end method

.method private e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 33

    .line 128
    new-instance v6, Lcom/huawei/health/sns/model/chat/Assistant;

    invoke-direct {v6}, Lcom/huawei/health/sns/model/chat/Assistant;-><init>()V

    .line 129
    const-string v0, "user_id"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    .line 130
    const-string v0, "introduction"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 131
    const-string v0, "channel"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 132
    const-string v0, "menu"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 133
    const-string v0, "default_msg"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    .line 134
    const-string v0, "emui_only"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    .line 135
    const-string v0, "appid"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 136
    const-string v0, "name"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 137
    const-string v0, "package"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 138
    const-string v0, "require_version"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 139
    const-string v0, "company"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v18

    .line 141
    const-string v0, "nick_name"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 142
    const-string v0, "image_url"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    .line 143
    const-string v0, "image_url_download"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    .line 144
    const-string v0, "old_image_url"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    .line 145
    const-string v0, "set_flags"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v23

    .line 146
    const-string v0, "site_id"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    .line 147
    const-string v0, "user_type"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v25

    .line 148
    const-string v0, "is_friend"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v26

    .line 149
    const-string v0, "search_full_pinyin"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v27

    .line 150
    const-string v0, "search_short_pinyin"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v28

    .line 151
    const-string v0, "search_pinyin_fenci"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v29

    .line 152
    const-string v0, "state"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    .line 153
    const-string v0, "relation"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v31

    .line 154
    const-string v0, "stick_time"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v32

    .line 156
    invoke-virtual {v6, v7, v8}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserId(J)V

    .line 158
    move-object v0, v6

    move-object v1, v10

    move-object v2, v12

    move-object/from16 v3, v18

    move-object v4, v9

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/chat/Assistant;->setSomeInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    move-object v0, v6

    move-object v1, v13

    move-object v2, v14

    move-object v3, v15

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/model/chat/Assistant;->setAppInfoData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    move-object/from16 v0, v19

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setNickName(Ljava/lang/String;)V

    .line 162
    move-object/from16 v0, v20

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setImageUrl(Ljava/lang/String;)V

    .line 163
    move-object/from16 v0, v21

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setImageURLDownload(Ljava/lang/String;)V

    .line 164
    move-object/from16 v0, v22

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setOldImageUrl(Ljava/lang/String;)V

    .line 165
    move-object/from16 v0, v23

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSetFlags(Ljava/lang/String;)V

    .line 166
    move/from16 v0, v24

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSiteId(I)V

    .line 167
    move/from16 v0, v25

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setUserType(I)V

    .line 168
    move/from16 v0, v26

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setIsFriend(I)V

    .line 169
    move-object/from16 v0, v27

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSearchFullPinyin(Ljava/lang/String;)V

    .line 170
    move-object/from16 v0, v28

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSearchShortPinyin(Ljava/lang/String;)V

    .line 171
    move-object/from16 v0, v29

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setSearchPinyinFenci(Ljava/lang/String;)V

    .line 172
    move/from16 v0, v30

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setState(I)V

    .line 173
    move/from16 v0, v31

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setRelation(I)V

    .line 174
    move-object/from16 v0, v32

    invoke-virtual {v6, v0}, Lcom/huawei/health/sns/model/chat/Assistant;->setStickTime(Ljava/lang/String;)V

    .line 176
    return-object v6
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/chat/Assistant;)Z
    .locals 7

    .line 213
    const/4 v2, 0x0

    .line 214
    invoke-direct {p0, p1}, Lo/aql;->a(Lcom/huawei/health/sns/model/chat/Assistant;)Landroid/content/ContentValues;

    move-result-object v3

    .line 217
    const-string v4, "user_id =? "

    .line 219
    const/4 v0, 0x1

    :try_start_0
    new-array v5, v0, [Ljava/lang/String;

    .line 220
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/Assistant;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 222
    iget-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$c;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v6

    .line 223
    if-lez v6, :cond_0

    .line 225
    const/4 v2, 0x1

    .line 226
    sget-object v0, Lo/bbz$c;->b:Landroid/net/Uri;

    iget-object v1, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    invoke-static {v0, v1}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    :cond_0
    goto :goto_0

    .line 229
    :catch_0
    move-exception v4

    .line 231
    const-string v0, "AssistantDBHelper"

    const-string v1, "updateAssistant SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    :goto_0
    return v2
.end method

.method public d(Ljava/lang/String;)J
    .locals 14

    .line 268
    const-wide/16 v6, -0x1

    .line 269
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    const-string v0, "AssistantDBHelper"

    const-string v1, "getAssistantByChannel error, channel is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    return-wide v6

    .line 274
    :cond_0
    const/4 v8, 0x0

    .line 277
    const-string v9, "channel =? "

    .line 279
    const/4 v0, 0x1

    :try_start_0
    new-array v10, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v10, v0

    .line 282
    iget-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$c;->b:Landroid/net/Uri;

    move-object v3, v9

    move-object v4, v10

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 284
    if-nez v8, :cond_1

    .line 286
    const-wide/16 v11, -0x1

    .line 302
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 286
    return-wide v11

    .line 289
    :cond_1
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 291
    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    .line 293
    const-string v0, "user_id"

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-wide v0

    move-wide v6, v0

    .line 302
    :cond_2
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 303
    goto :goto_0

    .line 296
    :catch_0
    move-exception v9

    .line 298
    const-string v0, "AssistantDBHelper"

    const-string v1, "getAssistantById SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 303
    goto :goto_0

    .line 302
    :catchall_0
    move-exception v13

    invoke-static {v8}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 303
    throw v13

    .line 304
    :goto_0
    return-wide v6
.end method

.method public d(Lcom/huawei/health/sns/model/chat/Assistant;)Z
    .locals 5

    .line 187
    const/4 v2, 0x0

    .line 188
    invoke-direct {p0, p1}, Lo/aql;->a(Lcom/huawei/health/sns/model/chat/Assistant;)Landroid/content/ContentValues;

    move-result-object v3

    .line 191
    :try_start_0
    iget-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$c;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v4

    .line 192
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 194
    const/4 v2, 0x1

    .line 195
    iget-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    invoke-static {v4, v0}, Lo/bbv;->b(Landroid/net/Uri;Landroid/content/ContentResolver;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :cond_0
    goto :goto_0

    .line 198
    :catch_0
    move-exception v4

    .line 200
    const-string v0, "AssistantDBHelper"

    const-string v1, "insertAssistant SQLException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    :goto_0
    return v2
.end method

.method public e(J)Lcom/huawei/health/sns/model/chat/Assistant;
    .locals 12

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 53
    const-string v8, "t_assistant.user_id =? "

    .line 55
    const/4 v0, 0x1

    :try_start_0
    new-array v9, v0, [Ljava/lang/String;

    .line 56
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v9, v1

    .line 58
    iget-object v0, p0, Lo/aql;->e:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$c;->c:Landroid/net/Uri;

    invoke-direct {p0}, Lo/aql;->a()[Ljava/lang/String;

    move-result-object v2

    move-object v3, v8

    move-object v4, v9

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 61
    if-nez v7, :cond_0

    .line 63
    const/4 v10, 0x0

    .line 79
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 63
    return-object v10

    .line 66
    :cond_0
    :try_start_1
    invoke-interface {v7}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 68
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 70
    invoke-direct {p0, v7}, Lo/aql;->e(Landroid/database/Cursor;)Lcom/huawei/health/sns/model/chat/Assistant;
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v6, v0

    .line 79
    :cond_1
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 80
    goto :goto_0

    .line 73
    :catch_0
    move-exception v8

    .line 75
    const-string v0, "AssistantDBHelper"

    const-string v1, "getAssistantById SQLException."

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 80
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v11

    invoke-static {v7}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 80
    throw v11

    .line 81
    :goto_0
    return-object v6
.end method
