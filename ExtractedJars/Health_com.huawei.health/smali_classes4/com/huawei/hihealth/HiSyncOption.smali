.class public Lcom/huawei/hihealth/HiSyncOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiSyncOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private data:Ljava/lang/String;

.field private pushAction:I

.field private syncAction:I

.field private syncDataType:I

.field private syncDay:J

.field private syncMethod:I

.field private syncModel:I

.field private syncScope:I

.field private syncType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 176
    new-instance v0, Lcom/huawei/hihealth/HiSyncOption$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiSyncOption$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiSyncOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncAction:I

    .line 166
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncMethod:I

    .line 167
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncScope:I

    .line 168
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDataType:I

    .line 169
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncModel:I

    .line 170
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->pushAction:I

    .line 171
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDay:J

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncType:I

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiSyncOption;->data:Ljava/lang/String;

    .line 174
    return-void
.end method

.method public constructor <init>(Lcom/huawei/hihealth/HiSyncOption;I)V
    .locals 0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    invoke-direct {p0, p1, p2}, Lcom/huawei/hihealth/HiSyncOption;->initData(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 133
    return-void
.end method

.method private initData(Lcom/huawei/hihealth/HiSyncOption;I)V
    .locals 2

    .line 136
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncModel()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 137
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncMethod()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 138
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncAction()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 139
    invoke-virtual {p0, p2}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 140
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncScope()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 141
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getPushAction()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiSyncOption;->setPushAction(I)V

    .line 142
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncType(I)V

    .line 143
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiSyncOption;->getSyncDay()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDay(J)V

    .line 144
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 148
    const/4 v0, 0x0

    return v0
.end method

.method public getPushAction()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->pushAction:I

    return v0
.end method

.method public getSyncAction()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncAction:I

    return v0
.end method

.method public getSyncDataType()I
    .locals 1

    .line 94
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDataType:I

    return v0
.end method

.method public getSyncDay()J
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDay:J

    return-wide v0
.end method

.method public getSyncMethod()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncMethod:I

    return v0
.end method

.method public getSyncModel()I
    .locals 1

    .line 121
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncModel:I

    return v0
.end method

.method public getSyncScope()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncScope:I

    return v0
.end method

.method public getSyncType()I
    .locals 1

    .line 62
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncType:I

    return v0
.end method

.method public getUserInfo()Lcom/huawei/hihealth/HiUserInfo;
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/huawei/hihealth/HiSyncOption;->data:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiSyncOption;->data:Ljava/lang/String;

    const-class v1, Lcom/huawei/hihealth/HiUserInfo;

    invoke-static {v0, v1}, Lo/cnj;->c(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 208
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 212
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 216
    return-void
.end method

.method public setPushAction(I)V
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->pushAction:I

    .line 109
    return-void
.end method

.method public setSyncAction(I)V
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncAction:I

    .line 75
    return-void
.end method

.method public setSyncDataType(I)V
    .locals 0

    .line 117
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDataType:I

    .line 118
    return-void
.end method

.method public setSyncDay(J)V
    .locals 0

    .line 58
    iput-wide p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDay:J

    .line 59
    return-void
.end method

.method public setSyncMethod(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncMethod:I

    .line 83
    return-void
.end method

.method public setSyncModel(I)V
    .locals 0

    .line 125
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncModel:I

    .line 126
    return-void
.end method

.method public setSyncScope(I)V
    .locals 0

    .line 90
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncScope:I

    .line 91
    return-void
.end method

.method public setSyncType(I)V
    .locals 0

    .line 66
    iput p1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncType:I

    .line 67
    return-void
.end method

.method public setUserInfo(Lcom/huawei/hihealth/HiUserInfo;)V
    .locals 1

    .line 98
    if-nez p1, :cond_0

    return-void

    .line 99
    :cond_0
    invoke-static {p1}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiSyncOption;->data:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 190
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiSyncOption{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 191
    const-string v0, "syncAction="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncAction:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 192
    const-string v0, ", syncMethod="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncMethod:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 193
    const-string v0, ", syncScope="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncScope:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 194
    const-string v0, ", syncDataType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 195
    const-string v0, ", syncModel="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncModel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 196
    const-string v0, ", pushAction="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->pushAction:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 197
    const-string v0, ", syncDay="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDay:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 198
    const-string v0, ", syncType="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiSyncOption;->syncType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 199
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 200
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 153
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncAction:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 154
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncMethod:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncScope:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDataType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 157
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncModel:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->pushAction:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    iget-wide v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncDay:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 160
    iget v0, p0, Lcom/huawei/hihealth/HiSyncOption;->syncType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    iget-object v0, p0, Lcom/huawei/hihealth/HiSyncOption;->data:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 162
    return-void
.end method
