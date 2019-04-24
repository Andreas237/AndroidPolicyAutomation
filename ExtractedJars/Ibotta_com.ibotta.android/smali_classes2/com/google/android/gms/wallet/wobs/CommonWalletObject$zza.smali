.class public final Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "zza"
.end annotation


# instance fields
.field private final synthetic zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/wobs/CommonWalletObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/wobs/CommonWalletObject;Lcom/google/android/gms/wallet/wobs/zza;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;-><init>(Lcom/google/android/gms/wallet/wobs/CommonWalletObject;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcq:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/wallet/wobs/LabelValueRow;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzct:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/wallet/wobs/TextModuleData;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcw:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/wallet/wobs/TimeInterval;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcp:Lcom/google/android/gms/wallet/wobs/TimeInterval;

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/wallet/wobs/UriData;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcv:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final zza(Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzco:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final zza(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzce:Ljava/lang/String;

    return-object p0
.end method

.method public final zza(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;",
            ">;)",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzco:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final zza(Z)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcu:Z

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/wallet/wobs/UriData;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcx:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final zzb(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcn:Ljava/lang/String;

    return-object p0
.end method

.method public final zzb(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcq:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final zzc(I)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->state:I

    return-object p0
.end method

.method public final zzc(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final zzc(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/LabelValueRow;",
            ">;)",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzct:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final zzd(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcg:Ljava/lang/String;

    return-object p0
.end method

.method public final zzd(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/UriData;",
            ">;)",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcv:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final zze(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcj:Ljava/lang/String;

    return-object p0
.end method

.method public final zze(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/TextModuleData;",
            ">;)",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcw:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final zzf(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzck:Ljava/lang/String;

    return-object p0
.end method

.method public final zzf(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/UriData;",
            ">;)",
            "Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcx:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final zzf()Lcom/google/android/gms/wallet/wobs/CommonWalletObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    return-object v0
.end method

.method public final zzg(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcl:Ljava/lang/String;

    return-object p0
.end method

.method public final zzh(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcm:Ljava/lang/String;

    return-object p0
.end method

.method public final zzi(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcr:Ljava/lang/String;

    return-object p0
.end method

.method public final zzj(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzgm:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zzcs:Ljava/lang/String;

    return-object p0
.end method
