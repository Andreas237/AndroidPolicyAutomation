.class Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;->onPullingChange(Lo/eay;Lo/eba;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;

.field final synthetic val$result:Lo/eba;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;Lo/eba;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;->val$result:Lo/eba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;->val$result:Lo/eba;

    iget v0, v0, Lo/eba;->c:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 97
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;->val$result:Lo/eba;

    invoke-virtual {v0}, Lo/eba;->d()I

    move-result v4

    .line 98
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateDescription totalSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->setSize(I)Ljava/lang/String;

    move-result-object v5

    .line 100
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSize size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1$1;->this$1:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity$1;->this$0:Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;

    invoke-static {v0, v5}, Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;->access$000(Lcom/huawei/nfc/carrera/ui/download/DownloadPluginPayActivity;Ljava/lang/String;)V

    .line 102
    goto :goto_1

    .line 104
    :goto_0
    const-string v0, "DownloadPluginPayActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateDescription get totalSize error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
