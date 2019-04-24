.class Lo/dyd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dyd;->setXAxisValueFormatter(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/List;

.field final synthetic c:I

.field final synthetic e:Lo/dyd;


# direct methods
.method constructor <init>(Lo/dyd;ILjava/util/List;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/dyd$2;->e:Lo/dyd;

    iput p2, p0, Lo/dyd$2;->c:I

    iput-object p3, p0, Lo/dyd$2;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 2

    .line 77
    float-to-int v1, p1

    .line 78
    if-gez v1, :cond_0

    .line 79
    const-string v0, ""

    return-object v0

    .line 80
    :cond_0
    iget v0, p0, Lo/dyd$2;->c:I

    if-ge v1, v0, :cond_1

    .line 81
    iget-object v0, p0, Lo/dyd$2;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 83
    :cond_1
    const-string v0, ""

    return-object v0
.end method
