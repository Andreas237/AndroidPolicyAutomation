.class public Lcom/huawei/hihealth/HiAuthorizationOption;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiAuthorizationOption;>;"
        }
    .end annotation
.end field


# instance fields
.field private accessToken:Ljava/lang/String;

.field private appId:Ljava/lang/String;

.field private fingerprint:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Lcom/huawei/hihealth/HiAuthorizationOption$3;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiAuthorizationOption$3;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiAuthorizationOption;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->accessToken:Ljava/lang/String;

    .line 39
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->appId:Ljava/lang/String;

    .line 40
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->fingerprint:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->accessToken:Ljava/lang/String;

    .line 35
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 52
    const/4 v0, 0x0

    return v0
.end method

.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getFingerprint()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->fingerprint:Ljava/lang/String;

    return-object v0
.end method

.method public isNotValid()Z
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->accessToken:Ljava/lang/String;

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->appId:Ljava/lang/String;

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->accessToken:Ljava/lang/String;

    .line 73
    return-void
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->appId:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public setFingerprint(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->fingerprint:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 97
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiAuthorizationOption{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 98
    const-string v0, ", appId=\'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 99
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 100
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->accessToken:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->appId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/huawei/hihealth/HiAuthorizationOption;->fingerprint:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    return-void
.end method
