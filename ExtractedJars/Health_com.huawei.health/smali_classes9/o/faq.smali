.class public Lo/faq;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/faq$a;
    }
.end annotation


# instance fields
.field private b:Landroid/view/LayoutInflater;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/eut;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/faq;->e:Ljava/util/List;

    .line 43
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/faq;->b:Landroid/view/LayoutInflater;

    .line 45
    return-void
.end method

.method private a(Lo/eut;Lo/faq$a;)V
    .locals 2

    .line 106
    iget v0, p1, Lo/eut;->b:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 112
    :pswitch_0
    iget-object v0, p1, Lo/eut;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 113
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lo/eut;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 115
    :cond_0
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_data_origin_unknow_device:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 117
    :goto_0
    iget-object v0, p2, Lo/faq$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_data_origin_talkband:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 118
    goto/16 :goto_4

    .line 123
    :pswitch_1
    iget-object v0, p1, Lo/eut;->c:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 124
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lo/eut;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 126
    :cond_1
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_data_origin_unknow_device:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 128
    :goto_1
    iget-object v0, p2, Lo/faq$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_data_origin_watch:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 129
    goto :goto_4

    .line 131
    :pswitch_2
    iget-object v0, p1, Lo/eut;->a:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 136
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lo/eut;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 139
    :cond_2
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_origin_phone:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 141
    :goto_2
    iget-object v0, p2, Lo/faq$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_data_origin_phone:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 142
    goto :goto_4

    .line 144
    :goto_3
    :pswitch_3
    iget-object v0, p1, Lo/eut;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 145
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    iget-object v1, p1, Lo/eut;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    iget-object v0, p1, Lo/eut;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WATCH"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 147
    iget-object v0, p2, Lo/faq$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_data_origin_watch:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_4

    .line 149
    :cond_3
    iget-object v0, p2, Lo/faq$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_data_origin_talkband:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_4

    .line 152
    :cond_4
    iget-object v0, p2, Lo/faq$a;->c:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_data_origin_unknow_device:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 153
    iget-object v0, p2, Lo/faq$a;->e:Landroid/widget/ImageView;

    sget v1, Lcom/huawei/ui/main/R$mipmap;->ic_data_origin_unknow_device:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 157
    :goto_4
    return-void

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/eut;>;)V"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 70
    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 71
    invoke-virtual {p0}, Lo/faq;->notifyDataSetChanged()V

    .line 72
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 49
    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 59
    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    .line 64
    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 80
    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/eut;

    .line 82
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 83
    iget-object v0, p0, Lo/faq;->b:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/main/R$layout;->item_data_origin_listview:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 84
    new-instance v3, Lo/faq$a;

    invoke-direct {v3}, Lo/faq$a;-><init>()V

    .line 85
    sget v0, Lcom/huawei/ui/main/R$id;->iv_data_type_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/faq$a;->e:Landroid/widget/ImageView;

    .line 86
    sget v0, Lcom/huawei/ui/main/R$id;->tv_data_origin_text:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, Lo/faq$a;->c:Landroid/widget/TextView;

    .line 87
    sget v0, Lcom/huawei/ui/main/R$id;->data_origin_list_divider:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, Lo/faq$a;->a:Landroid/widget/ImageView;

    .line 88
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 91
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/faq$a;

    .line 93
    :goto_0
    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lo/faq;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne v0, p1, :cond_1

    .line 95
    iget-object v0, v3, Lo/faq$a;->a:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 97
    :cond_1
    iget-object v0, v3, Lo/faq$a;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 99
    :goto_1
    invoke-direct {p0, v4, v3}, Lo/faq;->a(Lo/eut;Lo/faq$a;)V

    .line 101
    return-object p2
.end method
