.class public abstract Lo/bfl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/widget/ImageView;

.field protected b:Landroid/widget/TextView;

.field protected c:Landroid/view/View;

.field public d:Landroid/content/Context;

.field protected e:Lo/bfh;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lo/bfl;->d:Landroid/content/Context;

    .line 39
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/bfl;->c:Landroid/view/View;

    .line 71
    return-void
.end method

.method public c()Landroid/view/View;
    .locals 1

    .line 62
    iget-object v0, p0, Lo/bfl;->c:Landroid/view/View;

    return-object v0
.end method

.method public d()Lo/bfh;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/bfl;->e:Lo/bfh;

    return-object v0
.end method

.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 80
    const/4 v0, 0x0

    return-object v0
.end method

.method public d(Lo/bfh;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/bfl;->e:Lo/bfh;

    .line 86
    invoke-virtual {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 87
    return-void
.end method

.method public e(Lo/bfh;)V
    .locals 0

    .line 91
    return-void
.end method

.method public e(Lo/bfp;)V
    .locals 2

    .line 95
    iget-object v0, p0, Lo/bfl;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lo/bfl;->d()Lo/bfh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bfh;->getEventType()Lo/bfp$c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/bfl;->c:Landroid/view/View;

    new-instance v1, Lo/bfl$2;

    invoke-direct {v1, p0, p1}, Lo/bfl$2;-><init>(Lo/bfl;Lo/bfp;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    iget-object v0, p0, Lo/bfl;->c:Landroid/view/View;

    new-instance v1, Lo/bfl$3;

    invoke-direct {v1, p0, p1}, Lo/bfl$3;-><init>(Lo/bfl;Lo/bfp;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 121
    :cond_0
    return-void
.end method
