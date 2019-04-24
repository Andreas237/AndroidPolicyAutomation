.class Lo/ahw$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ahw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic b:Lo/ahw;


# direct methods
.method public constructor <init>(Lo/ahw;Landroid/os/Looper;)V
    .locals 0

    .line 419
    iput-object p1, p0, Lo/ahw$a;->b:Lo/ahw;

    .line 420
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 421
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 424
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 425
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 427
    :sswitch_0
    iget-object v0, p0, Lo/ahw$a;->b:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->g(Lo/ahw;)V

    .line 428
    goto :goto_1

    .line 430
    :sswitch_1
    iget-object v0, p0, Lo/ahw$a;->b:Lo/ahw;

    invoke-static {v0}, Lo/ahw;->h(Lo/ahw;)V

    .line 431
    goto :goto_1

    .line 433
    :sswitch_2
    iget-object v0, p0, Lo/ahw$a;->b:Lo/ahw;

    iget-object v1, p0, Lo/ahw$a;->b:Lo/ahw;

    invoke-static {v1}, Lo/ahw;->i(Lo/ahw;)Lo/cma;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ahw;->c(Lo/ahw;Lo/cma;)V

    .line 434
    goto :goto_1

    .line 436
    :goto_0
    const-string v0, "ClaimWeightDataManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeleteHandler what is error:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 439
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_2
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
    .end sparse-switch
.end method
