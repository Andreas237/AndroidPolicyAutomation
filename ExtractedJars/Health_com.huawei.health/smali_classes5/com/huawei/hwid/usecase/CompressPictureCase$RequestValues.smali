.class public final Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;
.super Lcom/huawei/hwid/UseCase$RequestValues;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwid/usecase/CompressPictureCase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RequestValues"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;>;"
        }
    .end annotation
.end field


# instance fields
.field a:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 73
    new-instance v0, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues$1;

    invoke-direct {v0}, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 56
    iput-object p1, p0, Lcom/huawei/hwid/usecase/CompressPictureCase$RequestValues;->a:Landroid/net/Uri;

    .line 57
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/huawei/hwid/UseCase$RequestValues;-><init>()V

    .line 71
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 61
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 67
    return-void
.end method
