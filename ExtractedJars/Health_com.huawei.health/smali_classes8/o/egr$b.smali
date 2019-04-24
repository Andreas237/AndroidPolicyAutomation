.class public Lo/egr$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lo/egr;

.field private b:Landroid/content/DialogInterface$OnKeyListener;

.field private c:Landroid/content/Context;

.field private d:Z

.field private e:Landroid/content/DialogInterface$OnCancelListener;

.field private f:Lo/egr$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lo/egr$b;->c:Landroid/content/Context;

    .line 79
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/egr$b;->d:Z

    .line 80
    new-instance v0, Lo/egr;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lo/egr;-><init>(Landroid/content/Context;Lo/egr$5;)V

    iput-object v0, p0, Lo/egr$b;->a:Lo/egr;

    .line 81
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    invoke-virtual {v0}, Lo/egr;->c()Lo/egr$c;

    move-result-object v0

    iput-object v0, p0, Lo/egr$b;->f:Lo/egr$c;

    .line 82
    return-void
.end method

.method private d()Lo/egr;
    .locals 5

    .line 162
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    iget-object v1, p0, Lo/egr$b;->f:Lo/egr$c;

    invoke-virtual {v1}, Lo/egr$c;->d()Landroid/view/View;

    move-result-object v1

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x2

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Lo/egr;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    iget-object v1, p0, Lo/egr$b;->f:Lo/egr$c;

    invoke-virtual {v1}, Lo/egr$c;->d()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egr;->setContentView(Landroid/view/View;)V

    .line 165
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    iget-boolean v1, p0, Lo/egr$b;->d:Z

    invoke-virtual {v0, v1}, Lo/egr;->setCancelable(Z)V

    .line 166
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    iget-object v1, p0, Lo/egr$b;->e:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {v0, v1}, Lo/egr;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 167
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    iget-object v1, p0, Lo/egr$b;->b:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v0, v1}, Lo/egr;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 168
    iget-object v0, p0, Lo/egr$b;->a:Lo/egr;

    return-object v0
.end method


# virtual methods
.method public a()Lo/egr;
    .locals 1

    .line 123
    invoke-direct {p0}, Lo/egr$b;->d()Lo/egr;

    move-result-object v0

    return-object v0
.end method

.method public b(I)Lo/egr$b;
    .locals 2

    .line 102
    iget-object v0, p0, Lo/egr$b;->c:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 103
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 104
    iget-object v0, p0, Lo/egr$b;->f:Lo/egr$c;

    invoke-virtual {v0, v1}, Lo/egr$c;->a(Ljava/lang/String;)V

    .line 106
    :cond_0
    return-object p0
.end method

.method public c()Lo/egr$b;
    .locals 1

    .line 114
    iget-object v0, p0, Lo/egr$b;->f:Lo/egr$c;

    invoke-virtual {v0}, Lo/egr$c;->b()V

    .line 115
    return-object p0
.end method

.method public c(Z)Lo/egr$b;
    .locals 0

    .line 132
    iput-boolean p1, p0, Lo/egr$b;->d:Z

    .line 133
    return-object p0
.end method
