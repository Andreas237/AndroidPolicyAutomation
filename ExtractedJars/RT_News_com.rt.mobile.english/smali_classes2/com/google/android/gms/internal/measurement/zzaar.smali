.class final Lcom/google/android/gms/internal/measurement/zzaar;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/measurement/zzaax;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/measurement/zzaax<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final zzbtu:Lcom/google/android/gms/internal/measurement/zzaan;

.field private final zzbtv:Lcom/google/android/gms/internal/measurement/zzabl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzabl<",
            "**>;"
        }
    .end annotation
.end field

.field private final zzbtw:Z

.field private final zzbtx:Lcom/google/android/gms/internal/measurement/zzzl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/measurement/zzzl<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/measurement/zzabl;Lcom/google/android/gms/internal/measurement/zzzl;Lcom/google/android/gms/internal/measurement/zzaan;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/measurement/zzabl<",
            "**>;",
            "Lcom/google/android/gms/internal/measurement/zzzl<",
            "*>;",
            "Lcom/google/android/gms/internal/measurement/zzaan;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtv:Lcom/google/android/gms/internal/measurement/zzabl;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/zzzl;->zza(Lcom/google/android/gms/internal/measurement/zzaan;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtw:Z

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtx:Lcom/google/android/gms/internal/measurement/zzzl;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtu:Lcom/google/android/gms/internal/measurement/zzaan;

    return-void
.end method

.method static zza(Lcom/google/android/gms/internal/measurement/zzabl;Lcom/google/android/gms/internal/measurement/zzzl;Lcom/google/android/gms/internal/measurement/zzaan;)Lcom/google/android/gms/internal/measurement/zzaar;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/measurement/zzabl<",
            "**>;",
            "Lcom/google/android/gms/internal/measurement/zzzl<",
            "*>;",
            "Lcom/google/android/gms/internal/measurement/zzaan;",
            ")",
            "Lcom/google/android/gms/internal/measurement/zzaar<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzaar;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/measurement/zzaar;-><init>(Lcom/google/android/gms/internal/measurement/zzabl;Lcom/google/android/gms/internal/measurement/zzzl;Lcom/google/android/gms/internal/measurement/zzaan;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtv:Lcom/google/android/gms/internal/measurement/zzabl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzabl;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtv:Lcom/google/android/gms/internal/measurement/zzabl;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/measurement/zzabl;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtw:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtx:Lcom/google/android/gms/internal/measurement/zzzl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzzl;->zzs(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzzo;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtx:Lcom/google/android/gms/internal/measurement/zzzl;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/measurement/zzzl;->zzs(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzzo;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/zzzo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtv:Lcom/google/android/gms/internal/measurement/zzabl;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/zzabl;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtw:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/zzaar;->zzbtx:Lcom/google/android/gms/internal/measurement/zzzl;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/measurement/zzzl;->zzs(Ljava/lang/Object;)Lcom/google/android/gms/internal/measurement/zzzo;

    move-result-object p1

    mul-int/lit8 v0, v0, 0x35

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzzo;->hashCode()I

    move-result p1

    add-int/2addr v0, p1

    :cond_0
    return v0
.end method
