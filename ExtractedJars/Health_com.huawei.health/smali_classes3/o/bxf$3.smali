.class Lo/bxf$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bxf;->c(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bxf;

.field final synthetic b:Lo/byr;

.field final synthetic e:Lo/bxu;


# direct methods
.method constructor <init>(Lo/bxf;Lo/bxu;Lo/byr;)V
    .locals 0

    .line 169
    iput-object p1, p0, Lo/bxf$3;->a:Lo/bxf;

    iput-object p2, p0, Lo/bxf$3;->e:Lo/bxu;

    iput-object p3, p0, Lo/bxf$3;->b:Lo/byr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 3

    .line 172
    iget-object v0, p0, Lo/bxf$3;->e:Lo/bxu;

    invoke-virtual {v0}, Lo/bxu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/bxf$3;->a:Lo/bxf;

    invoke-static {v0}, Lo/bxf;->a(Lo/bxf;)I

    move-result v0

    if-nez v0, :cond_0

    .line 173
    iget-object v0, p0, Lo/bxf$3;->a:Lo/bxf;

    invoke-static {v0}, Lo/bxf;->e(Lo/bxf;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getHeight()I

    move-result v0

    iget-object v1, p0, Lo/bxf$3;->b:Lo/byr;

    invoke-virtual {v1}, Lo/byr;->getBottom()I

    move-result v1

    sub-int v2, v0, v1

    .line 174
    if-gez v2, :cond_0

    .line 175
    iget-object v0, p0, Lo/bxf$3;->a:Lo/bxf;

    invoke-static {v0}, Lo/bxf;->e(Lo/bxf;)Landroid/widget/ListView;

    move-result-object v0

    neg-int v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->scrollListBy(I)V

    .line 178
    :cond_0
    return-void
.end method
