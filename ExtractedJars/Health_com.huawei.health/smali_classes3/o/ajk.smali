.class public abstract Lo/ajk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ajn;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Lo/ajn;"
    }
.end annotation


# instance fields
.field private ref:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    .line 18
    return-void
.end method


# virtual methods
.method public abstract onDeviceDiscovered(Ljava/lang/Object;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Ljava/util/List<Lo/ajd;>;)V"
        }
    .end annotation
.end method

.method public onDeviceDiscovered(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/ajd;>;)V"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 23
    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lo/ajk;->onDeviceDiscovered(Ljava/lang/Object;Ljava/util/List;)V

    .line 25
    :cond_0
    return-void
.end method

.method public onDeviceDiscoveryFinished()V
    .locals 2

    .line 29
    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 30
    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/ajk;->onDeviceDiscoveryFinished(Ljava/lang/Object;)V

    .line 32
    :cond_0
    return-void
.end method

.method public abstract onDeviceDiscoveryFinished(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public onFailure(Ljava/lang/Object;)V
    .locals 2

    .line 36
    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 37
    iget-object v0, p0, Lo/ajk;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lo/ajk;->onFailure(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    :cond_0
    return-void
.end method

.method public abstract onFailure(Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Ljava/lang/Object;)V"
        }
    .end annotation
.end method
