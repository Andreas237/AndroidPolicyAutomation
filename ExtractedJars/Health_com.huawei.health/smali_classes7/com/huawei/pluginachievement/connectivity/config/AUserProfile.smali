.class public Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;>;"
        }
    .end annotation
.end field


# instance fields
.field private appId:Ljava/lang/String;

.field private appType:I

.field private bindDeviceType:Ljava/lang/String;

.field private deviceId:Ljava/lang/String;

.field private deviceType:Ljava/lang/String;

.field private environment:I

.field private huid:Ljava/lang/String;

.field private iVersion:I

.field private language:Ljava/lang/String;

.field private sysVersion:Ljava/lang/String;

.field private token:Ljava/lang/String;

.field private tokenType:I

.field private upDeviceType:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 222
    new-instance v0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile$3;

    invoke-direct {v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile$3;-><init>()V

    sput-object v0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$002(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->huid:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1002(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I
    .locals 0

    .line 9
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->iVersion:I

    return p1
.end method

.method static synthetic access$102(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->version:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1102(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->language:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$1202(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I
    .locals 0

    .line 9
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->environment:I

    return p1
.end method

.method static synthetic access$1302(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->upDeviceType:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$202(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I
    .locals 0

    .line 9
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->tokenType:I

    return p1
.end method

.method static synthetic access$302(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->token:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$402(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$502(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceType:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$602(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceId:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$702(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->sysVersion:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$802(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 9
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->bindDeviceType:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$902(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I
    .locals 0

    .line 9
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appType:I

    return p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 201
    const/4 v0, 0x0

    return v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppType()I
    .locals 1

    .line 160
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appType:I

    return v0
.end method

.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->version:Ljava/lang/String;

    return-object v0
.end method

.method public getBindDeviceType()Ljava/lang/String;
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->bindDeviceType:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceType:Ljava/lang/String;

    return-object v0
.end method

.method public getEnvironment()I
    .locals 1

    .line 184
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->environment:I

    return v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getLanguage()Ljava/lang/String;
    .locals 1

    .line 176
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->language:Ljava/lang/String;

    return-object v0
.end method

.method public getSysVersion()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->sysVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getTokenType()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->tokenType:I

    return v0
.end method

.method public getUpDeviceType()Ljava/lang/String;
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->upDeviceType:Ljava/lang/String;

    return-object v0
.end method

.method public getiVersion()I
    .locals 1

    .line 168
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->iVersion:I

    return v0
.end method

.method public initData()V
    .locals 0

    .line 270
    return-void
.end method

.method public initData1()V
    .locals 0

    .line 271
    return-void
.end method

.method public initData10()V
    .locals 0

    .line 281
    return-void
.end method

.method public initData12()V
    .locals 0

    .line 282
    return-void
.end method

.method public initData2()V
    .locals 0

    .line 272
    return-void
.end method

.method public initData3()V
    .locals 0

    .line 274
    return-void
.end method

.method public initData4()V
    .locals 0

    .line 275
    return-void
.end method

.method public initData5()V
    .locals 0

    .line 276
    return-void
.end method

.method public initData6()V
    .locals 0

    .line 278
    return-void
.end method

.method public initData7()V
    .locals 0

    .line 279
    return-void
.end method

.method public initData8()V
    .locals 0

    .line 280
    return-void
.end method

.method public initUpData11()V
    .locals 0

    .line 273
    return-void
.end method

.method public initUpData9()V
    .locals 0

    .line 277
    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appId:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public setAppType(I)V
    .locals 0

    .line 164
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appType:I

    .line 165
    return-void
.end method

.method public setAppVersion(Ljava/lang/String;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->version:Ljava/lang/String;

    .line 101
    return-void
.end method

.method public setBindDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->bindDeviceType:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceId:Ljava/lang/String;

    .line 141
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceType:Ljava/lang/String;

    .line 133
    return-void
.end method

.method public setEnvironment(I)V
    .locals 0

    .line 188
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->environment:I

    .line 189
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->huid:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setLanguage(Ljava/lang/String;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->language:Ljava/lang/String;

    .line 181
    return-void
.end method

.method public setSysVersion(Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->sysVersion:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->token:Ljava/lang/String;

    .line 117
    return-void
.end method

.method public setTokenType(I)V
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->tokenType:I

    .line 109
    return-void
.end method

.method public setUpDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->upDeviceType:Ljava/lang/String;

    .line 197
    return-void
.end method

.method public setiVersion(I)V
    .locals 0

    .line 172
    iput p1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->iVersion:I

    .line 173
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserProfile{huid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->huid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tokenType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->tokenType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", token="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->token:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sysVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->sysVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bindDeviceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->bindDeviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->iVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", language="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->language:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", environment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->environment:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", upDeviceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->upDeviceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->huid:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->version:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 208
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->tokenType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 209
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->token:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 211
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->deviceId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 213
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->sysVersion:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->bindDeviceType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 215
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->appType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 216
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->iVersion:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 217
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->language:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 218
    iget v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->environment:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->upDeviceType:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 220
    return-void
.end method
