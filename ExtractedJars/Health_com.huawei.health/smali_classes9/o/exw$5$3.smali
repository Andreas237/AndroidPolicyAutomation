.class Lo/exw$5$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exw$5;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exw$5;


# direct methods
.method constructor <init>(Lo/exw$5;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/exw$5$3;->a:Lo/exw$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)F
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)F"
        }
    .end annotation

    .line 113
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 114
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_1
    const/4 v1, 0x0

    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 120
    invoke-virtual {v4}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    add-float/2addr v1, v0

    .line 121
    add-int/lit8 v2, v2, 0x1

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    if-lez v2, :cond_3

    .line 124
    int-to-float v0, v2

    div-float v0, v1, v0

    return v0

    .line 126
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
