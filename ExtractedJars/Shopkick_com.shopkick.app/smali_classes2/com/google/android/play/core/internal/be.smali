.class final Lcom/google/android/play/core/internal/be;
.super Lcom/google/android/play/core/internal/bb;


# instance fields
.field private final a:Lcom/google/android/play/core/internal/bc;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/play/core/internal/bb;-><init>()V

    new-instance v0, Lcom/google/android/play/core/internal/bc;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/bc;-><init>()V

    iput-object v0, p0, Lcom/google/android/play/core/internal/be;->a:Lcom/google/android/play/core/internal/bc;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-eq p2, p1, :cond_1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/internal/be;->a:Lcom/google/android/play/core/internal/bc;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/play/core/internal/bc;->a(Ljava/lang/Throwable;Z)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "The suppressed exception cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Self suppression is not allowed."

    invoke-direct {p1, v0, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method
