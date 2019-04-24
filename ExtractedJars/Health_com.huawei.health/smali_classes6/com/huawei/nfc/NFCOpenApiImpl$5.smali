.class Lcom/huawei/nfc/NFCOpenApiImpl$5;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/NFCOpenApiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/NFCOpenApiImpl;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/NFCOpenApiImpl;)V
    .locals 0

    .line 413
    iput-object p1, p0, Lcom/huawei/nfc/NFCOpenApiImpl$5;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 416
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 417
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v5

    .line 418
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v6

    .line 419
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v6}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    .line 421
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7f51\u7edc\u672a\u8fde\u63a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 424
    :cond_0
    const-string v0, "NFCOpenApiImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u7f51\u7edc\u8fde\u63a5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/nfc/NFCOpenApiImpl$5;->this$0:Lcom/huawei/nfc/NFCOpenApiImpl;

    invoke-static {v0}, Lcom/huawei/nfc/NFCOpenApiImpl;->access$100(Lcom/huawei/nfc/NFCOpenApiImpl;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->clearAllNullifiedCardLocalInfo()V

    .line 427
    :goto_0
    return-void
.end method
