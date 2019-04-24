.class final Lcom/google/android/gms/measurement/internal/zzfh;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzafg:J

.field private final synthetic zzatd:Lcom/google/android/gms/measurement/internal/zzfd;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzfd;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfh;->zzatd:Lcom/google/android/gms/measurement/internal/zzfd;

    iput-wide p2, p0, Lcom/google/android/gms/measurement/internal/zzfh;->zzafg:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfh;->zzatd:Lcom/google/android/gms/measurement/internal/zzfd;

    iget-wide v1, p0, Lcom/google/android/gms/measurement/internal/zzfh;->zzafg:J

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzfd;->zza(Lcom/google/android/gms/measurement/internal/zzfd;J)V

    return-void
.end method
