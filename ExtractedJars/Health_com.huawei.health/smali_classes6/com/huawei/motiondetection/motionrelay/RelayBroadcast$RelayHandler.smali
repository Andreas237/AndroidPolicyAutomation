.class Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RelayHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;


# direct methods
.method constructor <init>(Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;)V
    .locals 0

    .line 246
    iput-object p1, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;->this$0:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 254
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 256
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast$RelayHandler;->this$0:Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;->access$0(Lcom/huawei/motiondetection/motionrelay/RelayBroadcast;Landroid/content/Intent;)V

    .line 257
    .line 261
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
