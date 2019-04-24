.class public Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ScrollBarItem"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;>;"
        }
    .end annotation
.end field


# instance fields
.field public flag:I

.field public flag_next:I

.field public isShowSubLable:Z

.field public label:Ljava/lang/String;

.field public left_skip:I

.field public right_skip:I

.field public subLable:Ljava/lang/String;

.field public value:D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1401
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem$4;

    invoke-direct {v0}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem$4;-><init>()V

    sput-object v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1387
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1388
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 1390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1391
    invoke-virtual {p1}, Landroid/os/Parcel;->readDouble()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    .line 1392
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    .line 1393
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag_next:I

    .line 1394
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    .line 1395
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    .line 1396
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    .line 1397
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    .line 1398
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    .line 1399
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1372
    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1377
    iget-wide v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->value:D

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeDouble(D)V

    .line 1378
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1379
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->flag_next:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1380
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->label:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1381
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->left_skip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1382
    iget v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->right_skip:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1383
    iget-object v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->subLable:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1384
    iget-boolean v0, p0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;->isShowSubLable:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1385
    return-void
.end method
