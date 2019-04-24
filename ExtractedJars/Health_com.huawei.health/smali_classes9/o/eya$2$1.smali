.class Lo/eya$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eya$2;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eya$2;


# direct methods
.method constructor <init>(Lo/eya$2;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/eya$2$1;->e:Lo/eya$2;

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

    .line 193
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 194
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 197
    :cond_1
    const/4 v1, 0x0

    .line 198
    const/4 v2, 0x0

    .line 199
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

    .line 200
    invoke-virtual {v4}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getY()F

    move-result v0

    add-float/2addr v1, v0

    .line 201
    add-int/lit8 v2, v2, 0x1

    .line 202
    goto :goto_0

    .line 203
    :cond_2
    if-lez v2, :cond_3

    .line 204
    int-to-float v0, v2

    div-float v0, v1, v0

    return v0

    .line 206
    :cond_3
    const/4 v0, 0x0

    return v0
.end method
