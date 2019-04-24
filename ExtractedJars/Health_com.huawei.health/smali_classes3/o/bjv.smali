.class public Lo/bjv;
.super Lo/bjq;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/content/Context;

.field private e:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lo/bjq;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjv;->e:Landroid/widget/TextView;

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjv;->b:Landroid/content/Context;

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bjv;->a:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 37
    iput-object p1, p0, Lo/bjv;->b:Landroid/content/Context;

    .line 38
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$layout;->sns_transmit_text:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 39
    sget v0, Lcom/huawei/android/sns/R$id;->sns_content_txt:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjv;->e:Landroid/widget/TextView;

    .line 40
    sget v0, Lcom/huawei/android/sns/R$id;->sns_transmit_info:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bjv;->a:Landroid/widget/TextView;

    .line 41
    return-object v3
.end method

.method e(Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;>;)V"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lo/bjv;->e:Landroid/widget/TextView;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 53
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 55
    if-nez v6, :cond_0

    .line 57
    iget-object v0, p0, Lo/bjv;->e:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 58
    return-void

    .line 61
    :cond_0
    const/4 v0, 0x1

    if-ne v6, v0, :cond_2

    .line 63
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/selector/dialog/TransmitItem;->getMsgContent()Ljava/lang/String;

    move-result-object v7

    .line 64
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->k()I

    move-result v8

    .line 65
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 67
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v8, :cond_1

    .line 69
    iget-object v0, p0, Lo/bjv;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 70
    iget-object v0, p0, Lo/bjv;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bjv;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_transmit_txt_too_long:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    .line 71
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v8, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    :cond_1
    invoke-static {}, Lo/bgh;->a()Lo/bgh;

    move-result-object v0

    sget-object v1, Lo/bgh$c;->a:Lo/bgh$c;

    invoke-virtual {v0, v7, v1}, Lo/bgh;->a(Ljava/lang/CharSequence;Lo/bgh$c;)Ljava/lang/CharSequence;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/text/SpannableStringBuilder;

    .line 77
    iget-object v0, p0, Lo/bjv;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    goto :goto_0

    .line 81
    :cond_2
    iget-object v0, p0, Lo/bjv;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lo/bjv;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$plurals;->sns_transmit_multi_msg:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v6, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :cond_3
    :goto_0
    return-void
.end method
