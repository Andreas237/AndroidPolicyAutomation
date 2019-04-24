.class public Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "UserServiceAuthDBManager"


# instance fields
.field private dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "user_service_auth"

    invoke-static {}, Lcom/huawei/ui/openservice/db/model/UserServiceAuthTable;->getColumns()[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;-><init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    .line 23
    return-void
.end method

.method private buildUserServiceAuthValues(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Landroid/content/ContentValues;
    .locals 4

    .line 63
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 64
    const-string v0, "huid"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "service_id"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "service_auth"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->fetchAuthType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 67
    const-string v0, "modify_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 68
    return-object v3
.end method

.method private insertAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z
    .locals 5

    .line 49
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->buildUserServiceAuthValues(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Landroid/content/ContentValues;

    move-result-object v4

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->insert(Landroid/content/ContentValues;)J

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

.method private declared-synchronized insertOrUpdateSync(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z
    .locals 2

    monitor-enter p0

    .line 30
    if-eqz p1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getServiceID()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getHuid()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 31
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->queryAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v0

    if-nez v0, :cond_2

    .line 32
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->insertAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    move-result v0

    monitor-exit p0

    return v0

    .line 34
    :cond_2
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->updateAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private parseServiceAuth(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;
    .locals 3

    .line 72
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_0
    const/4 v1, 0x0

    .line 77
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    new-instance v1, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;-><init>()V

    .line 79
    const-string v0, "huid"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configHuid(Ljava/lang/String;)V

    .line 80
    const-string v0, "service_auth"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configAuthType(I)V

    .line 81
    const-string v0, "service_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->configServiceID(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 85
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 85
    throw v2

    .line 86
    :goto_0
    return-object v1
.end method

.method private updateAuth(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z
    .locals 5

    .line 54
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 55
    const-string v0, "huid"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "service_id"

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    const/4 v0, 0x2

    new-array v3, v0, [Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getHuid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/UserServiceAuth;->getServiceID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    .line 58
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->buildUserServiceAuthValues(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Landroid/content/ContentValues;

    move-result-object v4

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->update(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public insertOrUpdate(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->insertOrUpdateSync(Lcom/huawei/ui/openservice/db/model/UserServiceAuth;)Z

    move-result v0

    return v0
.end method

.method public queryAuth(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;
    .locals 9

    .line 39
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_1
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 41
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "service_id"

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 43
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    const/4 v0, 0x1

    aput-object p2, v7, v0

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 45
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/UserServiceAuthDBManager;->parseServiceAuth(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/UserServiceAuth;

    move-result-object v0

    return-object v0
.end method
