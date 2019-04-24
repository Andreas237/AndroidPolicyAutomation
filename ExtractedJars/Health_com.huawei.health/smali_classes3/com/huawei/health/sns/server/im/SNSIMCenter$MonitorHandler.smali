.class final Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/im/SNSIMCenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "MonitorHandler"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/server/im/SNSIMCenter;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/server/im/SNSIMCenter;Landroid/os/Looper;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->d:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    .line 173
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 174
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 179
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 180
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 183
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->d:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget v2, p1, Landroid/os/Message;->arg2:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(Lcom/huawei/health/sns/server/im/SNSIMCenter;IZ)V

    .line 184
    goto :goto_1

    .line 186
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->d:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->i()V

    .line 187
    goto :goto_1

    .line 189
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/SNSIMCenter$MonitorHandler;->d:Lcom/huawei/health/sns/server/im/SNSIMCenter;

    invoke-static {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->e(Lcom/huawei/health/sns/server/im/SNSIMCenter;)V

    .line 190
    .line 194
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
