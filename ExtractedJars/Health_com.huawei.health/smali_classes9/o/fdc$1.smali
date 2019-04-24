.class Lo/fdc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fdc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fdc;


# direct methods
.method constructor <init>(Lo/fdc;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lo/fdc$1;->b:Lo/fdc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 239
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    .line 240
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->e()Ljava/util/List;

    move-result-object v2

    .line 241
    iget-object v0, p0, Lo/fdc$1;->b:Lo/fdc;

    invoke-static {v0}, Lo/fdc;->e(Lo/fdc;)Lo/elp;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lo/fdc$1;->b:Lo/fdc;

    invoke-static {v0}, Lo/fdc;->e(Lo/fdc;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 245
    :cond_0
    iget-object v0, p0, Lo/fdc$1;->b:Lo/fdc;

    invoke-static {v0, v1, v2}, Lo/fdc;->b(Lo/fdc;Ljava/lang/Integer;Ljava/util/List;)V

    .line 247
    return-void
.end method
