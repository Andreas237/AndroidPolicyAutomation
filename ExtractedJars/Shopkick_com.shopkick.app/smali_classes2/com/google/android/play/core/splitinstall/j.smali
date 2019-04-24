.class public final Lcom/google/android/play/core/splitinstall/j;
.super Lcom/google/android/play/core/listener/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/play/core/listener/a<",
        "Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;",
        ">;"
    }
.end annotation


# static fields
.field private static b:Lcom/google/android/play/core/splitinstall/j;


# instance fields
.field private final c:Landroid/os/Handler;

.field private final d:Lcom/google/android/play/core/splitinstall/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lcom/google/android/play/core/splitinstall/d;->a()Lcom/google/android/play/core/splitinstall/f;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/play/core/splitinstall/j;-><init>(Landroid/content/Context;Lcom/google/android/play/core/splitinstall/f;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/splitinstall/f;)V
    .locals 3

    new-instance v0, Lcom/google/android/play/core/internal/aa;

    const-string v1, "SplitInstallListenerRegistry"

    invoke-direct {v0, v1}, Lcom/google/android/play/core/internal/aa;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/play/core/listener/a;-><init>(Lcom/google/android/play/core/internal/aa;Landroid/content/IntentFilter;Landroid/content/Context;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/j;->c:Landroid/os/Handler;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/j;->d:Lcom/google/android/play/core/splitinstall/f;

    return-void
.end method

.method static synthetic a(Lcom/google/android/play/core/splitinstall/j;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/google/android/play/core/splitinstall/j;->c:Landroid/os/Handler;

    return-object p0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/google/android/play/core/splitinstall/j;
    .locals 2

    const-class v0, Lcom/google/android/play/core/splitinstall/j;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/play/core/splitinstall/j;->b:Lcom/google/android/play/core/splitinstall/j;

    if-nez v1, :cond_0

    new-instance v1, Lcom/google/android/play/core/splitinstall/j;

    invoke-direct {v1, p0}, Lcom/google/android/play/core/splitinstall/j;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/google/android/play/core/splitinstall/j;->b:Lcom/google/android/play/core/splitinstall/j;

    :cond_0
    sget-object p0, Lcom/google/android/play/core/splitinstall/j;->b:Lcom/google/android/play/core/splitinstall/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method protected final a(Landroid/content/Intent;)V
    .locals 4

    const-string v0, "session_state"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a(Landroid/os/Bundle;)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/j;->a:Lcom/google/android/play/core/internal/aa;

    const-string v1, "ListenerRegistryBroadcastReceiver.onReceive: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/internal/aa;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    invoke-virtual {p1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->status()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/j;->d:Lcom/google/android/play/core/splitinstall/f;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a:Ljava/util/List;

    new-instance v2, Lcom/google/android/play/core/splitinstall/e;

    invoke-direct {v2, p0, p1}, Lcom/google/android/play/core/splitinstall/e;-><init>(Lcom/google/android/play/core/splitinstall/j;Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/play/core/splitinstall/f;->a(Ljava/util/List;Lcom/google/android/play/core/splitinstall/e;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/play/core/splitinstall/j;->a(Ljava/lang/Object;)V

    return-void
.end method
