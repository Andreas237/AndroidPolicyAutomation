.class final Lcom/google/android/gms/tagmanager/zzfr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzfq;


# instance fields
.field private handler:Landroid/os/Handler;

.field final synthetic zzbcn:Lcom/google/android/gms/tagmanager/zzfn;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/zzfn;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfr;->zzbcn:Lcom/google/android/gms/tagmanager/zzfn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/os/Handler;

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->zzbcn:Lcom/google/android/gms/tagmanager/zzfn;

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzfn;->zza(Lcom/google/android/gms/tagmanager/zzfn;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/tagmanager/zzfs;

    invoke-direct {v1, p0}, Lcom/google/android/gms/tagmanager/zzfs;-><init>(Lcom/google/android/gms/tagmanager/zzfr;)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/zzfn;Lcom/google/android/gms/tagmanager/zzfo;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzfr;-><init>(Lcom/google/android/gms/tagmanager/zzfn;)V

    return-void
.end method

.method private final obtainMessage()Landroid/os/Message;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzfn;->zzoz()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzfn;->zzoz()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    return-void
.end method

.method public final zzh(J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzfn;->zzoz()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzfr;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final zzpa()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    invoke-static {}, Lcom/google/android/gms/tagmanager/zzfn;->zzoz()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/zzfr;->handler:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/zzfr;->obtainMessage()Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
