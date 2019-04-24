.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;)V
    .locals 0

    .line 1268
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s$3;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 1290
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 5

    .line 1271
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get today steps success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1272
    if-nez p1, :cond_0

    .line 1273
    return-void

    .line 1275
    :cond_0
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_1

    .line 1276
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s$3;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x68

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    .line 1277
    iput-object p1, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1278
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s$3;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$s;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1280
    :cond_1
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 1285
    return-void
.end method
