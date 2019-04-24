.class public Lcom/usebutton/sdk/internal/models/Footer;
.super Lcom/usebutton/sdk/internal/models/TextElement;
.source "Footer.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Footer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mAsset:Lcom/usebutton/sdk/internal/models/Asset;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Lcom/usebutton/sdk/internal/models/Footer$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Footer$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Footer;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p4}, Lcom/usebutton/sdk/internal/models/TextElement;-><init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 28
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/Footer;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 33
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/TextElement;-><init>(Landroid/os/Parcel;)V

    .line 34
    const-class v0, Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Asset;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Footer;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/FooterDTO;)Lcom/usebutton/sdk/internal/models/Footer;
    .locals 4
    .param p0    # Lcom/usebutton/sdk/internal/api/models/FooterDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 68
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Footer;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mBackgroundColor:Ljava/lang/String;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 69
    invoke-static {v2}, Lcom/usebutton/sdk/models/Link;->fromDTO(Lcom/usebutton/sdk/internal/api/models/LinkDTO;)Lcom/usebutton/sdk/models/Link;

    move-result-object v2

    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    invoke-static {v3}, Lcom/usebutton/sdk/internal/models/Asset;->fromDTO(Lcom/usebutton/sdk/internal/api/models/ImageDTO;)Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v3

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 70
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/usebutton/sdk/internal/models/Footer;-><init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/models/Text;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getIcon()Lcom/usebutton/sdk/internal/models/Asset;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Footer;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    return-object v0
.end method

.method public getIconUri()Landroid/net/Uri;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Footer;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 40
    invoke-super {p0, p1, p2}, Lcom/usebutton/sdk/internal/models/TextElement;->writeToParcel(Landroid/os/Parcel;I)V

    .line 41
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Footer;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
