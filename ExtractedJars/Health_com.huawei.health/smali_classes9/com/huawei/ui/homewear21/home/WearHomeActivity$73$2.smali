.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$73$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;)V
    .locals 0

    .line 6652
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73$2;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 6655
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73$2;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6656
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73$2;->e:Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;

    iget-object v0, v0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$73;->d:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->d(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/ui/homewear21/R$string;->IDS_hw_toast_log_upload_failed:I

    invoke-static {v0, v1}, Lo/emv;->c(Landroid/content/Context;I)V

    .line 6657
    return-void
.end method
