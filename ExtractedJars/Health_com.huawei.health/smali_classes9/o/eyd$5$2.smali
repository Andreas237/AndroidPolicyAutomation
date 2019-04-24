.class Lo/eyd$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyd$5;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eyd$5;


# direct methods
.method constructor <init>(Lo/eyd$5;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lo/eyd$5$2;->d:Lo/eyd$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)F
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)F"
        }
    .end annotation

    .line 126
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 127
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 129
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 130
    instance-of v0, v2, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-nez v0, :cond_2

    .line 131
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mAvgCalculator not instanceof HwHealthBarEntry! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_2
    move-object v0, v2

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/ehz;

    move-object v3, v0

    check-cast v3, Lo/ehz;

    .line 136
    instance-of v0, v3, Lo/eyg;

    if-nez v0, :cond_4

    .line 137
    const/4 v4, 0x0

    .line 138
    const/4 v5, 0x0

    .line 139
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 140
    move-object v8, v7

    check-cast v8, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 141
    invoke-virtual {v8}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v9

    .line 142
    invoke-static {v9}, Lo/eko;->d(Lo/ejp;)F

    move-result v0

    add-float/2addr v4, v0

    .line 143
    add-int/lit8 v5, v5, 0x1

    .line 144
    goto :goto_0

    .line 145
    :cond_3
    int-to-float v0, v5

    div-float v0, v4, v0

    return v0

    .line 148
    :cond_4
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 151
    move-object v8, v7

    check-cast v8, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 152
    invoke-virtual {v8}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/eyg;

    .line 153
    invoke-virtual {v9}, Lo/eyg;->e()F

    move-result v0

    add-float/2addr v4, v0

    .line 154
    invoke-virtual {v9}, Lo/eyg;->b()I

    move-result v0

    add-int/2addr v5, v0

    .line 155
    goto :goto_1

    .line 156
    :cond_5
    int-to-float v0, v5

    div-float v0, v4, v0

    return v0
.end method
