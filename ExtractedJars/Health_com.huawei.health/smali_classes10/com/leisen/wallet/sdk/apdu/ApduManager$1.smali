.class Lcom/leisen/wallet/sdk/apdu/ApduManager$1;
.super Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/leisen/wallet/sdk/apdu/ApduManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;


# direct methods
.method constructor <init>(Lcom/leisen/wallet/sdk/apdu/ApduManager;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-direct {p0}, Lcom/leisen/wallet/sdk/apdu/ApduResponseHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public OnSendNextError(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Error;)V
    .locals 4

    .line 80
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-virtual {p5}, Ljava/lang/Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$402(Lcom/leisen/wallet/sdk/apdu/ApduManager;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$208(Lcom/leisen/wallet/sdk/apdu/ApduManager;)I

    .line 82
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OnSendNextError"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$300(Lcom/leisen/wallet/sdk/apdu/ApduManager;IILjava/lang/String;Ljava/lang/String;)V

    .line 84
    return-void
.end method

.method public onFailure(ILjava/lang/Error;)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$000(Lcom/leisen/wallet/sdk/apdu/ApduManager;)Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$000(Lcom/leisen/wallet/sdk/apdu/ApduManager;)Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;->onOperFailure(ILjava/lang/Error;)V

    .line 91
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$100(Lcom/leisen/wallet/sdk/apdu/ApduManager;)V

    .line 92
    return-void
.end method

.method public onSendNext(IILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 73
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$208(Lcom/leisen/wallet/sdk/apdu/ApduManager;)I

    .line 74
    const-string v0, "ApduManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSendNext"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$300(Lcom/leisen/wallet/sdk/apdu/ApduManager;IILjava/lang/String;Ljava/lang/String;)V

    .line 76
    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$000(Lcom/leisen/wallet/sdk/apdu/ApduManager;)Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$000(Lcom/leisen/wallet/sdk/apdu/ApduManager;)Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/leisen/wallet/sdk/tsm/TSMOperatorResponse;->onOperSuccess(Ljava/lang/String;)V

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/apdu/ApduManager$1;->this$0:Lcom/leisen/wallet/sdk/apdu/ApduManager;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/apdu/ApduManager;->access$100(Lcom/leisen/wallet/sdk/apdu/ApduManager;)V

    .line 69
    return-void
.end method
