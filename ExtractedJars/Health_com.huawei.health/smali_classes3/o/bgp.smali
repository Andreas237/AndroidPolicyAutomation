.class public Lo/bgp;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field private b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 23
    iput-object p1, p0, Lo/bgp;->b:Landroid/os/Handler;

    .line 24
    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 3

    .line 29
    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    .line 30
    iget-object v0, p0, Lo/bgp;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 32
    iget-object v0, p0, Lo/bgp;->b:Landroid/os/Handler;

    iget-object v1, p0, Lo/bgp;->b:Landroid/os/Handler;

    const/16 v2, 0x81

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 34
    :cond_0
    return-void
.end method
