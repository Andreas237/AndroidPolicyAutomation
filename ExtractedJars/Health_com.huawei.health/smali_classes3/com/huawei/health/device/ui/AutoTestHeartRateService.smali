.class public Lcom/huawei/health/device/ui/AutoTestHeartRateService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;
    }
.end annotation


# instance fields
.field private b:Z

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->d:Ljava/lang/String;

    .line 21
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->b:Z

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->b:Z

    return v0
.end method

.method private b(Lo/abx;Lo/acl;Lo/afz;)V
    .locals 0

    .line 50
    invoke-interface {p1, p2, p3}, Lo/abx;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 51
    return-void
.end method

.method static synthetic e(Lcom/huawei/health/device/ui/AutoTestHeartRateService;)Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/health/device/ui/AutoTestHeartRateService;Lo/abx;Lo/acl;Lo/afz;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->b(Lo/abx;Lo/acl;Lo/afz;)V

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 47
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .line 25
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 26
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 41
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->b:Z

    .line 43
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .line 30
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 31
    const-string v0, "productId"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/AutoTestHeartRateService;->d:Ljava/lang/String;

    .line 32
    new-instance v0, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;-><init>(Lcom/huawei/health/device/ui/AutoTestHeartRateService;Lcom/huawei/health/device/ui/AutoTestHeartRateService$2;)V

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/AutoTestHeartRateService$d;->start()V

    .line 33
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0

    .line 35
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
