.class final synthetic Lcom/google/firebase/iid/zzac;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final zzbt:Lcom/google/firebase/iid/zzab;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzab;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzac;->zzbt:Lcom/google/firebase/iid/zzab;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/zzac;->zzbt:Lcom/google/firebase/iid/zzab;

    invoke-virtual {v0, p1}, Lcom/google/firebase/iid/zzab;->zza(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
