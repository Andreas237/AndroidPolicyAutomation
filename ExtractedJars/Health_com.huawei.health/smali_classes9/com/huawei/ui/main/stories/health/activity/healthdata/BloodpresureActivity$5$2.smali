.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5$2;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 202
    if-nez p1, :cond_0

    .line 203
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5$2;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 204
    move-object v2, p2

    check-cast v2, Ljava/util/List;

    .line 205
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/os/Message;->what:I

    .line 206
    const/4 v0, 0x1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5$2;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$5;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 209
    :cond_0
    return-void
.end method
