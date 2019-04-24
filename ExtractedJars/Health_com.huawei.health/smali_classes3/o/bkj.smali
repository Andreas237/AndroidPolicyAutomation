.class public Lo/bkj;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 22
    iput-object p1, p0, Lo/bkj;->e:Landroid/os/Handler;

    .line 23
    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 3

    .line 28
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 29
    iget-object v0, p0, Lo/bkj;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 30
    const/16 v0, 0x1011

    iput v0, v1, Landroid/os/Message;->what:I

    .line 31
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 33
    iget-object v0, p0, Lo/bkj;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 34
    return-void
.end method
