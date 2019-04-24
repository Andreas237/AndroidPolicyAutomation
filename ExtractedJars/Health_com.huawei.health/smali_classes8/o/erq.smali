.class public abstract Lo/erq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected d:I

.field protected e:I

.field protected i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/erq;->i:Z

    return-void
.end method


# virtual methods
.method public c(I)Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;
    .locals 5

    .line 44
    iget-boolean v0, p0, Lo/erq;->i:Z

    if-nez v0, :cond_0

    .line 45
    const-string v0, "Track_SportLevelByVo2Max"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "never init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    new-instance v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>(II)V

    return-object v0

    .line 50
    :cond_0
    new-instance v4, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;

    invoke-direct {v4}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;-><init>()V

    .line 51
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveReason(I)V

    .line 52
    int-to-double v0, p1

    invoke-virtual {v4, v0, v1}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveValue(D)V

    .line 53
    iget v0, p0, Lo/erq;->d:I

    if-gt p1, v0, :cond_1

    .line 54
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveLevel(I)V

    goto :goto_0

    .line 56
    :cond_1
    iget v0, p0, Lo/erq;->c:I

    if-gt p1, v0, :cond_2

    .line 57
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveLevel(I)V

    goto :goto_0

    .line 59
    :cond_2
    iget v0, p0, Lo/erq;->b:I

    if-gt p1, v0, :cond_3

    .line 60
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveLevel(I)V

    goto :goto_0

    .line 62
    :cond_3
    iget v0, p0, Lo/erq;->e:I

    if-gt p1, v0, :cond_4

    .line 63
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveLevel(I)V

    goto :goto_0

    .line 65
    :cond_4
    iget v0, p0, Lo/erq;->a:I

    if-gt p1, v0, :cond_5

    .line 66
    const/4 v0, 0x4

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveLevel(I)V

    goto :goto_0

    .line 69
    :cond_5
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/SportLevel;->saveLevel(I)V

    .line 72
    :goto_0
    return-object v4
.end method
