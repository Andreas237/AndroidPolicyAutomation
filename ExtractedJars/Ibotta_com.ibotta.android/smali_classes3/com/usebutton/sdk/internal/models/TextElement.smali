.class public Lcom/usebutton/sdk/internal/models/TextElement;
.super Ljava/lang/Object;
.source "TextElement.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/TextElement;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final mAction:Lcom/usebutton/sdk/models/Link;

.field private final mBackgroundColor:I

.field private final mText:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Lcom/usebutton/sdk/internal/models/TextElement$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/TextElement$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/TextElement;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILcom/usebutton/sdk/models/Link;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput p1, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mBackgroundColor:I

    .line 61
    iput-object p2, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mAction:Lcom/usebutton/sdk/models/Link;

    .line 62
    iput-object p3, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mText:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mBackgroundColor:I

    .line 68
    const-class v0, Lcom/usebutton/sdk/models/Link;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/models/Link;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mAction:Lcom/usebutton/sdk/models/Link;

    .line 69
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mText:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAction()Lcom/usebutton/sdk/models/Link;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mAction:Lcom/usebutton/sdk/models/Link;

    return-object v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 103
    iget v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mBackgroundColor:I

    return v0
.end method

.method public getText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 116
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 94
    iget v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mBackgroundColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 95
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mAction:Lcom/usebutton/sdk/models/Link;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 96
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/TextElement;->mText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
