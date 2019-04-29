.class final Lcom/google/android/gms/internal/measurement/zzid;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$name:Ljava/lang/String;

.field private final synthetic zzanr:Ljava/lang/String;

.field private final synthetic zzant:Ljava/lang/String;

.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final synthetic zzaoi:J

.field private final synthetic zzaoo:Landroid/os/Bundle;

.field private final synthetic zzaop:Z

.field private final synthetic zzaoq:Z

.field private final synthetic zzaor:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzanr:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzid;->val$name:Ljava/lang/String;

    iput-wide p4, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaoi:J

    iput-object p6, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaoo:Landroid/os/Bundle;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaop:Z

    iput-boolean p8, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaoq:Z

    iput-boolean p9, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaor:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzant:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzanr:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzid;->val$name:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaoi:J

    iget-object v5, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaoo:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaop:Z

    iget-boolean v7, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaoq:Z

    iget-boolean v8, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzaor:Z

    iget-object v9, p0, Lcom/google/android/gms/internal/measurement/zzid;->zzant:Ljava/lang/String;

    invoke-static/range {v0 .. v9}, Lcom/google/android/gms/internal/measurement/zzhl;->zza(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;ZZZLjava/lang/String;)V

    return-void
.end method
