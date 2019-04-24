.class public Lcom/huawei/ui/commonui/linechart/common/HwEntrys;
.super Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/commonui/linechart/common/HwEntrys$b;,
        Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;
    }
.end annotation


# instance fields
.field entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 14
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;-><init>(FF)V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->entries:Ljava/util/List;

    .line 15
    return-void
.end method


# virtual methods
.method public add(Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;)V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->entries:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 46
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getEntries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwEntrys$HwDataEntry;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/huawei/ui/commonui/linechart/common/HwEntrys;->entries:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 52
    invoke-super {p0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->hashCode()I

    move-result v0

    return v0
.end method
