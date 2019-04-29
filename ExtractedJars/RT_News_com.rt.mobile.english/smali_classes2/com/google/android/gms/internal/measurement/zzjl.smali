.class final Lcom/google/android/gms/internal/measurement/zzjl;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzadj:J

.field private final synthetic zzaqg:Lcom/google/android/gms/internal/measurement/zzji;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzji;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjl;->zzaqg:Lcom/google/android/gms/internal/measurement/zzji;

    iput-wide p2, p0, Lcom/google/android/gms/internal/measurement/zzjl;->zzadj:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjl;->zzaqg:Lcom/google/android/gms/internal/measurement/zzji;

    iget-wide v1, p0, Lcom/google/android/gms/internal/measurement/zzjl;->zzadj:J

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzji;->zza(Lcom/google/android/gms/internal/measurement/zzji;J)V

    return-void
.end method
