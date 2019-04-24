.class Lo/exw$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exw$3;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/exw$3;


# direct methods
.method constructor <init>(Lo/exw$3;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lo/exw$3$4;->d:Lo/exw$3;

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

    .line 255
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 256
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 258
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 259
    instance-of v0, v2, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    if-nez v0, :cond_2

    .line 260
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "calculateMin not instanceof HwHealthBarEntry! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 262
    :cond_2
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 263
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 264
    move-object v6, v5

    check-cast v6, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;

    .line 265
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;->acquireModel()Lo/ejp;

    move-result-object v7

    .line 266
    invoke-static {v7}, Lo/eko;->c(Lo/ejp;)F

    move-result v0

    cmpl-float v0, v3, v0

    if-lez v0, :cond_3

    .line 267
    invoke-static {v7}, Lo/eko;->c(Lo/ejp;)F

    move-result v3

    .line 269
    :cond_3
    goto :goto_0

    .line 270
    :cond_4
    return v3
.end method
