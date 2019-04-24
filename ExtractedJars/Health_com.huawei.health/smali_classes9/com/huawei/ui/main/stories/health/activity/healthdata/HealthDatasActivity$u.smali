.class Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$u;
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
    name = "u"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V
    .locals 0

    .line 985
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$u;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$2;)V
    .locals 0

    .line 985
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$u;-><init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 2

    .line 988
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$u;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 989
    const/4 v0, 0x4

    iput v0, v1, Landroid/os/Message;->what:I

    .line 990
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity$u;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/HealthDatasActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 992
    return-void
.end method
