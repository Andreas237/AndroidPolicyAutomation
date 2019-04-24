.class public Lcom/usebutton/sdk/internal/models/Preview;
.super Ljava/lang/Object;
.source "Preview.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Preview;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mAsset:Lcom/usebutton/sdk/internal/models/Asset;

.field private final mBackgroundColor:I

.field private final mDeepLinks:Lcom/usebutton/sdk/models/Link;

.field private final mText:Lcom/usebutton/sdk/internal/models/Text;

.field private final mTitle:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 81
    new-instance v0, Lcom/usebutton/sdk/internal/models/Preview$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Preview$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Preview;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput p1, p0, Lcom/usebutton/sdk/internal/models/Preview;->mBackgroundColor:I

    .line 65
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/Preview;->mDeepLinks:Lcom/usebutton/sdk/models/Link;

    .line 66
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/Preview;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    .line 67
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/Preview;->mText:Lcom/usebutton/sdk/internal/models/Text;

    .line 68
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/Preview;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mBackgroundColor:I

    .line 74
    const-class v0, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/models/Link;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mDeepLinks:Lcom/usebutton/sdk/models/Link;

    .line 75
    const-class v0, Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Asset;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    .line 76
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mText:Lcom/usebutton/sdk/internal/models/Text;

    .line 77
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Preview;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/PreviewDTO;)Lcom/usebutton/sdk/internal/models/Preview;
    .locals 7

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 99
    :cond_0
    new-instance v6, Lcom/usebutton/sdk/internal/models/Preview;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mBackgroundColor:Ljava/lang/String;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mDeepLink:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 100
    invoke-static {v0}, Lcom/usebutton/sdk/models/Link;->fromDTO(Lcom/usebutton/sdk/internal/api/models/LinkDTO;)Lcom/usebutton/sdk/models/Link;

    move-result-object v2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 101
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Asset;->fromDTO(Lcom/usebutton/sdk/internal/api/models/ImageDTO;)Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 102
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 103
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/models/Preview;-><init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Asset;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    return-object v6
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 151
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mBackgroundColor:I

    return v0
.end method

.method public getDeepLinks()Lcom/usebutton/sdk/models/Link;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mDeepLinks:Lcom/usebutton/sdk/models/Link;

    return-object v0
.end method

.method public getIcon()Lcom/usebutton/sdk/internal/models/Asset;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    return-object v0
.end method

.method public getIconUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public hasAction()Z
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mDeepLinks:Lcom/usebutton/sdk/models/Link;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 163
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mBackgroundColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 164
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mDeepLinks:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 165
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mAsset:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 166
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 167
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Preview;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
