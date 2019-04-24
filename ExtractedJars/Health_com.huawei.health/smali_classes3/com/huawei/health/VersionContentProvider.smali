.class public Lcom/huawei/health/VersionContentProvider;
.super Landroid/content/ContentProvider;
.source "SourceFile"


# static fields
.field private static final a:Landroid/content/UriMatcher;

.field private static b:Ljava/lang/String;

.field private static final c:[Ljava/lang/String;

.field private static e:Ljava/lang/String;


# instance fields
.field private d:Landroid/database/sqlite/SQLiteDatabase;

.field private g:Lo/dcv;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 30
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "key"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "value"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/health/VersionContentProvider;->c:[Ljava/lang/String;

    .line 32
    const-string v0, "com.huawei.health.version.provider"

    sput-object v0, Lcom/huawei/health/VersionContentProvider;->b:Ljava/lang/String;

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/VersionContentProvider;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/VersionContentProvider;->e:Ljava/lang/String;

    .line 34
    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/huawei/health/VersionContentProvider;->a:Landroid/content/UriMatcher;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method

.method private b()V
    .locals 6

    .line 56
    invoke-virtual {p0}, Lcom/huawei/health/VersionContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-virtual {p0}, Lcom/huawei/health/VersionContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 59
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 60
    const-string v0, "key"

    const-string v1, "have_cloud_or_not"

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "value"

    invoke-virtual {p0}, Lcom/huawei/health/VersionContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/abi;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 64
    const-string v0, "key"

    const-string v1, "local_country_code"

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "value"

    invoke-virtual {v5, v0, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 68
    const-string v0, "key"

    const-string v1, "local_language_code"

    invoke-virtual {v5, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, "value"

    invoke-virtual {v5, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 71
    return-void
.end method

.method private d()V
    .locals 4

    .line 75
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 76
    const-string v0, "key"

    const-string v1, "allow_login_or_not"

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    const-string v0, "value"

    invoke-virtual {p0}, Lcom/huawei/health/VersionContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/abi;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 79
    return-void
.end method

.method private e()V
    .locals 4

    .line 38
    const-string v0, "com.huawei.health.version.provider"

    sput-object v0, Lcom/huawei/health/VersionContentProvider;->b:Ljava/lang/String;

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/huawei/health/VersionContentProvider;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/VersionContentProvider;->e:Ljava/lang/String;

    .line 40
    sget-object v0, Lcom/huawei/health/VersionContentProvider;->a:Landroid/content/UriMatcher;

    sget-object v1, Lcom/huawei/health/VersionContentProvider;->b:Ljava/lang/String;

    const-string v2, "module_200007_keyvaldb"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    .line 41
    return-void
.end method

.method private declared-synchronized e(Landroid/content/ContentValues;)V
    .locals 14

    monitor-enter p0

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->g:Lo/dcv;

    invoke-virtual {v0}, Lo/dcv;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    const/4 v8, 0x0

    .line 117
    const-string v0, "key"

    :try_start_1
    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 118
    const-string v0, "value"

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 119
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    const/4 v0, 0x0

    if-ne v0, v10, :cond_1

    .line 120
    :cond_0
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpDate_key_or_value_null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    nop

    .line 121
    .line 136
    monitor-exit p0

    return-void

    .line 123
    :cond_1
    const-string v11, "key = ?"

    .line 124
    const/4 v0, 0x1

    :try_start_2
    new-array v12, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v9, v12, v0

    .line 125
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    sget-object v2, Lcom/huawei/health/VersionContentProvider;->c:[Ljava/lang/String;

    move-object v3, v11

    move-object v4, v12

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v8, v0

    .line 127
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 128
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p1}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    goto :goto_0

    .line 130
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    invoke-virtual {v0, v1, p1, v11, v12}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/database/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 135
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 136
    :try_start_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    .line 132
    :catch_0
    move-exception v9

    .line 133
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryStorage error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 135
    const/4 v0, 0x0

    if-eq v0, v8, :cond_5

    .line 136
    :try_start_5
    invoke-interface {v8}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    .line 135
    :catchall_0
    move-exception v13

    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    .line 136
    :try_start_6
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 138
    :cond_4
    throw v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 139
    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 171
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->g:Lo/dcv;

    invoke-virtual {v0}, Lo/dcv;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 172
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 173
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete() uri = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    const/4 v0, 0x0

    return v0

    .line 176
    :cond_0
    sget-object v0, Lcom/huawei/health/VersionContentProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 177
    const/4 v5, 0x0

    .line 178
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 180
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    invoke-virtual {v0, v1, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 181
    .line 185
    :goto_0
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 143
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 8
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->g:Lo/dcv;

    invoke-virtual {v0}, Lo/dcv;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 150
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 151
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert() uri = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const/4 v0, 0x0

    return-object v0

    .line 154
    :cond_0
    sget-object v0, Lcom/huawei/health/VersionContentProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 156
    const-wide/16 v6, 0x0

    .line 157
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 159
    :sswitch_0
    invoke-direct {p0, p2}, Lcom/huawei/health/VersionContentProvider;->e(Landroid/content/ContentValues;)V

    .line 161
    .line 165
    :goto_0
    invoke-static {p1, v6, v7}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v5

    .line 166
    return-object v5

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public onCreate()Z
    .locals 4

    .line 45
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "on_createTable_getContext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/health/VersionContentProvider;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v0, Lo/dcv;

    invoke-virtual {p0}, Lcom/huawei/health/VersionContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "HwVersion.db"

    invoke-direct {v0, v1, v2}, Lo/dcv;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/health/VersionContentProvider;->g:Lo/dcv;

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/VersionContentProvider;->e()V

    .line 48
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 84
    const/4 v8, 0x0

    .line 85
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->g:Lo/dcv;

    invoke-virtual {v0}, Lo/dcv;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 86
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 88
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "query null == selection"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    const/4 v0, 0x0

    return-object v0

    .line 91
    :cond_0
    sget-object v0, Lcom/huawei/health/VersionContentProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v9

    .line 92
    sparse-switch v9, :sswitch_data_0

    goto :goto_0

    .line 94
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 96
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 97
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 98
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 100
    :cond_2
    invoke-direct {p0}, Lcom/huawei/health/VersionContentProvider;->b()V

    .line 101
    invoke-direct {p0}, Lcom/huawei/health/VersionContentProvider;->d()V

    .line 102
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 110
    :cond_3
    :goto_0
    return-object v8

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 6

    .line 190
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->g:Lo/dcv;

    invoke-virtual {v0}, Lo/dcv;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    .line 191
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 192
    const-string v0, "VersionContentProvider"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "update() uri = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const/4 v0, 0x0

    return v0

    .line 195
    :cond_0
    sget-object v0, Lcom/huawei/health/VersionContentProvider;->a:Landroid/content/UriMatcher;

    invoke-virtual {v0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result v4

    .line 196
    const/4 v5, 0x0

    .line 197
    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    .line 199
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/VersionContentProvider;->d:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "module_200007_keyvaldb"

    invoke-virtual {v0, v1, p2, p3, p4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 200
    .line 204
    :goto_0
    return v5

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
