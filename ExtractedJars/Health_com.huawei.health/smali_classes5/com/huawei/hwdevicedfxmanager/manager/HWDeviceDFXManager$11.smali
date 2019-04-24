.class Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

.field final synthetic val$auto:Z


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Z)V
    .locals 0

    .line 821
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$11;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    iput-boolean p2, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$11;->val$auto:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 824
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BuildConfig.RELEASE_EVENT_LOG_UPLOAD: true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$11;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->uploadReleaseEventLog(Landroid/content/Context;)V

    .line 830
    return-void
.end method
