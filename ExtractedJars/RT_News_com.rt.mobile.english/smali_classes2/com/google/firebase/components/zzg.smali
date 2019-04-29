.class final synthetic Lcom/google/firebase/components/zzg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zza:Ljava/util/Map$Entry;

.field private final zzb:Lcom/google/firebase/events/Event;


# direct methods
.method constructor <init>(Ljava/util/Map$Entry;Lcom/google/firebase/events/Event;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/components/zzg;->zza:Ljava/util/Map$Entry;

    iput-object p2, p0, Lcom/google/firebase/components/zzg;->zzb:Lcom/google/firebase/events/Event;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zza:Ljava/util/Map$Entry;

    iget-object v1, p0, Lcom/google/firebase/components/zzg;->zzb:Lcom/google/firebase/events/Event;

    invoke-static {v0, v1}, Lcom/google/firebase/components/zzf;->zza(Ljava/util/Map$Entry;Lcom/google/firebase/events/Event;)V

    return-void
.end method
