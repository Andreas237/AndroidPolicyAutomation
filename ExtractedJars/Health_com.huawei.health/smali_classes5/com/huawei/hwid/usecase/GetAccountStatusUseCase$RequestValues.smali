.class public final Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;
.super Lcom/huawei/hwid/UseCase$RequestValues;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/GetAccountStatusUseCase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestValues"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 79
    new-instance v0, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues$1;

    invoke-direct {v0}, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/usecase/GetAccountStatusUseCase$RequestValues;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 65
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 77
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 69
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 74
    return-void
.end method
