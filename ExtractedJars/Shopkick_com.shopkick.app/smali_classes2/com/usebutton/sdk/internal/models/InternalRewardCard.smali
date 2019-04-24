.class public Lcom/usebutton/sdk/internal/models/InternalRewardCard;
.super Lcom/usebutton/sdk/internal/models/BrowserCard;
.source "InternalRewardCard.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/usebutton/sdk/internal/models/InternalRewardCard;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final backgroundColor:I
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation
.end field

.field private final body:Lcom/usebutton/sdk/internal/models/Text;

.field private final ctaIcon:Landroid/net/Uri;

.field private final ctaText:Lcom/usebutton/sdk/internal/models/Text;

.field private final showCount:I

.field private final showDurationInMs:J

.field private final title:Lcom/usebutton/sdk/internal/models/Text;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 100
    new-instance v0, Lcom/usebutton/sdk/internal/models/InternalRewardCard$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/models/InternalRewardCard$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IIJLandroid/net/Uri;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V
    .locals 0
    .param p1    # I
        .annotation build Landroid/support/annotation/ColorInt;
        .end annotation
    .end param

    .line 38
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BrowserCard;-><init>()V

    .line 39
    iput p1, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->backgroundColor:I

    .line 40
    iput p2, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showCount:I

    .line 41
    iput-wide p3, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showDurationInMs:J

    .line 42
    iput-object p5, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaIcon:Landroid/net/Uri;

    .line 43
    iput-object p6, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    .line 44
    iput-object p7, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 45
    iput-object p8, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/models/BrowserCard;-><init>()V

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->backgroundColor:I

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showCount:I

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showDurationInMs:J

    .line 53
    const-class v0, Landroid/net/Uri;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaIcon:Landroid/net/Uri;

    .line 54
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    .line 55
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/models/Text;

    iput-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    .line 56
    const-class v0, Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Text;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    return-void
.end method

.method public static fromDTO(Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;)Lcom/usebutton/sdk/internal/models/InternalRewardCard;
    .locals 10
    .param p0    # Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 89
    new-instance v9, Lcom/usebutton/sdk/internal/models/InternalRewardCard;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->backgroundColor:Ljava/lang/String;

    .line 90
    invoke-static {v0}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->safeColorValue(Ljava/lang/String;)I

    move-result v1

    iget v2, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->showCount:I

    iget-wide v3, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->showDurationInMs:J

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->ctaIcon:Ljava/lang/String;

    .line 93
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->ctaText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 94
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v6

    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->title:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 95
    invoke-static {v0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v7

    iget-object p0, p0, Lcom/usebutton/sdk/internal/api/models/InternalRewardCardDTO;->body:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    .line 96
    invoke-static {p0}, Lcom/usebutton/sdk/internal/models/Text;->fromDTO(Lcom/usebutton/sdk/internal/api/models/TextDTO;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/usebutton/sdk/internal/models/InternalRewardCard;-><init>(IIJLandroid/net/Uri;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;)V

    return-object v9
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getBackgroundColor()I
    .locals 1
    .annotation build Landroid/support/annotation/ColorInt;
    .end annotation

    .line 61
    iget v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->backgroundColor:I

    return v0
.end method

.method public getBody()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getCtaIcon()Landroid/net/Uri;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaIcon:Landroid/net/Uri;

    return-object v0
.end method

.method public getCtaText()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public getShowCount()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showCount:I

    return v0
.end method

.method public getShowDuration()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showDurationInMs:J

    return-wide v0
.end method

.method public getTitle()Lcom/usebutton/sdk/internal/models/Text;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 119
    iget v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->backgroundColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    iget v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showCount:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    iget-wide v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->showDurationInMs:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 122
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaIcon:Landroid/net/Uri;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 123
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->ctaText:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->title:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 125
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/InternalRewardCard;->body:Lcom/usebutton/sdk/internal/models/Text;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method
