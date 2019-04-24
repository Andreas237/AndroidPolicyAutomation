.class public Lo/biu;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/biu$e;
    }
.end annotation


# instance fields
.field protected a:Landroid/content/Context;

.field protected e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    .line 41
    iput-object p1, p0, Lo/biu;->a:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lo/biu;->e:Ljava/util/ArrayList;

    .line 43
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    .line 58
    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 60
    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_2

    .line 64
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 66
    :cond_2
    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 48
    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0

    .line 52
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0, p1}, Lo/biu;->a(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 72
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 78
    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 80
    :cond_0
    return-object p2

    .line 84
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p2, :cond_2

    .line 86
    iget-object v0, p0, Lo/biu;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_result_texturl_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 87
    new-instance v3, Lo/biu$e;

    invoke-direct {v3}, Lo/biu$e;-><init>()V

    .line 88
    sget v0, Lcom/huawei/android/sns/R$id;->content:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/biu$e;->a:Landroid/widget/TextView;

    .line 89
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 93
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/biu$e;

    .line 96
    :goto_0
    iget-object v0, p0, Lo/biu;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 98
    iget-object v0, v3, Lo/biu$e;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    return-object p2
.end method
