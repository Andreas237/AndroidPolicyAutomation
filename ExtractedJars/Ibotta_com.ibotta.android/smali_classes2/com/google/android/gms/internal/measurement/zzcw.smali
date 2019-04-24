.class final synthetic Lcom/google/android/gms/internal/measurement/zzcw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzabo:Lcom/google/android/gms/internal/measurement/zzcu;

.field private final zzabr:Lcom/google/android/gms/internal/measurement/zzcm;

.field private final zzabs:Landroid/app/job/JobParameters;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzcu;Lcom/google/android/gms/internal/measurement/zzcm;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcw;->zzabo:Lcom/google/android/gms/internal/measurement/zzcu;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzcw;->zzabr:Lcom/google/android/gms/internal/measurement/zzcm;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzcw;->zzabs:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcw;->zzabo:Lcom/google/android/gms/internal/measurement/zzcu;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzcw;->zzabr:Lcom/google/android/gms/internal/measurement/zzcm;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzcw;->zzabs:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzcu;->zza(Lcom/google/android/gms/internal/measurement/zzcm;Landroid/app/job/JobParameters;)V

    return-void
.end method
