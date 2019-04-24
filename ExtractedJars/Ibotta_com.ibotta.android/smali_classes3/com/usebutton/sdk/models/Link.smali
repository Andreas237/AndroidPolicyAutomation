.class public Lcom/usebutton/sdk/models/Link;
.super Ljava/lang/Object;
.source "Link.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mAppLink:Landroid/net/Uri;

.field private final mBrowserLink:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Lcom/usebutton/sdk/models/Link$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/models/Link$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/models/Link;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/usebutton/sdk/models/Link;->mAppLink:Landroid/net/Uri;

    .line 33
    iput-object p2, p0, Lcom/usebutton/sdk/models/Link;->mBrowserLink:Landroid/net/Uri;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/usebutton/sdk/models/Link;->mAppLink:Landroid/net/Uri;

    .line 38
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    iput-object p1, p0, Lcom/usebutton/sdk/models/Link;->mBrowserLink:Landroid/net/Uri;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/LinkDTO;)Lcom/usebutton/sdk/models/Link;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/models/Link;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->appLink:Landroid/net/Uri;

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/LinkDTO;->browserLink:Landroid/net/Uri;

    invoke-direct {v0, v1, p0}, Lcom/usebutton/sdk/models/Link;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    return-object v0
.end method

.method public static withAppLink(Landroid/net/Uri;)Lcom/usebutton/sdk/models/Link;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 20
    :cond_0
    new-instance v1, Lcom/usebutton/sdk/models/Link;

    invoke-direct {v1, p0, v0}, Lcom/usebutton/sdk/models/Link;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    return-object v1
.end method

.method public static withBrowserLink(Landroid/net/Uri;)Lcom/usebutton/sdk/models/Link;
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 28
    :cond_0
    new-instance v1, Lcom/usebutton/sdk/models/Link;

    invoke-direct {v1, v0, p0}, Lcom/usebutton/sdk/models/Link;-><init>(Landroid/net/Uri;Landroid/net/Uri;)V

    return-object v1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppLink()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/usebutton/sdk/models/Link;->mAppLink:Landroid/net/Uri;

    return-object v0
.end method

.method public getBrowserLink()Landroid/net/Uri;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/usebutton/sdk/models/Link;->mBrowserLink:Landroid/net/Uri;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Link{mAppLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/models/Link;->mAppLink:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mBrowserLink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/models/Link;->mBrowserLink:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/usebutton/sdk/models/Link;->mAppLink:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 68
    iget-object v0, p0, Lcom/usebutton/sdk/models/Link;->mBrowserLink:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
