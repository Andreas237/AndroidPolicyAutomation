.class public Lo/asc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lo/asc;->a:Landroid/content/Context;

    .line 56
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 4

    .line 249
    invoke-static {p1}, Lo/boh;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 250
    const-string v0, "00861[0-9]{10,}"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    .line 251
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    .line 252
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public c()Ljava/util/HashMap;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;"
        }
    .end annotation

    .line 184
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 186
    sget-object v7, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    .line 187
    const/4 v0, 0x3

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "raw_contact_id"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    const-string v0, "display_name"

    const/4 v1, 0x1

    aput-object v0, v8, v1

    const-string v0, "data1"

    const/4 v1, 0x2

    aput-object v0, v8, v1

    .line 189
    const-string v9, "raw_contact_id ASC"

    .line 190
    const/4 v10, 0x0

    .line 191
    const/4 v11, 0x1

    .line 192
    const/4 v12, 0x2

    .line 194
    const/4 v13, 0x0

    .line 197
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/asc;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, v7

    move-object v2, v8

    const-string v5, "raw_contact_id ASC"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v13, v0

    .line 198
    if-eqz v13, :cond_3

    invoke-interface {v13}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_3

    .line 204
    const/16 v18, 0x0

    .line 205
    :goto_0
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 207
    const/4 v0, 0x0

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    .line 208
    const/4 v0, 0x1

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 209
    const/4 v0, 0x2

    invoke-interface {v13, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 212
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Lo/asc;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 214
    goto :goto_0

    .line 217
    :cond_0
    if-eqz v18, :cond_1

    invoke-virtual/range {v18 .. v18}, Lo/asd;->b()J

    move-result-wide v0

    cmp-long v0, v0, v14

    if-eqz v0, :cond_2

    .line 219
    :cond_1
    new-instance v0, Lo/asd;

    move-object/from16 v1, v16

    invoke-direct {v0, v14, v15, v1}, Lo/asd;-><init>(JLjava/lang/String;)V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/asd;->b(Ljava/lang/String;)Lo/asd;

    move-result-object v18

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v6, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 224
    :cond_2
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/asd;->b(Ljava/lang/String;)Lo/asd;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 235
    :cond_3
    invoke-static {v13}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 236
    goto :goto_1

    .line 229
    :catch_0
    move-exception v14

    .line 231
    const-string v0, "SystemContactDBHelper"

    const-string v1, "getAllPhoneFromSys Exception"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 235
    invoke-static {v13}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 236
    goto :goto_1

    .line 235
    :catchall_0
    move-exception v19

    invoke-static {v13}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 236
    throw v19

    .line 238
    :goto_1
    return-object v6
.end method

.method public d()Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 65
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v6

    .line 66
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 67
    const/4 v0, 0x2

    new-array v8, v0, [Ljava/lang/String;

    const-string v0, "_id"

    const/4 v1, 0x0

    aput-object v0, v8, v1

    const-string v0, "version"

    const/4 v1, 0x1

    aput-object v0, v8, v1

    .line 69
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v9

    .line 70
    const/4 v10, 0x0

    .line 73
    move-object v0, v9

    :try_start_0
    sget-object v1, Landroid/provider/ContactsContract$RawContacts;->CONTENT_URI:Landroid/net/Uri;

    move-object v2, v8

    const-string v3, "deleted==0 "

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 76
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 77
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 78
    if-eqz v10, :cond_0

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 80
    :goto_0
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    const/4 v0, 0x1

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 86
    :cond_0
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 96
    goto :goto_1

    .line 89
    :catch_0
    move-exception v11

    .line 91
    const-string v0, "SystemContactDBHelper"

    const-string v1, "getIdAndVersionListFromSys SQLException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 96
    goto :goto_1

    .line 95
    :catchall_0
    move-exception v13

    invoke-static {v10}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 96
    throw v13

    .line 98
    :goto_1
    return-object v7
.end method

.method public e(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;)Ljava/util/HashMap<Ljava/lang/String;Lo/asd;>;"
        }
    .end annotation

    .line 109
    sget-object v6, Landroid/provider/ContactsContract$CommonDataKinds$Email;->CONTENT_URI:Landroid/net/Uri;

    .line 110
    const/4 v0, 0x3

    new-array v7, v0, [Ljava/lang/String;

    const-string v0, "raw_contact_id"

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const-string v0, "display_name"

    const/4 v1, 0x1

    aput-object v0, v7, v1

    const-string v0, "data1"

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 113
    const-string v8, "raw_contact_id ASC"

    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v10, 0x1

    .line 116
    const/4 v11, 0x2

    .line 118
    const/4 v12, 0x0

    .line 121
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/asc;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, v6

    move-object v2, v7

    const-string v5, "raw_contact_id ASC"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v12, v0

    .line 122
    if-eqz v12, :cond_4

    invoke-interface {v12}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_4

    .line 129
    const/16 v18, 0x0

    .line 130
    :goto_0
    invoke-interface {v12}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 132
    const/4 v0, 0x0

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    .line 133
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v15

    .line 134
    const/4 v0, 0x1

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 135
    const/4 v0, 0x2

    invoke-interface {v12, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    .line 137
    invoke-static/range {v17 .. v17}, Lo/bqz;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    goto :goto_0

    .line 143
    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v17

    .line 145
    if-eqz v18, :cond_1

    invoke-virtual/range {v18 .. v18}, Lo/asd;->b()J

    move-result-wide v0

    cmp-long v0, v0, v13

    if-eqz v0, :cond_3

    .line 147
    :cond_1
    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 149
    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/asd;

    .line 150
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/asd;->a(Ljava/lang/String;)Lo/asd;

    goto :goto_0

    .line 154
    :cond_2
    new-instance v0, Lo/asd;

    move-object/from16 v1, v16

    invoke-direct {v0, v13, v14, v1}, Lo/asd;-><init>(JLjava/lang/String;)V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/asd;->a(Ljava/lang/String;)Lo/asd;

    move-result-object v18

    .line 155
    move-object/from16 v0, p1

    move-object/from16 v1, v18

    invoke-virtual {v0, v15, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 160
    :cond_3
    move-object/from16 v0, v18

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Lo/asd;->a(Ljava/lang/String;)Lo/asd;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 171
    :cond_4
    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 172
    goto :goto_1

    .line 165
    :catch_0
    move-exception v13

    .line 167
    const-string v0, "SystemContactDBHelper"

    const-string v1, "getAllEmailFromSys Exception"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 172
    goto :goto_1

    .line 171
    :catchall_0
    move-exception v19

    invoke-static {v12}, Lo/bpe;->b(Landroid/database/Cursor;)V

    .line 172
    throw v19

    .line 174
    :goto_1
    return-object p1
.end method
