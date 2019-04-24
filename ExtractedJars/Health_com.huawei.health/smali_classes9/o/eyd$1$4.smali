.class Lo/eyd$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyd$1;->c(Lo/eih;Lo/eic;Lo/eiv;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eiv;

.field final synthetic c:Lo/eyd$1;


# direct methods
.method constructor <init>(Lo/eyd$1;Lo/eiv;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lo/eyd$1$4;->c:Lo/eyd$1;

    iput-object p2, p0, Lo/eyd$1$4;->b:Lo/eiv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)F
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)F"
        }
    .end annotation

    .line 222
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 223
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 225
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 226
    instance-of v0, v2, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-nez v0, :cond_2

    .line 227
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mMotionTypeCalculator not instanceof HwHealthBarEntry! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 230
    :cond_2
    const/4 v3, 0x0

    .line 231
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 232
    move-object v6, v5

    check-cast v6, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 233
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/eiw;

    move-object v7, v0

    check-cast v7, Lo/eiw;

    .line 234
    iget-object v0, p0, Lo/eyd$1$4;->b:Lo/eiv;

    invoke-virtual {v7, v0}, Lo/eiw;->d(Lo/eiv;)F

    move-result v0

    add-float/2addr v3, v0

    .line 235
    goto :goto_0

    .line 236
    :cond_3
    return v3
.end method
