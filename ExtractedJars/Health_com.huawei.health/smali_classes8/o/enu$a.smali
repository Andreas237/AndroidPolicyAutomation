.class Lo/enu$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/enu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lo/enu;


# direct methods
.method public constructor <init>(Lo/enu;Landroid/os/Looper;)V
    .locals 0

    .line 715
    iput-object p1, p0, Lo/enu$a;->c:Lo/enu;

    .line 716
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 717
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 720
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 721
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UpdateHandler receive msg:"

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

    .line 722
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 725
    :sswitch_0
    iget-object v0, p0, Lo/enu$a;->c:Lo/enu;

    invoke-static {v0}, Lo/enu;->h(Lo/enu;)V

    .line 726
    iget-object v0, p0, Lo/enu$a;->c:Lo/enu;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/enu;->d(Ljava/lang/Boolean;)V

    .line 727
    iget-object v0, p0, Lo/enu$a;->c:Lo/enu;

    invoke-static {v0}, Lo/enu;->e(Lo/enu;)Lo/djw$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 728
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileRespond,null != mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 730
    :try_start_0
    iget-object v0, p0, Lo/enu$a;->c:Lo/enu;

    invoke-static {v0}, Lo/enu;->e(Lo/enu;)Lo/djw$d;

    move-result-object v0

    iget-object v1, p0, Lo/enu$a;->c:Lo/enu;

    invoke-static {v1}, Lo/enu;->f(Lo/enu;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/djw$d;->e(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 733
    goto :goto_0

    .line 731
    :catch_0
    move-exception v4

    .line 732
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "e:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    goto :goto_0

    .line 735
    :cond_0
    const-string v0, "AW70_AW70UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onFileRespond,null == mOTACallBack"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 738
    :goto_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    .line 739
    new-instance v0, Lo/enu$a$5;

    invoke-direct {v0, p0}, Lo/enu$a$5;-><init>(Lo/enu$a;)V

    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 745
    invoke-static {}, Lo/dpa;->c()Lo/dpa;

    move-result-object v0

    invoke-virtual {v0}, Lo/dpa;->h()V

    .line 746
    iget-object v0, p0, Lo/enu$a;->c:Lo/enu;

    const/4 v1, 0x0

    iput v1, v0, Lo/enu;->c:I

    .line 747
    .line 751
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_0
        0x14 -> :sswitch_0
    .end sparse-switch
.end method
