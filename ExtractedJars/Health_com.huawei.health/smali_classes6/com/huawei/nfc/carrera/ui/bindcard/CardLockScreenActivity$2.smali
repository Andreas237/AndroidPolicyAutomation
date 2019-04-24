.class Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->refreshStatus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 332
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 333
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, v1, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    invoke-interface {v1}, Lcom/huawei/nfc/PluginPayAdapter;->getLockscreenStatus()I

    move-result v1

    iput v1, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    .line 334
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 335
    const-string v0, "CardLockScreenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " refreshStatus lockscreenstatus : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v3, v3, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v0, v0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    if-eqz v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$000(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 338
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;

    iget v2, v2, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->mLockscreenStatus:I

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$300(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;->access$400(Lcom/huawei/nfc/carrera/ui/bindcard/CardLockScreenActivity;Ljava/lang/String;)V

    .line 340
    :cond_0
    return-void
.end method
