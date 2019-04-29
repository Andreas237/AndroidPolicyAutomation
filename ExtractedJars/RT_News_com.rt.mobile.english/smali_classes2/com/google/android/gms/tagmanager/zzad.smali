.class final Lcom/google/android/gms/tagmanager/zzad;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/tagmanager/zzdh;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tagmanager/zzdh<",
        "Lcom/google/android/gms/internal/measurement/zzvz;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzaww:Lcom/google/android/gms/tagmanager/zzy;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/tagmanager/zzy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/zzad;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/tagmanager/zzz;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/tagmanager/zzad;-><init>(Lcom/google/android/gms/tagmanager/zzy;)V

    return-void
.end method


# virtual methods
.method public final synthetic onSuccess(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/measurement/zzvz;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmj:Lcom/google/android/gms/internal/measurement/zzl;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/zzl;-><init>()V

    iput-object v0, v1, Lcom/google/android/gms/internal/measurement/zzl;->zzpv:Lcom/google/android/gms/internal/measurement/zzi;

    const/4 v2, 0x0

    iput-object v2, v1, Lcom/google/android/gms/internal/measurement/zzl;->zzpu:[Lcom/google/android/gms/internal/measurement/zzk;

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzi;->version:Ljava/lang/String;

    iput-object v0, v1, Lcom/google/android/gms/internal/measurement/zzl;->zzpw:Ljava/lang/String;

    move-object v0, v1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/tagmanager/zzad;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    iget-wide v2, p1, Lcom/google/android/gms/internal/measurement/zzvz;->zzbmi:J

    const/4 p1, 0x1

    invoke-static {v1, v0, v2, v3, p1}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;Lcom/google/android/gms/internal/measurement/zzl;JZ)V

    return-void
.end method

.method public final zzmr()V
    .locals 0

    return-void
.end method

.method public final zzq(I)V
    .locals 2

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzad;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    invoke-static {p1}, Lcom/google/android/gms/tagmanager/zzy;->zze(Lcom/google/android/gms/tagmanager/zzy;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/tagmanager/zzad;->zzaww:Lcom/google/android/gms/tagmanager/zzy;

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/tagmanager/zzy;->zza(Lcom/google/android/gms/tagmanager/zzy;J)V

    :cond_0
    return-void
.end method
