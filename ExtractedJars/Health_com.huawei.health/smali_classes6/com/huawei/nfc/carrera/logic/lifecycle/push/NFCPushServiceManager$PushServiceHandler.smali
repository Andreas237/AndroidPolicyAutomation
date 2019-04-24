.class Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "PushServiceHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;Landroid/os/Looper;)V
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->this$0:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    .line 190
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 191
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 195
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===push==receivePushToken msg.what ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 197
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 199
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 201
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->this$0:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    invoke-static {v0, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->access$000(Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;Ljava/lang/String;)V

    .line 202
    goto :goto_0

    .line 206
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    .line 208
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager$PushServiceHandler;->this$0:Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;

    invoke-static {v0, v2}, Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;->access$100(Lcom/huawei/nfc/carrera/logic/lifecycle/push/NFCPushServiceManager;Ljava/lang/String;)V

    .line 209
    .line 215
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
