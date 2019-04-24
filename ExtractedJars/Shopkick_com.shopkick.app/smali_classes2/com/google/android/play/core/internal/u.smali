.class final Lcom/google/android/play/core/internal/u;
.super Lcom/google/android/play/core/internal/l;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/internal/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/s;

    invoke-direct {p0}, Lcom/google/android/play/core/internal/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/s;

    iget-object v0, v0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0}, Lcom/google/android/play/core/internal/m;->h(Lcom/google/android/play/core/internal/m;)V

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/s;

    iget-object v0, v0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/m;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object v0, p0, Lcom/google/android/play/core/internal/u;->a:Lcom/google/android/play/core/internal/s;

    iget-object v0, v0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/core/internal/m;->a(Lcom/google/android/play/core/internal/m;Z)Z

    return-void
.end method
