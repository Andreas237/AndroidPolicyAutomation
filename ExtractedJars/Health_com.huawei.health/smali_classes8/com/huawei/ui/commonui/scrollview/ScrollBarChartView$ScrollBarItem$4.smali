.class final Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1401
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)[Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;
    .locals 1

    .line 1409
    new-array v0, p1, [Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    return-object v0
.end method

.method public c(Landroid/os/Parcel;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;
    .locals 1

    .line 1404
    new-instance v0, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    invoke-direct {v0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1401
    invoke-virtual {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem$4;->c(Landroid/os/Parcel;)Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1401
    invoke-virtual {p0, p1}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem$4;->a(I)[Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView$ScrollBarItem;

    move-result-object v0

    return-object v0
.end method
