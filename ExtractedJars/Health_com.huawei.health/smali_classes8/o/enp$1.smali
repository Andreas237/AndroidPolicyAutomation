.class Lo/enp$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/enp;


# direct methods
.method constructor <init>(Lo/enp;Landroid/os/Looper;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/enp$1;->c:Lo/enp;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 81
    const-string v0, "BTAutoScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====msg.what ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 83
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 85
    :pswitch_0
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->a(Lo/enp;)V

    .line 86
    goto/16 :goto_1

    .line 91
    :pswitch_1
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->b(Lo/enp;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->e()V

    .line 92
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/enp$1;->removeMessages(I)V

    .line 95
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->d(Lo/enp;)V

    .line 96
    const-string v0, "BTAutoScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "===123====autoScan List after mBTScanDeviceList = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v3}, Lo/enp;->e(Lo/enp;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->e(Lo/enp;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 98
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->c(Lo/enp;)V

    goto :goto_1

    .line 102
    :pswitch_2
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->b(Lo/enp;)Lo/cxk;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk;->e()V

    .line 103
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/enp$1;->removeMessages(I)V

    .line 105
    goto :goto_1

    .line 107
    :pswitch_3
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    const/16 v1, 0x14

    invoke-static {v0, v1}, Lo/enp;->e(Lo/enp;I)V

    .line 108
    goto :goto_1

    .line 111
    :pswitch_4
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->i(Lo/enp;)V

    .line 113
    iget-object v0, p0, Lo/enp$1;->c:Lo/enp;

    invoke-static {v0}, Lo/enp;->h(Lo/enp;)V

    .line 114
    goto :goto_1

    .line 116
    :goto_0
    :pswitch_5
    const-string v0, "BTAutoScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    :cond_0
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
