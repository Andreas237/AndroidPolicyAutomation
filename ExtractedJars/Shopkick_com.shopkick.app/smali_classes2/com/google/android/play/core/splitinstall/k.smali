.class final Lcom/google/android/play/core/splitinstall/k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:I

.field private final synthetic b:I

.field private final synthetic c:Lcom/google/android/play/core/splitinstall/e;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/e;II)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/k;->c:Lcom/google/android/play/core/splitinstall/e;

    iput p2, p0, Lcom/google/android/play/core/splitinstall/k;->a:I

    iput p3, p0, Lcom/google/android/play/core/splitinstall/k;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/k;->c:Lcom/google/android/play/core/splitinstall/e;

    iget-object v0, v0, Lcom/google/android/play/core/splitinstall/e;->b:Lcom/google/android/play/core/splitinstall/j;

    iget-object v1, p0, Lcom/google/android/play/core/splitinstall/k;->c:Lcom/google/android/play/core/splitinstall/e;

    iget-object v1, v1, Lcom/google/android/play/core/splitinstall/e;->a:Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    iget v2, p0, Lcom/google/android/play/core/splitinstall/k;->a:I

    iget v3, p0, Lcom/google/android/play/core/splitinstall/k;->b:I

    invoke-virtual {v1, v2, v3}, Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;->a(II)Lcom/google/android/play/core/splitinstall/SplitInstallSessionState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/splitinstall/j;->a(Ljava/lang/Object;)V

    return-void
.end method
