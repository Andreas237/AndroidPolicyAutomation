.class public Lcom/huawei/openalliance/ad/e/b;
.super Lcom/huawei/openalliance/ad/e/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/e/a/a;


# static fields
.field private static c:Lcom/huawei/openalliance/ad/e/b;

.field private static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/e/b;->d:[B

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/e/a;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 13

    const-string v7, "priority asc, displayCount asc, updateTime desc"

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v7

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getSplashMediaPath()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    return-object v10

    :cond_0
    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/openalliance/ad/e/b;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/b;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/e/b;->d:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/b;->c:Lcom/huawei/openalliance/ad/e/b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/e/b;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/b;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/b;->c:Lcom/huawei/openalliance/ad/e/b;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/b;->c:Lcom/huawei/openalliance/ad/e/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 8

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v4, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;I)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 6

    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    sget-object v2, Lcom/huawei/openalliance/ad/e/g;->f:Lcom/huawei/openalliance/ad/e/g;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/huawei/openalliance/ad/e/g;->g:Lcom/huawei/openalliance/ad/e/g;

    :goto_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v3

    const/4 v0, 0x3

    new-array v5, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v5, v0

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    invoke-direct {p0, v2, v5}, Lcom/huawei/openalliance/ad/e/b;->a(Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;IJ)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 7

    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    sget-object v2, Lcom/huawei/openalliance/ad/e/g;->d:Lcom/huawei/openalliance/ad/e/g;

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/huawei/openalliance/ad/e/g;->e:Lcom/huawei/openalliance/ad/e/g;

    :goto_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v3

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x5

    new-array v6, v0, [Ljava/lang/String;

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    const/4 v0, 0x2

    aput-object p1, v6, v0

    sub-long v0, v3, p3

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v6, v1

    const/4 v0, 0x4

    aput-object v5, v6, v0

    invoke-direct {p0, v2, v6}, Lcom/huawei/openalliance/ad/e/b;->a(Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    return-object v0
.end method

.method public a(III)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    const-string v7, "splashPreContentFlag desc, updateTime desc"

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "contentId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "splashMediaPath"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->i:Lcom/huawei/openalliance/ad/e/g;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    move-object v5, v7

    move-object v6, v8

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    return-object v9
.end method

.method public a()V
    .locals 3

    invoke-super {p0}, Lcom/huawei/openalliance/ad/e/a;->a()V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 2

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/b;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Landroid/content/ContentValues;)J

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getFieldList()Ljava/util/List;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/b;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v5

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    goto :goto_0

    :cond_1
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-virtual {p0, v0, v5, v1, v2}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 5

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "lastShowTime"

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->b:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public b()V
    .locals 6

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "displayDate"

    invoke-virtual {v4, v0, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "displayCount"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->c:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v5, v2, v3

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public b(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/b;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v4

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public c(Ljava/lang/String;)J
    .locals 10

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const-string v7, "lastShowTime desc"

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "lastShowTime"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->b:Lcom/huawei/openalliance/ad/e/g;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    move-object v5, v7

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_1
    const/4 v0, 0x0

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getLastShowTime_()J

    move-result-wide v0

    return-wide v0
.end method

.method public c()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ContentRecord;>;"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v7

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "contentId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "splashMediaPath"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->h:Lcom/huawei/openalliance/ad/e/g;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    return-object v9
.end method

.method public d()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "contentId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/huawei/openalliance/ad/e/b;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    return-object v8
.end method
