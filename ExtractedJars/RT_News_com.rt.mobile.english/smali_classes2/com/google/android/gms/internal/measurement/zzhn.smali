.class final Lcom/google/android/gms/internal/measurement/zzhn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic val$name:Ljava/lang/String;

.field private final synthetic zzanr:Ljava/lang/String;

.field private final synthetic zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

.field private final synthetic zzaoh:Ljava/lang/Object;

.field private final synthetic zzaoi:J


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzanr:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzhn;->val$name:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzaoh:Ljava/lang/Object;

    iput-wide p5, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzaoi:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzaog:Lcom/google/android/gms/internal/measurement/zzhl;

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzanr:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzhn;->val$name:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzaoh:Ljava/lang/Object;

    iget-wide v4, p0, Lcom/google/android/gms/internal/measurement/zzhn;->zzaoi:J

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/measurement/zzhl;->zza(Lcom/google/android/gms/internal/measurement/zzhl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void
.end method
