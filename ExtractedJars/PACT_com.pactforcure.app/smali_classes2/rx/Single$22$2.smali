.class Lrx/Single$22$2;
.super Lrx/SingleSubscriber;
.source "Single.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrx/Single$22;->call(Lrx/Subscriber;)Lrx/Subscriber;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lrx/SingleSubscriber",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lrx/Single$22;

.field final synthetic val$main:Lrx/Subscriber;


# direct methods
.method constructor <init>(Lrx/Single$22;Lrx/Subscriber;)V
    .locals 0

    .prologue
    .line 2063
    .local p0, "this":Lrx/Single$22$2;, "Lrx/Single$22.2;"
    iput-object p1, p0, Lrx/Single$22$2;->this$1:Lrx/Single$22;

    iput-object p2, p0, Lrx/Single$22$2;->val$main:Lrx/Subscriber;

    invoke-direct {p0}, Lrx/SingleSubscriber;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/Throwable;)V
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    .prologue
    .line 2071
    .local p0, "this":Lrx/Single$22$2;, "Lrx/Single$22.2;"
    iget-object v0, p0, Lrx/Single$22$2;->val$main:Lrx/Subscriber;

    invoke-virtual {v0, p1}, Lrx/Subscriber;->onError(Ljava/lang/Throwable;)V

    .line 2072
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 2066
    .local p0, "this":Lrx/Single$22$2;, "Lrx/Single$22.2;"
    .local p1, "value":Ljava/lang/Object;, "TE;"
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Stream was canceled before emitting a terminal event."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lrx/Single$22$2;->onError(Ljava/lang/Throwable;)V

    .line 2067
    return-void
.end method
