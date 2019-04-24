.class Lo/akj$a;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/akj;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akj;Landroid/os/Looper;)V
    .locals 0

    .line 140
    invoke-direct {p0, p1, p2}, Lo/aju;-><init>(Ljava/lang/Object;Landroid/os/Looper;)V

    .line 141
    return-void
.end method


# virtual methods
.method public d(Lo/akj;Landroid/os/Message;)V
    .locals 5

    .line 146
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 147
    :cond_0
    return-void

    .line 149
    :cond_1
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 151
    :sswitch_0
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScanDevice TimerHandler: start..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 152
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/akf;->k(Landroid/content/Context;)Z

    .line 153
    invoke-static {p1}, Lo/akj;->b(Lo/akj;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 154
    invoke-static {p1}, Lo/akj;->e(Lo/akj;)V

    .line 156
    :cond_2
    const/16 v0, 0x3e9

    const-wide/16 v1, 0xbb8

    invoke-virtual {p0, v0, v1, v2}, Lo/akj$a;->sendEmptyMessageDelayed(IJ)Z

    .line 157
    goto :goto_0

    .line 159
    :sswitch_1
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScanDevice TimerHandler: query..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-static {p1}, Lo/akj;->c(Lo/akj;)Lo/aia;

    move-result-object v0

    invoke-static {p1}, Lo/akj;->a(Lo/akj;)Lo/afj;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aia;->e(Lo/afj;)Ljava/util/List;

    move-result-object v4

    .line 163
    invoke-static {p1}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 164
    invoke-static {p1}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    invoke-interface {v0, v4}, Lo/ajn;->onDeviceDiscovered(Ljava/util/List;)V

    .line 166
    :cond_3
    invoke-static {p1}, Lo/akj;->i(Lo/akj;)I

    move-result v0

    if-lez v0, :cond_4

    .line 168
    const/16 v0, 0x3e8

    const-wide/16 v1, 0x3e8

    invoke-virtual {p0, v0, v1, v2}, Lo/akj$a;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 170
    :cond_4
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ScanDevice TimerHandler Finished \uff01\uff01\uff01"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 171
    invoke-static {p1}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 172
    invoke-static {p1}, Lo/akj;->d(Lo/akj;)Lo/ajn;

    move-result-object v0

    invoke-interface {v0}, Lo/ajn;->onDeviceDiscoveryFinished()V

    .line 179
    :cond_5
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 137
    move-object v0, p1

    check-cast v0, Lo/akj;

    invoke-virtual {p0, v0, p2}, Lo/akj$a;->d(Lo/akj;Landroid/os/Message;)V

    return-void
.end method
