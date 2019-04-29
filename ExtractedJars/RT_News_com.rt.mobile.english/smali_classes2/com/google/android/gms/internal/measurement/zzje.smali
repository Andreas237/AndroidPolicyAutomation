.class final synthetic Lcom/google/android/gms/internal/measurement/zzje;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzabp:I

.field private final zzapy:Lcom/google/android/gms/internal/measurement/zzjd;

.field private final zzapz:Lcom/google/android/gms/internal/measurement/zzfh;

.field private final zzaqa:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjd;ILcom/google/android/gms/internal/measurement/zzfh;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzapy:Lcom/google/android/gms/internal/measurement/zzjd;

    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzabp:I

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzapz:Lcom/google/android/gms/internal/measurement/zzfh;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzaqa:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzapy:Lcom/google/android/gms/internal/measurement/zzjd;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzabp:I

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzapz:Lcom/google/android/gms/internal/measurement/zzfh;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzje;->zzaqa:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/measurement/zzjd;->zza(ILcom/google/android/gms/internal/measurement/zzfh;Landroid/content/Intent;)V

    return-void
.end method
