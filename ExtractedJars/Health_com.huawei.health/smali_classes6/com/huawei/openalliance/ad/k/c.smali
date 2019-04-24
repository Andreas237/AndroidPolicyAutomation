.class public Lcom/huawei/openalliance/ad/k/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/k/b/d;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/m/a/a/b;

.field private c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

.field private d:Lcom/huawei/openalliance/ad/e/a/b;

.field private e:Lcom/huawei/openalliance/ad/e/a/c;

.field private f:Lcom/huawei/openalliance/ad/e/a/e;

.field private g:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/k/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->g:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/d;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->f:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/c;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;
    .locals 6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/k/c;->j()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "fail to create %s event record"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/constant/EventType;->value()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v5, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-direct {v5}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/constant/EventType;->value()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setType_(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/b;->c()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setAdType_(I)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getParamFromServer_()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setParamFromServer_(Lcom/huawei/openalliance/ad/db/bean/EncryptionField;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setTime_(J)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setShowid_(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getKey()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setKey([B)V

    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "create event, type is : %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/constant/EventType;->value()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-object v5
.end method

.method private a(Lcom/huawei/openalliance/ad/constant/EventType;Lcom/huawei/openalliance/ad/d/a;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;
    .locals 3

    :try_start_0
    invoke-direct {p0}, Lcom/huawei/openalliance/ad/k/c;->j()Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    new-instance v2, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;-><init>()V

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/d/a;->s()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/d/a;->s()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setAdType_(I)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/constant/EventType;->value()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setType_(Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setTime_(J)V

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/d/a;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setExt(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "createExceptionEvent RuntimeException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "createExceptionEvent error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/constant/EventType;Lcom/huawei/openalliance/ad/d/a;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Lcom/huawei/openalliance/ad/d/a;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/c;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/constant/EventType;JJII)V
    .locals 6

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "reportVideoPlayState eventType: %s startTime: %d, endtime: %d startProgress: %d endProgress: %d"

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v5

    invoke-direct {p0, v5, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v5, p2, p3}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setVideoPlayStartTime_(J)V

    invoke-virtual {v5, p4, p5}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setVideoPlayEndTime_(J)V

    invoke-virtual {v5, p6}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setVideoPlayStartProgress_(I)V

    invoke-virtual {v5, p7}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setVideoPlayEndProgress_(I)V

    const/4 v0, 0x0

    invoke-direct {p0, v5, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    invoke-direct {p0, v1, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setAppDownloadRelatedActionSource(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    invoke-direct {p0, v1, p4}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v1, p4}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v5

    invoke-direct {p0, v5, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "onAdImpEvent type: %s duration: %s ratio: %s showId: %s"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 v3, 0x1

    aput-object p2, v2, v3

    const/4 v3, 0x2

    aput-object p3, v2, v3

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getShowId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getAdType_()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentDownMethod()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setContentDownMethod(Ljava/lang/String;)V

    :cond_3
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setShowTimeDuration_(J)V

    :cond_4
    if-eqz p3, :cond_5

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setMaxShowRatio_(I)V

    :cond_5
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

    if-eq p1, v0, :cond_6

    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v5, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/b;->a()V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/k/c$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/k/c$1;-><init>(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/k/c;->i()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->c(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/c;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v2, Lcom/huawei/openalliance/ad/d/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->g:Landroid/content/Context;

    invoke-direct {v2, v0}, Lcom/huawei/openalliance/ad/d/b;-><init>(Landroid/content/Context;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_1

    const-string v0, "httpCode:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->getHttpCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v0, p2, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->errorReason:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, ", errorReason:"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p2, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->errorReason:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v0, "httpCode:-1"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_0
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v2, p1, v0, v1}, Lcom/huawei/openalliance/ad/d/b;->a(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection<Lcom/huawei/openalliance/ad/db/bean/EventRecord;>;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->get_id()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    move-object v1, p1

    if-nez p2, :cond_0

    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getLastFailReason()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    move-object v2, p2

    :goto_1
    invoke-virtual {v9}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getRepeatedCount()J

    move-result-wide v3

    const-wide/16 v5, 0x1

    add-long/2addr v3, v5

    move-object v5, v7

    invoke-interface/range {v0 .. v5}, Lcom/huawei/openalliance/ad/e/a/b;->a(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "fail to report to thirdParty event, thirdParty urls is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-interface {v0, v4}, Lcom/huawei/openalliance/ad/e/a/c;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v6, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/b;->c()I

    move-result v0

    invoke-direct {v6, v0, v4}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;-><init>(ILjava/lang/String;)V

    invoke-virtual {v6, v2}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;->setKey([B)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-interface {v0, v6}, Lcom/huawei/openalliance/ad/e/a/b;->a(Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;)V

    invoke-direct {p0, v4, v5}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;)V

    :cond_2
    goto :goto_0

    :cond_3
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/b;->a(Ljava/util/List;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;)Z
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget v0, p1, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;)Z
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    iget v0, p1, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->responseCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z
    .locals 5

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "fail to create %s event record"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/constant/EventType;->value()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z
    .locals 1

    invoke-direct {p0, p1, p2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 7

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getNoReportEventList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_0

    invoke-virtual {p1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    goto :goto_0

    :cond_1
    :goto_1
    goto :goto_2

    :catch_0
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isDiscard, RuntimeException:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isDiscard, Exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_2
    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isDiscard:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", eventType:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", contentId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    return v3
.end method

.method private b(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getMonitors()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->g:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getDecryptedFieldValue(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/beans/metadata/Monitor;

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/Monitor;->getEventType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v5}, Lcom/huawei/openalliance/ad/beans/metadata/Monitor;->getUrl()Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    goto :goto_0

    :cond_3
    return-object v3

    :cond_4
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;>;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

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

    check-cast v3, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;->get_id()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private b(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V
    .locals 2

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    invoke-direct {p0, v1, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setInstallRelatedActionSource(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    invoke-direct {p0, v1, p4}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    goto :goto_0

    :cond_3
    invoke-direct {p0, v1, p4}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    :goto_0
    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    return-void
.end method

.method private b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v0, Lcom/huawei/openalliance/ad/k/c$2;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/k/c$2;-><init>(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/k/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/k/c;->l()V

    return-void
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/k/c;Ljava/lang/String;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private c(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V
    .locals 3

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "fail to add event to cache"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "addEventToCache, event:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", contentId:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/b;->d()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/e/a/b;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/k/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/k/c;->k()V

    return-void
.end method

.method private c(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-interface {v0, v1, v2, p1}, Lcom/huawei/openalliance/ad/e/a/b;->a(JLjava/util/List;)V

    return-void
.end method

.method private c(I)Z
    .locals 1

    const/16 v0, 0xc8

    if-eq v0, p1, :cond_0

    const/16 v0, 0x259

    if-eq v0, p1, :cond_0

    const/16 v0, 0x263

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2, p1}, Lcom/huawei/openalliance/ad/e/a/b;->a(JLjava/util/List;)V

    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-interface {v0, v1, v2, p1}, Lcom/huawei/openalliance/ad/e/a/b;->b(JLjava/util/List;)V

    return-void
.end method

.method static synthetic h()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method private i()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/k/c$3;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/c$3;-><init>(Lcom/huawei/openalliance/ad/k/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method private j()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->f:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v0

    return v0
.end method

.method private k()V
    .locals 14

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    const-wide/32 v1, 0x1d4c0

    const/4 v3, 0x3

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/e/a/b;->b(JI)Ljava/util/List;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/huawei/openalliance/ad/k/c;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/k/c;->c(Ljava/util/List;)V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v8

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;->getUrl()Lcom/huawei/openalliance/ad/db/bean/EncryptionField;

    move-result-object v11

    if-nez v11, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v8}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getDecryptedFieldValue([B)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-interface {v0, v12}, Lcom/huawei/openalliance/ad/e/a/c;->b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;

    move-result-object v13

    invoke-direct {p0, v13}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;->get_id()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, v12, v13}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lcom/huawei/openalliance/ad/db/bean/ThirdPartyEventRecord;->get_id()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    goto :goto_0

    :cond_2
    invoke-direct {p0, v7}, Lcom/huawei/openalliance/ad/k/c;->e(Ljava/util/List;)V

    invoke-direct {p0, v7}, Lcom/huawei/openalliance/ad/k/c;->d(Ljava/util/List;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-interface {v0, v6}, Lcom/huawei/openalliance/ad/e/a/b;->b(Ljava/util/List;)V

    return-void
.end method

.method private l()V
    .locals 14

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->d:Lcom/huawei/openalliance/ad/e/a/b;

    const/16 v1, 0x32

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/b;->a(I)Ljava/util/Map;

    move-result-object v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/k/c;->g:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/k/g;->a(Ljava/util/Collection;Landroid/content/Context;)Ljava/util/List;

    move-result-object v6

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->e:Lcom/huawei/openalliance/ad/e/a/c;

    invoke-interface {v0, v6}, Lcom/huawei/openalliance/ad/e/a/c;->a(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v8, "error response"

    if-eqz v7, :cond_1

    iget-object v0, v7, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->errorReason:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v8, v7, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->errorReason:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget v0, v7, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p0, v5, v8, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V

    return-void

    :cond_2
    invoke-virtual {v7}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->getResult()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "no result"

    invoke-interface {v4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {p0, v5, v0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V

    return-void

    :cond_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;

    invoke-virtual {v12}, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->getRetcode()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->c(I)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12}, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->getSeq()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    if-eqz v13, :cond_4

    invoke-virtual {v13}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getRepeatedCount()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {v13, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRepeatedCount(J)V

    invoke-virtual {v12}, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->getRetcode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setLastFailReason(Ljava/lang/String;)V

    invoke-virtual {v13, v5}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setLastReportTime(Ljava/lang/String;)V

    invoke-interface {v10, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    goto :goto_2

    :cond_5
    invoke-virtual {v12}, Lcom/huawei/openalliance/ad/beans/metadata/AdEventResult;->getSeq()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    goto :goto_1

    :cond_6
    invoke-direct {p0, v9}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-direct {p0, v5, v0, v10}, Lcom/huawei/openalliance/ad/k/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-object v0
.end method

.method public a(I)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBCLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBCLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setOpTimesInLandingPage_(I)V

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method public a(II)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRawX_(I)V

    invoke-virtual {v1, p2}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRawY_(I)V

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/b;->b()V

    return-void
.end method

.method public a(IILjava/lang/String;)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLICK:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLICK:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRawX_(I)V

    invoke-virtual {v1, p2}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRawY_(I)V

    invoke-virtual {v1, p3}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setClickSuccessDestination_(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    return-void
.end method

.method public a(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILjava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->CLOSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRawX_(I)V

    invoke-virtual {v1, p2}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setRawY_(I)V

    invoke-virtual {v1, p3}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setKeyWords(Ljava/util/List;)V

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c;->b:Lcom/huawei/openalliance/ad/m/a/a/b;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/m/a/a/b;->b()V

    return-void
.end method

.method public a(JI)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->PHYIMP:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Long;Ljava/lang/Integer;)V

    return-void
.end method

.method public a(JJII)V
    .locals 8

    move-object v0, p0

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

    move-wide v2, p1

    move-wide v4, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;JJII)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    invoke-direct {p0, v1, p1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setIntentDest(Ljava/lang/String;)V

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setIntentFailReason(Ljava/lang/String;)V

    :cond_3
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->INTENTSUCCESS:Lcom/huawei/openalliance/ad/constant/EventType;

    if-ne v0, p1, :cond_4

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    :goto_0
    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/k/c$4;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/huawei/openalliance/ad/k/c$4;-><init>(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/d/a;ZZ)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-void
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public a(Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0, p1, p2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Long;Ljava/lang/Integer;)V

    return-void
.end method

.method public b()V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->SHOW:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Z)V

    return-void
.end method

.method public b(I)V
    .locals 6

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->ADPRECHECK:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v5

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->ADPRECHECK:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v5, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/huawei/openalliance/ad/g/c;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/k/c;->a:Ljava/lang/String;

    const-string v1, "onPreCheckResult result: %d contentid: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/openalliance/ad/k/c;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getContentId_()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setPreCheckResult(Ljava/lang/String;)V

    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method public b(JJII)V
    .locals 8

    move-object v0, p0

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYEND:Lcom/huawei/openalliance/ad/constant/EventType;

    move-wide v2, p1

    move-wide v4, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;JJII)V

    return-void
.end method

.method public b(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADCANCEL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public c()V
    .locals 8

    move-object v0, p0

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const-wide/32 v2, -0x1b207

    const-wide/32 v4, -0x1b207

    const v6, -0x1b207

    const v7, -0x1b207

    invoke-direct/range {v0 .. v7}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;JJII)V

    return-void
.end method

.method public c(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADPAUSE:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public d()V
    .locals 8

    move-object v0, p0

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->VIDEOPLAYRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

    const-wide/32 v2, -0x1b207

    const-wide/32 v4, -0x1b207

    const v6, -0x1b207

    const v7, -0x1b207

    invoke-direct/range {v0 .. v7}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;JJII)V

    return-void
.end method

.method public d(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOADRESUME:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public e()V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method public e(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPDOWNLOAD:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public f()V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->WEBLOADFINISH:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method public f(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public g()V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->RESPONSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->RESPONSE:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-direct {p0, v1, v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->setShowid_(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    return-void
.end method

.method public g(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public h(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public i(Ljava/lang/Integer;)V
    .locals 3

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPOPEN:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x1

    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/constant/EventType;Ljava/lang/Integer;ZZ)V

    return-void
.end method
