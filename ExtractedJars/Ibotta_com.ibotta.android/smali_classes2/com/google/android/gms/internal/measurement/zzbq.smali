.class public final enum Lcom/google/android/gms/internal/measurement/zzbq;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/measurement/zzbq;",
        ">;"
    }
.end annotation


# static fields
.field private static final enum zzxv:Lcom/google/android/gms/internal/measurement/zzbq;

.field public static final enum zzxw:Lcom/google/android/gms/internal/measurement/zzbq;

.field private static final synthetic zzxx:[Lcom/google/android/gms/internal/measurement/zzbq;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbq;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/measurement/zzbq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbq;->zzxv:Lcom/google/android/gms/internal/measurement/zzbq;

    new-instance v0, Lcom/google/android/gms/internal/measurement/zzbq;

    const-string v1, "GZIP"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/google/android/gms/internal/measurement/zzbq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbq;->zzxw:Lcom/google/android/gms/internal/measurement/zzbq;

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/android/gms/internal/measurement/zzbq;

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbq;->zzxv:Lcom/google/android/gms/internal/measurement/zzbq;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/android/gms/internal/measurement/zzbq;->zzxw:Lcom/google/android/gms/internal/measurement/zzbq;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzbq;->zzxx:[Lcom/google/android/gms/internal/measurement/zzbq;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/zzbq;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/zzbq;->zzxx:[Lcom/google/android/gms/internal/measurement/zzbq;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/zzbq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/zzbq;

    return-object v0
.end method

.method public static zzaa(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzbq;
    .locals 1

    const-string v0, "GZIP"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbq;->zzxw:Lcom/google/android/gms/internal/measurement/zzbq;

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/measurement/zzbq;->zzxv:Lcom/google/android/gms/internal/measurement/zzbq;

    return-object p0
.end method
