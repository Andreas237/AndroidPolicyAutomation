.class Lo/ahq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahq;->e(Lo/ahq$e;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ahq$e;

.field final synthetic d:Lo/ahp;

.field final synthetic e:Lo/ahq;


# direct methods
.method constructor <init>(Lo/ahq;Lo/ahp;Lo/ahq$e;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/ahq$1;->e:Lo/ahq;

    iput-object p2, p0, Lo/ahq$1;->d:Lo/ahp;

    iput-object p3, p0, Lo/ahq$1;->a:Lo/ahq$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 81
    iget-object v0, p0, Lo/ahq$1;->d:Lo/ahp;

    iget-boolean v0, v0, Lo/ahp;->a:Z

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p0, Lo/ahq$1;->a:Lo/ahq$e;

    iget-object v0, v0, Lo/ahq$e;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_list_checkbox_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 83
    iget-object v0, p0, Lo/ahq$1;->d:Lo/ahp;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/ahp;->a:Z

    .line 84
    iget-object v0, p0, Lo/ahq$1;->e:Lo/ahq;

    invoke-static {v0}, Lo/ahq;->c(Lo/ahq;)I

    .line 85
    iget-object v0, p0, Lo/ahq$1;->e:Lo/ahq;

    invoke-static {v0}, Lo/ahq;->d(Lo/ahq;)Lo/ajl;

    move-result-object v0

    iget-object v1, p0, Lo/ahq$1;->e:Lo/ahq;

    iget-object v1, v1, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lo/ahq$1;->e:Lo/ahq;

    invoke-static {v2}, Lo/ahq;->a(Lo/ahq;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/ajl;->selectItem(II)V

    goto :goto_0

    .line 87
    :cond_0
    iget-object v0, p0, Lo/ahq$1;->a:Lo/ahq$e;

    iget-object v0, v0, Lo/ahq$e;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_list_checkbox_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 88
    iget-object v0, p0, Lo/ahq$1;->d:Lo/ahp;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/ahp;->a:Z

    .line 89
    iget-object v0, p0, Lo/ahq$1;->e:Lo/ahq;

    invoke-static {v0}, Lo/ahq;->e(Lo/ahq;)I

    .line 90
    iget-object v0, p0, Lo/ahq$1;->e:Lo/ahq;

    invoke-static {v0}, Lo/ahq;->d(Lo/ahq;)Lo/ajl;

    move-result-object v0

    iget-object v1, p0, Lo/ahq$1;->e:Lo/ahq;

    iget-object v1, v1, Lo/ahq;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lo/ahq$1;->e:Lo/ahq;

    invoke-static {v2}, Lo/ahq;->a(Lo/ahq;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/ajl;->selectItem(II)V

    .line 92
    :goto_0
    return-void
.end method
