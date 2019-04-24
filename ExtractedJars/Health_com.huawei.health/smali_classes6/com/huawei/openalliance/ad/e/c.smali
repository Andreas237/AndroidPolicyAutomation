.class public Lcom/huawei/openalliance/ad/e/c;
.super Lcom/huawei/openalliance/ad/e/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/e/a/b;


# static fields
.field private static c:Lcom/huawei/openalliance/ad/e/c;

.field private static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/e/c;->d:[B

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/e/a;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/c;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/e/c;->d:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/c;->c:Lcom/huawei/openalliance/ad/e/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/e/c;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/c;->c:Lcom/huawei/openalliance/ad/e/c;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/c;->c:Lcom/huawei/openalliance/ad/e/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(I)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/Map<Ljava/lang/String;Lcom/huawei/openalliance/ad/db/bean/EventRecord;>;"
        }
    .end annotation

    const-string v3, "_id desc"

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v3, v1}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    return-object v4
.end method

.method protected a(Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<Lcom/huawei/openalliance/ad/db/bean/EventRecord;>;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Lcom/huawei/openalliance/ad/db/bean/EventRecord;>;"
        }
    .end annotation

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    const/4 v8, 0x0

    const/4 v9, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/db/a;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/db/a;

    move-result-object v0

    move-object v8, v0

    move-object v0, v8

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    move-object v2, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/db/a;->a(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v9, v0

    if-eqz v9, :cond_0

    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-virtual {v10, v9}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->toBean(Landroid/database/Cursor;)V

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->get_id()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v11

    const-string v0, "EventDao"

    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v11

    const-string v0, "EventDao"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "query exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/e/c;->a(Landroid/database/Cursor;)V

    invoke-virtual {p0, v8}, Lcom/huawei/openalliance/ad/e/c;->a(Lcom/huawei/openalliance/ad/db/a;)V

    goto :goto_1

    :catchall_0
    move-exception v12

    invoke-virtual {p0, v9}, Lcom/huawei/openalliance/ad/e/c;->a(Landroid/database/Cursor;)V

    invoke-virtual {p0, v8}, Lcom/huawei/openalliance/ad/e/c;->a(Lcom/huawei/openalliance/ad/db/a;)V

    throw v12

    :goto_1
    return-object v7
.end method

.method public a()V
    .locals 3

    invoke-super {p0}, Lcom/huawei/openalliance/ad/e/a;->a()V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(JI)V
    .locals 5

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->p:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->q:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(JLjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "lockTime"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->l:Lcom/huawei/openalliance/ad/e/g;

    invoke-virtual {p0, v0, v2, v1, p3}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 2

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/c;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Landroid/content/ContentValues;)J

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;)V
    .locals 2

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/c;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Landroid/content/ContentValues;)J

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "lastReportTime"

    invoke-virtual {v2, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lastFailReason"

    invoke-virtual {v2, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "repeatedCount"

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->k:Lcom/huawei/openalliance/ad/e/g;

    invoke-virtual {p0, v0, v2, v1, p5}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->m:Lcom/huawei/openalliance/ad/e/g;

    invoke-virtual {p0, v0, v1, p1}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V

    return-void
.end method

.method public b(JI)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;>;"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v7

    sub-long v9, v7, p1

    const-string v11, "time asc"

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->j:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v4, v5

    move-object v5, v11

    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    return-object v12
.end method

.method public b(JLjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JLjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "time"

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->l:Lcom/huawei/openalliance/ad/e/g;

    invoke-virtual {p0, v0, v2, v1, p3}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->n:Lcom/huawei/openalliance/ad/e/g;

    invoke-virtual {p0, v0, v1, p1}, Lcom/huawei/openalliance/ad/e/c;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;Ljava/util/List;)V

    return-void
.end method
