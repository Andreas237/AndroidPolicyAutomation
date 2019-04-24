.class Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/AutoTestHeartRateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/device/ui/AutoTestHeartRateService;


# direct methods
.method private constructor <init>(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;->d:Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/device/ui/AutoTestHeartRateService;Lcom/huawei/health/device/ui/AutoTestHeartRateService$2;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;-><init>(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 58
    :cond_0
    const-wide/16 v0, 0x1388

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 59
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;->d:Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    invoke-static {v1}, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->e(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/agc;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 60
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;->d:Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    invoke-static {v1}, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->e(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/agc;->k(Ljava/lang/String;)Lo/afz;

    move-result-object v5

    .line 61
    iget-object v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;->d:Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    new-instance v1, Lo/agk;

    const v2, 0xc351

    invoke-direct {v1, v2}, Lo/agk;-><init>(I)V

    invoke-static {v0, v1, v4, v5}, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->e(Lcom/huawei/health/device/ui/AutoTestHeartRateService;Lo/abx;Lo/acl;Lo/afz;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    goto :goto_0

    .line 62
    :catch_0
    move-exception v4

    .line 63
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AutoTestHeartRateService InterruptedException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;->d:Lcom/huawei/health/device/ui/AutoTestHeartRateService;

    invoke-static {v0}, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->a(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    return-void
.end method
