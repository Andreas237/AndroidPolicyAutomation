.class final Lcom/google/android/play/core/internal/s;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/google/android/play/core/internal/m;


# direct methods
.method private constructor <init>(Lcom/google/android/play/core/internal/m;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/play/core/internal/m;B)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/play/core/internal/s;-><init>(Lcom/google/android/play/core/internal/m;)V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0}, Lcom/google/android/play/core/internal/m;->b(Lcom/google/android/play/core/internal/m;)Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "ServiceConnectionImpl.onServiceConnected(%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    new-instance v0, Lcom/google/android/play/core/internal/t;

    invoke-direct {v0, p0, p2}, Lcom/google/android/play/core/internal/t;-><init>(Lcom/google/android/play/core/internal/s;Landroid/os/IBinder;)V

    invoke-static {p1, v0}, Lcom/google/android/play/core/internal/m;->b(Lcom/google/android/play/core/internal/m;Lcom/google/android/play/core/internal/l;)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    invoke-static {v0}, Lcom/google/android/play/core/internal/m;->b(Lcom/google/android/play/core/internal/m;)Lcom/google/android/play/core/internal/aa;

    move-result-object v0

    const-string v1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/google/android/play/core/internal/s;->a:Lcom/google/android/play/core/internal/m;

    new-instance v0, Lcom/google/android/play/core/internal/u;

    invoke-direct {v0, p0}, Lcom/google/android/play/core/internal/u;-><init>(Lcom/google/android/play/core/internal/s;)V

    invoke-static {p1, v0}, Lcom/google/android/play/core/internal/m;->b(Lcom/google/android/play/core/internal/m;Lcom/google/android/play/core/internal/l;)V

    return-void
.end method
