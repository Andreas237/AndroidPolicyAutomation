.class public Lo/dcp;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# static fields
.field private static e:Lo/dcp;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 36
    const-string v0, "HwCPDatas.db"

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 37
    return-void
.end method

.method private b(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 6

    .line 108
    const-string v4, "id integer primary key autoincrement,msgType integer not null check(msgType >= 10000),msgSrc integer not null check(msgSrc > 0),msgContentType integer not null check(msgContentType > 0),msgContent text not null,showMethod text,createTime integer not null,updateTime integer,expireTime integer,status integer not null check(status > 0),huid text,showTime text,priority integer not null"

    .line 121
    const-string v0, "ContentProviderDB"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ContentProviderDB_createTable | create new table sql = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    .line 124
    const-string v0, "create table IF NOT EXISTS "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 125
    const-string v0, "module_20009_smart_msg("

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 126
    invoke-virtual {v5, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 127
    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 128
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 129
    return-void
.end method

.method private c(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    .line 102
    invoke-direct {p0, p1}, Lo/dcp;->b(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 103
    const-string v0, "ALTER TABLE module_20009_smart_msg ADD showCount int default 0"

    .line 104
    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 105
    return-void
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Lo/dcp;
    .locals 3

    const-class v2, Lo/dcp;

    monitor-enter v2

    .line 47
    :try_start_0
    sget-object v0, Lo/dcp;->e:Lo/dcp;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 49
    new-instance v0, Lo/dcp;

    invoke-direct {v0, p0}, Lo/dcp;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dcp;->e:Lo/dcp;

    .line 52
    :cond_0
    sget-object v0, Lo/dcp;->e:Lo/dcp;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v2

    throw p0
.end method


# virtual methods
.method public d(Ljava/lang/String;)V
    .locals 8

    .line 132
    const-class v4, Lo/dcp;

    monitor-enter v4

    .line 133
    :try_start_0
    sget-object v0, Lo/dcp;->e:Lo/dcp;

    invoke-virtual {v0}, Lo/dcp;->e()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 134
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 136
    :try_start_1
    invoke-virtual {v5, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    goto :goto_0

    .line 137
    :catch_0
    move-exception v6

    .line 138
    const-string v0, "ContentProviderDB"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "execSQL SQLiteException, e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    goto :goto_0

    .line 139
    :catch_1
    move-exception v6

    .line 140
    const-string v0, "ContentProviderDB"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "execSQL exception, e="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    :cond_0
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 145
    :goto_1
    return-void
.end method

.method public e()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    .line 62
    invoke-virtual {p0}, Lo/dcp;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 71
    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 4

    .line 97
    const-string v0, "ContentProviderDB"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contentProvicerDB onDowngrade"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "oldVersion = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " newVersion = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 6

    .line 76
    const-string v0, "ContentProviderDB"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contentProvicerDB_Version"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "oldVersion = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " newVersion = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    move v4, p2

    .line 79
    :goto_0
    if-ge v4, p3, :cond_0

    .line 80
    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    .line 83
    :sswitch_0
    :try_start_0
    invoke-direct {p0, p1}, Lo/dcp;->c(Landroid/database/sqlite/SQLiteDatabase;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 88
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 92
    :cond_0
    goto :goto_2

    .line 90
    :catch_0
    move-exception v5

    .line 91
    const-string v0, "ContentProviderDB"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "contentProvicerDB_onUpgrade exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/database/SQLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_0
    .end sparse-switch
.end method
