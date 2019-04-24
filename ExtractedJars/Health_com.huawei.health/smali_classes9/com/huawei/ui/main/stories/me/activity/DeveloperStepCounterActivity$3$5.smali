.class Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cms;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->b(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 4

    .line 124
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushCacheToDB onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3$5;->e:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$3;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V

    .line 126
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 4

    .line 135
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushCacheToDB onServiceException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    .line 130
    invoke-static {}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flushCacheToDB onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    return-void
.end method
