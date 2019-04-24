.class public Lcom/huawei/openalliance/ad/e/e;
.super Lcom/huawei/openalliance/ad/e/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/e/a/d;


# static fields
.field private static c:Lcom/huawei/openalliance/ad/e/e;

.field private static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/e/e;->d:[B

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/e/a;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/e;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/e/e;->d:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/e;->c:Lcom/huawei/openalliance/ad/e/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/e/e;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/e;->c:Lcom/huawei/openalliance/ad/e/e;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/e;->c:Lcom/huawei/openalliance/ad/e/e;
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
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/SloganRecord;>;)Ljava/util/List<Ljava/lang/String;>;"
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

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public a(I)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;
    .locals 16

    const/4 v0, 0x1

    move/from16 v1, p1

    if-ne v0, v1, :cond_0

    sget-object v7, Lcom/huawei/openalliance/ad/e/g;->s:Lcom/huawei/openalliance/ad/e/g;

    goto :goto_0

    :cond_0
    sget-object v7, Lcom/huawei/openalliance/ad/e/g;->t:Lcom/huawei/openalliance/ad/e/g;

    :goto_0
    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v8

    const/4 v0, 0x2

    new-array v10, v0, [Ljava/lang/String;

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v10, v1

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v10, v1

    move-object/from16 v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    move-object v3, v7

    move-object v4, v10

    const-string v5, "_id asc"

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    invoke-virtual {v13}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getUrl_()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/io/File;

    invoke-direct {v15, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v15}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    return-object v13

    :cond_1
    invoke-virtual {v13}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->getContentId_()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/e/e;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/db/bean/SloganRecord;
    .locals 8

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v4, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v4, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public a()V
    .locals 3

    invoke-super {p0}, Lcom/huawei/openalliance/ad/e/a;->a()V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;)V
    .locals 2

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/e;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;Landroid/content/ContentValues;)J

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;Ljava/util/List;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/db/bean/SloganRecord;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/e;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

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
    const-class v0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p3, v2, v3

    invoke-virtual {p0, v0, v4, v1, v2}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;Landroid/content/ContentValues;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public b()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "contentId"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    return-object v8
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/SloganRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->a:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/e;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method
