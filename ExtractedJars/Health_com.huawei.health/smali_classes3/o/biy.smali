.class public Lo/biy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field private c:Ljava/lang/String;

.field private d:Landroid/os/Handler;

.field private e:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;)V
    .locals 1

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biy;->d:Landroid/os/Handler;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biy;->c:Ljava/lang/String;

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/biy;->e:Z

    .line 68
    iput-object p1, p0, Lo/biy;->d:Landroid/os/Handler;

    .line 69
    iput-object p2, p0, Lo/biy;->c:Ljava/lang/String;

    .line 70
    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 23
    invoke-virtual {p0, p1}, Lo/biy;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Z)V
    .locals 1

    .line 55
    iput-boolean p1, p0, Lo/biy;->e:Z

    .line 57
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 58
    return-void
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 75
    new-instance v3, Lo/bjf;

    invoke-direct {v3}, Lo/bjf;-><init>()V

    .line 76
    iget-object v0, p0, Lo/biy;->c:Ljava/lang/String;

    iget-boolean v1, p0, Lo/biy;->e:Z

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v2, v1}, Lo/bjf;->a(Ljava/lang/String;IZ)Ljava/util/ArrayList;

    move-result-object v4

    .line 77
    iget-object v0, p0, Lo/biy;->d:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 78
    const/4 v0, 0x4

    iput v0, v5, Landroid/os/Message;->what:I

    .line 79
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 80
    const-string v0, "keySearchFriendList"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 81
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 82
    iget-object v0, p0, Lo/biy;->d:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 83
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
