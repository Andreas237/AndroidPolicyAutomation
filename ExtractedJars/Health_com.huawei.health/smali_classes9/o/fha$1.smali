.class Lo/fha$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fha;


# direct methods
.method constructor <init>(Lo/fha;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/fha$1;->e:Lo/fha;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 105
    iget-object v0, p0, Lo/fha$1;->e:Lo/fha;

    invoke-static {v0}, Lo/fha;->b(Lo/fha;)Lo/fha$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lo/fha$1;->e:Lo/fha;

    invoke-static {v0}, Lo/fha;->b(Lo/fha;)Lo/fha$b;

    move-result-object v0

    iget-object v1, p0, Lo/fha$1;->e:Lo/fha;

    invoke-virtual {v1}, Lo/fha;->getCurrentPosition()I

    move-result v1

    iget-object v2, p0, Lo/fha$1;->e:Lo/fha;

    invoke-virtual {v2}, Lo/fha;->getSelectionItem()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/fha$b;->d(ILjava/lang/Object;)V

    .line 108
    :cond_0
    return-void
.end method
