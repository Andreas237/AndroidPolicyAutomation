.class public Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;
.super Lcom/github/mikephil/charting/data/Entry;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/commonui/linechart/common/HwEntrys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "HwDataEntry"
.end annotation


# instance fields
.field public dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

.field public entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/github/mikephil/charting/data/Entry;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->entry:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 31
    iput-object p2, p0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;->dataSet:Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;

    .line 32
    return-void
.end method
