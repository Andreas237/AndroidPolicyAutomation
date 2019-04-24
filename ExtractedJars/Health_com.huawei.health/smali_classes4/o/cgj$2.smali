.class Lo/cgj$2;
.super Lo/chz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgj;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cgj;


# direct methods
.method constructor <init>(Lo/cgj;Landroid/content/Context;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/cgj$2;->b:Lo/cgj;

    invoke-direct {p0, p2}, Lo/chz;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected d(FLo/mf;)Ljava/lang/String;
    .locals 4

    .line 84
    iget-object v0, p0, Lo/cgj$2;->b:Lo/cgj;

    invoke-static {v0}, Lo/cgj;->c(Lo/cgj;)Lo/ekm$c;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 85
    sget-object v0, Lo/ekm$c;->c:Lo/ekm$c;

    iget-object v1, p0, Lo/cgj$2;->b:Lo/cgj;

    invoke-static {v1}, Lo/cgj;->c(Lo/cgj;)Lo/ekm$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ekm$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 90
    :cond_0
    sget-object v0, Lo/ekm$c;->d:Lo/ekm$c;

    iget-object v1, p0, Lo/cgj$2;->b:Lo/cgj;

    invoke-static {v1}, Lo/cgj;->c(Lo/cgj;)Lo/ekm$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/ekm$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 91
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 92
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 97
    :cond_1
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 104
    :cond_2
    invoke-super {p0, p1, p2}, Lo/chz;->d(FLo/mf;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
