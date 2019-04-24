.class public Lcom/shopkick/sdk/campaign/CampaignParcelable;
.super Ljava/lang/Object;
.source "CampaignParcelable.java"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/shopkick/sdk/campaign/Campaign;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/campaign/CampaignParcelable;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final campaignId:Ljava/lang/String;

.field private final end:J

.field private messages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/campaign/MessageParcelable;",
            ">;"
        }
    .end annotation
.end field

.field private final start:J

.field private final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 83
    new-instance v0, Lcom/shopkick/sdk/campaign/CampaignParcelable$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/campaign/CampaignParcelable$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->messages:Ljava/util/List;

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    .line 34
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->messages:Ljava/util/List;

    sget-object v1, Lcom/shopkick/sdk/campaign/MessageParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readTypedList(Ljava/util/List;Landroid/os/Parcelable$Creator;)V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/campaign/MessageParcelable;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->messages:Ljava/util/List;

    .line 22
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;->campaignId:Ljava/lang/String;

    iput-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    .line 23
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;->start:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    .line 24
    iget-object v0, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;->end:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    .line 25
    iget-object p1, p1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;->type:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    .line 26
    iput-object p2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->messages:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_8

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_2

    .line 100
    :cond_1
    check-cast p1, Lcom/shopkick/sdk/campaign/CampaignParcelable;

    .line 102
    iget-wide v2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    iget-wide v4, p1, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_2

    return v1

    .line 103
    :cond_2
    iget-wide v2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    iget-wide v4, p1, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_3

    return v1

    .line 104
    :cond_3
    iget v2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    iget v3, p1, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    if-eq v2, v3, :cond_4

    return v1

    .line 105
    :cond_4
    iget-object v2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object p1, p1, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_5
    iget-object p1, p1, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    move v0, v1

    :cond_7
    :goto_1
    return v0

    :cond_8
    :goto_2
    return v1
.end method

.method public getCampaignId()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()J
    .locals 2

    .line 59
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    return-wide v0
.end method

.method public getMessages()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/shopkick/sdk/campaign/Message;",
            ">;"
        }
    .end annotation

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    iget-object v1, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->messages:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/sdk/campaign/Message;

    .line 66
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public getStartTime()J
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 6

    .line 112
    iget-object v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 113
    iget-wide v1, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    const/16 v3, 0x20

    ushr-long v4, v1, v3

    xor-long/2addr v1, v4

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 114
    iget-wide v1, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 115
    iget v1, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    add-int/2addr v0, v1

    return v0
.end method

.method public isCampaignActive()Z
    .locals 4

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 44
    iget-wide v2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_0

    iget-wide v2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 76
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->campaignId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 77
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->start:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 78
    iget-wide v0, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->end:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 79
    iget p2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->type:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    iget-object p2, p0, Lcom/shopkick/sdk/campaign/CampaignParcelable;->messages:Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    return-void
.end method
