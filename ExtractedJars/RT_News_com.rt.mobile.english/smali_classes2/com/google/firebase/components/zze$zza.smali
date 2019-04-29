.class final Lcom/google/firebase/components/zze$zza;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/components/zze;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "zza"
.end annotation


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
            "Lcom/google/firebase/components/zze$zza;",
            ">;"
        }
    .end annotation
.end field

.field private final zzc:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/components/zze$zza;",
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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzb:Ljava/util/Set;

    .line 16
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzc:Ljava/util/Set;

    .line 19
    iput-object p1, p0, Lcom/google/firebase/components/zze$zza;->zza:Lcom/google/firebase/components/Component;

    return-void
.end method


# virtual methods
.method final zza()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/firebase/components/zze$zza;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzb:Ljava/util/Set;

    return-object v0
.end method

.method final zza(Lcom/google/firebase/components/zze$zza;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzb:Ljava/util/Set;

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

    .line 39
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zza:Lcom/google/firebase/components/Component;

    return-object v0
.end method

.method final zzb(Lcom/google/firebase/components/zze$zza;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzc:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final zzc(Lcom/google/firebase/components/zze$zza;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzc:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method final zzc()Z
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzc:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method

.method final zzd()Z
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/google/firebase/components/zze$zza;->zzb:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    return v0
.end method
