.class Lo/fcs$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcs;->getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lo/fcs;

.field final synthetic d:Lo/fcs$d;


# direct methods
.method constructor <init>(Lo/fcs;Lo/fcs$d;II)V
    .locals 0

    .line 170
    iput-object p1, p0, Lo/fcs$4;->c:Lo/fcs;

    iput-object p2, p0, Lo/fcs$4;->d:Lo/fcs$d;

    iput p3, p0, Lo/fcs$4;->a:I

    iput p4, p0, Lo/fcs$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 173
    iget-object v0, p0, Lo/fcs$4;->d:Lo/fcs$d;

    iget-object v0, v0, Lo/fcs$d;->i:Landroid/widget/CheckBox;

    invoke-virtual {v0, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 174
    iget v0, p0, Lo/fcs$4;->a:I

    iget-object v1, p0, Lo/fcs$4;->c:Lo/fcs;

    invoke-static {v1}, Lo/fcs;->d(Lo/fcs;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 175
    iget-object v0, p0, Lo/fcs$4;->c:Lo/fcs;

    invoke-static {v0}, Lo/fcs;->d(Lo/fcs;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lo/fcs$4;->a:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget v1, p0, Lo/fcs$4;->b:I

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 177
    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 178
    const/4 v0, -0x1

    iput v0, v3, Landroid/os/Message;->what:I

    .line 179
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 180
    iget-object v0, p0, Lo/fcs$4;->c:Lo/fcs;

    invoke-static {v0}, Lo/fcs;->c(Lo/fcs;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 182
    :cond_0
    return-void
.end method
