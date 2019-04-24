.class final Lcom/google/android/play/core/internal/x;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Ljava/util/List;

.field private final synthetic b:Lcom/google/android/play/core/splitinstall/e;

.field private final synthetic c:Lcom/google/android/play/core/internal/w;


# direct methods
.method constructor <init>(Lcom/google/android/play/core/internal/w;Ljava/util/List;Lcom/google/android/play/core/splitinstall/e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/core/internal/x;->c:Lcom/google/android/play/core/internal/w;

    iput-object p2, p0, Lcom/google/android/play/core/internal/x;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    const/4 v0, 0x6

    :try_start_0
    const-string v1, "SplitCompat"

    const-string v2, "Copying splits."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/google/android/play/core/internal/x;->c:Lcom/google/android/play/core/internal/w;

    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->a:Ljava/util/List;

    invoke-static {v1, v2}, Lcom/google/android/play/core/internal/w;->a(Lcom/google/android/play/core/internal/w;Ljava/util/List;)V

    const-string v1, "SplitCompat"

    const-string v2, "Splits copied."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/16 v1, -0xb

    :try_start_1
    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->c:Lcom/google/android/play/core/internal/w;

    invoke-static {v2}, Lcom/google/android/play/core/internal/w;->a(Lcom/google/android/play/core/internal/w;)Lcom/google/android/play/core/internal/y;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/play/core/internal/y;->a()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-nez v2, :cond_0

    const-string v2, "SplitCompat"

    const-string v3, "Split verification failed."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/play/core/splitinstall/e;->a(II)V

    return-void

    :cond_0
    const-string v1, "SplitCompat"

    const-string v2, "Splits verified."

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v1, -0xc

    :try_start_2
    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->c:Lcom/google/android/play/core/internal/w;

    invoke-static {v2}, Lcom/google/android/play/core/internal/w;->b(Lcom/google/android/play/core/internal/w;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/play/core/splitcompat/SplitCompat;->a(Landroid/content/Context;)Z

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-nez v2, :cond_1

    const-string v2, "SplitCompat"

    const-string v3, "Emulating splits failed."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/play/core/splitinstall/e;->a(II)V

    return-void

    :cond_1
    const-string v0, "SplitCompat"

    const-string v1, "Splits installed."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/play/core/splitinstall/e;->a(II)V

    return-void

    :catch_0
    move-exception v2

    const-string v3, "SplitCompat"

    const-string v4, "Error emulating splits."

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/play/core/splitinstall/e;->a(II)V

    return-void

    :catch_1
    move-exception v2

    const-string v3, "SplitCompat"

    const-string v4, "Error verifying splits."

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v2, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    invoke-virtual {v2, v0, v1}, Lcom/google/android/play/core/splitinstall/e;->a(II)V

    return-void

    :catch_2
    move-exception v1

    const-string v2, "SplitCompat"

    const-string v3, "Error copying splits."

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v1, p0, Lcom/google/android/play/core/internal/x;->b:Lcom/google/android/play/core/splitinstall/e;

    const/16 v2, -0xd

    invoke-virtual {v1, v0, v2}, Lcom/google/android/play/core/splitinstall/e;->a(II)V

    return-void
.end method
