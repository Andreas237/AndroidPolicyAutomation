.class Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "NetworkChangeReceiver"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$1;)V
    .locals 0

    .line 73
    invoke-direct {p0, p1}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;-><init>(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 77
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->a()I

    move-result v0

    const/4 v1, -0x4

    if-ne v0, v1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->d(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderFragment;->e()V

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    invoke-static {v0}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->a(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoManager;->refreshCardList()V

    .line 86
    :cond_1
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->e(Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;Z)Z

    .line 88
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 89
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v5

    .line 90
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v6

    .line 93
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    const/4 v0, 0x0

    if-ne v0, v6, :cond_5

    .line 94
    :cond_2
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " NetworkChangeReceiver onReceive mobNetInfo "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v5, :cond_3

    const-string v3, "null"

    goto :goto_0

    :cond_3
    move-object v3, v5

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; wifiNetInfo : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, v6, :cond_4

    const-string v3, "null"

    goto :goto_1

    :cond_4
    move-object v3, v6

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 98
    :cond_5
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v6}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_6

    .line 100
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->mNetConnected:Z

    goto :goto_2

    .line 103
    :cond_6
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->mNetConnected:Z

    .line 105
    :goto_2
    const-string v0, "PluginPay CardHolderActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " NetworkChangeReceiver onReceive mNetConnected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    iget-boolean v3, v3, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->mNetConnected:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    iget-object v0, p0, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity$NetworkChangeReceiver;->a:Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/wallet/ui/cardholder/CardHolderActivity;->refreshView(Z)V

    .line 107
    return-void
.end method
