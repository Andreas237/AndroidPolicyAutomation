.class final Lcom/huawei/health/suggestion/model/DayTotalRecord$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/model/DayTotalRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/DayTotalRecord;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/health/suggestion/model/DayTotalRecord;
    .locals 1

    .line 129
    new-instance v0, Lcom/huawei/health/suggestion/model/DayTotalRecord;

    invoke-direct {v0, p1}, Lcom/huawei/health/suggestion/model/DayTotalRecord;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 126
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/model/DayTotalRecord$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/health/suggestion/model/DayTotalRecord;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/health/suggestion/model/DayTotalRecord;
    .locals 1

    .line 134
    new-array v0, p1, [Lcom/huawei/health/suggestion/model/DayTotalRecord;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 126
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/model/DayTotalRecord$1;->newArray(I)[Lcom/huawei/health/suggestion/model/DayTotalRecord;

    move-result-object v0

    return-object v0
.end method