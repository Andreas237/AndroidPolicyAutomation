.class final Lcom/google/android/gms/measurement/internal/zzfb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzacf:Ljava/lang/Runnable;

.field private final synthetic zzasx:Lcom/google/android/gms/measurement/internal/zzfo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzey;Lcom/google/android/gms/measurement/internal/zzfo;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzfb;->zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzfb;->zzacf:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfb;->zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzme()V

    .line 3
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfb;->zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzfb;->zzacf:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzfo;->zzg(Ljava/lang/Runnable;)V

    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzfb;->zzasx:Lcom/google/android/gms/measurement/internal/zzfo;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzfo;->zzlz()V

    return-void
.end method
