.class public final Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# annotations
.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
    creator = "WalletObjectMessageCreator"
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Reserved;
    value = {
        0x1
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/wallet/wobs/WalletObjectMessage$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field zzgz:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x2
    .end annotation
.end field

.field zzha:Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x3
    .end annotation
.end field

.field zzhe:Lcom/google/android/gms/wallet/wobs/TimeInterval;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x4
    .end annotation
.end field

.field zzhf:Lcom/google/android/gms/wallet/wobs/UriData;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x5
    .end annotation
.end field

.field zzhg:Lcom/google/android/gms/wallet/wobs/UriData;
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Field;
        id = 0x6
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wallet/wobs/zzn;

    invoke-direct {v0}, Lcom/google/android/gms/wallet/wobs/zzn;-><init>()V

    sput-object v0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wallet/wobs/TimeInterval;Lcom/google/android/gms/wallet/wobs/UriData;Lcom/google/android/gms/wallet/wobs/UriData;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x2
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x3
        .end annotation
    .end param
    .param p3    # Lcom/google/android/gms/wallet/wobs/TimeInterval;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x4
        .end annotation
    .end param
    .param p4    # Lcom/google/android/gms/wallet/wobs/UriData;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x5
        .end annotation
    .end param
    .param p5    # Lcom/google/android/gms/wallet/wobs/UriData;
        .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Param;
            id = 0x6
        .end annotation
    .end param
    .annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Constructor;
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzgz:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzha:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhe:Lcom/google/android/gms/wallet/wobs/TimeInterval;

    iput-object p4, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhf:Lcom/google/android/gms/wallet/wobs/UriData;

    iput-object p5, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhg:Lcom/google/android/gms/wallet/wobs/UriData;

    return-void
.end method

.method public static newBuilder()Lcom/google/android/gms/wallet/wobs/WalletObjectMessage$Builder;
    .locals 3

    new-instance v0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage$Builder;

    new-instance v1, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;

    invoke-direct {v1}, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;-><init>()V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage$Builder;-><init>(Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;Lcom/google/android/gms/wallet/wobs/zzm;)V

    return-object v0
.end method


# virtual methods
.method public final getActionUri()Lcom/google/android/gms/wallet/wobs/UriData;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhf:Lcom/google/android/gms/wallet/wobs/UriData;

    return-object v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzha:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayInterval()Lcom/google/android/gms/wallet/wobs/TimeInterval;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhe:Lcom/google/android/gms/wallet/wobs/TimeInterval;

    return-object v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzgz:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUri()Lcom/google/android/gms/wallet/wobs/UriData;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhg:Lcom/google/android/gms/wallet/wobs/UriData;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->beginObjectHeader(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzgz:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzha:Ljava/lang/String;

    const/4 v3, 0x3

    invoke-static {p1, v3, v1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeString(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhe:Lcom/google/android/gms/wallet/wobs/TimeInterval;

    const/4 v3, 0x4

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhf:Lcom/google/android/gms/wallet/wobs/UriData;

    const/4 v3, 0x5

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;->zzhg:Lcom/google/android/gms/wallet/wobs/UriData;

    const/4 v3, 0x6

    invoke-static {p1, v3, v1, p2, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->writeParcelable(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->finishObjectHeader(Landroid/os/Parcel;I)V

    return-void
.end method
