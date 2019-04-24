.class public final Lcom/microblink/ScanOptions;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/ScanOptions$Builder;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/microblink/ScanOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private countryCode:Ljava/lang/String;

.field private edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

.field private frameCharacteristics:Lcom/microblink/FrameCharacteristics;

.field private logoDetection:Z

.field private merchantConfiguration:Lcom/microblink/MerchantConfiguration;

.field private final retailer:Lcom/microblink/Retailer;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final searchTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/ScanOptions$1;

    invoke-direct {v0}, Lcom/microblink/ScanOptions$1;-><init>()V

    sput-object v0, Lcom/microblink/ScanOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/microblink/Retailer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/Retailer;

    iput-object v0, p0, Lcom/microblink/ScanOptions;->retailer:Lcom/microblink/Retailer;

    sget-object v0, Lcom/microblink/Product;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->searchTargets:Ljava/util/List;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    const-class v0, Lcom/microblink/MerchantConfiguration;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/MerchantConfiguration;

    iput-object v0, p0, Lcom/microblink/ScanOptions;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    const-class v0, Lcom/microblink/FrameCharacteristics;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/FrameCharacteristics;

    iput-object v0, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    const-class v0, Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/microblink/EdgeDetectionConfiguration;

    iput-object v0, p0, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/microblink/ScanOptions;->logoDetection:Z

    return-void
.end method

.method private constructor <init>(Lcom/microblink/ScanOptions$Builder;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$000(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/Retailer;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->retailer:Lcom/microblink/Retailer;

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$100(Lcom/microblink/ScanOptions$Builder;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->searchTargets:Ljava/util/List;

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$200(Lcom/microblink/ScanOptions$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$300(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/MerchantConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$400(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$500(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/EdgeDetectionConfiguration;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-static {p1}, Lcom/microblink/ScanOptions$Builder;->access$600(Lcom/microblink/ScanOptions$Builder;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/microblink/ScanOptions;->logoDetection:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/microblink/ScanOptions$Builder;Lcom/microblink/ScanOptions$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/microblink/ScanOptions;-><init>(Lcom/microblink/ScanOptions$Builder;)V

    return-void
.end method

.method public static newBuilder()Lcom/microblink/ScanOptions$Builder;
    .locals 1

    new-instance v0, Lcom/microblink/ScanOptions$Builder;

    invoke-direct {v0}, Lcom/microblink/ScanOptions$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final countryCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, ""

    iput-object v0, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final detectEdges()Z
    .locals 1

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration()Lcom/microblink/EdgeDetectionConfiguration;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final detectLogo()Z
    .locals 2

    invoke-static {}, Lcom/microblink/ReceiptSdk;->onDeviceOcr()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/microblink/ScanOptions;->logoDetection:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/microblink/ScanOptions;->retailer:Lcom/microblink/Retailer;

    sget-object v1, Lcom/microblink/Retailer;->UNKNOWN:Lcom/microblink/Retailer;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final edgeDetectionConfiguration()Lcom/microblink/EdgeDetectionConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    return-object v0
.end method

.method public final externalStorage()Z
    .locals 1

    invoke-virtual {p0}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/FrameCharacteristics;->externalStorage()Z

    move-result v0

    return v0
.end method

.method public final frameCharacteristics()Lcom/microblink/FrameCharacteristics;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->newBuilder()Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/microblink/FrameCharacteristics$Builder;->build()Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    :cond_0
    iget-object v0, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    return-object v0
.end method

.method public final merchantConfiguration()Lcom/microblink/MerchantConfiguration;
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanOptions;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    return-object v0
.end method

.method public final retailer()Lcom/microblink/Retailer;
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanOptions;->retailer:Lcom/microblink/Retailer;

    return-object v0
.end method

.method public final searchTargets()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/ScanOptions;->searchTargets:Ljava/util/List;

    return-object v0
.end method

.method public final storeFrames()Z
    .locals 2

    invoke-virtual {p0}, Lcom/microblink/ScanOptions;->frameCharacteristics()Lcom/microblink/FrameCharacteristics;

    move-result-object v0

    invoke-static {}, Lcom/microblink/ReceiptSdk;->debug()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lcom/microblink/FrameCharacteristics;->storeFrames()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScanOptions{retailer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/ScanOptions;->retailer:Lcom/microblink/Retailer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", searchTargets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions;->searchTargets:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countryCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", merchantConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameCharacteristics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", edgeDetectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", logoDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/ScanOptions;->logoDetection:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/microblink/ScanOptions;->retailer:Lcom/microblink/Retailer;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanOptions;->searchTargets:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    iget-object v0, p0, Lcom/microblink/ScanOptions;->countryCode:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/microblink/ScanOptions;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanOptions;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/microblink/ScanOptions;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-boolean p2, p0, Lcom/microblink/ScanOptions;->logoDetection:Z

    int-to-byte p2, p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByte(B)V

    return-void
.end method
