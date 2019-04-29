.class final Lcom/google/android/gms/internal/measurement/zzcp;
.super Ljava/lang/Object;


# instance fields
.field private zzabc:I

.field private zzabd:Ljava/io/ByteArrayOutputStream;

.field private final synthetic zzabe:Lcom/google/android/gms/internal/measurement/zzco;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/zzco;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabe:Lcom/google/android/gms/internal/measurement/zzco;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    return-void
.end method


# virtual methods
.method public final getPayload()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public final zze(Lcom/google/android/gms/internal/measurement/zzch;)Z
    .locals 5

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabc:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdy()I

    move-result v2

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    return v3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabe:Lcom/google/android/gms/internal/measurement/zzco;

    invoke-virtual {v0, p1, v3}, Lcom/google/android/gms/internal/measurement/zzco;->zza(Lcom/google/android/gms/internal/measurement/zzch;Z)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabe:Lcom/google/android/gms/internal/measurement/zzco;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    const-string v2, "Error formatting hit"

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/measurement/zzcm;->zza(Lcom/google/android/gms/internal/measurement/zzch;Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v2, v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzbu;->zzdu()I

    move-result v4

    if-le v2, v4, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabe:Lcom/google/android/gms/internal/measurement/zzco;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzaq;->zzbu()Lcom/google/android/gms/internal/measurement/zzcm;

    move-result-object v0

    const-string v2, "Hit size exceeds the maximum size limit"

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/internal/measurement/zzcm;->zza(Lcom/google/android/gms/internal/measurement/zzch;Ljava/lang/String;)V

    return v1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    if-lez p1, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    add-int/2addr p1, v2

    sget-object v2, Lcom/google/android/gms/internal/measurement/zzcc;->zzzk:Lcom/google/android/gms/internal/measurement/zzcd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzcd;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-le p1, v2, :cond_4

    return v3

    :cond_4
    :try_start_0
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzco;->zzez()[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    :cond_5
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabd:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabc:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabc:I

    return v1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabe:Lcom/google/android/gms/internal/measurement/zzco;

    const-string v2, "Failed to write payload when batching hits"

    invoke-virtual {v0, v2, p1}, Lcom/google/android/gms/internal/measurement/zzaq;->zze(Ljava/lang/String;Ljava/lang/Object;)V

    return v1
.end method

.method public final zzfa()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/zzcp;->zzabc:I

    return v0
.end method
