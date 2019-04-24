.class final synthetic Lcom/google/android/gms/measurement/internal/zzfa;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzace:Landroid/app/job/JobParameters;

.field private final zzast:Lcom/google/android/gms/measurement/internal/zzey;

.field private final zzasw:Lcom/google/android/gms/measurement/internal/zzas;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzey;Lcom/google/android/gms/measurement/internal/zzas;Landroid/app/job/JobParameters;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzast:Lcom/google/android/gms/measurement/internal/zzey;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzasw:Lcom/google/android/gms/measurement/internal/zzas;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzace:Landroid/app/job/JobParameters;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzast:Lcom/google/android/gms/measurement/internal/zzey;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzasw:Lcom/google/android/gms/measurement/internal/zzas;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzfa;->zzace:Landroid/app/job/JobParameters;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/zzey;->zza(Lcom/google/android/gms/measurement/internal/zzas;Landroid/app/job/JobParameters;)V

    return-void
.end method
