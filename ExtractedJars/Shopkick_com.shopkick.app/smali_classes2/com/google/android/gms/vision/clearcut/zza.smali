.class final Lcom/google/android/gms/vision/clearcut/zza;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbr:I

.field private final synthetic zzbs:Lcom/google/android/gms/internal/vision/zzdu;

.field private final synthetic zzbt:Lcom/google/android/gms/vision/clearcut/DynamiteClearcutLogger;


# direct methods
.method constructor <init>(Lcom/google/android/gms/vision/clearcut/DynamiteClearcutLogger;ILcom/google/android/gms/internal/vision/zzdu;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/vision/clearcut/zza;->zzbt:Lcom/google/android/gms/vision/clearcut/DynamiteClearcutLogger;

    iput p2, p0, Lcom/google/android/gms/vision/clearcut/zza;->zzbr:I

    iput-object p3, p0, Lcom/google/android/gms/vision/clearcut/zza;->zzbs:Lcom/google/android/gms/internal/vision/zzdu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/vision/clearcut/zza;->zzbt:Lcom/google/android/gms/vision/clearcut/DynamiteClearcutLogger;

    invoke-static {v0}, Lcom/google/android/gms/vision/clearcut/DynamiteClearcutLogger;->zza(Lcom/google/android/gms/vision/clearcut/DynamiteClearcutLogger;)Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/vision/clearcut/zza;->zzbr:I

    iget-object v2, p0, Lcom/google/android/gms/vision/clearcut/zza;->zzbs:Lcom/google/android/gms/internal/vision/zzdu;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/vision/clearcut/VisionClearcutLogger;->zzb(ILcom/google/android/gms/internal/vision/zzdu;)V

    return-void
.end method
