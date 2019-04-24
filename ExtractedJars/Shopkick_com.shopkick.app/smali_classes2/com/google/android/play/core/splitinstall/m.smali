.class final Lcom/google/android/play/core/splitinstall/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/play/core/splitinstall/SplitInstallRequest;

.field private final synthetic b:Lcom/google/android/play/core/splitinstall/l;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/l;Lcom/google/android/play/core/splitinstall/SplitInstallRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/m;->b:Lcom/google/android/play/core/splitinstall/l;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/m;->a:Lcom/google/android/play/core/splitinstall/SplitInstallRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/m;->b:Lcom/google/android/play/core/splitinstall/l;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/l;->a(Lcom/google/android/play/core/splitinstall/l;)Lcom/google/android/play/core/splitinstall/j;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/m;->a:Lcom/google/android/play/core/splitinstall/SplitInstallRequest;

    invoke-virtual {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->getModuleNames()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/play/core/splitinstall/m;->a:Lcom/google/android/play/core/splitinstall/SplitInstallRequest;

    invoke-virtual {v2}, Lcom/google/android/play/core/splitinstall/SplitInstallRequest;->a()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/play/core/splitinstall/l;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/play/core/internal/at;->a(Ljava/util/List;Ljava/util/List;)Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a(Landroid/os/Bundle;)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/splitinstall/j;->a(Ljava/lang/Object;)V

    return-void
.end method
