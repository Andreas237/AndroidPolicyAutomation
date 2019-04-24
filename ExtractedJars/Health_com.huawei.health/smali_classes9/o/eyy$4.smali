.class Lo/eyy$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elc$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eyy;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/eyy;


# direct methods
.method constructor <init>(Lo/eyy;)V
    .locals 0

    .line 173
    iput-object p1, p0, Lo/eyy$4;->b:Lo/eyy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lo/elc$b;>;)V"
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v1, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v1, v1, Lo/eyy;->c:Landroid/widget/TextView;

    invoke-static {v0, v1, p1}, Lo/eyy;->d(Lo/eyy;Landroid/widget/TextView;Ljava/lang/String;)V

    .line 180
    const/16 v0, 0xff

    const/16 v1, 0x1a

    const/16 v2, 0x1a

    const/16 v3, 0x1a

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    .line 185
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 186
    :cond_0
    iget-object v0, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v0, v0, Lo/eyy;->d:Lo/eyz;

    const-string v1, "--"

    const-string v2, "--"

    invoke-virtual {v0, v1, v2}, Lo/eyz;->setMarkerText(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 189
    :cond_1
    iget-object v0, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v0, v0, Lo/eyy;->d:Lo/eyz;

    iget-object v1, p0, Lo/eyy$4;->b:Lo/eyy;

    .line 190
    invoke-static {v1}, Lo/eyy;->e(Lo/eyy;)Lo/ezh;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elc$b;

    iget-object v2, v2, Lo/elc$b;->e:Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v1, v2}, Lo/ezh;->d(Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Ljava/lang/String;

    move-result-object v1

    .line 191
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/elc$b;

    iget-object v2, v2, Lo/elc$b;->a:Ljava/lang/String;

    .line 189
    invoke-virtual {v0, v1, v2}, Lo/eyz;->setMarkerText(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    :goto_0
    iget-object v0, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v0, v0, Lo/eyy;->d:Lo/eyz;

    iget-object v1, p0, Lo/eyy$4;->b:Lo/eyy;

    invoke-static {v1}, Lo/eyy;->e(Lo/eyy;)Lo/ezh;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eyz;->setHost(Lo/ezh;)V

    .line 203
    iget-object v0, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v0, v0, Lo/eyy;->d:Lo/eyz;

    invoke-virtual {v0, v4}, Lo/eyz;->a(I)V

    .line 204
    iget-object v0, p0, Lo/eyy$4;->b:Lo/eyy;

    iget-object v0, v0, Lo/eyy;->d:Lo/eyz;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eyz;->setTextJumpable(Z)V

    .line 206
    return-void
.end method
