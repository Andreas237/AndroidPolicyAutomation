.class final Lcom/google/android/play/core/internal/am;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/internal/z;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/ClassLoader;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Set<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/play/core/internal/aj;

    invoke-direct {v0}, Lcom/google/android/play/core/internal/aj;-><init>()V

    invoke-static {p1, p2, v0}, Lcom/google/android/play/core/internal/ah;->a(Ljava/lang/ClassLoader;Ljava/util/Set;Lcom/google/android/play/core/internal/ak;)V

    return-void
.end method

.method public final a(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
    .locals 1

    const-string/jumbo v0, "zip"

    invoke-static {p1, p2, p3, p4, v0}, Lcom/google/android/play/core/internal/ah;->a(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;ZLjava/lang/String;)Z

    move-result p1

    return p1
.end method
