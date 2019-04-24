.class public Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;
.super Ljava/lang/Object;
.source "ActivityParcelable.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field private amount:F

.field private appData:Ljava/lang/String;

.field private context:Ljava/lang/String;

.field private date:Ljava/util/Date;

.field private displayId:I

.field private displayType:Lcom/ibotta/android/notification/model/NotificationDisplayType;

.field private iconUrl:Ljava/lang/String;

.field private itemId:J

.field private itemType:Ljava/lang/String;

.field private message:Ljava/lang/String;

.field private messageData:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private status:Lcom/ibotta/android/notification/model/NotificationStatus;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 176
    new-instance v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable$1;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable$1;-><init>()V

    sput-object v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    .line 31
    invoke-virtual {p0, p1}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->readFromParcel(Landroid/os/Parcel;)V

    return-void
.end method

.method public static fromNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;
    .locals 3

    .line 187
    new-instance v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    invoke-direct {v0}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;-><init>()V

    .line 188
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->status:Lcom/ibotta/android/notification/model/NotificationStatus;

    .line 189
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getContext()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->context:Ljava/lang/String;

    .line 190
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->iconUrl:Ljava/lang/String;

    .line 191
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getDate()Ljava/util/Date;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->date:Ljava/util/Date;

    .line 192
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getMessage()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->message:Ljava/lang/String;

    .line 194
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getAmount()F

    move-result v1

    iput v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->amount:F

    .line 195
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getItemId()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemId:J

    .line 196
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getItemType()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemType:Ljava/lang/String;

    .line 197
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result v1

    iput v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayId:I

    .line 198
    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v1

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayType:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    .line 199
    new-instance v1, Ljava/util/HashMap;

    invoke-virtual {p0}, Lcom/ibotta/android/notification/model/Notification;->getMessageData()Ljava/util/Map;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v1, v0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAmount()F
    .locals 1

    .line 83
    iget v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->amount:F

    return v0
.end method

.method public getAmountAbsolute()F
    .locals 1

    .line 91
    iget v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->amount:F

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public getAppData()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->appData:Ljava/lang/String;

    return-object v0
.end method

.method public getContext()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->context:Ljava/lang/String;

    return-object v0
.end method

.method public getDate()Ljava/util/Date;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->date:Ljava/util/Date;

    return-object v0
.end method

.method public getDisplayId()I
    .locals 1

    .line 111
    iget v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayId:I

    return v0
.end method

.method public getDisplayType()Lcom/ibotta/android/notification/model/NotificationDisplayType;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayType:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    return-object v0
.end method

.method public getIconUrl()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->iconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getItemId()J
    .locals 2

    .line 95
    iget-wide v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemId:J

    return-wide v0
.end method

.method public getItemType()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemType:Ljava/lang/String;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getMessageData()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    return-object v0
.end method

.method public getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->status:Lcom/ibotta/android/notification/model/NotificationStatus;

    return-object v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 4

    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 157
    invoke-static {v0}, Lcom/ibotta/android/notification/model/NotificationStatus;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->status:Lcom/ibotta/android/notification/model/NotificationStatus;

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->context:Ljava/lang/String;

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->iconUrl:Ljava/lang/String;

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->appData:Ljava/lang/String;

    .line 161
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->date:Ljava/util/Date;

    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->message:Ljava/lang/String;

    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->amount:F

    .line 164
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemId:J

    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemType:Ljava/lang/String;

    .line 166
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayId:I

    .line 167
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 168
    invoke-static {v0}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->valueOf(Ljava/lang/String;)Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayType:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    .line 169
    invoke-virtual {p1}, Landroid/os/Parcel;->readSerializable()Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/util/HashMap;

    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    .line 170
    iget-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    if-nez p1, :cond_2

    .line 171
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    :cond_2
    return-void
.end method

.method public setAmount(F)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->amount:F

    return-void
.end method

.method public setAppData(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->appData:Ljava/lang/String;

    return-void
.end method

.method public setContext(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->context:Ljava/lang/String;

    return-void
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->date:Ljava/util/Date;

    return-void
.end method

.method public setDisplayId(I)V
    .locals 0

    .line 115
    iput p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayId:I

    return-void
.end method

.method public setDisplayType(Lcom/ibotta/android/notification/model/NotificationDisplayType;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayType:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    return-void
.end method

.method public setIconUrl(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->iconUrl:Ljava/lang/String;

    return-void
.end method

.method public setItemId(J)V
    .locals 0

    .line 99
    iput-wide p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemId:J

    return-void
.end method

.method public setItemType(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemType:Ljava/lang/String;

    return-void
.end method

.method public setMessage(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->message:Ljava/lang/String;

    return-void
.end method

.method public setMessageData(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 131
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    return-void
.end method

.method public setStatus(Lcom/ibotta/android/notification/model/NotificationStatus;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->status:Lcom/ibotta/android/notification/model/NotificationStatus;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 141
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->status:Lcom/ibotta/android/notification/model/NotificationStatus;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    move-object p2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/NotificationStatus;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 142
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->context:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 143
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->iconUrl:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 144
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->appData:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->date:Ljava/util/Date;

    if-nez p2, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    :goto_1
    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 146
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->message:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    iget p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->amount:F

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 148
    iget-wide v1, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemId:J

    invoke-virtual {p1, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 149
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->itemType:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    iget p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayId:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->displayType:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 152
    iget-object p2, p0, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->messageData:Ljava/util/HashMap;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    return-void
.end method
