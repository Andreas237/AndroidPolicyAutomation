.class Lo/few$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/few;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/few;


# direct methods
.method constructor <init>(Lo/few;)V
    .locals 0

    .line 465
    iput-object p1, p0, Lo/few$1;->e:Lo/few;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 468
    const-string v0, "AbstractPanelListAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "post--lv_content = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v2}, Lo/few;->b(Lo/few;)Landroid/widget/ListView;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/ListView;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 469
    iget-object v0, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v0}, Lo/few;->c(Lo/few;)V

    .line 470
    iget-object v0, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v0}, Lo/few;->e(Lo/few;)V

    .line 472
    iget-object v0, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v0}, Lo/few;->b(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v1}, Lo/few;->d(Lo/few;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 473
    iget-object v0, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v0}, Lo/few;->a(Lo/few;)Landroid/widget/ListView;

    move-result-object v0

    iget-object v1, p0, Lo/few$1;->e:Lo/few;

    invoke-static {v1}, Lo/few;->d(Lo/few;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 474
    return-void
.end method
