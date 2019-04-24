.class Lo/eye$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eye$4;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eye$4;


# direct methods
.method constructor <init>(Lo/eye$4;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lo/eye$4$1;->d:Lo/eye$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)F
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)F"
        }
    .end annotation

    .line 122
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 123
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 125
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 126
    instance-of v0, v2, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-nez v0, :cond_2

    .line 127
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mAvgCalculator not instanceof HwHealthBarEntry! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_2
    const/4 v3, 0x0

    .line 131
    const/4 v4, 0x0

    .line 132
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 133
    move-object v7, v6

    check-cast v7, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 134
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/ehz;

    move-object v8, v0

    check-cast v8, Lo/ehz;

    .line 135
    invoke-virtual {v8}, Lo/ehz;->c()F

    move-result v0

    add-float/2addr v3, v0

    .line 136
    add-int/lit8 v4, v4, 0x1

    .line 137
    goto :goto_0

    .line 138
    :cond_3
    int-to-float v0, v4

    div-float v0, v3, v0

    return v0
.end method
