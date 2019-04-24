.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private mExcuteHandler:Landroid/os/Handler;

.field private mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;

.field private resultCode:I

.field private resultProductId:Ljava/lang/String;

.field private resultRefId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->mExcuteHandler:Landroid/os/Handler;

    .line 54
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;

    .line 55
    return-void
.end method


# virtual methods
.method public notifyInstallResult(ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 65
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->resultCode:I

    .line 66
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->resultProductId:Ljava/lang/String;

    .line 67
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->resultRefId:Ljava/lang/String;

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->mExcuteHandler:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    return-void
.end method

.method public run()V
    .locals 4

    .line 78
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->mResultCallback:Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->resultCode:I

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->resultProductId:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleInstallCardResultTask;->resultRefId:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/response/InstallCardResultCallback;->installResultCallback(ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    :cond_0
    return-void
.end method
