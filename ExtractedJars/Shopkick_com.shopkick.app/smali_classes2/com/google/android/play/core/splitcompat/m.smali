.class final Lcom/google/android/play/core/splitcompat/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/splitcompat/m;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/splitcompat/m;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/play/core/splitinstall/j;->a(Landroid/content/Context;)Lcom/google/android/play/core/splitinstall/j;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/play/core/splitinstall/j;->a(Z)V

    return-void
.end method
