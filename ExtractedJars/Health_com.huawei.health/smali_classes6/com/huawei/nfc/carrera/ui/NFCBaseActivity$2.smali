.class Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;)V
    .locals 0

    .line 735
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .line 738
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 739
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v3

    .line 740
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v4

    .line 741
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 743
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    goto :goto_0

    .line 746
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->mNetConnected:Z

    .line 748
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity$2;->this$0:Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->refreshView(Z)V

    .line 749
    return-void
.end method
