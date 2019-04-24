.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;)V
    .locals 0

    .line 3632
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 2

    .line 3640
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->P(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/eog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eog;->e(Z)V

    .line 3641
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 0

    .line 3644
    return-void
.end method

.method public onSuccess(ILjava/lang/String;)V
    .locals 2

    .line 3635
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28$2;->c:Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$28;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->P(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Lo/eog;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eog;->e(Z)V

    .line 3636
    return-void
.end method
