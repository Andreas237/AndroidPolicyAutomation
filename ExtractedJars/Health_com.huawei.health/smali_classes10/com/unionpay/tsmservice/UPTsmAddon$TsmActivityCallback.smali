.class public Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;
.super Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/UPTsmAddon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TsmActivityCallback"
.end annotation


# instance fields
.field private mActivityCallbackId:I

.field final synthetic this$0:Lcom/unionpay/tsmservice/UPTsmAddon;


# direct methods
.method public constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V
    .locals 0

    .line 1673
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;-><init>()V

    .line 1674
    iput p2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;->mActivityCallbackId:I

    .line 1675
    return-void
.end method


# virtual methods
.method public StartActivity(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1680
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    iget v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;->mActivityCallbackId:I

    .line 1681
    invoke-static {v1, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$900(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 1682
    invoke-static {v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/unionpay/tsmservice/ITsmActivityCallback;

    .line 1680
    invoke-static {v0, v1, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$1000(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmActivityCallback;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1684
    return-void
.end method
