.class public Lo/eqy;
.super Lo/eqv;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fil;>;"
        }
    .end annotation
.end field

.field private b:Lo/eqz;

.field private d:Landroid/os/Handler;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lo/eqv;-><init>()V

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/eqy;->a:Ljava/util/List;

    .line 92
    new-instance v0, Lo/eqy$2;

    invoke-direct {v0, p0}, Lo/eqy$2;-><init>(Lo/eqy;)V

    iput-object v0, p0, Lo/eqy;->d:Landroid/os/Handler;

    .line 44
    iput-object p1, p0, Lo/eqy;->e:Landroid/content/Context;

    .line 45
    return-void
.end method

.method static synthetic b(Lo/eqy;)Lo/eqz;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqy;->b:Lo/eqz;

    return-object v0
.end method

.method static synthetic c(Lo/eqy;)Landroid/os/Handler;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqy;->d:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lo/eqy;)Ljava/util/List;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/eqy;->a:Ljava/util/List;

    return-object v0
.end method

.method private e()V
    .locals 2

    .line 64
    iget-object v0, p0, Lo/eqy;->b:Lo/eqz;

    iget-object v1, p0, Lo/eqy;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lo/eqz;->a(Ljava/util/List;)V

    .line 65
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/eqy;->b(Z)V

    .line 69
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 150
    invoke-super {p0}, Lo/eqv;->a()V

    .line 159
    return-void
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 55
    const-string v0, "PreviewCardData-getCardViewHolder enter"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 56
    new-instance v0, Lo/eqz;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_preview:I

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lo/eqy;->e:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/eqz;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    iput-object v0, p0, Lo/eqy;->b:Lo/eqz;

    .line 58
    invoke-direct {p0}, Lo/eqy;->e()V

    .line 59
    const-string v0, "PreviewCardData-getCardViewHolder end"

    invoke-static {v0}, Lo/dbf;->d(Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lo/eqy;->b:Lo/eqz;

    return-object v0
.end method

.method public b()V
    .locals 4

    .line 121
    const-string v0, "PreviewCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshcarddata"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lo/eqy;->b(Z)V

    .line 123
    return-void
.end method

.method public b(Z)V
    .locals 4

    .line 72
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const-string v0, "PreviewCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Utils.isOversea()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lo/eqy;->b:Lo/eqz;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/eqz;->a(I)V

    .line 76
    return-void

    .line 78
    :cond_0
    invoke-static {}, Lo/eta;->a()Lo/eta;

    move-result-object v0

    new-instance v1, Lo/eqy$3;

    invoke-direct {v1, p0}, Lo/eqy$3;-><init>(Lo/eqy;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, p1, v1}, Lo/eta;->b(IZLo/etc;)V

    .line 90
    return-void
.end method

.method public d()V
    .locals 4

    .line 112
    invoke-super {p0}, Lo/eqv;->d()V

    .line 113
    const-string v0, "PreviewCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onresume"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    iget-object v0, p0, Lo/eqy;->b:Lo/eqz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 116
    invoke-virtual {p0}, Lo/eqy;->b()V

    .line 118
    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 51
    return-void
.end method
