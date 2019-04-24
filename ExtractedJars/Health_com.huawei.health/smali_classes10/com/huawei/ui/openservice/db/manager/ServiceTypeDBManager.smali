.class public Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "ServiceTypeDBManager"


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

    const-string v2, "service_type"

    invoke-static {}, Lcom/huawei/ui/openservice/db/model/ServiceTypeTable;->getColumns()[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;-><init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    .line 27
    return-void
.end method

.method private getGroup(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
    .locals 2

    .line 103
    new-instance v1, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    invoke-direct {v1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;-><init>()V

    .line 104
    const-string v0, "service_type_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setServiceTypeID(Ljava/lang/String;)V

    .line 105
    const-string v0, "service_type_Name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setServiceTypeName(Ljava/lang/String;)V

    .line 106
    const-string v0, "service_type_description"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setServiceTypeDescription(Ljava/lang/String;)V

    .line 107
    const-string v0, "service_type_position"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->setPosition(I)V

    .line 108
    return-object v1
.end method

.method private parseOpenServiceType(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
    .locals 3

    .line 88
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 89
    const/4 v0, 0x0

    return-object v0

    .line 91
    :cond_0
    const/4 v1, 0x0

    .line 93
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 94
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->getGroup(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 97
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 98
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 98
    throw v2

    .line 99
    :goto_0
    return-object v1
.end method

.method private parseOpenServiceTypeList(Landroid/database/Cursor;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;"
        }
    .end annotation

    .line 72
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 73
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 77
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 78
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->getGroup(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    move-result-object v2

    .line 79
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    goto :goto_0

    .line 82
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 83
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v3

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 83
    throw v3

    .line 84
    :goto_1
    return-object v1
.end method

.method private declared-synchronized refreshAllTypesSync(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 51
    :try_start_0
    invoke-virtual {p0}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->deleteAllTypes()Z

    .line 52
    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->insertOpenServiceType(Ljava/util/List;)Z
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
.method public buildOpenServiceGroupValues(Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;)Landroid/content/ContentValues;
    .locals 4

    .line 113
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 114
    const-string v0, "service_type_id"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    const-string v0, "service_type_Name"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-string v0, "service_type_description"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getServiceTypeDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    const-string v0, "service_type_position"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;->getPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 118
    const-string v0, "modify_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 119
    return-object v3
.end method

.method public deleteAllTypes()Z
    .locals 4

    .line 56
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 57
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 58
    const-string v0, "id"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 59
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

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

.method public insertOpenServiceType(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)Z"
        }
    .end annotation

    .line 63
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    .line 65
    if-nez v3, :cond_2

    goto :goto_0

    .line 66
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {p0, v3}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->buildOpenServiceGroupValues(Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->insert(Landroid/content/ContentValues;)J

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public queryAllTypes()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;"
        }
    .end annotation

    .line 30
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 31
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 32
    const-string v0, "id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 34
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->parseOpenServiceTypeList(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryByServiceTypeID(Ljava/lang/String;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
    .locals 9

    .line 38
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 39
    :cond_0
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 40
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 41
    const-string v0, "service_type_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 42
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 43
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->parseOpenServiceType(Landroid/database/Cursor;)Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;

    move-result-object v0

    return-object v0
.end method

.method public refreshAllTypes(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;>;)Z"
        }
    .end annotation

    .line 47
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/ServiceTypeDBManager;->refreshAllTypesSync(Ljava/util/List;)Z

    move-result v0

    return v0
.end method
