.class public final Lcom/google/android/youtube/player/internal/r$c;
.super Lcom/google/android/youtube/player/internal/r$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/youtube/player/internal/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/youtube/player/internal/r$b<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lcom/google/android/youtube/player/YouTubeInitializationResult;

.field public final c:Landroid/os/IBinder;

.field final synthetic d:Lcom/google/android/youtube/player/internal/r;


# direct methods
.method public constructor <init>(Lcom/google/android/youtube/player/internal/r;Ljava/lang/String;Landroid/os/IBinder;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/google/android/youtube/player/internal/r$b;-><init>(Lcom/google/android/youtube/player/internal/r;Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/google/android/youtube/player/internal/r;->a(Ljava/lang/String;)Lcom/google/android/youtube/player/YouTubeInitializationResult;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->b:Lcom/google/android/youtube/player/YouTubeInitializationResult;

    iput-object p3, p0, Lcom/google/android/youtube/player/internal/r$c;->c:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    sget-object p1, Lcom/google/android/youtube/player/internal/r$1;->a:[I

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/r$c;->b:Lcom/google/android/youtube/player/YouTubeInitializationResult;

    invoke-virtual {v0}, Lcom/google/android/youtube/player/YouTubeInitializationResult;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/r$c;->b:Lcom/google/android/youtube/player/YouTubeInitializationResult;

    invoke-virtual {p1, v0}, Lcom/google/android/youtube/player/internal/r;->a(Lcom/google/android/youtube/player/YouTubeInitializationResult;)V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->c:Landroid/os/IBinder;

    invoke-interface {p1}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    invoke-virtual {v0}, Lcom/google/android/youtube/player/internal/r;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    iget-object v0, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    iget-object v1, p0, Lcom/google/android/youtube/player/internal/r$c;->c:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Lcom/google/android/youtube/player/internal/r;->a(Landroid/os/IBinder;)Landroid/os/IInterface;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/youtube/player/internal/r;->a(Lcom/google/android/youtube/player/internal/r;Landroid/os/IInterface;)Landroid/os/IInterface;

    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    invoke-static {p1}, Lcom/google/android/youtube/player/internal/r;->d(Lcom/google/android/youtube/player/internal/r;)Landroid/os/IInterface;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    invoke-virtual {p1}, Lcom/google/android/youtube/player/internal/r;->g()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_1
    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    invoke-static {p1}, Lcom/google/android/youtube/player/internal/r;->e(Lcom/google/android/youtube/player/internal/r;)V

    iget-object p1, p0, Lcom/google/android/youtube/player/internal/r$c;->d:Lcom/google/android/youtube/player/internal/r;

    sget-object v0, Lcom/google/android/youtube/player/YouTubeInitializationResult;->INTERNAL_ERROR:Lcom/google/android/youtube/player/YouTubeInitializationResult;

    invoke-virtual {p1, v0}, Lcom/google/android/youtube/player/internal/r;->a(Lcom/google/android/youtube/player/YouTubeInitializationResult;)V

    :cond_2
    :goto_0
    return-void
.end method
