.class Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WifiHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;


# direct methods
.method constructor <init>(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 92
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 93
    const-string v0, "AsyncChannel"

    const-string v1, "CMD_CHANNEL_HALF_CONNECTED"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/ReflectionUtils;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 94
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    instance-of v0, v3, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget v0, p1, Landroid/os/Message;->what:I

    move-object v1, v3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 95
    :goto_0
    if-eqz v4, :cond_6

    .line 96
    const-string v0, "zgs->CMD_CHANNEL_HALF_CONNECTED"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 97
    const-string v0, "AsyncChannel"

    const-string v1, "STATUS_SUCCESSFUL"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/ReflectionUtils;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 98
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    instance-of v0, v3, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget v0, p1, Landroid/os/Message;->arg1:I

    move-object v1, v3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    .line 99
    :goto_1
    if-eqz v4, :cond_5

    .line 100
    const-string v0, "AsyncChannel"

    const-string v1, "CMD_CHANNEL_FULL_CONNECTION"

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/ReflectionUtils;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 101
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    instance-of v0, v3, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 102
    :goto_2
    if-eqz v4, :cond_3

    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$100(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$100(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Landroid/os/Handler;

    if-eqz v0, :cond_3

    const/4 v4, 0x1

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    .line 103
    :goto_3
    if-eqz v4, :cond_4

    .line 104
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v0}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$100(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    move-object v1, v3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_4

    .line 106
    :cond_4
    const-string v0, "reflexObj is null or reflexObj is not Integer type or mWiFiChannel is null or mWifiChannel is not Handler"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->b(Ljava/lang/String;Z)V

    goto :goto_4

    .line 110
    :cond_5
    const-string v0, "Failed to connect to wifi"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    goto :goto_4

    .line 112
    :cond_6
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$200(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)Landroid/net/wifi/WifiManager;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "DATA_ACTIVITY_NOTIFICATION"

    invoke-static {v1, v2}, Lcom/huawei/pay/ui/oobe/widget/ReflectionNetStatusHelper;->getFieldInt(Ljava/lang/Class;Ljava/lang/String;)I

    move-result v1

    if-ne v0, v1, :cond_7

    .line 114
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$300(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I

    move-result v1

    if-eq v0, v1, :cond_7

    .line 115
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$302(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;I)I

    .line 116
    const-string v0, "zgs"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "zgs->mWifiActivity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v2}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$300(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/dtg;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 117
    iget-object v0, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    iget-object v1, p0, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar$WifiHandler;->this$0:Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;

    invoke-static {v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->access$300(Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/pay/ui/oobe/widget/NetStatusBar;->refreshWifiViews(I)V

    .line 120
    :cond_7
    :goto_4
    return-void
.end method
