.class Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;


# direct methods
.method constructor <init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 99
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 101
    :pswitch_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$000(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$000(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnShowListener;->onShow()V

    .line 104
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 107
    :pswitch_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$100(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 108
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$100(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnHideListener;->onHide()V

    .line 110
    :cond_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$202(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;)Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;

    .line 111
    const/4 v0, 0x1

    return v0

    .line 114
    :pswitch_2
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$300(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 115
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$402(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;I)I

    .line 116
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$300(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;

    move-result-object v0

    iget-object v1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$1;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$400(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$OnEditorListener;->onEditorChanged(I)V

    .line 118
    :cond_2
    const/4 v0, 0x1

    return v0

    .line 121
    :goto_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
