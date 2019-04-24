.class Lo/bsq$43;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lo/bsr;

.field final synthetic e:I

.field final synthetic f:[Ljava/lang/Integer;

.field final synthetic g:[Ljava/lang/Integer;

.field final synthetic h:I

.field final synthetic i:[Ljava/lang/Integer;

.field final synthetic k:[Ljava/lang/Integer;

.field final synthetic m:Ljava/lang/String;

.field final synthetic n:Lo/bsq;

.field final synthetic p:I


# direct methods
.method constructor <init>(Lo/bsq;Lo/bsr;Ljava/util/List;III[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)V
    .locals 0

    .line 1035
    iput-object p1, p0, Lo/bsq$43;->n:Lo/bsq;

    iput-object p2, p0, Lo/bsq$43;->d:Lo/bsr;

    iput-object p3, p0, Lo/bsq$43;->a:Ljava/util/List;

    iput p4, p0, Lo/bsq$43;->b:I

    iput p5, p0, Lo/bsq$43;->e:I

    iput p6, p0, Lo/bsq$43;->c:I

    iput-object p7, p0, Lo/bsq$43;->i:[Ljava/lang/Integer;

    iput-object p8, p0, Lo/bsq$43;->f:[Ljava/lang/Integer;

    iput-object p9, p0, Lo/bsq$43;->k:[Ljava/lang/Integer;

    iput p10, p0, Lo/bsq$43;->h:I

    iput-object p11, p0, Lo/bsq$43;->g:[Ljava/lang/Integer;

    iput-object p12, p0, Lo/bsq$43;->m:Ljava/lang/String;

    iput p13, p0, Lo/bsq$43;->p:I

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 15

    .line 1045
    invoke-static/range {p1 .. p1}, Lo/bso;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v12

    .line 1046
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getJoinedworkout getWorkoutsFromCloud :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    iget-object v0, p0, Lo/bsq$43;->a:Ljava/util/List;

    invoke-interface {v0, v12}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1049
    const-string v0, "total"

    move-object/from16 v1, p1

    const/4 v2, -0x1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    .line 1052
    if-ltz v13, :cond_0

    iget v0, p0, Lo/bsq$43;->b:I

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    if-ge v0, v13, :cond_1

    :cond_0
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lo/bsq$43;->e:I

    if-ge v0, v1, :cond_2

    :cond_1
    const/4 v14, 0x1

    goto :goto_0

    :cond_2
    const/4 v14, 0x0

    .line 1053
    :goto_0
    iget v0, p0, Lo/bsq$43;->c:I

    const/16 v1, 0x32

    if-le v0, v1, :cond_3

    if-nez v14, :cond_3

    .line 1054
    iget-object v0, p0, Lo/bsq$43;->n:Lo/bsq;

    iget v1, p0, Lo/bsq$43;->b:I

    add-int/lit8 v1, v1, 0x32

    iget v2, p0, Lo/bsq$43;->c:I

    add-int/lit8 v2, v2, -0x32

    iget-object v3, p0, Lo/bsq$43;->i:[Ljava/lang/Integer;

    iget-object v4, p0, Lo/bsq$43;->f:[Ljava/lang/Integer;

    iget-object v5, p0, Lo/bsq$43;->k:[Ljava/lang/Integer;

    iget v6, p0, Lo/bsq$43;->h:I

    iget-object v7, p0, Lo/bsq$43;->g:[Ljava/lang/Integer;

    iget-object v8, p0, Lo/bsq$43;->m:Ljava/lang/String;

    iget v9, p0, Lo/bsq$43;->p:I

    iget-object v10, p0, Lo/bsq$43;->a:Ljava/util/List;

    iget-object v11, p0, Lo/bsq$43;->d:Lo/bsr;

    invoke-static/range {v0 .. v11}, Lo/bsq;->d(Lo/bsq;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILjava/util/List;Lo/bsr;)V

    goto :goto_1

    .line 1056
    :cond_3
    iget-object v0, p0, Lo/bsq$43;->d:Lo/bsr;

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/bsr;->b(Lorg/json/JSONObject;)V

    .line 1058
    :goto_1
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1039
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkouts:"

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

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1040
    iget-object v0, p0, Lo/bsq$43;->d:Lo/bsr;

    invoke-virtual {v0, p1, p2}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 1041
    return-void
.end method
