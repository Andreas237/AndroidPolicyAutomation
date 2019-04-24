.class Lo/dyl$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dyl;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dyl;

.field final synthetic e:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lo/dyl;Ljava/util/ArrayList;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/dyl$2;->c:Lo/dyl;

    iput-object p2, p0, Lo/dyl$2;->e:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 85
    if-ltz p3, :cond_1

    iget-object v0, p0, Lo/dyl$2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p3, v0, :cond_1

    .line 86
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 87
    iget-object v0, p0, Lo/dyl$2;->c:Lo/dyl;

    invoke-static {v0}, Lo/dyl;->b(Lo/dyl;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/dyl$2;->c:Lo/dyl;

    invoke-static {v1}, Lo/dyl;->c(Lo/dyl;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lo/dyl$2;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 88
    iget-object v0, p0, Lo/dyl$2;->c:Lo/dyl;

    invoke-static {v0}, Lo/dyl;->d(Lo/dyl;)Ljava/util/HashMap;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/dyl$2;->c:Lo/dyl;

    invoke-static {v0}, Lo/dyl;->d(Lo/dyl;)Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lo/dyl$2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/os/Bundle;

    .line 90
    const-string v0, "tag"

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 92
    :cond_0
    iget-object v0, p0, Lo/dyl$2;->c:Lo/dyl;

    invoke-static {v0}, Lo/dyl;->b(Lo/dyl;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 93
    iget-object v0, p0, Lo/dyl$2;->c:Lo/dyl;

    invoke-static {v0}, Lo/dyl;->e(Lo/dyl;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 95
    :cond_1
    return-void
.end method
