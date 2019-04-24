.class public Lcom/unionpay/tsmservice/data/ApplyActivityStyle;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/unionpay/tsmservice/data/ApplyActivityStyle;>;"
        }
    .end annotation
.end field


# instance fields
.field private activityBackgroundColor:I

.field private buttonColor:I

.field private titleColor:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle$1;

    invoke-direct {v0}, Lcom/unionpay/tsmservice/data/ApplyActivityStyle$1;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->titleColor:I

    .line 9
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->buttonColor:I

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->activityBackgroundColor:I

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->titleColor:I

    .line 9
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->buttonColor:I

    .line 10
    const/4 v0, 0x0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->activityBackgroundColor:I

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->titleColor:I

    .line 32
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->buttonColor:I

    .line 33
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->activityBackgroundColor:I

    .line 34
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 38
    const/4 v0, 0x0

    return v0
.end method

.method public getActivityBackgroundColor()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->activityBackgroundColor:I

    return v0
.end method

.method public getButtonColor()I
    .locals 1

    .line 57
    iget v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->buttonColor:I

    return v0
.end method

.method public getTitleColor()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->titleColor:I

    return v0
.end method

.method public setActivityBackgroundColor(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->activityBackgroundColor:I

    .line 70
    return-void
.end method

.method public setButtonColor(I)V
    .locals 0

    .line 61
    iput p1, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->buttonColor:I

    .line 62
    return-void
.end method

.method public setTitleColor(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->titleColor:I

    .line 54
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 43
    iget v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->titleColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 44
    iget v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->buttonColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 45
    iget v0, p0, Lcom/unionpay/tsmservice/data/ApplyActivityStyle;->activityBackgroundColor:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    return-void
.end method
