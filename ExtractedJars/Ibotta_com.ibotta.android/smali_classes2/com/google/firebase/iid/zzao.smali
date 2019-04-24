.class final Lcom/google/firebase/iid/zzao;
.super Landroid/os/Handler;


# instance fields
.field private final synthetic zzcp:Lcom/google/firebase/iid/zzan;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzan;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/iid/zzao;->zzcp:Lcom/google/firebase/iid/zzan;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/zzao;->zzcp:Lcom/google/firebase/iid/zzan;

    invoke-static {v0, p1}, Lcom/google/firebase/iid/zzan;->zza(Lcom/google/firebase/iid/zzan;Landroid/os/Message;)V

    return-void
.end method
