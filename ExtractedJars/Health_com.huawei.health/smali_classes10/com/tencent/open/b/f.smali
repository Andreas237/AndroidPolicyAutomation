.class public Lcom/tencent/open/b/f;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field protected static final a:[Ljava/lang/String;

.field protected static b:Lcom/tencent/open/b/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 44
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "key"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lcom/tencent/open/b/f;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 57
    const-string v0, "sdk_report.db"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 58
    return-void
.end method

.method public static declared-synchronized a()Lcom/tencent/open/b/f;
    .locals 4

    const-class v2, Lcom/tencent/open/b/f;

    monitor-enter v2

    .line 49
    :try_start_0
    sget-object v0, Lcom/tencent/open/b/f;->b:Lcom/tencent/open/b/f;

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Lcom/tencent/open/b/f;

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/tencent/open/b/f;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/tencent/open/b/f;->b:Lcom/tencent/open/b/f;

    .line 53
    :cond_0
    sget-object v0, Lcom/tencent/open/b/f;->b:Lcom/tencent/open/b/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/io/Serializable;>;"
        }
    .end annotation

    monitor-enter p0

    .line 81
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    .line 83
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    monitor-exit p0

    return-object v8

    .line 86
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/tencent/open/b/f;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v9

    .line 87
    if-nez v9, :cond_1

    .line 88
    monitor-exit p0

    return-object v8

    .line 91
    :cond_1
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 94
    move-object v0, v9

    const-string v1, "via_cgi_report"

    const-string v3, "type = ?"

    const/4 v2, 0x1

    :try_start_1
    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v4, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v10, v0

    .line 95
    if-eqz v10, :cond_7

    invoke-interface {v10}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_7

    .line 96
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 98
    :cond_2
    const-string v0, "blob"

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v10, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v12

    .line 100
    new-instance v13, Ljava/io/ByteArrayInputStream;

    invoke-direct {v13, v12}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    const/4 v14, 0x0

    .line 103
    const/4 v15, 0x0

    .line 106
    :try_start_2
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, v13}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v14, v0

    .line 107
    invoke-virtual {v14}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v15, v0

    .line 111
    if-eqz v14, :cond_3

    .line 112
    :try_start_3
    invoke-virtual {v14}, Ljava/io/ObjectInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 116
    :cond_3
    goto :goto_0

    .line 114
    :catch_0
    move-exception v16

    .line 118
    :goto_0
    :try_start_4
    invoke-virtual {v13}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 121
    goto :goto_4

    .line 119
    :catch_1
    move-exception v16

    .line 122
    goto :goto_4

    .line 108
    :catch_2
    move-exception v16

    .line 111
    if-eqz v14, :cond_4

    .line 112
    :try_start_5
    invoke-virtual {v14}, Ljava/io/ObjectInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 116
    :cond_4
    goto :goto_1

    .line 114
    :catch_3
    move-exception v16

    .line 118
    :goto_1
    :try_start_6
    invoke-virtual {v13}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 121
    goto :goto_4

    .line 119
    :catch_4
    move-exception v16

    .line 122
    goto :goto_4

    .line 110
    :catchall_0
    move-exception v17

    .line 111
    if-eqz v14, :cond_5

    .line 112
    :try_start_7
    invoke-virtual {v14}, Ljava/io/ObjectInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 116
    :cond_5
    goto :goto_2

    .line 114
    :catch_5
    move-exception v18

    .line 118
    :goto_2
    :try_start_8
    invoke-virtual {v13}, Ljava/io/ByteArrayInputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 121
    goto :goto_3

    .line 119
    :catch_6
    move-exception v18

    .line 121
    :goto_3
    :try_start_9
    throw v17

    .line 123
    :goto_4
    if-eqz v15, :cond_6

    .line 124
    invoke-interface {v8, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_6
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    move-result v0

    if-nez v0, :cond_2

    .line 131
    :cond_7
    if-eqz v10, :cond_8

    .line 132
    :try_start_a
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 134
    :cond_8
    nop

    .line 136
    .line 137
    .line 138
    .line 139
    .line 141
    const/4 v0, 0x0

    if-eq v0, v9, :cond_c

    .line 142
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_5

    .line 128
    :catch_7
    move-exception v12

    .line 129
    const-string v0, "openSDK_LOG.ReportDatabaseHelper"

    const-string v1, "getReportItemFromDB has exception."

    :try_start_b
    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 131
    if-eqz v10, :cond_9

    .line 132
    :try_start_c
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 134
    :cond_9
    nop

    .line 136
    .line 137
    .line 138
    .line 139
    .line 141
    const/4 v0, 0x0

    if-eq v0, v9, :cond_c

    .line 142
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto :goto_5

    .line 131
    :catchall_1
    move-exception v19

    if-eqz v10, :cond_a

    .line 132
    :try_start_d
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 134
    :cond_a
    nop

    .line 136
    .line 137
    .line 138
    .line 139
    .line 141
    const/4 v0, 0x0

    if-eq v0, v9, :cond_b

    .line 142
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_b
    throw v19
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 145
    :cond_c
    :goto_5
    monitor-exit p0

    return-object v8

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;Ljava/util/List;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/io/Serializable;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 189
    :try_start_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    .line 190
    if-nez v2, :cond_0

    .line 191
    monitor-exit p0

    return-void

    .line 194
    :cond_0
    const/16 v0, 0x14

    if-gt v2, v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/16 v0, 0x14

    :goto_0
    move v2, v0

    .line 196
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 197
    monitor-exit p0

    return-void

    .line 201
    :cond_2
    invoke-virtual {p0, p1}, Lcom/tencent/open/b/f;->b(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p0}, Lcom/tencent/open/b/f;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    .line 203
    if-nez v3, :cond_3

    .line 204
    monitor-exit p0

    return-void

    .line 207
    :cond_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 209
    :try_start_1
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 210
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_8

    .line 211
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/io/Serializable;

    .line 212
    if-eqz v6, :cond_7

    .line 213
    const-string v0, "type"

    invoke-virtual {v4, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    new-instance v7, Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x200

    invoke-direct {v7, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    const/4 v8, 0x0

    .line 218
    :try_start_2
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-direct {v0, v7}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v8, v0

    .line 219
    invoke-virtual {v8, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 223
    if-eqz v8, :cond_4

    .line 224
    :try_start_3
    invoke-virtual {v8}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 228
    :cond_4
    goto :goto_2

    .line 226
    :catch_0
    move-exception v9

    .line 230
    :goto_2
    :try_start_4
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 233
    goto :goto_6

    .line 231
    :catch_1
    move-exception v9

    .line 234
    goto :goto_6

    .line 220
    :catch_2
    move-exception v9

    .line 223
    if-eqz v8, :cond_5

    .line 224
    :try_start_5
    invoke-virtual {v8}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 228
    :cond_5
    goto :goto_3

    .line 226
    :catch_3
    move-exception v9

    .line 230
    :goto_3
    :try_start_6
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 233
    goto :goto_6

    .line 231
    :catch_4
    move-exception v9

    .line 234
    goto :goto_6

    .line 222
    :catchall_0
    move-exception v10

    .line 223
    if-eqz v8, :cond_6

    .line 224
    :try_start_7
    invoke-virtual {v8}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 228
    :cond_6
    goto :goto_4

    .line 226
    :catch_5
    move-exception v11

    .line 230
    :goto_4
    :try_start_8
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 233
    goto :goto_5

    .line 231
    :catch_6
    move-exception v11

    .line 233
    :goto_5
    :try_start_9
    throw v10

    .line 235
    :goto_6
    const-string v0, "blob"

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 236
    const-string v0, "via_cgi_report"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 239
    :cond_7
    invoke-virtual {v4}, Landroid/content/ContentValues;->clear()V

    .line 210
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    .line 241
    :cond_8
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 245
    :try_start_a
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 246
    const/4 v0, 0x0

    if-eq v0, v3, :cond_a

    .line 247
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_7

    .line 242
    :catch_7
    move-exception v4

    .line 243
    const-string v0, "openSDK_LOG.ReportDatabaseHelper"

    const-string v1, "saveReportItemToDB has exception."

    :try_start_b
    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 245
    :try_start_c
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 246
    const/4 v0, 0x0

    if-eq v0, v3, :cond_a

    .line 247
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto :goto_7

    .line 245
    :catchall_1
    move-exception v12

    :try_start_d
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 246
    const/4 v0, 0x0

    if-eq v0, v3, :cond_9

    .line 247
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_9
    throw v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 251
    :cond_a
    :goto_7
    monitor-exit p0

    return-void

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 7

    monitor-enter p0

    .line 259
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 260
    monitor-exit p0

    return-void

    .line 262
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/open/b/f;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v4

    .line 263
    if-nez v4, :cond_1

    .line 264
    monitor-exit p0

    return-void

    .line 268
    :cond_1
    const-string v0, "via_cgi_report"

    const-string v1, "type = ?"

    const/4 v2, 0x1

    :try_start_1
    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v4, v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 272
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 273
    :try_start_2
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 269
    :catch_0
    move-exception v5

    .line 270
    const-string v0, "openSDK_LOG.ReportDatabaseHelper"

    const-string v1, "clearReportItem has exception."

    :try_start_3
    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 272
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 273
    :try_start_4
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    .line 272
    :catchall_0
    move-exception v6

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 273
    :try_start_5
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    :cond_2
    throw v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 276
    :cond_3
    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 62
    const-string v0, "CREATE TABLE IF NOT EXISTS via_cgi_report( _id INTEGER PRIMARY KEY,key TEXT,type TEXT,blob BLOB);"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 67
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    .line 71
    const-string v0, "DROP TABLE IF EXISTS via_cgi_report"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 72
    invoke-virtual {p0, p1}, Lcom/tencent/open/b/f;->onCreate(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 73
    return-void
.end method
