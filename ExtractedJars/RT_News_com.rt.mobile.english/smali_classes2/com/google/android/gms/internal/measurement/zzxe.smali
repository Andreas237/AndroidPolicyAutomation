.class public final Lcom/google/android/gms/internal/measurement/zzxe;
.super Ljava/lang/Object;


# instance fields
.field private final zzboc:Ljava/lang/String;

.field private final zzbod:Landroid/net/Uri;

.field private final zzboe:Ljava/lang/String;

.field private final zzbof:Ljava/lang/String;

.field private final zzbog:Z

.field private final zzboh:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;)V
    .locals 7

    const-string v3, ""

    const-string v4, ""

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/measurement/zzxe;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzboc:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzbod:Landroid/net/Uri;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzboe:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzbof:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzbog:Z

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzboh:Z

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/measurement/zzxe;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzbod:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/measurement/zzxe;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzboe:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/measurement/zzxe;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/zzxe;->zzbof:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final zzb(Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "D)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzwu;->zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;D)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p1

    return-object p1
.end method

.method public final zzd(Ljava/lang/String;I)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwu;->zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;I)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p1

    return-object p1
.end method

.method public final zze(Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/measurement/zzwu;->zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;J)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p1

    return-object p1
.end method

.method public final zzf(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwu;->zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p1

    return-object p1
.end method

.method public final zzv(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwu;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/measurement/zzwu<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzwu;->zzb(Lcom/google/android/gms/internal/measurement/zzxe;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzwu;

    move-result-object p1

    return-object p1
.end method
