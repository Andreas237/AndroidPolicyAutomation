.class public abstract Lo/aje;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ajj;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Ljava/lang/Object;>Ljava/lang/Object;Lo/ajj;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ICommBaseCallback"


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

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/aje;->ref:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 5

    .line 19
    iget-object v0, p0, Lo/aje;->ref:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v4

    .line 20
    if-nez v4, :cond_0

    .line 21
    const-string v0, "ICommBaseCallback"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResult: return null == var"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 22
    return-void

    .line 24
    :cond_0
    invoke-virtual {p0, v4, p1, p2, p3}, Lo/aje;->onResult(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;)V

    .line 25
    return-void
.end method

.method public abstract onResult(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;ILjava/lang/String;Ljava/lang/Object;)V"
        }
    .end annotation
.end method
