.class public Lo/drx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Lo/drx;

.field private static c:Landroid/content/Context;

.field private static final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const-class v0, Lo/drx;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/drx;->a:Ljava/lang/String;

    .line 17
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/drx;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Ljava/lang/String;
    .locals 3

    .line 45
    invoke-static {}, Lo/dqq;->b()Lo/dqq;

    move-result-object v0

    sget-object v1, Lo/drx;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dqq;->b(Landroid/content/Context;)Lo/dqp;

    move-result-object v2

    .line 46
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 47
    sget-object v0, Lo/drx;->a:Ljava/lang/String;

    const-string v1, "mCarrierConfigInfo.getCDMUrl()"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    invoke-virtual {v2}, Lo/dqp;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 50
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 3

    .line 75
    invoke-static {}, Lo/dqq;->b()Lo/dqq;

    move-result-object v0

    sget-object v1, Lo/drx;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dqq;->b(Landroid/content/Context;)Lo/dqp;

    move-result-object v2

    .line 76
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 77
    sget-object v0, Lo/drx;->a:Ljava/lang/String;

    const-string v1, "mCarrierConfigInfo.getBSFUrl()"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 78
    invoke-virtual {v2}, Lo/dqp;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 80
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 124
    new-instance v1, Lo/dqu;

    sget-object v0, Lo/drx;->c:Landroid/content/Context;

    invoke-direct {v1, v0}, Lo/dqu;-><init>(Landroid/content/Context;)V

    .line 125
    invoke-virtual {v1, p0}, Lo/dqu;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()Ljava/lang/String;
    .locals 3

    .line 60
    invoke-static {}, Lo/dqq;->b()Lo/dqq;

    move-result-object v0

    sget-object v1, Lo/drx;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/dqq;->b(Landroid/content/Context;)Lo/dqp;

    move-result-object v2

    .line 61
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 62
    sget-object v0, Lo/drx;->a:Ljava/lang/String;

    const-string v1, "mCarrierConfigInfo.getESUrl()"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    invoke-virtual {v2}, Lo/dqp;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 65
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 100
    const/4 v2, 0x0

    .line 101
    const-string v0, "MSISDN"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 102
    invoke-static {}, Lo/drz;->e()Lo/drz;

    move-result-object v0

    sget-object v1, Lo/drx;->c:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Lo/drz;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 104
    :cond_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 105
    sget-object v0, Lo/drx;->a:Ljava/lang/String;

    const-string v1, "simOperator is null"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 106
    const/4 v0, 0x0

    return-object v0

    .line 108
    :cond_1
    sget-object v0, Lo/drx;->c:Landroid/content/Context;

    invoke-static {v0, v2}, Lo/dqw;->c(Landroid/content/Context;Ljava/lang/String;)Lo/dqp;

    move-result-object v3

    .line 109
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 110
    invoke-virtual {v3}, Lo/dqp;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 112
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e()Lo/drx;
    .locals 1

    .line 20
    sget-object v0, Lo/drx;->b:Lo/drx;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lo/drx;

    invoke-direct {v0}, Lo/drx;-><init>()V

    sput-object v0, Lo/drx;->b:Lo/drx;

    .line 23
    :cond_0
    sget-object v0, Lo/drx;->b:Lo/drx;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 3

    .line 31
    sget-object v1, Lo/drx;->d:Ljava/lang/Object;

    monitor-enter v1

    .line 32
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 33
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/drx;->c:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 36
    :goto_0
    return-void
.end method
