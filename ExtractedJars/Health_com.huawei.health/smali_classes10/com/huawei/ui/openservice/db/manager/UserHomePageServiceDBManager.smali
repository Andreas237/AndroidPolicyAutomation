.class public Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "UserHomePageServiceDBManager"


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

    const-string v2, "user_home_page_service"

    invoke-static {}, Lcom/huawei/ui/openservice/db/model/UserHomePageServiceTable;->getColumns()[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;-><init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    .line 27
    return-void
.end method

.method private buildOpenServiceVersionValues(Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;)Landroid/content/ContentValues;
    .locals 4

    .line 129
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 130
    const-string v0, "huid"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v0, "service_id"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    const-string v0, "service_position"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->getPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 133
    const-string v0, "modify_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 134
    return-object v3
.end method

.method private parseOpenServiceVersion(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;
    .locals 3

    .line 91
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_0
    const/4 v1, 0x0

    .line 96
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    new-instance v1, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;-><init>()V

    .line 98
    const-string v0, "huid"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setHuid(Ljava/lang/String;)V

    .line 99
    const-string v0, "service_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setServiceID(Ljava/lang/String;)V

    .line 100
    const-string v0, "service_position"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setPosition(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 104
    goto :goto_0

    .line 103
    :catchall_0
    move-exception v2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 104
    throw v2

    .line 105
    :goto_0
    return-object v1
.end method

.method private parseOpenServiceVersions(Landroid/database/Cursor;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;"
        }
    .end annotation

    .line 109
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 110
    const/4 v0, 0x0

    return-object v0

    .line 112
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 115
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 116
    new-instance v2, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    invoke-direct {v2}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;-><init>()V

    .line 117
    const-string v0, "huid"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setHuid(Ljava/lang/String;)V

    .line 118
    const-string v0, "service_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setServiceID(Ljava/lang/String;)V

    .line 119
    const-string v0, "service_position"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;->setPosition(I)V

    .line 120
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 123
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 124
    goto :goto_1

    .line 123
    :catchall_0
    move-exception v3

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 124
    throw v3

    .line 125
    :goto_1
    return-object v1
.end method

.method private declared-synchronized refreshOrdersSync(Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 86
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->deleteAllService(Ljava/lang/String;)Z

    .line 87
    invoke-virtual {p0, p2}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->insertService(Ljava/util/List;)Z
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


# virtual methods
.method public checkServiceExistByHuid(Ljava/lang/String;)Z
    .locals 2

    .line 47
    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->queryServiceByHuid(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 48
    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public deleteAllService(Ljava/lang/String;)Z
    .locals 4

    .line 63
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 64
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v3, v0

    .line 65
    const-string v0, "huid"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 66
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->delete(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public deleteOrderNotInChooseType(Ljava/lang/String;Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)Z"
        }
    .end annotation

    .line 53
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 54
    :cond_1
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 55
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    .line 56
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 57
    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 58
    const-string v1, "service_id"

    move-object v2, p2

    move-object v3, v6

    move-object v4, v7

    const/4 v0, 0x0

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lcom/huawei/ui/openservice/OpenServiceUtil;->initChooseSql(ZLjava/lang/String;Ljava/util/List;Ljava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v7}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->delete(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public insertService(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;)Z"
        }
    .end annotation

    .line 71
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 72
    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    .line 73
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    .line 74
    if-nez v3, :cond_2

    goto :goto_1

    .line 75
    :cond_2
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    invoke-direct {p0, v0}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->buildOpenServiceVersionValues(Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;)Landroid/content/ContentValues;

    move-result-object v4

    .line 76
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->insert(Landroid/content/ContentValues;)J

    .line 72
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 78
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public queryServiceByHuid(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;"
        }
    .end annotation

    .line 30
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 31
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 32
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 34
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->parseOpenServiceVersions(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryServiceByHuidAndServiceID(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;
    .locals 9

    .line 38
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 39
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    const/4 v0, 0x1

    aput-object p2, v7, v0

    .line 40
    const-string v0, "huid"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? and "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, "service_id"

    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 43
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->parseOpenServiceVersion(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;

    move-result-object v0

    return-object v0
.end method

.method public refreshOrders(Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/ui/openservice/db/model/HomePageServiceOrder;>;)Z"
        }
    .end annotation

    .line 82
    invoke-direct {p0, p1, p2}, Lcom/huawei/ui/openservice/db/manager/UserHomePageServiceDBManager;->refreshOrdersSync(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    return v0
.end method
