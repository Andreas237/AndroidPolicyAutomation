.class public Lcom/huawei/hihealth/HiUserPreference;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation
.end field


# instance fields
.field private createTime:J

.field private id:I

.field private key:Ljava/lang/String;

.field private modifiedTime:J

.field private syncStatus:I

.field private userId:I

.field private value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    new-instance v0, Lcom/huawei/hihealth/HiUserPreference$2;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserPreference$2;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiUserPreference;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    .line 48
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserPreference;->id:I

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserPreference;->key:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiUserPreference;->value:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserPreference;->userId:I

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiUserPreference;->syncStatus:I

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->createTime:J

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    .line 63
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    .line 51
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserPreference;->key:Ljava/lang/String;

    .line 52
    iput-object p2, p0, Lcom/huawei/hihealth/HiUserPreference;->value:Ljava/lang/String;

    .line 53
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 150
    const/4 v0, 0x0

    return v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->createTime:J

    return-wide v0
.end method

.method public getId()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/huawei/hihealth/HiUserPreference;->id:I

    return v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserPreference;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getModifiedTime()J
    .locals 2

    .line 126
    iget-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    return-wide v0
.end method

.method public getSyncStatus()I
    .locals 1

    .line 110
    iget v0, p0, Lcom/huawei/hihealth/HiUserPreference;->syncStatus:I

    return v0
.end method

.method public getUserId()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/huawei/hihealth/HiUserPreference;->userId:I

    return v0
.end method

.method public getValue()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserPreference;->value:Ljava/lang/String;

    invoke-static {v0}, Lo/cll;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 169
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 173
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 177
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 122
    iput-wide p1, p0, Lcom/huawei/hihealth/HiUserPreference;->createTime:J

    .line 123
    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/hihealth/HiUserPreference;->id:I

    .line 83
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserPreference;->key:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setModifiedTime(J)V
    .locals 2

    .line 130
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    return-void

    .line 131
    :cond_0
    iput-wide p1, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    .line 132
    return-void
.end method

.method public setSyncStatus(I)V
    .locals 0

    .line 114
    iput p1, p0, Lcom/huawei/hihealth/HiUserPreference;->syncStatus:I

    .line 115
    return-void
.end method

.method public setUserId(I)V
    .locals 0

    .line 106
    iput p1, p0, Lcom/huawei/hihealth/HiUserPreference;->userId:I

    .line 107
    return-void
.end method

.method public setValue(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/huawei/hihealth/HiUserPreference;->value:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 136
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiUserPreference{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 137
    const-string v0, "id="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiUserPreference;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 138
    const-string v0, ", key=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiUserPreference;->key:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 139
    const-string v0, ", value=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiUserPreference;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 140
    const-string v0, ", userId=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiUserPreference;->userId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 141
    const-string v0, ", syncStatus="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiUserPreference;->syncStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 142
    const-string v0, ", createTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiUserPreference;->createTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 143
    const-string v0, ", modifiedTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 144
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 145
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 155
    iget v0, p0, Lcom/huawei/hihealth/HiUserPreference;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserPreference;->key:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/hihealth/HiUserPreference;->value:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 158
    iget v0, p0, Lcom/huawei/hihealth/HiUserPreference;->userId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    iget v0, p0, Lcom/huawei/hihealth/HiUserPreference;->syncStatus:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    iget-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->createTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 161
    iget-wide v0, p0, Lcom/huawei/hihealth/HiUserPreference;->modifiedTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 162
    return-void
.end method
