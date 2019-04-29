.class final synthetic Lcom/google/firebase/iid/zzaf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbt:Lcom/google/firebase/iid/zzab;

.field private final zzbu:Lcom/google/firebase/iid/zzai;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/zzab;Lcom/google/firebase/iid/zzai;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/zzaf;->zzbt:Lcom/google/firebase/iid/zzab;

    iput-object p2, p0, Lcom/google/firebase/iid/zzaf;->zzbu:Lcom/google/firebase/iid/zzai;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/iid/zzaf;->zzbt:Lcom/google/firebase/iid/zzab;

    iget-object v1, p0, Lcom/google/firebase/iid/zzaf;->zzbu:Lcom/google/firebase/iid/zzai;

    iget v1, v1, Lcom/google/firebase/iid/zzai;->zzbw:I

    invoke-virtual {v0, v1}, Lcom/google/firebase/iid/zzab;->zza(I)V

    return-void
.end method
