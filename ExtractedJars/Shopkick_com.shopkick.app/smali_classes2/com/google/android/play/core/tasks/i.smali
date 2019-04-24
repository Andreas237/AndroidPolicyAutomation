.class public final Lcom/google/android/play/core/tasks/i;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/play/core/tasks/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/tasks/k<",
            "TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/play/core/tasks/k;

    invoke-direct {v0}, Lcom/google/android/play/core/tasks/k;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/tasks/i;->a:Lcom/google/android/play/core/tasks/k;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/play/core/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/i;->a:Lcom/google/android/play/core/tasks/k;

    return-object v0
.end method

.method public final a(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/tasks/i;->a:Lcom/google/android/play/core/tasks/k;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/tasks/k;->b(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public final a(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/tasks/i;->a:Lcom/google/android/play/core/tasks/k;

    invoke-virtual {v0, p1}, Lcom/google/android/play/core/tasks/k;->b(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
