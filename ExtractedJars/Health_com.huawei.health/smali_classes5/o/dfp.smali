.class public Lo/dfp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfp;->d:Ljava/util/List;

    .line 76
    new-instance v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;-><init>()V

    iput-object v0, p0, Lo/dfp;->b:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    .line 77
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/fitnessdatatype/DataTotalMotion;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/dfp;->d:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public c(I)V
    .locals 1

    .line 45
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/dfp;->a:I

    .line 46
    return-void
.end method

.method public d()I
    .locals 1

    .line 38
    iget v0, p0, Lo/dfp;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public d(Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;)V
    .locals 1

    .line 67
    .line 68
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    iput-object v0, p0, Lo/dfp;->b:Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartRateDetectRet;

    .line 69
    return-void
.end method
