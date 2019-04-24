.class public Lcom/huawei/hihealth/HiHealthClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/HiHealthClient;>;"
        }
    .end annotation
.end field


# instance fields
.field private hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

.field private hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

.field private hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Lcom/huawei/hihealth/HiHealthClient$3;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiHealthClient$3;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/HiHealthClient;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-class v0, Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiAppInfo;

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    .line 33
    const-class v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiUserInfo;

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    .line 34
    const-class v0, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiDeviceInfo;

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    .line 35
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 158
    const/4 v0, 0x0

    return v0
.end method

.method public getAppID()I
    .locals 2

    .line 112
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAppInfo;->getAppID()I

    move-result v0

    return v0

    .line 115
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getDeviceUUID()Ljava/lang/String;
    .locals 2

    .line 54
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceUniqueCode()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 57
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHiAppInfo()Lcom/huawei/hihealth/HiAppInfo;
    .locals 1

    .line 133
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    return-object v0
.end method

.method public getHiDeviceInfo()Lcom/huawei/hihealth/HiDeviceInfo;
    .locals 1

    .line 149
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    return-object v0
.end method

.method public getHiUserInfo()Lcom/huawei/hihealth/HiUserInfo;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    return-object v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 2

    .line 126
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 129
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOwnerID()I
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 78
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserInfo;->getOwerID()I

    move-result v0

    return v0

    .line 80
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 101
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public setAppID(I)V
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 106
    new-instance v0, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiAppInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiAppInfo;->setAppID(I)V

    .line 109
    return-void
.end method

.method public setDeviceUUID(Ljava/lang/String;)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 66
    new-instance v0, Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiDeviceInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiDeviceInfo;->setDeviceUniqueCode(Ljava/lang/String;)V

    .line 70
    return-void
.end method

.method public setHiAppInfo(Lcom/huawei/hihealth/HiAppInfo;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    .line 138
    return-void
.end method

.method public setHiDeviceInfo(Lcom/huawei/hihealth/HiDeviceInfo;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    .line 154
    return-void
.end method

.method public setHiUserInfo(Lcom/huawei/hihealth/HiUserInfo;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    .line 146
    return-void
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 120
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    .line 122
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 123
    return-void
.end method

.method public setOwnerID(I)V
    .locals 2

    .line 84
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    new-instance v0, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiUserInfo;->setOwerID(I)V

    .line 88
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 92
    new-instance v0, Lcom/huawei/hihealth/HiAppInfo;

    invoke-direct {v0}, Lcom/huawei/hihealth/HiAppInfo;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0, p1}, Lcom/huawei/hihealth/HiAppInfo;->setPackageName(Ljava/lang/String;)V

    .line 95
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 170
    new-instance v2, Ljava/lang/StringBuffer;

    const-string v0, "HiHealthClient{"

    invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    .line 171
    const-string v0, "hiAppInfo="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 172
    const-string v0, ", hiDeviceInfo="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 173
    const-string v0, ", hiUserInfo="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    .line 174
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 175
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiAppInfo:Lcom/huawei/hihealth/HiAppInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 164
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiUserInfo:Lcom/huawei/hihealth/HiUserInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 165
    iget-object v0, p0, Lcom/huawei/hihealth/HiHealthClient;->hiDeviceInfo:Lcom/huawei/hihealth/HiDeviceInfo;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 166
    return-void
.end method
