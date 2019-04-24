.class public Lcom/huawei/openalliance/ad/e/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/e/a/c;


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lcom/huawei/openalliance/ad/e/a/c;

.field private static final c:[B


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lcom/huawei/openalliance/ad/e/a/e;

.field private f:Lcom/huawei/openalliance/ad/net/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/e/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/e/d;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/d$a;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/net/http/d$a;-><init>()V

    new-instance v1, Lcom/huawei/openalliance/ad/net/a;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/net/a;-><init>()V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/d$a;->a(Lcom/huawei/openalliance/ad/net/http/b/a;)Lcom/huawei/openalliance/ad/net/http/d$a;

    move-result-object v0

    new-instance v1, Lcom/huawei/openalliance/ad/net/b;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/net/b;-><init>()V

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/net/http/d$a;->b(Lcom/huawei/openalliance/ad/net/http/b/a;)Lcom/huawei/openalliance/ad/net/http/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/net/http/d$a;->a()Lcom/huawei/openalliance/ad/net/http/d;

    move-result-object v2

    const-class v0, Lcom/huawei/openalliance/ad/net/c;

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/net/http/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/net/c;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->f:Lcom/huawei/openalliance/ad/net/c;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/server/AdContentReq;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->f:Lcom/huawei/openalliance/ad/net/c;

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lcom/huawei/openalliance/ad/net/c;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentReq;Ljava/util/Map;)Lcom/huawei/openalliance/ad/net/http/Response;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/net/http/Response;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/net/http/Response;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    if-eqz v3, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->getPpsStore()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/e;->c(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput v0, v3, Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;->responseCode:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    return-object v3

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "requestAdContent IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "requestAdContent Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;
    .locals 1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/e/d;->b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    new-instance v1, Lcom/huawei/openalliance/ad/net/a/a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->d:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/openalliance/ad/net/a/a;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/openalliance/ad/net/a/a;->a(Z)V

    invoke-virtual {v1, p1}, Lcom/huawei/openalliance/ad/net/a/a;->a(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)V

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/net/a/a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;)V
    .locals 3

    if-eqz p1, :cond_3

    iget v0, p1, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p2, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    :cond_0
    invoke-virtual {p2}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->getResult()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->getResult()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2
    invoke-virtual {p2, v1}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->setResult(Ljava/util/List;)V

    :cond_3
    return-void
.end method

.method private b(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List;Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/AdContentReq;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/openalliance/ad/beans/server/AdContentReq;"
        }
    .end annotation

    new-instance v9, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getWidth()I

    move-result v10

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getHeight()I

    move-result v11

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->isTest()Z

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getAdIds()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    new-instance v0, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;

    move-object v1, v14

    move v2, v10

    move v3, v11

    move/from16 v4, p1

    move v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/huawei/openalliance/ad/beans/metadata/AdSlot30;-><init>(Ljava/lang/String;IIIZ)V

    move-object v15, v0

    invoke-interface {v9, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/beans/server/AdContentReq;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/openalliance/ad/e/d;->d:Landroid/content/Context;

    move-object v2, v9

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move v5, v10

    move v6, v11

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getDeviceType()I

    move-result v7

    move-object/from16 v8, p0

    iget-object v8, v8, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v8}, Lcom/huawei/openalliance/ad/e/a/e;->r()Z

    move-result v8

    invoke-direct/range {v0 .. v8}, Lcom/huawei/openalliance/ad/beans/server/AdContentReq;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIZ)V

    move-object v13, v0

    invoke-virtual {v13}, Lcom/huawei/openalliance/ad/beans/server/AdContentReq;->getDevice__()Lcom/huawei/openalliance/ad/beans/metadata/Device;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getOaid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/huawei/openalliance/ad/beans/metadata/Device;->setOaid(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->isTrackLimited()Ljava/lang/Boolean;

    move-result-object v15

    if-eqz v15, :cond_2

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "0"

    goto :goto_1

    :cond_1
    const-string v0, "1"

    :goto_1
    invoke-virtual {v14, v0}, Lcom/huawei/openalliance/ad/beans/metadata/Device;->setIsTrackingEnabled(Ljava/lang/String;)V

    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->s()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    const/4 v0, 0x1

    :goto_2
    invoke-virtual {v13, v0}, Lcom/huawei/openalliance/ad/beans/server/AdContentReq;->setPdToOther(I)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/openalliance/ad/beans/server/AdContentReq;->setPpsStore(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;->getRequestSequence()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/openalliance/ad/beans/server/AdContentReq;->setClientReqSequence(Ljava/lang/String;)V

    return-object v13
.end method

.method private static b(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/c;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/e/d;->c:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->b:Lcom/huawei/openalliance/ad/e/a/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/e/d;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/e/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/e/d;->b:Lcom/huawei/openalliance/ad/e/a/c;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->b:Lcom/huawei/openalliance/ad/e/a/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private b(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;)Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->EXCEPTION:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/constant/EventType;->value()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;->getType__()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    goto :goto_0

    :cond_1
    return-object v2
.end method

.method private c(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;)Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "fail to upload cache events, events is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, Lcom/huawei/openalliance/ad/beans/server/ExceptionReportReq;

    invoke-direct {v2, p1}, Lcom/huawei/openalliance/ad/beans/server/ExceptionReportReq;-><init>(Ljava/util/List;)V

    :try_start_0
    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/openalliance/ad/net/a/a;->a(Ljava/util/Map;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->f:Lcom/huawei/openalliance/ad/net/c;

    invoke-interface {v0, v2, v3}, Lcom/huawei/openalliance/ad/net/c;->a(Lcom/huawei/openalliance/ad/beans/server/ExceptionReportReq;Ljava/util/Map;)Lcom/huawei/openalliance/ad/net/http/Response;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/net/http/Response;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    :goto_0
    iput v0, v5, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_3
    return-object v5

    :cond_4
    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "uploadEvents IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "uploadEvents Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List;Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List<Ljava/lang/String;>;Ljava/util/List<Ljava/lang/String;>;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/e/d;->b(ILcom/huawei/openalliance/ad/beans/parameter/AdSlotParam;Ljava/util/List;Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/AdContentReq;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/server/AdContentReq;)Lcom/huawei/openalliance/ad/beans/server/AdContentRsp;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;
    .locals 5

    new-instance v2, Lcom/huawei/openalliance/ad/beans/server/AppConfigReq;

    invoke-direct {v2, p1}, Lcom/huawei/openalliance/ad/beans/server/AppConfigReq;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/beans/server/AppConfigReq;->setServerStore(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->f:Lcom/huawei/openalliance/ad/net/c;

    invoke-direct {p0, v2}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Lcom/huawei/openalliance/ad/net/c;->a(Lcom/huawei/openalliance/ad/beans/server/AppConfigReq;Ljava/util/Map;)Lcom/huawei/openalliance/ad/net/http/Response;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/net/http/Response;->b()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->e:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->getServerStore()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/e/a/e;->b(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    iput v0, v4, Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;->responseCode:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    return-object v4

    :cond_2
    goto :goto_1

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "requestAppConfig IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "requestAppConfig Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/openalliance/ad/beans/metadata/AdEvent;>;)Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "fail to upload cache events, events is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v2, 0x0

    invoke-direct {p0, p1}, Lcom/huawei/openalliance/ad/e/d;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/e/d;->c(Ljava/util/List;)Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    move-result-object v2

    :cond_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v2

    :cond_3
    const/4 v4, 0x0

    new-instance v5, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;

    invoke-direct {v5, p1}, Lcom/huawei/openalliance/ad/beans/server/EventReportReq;-><init>(Ljava/util/List;)V

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->f:Lcom/huawei/openalliance/ad/net/c;

    invoke-direct {p0, v5}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/base/ReqBean;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v5, v1}, Lcom/huawei/openalliance/ad/net/c;->a(Lcom/huawei/openalliance/ad/beans/server/EventReportReq;Ljava/util/Map;)Lcom/huawei/openalliance/ad/net/http/Response;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/net/http/Response;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    move-object v4, v0

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/net/http/Response;->d()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    :cond_4
    if-eqz v4, :cond_6

    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_5

    const/4 v0, 0x0

    goto :goto_0

    :cond_5
    const/4 v0, 0x1

    :goto_0
    iput v0, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    iput-object v7, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->errorReason:Ljava/lang/String;

    goto :goto_1

    :cond_6
    new-instance v0, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    invoke-direct {v0}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;-><init>()V

    move-object v4, v0

    const/4 v0, 0x1

    iput v0, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    iput-object v7, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->errorReason:Ljava/lang/String;

    :goto_1
    invoke-direct {p0, v2, v4}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object v4

    :cond_7
    goto :goto_2

    :catch_0
    move-exception v6

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "uploadEvents IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_8

    new-instance v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    invoke-direct {v4}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;-><init>()V

    const/4 v0, 0x1

    iput v0, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->errorReason:Ljava/lang/String;

    invoke-direct {p0, v2, v4}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;)V

    :cond_8
    goto :goto_2

    :catch_1
    move-exception v6

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "uploadEvents Exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v4, :cond_9

    new-instance v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;

    invoke-direct {v4}, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->errorReason:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, v4, Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;->responseCode:I

    invoke-direct {p0, v2, v4}, Lcom/huawei/openalliance/ad/e/d;->a(Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;Lcom/huawei/openalliance/ad/beans/server/EventReportRsp;)V

    :cond_9
    :goto_2
    return-object v4
.end method

.method public a(Lcom/huawei/openalliance/ad/l/c;)Lcom/huawei/openalliance/ad/l/d;
    .locals 2

    new-instance v1, Lcom/huawei/openalliance/ad/l/b;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->d:Landroid/content/Context;

    invoke-direct {v1, v0, p1}, Lcom/huawei/openalliance/ad/l/b;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/l/c;)V

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/l/b;->a()Lcom/huawei/openalliance/ad/l/d;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;
    .locals 5

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "fail to report to thirdParty event, thirdParty url is empty"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/d;->f:Lcom/huawei/openalliance/ad/net/c;

    invoke-interface {v0, p1}, Lcom/huawei/openalliance/ad/net/c;->a(Ljava/lang/String;)Lcom/huawei/openalliance/ad/net/http/Response;

    move-result-object v2

    new-instance v3, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;

    invoke-direct {v3}, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;-><init>()V

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/net/http/Response;->a()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->setHttpCode(I)V

    const/16 v0, 0xc8

    if-lt v4, v0, :cond_1

    const/16 v0, 0x12c

    if-lt v4, v0, :cond_2

    :cond_1
    const/16 v0, 0x12e

    if-ne v4, v0, :cond_3

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_0
    iput v0, v3, Lcom/huawei/openalliance/ad/beans/server/ThirdReportRsp;->responseCode:I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    return-object v3

    :catch_0
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "reportThirdPartyEvent IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v2

    sget-object v0, Lcom/huawei/openalliance/ad/e/d;->a:Ljava/lang/String;

    const-string v1, "reportThirdPartyEvent exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method
