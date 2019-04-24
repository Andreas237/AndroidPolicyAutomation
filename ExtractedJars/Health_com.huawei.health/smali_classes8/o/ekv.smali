.class public abstract Lo/ekv;
.super Lo/eij;
.source "SourceFile"

# interfaces
.implements Lo/ekz;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ekv$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/eij<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Lo/ekz;"
    }
.end annotation


# instance fields
.field private A:Landroid/graphics/DashPathEffect;

.field private B:Lo/ejr;

.field private C:F

.field private D:F

.field private G:Z

.field private H:Z

.field private j:F

.field private w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private x:Lo/ekv$a;

.field private z:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 84
    invoke-direct {p0, p1, p2}, Lo/eij;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 38
    sget-object v0, Lo/ekv$a;->c:Lo/ekv$a;

    iput-object v0, p0, Lo/ekv;->x:Lo/ekv$a;

    .line 43
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Lo/ekv;->z:I

    .line 53
    const/high16 v0, 0x41000000    # 8.0f

    iput v0, p0, Lo/ekv;->D:F

    .line 58
    const/high16 v0, 0x40800000    # 4.0f

    iput v0, p0, Lo/ekv;->C:F

    .line 63
    const v0, 0x3e4ccccd    # 0.2f

    iput v0, p0, Lo/ekv;->j:F

    .line 68
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ekv;->A:Landroid/graphics/DashPathEffect;

    .line 73
    new-instance v0, Lo/ekk;

    invoke-direct {v0}, Lo/ekk;-><init>()V

    iput-object v0, p0, Lo/ekv;->B:Lo/ejr;

    .line 78
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ekv;->H:Z

    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ekv;->G:Z

    .line 89
    iget-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    .line 92
    :cond_0
    iget-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 97
    iget-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    const/16 v1, 0x8c

    const/16 v2, 0xea

    const/16 v3, 0xff

    invoke-static {v1, v2, v3}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    return-void
.end method


# virtual methods
.method public K()F
    .locals 1

    .line 163
    iget v0, p0, Lo/ekv;->D:F

    return v0
.end method

.method public L()F
    .locals 1

    .line 142
    iget v0, p0, Lo/ekv;->j:F

    return v0
.end method

.method public R()Landroid/graphics/DashPathEffect;
    .locals 1

    .line 236
    iget-object v0, p0, Lo/ekv;->A:Landroid/graphics/DashPathEffect;

    return-object v0
.end method

.method public Y()Z
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 263
    iget-object v0, p0, Lo/ekv;->x:Lo/ekv$a;

    sget-object v1, Lo/ekv$a;->d:Lo/ekv$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ac()Z
    .locals 1

    .line 251
    iget-boolean v0, p0, Lo/ekv;->H:Z

    return v0
.end method

.method public ae()V
    .locals 1

    .line 353
    iget-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    if-nez v0, :cond_0

    .line 354
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    .line 356
    :cond_0
    iget-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 357
    return-void
.end method

.method protected b(FLo/ejp;)Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;
    .locals 4

    .line 416
    instance-of v0, p2, Lo/eju;

    if-eqz v0, :cond_0

    .line 417
    move-object v2, p2

    check-cast v2, Lo/eju;

    .line 418
    invoke-virtual {v2}, Lo/eju;->a()Lo/eju$c;

    move-result-object v3

    .line 420
    instance-of v0, v3, Lo/eju$a;

    if-eqz v0, :cond_0

    .line 422
    new-instance v0, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;

    invoke-direct {v0, p1, p2}, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;-><init>(FLo/ejp;)V

    return-object v0

    .line 426
    :cond_0
    invoke-static {p2}, Lo/ejx;->e(Lo/ejp;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 428
    new-instance v0, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;

    invoke-direct {v0, p1, p2}, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;-><init>(FLo/ejp;)V

    return-object v0

    .line 431
    :cond_1
    instance-of v0, p2, Lo/eis;

    if-nez v0, :cond_2

    .line 432
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not LineChartDataStorageModel,logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 434
    :cond_2
    new-instance v0, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;

    invoke-direct {v0, p1, p2}, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;-><init>(FLo/ejp;)V

    return-object v0
.end method

.method public e(Lo/ekv$a;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/ekv;->x:Lo/ekv$a;

    .line 122
    return-void
.end method

.method public f(Z)V
    .locals 0

    .line 379
    iput-boolean p1, p0, Lo/ekv;->G:Z

    .line 380
    return-void
.end method

.method public h()Lo/ekv$a;
    .locals 1

    .line 112
    iget-object v0, p0, Lo/ekv;->x:Lo/ekv$a;

    return-object v0
.end method

.method public i(F)V
    .locals 2

    .line 154
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    .line 155
    invoke-static {p1}, Lo/oc;->b(F)F

    move-result v0

    iput v0, p0, Lo/ekv;->D:F

    goto :goto_0

    .line 157
    :cond_0
    const-string v0, "LineDataSet"

    const-string v1, "Circle radius cannot be < 1"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    :goto_0
    return-void
.end method

.method public i(I)V
    .locals 2

    .line 345
    invoke-virtual {p0}, Lo/ekv;->ae()V

    .line 346
    iget-object v0, p0, Lo/ekv;->w:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 347
    return-void
.end method

.method public i(Z)V
    .locals 0

    .line 246
    iput-boolean p1, p0, Lo/ekv;->H:Z

    .line 247
    return-void
.end method
