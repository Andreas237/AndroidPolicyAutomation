.class public Lcom/usebutton/sdk/internal/models/InternalInstallCard;
.super Lcom/usebutton/sdk/internal/models/BrowserCard;
.source "InternalInstallCard.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/InternalInstallCard;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final appIcon:Landroid/net/Uri;

.field private final body:Lcom/usebutton/sdk/internal/models/Text;

.field private final ctaIcon:Landroid/net/Uri;

.field private final ctaText:Lcom/usebutton/sdk/internal/models/Text;

.field private final primaryAction:Lcom/usebutton/sdk/internal/models/Text;

.field private final primaryColor:I

.field private final secondaryAction:Lcom/usebutton/sdk/internal/models/Text;

.field private final title:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    new-instance v0, Lcom/usebutton/sdk/internal/models/InternalInstallCard$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/InternalInstallCard$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Landroid/net/Uri;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Landroid/net/Uri;)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BrowserCard;-><init>()V

    .line 37
    iput p1, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryColor:I

    .line 38
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 39
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    .line 40
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaIcon:Landroid/net/Uri;

    .line 41
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    .line 42
    iput-object p6, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryAction:Lcom/usebutton/sdk/internal/models/Text;

    .line 43
    iput-object p7, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->secondaryAction:Lcom/usebutton/sdk/internal/models/Text;

    .line 44
    iput-object p8, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->appIcon:Landroid/net/Uri;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BrowserCard;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryColor:I

    .line 49
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 50
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    .line 51
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaIcon:Landroid/net/Uri;

    .line 52
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    .line 53
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryAction:Lcom/usebutton/sdk/internal/models/Text;

    .line 54
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->secondaryAction:Lcom/usebutton/sdk/internal/models/Text;

    .line 55
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->appIcon:Landroid/net/Uri;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;)Lcom/usebutton/sdk/internal/models/InternalInstallCard;
    .locals 10
    .param p0    # Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 71
    new-instance v9, Lcom/usebutton/sdk/internal/models/InternalInstallCard;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->primaryColor:Ljava/lang/String;

    .line 72
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->title:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 73
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->body:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 74
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->ctaIcon:Ljava/lang/String;

    .line 75
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->ctaText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 76
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->primaryAction:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 77
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v6

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->secondaryAction:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 78
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v7

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/InternalInstallCardDTO;->appIconUrl:Ljava/lang/String;

    .line 79
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/usebutton/sdk/internal/models/InternalInstallCard;-><init>(ILcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Landroid/net/Uri;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Landroid/net/Uri;)V

    return-object v9
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppIcon()Landroid/net/Uri;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->appIcon:Landroid/net/Uri;

    return-object v0
.end method

.method public getBody()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getCtaIcon()Landroid/net/Uri;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaIcon:Landroid/net/Uri;

    return-object v0
.end method

.method public getCtaText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPrimaryAction()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryAction:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getPrimaryColor()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    .line 84
    iget v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryColor:I

    return v0
.end method

.method public getSecondaryAction()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->secondaryAction:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 122
    iget v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 125
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaIcon:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 126
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->primaryAction:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 128
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->secondaryAction:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 129
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalInstallCard;->appIcon:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
