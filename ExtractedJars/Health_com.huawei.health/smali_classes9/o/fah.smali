.class public Lo/fah;
.super Lo/eho;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fah$d;
    }
.end annotation


# instance fields
.field private ab:Lo/fah$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/eho;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-direct {p0}, Lo/fah;->D()V

    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lo/eho;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 27
    invoke-direct {p0}, Lo/fah;->D()V

    .line 28
    return-void
.end method

.method private D()V
    .locals 8

    .line 33
    invoke-virtual {p0}, Lo/fah;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_target_sport_time_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 34
    invoke-virtual {p0}, Lo/fah;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_h_min_unit:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 35
    new-instance v0, Lo/fal;

    iget-object v3, p0, Lo/fah;->P:Lo/la;

    iget-object v4, p0, Lo/fah;->O:Lo/oa;

    const/4 v1, 0x2

    new-array v5, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object v6, v5, v1

    const/4 v1, 0x1

    aput-object v7, v5, v1

    move-object v1, p0

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, Lo/fal;-><init>(Lo/eho;Lo/ejj;Lo/la;Lo/oa;[Ljava/lang/String;)V

    iput-object v0, p0, Lo/fah;->S:Lo/nj;

    .line 37
    new-instance v0, Lo/fan;

    sget-object v1, Lo/eit$b;->e:Lo/eit$b;

    invoke-direct {v0, p0, v1}, Lo/fan;-><init>(Lo/eie;Lo/eit$b;)V

    iput-object v0, p0, Lo/fah;->ad:Lo/eit;

    .line 40
    iget-object v0, p0, Lo/fah;->ad:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 41
    new-instance v0, Lo/fan;

    sget-object v1, Lo/eit$b;->b:Lo/eit$b;

    invoke-direct {v0, p0, v1}, Lo/fan;-><init>(Lo/eie;Lo/eit$b;)V

    iput-object v0, p0, Lo/fah;->af:Lo/eit;

    .line 43
    iget-object v0, p0, Lo/fah;->af:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 44
    new-instance v0, Lo/fan;

    sget-object v1, Lo/eit$b;->c:Lo/eit$b;

    invoke-direct {v0, p0, v1}, Lo/fan;-><init>(Lo/eie;Lo/eit$b;)V

    iput-object v0, p0, Lo/fah;->ah:Lo/eit;

    .line 47
    new-instance v0, Lo/fap;

    invoke-virtual {p0}, Lo/fah;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/fah;->O:Lo/oa;

    iget-object v3, p0, Lo/fah;->ad:Lo/eit;

    iget-object v4, p0, Lo/fah;->aj:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/fap;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fah;->ae:Lo/eir;

    .line 49
    new-instance v0, Lo/fap;

    invoke-virtual {p0}, Lo/fah;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/fah;->O:Lo/oa;

    iget-object v3, p0, Lo/fah;->af:Lo/eit;

    iget-object v4, p0, Lo/fah;->al:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/fap;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fah;->am:Lo/eir;

    .line 51
    new-instance v0, Lo/fap;

    invoke-virtual {p0}, Lo/fah;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lo/fah;->O:Lo/oa;

    iget-object v3, p0, Lo/fah;->ah:Lo/eit;

    iget-object v4, p0, Lo/fah;->ak:Lo/eim;

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lo/fap;-><init>(Landroid/content/Context;Lo/oa;Lo/lp;Lo/nv;Lo/eie;)V

    iput-object v0, p0, Lo/fah;->ai:Lo/eir;

    .line 55
    iget-object v0, p0, Lo/fah;->ad:Lo/eit;

    check-cast v0, Lo/fan;

    const/16 v1, 0xff

    const/16 v2, 0xff

    const/16 v3, 0xff

    const/16 v4, 0xff

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/fan;->b(I)V

    .line 57
    iget-object v0, p0, Lo/fah;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->b(Z)V

    .line 58
    iget-object v0, p0, Lo/fah;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->e(Z)V

    .line 59
    iget-object v0, p0, Lo/fah;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->d(Z)V

    .line 60
    iget-object v0, p0, Lo/fah;->ah:Lo/eit;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eit;->a(Z)V

    .line 62
    iget-object v0, p0, Lo/fah;->ad:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 63
    iget-object v0, p0, Lo/fah;->af:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 64
    iget-object v0, p0, Lo/fah;->ah:Lo/eit;

    const/16 v1, 0x7f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/eit;->b(I)V

    .line 67
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fah;->d(Z)V

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/fah;->e(Z)V

    .line 69
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/fah;->b(ZZ)V

    .line 71
    iget-object v0, p0, Lo/fah;->S:Lo/nj;

    check-cast v0, Lo/fal;

    new-instance v1, Lo/fah$2;

    invoke-direct {v1, p0}, Lo/fah$2;-><init>(Lo/fah;)V

    invoke-virtual {v0, v1}, Lo/fal;->a(Lo/fal$a;)V

    .line 78
    return-void
.end method

.method static synthetic c(Lo/fah;)Lo/fah$d;
    .locals 1

    .line 18
    iget-object v0, p0, Lo/fah;->ab:Lo/fah$d;

    return-object v0
.end method


# virtual methods
.method public varargs a(II[Ljava/lang/String;)V
    .locals 1

    .line 105
    iget-object v0, p0, Lo/fah;->ae:Lo/eir;

    check-cast v0, Lo/fap;

    invoke-virtual {v0, p1, p2, p3}, Lo/fap;->e(II[Ljava/lang/String;)V

    .line 106
    return-void
.end method

.method public g(Z)V
    .locals 1

    .line 113
    iget-object v0, p0, Lo/fah;->ae:Lo/eir;

    check-cast v0, Lo/fap;

    invoke-static {p1}, Lo/fap;->c(Z)V

    .line 114
    return-void
.end method

.method public setOnBarChartViewDataChangedListener(Lo/fah$d;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/fah;->ab:Lo/fah$d;

    .line 99
    return-void
.end method
