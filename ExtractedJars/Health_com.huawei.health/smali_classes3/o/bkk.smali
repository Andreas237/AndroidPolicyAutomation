.class public final Lo/bkk;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bkk$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bbt;>;"
        }
    .end annotation
.end field

.field private c:Landroid/content/Context;

.field private d:Lo/bkk$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 31
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bkk;->a:Ljava/util/List;

    .line 35
    iput-object p1, p0, Lo/bkk;->c:Landroid/content/Context;

    .line 36
    return-void
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;)Ljava/util/List<Lo/bbt;>;"
        }
    .end annotation

    .line 110
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 111
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;

    .line 113
    new-instance v6, Lo/bbt;

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getUID()J

    move-result-wide v0

    invoke-virtual {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getHead_pic()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v0, v1, v2}, Lo/bbt;-><init>(JLjava/lang/String;)V

    .line 114
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/bbt;->b(Ljava/lang/String;)V

    .line 115
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getIntroduction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/bbt;->e(Ljava/lang/String;)V

    .line 116
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;->getFollow()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/bbt;->d(I)V

    .line 117
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    return-object v3
.end method


# virtual methods
.method public c()V
    .locals 3

    .line 143
    iget-object v0, p0, Lo/bkk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bbt;

    .line 145
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/bbt;->e(Z)V

    .line 146
    goto :goto_0

    .line 147
    :cond_0
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/sns/model/assistant/AssistantSearchBean;>;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0, p1}, Lo/bkk;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/bkk;->a:Ljava/util/List;

    .line 41
    return-void
.end method

.method public d()Z
    .locals 3

    .line 128
    iget-object v0, p0, Lo/bkk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/bbt;

    .line 130
    invoke-virtual {v2}, Lo/bbt;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 132
    const/4 v0, 0x0

    return v0

    .line 134
    :cond_0
    goto :goto_0

    .line 135
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public e(I)Lo/bbt;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/bkk;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bbt;

    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 46
    iget-object v0, p0, Lo/bkk;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-virtual {p0, p1}, Lo/bkk;->e(I)Lo/bbt;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 58
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 64
    if-nez p2, :cond_0

    .line 66
    new-instance v0, Lo/bkk$b;

    invoke-direct {v0}, Lo/bkk$b;-><init>()V

    iput-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    .line 67
    iget-object v0, p0, Lo/bkk;->c:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_recomment_assist_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 68
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    sget v1, Lcom/huawei/android/sns/R$id;->assistant_icon:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lo/bnl;

    iput-object v1, v0, Lo/bkk$b;->c:Lo/bnl;

    .line 69
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    sget v1, Lcom/huawei/android/sns/R$id;->assistant_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lo/bkk$b;->d:Landroid/widget/TextView;

    .line 70
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 73
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bkk$b;

    iput-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    .line 76
    :goto_0
    invoke-virtual {p0, p1}, Lo/bkk;->e(I)Lo/bbt;

    move-result-object v3

    .line 77
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    iget-object v0, v0, Lo/bkk$b;->c:Lo/bnl;

    invoke-virtual {v3}, Lo/bbt;->n()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/bnl;->setUserId(J)V

    .line 78
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    iget-object v0, v0, Lo/bkk$b;->c:Lo/bnl;

    iget-object v1, p0, Lo/bkk;->c:Landroid/content/Context;

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lo/bnl;->setContext(Landroid/app/Activity;)V

    .line 79
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    iget-object v0, v0, Lo/bkk$b;->d:Landroid/widget/TextView;

    invoke-virtual {v3}, Lo/bbt;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 81
    invoke-virtual {v3}, Lo/bbt;->m()Z

    move-result v0

    if-nez v0, :cond_1

    .line 83
    iget-object v0, p0, Lo/bkk;->d:Lo/bkk$b;

    iget-object v0, v0, Lo/bkk$b;->c:Lo/bnl;

    invoke-static {v3, v0}, Lo/bbk;->d(Lo/bbt;Landroid/widget/ImageView;)V

    .line 86
    :cond_1
    invoke-virtual {p0}, Lo/bkk;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 92
    :cond_2
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 94
    :goto_1
    return-object p2
.end method
