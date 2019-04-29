.class final Lcom/google/android/gms/internal/measurement/zzdw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzadi:Ljava/lang/String;

.field private final synthetic zzadj:J

.field private final synthetic zzadk:Lcom/google/android/gms/internal/measurement/zzdu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzdu;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdw;->zzadk:Lcom/google/android/gms/internal/measurement/zzdu;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzdw;->zzadi:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/measurement/zzdw;->zzadj:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdw;->zzadk:Lcom/google/android/gms/internal/measurement/zzdu;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzdw;->zzadi:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/measurement/zzdw;->zzadj:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzdu;->zzb(Lcom/google/android/gms/internal/measurement/zzdu;Ljava/lang/String;J)V

    return-void
.end method
