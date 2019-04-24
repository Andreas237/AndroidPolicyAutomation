.class final synthetic Lcom/google/firebase/iid/zzab;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbv:Lcom/google/firebase/iid/zzx;

.field private final zzbw:Lcom/google/firebase/iid/zzae;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzx;Lcom/google/firebase/iid/zzae;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzab;->zzbv:Lcom/google/firebase/iid/zzx;

    iput-object p2, p0, Lcom/google/firebase/iid/zzab;->zzbw:Lcom/google/firebase/iid/zzae;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/iid/zzab;->zzbv:Lcom/google/firebase/iid/zzx;

    iget-object v1, p0, Lcom/google/firebase/iid/zzab;->zzbw:Lcom/google/firebase/iid/zzae;

    iget v1, v1, Lcom/google/firebase/iid/zzae;->zzby:I

    invoke-virtual {v0, v1}, Lcom/google/firebase/iid/zzx;->zza(I)V

    return-void
.end method
