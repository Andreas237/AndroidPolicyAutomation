.class Lo/eyd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eyv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eyd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/eyd;


# direct methods
.method constructor <init>(Lo/eyd;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lo/eyd$4;->d:Lo/eyd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eic;)F
    .locals 3

    .line 166
    iget-object v0, p0, Lo/eyd$4;->d:Lo/eyd;

    invoke-static {v0}, Lo/eyd;->b(Lo/eyd;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ehn;

    .line 168
    if-nez v2, :cond_0

    .line 169
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "calculateSum not find dataSet! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 171
    :cond_0
    new-instance v0, Lo/eyd$4$1;

    invoke-direct {v0, p0}, Lo/eyd$4$1;-><init>(Lo/eyd$4;)V

    invoke-virtual {v2, p1, v0}, Lo/ehn;->c(Lo/eih;Lo/ejv;)F

    move-result v0

    return v0
.end method