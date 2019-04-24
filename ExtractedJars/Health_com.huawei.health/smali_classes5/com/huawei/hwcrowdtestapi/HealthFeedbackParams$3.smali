.class final Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Landroid/os/Parcel;)Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;
    .locals 1

    .line 29
    new-instance v0, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;

    invoke-direct {v0, p1}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 26
    invoke-virtual {p0, p1}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams$3;->c(Landroid/os/Parcel;)Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;

    move-result-object v0

    return-object v0
.end method

.method public d(I)[Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;
    .locals 1

    .line 34
    new-array v0, p1, [Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 26
    invoke-virtual {p0, p1}, Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams$3;->d(I)[Lcom/huawei/hwcrowdtestapi/HealthFeedbackParams;

    move-result-object v0

    return-object v0
.end method
