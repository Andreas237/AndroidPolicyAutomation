.class Lcom/unionpay/tsmservice/UPTsmAddon$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


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

    .line 142
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$1;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 146
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 148
    :sswitch_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$1;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$000(Lcom/unionpay/tsmservice/UPTsmAddon;)V

    .line 149
    const/4 v0, 0x1

    return v0

    .line 151
    :sswitch_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$1;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$100(Lcom/unionpay/tsmservice/UPTsmAddon;)V

    .line 152
    const/4 v0, 0x1

    return v0

    .line 154
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
