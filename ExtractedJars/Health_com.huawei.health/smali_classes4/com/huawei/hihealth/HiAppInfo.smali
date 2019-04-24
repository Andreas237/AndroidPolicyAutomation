.class public Lcom/huawei/hihealth/HiAppInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiAppInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private appID:I

.field private appName:Ljava/lang/String;

.field private cloudCode:J

.field private packageName:Ljava/lang/String;

.field private signature:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 54
    new-instance v0, Lcom/huawei/hihealth/HiAppInfo$5;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiAppInfo$5;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiAppInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealth/HiAppInfo;->appID:I

    .line 47
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->packageName:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->appName:Ljava/lang/String;

    .line 49
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->version:Ljava/lang/String;

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->signature:Ljava/lang/String;

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealth/HiAppInfo;->cloudCode:J

    .line 52
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 128
    const/4 v0, 0x0

    return v0
.end method

.method public getAppID()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/hihealth/HiAppInfo;->appID:I

    return v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getCloudCode()J
    .locals 2

    .line 107
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAppInfo;->cloudCode:J

    return-wide v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 146
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 150
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 154
    return-void
.end method

.method public setAppID(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/hihealth/HiAppInfo;->appID:I

    .line 72
    return-void
.end method

.method public setAppName(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/hihealth/HiAppInfo;->appName:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public setCloudCode(J)V
    .locals 0

    .line 111
    iput-wide p1, p0, Lcom/huawei/hihealth/HiAppInfo;->cloudCode:J

    .line 112
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/hihealth/HiAppInfo;->packageName:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setSignature(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/hihealth/HiAppInfo;->signature:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/hihealth/HiAppInfo;->version:Ljava/lang/String;

    .line 96
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 116
    new-instance v3, Ljava/lang/StringBuffer;

    const-string v0, "HiAppInfo{"

    invoke-direct {v3, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 117
    const-string v0, "appID="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealth/HiAppInfo;->appID:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 118
    const-string v0, ", packageName=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiAppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 119
    const-string v0, ", appName=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiAppInfo;->appName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 120
    const-string v0, ", version=\'"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiAppInfo;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 121
    const-string v0, ", cloudCode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealth/HiAppInfo;->cloudCode:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 122
    const/16 v0, 0x7d

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 123
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 133
    iget v0, p0, Lcom/huawei/hihealth/HiAppInfo;->appID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 134
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 135
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->appName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/huawei/hihealth/HiAppInfo;->signature:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    iget-wide v0, p0, Lcom/huawei/hihealth/HiAppInfo;->cloudCode:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 139
    return-void
.end method
