.class public Lo/eqo;
.super Lo/erc;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Landroid/widget/ImageView;

.field private final d:Lo/eqp;

.field public e:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/content/Context;ZLo/eqp;)V
    .locals 2

    .line 26
    invoke-direct {p0, p1, p2, p3}, Lo/erc;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    .line 27
    sget v0, Lcom/huawei/ui/homehealth/R$id;->itemText:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/eqo;->a:Landroid/widget/TextView;

    .line 28
    sget v0, Lcom/huawei/ui/homehealth/R$id;->itemhandle:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/eqo;->b:Landroid/widget/ImageView;

    .line 29
    iput-object p4, p0, Lo/eqo;->d:Lo/eqp;

    .line 31
    iget-object v0, p0, Lo/eqo;->b:Landroid/widget/ImageView;

    new-instance v1, Lo/eqo$5;

    invoke-direct {v1, p0}, Lo/eqo$5;-><init>(Lo/eqo;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 40
    return-void
.end method

.method static synthetic e(Lo/eqo;)Lo/eqp;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/eqo;->d:Lo/eqp;

    return-object v0
.end method


# virtual methods
.method public b(Lo/eqn;)V
    .locals 5

    .line 50
    const-string v0, "FunctionSetCardManagementViewHolder"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bindViewHolder enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    move-object v4, p1

    .line 52
    iget-object v0, v4, Lo/eqn;->d:Ljava/lang/String;

    iput-object v0, p0, Lo/eqo;->e:Ljava/lang/String;

    .line 53
    iget-object v0, p0, Lo/eqo;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/eqo;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    return-void
.end method

.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 44
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isPressed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 45
    return-void

    .line 47
    :cond_0
    return-void
.end method
