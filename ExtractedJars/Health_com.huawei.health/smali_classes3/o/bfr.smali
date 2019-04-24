.class public Lo/bfr;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bfr$c;,
        Lo/bfr$e;
    }
.end annotation


# instance fields
.field private b:Lo/bfr$e;

.field private c:Landroid/content/Context;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/bfr$c;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 38
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 39
    iput-object p1, p0, Lo/bfr;->c:Landroid/content/Context;

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    .line 41
    iget-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    new-instance v1, Lo/bfr$c;

    sget-object v2, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lo/bfr$c;-><init>(Lo/bfr$c$c;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    return-void
.end method


# virtual methods
.method public a(I)Lo/bfr$c;
    .locals 1

    .line 77
    iget-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfr$c;

    return-object v0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/bfr$c;>;)V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    .line 47
    return-void
.end method

.method public b()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 56
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 57
    iget-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/bfr$c;

    .line 59
    invoke-virtual {v4}, Lo/bfr$c;->d()Lo/bfr$c$c;

    move-result-object v0

    sget-object v1, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    if-ne v0, v1, :cond_0

    .line 61
    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v4}, Lo/bfr$c;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-object v2
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/bfr$c;>;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getCount()I
    .locals 2

    .line 71
    iget-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x9

    if-le v0, v1, :cond_0

    const/16 v0, 0x9

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/bfr;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 15
    invoke-virtual {p0, p1}, Lo/bfr;->a(I)Lo/bfr$c;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 83
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 89
    invoke-virtual {p0, p1}, Lo/bfr;->a(I)Lo/bfr$c;

    move-result-object v3

    .line 90
    if-nez p2, :cond_0

    .line 92
    iget-object v0, p0, Lo/bfr;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_pic_evidence_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 93
    new-instance v0, Lo/bfr$e;

    invoke-direct {v0}, Lo/bfr$e;-><init>()V

    iput-object v0, p0, Lo/bfr;->b:Lo/bfr$e;

    .line 94
    iget-object v0, p0, Lo/bfr;->b:Lo/bfr$e;

    sget v1, Lcom/huawei/android/sns/R$id;->image_member_image:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, v0, Lo/bfr$e;->c:Landroid/widget/ImageView;

    .line 95
    iget-object v0, p0, Lo/bfr;->b:Lo/bfr$e;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bfr$e;

    iput-object v0, p0, Lo/bfr;->b:Lo/bfr$e;

    .line 101
    :goto_0
    invoke-virtual {v3}, Lo/bfr$c;->d()Lo/bfr$c$c;

    move-result-object v0

    sget-object v1, Lo/bfr$c$c;->b:Lo/bfr$c$c;

    invoke-virtual {v0, v1}, Lo/bfr$c$c;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lo/bfr;->b:Lo/bfr$e;

    iget-object v0, v0, Lo/bfr$e;->c:Landroid/widget/ImageView;

    iget-object v1, p0, Lo/bfr;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$drawable;->sns_complain_pic_add_selector:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 107
    :cond_1
    iget-object v0, p0, Lo/bfr;->b:Lo/bfr$e;

    iget-object v0, v0, Lo/bfr$e;->c:Landroid/widget/ImageView;

    invoke-virtual {v3}, Lo/bfr$c;->c()I

    move-result v1

    invoke-static {v0, v1}, Lo/aux;->d(Landroid/widget/ImageView;I)V

    .line 109
    :goto_1
    return-object p2
.end method
