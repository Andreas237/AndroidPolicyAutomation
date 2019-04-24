.class Lo/alo$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alo;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/alo;


# direct methods
.method constructor <init>(Lo/alo;Landroid/os/Looper;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/alo$4;->d:Lo/alo;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 54
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 55
    if-eqz p1, :cond_0

    .line 56
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 58
    :sswitch_0
    iget-object v0, p0, Lo/alo$4;->d:Lo/alo;

    invoke-static {v0}, Lo/alo;->c(Lo/alo;)Lcom/huawei/health/manager/DaemonService;

    move-result-object v0

    invoke-static {v0}, Lo/alm;->e(Landroid/content/Context;)Lo/alm;

    move-result-object v0

    iget-object v1, p0, Lo/alo$4;->d:Lo/alo;

    invoke-static {v1}, Lo/alo;->a(Lo/alo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/alm;->d(Ljava/lang/String;)Z

    .line 59
    iget-object v0, p0, Lo/alo$4;->d:Lo/alo;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/alo;->a(Lo/alo;Z)Z

    .line 60
    .line 65
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
