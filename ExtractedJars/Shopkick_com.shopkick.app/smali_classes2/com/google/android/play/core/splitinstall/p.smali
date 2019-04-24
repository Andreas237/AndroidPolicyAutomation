.class final Lcom/google/android/play/core/splitinstall/p;
.super Lcom/google/android/play/core/internal/l;


# instance fields
.field private final synthetic a:Ljava/util/Collection;

.field private final synthetic b:Ljava/util/Collection;

.field private final synthetic c:Lcom/google/android/play/core/tasks/i;

.field private final synthetic d:Lcom/google/android/play/core/splitinstall/n;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;Ljava/util/Collection;Ljava/util/Collection;Lcom/google/android/play/core/tasks/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/p;->d:Lcom/google/android/play/core/splitinstall/n;

    iput-object p3, p0, Lcom/google/android/play/core/splitinstall/p;->a:Ljava/util/Collection;

    iput-object p4, p0, Lcom/google/android/play/core/splitinstall/p;->b:Ljava/util/Collection;

    iput-object p5, p0, Lcom/google/android/play/core/splitinstall/p;->c:Lcom/google/android/play/core/tasks/i;

    invoke-direct {p0, p2}, Lcom/google/android/play/core/internal/l;-><init>(Lcom/google/android/play/core/tasks/i;)V

    return-void
.end method


# virtual methods
.method protected final b()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/p;->a:Ljava/util/Collection;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/n;->a(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/p;->b:Ljava/util/Collection;

    invoke-static {v1}, Lcom/google/android/play/core/splitinstall/n;->b(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :try_start_0
    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/p;->d:Lcom/google/android/play/core/splitinstall/n;

    iget-object v1, v1, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v1}, Lcom/google/android/play/core/internal/m;->b()Landroid/os/IInterface;

    move-result-object v1

    check-cast v1, Lcom/google/android/play/core/internal/av;

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/p;->d:Lcom/google/android/play/core/splitinstall/n;

    invoke-static {v2}, Lcom/google/android/play/core/splitinstall/n;->a(Lcom/google/android/play/core/splitinstall/n;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->b()Landroid/os/Bundle;

    move-result-object v3

    new-instance v4, Lcom/google/android/play/core/splitinstall/aa;

    iget-object v5, p0, Lcom/google/android/play/core/splitinstall/p;->d:Lcom/google/android/play/core/splitinstall/n;

    iget-object v6, p0, Lcom/google/android/play/core/splitinstall/p;->c:Lcom/google/android/play/core/tasks/i;

    invoke-direct {v4, v5, v6}, Lcom/google/android/play/core/splitinstall/aa;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;)V

    invoke-interface {v1, v2, v0, v3, v4}, Lcom/google/android/play/core/internal/av;->a(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Lcom/google/android/play/core/internal/ay;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v1

    const-string/jumbo v2, "startInstall(%s,%s)"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/play/core/splitinstall/p;->a:Ljava/util/Collection;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/google/android/play/core/splitinstall/p;->b:Ljava/util/Collection;

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/p;->c:Lcom/google/android/play/core/tasks/i;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/tasks/i;->a(Ljava/lang/Exception;)Z

    return-void
.end method
