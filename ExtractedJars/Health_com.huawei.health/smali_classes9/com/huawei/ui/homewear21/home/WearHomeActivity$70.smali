.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 6406
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 6410
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Z(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6411
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_auto_upload_wifi:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6412
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$70;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->b(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6413
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/UploadLogUtil;->setAgreeUploadUseFlow(Z)V

    .line 6414
    return-void
.end method
