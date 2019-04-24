.class Lo/fcg$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fcg;->b(Lo/fcg$c;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fcg$c;

.field final synthetic c:Lo/fcg;

.field final synthetic d:Lo/aht;


# direct methods
.method constructor <init>(Lo/fcg;Lo/aht;Lo/fcg$c;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lo/fcg$4;->c:Lo/fcg;

    iput-object p2, p0, Lo/fcg$4;->d:Lo/aht;

    iput-object p3, p0, Lo/fcg$4;->b:Lo/fcg$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 106
    iget-object v0, p0, Lo/fcg$4;->d:Lo/aht;

    iget-boolean v0, v0, Lo/aht;->e:Z

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/fcg$4;->b:Lo/fcg$c;

    iget-object v0, v0, Lo/fcg$c;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_checkbox_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 108
    iget-object v0, p0, Lo/fcg$4;->d:Lo/aht;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/aht;->e:Z

    .line 109
    iget-object v0, p0, Lo/fcg$4;->c:Lo/fcg;

    invoke-static {v0}, Lo/fcg;->e(Lo/fcg;)I

    .line 110
    iget-object v0, p0, Lo/fcg$4;->c:Lo/fcg;

    invoke-static {v0}, Lo/fcg;->a(Lo/fcg;)Lo/fdk;

    move-result-object v0

    iget-object v1, p0, Lo/fcg$4;->c:Lo/fcg;

    iget-object v1, v1, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lo/fcg$4;->c:Lo/fcg;

    invoke-static {v2}, Lo/fcg;->c(Lo/fcg;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/fdk;->d(II)V

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lo/fcg$4;->b:Lo/fcg$c;

    iget-object v0, v0, Lo/fcg$c;->b:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$drawable;->btn_health_list_checkbox_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 113
    iget-object v0, p0, Lo/fcg$4;->d:Lo/aht;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lo/aht;->e:Z

    .line 114
    iget-object v0, p0, Lo/fcg$4;->c:Lo/fcg;

    invoke-static {v0}, Lo/fcg;->b(Lo/fcg;)I

    .line 115
    iget-object v0, p0, Lo/fcg$4;->c:Lo/fcg;

    invoke-static {v0}, Lo/fcg;->a(Lo/fcg;)Lo/fdk;

    move-result-object v0

    iget-object v1, p0, Lo/fcg$4;->c:Lo/fcg;

    iget-object v1, v1, Lo/fcg;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, Lo/fcg$4;->c:Lo/fcg;

    invoke-static {v2}, Lo/fcg;->c(Lo/fcg;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Lo/fdk;->d(II)V

    .line 117
    :goto_0
    return-void
.end method
