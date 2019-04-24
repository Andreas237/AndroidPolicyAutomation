.class Lo/bsq$11;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(IIILjava/util/List;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsr;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic g:Lo/bsq;

.field final synthetic i:I


# direct methods
.method constructor <init>(Lo/bsq;Lo/bsr;Ljava/util/List;IIII)V
    .locals 0

    .line 1677
    iput-object p1, p0, Lo/bsq$11;->g:Lo/bsq;

    iput-object p2, p0, Lo/bsq$11;->a:Lo/bsr;

    iput-object p3, p0, Lo/bsq$11;->b:Ljava/util/List;

    iput p4, p0, Lo/bsq$11;->c:I

    iput p5, p0, Lo/bsq$11;->e:I

    iput p6, p0, Lo/bsq$11;->d:I

    iput p7, p0, Lo/bsq$11;->i:I

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 9

    .line 1687
    invoke-static {p1}, Lo/bso;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v6

    .line 1688
    const-string v0, "DataImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorListCloud onSuccess :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1689
    iget-object v0, p0, Lo/bsq$11;->b:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1691
    const-string v0, "total"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    .line 1692
    if-ltz v7, :cond_0

    iget v0, p0, Lo/bsq$11;->c:I

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    if-ge v0, v7, :cond_1

    :cond_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/bsq$11;->e:I

    if-ge v0, v1, :cond_2

    :cond_1
    const/4 v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    .line 1693
    :goto_0
    iget v0, p0, Lo/bsq$11;->d:I

    const/16 v1, 0x32

    if-le v0, v1, :cond_3

    if-nez v8, :cond_3

    .line 1694
    iget-object v0, p0, Lo/bsq$11;->g:Lo/bsq;

    iget v1, p0, Lo/bsq$11;->c:I

    add-int/lit8 v1, v1, 0x32

    iget v2, p0, Lo/bsq$11;->d:I

    add-int/lit8 v2, v2, -0x32

    iget v3, p0, Lo/bsq$11;->i:I

    iget-object v4, p0, Lo/bsq$11;->b:Ljava/util/List;

    iget-object v5, p0, Lo/bsq$11;->a:Lo/bsr;

    invoke-static/range {v0 .. v5}, Lo/bsq;->a(Lo/bsq;IIILjava/util/List;Lo/bsr;)V

    goto :goto_1

    .line 1696
    :cond_3
    iget-object v0, p0, Lo/bsq$11;->a:Lo/bsr;

    invoke-virtual {v0, p1}, Lo/bsr;->b(Lorg/json/JSONObject;)V

    .line 1698
    :goto_1
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1681
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getBehaviorListCloud getWorkouts:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1682
    iget-object v0, p0, Lo/bsq$11;->a:Lo/bsr;

    invoke-virtual {v0, p1, p2}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 1683
    return-void
.end method
