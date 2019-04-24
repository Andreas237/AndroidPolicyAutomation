.class public Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Opera_ServiceDBManager"


# instance fields
.field private dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "service_version"

    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ServiceVersionTable;->getColumns()[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;-><init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    .line 27
    return-void
.end method

.method private buildOpenServiceVersionValues(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Landroid/content/ContentValues;
    .locals 4

    .line 92
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 93
    const-string v0, "version"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->getVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "date"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->getDate()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 95
    const-string v0, "modify_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 96
    return-object v3
.end method

.method private declared-synchronized insertOrUpdateVersion(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z
    .locals 2

    monitor-enter p0

    .line 34
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->queryVersion()Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;

    move-result-object v0

    if-nez v0, :cond_2

    .line 37
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->insertServiceVersion(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z

    move-result v1

    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->updateServiceVersion(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v1

    .line 41
    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private insertServiceVersion(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z
    .locals 4

    .line 62
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->buildOpenServiceVersionValues(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->insert(Landroid/content/ContentValues;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private parseOpenServiceVersion(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;
    .locals 3

    .line 75
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_0
    const/4 v1, 0x0

    .line 80
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 81
    new-instance v1, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;-><init>()V

    .line 82
    const-string v0, "version"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->setVersion(Ljava/lang/String;)V

    .line 83
    const-string v0, "date"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->setDate(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 87
    goto :goto_0

    .line 86
    :catchall_0
    move-exception v2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 87
    throw v2

    .line 88
    :goto_0
    return-object v1
.end method


# virtual methods
.method public insertOrUpdateVersionSync(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z
    .locals 1

    .line 30
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->insertOrUpdateVersion(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z

    move-result v0

    return v0
.end method

.method public queryVersion()Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;
    .locals 9

    .line 45
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 46
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 47
    const-string v0, "id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 48
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 49
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->parseOpenServiceVersion(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;

    move-result-object v0

    return-object v0
.end method

.method public refreshVersion(Lcom/huawei/ui/openservice/db/model/ServiceListConfig;)V
    .locals 6

    .line 66
    const-string v0, "Opera_ServiceDBManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshVersion"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/ServiceListConfig;->getModule_ver()Ljava/lang/String;

    move-result-object v4

    .line 68
    new-instance v5, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;

    invoke-direct {v5}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;-><init>()V

    .line 69
    invoke-virtual {v5, v4}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->setVersion(Ljava/lang/String;)V

    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cnk;->a(J)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->setDate(I)V

    .line 71
    invoke-virtual {p0, v5}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->insertOrUpdateVersionSync(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z

    .line 72
    return-void
.end method

.method public updateServiceVersion(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Z
    .locals 6

    .line 53
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 54
    :cond_1
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 55
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 56
    const-string v0, "id"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceVersionDBManager;->buildOpenServiceVersionValues(Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, v4}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->update(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 58
    if-lez v5, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
