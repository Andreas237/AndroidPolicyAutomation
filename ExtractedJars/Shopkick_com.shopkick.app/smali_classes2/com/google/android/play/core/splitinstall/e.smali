.class public Lcom/google/android/play/core/splitinstall/e;
.super Ljava/lang/Object;


# instance fields
.field final synthetic a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

.field final synthetic b:Lcom/google/android/play/core/splitinstall/j;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/j;Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/e;->b:Lcom/google/android/play/core/splitinstall/j;

    iput-object p2, p0, Lcom/google/android/play/core/splitinstall/e;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/e;->b:Lcom/google/android/play/core/splitinstall/j;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/j;->a(Lcom/google/android/play/core/splitinstall/j;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/splitinstall/k;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/play/core/splitinstall/k;-><init>(Lcom/google/android/play/core/splitinstall/e;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
