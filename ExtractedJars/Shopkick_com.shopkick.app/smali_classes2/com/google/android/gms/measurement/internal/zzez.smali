.class final synthetic Lcom/google/android/gms/measurement/internal/zzez;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzacb:I

.field private final zzast:Lcom/google/android/gms/measurement/internal/zzey;

.field private final zzasu:Lcom/google/android/gms/measurement/internal/zzas;

.field private final zzasv:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzey;ILcom/google/android/gms/measurement/internal/zzas;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzast:Lcom/google/android/gms/measurement/internal/zzey;

    iput p2, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzacb:I

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzasu:Lcom/google/android/gms/measurement/internal/zzas;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzasv:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzast:Lcom/google/android/gms/measurement/internal/zzey;

    iget v1, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzacb:I

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzasu:Lcom/google/android/gms/measurement/internal/zzas;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/zzez;->zzasv:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/measurement/internal/zzey;->zza(ILcom/google/android/gms/measurement/internal/zzas;Landroid/content/Intent;)V

    return-void
.end method
