.class Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;
.super Lcom/unionpay/tsmservice/ITsmCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "EncryptDataCallback"
.end annotation


# instance fields
.field final synthetic this$1:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;


# direct methods
.method constructor <init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;)V
    .locals 0

    .line 744
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;->this$1:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 761
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;->this$1:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->access$1200(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;Ljava/lang/Object;)V

    .line 762
    return-void
.end method

.method public onResult(Landroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 749
    const-class v0, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;

    .line 750
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 749
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 751
    const-string v0, "result"

    .line 752
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;

    .line 753
    invoke-virtual {v1}, Lcom/unionpay/tsmservice/result/GetEncryptDataResult;->getData()Ljava/lang/String;

    move-result-object v2

    .line 754
    iget-object v0, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$EncryptDataCallback;->this$1:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;

    invoke-static {v0, v2}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;->access$1100(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;Ljava/lang/Object;)V

    .line 755
    return-void
.end method
