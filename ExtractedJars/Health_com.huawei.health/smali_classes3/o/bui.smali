.class public abstract Lo/bui;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract b(ILjava/lang/String;)V
.end method

.method public c(JJ)V
    .locals 0

    .line 33
    return-void
.end method

.method public c(Landroid/os/Handler;ILjava/lang/String;)V
    .locals 1

    .line 65
    new-instance v0, Lo/bui$3;

    invoke-direct {v0, p0, p2, p3}, Lo/bui$3;-><init>(Lo/bui;ILjava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 71
    return-void
.end method

.method public d(Landroid/os/Handler;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/os/Handler;TT;)V"
        }
    .end annotation

    .line 49
    new-instance v0, Lo/bui$5;

    invoke-direct {v0, p0, p2}, Lo/bui$5;-><init>(Lo/bui;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    return-void
.end method

.method public abstract d(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public e()Z
    .locals 1

    .line 39
    const/4 v0, 0x0

    return v0
.end method
