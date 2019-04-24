.class public final Lcom/huawei/health/sns/backup/BackupContentProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field private static final c:Landroid/content/UriMatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 30
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/huawei/health/sns/backup/BackupContentProvider;->c:Landroid/content/UriMatcher;

    .line 69
    sget-object v0, Lcom/huawei/health/sns/backup/BackupContentProvider;->c:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health.sns.backup"

    const-string v2, "setting"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 70
    sget-object v0, Lcom/huawei/health/sns/backup/BackupContentProvider;->c:Landroid/content/UriMatcher;

    const-string v1, "com.huawei.health.sns.backup"

    const-string v2, "messages"

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 71
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private b(Landroid/os/Bundle;Landroid/os/Bundle;)Z
    .locals 12

    .line 299
    const-string v0, "version"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    .line 301
    const-string v0, "extra_data"

    const-string v1, "-1"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 302
    const-wide/16 v0, -0x1

    invoke-static {v4, v0, v1}, Lo/anw;->c(Ljava/lang/String;J)J

    move-result-wide v5

    .line 305
    invoke-static {}, Lo/brg;->d()I

    move-result v7

    .line 306
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v8

    .line 307
    if-lt v7, v3, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    .line 309
    :goto_0
    cmp-long v0, v8, v5

    if-nez v0, :cond_1

    if-eqz v10, :cond_1

    .line 312
    const-string v0, "permit"

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 322
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 324
    const-string v0, "content://com.huawei.health.sns.backup/messages,300"

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    const-string v0, "content://com.huawei.health.sns.backup/setting,-1"

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    const-string v0, "support_bulkInsert_uri_list"

    invoke-virtual {p2, v0, v11}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 328
    const/4 v0, 0x1

    return v0

    .line 332
    :cond_1
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "valid recover data version match:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 333
    const-string v0, "permit"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 334
    const/4 v0, 0x0

    return v0
.end method

.method private e()Landroid/os/Bundle;
    .locals 6

    .line 268
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 271
    const-string v0, "version"

    invoke-static {}, Lo/brg;->d()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 274
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 275
    const-string v0, "content://com.huawei.health.sns.backup/messages"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    const-string v0, "content://com.huawei.health.sns.backup/setting"

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    const-string v0, "uri_list"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 278
    const-string v0, "uri_list_need_count"

    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 281
    const-string v0, "copyfile_path_list"

    invoke-static {}, Lo/anv;->e()Lo/anv;

    move-result-object v1

    invoke-virtual {v1}, Lo/anv;->i()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 284
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v4

    .line 285
    const-string v0, "extra_data"

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    return-object v2
.end method


# virtual methods
.method public bulkInsert(Landroid/net/Uri;[Landroid/content/ContentValues;)I
    .locals 5

    .line 191
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 194
    const-string v0, "SNS_BAK"

    const-string v1, "bulkInsert() No Login!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    const/4 v0, -0x1

    return v0

    .line 198
    :cond_0
    const/4 v3, 0x0

    .line 199
    sget-object v0, Lcom/huawei/health/sns/backup/BackupContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 200
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bulkInsert code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    const/4 v0, 0x2

    if-ne v4, v0, :cond_1

    .line 203
    invoke-static {p2}, Lo/anu;->c([Landroid/content/ContentValues;)I

    move-result v3

    goto :goto_0

    .line 207
    :cond_1
    const-string v0, "SNS_BAK"

    const-string v1, "bulkInsert no match code."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    :goto_0
    return v3
.end method

.method public call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 4

    .line 223
    invoke-super {p0, p1, p2, p3}, Landroid/content/ContentProvider;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 224
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    const-string v0, "SNS_BAK"

    const-string v1, "call() No Login!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const/4 v0, 0x0

    return-object v0

    .line 231
    :cond_0
    const-string v0, "backup_query"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 233
    const-string v0, "SNS_BAK"

    const-string v1, "backup query info."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    invoke-direct {p0}, Lcom/huawei/health/sns/backup/BackupContentProvider;->e()Landroid/os/Bundle;

    move-result-object v0

    return-object v0

    .line 237
    :cond_1
    const-string v0, "backup_recover_start"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 239
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 241
    invoke-direct {p0, p3, v3}, Lcom/huawei/health/sns/backup/BackupContentProvider;->b(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 243
    invoke-static {}, Lo/anv;->e()Lo/anv;

    move-result-object v0

    invoke-virtual {v0}, Lo/anv;->d()V

    .line 245
    :cond_2
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "backup recover start result:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "permit"

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    return-object v3

    .line 248
    :cond_3
    const-string v0, "backup_recover_complete"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 250
    const-string v0, "SNS_BAK"

    const-string v1, "backup recover complete."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    invoke-static {}, Lo/anv;->e()Lo/anv;

    move-result-object v0

    invoke-virtual {v0}, Lo/anv;->b()V

    goto :goto_0

    .line 256
    :cond_4
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "backup not exist protocol method:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    :goto_0
    return-object p3
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 133
    const/4 v0, 0x0

    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 127
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 5

    .line 152
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    const-string v0, "SNS_BAK"

    const-string v1, "insert() No Login!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const/4 v0, 0x0

    return-object v0

    .line 159
    :cond_0
    const/4 v3, 0x0

    .line 160
    sget-object v0, Lcom/huawei/health/sns/backup/BackupContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 161
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "insert match code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 166
    :sswitch_0
    new-instance v0, Lo/any;

    invoke-direct {v0}, Lo/any;-><init>()V

    invoke-virtual {v0, p2}, Lo/any;->d(Landroid/content/ContentValues;)I

    .line 167
    const-string v0, "content://com.huawei.health.sns.backup/setting/1"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 168
    goto :goto_0

    .line 172
    :sswitch_1
    invoke-static {p2}, Lo/anu;->d(Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v3

    .line 173
    .line 178
    :goto_0
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate()Z
    .locals 1

    .line 81
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 5

    .line 97
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    const-string v0, "SNS_BAK"

    const-string v1, "query() No Login!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_0
    const/4 v3, 0x0

    .line 104
    sget-object v0, Lcom/huawei/health/sns/backup/BackupContentProvider;->c:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 105
    const-string v0, "SNS_BAK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query match code:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 110
    :sswitch_0
    invoke-static {}, Lo/anv;->e()Lo/anv;

    move-result-object v0

    invoke-virtual {v0}, Lo/anv;->c()Landroid/database/Cursor;

    move-result-object v3

    .line 111
    goto :goto_0

    .line 115
    :sswitch_1
    invoke-static {}, Lo/anv;->e()Lo/anv;

    move-result-object v0

    invoke-virtual {v0}, Lo/anv;->a()Landroid/database/Cursor;

    move-result-object v3

    .line 116
    .line 121
    :goto_0
    return-object v3

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1

    .line 139
    const/4 v0, 0x0

    return v0
.end method
