.class Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->initUPTsmAddon()V
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

    .line 174
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$2;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTsmConnected()V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$2;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    iget-object v1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$2;->this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-static {v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$600(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;->access$700(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;I)V

    .line 184
    return-void
.end method

.method public onTsmDisconnected()V
    .locals 0

    .line 179
    return-void
.end method
