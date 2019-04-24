.class Lo/abu$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private final b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ala;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ala;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/abu$e;->b:Ljava/lang/ref/WeakReference;

    .line 47
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 51
    iget-object v0, p0, Lo/abu$e;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lo/abu$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ala;

    .line 53
    if-eqz v1, :cond_0

    .line 54
    const/4 v0, 0x0

    invoke-interface {v1, v0}, Lo/ala;->b(Landroid/os/Bundle;)V

    .line 57
    :cond_0
    return-void
.end method
