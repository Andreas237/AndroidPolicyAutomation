.class Lcom/google/android/play/core/splitinstall/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/play/core/internal/q;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/play/core/internal/q;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/play/core/splitinstall/n;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/splitinstall/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/splitinstall/b;->a:Lcom/google/android/play/core/splitinstall/n;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/play/core/splitinstall/b;->a:Lcom/google/android/play/core/splitinstall/n;

    invoke-virtual {v0}, Lcom/google/android/play/core/splitinstall/n;->d()V

    return-void
.end method
