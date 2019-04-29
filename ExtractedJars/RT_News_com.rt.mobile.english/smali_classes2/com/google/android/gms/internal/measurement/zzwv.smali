.class final synthetic Lcom/google/android/gms/internal/measurement/zzwv;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzxd;


# instance fields
.field private final zzbny:Lcom/google/android/gms/internal/measurement/zzwu;

.field private final zzbnz:Lcom/google/android/gms/internal/measurement/zzwr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzwu;Lcom/google/android/gms/internal/measurement/zzwr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzwv;->zzbny:Lcom/google/android/gms/internal/measurement/zzwu;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzwv;->zzbnz:Lcom/google/android/gms/internal/measurement/zzwr;

    return-void
.end method


# virtual methods
.method public final zzsl()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzwv;->zzbny:Lcom/google/android/gms/internal/measurement/zzwu;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzwv;->zzbnz:Lcom/google/android/gms/internal/measurement/zzwr;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzwr;->zzsc()Ljava/util/Map;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzwu;->zzbns:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
