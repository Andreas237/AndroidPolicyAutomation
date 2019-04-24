.class Lo/eyk$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/faa$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyk;->a(Ljava/util/List;Lo/ejf;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eyk;


# direct methods
.method constructor <init>(Lo/eyk;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lo/eyk$4;->e:Lo/eyk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 206
    iget-object v0, p0, Lo/eyk$4;->e:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->b(Lo/eyk;)Lo/eyl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/eyl;->c(I)V

    .line 207
    iget-object v0, p0, Lo/eyk$4;->e:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->e(Lo/eyk;)Lo/eyk$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lo/eyk$4;->e:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->e(Lo/eyk;)Lo/eyk$b;

    move-result-object v0

    iget-object v1, p0, Lo/eyk$4;->e:Lo/eyk;

    invoke-static {v1}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    check-cast v1, Landroid/view/View;

    invoke-interface {v0, v1, p1}, Lo/eyk$b;->b(Landroid/view/View;I)V

    .line 210
    :cond_0
    iget-object v0, p0, Lo/eyk$4;->e:Lo/eyk;

    invoke-static {v0}, Lo/eyk;->c(Lo/eyk;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/eyk$e;

    invoke-interface {v0}, Lo/eyk$e;->b()V

    .line 211
    return-void
.end method
