.class public Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;
.super Lo/bfh;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;"
        }
    .end annotation
.end field

.field public static final FOLLOW_STATUS_FOLLOWED:I = 0x1

.field public static final FOLLOW_STATUS_UNFOLLOWED:I = 0x0


# instance fields
.field private follow:I

.field private head_pic:Ljava/lang/String;

.field private introduction:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private searchKey:Ljava/lang/String;

.field private uId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 153
    new-instance v0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 61
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->uId:J

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->name:Ljava/lang/String;

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->searchKey:Ljava/lang/String;

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->head_pic:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->introduction:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->follow:I

    .line 68
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 139
    const/4 v0, 0x0

    return v0
.end method

.method public getFollow()I
    .locals 1

    .line 127
    iget v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->follow:I

    .line 128
    return v0
.end method

.method public getHead_pic()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->head_pic:Ljava/lang/String;

    .line 106
    return-object v0
.end method

.method public getIntroduction()Ljava/lang/String;
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->introduction:Ljava/lang/String;

    .line 117
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->name:Ljava/lang/String;

    .line 95
    return-object v0
.end method

.method public getSearchKey()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->searchKey:Ljava/lang/String;

    .line 84
    return-object v0
.end method

.method public getUID()J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->uId:J

    .line 73
    return-wide v0
.end method

.method public setFollow(I)V
    .locals 0

    .line 133
    iput p1, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->follow:I

    .line 134
    return-void
.end method

.method public setHead_pic(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->head_pic:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public setIntroduction(Ljava/lang/String;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->introduction:Ljava/lang/String;

    .line 123
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->name:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setSearchKey(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->searchKey:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setUID(J)V
    .locals 0

    .line 78
    iput-wide p1, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->uId:J

    .line 79
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 145
    iget-wide v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->uId:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 146
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->searchKey:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 148
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->head_pic:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->introduction:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    iget v0, p0, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->follow:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    return-void
.end method
