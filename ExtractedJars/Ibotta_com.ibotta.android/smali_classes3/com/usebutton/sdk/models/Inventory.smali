.class public Lcom/usebutton/sdk/models/Inventory;
.super Ljava/lang/Object;
.source "Inventory.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mActions:Lcom/usebutton/sdk/models/Link;

.field private mIcon:Lcom/usebutton/sdk/internal/models/Asset;

.field private final mIconText:Lcom/usebutton/sdk/internal/models/Text;

.field private final mPrimary:Lcom/usebutton/sdk/internal/models/Text;

.field private final mSecondary:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 108
    new-instance v0, Lcom/usebutton/sdk/models/Inventory$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/models/Inventory$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/models/Inventory;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const-class v0, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/models/Link;

    iput-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mActions:Lcom/usebutton/sdk/models/Link;

    .line 34
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mPrimary:Lcom/usebutton/sdk/internal/models/Text;

    .line 35
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mSecondary:Lcom/usebutton/sdk/internal/models/Text;

    .line 36
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mIconText:Lcom/usebutton/sdk/internal/models/Text;

    .line 37
    const-class v0, Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Asset;

    iput-object p1, p0, Lcom/usebutton/sdk/models/Inventory;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/usebutton/sdk/models/Inventory;->mActions:Lcom/usebutton/sdk/models/Link;

    .line 43
    iput-object p2, p0, Lcom/usebutton/sdk/models/Inventory;->mPrimary:Lcom/usebutton/sdk/internal/models/Text;

    .line 44
    iput-object p3, p0, Lcom/usebutton/sdk/models/Inventory;->mSecondary:Lcom/usebutton/sdk/internal/models/Text;

    .line 45
    iput-object p4, p0, Lcom/usebutton/sdk/models/Inventory;->mIconText:Lcom/usebutton/sdk/internal/models/Text;

    .line 46
    iput-object p5, p0, Lcom/usebutton/sdk/models/Inventory;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    return-void
.end method

.method private static fromDTO(Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;)Lcom/usebutton/sdk/models/Inventory;
    .locals 7

    .line 136
    new-instance v6, Lcom/usebutton/sdk/models/Inventory;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    .line 137
    invoke-static {v0}, Lcom/usebutton/sdk/models/Link;->fromDTO(Lcom/usebutton/sdk/internal/api/models/LinkDTO;)Lcom/usebutton/sdk/models/Link;

    move-result-object v1

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mTitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 138
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v2

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mSubtitle:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 139
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mIconText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 140
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v4

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;->mIcon:Lcom/usebutton/sdk/internal/api/models/ImageDTO;

    .line 141
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Asset;->fromDTO(Lcom/usebutton/sdk/internal/api/models/ImageDTO;)Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/models/Inventory;-><init>(Lcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Asset;)V

    return-object v6
.end method

.method public static fromDTOs(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/Inventory;",
            ">;"
        }
    .end annotation

    .line 127
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;

    .line 129
    invoke-static {v1}, Lcom/usebutton/sdk/models/Inventory;->fromDTO(Lcom/usebutton/sdk/internal/api/models/GroupDTO$ItemDTO;)Lcom/usebutton/sdk/models/Inventory;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAction()Lcom/usebutton/sdk/models/Link;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mActions:Lcom/usebutton/sdk/models/Link;

    return-object v0
.end method

.method public getIcon()Lcom/usebutton/sdk/internal/models/Asset;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    return-object v0
.end method

.method public getIconText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mIconText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getIconUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 91
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/models/Asset;->getUrl()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPrimary()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mPrimary:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getSecondary()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mSecondary:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public test_setIcon(Lcom/usebutton/sdk/internal/models/Asset;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/usebutton/sdk/models/Inventory;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mActions:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 53
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mPrimary:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 54
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mSecondary:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 55
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mIconText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 56
    iget-object v0, p0, Lcom/usebutton/sdk/models/Inventory;->mIcon:Lcom/usebutton/sdk/internal/models/Asset;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
