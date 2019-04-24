.class public Lcom/huawei/openalliance/ad/e/h;
.super Lcom/huawei/openalliance/ad/e/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/e/a/f;


# static fields
.field private static c:Lcom/huawei/openalliance/ad/e/h;

.field private static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/e/h;->d:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/e/a;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/h;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/e/h;->d:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/h;->c:Lcom/huawei/openalliance/ad/e/h;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/e/h;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/h;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/h;->c:Lcom/huawei/openalliance/ad/e/h;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/h;->c:Lcom/huawei/openalliance/ad/e/h;
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
.method public a(JJ)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;>;"
        }
    .end annotation

    move-object v0, p0

    const-class v1, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    sget-object v3, Lcom/huawei/openalliance/ad/e/g;->r:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x2

    new-array v4, v2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v4, v5

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lcom/huawei/openalliance/ad/e/h;->a(Ljava/lang/Class;[Ljava/lang/String;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    return-object v7
.end method

.method public a()V
    .locals 3

    invoke-super {p0}, Lcom/huawei/openalliance/ad/e/a;->a()V

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/h;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(J)V
    .locals 5

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    sget-object v1, Lcom/huawei/openalliance/ad/e/g;->o:Lcom/huawei/openalliance/ad/e/g;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/e/h;->a(Ljava/lang/Class;Lcom/huawei/openalliance/ad/e/g;[Ljava/lang/String;)I

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;)V
    .locals 2

    const-class v0, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/h;->a:Landroid/content/Context;

    invoke-virtual {p1, v1}, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->toRecord(Landroid/content/Context;)Landroid/content/ContentValues;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/openalliance/ad/e/h;->a(Ljava/lang/Class;Landroid/content/ContentValues;)J

    return-void
.end method
