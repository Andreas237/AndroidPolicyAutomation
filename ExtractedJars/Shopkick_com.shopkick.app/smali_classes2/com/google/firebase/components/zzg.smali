.class final Lcom/google/firebase/components/zzg;
.super Ljava/lang/Object;
.source "com.google.firebase:firebase-common@@16.0.2"


# instance fields
.field private final zza:Lcom/google/firebase/components/Component;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/components/Component<",
            "*>;"
        }
    .end annotation
.end field

.field private final zzb:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/components/zzg;",
            ">;"
        }
    .end annotation
.end field

.field private final zzc:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/components/zzg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/firebase/components/Component;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/components/Component<",
            "*>;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/components/zzg;->zzb:Ljava/util/Set;

    .line 30
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/components/zzg;->zzc:Ljava/util/Set;

    .line 33
    iput-object p1, p0, Lcom/google/firebase/components/zzg;->zza:Lcom/google/firebase/components/Component;

    return-void
.end method


# virtual methods
.method final zza()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/firebase/components/zzg;",
            ">;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zzb:Ljava/util/Set;

    return-object v0
.end method

.method final zza(Lcom/google/firebase/components/zzg;)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zzb:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final zzb()Lcom/google/firebase/components/Component;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/firebase/components/Component<",
            "*>;"
        }
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zza:Lcom/google/firebase/components/Component;

    return-object v0
.end method

.method final zzb(Lcom/google/firebase/components/zzg;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zzc:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final zzc(Lcom/google/firebase/components/zzg;)V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zzc:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method final zzc()Z
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zzc:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method final zzd()Z
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/google/firebase/components/zzg;->zzb:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method
