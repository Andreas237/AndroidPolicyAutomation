.class public Lcom/huawei/openalliance/ad/m/a/a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/m/a/a/a;


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Lcom/huawei/openalliance/ad/e/a/f;

.field private c:Lcom/huawei/openalliance/ad/e/a/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/m/a/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/m/a/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/h;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/h;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a;->b:Lcom/huawei/openalliance/ad/e/a/f;

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/f;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a;->b:Lcom/huawei/openalliance/ad/e/a/f;

    return-object v0
.end method

.method private a(Lcom/huawei/openalliance/ad/beans/metadata/Rule;)Z
    .locals 4

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getTimeScope__()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/e/a/e;->B()I

    move-result v1

    if-gt v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getTimeScope__()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getSkippedAdMinTimes__()I

    move-result v0

    if-gtz v0, :cond_3

    const/4 v0, 0x0

    return v0

    :cond_3
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getSkippedAdMaxTimes__()I

    move-result v0

    if-gtz v0, :cond_4

    const/4 v0, 0x0

    return v0

    :cond_4
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getNoShowTime__()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method static synthetic b(Lcom/huawei/openalliance/ad/m/a/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/m/a/a;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/openalliance/ad/m/a/a;)Lcom/huawei/openalliance/ad/e/a/e;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    return-object v0
.end method

.method private c()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/openalliance/ad/utils/ad;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    const-class v0, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {v3, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;

    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    return-void

    :cond_0
    invoke-virtual {v4}, Lcom/huawei/openalliance/ad/beans/metadata/ReduceDisturbRule;->getRuleList__()Ljava/util/List;

    move-result-object v5

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    return-void

    :cond_1
    const-wide/16 v6, 0x0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v8

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/openalliance/ad/beans/metadata/Rule;

    move-object/from16 v0, p0

    invoke-direct {v0, v11}, Lcom/huawei/openalliance/ad/m/a/a;->a(Lcom/huawei/openalliance/ad/beans/metadata/Rule;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v11}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getTimeScope__()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/m/a/a;->b:Lcom/huawei/openalliance/ad/e/a/f;

    invoke-interface {v0, v13, v14, v8, v9}, Lcom/huawei/openalliance/ad/e/a/f;->a(JJ)Ljava/util/List;

    move-result-object v15

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v16

    invoke-virtual {v11}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getSkippedAdMinTimes__()I

    move-result v0

    move/from16 v1, v16

    if-lt v1, v0, :cond_4

    invoke-virtual {v11}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getSkippedAdMaxTimes__()I

    move-result v0

    move/from16 v1, v16

    if-gt v1, v0, :cond_4

    invoke-virtual {v11}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getNoShowTime__()J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-lez v0, :cond_3

    move-wide v0, v6

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Lcom/huawei/openalliance/ad/beans/metadata/Rule;->getNoShowTime__()J

    move-result-wide v0

    :goto_1
    move-wide v6, v0

    :cond_4
    goto :goto_0

    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    add-long v1, v6, v8

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/e/a/e;->b(J)V

    :cond_6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    new-instance v2, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;

    invoke-direct {v2}, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;-><init>()V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->setTimeStamp_(J)V

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;->setTime_(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iget-object v1, p0, Lcom/huawei/openalliance/ad/m/a/a;->c:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v1}, Lcom/huawei/openalliance/ad/e/a/e;->B()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/m;->a(Ljava/util/Date;I)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    new-instance v0, Lcom/huawei/openalliance/ad/m/a/a$1;

    invoke-direct {v0, p0, v2, v3, v4}, Lcom/huawei/openalliance/ad/m/a/a$1;-><init>(Lcom/huawei/openalliance/ad/m/a/a;Lcom/huawei/openalliance/ad/db/bean/UserCloseRecord;J)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/m/a/a$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/m/a/a$2;-><init>(Lcom/huawei/openalliance/ad/m/a/a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;)V

    return-void
.end method
