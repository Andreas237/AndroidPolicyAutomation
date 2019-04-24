.class public Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;
.super Lcom/huawei/health/sns/server/Region;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/server/setting/GetUserSettingResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Region"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;>;"
        }
    .end annotation
.end field


# instance fields
.field private nationalCode_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 312
    new-instance v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 308
    invoke-direct {p0}, Lcom/huawei/health/sns/server/Region;-><init>()V

    .line 310
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 329
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/server/Region;-><init>(Landroid/os/Parcel;)V

    .line 330
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->nationalCode_:Ljava/lang/String;

    .line 331
    return-void
.end method


# virtual methods
.method public getNationalCode_()Ljava/lang/String;
    .locals 1

    .line 335
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->nationalCode_:Ljava/lang/String;

    return-object v0
.end method

.method public setNationalCode_(Ljava/lang/String;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->nationalCode_:Ljava/lang/String;

    .line 341
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 346
    invoke-super {p0, p1, p2}, Lcom/huawei/health/sns/server/Region;->writeToParcel(Landroid/os/Parcel;I)V

    .line 347
    iget-object v0, p0, Lcom/huawei/health/sns/server/setting/GetUserSettingResponse$Region;->nationalCode_:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 348
    return-void
.end method
