.class public final Lcom/google/android/gms/internal/measurement/zzfj;
.super Ljava/lang/Object;


# instance fields
.field private final priority:I

.field private final synthetic zzajl:Lcom/google/android/gms/internal/measurement/zzfh;

.field private final zzajm:Z

.field private final zzajn:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzfh;IZZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajl:Lcom/google/android/gms/internal/measurement/zzfh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/measurement/zzfj;->priority:I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajm:Z

    iput-boolean p4, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajn:Z

    return-void
.end method


# virtual methods
.method public final log(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajl:Lcom/google/android/gms/internal/measurement/zzfh;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzfj;->priority:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajm:Z

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajn:Z

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zza(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzd(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajl:Lcom/google/android/gms/internal/measurement/zzfh;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzfj;->priority:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajm:Z

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajn:Z

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zza(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zze(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajl:Lcom/google/android/gms/internal/measurement/zzfh;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzfj;->priority:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajm:Z

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajn:Z

    const/4 v7, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zza(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzg(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajl:Lcom/google/android/gms/internal/measurement/zzfh;

    iget v1, p0, Lcom/google/android/gms/internal/measurement/zzfj;->priority:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajm:Z

    iget-boolean v3, p0, Lcom/google/android/gms/internal/measurement/zzfj;->zzajn:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzfh;->zza(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
