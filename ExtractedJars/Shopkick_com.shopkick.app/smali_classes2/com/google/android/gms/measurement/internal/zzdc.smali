.class final Lcom/google/android/gms/measurement/internal/zzdc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$name:Ljava/lang/String;

.field private final synthetic zzads:Ljava/lang/String;

.field private final synthetic zzaer:Z

.field private final synthetic zzagj:Ljava/lang/String;

.field private final synthetic zzare:Lcom/google/android/gms/measurement/internal/zzda;

.field private final synthetic zzarf:J

.field private final synthetic zzarg:Landroid/os/Bundle;

.field private final synthetic zzarh:Z

.field private final synthetic zzari:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/zzda;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzads:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/zzdc;->val$name:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzarf:J

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzarg:Landroid/os/Bundle;

    iput-boolean p7, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzaer:Z

    iput-boolean p8, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzarh:Z

    iput-boolean p9, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzari:Z

    iput-object p10, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzagj:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzare:Lcom/google/android/gms/measurement/internal/zzda;

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzads:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzdc;->val$name:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzarf:J

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzarg:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzaer:Z

    iget-boolean v7, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzarh:Z

    iget-boolean v8, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzari:Z

    iget-object v9, p0, Lcom/google/android/gms/measurement/internal/zzdc;->zzagj:Ljava/lang/String;

    invoke-static/range {v0 .. v9}, Lcom/google/android/gms/measurement/internal/zzda;->zza(Lcom/google/android/gms/measurement/internal/zzda;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method
