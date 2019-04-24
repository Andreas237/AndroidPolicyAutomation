.class public Lo/bkm;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 21
    iput-object p1, p0, Lo/bkm;->e:Landroid/os/Handler;

    .line 22
    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 2

    .line 27
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 28
    iget-object v0, p0, Lo/bkm;->e:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    .line 29
    const/16 v0, 0x1021

    iput v0, v1, Landroid/os/Message;->what:I

    .line 30
    iget-object v0, p0, Lo/bkm;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 31
    return-void
.end method
