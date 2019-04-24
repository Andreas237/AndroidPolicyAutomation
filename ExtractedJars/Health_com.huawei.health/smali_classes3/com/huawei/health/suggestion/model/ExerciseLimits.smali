.class public Lcom/huawei/health/suggestion/model/ExerciseLimits;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/model/ExerciseLimits;>;"
        }
    .end annotation
.end field


# instance fields
.field private max:I

.field private min:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Lcom/huawei/health/suggestion/model/ExerciseLimits$1;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/model/ExerciseLimits$1;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->min:I

    .line 18
    iput p2, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->max:I

    .line 19
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->min:I

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->max:I

    .line 24
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 56
    const/4 v0, 0x0

    return v0
.end method

.method public getMax()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->max:I

    return v0
.end method

.method public getMin()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->min:I

    return v0
.end method

.method public setMax(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->max:I

    .line 52
    return-void
.end method

.method public setMin(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->min:I

    .line 44
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->min:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    iget v0, p0, Lcom/huawei/health/suggestion/model/ExerciseLimits;->max:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 63
    return-void
.end method
