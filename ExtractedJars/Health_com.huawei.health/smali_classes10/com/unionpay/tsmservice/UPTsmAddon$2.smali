.class Lcom/unionpay/tsmservice/UPTsmAddon$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/UPTsmAddon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/unionpay/tsmservice/UPTsmAddon;


# direct methods
.method constructor <init>(Lcom/unionpay/tsmservice/UPTsmAddon;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 164
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 165
    iget v2, p1, Landroid/os/Message;->what:I

    .line 166
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 167
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 168
    invoke-static {v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/unionpay/tsmservice/ITsmCallback;

    .line 169
    if-eqz v4, :cond_0

    .line 170
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v0

    if-ne v3, v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$400(Lcom/unionpay/tsmservice/UPTsmAddon;)Landroid/os/Bundle;

    move-result-object v5

    .line 172
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0, v4, v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$500(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmCallback;Landroid/os/Bundle;)V

    .line 174
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$2;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    :cond_0
    return-void
.end method
