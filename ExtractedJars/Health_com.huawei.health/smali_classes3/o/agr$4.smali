.class Lo/agr$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agr;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/agr$d;

.field final synthetic b:I

.field final synthetic c:Lo/agr;


# direct methods
.method constructor <init>(Lo/agr;Lo/agr$d;I)V
    .locals 0

    .line 104
    iput-object p1, p0, Lo/agr$4;->c:Lo/agr;

    iput-object p2, p0, Lo/agr$4;->a:Lo/agr$d;

    iput p3, p0, Lo/agr$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 4

    .line 107
    iget-object v0, p0, Lo/agr$4;->a:Lo/agr$d;

    iget-object v0, v0, Lo/agr$d;->b:Landroid/widget/CheckBox;

    invoke-virtual {v0, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 108
    iget-object v0, p0, Lo/agr$4;->c:Lo/agr;

    invoke-static {v0}, Lo/agr;->c(Lo/agr;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lo/agr$4;->b:I

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 109
    new-instance v3, Landroid/os/Message;

    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 110
    const/4 v0, -0x1

    iput v0, v3, Landroid/os/Message;->what:I

    .line 111
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lo/agr$4;->c:Lo/agr;

    invoke-static {v0}, Lo/agr;->b(Lo/agr;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 113
    return-void
.end method
