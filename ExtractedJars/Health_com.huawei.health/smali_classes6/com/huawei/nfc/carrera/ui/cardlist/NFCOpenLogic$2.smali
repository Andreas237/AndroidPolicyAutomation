.class Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;


# direct methods
.method constructor <init>(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 200
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isEnabledNFC(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->enableNFC(Landroid/content/Context;)Z

    move-result v4

    .line 202
    if-nez v4, :cond_0

    .line 204
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->handler:Landroid/os/Handler;

    const/16 v1, 0xc

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 205
    return-void

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->isSelectSE(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 211
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/NfcUtil;->selectSE(Landroid/content/Context;)V

    .line 212
    return-void

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$2;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    iget-object v0, v0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->handler:Landroid/os/Handler;

    const/16 v1, 0xb

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 225
    return-void
.end method
