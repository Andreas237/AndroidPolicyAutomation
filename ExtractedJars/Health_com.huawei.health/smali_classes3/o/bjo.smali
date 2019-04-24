.class public Lo/bjo;
.super Lo/bjq;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lo/bjq;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjo;->a:Landroid/widget/TextView;

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjo;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 32
    iput-object p1, p0, Lo/bjo;->e:Landroid/content/Context;

    .line 33
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_transmit_text:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 34
    sget v0, Lcom/huawei/android/sns/R$id;->sns_content_txt:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjo;->a:Landroid/widget/TextView;

    .line 35
    return-object v3
.end method

.method e(Ljava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lo/bjo;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 49
    if-nez v6, :cond_0

    .line 51
    iget-object v0, p0, Lo/bjo;->a:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 52
    return-void

    .line 54
    :cond_0
    iget-object v0, p0, Lo/bjo;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bjo;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$string;->sns_transmit_link:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getMsgContent()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    :cond_1
    return-void
.end method
