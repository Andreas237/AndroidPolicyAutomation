.class Lcom/huawei/qrcode/logic/down/AppDownManager$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/qrcode/logic/down/IDownloadTaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/qrcode/logic/down/AppDownManager;->startDownLoadApp(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

.field final synthetic val$encrypPkgSignName:Ljava/lang/String;

.field final synthetic val$handler:Landroid/os/Handler;

.field final synthetic val$packageName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    iput-object p2, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$handler:Landroid/os/Handler;

    iput-object p3, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$packageName:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$encrypPkgSignName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDownloadFail(Lcom/huawei/qrcode/logic/down/DownloadEntity;I)V
    .locals 5

    const-string v0, "AppDownManager startDownloadApp onDownloadFail."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$handler:Landroid/os/Handler;

    const/16 v2, 0x3e9

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$100(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    return-void
.end method

.method public onDownloadFinish(Lcom/huawei/qrcode/logic/down/DownloadEntity;)V
    .locals 5

    const-string v0, "AppDownManager startDownloadApp onDownloadFinish."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    new-instance v4, Lcom/huawei/qrcode/logic/down/AppBean;

    invoke-direct {v4}, Lcom/huawei/qrcode/logic/down/AppBean;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/qrcode/logic/down/DownloadEntity;->getFilePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/qrcode/logic/down/AppBean;->setFilePath(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$packageName:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/qrcode/logic/down/AppBean;->setPackageName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$handler:Landroid/os/Handler;

    const/16 v2, 0x3f1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$100(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    return-void
.end method

.method public onDownloadPause(Lcom/huawei/qrcode/logic/down/DownloadEntity;)V
    .locals 0

    return-void
.end method

.method public onDownloadResume(Lcom/huawei/qrcode/logic/down/DownloadEntity;)V
    .locals 0

    return-void
.end method

.method public onDownloadStart(Lcom/huawei/qrcode/logic/down/DownloadEntity;)V
    .locals 0

    return-void
.end method

.method public setDownloadSize(Lcom/huawei/qrcode/logic/down/DownloadEntity;Ljava/lang/String;)V
    .locals 4

    const-string v0, "AppDownManager startDownloadApp setDownloadSize."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$handler:Landroid/os/Handler;

    const/16 v2, 0x3ef

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, p2}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$100(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    return-void
.end method

.method public setProgress(Lcom/huawei/qrcode/logic/down/DownloadEntity;I)V
    .locals 4

    const-string v0, "AppDownManager startDownloadApp setProgress."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$handler:Landroid/os/Handler;

    const/16 v2, 0x3ea

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p2, v3}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$100(Lcom/huawei/qrcode/logic/down/AppDownManager;Landroid/os/Handler;IILjava/lang/Object;)V

    return-void
.end method

.method public validate(Lcom/huawei/qrcode/logic/down/DownloadEntity;)Z
    .locals 2

    const-string v0, "AppDownManager startDownloadApp validate."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->this$0:Lcom/huawei/qrcode/logic/down/AppDownManager;

    iget-object v1, p0, Lcom/huawei/qrcode/logic/down/AppDownManager$1;->val$encrypPkgSignName:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lcom/huawei/qrcode/logic/down/AppDownManager;->access$200(Lcom/huawei/qrcode/logic/down/AppDownManager;Lcom/huawei/qrcode/logic/down/DownloadEntity;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
