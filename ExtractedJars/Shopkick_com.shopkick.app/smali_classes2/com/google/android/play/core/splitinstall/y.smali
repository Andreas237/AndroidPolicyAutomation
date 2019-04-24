.class final Lcom/google/android/play/core/splitinstall/y;
.super Lcom/google/android/play/core/splitinstall/ab;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/play/core/splitinstall/ab<",
        "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/play/core/tasks/i<",
            "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/splitinstall/ab;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;)V

    return-void
.end method


# virtual methods
.method public final b(ILandroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lcom/google/android/play/core/splitinstall/ab;->b(ILandroid/os/Bundle;)V

    iget-object p1, p0, Lcom/google/android/play/core/splitinstall/y;->a:Lcom/google/android/play/core/tasks/i;

    invoke-static {p2}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a(Landroid/os/Bundle;)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/play/core/tasks/i;->a(Ljava/lang/Object;)Z

    return-void
.end method
