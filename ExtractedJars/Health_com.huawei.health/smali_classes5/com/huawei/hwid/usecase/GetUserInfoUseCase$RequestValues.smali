.class public final Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;
.super Lcom/huawei/hwid/UseCase$RequestValues;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/GetUserInfoUseCase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestValues"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 110
    new-instance v0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues$1;

    invoke-direct {v0}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 106
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;->a:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 92
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 93
    iput-object p1, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;->a:Ljava/lang/String;

    .line 94
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;)Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 104
    return-void
.end method
