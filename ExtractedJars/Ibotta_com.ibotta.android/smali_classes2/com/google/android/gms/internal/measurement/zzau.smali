.class final Lcom/google/android/gms/internal/measurement/zzau;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field private final synthetic zzwe:Lcom/google/android/gms/internal/measurement/zzat;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzat;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzau;->zzwe:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzau;->zzwe:Lcom/google/android/gms/internal/measurement/zzat;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzat;->zzcj()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "Job execution failed"

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
