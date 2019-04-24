.class public Lo/dce;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcf;


# static fields
.field private static a:Lo/dce;

.field private static c:Ljava/lang/String;


# instance fields
.field private e:Lo/dcf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    const-string v0, "HealthCrowdTestProxy"

    sput-object v0, Lo/dce;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-string v0, "com.huawei.HealthCrowdTest.HealthCrowdTest"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    .line 19
    invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/dcf;

    iput-object v0, p0, Lo/dce;->e:Lo/dcf;

    .line 20
    sget-object v0, Lo/dce;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "  ==init HealthCrowdTest ok==   "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 21
    :catch_0
    move-exception v4

    .line 22
    sget-object v0, Lo/dce;->c:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Exception =="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 24
    :goto_0
    return-void
.end method

.method public static c()Lo/dce;
    .locals 4

    .line 27
    const-class v2, Lo/dce;

    monitor-enter v2

    .line 28
    :try_start_0
    sget-object v0, Lo/dce;->a:Lo/dce;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 29
    new-instance v0, Lo/dce;

    invoke-direct {v0}, Lo/dce;-><init>()V

    sput-object v0, Lo/dce;->a:Lo/dce;

    .line 31
    :cond_0
    sget-object v0, Lo/dce;->a:Lo/dce;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 32
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Ljava/lang/String;ZLo/dcg;)V
    .locals 6

    .line 62
    iget-object v0, p0, Lo/dce;->e:Lo/dcf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 63
    iget-object v0, p0, Lo/dce;->e:Lo/dcf;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lo/dcf;->a(Landroid/content/Context;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Ljava/lang/String;ZLo/dcg;)V

    .line 65
    :cond_0
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 81
    sget-object v0, Lo/dce;->c:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "  ==setProductType==   "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    iget-object v0, p0, Lo/dce;->e:Lo/dcf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/dce;->e:Lo/dcf;

    invoke-interface {v0, p1}, Lo/dcf;->c(I)V

    .line 85
    :cond_0
    return-void
.end method

.method public e(Landroid/content/Context;Lo/dby;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Lo/dcd;)V
    .locals 2

    .line 43
    iget-object v0, p0, Lo/dce;->e:Lo/dcf;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 44
    iget-object v0, p0, Lo/dce;->e:Lo/dcf;

    invoke-interface {v0, p1, p2, p3, p4}, Lo/dcf;->e(Landroid/content/Context;Lo/dby;Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;Lo/dcd;)V

    .line 46
    :cond_0
    return-void
.end method
