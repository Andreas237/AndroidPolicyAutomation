.class Lo/bsq$42;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(ZII[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Integer;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:[Ljava/lang/Integer;

.field final synthetic e:[Ljava/lang/Integer;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:I

.field final synthetic h:[Ljava/lang/Integer;

.field final synthetic i:I

.field final synthetic k:Lo/bui;

.field final synthetic n:Z

.field final synthetic o:Lo/bsq;

.field final synthetic p:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lo/bsq;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;ILo/bui;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1084
    iput-object p1, p0, Lo/bsq$42;->o:Lo/bsq;

    iput p2, p0, Lo/bsq$42;->b:I

    iput p3, p0, Lo/bsq$42;->c:I

    iput-object p4, p0, Lo/bsq$42;->d:[Ljava/lang/Integer;

    iput-object p5, p0, Lo/bsq$42;->e:[Ljava/lang/Integer;

    iput-object p6, p0, Lo/bsq$42;->a:[Ljava/lang/Integer;

    iput p7, p0, Lo/bsq$42;->i:I

    iput-object p8, p0, Lo/bsq$42;->h:[Ljava/lang/Integer;

    iput-object p9, p0, Lo/bsq$42;->f:Ljava/lang/String;

    iput p10, p0, Lo/bsq$42;->g:I

    iput-object p11, p0, Lo/bsq$42;->k:Lo/bui;

    iput-object p12, p0, Lo/bsq$42;->p:Ljava/util/ArrayList;

    iput-boolean p13, p0, Lo/bsq$42;->n:Z

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 12

    .line 1094
    iget-object v0, p0, Lo/bsq$42;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1095
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "total"

    const-string v2, "total"

    iget-object v3, p0, Lo/bsq$42;->p:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v2}, Lo/caj;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1098
    :cond_0
    iget-object v0, p0, Lo/bsq$42;->o:Lo/bsq;

    iget-object v1, p0, Lo/bsq$42;->p:Ljava/util/ArrayList;

    iget-object v2, p0, Lo/bsq$42;->d:[Ljava/lang/Integer;

    iget-object v3, p0, Lo/bsq$42;->e:[Ljava/lang/Integer;

    iget-object v4, p0, Lo/bsq$42;->a:[Ljava/lang/Integer;

    iget-object v5, p0, Lo/bsq$42;->h:[Ljava/lang/Integer;

    iget v6, p0, Lo/bsq$42;->i:I

    iget-boolean v7, p0, Lo/bsq$42;->n:Z

    iget v8, p0, Lo/bsq$42;->b:I

    iget-object v9, p0, Lo/bsq$42;->f:Ljava/lang/String;

    iget v10, p0, Lo/bsq$42;->g:I

    iget v11, p0, Lo/bsq$42;->c:I

    invoke-static/range {v0 .. v11}, Lo/bsq;->b(Lo/bsq;Ljava/util/List;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;IZILjava/lang/String;II)V

    .line 1099
    iget-object v0, p0, Lo/bsq$42;->k:Lo/bui;

    iget-object v1, p0, Lo/bsq$42;->o:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$42;->p:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1104
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 11

    .line 1087
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkoutsFromCloud:"

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

    .line 1088
    iget-object v0, p0, Lo/bsq$42;->o:Lo/bsq;

    iget v1, p0, Lo/bsq$42;->b:I

    iget v2, p0, Lo/bsq$42;->c:I

    iget-object v3, p0, Lo/bsq$42;->d:[Ljava/lang/Integer;

    iget-object v4, p0, Lo/bsq$42;->e:[Ljava/lang/Integer;

    iget-object v5, p0, Lo/bsq$42;->a:[Ljava/lang/Integer;

    iget v6, p0, Lo/bsq$42;->i:I

    iget-object v7, p0, Lo/bsq$42;->h:[Ljava/lang/Integer;

    iget-object v8, p0, Lo/bsq$42;->f:Ljava/lang/String;

    iget v9, p0, Lo/bsq$42;->g:I

    invoke-static/range {v0 .. v9}, Lo/bsq;->d(Lo/bsq;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v10

    .line 1089
    iget-object v0, p0, Lo/bsq$42;->k:Lo/bui;

    iget-object v1, p0, Lo/bsq$42;->o:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v10}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1090
    return-void
.end method
