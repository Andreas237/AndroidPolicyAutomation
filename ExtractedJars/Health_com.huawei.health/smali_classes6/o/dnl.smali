.class public Lo/dnl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/dnl;


# instance fields
.field private d:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dnl;->d:Landroid/content/Context;

    .line 24
    return-void
.end method

.method private a(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J
    .locals 6

    .line 64
    const/4 v4, -0x1

    .line 66
    :try_start_0
    iget-object v0, p0, Lo/dnl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnh;->a(Landroid/content/Context;)Lo/dnh;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnh;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v5

    .line 67
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 68
    const-string v0, "health_user_label"

    invoke-virtual {v5, v0, p1, p2, p3}, Lnet/sqlcipher/database/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 72
    :cond_0
    goto :goto_0

    .line 70
    :catch_0
    move-exception v5

    .line 71
    const-string v0, "InfoTableMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :goto_0
    int-to-long v0, v4

    return-wide v0
.end method

.method private static c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 140
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    .line 141
    const/4 v0, -0x1

    if-eq v0, v4, :cond_0

    .line 142
    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 144
    :cond_0
    const-string v0, "InfoTableMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStringColumn wrong columnName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, ""

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/dnl;
    .locals 4

    .line 27
    sget-object v0, Lo/dnl;->a:Lo/dnl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 28
    const-class v2, Lo/dnl;

    monitor-enter v2

    .line 29
    :try_start_0
    sget-object v0, Lo/dnl;->a:Lo/dnl;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lo/dnl;

    invoke-direct {v0, p0}, Lo/dnl;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dnl;->a:Lo/dnl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 34
    :cond_1
    :goto_0
    sget-object v0, Lo/dnl;->a:Lo/dnl;

    return-object v0
.end method

.method private d(Landroid/content/ContentValues;)J
    .locals 7

    .line 38
    const-wide/16 v4, -0x1

    .line 40
    :try_start_0
    iget-object v0, p0, Lo/dnl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnh;->a(Landroid/content/Context;)Lo/dnh;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnh;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v6

    .line 41
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 42
    const-string v0, "health_user_label"

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1, p1}, Lnet/sqlcipher/database/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v4, v0

    .line 46
    :cond_0
    goto :goto_0

    .line 44
    :catch_0
    move-exception v6

    .line 45
    const-string v0, "InfoTableMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    :goto_0
    return-wide v4
.end method

.method private e([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 10

    .line 77
    const/4 v8, 0x0

    .line 79
    :try_start_0
    iget-object v0, p0, Lo/dnl;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dnh;->a(Landroid/content/Context;)Lo/dnh;

    move-result-object v0

    invoke-virtual {v0}, Lo/dnh;->c()Lnet/sqlcipher/database/SQLiteDatabase;

    move-result-object v9

    .line 80
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    .line 81
    move-object v0, v9

    const-string v1, "health_user_label"

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    invoke-virtual/range {v0 .. v7}, Lnet/sqlcipher/database/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lnet/sqlcipher/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v8, v0

    .line 85
    :cond_0
    goto :goto_0

    .line 83
    :catch_0
    move-exception v9

    .line 84
    const-string v0, "InfoTableMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    :goto_0
    return-object v8
.end method


# virtual methods
.method public a(Lo/dng;)J
    .locals 5

    .line 116
    const-wide/16 v2, -0x1

    .line 117
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 118
    invoke-static {p1}, Lo/dni;->a(Lo/dng;)Landroid/content/ContentValues;

    move-result-object v4

    .line 119
    invoke-direct {p0, v4}, Lo/dnl;->d(Landroid/content/ContentValues;)J

    move-result-wide v2

    .line 121
    :cond_0
    return-wide v2
.end method

.method public b(Lo/dng;)J
    .locals 7

    .line 125
    const-wide/16 v2, -0x1

    .line 126
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 127
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 128
    const-string v0, "huid"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "uriKey"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 129
    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    .line 130
    invoke-virtual {p1}, Lo/dng;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 131
    invoke-virtual {p1}, Lo/dng;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 133
    invoke-static {p1}, Lo/dni;->c(Lo/dng;)Landroid/content/ContentValues;

    move-result-object v6

    .line 134
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v6, v0, v5}, Lo/dnl;->a(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v2

    .line 136
    :cond_0
    return-wide v2
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 90
    const-string v7, ""

    .line 91
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v8

    .line 92
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 93
    const-string v0, "huid"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "uriKey"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 94
    const/4 v0, 0x2

    new-array v10, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object v8, v10, v0

    const/4 v0, 0x1

    aput-object p1, v10, v0

    .line 98
    move-object v0, p0

    invoke-static {}, Lo/dni;->b()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v3, v10

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lo/dnl;->e([Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 99
    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 101
    :try_start_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    const-string v0, "uriValue"

    invoke-static {v11, v0}, Lo/dnl;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v7, v0

    .line 107
    :cond_0
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 108
    goto :goto_0

    .line 104
    :catch_0
    move-exception v12

    .line 105
    const-string v0, "InfoTableMgr"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 108
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v13

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 108
    throw v13

    :goto_0
    goto :goto_1

    .line 110
    :cond_1
    const-string v0, "InfoTableMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cursor is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    :goto_1
    return-object v7
.end method
