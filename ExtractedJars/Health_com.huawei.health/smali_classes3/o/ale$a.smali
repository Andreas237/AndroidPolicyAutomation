.class Lo/ale$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ale;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/ale;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/ale;)V
    .locals 1

    .line 1191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1192
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/ale$a;->c:Ljava/lang/ref/WeakReference;

    .line 1193
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1197
    iget-object v0, p0, Lo/ale$a;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ale;

    .line 1198
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 1199
    invoke-static {v1}, Lo/ale;->c(Lo/ale;)V

    .line 1201
    :cond_0
    return-void
.end method
