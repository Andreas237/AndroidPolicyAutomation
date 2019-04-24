.class public final Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/GiftCardWalletObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field private zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

.field private final synthetic zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/GiftCardWalletObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->zze()Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/GiftCardWalletObject;Lcom/google/android/gms/wallet/zzn;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;-><init>(Lcom/google/android/gms/wallet/GiftCardWalletObject;)V

    return-void
.end method


# virtual methods
.method public final addImageModuleDataMainImageUri(Lcom/google/android/gms/wallet/wobs/UriData;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Lcom/google/android/gms/wallet/wobs/UriData;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addImageModuleDataMainImageUris(Ljava/util/Collection;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/UriData;",
            ">;)",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzd(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addInfoModuleDataLabelValueRow(Lcom/google/android/gms/wallet/wobs/LabelValueRow;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Lcom/google/android/gms/wallet/wobs/LabelValueRow;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addInfoModuleDataLabelValueRows(Ljava/util/Collection;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/LabelValueRow;",
            ">;)",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzc(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addLinksModuleDataUri(Lcom/google/android/gms/wallet/wobs/UriData;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzb(Lcom/google/android/gms/wallet/wobs/UriData;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addLinksModuleDataUris(Ljava/util/Collection;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/UriData;",
            ">;)",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzf(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addLocation(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addLocations(Ljava/util/Collection;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ">;)",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzb(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addMessage(Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addMessages(Ljava/util/Collection;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/WalletObjectMessage;",
            ">;)",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addTextModuleData(Lcom/google/android/gms/wallet/wobs/TextModuleData;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Lcom/google/android/gms/wallet/wobs/TextModuleData;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final addTextModulesData(Ljava/util/Collection;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/wallet/wobs/TextModuleData;",
            ">;)",
            "Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zze(Ljava/util/Collection;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final build()Lcom/google/android/gms/wallet/GiftCardWalletObject;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbk:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Card number is required."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iget-object v1, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzf()Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbj:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbj:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Card name is required."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iget-object v0, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbj:Lcom/google/android/gms/wallet/wobs/CommonWalletObject;

    invoke-virtual {v0}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject;->getIssuerName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Card issuer name is required."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    return-object v0
.end method

.method public final setBalanceCurrencyCode(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbn:Ljava/lang/String;

    return-object p0
.end method

.method public final setBalanceMicros(J)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-wide p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbm:J

    return-object p0
.end method

.method public final setBalanceUpdateTime(J)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-wide p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbo:J

    return-object p0
.end method

.method public final setBarcodeAlternateText(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zze(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setBarcodeLabel(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzh(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setBarcodeType(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzf(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setBarcodeValue(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzg(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setCardIdentifier(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbl:Ljava/lang/String;

    return-object p0
.end method

.method public final setCardNumber(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbk:Ljava/lang/String;

    return-object p0
.end method

.method public final setClassId(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzb(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setEventNumber(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->zzbp:Ljava/lang/String;

    return-object p0
.end method

.method public final setId(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setInfoModuleDataHexBackgroundColor(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzj(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setInfoModuleDataHexFontColor(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzi(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setInfoModuleDataShowLastUpdateTime(Z)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Z)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setIssuerName(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzd(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setPin(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbr:Lcom/google/android/gms/wallet/GiftCardWalletObject;

    iput-object p1, v0, Lcom/google/android/gms/wallet/GiftCardWalletObject;->pin:Ljava/lang/String;

    return-object p0
.end method

.method public final setState(I)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzc(I)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setTitle(Ljava/lang/String;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zzc(Ljava/lang/String;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method

.method public final setValidTimeInterval(Lcom/google/android/gms/wallet/wobs/TimeInterval;)Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/GiftCardWalletObject$Builder;->zzbq:Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;->zza(Lcom/google/android/gms/wallet/wobs/TimeInterval;)Lcom/google/android/gms/wallet/wobs/CommonWalletObject$zza;

    return-object p0
.end method
