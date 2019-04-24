.class final Lcom/huawei/datatype/RunPlanSuggestStruct$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/datatype/RunPlanSuggestStruct;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/datatype/RunPlanSuggestStruct;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/huawei/datatype/RunPlanSuggestStruct;
    .locals 2

    .line 114
    new-instance v1, Lcom/huawei/datatype/RunPlanSuggestStruct;

    invoke-direct {v1}, Lcom/huawei/datatype/RunPlanSuggestStruct;-><init>()V

    .line 115
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanSuggestStruct;->setRun_plan_suggest_type(I)V

    .line 116
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanSuggestStruct;->setRun_plan_suggest_rate_reminder(I)V

    .line 117
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanSuggestStruct;->setRun_plan_suggest_distance(I)V

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanSuggestStruct;->setRun_plan_suggest_time(I)V

    .line 119
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanSuggestStruct;->setRun_plan_suggest_heart_rate(I)V

    .line 120
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/RunPlanSuggestStruct;->setRun_plan_suggest_heart_state(I)V

    .line 121
    return-object v1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 111
    invoke-virtual {p0, p1}, Lcom/huawei/datatype/RunPlanSuggestStruct$1;->createFromParcel(Landroid/os/Parcel;)Lcom/huawei/datatype/RunPlanSuggestStruct;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lcom/huawei/datatype/RunPlanSuggestStruct;
    .locals 1

    .line 126
    new-array v0, p1, [Lcom/huawei/datatype/RunPlanSuggestStruct;

    return-object v0
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 111
    invoke-virtual {p0, p1}, Lcom/huawei/datatype/RunPlanSuggestStruct$1;->newArray(I)[Lcom/huawei/datatype/RunPlanSuggestStruct;

    move-result-object v0

    return-object v0
.end method
