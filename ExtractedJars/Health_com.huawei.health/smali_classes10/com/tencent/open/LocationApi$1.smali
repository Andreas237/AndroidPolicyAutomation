.class Lcom/tencent/open/LocationApi$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/LocationApi;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/LocationApi;


# direct methods
.method constructor <init>(Lcom/tencent/open/LocationApi;Landroid/os/Looper;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/tencent/open/LocationApi$1;->a:Lcom/tencent/open/LocationApi;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 81
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 83
    :pswitch_0
    const-string v0, "openSDK_LOG"

    const-string v1, "location: verify sosocode success."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/tencent/open/LocationApi$1;->a:Lcom/tencent/open/LocationApi;

    invoke-static {v0}, Lcom/tencent/open/LocationApi;->a(Lcom/tencent/open/LocationApi;)Lcom/tencent/open/c;

    move-result-object v0

    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/LocationApi$1;->a:Lcom/tencent/open/LocationApi;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/c;->a(Landroid/content/Context;Lcom/tencent/open/c$a;)V

    .line 85
    iget-object v0, p0, Lcom/tencent/open/LocationApi$1;->a:Lcom/tencent/open/LocationApi;

    invoke-static {v0}, Lcom/tencent/open/LocationApi;->b(Lcom/tencent/open/LocationApi;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x65

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 86
    goto :goto_0

    .line 88
    :pswitch_1
    const-string v0, "openSDK_LOG"

    const-string v1, "location: verify sosocode failed."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/tencent/open/LocationApi$1;->a:Lcom/tencent/open/LocationApi;

    const-string v1, "\u5b9a\u4f4d\u5931\u8d25\uff0c\u9a8c\u8bc1\u5b9a\u4f4d\u7801\u9519\u8bef\uff01"

    const/16 v2, -0xe

    invoke-static {v0, v2, v1}, Lcom/tencent/open/LocationApi;->a(Lcom/tencent/open/LocationApi;ILjava/lang/String;)V

    .line 90
    goto :goto_0

    .line 92
    :pswitch_2
    const-string v0, "openSDK_LOG"

    const-string v1, "location: get location timeout."

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/tencent/open/LocationApi$1;->a:Lcom/tencent/open/LocationApi;

    const-string v1, "\u5b9a\u4f4d\u8d85\u65f6\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5\u6216\u68c0\u67e5\u7f51\u7edc\u72b6\u51b5\uff01"

    const/16 v2, -0xd

    invoke-static {v0, v2, v1}, Lcom/tencent/open/LocationApi;->a(Lcom/tencent/open/LocationApi;ILjava/lang/String;)V

    .line 94
    .line 98
    :goto_0
    :pswitch_3
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 99
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
