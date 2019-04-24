.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->onFailure(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;I)V
    .locals 0

    .line 6521
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iput p2, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 6524
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6525
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_show_log_bt_disconnect:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(ILjava/lang/String;)V

    .line 6526
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 6527
    return-void
.end method
