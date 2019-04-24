.class Lo/eye$1$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eye$1;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eye$1;


# direct methods
.method constructor <init>(Lo/eye$1;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lo/eye$1$4;->e:Lo/eye$1;

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

    .line 156
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 157
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 159
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 160
    instance-of v0, v2, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-nez v0, :cond_2

    .line 161
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "calculateSum not instanceof HwHealthBarEntry! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 163
    :cond_2
    move-object v0, v2

    check-cast v0, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/ehz;

    move-object v3, v0

    check-cast v3, Lo/ehz;

    .line 166
    instance-of v0, v3, Lo/eyg;

    if-nez v0, :cond_4

    .line 167
    const/4 v4, 0x0

    .line 168
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

    .line 169
    move-object v7, v6

    check-cast v7, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 170
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/ehz;

    move-object v8, v0

    check-cast v8, Lo/ehz;

    .line 171
    invoke-virtual {v8}, Lo/ehz;->c()F

    move-result v0

    add-float/2addr v4, v0

    .line 172
    goto :goto_0

    .line 173
    :cond_3
    return v4

    .line 177
    :cond_4
    const/4 v4, 0x0

    .line 178
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 179
    move-object v7, v6

    check-cast v7, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 180
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/eyg;

    .line 181
    invoke-virtual {v8}, Lo/eyg;->e()F

    move-result v0

    add-float/2addr v4, v0

    .line 182
    goto :goto_1

    .line 183
    :cond_5
    return v4
.end method
