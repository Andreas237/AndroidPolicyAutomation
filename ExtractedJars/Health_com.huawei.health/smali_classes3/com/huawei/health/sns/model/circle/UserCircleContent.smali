.class public Lcom/huawei/health/sns/model/circle/UserCircleContent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CIRCLE_TYPE_HTML_CONTENT:I = 0x1

.field public static final CIRCLE_TYPE_PIC:I = 0x0

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/sns/model/circle/UserCircleContent;>;"
        }
    .end annotation
.end field


# instance fields
.field private circleContent:Ljava/lang/String;

.field private circleId:I

.field private circleType:I

.field private id:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/health/sns/model/circle/UserCircleContent$1;

    invoke-direct {v0}, Lcom/huawei/health/sns/model/circle/UserCircleContent$1;-><init>()V

    sput-object v0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->id:I

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleId:I

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleType:I

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleContent:Ljava/lang/String;

    .line 96
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 62
    const/4 v0, 0x0

    return v0
.end method

.method public getCircleContent()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleContent:Ljava/lang/String;

    .line 43
    return-object v0
.end method

.method public getCircleType()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleType:I

    .line 32
    return v0
.end method

.method public setCircleContent(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleContent:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public setCircleId(I)V
    .locals 0

    .line 26
    iput p1, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleId:I

    .line 27
    return-void
.end method

.method public setCircleType(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleType:I

    .line 38
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 68
    iget v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    iget v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    iget v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    iget-object v0, p0, Lcom/huawei/health/sns/model/circle/UserCircleContent;->circleContent:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 72
    return-void
.end method
