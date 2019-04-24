.class public Lcom/usebutton/sdk/internal/models/Product;
.super Ljava/lang/Object;
.source "Product.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Product;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mBackgroundColor:I

.field private final mDescription:Lcom/usebutton/sdk/internal/models/Text;

.field private final mImages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation
.end field

.field private final mShouldPadImages:Z

.field private final mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

.field private final mTitle:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Lcom/usebutton/sdk/internal/models/Product$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Product$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Product;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZLcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lcom/usebutton/sdk/internal/models/Text;",
            "Lcom/usebutton/sdk/internal/models/Text;",
            "Lcom/usebutton/sdk/internal/models/Text;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;)V"
        }
    .end annotation

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mImages:Ljava/util/List;

    .line 49
    iput p1, p0, Lcom/usebutton/sdk/internal/models/Product;->mBackgroundColor:I

    .line 50
    iput-boolean p2, p0, Lcom/usebutton/sdk/internal/models/Product;->mShouldPadImages:Z

    .line 51
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/Product;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 52
    iput-object p4, p0, Lcom/usebutton/sdk/internal/models/Product;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 53
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/Product;->mDescription:Lcom/usebutton/sdk/internal/models/Text;

    .line 54
    iget-object p1, p0, Lcom/usebutton/sdk/internal/models/Product;->mImages:Ljava/util/List;

    invoke-interface {p1, p6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mImages:Ljava/util/List;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mBackgroundColor:I

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/usebutton/sdk/internal/models/Product;->mShouldPadImages:Z

    .line 41
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 42
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    .line 43
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mDescription:Lcom/usebutton/sdk/internal/models/Text;

    .line 44
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mImages:Ljava/util/List;

    sget-object v1, Lcom/usebutton/sdk/internal/models/Asset;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readTypedList(Ljava/util/List;Landroid/os/Parcelable$Creator;)V

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;)Lcom/usebutton/sdk/internal/models/Product;
    .locals 8

    .line 59
    new-instance v7, Lcom/usebutton/sdk/internal/models/Product;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->background:Ljava/lang/String;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget-boolean v2, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->padding:Z

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->title:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->subtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 60
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->description:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v5

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->images:Ljava/util/List;

    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Asset;->fromDTOs(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/usebutton/sdk/internal/models/Product;-><init>(IZLcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Ljava/util/List;)V

    return-object v7
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mBackgroundColor:I

    return v0
.end method

.method public getDescription()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 101
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mDescription:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mImages:Ljava/util/List;

    return-object v0
.end method

.method public getSubtitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getTitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public shouldPadImages()Z
    .locals 1

    .line 89
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mShouldPadImages:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 66
    iget v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mBackgroundColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 67
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mShouldPadImages:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mTitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 69
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Product;->mDescription:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 71
    iget-object p2, p0, Lcom/usebutton/sdk/internal/models/Product;->mImages:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
