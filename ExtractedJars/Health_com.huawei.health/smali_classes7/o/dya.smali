.class public Lo/dya;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dya$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/dya$e;>;"
    }
.end annotation


# instance fields
.field private a:Lo/dxy;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lo/dvz;>;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:Landroid/view/LayoutInflater;

.field private f:F

.field private i:Lo/dyq;

.field private k:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Map<Ljava/lang/String;Ljava/util/ArrayList<Lo/dvz;>;>;Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 50
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 51
    iput-object p1, p0, Lo/dya;->c:Landroid/content/Context;

    .line 53
    iput-object p2, p0, Lo/dya;->b:Ljava/util/Map;

    .line 54
    iput-object p3, p0, Lo/dya;->d:Ljava/util/Map;

    .line 55
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/dya;->e:Landroid/view/LayoutInflater;

    .line 56
    return-void
.end method

.method static synthetic a(Lo/dya;)Lo/dyq;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dya;->i:Lo/dyq;

    return-object v0
.end method

.method static synthetic b(Lo/dya;)Ljava/util/Map;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dya;->b:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic c(Lo/dya;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/dya;->f:F

    return v0
.end method

.method static synthetic d(Lo/dya;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/dya;->k:F

    return p1
.end method

.method static synthetic d(Lo/dya;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/dya;->c:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lo/dya;)F
    .locals 1

    .line 36
    iget v0, p0, Lo/dya;->k:F

    return v0
.end method

.method static synthetic e(Lo/dya;F)F
    .locals 0

    .line 36
    iput p1, p0, Lo/dya;->f:F

    return p1
.end method


# virtual methods
.method public b(Landroid/view/ViewGroup;I)Lo/dya$e;
    .locals 5

    .line 64
    iget-object v0, p0, Lo/dya;->e:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/pluginachievement/R$layout;->medal_leibie:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 65
    new-instance v4, Lo/dya$e;

    invoke-direct {v4, p0, v3}, Lo/dya$e;-><init>(Lo/dya;Landroid/view/View;)V

    .line 66
    return-object v4
.end method

.method public b(Lo/dya$e;I)V
    .locals 6

    .line 71
    iget-object v0, p0, Lo/dya;->d:Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 73
    iget-object v0, p0, Lo/dya;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 74
    const-string v0, "PLGACHIEVE_MyMedalRecyclerViewAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBindViewHolder() leibie_name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lo/dya;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 76
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 77
    iget-object v0, p1, Lo/dya$e;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    const-string v0, "PLGACHIEVE_MyMedalRecyclerViewAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBindViewHolder() medalInfos is not null , leibie_name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v0, "PLGACHIEVE_MyMedalRecyclerViewAdapter"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalInfos size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    new-instance v0, Lo/dxy;

    iget-object v1, p0, Lo/dya;->c:Landroid/content/Context;

    invoke-direct {v0, v1, v4}, Lo/dxy;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lo/dya;->a:Lo/dxy;

    .line 81
    iget-object v0, p0, Lo/dya;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/ene;->t(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    iget-object v0, p1, Lo/dya$e;->a:Landroid/widget/GridView;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    goto :goto_0

    .line 84
    :cond_0
    iget-object v0, p1, Lo/dya$e;->a:Landroid/widget/GridView;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 86
    :goto_0
    iget-object v0, p1, Lo/dya$e;->a:Landroid/widget/GridView;

    iget-object v1, p0, Lo/dya;->a:Lo/dxy;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 88
    iget-object v0, p1, Lo/dya$e;->a:Landroid/widget/GridView;

    new-instance v1, Lo/dya$5;

    invoke-direct {v1, p0}, Lo/dya$5;-><init>(Lo/dya;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 101
    iget-object v0, p1, Lo/dya$e;->a:Landroid/widget/GridView;

    new-instance v1, Lo/dya$2;

    invoke-direct {v1, p0, v3}, Lo/dya$2;-><init>(Lo/dya;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_1

    .line 161
    :cond_1
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v5, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 162
    iget-object v0, p1, Lo/dya$e;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    iget-object v0, p1, Lo/dya$e;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 164
    iget-object v0, p1, Lo/dya$e;->a:Landroid/widget/GridView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setVisibility(I)V

    .line 165
    iget-object v0, p1, Lo/dya$e;->b:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 169
    :cond_2
    :goto_1
    return-void
.end method

.method public c(Lo/dyq;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/dya;->i:Lo/dyq;

    .line 60
    return-void
.end method

.method public getItemCount()I
    .locals 1

    .line 173
    iget-object v0, p0, Lo/dya;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 36
    move-object v0, p1

    check-cast v0, Lo/dya$e;

    invoke-virtual {p0, v0, p2}, Lo/dya;->b(Lo/dya$e;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 36
    invoke-virtual {p0, p1, p2}, Lo/dya;->b(Landroid/view/ViewGroup;I)Lo/dya$e;

    move-result-object v0

    return-object v0
.end method
