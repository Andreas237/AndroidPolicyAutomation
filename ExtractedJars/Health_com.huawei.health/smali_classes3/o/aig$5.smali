.class Lo/aig$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aig;


# direct methods
.method constructor <init>(Lo/aig;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lo/aig$5;->a:Lo/aig;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 199
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 200
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 202
    :sswitch_0
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0, p1}, Lo/aig;->d(Lo/aig;Landroid/os/Message;)V

    .line 203
    goto/16 :goto_0

    .line 205
    :sswitch_1
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->c(Lo/aig;)Ljava/lang/String;

    move-result-object v4

    .line 206
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TIMEOUT:\u8bbe\u5907\u914d\u7f6e\u5931\u8d25\uff0c\u7ed3\u679c\u4e0a\u62a5UI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->e(Lo/aig;)Lo/ajv;

    move-result-object v0

    const-string v1, "\u914d\u7f51\u5931\u8d25"

    const/16 v2, 0x83c

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-virtual {v0}, Lo/aig;->a()V

    .line 210
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-virtual {v0}, Lo/aig;->c()V

    .line 211
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->a(Lo/aig;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->c(Landroid/content/Context;)V

    .line 212
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->b(Lo/aig;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 213
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->b(Lo/aig;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x83c

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    goto/16 :goto_0

    .line 218
    :sswitch_2
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->c(Lo/aig;)Ljava/lang/String;

    move-result-object v5

    .line 219
    const-string v0, "MulticastTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UDP\u63a5\u6536\u5f02\u5e38\uff0c\u7ed3\u679c\u4e0a\u62a5UI "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 220
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-virtual {v0}, Lo/aig;->c()V

    .line 222
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->e(Lo/aig;)Lo/ajv;

    move-result-object v0

    const-string v1, "\u914d\u7f51\u5931\u8d25"

    const/16 v2, 0x835

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->a(Lo/aig;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->c(Landroid/content/Context;)V

    .line 224
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->b(Lo/aig;)Lo/ajm;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 225
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->b(Lo/aig;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x835

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    goto/16 :goto_0

    .line 229
    :sswitch_3
    const-string v0, "MulticastTask"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u505c\u6b62\u53d1\u5305"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v2}, Lo/aig;->d(Lo/aig;)[I

    move-result-object v2

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " \u5171\u53d1\u4e86"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v2}, Lo/aig;->h(Lo/aig;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "\u4e2a\u7ec4\u64ad"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v2}, Lo/aig;->g(Lo/aig;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "\u5e7f\u64ad"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 230
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->b(Lo/aig;)Lo/ajm;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->b(Lo/aig;)Lo/ajm;

    move-result-object v0

    const/16 v1, 0x8a2

    invoke-interface {v0, v1}, Lo/ajm;->onStatus(I)V

    .line 233
    :cond_0
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-virtual {v0}, Lo/aig;->e()V

    .line 234
    goto/16 :goto_0

    .line 236
    :sswitch_4
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4f4e\u901f\u6a21\u5f0f 2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/aig;->e(I)V

    .line 238
    goto/16 :goto_0

    .line 240
    :sswitch_5
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e2d\u901f\u6a21\u5f0f 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 241
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/aig;->e(I)V

    .line 242
    goto :goto_0

    .line 244
    :sswitch_6
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aig;->d(Lo/aig;I)I

    .line 245
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5207\u6362\u6a21\u5f0f"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v3}, Lo/aig;->i(Lo/aig;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->f(Lo/aig;)Lo/aig$e;

    move-result-object v0

    iget-object v1, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v1}, Lo/aig;->i(Lo/aig;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/aig$e;->e(I)V

    .line 247
    goto :goto_0

    .line 250
    :sswitch_7
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->k(Lo/aig;)Landroid/net/wifi/WifiManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->startScan()Z

    .line 251
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0}, Lo/aig;->p(Lo/aig;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 252
    goto :goto_0

    .line 254
    :sswitch_8
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MULTICAST_STATUS_COAP_SCAN_OK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iget-object v0, p0, Lo/aig$5;->a:Lo/aig;

    invoke-static {v0, p1}, Lo/aig;->d(Lo/aig;Landroid/os/Message;)V

    .line 257
    .line 263
    :cond_1
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_3
        0x3 -> :sswitch_4
        0x4 -> :sswitch_5
        0x5 -> :sswitch_2
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x89f -> :sswitch_8
    .end sparse-switch
.end method
