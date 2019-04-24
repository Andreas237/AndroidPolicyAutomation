.class Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->downloadPluginPay()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 177
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onPullingChange result.status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Lo/eba;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;

    invoke-direct {v1, p0, p2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2$1;-><init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$2;Lo/eba;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 220
    return-void
.end method
