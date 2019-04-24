.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V
    .locals 0

    .line 1251
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$2;)V
    .locals 0

    .line 1251
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$d;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 1254
    const-string v0, "UIHLH_HealthDatasActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodsugarDataReadComplete onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1255
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1256
    const/4 v0, 0x2

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1257
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1258
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$d;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1259
    return-void
.end method
