.class Lcom/google/android/play/core/splitinstall/ab;
.super Lcom/google/android/play/core/internal/az;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/play/core/internal/az;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/android/play/core/tasks/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/play/core/tasks/i<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final synthetic b:Lcom/google/android/play/core/splitinstall/n;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/tasks/i<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    invoke-direct {p0}, Lcom/google/android/play/core/internal/az;-><init>()V

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/ab;->a:Lcom/google/android/play/core/tasks/i;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "onDeferredLanguageUninstall"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final a(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "onCompleteInstall(%d)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public a(ILandroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p2, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object p2, p2, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {p2}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object p2

    const-string v0, "onCancelInstall(%d)"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p2, v0, v1}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object p1, p1, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {p1}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object p1

    const-string v0, "onDeferredInstall"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object p1, p1, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {p1}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object p1

    const-string v0, "onGetSessionStates"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final b()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "onDeferredLanguageInstall"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public b(ILandroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p2, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object p2, p2, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {p2}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object p2

    const-string v0, "onGetSession(%d)"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p2, v0, v1}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object p1, p1, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {p1}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object p1

    const-string v0, "onDeferredUninstall"

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final c()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "onCompleteInstallForAppUpdate"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public c(ILandroid/os/Bundle;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object p2, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object p2, p2, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {p2}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object p2

    const-string v0, "onStartInstall(%d)"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p2, v0, v1}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public final c(Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->a()V

    const-string v0, "error_code"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "onError(%d)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->a:Lcom/google/android/play/core/tasks/i;

    new-instance v1, Lcom/google/android/play/core/splitinstall/SplitInstallException;

    invoke-direct {v1, p1}, Lcom/google/android/play/core/splitinstall/SplitInstallException;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/tasks/i;->a(Ljava/lang/Exception;)Z

    return-void
.end method

.method public final d()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/ab;->b:Lcom/google/android/play/core/splitinstall/n;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/n;->a:Lcom/google/android/play/core/internal/m;

    invoke-virtual {v0}, Lcom/google/android/play/core/internal/m;->a()V

    invoke-static {}, Lcom/google/android/play/core/splitinstall/n;->c()Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "onGetSplitsForAppUpdate"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
