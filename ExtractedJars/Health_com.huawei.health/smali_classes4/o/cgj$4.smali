.class Lo/cgj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ekm$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgj;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cgj;


# direct methods
.method constructor <init>(Lo/cgj;)V
    .locals 0

    .line 183
    iput-object p1, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/ekm$c;Z)V
    .locals 5

    .line 185
    const-string v0, "Track_TrackLineChartActivityChartFrag"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onLineStatusChanged refresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0, p1, p2}, Lo/cgj;->e(Lo/cgj;Lo/ekm$c;Z)V

    .line 187
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->b(Lo/cgj;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/elb;

    .line 188
    if-eqz v4, :cond_0

    if-nez p2, :cond_0

    .line 189
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->e(Lo/cgj;)Lo/cfe;

    move-result-object v0

    iget-object v1, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v1}, Lo/cgj;->d(Lo/cgj;)Lo/ekw;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/cfe;->b(Lo/ekw;Lo/elb;)V

    .line 190
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->b(Lo/cgj;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 191
    :cond_0
    if-nez v4, :cond_1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    .line 192
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0, p1}, Lo/cgj;->a(Lo/cgj;Lo/ekm$c;)Lo/elb;

    move-result-object v4

    .line 193
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->b(Lo/cgj;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/cgj$4;->c:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->d(Lo/cgj;)Lo/ekw;

    move-result-object v0

    invoke-virtual {v0}, Lo/ekw;->c()V

    .line 196
    return-void
.end method
