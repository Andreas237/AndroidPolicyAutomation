.class public Lcom/huawei/datatype/RunPlanSuggestStruct;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/datatype/RunPlanSuggestStruct;>;"
        }
    .end annotation
.end field


# instance fields
.field private run_plan_suggest_distance:I

.field private run_plan_suggest_heart_rate:I

.field private run_plan_suggest_heart_state:I

.field private run_plan_suggest_rate_reminder:I

.field private run_plan_suggest_time:I

.field private run_plan_suggest_type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 111
    new-instance v0, Lcom/huawei/datatype/RunPlanSuggestStruct$1;

    invoke-direct {v0}, Lcom/huawei/datatype/RunPlanSuggestStruct$1;-><init>()V

    sput-object v0, Lcom/huawei/datatype/RunPlanSuggestStruct;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 98
    const/4 v0, 0x0

    return v0
.end method

.method public getRun_plan_suggest_distance()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_distance:I

    return v0
.end method

.method public getRun_plan_suggest_heart_rate()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_heart_rate:I

    return v0
.end method

.method public getRun_plan_suggest_heart_state()I
    .locals 1

    .line 88
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_heart_state:I

    return v0
.end method

.method public getRun_plan_suggest_rate_reminder()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_rate_reminder:I

    return v0
.end method

.method public getRun_plan_suggest_time()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_time:I

    return v0
.end method

.method public getRun_plan_suggest_type()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_type:I

    return v0
.end method

.method public setRun_plan_suggest_distance(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_distance:I

    .line 69
    return-void
.end method

.method public setRun_plan_suggest_heart_rate(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_heart_rate:I

    .line 85
    return-void
.end method

.method public setRun_plan_suggest_heart_state(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_heart_state:I

    .line 93
    return-void
.end method

.method public setRun_plan_suggest_rate_reminder(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_rate_reminder:I

    .line 61
    return-void
.end method

.method public setRun_plan_suggest_time(I)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_time:I

    .line 77
    return-void
.end method

.method public setRun_plan_suggest_type(I)V
    .locals 0

    .line 52
    iput p1, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_type:I

    .line 53
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 103
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_rate_reminder:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_distance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 106
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_time:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 107
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_heart_rate:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 108
    iget v0, p0, Lcom/huawei/datatype/RunPlanSuggestStruct;->run_plan_suggest_heart_state:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    return-void
.end method
