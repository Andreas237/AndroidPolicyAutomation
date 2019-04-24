.class public Lo/eyl;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eyl$c;,
        Lo/eyl$a;
    }
.end annotation


# instance fields
.field protected a:Lhuawei/widget/HwSubTabWidget$SubTab;

.field protected b:Lhuawei/widget/HwSubTabWidget$SubTab;

.field protected c:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private d:Lo/emq;

.field protected e:Lhuawei/widget/HwSubTabWidget$SubTab;

.field private g:Lo/eyl$c;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eyk$e;>;"
        }
    .end annotation
.end field

.field private i:Lo/eyl$a;

.field private k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lhuawei/widget/HwSubTabWidget$SubTab;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    .line 41
    invoke-direct {p0}, Lo/eyl;->c()V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 107
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    .line 46
    invoke-direct {p0}, Lo/eyl;->c()V

    .line 47
    return-void
.end method

.method private a()V
    .locals 2

    .line 87
    new-instance v0, Lo/eyl$c;

    invoke-direct {v0, p0}, Lo/eyl$c;-><init>(Lo/eyl;)V

    iput-object v0, p0, Lo/eyl;->g:Lo/eyl$c;

    .line 88
    iget-object v0, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v1, p0, Lo/eyl;->g:Lo/eyl$c;

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 89
    iget-object v0, p0, Lo/eyl;->c:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v1, p0, Lo/eyl;->g:Lo/eyl$c;

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 90
    iget-object v0, p0, Lo/eyl;->b:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v1, p0, Lo/eyl;->g:Lo/eyl$c;

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 91
    iget-object v0, p0, Lo/eyl;->a:Lhuawei/widget/HwSubTabWidget$SubTab;

    iget-object v1, p0, Lo/eyl;->g:Lo/eyl$c;

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 92
    return-void
.end method

.method private b()V
    .locals 0

    .line 128
    return-void
.end method

.method private c()V
    .locals 3

    .line 53
    new-instance v0, Lo/emq;

    invoke-virtual {p0}, Lo/eyl;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/emq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/eyl;->d:Lo/emq;

    .line 54
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {p0, v0, v1, v2}, Lo/eyl;->addView(Landroid/view/View;II)V

    .line 55
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 56
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lo/eyl;->c:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 57
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lo/eyl;->b:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 58
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lo/emq;->newSubTab(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    move-result-object v0

    iput-object v0, p0, Lo/eyl;->a:Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 60
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    iget-object v1, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 61
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    iget-object v1, p0, Lo/eyl;->c:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 62
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    iget-object v1, p0, Lo/eyl;->b:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 63
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    iget-object v1, p0, Lo/eyl;->a:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 64
    iget-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    iget-object v1, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    iget-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    iget-object v1, p0, Lo/eyl;->c:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    iget-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    iget-object v1, p0, Lo/eyl;->b:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v0, p0, Lo/eyl;->k:Ljava/util/List;

    iget-object v1, p0, Lo/eyl;->a:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    invoke-direct {p0}, Lo/eyl;->a()V

    .line 69
    invoke-direct {p0}, Lo/eyl;->b()V

    .line 70
    invoke-direct {p0}, Lo/eyl;->d()V

    .line 71
    return-void
.end method

.method private d()V
    .locals 2

    .line 74
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    iget-object v1, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0, v1}, Lo/emq;->selectSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;)V

    .line 75
    iget-object v0, p0, Lo/eyl;->g:Lo/eyl$c;

    invoke-virtual {v0}, Lo/eyl$c;->b()V

    .line 76
    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 113
    iget-object v0, p0, Lo/eyl;->d:Lo/emq;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 114
    return-void
.end method

.method public c(Ljava/util/List;Lo/eyl$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eyk$e;>;Lo/eyl$a;)V"
        }
    .end annotation

    .line 95
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 96
    return-void

    .line 98
    :cond_0
    iput-object p1, p0, Lo/eyl;->h:Ljava/util/List;

    .line 99
    iput-object p2, p0, Lo/eyl;->i:Lo/eyl$a;

    .line 101
    iget-object v0, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v1}, Lo/eyk$e;->getClassStr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setText(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 102
    iget-object v0, p0, Lo/eyl;->c:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v1}, Lo/eyk$e;->getClassStr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setText(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 103
    iget-object v0, p0, Lo/eyl;->b:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v1, 0x2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v1}, Lo/eyk$e;->getClassStr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setText(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 104
    iget-object v0, p0, Lo/eyl;->a:Lhuawei/widget/HwSubTabWidget$SubTab;

    const/4 v1, 0x3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v1}, Lo/eyk$e;->getClassStr()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhuawei/widget/HwSubTabWidget$SubTab;->setText(Ljava/lang/CharSequence;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 105
    return-void
.end method

.method public e(I)V
    .locals 2

    .line 79
    iget-object v0, p0, Lo/eyl;->i:Lo/eyl$a;

    if-eqz v0, :cond_0

    .line 80
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/eyl;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 81
    iget-object v0, p0, Lo/eyl;->i:Lo/eyl$a;

    iget-object v1, p0, Lo/eyl;->h:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v0, v1}, Lo/eyl$a;->a(Lo/eyk$e;)V

    .line 84
    :cond_0
    return-void
.end method

.method protected e(Lhuawei/widget/HwSubTabWidget$SubTab;)V
    .locals 3

    .line 163
    iget-object v0, p0, Lo/eyl;->e:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne p1, v0, :cond_0

    .line 164
    iget-object v0, p0, Lo/eyl;->i:Lo/eyl$a;

    iget-object v1, p0, Lo/eyl;->h:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v0, v1}, Lo/eyl$a;->a(Lo/eyk$e;)V

    goto :goto_0

    .line 165
    :cond_0
    iget-object v0, p0, Lo/eyl;->c:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne p1, v0, :cond_1

    .line 166
    iget-object v0, p0, Lo/eyl;->i:Lo/eyl$a;

    iget-object v1, p0, Lo/eyl;->h:Ljava/util/List;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v0, v1}, Lo/eyl$a;->a(Lo/eyk$e;)V

    goto :goto_0

    .line 167
    :cond_1
    iget-object v0, p0, Lo/eyl;->b:Lhuawei/widget/HwSubTabWidget$SubTab;

    if-ne p1, v0, :cond_2

    .line 168
    iget-object v0, p0, Lo/eyl;->i:Lo/eyl$a;

    iget-object v1, p0, Lo/eyl;->h:Ljava/util/List;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v0, v1}, Lo/eyl$a;->a(Lo/eyk$e;)V

    goto :goto_0

    .line 170
    :cond_2
    iget-object v0, p0, Lo/eyl;->i:Lo/eyl$a;

    iget-object v1, p0, Lo/eyl;->h:Ljava/util/List;

    const/4 v2, 0x3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/eyk$e;

    invoke-interface {v0, v1}, Lo/eyl$a;->a(Lo/eyk$e;)V

    .line 172
    :goto_0
    return-void
.end method
