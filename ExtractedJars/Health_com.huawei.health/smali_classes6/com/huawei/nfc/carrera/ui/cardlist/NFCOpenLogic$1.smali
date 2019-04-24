.class Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;
.super Landroid/os/Handler;
.source "SourceFile"


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

    .line 174
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 177
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 178
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 180
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v1}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$000(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->openNFCEnvironment(Landroid/app/Activity;)V

    .line 181
    goto :goto_0

    .line 183
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;->enableNFCSuccess()V

    .line 184
    goto :goto_0

    .line 186
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;->enableNFCFailed()V

    .line 187
    goto :goto_0

    .line 189
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic$1;->this$0:Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;->access$100(Lcom/huawei/nfc/carrera/ui/cardlist/NFCOpenLogic;)Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/ui/cardlist/listener/EnableNFCListener;->dealDefaultPay()V

    .line 190
    .line 194
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
