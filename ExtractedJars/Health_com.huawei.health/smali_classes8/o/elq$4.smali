.class Lo/elq$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/mf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/elq;->setXAxisValueFormatter(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/elq;

.field final synthetic d:Ljava/util/List;


# direct methods
.method constructor <init>(Lo/elq;ILjava/util/List;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/elq$4;->c:Lo/elq;

    iput p2, p0, Lo/elq$4;->a:I

    iput-object p3, p0, Lo/elq$4;->d:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLo/lh;)Ljava/lang/String;
    .locals 2

    .line 141
    float-to-int v1, p1

    .line 142
    if-gez v1, :cond_0

    .line 143
    const-string v0, ""

    return-object v0

    .line 144
    :cond_0
    iget v0, p0, Lo/elq$4;->a:I

    if-ge v1, v0, :cond_1

    .line 145
    iget-object v0, p0, Lo/elq$4;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 147
    :cond_1
    const-string v0, ""

    return-object v0
.end method
