.class Lcom/unionpay/tsmservice/UPTsmAddon$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/unionpay/tsmservice/UPTsmAddon;->bindUPTsmService()Z
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

    .line 1247
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1259
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$602(Lcom/unionpay/tsmservice/UPTsmAddon;Z)Z

    .line 1260
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {p2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmService;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$702(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmService;)Lcom/unionpay/tsmservice/ITsmService;

    .line 1261
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$800(Lcom/unionpay/tsmservice/UPTsmAddon;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1262
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1251
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$602(Lcom/unionpay/tsmservice/UPTsmAddon;Z)Z

    .line 1252
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$702(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmService;)Lcom/unionpay/tsmservice/ITsmService;

    .line 1253
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon$3;->this$0:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-static {v0}, Lcom/unionpay/tsmservice/UPTsmAddon;->access$800(Lcom/unionpay/tsmservice/UPTsmAddon;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1254
    return-void
.end method
