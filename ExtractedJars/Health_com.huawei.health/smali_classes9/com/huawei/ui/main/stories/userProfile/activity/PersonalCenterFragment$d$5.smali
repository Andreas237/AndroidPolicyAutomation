.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;)V
    .locals 0

    .line 4027
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d$5;->e:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 2

    .line 4035
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 4036
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 0

    .line 4039
    return-void
.end method

.method public onSuccess(ILjava/lang/String;)V
    .locals 2

    .line 4030
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 4031
    return-void
.end method
