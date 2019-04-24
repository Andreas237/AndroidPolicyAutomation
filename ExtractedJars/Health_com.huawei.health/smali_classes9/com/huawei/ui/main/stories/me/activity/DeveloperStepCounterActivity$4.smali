.class Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 258
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 238
    if-eqz p1, :cond_0

    .line 239
    move-object v3, p1

    check-cast v3, Landroid/os/Bundle;

    .line 240
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const-string v1, "standardBase"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->c(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I

    .line 241
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const-string v1, "restartSteps"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->b(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I

    .line 242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const-string v1, "otherSteps"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const-string v1, "cacheTotalSteps"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->e(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;I)I

    .line 244
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const-string v1, "serviceRestartRecord"

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->d(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 245
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity$4;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;->a(Lcom/huawei/ui/main/stories/me/activity/DeveloperStepCounterActivity;ILjava/lang/Object;)V

    .line 248
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/Object;)V
    .locals 0

    .line 253
    return-void
.end method
