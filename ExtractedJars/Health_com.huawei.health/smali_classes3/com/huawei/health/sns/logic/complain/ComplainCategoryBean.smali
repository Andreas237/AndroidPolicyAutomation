.class public Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private name:Ljava/lang/String;

.field private value:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 59
    new-instance v0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean$3;

    invoke-direct {v0}, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean$3;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->name:Ljava/lang/String;

    .line 77
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->value:I

    .line 78
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 49
    const/4 v0, 0x0

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->name:Ljava/lang/String;

    .line 22
    return-object v0
.end method

.method public getValue()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->value:I

    .line 38
    return v0
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->name:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setValue(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->value:I

    .line 44
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->name:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    iget v0, p0, Lcom/huawei/health/sns/logic/complain/ComplainCategoryBean;->value:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 57
    return-void
.end method
