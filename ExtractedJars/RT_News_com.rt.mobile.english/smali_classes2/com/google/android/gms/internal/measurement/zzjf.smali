.class final synthetic Lcom/google/android/gms/internal/measurement/zzjf;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzabs:Landroid/app/job/JobParameters;

.field private final zzapy:Lcom/google/android/gms/internal/measurement/zzjd;

.field private final zzaqb:Lcom/google/android/gms/internal/measurement/zzfh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjd;Lcom/google/android/gms/internal/measurement/zzfh;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzjf;->zzapy:Lcom/google/android/gms/internal/measurement/zzjd;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjf;->zzaqb:Lcom/google/android/gms/internal/measurement/zzfh;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjf;->zzabs:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjf;->zzapy:Lcom/google/android/gms/internal/measurement/zzjd;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjf;->zzaqb:Lcom/google/android/gms/internal/measurement/zzfh;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzjf;->zzabs:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzjd;->zza(Lcom/google/android/gms/internal/measurement/zzfh;Landroid/app/job/JobParameters;)V

    return-void
.end method
