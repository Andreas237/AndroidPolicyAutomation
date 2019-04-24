.class public Lcom/huawei/hihealth/device/open/data/MeasureResultBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static prepareResult(Ljava/util/ArrayList;Ljava/util/ArrayList;)Lcom/huawei/hihealth/device/open/data/MeasureResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)Lcom/huawei/hihealth/device/open/data/MeasureResult;"
        }
    .end annotation

    .line 11
    new-instance v0, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v0
.end method
