.class public abstract Lo/ajf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ajm;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Lo/ajm;"
    }
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
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

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ajf;->b:Ljava/lang/ref/WeakReference;

    .line 15
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Object;I)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Ljava/lang/Object;)V"
        }
    .end annotation
.end method

.method public onFailure(I)V
    .locals 5

    .line 28
    iget-object v0, p0, Lo/ajf;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    .line 29
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 30
    const-string v0, "BaseCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onFailure: return null == obj"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 31
    return-void

    .line 33
    :cond_0
    invoke-virtual {p0, v4, p1}, Lo/ajf;->a(Ljava/lang/Object;I)V

    .line 34
    return-void
.end method

.method public onStatus(I)V
    .locals 5

    .line 38
    iget-object v0, p0, Lo/ajf;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    .line 39
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 40
    const-string v0, "BaseCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onStatus: return null == obj"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 41
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0, v4, p1}, Lo/ajf;->b(Ljava/lang/Object;I)V

    .line 44
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 5

    .line 18
    iget-object v0, p0, Lo/ajf;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    .line 19
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 20
    const-string v0, "BaseCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onSuccess: return null == obj"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 21
    return-void

    .line 23
    :cond_0
    invoke-virtual {p0, v4, p1}, Lo/ajf;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    return-void
.end method
