.class public Lo/epg;
.super Lo/eqv;
.source "SourceFile"


# instance fields
.field protected b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lo/eqv;-><init>()V

    .line 17
    iput-object p1, p0, Lo/epg;->b:Landroid/content/Context;

    .line 18
    return-void
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 4

    .line 22
    new-instance v0, Lo/epi;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->home_item_layout_achievement:I

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lo/epg;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/epi;-><init>(Landroid/view/View;Landroid/content/Context;Z)V

    return-object v0
.end method

.method public b()V
    .locals 0

    .line 29
    return-void
.end method
