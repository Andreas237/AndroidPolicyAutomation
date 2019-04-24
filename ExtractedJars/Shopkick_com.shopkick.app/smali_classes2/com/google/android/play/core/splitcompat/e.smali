.class final Lcom/google/android/play/core/splitcompat/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/splitcompat/i;


# instance fields
.field final synthetic a:Ljava/util/Set;

.field final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final synthetic c:Lcom/google/android/play/core/splitcompat/p;

.field private final synthetic d:Lcom/google/android/play/core/splitcompat/d;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitcompat/d;Lcom/google/android/play/core/splitcompat/p;Ljava/util/Set;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitcompat/e;->d:Lcom/google/android/play/core/splitcompat/d;

    iput-object p2, p0, Lcom/google/android/play/core/splitcompat/e;->c:Lcom/google/android/play/core/splitcompat/p;

    iput-object p3, p0, Lcom/google/android/play/core/splitcompat/e;->a:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/android/play/core/splitcompat/e;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/zip/ZipFile;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/zip/ZipFile;",
            "Ljava/util/Set<",
            "Lcom/google/android/play/core/splitcompat/k;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/play/core/splitcompat/e;->d:Lcom/google/android/play/core/splitcompat/d;

    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/e;->c:Lcom/google/android/play/core/splitcompat/p;

    new-instance v1, Lcom/google/android/play/core/splitcompat/f;

    invoke-direct {v1, p0}, Lcom/google/android/play/core/splitcompat/f;-><init>(Lcom/google/android/play/core/splitcompat/e;)V

    invoke-static {p1, v0, p2, v1}, Lcom/google/android/play/core/splitcompat/d;->a(Lcom/google/android/play/core/splitcompat/d;Lcom/google/android/play/core/splitcompat/p;Ljava/util/Set;Lcom/google/android/play/core/splitcompat/j;)V

    return-void
.end method
