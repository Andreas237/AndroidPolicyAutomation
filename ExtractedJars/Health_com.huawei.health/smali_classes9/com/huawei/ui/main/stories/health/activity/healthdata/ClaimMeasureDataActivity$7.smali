.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e(Lo/acu;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 500
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 5

    .line 503
    if-eqz p1, :cond_0

    .line 504
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    move-result-object v0

    const/4 v1, 0x6

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendEmptyMessageDelayed(IJ)Z

    .line 506
    :cond_0
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 507
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 508
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 509
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$7;->d:Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->k(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->sendMessage(Landroid/os/Message;)Z

    .line 510
    return-void
.end method
