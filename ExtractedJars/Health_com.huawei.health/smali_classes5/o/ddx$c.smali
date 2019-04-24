.class Lo/ddx$c;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ddx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo/ddx;


# direct methods
.method public constructor <init>(Lo/ddx;Landroid/os/Looper;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lo/ddx$c;->a:Lo/ddx;

    .line 213
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 214
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 218
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 219
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 223
    :pswitch_0
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 224
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->a(Lo/ddx;)Landroid/os/HandlerThread;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 225
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;Landroid/os/HandlerThread;)Landroid/os/HandlerThread;

    .line 226
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->b(Lo/ddx;Lo/ddx$c;)Lo/ddx$c;

    .line 228
    :cond_0
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WAIT_CRC_CHECK_TIMEOUT, set crc result 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 230
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lo/yc;->b(Ljava/lang/String;I)V

    .line 232
    :cond_1
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;I)I

    .line 233
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->c(Lo/ddx;Z)Z

    .line 234
    goto/16 :goto_0

    .line 237
    :pswitch_1
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wait dfu respond timeout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 238
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->b(Lo/ddx;Z)Z

    .line 239
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->e(Lo/ddx;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 240
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->e(Lo/ddx;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 242
    :cond_2
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->b(Lo/ddx;)Lo/ddi;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 243
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->b(Lo/ddx;)Lo/ddi;

    move-result-object v0

    const-string v1, "\u6ca1\u6709\u56de\u590dACK"

    const v2, 0x19645

    invoke-interface {v0, v2, v1}, Lo/ddi;->a(ILjava/lang/String;)V

    .line 245
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;Lo/ddi;)Lo/ddi;

    .line 246
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddx;->d(Lo/ddx;Lo/dds;)Lo/dds;

    goto :goto_0

    .line 251
    :pswitch_2
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 252
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Wait V2 OTA upgrade timeout!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wait time out !!!"

    const/4 v3, 0x1

    invoke-interface {v0, v1, v3, v2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 254
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ddx;->e(Lo/ddx;Z)Z

    goto :goto_0

    .line 259
    :pswitch_3
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 260
    const-string v0, "OTATransferFile"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "B0 OTA upgrade timeout!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    iget-object v0, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v0}, Lo/ddx;->c(Lo/ddx;)Lo/yc;

    move-result-object v0

    iget-object v1, p0, Lo/ddx$c;->a:Lo/ddx;

    invoke-static {v1}, Lo/ddx;->d(Lo/ddx;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "wait time out !!!"

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, Lo/yc;->b(Ljava/lang/String;ILjava/lang/String;)V

    .line 267
    :cond_3
    :goto_0
    :pswitch_4
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
