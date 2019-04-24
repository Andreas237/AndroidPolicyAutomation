.class public final Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;
.super Lcom/huawei/hwid/UseCase$RequestValues;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/ClearDataUseCase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestValues"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues$1;

    invoke-direct {v0}, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/usecase/ClearDataUseCase$RequestValues;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 33
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 45
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 37
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 42
    return-void
.end method
