.class public Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Opera_SecurityUrlDBManager"


# instance fields
.field private dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "security_url_table"

    invoke-static {}, Lcom/huawei/ui/openservice/db/model/SecurityURLTable;->getColumns()[Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;-><init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    .line 28
    return-void
.end method

.method private buildSecurityUrlValues(Lcom/huawei/ui/openservice/db/model/SecurityURL;)Landroid/content/ContentValues;
    .locals 4

    .line 73
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 74
    const-string v0, "service_id"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getServiceID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    const-string v0, "url"

    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    const-string v0, "modify_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 77
    return-object v3
.end method

.method private deleteSecurityUrl()Z
    .locals 4

    .line 66
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 67
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 68
    const-string v0, "id"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 69
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

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

.method private parseSecurityUrlList(Landroid/database/Cursor;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/database/Cursor;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;"
        }
    .end annotation

    .line 81
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 82
    const/4 v0, 0x0

    return-object v0

    .line 84
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    :goto_0
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    new-instance v2, Lcom/huawei/ui/openservice/db/model/SecurityURL;

    invoke-direct {v2}, Lcom/huawei/ui/openservice/db/model/SecurityURL;-><init>()V

    .line 89
    const-string v0, "service_id"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->setServiceID(Ljava/lang/String;)V

    .line 90
    const-string v0, "url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/ui/openservice/db/model/SecurityURL;->setUrl(Ljava/lang/String;)V

    .line 91
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 94
    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 95
    goto :goto_1

    .line 94
    :catchall_0
    move-exception v3

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 95
    throw v3

    .line 96
    :goto_1
    return-object v1
.end method

.method private declared-synchronized refreshUrlsSync(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 61
    :try_start_0
    invoke-direct {p0}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->deleteSecurityUrl()Z

    .line 62
    invoke-virtual {p0, p1}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->insertSecurityUrl(Ljava/util/List;)Z
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
.method public insertSecurityUrl(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;)Z"
        }
    .end annotation

    .line 31
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 32
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

    check-cast v3, Lcom/huawei/ui/openservice/db/model/SecurityURL;

    .line 33
    if-nez v3, :cond_2

    goto :goto_0

    .line 34
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-direct {p0, v3}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->buildSecurityUrlValues(Lcom/huawei/ui/openservice/db/model/SecurityURL;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->insert(Landroid/content/ContentValues;)J

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public queryAllUrl()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;"
        }
    .end annotation

    .line 49
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 50
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 51
    const-string v0, "id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " >=? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 52
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 53
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->parseSecurityUrlList(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryUrlList(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;"
        }
    .end annotation

    .line 40
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 41
    :cond_0
    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 42
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 43
    const-string v0, "service_id"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 44
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->dbCommon:Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/ui/openservice/db/manager/OpenServiceDBCommon;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 45
    invoke-direct {p0, v8}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->parseSecurityUrlList(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public refreshUrls(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/openservice/db/model/SecurityURL;>;)Z"
        }
    .end annotation

    .line 57
    invoke-direct {p0, p1}, Lcom/huawei/ui/openservice/db/manager/SecurityUrlDBManager;->refreshUrlsSync(Ljava/util/List;)Z

    move-result v0

    return v0
.end method
