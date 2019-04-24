.class Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 58
    const/4 v4, 0x0

    .line 59
    const-string v0, "LeftRightHandSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LEFT_OR_RIGHT_HAND_WEAR_STATUS err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 61
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 62
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 64
    :cond_0
    const/4 v0, 0x1

    if-ne v0, v4, :cond_1

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->b(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;Z)Z

    .line 67
    :cond_1
    const-string v0, "LeftRightHandSettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWearState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->c(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;->d:Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;

    new-instance v1, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5$3;

    invoke-direct {v1, p0}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5$3;-><init>(Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity$5;)V

    invoke-virtual {v0, v1}, Lcom/huawei/ui/device/activity/leftrighthand/LeftRightHandSettingsActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 74
    return-void
.end method
