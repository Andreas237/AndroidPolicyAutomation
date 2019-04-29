.class final Lcom/google/android/gms/internal/measurement/zzdx;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzadj:J

.field private final synthetic zzadk:Lcom/google/android/gms/internal/measurement/zzdu;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzdu;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzdx;->zzadk:Lcom/google/android/gms/internal/measurement/zzdu;

    iput-wide p2, p0, Lcom/google/android/gms/internal/measurement/zzdx;->zzadj:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzdx;->zzadk:Lcom/google/android/gms/internal/measurement/zzdu;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzdx;->zzadj:J

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzdu;->zza(Lcom/google/android/gms/internal/measurement/zzdu;J)V

    return-void
.end method
