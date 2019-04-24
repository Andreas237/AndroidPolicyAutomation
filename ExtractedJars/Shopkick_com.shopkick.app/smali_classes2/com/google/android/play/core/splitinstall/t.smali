.class final Lcom/google/android/play/core/splitinstall/t;
.super Lcom/google/android/play/core/internal/l;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/tasks/i;

.field private final synthetic b:Lcom/google/android/play/core/splitinstall/n;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;Lcom/google/android/play/core/tasks/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/t;->b:Lcom/google/android/play/core/splitinstall/n;

    iput-object p3, p0, Lcom/google/android/play/core/splitinstall/t;->a:Lcom/google/android/play/core/tasks/i;

    invoke-direct {p0, p2}, Lcom/google/android/play/core/internal/l;-><init>(Lcom/google/android/play/core/tasks/i;)V

    return-void
.end method


# virtual methods
.method protected final b()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/t;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->b()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/play/core/internal/av;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/t;->b:Lcom/google/android/play/core/splitinstall/n;

    invoke-static {v1}, Lcom/google/android/play/core/splitinstall/n;->a(Lcom/google/android/play/core/splitinstall/n;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/android/play/core/splitinstall/z;

    iget-object v3, p0, Lcom/google/android/play/core/splitinstall/t;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v4, p0, Lcom/google/android/play/core/splitinstall/t;->a:Lcom/google/android/play/core/tasks/i;

    invoke-direct {v2, v3, v4}, Lcom/google/android/play/core/splitinstall/z;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/play/core/internal/av;->a(Ljava/lang/String;Lcom/google/android/play/core/internal/ay;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v1

    const-string v2, "getSessionStates"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/t;->a:Lcom/google/android/play/core/tasks/i;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/google/android/play/core/tasks/i;->a(Ljava/lang/Exception;)Z

    return-void
.end method
