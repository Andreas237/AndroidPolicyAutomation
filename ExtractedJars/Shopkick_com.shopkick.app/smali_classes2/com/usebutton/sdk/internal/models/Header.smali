.class public Lcom/usebutton/sdk/internal/models/Header;
.super Lcom/usebutton/sdk/internal/models/TextElement;
.source "Header.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/Header;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mSubtitle:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    new-instance v0, Lcom/usebutton/sdk/internal/models/Header$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/Header$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/Header;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 1

    const/4 v0, 0x0

    .line 19
    invoke-direct {p0, p1, v0, p2}, Lcom/usebutton/sdk/internal/models/TextElement;-><init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Text;)V

    .line 20
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/Header;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 25
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/models/TextElement;-><init>(Landroid/os/Parcel;)V

    .line 26
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/Header;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/HeaderDTO;)Lcom/usebutton/sdk/internal/models/Header;
    .locals 3
    .param p0    # Lcom/usebutton/sdk/internal/api/models/HeaderDTO;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 47
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/models/Header;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->mBackgroundColor:Ljava/lang/String;

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 48
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/HeaderDTO;->mSubtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 49
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/usebutton/sdk/internal/models/Header;-><init>(ILcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getSubtitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Header;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 61
    invoke-super {p0, p1, p2}, Lcom/usebutton/sdk/internal/models/TextElement;->writeToParcel(Landroid/os/Parcel;I)V

    .line 62
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/Header;->mSubtitle:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
