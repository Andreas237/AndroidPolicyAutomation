.class Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/receiver/HealthAchieveNotificationService;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;


# direct methods
.method constructor <init>(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 278
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    if-nez v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    new-instance v1, Lo/cvz;

    invoke-direct {v1}, Lo/cvz;-><init>()V

    invoke-virtual {v0, v1}, Lo/dth;->setAdapter(Lo/eab;)V

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$1;->b:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v0}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->a(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->f()V

    .line 282
    return-void
.end method
