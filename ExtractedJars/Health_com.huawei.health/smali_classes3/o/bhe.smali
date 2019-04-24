.class public Lo/bhe;
.super Lo/bfl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bhe$d;
    }
.end annotation


# instance fields
.field private i:Landroid/content/Context;

.field private k:Lo/egd;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 42
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bhe;->k:Lo/egd;

    .line 43
    iput-object p1, p0, Lo/bhe;->i:Landroid/content/Context;

    .line 44
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 3

    .line 49
    sget v0, Lcom/huawei/android/sns/R$id;->button_delete_quit:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lo/bhe;->k:Lo/egd;

    .line 50
    iget-object v0, p0, Lo/bhe;->i:Landroid/content/Context;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 52
    iget-object v0, p0, Lo/bhe;->i:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Lo/bhe;->k:Lo/egd;

    invoke-static {v0, v1}, Lo/bph;->c(Landroid/app/Activity;Landroid/view/View;)V

    .line 54
    :cond_0
    invoke-static {}, Lo/bom;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    iget-object v0, p0, Lo/bhe;->k:Lo/egd;

    iget-object v1, p0, Lo/bhe;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_delete_text_color_emuifive:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/egd;->setTextColor(I)V

    .line 58
    :cond_1
    invoke-virtual {p0, p1}, Lo/bhe;->a(Landroid/view/View;)V

    .line 59
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 3

    .line 65
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 66
    iget-object v0, p0, Lo/bhe;->k:Lo/egd;

    new-instance v1, Lo/bhe$d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/bhe$d;-><init>(Lo/bhe$5;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    return-void
.end method
