.class final Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;
    .locals 1

    .line 317
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    invoke-direct {v0, p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 313
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;
    .locals 1

    .line 323
    new-array v0, p1, [Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 313
    invoke-virtual {p0, p1}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region$1;->newArray(I)[Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;

    move-result-object v0

    return-object v0
.end method
