.class public final Lcom/google/android/gms/internal/measurement/zzach;
.super Ljava/lang/Object;


# static fields
.field public static final zzbti:[I

.field private static final zzbxi:I = 0xb

.field private static final zzbxj:I = 0xc

.field private static final zzbxk:I = 0x10

.field private static final zzbxl:I = 0x1a

.field public static final zzbxm:[J

.field private static final zzbxn:[F

.field private static final zzbxo:[D

.field private static final zzbxp:[Z

.field public static final zzbxq:[Ljava/lang/String;

.field private static final zzbxr:[[B

.field public static final zzbxs:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbti:[I

    new-array v1, v0, [J

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbxm:[J

    new-array v1, v0, [F

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbxn:[F

    new-array v1, v0, [D

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbxo:[D

    new-array v1, v0, [Z

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbxp:[Z

    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbxq:[Ljava/lang/String;

    new-array v1, v0, [[B

    sput-object v1, Lcom/google/android/gms/internal/measurement/zzach;->zzbxr:[[B

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/measurement/zzach;->zzbxs:[B

    return-void
.end method

.method public static final zzb(Lcom/google/android/gms/internal/measurement/zzabv;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabv;->getPosition()I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzabv;->zzak(I)Z

    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/zzabv;->zzuw()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/zzabv;->zzak(I)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/internal/measurement/zzabv;->zzd(II)V

    return v1
.end method
