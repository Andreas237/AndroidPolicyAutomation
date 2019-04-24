.class Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->initData()V
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

    .line 89
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    new-instance v1, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;

    invoke-direct {v1, p0, p2}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;-><init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;Lo/eba;)V

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 109
    return-void
.end method
