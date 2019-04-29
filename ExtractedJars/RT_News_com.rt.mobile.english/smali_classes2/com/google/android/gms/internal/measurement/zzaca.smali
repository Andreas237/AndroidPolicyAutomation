.class public abstract Lcom/google/android/gms/internal/measurement/zzaca;
.super Lcom/google/android/gms/internal/measurement/zzacg;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/measurement/zzaca<",
        "TM;>;>",
        "Lcom/google/android/gms/internal/measurement/zzacg;"
    }
.end annotation


# instance fields
.field protected zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/zzacg;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/internal/measurement/zzacg;->zzvo()Lcom/google/android/gms/internal/measurement/zzacg;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaca;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/zzace;->zza(Lcom/google/android/gms/internal/measurement/zzaca;Lcom/google/android/gms/internal/measurement/zzaca;)V

    return-object v0
.end method

.method protected zza()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzacc;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/measurement/zzacc;->zzau(I)Lcom/google/android/gms/internal/measurement/zzacd;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzacd;->zza()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :cond_1
    return v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzacb;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/measurement/zzacb<",
            "TM;TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    iget v2, p1, Lcom/google/android/gms/internal/measurement/zzacb;->tag:I

    ushr-int/lit8 v2, v2, 0x3

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/zzacc;->zzat(I)Lcom/google/android/gms/internal/measurement/zzacd;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzacd;->zzb(Lcom/google/android/gms/internal/measurement/zzacb;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public zza(Lcom/google/android/gms/internal/measurement/zzaby;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzacc;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/zzacc;->zzau(I)Lcom/google/android/gms/internal/measurement/zzacd;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/zzacd;->zza(Lcom/google/android/gms/internal/measurement/zzaby;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected final zza(Lcom/google/android/gms/internal/measurement/zzabx;I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzak(I)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    ushr-int/lit8 v1, p2, 0x3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzabx;->getPosition()I

    move-result v2

    sub-int/2addr v2, v0

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/measurement/zzabx;->zzc(II)[B

    move-result-object p1

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaci;

    invoke-direct {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/zzaci;-><init>(I[B)V

    const/4 p1, 0x0

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    if-nez p2, :cond_1

    new-instance p2, Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-direct {p2}, Lcom/google/android/gms/internal/measurement/zzacc;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/zzacc;->zzat(I)Lcom/google/android/gms/internal/measurement/zzacd;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/measurement/zzacd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/zzacd;-><init>()V

    iget-object p2, p0, Lcom/google/android/gms/internal/measurement/zzaca;->zzbxg:Lcom/google/android/gms/internal/measurement/zzacc;

    invoke-virtual {p2, v1, p1}, Lcom/google/android/gms/internal/measurement/zzacc;->zza(ILcom/google/android/gms/internal/measurement/zzacd;)V

    :cond_2
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/zzacd;->zza(Lcom/google/android/gms/internal/measurement/zzaci;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic zzvo()Lcom/google/android/gms/internal/measurement/zzacg;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzacg;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzaca;

    return-object v0
.end method
