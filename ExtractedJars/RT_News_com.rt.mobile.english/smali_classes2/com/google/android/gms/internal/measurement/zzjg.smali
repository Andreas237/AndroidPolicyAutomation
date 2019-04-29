.class final Lcom/google/android/gms/internal/measurement/zzjg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzabt:Ljava/lang/Runnable;

.field private final synthetic zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzjd;Lcom/google/android/gms/internal/measurement/zzjs;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzjg;->zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzjg;->zzabt:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjg;->zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlg()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjg;->zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzjg;->zzabt:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/zzjs;->zzg(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzjg;->zzaqc:Lcom/google/android/gms/internal/measurement/zzjs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzjs;->zzlb()V

    return-void
.end method
