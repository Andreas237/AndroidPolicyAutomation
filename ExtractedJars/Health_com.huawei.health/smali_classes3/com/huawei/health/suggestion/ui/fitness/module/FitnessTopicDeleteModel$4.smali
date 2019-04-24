.class final Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
    .locals 1

    .line 48
    new-array v0, p1, [Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
    .locals 1

    .line 43
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    invoke-direct {v0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 40
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel$4;->c(Landroid/os/Parcel;)Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 40
    invoke-virtual {p0, p1}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel$4;->b(I)[Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;

    move-result-object v0

    return-object v0
.end method
