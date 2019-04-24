.class Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;
.super Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "KeyBoardCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;


# direct methods
.method constructor <init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorChanged(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 141
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 142
    const/4 v0, 0x2

    iput v0, v1, Landroid/os/Message;->what:I

    .line 143
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 144
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$500(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 145
    return-void
.end method

.method public onHide()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$500(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 137
    return-void
.end method

.method public onShow()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardCallback;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$500(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 132
    return-void
.end method
