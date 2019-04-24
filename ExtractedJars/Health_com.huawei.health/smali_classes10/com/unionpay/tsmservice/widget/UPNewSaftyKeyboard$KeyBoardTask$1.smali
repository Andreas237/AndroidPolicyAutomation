.class Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask;-><init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<Ljava/lang/String;>;"
    }
.end annotation


# instance fields
.field final synthetic val$this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;


# direct methods
.method constructor <init>(Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;)V
    .locals 0

    .line 703
    iput-object p1, p0, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$1;->val$this$0:Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 703
    invoke-virtual {p0}, Lcom/unionpay/tsmservice/widget/UPNewSaftyKeyboard$KeyBoardTask$1;->call()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 707
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "this should never be called"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
