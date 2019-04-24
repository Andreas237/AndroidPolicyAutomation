.class Lcom/huawei/feedback/logic/j;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/logic/i;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/logic/i;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/feedback/logic/j;->a:Lcom/huawei/feedback/logic/i;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 88
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 89
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 90
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 92
    :pswitch_0
    new-instance v0, Lcom/huawei/feedback/logic/k;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/k;-><init>(Lcom/huawei/feedback/logic/j;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 100
    goto :goto_0

    .line 102
    :pswitch_1
    new-instance v0, Lcom/huawei/feedback/logic/l;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/l;-><init>(Lcom/huawei/feedback/logic/j;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 110
    goto :goto_0

    .line 112
    :pswitch_2
    new-instance v0, Lcom/huawei/feedback/logic/m;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/logic/m;-><init>(Lcom/huawei/feedback/logic/j;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 120
    .line 124
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
