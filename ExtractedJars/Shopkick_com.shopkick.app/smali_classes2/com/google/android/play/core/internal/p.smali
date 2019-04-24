.class final Lcom/google/android/play/core/internal/p;
.super Lcom/google/android/play/core/internal/l;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/internal/m;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/internal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-direct {p0}, Lcom/google/android/play/core/internal/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/m;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0}, Lcom/google/android/play/core/internal/m;->b(Lcom/google/android/play/core/internal/m;)Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "Unbind from service."

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0}, Lcom/google/android/play/core/internal/m;->d(Lcom/google/android/play/core/internal/m;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v1}, Lcom/google/android/play/core/internal/m;->c(Lcom/google/android/play/core/internal/m;)Landroid/content/ServiceConnection;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0, v2}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/m;Z)Z

    iget-object v0, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/m;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/play/core/internal/p;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/m;Landroid/content/ServiceConnection;)Landroid/content/ServiceConnection;

    :cond_0
    return-void
.end method
