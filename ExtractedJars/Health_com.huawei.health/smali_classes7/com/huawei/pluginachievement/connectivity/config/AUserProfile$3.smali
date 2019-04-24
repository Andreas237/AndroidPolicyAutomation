.class final Lcom/huawei/pluginachievement/connectivity/config/AUserProfile$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 222
    invoke-virtual {p0, p1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile$3;->e(Landroid/os/Parcel;)Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;
    .locals 1

    .line 245
    new-array v0, p1, [Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    return-object v0
.end method

.method public e(Landroid/os/Parcel;)Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;
    .locals 2

    .line 225
    new-instance v1, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    invoke-direct {v1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;-><init>()V

    .line 226
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$002(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 227
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$102(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$202(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I

    .line 229
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$302(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$402(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$502(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$602(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$702(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$802(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 235
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$902(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I

    .line 236
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$1002(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I

    .line 237
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$1102(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 238
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$1202(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;I)I

    .line 239
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;->access$1302(Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    return-object v1
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 222
    invoke-virtual {p0, p1}, Lcom/huawei/pluginachievement/connectivity/config/AUserProfile$3;->d(I)[Lcom/huawei/pluginachievement/connectivity/config/AUserProfile;

    move-result-object v0

    return-object v0
.end method
