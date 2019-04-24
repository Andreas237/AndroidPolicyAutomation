.class final Lcom/google/android/play/core/splitinstall/x;
.super Lcom/google/android/play/core/splitinstall/ab;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/play/core/splitinstall/ab<",
        "Ljava/lang/Void;",
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
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/android/play/core/splitinstall/ab;-><init>(Lcom/google/android/play/core/splitinstall/n;Lcom/google/android/play/core/tasks/i;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/google/android/play/core/splitinstall/ab;->b(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/google/android/play/core/splitinstall/x;->a:Lcom/google/android/play/core/tasks/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/play/core/tasks/i;->a(Ljava/lang/Object;)Z

    return-void
.end method
