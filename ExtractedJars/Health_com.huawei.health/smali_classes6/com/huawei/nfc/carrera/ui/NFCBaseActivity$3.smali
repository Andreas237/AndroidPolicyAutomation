.class Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->setWatchLockscreen(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

.field final synthetic val$requestIntent:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;Ljava/lang/String;)V
    .locals 0

    .line 758
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;->val$requestIntent:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 761
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 762
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->pluginPayAdapter:Lcom/huawei/nfc/PluginPayAdapter;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;->val$requestIntent:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/PluginPayAdapter;->notificationOpenPageOfBand(Ljava/lang/String;)Z

    .line 765
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWatcStatus mLockscreenStatus  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$3;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    iget v1, v1, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mLockscreenStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 766
    return-void
.end method
